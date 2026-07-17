/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDataSnapshotFullRefresh extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "W";

  public MarketDataSnapshotFullRefresh() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarketDataSnapshotFullRefresh (quickfix.field.LastUpdateTime lastUpdateTime) {
    this();
    setField(lastUpdateTime);
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

  public void set(quickfix.field.TotNumReports value) {
    setField(value);
  }

  public quickfix.field.TotNumReports get(quickfix.field.TotNumReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNumReports getTotNumReports() throws FieldNotFound {
    return get(new quickfix.field.TotNumReports());
  }

  public boolean isSet(quickfix.field.TotNumReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNumReports() {
    return isSetField(911);
  }

  public void set(quickfix.field.MDReportID value) {
    setField(value);
  }

  public quickfix.field.MDReportID get(quickfix.field.MDReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReportID getMDReportID() throws FieldNotFound {
    return get(new quickfix.field.MDReportID());
  }

  public boolean isSet(quickfix.field.MDReportID field) {
    return isSetField(field);
  }

  public boolean isSetMDReportID() {
    return isSetField(963);
  }

  public void set(quickfix.field.ClearingBusinessDate value) {
    setField(value);
  }

  public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.ClearingBusinessDate());
  }

  public boolean isSet(quickfix.field.ClearingBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetClearingBusinessDate() {
    return isSetField(715);
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

  public void set(quickfix.field.MDSubBookType value) {
    setField(value);
  }

  public quickfix.field.MDSubBookType get(quickfix.field.MDSubBookType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSubBookType getMDSubBookType() throws FieldNotFound {
    return get(new quickfix.field.MDSubBookType());
  }

  public boolean isSet(quickfix.field.MDSubBookType field) {
    return isSetField(field);
  }

  public boolean isSetMDSubBookType() {
    return isSetField(1173);
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

  public void set(quickfix.field.MDFeedType value) {
    setField(value);
  }

  public quickfix.field.MDFeedType get(quickfix.field.MDFeedType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDFeedType getMDFeedType() throws FieldNotFound {
    return get(new quickfix.field.MDFeedType());
  }

  public boolean isSet(quickfix.field.MDFeedType field) {
    return isSetField(field);
  }

  public boolean isSetMDFeedType() {
    return isSetField(1022);
  }

  public void set(quickfix.field.MDSubFeedType value) {
    setField(value);
  }

  public quickfix.field.MDSubFeedType get(quickfix.field.MDSubFeedType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSubFeedType getMDSubFeedType() throws FieldNotFound {
    return get(new quickfix.field.MDSubFeedType());
  }

  public boolean isSet(quickfix.field.MDSubFeedType field) {
    return isSetField(field);
  }

  public boolean isSetMDSubFeedType() {
    return isSetField(1683);
  }

  public void set(quickfix.field.RefreshIndicator value) {
    setField(value);
  }

  public quickfix.field.RefreshIndicator get(quickfix.field.RefreshIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefreshIndicator getRefreshIndicator() throws FieldNotFound {
    return get(new quickfix.field.RefreshIndicator());
  }

  public boolean isSet(quickfix.field.RefreshIndicator field) {
    return isSetField(field);
  }

  public boolean isSetRefreshIndicator() {
    return isSetField(1187);
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

  public void set(quickfix.field.MDReqID value) {
    setField(value);
  }

  public quickfix.field.MDReqID get(quickfix.field.MDReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReqID getMDReqID() throws FieldNotFound {
    return get(new quickfix.field.MDReqID());
  }

  public boolean isSet(quickfix.field.MDReqID field) {
    return isSetField(field);
  }

  public boolean isSetMDReqID() {
    return isSetField(262);
  }

  public void set(quickfix.field.MDStreamID value) {
    setField(value);
  }

  public quickfix.field.MDStreamID get(quickfix.field.MDStreamID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStreamID getMDStreamID() throws FieldNotFound {
    return get(new quickfix.field.MDStreamID());
  }

  public boolean isSet(quickfix.field.MDStreamID field) {
    return isSetField(field);
  }

  public boolean isSetMDStreamID() {
    return isSetField(1500);
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

  public void set(quickfix.field.LastUpdateTime value) {
    setField(value);
  }

  public quickfix.field.LastUpdateTime get(quickfix.field.LastUpdateTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastUpdateTime getLastUpdateTime() throws FieldNotFound {
    return get(new quickfix.field.LastUpdateTime());
  }

  public boolean isSet(quickfix.field.LastUpdateTime field) {
    return isSetField(field);
  }

  public boolean isSetLastUpdateTime() {
    return isSetField(779);
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

  public void set(quickfix.field.NetChgPrevDay value) {
    setField(value);
  }

  public quickfix.field.NetChgPrevDay get(quickfix.field.NetChgPrevDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetChgPrevDay getNetChgPrevDay() throws FieldNotFound {
    return get(new quickfix.field.NetChgPrevDay());
  }

  public boolean isSet(quickfix.field.NetChgPrevDay field) {
    return isSetField(field);
  }

  public boolean isSetNetChgPrevDay() {
    return isSetField(451);
  }

  public void set(quickfix.field.MDSecurityTradingStatus value) {
    setField(value);
  }

  public quickfix.field.MDSecurityTradingStatus get(quickfix.field.MDSecurityTradingStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecurityTradingStatus getMDSecurityTradingStatus() throws FieldNotFound {
    return get(new quickfix.field.MDSecurityTradingStatus());
  }

  public boolean isSet(quickfix.field.MDSecurityTradingStatus field) {
    return isSetField(field);
  }

  public boolean isSetMDSecurityTradingStatus() {
    return isSetField(1682);
  }

  public void set(quickfix.field.MDHaltReason value) {
    setField(value);
  }

  public quickfix.field.MDHaltReason get(quickfix.field.MDHaltReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDHaltReason getMDHaltReason() throws FieldNotFound {
    return get(new quickfix.field.MDHaltReason());
  }

  public boolean isSet(quickfix.field.MDHaltReason field) {
    return isSetField(field);
  }

  public boolean isSetMDHaltReason() {
    return isSetField(1684);
  }

  public void set(quickfix.fixlatest.component.MDFullGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDFullGrp get(quickfix.fixlatest.component.MDFullGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDFullGrp getMDFullGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDFullGrp());
  }

  public void set(quickfix.field.NoMDEntries value) {
    setField(value);
  }

  public quickfix.field.NoMDEntries get(quickfix.field.NoMDEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDEntries getNoMDEntries() throws FieldNotFound {
    return get(new quickfix.field.NoMDEntries());
  }

  public boolean isSet(quickfix.field.NoMDEntries field) {
    return isSetField(field);
  }

  public boolean isSetNoMDEntries() {
    return isSetField(268);
  }

public static class NoMDEntries extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {269, 278, 270, 423, 2709, 819, 235, 236, 701, 696, 697, 698, 218, 220, 221, 222, 662, 663, 699, 761, 40, 15, 120, 1445, 271, 1177, 1093, 272, 273, 274, 275, 336, 625, 326, 327, 2447, 2705, 276, 277, 1838, 2667, 282, 283, 284, 286, 59, 432, 126, 1629, 1916, 110, 18, 287, 37, 198, 299, 1003, 1851, 288, 289, 2449, 2450, 346, 290, 546, 811, 828, 829, 855, 2896, 1934, 2405, 574, 1115, 1390, 2668, 2373, 570, 1855, 58, 354, 355, 1023, 528, 1024, 332, 333, 1025, 31, 1592, 1020, 1306, 1148, 1149, 1150, 1143, 731, 2451, 63, 64, 1070, 83, 1048, 1026, 1027, 453, 2445, 2446, 654, 0};

  public NoMDEntries() {
    super(268, 269, ORDER);
  }

  public void set(quickfix.field.MDEntryType value) {
    setField(value);
  }

  public quickfix.field.MDEntryType get(quickfix.field.MDEntryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound {
    return get(new quickfix.field.MDEntryType());
  }

  public boolean isSet(quickfix.field.MDEntryType field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryType() {
    return isSetField(269);
  }

  public void set(quickfix.field.MDEntryID value) {
    setField(value);
  }

  public quickfix.field.MDEntryID get(quickfix.field.MDEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound {
    return get(new quickfix.field.MDEntryID());
  }

  public boolean isSet(quickfix.field.MDEntryID field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryID() {
    return isSetField(278);
  }

  public void set(quickfix.field.MDEntryPx value) {
    setField(value);
  }

  public quickfix.field.MDEntryPx get(quickfix.field.MDEntryPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryPx getMDEntryPx() throws FieldNotFound {
    return get(new quickfix.field.MDEntryPx());
  }

  public boolean isSet(quickfix.field.MDEntryPx field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryPx() {
    return isSetField(270);
  }

  public void set(quickfix.field.PriceType value) {
    setField(value);
  }

  public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceType getPriceType() throws FieldNotFound {
    return get(new quickfix.field.PriceType());
  }

  public boolean isSet(quickfix.field.PriceType field) {
    return isSetField(field);
  }

  public boolean isSetPriceType() {
    return isSetField(423);
  }

  public void set(quickfix.fixlatest.component.PriceQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceQualifierGrp get(quickfix.fixlatest.component.PriceQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceQualifierGrp getPriceQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceQualifierGrp());
  }

  public void set(quickfix.field.NoPriceQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoPriceQualifiers get(quickfix.field.NoPriceQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceQualifiers getNoPriceQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoPriceQualifiers());
  }

  public boolean isSet(quickfix.field.NoPriceQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceQualifiers() {
    return isSetField(2709);
  }

public static class NoPriceQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2710, 0};

  public NoPriceQualifiers() {
    super(2709, 2710, ORDER);
  }

  public void set(quickfix.field.PriceQualifier value) {
    setField(value);
  }

  public quickfix.field.PriceQualifier get(quickfix.field.PriceQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQualifier getPriceQualifier() throws FieldNotFound {
    return get(new quickfix.field.PriceQualifier());
  }

  public boolean isSet(quickfix.field.PriceQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPriceQualifier() {
    return isSetField(2710);
  }
}

  public void set(quickfix.field.AvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.AvgPxIndicator get(quickfix.field.AvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPxIndicator getAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.AvgPxIndicator());
  }

  public boolean isSet(quickfix.field.AvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAvgPxIndicator() {
    return isSetField(819);
  }

  public void set(quickfix.fixlatest.component.YieldData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.YieldData get(quickfix.fixlatest.component.YieldData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.YieldData getYieldDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.YieldData());
  }

  public void set(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData get(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SpreadOrBenchmarkCurveData());
  }

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
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

  public void set(quickfix.field.SettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrency());
  }

  public boolean isSet(quickfix.field.SettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrency() {
    return isSetField(120);
  }

  public void set(quickfix.fixlatest.component.RateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RateSource get(quickfix.fixlatest.component.RateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RateSource getRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RateSource());
  }

  public void set(quickfix.field.NoRateSources value) {
    setField(value);
  }

  public quickfix.field.NoRateSources get(quickfix.field.NoRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRateSources getNoRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoRateSources());
  }

  public boolean isSet(quickfix.field.NoRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoRateSources() {
    return isSetField(1445);
  }

public static class NoRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1446, 1447, 1448, 2412, 2796, 0};

  public NoRateSources() {
    super(1445, 1446, ORDER);
  }

  public void set(quickfix.field.RateSource value) {
    setField(value);
  }

  public quickfix.field.RateSource get(quickfix.field.RateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSource getRateSource() throws FieldNotFound {
    return get(new quickfix.field.RateSource());
  }

  public boolean isSet(quickfix.field.RateSource field) {
    return isSetField(field);
  }

  public boolean isSetRateSource() {
    return isSetField(1446);
  }

  public void set(quickfix.field.RateSourceType value) {
    setField(value);
  }

  public quickfix.field.RateSourceType get(quickfix.field.RateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceType getRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.RateSourceType());
  }

  public boolean isSet(quickfix.field.RateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceType() {
    return isSetField(1447);
  }

  public void set(quickfix.field.ReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReferencePage get(quickfix.field.ReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferencePage getReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReferencePage());
  }

  public boolean isSet(quickfix.field.ReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReferencePage() {
    return isSetField(1448);
  }

  public void set(quickfix.field.RateSourceReferemcePageHeading value) {
    setField(value);
  }

  public quickfix.field.RateSourceReferemcePageHeading get(quickfix.field.RateSourceReferemcePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceReferemcePageHeading getRateSourceReferemcePageHeading() throws FieldNotFound {
    return get(new quickfix.field.RateSourceReferemcePageHeading());
  }

  public boolean isSet(quickfix.field.RateSourceReferemcePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceReferemcePageHeading() {
    return isSetField(2412);
  }

  public void set(quickfix.field.FXBenchmarkRateFix value) {
    setField(value);
  }

  public quickfix.field.FXBenchmarkRateFix get(quickfix.field.FXBenchmarkRateFix value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FXBenchmarkRateFix getFXBenchmarkRateFix() throws FieldNotFound {
    return get(new quickfix.field.FXBenchmarkRateFix());
  }

  public boolean isSet(quickfix.field.FXBenchmarkRateFix field) {
    return isSetField(field);
  }

  public boolean isSetFXBenchmarkRateFix() {
    return isSetField(2796);
  }
}

  public void set(quickfix.field.MDEntrySize value) {
    setField(value);
  }

  public quickfix.field.MDEntrySize get(quickfix.field.MDEntrySize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySize());
  }

  public boolean isSet(quickfix.field.MDEntrySize field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySize() {
    return isSetField(271);
  }

  public void set(quickfix.fixlatest.component.SecSizesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecSizesGrp get(quickfix.fixlatest.component.SecSizesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecSizesGrp getSecSizesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecSizesGrp());
  }

  public void set(quickfix.field.NoOfSecSizes value) {
    setField(value);
  }

  public quickfix.field.NoOfSecSizes get(quickfix.field.NoOfSecSizes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfSecSizes getNoOfSecSizes() throws FieldNotFound {
    return get(new quickfix.field.NoOfSecSizes());
  }

  public boolean isSet(quickfix.field.NoOfSecSizes field) {
    return isSetField(field);
  }

  public boolean isSetNoOfSecSizes() {
    return isSetField(1177);
  }

public static class NoOfSecSizes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1178, 1179, 0};

  public NoOfSecSizes() {
    super(1177, 1178, ORDER);
  }

  public void set(quickfix.field.MDSecSizeType value) {
    setField(value);
  }

  public quickfix.field.MDSecSizeType get(quickfix.field.MDSecSizeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSizeType getMDSecSizeType() throws FieldNotFound {
    return get(new quickfix.field.MDSecSizeType());
  }

  public boolean isSet(quickfix.field.MDSecSizeType field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSizeType() {
    return isSetField(1178);
  }

  public void set(quickfix.field.MDSecSize value) {
    setField(value);
  }

  public quickfix.field.MDSecSize get(quickfix.field.MDSecSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSize getMDSecSize() throws FieldNotFound {
    return get(new quickfix.field.MDSecSize());
  }

  public boolean isSet(quickfix.field.MDSecSize field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSize() {
    return isSetField(1179);
  }
}

  public void set(quickfix.field.LotType value) {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound {
    return get(new quickfix.field.LotType());
  }

  public boolean isSet(quickfix.field.LotType field) {
    return isSetField(field);
  }

  public boolean isSetLotType() {
    return isSetField(1093);
  }

  public void set(quickfix.field.MDEntryDate value) {
    setField(value);
  }

  public quickfix.field.MDEntryDate get(quickfix.field.MDEntryDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryDate getMDEntryDate() throws FieldNotFound {
    return get(new quickfix.field.MDEntryDate());
  }

  public boolean isSet(quickfix.field.MDEntryDate field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryDate() {
    return isSetField(272);
  }

  public void set(quickfix.field.MDEntryTime value) {
    setField(value);
  }

  public quickfix.field.MDEntryTime get(quickfix.field.MDEntryTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryTime getMDEntryTime() throws FieldNotFound {
    return get(new quickfix.field.MDEntryTime());
  }

  public boolean isSet(quickfix.field.MDEntryTime field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryTime() {
    return isSetField(273);
  }

  public void set(quickfix.field.TickDirection value) {
    setField(value);
  }

  public quickfix.field.TickDirection get(quickfix.field.TickDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickDirection getTickDirection() throws FieldNotFound {
    return get(new quickfix.field.TickDirection());
  }

  public boolean isSet(quickfix.field.TickDirection field) {
    return isSetField(field);
  }

  public boolean isSetTickDirection() {
    return isSetField(274);
  }

  public void set(quickfix.field.MDMkt value) {
    setField(value);
  }

  public quickfix.field.MDMkt get(quickfix.field.MDMkt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDMkt getMDMkt() throws FieldNotFound {
    return get(new quickfix.field.MDMkt());
  }

  public boolean isSet(quickfix.field.MDMkt field) {
    return isSetField(field);
  }

  public boolean isSetMDMkt() {
    return isSetField(275);
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

  public void set(quickfix.field.MarketCondition value) {
    setField(value);
  }

  public quickfix.field.MarketCondition get(quickfix.field.MarketCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketCondition getMarketCondition() throws FieldNotFound {
    return get(new quickfix.field.MarketCondition());
  }

  public boolean isSet(quickfix.field.MarketCondition field) {
    return isSetField(field);
  }

  public boolean isSetMarketCondition() {
    return isSetField(2705);
  }

  public void set(quickfix.field.QuoteCondition value) {
    setField(value);
  }

  public quickfix.field.QuoteCondition get(quickfix.field.QuoteCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteCondition getQuoteCondition() throws FieldNotFound {
    return get(new quickfix.field.QuoteCondition());
  }

  public boolean isSet(quickfix.field.QuoteCondition field) {
    return isSetField(field);
  }

  public boolean isSetQuoteCondition() {
    return isSetField(276);
  }

  public void set(quickfix.field.TradeCondition value) {
    setField(value);
  }

  public quickfix.field.TradeCondition get(quickfix.field.TradeCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeCondition getTradeCondition() throws FieldNotFound {
    return get(new quickfix.field.TradeCondition());
  }

  public boolean isSet(quickfix.field.TradeCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradeCondition() {
    return isSetField(277);
  }

  public void set(quickfix.fixlatest.component.TradePriceConditionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp get(quickfix.fixlatest.component.TradePriceConditionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp getTradePriceConditionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePriceConditionGrp());
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}

  public void set(quickfix.field.AlgorithmicTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.AlgorithmicTradeIndicator get(quickfix.field.AlgorithmicTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AlgorithmicTradeIndicator getAlgorithmicTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AlgorithmicTradeIndicator());
  }

  public boolean isSet(quickfix.field.AlgorithmicTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAlgorithmicTradeIndicator() {
    return isSetField(2667);
  }

  public void set(quickfix.field.MDEntryOriginator value) {
    setField(value);
  }

  public quickfix.field.MDEntryOriginator get(quickfix.field.MDEntryOriginator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryOriginator getMDEntryOriginator() throws FieldNotFound {
    return get(new quickfix.field.MDEntryOriginator());
  }

  public boolean isSet(quickfix.field.MDEntryOriginator field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryOriginator() {
    return isSetField(282);
  }

  public void set(quickfix.field.LocationID value) {
    setField(value);
  }

  public quickfix.field.LocationID get(quickfix.field.LocationID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LocationID getLocationID() throws FieldNotFound {
    return get(new quickfix.field.LocationID());
  }

  public boolean isSet(quickfix.field.LocationID field) {
    return isSetField(field);
  }

  public boolean isSetLocationID() {
    return isSetField(283);
  }

  public void set(quickfix.field.DeskID value) {
    setField(value);
  }

  public quickfix.field.DeskID get(quickfix.field.DeskID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskID getDeskID() throws FieldNotFound {
    return get(new quickfix.field.DeskID());
  }

  public boolean isSet(quickfix.field.DeskID field) {
    return isSetField(field);
  }

  public boolean isSetDeskID() {
    return isSetField(284);
  }

  public void set(quickfix.field.OpenCloseSettlFlag value) {
    setField(value);
  }

  public quickfix.field.OpenCloseSettlFlag get(quickfix.field.OpenCloseSettlFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound {
    return get(new quickfix.field.OpenCloseSettlFlag());
  }

  public boolean isSet(quickfix.field.OpenCloseSettlFlag field) {
    return isSetField(field);
  }

  public boolean isSetOpenCloseSettlFlag() {
    return isSetField(286);
  }

  public void set(quickfix.field.TimeInForce value) {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.TimeInForce());
  }

  public boolean isSet(quickfix.field.TimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetTimeInForce() {
    return isSetField(59);
  }

  public void set(quickfix.field.ExpireDate value) {
    setField(value);
  }

  public quickfix.field.ExpireDate get(quickfix.field.ExpireDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireDate getExpireDate() throws FieldNotFound {
    return get(new quickfix.field.ExpireDate());
  }

  public boolean isSet(quickfix.field.ExpireDate field) {
    return isSetField(field);
  }

  public boolean isSetExpireDate() {
    return isSetField(432);
  }

  public void set(quickfix.field.ExpireTime value) {
    setField(value);
  }

  public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
    return get(new quickfix.field.ExpireTime());
  }

  public boolean isSet(quickfix.field.ExpireTime field) {
    return isSetField(field);
  }

  public boolean isSetExpireTime() {
    return isSetField(126);
  }

  public void set(quickfix.field.ExposureDuration value) {
    setField(value);
  }

  public quickfix.field.ExposureDuration get(quickfix.field.ExposureDuration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDuration getExposureDuration() throws FieldNotFound {
    return get(new quickfix.field.ExposureDuration());
  }

  public boolean isSet(quickfix.field.ExposureDuration field) {
    return isSetField(field);
  }

  public boolean isSetExposureDuration() {
    return isSetField(1629);
  }

  public void set(quickfix.field.ExposureDurationUnit value) {
    setField(value);
  }

  public quickfix.field.ExposureDurationUnit get(quickfix.field.ExposureDurationUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDurationUnit getExposureDurationUnit() throws FieldNotFound {
    return get(new quickfix.field.ExposureDurationUnit());
  }

  public boolean isSet(quickfix.field.ExposureDurationUnit field) {
    return isSetField(field);
  }

  public boolean isSetExposureDurationUnit() {
    return isSetField(1916);
  }

  public void set(quickfix.field.MinQty value) {
    setField(value);
  }

  public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinQty getMinQty() throws FieldNotFound {
    return get(new quickfix.field.MinQty());
  }

  public boolean isSet(quickfix.field.MinQty field) {
    return isSetField(field);
  }

  public boolean isSetMinQty() {
    return isSetField(110);
  }

  public void set(quickfix.field.ExecInst value) {
    setField(value);
  }

  public quickfix.field.ExecInst get(quickfix.field.ExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInst getExecInst() throws FieldNotFound {
    return get(new quickfix.field.ExecInst());
  }

  public boolean isSet(quickfix.field.ExecInst field) {
    return isSetField(field);
  }

  public boolean isSetExecInst() {
    return isSetField(18);
  }

  public void set(quickfix.field.SellerDays value) {
    setField(value);
  }

  public quickfix.field.SellerDays get(quickfix.field.SellerDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SellerDays getSellerDays() throws FieldNotFound {
    return get(new quickfix.field.SellerDays());
  }

  public boolean isSet(quickfix.field.SellerDays field) {
    return isSetField(field);
  }

  public boolean isSetSellerDays() {
    return isSetField(287);
  }

  public void set(quickfix.field.OrderID value) {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound {
    return get(new quickfix.field.OrderID());
  }

  public boolean isSet(quickfix.field.OrderID field) {
    return isSetField(field);
  }

  public boolean isSetOrderID() {
    return isSetField(37);
  }

  public void set(quickfix.field.SecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryOrderID());
  }

  public boolean isSet(quickfix.field.SecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryOrderID() {
    return isSetField(198);
  }

  public void set(quickfix.field.QuoteEntryID value) {
    setField(value);
  }

  public quickfix.field.QuoteEntryID get(quickfix.field.QuoteEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteEntryID getQuoteEntryID() throws FieldNotFound {
    return get(new quickfix.field.QuoteEntryID());
  }

  public boolean isSet(quickfix.field.QuoteEntryID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteEntryID() {
    return isSetField(299);
  }

  public void set(quickfix.field.TradeID value) {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound {
    return get(new quickfix.field.TradeID());
  }

  public boolean isSet(quickfix.field.TradeID field) {
    return isSetField(field);
  }

  public boolean isSetTradeID() {
    return isSetField(1003);
  }

  public void set(quickfix.field.StrategyLinkID value) {
    setField(value);
  }

  public quickfix.field.StrategyLinkID get(quickfix.field.StrategyLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyLinkID getStrategyLinkID() throws FieldNotFound {
    return get(new quickfix.field.StrategyLinkID());
  }

  public boolean isSet(quickfix.field.StrategyLinkID field) {
    return isSetField(field);
  }

  public boolean isSetStrategyLinkID() {
    return isSetField(1851);
  }

  public void set(quickfix.field.MDEntryBuyer value) {
    setField(value);
  }

  public quickfix.field.MDEntryBuyer get(quickfix.field.MDEntryBuyer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryBuyer getMDEntryBuyer() throws FieldNotFound {
    return get(new quickfix.field.MDEntryBuyer());
  }

  public boolean isSet(quickfix.field.MDEntryBuyer field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryBuyer() {
    return isSetField(288);
  }

  public void set(quickfix.field.MDEntrySeller value) {
    setField(value);
  }

  public quickfix.field.MDEntrySeller get(quickfix.field.MDEntrySeller value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySeller getMDEntrySeller() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySeller());
  }

  public boolean isSet(quickfix.field.MDEntrySeller field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySeller() {
    return isSetField(289);
  }

  public void set(quickfix.field.NumberOfBuyOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfBuyOrders get(quickfix.field.NumberOfBuyOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfBuyOrders getNumberOfBuyOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfBuyOrders());
  }

  public boolean isSet(quickfix.field.NumberOfBuyOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfBuyOrders() {
    return isSetField(2449);
  }

  public void set(quickfix.field.NumberOfSellOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfSellOrders get(quickfix.field.NumberOfSellOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfSellOrders getNumberOfSellOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfSellOrders());
  }

  public boolean isSet(quickfix.field.NumberOfSellOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfSellOrders() {
    return isSetField(2450);
  }

  public void set(quickfix.field.NumberOfOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfOrders get(quickfix.field.NumberOfOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfOrders getNumberOfOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfOrders());
  }

  public boolean isSet(quickfix.field.NumberOfOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfOrders() {
    return isSetField(346);
  }

  public void set(quickfix.field.MDEntryPositionNo value) {
    setField(value);
  }

  public quickfix.field.MDEntryPositionNo get(quickfix.field.MDEntryPositionNo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
    return get(new quickfix.field.MDEntryPositionNo());
  }

  public boolean isSet(quickfix.field.MDEntryPositionNo field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryPositionNo() {
    return isSetField(290);
  }

  public void set(quickfix.field.Scope value) {
    setField(value);
  }

  public quickfix.field.Scope get(quickfix.field.Scope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Scope getScope() throws FieldNotFound {
    return get(new quickfix.field.Scope());
  }

  public boolean isSet(quickfix.field.Scope field) {
    return isSetField(field);
  }

  public boolean isSetScope() {
    return isSetField(546);
  }

  public void set(quickfix.field.PriceDelta value) {
    setField(value);
  }

  public quickfix.field.PriceDelta get(quickfix.field.PriceDelta value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceDelta getPriceDelta() throws FieldNotFound {
    return get(new quickfix.field.PriceDelta());
  }

  public boolean isSet(quickfix.field.PriceDelta field) {
    return isSetField(field);
  }

  public boolean isSetPriceDelta() {
    return isSetField(811);
  }

  public void set(quickfix.field.TrdType value) {
    setField(value);
  }

  public quickfix.field.TrdType get(quickfix.field.TrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdType getTrdType() throws FieldNotFound {
    return get(new quickfix.field.TrdType());
  }

  public boolean isSet(quickfix.field.TrdType field) {
    return isSetField(field);
  }

  public boolean isSetTrdType() {
    return isSetField(828);
  }

  public void set(quickfix.field.TrdSubType value) {
    setField(value);
  }

  public quickfix.field.TrdSubType get(quickfix.field.TrdSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdSubType getTrdSubType() throws FieldNotFound {
    return get(new quickfix.field.TrdSubType());
  }

  public boolean isSet(quickfix.field.TrdSubType field) {
    return isSetField(field);
  }

  public boolean isSetTrdSubType() {
    return isSetField(829);
  }

  public void set(quickfix.field.SecondaryTrdType value) {
    setField(value);
  }

  public quickfix.field.SecondaryTrdType get(quickfix.field.SecondaryTrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTrdType getSecondaryTrdType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTrdType());
  }

  public boolean isSet(quickfix.field.SecondaryTrdType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTrdType() {
    return isSetField(855);
  }

  public void set(quickfix.field.TertiaryTrdType value) {
    setField(value);
  }

  public quickfix.field.TertiaryTrdType get(quickfix.field.TertiaryTrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TertiaryTrdType getTertiaryTrdType() throws FieldNotFound {
    return get(new quickfix.field.TertiaryTrdType());
  }

  public boolean isSet(quickfix.field.TertiaryTrdType field) {
    return isSetField(field);
  }

  public boolean isSetTertiaryTrdType() {
    return isSetField(2896);
  }

  public void set(quickfix.field.RegulatoryReportType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportType get(quickfix.field.RegulatoryReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportType getRegulatoryReportType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportType());
  }

  public boolean isSet(quickfix.field.RegulatoryReportType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportType() {
    return isSetField(1934);
  }

  public void set(quickfix.field.ExecMethod value) {
    setField(value);
  }

  public quickfix.field.ExecMethod get(quickfix.field.ExecMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecMethod getExecMethod() throws FieldNotFound {
    return get(new quickfix.field.ExecMethod());
  }

  public boolean isSet(quickfix.field.ExecMethod field) {
    return isSetField(field);
  }

  public boolean isSetExecMethod() {
    return isSetField(2405);
  }

  public void set(quickfix.field.MatchType value) {
    setField(value);
  }

  public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchType getMatchType() throws FieldNotFound {
    return get(new quickfix.field.MatchType());
  }

  public boolean isSet(quickfix.field.MatchType field) {
    return isSetField(field);
  }

  public boolean isSetMatchType() {
    return isSetField(574);
  }

  public void set(quickfix.field.OrderCategory value) {
    setField(value);
  }

  public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
    return get(new quickfix.field.OrderCategory());
  }

  public boolean isSet(quickfix.field.OrderCategory field) {
    return isSetField(field);
  }

  public boolean isSetOrderCategory() {
    return isSetField(1115);
  }

  public void set(quickfix.field.TradePublishIndicator value) {
    setField(value);
  }

  public quickfix.field.TradePublishIndicator get(quickfix.field.TradePublishIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePublishIndicator getTradePublishIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradePublishIndicator());
  }

  public boolean isSet(quickfix.field.TradePublishIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradePublishIndicator() {
    return isSetField(1390);
  }

  public void set(quickfix.fixlatest.component.TrdRegPublicationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp get(quickfix.fixlatest.component.TrdRegPublicationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp getTrdRegPublicationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegPublicationGrp());
  }

  public void set(quickfix.field.NoTrdRegPublications value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegPublications get(quickfix.field.NoTrdRegPublications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegPublications getNoTrdRegPublications() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegPublications());
  }

  public boolean isSet(quickfix.field.NoTrdRegPublications field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegPublications() {
    return isSetField(2668);
  }

public static class NoTrdRegPublications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2669, 2670, 0};

  public NoTrdRegPublications() {
    super(2668, 2669, ORDER);
  }

  public void set(quickfix.field.TrdRegPublicationType value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationType get(quickfix.field.TrdRegPublicationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationType getTrdRegPublicationType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationType());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationType() {
    return isSetField(2669);
  }

  public void set(quickfix.field.TrdRegPublicationReason value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationReason get(quickfix.field.TrdRegPublicationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationReason getTrdRegPublicationReason() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationReason());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationReason field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationReason() {
    return isSetField(2670);
  }
}

  public void set(quickfix.field.IntraFirmTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.IntraFirmTradeIndicator get(quickfix.field.IntraFirmTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IntraFirmTradeIndicator getIntraFirmTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.IntraFirmTradeIndicator());
  }

  public boolean isSet(quickfix.field.IntraFirmTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetIntraFirmTradeIndicator() {
    return isSetField(2373);
  }

  public void set(quickfix.field.PreviouslyReported value) {
    setField(value);
  }

  public quickfix.field.PreviouslyReported get(quickfix.field.PreviouslyReported value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviouslyReported getPreviouslyReported() throws FieldNotFound {
    return get(new quickfix.field.PreviouslyReported());
  }

  public boolean isSet(quickfix.field.PreviouslyReported field) {
    return isSetField(field);
  }

  public boolean isSetPreviouslyReported() {
    return isSetField(570);
  }

  public void set(quickfix.fixlatest.component.RelatedTradeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedTradeGrp get(quickfix.fixlatest.component.RelatedTradeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedTradeGrp getRelatedTradeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedTradeGrp());
  }

  public void set(quickfix.field.NoRelatedTrades value) {
    setField(value);
  }

  public quickfix.field.NoRelatedTrades get(quickfix.field.NoRelatedTrades value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedTrades getNoRelatedTrades() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedTrades());
  }

  public boolean isSet(quickfix.field.NoRelatedTrades field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedTrades() {
    return isSetField(1855);
  }

public static class NoRelatedTrades extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1856, 1857, 2103, 1858, 1859, 1860, 0};

  public NoRelatedTrades() {
    super(1855, 1856, ORDER);
  }

  public void set(quickfix.field.RelatedTradeID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeID get(quickfix.field.RelatedTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeID getRelatedTradeID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeID());
  }

  public boolean isSet(quickfix.field.RelatedTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeID() {
    return isSetField(1856);
  }

  public void set(quickfix.field.RelatedTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeIDSource get(quickfix.field.RelatedTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeIDSource getRelatedTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeIDSource() {
    return isSetField(1857);
  }

  public void set(quickfix.field.RelatedRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource get(quickfix.field.RelatedRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource getRelatedRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedRegulatoryTradeIDSource() {
    return isSetField(2103);
  }

  public void set(quickfix.field.RelatedTradeDate value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeDate get(quickfix.field.RelatedTradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeDate getRelatedTradeDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeDate());
  }

  public boolean isSet(quickfix.field.RelatedTradeDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeDate() {
    return isSetField(1858);
  }

  public void set(quickfix.field.RelatedTradeMarketID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeMarketID get(quickfix.field.RelatedTradeMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeMarketID getRelatedTradeMarketID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeMarketID());
  }

  public boolean isSet(quickfix.field.RelatedTradeMarketID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeMarketID() {
    return isSetField(1859);
  }

  public void set(quickfix.field.RelatedTradeQuantity value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeQuantity get(quickfix.field.RelatedTradeQuantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeQuantity getRelatedTradeQuantity() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeQuantity());
  }

  public boolean isSet(quickfix.field.RelatedTradeQuantity field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeQuantity() {
    return isSetField(1860);
  }
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

  public void set(quickfix.field.MDPriceLevel value) {
    setField(value);
  }

  public quickfix.field.MDPriceLevel get(quickfix.field.MDPriceLevel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDPriceLevel getMDPriceLevel() throws FieldNotFound {
    return get(new quickfix.field.MDPriceLevel());
  }

  public boolean isSet(quickfix.field.MDPriceLevel field) {
    return isSetField(field);
  }

  public boolean isSetMDPriceLevel() {
    return isSetField(1023);
  }

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.MDOriginType value) {
    setField(value);
  }

  public quickfix.field.MDOriginType get(quickfix.field.MDOriginType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDOriginType getMDOriginType() throws FieldNotFound {
    return get(new quickfix.field.MDOriginType());
  }

  public boolean isSet(quickfix.field.MDOriginType field) {
    return isSetField(field);
  }

  public boolean isSetMDOriginType() {
    return isSetField(1024);
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

  public void set(quickfix.field.TradeVolume value) {
    setField(value);
  }

  public quickfix.field.TradeVolume get(quickfix.field.TradeVolume value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeVolume getTradeVolume() throws FieldNotFound {
    return get(new quickfix.field.TradeVolume());
  }

  public boolean isSet(quickfix.field.TradeVolume field) {
    return isSetField(field);
  }

  public boolean isSetTradeVolume() {
    return isSetField(1020);
  }

  public void set(quickfix.fixlatest.component.PriceLimits component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceLimits get(quickfix.fixlatest.component.PriceLimits component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceLimits getPriceLimitsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceLimits());
  }

  public void set(quickfix.field.MaxPriceVariation value) {
    setField(value);
  }

  public quickfix.field.MaxPriceVariation get(quickfix.field.MaxPriceVariation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaxPriceVariation getMaxPriceVariation() throws FieldNotFound {
    return get(new quickfix.field.MaxPriceVariation());
  }

  public boolean isSet(quickfix.field.MaxPriceVariation field) {
    return isSetField(field);
  }

  public boolean isSetMaxPriceVariation() {
    return isSetField(1143);
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

  public void set(quickfix.field.SettlType value) {
    setField(value);
  }

  public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlType getSettlType() throws FieldNotFound {
    return get(new quickfix.field.SettlType());
  }

  public boolean isSet(quickfix.field.SettlType field) {
    return isSetField(field);
  }

  public boolean isSetSettlType() {
    return isSetField(63);
  }

  public void set(quickfix.field.SettlDate value) {
    setField(value);
  }

  public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
    return get(new quickfix.field.SettlDate());
  }

  public boolean isSet(quickfix.field.SettlDate field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate() {
    return isSetField(64);
  }

  public void set(quickfix.field.MDQuoteType value) {
    setField(value);
  }

  public quickfix.field.MDQuoteType get(quickfix.field.MDQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDQuoteType getMDQuoteType() throws FieldNotFound {
    return get(new quickfix.field.MDQuoteType());
  }

  public boolean isSet(quickfix.field.MDQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetMDQuoteType() {
    return isSetField(1070);
  }

  public void set(quickfix.field.RptSeq value) {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
    return get(new quickfix.field.RptSeq());
  }

  public boolean isSet(quickfix.field.RptSeq field) {
    return isSetField(field);
  }

  public boolean isSetRptSeq() {
    return isSetField(83);
  }

  public void set(quickfix.field.DealingCapacity value) {
    setField(value);
  }

  public quickfix.field.DealingCapacity get(quickfix.field.DealingCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DealingCapacity getDealingCapacity() throws FieldNotFound {
    return get(new quickfix.field.DealingCapacity());
  }

  public boolean isSet(quickfix.field.DealingCapacity field) {
    return isSetField(field);
  }

  public boolean isSetDealingCapacity() {
    return isSetField(1048);
  }

  public void set(quickfix.field.MDEntrySpotRate value) {
    setField(value);
  }

  public quickfix.field.MDEntrySpotRate get(quickfix.field.MDEntrySpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySpotRate getMDEntrySpotRate() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySpotRate());
  }

  public boolean isSet(quickfix.field.MDEntrySpotRate field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySpotRate() {
    return isSetField(1026);
  }

  public void set(quickfix.field.MDEntryForwardPoints value) {
    setField(value);
  }

  public quickfix.field.MDEntryForwardPoints get(quickfix.field.MDEntryForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryForwardPoints getMDEntryForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.MDEntryForwardPoints());
  }

  public boolean isSet(quickfix.field.MDEntryForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryForwardPoints() {
    return isSetField(1027);
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

  public void set(quickfix.field.AggressorTime value) {
    setField(value);
  }

  public quickfix.field.AggressorTime get(quickfix.field.AggressorTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorTime getAggressorTime() throws FieldNotFound {
    return get(new quickfix.field.AggressorTime());
  }

  public boolean isSet(quickfix.field.AggressorTime field) {
    return isSetField(field);
  }

  public boolean isSetAggressorTime() {
    return isSetField(2445);
  }

  public void set(quickfix.field.AggressorSide value) {
    setField(value);
  }

  public quickfix.field.AggressorSide get(quickfix.field.AggressorSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorSide getAggressorSide() throws FieldNotFound {
    return get(new quickfix.field.AggressorSide());
  }

  public boolean isSet(quickfix.field.AggressorSide field) {
    return isSetField(field);
  }

  public boolean isSetAggressorSide() {
    return isSetField(2446);
  }

  public void set(quickfix.field.LegRefID value) {
    setField(value);
  }

  public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
    return get(new quickfix.field.LegRefID());
  }

  public boolean isSet(quickfix.field.LegRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegRefID() {
    return isSetField(654);
  }
}

  public void set(quickfix.field.ApplQueueDepth value) {
    setField(value);
  }

  public quickfix.field.ApplQueueDepth get(quickfix.field.ApplQueueDepth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplQueueDepth getApplQueueDepth() throws FieldNotFound {
    return get(new quickfix.field.ApplQueueDepth());
  }

  public boolean isSet(quickfix.field.ApplQueueDepth field) {
    return isSetField(field);
  }

  public boolean isSetApplQueueDepth() {
    return isSetField(813);
  }

  public void set(quickfix.field.ApplQueueResolution value) {
    setField(value);
  }

  public quickfix.field.ApplQueueResolution get(quickfix.field.ApplQueueResolution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplQueueResolution getApplQueueResolution() throws FieldNotFound {
    return get(new quickfix.field.ApplQueueResolution());
  }

  public boolean isSet(quickfix.field.ApplQueueResolution field) {
    return isSetField(field);
  }

  public boolean isSetApplQueueResolution() {
    return isSetField(814);
  }

  public void set(quickfix.fixlatest.component.RoutingGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RoutingGrp get(quickfix.fixlatest.component.RoutingGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RoutingGrp getRoutingGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RoutingGrp());
  }

  public void set(quickfix.field.NoRoutingIDs value) {
    setField(value);
  }

  public quickfix.field.NoRoutingIDs get(quickfix.field.NoRoutingIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRoutingIDs getNoRoutingIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRoutingIDs());
  }

  public boolean isSet(quickfix.field.NoRoutingIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRoutingIDs() {
    return isSetField(215);
  }

public static class NoRoutingIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {216, 217, 0};

  public NoRoutingIDs() {
    super(215, 216, ORDER);
  }

  public void set(quickfix.field.RoutingType value) {
    setField(value);
  }

  public quickfix.field.RoutingType get(quickfix.field.RoutingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingType getRoutingType() throws FieldNotFound {
    return get(new quickfix.field.RoutingType());
  }

  public boolean isSet(quickfix.field.RoutingType field) {
    return isSetField(field);
  }

  public boolean isSetRoutingType() {
    return isSetField(216);
  }

  public void set(quickfix.field.RoutingID value) {
    setField(value);
  }

  public quickfix.field.RoutingID get(quickfix.field.RoutingID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingID getRoutingID() throws FieldNotFound {
    return get(new quickfix.field.RoutingID());
  }

  public boolean isSet(quickfix.field.RoutingID field) {
    return isSetField(field);
  }

  public boolean isSetRoutingID() {
    return isSetField(217);
  }
}
}
