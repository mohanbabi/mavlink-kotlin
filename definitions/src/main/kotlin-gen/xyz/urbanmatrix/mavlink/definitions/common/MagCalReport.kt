package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Reports results of completed compass calibration. Sent until MAG_CAL_ACK received.
 */
@GeneratedMavMessage(
  id = 192,
  crc = 36,
)
public data class MagCalReport(
  /**
   * Compass being calibrated.
   */
  @GeneratedMavField(type = "uint8_t")
  public val compassId: Int = 0,
  /**
   * Bitmask of compasses being calibrated.
   */
  @GeneratedMavField(type = "uint8_t")
  public val calMask: Int = 0,
  /**
   * Calibration Status.
   */
  @GeneratedMavField(type = "uint8_t")
  public val calStatus: MavEnumValue<MagCalStatus> = MavEnumValue.fromValue(0),
  /**
   * 0=requires a MAV_CMD_DO_ACCEPT_MAG_CAL, 1=saved to parameters.
   */
  @GeneratedMavField(type = "uint8_t")
  public val autosaved: Int = 0,
  /**
   * RMS milligauss residuals.
   */
  @GeneratedMavField(type = "float")
  public val fitness: Float = 0F,
  /**
   * X offset.
   */
  @GeneratedMavField(type = "float")
  public val ofsX: Float = 0F,
  /**
   * Y offset.
   */
  @GeneratedMavField(type = "float")
  public val ofsY: Float = 0F,
  /**
   * Z offset.
   */
  @GeneratedMavField(type = "float")
  public val ofsZ: Float = 0F,
  /**
   * X diagonal (matrix 11).
   */
  @GeneratedMavField(type = "float")
  public val diagX: Float = 0F,
  /**
   * Y diagonal (matrix 22).
   */
  @GeneratedMavField(type = "float")
  public val diagY: Float = 0F,
  /**
   * Z diagonal (matrix 33).
   */
  @GeneratedMavField(type = "float")
  public val diagZ: Float = 0F,
  /**
   * X off-diagonal (matrix 12 and 21).
   */
  @GeneratedMavField(type = "float")
  public val offdiagX: Float = 0F,
  /**
   * Y off-diagonal (matrix 13 and 31).
   */
  @GeneratedMavField(type = "float")
  public val offdiagY: Float = 0F,
  /**
   * Z off-diagonal (matrix 32 and 23).
   */
  @GeneratedMavField(type = "float")
  public val offdiagZ: Float = 0F,
  /**
   * Confidence in orientation (higher is better).
   */
  @GeneratedMavField(
    type = "float",
    extension = true,
  )
  public val orientationConfidence: Float = 0F,
  /**
   * orientation before calibration.
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val oldOrientation: MavEnumValue<MavSensorOrientation> = MavEnumValue.fromValue(0),
  /**
   * orientation after calibration.
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val newOrientation: MavEnumValue<MavSensorOrientation> = MavEnumValue.fromValue(0),
  /**
   * field radius correction factor
   */
  @GeneratedMavField(
    type = "float",
    extension = true,
  )
  public val scaleFactor: Float = 0F,
) : MavMessage<MagCalReport> {
  public override val instanceMetadata: MavMessage.Metadata<MagCalReport> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(fitness)
    outputBuffer.encodeFloat(ofsX)
    outputBuffer.encodeFloat(ofsY)
    outputBuffer.encodeFloat(ofsZ)
    outputBuffer.encodeFloat(diagX)
    outputBuffer.encodeFloat(diagY)
    outputBuffer.encodeFloat(diagZ)
    outputBuffer.encodeFloat(offdiagX)
    outputBuffer.encodeFloat(offdiagY)
    outputBuffer.encodeFloat(offdiagZ)
    outputBuffer.encodeUint8(compassId)
    outputBuffer.encodeUint8(calMask)
    outputBuffer.encodeEnumValue(calStatus.value, 1)
    outputBuffer.encodeUint8(autosaved)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(fitness)
    outputBuffer.encodeFloat(ofsX)
    outputBuffer.encodeFloat(ofsY)
    outputBuffer.encodeFloat(ofsZ)
    outputBuffer.encodeFloat(diagX)
    outputBuffer.encodeFloat(diagY)
    outputBuffer.encodeFloat(diagZ)
    outputBuffer.encodeFloat(offdiagX)
    outputBuffer.encodeFloat(offdiagY)
    outputBuffer.encodeFloat(offdiagZ)
    outputBuffer.encodeUint8(compassId)
    outputBuffer.encodeUint8(calMask)
    outputBuffer.encodeEnumValue(calStatus.value, 1)
    outputBuffer.encodeUint8(autosaved)
    outputBuffer.encodeFloat(orientationConfidence)
    outputBuffer.encodeEnumValue(oldOrientation.value, 1)
    outputBuffer.encodeEnumValue(newOrientation.value, 1)
    outputBuffer.encodeFloat(scaleFactor)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 192

    private const val CRC: Int = 36

    private const val SIZE_V1: Int = 44

    private const val SIZE_V2: Int = 54

    private val DESERIALIZER: MavDeserializer<MagCalReport> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val fitness = inputBuffer.decodeFloat()
      val ofsX = inputBuffer.decodeFloat()
      val ofsY = inputBuffer.decodeFloat()
      val ofsZ = inputBuffer.decodeFloat()
      val diagX = inputBuffer.decodeFloat()
      val diagY = inputBuffer.decodeFloat()
      val diagZ = inputBuffer.decodeFloat()
      val offdiagX = inputBuffer.decodeFloat()
      val offdiagY = inputBuffer.decodeFloat()
      val offdiagZ = inputBuffer.decodeFloat()
      val compassId = inputBuffer.decodeUint8()
      val calMask = inputBuffer.decodeUint8()
      val calStatus = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MagCalStatus.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val autosaved = inputBuffer.decodeUint8()
      val orientationConfidence = inputBuffer.decodeFloat()
      val oldOrientation = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavSensorOrientation.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val newOrientation = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavSensorOrientation.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val scaleFactor = inputBuffer.decodeFloat()

      MagCalReport(
        compassId = compassId,
        calMask = calMask,
        calStatus = calStatus,
        autosaved = autosaved,
        fitness = fitness,
        ofsX = ofsX,
        ofsY = ofsY,
        ofsZ = ofsZ,
        diagX = diagX,
        diagY = diagY,
        diagZ = diagZ,
        offdiagX = offdiagX,
        offdiagY = offdiagY,
        offdiagZ = offdiagZ,
        orientationConfidence = orientationConfidence,
        oldOrientation = oldOrientation,
        newOrientation = newOrientation,
        scaleFactor = scaleFactor,
      )
    }


    private val METADATA: MavMessage.Metadata<MagCalReport> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<MagCalReport> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var compassId: Int = 0

    public var calMask: Int = 0

    public var calStatus: MavEnumValue<MagCalStatus> = MavEnumValue.fromValue(0)

    public var autosaved: Int = 0

    public var fitness: Float = 0F

    public var ofsX: Float = 0F

    public var ofsY: Float = 0F

    public var ofsZ: Float = 0F

    public var diagX: Float = 0F

    public var diagY: Float = 0F

    public var diagZ: Float = 0F

    public var offdiagX: Float = 0F

    public var offdiagY: Float = 0F

    public var offdiagZ: Float = 0F

    public var orientationConfidence: Float = 0F

    public var oldOrientation: MavEnumValue<MavSensorOrientation> = MavEnumValue.fromValue(0)

    public var newOrientation: MavEnumValue<MavSensorOrientation> = MavEnumValue.fromValue(0)

    public var scaleFactor: Float = 0F

    public fun build(): MagCalReport = MagCalReport(
      compassId = compassId,
      calMask = calMask,
      calStatus = calStatus,
      autosaved = autosaved,
      fitness = fitness,
      ofsX = ofsX,
      ofsY = ofsY,
      ofsZ = ofsZ,
      diagX = diagX,
      diagY = diagY,
      diagZ = diagZ,
      offdiagX = offdiagX,
      offdiagY = offdiagY,
      offdiagZ = offdiagZ,
      orientationConfidence = orientationConfidence,
      oldOrientation = oldOrientation,
      newOrientation = newOrientation,
      scaleFactor = scaleFactor,
    )
  }
}
