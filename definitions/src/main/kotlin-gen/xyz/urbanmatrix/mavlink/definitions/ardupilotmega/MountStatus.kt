package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.definitions.common.MavMountMode
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeInt32
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeInt32
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Message with some status from autopilot to GCS about camera or antenna mount.
 */
@GeneratedMavMessage(
  id = 158,
  crc = 134,
)
public data class MountStatus(
  /**
   * System ID.
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetSystem: Int = 0,
  /**
   * Component ID.
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetComponent: Int = 0,
  /**
   * Pitch.
   */
  @GeneratedMavField(type = "int32_t")
  public val pointingA: Int = 0,
  /**
   * Roll.
   */
  @GeneratedMavField(type = "int32_t")
  public val pointingB: Int = 0,
  /**
   * Yaw.
   */
  @GeneratedMavField(type = "int32_t")
  public val pointingC: Int = 0,
  /**
   * Mount operating mode.
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val mountMode: MavEnumValue<MavMountMode> = MavEnumValue.fromValue(0),
) : MavMessage<MountStatus> {
  public override val instanceMetadata: MavMessage.Metadata<MountStatus> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeInt32(pointingA)
    outputBuffer.encodeInt32(pointingB)
    outputBuffer.encodeInt32(pointingC)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeInt32(pointingA)
    outputBuffer.encodeInt32(pointingB)
    outputBuffer.encodeInt32(pointingC)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeEnumValue(mountMode.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 158

    private const val CRC: Int = 134

    private const val SIZE_V1: Int = 14

    private const val SIZE_V2: Int = 15

    private val DESERIALIZER: MavDeserializer<MountStatus> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val pointingA = inputBuffer.decodeInt32()
      val pointingB = inputBuffer.decodeInt32()
      val pointingC = inputBuffer.decodeInt32()
      val targetSystem = inputBuffer.decodeUint8()
      val targetComponent = inputBuffer.decodeUint8()
      val mountMode = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavMountMode.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      MountStatus(
        targetSystem = targetSystem,
        targetComponent = targetComponent,
        pointingA = pointingA,
        pointingB = pointingB,
        pointingC = pointingC,
        mountMode = mountMode,
      )
    }


    private val METADATA: MavMessage.Metadata<MountStatus> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<MountStatus> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var targetSystem: Int = 0

    public var targetComponent: Int = 0

    public var pointingA: Int = 0

    public var pointingB: Int = 0

    public var pointingC: Int = 0

    public var mountMode: MavEnumValue<MavMountMode> = MavEnumValue.fromValue(0)

    public fun build(): MountStatus = MountStatus(
      targetSystem = targetSystem,
      targetComponent = targetComponent,
      pointingA = pointingA,
      pointingB = pointingB,
      pointingC = pointingC,
      mountMode = mountMode,
    )
  }
}
