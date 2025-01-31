package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
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
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Estimator status message including flags, innovation test ratios and estimated accuracies. The
 * flags message is an integer bitmask containing information on which EKF outputs are valid. See the
 * ESTIMATOR_STATUS_FLAGS enum definition for further information. The innovation test ratios show the
 * magnitude of the sensor innovation divided by the innovation check threshold. Under normal operation
 * the innovation test ratios should be below 0.5 with occasional values up to 1.0. Values greater than
 * 1.0 should be rare under normal operation and indicate that a measurement has been rejected by the
 * filter. The user should be notified if an innovation test ratio greater than 1.0 is recorded.
 * Notifications for values in the range between 0.5 and 1.0 should be optional and controllable by the
 * user.
 */
@GeneratedMavMessage(
  id = 230,
  crc = 163,
)
public data class EstimatorStatus(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Bitmap indicating which EKF outputs are valid.
   */
  @GeneratedMavField(type = "uint16_t")
  public val flags: MavEnumValue<EstimatorStatusFlags> = MavEnumValue.fromValue(0),
  /**
   * Velocity innovation test ratio
   */
  @GeneratedMavField(type = "float")
  public val velRatio: Float = 0F,
  /**
   * Horizontal position innovation test ratio
   */
  @GeneratedMavField(type = "float")
  public val posHorizRatio: Float = 0F,
  /**
   * Vertical position innovation test ratio
   */
  @GeneratedMavField(type = "float")
  public val posVertRatio: Float = 0F,
  /**
   * Magnetometer innovation test ratio
   */
  @GeneratedMavField(type = "float")
  public val magRatio: Float = 0F,
  /**
   * Height above terrain innovation test ratio
   */
  @GeneratedMavField(type = "float")
  public val haglRatio: Float = 0F,
  /**
   * True airspeed innovation test ratio
   */
  @GeneratedMavField(type = "float")
  public val tasRatio: Float = 0F,
  /**
   * Horizontal position 1-STD accuracy relative to the EKF local origin
   */
  @GeneratedMavField(type = "float")
  public val posHorizAccuracy: Float = 0F,
  /**
   * Vertical position 1-STD accuracy relative to the EKF local origin
   */
  @GeneratedMavField(type = "float")
  public val posVertAccuracy: Float = 0F,
) : MavMessage<EstimatorStatus> {
  public override val instanceMetadata: MavMessage.Metadata<EstimatorStatus> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloat(velRatio)
    outputBuffer.encodeFloat(posHorizRatio)
    outputBuffer.encodeFloat(posVertRatio)
    outputBuffer.encodeFloat(magRatio)
    outputBuffer.encodeFloat(haglRatio)
    outputBuffer.encodeFloat(tasRatio)
    outputBuffer.encodeFloat(posHorizAccuracy)
    outputBuffer.encodeFloat(posVertAccuracy)
    outputBuffer.encodeEnumValue(flags.value, 2)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloat(velRatio)
    outputBuffer.encodeFloat(posHorizRatio)
    outputBuffer.encodeFloat(posVertRatio)
    outputBuffer.encodeFloat(magRatio)
    outputBuffer.encodeFloat(haglRatio)
    outputBuffer.encodeFloat(tasRatio)
    outputBuffer.encodeFloat(posHorizAccuracy)
    outputBuffer.encodeFloat(posVertAccuracy)
    outputBuffer.encodeEnumValue(flags.value, 2)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 230

    private const val CRC: Int = 163

    private const val SIZE_V1: Int = 42

    private const val SIZE_V2: Int = 42

    private val DESERIALIZER: MavDeserializer<EstimatorStatus> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val velRatio = inputBuffer.decodeFloat()
      val posHorizRatio = inputBuffer.decodeFloat()
      val posVertRatio = inputBuffer.decodeFloat()
      val magRatio = inputBuffer.decodeFloat()
      val haglRatio = inputBuffer.decodeFloat()
      val tasRatio = inputBuffer.decodeFloat()
      val posHorizAccuracy = inputBuffer.decodeFloat()
      val posVertAccuracy = inputBuffer.decodeFloat()
      val flags = inputBuffer.decodeEnumValue(2).let { value ->
        val entry = EstimatorStatusFlags.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      EstimatorStatus(
        timeUsec = timeUsec,
        flags = flags,
        velRatio = velRatio,
        posHorizRatio = posHorizRatio,
        posVertRatio = posVertRatio,
        magRatio = magRatio,
        haglRatio = haglRatio,
        tasRatio = tasRatio,
        posHorizAccuracy = posHorizAccuracy,
        posVertAccuracy = posVertAccuracy,
      )
    }


    private val METADATA: MavMessage.Metadata<EstimatorStatus> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<EstimatorStatus> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeUsec: BigInteger = BigInteger.ZERO

    public var flags: MavEnumValue<EstimatorStatusFlags> = MavEnumValue.fromValue(0)

    public var velRatio: Float = 0F

    public var posHorizRatio: Float = 0F

    public var posVertRatio: Float = 0F

    public var magRatio: Float = 0F

    public var haglRatio: Float = 0F

    public var tasRatio: Float = 0F

    public var posHorizAccuracy: Float = 0F

    public var posVertAccuracy: Float = 0F

    public fun build(): EstimatorStatus = EstimatorStatus(
      timeUsec = timeUsec,
      flags = flags,
      velRatio = velRatio,
      posHorizRatio = posHorizRatio,
      posVertRatio = posVertRatio,
      magRatio = magRatio,
      haglRatio = haglRatio,
      tasRatio = tasRatio,
      posHorizAccuracy = posHorizAccuracy,
      posVertAccuracy = posVertAccuracy,
    )
  }
}
