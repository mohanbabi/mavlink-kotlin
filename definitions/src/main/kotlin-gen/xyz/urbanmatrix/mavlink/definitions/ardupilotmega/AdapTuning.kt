package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

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
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Adaptive Controller tuning information.
 */
@GeneratedMavMessage(
  id = 11010,
  crc = 46,
)
public data class AdapTuning(
  /**
   * Axis.
   */
  @GeneratedMavField(type = "uint8_t")
  public val axis: MavEnumValue<PidTuningAxis> = MavEnumValue.fromValue(0),
  /**
   * Desired rate.
   */
  @GeneratedMavField(type = "float")
  public val desired: Float = 0F,
  /**
   * Achieved rate.
   */
  @GeneratedMavField(type = "float")
  public val achieved: Float = 0F,
  /**
   * Error between model and vehicle.
   */
  @GeneratedMavField(type = "float")
  public val error: Float = 0F,
  /**
   * Theta estimated state predictor.
   */
  @GeneratedMavField(type = "float")
  public val theta: Float = 0F,
  /**
   * Omega estimated state predictor.
   */
  @GeneratedMavField(type = "float")
  public val omega: Float = 0F,
  /**
   * Sigma estimated state predictor.
   */
  @GeneratedMavField(type = "float")
  public val sigma: Float = 0F,
  /**
   * Theta derivative.
   */
  @GeneratedMavField(type = "float")
  public val thetaDot: Float = 0F,
  /**
   * Omega derivative.
   */
  @GeneratedMavField(type = "float")
  public val omegaDot: Float = 0F,
  /**
   * Sigma derivative.
   */
  @GeneratedMavField(type = "float")
  public val sigmaDot: Float = 0F,
  /**
   * Projection operator value.
   */
  @GeneratedMavField(type = "float")
  public val f: Float = 0F,
  /**
   * Projection operator derivative.
   */
  @GeneratedMavField(type = "float")
  public val fDot: Float = 0F,
  /**
   * u adaptive controlled output command.
   */
  @GeneratedMavField(type = "float")
  public val u: Float = 0F,
) : MavMessage<AdapTuning> {
  public override val instanceMetadata: MavMessage.Metadata<AdapTuning> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(desired)
    outputBuffer.encodeFloat(achieved)
    outputBuffer.encodeFloat(error)
    outputBuffer.encodeFloat(theta)
    outputBuffer.encodeFloat(omega)
    outputBuffer.encodeFloat(sigma)
    outputBuffer.encodeFloat(thetaDot)
    outputBuffer.encodeFloat(omegaDot)
    outputBuffer.encodeFloat(sigmaDot)
    outputBuffer.encodeFloat(f)
    outputBuffer.encodeFloat(fDot)
    outputBuffer.encodeFloat(u)
    outputBuffer.encodeEnumValue(axis.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(desired)
    outputBuffer.encodeFloat(achieved)
    outputBuffer.encodeFloat(error)
    outputBuffer.encodeFloat(theta)
    outputBuffer.encodeFloat(omega)
    outputBuffer.encodeFloat(sigma)
    outputBuffer.encodeFloat(thetaDot)
    outputBuffer.encodeFloat(omegaDot)
    outputBuffer.encodeFloat(sigmaDot)
    outputBuffer.encodeFloat(f)
    outputBuffer.encodeFloat(fDot)
    outputBuffer.encodeFloat(u)
    outputBuffer.encodeEnumValue(axis.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 11010

    private const val CRC: Int = 46

    private const val SIZE_V1: Int = 49

    private const val SIZE_V2: Int = 49

    private val DESERIALIZER: MavDeserializer<AdapTuning> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val desired = inputBuffer.decodeFloat()
      val achieved = inputBuffer.decodeFloat()
      val error = inputBuffer.decodeFloat()
      val theta = inputBuffer.decodeFloat()
      val omega = inputBuffer.decodeFloat()
      val sigma = inputBuffer.decodeFloat()
      val thetaDot = inputBuffer.decodeFloat()
      val omegaDot = inputBuffer.decodeFloat()
      val sigmaDot = inputBuffer.decodeFloat()
      val f = inputBuffer.decodeFloat()
      val fDot = inputBuffer.decodeFloat()
      val u = inputBuffer.decodeFloat()
      val axis = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = PidTuningAxis.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      AdapTuning(
        axis = axis,
        desired = desired,
        achieved = achieved,
        error = error,
        theta = theta,
        omega = omega,
        sigma = sigma,
        thetaDot = thetaDot,
        omegaDot = omegaDot,
        sigmaDot = sigmaDot,
        f = f,
        fDot = fDot,
        u = u,
      )
    }


    private val METADATA: MavMessage.Metadata<AdapTuning> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<AdapTuning> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var axis: MavEnumValue<PidTuningAxis> = MavEnumValue.fromValue(0)

    public var desired: Float = 0F

    public var achieved: Float = 0F

    public var error: Float = 0F

    public var theta: Float = 0F

    public var omega: Float = 0F

    public var sigma: Float = 0F

    public var thetaDot: Float = 0F

    public var omegaDot: Float = 0F

    public var sigmaDot: Float = 0F

    public var f: Float = 0F

    public var fDot: Float = 0F

    public var u: Float = 0F

    public fun build(): AdapTuning = AdapTuning(
      axis = axis,
      desired = desired,
      achieved = achieved,
      error = error,
      theta = theta,
      omega = omega,
      sigma = sigma,
      thetaDot = thetaDot,
      omegaDot = omegaDot,
      sigmaDot = sigmaDot,
      f = f,
      fDot = fDot,
      u = u,
    )
  }
}
