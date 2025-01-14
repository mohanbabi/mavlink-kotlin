package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

@GeneratedMavEnum
public enum class MavOdidClassEu(
  public override val `value`: Long,
) : MavEnum {
  /**
   * The class for the UA, according to the EU specification, is undeclared.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_UNDECLARED(0L),
  /**
   * The class for the UA, according to the EU specification, is Class 0.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_0(1L),
  /**
   * The class for the UA, according to the EU specification, is Class 1.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_1(2L),
  /**
   * The class for the UA, according to the EU specification, is Class 2.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_2(3L),
  /**
   * The class for the UA, according to the EU specification, is Class 3.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_3(4L),
  /**
   * The class for the UA, according to the EU specification, is Class 4.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_4(5L),
  /**
   * The class for the UA, according to the EU specification, is Class 5.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_5(6L),
  /**
   * The class for the UA, according to the EU specification, is Class 6.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CLASS_EU_CLASS_6(7L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): MavOdidClassEu? = when (v) {
      0L -> MAV_ODID_CLASS_EU_UNDECLARED
      1L -> MAV_ODID_CLASS_EU_CLASS_0
      2L -> MAV_ODID_CLASS_EU_CLASS_1
      3L -> MAV_ODID_CLASS_EU_CLASS_2
      4L -> MAV_ODID_CLASS_EU_CLASS_3
      5L -> MAV_ODID_CLASS_EU_CLASS_4
      6L -> MAV_ODID_CLASS_EU_CLASS_5
      7L -> MAV_ODID_CLASS_EU_CLASS_6
      else -> null
    }
  }
}
