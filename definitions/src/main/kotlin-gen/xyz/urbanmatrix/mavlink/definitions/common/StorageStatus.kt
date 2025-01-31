package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Flags to indicate the status of camera storage.
 */
@GeneratedMavEnum
public enum class StorageStatus(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Storage is missing (no microSD card loaded for example.)
   */
  @GeneratedMavEnumEntry
  STORAGE_STATUS_EMPTY(0L),
  /**
   * Storage present but unformatted.
   */
  @GeneratedMavEnumEntry
  STORAGE_STATUS_UNFORMATTED(1L),
  /**
   * Storage present and ready.
   */
  @GeneratedMavEnumEntry
  STORAGE_STATUS_READY(2L),
  /**
   * Camera does not supply storage status information. Capacity information in STORAGE_INFORMATION
   * fields will be ignored.
   */
  @GeneratedMavEnumEntry
  STORAGE_STATUS_NOT_SUPPORTED(3L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): StorageStatus? = when (v) {
      0L -> STORAGE_STATUS_EMPTY
      1L -> STORAGE_STATUS_UNFORMATTED
      2L -> STORAGE_STATUS_READY
      3L -> STORAGE_STATUS_NOT_SUPPORTED
      else -> null
    }
  }
}
