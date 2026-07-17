/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDataStatisticsReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DP";

  public MarketDataStatisticsReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarketDataStatisticsReport (quickfix.field.MDStatisticRptID mDStatisticRptID) {
    this();
    setField(mDStatisticRptID);
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

  public void set(quickfix.field.MDStatisticRptID value) {
    setField(value);
  }

  public quickfix.field.MDStatisticRptID get(quickfix.field.MDStatisticRptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticRptID getMDStatisticRptID() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticRptID());
  }

  public boolean isSet(quickfix.field.MDStatisticRptID field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticRptID() {
    return isSetField(2453);
  }

  public void set(quickfix.field.MDStatisticReqID value) {
    setField(value);
  }

  public quickfix.field.MDStatisticReqID get(quickfix.field.MDStatisticReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticReqID getMDStatisticReqID() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticReqID());
  }

  public boolean isSet(quickfix.field.MDStatisticReqID field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticReqID() {
    return isSetField(2452);
  }

  public void set(quickfix.field.MDStatisticRequestResult value) {
    setField(value);
  }

  public quickfix.field.MDStatisticRequestResult get(quickfix.field.MDStatisticRequestResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticRequestResult getMDStatisticRequestResult() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticRequestResult());
  }

  public boolean isSet(quickfix.field.MDStatisticRequestResult field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticRequestResult() {
    return isSetField(2473);
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

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
  }

  public void set(quickfix.field.NoPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs() {
    return isSetField(802);
  }

public static class NoPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

  public NoPartySubIDs() {
    super(802, 523, ORDER);
  }

  public void set(quickfix.field.PartySubID value) {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PartySubID());
  }

  public boolean isSet(quickfix.field.PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPartySubID() {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartySubIDType());
  }

  public boolean isSet(quickfix.field.PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType() {
    return isSetField(803);
  }
}
}

  public void set(quickfix.field.CustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.CustOrderCapacity());
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity() {
    return isSetField(582);
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

  public void set(quickfix.field.MarketSegmentDesc value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentDesc get(quickfix.field.MarketSegmentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentDesc getMarketSegmentDesc() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentDesc());
  }

  public boolean isSet(quickfix.field.MarketSegmentDesc field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentDesc() {
    return isSetField(1396);
  }

  public void set(quickfix.field.EncodedMktSegmDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMktSegmDescLen get(quickfix.field.EncodedMktSegmDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMktSegmDescLen getEncodedMktSegmDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMktSegmDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMktSegmDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMktSegmDescLen() {
    return isSetField(1397);
  }

  public void set(quickfix.field.EncodedMktSegmDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMktSegmDesc get(quickfix.field.EncodedMktSegmDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMktSegmDesc getEncodedMktSegmDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMktSegmDesc());
  }

  public boolean isSet(quickfix.field.EncodedMktSegmDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMktSegmDesc() {
    return isSetField(1398);
  }

  public void set(quickfix.field.SecurityListID value) {
    setField(value);
  }

  public quickfix.field.SecurityListID get(quickfix.field.SecurityListID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityListID getSecurityListID() throws FieldNotFound {
    return get(new quickfix.field.SecurityListID());
  }

  public boolean isSet(quickfix.field.SecurityListID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityListID() {
    return isSetField(1465);
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

  public void set(quickfix.fixlatest.component.MDStatisticRptGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDStatisticRptGrp get(quickfix.fixlatest.component.MDStatisticRptGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDStatisticRptGrp getMDStatisticRptGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDStatisticRptGrp());
  }

  public void set(quickfix.field.NoMDStatistics value) {
    setField(value);
  }

  public quickfix.field.NoMDStatistics get(quickfix.field.NoMDStatistics value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDStatistics getNoMDStatistics() throws FieldNotFound {
    return get(new quickfix.field.NoMDStatistics());
  }

  public boolean isSet(quickfix.field.NoMDStatistics field) {
    return isSetField(field);
  }

  public boolean isSetNoMDStatistics() {
    return isSetField(2474);
  }

public static class NoMDStatistics extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2456, 2457, 2458, 2459, 2454, 2455, 2481, 2482, 264, 2460, 2461, 2462, 2463, 2464, 2465, 2466, 2467, 2468, 2469, 2470, 2471, 2472, 539, 2584, 1815, 40, 59, 276, 277, 54, 578, 336, 625, 1024, 2711, 338, 1022, 1629, 1916, 1057, 2475, 2476, 2477, 2478, 2479, 2480, 0};

  public NoMDStatistics() {
    super(2474, 2456, ORDER);
  }

  public void set(quickfix.fixlatest.component.MDStatisticParameters component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDStatisticParameters get(quickfix.fixlatest.component.MDStatisticParameters component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDStatisticParameters getMDStatisticParametersComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDStatisticParameters());
  }

  public void set(quickfix.field.MDStatisticID value) {
    setField(value);
  }

  public quickfix.field.MDStatisticID get(quickfix.field.MDStatisticID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticID getMDStatisticID() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticID());
  }

  public boolean isSet(quickfix.field.MDStatisticID field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticID() {
    return isSetField(2475);
  }

  public void set(quickfix.field.MDStatisticTime value) {
    setField(value);
  }

  public quickfix.field.MDStatisticTime get(quickfix.field.MDStatisticTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticTime getMDStatisticTime() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticTime());
  }

  public boolean isSet(quickfix.field.MDStatisticTime field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticTime() {
    return isSetField(2476);
  }

  public void set(quickfix.field.MDStatisticStatus value) {
    setField(value);
  }

  public quickfix.field.MDStatisticStatus get(quickfix.field.MDStatisticStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticStatus getMDStatisticStatus() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticStatus());
  }

  public boolean isSet(quickfix.field.MDStatisticStatus field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticStatus() {
    return isSetField(2477);
  }

  public void set(quickfix.field.MDStatisticValue value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValue get(quickfix.field.MDStatisticValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValue getMDStatisticValue() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValue());
  }

  public boolean isSet(quickfix.field.MDStatisticValue field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValue() {
    return isSetField(2478);
  }

  public void set(quickfix.field.MDStatisticValueType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValueType get(quickfix.field.MDStatisticValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValueType getMDStatisticValueType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValueType());
  }

  public boolean isSet(quickfix.field.MDStatisticValueType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValueType() {
    return isSetField(2479);
  }

  public void set(quickfix.field.MDStatisticValueUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValueUnit get(quickfix.field.MDStatisticValueUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValueUnit getMDStatisticValueUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValueUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticValueUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValueUnit() {
    return isSetField(2480);
  }
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
