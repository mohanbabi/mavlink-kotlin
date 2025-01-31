package xyz.urbanmatrix.mavlink.definitions.minimal

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * MAVLINK component type reported in HEARTBEAT message. Flight controllers must report the type of
 * the vehicle on which they are mounted (e.g. MAV_TYPE_OCTOROTOR). All other components must report a
 * value appropriate for their type (e.g. a camera must use MAV_TYPE_CAMERA).
 */
@GeneratedMavEnum
public enum class MavType(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Generic micro air vehicle
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_GENERIC(0L),
  /**
   * Fixed wing aircraft.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_FIXED_WING(1L),
  /**
   * Quadrotor
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_QUADROTOR(2L),
  /**
   * Coaxial helicopter
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_COAXIAL(3L),
  /**
   * Normal helicopter with tail rotor.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_HELICOPTER(4L),
  /**
   * Ground installation
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_ANTENNA_TRACKER(5L),
  /**
   * Operator control unit / ground control station
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_GCS(6L),
  /**
   * Airship, controlled
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_AIRSHIP(7L),
  /**
   * Free balloon, uncontrolled
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_FREE_BALLOON(8L),
  /**
   * Rocket
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_ROCKET(9L),
  /**
   * Ground rover
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_GROUND_ROVER(10L),
  /**
   * Surface vessel, boat, ship
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_SURFACE_BOAT(11L),
  /**
   * Submarine
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_SUBMARINE(12L),
  /**
   * Hexarotor
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_HEXAROTOR(13L),
  /**
   * Octorotor
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_OCTOROTOR(14L),
  /**
   * Tricopter
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_TRICOPTER(15L),
  /**
   * Flapping wing
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_FLAPPING_WING(16L),
  /**
   * Kite
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_KITE(17L),
  /**
   * Onboard companion controller
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_ONBOARD_CONTROLLER(18L),
  /**
   * Two-rotor Tailsitter VTOL that additionally uses control surfaces in vertical operation. Note,
   * value previously named MAV_TYPE_VTOL_DUOROTOR.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_TAILSITTER_DUOROTOR(19L),
  /**
   * Quad-rotor Tailsitter VTOL using a V-shaped quad config in vertical operation. Note: value
   * previously named MAV_TYPE_VTOL_QUADROTOR.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_TAILSITTER_QUADROTOR(20L),
  /**
   * Tiltrotor VTOL. Fuselage and wings stay (nominally) horizontal in all flight phases. It able to
   * tilt (some) rotors to provide thrust in cruise flight.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_TILTROTOR(21L),
  /**
   * VTOL with separate fixed rotors for hover and cruise flight. Fuselage and wings stay
   * (nominally) horizontal in all flight phases.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_FIXEDROTOR(22L),
  /**
   * Tailsitter VTOL. Fuselage and wings orientation changes depending on flight phase: vertical for
   * hover, horizontal for cruise. Use more specific VTOL MAV_TYPE_VTOL_DUOROTOR or
   * MAV_TYPE_VTOL_QUADROTOR if appropriate.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_TAILSITTER(23L),
  /**
   * VTOL reserved 4
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_RESERVED4(24L),
  /**
   * VTOL reserved 5
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_VTOL_RESERVED5(25L),
  /**
   * Gimbal
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_GIMBAL(26L),
  /**
   * ADSB system
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_ADSB(27L),
  /**
   * Steerable, nonrigid airfoil
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_PARAFOIL(28L),
  /**
   * Dodecarotor
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_DODECAROTOR(29L),
  /**
   * Camera
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_CAMERA(30L),
  /**
   * Charging station
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_CHARGING_STATION(31L),
  /**
   * FLARM collision avoidance system
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_FLARM(32L),
  /**
   * Servo
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_SERVO(33L),
  /**
   * Open Drone ID. See https://mavlink.io/en/services/opendroneid.html.
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_ODID(34L),
  /**
   * Decarotor
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_DECAROTOR(35L),
  /**
   * Battery
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_BATTERY(36L),
  /**
   * Parachute
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_PARACHUTE(37L),
  /**
   * Log
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_LOG(38L),
  /**
   * OSD
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_OSD(39L),
  /**
   * IMU
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_IMU(40L),
  /**
   * GPS
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_GPS(41L),
  /**
   * Winch
   */
  @GeneratedMavEnumEntry
  MAV_TYPE_WINCH(42L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): MavType? = when (v) {
      0L -> MAV_TYPE_GENERIC
      1L -> MAV_TYPE_FIXED_WING
      2L -> MAV_TYPE_QUADROTOR
      3L -> MAV_TYPE_COAXIAL
      4L -> MAV_TYPE_HELICOPTER
      5L -> MAV_TYPE_ANTENNA_TRACKER
      6L -> MAV_TYPE_GCS
      7L -> MAV_TYPE_AIRSHIP
      8L -> MAV_TYPE_FREE_BALLOON
      9L -> MAV_TYPE_ROCKET
      10L -> MAV_TYPE_GROUND_ROVER
      11L -> MAV_TYPE_SURFACE_BOAT
      12L -> MAV_TYPE_SUBMARINE
      13L -> MAV_TYPE_HEXAROTOR
      14L -> MAV_TYPE_OCTOROTOR
      15L -> MAV_TYPE_TRICOPTER
      16L -> MAV_TYPE_FLAPPING_WING
      17L -> MAV_TYPE_KITE
      18L -> MAV_TYPE_ONBOARD_CONTROLLER
      19L -> MAV_TYPE_VTOL_TAILSITTER_DUOROTOR
      20L -> MAV_TYPE_VTOL_TAILSITTER_QUADROTOR
      21L -> MAV_TYPE_VTOL_TILTROTOR
      22L -> MAV_TYPE_VTOL_FIXEDROTOR
      23L -> MAV_TYPE_VTOL_TAILSITTER
      24L -> MAV_TYPE_VTOL_RESERVED4
      25L -> MAV_TYPE_VTOL_RESERVED5
      26L -> MAV_TYPE_GIMBAL
      27L -> MAV_TYPE_ADSB
      28L -> MAV_TYPE_PARAFOIL
      29L -> MAV_TYPE_DODECAROTOR
      30L -> MAV_TYPE_CAMERA
      31L -> MAV_TYPE_CHARGING_STATION
      32L -> MAV_TYPE_FLARM
      33L -> MAV_TYPE_SERVO
      34L -> MAV_TYPE_ODID
      35L -> MAV_TYPE_DECAROTOR
      36L -> MAV_TYPE_BATTERY
      37L -> MAV_TYPE_PARACHUTE
      38L -> MAV_TYPE_LOG
      39L -> MAV_TYPE_OSD
      40L -> MAV_TYPE_IMU
      41L -> MAV_TYPE_GPS
      42L -> MAV_TYPE_WINCH
      else -> null
    }
  }
}
