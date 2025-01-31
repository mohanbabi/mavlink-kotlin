package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeFloatArray
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeFloatArray
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Describe a trajectory using an array of up-to 5 bezier control points in the local frame
 * (MAV_FRAME_LOCAL_NED).
 */
@GeneratedMavMessage(
  id = 333,
  crc = 231,
)
public data class TrajectoryRepresentationBezier(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Number of valid control points (up-to 5 points are possible)
   */
  @GeneratedMavField(type = "uint8_t")
  public val validPoints: Int = 0,
  /**
   * X-coordinate of bezier control points. Set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posX: List<Float> = emptyList(),
  /**
   * Y-coordinate of bezier control points. Set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posY: List<Float> = emptyList(),
  /**
   * Z-coordinate of bezier control points. Set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posZ: List<Float> = emptyList(),
  /**
   * Bezier time horizon. Set to NaN if velocity/acceleration should not be incorporated
   */
  @GeneratedMavField(type = "float[5]")
  public val delta: List<Float> = emptyList(),
  /**
   * Yaw. Set to NaN for unchanged
   */
  @GeneratedMavField(type = "float[5]")
  public val posYaw: List<Float> = emptyList(),
) : MavMessage<TrajectoryRepresentationBezier> {
  public override val instanceMetadata: MavMessage.Metadata<TrajectoryRepresentationBezier> =
      METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloatArray(posX, 20)
    outputBuffer.encodeFloatArray(posY, 20)
    outputBuffer.encodeFloatArray(posZ, 20)
    outputBuffer.encodeFloatArray(delta, 20)
    outputBuffer.encodeFloatArray(posYaw, 20)
    outputBuffer.encodeUint8(validPoints)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloatArray(posX, 20)
    outputBuffer.encodeFloatArray(posY, 20)
    outputBuffer.encodeFloatArray(posZ, 20)
    outputBuffer.encodeFloatArray(delta, 20)
    outputBuffer.encodeFloatArray(posYaw, 20)
    outputBuffer.encodeUint8(validPoints)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 333

    private const val CRC: Int = 231

    private const val SIZE_V1: Int = 109

    private const val SIZE_V2: Int = 109

    private val DESERIALIZER: MavDeserializer<TrajectoryRepresentationBezier> = MavDeserializer {
        bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val posX = inputBuffer.decodeFloatArray(20)
      val posY = inputBuffer.decodeFloatArray(20)
      val posZ = inputBuffer.decodeFloatArray(20)
      val delta = inputBuffer.decodeFloatArray(20)
      val posYaw = inputBuffer.decodeFloatArray(20)
      val validPoints = inputBuffer.decodeUint8()

      TrajectoryRepresentationBezier(
        timeUsec = timeUsec,
        validPoints = validPoints,
        posX = posX,
        posY = posY,
        posZ = posZ,
        delta = delta,
        posYaw = posYaw,
      )
    }


    private val METADATA: MavMessage.Metadata<TrajectoryRepresentationBezier> =
        MavMessage.Metadata(ID, CRC, DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<TrajectoryRepresentationBezier> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeUsec: BigInteger = BigInteger.ZERO

    public var validPoints: Int = 0

    public var posX: List<Float> = emptyList()

    public var posY: List<Float> = emptyList()

    public var posZ: List<Float> = emptyList()

    public var delta: List<Float> = emptyList()

    public var posYaw: List<Float> = emptyList()

    public fun build(): TrajectoryRepresentationBezier = TrajectoryRepresentationBezier(
      timeUsec = timeUsec,
      validPoints = validPoints,
      posX = posX,
      posY = posY,
      posZ = posZ,
      delta = delta,
      posYaw = posYaw,
    )
  }
}
