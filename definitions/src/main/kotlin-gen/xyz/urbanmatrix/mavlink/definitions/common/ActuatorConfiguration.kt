package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Actuator configuration, used to change a setting on an actuator. Component information metadata
 * can be used to know which outputs support which commands.
 */
@GeneratedMavEnum
public enum class ActuatorConfiguration(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Do nothing.
   */
  @GeneratedMavEnumEntry
  ACTUATOR_CONFIGURATION_NONE(0L),
  /**
   * Command the actuator to beep now.
   */
  @GeneratedMavEnumEntry
  ACTUATOR_CONFIGURATION_BEEP(1L),
  /**
   * Permanently set the actuator (ESC) to 3D mode (reversible thrust).
   */
  @GeneratedMavEnumEntry
  ACTUATOR_CONFIGURATION_3D_MODE_ON(2L),
  /**
   * Permanently set the actuator (ESC) to non 3D mode (non-reversible thrust).
   */
  @GeneratedMavEnumEntry
  ACTUATOR_CONFIGURATION_3D_MODE_OFF(3L),
  /**
   * Permanently set the actuator (ESC) to spin direction 1 (which can be clockwise or
   * counter-clockwise).
   */
  @GeneratedMavEnumEntry
  ACTUATOR_CONFIGURATION_SPIN_DIRECTION1(4L),
  /**
   * Permanently set the actuator (ESC) to spin direction 2 (opposite of direction 1).
   */
  @GeneratedMavEnumEntry
  ACTUATOR_CONFIGURATION_SPIN_DIRECTION2(5L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): ActuatorConfiguration? = when (v) {
      0L -> ACTUATOR_CONFIGURATION_NONE
      1L -> ACTUATOR_CONFIGURATION_BEEP
      2L -> ACTUATOR_CONFIGURATION_3D_MODE_ON
      3L -> ACTUATOR_CONFIGURATION_3D_MODE_OFF
      4L -> ACTUATOR_CONFIGURATION_SPIN_DIRECTION1
      5L -> ACTUATOR_CONFIGURATION_SPIN_DIRECTION2
      else -> null
    }
  }
}
