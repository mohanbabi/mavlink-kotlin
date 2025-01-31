package xyz.urbanmatrix.mavlink.definitions.ualberta

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Mode currently commanded by pilot
 */
@GeneratedMavEnum
public enum class UalbertaPilotMode(
  public override val `value`: Long,
) : MavEnum {
  /**
   *  sdf
   */
  @GeneratedMavEnumEntry
  PILOT_MANUAL(1L),
  /**
   *  dfs
   */
  @GeneratedMavEnumEntry
  PILOT_AUTO(2L),
  /**
   *  Rotomotion mode 
   */
  @GeneratedMavEnumEntry
  PILOT_ROTO(3L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): UalbertaPilotMode? = when (v) {
      1L -> PILOT_MANUAL
      2L -> PILOT_AUTO
      3L -> PILOT_ROTO
      else -> null
    }
  }
}
