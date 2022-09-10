package xyz.urbanmatrix.mavlink.definitions.common

import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeFloatArray
import xyz.urbanmatrix.mavlink.serialization.decodeUint64
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeFloatArray
import xyz.urbanmatrix.mavlink.serialization.encodeUint64
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Set the vehicle attitude and body angular rates.
 */
@GeneratedMavMessage(
  id = 139,
  crc = 168,
)
public data class SetActuatorControlTarget(
  /**
   * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp
   * format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
   */
  @GeneratedMavField(type = "uint64_t")
  public val timeUsec: BigInteger = BigInteger.ZERO,
  /**
   * Actuator group. The "_mlx" indicates this is a multi-instance message and a MAVLink parser
   * should use this field to difference between instances.
   */
  @GeneratedMavField(type = "uint8_t")
  public val groupMlx: Int = 0,
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
   * Actuator controls. Normed to -1..+1 where 0 is neutral position. Throttle for single rotation
   * direction motors is 0..1, negative range for reverse direction. Standard mapping for attitude
   * controls (group 0): (index 0-7): roll, pitch, yaw, throttle, flaps, spoilers, airbrakes, landing
   * gear. Load a pass-through mixer to repurpose them as generic outputs.
   */
  @GeneratedMavField(type = "float[8]")
  public val controls: List<Float> = emptyList(),
) : MavMessage<SetActuatorControlTarget> {
  public override val instanceMetadata: MavMessage.Metadata<SetActuatorControlTarget> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloatArray(controls, 32)
    outputBuffer.encodeUint8(groupMlx)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint64(timeUsec)
    outputBuffer.encodeFloatArray(controls, 32)
    outputBuffer.encodeUint8(groupMlx)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 139

    private const val CRC: Int = 168

    private const val SIZE: Int = 43

    private val DESERIALIZER: MavDeserializer<SetActuatorControlTarget> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val timeUsec = inputBuffer.decodeUint64()
      val controls = inputBuffer.decodeFloatArray(32)
      val groupMlx = inputBuffer.decodeUint8()
      val targetSystem = inputBuffer.decodeUint8()
      val targetComponent = inputBuffer.decodeUint8()

      SetActuatorControlTarget(
        timeUsec = timeUsec,
        groupMlx = groupMlx,
        targetSystem = targetSystem,
        targetComponent = targetComponent,
        controls = controls,
      )
    }


    private val METADATA: MavMessage.Metadata<SetActuatorControlTarget> = MavMessage.Metadata(ID,
        CRC, DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<SetActuatorControlTarget> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var timeUsec: BigInteger = BigInteger.ZERO

    public var groupMlx: Int = 0

    public var targetSystem: Int = 0

    public var targetComponent: Int = 0

    public var controls: List<Float> = emptyList()

    public fun build(): SetActuatorControlTarget = SetActuatorControlTarget(
      timeUsec = timeUsec,
      groupMlx = groupMlx,
      targetSystem = targetSystem,
      targetComponent = targetComponent,
      controls = controls,
    )
  }
}
