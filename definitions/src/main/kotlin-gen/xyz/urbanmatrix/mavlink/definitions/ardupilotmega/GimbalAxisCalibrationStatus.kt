package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

@GeneratedMavEnum
public enum class GimbalAxisCalibrationStatus(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Axis calibration is in progress.
   */
  @GeneratedMavEnumEntry
  GIMBAL_AXIS_CALIBRATION_STATUS_IN_PROGRESS(0L),
  /**
   * Axis calibration succeeded.
   */
  @GeneratedMavEnumEntry
  GIMBAL_AXIS_CALIBRATION_STATUS_SUCCEEDED(1L),
  /**
   * Axis calibration failed.
   */
  @GeneratedMavEnumEntry
  GIMBAL_AXIS_CALIBRATION_STATUS_FAILED(2L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): GimbalAxisCalibrationStatus? = when (v) {
      0L -> GIMBAL_AXIS_CALIBRATION_STATUS_IN_PROGRESS
      1L -> GIMBAL_AXIS_CALIBRATION_STATUS_SUCCEEDED
      2L -> GIMBAL_AXIS_CALIBRATION_STATUS_FAILED
      else -> null
    }
  }
}
