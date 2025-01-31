package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

@GeneratedMavEnum
public enum class GoproProtuneGain(
  public override val `value`: Long,
) : MavEnum {
  /**
   * ISO 400.
   */
  @GeneratedMavEnumEntry
  GOPRO_PROTUNE_GAIN_400(0L),
  /**
   * ISO 800 (Only Hero 4).
   */
  @GeneratedMavEnumEntry
  GOPRO_PROTUNE_GAIN_800(1L),
  /**
   * ISO 1600.
   */
  @GeneratedMavEnumEntry
  GOPRO_PROTUNE_GAIN_1600(2L),
  /**
   * ISO 3200 (Only Hero 4).
   */
  @GeneratedMavEnumEntry
  GOPRO_PROTUNE_GAIN_3200(3L),
  /**
   * ISO 6400.
   */
  @GeneratedMavEnumEntry
  GOPRO_PROTUNE_GAIN_6400(4L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): GoproProtuneGain? = when (v) {
      0L -> GOPRO_PROTUNE_GAIN_400
      1L -> GOPRO_PROTUNE_GAIN_800
      2L -> GOPRO_PROTUNE_GAIN_1600
      3L -> GOPRO_PROTUNE_GAIN_3200
      4L -> GOPRO_PROTUNE_GAIN_6400
      else -> null
    }
  }
}
