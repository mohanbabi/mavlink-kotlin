package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Request all parameters of this component. After this request, all parameters are emitted. The
 * parameter microservice is documented at https://mavlink.io/en/services/parameter.html
 */
@GeneratedMavMessage(
  id = 21,
  crc = 159,
)
public data class ParamRequestList(
  /**
   * System ID
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetSystem: Int = 0,
  /**
   * Component ID
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetComponent: Int = 0,
) : MavMessage<ParamRequestList> {
  public override val instanceMetadata: MavMessage.Metadata<ParamRequestList> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 21

    private const val CRC: Int = 159

    private const val SIZE_V1: Int = 2

    private const val SIZE_V2: Int = 2

    private val DESERIALIZER: MavDeserializer<ParamRequestList> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val targetSystem = inputBuffer.decodeUint8()
      val targetComponent = inputBuffer.decodeUint8()

      ParamRequestList(
        targetSystem = targetSystem,
        targetComponent = targetComponent,
      )
    }


    private val METADATA: MavMessage.Metadata<ParamRequestList> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<ParamRequestList> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var targetSystem: Int = 0

    public var targetComponent: Int = 0

    public fun build(): ParamRequestList = ParamRequestList(
      targetSystem = targetSystem,
      targetComponent = targetComponent,
    )
  }
}
