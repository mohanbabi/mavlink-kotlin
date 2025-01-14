package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Vibration levels and accelerometer clipping
 */
@GeneratedMavMessage(
  id = 241,
  crc = 90,
)
public data class Vibration(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Vibration levels on X-axis
   */
  @GeneratedMavField(type = "float")
  public val vibrationX: Float = 0F,
  /**
   * Vibration levels on Y-axis
   */
  @GeneratedMavField(type = "float")
  public val vibrationY: Float = 0F,
  /**
   * Vibration levels on Z-axis
   */
  @GeneratedMavField(type = "float")
  public val vibrationZ: Float = 0F,
  /**
   * first accelerometer clipping count
   */
  @GeneratedMavField(type = "uint32_t")
  public val clipping0: Long = 0L,
  /**
   * second accelerometer clipping count
   */
  @GeneratedMavField(type = "uint32_t")
  public val clipping1: Long = 0L,
  /**
   * third accelerometer clipping count
   */
  @GeneratedMavField(type = "uint32_t")
  public val clipping2: Long = 0L,
) : MavMessage<Vibration> {
  public override val instanceMetadata: MavMessage.Metadata<Vibration> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloat(vibrationX)
    outputBuffer.encodeFloat(vibrationY)
    outputBuffer.encodeFloat(vibrationZ)
    outputBuffer.encodeUint32(clipping0)
    outputBuffer.encodeUint32(clipping1)
    outputBuffer.encodeUint32(clipping2)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloat(vibrationX)
    outputBuffer.encodeFloat(vibrationY)
    outputBuffer.encodeFloat(vibrationZ)
    outputBuffer.encodeUint32(clipping0)
    outputBuffer.encodeUint32(clipping1)
    outputBuffer.encodeUint32(clipping2)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 241

    private const val CRC: Int = 90

    private const val SIZE_V1: Int = 32

    private const val SIZE_V2: Int = 32

    private val DESERIALIZER: MavDeserializer<Vibration> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val vibrationX = inputBuffer.decodeFloat()
      val vibrationY = inputBuffer.decodeFloat()
      val vibrationZ = inputBuffer.decodeFloat()
      val clipping0 = inputBuffer.decodeUint32()
      val clipping1 = inputBuffer.decodeUint32()
      val clipping2 = inputBuffer.decodeUint32()

      Vibration(
        timeUsec = timeUsec,
        vibrationX = vibrationX,
        vibrationY = vibrationY,
        vibrationZ = vibrationZ,
        clipping0 = clipping0,
        clipping1 = clipping1,
        clipping2 = clipping2,
      )
    }


    private val METADATA: MavMessage.Metadata<Vibration> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<Vibration> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeUsec: BigInteger = BigInteger.ZERO

    public var vibrationX: Float = 0F

    public var vibrationY: Float = 0F

    public var vibrationZ: Float = 0F

    public var clipping0: Long = 0L

    public var clipping1: Long = 0L

    public var clipping2: Long = 0L

    public fun build(): Vibration = Vibration(
      timeUsec = timeUsec,
      vibrationX = vibrationX,
      vibrationY = vibrationY,
      vibrationZ = vibrationZ,
      clipping0 = clipping0,
      clipping1 = clipping1,
      clipping2 = clipping2,
    )
  }
}
