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
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeInt32
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeInt32
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Information about the status of a capture. Can be requested with a MAV_CMD_REQUEST_MESSAGE
 * command.
 */
@GeneratedMavMessage(
  id = 262,
  crc = 12,
)
public data class CameraCaptureStatus(
  /**
   * Timestamp (time since system boot).
   */
  @GeneratedMavField(type = "uint32_t")
  public val timeBootMs: Long = 0L,
  /**
   * Current status of image capturing (0: idle, 1: capture in progress, 2: interval set but idle,
   * 3: interval set and capture in progress)
   */
  @GeneratedMavField(type = "uint8_t")
  public val imageStatus: Int = 0,
  /**
   * Current status of video capturing (0: idle, 1: capture in progress)
   */
  @GeneratedMavField(type = "uint8_t")
  public val videoStatus: Int = 0,
  /**
   * Image capture interval
   */
  @GeneratedMavField(type = "float")
  public val imageInterval: Float = 0F,
  /**
   * Elapsed time since recording started (0: Not supported/available). A GCS should compute
   * recording time and use non-zero values of this field to correct any discrepancy.
   */
  @GeneratedMavField(type = "uint32_t")
  public val recordingTimeMs: Long = 0L,
  /**
   * Available storage capacity.
   */
  @GeneratedMavField(type = "float")
  public val availableCapacity: Float = 0F,
  /**
   * Total number of images captured ('forever', or until reset using MAV_CMD_STORAGE_FORMAT).
   */
  @GeneratedMavField(
    type = "int32_t",
    extension = true,
  )
  public val imageCount: Int = 0,
) : MavMessage<CameraCaptureStatus> {
  public override val instanceMetadata: MavMessage.Metadata<CameraCaptureStatus> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(timeBootMs)
    outputBuffer.encodeFloat(imageInterval)
    outputBuffer.encodeUint32(recordingTimeMs)
    outputBuffer.encodeFloat(availableCapacity)
    outputBuffer.encodeUint8(imageStatus)
    outputBuffer.encodeUint8(videoStatus)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(timeBootMs)
    outputBuffer.encodeFloat(imageInterval)
    outputBuffer.encodeUint32(recordingTimeMs)
    outputBuffer.encodeFloat(availableCapacity)
    outputBuffer.encodeUint8(imageStatus)
    outputBuffer.encodeUint8(videoStatus)
    outputBuffer.encodeInt32(imageCount)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 262

    private const val CRC: Int = 12

    private const val SIZE_V1: Int = 18

    private const val SIZE_V2: Int = 22

    private val DESERIALIZER: MavDeserializer<CameraCaptureStatus> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeBootMs = inputBuffer.decodeUint32()
      val imageInterval = inputBuffer.decodeFloat()
      val recordingTimeMs = inputBuffer.decodeUint32()
      val availableCapacity = inputBuffer.decodeFloat()
      val imageStatus = inputBuffer.decodeUint8()
      val videoStatus = inputBuffer.decodeUint8()
      val imageCount = inputBuffer.decodeInt32()

      CameraCaptureStatus(
        timeBootMs = timeBootMs,
        imageStatus = imageStatus,
        videoStatus = videoStatus,
        imageInterval = imageInterval,
        recordingTimeMs = recordingTimeMs,
        availableCapacity = availableCapacity,
        imageCount = imageCount,
      )
    }


    private val METADATA: MavMessage.Metadata<CameraCaptureStatus> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<CameraCaptureStatus> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeBootMs: Long = 0L

    public var imageStatus: Int = 0

    public var videoStatus: Int = 0

    public var imageInterval: Float = 0F

    public var recordingTimeMs: Long = 0L

    public var availableCapacity: Float = 0F

    public var imageCount: Int = 0

    public fun build(): CameraCaptureStatus = CameraCaptureStatus(
      timeBootMs = timeBootMs,
      imageStatus = imageStatus,
      videoStatus = videoStatus,
      imageInterval = imageInterval,
      recordingTimeMs = recordingTimeMs,
      availableCapacity = availableCapacity,
      imageCount = imageCount,
    )
  }
}
