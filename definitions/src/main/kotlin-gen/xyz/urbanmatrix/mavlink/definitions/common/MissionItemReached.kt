package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeUint16
import xyz.urbanmatrix.mavlink.serialization.encodeUint16

/**
 * A certain mission item has been reached. The system will either hold this position (or circle on
 * the orbit) or (if the autocontinue on the WP was set) continue to the next waypoint.
 */
@GeneratedMavMessage(
  id = 46,
  crc = 11,
)
public data class MissionItemReached(
  /**
   * Sequence
   */
  public val seq: Int = 0,
) : MavMessage<MissionItemReached> {
  public override val instanceMetadata: MavMessage.Metadata<MissionItemReached> = METADATA

  public override fun serialize(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint16(seq)
    return outputBuffer.array()
  }

  public companion object {
    private const val ID: Int = 46

    private const val CRC: Int = 11

    private const val SIZE: Int = 2

    private val DESERIALIZER: MavDeserializer<MissionItemReached> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val seq = inputBuffer.decodeUint16()

      MissionItemReached(
        seq = seq,
      )
    }


    private val METADATA: MavMessage.Metadata<MissionItemReached> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<MissionItemReached> = METADATA
  }
}