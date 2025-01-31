package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * A mapping of sub flight modes for custom_mode field of heartbeat.
 */
@GeneratedMavEnum
public enum class SubMode(
  public override val `value`: Long,
) : MavEnum {
  @GeneratedMavEnumEntry
  SUB_MODE_STABILIZE(0L),
  @GeneratedMavEnumEntry
  SUB_MODE_ACRO(1L),
  @GeneratedMavEnumEntry
  SUB_MODE_ALT_HOLD(2L),
  @GeneratedMavEnumEntry
  SUB_MODE_AUTO(3L),
  @GeneratedMavEnumEntry
  SUB_MODE_GUIDED(4L),
  @GeneratedMavEnumEntry
  SUB_MODE_CIRCLE(7L),
  @GeneratedMavEnumEntry
  SUB_MODE_SURFACE(9L),
  @GeneratedMavEnumEntry
  SUB_MODE_POSHOLD(16L),
  @GeneratedMavEnumEntry
  SUB_MODE_MANUAL(19L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): SubMode? = when (v) {
      0L -> SUB_MODE_STABILIZE
      1L -> SUB_MODE_ACRO
      2L -> SUB_MODE_ALT_HOLD
      3L -> SUB_MODE_AUTO
      4L -> SUB_MODE_GUIDED
      7L -> SUB_MODE_CIRCLE
      9L -> SUB_MODE_SURFACE
      16L -> SUB_MODE_POSHOLD
      19L -> SUB_MODE_MANUAL
      else -> null
    }
  }
}
