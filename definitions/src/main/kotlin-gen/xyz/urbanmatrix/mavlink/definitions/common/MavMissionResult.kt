package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Result of mission operation (in a MISSION_ACK message).
 */
@GeneratedMavEnum
public enum class MavMissionResult(
  public override val `value`: Long,
) : MavEnum {
  /**
   * mission accepted OK
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_ACCEPTED(0L),
  /**
   * Generic error / not accepting mission commands at all right now.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_ERROR(1L),
  /**
   * Coordinate frame is not supported.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_UNSUPPORTED_FRAME(2L),
  /**
   * Command is not supported.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_UNSUPPORTED(3L),
  /**
   * Mission items exceed storage space.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_NO_SPACE(4L),
  /**
   * One of the parameters has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID(5L),
  /**
   * param1 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM1(6L),
  /**
   * param2 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM2(7L),
  /**
   * param3 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM3(8L),
  /**
   * param4 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM4(9L),
  /**
   * x / param5 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM5_X(10L),
  /**
   * y / param6 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM6_Y(11L),
  /**
   * z / param7 has an invalid value.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_PARAM7(12L),
  /**
   * Mission item received out of sequence
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_INVALID_SEQUENCE(13L),
  /**
   * Not accepting any mission commands from this communication partner.
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_DENIED(14L),
  /**
   * Current mission operation cancelled (e.g. mission upload, mission download).
   */
  @GeneratedMavEnumEntry
  MAV_MISSION_OPERATION_CANCELLED(15L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): MavMissionResult? = when (v) {
      0L -> MAV_MISSION_ACCEPTED
      1L -> MAV_MISSION_ERROR
      2L -> MAV_MISSION_UNSUPPORTED_FRAME
      3L -> MAV_MISSION_UNSUPPORTED
      4L -> MAV_MISSION_NO_SPACE
      5L -> MAV_MISSION_INVALID
      6L -> MAV_MISSION_INVALID_PARAM1
      7L -> MAV_MISSION_INVALID_PARAM2
      8L -> MAV_MISSION_INVALID_PARAM3
      9L -> MAV_MISSION_INVALID_PARAM4
      10L -> MAV_MISSION_INVALID_PARAM5_X
      11L -> MAV_MISSION_INVALID_PARAM6_Y
      12L -> MAV_MISSION_INVALID_PARAM7
      13L -> MAV_MISSION_INVALID_SEQUENCE
      14L -> MAV_MISSION_DENIED
      15L -> MAV_MISSION_OPERATION_CANCELLED
      else -> null
    }
  }
}
