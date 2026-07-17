/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class TradeCaptureReportRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AQ";

  public TradeCaptureReportRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public TradeCaptureReportRequestAck (quickfix.field.TradeRequestID tradeRequestID, quickfix.field.TradeRequestType tradeRequestType, quickfix.field.TradeRequestResult tradeRequestResult, quickfix.field.TradeRequestStatus tradeRequestStatus) {
    this();
    setField(tradeRequestID);
    setField(tradeRequestType);
    setField(tradeRequestResult);
    setField(tradeRequestStatus);
  }

  public void set(quickfix.field.TradeRequestID value) {
    setField(value);
  }

  public quickfix.field.TradeRequestID get(quickfix.field.TradeRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeRequestID getTradeRequestID() throws FieldNotFound {
    return get(new quickfix.field.TradeRequestID());
  }

  public boolean isSet(quickfix.field.TradeRequestID field) {
    return isSetField(field);
  }

  public boolean isSetTradeRequestID() {
    return isSetField(568);
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

  public void set(quickfix.field.SecondaryTradeID value) {
    setField(value);
  }

  public quickfix.field.SecondaryTradeID get(quickfix.field.SecondaryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTradeID getSecondaryTradeID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTradeID());
  }

  public boolean isSet(quickfix.field.SecondaryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTradeID() {
    return isSetField(1040);
  }

  public void set(quickfix.field.FirmTradeID value) {
    setField(value);
  }

  public quickfix.field.FirmTradeID get(quickfix.field.FirmTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeID getFirmTradeID() throws FieldNotFound {
    return get(new quickfix.field.FirmTradeID());
  }

  public boolean isSet(quickfix.field.FirmTradeID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTradeID() {
    return isSetField(1041);
  }

  public void set(quickfix.field.SecondaryFirmTradeID value) {
    setField(value);
  }

  public quickfix.field.SecondaryFirmTradeID get(quickfix.field.SecondaryFirmTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryFirmTradeID getSecondaryFirmTradeID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryFirmTradeID());
  }

  public boolean isSet(quickfix.field.SecondaryFirmTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryFirmTradeID() {
    return isSetField(1042);
  }

  public void set(quickfix.field.TradeRequestType value) {
    setField(value);
  }

  public quickfix.field.TradeRequestType get(quickfix.field.TradeRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeRequestType getTradeRequestType() throws FieldNotFound {
    return get(new quickfix.field.TradeRequestType());
  }

  public boolean isSet(quickfix.field.TradeRequestType field) {
    return isSetField(field);
  }

  public boolean isSetTradeRequestType() {
    return isSetField(569);
  }

  public void set(quickfix.field.SubscriptionRequestType value) {
    setField(value);
  }

  public quickfix.field.SubscriptionRequestType get(quickfix.field.SubscriptionRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
    return get(new quickfix.field.SubscriptionRequestType());
  }

  public boolean isSet(quickfix.field.SubscriptionRequestType field) {
    return isSetField(field);
  }

  public boolean isSetSubscriptionRequestType() {
    return isSetField(263);
  }

  public void set(quickfix.field.TotNumTradeReports value) {
    setField(value);
  }

  public quickfix.field.TotNumTradeReports get(quickfix.field.TotNumTradeReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNumTradeReports getTotNumTradeReports() throws FieldNotFound {
    return get(new quickfix.field.TotNumTradeReports());
  }

  public boolean isSet(quickfix.field.TotNumTradeReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNumTradeReports() {
    return isSetField(748);
  }

  public void set(quickfix.field.TradeRequestResult value) {
    setField(value);
  }

  public quickfix.field.TradeRequestResult get(quickfix.field.TradeRequestResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeRequestResult getTradeRequestResult() throws FieldNotFound {
    return get(new quickfix.field.TradeRequestResult());
  }

  public boolean isSet(quickfix.field.TradeRequestResult field) {
    return isSetField(field);
  }

  public boolean isSetTradeRequestResult() {
    return isSetField(749);
  }

  public void set(quickfix.field.TradeRequestStatus value) {
    setField(value);
  }

  public quickfix.field.TradeRequestStatus get(quickfix.field.TradeRequestStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeRequestStatus getTradeRequestStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeRequestStatus());
  }

  public boolean isSet(quickfix.field.TradeRequestStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeRequestStatus() {
    return isSetField(750);
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

  public void set(quickfix.field.MultiLegReportingType value) {
    setField(value);
  }

  public quickfix.field.MultiLegReportingType get(quickfix.field.MultiLegReportingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound {
    return get(new quickfix.field.MultiLegReportingType());
  }

  public boolean isSet(quickfix.field.MultiLegReportingType field) {
    return isSetField(field);
  }

  public boolean isSetMultiLegReportingType() {
    return isSetField(442);
  }

  public void set(quickfix.field.ResponseTransportType value) {
    setField(value);
  }

  public quickfix.field.ResponseTransportType get(quickfix.field.ResponseTransportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ResponseTransportType getResponseTransportType() throws FieldNotFound {
    return get(new quickfix.field.ResponseTransportType());
  }

  public boolean isSet(quickfix.field.ResponseTransportType field) {
    return isSetField(field);
  }

  public boolean isSetResponseTransportType() {
    return isSetField(725);
  }

  public void set(quickfix.field.ResponseDestination value) {
    setField(value);
  }

  public quickfix.field.ResponseDestination get(quickfix.field.ResponseDestination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ResponseDestination getResponseDestination() throws FieldNotFound {
    return get(new quickfix.field.ResponseDestination());
  }

  public boolean isSet(quickfix.field.ResponseDestination field) {
    return isSetField(field);
  }

  public boolean isSetResponseDestination() {
    return isSetField(726);
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

  public void set(quickfix.field.MessageEventSource value) {
    setField(value);
  }

  public quickfix.field.MessageEventSource get(quickfix.field.MessageEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MessageEventSource getMessageEventSource() throws FieldNotFound {
    return get(new quickfix.field.MessageEventSource());
  }

  public boolean isSet(quickfix.field.MessageEventSource field) {
    return isSetField(field);
  }

  public boolean isSetMessageEventSource() {
    return isSetField(1011);
  }
}
