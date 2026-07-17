/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class QuotSetGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {296, };
  protected int[] getGroupFields() { return componentGroups; }

  public QuotSetGrp() {
    super();
  }

  public void set(quickfix.field.NoQuoteSets value) {
    setField(value);
  }

  public quickfix.field.NoQuoteSets get(quickfix.field.NoQuoteSets value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteSets getNoQuoteSets() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteSets());
  }

  public boolean isSet(quickfix.field.NoQuoteSets field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteSets() {
    return isSetField(296);
  }

public static class NoQuoteSets extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {302, 311, 312, 309, 305, 457, 2874, 462, 1874, 1875, 1876, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1981, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2080, 2312, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2045, 2295, 2296, 2297, 2756, 2298, 2299, 40964, 40962, 40965, 41949, 41950, 41947, 41951, 41952, 41953, 41859, 41864, 41860, 41866, 41868, 41861, 41862, 41863, 41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, 43076, 43077, 43074, 43078, 43079, 43080, 43081, 43082, 41822, 41820, 41841, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, 41846, 41844, 41856, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, 42888, 42889, 42890, 42891, 42892, 42893, 42894, 40540, 42149, 42036, 42068, 42041, 42060, 43004, 43005, 42860, 42861, 42855, 42884, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, 367, 304, 893, 295, 0};

  public NoQuoteSets() {
    super(296, 302, ORDER);
  }

  public void set(quickfix.field.QuoteSetID value) {
    setField(value);
  }

  public quickfix.field.QuoteSetID get(quickfix.field.QuoteSetID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteSetID getQuoteSetID() throws FieldNotFound {
    return get(new quickfix.field.QuoteSetID());
  }

  public boolean isSet(quickfix.field.QuoteSetID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteSetID() {
    return isSetField(302);
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

  public void set(quickfix.field.QuoteSetValidUntilTime value) {
    setField(value);
  }

  public quickfix.field.QuoteSetValidUntilTime get(quickfix.field.QuoteSetValidUntilTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteSetValidUntilTime getQuoteSetValidUntilTime() throws FieldNotFound {
    return get(new quickfix.field.QuoteSetValidUntilTime());
  }

  public boolean isSet(quickfix.field.QuoteSetValidUntilTime field) {
    return isSetField(field);
  }

  public boolean isSetQuoteSetValidUntilTime() {
    return isSetField(367);
  }

  public void set(quickfix.field.TotNoQuoteEntries value) {
    setField(value);
  }

  public quickfix.field.TotNoQuoteEntries get(quickfix.field.TotNoQuoteEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoQuoteEntries getTotNoQuoteEntries() throws FieldNotFound {
    return get(new quickfix.field.TotNoQuoteEntries());
  }

  public boolean isSet(quickfix.field.TotNoQuoteEntries field) {
    return isSetField(field);
  }

  public boolean isSetTotNoQuoteEntries() {
    return isSetField(304);
  }

  public void set(quickfix.field.LastFragment value) {
    setField(value);
  }

  public quickfix.field.LastFragment get(quickfix.field.LastFragment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastFragment getLastFragment() throws FieldNotFound {
    return get(new quickfix.field.LastFragment());
  }

  public boolean isSet(quickfix.field.LastFragment field) {
    return isSetField(field);
  }

  public boolean isSetLastFragment() {
    return isSetField(893);
  }

  public void set(quickfix.fixlatest.component.QuotEntryGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.QuotEntryGrp get(quickfix.fixlatest.component.QuotEntryGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.QuotEntryGrp getQuotEntryGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.QuotEntryGrp());
  }

  public void set(quickfix.field.NoQuoteEntries value) {
    setField(value);
  }

  public quickfix.field.NoQuoteEntries get(quickfix.field.NoQuoteEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteEntries getNoQuoteEntries() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteEntries());
  }

  public boolean isSet(quickfix.field.NoQuoteEntries field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteEntries() {
    return isSetField(295);
  }

public static class NoQuoteEntries extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {299, 55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 555, 132, 133, 1749, 1750, 134, 135, 62, 188, 190, 189, 191, 631, 632, 633, 634, 60, 336, 625, 64, 40, 193, 192, 642, 643, 15, 775, 528, 529, 0};

  public NoQuoteEntries() {
    super(295, 299, ORDER);
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

  public void set(quickfix.field.BidPx value) {
    setField(value);
  }

  public quickfix.field.BidPx get(quickfix.field.BidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidPx getBidPx() throws FieldNotFound {
    return get(new quickfix.field.BidPx());
  }

  public boolean isSet(quickfix.field.BidPx field) {
    return isSetField(field);
  }

  public boolean isSetBidPx() {
    return isSetField(132);
  }

  public void set(quickfix.field.OfferPx value) {
    setField(value);
  }

  public quickfix.field.OfferPx get(quickfix.field.OfferPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferPx getOfferPx() throws FieldNotFound {
    return get(new quickfix.field.OfferPx());
  }

  public boolean isSet(quickfix.field.OfferPx field) {
    return isSetField(field);
  }

  public boolean isSetOfferPx() {
    return isSetField(133);
  }

  public void set(quickfix.field.TotalBidSize value) {
    setField(value);
  }

  public quickfix.field.TotalBidSize get(quickfix.field.TotalBidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalBidSize getTotalBidSize() throws FieldNotFound {
    return get(new quickfix.field.TotalBidSize());
  }

  public boolean isSet(quickfix.field.TotalBidSize field) {
    return isSetField(field);
  }

  public boolean isSetTotalBidSize() {
    return isSetField(1749);
  }

  public void set(quickfix.field.TotalOfferSize value) {
    setField(value);
  }

  public quickfix.field.TotalOfferSize get(quickfix.field.TotalOfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalOfferSize getTotalOfferSize() throws FieldNotFound {
    return get(new quickfix.field.TotalOfferSize());
  }

  public boolean isSet(quickfix.field.TotalOfferSize field) {
    return isSetField(field);
  }

  public boolean isSetTotalOfferSize() {
    return isSetField(1750);
  }

  public void set(quickfix.field.BidSize value) {
    setField(value);
  }

  public quickfix.field.BidSize get(quickfix.field.BidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidSize getBidSize() throws FieldNotFound {
    return get(new quickfix.field.BidSize());
  }

  public boolean isSet(quickfix.field.BidSize field) {
    return isSetField(field);
  }

  public boolean isSetBidSize() {
    return isSetField(134);
  }

  public void set(quickfix.field.OfferSize value) {
    setField(value);
  }

  public quickfix.field.OfferSize get(quickfix.field.OfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferSize getOfferSize() throws FieldNotFound {
    return get(new quickfix.field.OfferSize());
  }

  public boolean isSet(quickfix.field.OfferSize field) {
    return isSetField(field);
  }

  public boolean isSetOfferSize() {
    return isSetField(135);
  }

  public void set(quickfix.field.ValidUntilTime value) {
    setField(value);
  }

  public quickfix.field.ValidUntilTime get(quickfix.field.ValidUntilTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
    return get(new quickfix.field.ValidUntilTime());
  }

  public boolean isSet(quickfix.field.ValidUntilTime field) {
    return isSetField(field);
  }

  public boolean isSetValidUntilTime() {
    return isSetField(62);
  }

  public void set(quickfix.field.BidSpotRate value) {
    setField(value);
  }

  public quickfix.field.BidSpotRate get(quickfix.field.BidSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidSpotRate getBidSpotRate() throws FieldNotFound {
    return get(new quickfix.field.BidSpotRate());
  }

  public boolean isSet(quickfix.field.BidSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetBidSpotRate() {
    return isSetField(188);
  }

  public void set(quickfix.field.OfferSpotRate value) {
    setField(value);
  }

  public quickfix.field.OfferSpotRate get(quickfix.field.OfferSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferSpotRate getOfferSpotRate() throws FieldNotFound {
    return get(new quickfix.field.OfferSpotRate());
  }

  public boolean isSet(quickfix.field.OfferSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetOfferSpotRate() {
    return isSetField(190);
  }

  public void set(quickfix.field.BidForwardPoints value) {
    setField(value);
  }

  public quickfix.field.BidForwardPoints get(quickfix.field.BidForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidForwardPoints getBidForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.BidForwardPoints());
  }

  public boolean isSet(quickfix.field.BidForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetBidForwardPoints() {
    return isSetField(189);
  }

  public void set(quickfix.field.OfferForwardPoints value) {
    setField(value);
  }

  public quickfix.field.OfferForwardPoints get(quickfix.field.OfferForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferForwardPoints getOfferForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.OfferForwardPoints());
  }

  public boolean isSet(quickfix.field.OfferForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetOfferForwardPoints() {
    return isSetField(191);
  }

  public void set(quickfix.field.MidPx value) {
    setField(value);
  }

  public quickfix.field.MidPx get(quickfix.field.MidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidPx getMidPx() throws FieldNotFound {
    return get(new quickfix.field.MidPx());
  }

  public boolean isSet(quickfix.field.MidPx field) {
    return isSetField(field);
  }

  public boolean isSetMidPx() {
    return isSetField(631);
  }

  public void set(quickfix.field.BidYield value) {
    setField(value);
  }

  public quickfix.field.BidYield get(quickfix.field.BidYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidYield getBidYield() throws FieldNotFound {
    return get(new quickfix.field.BidYield());
  }

  public boolean isSet(quickfix.field.BidYield field) {
    return isSetField(field);
  }

  public boolean isSetBidYield() {
    return isSetField(632);
  }

  public void set(quickfix.field.MidYield value) {
    setField(value);
  }

  public quickfix.field.MidYield get(quickfix.field.MidYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidYield getMidYield() throws FieldNotFound {
    return get(new quickfix.field.MidYield());
  }

  public boolean isSet(quickfix.field.MidYield field) {
    return isSetField(field);
  }

  public boolean isSetMidYield() {
    return isSetField(633);
  }

  public void set(quickfix.field.OfferYield value) {
    setField(value);
  }

  public quickfix.field.OfferYield get(quickfix.field.OfferYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferYield getOfferYield() throws FieldNotFound {
    return get(new quickfix.field.OfferYield());
  }

  public boolean isSet(quickfix.field.OfferYield field) {
    return isSetField(field);
  }

  public boolean isSetOfferYield() {
    return isSetField(634);
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

  public void set(quickfix.field.SettlDate2 value) {
    setField(value);
  }

  public quickfix.field.SettlDate2 get(quickfix.field.SettlDate2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate2 getSettlDate2() throws FieldNotFound {
    return get(new quickfix.field.SettlDate2());
  }

  public boolean isSet(quickfix.field.SettlDate2 field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate2() {
    return isSetField(193);
  }

  public void set(quickfix.field.OrderQty2 value) {
    setField(value);
  }

  public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
    return get(new quickfix.field.OrderQty2());
  }

  public boolean isSet(quickfix.field.OrderQty2 field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty2() {
    return isSetField(192);
  }

  public void set(quickfix.field.BidForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.BidForwardPoints2 get(quickfix.field.BidForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidForwardPoints2 getBidForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.BidForwardPoints2());
  }

  public boolean isSet(quickfix.field.BidForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetBidForwardPoints2() {
    return isSetField(642);
  }

  public void set(quickfix.field.OfferForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.OfferForwardPoints2 get(quickfix.field.OfferForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferForwardPoints2 getOfferForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.OfferForwardPoints2());
  }

  public boolean isSet(quickfix.field.OfferForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetOfferForwardPoints2() {
    return isSetField(643);
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

  public void set(quickfix.field.BookingType value) {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound {
    return get(new quickfix.field.BookingType());
  }

  public boolean isSet(quickfix.field.BookingType field) {
    return isSetField(field);
  }

  public boolean isSetBookingType() {
    return isSetField(775);
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

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }
}
}

  public void set(quickfix.field.QuoteSetID value) {
    setField(value);
  }

  public quickfix.field.QuoteSetID get(quickfix.field.QuoteSetID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteSetID getQuoteSetID() throws FieldNotFound {
    return get(new quickfix.field.QuoteSetID());
  }

  public boolean isSet(quickfix.field.QuoteSetID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteSetID() {
    return isSetField(302);
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

  public void set(quickfix.field.QuoteSetValidUntilTime value) {
    setField(value);
  }

  public quickfix.field.QuoteSetValidUntilTime get(quickfix.field.QuoteSetValidUntilTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteSetValidUntilTime getQuoteSetValidUntilTime() throws FieldNotFound {
    return get(new quickfix.field.QuoteSetValidUntilTime());
  }

  public boolean isSet(quickfix.field.QuoteSetValidUntilTime field) {
    return isSetField(field);
  }

  public boolean isSetQuoteSetValidUntilTime() {
    return isSetField(367);
  }

  public void set(quickfix.field.TotNoQuoteEntries value) {
    setField(value);
  }

  public quickfix.field.TotNoQuoteEntries get(quickfix.field.TotNoQuoteEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoQuoteEntries getTotNoQuoteEntries() throws FieldNotFound {
    return get(new quickfix.field.TotNoQuoteEntries());
  }

  public boolean isSet(quickfix.field.TotNoQuoteEntries field) {
    return isSetField(field);
  }

  public boolean isSetTotNoQuoteEntries() {
    return isSetField(304);
  }

  public void set(quickfix.field.LastFragment value) {
    setField(value);
  }

  public quickfix.field.LastFragment get(quickfix.field.LastFragment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastFragment getLastFragment() throws FieldNotFound {
    return get(new quickfix.field.LastFragment());
  }

  public boolean isSet(quickfix.field.LastFragment field) {
    return isSetField(field);
  }

  public boolean isSetLastFragment() {
    return isSetField(893);
  }

  public void set(quickfix.fixlatest.component.QuotEntryGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.QuotEntryGrp get(quickfix.fixlatest.component.QuotEntryGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.QuotEntryGrp getQuotEntryGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.QuotEntryGrp());
  }

  public void set(quickfix.field.NoQuoteEntries value) {
    setField(value);
  }

  public quickfix.field.NoQuoteEntries get(quickfix.field.NoQuoteEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteEntries getNoQuoteEntries() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteEntries());
  }

  public boolean isSet(quickfix.field.NoQuoteEntries field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteEntries() {
    return isSetField(295);
  }

public static class NoQuoteEntries extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {299, 55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 555, 132, 133, 1749, 1750, 134, 135, 62, 188, 190, 189, 191, 631, 632, 633, 634, 60, 336, 625, 64, 40, 193, 192, 642, 643, 15, 775, 528, 529, 0};

  public NoQuoteEntries() {
    super(295, 299, ORDER);
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

  public void set(quickfix.field.BidPx value) {
    setField(value);
  }

  public quickfix.field.BidPx get(quickfix.field.BidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidPx getBidPx() throws FieldNotFound {
    return get(new quickfix.field.BidPx());
  }

  public boolean isSet(quickfix.field.BidPx field) {
    return isSetField(field);
  }

  public boolean isSetBidPx() {
    return isSetField(132);
  }

  public void set(quickfix.field.OfferPx value) {
    setField(value);
  }

  public quickfix.field.OfferPx get(quickfix.field.OfferPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferPx getOfferPx() throws FieldNotFound {
    return get(new quickfix.field.OfferPx());
  }

  public boolean isSet(quickfix.field.OfferPx field) {
    return isSetField(field);
  }

  public boolean isSetOfferPx() {
    return isSetField(133);
  }

  public void set(quickfix.field.TotalBidSize value) {
    setField(value);
  }

  public quickfix.field.TotalBidSize get(quickfix.field.TotalBidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalBidSize getTotalBidSize() throws FieldNotFound {
    return get(new quickfix.field.TotalBidSize());
  }

  public boolean isSet(quickfix.field.TotalBidSize field) {
    return isSetField(field);
  }

  public boolean isSetTotalBidSize() {
    return isSetField(1749);
  }

  public void set(quickfix.field.TotalOfferSize value) {
    setField(value);
  }

  public quickfix.field.TotalOfferSize get(quickfix.field.TotalOfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalOfferSize getTotalOfferSize() throws FieldNotFound {
    return get(new quickfix.field.TotalOfferSize());
  }

  public boolean isSet(quickfix.field.TotalOfferSize field) {
    return isSetField(field);
  }

  public boolean isSetTotalOfferSize() {
    return isSetField(1750);
  }

  public void set(quickfix.field.BidSize value) {
    setField(value);
  }

  public quickfix.field.BidSize get(quickfix.field.BidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidSize getBidSize() throws FieldNotFound {
    return get(new quickfix.field.BidSize());
  }

  public boolean isSet(quickfix.field.BidSize field) {
    return isSetField(field);
  }

  public boolean isSetBidSize() {
    return isSetField(134);
  }

  public void set(quickfix.field.OfferSize value) {
    setField(value);
  }

  public quickfix.field.OfferSize get(quickfix.field.OfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferSize getOfferSize() throws FieldNotFound {
    return get(new quickfix.field.OfferSize());
  }

  public boolean isSet(quickfix.field.OfferSize field) {
    return isSetField(field);
  }

  public boolean isSetOfferSize() {
    return isSetField(135);
  }

  public void set(quickfix.field.ValidUntilTime value) {
    setField(value);
  }

  public quickfix.field.ValidUntilTime get(quickfix.field.ValidUntilTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
    return get(new quickfix.field.ValidUntilTime());
  }

  public boolean isSet(quickfix.field.ValidUntilTime field) {
    return isSetField(field);
  }

  public boolean isSetValidUntilTime() {
    return isSetField(62);
  }

  public void set(quickfix.field.BidSpotRate value) {
    setField(value);
  }

  public quickfix.field.BidSpotRate get(quickfix.field.BidSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidSpotRate getBidSpotRate() throws FieldNotFound {
    return get(new quickfix.field.BidSpotRate());
  }

  public boolean isSet(quickfix.field.BidSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetBidSpotRate() {
    return isSetField(188);
  }

  public void set(quickfix.field.OfferSpotRate value) {
    setField(value);
  }

  public quickfix.field.OfferSpotRate get(quickfix.field.OfferSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferSpotRate getOfferSpotRate() throws FieldNotFound {
    return get(new quickfix.field.OfferSpotRate());
  }

  public boolean isSet(quickfix.field.OfferSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetOfferSpotRate() {
    return isSetField(190);
  }

  public void set(quickfix.field.BidForwardPoints value) {
    setField(value);
  }

  public quickfix.field.BidForwardPoints get(quickfix.field.BidForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidForwardPoints getBidForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.BidForwardPoints());
  }

  public boolean isSet(quickfix.field.BidForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetBidForwardPoints() {
    return isSetField(189);
  }

  public void set(quickfix.field.OfferForwardPoints value) {
    setField(value);
  }

  public quickfix.field.OfferForwardPoints get(quickfix.field.OfferForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferForwardPoints getOfferForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.OfferForwardPoints());
  }

  public boolean isSet(quickfix.field.OfferForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetOfferForwardPoints() {
    return isSetField(191);
  }

  public void set(quickfix.field.MidPx value) {
    setField(value);
  }

  public quickfix.field.MidPx get(quickfix.field.MidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidPx getMidPx() throws FieldNotFound {
    return get(new quickfix.field.MidPx());
  }

  public boolean isSet(quickfix.field.MidPx field) {
    return isSetField(field);
  }

  public boolean isSetMidPx() {
    return isSetField(631);
  }

  public void set(quickfix.field.BidYield value) {
    setField(value);
  }

  public quickfix.field.BidYield get(quickfix.field.BidYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidYield getBidYield() throws FieldNotFound {
    return get(new quickfix.field.BidYield());
  }

  public boolean isSet(quickfix.field.BidYield field) {
    return isSetField(field);
  }

  public boolean isSetBidYield() {
    return isSetField(632);
  }

  public void set(quickfix.field.MidYield value) {
    setField(value);
  }

  public quickfix.field.MidYield get(quickfix.field.MidYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidYield getMidYield() throws FieldNotFound {
    return get(new quickfix.field.MidYield());
  }

  public boolean isSet(quickfix.field.MidYield field) {
    return isSetField(field);
  }

  public boolean isSetMidYield() {
    return isSetField(633);
  }

  public void set(quickfix.field.OfferYield value) {
    setField(value);
  }

  public quickfix.field.OfferYield get(quickfix.field.OfferYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferYield getOfferYield() throws FieldNotFound {
    return get(new quickfix.field.OfferYield());
  }

  public boolean isSet(quickfix.field.OfferYield field) {
    return isSetField(field);
  }

  public boolean isSetOfferYield() {
    return isSetField(634);
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

  public void set(quickfix.field.SettlDate2 value) {
    setField(value);
  }

  public quickfix.field.SettlDate2 get(quickfix.field.SettlDate2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate2 getSettlDate2() throws FieldNotFound {
    return get(new quickfix.field.SettlDate2());
  }

  public boolean isSet(quickfix.field.SettlDate2 field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate2() {
    return isSetField(193);
  }

  public void set(quickfix.field.OrderQty2 value) {
    setField(value);
  }

  public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
    return get(new quickfix.field.OrderQty2());
  }

  public boolean isSet(quickfix.field.OrderQty2 field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty2() {
    return isSetField(192);
  }

  public void set(quickfix.field.BidForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.BidForwardPoints2 get(quickfix.field.BidForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidForwardPoints2 getBidForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.BidForwardPoints2());
  }

  public boolean isSet(quickfix.field.BidForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetBidForwardPoints2() {
    return isSetField(642);
  }

  public void set(quickfix.field.OfferForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.OfferForwardPoints2 get(quickfix.field.OfferForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferForwardPoints2 getOfferForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.OfferForwardPoints2());
  }

  public boolean isSet(quickfix.field.OfferForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetOfferForwardPoints2() {
    return isSetField(643);
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

  public void set(quickfix.field.BookingType value) {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound {
    return get(new quickfix.field.BookingType());
  }

  public boolean isSet(quickfix.field.BookingType field) {
    return isSetField(field);
  }

  public boolean isSetBookingType() {
    return isSetField(775);
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

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }
}
}
