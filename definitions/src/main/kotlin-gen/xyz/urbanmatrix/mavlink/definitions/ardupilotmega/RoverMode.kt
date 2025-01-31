package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * A mapping of rover flight modes for custom_mode field of heartbeat.
 */
@GeneratedMavEnum
public enum class RoverMode(
  public override val `value`: Long,
) : MavEnum {
  @GeneratedMavEnumEntry
  ROVER_MODE_MANUAL(0L),
  @GeneratedMavEnumEntry
  ROVER_MODE_ACRO(1L),
  @GeneratedMavEnumEntry
  ROVER_MODE_STEERING(3L),
  @GeneratedMavEnumEntry
  ROVER_MODE_HOLD(4L),
  @GeneratedMavEnumEntry
  ROVER_MODE_LOITER(5L),
  @GeneratedMavEnumEntry
  ROVER_MODE_FOLLOW(6L),
  @GeneratedMavEnumEntry
  ROVER_MODE_SIMPLE(7L),
  @GeneratedMavEnumEntry
  ROVER_MODE_AUTO(10L),
  @GeneratedMavEnumEntry
  ROVER_MODE_RTL(11L),
  @GeneratedMavEnumEntry
  ROVER_MODE_SMART_RTL(12L),
  @GeneratedMavEnumEntry
  ROVER_MODE_GUIDED(15L),
  @GeneratedMavEnumEntry
  ROVER_MODE_INITIALIZING(16L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): RoverMode? = when (v) {
      0L -> ROVER_MODE_MANUAL
      1L -> ROVER_MODE_ACRO
      3L -> ROVER_MODE_STEERING
      4L -> ROVER_MODE_HOLD
      5L -> ROVER_MODE_LOITER
      6L -> ROVER_MODE_FOLLOW
      7L -> ROVER_MODE_SIMPLE
      10L -> ROVER_MODE_AUTO
      11L -> ROVER_MODE_RTL
      12L -> ROVER_MODE_SMART_RTL
      15L -> ROVER_MODE_GUIDED
      16L -> ROVER_MODE_INITIALIZING
      else -> null
    }
  }
}
