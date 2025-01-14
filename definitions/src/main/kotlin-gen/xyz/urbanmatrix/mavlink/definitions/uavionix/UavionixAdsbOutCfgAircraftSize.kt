package xyz.urbanmatrix.mavlink.definitions.uavionix

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Definitions for aircraft size
 */
@GeneratedMavEnum
public enum class UavionixAdsbOutCfgAircraftSize(
  public override val `value`: Long,
) : MavEnum {
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_NO_DATA(0L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L15M_W23M(1L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L25M_W28P5M(2L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L25_34M(3L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L35_33M(4L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L35_38M(5L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L45_39P5M(6L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L45_45M(7L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L55_45M(8L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L55_52M(9L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L65_59P5M(10L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L65_67M(11L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L75_W72P5M(12L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L75_W80M(13L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L85_W80M(14L),
  @GeneratedMavEnumEntry
  UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L85_W90M(15L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): UavionixAdsbOutCfgAircraftSize? = when (v) {
      0L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_NO_DATA
      1L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L15M_W23M
      2L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L25M_W28P5M
      3L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L25_34M
      4L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L35_33M
      5L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L35_38M
      6L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L45_39P5M
      7L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L45_45M
      8L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L55_45M
      9L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L55_52M
      10L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L65_59P5M
      11L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L65_67M
      12L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L75_W72P5M
      13L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L75_W80M
      14L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L85_W80M
      15L -> UAVIONIX_ADSB_OUT_CFG_AIRCRAFT_SIZE_L85_W90M
      else -> null
    }
  }
}
