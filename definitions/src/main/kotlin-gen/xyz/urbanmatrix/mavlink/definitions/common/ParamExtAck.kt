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
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeString
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Response from a PARAM_EXT_SET message.
 */
@GeneratedMavMessage(
  id = 324,
  crc = 132,
)
public data class ParamExtAck(
  /**
   * Parameter id, terminated by NULL if the length is less than 16 human-readable chars and WITHOUT
   * null termination (NULL) byte if the length is exactly 16 chars - applications have to provide 16+1
   * bytes storage if the ID is stored as string
   */
  @GeneratedMavField(type = "char[16]")
  public val paramId: String = "",
  /**
   * Parameter value (new value if PARAM_ACK_ACCEPTED, current value otherwise)
   */
  @GeneratedMavField(type = "char[128]")
  public val paramValue: String = "",
  /**
   * Parameter type.
   */
  @GeneratedMavField(type = "uint8_t")
  public val paramType: MavEnumValue<MavParamExtType> = MavEnumValue.fromValue(0),
  /**
   * Result code.
   */
  @GeneratedMavField(type = "uint8_t")
  public val paramResult: MavEnumValue<ParamAck> = MavEnumValue.fromValue(0),
) : MavMessage<ParamExtAck> {
  public override val instanceMetadata: MavMessage.Metadata<ParamExtAck> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeString(paramId, 16)
    outputBuffer.encodeString(paramValue, 128)
    outputBuffer.encodeEnumValue(paramType.value, 1)
    outputBuffer.encodeEnumValue(paramResult.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeString(paramId, 16)
    outputBuffer.encodeString(paramValue, 128)
    outputBuffer.encodeEnumValue(paramType.value, 1)
    outputBuffer.encodeEnumValue(paramResult.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 324

    private const val CRC: Int = 132

    private const val SIZE_V1: Int = 146

    private const val SIZE_V2: Int = 146

    private val DESERIALIZER: MavDeserializer<ParamExtAck> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val paramId = inputBuffer.decodeString(16)
      val paramValue = inputBuffer.decodeString(128)
      val paramType = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavParamExtType.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val paramResult = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = ParamAck.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      ParamExtAck(
        paramId = paramId,
        paramValue = paramValue,
        paramType = paramType,
        paramResult = paramResult,
      )
    }


    private val METADATA: MavMessage.Metadata<ParamExtAck> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<ParamExtAck> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var paramId: String = ""

    public var paramValue: String = ""

    public var paramType: MavEnumValue<MavParamExtType> = MavEnumValue.fromValue(0)

    public var paramResult: MavEnumValue<ParamAck> = MavEnumValue.fromValue(0)

    public fun build(): ParamExtAck = ParamExtAck(
      paramId = paramId,
      paramValue = paramValue,
      paramType = paramType,
      paramResult = paramResult,
    )
  }
}
