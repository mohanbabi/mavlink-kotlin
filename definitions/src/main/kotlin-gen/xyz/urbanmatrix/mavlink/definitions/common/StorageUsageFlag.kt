package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Flags to indicate usage for a particular storage (see STORAGE_INFORMATION.storage_usage and
 * MAV_CMD_SET_STORAGE_USAGE).
 */
@GeneratedMavEnum
public enum class StorageUsageFlag(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Always set to 1 (indicates STORAGE_INFORMATION.storage_usage is supported).
   */
  @GeneratedMavEnumEntry
  STORAGE_USAGE_FLAG_SET(1L),
  /**
   * Storage for saving photos.
   */
  @GeneratedMavEnumEntry
  STORAGE_USAGE_FLAG_PHOTO(2L),
  /**
   * Storage for saving videos.
   */
  @GeneratedMavEnumEntry
  STORAGE_USAGE_FLAG_VIDEO(4L),
  /**
   * Storage for saving logs.
   */
  @GeneratedMavEnumEntry
  STORAGE_USAGE_FLAG_LOGS(8L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): StorageUsageFlag? = when (v) {
      1L -> STORAGE_USAGE_FLAG_SET
      2L -> STORAGE_USAGE_FLAG_PHOTO
      4L -> STORAGE_USAGE_FLAG_VIDEO
      8L -> STORAGE_USAGE_FLAG_LOGS
      else -> null
    }
  }
}
