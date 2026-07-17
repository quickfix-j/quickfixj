/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class SecurityStatus extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "f";

  public SecurityStatus() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public void set(quickfix.fixlatest.component.ApplicationSequenceControl component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl get(quickfix.fixlatest.component.ApplicationSequenceControl component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl getApplicationSequenceControlComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ApplicationSequenceControl());
  }

  public void set(quickfix.field.SecurityStatusReqID value) {
    setField(value);
  }

  public quickfix.field.SecurityStatusReqID get(quickfix.field.SecurityStatusReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityStatusReqID getSecurityStatusReqID() throws FieldNotFound {
    return get(new quickfix.field.SecurityStatusReqID());
  }

  public boolean isSet(quickfix.field.SecurityStatusReqID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityStatusReqID() {
    return isSetField(324);
  }

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }

  public void set(quickfix.fixlatest.component.InstrumentExtension component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentExtension get(quickfix.fixlatest.component.InstrumentExtension component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentExtension getInstrumentExtensionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentExtension());
  }

  public void set(quickfix.fixlatest.component.FinancingDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FinancingDetails get(quickfix.fixlatest.component.FinancingDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FinancingDetails getFinancingDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FinancingDetails());
  }

  public void set(quickfix.fixlatest.component.UndInstrmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndInstrmtGrp get(quickfix.fixlatest.component.UndInstrmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndInstrmtGrp getUndInstrmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndInstrmtGrp());
  }

  public void set(quickfix.field.NoUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyings());
  }

  public boolean isSet(quickfix.field.NoUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyings() {
    return isSetField(711);
  }

public static class NoUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {311, 312, 309, 305, 457, 2874, 462, 1874, 1875, 1876, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1981, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2080, 2312, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2045, 2295, 2296, 2297, 2756, 2298, 2299, 40964, 40962, 40965, 41949, 41950, 41947, 41951, 41952, 41953, 41859, 41864, 41860, 41866, 41868, 41861, 41862, 41863, 41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, 43076, 43077, 43074, 43078, 43079, 43080, 43081, 43082, 41822, 41820, 41841, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, 41846, 41844, 41856, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, 42888, 42889, 42890, 42891, 42892, 42893, 42894, 40540, 42149, 42036, 42068, 42041, 42060, 43004, 43005, 42860, 42861, 42855, 42884, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, 0};

  public NoUnderlyings() {
    super(711, 311, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingInstrument get(quickfix.fixlatest.component.UnderlyingInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingInstrument getUnderlyingInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingInstrument());
  }
}

  public void set(quickfix.fixlatest.component.InstrmtLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrmtLegGrp get(quickfix.fixlatest.component.InstrmtLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrmtLegGrp getInstrmtLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrmtLegGrp());
  }

  public void set(quickfix.field.NoLegs value) {
    setField(value);
  }

  public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
    return get(new quickfix.field.NoLegs());
  }

  public boolean isSet(quickfix.field.NoLegs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegs() {
    return isSetField(555);
  }

public static class NoLegs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 2497, 2498, 2499, 2496, 2495, 2511, 2510, 2512, 2509, 2500, 42198, 42200, 42203, 2502, 2501, 2503, 2507, 2505, 2494, 2493, 2514, 2513, 2506, 2504, 2508, 0};

  public NoLegs() {
    super(555, 600, ORDER);
  }

  public void set(quickfix.fixlatest.component.InstrumentLeg component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentLeg get(quickfix.fixlatest.component.InstrumentLeg component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentLeg getInstrumentLegComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentLeg());
  }

  public void set(quickfix.fixlatest.component.LegFinancingDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegFinancingDetails get(quickfix.fixlatest.component.LegFinancingDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegFinancingDetails getLegFinancingDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegFinancingDetails());
  }
}

  public void set(quickfix.fixlatest.component.RelatedInstrumentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedInstrumentGrp get(quickfix.fixlatest.component.RelatedInstrumentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedInstrumentGrp getRelatedInstrumentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedInstrumentGrp());
  }

  public void set(quickfix.field.NoRelatedInstruments value) {
    setField(value);
  }

  public quickfix.field.NoRelatedInstruments get(quickfix.field.NoRelatedInstruments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedInstruments getNoRelatedInstruments() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedInstruments());
  }

  public boolean isSet(quickfix.field.NoRelatedInstruments field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedInstruments() {
    return isSetField(1647);
  }

public static class NoRelatedInstruments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1648, 1649, 1650, 1651, 1652, 1653, 2413, 2414, 2415, 2417, 0};

  public NoRelatedInstruments() {
    super(1647, 1648, ORDER);
  }

  public void set(quickfix.field.RelatedInstrumentType value) {
    setField(value);
  }

  public quickfix.field.RelatedInstrumentType get(quickfix.field.RelatedInstrumentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedInstrumentType getRelatedInstrumentType() throws FieldNotFound {
    return get(new quickfix.field.RelatedInstrumentType());
  }

  public boolean isSet(quickfix.field.RelatedInstrumentType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedInstrumentType() {
    return isSetField(1648);
  }

  public void set(quickfix.field.RelatedSymbol value) {
    setField(value);
  }

  public quickfix.field.RelatedSymbol get(quickfix.field.RelatedSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSymbol getRelatedSymbol() throws FieldNotFound {
    return get(new quickfix.field.RelatedSymbol());
  }

  public boolean isSet(quickfix.field.RelatedSymbol field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSymbol() {
    return isSetField(1649);
  }

  public void set(quickfix.field.RelatedSecurityID value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityID get(quickfix.field.RelatedSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityID getRelatedSecurityID() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityID());
  }

  public boolean isSet(quickfix.field.RelatedSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityID() {
    return isSetField(1650);
  }

  public void set(quickfix.field.RelatedSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityIDSource get(quickfix.field.RelatedSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityIDSource getRelatedSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityIDSource());
  }

  public boolean isSet(quickfix.field.RelatedSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityIDSource() {
    return isSetField(1651);
  }

  public void set(quickfix.field.RelatedSecurityType value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityType get(quickfix.field.RelatedSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityType getRelatedSecurityType() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityType());
  }

  public boolean isSet(quickfix.field.RelatedSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityType() {
    return isSetField(1652);
  }

  public void set(quickfix.field.RelatedMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.RelatedMaturityMonthYear get(quickfix.field.RelatedMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedMaturityMonthYear getRelatedMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.RelatedMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.RelatedMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetRelatedMaturityMonthYear() {
    return isSetField(1653);
  }

  public void set(quickfix.field.RelatedToSecurityID value) {
    setField(value);
  }

  public quickfix.field.RelatedToSecurityID get(quickfix.field.RelatedToSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToSecurityID getRelatedToSecurityID() throws FieldNotFound {
    return get(new quickfix.field.RelatedToSecurityID());
  }

  public boolean isSet(quickfix.field.RelatedToSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToSecurityID() {
    return isSetField(2413);
  }

  public void set(quickfix.field.RelatedToSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedToSecurityIDSource get(quickfix.field.RelatedToSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToSecurityIDSource getRelatedToSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedToSecurityIDSource());
  }

  public boolean isSet(quickfix.field.RelatedToSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToSecurityIDSource() {
    return isSetField(2414);
  }

  public void set(quickfix.field.RelatedToStreamXIDRef value) {
    setField(value);
  }

  public quickfix.field.RelatedToStreamXIDRef get(quickfix.field.RelatedToStreamXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToStreamXIDRef getRelatedToStreamXIDRef() throws FieldNotFound {
    return get(new quickfix.field.RelatedToStreamXIDRef());
  }

  public boolean isSet(quickfix.field.RelatedToStreamXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToStreamXIDRef() {
    return isSetField(2415);
  }

  public void set(quickfix.field.RelatedToDividendPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.RelatedToDividendPeriodXIDRef get(quickfix.field.RelatedToDividendPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToDividendPeriodXIDRef getRelatedToDividendPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.RelatedToDividendPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.RelatedToDividendPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToDividendPeriodXIDRef() {
    return isSetField(2417);
  }
}

  public void set(quickfix.field.Currency value) {
    setField(value);
  }

  public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Currency getCurrency() throws FieldNotFound {
    return get(new quickfix.field.Currency());
  }

  public boolean isSet(quickfix.field.Currency field) {
    return isSetField(field);
  }

  public boolean isSetCurrency() {
    return isSetField(15);
  }

  public void set(quickfix.field.MarketID value) {
    setField(value);
  }

  public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketID getMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarketID());
  }

  public boolean isSet(quickfix.field.MarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarketID() {
    return isSetField(1301);
  }

  public void set(quickfix.field.MarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentID() {
    return isSetField(1300);
  }

  public void set(quickfix.field.TradeDate value) {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
    return get(new quickfix.field.TradeDate());
  }

  public boolean isSet(quickfix.field.TradeDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeDate() {
    return isSetField(75);
  }

  public void set(quickfix.field.TradingSessionID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionID());
  }

  public boolean isSet(quickfix.field.TradingSessionID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID() {
    return isSetField(336);
  }

  public void set(quickfix.field.TradingSessionSubID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionSubID());
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID() {
    return isSetField(625);
  }

  public void set(quickfix.field.UnsolicitedIndicator value) {
    setField(value);
  }

  public quickfix.field.UnsolicitedIndicator get(quickfix.field.UnsolicitedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnsolicitedIndicator());
  }

  public boolean isSet(quickfix.field.UnsolicitedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnsolicitedIndicator() {
    return isSetField(325);
  }

  public void set(quickfix.field.SecurityTradingStatus value) {
    setField(value);
  }

  public quickfix.field.SecurityTradingStatus get(quickfix.field.SecurityTradingStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
    return get(new quickfix.field.SecurityTradingStatus());
  }

  public boolean isSet(quickfix.field.SecurityTradingStatus field) {
    return isSetField(field);
  }

  public boolean isSetSecurityTradingStatus() {
    return isSetField(326);
  }

  public void set(quickfix.field.MarketMakerActivity value) {
    setField(value);
  }

  public quickfix.field.MarketMakerActivity get(quickfix.field.MarketMakerActivity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketMakerActivity getMarketMakerActivity() throws FieldNotFound {
    return get(new quickfix.field.MarketMakerActivity());
  }

  public boolean isSet(quickfix.field.MarketMakerActivity field) {
    return isSetField(field);
  }

  public boolean isSetMarketMakerActivity() {
    return isSetField(1655);
  }

  public void set(quickfix.field.FastMarketIndicator value) {
    setField(value);
  }

  public quickfix.field.FastMarketIndicator get(quickfix.field.FastMarketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FastMarketIndicator getFastMarketIndicator() throws FieldNotFound {
    return get(new quickfix.field.FastMarketIndicator());
  }

  public boolean isSet(quickfix.field.FastMarketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFastMarketIndicator() {
    return isSetField(2447);
  }

  public void set(quickfix.field.SecurityTradingEvent value) {
    setField(value);
  }

  public quickfix.field.SecurityTradingEvent get(quickfix.field.SecurityTradingEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityTradingEvent getSecurityTradingEvent() throws FieldNotFound {
    return get(new quickfix.field.SecurityTradingEvent());
  }

  public boolean isSet(quickfix.field.SecurityTradingEvent field) {
    return isSetField(field);
  }

  public boolean isSetSecurityTradingEvent() {
    return isSetField(1174);
  }

  public void set(quickfix.field.NextAuctionTime value) {
    setField(value);
  }

  public quickfix.field.NextAuctionTime get(quickfix.field.NextAuctionTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NextAuctionTime getNextAuctionTime() throws FieldNotFound {
    return get(new quickfix.field.NextAuctionTime());
  }

  public boolean isSet(quickfix.field.NextAuctionTime field) {
    return isSetField(field);
  }

  public boolean isSetNextAuctionTime() {
    return isSetField(2116);
  }

  public void set(quickfix.field.FinancialStatus value) {
    setField(value);
  }

  public quickfix.field.FinancialStatus get(quickfix.field.FinancialStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancialStatus getFinancialStatus() throws FieldNotFound {
    return get(new quickfix.field.FinancialStatus());
  }

  public boolean isSet(quickfix.field.FinancialStatus field) {
    return isSetField(field);
  }

  public boolean isSetFinancialStatus() {
    return isSetField(291);
  }

  public void set(quickfix.field.CorporateAction value) {
    setField(value);
  }

  public quickfix.field.CorporateAction get(quickfix.field.CorporateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CorporateAction getCorporateAction() throws FieldNotFound {
    return get(new quickfix.field.CorporateAction());
  }

  public boolean isSet(quickfix.field.CorporateAction field) {
    return isSetField(field);
  }

  public boolean isSetCorporateAction() {
    return isSetField(292);
  }

  public void set(quickfix.field.HaltReason value) {
    setField(value);
  }

  public quickfix.field.HaltReason get(quickfix.field.HaltReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HaltReason getHaltReason() throws FieldNotFound {
    return get(new quickfix.field.HaltReason());
  }

  public boolean isSet(quickfix.field.HaltReason field) {
    return isSetField(field);
  }

  public boolean isSetHaltReason() {
    return isSetField(327);
  }

  public void set(quickfix.field.InViewOfCommon value) {
    setField(value);
  }

  public quickfix.field.InViewOfCommon get(quickfix.field.InViewOfCommon value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InViewOfCommon getInViewOfCommon() throws FieldNotFound {
    return get(new quickfix.field.InViewOfCommon());
  }

  public boolean isSet(quickfix.field.InViewOfCommon field) {
    return isSetField(field);
  }

  public boolean isSetInViewOfCommon() {
    return isSetField(328);
  }

  public void set(quickfix.field.DueToRelated value) {
    setField(value);
  }

  public quickfix.field.DueToRelated get(quickfix.field.DueToRelated value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DueToRelated getDueToRelated() throws FieldNotFound {
    return get(new quickfix.field.DueToRelated());
  }

  public boolean isSet(quickfix.field.DueToRelated field) {
    return isSetField(field);
  }

  public boolean isSetDueToRelated() {
    return isSetField(329);
  }

  public void set(quickfix.field.MDBookType value) {
    setField(value);
  }

  public quickfix.field.MDBookType get(quickfix.field.MDBookType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDBookType getMDBookType() throws FieldNotFound {
    return get(new quickfix.field.MDBookType());
  }

  public boolean isSet(quickfix.field.MDBookType field) {
    return isSetField(field);
  }

  public boolean isSetMDBookType() {
    return isSetField(1021);
  }

  public void set(quickfix.field.MarketDepth value) {
    setField(value);
  }

  public quickfix.field.MarketDepth get(quickfix.field.MarketDepth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDepth getMarketDepth() throws FieldNotFound {
    return get(new quickfix.field.MarketDepth());
  }

  public boolean isSet(quickfix.field.MarketDepth field) {
    return isSetField(field);
  }

  public boolean isSetMarketDepth() {
    return isSetField(264);
  }

  public void set(quickfix.field.BuyVolume value) {
    setField(value);
  }

  public quickfix.field.BuyVolume get(quickfix.field.BuyVolume value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BuyVolume getBuyVolume() throws FieldNotFound {
    return get(new quickfix.field.BuyVolume());
  }

  public boolean isSet(quickfix.field.BuyVolume field) {
    return isSetField(field);
  }

  public boolean isSetBuyVolume() {
    return isSetField(330);
  }

  public void set(quickfix.field.SellVolume value) {
    setField(value);
  }

  public quickfix.field.SellVolume get(quickfix.field.SellVolume value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SellVolume getSellVolume() throws FieldNotFound {
    return get(new quickfix.field.SellVolume());
  }

  public boolean isSet(quickfix.field.SellVolume field) {
    return isSetField(field);
  }

  public boolean isSetSellVolume() {
    return isSetField(331);
  }

  public void set(quickfix.field.HighPx value) {
    setField(value);
  }

  public quickfix.field.HighPx get(quickfix.field.HighPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HighPx getHighPx() throws FieldNotFound {
    return get(new quickfix.field.HighPx());
  }

  public boolean isSet(quickfix.field.HighPx field) {
    return isSetField(field);
  }

  public boolean isSetHighPx() {
    return isSetField(332);
  }

  public void set(quickfix.field.LowPx value) {
    setField(value);
  }

  public quickfix.field.LowPx get(quickfix.field.LowPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LowPx getLowPx() throws FieldNotFound {
    return get(new quickfix.field.LowPx());
  }

  public boolean isSet(quickfix.field.LowPx field) {
    return isSetField(field);
  }

  public boolean isSetLowPx() {
    return isSetField(333);
  }

  public void set(quickfix.field.LastPx value) {
    setField(value);
  }

  public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastPx getLastPx() throws FieldNotFound {
    return get(new quickfix.field.LastPx());
  }

  public boolean isSet(quickfix.field.LastPx field) {
    return isSetField(field);
  }

  public boolean isSetLastPx() {
    return isSetField(31);
  }

  public void set(quickfix.fixlatest.component.ClearingPriceParametersGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClearingPriceParametersGrp get(quickfix.fixlatest.component.ClearingPriceParametersGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClearingPriceParametersGrp getClearingPriceParametersGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClearingPriceParametersGrp());
  }

  public void set(quickfix.field.NoClearingPriceParameters value) {
    setField(value);
  }

  public quickfix.field.NoClearingPriceParameters get(quickfix.field.NoClearingPriceParameters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingPriceParameters getNoClearingPriceParameters() throws FieldNotFound {
    return get(new quickfix.field.NoClearingPriceParameters());
  }

  public boolean isSet(quickfix.field.NoClearingPriceParameters field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingPriceParameters() {
    return isSetField(2580);
  }

public static class NoClearingPriceParameters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2581, 2582, 2583, 2584, 2585, 2586, 2588, 2587, 2589, 1190, 2590, 2591, 1592, 1188, 2528, 2592, 0};

  public NoClearingPriceParameters() {
    super(2580, 2581, ORDER);
  }

  public void set(quickfix.field.BusinessDayType value) {
    setField(value);
  }

  public quickfix.field.BusinessDayType get(quickfix.field.BusinessDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessDayType getBusinessDayType() throws FieldNotFound {
    return get(new quickfix.field.BusinessDayType());
  }

  public boolean isSet(quickfix.field.BusinessDayType field) {
    return isSetField(field);
  }

  public boolean isSetBusinessDayType() {
    return isSetField(2581);
  }

  public void set(quickfix.field.ClearingPriceOffset value) {
    setField(value);
  }

  public quickfix.field.ClearingPriceOffset get(quickfix.field.ClearingPriceOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingPriceOffset getClearingPriceOffset() throws FieldNotFound {
    return get(new quickfix.field.ClearingPriceOffset());
  }

  public boolean isSet(quickfix.field.ClearingPriceOffset field) {
    return isSetField(field);
  }

  public boolean isSetClearingPriceOffset() {
    return isSetField(2582);
  }

  public void set(quickfix.field.VegaMultiplier value) {
    setField(value);
  }

  public quickfix.field.VegaMultiplier get(quickfix.field.VegaMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VegaMultiplier getVegaMultiplier() throws FieldNotFound {
    return get(new quickfix.field.VegaMultiplier());
  }

  public boolean isSet(quickfix.field.VegaMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetVegaMultiplier() {
    return isSetField(2583);
  }

  public void set(quickfix.field.AnnualTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.AnnualTradingBusinessDays get(quickfix.field.AnnualTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AnnualTradingBusinessDays getAnnualTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.AnnualTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.AnnualTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetAnnualTradingBusinessDays() {
    return isSetField(2584);
  }

  public void set(quickfix.field.TotalTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.TotalTradingBusinessDays get(quickfix.field.TotalTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTradingBusinessDays getTotalTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.TotalTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.TotalTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetTotalTradingBusinessDays() {
    return isSetField(2585);
  }

  public void set(quickfix.field.TradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.TradingBusinessDays get(quickfix.field.TradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingBusinessDays getTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.TradingBusinessDays());
  }

  public boolean isSet(quickfix.field.TradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetTradingBusinessDays() {
    return isSetField(2586);
  }

  public void set(quickfix.field.StandardVariance value) {
    setField(value);
  }

  public quickfix.field.StandardVariance get(quickfix.field.StandardVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandardVariance getStandardVariance() throws FieldNotFound {
    return get(new quickfix.field.StandardVariance());
  }

  public boolean isSet(quickfix.field.StandardVariance field) {
    return isSetField(field);
  }

  public boolean isSetStandardVariance() {
    return isSetField(2588);
  }

  public void set(quickfix.field.RealizedVariance value) {
    setField(value);
  }

  public quickfix.field.RealizedVariance get(quickfix.field.RealizedVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RealizedVariance getRealizedVariance() throws FieldNotFound {
    return get(new quickfix.field.RealizedVariance());
  }

  public boolean isSet(quickfix.field.RealizedVariance field) {
    return isSetField(field);
  }

  public boolean isSetRealizedVariance() {
    return isSetField(2587);
  }

  public void set(quickfix.field.RelatedClosePrice value) {
    setField(value);
  }

  public quickfix.field.RelatedClosePrice get(quickfix.field.RelatedClosePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedClosePrice getRelatedClosePrice() throws FieldNotFound {
    return get(new quickfix.field.RelatedClosePrice());
  }

  public boolean isSet(quickfix.field.RelatedClosePrice field) {
    return isSetField(field);
  }

  public boolean isSetRelatedClosePrice() {
    return isSetField(2589);
  }

  public void set(quickfix.field.RiskFreeRate value) {
    setField(value);
  }

  public quickfix.field.RiskFreeRate get(quickfix.field.RiskFreeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskFreeRate getRiskFreeRate() throws FieldNotFound {
    return get(new quickfix.field.RiskFreeRate());
  }

  public boolean isSet(quickfix.field.RiskFreeRate field) {
    return isSetField(field);
  }

  public boolean isSetRiskFreeRate() {
    return isSetField(1190);
  }

  public void set(quickfix.field.OvernightInterestRate value) {
    setField(value);
  }

  public quickfix.field.OvernightInterestRate get(quickfix.field.OvernightInterestRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OvernightInterestRate getOvernightInterestRate() throws FieldNotFound {
    return get(new quickfix.field.OvernightInterestRate());
  }

  public boolean isSet(quickfix.field.OvernightInterestRate field) {
    return isSetField(field);
  }

  public boolean isSetOvernightInterestRate() {
    return isSetField(2590);
  }

  public void set(quickfix.field.AccumulatedReturnModifiedVariationMargin value) {
    setField(value);
  }

  public quickfix.field.AccumulatedReturnModifiedVariationMargin get(quickfix.field.AccumulatedReturnModifiedVariationMargin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccumulatedReturnModifiedVariationMargin getAccumulatedReturnModifiedVariationMargin() throws FieldNotFound {
    return get(new quickfix.field.AccumulatedReturnModifiedVariationMargin());
  }

  public boolean isSet(quickfix.field.AccumulatedReturnModifiedVariationMargin field) {
    return isSetField(field);
  }

  public boolean isSetAccumulatedReturnModifiedVariationMargin() {
    return isSetField(2591);
  }

  public void set(quickfix.field.DiscountFactor value) {
    setField(value);
  }

  public quickfix.field.DiscountFactor get(quickfix.field.DiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscountFactor getDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.DiscountFactor());
  }

  public boolean isSet(quickfix.field.DiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetDiscountFactor() {
    return isSetField(1592);
  }

  public void set(quickfix.field.Volatility value) {
    setField(value);
  }

  public quickfix.field.Volatility get(quickfix.field.Volatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Volatility getVolatility() throws FieldNotFound {
    return get(new quickfix.field.Volatility());
  }

  public boolean isSet(quickfix.field.Volatility field) {
    return isSetField(field);
  }

  public boolean isSetVolatility() {
    return isSetField(1188);
  }

  public void set(quickfix.field.ClearingSettlPrice value) {
    setField(value);
  }

  public quickfix.field.ClearingSettlPrice get(quickfix.field.ClearingSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingSettlPrice getClearingSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.ClearingSettlPrice());
  }

  public boolean isSet(quickfix.field.ClearingSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetClearingSettlPrice() {
    return isSetField(2528);
  }

  public void set(quickfix.field.CalculationMethod value) {
    setField(value);
  }

  public quickfix.field.CalculationMethod get(quickfix.field.CalculationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CalculationMethod getCalculationMethod() throws FieldNotFound {
    return get(new quickfix.field.CalculationMethod());
  }

  public boolean isSet(quickfix.field.CalculationMethod field) {
    return isSetField(field);
  }

  public boolean isSetCalculationMethod() {
    return isSetField(2592);
  }
}

  public void set(quickfix.field.SettlPrice value) {
    setField(value);
  }

  public quickfix.field.SettlPrice get(quickfix.field.SettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPrice getSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.SettlPrice());
  }

  public boolean isSet(quickfix.field.SettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetSettlPrice() {
    return isSetField(730);
  }

  public void set(quickfix.field.SettlPriceType value) {
    setField(value);
  }

  public quickfix.field.SettlPriceType get(quickfix.field.SettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceType getSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceType());
  }

  public boolean isSet(quickfix.field.SettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceType() {
    return isSetField(731);
  }

  public void set(quickfix.field.SettlPriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.SettlPriceDeterminationMethod get(quickfix.field.SettlPriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceDeterminationMethod getSettlPriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.SettlPriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceDeterminationMethod() {
    return isSetField(2451);
  }

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
  }

  public void set(quickfix.field.Adjustment value) {
    setField(value);
  }

  public quickfix.field.Adjustment get(quickfix.field.Adjustment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Adjustment getAdjustment() throws FieldNotFound {
    return get(new quickfix.field.Adjustment());
  }

  public boolean isSet(quickfix.field.Adjustment field) {
    return isSetField(field);
  }

  public boolean isSetAdjustment() {
    return isSetField(334);
  }

  public void set(quickfix.field.FirstPx value) {
    setField(value);
  }

  public quickfix.field.FirstPx get(quickfix.field.FirstPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirstPx getFirstPx() throws FieldNotFound {
    return get(new quickfix.field.FirstPx());
  }

  public boolean isSet(quickfix.field.FirstPx field) {
    return isSetField(field);
  }

  public boolean isSetFirstPx() {
    return isSetField(1025);
  }

  public void set(quickfix.field.LinkageHandlingIndicator value) {
    setField(value);
  }

  public quickfix.field.LinkageHandlingIndicator get(quickfix.field.LinkageHandlingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LinkageHandlingIndicator getLinkageHandlingIndicator() throws FieldNotFound {
    return get(new quickfix.field.LinkageHandlingIndicator());
  }

  public boolean isSet(quickfix.field.LinkageHandlingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLinkageHandlingIndicator() {
    return isSetField(2448);
  }

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }
}
