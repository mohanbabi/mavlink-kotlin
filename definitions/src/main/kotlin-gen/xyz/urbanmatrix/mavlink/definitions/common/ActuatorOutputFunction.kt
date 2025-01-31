package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Actuator output function. Values greater or equal to 1000 are autopilot-specific.
 */
@GeneratedMavEnum
public enum class ActuatorOutputFunction(
  public override val `value`: Long,
) : MavEnum {
  /**
   * No function (disabled).
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_NONE(0L),
  /**
   * Motor 1
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR1(1L),
  /**
   * Motor 2
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR2(2L),
  /**
   * Motor 3
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR3(3L),
  /**
   * Motor 4
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR4(4L),
  /**
   * Motor 5
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR5(5L),
  /**
   * Motor 6
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR6(6L),
  /**
   * Motor 7
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR7(7L),
  /**
   * Motor 8
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR8(8L),
  /**
   * Motor 9
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR9(9L),
  /**
   * Motor 10
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR10(10L),
  /**
   * Motor 11
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR11(11L),
  /**
   * Motor 12
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR12(12L),
  /**
   * Motor 13
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR13(13L),
  /**
   * Motor 14
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR14(14L),
  /**
   * Motor 15
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR15(15L),
  /**
   * Motor 16
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_MOTOR16(16L),
  /**
   * Servo 1
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO1(33L),
  /**
   * Servo 2
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO2(34L),
  /**
   * Servo 3
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO3(35L),
  /**
   * Servo 4
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO4(36L),
  /**
   * Servo 5
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO5(37L),
  /**
   * Servo 6
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO6(38L),
  /**
   * Servo 7
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO7(39L),
  /**
   * Servo 8
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO8(40L),
  /**
   * Servo 9
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO9(41L),
  /**
   * Servo 10
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO10(42L),
  /**
   * Servo 11
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO11(43L),
  /**
   * Servo 12
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO12(44L),
  /**
   * Servo 13
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO13(45L),
  /**
   * Servo 14
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO14(46L),
  /**
   * Servo 15
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO15(47L),
  /**
   * Servo 16
   */
  @GeneratedMavEnumEntry
  ACTUATOR_OUTPUT_FUNCTION_SERVO16(48L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): ActuatorOutputFunction? = when (v) {
      0L -> ACTUATOR_OUTPUT_FUNCTION_NONE
      1L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR1
      2L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR2
      3L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR3
      4L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR4
      5L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR5
      6L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR6
      7L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR7
      8L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR8
      9L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR9
      10L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR10
      11L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR11
      12L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR12
      13L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR13
      14L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR14
      15L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR15
      16L -> ACTUATOR_OUTPUT_FUNCTION_MOTOR16
      33L -> ACTUATOR_OUTPUT_FUNCTION_SERVO1
      34L -> ACTUATOR_OUTPUT_FUNCTION_SERVO2
      35L -> ACTUATOR_OUTPUT_FUNCTION_SERVO3
      36L -> ACTUATOR_OUTPUT_FUNCTION_SERVO4
      37L -> ACTUATOR_OUTPUT_FUNCTION_SERVO5
      38L -> ACTUATOR_OUTPUT_FUNCTION_SERVO6
      39L -> ACTUATOR_OUTPUT_FUNCTION_SERVO7
      40L -> ACTUATOR_OUTPUT_FUNCTION_SERVO8
      41L -> ACTUATOR_OUTPUT_FUNCTION_SERVO9
      42L -> ACTUATOR_OUTPUT_FUNCTION_SERVO10
      43L -> ACTUATOR_OUTPUT_FUNCTION_SERVO11
      44L -> ACTUATOR_OUTPUT_FUNCTION_SERVO12
      45L -> ACTUATOR_OUTPUT_FUNCTION_SERVO13
      46L -> ACTUATOR_OUTPUT_FUNCTION_SERVO14
      47L -> ACTUATOR_OUTPUT_FUNCTION_SERVO15
      48L -> ACTUATOR_OUTPUT_FUNCTION_SERVO16
      else -> null
    }
  }
}
