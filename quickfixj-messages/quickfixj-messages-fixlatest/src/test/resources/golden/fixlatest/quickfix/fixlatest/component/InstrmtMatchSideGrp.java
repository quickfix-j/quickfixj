/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrmtMatchSideGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1889, };
  protected int[] getGroupFields() { return componentGroups; }

  public InstrmtMatchSideGrp() {
    super();
  }

  public void set(quickfix.field.NoInstrmtMatchSides value) {
    setField(value);
  }

  public quickfix.field.NoInstrmtMatchSides get(quickfix.field.NoInstrmtMatchSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrmtMatchSides getNoInstrmtMatchSides() throws FieldNotFound {
    return get(new quickfix.field.NoInstrmtMatchSides());
  }

  public boolean isSet(quickfix.field.NoInstrmtMatchSides field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrmtMatchSides() {
    return isSetField(1889);
  }

public static class NoInstrmtMatchSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 555, 711, 1891, 53, 15, 120, 854, 32, 423, 31, 30, 1890, 0};

  public NoInstrmtMatchSides() {
    super(1889, 55, ORDER);
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

  public void set(quickfix.field.TrdMatchSubID value) {
    setField(value);
  }

  public quickfix.field.TrdMatchSubID get(quickfix.field.TrdMatchSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdMatchSubID getTrdMatchSubID() throws FieldNotFound {
    return get(new quickfix.field.TrdMatchSubID());
  }

  public boolean isSet(quickfix.field.TrdMatchSubID field) {
    return isSetField(field);
  }

  public boolean isSetTrdMatchSubID() {
    return isSetField(1891);
  }

  public void set(quickfix.field.Quantity value) {
    setField(value);
  }

  public quickfix.field.Quantity get(quickfix.field.Quantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Quantity getQuantity() throws FieldNotFound {
    return get(new quickfix.field.Quantity());
  }

  public boolean isSet(quickfix.field.Quantity field) {
    return isSetField(field);
  }

  public boolean isSetQuantity() {
    return isSetField(53);
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

  public void set(quickfix.field.QtyType value) {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound {
    return get(new quickfix.field.QtyType());
  }

  public boolean isSet(quickfix.field.QtyType field) {
    return isSetField(field);
  }

  public boolean isSetQtyType() {
    return isSetField(854);
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

  public void set(quickfix.field.LastMkt value) {
    setField(value);
  }

  public quickfix.field.LastMkt get(quickfix.field.LastMkt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastMkt getLastMkt() throws FieldNotFound {
    return get(new quickfix.field.LastMkt());
  }

  public boolean isSet(quickfix.field.LastMkt field) {
    return isSetField(field);
  }

  public boolean isSetLastMkt() {
    return isSetField(30);
  }

  public void set(quickfix.fixlatest.component.TrdMatchSideGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdMatchSideGrp get(quickfix.fixlatest.component.TrdMatchSideGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdMatchSideGrp getTrdMatchSideGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdMatchSideGrp());
  }

  public void set(quickfix.field.NoTrdMatchSides value) {
    setField(value);
  }

  public quickfix.field.NoTrdMatchSides get(quickfix.field.NoTrdMatchSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdMatchSides getNoTrdMatchSides() throws FieldNotFound {
    return get(new quickfix.field.NoTrdMatchSides());
  }

  public boolean isSet(quickfix.field.NoTrdMatchSides field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdMatchSides() {
    return isSetField(1890);
  }

public static class NoTrdMatchSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {54, 1427, 1900, 1506, 1005, 1428, 1429, 1009, 1597, 1599, 1598, 1006, 1007, 1008, 430, 1154, 1155, 453, 578, 579, 376, 2404, 2351, 2352, 377, 582, 943, 77, 825, 826, 591, 70, 78, 1072, 1057, 1139, 1690, 1115, 819, 1731, 1898, 1899, 635, 37, 198, 11, 526, 66, 1080, 1081, 1431, 73, 1091, 40, 44, 99, 18, 39, 38, 152, 516, 468, 469, 151, 14, 59, 126, 1624, 2362, 1629, 1916, 1138, 1082, 1608, 2828, 1083, 1084, 1085, 1086, 1087, 1088, 528, 529, 775, 1432, 1724, 2593, 2704, 821, 1093, 483, 586, 2766, 1892, 1031, 1032, 58, 354, 355, 0};

  public NoTrdMatchSides() {
    super(1890, 54, ORDER);
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

  public void set(quickfix.field.SideExecID value) {
    setField(value);
  }

  public quickfix.field.SideExecID get(quickfix.field.SideExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecID getSideExecID() throws FieldNotFound {
    return get(new quickfix.field.SideExecID());
  }

  public boolean isSet(quickfix.field.SideExecID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecID() {
    return isSetField(1427);
  }

  public void set(quickfix.field.SideExecRefID value) {
    setField(value);
  }

  public quickfix.field.SideExecRefID get(quickfix.field.SideExecRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecRefID getSideExecRefID() throws FieldNotFound {
    return get(new quickfix.field.SideExecRefID());
  }

  public boolean isSet(quickfix.field.SideExecRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecRefID() {
    return isSetField(1900);
  }

  public void set(quickfix.field.SideTradeID value) {
    setField(value);
  }

  public quickfix.field.SideTradeID get(quickfix.field.SideTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeID getSideTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeID());
  }

  public boolean isSet(quickfix.field.SideTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeID() {
    return isSetField(1506);
  }

  public void set(quickfix.field.SideTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportID());
  }

  public boolean isSet(quickfix.field.SideTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportID() {
    return isSetField(1005);
  }

  public void set(quickfix.field.OrderDelay value) {
    setField(value);
  }

  public quickfix.field.OrderDelay get(quickfix.field.OrderDelay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelay getOrderDelay() throws FieldNotFound {
    return get(new quickfix.field.OrderDelay());
  }

  public boolean isSet(quickfix.field.OrderDelay field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelay() {
    return isSetField(1428);
  }

  public void set(quickfix.field.OrderDelayUnit value) {
    setField(value);
  }

  public quickfix.field.OrderDelayUnit get(quickfix.field.OrderDelayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelayUnit getOrderDelayUnit() throws FieldNotFound {
    return get(new quickfix.field.OrderDelayUnit());
  }

  public boolean isSet(quickfix.field.OrderDelayUnit field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelayUnit() {
    return isSetField(1429);
  }

  public void set(quickfix.field.SideLastQty value) {
    setField(value);
  }

  public quickfix.field.SideLastQty get(quickfix.field.SideLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLastQty getSideLastQty() throws FieldNotFound {
    return get(new quickfix.field.SideLastQty());
  }

  public boolean isSet(quickfix.field.SideLastQty field) {
    return isSetField(field);
  }

  public boolean isSetSideLastQty() {
    return isSetField(1009);
  }

  public void set(quickfix.field.SideClearingTradePrice value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePrice get(quickfix.field.SideClearingTradePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePrice getSideClearingTradePrice() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePrice());
  }

  public boolean isSet(quickfix.field.SideClearingTradePrice field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePrice() {
    return isSetField(1597);
  }

  public void set(quickfix.field.SidePriceDifferential value) {
    setField(value);
  }

  public quickfix.field.SidePriceDifferential get(quickfix.field.SidePriceDifferential value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SidePriceDifferential getSidePriceDifferential() throws FieldNotFound {
    return get(new quickfix.field.SidePriceDifferential());
  }

  public boolean isSet(quickfix.field.SidePriceDifferential field) {
    return isSetField(field);
  }

  public boolean isSetSidePriceDifferential() {
    return isSetField(1599);
  }

  public void set(quickfix.field.SideClearingTradePriceType value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePriceType get(quickfix.field.SideClearingTradePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePriceType getSideClearingTradePriceType() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePriceType());
  }

  public boolean isSet(quickfix.field.SideClearingTradePriceType field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePriceType() {
    return isSetField(1598);
  }

  public void set(quickfix.field.SideFillStationCd value) {
    setField(value);
  }

  public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound {
    return get(new quickfix.field.SideFillStationCd());
  }

  public boolean isSet(quickfix.field.SideFillStationCd field) {
    return isSetField(field);
  }

  public boolean isSetSideFillStationCd() {
    return isSetField(1006);
  }

  public void set(quickfix.field.SideReasonCd value) {
    setField(value);
  }

  public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound {
    return get(new quickfix.field.SideReasonCd());
  }

  public boolean isSet(quickfix.field.SideReasonCd field) {
    return isSetField(field);
  }

  public boolean isSetSideReasonCd() {
    return isSetField(1007);
  }

  public void set(quickfix.field.SideTrdSubTyp value) {
    setField(value);
  }

  public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdSubTyp());
  }

  public boolean isSet(quickfix.field.SideTrdSubTyp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdSubTyp() {
    return isSetField(1008);
  }

  public void set(quickfix.field.NetGrossInd value) {
    setField(value);
  }

  public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
    return get(new quickfix.field.NetGrossInd());
  }

  public boolean isSet(quickfix.field.NetGrossInd field) {
    return isSetField(field);
  }

  public boolean isSetNetGrossInd() {
    return isSetField(430);
  }

  public void set(quickfix.field.SideCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCurrency get(quickfix.field.SideCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrency getSideCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCurrency());
  }

  public boolean isSet(quickfix.field.SideCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrency() {
    return isSetField(1154);
  }

  public void set(quickfix.field.SideSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SideSettlCurrency get(quickfix.field.SideSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideSettlCurrency getSideSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideSettlCurrency());
  }

  public boolean isSet(quickfix.field.SideSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideSettlCurrency() {
    return isSetField(1155);
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

  public void set(quickfix.field.TradeInputSource value) {
    setField(value);
  }

  public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
    return get(new quickfix.field.TradeInputSource());
  }

  public boolean isSet(quickfix.field.TradeInputSource field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputSource() {
    return isSetField(578);
  }

  public void set(quickfix.field.TradeInputDevice value) {
    setField(value);
  }

  public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
    return get(new quickfix.field.TradeInputDevice());
  }

  public boolean isSet(quickfix.field.TradeInputDevice field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputDevice() {
    return isSetField(579);
  }

  public void set(quickfix.field.ComplianceID value) {
    setField(value);
  }

  public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
    return get(new quickfix.field.ComplianceID());
  }

  public boolean isSet(quickfix.field.ComplianceID field) {
    return isSetField(field);
  }

  public boolean isSetComplianceID() {
    return isSetField(376);
  }

  public void set(quickfix.field.ComplianceText value) {
    setField(value);
  }

  public quickfix.field.ComplianceText get(quickfix.field.ComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceText getComplianceText() throws FieldNotFound {
    return get(new quickfix.field.ComplianceText());
  }

  public boolean isSet(quickfix.field.ComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetComplianceText() {
    return isSetField(2404);
  }

  public void set(quickfix.field.EncodedComplianceTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceTextLen get(quickfix.field.EncodedComplianceTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceTextLen getEncodedComplianceTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceTextLen());
  }

  public boolean isSet(quickfix.field.EncodedComplianceTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceTextLen() {
    return isSetField(2351);
  }

  public void set(quickfix.field.EncodedComplianceText value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceText get(quickfix.field.EncodedComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceText getEncodedComplianceText() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceText());
  }

  public boolean isSet(quickfix.field.EncodedComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceText() {
    return isSetField(2352);
  }

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
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

  public void set(quickfix.field.TimeBracket value) {
    setField(value);
  }

  public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
    return get(new quickfix.field.TimeBracket());
  }

  public boolean isSet(quickfix.field.TimeBracket field) {
    return isSetField(field);
  }

  public boolean isSetTimeBracket() {
    return isSetField(943);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
  }

  public void set(quickfix.field.ExchangeRule value) {
    setField(value);
  }

  public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
    return get(new quickfix.field.ExchangeRule());
  }

  public boolean isSet(quickfix.field.ExchangeRule field) {
    return isSetField(field);
  }

  public boolean isSetExchangeRule() {
    return isSetField(825);
  }

  public void set(quickfix.field.TradeAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocIndicator());
  }

  public boolean isSet(quickfix.field.TradeAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocIndicator() {
    return isSetField(826);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.TrdAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdAllocGrp get(quickfix.fixlatest.component.TrdAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdAllocGrp getTrdAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 1593, 2727, 1908, 1729, 756, 209, 80, 2515, 1752, 1753, 1754, 1755, 993, 1002, 989, 1136, 1844, 1840, 1735, 161, 360, 361, 1732, 1733, 1734, 2392, 2393, 2653, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.ParentAllocID value) {
    setField(value);
  }

  public quickfix.field.ParentAllocID get(quickfix.field.ParentAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentAllocID getParentAllocID() throws FieldNotFound {
    return get(new quickfix.field.ParentAllocID());
  }

  public boolean isSet(quickfix.field.ParentAllocID field) {
    return isSetField(field);
  }

  public boolean isSetParentAllocID() {
    return isSetField(1593);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp get(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp getAllocRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoAllocRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs get(quickfix.field.NoAllocRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs getNoAllocRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoAllocRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocRegulatoryTradeIDs() {
    return isSetField(1908);
  }

public static class NoAllocRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1909, 1910, 1911, 1912, 2406, 2399, 0};

  public NoAllocRegulatoryTradeIDs() {
    super(1908, 1909, ORDER);
  }

  public void set(quickfix.field.AllocRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeID get(quickfix.field.AllocRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeID getAllocRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeID() {
    return isSetField(1909);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDSource get(quickfix.field.AllocRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDSource getAllocRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDSource() {
    return isSetField(1910);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent get(quickfix.field.AllocRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent getAllocRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDEvent() {
    return isSetField(1911);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDType get(quickfix.field.AllocRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDType getAllocRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDType() {
    return isSetField(1912);
  }

  public void set(quickfix.field.AllocRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryLegRefID get(quickfix.field.AllocRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryLegRefID getAllocRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryLegRefID() {
    return isSetField(2406);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDScope get(quickfix.field.AllocRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDScope getAllocRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDScope() {
    return isSetField(2399);
  }
}

  public void set(quickfix.field.FirmMnemonic value) {
    setField(value);
  }

  public quickfix.field.FirmMnemonic get(quickfix.field.FirmMnemonic value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmMnemonic getFirmMnemonic() throws FieldNotFound {
    return get(new quickfix.field.FirmMnemonic());
  }

  public boolean isSet(quickfix.field.FirmMnemonic field) {
    return isSetField(field);
  }

  public boolean isSetFirmMnemonic() {
    return isSetField(1729);
  }

  public void set(quickfix.fixlatest.component.NestedParties2 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties2 get(quickfix.fixlatest.component.NestedParties2 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties2 getNestedParties2Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties2());
  }

  public void set(quickfix.field.NoNested2PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs() {
    return isSetField(756);
  }

public static class NoNested2PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {757, 758, 759, 2381, 806, 0};

  public NoNested2PartyIDs() {
    super(756, 757, ORDER);
  }

  public void set(quickfix.field.Nested2PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyID());
  }

  public boolean isSet(quickfix.field.Nested2PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID() {
    return isSetField(757);
  }

  public void set(quickfix.field.Nested2PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource() {
    return isSetField(758);
  }

  public void set(quickfix.field.Nested2PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRole());
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole() {
    return isSetField(759);
  }

  public void set(quickfix.field.Nested2PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRoleQualifier get(quickfix.field.Nested2PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRoleQualifier getNested2PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested2PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRoleQualifier() {
    return isSetField(2381);
  }

  public void set(quickfix.fixlatest.component.NstdPtys2SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp get(quickfix.fixlatest.component.NstdPtys2SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp getNstdPtys2SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys2SubGrp());
  }

  public void set(quickfix.field.NoNested2PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs() {
    return isSetField(806);
  }

public static class NoNested2PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {760, 807, 0};

  public NoNested2PartySubIDs() {
    super(806, 760, ORDER);
  }

  public void set(quickfix.field.Nested2PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubID());
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID() {
    return isSetField(760);
  }

  public void set(quickfix.field.Nested2PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType() {
    return isSetField(807);
  }
}
}

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.AllocCalculatedCcyQty value) {
    setField(value);
  }

  public quickfix.field.AllocCalculatedCcyQty get(quickfix.field.AllocCalculatedCcyQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCalculatedCcyQty getAllocCalculatedCcyQty() throws FieldNotFound {
    return get(new quickfix.field.AllocCalculatedCcyQty());
  }

  public boolean isSet(quickfix.field.AllocCalculatedCcyQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocCalculatedCcyQty() {
    return isSetField(2515);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }

  public void set(quickfix.field.AllocCustomerCapacity value) {
    setField(value);
  }

  public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
    return get(new quickfix.field.AllocCustomerCapacity());
  }

  public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
    return isSetField(field);
  }

  public boolean isSetAllocCustomerCapacity() {
    return isSetField(993);
  }

  public void set(quickfix.field.AllocMethod value) {
    setField(value);
  }

  public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound {
    return get(new quickfix.field.AllocMethod());
  }

  public boolean isSet(quickfix.field.AllocMethod field) {
    return isSetField(field);
  }

  public boolean isSetAllocMethod() {
    return isSetField(1002);
  }

  public void set(quickfix.field.SecondaryIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryIndividualAllocID());
  }

  public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryIndividualAllocID() {
    return isSetField(989);
  }

  public void set(quickfix.field.AllocClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.AllocClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocClearingFeeIndicator() {
    return isSetField(1136);
  }

  public void set(quickfix.fixlatest.component.TradeAllocAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp get(quickfix.fixlatest.component.TradeAllocAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp getTradeAllocAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeAllocAmtGrp());
  }

  public void set(quickfix.field.NoTradeAllocAmts value) {
    setField(value);
  }

  public quickfix.field.NoTradeAllocAmts get(quickfix.field.NoTradeAllocAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradeAllocAmts getNoTradeAllocAmts() throws FieldNotFound {
    return get(new quickfix.field.NoTradeAllocAmts());
  }

  public boolean isSet(quickfix.field.NoTradeAllocAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoTradeAllocAmts() {
    return isSetField(1844);
  }

public static class NoTradeAllocAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1845, 1846, 1847, 1850, 0};

  public NoTradeAllocAmts() {
    super(1844, 1845, ORDER);
  }

  public void set(quickfix.field.TradeAllocAmtType value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtType get(quickfix.field.TradeAllocAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtType getTradeAllocAmtType() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtType());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtType() {
    return isSetField(1845);
  }

  public void set(quickfix.field.TradeAllocAmt value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmt get(quickfix.field.TradeAllocAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmt getTradeAllocAmt() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmt());
  }

  public boolean isSet(quickfix.field.TradeAllocAmt field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmt() {
    return isSetField(1846);
  }

  public void set(quickfix.field.TradeAllocCurrency value) {
    setField(value);
  }

  public quickfix.field.TradeAllocCurrency get(quickfix.field.TradeAllocCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocCurrency getTradeAllocCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocCurrency());
  }

  public boolean isSet(quickfix.field.TradeAllocCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocCurrency() {
    return isSetField(1847);
  }

  public void set(quickfix.field.TradeAllocAmtReason value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtReason get(quickfix.field.TradeAllocAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtReason getTradeAllocAmtReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtReason());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtReason() {
    return isSetField(1850);
  }
}

  public void set(quickfix.field.TradeAllocStatus value) {
    setField(value);
  }

  public quickfix.field.TradeAllocStatus get(quickfix.field.TradeAllocStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocStatus getTradeAllocStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocStatus());
  }

  public boolean isSet(quickfix.field.TradeAllocStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocStatus() {
    return isSetField(1840);
  }

  public void set(quickfix.field.AllocationRollupInstruction value) {
    setField(value);
  }

  public quickfix.field.AllocationRollupInstruction get(quickfix.field.AllocationRollupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocationRollupInstruction getAllocationRollupInstruction() throws FieldNotFound {
    return get(new quickfix.field.AllocationRollupInstruction());
  }

  public boolean isSet(quickfix.field.AllocationRollupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetAllocationRollupInstruction() {
    return isSetField(1735);
  }

  public void set(quickfix.field.AllocText value) {
    setField(value);
  }

  public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocText getAllocText() throws FieldNotFound {
    return get(new quickfix.field.AllocText());
  }

  public boolean isSet(quickfix.field.AllocText field) {
    return isSetField(field);
  }

  public boolean isSetAllocText() {
    return isSetField(161);
  }

  public void set(quickfix.field.EncodedAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocTextLen() {
    return isSetField(360);
  }

  public void set(quickfix.field.EncodedAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocText());
  }

  public boolean isSet(quickfix.field.EncodedAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocText() {
    return isSetField(361);
  }

  public void set(quickfix.field.FirmAllocText value) {
    setField(value);
  }

  public quickfix.field.FirmAllocText get(quickfix.field.FirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmAllocText getFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.FirmAllocText());
  }

  public boolean isSet(quickfix.field.FirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetFirmAllocText() {
    return isSetField(1732);
  }

  public void set(quickfix.field.EncodedFirmAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocTextLen get(quickfix.field.EncodedFirmAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocTextLen getEncodedFirmAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocTextLen() {
    return isSetField(1733);
  }

  public void set(quickfix.field.EncodedFirmAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocText get(quickfix.field.EncodedFirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocText getEncodedFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocText());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocText() {
    return isSetField(1734);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckID get(quickfix.field.AllocRefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckID getAllocRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckID() {
    return isSetField(2392);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType get(quickfix.field.AllocRefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType getAllocRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckIDType() {
    return isSetField(2393);
  }

  public void set(quickfix.fixlatest.component.AllocCommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp get(quickfix.fixlatest.component.AllocCommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp getAllocCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocCommissionDataGrp());
  }

  public void set(quickfix.field.NoAllocCommissions value) {
    setField(value);
  }

  public quickfix.field.NoAllocCommissions get(quickfix.field.NoAllocCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocCommissions getNoAllocCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoAllocCommissions());
  }

  public boolean isSet(quickfix.field.NoAllocCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocCommissions() {
    return isSetField(2653);
  }

public static class NoAllocCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2654, 2655, 2726, 2656, 2657, 2658, 2659, 2660, 2661, 2662, 2663, 2664, 2665, 2666, 0};

  public NoAllocCommissions() {
    super(2653, 2654, ORDER);
  }

  public void set(quickfix.field.AllocCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmount get(quickfix.field.AllocCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmount getAllocCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmount());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmount() {
    return isSetField(2654);
  }

  public void set(quickfix.field.AllocCommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountType get(quickfix.field.AllocCommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountType getAllocCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountType() {
    return isSetField(2655);
  }

  public void set(quickfix.field.AllocCommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountSubType get(quickfix.field.AllocCommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountSubType getAllocCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountSubType() {
    return isSetField(2726);
  }

  public void set(quickfix.field.AllocCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionBasis get(quickfix.field.AllocCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionBasis getAllocCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionBasis());
  }

  public boolean isSet(quickfix.field.AllocCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionBasis() {
    return isSetField(2656);
  }

  public void set(quickfix.field.AllocCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionCurrency get(quickfix.field.AllocCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionCurrency getAllocCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionCurrency() {
    return isSetField(2657);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasure get(quickfix.field.AllocCommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasure getAllocCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasure() {
    return isSetField(2658);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency get(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency getAllocCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasureCurrency() {
    return isSetField(2659);
  }

  public void set(quickfix.field.AllocCommissionRate value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionRate get(quickfix.field.AllocCommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionRate getAllocCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionRate());
  }

  public boolean isSet(quickfix.field.AllocCommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionRate() {
    return isSetField(2660);
  }

  public void set(quickfix.field.AllocCommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionSharedIndicator get(quickfix.field.AllocCommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionSharedIndicator getAllocCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.AllocCommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionSharedIndicator() {
    return isSetField(2661);
  }

  public void set(quickfix.field.AllocCommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountShared get(quickfix.field.AllocCommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountShared getAllocCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountShared());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountShared() {
    return isSetField(2662);
  }

  public void set(quickfix.field.AllocCommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionLegRefID get(quickfix.field.AllocCommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionLegRefID getAllocCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionLegRefID());
  }

  public boolean isSet(quickfix.field.AllocCommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionLegRefID() {
    return isSetField(2663);
  }

  public void set(quickfix.field.AllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionDesc get(quickfix.field.AllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionDesc getAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.AllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionDesc() {
    return isSetField(2664);
  }

  public void set(quickfix.field.EncodedAllocCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDescLen get(quickfix.field.EncodedAllocCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDescLen getEncodedAllocCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDescLen() {
    return isSetField(2665);
  }

  public void set(quickfix.field.EncodedAllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDesc get(quickfix.field.EncodedAllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDesc getEncodedAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDesc() {
    return isSetField(2666);
  }
}
}

  public void set(quickfix.field.SideGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.SideGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.SideGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetSideGrossTradeAmt() {
    return isSetField(1072);
  }

  public void set(quickfix.field.AggressorIndicator value) {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
    return get(new quickfix.field.AggressorIndicator());
  }

  public boolean isSet(quickfix.field.AggressorIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator() {
    return isSetField(1057);
  }

  public void set(quickfix.field.ExchangeSpecialInstructions value) {
    setField(value);
  }

  public quickfix.field.ExchangeSpecialInstructions get(quickfix.field.ExchangeSpecialInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeSpecialInstructions getExchangeSpecialInstructions() throws FieldNotFound {
    return get(new quickfix.field.ExchangeSpecialInstructions());
  }

  public boolean isSet(quickfix.field.ExchangeSpecialInstructions field) {
    return isSetField(field);
  }

  public boolean isSetExchangeSpecialInstructions() {
    return isSetField(1139);
  }

  public void set(quickfix.field.SideShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.SideShortSaleExemptionReason get(quickfix.field.SideShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideShortSaleExemptionReason getSideShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.SideShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.SideShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetSideShortSaleExemptionReason() {
    return isSetField(1690);
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

  public void set(quickfix.field.AvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.AvgPxGroupID get(quickfix.field.AvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPxGroupID getAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.AvgPxGroupID());
  }

  public boolean isSet(quickfix.field.AvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAvgPxGroupID() {
    return isSetField(1731);
  }

  public void set(quickfix.field.SideMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.SideMarketSegmentID get(quickfix.field.SideMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideMarketSegmentID getSideMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.SideMarketSegmentID());
  }

  public boolean isSet(quickfix.field.SideMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetSideMarketSegmentID() {
    return isSetField(1898);
  }

  public void set(quickfix.field.SideVenueType value) {
    setField(value);
  }

  public quickfix.field.SideVenueType get(quickfix.field.SideVenueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideVenueType getSideVenueType() throws FieldNotFound {
    return get(new quickfix.field.SideVenueType());
  }

  public boolean isSet(quickfix.field.SideVenueType field) {
    return isSetField(field);
  }

  public boolean isSetSideVenueType() {
    return isSetField(1899);
  }

  public void set(quickfix.field.ClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearingFeeIndicator() {
    return isSetField(635);
  }

  public void set(quickfix.fixlatest.component.TradeReportOrderDetail component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail get(quickfix.fixlatest.component.TradeReportOrderDetail component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail getTradeReportOrderDetailComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeReportOrderDetail());
  }

  public void set(quickfix.fixlatest.component.TrdInstrmtLegExecGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdInstrmtLegExecGrp get(quickfix.fixlatest.component.TrdInstrmtLegExecGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdInstrmtLegExecGrp getTrdInstrmtLegExecGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdInstrmtLegExecGrp());
  }

  public void set(quickfix.field.NoLegExecs value) {
    setField(value);
  }

  public quickfix.field.NoLegExecs get(quickfix.field.NoLegExecs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegExecs getNoLegExecs() throws FieldNotFound {
    return get(new quickfix.field.NoLegExecs());
  }

  public boolean isSet(quickfix.field.NoLegExecs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegExecs() {
    return isSetField(1892);
  }

public static class NoLegExecs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {654, 1893, 1901, 1894, 1895, 685, 564, 565, 948, 637, 686, 675, 1689, 1418, 1591, 0};

  public NoLegExecs() {
    super(1892, 654, ORDER);
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

  public void set(quickfix.field.LegExecID value) {
    setField(value);
  }

  public quickfix.field.LegExecID get(quickfix.field.LegExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecID getLegExecID() throws FieldNotFound {
    return get(new quickfix.field.LegExecID());
  }

  public boolean isSet(quickfix.field.LegExecID field) {
    return isSetField(field);
  }

  public boolean isSetLegExecID() {
    return isSetField(1893);
  }

  public void set(quickfix.field.LegExecRefID value) {
    setField(value);
  }

  public quickfix.field.LegExecRefID get(quickfix.field.LegExecRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecRefID getLegExecRefID() throws FieldNotFound {
    return get(new quickfix.field.LegExecRefID());
  }

  public boolean isSet(quickfix.field.LegExecRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegExecRefID() {
    return isSetField(1901);
  }

  public void set(quickfix.field.LegTradeID value) {
    setField(value);
  }

  public quickfix.field.LegTradeID get(quickfix.field.LegTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTradeID getLegTradeID() throws FieldNotFound {
    return get(new quickfix.field.LegTradeID());
  }

  public boolean isSet(quickfix.field.LegTradeID field) {
    return isSetField(field);
  }

  public boolean isSetLegTradeID() {
    return isSetField(1894);
  }

  public void set(quickfix.field.LegTradeReportID value) {
    setField(value);
  }

  public quickfix.field.LegTradeReportID get(quickfix.field.LegTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTradeReportID getLegTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.LegTradeReportID());
  }

  public boolean isSet(quickfix.field.LegTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetLegTradeReportID() {
    return isSetField(1895);
  }

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegPositionEffect value) {
    setField(value);
  }

  public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.LegPositionEffect());
  }

  public boolean isSet(quickfix.field.LegPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionEffect() {
    return isSetField(564);
  }

  public void set(quickfix.field.LegCoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.LegCoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetLegCoveredOrUncovered() {
    return isSetField(565);
  }

  public void set(quickfix.fixlatest.component.NestedParties3 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties3 get(quickfix.fixlatest.component.NestedParties3 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties3 getNestedParties3Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties3());
  }

  public void set(quickfix.field.NoNested3PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartyIDs get(quickfix.field.NoNested3PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartyIDs getNoNested3PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartyIDs() {
    return isSetField(948);
  }

public static class NoNested3PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {949, 950, 951, 2382, 952, 0};

  public NoNested3PartyIDs() {
    super(948, 949, ORDER);
  }

  public void set(quickfix.field.Nested3PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyID get(quickfix.field.Nested3PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyID getNested3PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyID());
  }

  public boolean isSet(quickfix.field.Nested3PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyID() {
    return isSetField(949);
  }

  public void set(quickfix.field.Nested3PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyIDSource get(quickfix.field.Nested3PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyIDSource getNested3PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested3PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyIDSource() {
    return isSetField(950);
  }

  public void set(quickfix.field.Nested3PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRole get(quickfix.field.Nested3PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRole getNested3PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRole());
  }

  public boolean isSet(quickfix.field.Nested3PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRole() {
    return isSetField(951);
  }

  public void set(quickfix.field.Nested3PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRoleQualifier get(quickfix.field.Nested3PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRoleQualifier getNested3PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested3PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRoleQualifier() {
    return isSetField(2382);
  }

  public void set(quickfix.fixlatest.component.NstdPtys3SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp get(quickfix.fixlatest.component.NstdPtys3SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp getNstdPtys3SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys3SubGrp());
  }

  public void set(quickfix.field.NoNested3PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartySubIDs get(quickfix.field.NoNested3PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartySubIDs() {
    return isSetField(952);
  }

public static class NoNested3PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {953, 954, 0};

  public NoNested3PartySubIDs() {
    super(952, 953, ORDER);
  }

  public void set(quickfix.field.Nested3PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubID get(quickfix.field.Nested3PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubID getNested3PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubID());
  }

  public boolean isSet(quickfix.field.Nested3PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubID() {
    return isSetField(953);
  }

  public void set(quickfix.field.Nested3PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubIDType get(quickfix.field.Nested3PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubIDType() {
    return isSetField(954);
  }
}
}

  public void set(quickfix.field.LegLastPx value) {
    setField(value);
  }

  public quickfix.field.LegLastPx get(quickfix.field.LegLastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound {
    return get(new quickfix.field.LegLastPx());
  }

  public boolean isSet(quickfix.field.LegLastPx field) {
    return isSetField(field);
  }

  public boolean isSetLegLastPx() {
    return isSetField(637);
  }

  public void set(quickfix.field.LegPriceType value) {
    setField(value);
  }

  public quickfix.field.LegPriceType get(quickfix.field.LegPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceType getLegPriceType() throws FieldNotFound {
    return get(new quickfix.field.LegPriceType());
  }

  public boolean isSet(quickfix.field.LegPriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceType() {
    return isSetField(686);
  }

  public void set(quickfix.field.LegSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlCurrency() {
    return isSetField(675);
  }

  public void set(quickfix.field.LegShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleExemptionReason get(quickfix.field.LegShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleExemptionReason getLegShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.LegShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleExemptionReason() {
    return isSetField(1689);
  }

  public void set(quickfix.field.LegLastQty value) {
    setField(value);
  }

  public quickfix.field.LegLastQty get(quickfix.field.LegLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastQty getLegLastQty() throws FieldNotFound {
    return get(new quickfix.field.LegLastQty());
  }

  public boolean isSet(quickfix.field.LegLastQty field) {
    return isSetField(field);
  }

  public boolean isSetLegLastQty() {
    return isSetField(1418);
  }

  public void set(quickfix.field.LegQtyType value) {
    setField(value);
  }

  public quickfix.field.LegQtyType get(quickfix.field.LegQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQtyType getLegQtyType() throws FieldNotFound {
    return get(new quickfix.field.LegQtyType());
  }

  public boolean isSet(quickfix.field.LegQtyType field) {
    return isSetField(field);
  }

  public boolean isSetLegQtyType() {
    return isSetField(1591);
  }
}

  public void set(quickfix.field.CustOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.CustOrderHandlingInst get(quickfix.field.CustOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderHandlingInst getCustOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.CustOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.CustOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderHandlingInst() {
    return isSetField(1031);
  }

  public void set(quickfix.field.OrderHandlingInstSource value) {
    setField(value);
  }

  public quickfix.field.OrderHandlingInstSource get(quickfix.field.OrderHandlingInstSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderHandlingInstSource getOrderHandlingInstSource() throws FieldNotFound {
    return get(new quickfix.field.OrderHandlingInstSource());
  }

  public boolean isSet(quickfix.field.OrderHandlingInstSource field) {
    return isSetField(field);
  }

  public boolean isSetOrderHandlingInstSource() {
    return isSetField(1032);
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

  public void set(quickfix.field.TrdMatchSubID value) {
    setField(value);
  }

  public quickfix.field.TrdMatchSubID get(quickfix.field.TrdMatchSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdMatchSubID getTrdMatchSubID() throws FieldNotFound {
    return get(new quickfix.field.TrdMatchSubID());
  }

  public boolean isSet(quickfix.field.TrdMatchSubID field) {
    return isSetField(field);
  }

  public boolean isSetTrdMatchSubID() {
    return isSetField(1891);
  }

  public void set(quickfix.field.Quantity value) {
    setField(value);
  }

  public quickfix.field.Quantity get(quickfix.field.Quantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Quantity getQuantity() throws FieldNotFound {
    return get(new quickfix.field.Quantity());
  }

  public boolean isSet(quickfix.field.Quantity field) {
    return isSetField(field);
  }

  public boolean isSetQuantity() {
    return isSetField(53);
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

  public void set(quickfix.field.QtyType value) {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound {
    return get(new quickfix.field.QtyType());
  }

  public boolean isSet(quickfix.field.QtyType field) {
    return isSetField(field);
  }

  public boolean isSetQtyType() {
    return isSetField(854);
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

  public void set(quickfix.field.LastMkt value) {
    setField(value);
  }

  public quickfix.field.LastMkt get(quickfix.field.LastMkt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastMkt getLastMkt() throws FieldNotFound {
    return get(new quickfix.field.LastMkt());
  }

  public boolean isSet(quickfix.field.LastMkt field) {
    return isSetField(field);
  }

  public boolean isSetLastMkt() {
    return isSetField(30);
  }

  public void set(quickfix.fixlatest.component.TrdMatchSideGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdMatchSideGrp get(quickfix.fixlatest.component.TrdMatchSideGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdMatchSideGrp getTrdMatchSideGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdMatchSideGrp());
  }

  public void set(quickfix.field.NoTrdMatchSides value) {
    setField(value);
  }

  public quickfix.field.NoTrdMatchSides get(quickfix.field.NoTrdMatchSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdMatchSides getNoTrdMatchSides() throws FieldNotFound {
    return get(new quickfix.field.NoTrdMatchSides());
  }

  public boolean isSet(quickfix.field.NoTrdMatchSides field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdMatchSides() {
    return isSetField(1890);
  }

public static class NoTrdMatchSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {54, 1427, 1900, 1506, 1005, 1428, 1429, 1009, 1597, 1599, 1598, 1006, 1007, 1008, 430, 1154, 1155, 453, 578, 579, 376, 2404, 2351, 2352, 377, 582, 943, 77, 825, 826, 591, 70, 78, 1072, 1057, 1139, 1690, 1115, 819, 1731, 1898, 1899, 635, 37, 198, 11, 526, 66, 1080, 1081, 1431, 73, 1091, 40, 44, 99, 18, 39, 38, 152, 516, 468, 469, 151, 14, 59, 126, 1624, 2362, 1629, 1916, 1138, 1082, 1608, 2828, 1083, 1084, 1085, 1086, 1087, 1088, 528, 529, 775, 1432, 1724, 2593, 2704, 821, 1093, 483, 586, 2766, 1892, 1031, 1032, 58, 354, 355, 0};

  public NoTrdMatchSides() {
    super(1890, 54, ORDER);
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

  public void set(quickfix.field.SideExecID value) {
    setField(value);
  }

  public quickfix.field.SideExecID get(quickfix.field.SideExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecID getSideExecID() throws FieldNotFound {
    return get(new quickfix.field.SideExecID());
  }

  public boolean isSet(quickfix.field.SideExecID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecID() {
    return isSetField(1427);
  }

  public void set(quickfix.field.SideExecRefID value) {
    setField(value);
  }

  public quickfix.field.SideExecRefID get(quickfix.field.SideExecRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecRefID getSideExecRefID() throws FieldNotFound {
    return get(new quickfix.field.SideExecRefID());
  }

  public boolean isSet(quickfix.field.SideExecRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecRefID() {
    return isSetField(1900);
  }

  public void set(quickfix.field.SideTradeID value) {
    setField(value);
  }

  public quickfix.field.SideTradeID get(quickfix.field.SideTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeID getSideTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeID());
  }

  public boolean isSet(quickfix.field.SideTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeID() {
    return isSetField(1506);
  }

  public void set(quickfix.field.SideTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportID());
  }

  public boolean isSet(quickfix.field.SideTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportID() {
    return isSetField(1005);
  }

  public void set(quickfix.field.OrderDelay value) {
    setField(value);
  }

  public quickfix.field.OrderDelay get(quickfix.field.OrderDelay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelay getOrderDelay() throws FieldNotFound {
    return get(new quickfix.field.OrderDelay());
  }

  public boolean isSet(quickfix.field.OrderDelay field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelay() {
    return isSetField(1428);
  }

  public void set(quickfix.field.OrderDelayUnit value) {
    setField(value);
  }

  public quickfix.field.OrderDelayUnit get(quickfix.field.OrderDelayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelayUnit getOrderDelayUnit() throws FieldNotFound {
    return get(new quickfix.field.OrderDelayUnit());
  }

  public boolean isSet(quickfix.field.OrderDelayUnit field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelayUnit() {
    return isSetField(1429);
  }

  public void set(quickfix.field.SideLastQty value) {
    setField(value);
  }

  public quickfix.field.SideLastQty get(quickfix.field.SideLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLastQty getSideLastQty() throws FieldNotFound {
    return get(new quickfix.field.SideLastQty());
  }

  public boolean isSet(quickfix.field.SideLastQty field) {
    return isSetField(field);
  }

  public boolean isSetSideLastQty() {
    return isSetField(1009);
  }

  public void set(quickfix.field.SideClearingTradePrice value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePrice get(quickfix.field.SideClearingTradePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePrice getSideClearingTradePrice() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePrice());
  }

  public boolean isSet(quickfix.field.SideClearingTradePrice field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePrice() {
    return isSetField(1597);
  }

  public void set(quickfix.field.SidePriceDifferential value) {
    setField(value);
  }

  public quickfix.field.SidePriceDifferential get(quickfix.field.SidePriceDifferential value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SidePriceDifferential getSidePriceDifferential() throws FieldNotFound {
    return get(new quickfix.field.SidePriceDifferential());
  }

  public boolean isSet(quickfix.field.SidePriceDifferential field) {
    return isSetField(field);
  }

  public boolean isSetSidePriceDifferential() {
    return isSetField(1599);
  }

  public void set(quickfix.field.SideClearingTradePriceType value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePriceType get(quickfix.field.SideClearingTradePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePriceType getSideClearingTradePriceType() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePriceType());
  }

  public boolean isSet(quickfix.field.SideClearingTradePriceType field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePriceType() {
    return isSetField(1598);
  }

  public void set(quickfix.field.SideFillStationCd value) {
    setField(value);
  }

  public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound {
    return get(new quickfix.field.SideFillStationCd());
  }

  public boolean isSet(quickfix.field.SideFillStationCd field) {
    return isSetField(field);
  }

  public boolean isSetSideFillStationCd() {
    return isSetField(1006);
  }

  public void set(quickfix.field.SideReasonCd value) {
    setField(value);
  }

  public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound {
    return get(new quickfix.field.SideReasonCd());
  }

  public boolean isSet(quickfix.field.SideReasonCd field) {
    return isSetField(field);
  }

  public boolean isSetSideReasonCd() {
    return isSetField(1007);
  }

  public void set(quickfix.field.SideTrdSubTyp value) {
    setField(value);
  }

  public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdSubTyp());
  }

  public boolean isSet(quickfix.field.SideTrdSubTyp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdSubTyp() {
    return isSetField(1008);
  }

  public void set(quickfix.field.NetGrossInd value) {
    setField(value);
  }

  public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
    return get(new quickfix.field.NetGrossInd());
  }

  public boolean isSet(quickfix.field.NetGrossInd field) {
    return isSetField(field);
  }

  public boolean isSetNetGrossInd() {
    return isSetField(430);
  }

  public void set(quickfix.field.SideCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCurrency get(quickfix.field.SideCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrency getSideCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCurrency());
  }

  public boolean isSet(quickfix.field.SideCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrency() {
    return isSetField(1154);
  }

  public void set(quickfix.field.SideSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SideSettlCurrency get(quickfix.field.SideSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideSettlCurrency getSideSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideSettlCurrency());
  }

  public boolean isSet(quickfix.field.SideSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideSettlCurrency() {
    return isSetField(1155);
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

  public void set(quickfix.field.TradeInputSource value) {
    setField(value);
  }

  public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
    return get(new quickfix.field.TradeInputSource());
  }

  public boolean isSet(quickfix.field.TradeInputSource field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputSource() {
    return isSetField(578);
  }

  public void set(quickfix.field.TradeInputDevice value) {
    setField(value);
  }

  public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
    return get(new quickfix.field.TradeInputDevice());
  }

  public boolean isSet(quickfix.field.TradeInputDevice field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputDevice() {
    return isSetField(579);
  }

  public void set(quickfix.field.ComplianceID value) {
    setField(value);
  }

  public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
    return get(new quickfix.field.ComplianceID());
  }

  public boolean isSet(quickfix.field.ComplianceID field) {
    return isSetField(field);
  }

  public boolean isSetComplianceID() {
    return isSetField(376);
  }

  public void set(quickfix.field.ComplianceText value) {
    setField(value);
  }

  public quickfix.field.ComplianceText get(quickfix.field.ComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceText getComplianceText() throws FieldNotFound {
    return get(new quickfix.field.ComplianceText());
  }

  public boolean isSet(quickfix.field.ComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetComplianceText() {
    return isSetField(2404);
  }

  public void set(quickfix.field.EncodedComplianceTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceTextLen get(quickfix.field.EncodedComplianceTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceTextLen getEncodedComplianceTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceTextLen());
  }

  public boolean isSet(quickfix.field.EncodedComplianceTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceTextLen() {
    return isSetField(2351);
  }

  public void set(quickfix.field.EncodedComplianceText value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceText get(quickfix.field.EncodedComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceText getEncodedComplianceText() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceText());
  }

  public boolean isSet(quickfix.field.EncodedComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceText() {
    return isSetField(2352);
  }

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
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

  public void set(quickfix.field.TimeBracket value) {
    setField(value);
  }

  public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
    return get(new quickfix.field.TimeBracket());
  }

  public boolean isSet(quickfix.field.TimeBracket field) {
    return isSetField(field);
  }

  public boolean isSetTimeBracket() {
    return isSetField(943);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
  }

  public void set(quickfix.field.ExchangeRule value) {
    setField(value);
  }

  public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
    return get(new quickfix.field.ExchangeRule());
  }

  public boolean isSet(quickfix.field.ExchangeRule field) {
    return isSetField(field);
  }

  public boolean isSetExchangeRule() {
    return isSetField(825);
  }

  public void set(quickfix.field.TradeAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocIndicator());
  }

  public boolean isSet(quickfix.field.TradeAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocIndicator() {
    return isSetField(826);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.TrdAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdAllocGrp get(quickfix.fixlatest.component.TrdAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdAllocGrp getTrdAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 1593, 2727, 1908, 1729, 756, 209, 80, 2515, 1752, 1753, 1754, 1755, 993, 1002, 989, 1136, 1844, 1840, 1735, 161, 360, 361, 1732, 1733, 1734, 2392, 2393, 2653, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.ParentAllocID value) {
    setField(value);
  }

  public quickfix.field.ParentAllocID get(quickfix.field.ParentAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentAllocID getParentAllocID() throws FieldNotFound {
    return get(new quickfix.field.ParentAllocID());
  }

  public boolean isSet(quickfix.field.ParentAllocID field) {
    return isSetField(field);
  }

  public boolean isSetParentAllocID() {
    return isSetField(1593);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp get(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp getAllocRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoAllocRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs get(quickfix.field.NoAllocRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs getNoAllocRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoAllocRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocRegulatoryTradeIDs() {
    return isSetField(1908);
  }

public static class NoAllocRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1909, 1910, 1911, 1912, 2406, 2399, 0};

  public NoAllocRegulatoryTradeIDs() {
    super(1908, 1909, ORDER);
  }

  public void set(quickfix.field.AllocRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeID get(quickfix.field.AllocRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeID getAllocRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeID() {
    return isSetField(1909);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDSource get(quickfix.field.AllocRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDSource getAllocRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDSource() {
    return isSetField(1910);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent get(quickfix.field.AllocRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent getAllocRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDEvent() {
    return isSetField(1911);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDType get(quickfix.field.AllocRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDType getAllocRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDType() {
    return isSetField(1912);
  }

  public void set(quickfix.field.AllocRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryLegRefID get(quickfix.field.AllocRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryLegRefID getAllocRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryLegRefID() {
    return isSetField(2406);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDScope get(quickfix.field.AllocRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDScope getAllocRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDScope() {
    return isSetField(2399);
  }
}

  public void set(quickfix.field.FirmMnemonic value) {
    setField(value);
  }

  public quickfix.field.FirmMnemonic get(quickfix.field.FirmMnemonic value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmMnemonic getFirmMnemonic() throws FieldNotFound {
    return get(new quickfix.field.FirmMnemonic());
  }

  public boolean isSet(quickfix.field.FirmMnemonic field) {
    return isSetField(field);
  }

  public boolean isSetFirmMnemonic() {
    return isSetField(1729);
  }

  public void set(quickfix.fixlatest.component.NestedParties2 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties2 get(quickfix.fixlatest.component.NestedParties2 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties2 getNestedParties2Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties2());
  }

  public void set(quickfix.field.NoNested2PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs() {
    return isSetField(756);
  }

public static class NoNested2PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {757, 758, 759, 2381, 806, 0};

  public NoNested2PartyIDs() {
    super(756, 757, ORDER);
  }

  public void set(quickfix.field.Nested2PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyID());
  }

  public boolean isSet(quickfix.field.Nested2PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID() {
    return isSetField(757);
  }

  public void set(quickfix.field.Nested2PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource() {
    return isSetField(758);
  }

  public void set(quickfix.field.Nested2PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRole());
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole() {
    return isSetField(759);
  }

  public void set(quickfix.field.Nested2PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRoleQualifier get(quickfix.field.Nested2PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRoleQualifier getNested2PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested2PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRoleQualifier() {
    return isSetField(2381);
  }

  public void set(quickfix.fixlatest.component.NstdPtys2SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp get(quickfix.fixlatest.component.NstdPtys2SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp getNstdPtys2SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys2SubGrp());
  }

  public void set(quickfix.field.NoNested2PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs() {
    return isSetField(806);
  }

public static class NoNested2PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {760, 807, 0};

  public NoNested2PartySubIDs() {
    super(806, 760, ORDER);
  }

  public void set(quickfix.field.Nested2PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubID());
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID() {
    return isSetField(760);
  }

  public void set(quickfix.field.Nested2PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType() {
    return isSetField(807);
  }
}
}

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.AllocCalculatedCcyQty value) {
    setField(value);
  }

  public quickfix.field.AllocCalculatedCcyQty get(quickfix.field.AllocCalculatedCcyQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCalculatedCcyQty getAllocCalculatedCcyQty() throws FieldNotFound {
    return get(new quickfix.field.AllocCalculatedCcyQty());
  }

  public boolean isSet(quickfix.field.AllocCalculatedCcyQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocCalculatedCcyQty() {
    return isSetField(2515);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }

  public void set(quickfix.field.AllocCustomerCapacity value) {
    setField(value);
  }

  public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
    return get(new quickfix.field.AllocCustomerCapacity());
  }

  public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
    return isSetField(field);
  }

  public boolean isSetAllocCustomerCapacity() {
    return isSetField(993);
  }

  public void set(quickfix.field.AllocMethod value) {
    setField(value);
  }

  public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound {
    return get(new quickfix.field.AllocMethod());
  }

  public boolean isSet(quickfix.field.AllocMethod field) {
    return isSetField(field);
  }

  public boolean isSetAllocMethod() {
    return isSetField(1002);
  }

  public void set(quickfix.field.SecondaryIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryIndividualAllocID());
  }

  public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryIndividualAllocID() {
    return isSetField(989);
  }

  public void set(quickfix.field.AllocClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.AllocClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocClearingFeeIndicator() {
    return isSetField(1136);
  }

  public void set(quickfix.fixlatest.component.TradeAllocAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp get(quickfix.fixlatest.component.TradeAllocAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp getTradeAllocAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeAllocAmtGrp());
  }

  public void set(quickfix.field.NoTradeAllocAmts value) {
    setField(value);
  }

  public quickfix.field.NoTradeAllocAmts get(quickfix.field.NoTradeAllocAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradeAllocAmts getNoTradeAllocAmts() throws FieldNotFound {
    return get(new quickfix.field.NoTradeAllocAmts());
  }

  public boolean isSet(quickfix.field.NoTradeAllocAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoTradeAllocAmts() {
    return isSetField(1844);
  }

public static class NoTradeAllocAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1845, 1846, 1847, 1850, 0};

  public NoTradeAllocAmts() {
    super(1844, 1845, ORDER);
  }

  public void set(quickfix.field.TradeAllocAmtType value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtType get(quickfix.field.TradeAllocAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtType getTradeAllocAmtType() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtType());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtType() {
    return isSetField(1845);
  }

  public void set(quickfix.field.TradeAllocAmt value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmt get(quickfix.field.TradeAllocAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmt getTradeAllocAmt() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmt());
  }

  public boolean isSet(quickfix.field.TradeAllocAmt field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmt() {
    return isSetField(1846);
  }

  public void set(quickfix.field.TradeAllocCurrency value) {
    setField(value);
  }

  public quickfix.field.TradeAllocCurrency get(quickfix.field.TradeAllocCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocCurrency getTradeAllocCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocCurrency());
  }

  public boolean isSet(quickfix.field.TradeAllocCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocCurrency() {
    return isSetField(1847);
  }

  public void set(quickfix.field.TradeAllocAmtReason value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtReason get(quickfix.field.TradeAllocAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtReason getTradeAllocAmtReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtReason());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtReason() {
    return isSetField(1850);
  }
}

  public void set(quickfix.field.TradeAllocStatus value) {
    setField(value);
  }

  public quickfix.field.TradeAllocStatus get(quickfix.field.TradeAllocStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocStatus getTradeAllocStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocStatus());
  }

  public boolean isSet(quickfix.field.TradeAllocStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocStatus() {
    return isSetField(1840);
  }

  public void set(quickfix.field.AllocationRollupInstruction value) {
    setField(value);
  }

  public quickfix.field.AllocationRollupInstruction get(quickfix.field.AllocationRollupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocationRollupInstruction getAllocationRollupInstruction() throws FieldNotFound {
    return get(new quickfix.field.AllocationRollupInstruction());
  }

  public boolean isSet(quickfix.field.AllocationRollupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetAllocationRollupInstruction() {
    return isSetField(1735);
  }

  public void set(quickfix.field.AllocText value) {
    setField(value);
  }

  public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocText getAllocText() throws FieldNotFound {
    return get(new quickfix.field.AllocText());
  }

  public boolean isSet(quickfix.field.AllocText field) {
    return isSetField(field);
  }

  public boolean isSetAllocText() {
    return isSetField(161);
  }

  public void set(quickfix.field.EncodedAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocTextLen() {
    return isSetField(360);
  }

  public void set(quickfix.field.EncodedAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocText());
  }

  public boolean isSet(quickfix.field.EncodedAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocText() {
    return isSetField(361);
  }

  public void set(quickfix.field.FirmAllocText value) {
    setField(value);
  }

  public quickfix.field.FirmAllocText get(quickfix.field.FirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmAllocText getFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.FirmAllocText());
  }

  public boolean isSet(quickfix.field.FirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetFirmAllocText() {
    return isSetField(1732);
  }

  public void set(quickfix.field.EncodedFirmAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocTextLen get(quickfix.field.EncodedFirmAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocTextLen getEncodedFirmAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocTextLen() {
    return isSetField(1733);
  }

  public void set(quickfix.field.EncodedFirmAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocText get(quickfix.field.EncodedFirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocText getEncodedFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocText());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocText() {
    return isSetField(1734);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckID get(quickfix.field.AllocRefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckID getAllocRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckID() {
    return isSetField(2392);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType get(quickfix.field.AllocRefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType getAllocRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckIDType() {
    return isSetField(2393);
  }

  public void set(quickfix.fixlatest.component.AllocCommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp get(quickfix.fixlatest.component.AllocCommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp getAllocCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocCommissionDataGrp());
  }

  public void set(quickfix.field.NoAllocCommissions value) {
    setField(value);
  }

  public quickfix.field.NoAllocCommissions get(quickfix.field.NoAllocCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocCommissions getNoAllocCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoAllocCommissions());
  }

  public boolean isSet(quickfix.field.NoAllocCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocCommissions() {
    return isSetField(2653);
  }

public static class NoAllocCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2654, 2655, 2726, 2656, 2657, 2658, 2659, 2660, 2661, 2662, 2663, 2664, 2665, 2666, 0};

  public NoAllocCommissions() {
    super(2653, 2654, ORDER);
  }

  public void set(quickfix.field.AllocCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmount get(quickfix.field.AllocCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmount getAllocCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmount());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmount() {
    return isSetField(2654);
  }

  public void set(quickfix.field.AllocCommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountType get(quickfix.field.AllocCommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountType getAllocCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountType() {
    return isSetField(2655);
  }

  public void set(quickfix.field.AllocCommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountSubType get(quickfix.field.AllocCommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountSubType getAllocCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountSubType() {
    return isSetField(2726);
  }

  public void set(quickfix.field.AllocCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionBasis get(quickfix.field.AllocCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionBasis getAllocCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionBasis());
  }

  public boolean isSet(quickfix.field.AllocCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionBasis() {
    return isSetField(2656);
  }

  public void set(quickfix.field.AllocCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionCurrency get(quickfix.field.AllocCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionCurrency getAllocCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionCurrency() {
    return isSetField(2657);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasure get(quickfix.field.AllocCommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasure getAllocCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasure() {
    return isSetField(2658);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency get(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency getAllocCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasureCurrency() {
    return isSetField(2659);
  }

  public void set(quickfix.field.AllocCommissionRate value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionRate get(quickfix.field.AllocCommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionRate getAllocCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionRate());
  }

  public boolean isSet(quickfix.field.AllocCommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionRate() {
    return isSetField(2660);
  }

  public void set(quickfix.field.AllocCommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionSharedIndicator get(quickfix.field.AllocCommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionSharedIndicator getAllocCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.AllocCommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionSharedIndicator() {
    return isSetField(2661);
  }

  public void set(quickfix.field.AllocCommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountShared get(quickfix.field.AllocCommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountShared getAllocCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountShared());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountShared() {
    return isSetField(2662);
  }

  public void set(quickfix.field.AllocCommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionLegRefID get(quickfix.field.AllocCommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionLegRefID getAllocCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionLegRefID());
  }

  public boolean isSet(quickfix.field.AllocCommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionLegRefID() {
    return isSetField(2663);
  }

  public void set(quickfix.field.AllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionDesc get(quickfix.field.AllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionDesc getAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.AllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionDesc() {
    return isSetField(2664);
  }

  public void set(quickfix.field.EncodedAllocCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDescLen get(quickfix.field.EncodedAllocCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDescLen getEncodedAllocCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDescLen() {
    return isSetField(2665);
  }

  public void set(quickfix.field.EncodedAllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDesc get(quickfix.field.EncodedAllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDesc getEncodedAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDesc() {
    return isSetField(2666);
  }
}
}

  public void set(quickfix.field.SideGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.SideGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.SideGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetSideGrossTradeAmt() {
    return isSetField(1072);
  }

  public void set(quickfix.field.AggressorIndicator value) {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
    return get(new quickfix.field.AggressorIndicator());
  }

  public boolean isSet(quickfix.field.AggressorIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator() {
    return isSetField(1057);
  }

  public void set(quickfix.field.ExchangeSpecialInstructions value) {
    setField(value);
  }

  public quickfix.field.ExchangeSpecialInstructions get(quickfix.field.ExchangeSpecialInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeSpecialInstructions getExchangeSpecialInstructions() throws FieldNotFound {
    return get(new quickfix.field.ExchangeSpecialInstructions());
  }

  public boolean isSet(quickfix.field.ExchangeSpecialInstructions field) {
    return isSetField(field);
  }

  public boolean isSetExchangeSpecialInstructions() {
    return isSetField(1139);
  }

  public void set(quickfix.field.SideShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.SideShortSaleExemptionReason get(quickfix.field.SideShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideShortSaleExemptionReason getSideShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.SideShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.SideShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetSideShortSaleExemptionReason() {
    return isSetField(1690);
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

  public void set(quickfix.field.AvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.AvgPxGroupID get(quickfix.field.AvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPxGroupID getAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.AvgPxGroupID());
  }

  public boolean isSet(quickfix.field.AvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAvgPxGroupID() {
    return isSetField(1731);
  }

  public void set(quickfix.field.SideMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.SideMarketSegmentID get(quickfix.field.SideMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideMarketSegmentID getSideMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.SideMarketSegmentID());
  }

  public boolean isSet(quickfix.field.SideMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetSideMarketSegmentID() {
    return isSetField(1898);
  }

  public void set(quickfix.field.SideVenueType value) {
    setField(value);
  }

  public quickfix.field.SideVenueType get(quickfix.field.SideVenueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideVenueType getSideVenueType() throws FieldNotFound {
    return get(new quickfix.field.SideVenueType());
  }

  public boolean isSet(quickfix.field.SideVenueType field) {
    return isSetField(field);
  }

  public boolean isSetSideVenueType() {
    return isSetField(1899);
  }

  public void set(quickfix.field.ClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearingFeeIndicator() {
    return isSetField(635);
  }

  public void set(quickfix.fixlatest.component.TradeReportOrderDetail component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail get(quickfix.fixlatest.component.TradeReportOrderDetail component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail getTradeReportOrderDetailComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeReportOrderDetail());
  }

  public void set(quickfix.fixlatest.component.TrdInstrmtLegExecGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdInstrmtLegExecGrp get(quickfix.fixlatest.component.TrdInstrmtLegExecGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdInstrmtLegExecGrp getTrdInstrmtLegExecGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdInstrmtLegExecGrp());
  }

  public void set(quickfix.field.NoLegExecs value) {
    setField(value);
  }

  public quickfix.field.NoLegExecs get(quickfix.field.NoLegExecs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegExecs getNoLegExecs() throws FieldNotFound {
    return get(new quickfix.field.NoLegExecs());
  }

  public boolean isSet(quickfix.field.NoLegExecs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegExecs() {
    return isSetField(1892);
  }

public static class NoLegExecs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {654, 1893, 1901, 1894, 1895, 685, 564, 565, 948, 637, 686, 675, 1689, 1418, 1591, 0};

  public NoLegExecs() {
    super(1892, 654, ORDER);
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

  public void set(quickfix.field.LegExecID value) {
    setField(value);
  }

  public quickfix.field.LegExecID get(quickfix.field.LegExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecID getLegExecID() throws FieldNotFound {
    return get(new quickfix.field.LegExecID());
  }

  public boolean isSet(quickfix.field.LegExecID field) {
    return isSetField(field);
  }

  public boolean isSetLegExecID() {
    return isSetField(1893);
  }

  public void set(quickfix.field.LegExecRefID value) {
    setField(value);
  }

  public quickfix.field.LegExecRefID get(quickfix.field.LegExecRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecRefID getLegExecRefID() throws FieldNotFound {
    return get(new quickfix.field.LegExecRefID());
  }

  public boolean isSet(quickfix.field.LegExecRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegExecRefID() {
    return isSetField(1901);
  }

  public void set(quickfix.field.LegTradeID value) {
    setField(value);
  }

  public quickfix.field.LegTradeID get(quickfix.field.LegTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTradeID getLegTradeID() throws FieldNotFound {
    return get(new quickfix.field.LegTradeID());
  }

  public boolean isSet(quickfix.field.LegTradeID field) {
    return isSetField(field);
  }

  public boolean isSetLegTradeID() {
    return isSetField(1894);
  }

  public void set(quickfix.field.LegTradeReportID value) {
    setField(value);
  }

  public quickfix.field.LegTradeReportID get(quickfix.field.LegTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTradeReportID getLegTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.LegTradeReportID());
  }

  public boolean isSet(quickfix.field.LegTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetLegTradeReportID() {
    return isSetField(1895);
  }

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegPositionEffect value) {
    setField(value);
  }

  public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.LegPositionEffect());
  }

  public boolean isSet(quickfix.field.LegPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionEffect() {
    return isSetField(564);
  }

  public void set(quickfix.field.LegCoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.LegCoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetLegCoveredOrUncovered() {
    return isSetField(565);
  }

  public void set(quickfix.fixlatest.component.NestedParties3 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties3 get(quickfix.fixlatest.component.NestedParties3 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties3 getNestedParties3Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties3());
  }

  public void set(quickfix.field.NoNested3PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartyIDs get(quickfix.field.NoNested3PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartyIDs getNoNested3PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartyIDs() {
    return isSetField(948);
  }

public static class NoNested3PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {949, 950, 951, 2382, 952, 0};

  public NoNested3PartyIDs() {
    super(948, 949, ORDER);
  }

  public void set(quickfix.field.Nested3PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyID get(quickfix.field.Nested3PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyID getNested3PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyID());
  }

  public boolean isSet(quickfix.field.Nested3PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyID() {
    return isSetField(949);
  }

  public void set(quickfix.field.Nested3PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyIDSource get(quickfix.field.Nested3PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyIDSource getNested3PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested3PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyIDSource() {
    return isSetField(950);
  }

  public void set(quickfix.field.Nested3PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRole get(quickfix.field.Nested3PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRole getNested3PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRole());
  }

  public boolean isSet(quickfix.field.Nested3PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRole() {
    return isSetField(951);
  }

  public void set(quickfix.field.Nested3PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRoleQualifier get(quickfix.field.Nested3PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRoleQualifier getNested3PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested3PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRoleQualifier() {
    return isSetField(2382);
  }

  public void set(quickfix.fixlatest.component.NstdPtys3SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp get(quickfix.fixlatest.component.NstdPtys3SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp getNstdPtys3SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys3SubGrp());
  }

  public void set(quickfix.field.NoNested3PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartySubIDs get(quickfix.field.NoNested3PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartySubIDs() {
    return isSetField(952);
  }

public static class NoNested3PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {953, 954, 0};

  public NoNested3PartySubIDs() {
    super(952, 953, ORDER);
  }

  public void set(quickfix.field.Nested3PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubID get(quickfix.field.Nested3PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubID getNested3PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubID());
  }

  public boolean isSet(quickfix.field.Nested3PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubID() {
    return isSetField(953);
  }

  public void set(quickfix.field.Nested3PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubIDType get(quickfix.field.Nested3PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubIDType() {
    return isSetField(954);
  }
}
}

  public void set(quickfix.field.LegLastPx value) {
    setField(value);
  }

  public quickfix.field.LegLastPx get(quickfix.field.LegLastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound {
    return get(new quickfix.field.LegLastPx());
  }

  public boolean isSet(quickfix.field.LegLastPx field) {
    return isSetField(field);
  }

  public boolean isSetLegLastPx() {
    return isSetField(637);
  }

  public void set(quickfix.field.LegPriceType value) {
    setField(value);
  }

  public quickfix.field.LegPriceType get(quickfix.field.LegPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceType getLegPriceType() throws FieldNotFound {
    return get(new quickfix.field.LegPriceType());
  }

  public boolean isSet(quickfix.field.LegPriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceType() {
    return isSetField(686);
  }

  public void set(quickfix.field.LegSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlCurrency() {
    return isSetField(675);
  }

  public void set(quickfix.field.LegShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleExemptionReason get(quickfix.field.LegShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleExemptionReason getLegShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.LegShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleExemptionReason() {
    return isSetField(1689);
  }

  public void set(quickfix.field.LegLastQty value) {
    setField(value);
  }

  public quickfix.field.LegLastQty get(quickfix.field.LegLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastQty getLegLastQty() throws FieldNotFound {
    return get(new quickfix.field.LegLastQty());
  }

  public boolean isSet(quickfix.field.LegLastQty field) {
    return isSetField(field);
  }

  public boolean isSetLegLastQty() {
    return isSetField(1418);
  }

  public void set(quickfix.field.LegQtyType value) {
    setField(value);
  }

  public quickfix.field.LegQtyType get(quickfix.field.LegQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQtyType getLegQtyType() throws FieldNotFound {
    return get(new quickfix.field.LegQtyType());
  }

  public boolean isSet(quickfix.field.LegQtyType field) {
    return isSetField(field);
  }

  public boolean isSetLegQtyType() {
    return isSetField(1591);
  }
}

  public void set(quickfix.field.CustOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.CustOrderHandlingInst get(quickfix.field.CustOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderHandlingInst getCustOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.CustOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.CustOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderHandlingInst() {
    return isSetField(1031);
  }

  public void set(quickfix.field.OrderHandlingInstSource value) {
    setField(value);
  }

  public quickfix.field.OrderHandlingInstSource get(quickfix.field.OrderHandlingInstSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderHandlingInstSource getOrderHandlingInstSource() throws FieldNotFound {
    return get(new quickfix.field.OrderHandlingInstSource());
  }

  public boolean isSet(quickfix.field.OrderHandlingInstSource field) {
    return isSetField(field);
  }

  public boolean isSetOrderHandlingInstSource() {
    return isSetField(1032);
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
}
