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
import xyz.urbanmatrix.mavlink.serialization.decodeUint16
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeString
import xyz.urbanmatrix.mavlink.serialization.encodeUint16
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Emit the value of a parameter. The inclusion of param_count and param_index in the message allows
 * the recipient to keep track of received parameters and allows them to re-request missing parameters
 * after a loss or timeout.
 */
@GeneratedMavMessage(
  id = 322,
  crc = 243,
)
public data class ParamExtValue(
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
  /**
   * Total number of parameters
   */
  @GeneratedMavField(type = "uint16_t")
  public val paramCount: Int = 0,
  /**
   * Index of this parameter
   */
  @GeneratedMavField(type = "uint16_t")
  public val paramIndex: Int = 0,
) : MavMessage<ParamExtValue> {
  public override val instanceMetadata: MavMessage.Metadata<ParamExtValue> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint16(paramCount)
    outputBuffer.encodeUint16(paramIndex)
    outputBuffer.encodeString(paramId, 16)
    outputBuffer.encodeString(paramValue, 128)
    outputBuffer.encodeEnumValue(paramType.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint16(paramCount)
    outputBuffer.encodeUint16(paramIndex)
    outputBuffer.encodeString(paramId, 16)
    outputBuffer.encodeString(paramValue, 128)
    outputBuffer.encodeEnumValue(paramType.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 322

    private const val CRC: Int = 243

    private const val SIZE_V1: Int = 149

    private const val SIZE_V2: Int = 149

    private val DESERIALIZER: MavDeserializer<ParamExtValue> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val paramCount = inputBuffer.decodeUint16()
      val paramIndex = inputBuffer.decodeUint16()
      val paramId = inputBuffer.decodeString(16)
      val paramValue = inputBuffer.decodeString(128)
      val paramType = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavParamExtType.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      ParamExtValue(
        paramId = paramId,
        paramValue = paramValue,
        paramType = paramType,
        paramCount = paramCount,
        paramIndex = paramIndex,
      )
    }


    private val METADATA: MavMessage.Metadata<ParamExtValue> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<ParamExtValue> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var paramId: String = ""

    public var paramValue: String = ""

    public var paramType: MavEnumValue<MavParamExtType> = MavEnumValue.fromValue(0)

    public var paramCount: Int = 0

    public var paramIndex: Int = 0

    public fun build(): ParamExtValue = ParamExtValue(
      paramId = paramId,
      paramValue = paramValue,
      paramType = paramType,
      paramCount = paramCount,
      paramIndex = paramIndex,
    )
  }
}
