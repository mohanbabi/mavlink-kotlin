package xyz.urbanmatrix.mavlink.definitions.ardupilotmega

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeString
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.decodeUint8Array
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeString
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeUint8Array
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Write registers for a device.
 */
@GeneratedMavMessage(
  id = 11002,
  crc = 234,
)
public data class DeviceOpWrite(
  /**
   * System ID.
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetSystem: Int = 0,
  /**
   * Component ID.
   */
  @GeneratedMavField(type = "uint8_t")
  public val targetComponent: Int = 0,
  /**
   * Request ID - copied to reply.
   */
  @GeneratedMavField(type = "uint32_t")
  public val requestId: Long = 0L,
  /**
   * The bus type.
   */
  @GeneratedMavField(type = "uint8_t")
  public val bustype: MavEnumValue<DeviceOpBustype> = MavEnumValue.fromValue(0),
  /**
   * Bus number.
   */
  @GeneratedMavField(type = "uint8_t")
  public val bus: Int = 0,
  /**
   * Bus address.
   */
  @GeneratedMavField(type = "uint8_t")
  public val address: Int = 0,
  /**
   * Name of device on bus (for SPI).
   */
  @GeneratedMavField(type = "char[40]")
  public val busname: String = "",
  /**
   * First register to write.
   */
  @GeneratedMavField(type = "uint8_t")
  public val regstart: Int = 0,
  /**
   * Count of registers to write.
   */
  @GeneratedMavField(type = "uint8_t")
  public val count: Int = 0,
  /**
   * Write data.
   */
  @GeneratedMavField(type = "uint8_t[128]")
  public val `data`: List<Int> = emptyList(),
  /**
   * Bank number.
   */
  @GeneratedMavField(
    type = "uint8_t",
    extension = true,
  )
  public val bank: Int = 0,
) : MavMessage<DeviceOpWrite> {
  public override val instanceMetadata: MavMessage.Metadata<DeviceOpWrite> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(requestId)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeEnumValue(bustype.value, 1)
    outputBuffer.encodeUint8(bus)
    outputBuffer.encodeUint8(address)
    outputBuffer.encodeString(busname, 40)
    outputBuffer.encodeUint8(regstart)
    outputBuffer.encodeUint8(count)
    outputBuffer.encodeUint8Array(data, 128)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(requestId)
    outputBuffer.encodeUint8(targetSystem)
    outputBuffer.encodeUint8(targetComponent)
    outputBuffer.encodeEnumValue(bustype.value, 1)
    outputBuffer.encodeUint8(bus)
    outputBuffer.encodeUint8(address)
    outputBuffer.encodeString(busname, 40)
    outputBuffer.encodeUint8(regstart)
    outputBuffer.encodeUint8(count)
    outputBuffer.encodeUint8Array(data, 128)
    outputBuffer.encodeUint8(bank)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 11002

    private const val CRC: Int = 234

    private const val SIZE_V1: Int = 179

    private const val SIZE_V2: Int = 180

    private val DESERIALIZER: MavDeserializer<DeviceOpWrite> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val requestId = inputBuffer.decodeUint32()
      val targetSystem = inputBuffer.decodeUint8()
      val targetComponent = inputBuffer.decodeUint8()
      val bustype = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = DeviceOpBustype.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val bus = inputBuffer.decodeUint8()
      val address = inputBuffer.decodeUint8()
      val busname = inputBuffer.decodeString(40)
      val regstart = inputBuffer.decodeUint8()
      val count = inputBuffer.decodeUint8()
      val data = inputBuffer.decodeUint8Array(128)
      val bank = inputBuffer.decodeUint8()

      DeviceOpWrite(
        targetSystem = targetSystem,
        targetComponent = targetComponent,
        requestId = requestId,
        bustype = bustype,
        bus = bus,
        address = address,
        busname = busname,
        regstart = regstart,
        count = count,
        data = data,
        bank = bank,
      )
    }


    private val METADATA: MavMessage.Metadata<DeviceOpWrite> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<DeviceOpWrite> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var targetSystem: Int = 0

    public var targetComponent: Int = 0

    public var requestId: Long = 0L

    public var bustype: MavEnumValue<DeviceOpBustype> = MavEnumValue.fromValue(0)

    public var bus: Int = 0

    public var address: Int = 0

    public var busname: String = ""

    public var regstart: Int = 0

    public var count: Int = 0

    public var `data`: List<Int> = emptyList()

    public var bank: Int = 0

    public fun build(): DeviceOpWrite = DeviceOpWrite(
      targetSystem = targetSystem,
      targetComponent = targetComponent,
      requestId = requestId,
      bustype = bustype,
      bus = bus,
      address = address,
      busname = busname,
      regstart = regstart,
      count = count,
      data = data,
      bank = bank,
    )
  }
}
