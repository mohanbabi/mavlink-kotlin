package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

@GeneratedMavEnum
public enum class GoproPhotoResolution(
  public override val `value`: Long,
) : MavEnum {
  /**
   * 5MP Medium.
   */
  @GeneratedMavEnumEntry
  GOPRO_PHOTO_RESOLUTION_5MP_MEDIUM(0L),
  /**
   * 7MP Medium.
   */
  @GeneratedMavEnumEntry
  GOPRO_PHOTO_RESOLUTION_7MP_MEDIUM(1L),
  /**
   * 7MP Wide.
   */
  @GeneratedMavEnumEntry
  GOPRO_PHOTO_RESOLUTION_7MP_WIDE(2L),
  /**
   * 10MP Wide.
   */
  @GeneratedMavEnumEntry
  GOPRO_PHOTO_RESOLUTION_10MP_WIDE(3L),
  /**
   * 12MP Wide.
   */
  @GeneratedMavEnumEntry
  GOPRO_PHOTO_RESOLUTION_12MP_WIDE(4L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): GoproPhotoResolution? = when (v) {
      0L -> GOPRO_PHOTO_RESOLUTION_5MP_MEDIUM
      1L -> GOPRO_PHOTO_RESOLUTION_7MP_MEDIUM
      2L -> GOPRO_PHOTO_RESOLUTION_7MP_WIDE
      3L -> GOPRO_PHOTO_RESOLUTION_10MP_WIDE
      4L -> GOPRO_PHOTO_RESOLUTION_12MP_WIDE
      else -> null
    }
  }
}
