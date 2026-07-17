/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class ExecutionAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BN";

  public ExecutionAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public ExecutionAck (quickfix.field.OrderID orderID, quickfix.field.ExecAckStatus execAckStatus, quickfix.field.ExecID execID, quickfix.field.Side side) {
    this();
    setField(orderID);
    setField(execAckStatus);
    setField(execID);
    setField(side);
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

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.ExecAckStatus value) {
    setField(value);
  }

  public quickfix.field.ExecAckStatus get(quickfix.field.ExecAckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecAckStatus getExecAckStatus() throws FieldNotFound {
    return get(new quickfix.field.ExecAckStatus());
  }

  public boolean isSet(quickfix.field.ExecAckStatus field) {
    return isSetField(field);
  }

  public boolean isSetExecAckStatus() {
    return isSetField(1036);
  }

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }

  public void set(quickfix.field.DKReason value) {
    setField(value);
  }

  public quickfix.field.DKReason get(quickfix.field.DKReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DKReason getDKReason() throws FieldNotFound {
    return get(new quickfix.field.DKReason());
  }

  public boolean isSet(quickfix.field.DKReason field) {
    return isSetField(field);
  }

  public boolean isSetDKReason() {
    return isSetField(127);
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

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
  }

  public void set(quickfix.field.LastQty value) {
    setField(value);
  }

  public quickfix.field.LastQty get(quickfix.field.LastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastQty getLastQty() throws FieldNotFound {
    return get(new quickfix.field.LastQty());
  }

  public boolean isSet(quickfix.field.LastQty field) {
    return isSetField(field);
  }

  public boolean isSetLastQty() {
    return isSetField(32);
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

  public void set(quickfix.field.LastParPx value) {
    setField(value);
  }

  public quickfix.field.LastParPx get(quickfix.field.LastParPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastParPx getLastParPx() throws FieldNotFound {
    return get(new quickfix.field.LastParPx());
  }

  public boolean isSet(quickfix.field.LastParPx field) {
    return isSetField(field);
  }

  public boolean isSetLastParPx() {
    return isSetField(669);
  }

  public void set(quickfix.field.CumQty value) {
    setField(value);
  }

  public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CumQty getCumQty() throws FieldNotFound {
    return get(new quickfix.field.CumQty());
  }

  public boolean isSet(quickfix.field.CumQty field) {
    return isSetField(field);
  }

  public boolean isSetCumQty() {
    return isSetField(14);
  }

  public void set(quickfix.field.AvgPx value) {
    setField(value);
  }

  public quickfix.field.AvgPx get(quickfix.field.AvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPx getAvgPx() throws FieldNotFound {
    return get(new quickfix.field.AvgPx());
  }

  public boolean isSet(quickfix.field.AvgPx field) {
    return isSetField(field);
  }

  public boolean isSetAvgPx() {
    return isSetField(6);
  }

  public void set(quickfix.fixlatest.component.RegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RegulatoryTradeIDGrp get(quickfix.fixlatest.component.RegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RegulatoryTradeIDGrp getRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoRegulatoryTradeIDs get(quickfix.field.NoRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRegulatoryTradeIDs getNoRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRegulatoryTradeIDs() {
    return isSetField(1907);
  }

public static class NoRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1903, 1905, 1904, 1906, 2411, 2397, 0};

  public NoRegulatoryTradeIDs() {
    super(1907, 1903, ORDER);
  }

  public void set(quickfix.field.RegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeID get(quickfix.field.RegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeID getRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeID() {
    return isSetField(1903);
  }

  public void set(quickfix.field.RegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDSource get(quickfix.field.RegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDSource getRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDSource() {
    return isSetField(1905);
  }

  public void set(quickfix.field.RegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDEvent get(quickfix.field.RegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDEvent getRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDEvent() {
    return isSetField(1904);
  }

  public void set(quickfix.field.RegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDType get(quickfix.field.RegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDType getRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDType() {
    return isSetField(1906);
  }

  public void set(quickfix.field.RegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryLegRefID get(quickfix.field.RegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryLegRefID getRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.RegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryLegRefID() {
    return isSetField(2411);
  }

  public void set(quickfix.field.RegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDScope get(quickfix.field.RegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDScope getRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDScope() {
    return isSetField(2397);
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
}
