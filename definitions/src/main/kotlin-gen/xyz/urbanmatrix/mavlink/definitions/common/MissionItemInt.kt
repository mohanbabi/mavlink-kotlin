package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeInt32
import xyz.urbanmatrix.mavlink.serialization.decodeUint16
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeInt32
import xyz.urbanmatrix.mavlink.serialization.encodeUint16
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Message encoding a mission item. This message is emitted to announce
 *                 the presence of a mission item and to set a mission item on the system. The
 * mission item can be either in x, y, z meters (type: LOCAL) or x:lat, y:lon, z:altitude. Local frame
 * is Z-down, right handed (NED), global frame is Z-up, right handed (ENU). NaN or INT32_MAX may be
 * used in float/integer params (respectively) to indicate optional/default values (e.g. to use the
 * component's current latitude, yaw rather than a specific value). See also
 * https://mavlink.io/en/services/mission.html.
 */
@GeneratedMavMessage(
  id = 73,
  crc = 38,
)
public data class MissionItemInt(
  /**
   * System ID
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetSystem: Int = 0,
  /**
   * Component ID
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetComponent: Int = 0,
  /**
   * Waypoint ID (sequence number). Starts at zero. Increases monotonically for each waypoint, no
   * gaps in the sequence (0,1,2,3,4).
   */
  @GeneratedMavField(type = "uint16_t")
  public val seq: Int = 0,
  /**
   * The coordinate system of the waypoint.
   */
  @GeneratedMavField(type = "uint8_t")
  public val frame: MavEnumValue<MavFrame> = MavEnumValue.fromValue(0),
  /**
   * The scheduled action for the waypoint.
   */
  @GeneratedMavField(type = "uint16_t")
  public val command: MavEnumValue<MavCmd> = MavEnumValue.fromValue(0),
  /**
   * false:0, true:1
   */
  @GeneratedMavField(type = "uint8_t")
  public val current: Int = 0,
  /**
   * Autocontinue to next waypoint
   */
  @GeneratedMavField(type = "uint8_t")
  public val autocontinue: Int = 0,
  /**
   * PARAM1, see MAV_CMD enum
   */
  @GeneratedMavField(type = "float")
  public val param1: Float = 0F,
  /**
   * PARAM2, see MAV_CMD enum
   */
  @GeneratedMavField(type = "float")
  public val param2: Float = 0F,
  /**
   * PARAM3, see MAV_CMD enum
   */
  @GeneratedMavField(type = "float")
  public val param3: Float = 0F,
  /**
   * PARAM4, see MAV_CMD enum
   */
  @GeneratedMavField(type = "float")
  public val param4: Float = 0F,
  /**
   * PARAM5 / local: x position in meters * 1e4, global: latitude in degrees * 10^7
   */
  @GeneratedMavField(type = "int32_t")
  public val x: Int = 0,
  /**
   * PARAM6 / y position: local: x position in meters * 1e4, global: longitude in degrees *10^7
   */
  @GeneratedMavField(type = "int32_t")
  public val y: Int = 0,
  /**
   * PARAM7 / z position: global: altitude in meters (relative or absolute, depending on frame.
   */
  @GeneratedMavField(type = "float")
  public val z: Float = 0F,
  /**
   * Mission type.
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val missionType: MavEnumValue<MavMissionType> = MavEnumValue.fromValue(0),
) : MavMessage<MissionItemInt> {
  public override val instanceMetadata: MavMessage.Metadata<MissionItemInt> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(param1)
    outputBuffer.encodeFloat(param2)
    outputBuffer.encodeFloat(param3)
    outputBuffer.encodeFloat(param4)
    outputBuffer.encodeInt32(x)
    outputBuffer.encodeInt32(y)
    outputBuffer.encodeFloat(z)
    outputBuffer.encodeUint16(seq)
    outputBuffer.encodeEnumValue(command.value, 2)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeEnumValue(frame.value, 1)
    outputBuffer.encodeUint8(current)
    outputBuffer.encodeUint8(autocontinue)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(param1)
    outputBuffer.encodeFloat(param2)
    outputBuffer.encodeFloat(param3)
    outputBuffer.encodeFloat(param4)
    outputBuffer.encodeInt32(x)
    outputBuffer.encodeInt32(y)
    outputBuffer.encodeFloat(z)
    outputBuffer.encodeUint16(seq)
    outputBuffer.encodeEnumValue(command.value, 2)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeEnumValue(frame.value, 1)
    outputBuffer.encodeUint8(current)
    outputBuffer.encodeUint8(autocontinue)
    outputBuffer.encodeEnumValue(missionType.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 73

    private const val CRC: Int = 38

    private const val SIZE_V1: Int = 37

    private const val SIZE_V2: Int = 38

    private val DESERIALIZER: MavDeserializer<MissionItemInt> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val param1 = inputBuffer.decodeFloat()
      val param2 = inputBuffer.decodeFloat()
      val param3 = inputBuffer.decodeFloat()
      val param4 = inputBuffer.decodeFloat()
      val x = inputBuffer.decodeInt32()
      val y = inputBuffer.decodeInt32()
      val z = inputBuffer.decodeFloat()
      val seq = inputBuffer.decodeUint16()
      val command = inputBuffer.decodeEnumValue(2).let { value ->
        val entry = MavCmd.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val targetSystem = inputBuffer.decodeUint8()
      val targetComponent = inputBuffer.decodeUint8()
      val frame = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavFrame.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val current = inputBuffer.decodeUint8()
      val autocontinue = inputBuffer.decodeUint8()
      val missionType = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavMissionType.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      MissionItemInt(
        targetSystem = targetSystem,
        targetComponent = targetComponent,
        seq = seq,
        frame = frame,
        command = command,
        current = current,
        autocontinue = autocontinue,
        param1 = param1,
        param2 = param2,
        param3 = param3,
        param4 = param4,
        x = x,
        y = y,
        z = z,
        missionType = missionType,
      )
    }


    private val METADATA: MavMessage.Metadata<MissionItemInt> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<MissionItemInt> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var targetSystem: Int = 0

    public var targetComponent: Int = 0

    public var seq: Int = 0

    public var frame: MavEnumValue<MavFrame> = MavEnumValue.fromValue(0)

    public var command: MavEnumValue<MavCmd> = MavEnumValue.fromValue(0)

    public var current: Int = 0

    public var autocontinue: Int = 0

    public var param1: Float = 0F

    public var param2: Float = 0F

    public var param3: Float = 0F

    public var param4: Float = 0F

    public var x: Int = 0

    public var y: Int = 0

    public var z: Float = 0F

    public var missionType: MavEnumValue<MavMissionType> = MavEnumValue.fromValue(0)

    public fun build(): MissionItemInt = MissionItemInt(
      targetSystem = targetSystem,
      targetComponent = targetComponent,
      seq = seq,
      frame = frame,
      command = command,
      current = current,
      autocontinue = autocontinue,
      param1 = param1,
      param2 = param2,
      param3 = param3,
      param4 = param4,
      x = x,
      y = y,
      z = z,
      missionType = missionType,
    )
  }
}
