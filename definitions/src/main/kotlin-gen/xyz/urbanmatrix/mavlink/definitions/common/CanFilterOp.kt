package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

@GeneratedMavEnum
public enum class CanFilterOp(
  public override val `value`: Long,
) : MavEnum {
  @GeneratedMavEnumEntry
  CAN_FILTER_REPLACE(0L),
  @GeneratedMavEnumEntry
  CAN_FILTER_ADD(1L),
  @GeneratedMavEnumEntry
  CAN_FILTER_REMOVE(2L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): CanFilterOp? = when (v) {
      0L -> CAN_FILTER_REPLACE
      1L -> CAN_FILTER_ADD
      2L -> CAN_FILTER_REMOVE
      else -> null
    }
  }
}
