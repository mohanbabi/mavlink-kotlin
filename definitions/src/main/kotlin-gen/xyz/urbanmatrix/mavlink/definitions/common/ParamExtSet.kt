package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.String
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeString
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeString
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Set a parameter value. In order to deal with message loss (and retransmission of PARAM_EXT_SET),
 * when setting a parameter value and the new value is the same as the current value, you will
 * immediately get a PARAM_ACK_ACCEPTED response. If the current state is PARAM_ACK_IN_PROGRESS, you
 * will accordingly receive a PARAM_ACK_IN_PROGRESS in response.
 */
@GeneratedMavMessage(
  id = 323,
  crc = 78,
)
public data class ParamExtSet(
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
  /**
   * Parameter id, terminated by NULL if the length is less than 16 human-readable chars and WITHOUT
   * null termination (NULL) byte if the length is exactly 16 chars - applications have to provide 16+1
   * bytes storage if the ID is stored as string
   */
  @GeneratedMavField(type = "char[16]")
  public val paramId: String = "",
  /**
   * Parameter value
   */
  @GeneratedMavField(type = "char[128]")
  public val paramValue: String = "",
  /**
   * Parameter type.
   */
  @GeneratedMavField(type = "uint8_t")
  public val paramType: MavEnumValue<MavParamExtType> = MavEnumValue.fromValue(0),
) : MavMessage<ParamExtSet> {
  public override val instanceMetadata: MavMessage.Metadata<ParamExtSet> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeString(paramId, 16)
    outputBuffer.encodeString(paramValue, 128)
    outputBuffer.encodeEnumValue(paramType.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeString(paramId, 16)
    outputBuffer.encodeString(paramValue, 128)
    outputBuffer.encodeEnumValue(paramType.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 323

    private const val CRC: Int = 78

    private const val SIZE_V1: Int = 147

    private const val SIZE_V2: Int = 147

    private val DESERIALIZER: MavDeserializer<ParamExtSet> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val targetSystem = inputBuffer.decodeUint8()
      val targetComponent = inputBuffer.decodeUint8()
      val paramId = inputBuffer.decodeString(16)
      val paramValue = inputBuffer.decodeString(128)
      val paramType = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavParamExtType.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      ParamExtSet(
        targetSystem = targetSystem,
        targetComponent = targetComponent,
        paramId = paramId,
        paramValue = paramValue,
        paramType = paramType,
      )
    }


    private val METADATA: MavMessage.Metadata<ParamExtSet> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<ParamExtSet> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var targetSystem: Int = 0

    public var targetComponent: Int = 0

    public var paramId: String = ""

    public var paramValue: String = ""

    public var paramType: MavEnumValue<MavParamExtType> = MavEnumValue.fromValue(0)

    public fun build(): ParamExtSet = ParamExtSet(
      targetSystem = targetSystem,
      targetComponent = targetComponent,
      paramId = paramId,
      paramValue = paramValue,
      paramType = paramType,
    )
  }
}
