package xyz.urbanmatrix.mavlink.definitions.uavionix

import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import xyz.urbanmatrix.mavlink.api.GeneratedMavField
import xyz.urbanmatrix.mavlink.api.GeneratedMavMessage
import xyz.urbanmatrix.mavlink.api.MavDeserializer
import xyz.urbanmatrix.mavlink.api.MavEnumValue
import xyz.urbanmatrix.mavlink.api.MavMessage
import xyz.urbanmatrix.mavlink.serialization.decodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.decodeInt16
import xyz.urbanmatrix.mavlink.serialization.decodeInt32
import xyz.urbanmatrix.mavlink.serialization.decodeUint16
import xyz.urbanmatrix.mavlink.serialization.decodeUint32
import xyz.urbanmatrix.mavlink.serialization.decodeUint8
import xyz.urbanmatrix.mavlink.serialization.encodeEnumValue
import xyz.urbanmatrix.mavlink.serialization.encodeInt16
import xyz.urbanmatrix.mavlink.serialization.encodeInt32
import xyz.urbanmatrix.mavlink.serialization.encodeUint16
import xyz.urbanmatrix.mavlink.serialization.encodeUint32
import xyz.urbanmatrix.mavlink.serialization.encodeUint8
import xyz.urbanmatrix.mavlink.serialization.truncateZeros

/**
 * Dynamic data used to generate ADS-B out transponder data (send at 5Hz)
 */
@GeneratedMavMessage(
  id = 10002,
  crc = 186,
)
public data class UavionixAdsbOutDynamic(
  /**
   * UTC time in seconds since GPS epoch (Jan 6, 1980). If unknown set to UINT32_MAX
   */
  @GeneratedMavField(type = "uint32_t")
  public val utctime: Long = 0L,
  /**
   * Latitude WGS84 (deg * 1E7). If unknown set to INT32_MAX
   */
  @GeneratedMavField(type = "int32_t")
  public val gpslat: Int = 0,
  /**
   * Longitude WGS84 (deg * 1E7). If unknown set to INT32_MAX
   */
  @GeneratedMavField(type = "int32_t")
  public val gpslon: Int = 0,
  /**
   * Altitude (WGS84). UP +ve. If unknown set to INT32_MAX
   */
  @GeneratedMavField(type = "int32_t")
  public val gpsalt: Int = 0,
  /**
   * 0-1: no fix, 2: 2D fix, 3: 3D fix, 4: DGPS, 5: RTK
   */
  @GeneratedMavField(type = "uint8_t")
  public val gpsfix: MavEnumValue<UavionixAdsbOutDynamicGpsFix> = MavEnumValue.fromValue(0),
  /**
   * Number of satellites visible. If unknown set to UINT8_MAX
   */
  @GeneratedMavField(type = "uint8_t")
  public val numsats: Int = 0,
  /**
   * Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT bar
   * corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX
   */
  @GeneratedMavField(type = "int32_t")
  public val baroaltmsl: Int = 0,
  /**
   * Horizontal accuracy in mm (m * 1E-3). If unknown set to UINT32_MAX
   */
  @GeneratedMavField(type = "uint32_t")
  public val accuracyhor: Long = 0L,
  /**
   * Vertical accuracy in cm. If unknown set to UINT16_MAX
   */
  @GeneratedMavField(type = "uint16_t")
  public val accuracyvert: Int = 0,
  /**
   * Velocity accuracy in mm/s (m * 1E-3). If unknown set to UINT16_MAX
   */
  @GeneratedMavField(type = "uint16_t")
  public val accuracyvel: Int = 0,
  /**
   * GPS vertical speed in cm/s. If unknown set to INT16_MAX
   */
  @GeneratedMavField(type = "int16_t")
  public val velvert: Int = 0,
  /**
   * North-South velocity over ground in cm/s North +ve. If unknown set to INT16_MAX
   */
  @GeneratedMavField(type = "int16_t")
  public val velns: Int = 0,
  /**
   * East-West velocity over ground in cm/s East +ve. If unknown set to INT16_MAX
   */
  @GeneratedMavField(type = "int16_t")
  public val velew: Int = 0,
  /**
   * Emergency status
   */
  @GeneratedMavField(type = "uint8_t")
  public val emergencystatus: MavEnumValue<UavionixAdsbEmergencyStatus> = MavEnumValue.fromValue(0),
  /**
   * ADS-B transponder dynamic input state flags
   */
  @GeneratedMavField(type = "uint16_t")
  public val state: MavEnumValue<UavionixAdsbOutDynamicState> = MavEnumValue.fromValue(0),
  /**
   * Mode A code (typically 1200 [0x04B0] for VFR)
   */
  @GeneratedMavField(type = "uint16_t")
  public val squawk: Int = 0,
) : MavMessage<UavionixAdsbOutDynamic> {
  public override val instanceMetadata: MavMessage.Metadata<UavionixAdsbOutDynamic> = METADATA

  public override fun serializeV1(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V1).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(utctime)
    outputBuffer.encodeInt32(gpslat)
    outputBuffer.encodeInt32(gpslon)
    outputBuffer.encodeInt32(gpsalt)
    outputBuffer.encodeInt32(baroaltmsl)
    outputBuffer.encodeUint32(accuracyhor)
    outputBuffer.encodeUint16(accuracyvert)
    outputBuffer.encodeUint16(accuracyvel)
    outputBuffer.encodeInt16(velvert)
    outputBuffer.encodeInt16(velns)
    outputBuffer.encodeInt16(velew)
    outputBuffer.encodeEnumValue(state.value, 2)
    outputBuffer.encodeUint16(squawk)
    outputBuffer.encodeEnumValue(gpsfix.value, 1)
    outputBuffer.encodeUint8(numsats)
    outputBuffer.encodeEnumValue(emergencystatus.value, 1)
    return outputBuffer.array()
  }

  public override fun serializeV2(): ByteArray {
    val outputBuffer = ByteBuffer.allocate(SIZE_V2).order(ByteOrder.LITTLE_ENDIAN)
    outputBuffer.encodeUint32(utctime)
    outputBuffer.encodeInt32(gpslat)
    outputBuffer.encodeInt32(gpslon)
    outputBuffer.encodeInt32(gpsalt)
    outputBuffer.encodeInt32(baroaltmsl)
    outputBuffer.encodeUint32(accuracyhor)
    outputBuffer.encodeUint16(accuracyvert)
    outputBuffer.encodeUint16(accuracyvel)
    outputBuffer.encodeInt16(velvert)
    outputBuffer.encodeInt16(velns)
    outputBuffer.encodeInt16(velew)
    outputBuffer.encodeEnumValue(state.value, 2)
    outputBuffer.encodeUint16(squawk)
    outputBuffer.encodeEnumValue(gpsfix.value, 1)
    outputBuffer.encodeUint8(numsats)
    outputBuffer.encodeEnumValue(emergencystatus.value, 1)
    return outputBuffer.array().truncateZeros()
  }

  public companion object {
    private const val ID: Int = 10002

    private const val CRC: Int = 186

    private const val SIZE_V1: Int = 41

    private const val SIZE_V2: Int = 41

    private val DESERIALIZER: MavDeserializer<UavionixAdsbOutDynamic> = MavDeserializer { bytes ->
      val inputBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
      val utctime = inputBuffer.decodeUint32()
      val gpslat = inputBuffer.decodeInt32()
      val gpslon = inputBuffer.decodeInt32()
      val gpsalt = inputBuffer.decodeInt32()
      val baroaltmsl = inputBuffer.decodeInt32()
      val accuracyhor = inputBuffer.decodeUint32()
      val accuracyvert = inputBuffer.decodeUint16()
      val accuracyvel = inputBuffer.decodeUint16()
      val velvert = inputBuffer.decodeInt16()
      val velns = inputBuffer.decodeInt16()
      val velew = inputBuffer.decodeInt16()
      val state = inputBuffer.decodeEnumValue(2).let { value ->
        val entry = UavionixAdsbOutDynamicState.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val squawk = inputBuffer.decodeUint16()
      val gpsfix = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = UavionixAdsbOutDynamicGpsFix.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }
      val numsats = inputBuffer.decodeUint8()
      val emergencystatus = inputBuffer.decodeEnumValue(1).let { value ->
        val entry = UavionixAdsbEmergencyStatus.getEntryFromValueOrNull(value)
        if (entry != null) MavEnumValue.of(entry) else MavEnumValue.fromValue(value)
      }

      UavionixAdsbOutDynamic(
        utctime = utctime,
        gpslat = gpslat,
        gpslon = gpslon,
        gpsalt = gpsalt,
        gpsfix = gpsfix,
        numsats = numsats,
        baroaltmsl = baroaltmsl,
        accuracyhor = accuracyhor,
        accuracyvert = accuracyvert,
        accuracyvel = accuracyvel,
        velvert = velvert,
        velns = velns,
        velew = velew,
        emergencystatus = emergencystatus,
        state = state,
        squawk = squawk,
      )
    }


    private val METADATA: MavMessage.Metadata<UavionixAdsbOutDynamic> = MavMessage.Metadata(ID, CRC,
        DESERIALIZER)

    public val classMetadata: MavMessage.Metadata<UavionixAdsbOutDynamic> = METADATA

    public fun builder(builderAction: Builder.() -> Unit) = Builder().apply(builderAction).build()
  }

  public class Builder {
    public var utctime: Long = 0L

    public var gpslat: Int = 0

    public var gpslon: Int = 0

    public var gpsalt: Int = 0

    public var gpsfix: MavEnumValue<UavionixAdsbOutDynamicGpsFix> = MavEnumValue.fromValue(0)

    public var numsats: Int = 0

    public var baroaltmsl: Int = 0

    public var accuracyhor: Long = 0L

    public var accuracyvert: Int = 0

    public var accuracyvel: Int = 0

    public var velvert: Int = 0

    public var velns: Int = 0

    public var velew: Int = 0

    public var emergencystatus: MavEnumValue<UavionixAdsbEmergencyStatus> =
        MavEnumValue.fromValue(0)

    public var state: MavEnumValue<UavionixAdsbOutDynamicState> = MavEnumValue.fromValue(0)

    public var squawk: Int = 0

    public fun build(): UavionixAdsbOutDynamic = UavionixAdsbOutDynamic(
      utctime = utctime,
      gpslat = gpslat,
      gpslon = gpslon,
      gpsalt = gpsalt,
      gpsfix = gpsfix,
      numsats = numsats,
      baroaltmsl = baroaltmsl,
      accuracyhor = accuracyhor,
      accuracyvert = accuracyvert,
      accuracyvel = accuracyvel,
      velvert = velvert,
      velns = velns,
      velew = velew,
      emergencystatus = emergencystatus,
      state = state,
      squawk = squawk,
    )
  }
}
