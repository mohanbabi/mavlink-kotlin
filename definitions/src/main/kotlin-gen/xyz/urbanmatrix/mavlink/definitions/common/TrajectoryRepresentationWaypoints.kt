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
import xyz.urbanmatrix.mavlink.serialization.decodeUint16Array
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeFloatArray
import xyz.urbanmatrix.mavlink.serialization.encodeUint16Array
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Describe a trajectory using an array of up-to 5 waypoints in the local frame
 * (MAV_FRAME_LOCAL_NED).
 */
@GeneratedMavMessage(
  id = 332,
  crc = 236,
)
public data class TrajectoryRepresentationWaypoints(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Number of valid points (up-to 5 waypoints are possible)
   */
  @GeneratedMavField(type = "uint8_t")
  public val validPoints: Int = 0,
  /**
   * X-coordinate of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posX: List<Float> = emptyList(),
  /**
   * Y-coordinate of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posY: List<Float> = emptyList(),
  /**
   * Z-coordinate of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posZ: List<Float> = emptyList(),
  /**
   * X-velocity of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val velX: List<Float> = emptyList(),
  /**
   * Y-velocity of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val velY: List<Float> = emptyList(),
  /**
   * Z-velocity of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val velZ: List<Float> = emptyList(),
  /**
   * X-acceleration of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val accX: List<Float> = emptyList(),
  /**
   * Y-acceleration of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val accY: List<Float> = emptyList(),
  /**
   * Z-acceleration of waypoint, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val accZ: List<Float> = emptyList(),
  /**
   * Yaw angle, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val posYaw: List<Float> = emptyList(),
  /**
   * Yaw rate, set to NaN if not being used
   */
  @GeneratedMavField(type = "float[5]")
  public val velYaw: List<Float> = emptyList(),
  /**
   * MAV_CMD command id of waypoint, set to UINT16_MAX if not being used.
   */
  @GeneratedMavField(type = "uint16_t[5]")
  public val command: List<Int> = emptyList(),
) : MavMessage<TrajectoryRepresentationWaypoints> {
  public override val instanceMetadata: MavMessage.Metadata<TrajectoryRepresentationWaypoints> =
      METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloatArray(posX, 20)
    outputBuffer.encodeFloatArray(posY, 20)
    outputBuffer.encodeFloatArray(posZ, 20)
    outputBuffer.encodeFloatArray(velX, 20)
    outputBuffer.encodeFloatArray(velY, 20)
    outputBuffer.encodeFloatArray(velZ, 20)
    outputBuffer.encodeFloatArray(accX, 20)
    outputBuffer.encodeFloatArray(accY, 20)
    outputBuffer.encodeFloatArray(accZ, 20)
    outputBuffer.encodeFloatArray(posYaw, 20)
    outputBuffer.encodeFloatArray(velYaw, 20)
    outputBuffer.encodeUint16Array(command, 10)
    outputBuffer.encodeUint8(validPoints)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloatArray(posX, 20)
    outputBuffer.encodeFloatArray(posY, 20)
    outputBuffer.encodeFloatArray(posZ, 20)
    outputBuffer.encodeFloatArray(velX, 20)
    outputBuffer.encodeFloatArray(velY, 20)
    outputBuffer.encodeFloatArray(velZ, 20)
    outputBuffer.encodeFloatArray(accX, 20)
    outputBuffer.encodeFloatArray(accY, 20)
    outputBuffer.encodeFloatArray(accZ, 20)
    outputBuffer.encodeFloatArray(posYaw, 20)
    outputBuffer.encodeFloatArray(velYaw, 20)
    outputBuffer.encodeUint16Array(command, 10)
    outputBuffer.encodeUint8(validPoints)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 332

    private const val CRC: Int = 236

    private const val SIZE_V1: Int = 239

    private const val SIZE_V2: Int = 239

    private val DESERIALIZER: MavDeserializer<TrajectoryRepresentationWaypoints> = MavDeserializer {
        bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val posX = inputBuffer.decodeFloatArray(20)
      val posY = inputBuffer.decodeFloatArray(20)
      val posZ = inputBuffer.decodeFloatArray(20)
      val velX = inputBuffer.decodeFloatArray(20)
      val velY = inputBuffer.decodeFloatArray(20)
      val velZ = inputBuffer.decodeFloatArray(20)
      val accX = inputBuffer.decodeFloatArray(20)
      val accY = inputBuffer.decodeFloatArray(20)
      val accZ = inputBuffer.decodeFloatArray(20)
      val posYaw = inputBuffer.decodeFloatArray(20)
      val velYaw = inputBuffer.decodeFloatArray(20)
      val command = inputBuffer.decodeUint16Array(10)
      val validPoints = inputBuffer.decodeUint8()

      TrajectoryRepresentationWaypoints(
        timeUsec = timeUsec,
        validPoints = validPoints,
        posX = posX,
        posY = posY,
        posZ = posZ,
        velX = velX,
        velY = velY,
        velZ = velZ,
        accX = accX,
        accY = accY,
        accZ = accZ,
        posYaw = posYaw,
        velYaw = velYaw,
        command = command,
      )
    }


    private val METADATA: MavMessage.Metadata<TrajectoryRepresentationWaypoints> =
        MavMessage.Metadata(ID, CRC, DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<TrajectoryRepresentationWaypoints> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeUsec: BigInteger = BigInteger.ZERO

    public var validPoints: Int = 0

    public var posX: List<Float> = emptyList()

    public var posY: List<Float> = emptyList()

    public var posZ: List<Float> = emptyList()

    public var velX: List<Float> = emptyList()

    public var velY: List<Float> = emptyList()

    public var velZ: List<Float> = emptyList()

    public var accX: List<Float> = emptyList()

    public var accY: List<Float> = emptyList()

    public var accZ: List<Float> = emptyList()

    public var posYaw: List<Float> = emptyList()

    public var velYaw: List<Float> = emptyList()

    public var command: List<Int> = emptyList()

    public fun build(): TrajectoryRepresentationWaypoints = TrajectoryRepresentationWaypoints(
      timeUsec = timeUsec,
      validPoints = validPoints,
      posX = posX,
      posY = posY,
      posZ = posZ,
      velX = velX,
      velY = velY,
      velZ = velZ,
      accX = accX,
      accY = accY,
      accZ = accZ,
      posYaw = posYaw,
      velYaw = velYaw,
      command = command,
    )
  }
}
