package xyz.urbanmatrix.mavlink.definitions.icarous

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * ICAROUS heartbeat
 */
@GeneratedMavMessage(
  id = 42000,
  crc = 227,
)
public data class IcarousHeartbeat(
  /**
   * See the FMS_STATE enum.
   */
  @GeneratedMavField(type = "uint8_t")
  public val status: MavEnumValue<IcarousFmsState> = MavEnumValue.fromValue(0),
) : MavMessage<IcarousHeartbeat> {
  public override val instanceMetadata: MavMessage.Metadata<IcarousHeartbeat> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeEnumValue(status.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeEnumValue(status.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 42000

    private const val CRC: Int = 227

    private const val SIZE_V1: Int = 1

    private const val SIZE_V2: Int = 1

    private val DESERIALIZER: MavDeserializer<IcarousHeartbeat> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val status = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = IcarousFmsState.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      IcarousHeartbeat(
        status = status,
      )
    }


    private val METADATA: MavMessage.Metadata<IcarousHeartbeat> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<IcarousHeartbeat> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var status: MavEnumValue<IcarousFmsState> = MavEnumValue.fromValue(0)

    public fun build(): IcarousHeartbeat = IcarousHeartbeat(
      status = status,
    )
  }
}
