package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Direction of VTOL transition
 */
@GeneratedMavEnum
public enum class VtolTransitionHeading(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Respect the heading configuration of the vehicle.
   */
  @GeneratedMavEnumEntry
  VTOL_TRANSITION_HEADING_VEHICLE_DEFAULT(0L),
  /**
   * Use the heading pointing towards the next waypoint.
   */
  @GeneratedMavEnumEntry
  VTOL_TRANSITION_HEADING_NEXT_WAYPOINT(1L),
  /**
   * Use the heading on takeoff (while sitting on the ground).
   */
  @GeneratedMavEnumEntry
  VTOL_TRANSITION_HEADING_TAKEOFF(2L),
  /**
   * Use the specified heading in parameter 4.
   */
  @GeneratedMavEnumEntry
  VTOL_TRANSITION_HEADING_SPECIFIED(3L),
  /**
   * Use the current heading when reaching takeoff altitude (potentially facing the wind when
   * weather-vaning is active).
   */
  @GeneratedMavEnumEntry
  VTOL_TRANSITION_HEADING_ANY(4L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): VtolTransitionHeading? = when (v) {
      0L -> VTOL_TRANSITION_HEADING_VEHICLE_DEFAULT
      1L -> VTOL_TRANSITION_HEADING_NEXT_WAYPOINT
      2L -> VTOL_TRANSITION_HEADING_TAKEOFF
      3L -> VTOL_TRANSITION_HEADING_SPECIFIED
      4L -> VTOL_TRANSITION_HEADING_ANY
      else -> null
    }
  }
}
