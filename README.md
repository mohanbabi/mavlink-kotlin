# mavlink-kotlin

A modern MAVLink library for the JVM written in Kotlin.

## Overview

mavlink-kotlin was created out of the need for a type-safe, high-performance and flexible MAVLink library for the JVM.
For an end-to-end drone tech company like UrbanMatrix Technologies, MAVLink forms the heart of communication between the
drone, the GCS and the companion computer. Apart from our proprietary Android-based GCS, UMT LaunchPad, we have
developed several JVM applications that run on Matrix-OS, our proprietary Linux-based OS for our Companion Computer and 
our Management Server.

We had realized several problems with existing JVM MAVLink implementations. These include:
- Performance problems at very high message rates
- Hassle to generate and maintain MAVLink message objects from custom XML definitions
- Difficulties in understanding and fixing reflection-based code
- Difficulties in extending existing code-base due to lack of modularity

Through mavlink-kotlin we want to address the problems that we had faced while adopting and understanding MAVLink
libraries not only for the JVM but also C/C++, Golang, Rust and Python. This library takes inspiration from several
great features of these libraries. We want to make the adoption of this library as easy as possible by being flexible in
terms of creating a modular and easy-to-extend API that allows the users to use the same base MAVLink and connection
classes to create adapters of their own to fit whatever pub-sub library they want to use. Apart from this, the MAVLink
generator plugin is designed to fit well with stand-alone Android and JVM projects while keeping the setup quick and
hassle-free.

## Key Design Considerations

### Code generation instead of reflection
Reflection-based code is prone to errors, difficult to understand and difficult for compilers to optimize.

On the other hand, generated code is much easier for the users to go through and understand. And apart from the obvious
possibilities of compile-time and run-time optimizations, it is free from the fragility that reflection brings in.
mavlink-kotlin heavily uses code generation to avoid reflection and provide compile-time safety.

In fact, we've even tested it against other available MAVLink JVM implementations, and this library is **20,000x to
45,000x** faster in terms of serialization and deserialization speeds and provides a much better memory footprint. Don't
believe us? try out the comparison tests in the `mavlink-kotlin` module.

### Interface-based API and modular design
Don't think the in-built implementation is good enough? No issues. Write your own code generators for the messages,
enums, dialects etc. and the rest of the modules will work without requiring a reimplementation.

### Message generator Gradle plugin
You can provide your own dialect files and the Gradle plugin will take care of generating the messages. Use it to
generate and maintain your own private MAVLink message implementations for your drone systems by simply providing the
MAVLink XMLs.

### Support for Kotlin Multiplatform (future)
Target Android, Native, iOS and Desktop applications using the same codebase.

## Project Structure

### api
Interfaces, annotations and wrapper/helper classes for the MAVLink protocol. These are used by the `generator` module
for creating the enums, messages and dialects. MAVLink classes generated by any other generator would still work with
the other modules given that `api` is implemented correctly. 

### serialization
Tools for serializing and deserializing MAVLink message/frame Kotlin objects to and from a byte stream. More
specifically, it contains extension functions on `ByteArray` and `ByteBuffer` to encode and decode different sizes of
int, uint, float, strings/characters, arrays, etc.

### generator
MAVLink generator Gradle Plugin that uses the `api` and the `serialization` modules to generate the MAVLink classes. 
This plugin is available at Gradle Plugin Portal with ID `xyz.urbanmatrix.mavlink.generator`. It can be used by anyone
to generate MAVLink classes from their own XML files. No need to fork this project.

The instructions on how to use the plugin are available in the `generator` module.

### definitions
Implementation of the standard MAVLink messages from the official
[MAVLink repository](https://github.com/mavlink/mavlink) generated using the Gradle plugin.

### mavlink-kotlin
Implementation of the `api` module for the handling of data streams and connections for different protocols. TCP is
ready for use, while UDP and serial are in development. It contains the interface `MavConnection` which acts as the base
for various connection types. It is later used by the different `adapters` to provide a simple end-user API.

### adapters
The `mavlink-kotlin` module itself only handles the connections and provides reader and writer methods to and from byte
streams. The `adapters` module wraps the `mavlink-kotlin` connection classes to provide an abstraction layer that makes
the handling of the connections easy.

Users can use the `MavConnection` interface to create an adapter of their own. Some adapters already available are:
- RxJava2
- RxJava3
- Kotlin Coroutines (in development) 

Detailed instructions on how to use these are available in the respective adapter directories.

## Usage

### Dependencies
Declare Maven Central repository for the dependencies, and add the `mavlink-kotlin` and the `definitions` artifact to
the dependencies block in the `build.gradle.kts`.

```kotlin
implementation("xyz.urbanmatrix.mavlink:mavlink-kotlin:$version")
```

You can either use the standard `definitions` artifact available for standard messages, or you can use the `generator`
to generate your own. The details on how to do that is available in the `generator` module. We will be using the
standard definitions for this tutorial.

```kotlin
implementation("xyz.urbanmatrix.mavlink:definitions:$version")
```

Pick an adapter of your preference to handle to wrap the `MavConnection` for handling streams. In this case, we will be
using `RxJava2`.

```kotlin
implementation("xyz.urbanmatrix.mavlink:rxjava2:$version")
```

The `build.gradle.kts` should look like this:

```kotlin
repositories {
    mavenCentral()
}

dependencies { 
    implementation("xyz.urbanmatrix.mavlink:mavlink-kotlin:$version")
    implementation("xyz.urbanmatrix.mavlink:definitions:$version")
    implementation("xyz.urbanmatrix.mavlink:rxjava2:$version")
}
```

### Connecting
Create a `MavConnection` object. Currently, `TcpClientMavConnection` and `TcpServerMavConnection` are available. Wrap 
the connection object with the `rxjava2` adapter using the `asRx2` extension function.

```kotlin
val connection = TcpClientMavConnection("127.0.0.1", 5760, CommonDialect).asRx2()
```

Use the connect method to establish the connection.

```kotlin
// Blocking
connection.connect().blockingAwait()
println("Connected")

// Non-blocking
connection.connect()
    .subscribeOn(Schedulers.io())
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(
        { println("connected") },
        Throwable::printStackTrace
    )
```

The `asRx2()` extension function also takes a callback to let users handle the case when there's an error while reading
form the stream. Users can use this to reconnect after some delay. The callback is called in the `mavlink-read-thread`.

```kotlin
val connection = TcpClientMavConnection("127.0.0.1", 5760, CommonDialect).asRx2 {
    // Reconnect after some delay
}
```

### Reading
The connection starts reading the MAVLink frames on a background thread. They are available via the  `mavFrame`
`Flowable`.

```kotlin
// Blocking
connection.mavFrame
    .map { it.message }
    .ofType(Heartbeat::class.java)
    .blockingSubscribe { println("autopilot: ${it.autopilot}, type: ${it.type}") }

// Non-blocking
connection.mavFrame
    .map { it.message }
    .ofType(Heartbeat::class.java)
    .observeOn(AndroidSchedulers.mainThread()) // No need for subscribeOn as frames are read on the mavlink-read-thread
    .subscribe(
        { println("autopilot: ${it.autopilot}, type: ${it.type}") },
        Throwable::printStackTrace
    )
```

### Creating MavMessage objects
To send a message, create the `MavMessage` object that you want to send.

```kotlin
// Using the constructor
val heartbeat = Heartbeat(
    type = MavType.MAV_TYPE_FIXED_WING.wrap(),                     // The wrap() extension function wraps a MavEnum in a MavEnumValue
    autopilot = MavEnumValue.from(MavAutopilot.MAV_AUTOPILOT_PX4), // Or use the MavEnumValue.from() function
    baseMode = MavEnumValue.fromMask(                              // Use the MavEnumValue.fromMask() to create a bitmask
        listOf(
            MavModeFlag.MAV_MODE_FLAG_AUTO_ENABLED,
            MavModeFlag.MAV_MODE_FLAG_SAFETY_ARMED
        )
    ),
    systemStatus = MavEnumValue.fromValue(4),                      // Use the MavEnumValue.fromValue() to specify your own value that is not in the enum
    mavlinkVersion = 2
) // Default values will be set for the unspecified parameters

// Using the builder function
val heartbeat = Heartbeat.builder {
    type = MavType.MAV_TYPE_FIXED_WING.wrap()
    autopilot = MavAutopilot.MAV_AUTOPILOT_PX4.wrap()
    baseMode = MavEnumValue.fromValue(200)
    mavlinkVersion = 2
}

// Using the Builder class
val builder = Heartbeat.Builder()
builder.type = MavType.MAV_TYPE_FIXED_WING.wrap()
builder.autopilot = MavAutopilot.MAV_AUTOPILOT_PX4.wrap()
builder.mavlinkVersion = 2
val heartbeat = builder.build()
```

### Writing
The library provides three methods to write messages to the byte streams.

```kotlin
// MAVLink v1 packet
val completable = connection.sendV1(
    systemId = 250,
    componentId = 1,
    payload = heartbeat
)

// Unsigned MAVLink v2 packet
val completable = connection.sendUnsignedV2(
    systemId = 250,
    componentId = 1,
    payload = heartbeat
)

// Signed MAVLink v2 packet
val completable = connection.sendSignedV2(
    systemId = 250,
    componentId = 1,
    payload = heartbeat,
    linkId = linkId,       // Integer link ID
    timestamp = timestamp, // Long microseconds
    secretKey = secretKeu  // ByteArray passcode
)
```

Just as other RxJava2 `Completable` objects, call the `subscribe` or `blockingAwait` method to execute the command.

```kotlin
// Blocking
completable.blockingAwait()
println("Heartbeat sent")

// Non-blocking
completable
    .subscribeOn(Schedulers.io())
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(
        { println("Heartbeat sent") },
        Throwable::printStackTrace
    )
```

### Closing
Use the `close` method to close the connection.

```kotlin
// Blocking
connection.close().blockingAwait()
println("Closed")

// Non-blocking
connection.close()
    .subscribeOn(Schedulers.io())
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(
        { println("Closed") },
        Throwable::printStackTrace
    )
```
