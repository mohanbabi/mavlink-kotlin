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
