package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Flags for gimbal device (lower level) operation.
 */
@GeneratedMavEnum
public enum class GimbalDeviceFlags(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Set to retracted safe position (no stabilization), takes presedence over all other flags.
   */
  @GeneratedMavEnumEntry
  GIMBAL_DEVICE_FLAGS_RETRACT(1L),
  /**
   * Set to neutral/default position, taking precedence over all other flags except RETRACT. Neutral
   * is commonly forward-facing and horizontal (pitch=yaw=0) but may be any orientation.
   */
  @GeneratedMavEnumEntry
  GIMBAL_DEVICE_FLAGS_NEUTRAL(2L),
  /**
   * Lock roll angle to absolute angle relative to horizon (not relative to drone). This is
   * generally the default with a stabilizing gimbal.
   */
  @GeneratedMavEnumEntry
  GIMBAL_DEVICE_FLAGS_ROLL_LOCK(4L),
  /**
   * Lock pitch angle to absolute angle relative to horizon (not relative to drone). This is
   * generally the default.
   */
  @GeneratedMavEnumEntry
  GIMBAL_DEVICE_FLAGS_PITCH_LOCK(8L),
  /**
   * Lock yaw angle to absolute angle relative to North (not relative to drone). If this flag is
   * set, the quaternion is in the Earth frame with the x-axis pointing North (yaw absolute). If this
   * flag is not set, the quaternion frame is in the Earth frame rotated so that the x-axis is pointing
   * forward (yaw relative to vehicle).
   */
  @GeneratedMavEnumEntry
  GIMBAL_DEVICE_FLAGS_YAW_LOCK(16L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): GimbalDeviceFlags? = when (v) {
      1L -> GIMBAL_DEVICE_FLAGS_RETRACT
      2L -> GIMBAL_DEVICE_FLAGS_NEUTRAL
      4L -> GIMBAL_DEVICE_FLAGS_ROLL_LOCK
      8L -> GIMBAL_DEVICE_FLAGS_PITCH_LOCK
      16L -> GIMBAL_DEVICE_FLAGS_YAW_LOCK
      else -> null
    }
  }
}
