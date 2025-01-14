package xyz.urbanmatrix.mavlink.definitions.common

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
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Settings of a camera. Can be requested with a MAV_CMD_REQUEST_MESSAGE command.
 */
@GeneratedMavMessage(
  id = 260,
  crc = 146,
)
public data class CameraSettings(
  /**
   * Timestamp (time since system boot).
   */
  @GeneratedMavField(type = "uint32_t")
  public val timeBootMs: Long = 0L,
  /**
   * Camera mode
   */
  @GeneratedMavField(type = "uint8_t")
  public val modeId: MavEnumValue<CameraMode> = MavEnumValue.fromValue(0),
  /**
   * Current zoom level (0.0 to 100.0, NaN if not known)
   */
  @GeneratedMavField(
    type = "float",
    extension = true,
  )
  public val zoomlevel: Float = 0F,
  /**
   * Current focus level (0.0 to 100.0, NaN if not known)
   */
  @GeneratedMavField(
    type = "float",
    extension = true,
  )
  public val focuslevel: Float = 0F,
) : MavMessage<CameraSettings> {
  public override val instanceMetadata: MavMessage.Metadata<CameraSettings> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(timeBootMs)
    outputBuffer.encodeEnumValue(modeId.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(timeBootMs)
    outputBuffer.encodeEnumValue(modeId.value, 1)
    outputBuffer.encodeFloat(zoomlevel)
    outputBuffer.encodeFloat(focuslevel)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 260

    private const val CRC: Int = 146

    private const val SIZE_V1: Int = 5

    private const val SIZE_V2: Int = 13

    private val DESERIALIZER: MavDeserializer<CameraSettings> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeBootMs = inputBuffer.decodeUint32()
      val modeId = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = CameraMode.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val zoomlevel = inputBuffer.decodeFloat()
      val focuslevel = inputBuffer.decodeFloat()

      CameraSettings(
        timeBootMs = timeBootMs,
        modeId = modeId,
        zoomlevel = zoomlevel,
        focuslevel = focuslevel,
      )
    }


    private val METADATA: MavMessage.Metadata<CameraSettings> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<CameraSettings> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeBootMs: Long = 0L

    public var modeId: MavEnumValue<CameraMode> = MavEnumValue.fromValue(0)

    public var zoomlevel: Float = 0F

    public var focuslevel: Float = 0F

    public fun build(): CameraSettings = CameraSettings(
      timeBootMs = timeBootMs,
      modeId = modeId,
      zoomlevel = zoomlevel,
      focuslevel = focuslevel,
    )
  }
}
