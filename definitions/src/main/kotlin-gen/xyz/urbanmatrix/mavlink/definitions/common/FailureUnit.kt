package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * List of possible units where failures can be injected.
 */
@GeneratedMavEnum
public enum class FailureUnit(
  public override val `value`: Long,
) : MavEnum {
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_GYRO(0L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_ACCEL(1L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_MAG(2L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_BARO(3L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_GPS(4L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_OPTICAL_FLOW(5L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_VIO(6L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_DISTANCE_SENSOR(7L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SENSOR_AIRSPEED(8L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SYSTEM_BATTERY(100L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SYSTEM_MOTOR(101L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SYSTEM_SERVO(102L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SYSTEM_AVOIDANCE(103L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SYSTEM_RC_SIGNAL(104L),
  @GeneratedMavEnumEntry
  FAILURE_UNIT_SYSTEM_MAVLINK_SIGNAL(105L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): FailureUnit? = when (v) {
      0L -> FAILURE_UNIT_SENSOR_GYRO
      1L -> FAILURE_UNIT_SENSOR_ACCEL
      2L -> FAILURE_UNIT_SENSOR_MAG
      3L -> FAILURE_UNIT_SENSOR_BARO
      4L -> FAILURE_UNIT_SENSOR_GPS
      5L -> FAILURE_UNIT_SENSOR_OPTICAL_FLOW
      6L -> FAILURE_UNIT_SENSOR_VIO
      7L -> FAILURE_UNIT_SENSOR_DISTANCE_SENSOR
      8L -> FAILURE_UNIT_SENSOR_AIRSPEED
      100L -> FAILURE_UNIT_SYSTEM_BATTERY
      101L -> FAILURE_UNIT_SYSTEM_MOTOR
      102L -> FAILURE_UNIT_SYSTEM_SERVO
      103L -> FAILURE_UNIT_SYSTEM_AVOIDANCE
      104L -> FAILURE_UNIT_SYSTEM_RC_SIGNAL
      105L -> FAILURE_UNIT_SYSTEM_MAVLINK_SIGNAL
      else -> null
    }
  }
}
