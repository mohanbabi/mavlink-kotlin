package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Navigational status of AIS vessel, enum duplicated from AIS standard,
 * https://gpsd.gitlab.io/gpsd/AIVDM.html
 */
@GeneratedMavEnum
public enum class AisNavStatus(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Under way using engine.
   */
  @GeneratedMavEnumEntry
  UNDER_WAY(0L),
  @GeneratedMavEnumEntry
  AIS_NAV_ANCHORED(1L),
  @GeneratedMavEnumEntry
  AIS_NAV_UN_COMMANDED(2L),
  @GeneratedMavEnumEntry
  AIS_NAV_RESTRICTED_MANOEUVERABILITY(3L),
  @GeneratedMavEnumEntry
  AIS_NAV_DRAUGHT_CONSTRAINED(4L),
  @GeneratedMavEnumEntry
  AIS_NAV_MOORED(5L),
  @GeneratedMavEnumEntry
  AIS_NAV_AGROUND(6L),
  @GeneratedMavEnumEntry
  AIS_NAV_FISHING(7L),
  @GeneratedMavEnumEntry
  AIS_NAV_SAILING(8L),
  @GeneratedMavEnumEntry
  AIS_NAV_RESERVED_HSC(9L),
  @GeneratedMavEnumEntry
  AIS_NAV_RESERVED_WIG(10L),
  @GeneratedMavEnumEntry
  AIS_NAV_RESERVED_1(11L),
  @GeneratedMavEnumEntry
  AIS_NAV_RESERVED_2(12L),
  @GeneratedMavEnumEntry
  AIS_NAV_RESERVED_3(13L),
  /**
   * Search And Rescue Transponder.
   */
  @GeneratedMavEnumEntry
  AIS_NAV_AIS_SART(14L),
  /**
   * Not available (default).
   */
  @GeneratedMavEnumEntry
  AIS_NAV_UNKNOWN(15L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): AisNavStatus? = when (v) {
      0L -> UNDER_WAY
      1L -> AIS_NAV_ANCHORED
      2L -> AIS_NAV_UN_COMMANDED
      3L -> AIS_NAV_RESTRICTED_MANOEUVERABILITY
      4L -> AIS_NAV_DRAUGHT_CONSTRAINED
      5L -> AIS_NAV_MOORED
      6L -> AIS_NAV_AGROUND
      7L -> AIS_NAV_FISHING
      8L -> AIS_NAV_SAILING
      9L -> AIS_NAV_RESERVED_HSC
      10L -> AIS_NAV_RESERVED_WIG
      11L -> AIS_NAV_RESERVED_1
      12L -> AIS_NAV_RESERVED_2
      13L -> AIS_NAV_RESERVED_3
      14L -> AIS_NAV_AIS_SART
      15L -> AIS_NAV_UNKNOWN
      else -> null
    }
  }
}
