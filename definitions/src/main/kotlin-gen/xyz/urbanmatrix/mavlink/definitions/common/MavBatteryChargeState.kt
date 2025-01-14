package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Enumeration for battery charge states.
 */
@GeneratedMavEnum
public enum class MavBatteryChargeState(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Low battery state is not provided
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_UNDEFINED(0L),
  /**
   * Battery is not in low state. Normal operation.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_OK(1L),
  /**
   * Battery state is low, warn and monitor close.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_LOW(2L),
  /**
   * Battery state is critical, return or abort immediately.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_CRITICAL(3L),
  /**
   * Battery state is too low for ordinary abort sequence. Perform fastest possible emergency stop
   * to prevent damage.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_EMERGENCY(4L),
  /**
   * Battery failed, damage unavoidable. Possible causes (faults) are listed in MAV_BATTERY_FAULT.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_FAILED(5L),
  /**
   * Battery is diagnosed to be defective or an error occurred, usage is discouraged / prohibited.
   * Possible causes (faults) are listed in MAV_BATTERY_FAULT.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_UNHEALTHY(6L),
  /**
   * Battery is charging.
   */
  @GeneratedMavEnumEntry
  MAV_BATTERY_CHARGE_STATE_CHARGING(7L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): MavBatteryChargeState? = when (v) {
      0L -> MAV_BATTERY_CHARGE_STATE_UNDEFINED
      1L -> MAV_BATTERY_CHARGE_STATE_OK
      2L -> MAV_BATTERY_CHARGE_STATE_LOW
      3L -> MAV_BATTERY_CHARGE_STATE_CRITICAL
      4L -> MAV_BATTERY_CHARGE_STATE_EMERGENCY
      5L -> MAV_BATTERY_CHARGE_STATE_FAILED
      6L -> MAV_BATTERY_CHARGE_STATE_UNHEALTHY
      7L -> MAV_BATTERY_CHARGE_STATE_CHARGING
      else -> null
    }
  }
}
