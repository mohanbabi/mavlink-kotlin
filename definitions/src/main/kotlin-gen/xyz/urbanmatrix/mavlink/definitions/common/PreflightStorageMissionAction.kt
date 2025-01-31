package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 *
 *         Actions for reading and writing plan information (mission, rally points, geofence)
 * between persistent and volatile storage when using MAV_CMD_PREFLIGHT_STORAGE.
 *         (Commonly missions are loaded from persistent storage (flash/EEPROM) into volatile
 * storage (RAM) on startup and written back when they are changed.)
 *       
 */
@GeneratedMavEnum
public enum class PreflightStorageMissionAction(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Read current mission data from persistent storage
   */
  @GeneratedMavEnumEntry
  MISSION_READ_PERSISTENT(0L),
  /**
   * Write current mission data to persistent storage
   */
  @GeneratedMavEnumEntry
  MISSION_WRITE_PERSISTENT(1L),
  /**
   * Erase all mission data stored on the vehicle (both persistent and volatile storage)
   */
  @GeneratedMavEnumEntry
  MISSION_RESET_DEFAULT(2L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): PreflightStorageMissionAction? = when (v) {
      0L -> MISSION_READ_PERSISTENT
      1L -> MISSION_WRITE_PERSISTENT
      2L -> MISSION_RESET_DEFAULT
      else -> null
    }
  }
}
