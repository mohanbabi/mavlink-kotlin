package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.collections.List
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.api.WorkInProgress
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeInt16Array
import xyz.urbanmatrix.mavlink.serialization.decodeUint16
import xyz.urbanmatrix.mavlink.serialization.decodeUint16Array
import xyz.urbanmatrix.mavlink.serialization.decodeUint32Array
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeInt16Array
import xyz.urbanmatrix.mavlink.serialization.encodeUint16
import xyz.urbanmatrix.mavlink.serialization.encodeUint16Array
import xyz.urbanmatrix.mavlink.serialization.encodeUint32Array
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * ESC information for lower rate streaming. Recommended streaming rate 1Hz. See ESC_STATUS for
 * higher-rate ESC data.
 */
@WorkInProgress
@GeneratedMavMessage(
  id = 290,
  crc = 251,
)
public data class EscInfo(
  /**
   * Index of the first ESC in this message. minValue = 0, maxValue = 60, increment = 4.
   */
  @GeneratedMavField(type = "uint8_t")
  public val index: Int = 0,
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Counter of data packets received.
   */
  @GeneratedMavField(type = "uint16_t")
  public val counter: Int = 0,
  /**
   * Total number of ESCs in all messages of this type. Message fields with an index higher than
   * this should be ignored because they contain invalid data.
   */
  @GeneratedMavField(type = "uint8_t")
  public val count: Int = 0,
  /**
   * Connection type protocol for all ESC.
   */
  @GeneratedMavField(type = "uint8_t")
  public val connectionType: MavEnumValue<EscConnectionType> = MavEnumValue.fromValue(0),
  /**
   * Information regarding online/offline status of each ESC.
   */
  @GeneratedMavField(type = "uint8_t")
  public val info: Int = 0,
  /**
   * Bitmap of ESC failure flags.
   */
  @GeneratedMavField(type = "uint16_t[4]")
  public val failureFlags: List<Int> = emptyList(),
  /**
   * Number of reported errors by each ESC since boot.
   */
  @GeneratedMavField(type = "uint32_t[4]")
  public val errorCount: List<Long> = emptyList(),
  /**
   * Temperature of each ESC. INT16_MAX: if data not supplied by ESC.
   */
  @GeneratedMavField(type = "int16_t[4]")
  public val temperature: List<Int> = emptyList(),
) : MavMessage<EscInfo> {
  public override val instanceMetadata: MavMessage.Metadata<EscInfo> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeUint32Array(errorCount, 16)
    outputBuffer.encodeUint16(counter)
    outputBuffer.encodeUint16Array(failureFlags, 8)
    outputBuffer.encodeInt16Array(temperature, 8)
    outputBuffer.encodeUint8(index)
    outputBuffer.encodeUint8(count)
    outputBuffer.encodeEnumValue(connectionType.value, 1)
    outputBuffer.encodeUint8(info)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeUint32Array(errorCount, 16)
    outputBuffer.encodeUint16(counter)
    outputBuffer.encodeUint16Array(failureFlags, 8)
    outputBuffer.encodeInt16Array(temperature, 8)
    outputBuffer.encodeUint8(index)
    outputBuffer.encodeUint8(count)
    outputBuffer.encodeEnumValue(connectionType.value, 1)
    outputBuffer.encodeUint8(info)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 290

    private const val CRC: Int = 251

    private const val SIZE_V1: Int = 46

    private const val SIZE_V2: Int = 46

    private val DESERIALIZER: MavDeserializer<EscInfo> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val errorCount = inputBuffer.decodeUint32Array(16)
      val counter = inputBuffer.decodeUint16()
      val failureFlags = inputBuffer.decodeUint16Array(8)
      val temperature = inputBuffer.decodeInt16Array(8)
      val index = inputBuffer.decodeUint8()
      val count = inputBuffer.decodeUint8()
      val connectionType = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = EscConnectionType.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val info = inputBuffer.decodeUint8()

      EscInfo(
        index = index,
        timeUsec = timeUsec,
        counter = counter,
        count = count,
        connectionType = connectionType,
        info = info,
        failureFlags = failureFlags,
        errorCount = errorCount,
        temperature = temperature,
      )
    }


    private val METADATA: MavMessage.Metadata<EscInfo> = MavMessage.Metadata(ID, CRC, DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<EscInfo> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var index: Int = 0

    public var timeUsec: BigInteger = BigInteger.ZERO

    public var counter: Int = 0

    public var count: Int = 0

    public var connectionType: MavEnumValue<EscConnectionType> = MavEnumValue.fromValue(0)

    public var info: Int = 0

    public var failureFlags: List<Int> = emptyList()

    public var errorCount: List<Long> = emptyList()

    public var temperature: List<Int> = emptyList()

    public fun build(): EscInfo = EscInfo(
      index = index,
      timeUsec = timeUsec,
      counter = counter,
      count = count,
      connectionType = connectionType,
      info = info,
      failureFlags = failureFlags,
      errorCount = errorCount,
      temperature = temperature,
    )
  }
}
