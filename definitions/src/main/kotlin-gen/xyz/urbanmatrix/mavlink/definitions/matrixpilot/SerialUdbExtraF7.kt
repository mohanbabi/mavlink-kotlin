package xyz.urbanmatrix.mavlink.definitions.matrixpilot

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Backwards compatible version of SERIAL_UDB_EXTRA F7: format
 */
@GeneratedMavMessage(
  id = 175,
  crc = 171,
)
public data class SerialUdbExtraF7(
  /**
   * Serial UDB YAWKP_RUDDER Gain for Proporional control of navigation
   */
  @GeneratedMavField(type = "float")
  public val sueYawkpRudder: Float = 0F,
  /**
   * Serial UDB YAWKD_RUDDER Gain for Rate control of navigation
   */
  @GeneratedMavField(type = "float")
  public val sueYawkdRudder: Float = 0F,
  /**
   * Serial UDB Extra ROLLKP_RUDDER Gain for Proportional control of roll stabilization
   */
  @GeneratedMavField(type = "float")
  public val sueRollkpRudder: Float = 0F,
  /**
   * Serial UDB Extra ROLLKD_RUDDER Gain for Rate control of roll stabilization
   */
  @GeneratedMavField(type = "float")
  public val sueRollkdRudder: Float = 0F,
  /**
   * SERIAL UDB EXTRA Rudder Boost Gain to Manual Control when stabilized
   */
  @GeneratedMavField(type = "float")
  public val sueRudderBoost: Float = 0F,
  /**
   * Serial UDB Extra Return To Landing - Angle to Pitch Plane Down
   */
  @GeneratedMavField(type = "float")
  public val sueRtlPitchDown: Float = 0F,
) : MavMessage<SerialUdbExtraF7> {
  public override val instanceMetadata: MavMessage.Metadata<SerialUdbExtraF7> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(sueYawkpRudder)
    outputBuffer.encodeFloat(sueYawkdRudder)
    outputBuffer.encodeFloat(sueRollkpRudder)
    outputBuffer.encodeFloat(sueRollkdRudder)
    outputBuffer.encodeFloat(sueRudderBoost)
    outputBuffer.encodeFloat(sueRtlPitchDown)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeFloat(sueYawkpRudder)
    outputBuffer.encodeFloat(sueYawkdRudder)
    outputBuffer.encodeFloat(sueRollkpRudder)
    outputBuffer.encodeFloat(sueRollkdRudder)
    outputBuffer.encodeFloat(sueRudderBoost)
    outputBuffer.encodeFloat(sueRtlPitchDown)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 175

    private const val CRC: Int = 171

    private const val SIZE_V1: Int = 24

    private const val SIZE_V2: Int = 24

    private val DESERIALIZER: MavDeserializer<SerialUdbExtraF7> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val sueYawkpRudder = inputBuffer.decodeFloat()
      val sueYawkdRudder = inputBuffer.decodeFloat()
      val sueRollkpRudder = inputBuffer.decodeFloat()
      val sueRollkdRudder = inputBuffer.decodeFloat()
      val sueRudderBoost = inputBuffer.decodeFloat()
      val sueRtlPitchDown = inputBuffer.decodeFloat()

      SerialUdbExtraF7(
        sueYawkpRudder = sueYawkpRudder,
        sueYawkdRudder = sueYawkdRudder,
        sueRollkpRudder = sueRollkpRudder,
        sueRollkdRudder = sueRollkdRudder,
        sueRudderBoost = sueRudderBoost,
        sueRtlPitchDown = sueRtlPitchDown,
      )
    }


    private val METADATA: MavMessage.Metadata<SerialUdbExtraF7> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<SerialUdbExtraF7> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var sueYawkpRudder: Float = 0F

    public var sueYawkdRudder: Float = 0F

    public var sueRollkpRudder: Float = 0F

    public var sueRollkdRudder: Float = 0F

    public var sueRudderBoost: Float = 0F

    public var sueRtlPitchDown: Float = 0F

    public fun build(): SerialUdbExtraF7 = SerialUdbExtraF7(
      sueYawkpRudder = sueYawkpRudder,
      sueYawkdRudder = sueYawkdRudder,
      sueRollkpRudder = sueRollkpRudder,
      sueRollkdRudder = sueRollkdRudder,
      sueRudderBoost = sueRudderBoost,
      sueRtlPitchDown = sueRtlPitchDown,
    )
  }
}
