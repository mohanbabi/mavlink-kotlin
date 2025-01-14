package xyz.urbanmatrix.mavlink.definitions.common

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeFloat
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeFloat
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Information about a potential collision
 */
@GeneratedMavMessage(
  id = 247,
  crc = 81,
)
public data class Collision(
  /**
   * Collision data source
   */
  @GeneratedMavField(type = "uint8_t")
  public val src: MavEnumValue<MavCollisionSrc> = MavEnumValue.fromValue(0),
  /**
   * Unique identifier, domain based on src field
   */
  @GeneratedMavField(type = "uint32_t")
  public val id: Long = 0L,
  /**
   * Action that is being taken to avoid this collision
   */
  @GeneratedMavField(type = "uint8_t")
  public val action: MavEnumValue<MavCollisionAction> = MavEnumValue.fromValue(0),
  /**
   * How concerned the aircraft is about this collision
   */
  @GeneratedMavField(type = "uint8_t")
  public val threatLevel: MavEnumValue<MavCollisionThreatLevel> = MavEnumValue.fromValue(0),
  /**
   * Estimated time until collision occurs
   */
  @GeneratedMavField(type = "float")
  public val timeToMinimumDelta: Float = 0F,
  /**
   * Closest vertical distance between vehicle and object
   */
  @GeneratedMavField(type = "float")
  public val altitudeMinimumDelta: Float = 0F,
  /**
   * Closest horizontal distance between vehicle and object
   */
  @GeneratedMavField(type = "float")
  public val horizontalMinimumDelta: Float = 0F,
) : MavMessage<Collision> {
  public override val instanceMetadata: MavMessage.Metadata<Collision> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(id)
    outputBuffer.encodeFloat(timeToMinimumDelta)
    outputBuffer.encodeFloat(altitudeMinimumDelta)
    outputBuffer.encodeFloat(horizontalMinimumDelta)
    outputBuffer.encodeEnumValue(src.value, 1)
    outputBuffer.encodeEnumValue(action.value, 1)
    outputBuffer.encodeEnumValue(threatLevel.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(id)
    outputBuffer.encodeFloat(timeToMinimumDelta)
    outputBuffer.encodeFloat(altitudeMinimumDelta)
    outputBuffer.encodeFloat(horizontalMinimumDelta)
    outputBuffer.encodeEnumValue(src.value, 1)
    outputBuffer.encodeEnumValue(action.value, 1)
    outputBuffer.encodeEnumValue(threatLevel.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 247

    private const val CRC: Int = 81

    private const val SIZE_V1: Int = 19

    private const val SIZE_V2: Int = 19

    private val DESERIALIZER: MavDeserializer<Collision> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val id = inputBuffer.decodeUint32()
      val timeToMinimumDelta = inputBuffer.decodeFloat()
      val altitudeMinimumDelta = inputBuffer.decodeFloat()
      val horizontalMinimumDelta = inputBuffer.decodeFloat()
      val src = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavCollisionSrc.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val action = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavCollisionAction.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val threatLevel = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = MavCollisionThreatLevel.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      Collision(
        src = src,
        id = id,
        action = action,
        threatLevel = threatLevel,
        timeToMinimumDelta = timeToMinimumDelta,
        altitudeMinimumDelta = altitudeMinimumDelta,
        horizontalMinimumDelta = horizontalMinimumDelta,
      )
    }


    private val METADATA: MavMessage.Metadata<Collision> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<Collision> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var src: MavEnumValue<MavCollisionSrc> = MavEnumValue.fromValue(0)

    public var id: Long = 0L

    public var action: MavEnumValue<MavCollisionAction> = MavEnumValue.fromValue(0)

    public var threatLevel: MavEnumValue<MavCollisionThreatLevel> = MavEnumValue.fromValue(0)

    public var timeToMinimumDelta: Float = 0F

    public var altitudeMinimumDelta: Float = 0F

    public var horizontalMinimumDelta: Float = 0F

    public fun build(): Collision = Collision(
      src = src,
      id = id,
      action = action,
      threatLevel = threatLevel,
      timeToMinimumDelta = timeToMinimumDelta,
      altitudeMinimumDelta = altitudeMinimumDelta,
      horizontalMinimumDelta = horizontalMinimumDelta,
    )
  }
}
