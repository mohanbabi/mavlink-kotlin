package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * A mapping of plane flight modes for custom_mode field of heartbeat.
 */
@GeneratedMavEnum
public enum class PlaneMode(
  public override val `value`: Long,
) : MavEnum {
  @GeneratedMavEnumEntry
  PLANE_MODE_MANUAL(0L),
  @GeneratedMavEnumEntry
  PLANE_MODE_CIRCLE(1L),
  @GeneratedMavEnumEntry
  PLANE_MODE_STABILIZE(2L),
  @GeneratedMavEnumEntry
  PLANE_MODE_TRAINING(3L),
  @GeneratedMavEnumEntry
  PLANE_MODE_ACRO(4L),
  @GeneratedMavEnumEntry
  PLANE_MODE_FLY_BY_WIRE_A(5L),
  @GeneratedMavEnumEntry
  PLANE_MODE_FLY_BY_WIRE_B(6L),
  @GeneratedMavEnumEntry
  PLANE_MODE_CRUISE(7L),
  @GeneratedMavEnumEntry
  PLANE_MODE_AUTOTUNE(8L),
  @GeneratedMavEnumEntry
  PLANE_MODE_AUTO(10L),
  @GeneratedMavEnumEntry
  PLANE_MODE_RTL(11L),
  @GeneratedMavEnumEntry
  PLANE_MODE_LOITER(12L),
  @GeneratedMavEnumEntry
  PLANE_MODE_TAKEOFF(13L),
  @GeneratedMavEnumEntry
  PLANE_MODE_AVOID_ADSB(14L),
  @GeneratedMavEnumEntry
  PLANE_MODE_GUIDED(15L),
  @GeneratedMavEnumEntry
  PLANE_MODE_INITIALIZING(16L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QSTABILIZE(17L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QHOVER(18L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QLOITER(19L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QLAND(20L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QRTL(21L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QAUTOTUNE(22L),
  @GeneratedMavEnumEntry
  PLANE_MODE_QACRO(23L),
  @GeneratedMavEnumEntry
  PLANE_MODE_THERMAL(24L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): PlaneMode? = when (v) {
      0L -> PLANE_MODE_MANUAL
      1L -> PLANE_MODE_CIRCLE
      2L -> PLANE_MODE_STABILIZE
      3L -> PLANE_MODE_TRAINING
      4L -> PLANE_MODE_ACRO
      5L -> PLANE_MODE_FLY_BY_WIRE_A
      6L -> PLANE_MODE_FLY_BY_WIRE_B
      7L -> PLANE_MODE_CRUISE
      8L -> PLANE_MODE_AUTOTUNE
      10L -> PLANE_MODE_AUTO
      11L -> PLANE_MODE_RTL
      12L -> PLANE_MODE_LOITER
      13L -> PLANE_MODE_TAKEOFF
      14L -> PLANE_MODE_AVOID_ADSB
      15L -> PLANE_MODE_GUIDED
      16L -> PLANE_MODE_INITIALIZING
      17L -> PLANE_MODE_QSTABILIZE
      18L -> PLANE_MODE_QHOVER
      19L -> PLANE_MODE_QLOITER
      20L -> PLANE_MODE_QLAND
      21L -> PLANE_MODE_QRTL
      22L -> PLANE_MODE_QAUTOTUNE
      23L -> PLANE_MODE_QACRO
      24L -> PLANE_MODE_THERMAL
      else -> null
    }
  }
}
