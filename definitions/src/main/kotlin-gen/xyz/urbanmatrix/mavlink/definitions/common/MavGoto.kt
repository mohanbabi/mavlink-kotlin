package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Actions that may be specified in MAV_CMD_OVERRIDE_GOTO to override mission execution.
 */
@GeneratedMavEnum
public enum class MavGoto(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Hold at the current position.
   */
  @GeneratedMavEnumEntry
  MAV_GOTO_DO_HOLD(0L),
  /**
   * Continue with the next item in mission execution.
   */
  @GeneratedMavEnumEntry
  MAV_GOTO_DO_CONTINUE(1L),
  /**
   * Hold at the current position of the system
   */
  @GeneratedMavEnumEntry
  MAV_GOTO_HOLD_AT_CURRENT_POSITION(2L),
  /**
   * Hold at the position specified in the parameters of the DO_HOLD action
   */
  @GeneratedMavEnumEntry
  MAV_GOTO_HOLD_AT_SPECIFIED_POSITION(3L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): MavGoto? = when (v) {
      0L -> MAV_GOTO_DO_HOLD
      1L -> MAV_GOTO_DO_CONTINUE
      2L -> MAV_GOTO_HOLD_AT_CURRENT_POSITION
      3L -> MAV_GOTO_HOLD_AT_SPECIFIED_POSITION
      else -> null
    }
  }
}
