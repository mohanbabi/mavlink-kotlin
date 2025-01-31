package xyz.urbanmatrix.mavlink.definitions.common

import kotlin.Long
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnumEntry
import xyz.urbanmatrix.mavlink.api.MavEnum

/**
 * Type of AIS vessel, enum duplicated from AIS standard, https://gpsd.gitlab.io/gpsd/AIVDM.html
 */
@GeneratedMavEnum
public enum class AisType(
  public override val `value`: Long,
) : MavEnum {
  /**
   * Not available (default).
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_UNKNOWN(0L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_1(1L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_2(2L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_3(3L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_4(4L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_5(5L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_6(6L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_7(7L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_8(8L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_9(9L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_10(10L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_11(11L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_12(12L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_13(13L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_14(14L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_15(15L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_16(16L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_17(17L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_18(18L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_19(19L),
  /**
   * Wing In Ground effect.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG(20L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_HAZARDOUS_A(21L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_HAZARDOUS_B(22L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_HAZARDOUS_C(23L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_HAZARDOUS_D(24L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_RESERVED_1(25L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_RESERVED_2(26L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_RESERVED_3(27L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_RESERVED_4(28L),
  @GeneratedMavEnumEntry
  AIS_TYPE_WIG_RESERVED_5(29L),
  @GeneratedMavEnumEntry
  AIS_TYPE_FISHING(30L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TOWING(31L),
  /**
   * Towing: length exceeds 200m or breadth exceeds 25m.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_TOWING_LARGE(32L),
  /**
   * Dredging or other underwater ops.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_DREDGING(33L),
  @GeneratedMavEnumEntry
  AIS_TYPE_DIVING(34L),
  @GeneratedMavEnumEntry
  AIS_TYPE_MILITARY(35L),
  @GeneratedMavEnumEntry
  AIS_TYPE_SAILING(36L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PLEASURE(37L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_20(38L),
  @GeneratedMavEnumEntry
  AIS_TYPE_RESERVED_21(39L),
  /**
   * High Speed Craft.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC(40L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_HAZARDOUS_A(41L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_HAZARDOUS_B(42L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_HAZARDOUS_C(43L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_HAZARDOUS_D(44L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_RESERVED_1(45L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_RESERVED_2(46L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_RESERVED_3(47L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_RESERVED_4(48L),
  @GeneratedMavEnumEntry
  AIS_TYPE_HSC_UNKNOWN(49L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PILOT(50L),
  /**
   * Search And Rescue vessel.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_SAR(51L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TUG(52L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PORT_TENDER(53L),
  /**
   * Anti-pollution equipment.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_ANTI_POLLUTION(54L),
  @GeneratedMavEnumEntry
  AIS_TYPE_LAW_ENFORCEMENT(55L),
  @GeneratedMavEnumEntry
  AIS_TYPE_SPARE_LOCAL_1(56L),
  @GeneratedMavEnumEntry
  AIS_TYPE_SPARE_LOCAL_2(57L),
  @GeneratedMavEnumEntry
  AIS_TYPE_MEDICAL_TRANSPORT(58L),
  /**
   * Noncombatant ship according to RR Resolution No. 18.
   */
  @GeneratedMavEnumEntry
  AIS_TYPE_NONECOMBATANT(59L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER(60L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_HAZARDOUS_A(61L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_HAZARDOUS_B(62L),
  @GeneratedMavEnumEntry
  AIS_TYPE_AIS_TYPE_PASSENGER_HAZARDOUS_C(63L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_HAZARDOUS_D(64L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_RESERVED_1(65L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_RESERVED_2(66L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_RESERVED_3(67L),
  @GeneratedMavEnumEntry
  AIS_TYPE_AIS_TYPE_PASSENGER_RESERVED_4(68L),
  @GeneratedMavEnumEntry
  AIS_TYPE_PASSENGER_UNKNOWN(69L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO(70L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_HAZARDOUS_A(71L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_HAZARDOUS_B(72L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_HAZARDOUS_C(73L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_HAZARDOUS_D(74L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_RESERVED_1(75L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_RESERVED_2(76L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_RESERVED_3(77L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_RESERVED_4(78L),
  @GeneratedMavEnumEntry
  AIS_TYPE_CARGO_UNKNOWN(79L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER(80L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_HAZARDOUS_A(81L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_HAZARDOUS_B(82L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_HAZARDOUS_C(83L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_HAZARDOUS_D(84L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_RESERVED_1(85L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_RESERVED_2(86L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_RESERVED_3(87L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_RESERVED_4(88L),
  @GeneratedMavEnumEntry
  AIS_TYPE_TANKER_UNKNOWN(89L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER(90L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_HAZARDOUS_A(91L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_HAZARDOUS_B(92L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_HAZARDOUS_C(93L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_HAZARDOUS_D(94L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_RESERVED_1(95L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_RESERVED_2(96L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_RESERVED_3(97L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_RESERVED_4(98L),
  @GeneratedMavEnumEntry
  AIS_TYPE_OTHER_UNKNOWN(99L),
  ;

  public companion object {
    public fun getEntryFromValueOrNull(v: Long): AisType? = when (v) {
      0L -> AIS_TYPE_UNKNOWN
      1L -> AIS_TYPE_RESERVED_1
      2L -> AIS_TYPE_RESERVED_2
      3L -> AIS_TYPE_RESERVED_3
      4L -> AIS_TYPE_RESERVED_4
      5L -> AIS_TYPE_RESERVED_5
      6L -> AIS_TYPE_RESERVED_6
      7L -> AIS_TYPE_RESERVED_7
      8L -> AIS_TYPE_RESERVED_8
      9L -> AIS_TYPE_RESERVED_9
      10L -> AIS_TYPE_RESERVED_10
      11L -> AIS_TYPE_RESERVED_11
      12L -> AIS_TYPE_RESERVED_12
      13L -> AIS_TYPE_RESERVED_13
      14L -> AIS_TYPE_RESERVED_14
      15L -> AIS_TYPE_RESERVED_15
      16L -> AIS_TYPE_RESERVED_16
      17L -> AIS_TYPE_RESERVED_17
      18L -> AIS_TYPE_RESERVED_18
      19L -> AIS_TYPE_RESERVED_19
      20L -> AIS_TYPE_WIG
      21L -> AIS_TYPE_WIG_HAZARDOUS_A
      22L -> AIS_TYPE_WIG_HAZARDOUS_B
      23L -> AIS_TYPE_WIG_HAZARDOUS_C
      24L -> AIS_TYPE_WIG_HAZARDOUS_D
      25L -> AIS_TYPE_WIG_RESERVED_1
      26L -> AIS_TYPE_WIG_RESERVED_2
      27L -> AIS_TYPE_WIG_RESERVED_3
      28L -> AIS_TYPE_WIG_RESERVED_4
      29L -> AIS_TYPE_WIG_RESERVED_5
      30L -> AIS_TYPE_FISHING
      31L -> AIS_TYPE_TOWING
      32L -> AIS_TYPE_TOWING_LARGE
      33L -> AIS_TYPE_DREDGING
      34L -> AIS_TYPE_DIVING
      35L -> AIS_TYPE_MILITARY
      36L -> AIS_TYPE_SAILING
      37L -> AIS_TYPE_PLEASURE
      38L -> AIS_TYPE_RESERVED_20
      39L -> AIS_TYPE_RESERVED_21
      40L -> AIS_TYPE_HSC
      41L -> AIS_TYPE_HSC_HAZARDOUS_A
      42L -> AIS_TYPE_HSC_HAZARDOUS_B
      43L -> AIS_TYPE_HSC_HAZARDOUS_C
      44L -> AIS_TYPE_HSC_HAZARDOUS_D
      45L -> AIS_TYPE_HSC_RESERVED_1
      46L -> AIS_TYPE_HSC_RESERVED_2
      47L -> AIS_TYPE_HSC_RESERVED_3
      48L -> AIS_TYPE_HSC_RESERVED_4
      49L -> AIS_TYPE_HSC_UNKNOWN
      50L -> AIS_TYPE_PILOT
      51L -> AIS_TYPE_SAR
      52L -> AIS_TYPE_TUG
      53L -> AIS_TYPE_PORT_TENDER
      54L -> AIS_TYPE_ANTI_POLLUTION
      55L -> AIS_TYPE_LAW_ENFORCEMENT
      56L -> AIS_TYPE_SPARE_LOCAL_1
      57L -> AIS_TYPE_SPARE_LOCAL_2
      58L -> AIS_TYPE_MEDICAL_TRANSPORT
      59L -> AIS_TYPE_NONECOMBATANT
      60L -> AIS_TYPE_PASSENGER
      61L -> AIS_TYPE_PASSENGER_HAZARDOUS_A
      62L -> AIS_TYPE_PASSENGER_HAZARDOUS_B
      63L -> AIS_TYPE_AIS_TYPE_PASSENGER_HAZARDOUS_C
      64L -> AIS_TYPE_PASSENGER_HAZARDOUS_D
      65L -> AIS_TYPE_PASSENGER_RESERVED_1
      66L -> AIS_TYPE_PASSENGER_RESERVED_2
      67L -> AIS_TYPE_PASSENGER_RESERVED_3
      68L -> AIS_TYPE_AIS_TYPE_PASSENGER_RESERVED_4
      69L -> AIS_TYPE_PASSENGER_UNKNOWN
      70L -> AIS_TYPE_CARGO
      71L -> AIS_TYPE_CARGO_HAZARDOUS_A
      72L -> AIS_TYPE_CARGO_HAZARDOUS_B
      73L -> AIS_TYPE_CARGO_HAZARDOUS_C
      74L -> AIS_TYPE_CARGO_HAZARDOUS_D
      75L -> AIS_TYPE_CARGO_RESERVED_1
      76L -> AIS_TYPE_CARGO_RESERVED_2
      77L -> AIS_TYPE_CARGO_RESERVED_3
      78L -> AIS_TYPE_CARGO_RESERVED_4
      79L -> AIS_TYPE_CARGO_UNKNOWN
      80L -> AIS_TYPE_TANKER
      81L -> AIS_TYPE_TANKER_HAZARDOUS_A
      82L -> AIS_TYPE_TANKER_HAZARDOUS_B
      83L -> AIS_TYPE_TANKER_HAZARDOUS_C
      84L -> AIS_TYPE_TANKER_HAZARDOUS_D
      85L -> AIS_TYPE_TANKER_RESERVED_1
      86L -> AIS_TYPE_TANKER_RESERVED_2
      87L -> AIS_TYPE_TANKER_RESERVED_3
      88L -> AIS_TYPE_TANKER_RESERVED_4
      89L -> AIS_TYPE_TANKER_UNKNOWN
      90L -> AIS_TYPE_OTHER
      91L -> AIS_TYPE_OTHER_HAZARDOUS_A
      92L -> AIS_TYPE_OTHER_HAZARDOUS_B
      93L -> AIS_TYPE_OTHER_HAZARDOUS_C
      94L -> AIS_TYPE_OTHER_HAZARDOUS_D
      95L -> AIS_TYPE_OTHER_RESERVED_1
      96L -> AIS_TYPE_OTHER_RESERVED_2
      97L -> AIS_TYPE_OTHER_RESERVED_3
      98L -> AIS_TYPE_OTHER_RESERVED_4
      99L -> AIS_TYPE_OTHER_UNKNOWN
      else -> null
    }
  }
}
