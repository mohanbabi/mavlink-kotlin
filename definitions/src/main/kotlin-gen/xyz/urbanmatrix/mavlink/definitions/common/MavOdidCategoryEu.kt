package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

@GeneratedMavEnum
public enum class MavOdidCategoryEu(
  public override val `value`: Long,
) : MavEnum {
  /**
   * The category for the UA, according to the EU specification, is undeclared.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CATEGORY_EU_UNDECLARED(0L),
  /**
   * The category for the UA, according to the EU specification, is the Open category.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CATEGORY_EU_OPEN(1L),
  /**
   * The category for the UA, according to the EU specification, is the Specific category.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CATEGORY_EU_SPECIFIC(2L),
  /**
   * The category for the UA, according to the EU specification, is the Certified category.
   */
  @GeneratedMavEnumEntry
  MAV_ODID_CATEGORY_EU_CERTIFIED(3L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): MavOdidCategoryEu? = when (v) {
      0L -> MAV_ODID_CATEGORY_EU_UNDECLARED
      1L -> MAV_ODID_CATEGORY_EU_OPEN
      2L -> MAV_ODID_CATEGORY_EU_SPECIFIC
      3L -> MAV_ODID_CATEGORY_EU_CERTIFIED
      else -> null
    }
  }
}
