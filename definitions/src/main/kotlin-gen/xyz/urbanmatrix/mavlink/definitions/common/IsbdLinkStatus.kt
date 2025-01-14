package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeUint16
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeUint16
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Status of the Iridium SBD link.
 */
@GeneratedMavMessage(
  id = 335,
  crc = 225,
)
public data class IsbdLinkStatus(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timestamp: BigInteger = BigInteger.ZERO,
  /**
   * Timestamp of the last successful sbd session. The receiving end can infer timestamp format
   * (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val lastHeartbeat: BigInteger = BigInteger.ZERO,
  /**
   * Number of failed SBD sessions.
   */
  @GeneratedMavField(type = "uint16_t")
  public val failedSessions: Int = 0,
  /**
   * Number of successful SBD sessions.
   */
  @GeneratedMavField(type = "uint16_t")
  public val successfulSessions: Int = 0,
  /**
   * Signal quality equal to the number of bars displayed on the ISU signal strength indicator.
   * Range is 0 to 5, where 0 indicates no signal and 5 indicates maximum signal strength.
   */
  @GeneratedMavField(type = "uint8_t")
  public val signalQuality: Int = 0,
  /**
   * 1: Ring call pending, 0: No call pending.
   */
  @GeneratedMavField(type = "uint8_t")
  public val ringPending: Int = 0,
  /**
   * 1: Transmission session pending, 0: No transmission session pending.
   */
  @GeneratedMavField(type = "uint8_t")
  public val txSessionPending: Int = 0,
  /**
   * 1: Receiving session pending, 0: No receiving session pending.
   */
  @GeneratedMavField(type = "uint8_t")
  public val rxSessionPending: Int = 0,
) : MavMessage<IsbdLinkStatus> {
  public override val instanceMetadata: MavMessage.Metadata<IsbdLinkStatus> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timestamp)
    outputBuffer.encodeUint64(lastHeartbeat)
    outputBuffer.encodeUint16(failedSessions)
    outputBuffer.encodeUint16(successfulSessions)
    outputBuffer.encodeUint8(signalQuality)
    outputBuffer.encodeUint8(ringPending)
    outputBuffer.encodeUint8(txSessionPending)
    outputBuffer.encodeUint8(rxSessionPending)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timestamp)
    outputBuffer.encodeUint64(lastHeartbeat)
    outputBuffer.encodeUint16(failedSessions)
    outputBuffer.encodeUint16(successfulSessions)
    outputBuffer.encodeUint8(signalQuality)
    outputBuffer.encodeUint8(ringPending)
    outputBuffer.encodeUint8(txSessionPending)
    outputBuffer.encodeUint8(rxSessionPending)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 335

    private const val CRC: Int = 225

    private const val SIZE_V1: Int = 24

    private const val SIZE_V2: Int = 24

    private val DESERIALIZER: MavDeserializer<IsbdLinkStatus> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timestamp = inputBuffer.decodeUint64()
      val lastHeartbeat = inputBuffer.decodeUint64()
      val failedSessions = inputBuffer.decodeUint16()
      val successfulSessions = inputBuffer.decodeUint16()
      val signalQuality = inputBuffer.decodeUint8()
      val ringPending = inputBuffer.decodeUint8()
      val txSessionPending = inputBuffer.decodeUint8()
      val rxSessionPending = inputBuffer.decodeUint8()

      IsbdLinkStatus(
        timestamp = timestamp,
        lastHeartbeat = lastHeartbeat,
        failedSessions = failedSessions,
        successfulSessions = successfulSessions,
        signalQuality = signalQuality,
        ringPending = ringPending,
        txSessionPending = txSessionPending,
        rxSessionPending = rxSessionPending,
      )
    }


    private val METADATA: MavMessage.Metadata<IsbdLinkStatus> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<IsbdLinkStatus> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timestamp: BigInteger = BigInteger.ZERO

    public var lastHeartbeat: BigInteger = BigInteger.ZERO

    public var failedSessions: Int = 0

    public var successfulSessions: Int = 0

    public var signalQuality: Int = 0

    public var ringPending: Int = 0

    public var txSessionPending: Int = 0

    public var rxSessionPending: Int = 0

    public fun build(): IsbdLinkStatus = IsbdLinkStatus(
      timestamp = timestamp,
      lastHeartbeat = lastHeartbeat,
      failedSessions = failedSessions,
      successfulSessions = successfulSessions,
      signalQuality = signalQuality,
      ringPending = ringPending,
      txSessionPending = txSessionPending,
      rxSessionPending = rxSessionPending,
    )
  }
}
