package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeString
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeString
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Information about a storage medium. This message is sent in response to a request with
 * MAV_CMD_REQUEST_MESSAGE and whenever the status of the storage changes (STORAGE_STATUS). Use
 * MAV_CMD_REQUEST_MESSAGE.param2 to indicate the index/id of requested storage: 0 for all, 1 for
 * first, 2 for second, etc.
 */
@GeneratedMavMessage(
  id = 261,
  crc = 179,
)
public data class StorageInformation(
  /**
   * Timestamp (time since system boot).
   */
  @GeneratedMavField(type = "uint32_t")
  public val timeBootMs: Long = 0L,
  /**
   * Storage ID (1 for first, 2 for second, etc.)
   */
  @GeneratedMavField(type = "uint8_t")
  public val storageId: Int = 0,
  /**
   * Number of storage devices
   */
  @GeneratedMavField(type = "uint8_t")
  public val storageCount: Int = 0,
  /**
   * Status of storage
   */
  @GeneratedMavField(type = "uint8_t")
  public val status: MavEnumValue<StorageStatus> = MavEnumValue.fromValue(0),
  /**
   * Total capacity. If storage is not ready (STORAGE_STATUS_READY) value will be ignored.
   */
  @GeneratedMavField(type = "float")
  public val totalCapacity: Float = 0F,
  /**
   * Used capacity. If storage is not ready (STORAGE_STATUS_READY) value will be ignored.
   */
  @GeneratedMavField(type = "float")
  public val usedCapacity: Float = 0F,
  /**
   * Available storage capacity. If storage is not ready (STORAGE_STATUS_READY) value will be
   * ignored.
   */
  @GeneratedMavField(type = "float")
  public val availableCapacity: Float = 0F,
  /**
   * Read speed.
   */
  @GeneratedMavField(type = "float")
  public val readSpeed: Float = 0F,
  /**
   * Write speed.
   */
  @GeneratedMavField(type = "float")
  public val writeSpeed: Float = 0F,
  /**
   * Type of storage
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val type: MavEnumValue<StorageType> = MavEnumValue.fromValue(0),
  /**
   * Textual storage name to be used in UI (microSD 1, Internal Memory, etc.) This is a NULL
   * terminated string. If it is exactly 32 characters long, add a terminating NULL. If this string is
   * empty, the generic type is shown to the user.
   */
  @GeneratedMavField(
    type = "char[32]",
    extension = true,
  )
  public val name: String = "",
  /**
   * Flags indicating whether this instance is preferred storage for photos, videos, etc.
   *         Note: Implementations should initially set the flags on the system-default storage id
   * used for saving media (if possible/supported).
   *         This setting can then be overridden using MAV_CMD_SET_STORAGE_USAGE.
   *         If the media usage flags are not set, a GCS may assume storage ID 1 is the default
   * storage for all media types.
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val storageUsage: MavEnumValue<StorageUsageFlag> = MavEnumValue.fromValue(0),
) : MavMessage<StorageInformation> {
  public override val instanceMetadata: MavMessage.Metadata<StorageInformation> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(timeBootMs)
    outputBuffer.encodeFloat(totalCapacity)
    outputBuffer.encodeFloat(usedCapacity)
    outputBuffer.encodeFloat(availableCapacity)
    outputBuffer.encodeFloat(readSpeed)
    outputBuffer.encodeFloat(writeSpeed)
    outputBuffer.encodeUint8(storageId)
    outputBuffer.encodeUint8(storageCount)
    outputBuffer.encodeEnumValue(status.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(timeBootMs)
    outputBuffer.encodeFloat(totalCapacity)
    outputBuffer.encodeFloat(usedCapacity)
    outputBuffer.encodeFloat(availableCapacity)
    outputBuffer.encodeFloat(readSpeed)
    outputBuffer.encodeFloat(writeSpeed)
    outputBuffer.encodeUint8(storageId)
    outputBuffer.encodeUint8(storageCount)
    outputBuffer.encodeEnumValue(status.value, 1)
    outputBuffer.encodeEnumValue(type.value, 1)
    outputBuffer.encodeString(name, 32)
    outputBuffer.encodeEnumValue(storageUsage.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 261

    private const val CRC: Int = 179

    private const val SIZE_V1: Int = 27

    private const val SIZE_V2: Int = 61

    private val DESERIALIZER: MavDeserializer<StorageInformation> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeBootMs = inputBuffer.decodeUint32()
      val totalCapacity = inputBuffer.decodeFloat()
      val usedCapacity = inputBuffer.decodeFloat()
      val availableCapacity = inputBuffer.decodeFloat()
      val readSpeed = inputBuffer.decodeFloat()
      val writeSpeed = inputBuffer.decodeFloat()
      val storageId = inputBuffer.decodeUint8()
      val storageCount = inputBuffer.decodeUint8()
      val status = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = StorageStatus.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val type = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = StorageType.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val name = inputBuffer.decodeString(32)
      val storageUsage = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = StorageUsageFlag.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      StorageInformation(
        timeBootMs = timeBootMs,
        storageId = storageId,
        storageCount = storageCount,
        status = status,
        totalCapacity = totalCapacity,
        usedCapacity = usedCapacity,
        availableCapacity = availableCapacity,
        readSpeed = readSpeed,
        writeSpeed = writeSpeed,
        type = type,
        name = name,
        storageUsage = storageUsage,
      )
    }


    private val METADATA: MavMessage.Metadata<StorageInformation> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<StorageInformation> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeBootMs: Long = 0L

    public var storageId: Int = 0

    public var storageCount: Int = 0

    public var status: MavEnumValue<StorageStatus> = MavEnumValue.fromValue(0)

    public var totalCapacity: Float = 0F

    public var usedCapacity: Float = 0F

    public var availableCapacity: Float = 0F

    public var readSpeed: Float = 0F

    public var writeSpeed: Float = 0F

    public var type: MavEnumValue<StorageType> = MavEnumValue.fromValue(0)

    public var name: String = ""

    public var storageUsage: MavEnumValue<StorageUsageFlag> = MavEnumValue.fromValue(0)

    public fun build(): StorageInformation = StorageInformation(
      timeBootMs = timeBootMs,
      storageId = storageId,
      storageCount = storageCount,
      status = status,
      totalCapacity = totalCapacity,
      usedCapacity = usedCapacity,
      availableCapacity = availableCapacity,
      readSpeed = readSpeed,
      writeSpeed = writeSpeed,
      type = type,
      name = name,
      storageUsage = storageUsage,
    )
  }
}
