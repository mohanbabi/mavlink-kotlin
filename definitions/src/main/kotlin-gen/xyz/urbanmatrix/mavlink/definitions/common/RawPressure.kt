package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeInt16
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeInt16
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * The RAW pressure readings for the typical setup of one absolute pressure and one differential
 * pressure sensor. The sensor values should be the raw, UNSCALED ADC values.
 */
@GeneratedMavMessage(
  id = 28,
  crc = 67,
)
public data class RawPressure(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Absolute pressure (raw)
   */
  @GeneratedMavField(type = "int16_t")
  public val pressAbs: Int = 0,
  /**
   * Differential pressure 1 (raw, 0 if nonexistent)
   */
  @GeneratedMavField(type = "int16_t")
  public val pressDiff1: Int = 0,
  /**
   * Differential pressure 2 (raw, 0 if nonexistent)
   */
  @GeneratedMavField(type = "int16_t")
  public val pressDiff2: Int = 0,
  /**
   * Raw Temperature measurement (raw)
   */
  @GeneratedMavField(type = "int16_t")
  public val temperature: Int = 0,
) : MavMessage<RawPressure> {
  public override val instanceMetadata: MavMessage.Metadata<RawPressure> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeInt16(pressAbs)
    outputBuffer.encodeInt16(pressDiff1)
    outputBuffer.encodeInt16(pressDiff2)
    outputBuffer.encodeInt16(temperature)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeInt16(pressAbs)
    outputBuffer.encodeInt16(pressDiff1)
    outputBuffer.encodeInt16(pressDiff2)
    outputBuffer.encodeInt16(temperature)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 28

    private const val CRC: Int = 67

    private const val SIZE_V1: Int = 16

    private const val SIZE_V2: Int = 16

    private val DESERIALIZER: MavDeserializer<RawPressure> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val pressAbs = inputBuffer.decodeInt16()
      val pressDiff1 = inputBuffer.decodeInt16()
      val pressDiff2 = inputBuffer.decodeInt16()
      val temperature = inputBuffer.decodeInt16()

      RawPressure(
        timeUsec = timeUsec,
        pressAbs = pressAbs,
        pressDiff1 = pressDiff1,
        pressDiff2 = pressDiff2,
        temperature = temperature,
      )
    }


    private val METADATA: MavMessage.Metadata<RawPressure> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<RawPressure> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeUsec: BigInteger = BigInteger.ZERO

    public var pressAbs: Int = 0

    public var pressDiff1: Int = 0

    public var pressDiff2: Int = 0

    public var temperature: Int = 0

    public fun build(): RawPressure = RawPressure(
      timeUsec = timeUsec,
      pressAbs = pressAbs,
      pressDiff1 = pressDiff1,
      pressDiff2 = pressDiff2,
      temperature = temperature,
    )
  }
}
