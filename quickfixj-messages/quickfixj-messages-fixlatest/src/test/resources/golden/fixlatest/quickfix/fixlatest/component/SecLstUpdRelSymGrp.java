/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecLstUpdRelSymGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {146, };
  protected int[] getGroupFields() { return componentGroups; }

  public SecLstUpdRelSymGrp() {
    super();
  }

  public void set(quickfix.field.NoRelatedSym value) {
    setField(value);
  }

  public quickfix.field.NoRelatedSym get(quickfix.field.NoRelatedSym value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedSym());
  }

  public boolean isSet(quickfix.field.NoRelatedSym field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedSym() {
    return isSetField(146);
  }

public static class NoRelatedSym extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1324, 55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 668, 869, 870, 2736, 2734, 2738, 2731, 2732, 2730, 2728, 2729, 2746, 913, 914, 1961, 915, 918, 1962, 1963, 1964, 1965, 1966, 40040, 40046, 40042, 1967, 1968, 1969, 1970, 1513, 1525, 1527, 788, 916, 917, 919, 898, 1205, 1234, 1306, 1148, 1149, 1150, 2550, 2558, 827, 1786, 562, 1140, 1143, 1144, 1245, 561, 1377, 1378, 423, 2557, 2559, 1309, 1312, 1201, 711, 15, 232, 555, 1647, 218, 220, 221, 222, 662, 663, 699, 761, 235, 236, 701, 696, 697, 698, 1504, 58, 354, 355, 0};

  public NoRelatedSym() {
    super(146, 1324, ORDER);
  }

  public void set(quickfix.field.ListUpdateAction value) {
    setField(value);
  }

  public quickfix.field.ListUpdateAction get(quickfix.field.ListUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListUpdateAction getListUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.ListUpdateAction());
  }

  public boolean isSet(quickfix.field.ListUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetListUpdateAction() {
    return isSetField(1324);
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

  public void set(quickfix.fixlatest.component.SecurityTradingRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecurityTradingRules get(quickfix.fixlatest.component.SecurityTradingRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecurityTradingRules getSecurityTradingRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecurityTradingRules());
  }

  public void set(quickfix.fixlatest.component.StrikeRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StrikeRules get(quickfix.fixlatest.component.StrikeRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StrikeRules getStrikeRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StrikeRules());
  }

  public void set(quickfix.field.NoStrikeRules value) {
    setField(value);
  }

  public quickfix.field.NoStrikeRules get(quickfix.field.NoStrikeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrikeRules getNoStrikeRules() throws FieldNotFound {
    return get(new quickfix.field.NoStrikeRules());
  }

  public boolean isSet(quickfix.field.NoStrikeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoStrikeRules() {
    return isSetField(1201);
  }

public static class NoStrikeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1223, 1202, 1203, 1204, 1304, 1236, 0};

  public NoStrikeRules() {
    super(1201, 1223, ORDER);
  }

  public void set(quickfix.field.StrikeRuleID value) {
    setField(value);
  }

  public quickfix.field.StrikeRuleID get(quickfix.field.StrikeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeRuleID getStrikeRuleID() throws FieldNotFound {
    return get(new quickfix.field.StrikeRuleID());
  }

  public boolean isSet(quickfix.field.StrikeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetStrikeRuleID() {
    return isSetField(1223);
  }

  public void set(quickfix.field.StartStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.StartStrikePxRange get(quickfix.field.StartStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartStrikePxRange getStartStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.StartStrikePxRange());
  }

  public boolean isSet(quickfix.field.StartStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetStartStrikePxRange() {
    return isSetField(1202);
  }

  public void set(quickfix.field.EndStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.EndStrikePxRange get(quickfix.field.EndStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndStrikePxRange getEndStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.EndStrikePxRange());
  }

  public boolean isSet(quickfix.field.EndStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetEndStrikePxRange() {
    return isSetField(1203);
  }

  public void set(quickfix.field.StrikeIncrement value) {
    setField(value);
  }

  public quickfix.field.StrikeIncrement get(quickfix.field.StrikeIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIncrement getStrikeIncrement() throws FieldNotFound {
    return get(new quickfix.field.StrikeIncrement());
  }

  public boolean isSet(quickfix.field.StrikeIncrement field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIncrement() {
    return isSetField(1204);
  }

  public void set(quickfix.field.StrikeExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.StrikeExerciseStyle get(quickfix.field.StrikeExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeExerciseStyle getStrikeExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.StrikeExerciseStyle());
  }

  public boolean isSet(quickfix.field.StrikeExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetStrikeExerciseStyle() {
    return isSetField(1304);
  }

  public void set(quickfix.fixlatest.component.MaturityRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MaturityRules get(quickfix.fixlatest.component.MaturityRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MaturityRules getMaturityRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MaturityRules());
  }

  public void set(quickfix.field.NoMaturityRules value) {
    setField(value);
  }

  public quickfix.field.NoMaturityRules get(quickfix.field.NoMaturityRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMaturityRules getNoMaturityRules() throws FieldNotFound {
    return get(new quickfix.field.NoMaturityRules());
  }

  public boolean isSet(quickfix.field.NoMaturityRules field) {
    return isSetField(field);
  }

  public boolean isSetNoMaturityRules() {
    return isSetField(1236);
  }

public static class NoMaturityRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1222, 1303, 1302, 1241, 1226, 1229, 0};

  public NoMaturityRules() {
    super(1236, 1222, ORDER);
  }

  public void set(quickfix.field.MaturityRuleID value) {
    setField(value);
  }

  public quickfix.field.MaturityRuleID get(quickfix.field.MaturityRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityRuleID getMaturityRuleID() throws FieldNotFound {
    return get(new quickfix.field.MaturityRuleID());
  }

  public boolean isSet(quickfix.field.MaturityRuleID field) {
    return isSetField(field);
  }

  public boolean isSetMaturityRuleID() {
    return isSetField(1222);
  }

  public void set(quickfix.field.MaturityMonthYearFormat value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearFormat get(quickfix.field.MaturityMonthYearFormat value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearFormat getMaturityMonthYearFormat() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearFormat());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearFormat field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearFormat() {
    return isSetField(1303);
  }

  public void set(quickfix.field.MaturityMonthYearIncrementUnits value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrementUnits get(quickfix.field.MaturityMonthYearIncrementUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrementUnits getMaturityMonthYearIncrementUnits() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrementUnits());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrementUnits field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrementUnits() {
    return isSetField(1302);
  }

  public void set(quickfix.field.StartMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.StartMaturityMonthYear get(quickfix.field.StartMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartMaturityMonthYear getStartMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.StartMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.StartMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetStartMaturityMonthYear() {
    return isSetField(1241);
  }

  public void set(quickfix.field.EndMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.EndMaturityMonthYear get(quickfix.field.EndMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndMaturityMonthYear getEndMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EndMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.EndMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEndMaturityMonthYear() {
    return isSetField(1226);
  }

  public void set(quickfix.field.MaturityMonthYearIncrement value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrement get(quickfix.field.MaturityMonthYearIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrement getMaturityMonthYearIncrement() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrement());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrement() {
    return isSetField(1229);
  }
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

  public void set(quickfix.fixlatest.component.Stipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Stipulations get(quickfix.fixlatest.component.Stipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Stipulations getStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Stipulations());
  }

  public void set(quickfix.field.NoStipulations value) {
    setField(value);
  }

  public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoStipulations());
  }

  public boolean isSet(quickfix.field.NoStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoStipulations() {
    return isSetField(232);
  }

public static class NoStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {233, 234, 0};

  public NoStipulations() {
    super(232, 233, ORDER);
  }

  public void set(quickfix.field.StipulationType value) {
    setField(value);
  }

  public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
    return get(new quickfix.field.StipulationType());
  }

  public boolean isSet(quickfix.field.StipulationType field) {
    return isSetField(field);
  }

  public boolean isSetStipulationType() {
    return isSetField(233);
  }

  public void set(quickfix.field.StipulationValue value) {
    setField(value);
  }

  public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.StipulationValue());
  }

  public boolean isSet(quickfix.field.StipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetStipulationValue() {
    return isSetField(234);
  }
}

  public void set(quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp get(quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp getSecLstUpdRelSymsLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 690, 587, 683, 676, 677, 678, 679, 680, 0};

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

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
}

  public void set(quickfix.fixlatest.component.LegBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegBenchmarkCurveData get(quickfix.fixlatest.component.LegBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegBenchmarkCurveData getLegBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegBenchmarkCurveData());
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

  public void set(quickfix.field.RelSymTransactTime value) {
    setField(value);
  }

  public quickfix.field.RelSymTransactTime get(quickfix.field.RelSymTransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelSymTransactTime getRelSymTransactTime() throws FieldNotFound {
    return get(new quickfix.field.RelSymTransactTime());
  }

  public boolean isSet(quickfix.field.RelSymTransactTime field) {
    return isSetField(field);
  }

  public boolean isSetRelSymTransactTime() {
    return isSetField(1504);
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

  public void set(quickfix.field.ListUpdateAction value) {
    setField(value);
  }

  public quickfix.field.ListUpdateAction get(quickfix.field.ListUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListUpdateAction getListUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.ListUpdateAction());
  }

  public boolean isSet(quickfix.field.ListUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetListUpdateAction() {
    return isSetField(1324);
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

  public void set(quickfix.fixlatest.component.SecurityTradingRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecurityTradingRules get(quickfix.fixlatest.component.SecurityTradingRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecurityTradingRules getSecurityTradingRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecurityTradingRules());
  }

  public void set(quickfix.fixlatest.component.StrikeRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StrikeRules get(quickfix.fixlatest.component.StrikeRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StrikeRules getStrikeRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StrikeRules());
  }

  public void set(quickfix.field.NoStrikeRules value) {
    setField(value);
  }

  public quickfix.field.NoStrikeRules get(quickfix.field.NoStrikeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrikeRules getNoStrikeRules() throws FieldNotFound {
    return get(new quickfix.field.NoStrikeRules());
  }

  public boolean isSet(quickfix.field.NoStrikeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoStrikeRules() {
    return isSetField(1201);
  }

public static class NoStrikeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1223, 1202, 1203, 1204, 1304, 1236, 0};

  public NoStrikeRules() {
    super(1201, 1223, ORDER);
  }

  public void set(quickfix.field.StrikeRuleID value) {
    setField(value);
  }

  public quickfix.field.StrikeRuleID get(quickfix.field.StrikeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeRuleID getStrikeRuleID() throws FieldNotFound {
    return get(new quickfix.field.StrikeRuleID());
  }

  public boolean isSet(quickfix.field.StrikeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetStrikeRuleID() {
    return isSetField(1223);
  }

  public void set(quickfix.field.StartStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.StartStrikePxRange get(quickfix.field.StartStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartStrikePxRange getStartStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.StartStrikePxRange());
  }

  public boolean isSet(quickfix.field.StartStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetStartStrikePxRange() {
    return isSetField(1202);
  }

  public void set(quickfix.field.EndStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.EndStrikePxRange get(quickfix.field.EndStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndStrikePxRange getEndStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.EndStrikePxRange());
  }

  public boolean isSet(quickfix.field.EndStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetEndStrikePxRange() {
    return isSetField(1203);
  }

  public void set(quickfix.field.StrikeIncrement value) {
    setField(value);
  }

  public quickfix.field.StrikeIncrement get(quickfix.field.StrikeIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIncrement getStrikeIncrement() throws FieldNotFound {
    return get(new quickfix.field.StrikeIncrement());
  }

  public boolean isSet(quickfix.field.StrikeIncrement field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIncrement() {
    return isSetField(1204);
  }

  public void set(quickfix.field.StrikeExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.StrikeExerciseStyle get(quickfix.field.StrikeExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeExerciseStyle getStrikeExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.StrikeExerciseStyle());
  }

  public boolean isSet(quickfix.field.StrikeExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetStrikeExerciseStyle() {
    return isSetField(1304);
  }

  public void set(quickfix.fixlatest.component.MaturityRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MaturityRules get(quickfix.fixlatest.component.MaturityRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MaturityRules getMaturityRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MaturityRules());
  }

  public void set(quickfix.field.NoMaturityRules value) {
    setField(value);
  }

  public quickfix.field.NoMaturityRules get(quickfix.field.NoMaturityRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMaturityRules getNoMaturityRules() throws FieldNotFound {
    return get(new quickfix.field.NoMaturityRules());
  }

  public boolean isSet(quickfix.field.NoMaturityRules field) {
    return isSetField(field);
  }

  public boolean isSetNoMaturityRules() {
    return isSetField(1236);
  }

public static class NoMaturityRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1222, 1303, 1302, 1241, 1226, 1229, 0};

  public NoMaturityRules() {
    super(1236, 1222, ORDER);
  }

  public void set(quickfix.field.MaturityRuleID value) {
    setField(value);
  }

  public quickfix.field.MaturityRuleID get(quickfix.field.MaturityRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityRuleID getMaturityRuleID() throws FieldNotFound {
    return get(new quickfix.field.MaturityRuleID());
  }

  public boolean isSet(quickfix.field.MaturityRuleID field) {
    return isSetField(field);
  }

  public boolean isSetMaturityRuleID() {
    return isSetField(1222);
  }

  public void set(quickfix.field.MaturityMonthYearFormat value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearFormat get(quickfix.field.MaturityMonthYearFormat value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearFormat getMaturityMonthYearFormat() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearFormat());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearFormat field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearFormat() {
    return isSetField(1303);
  }

  public void set(quickfix.field.MaturityMonthYearIncrementUnits value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrementUnits get(quickfix.field.MaturityMonthYearIncrementUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrementUnits getMaturityMonthYearIncrementUnits() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrementUnits());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrementUnits field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrementUnits() {
    return isSetField(1302);
  }

  public void set(quickfix.field.StartMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.StartMaturityMonthYear get(quickfix.field.StartMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartMaturityMonthYear getStartMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.StartMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.StartMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetStartMaturityMonthYear() {
    return isSetField(1241);
  }

  public void set(quickfix.field.EndMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.EndMaturityMonthYear get(quickfix.field.EndMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndMaturityMonthYear getEndMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EndMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.EndMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEndMaturityMonthYear() {
    return isSetField(1226);
  }

  public void set(quickfix.field.MaturityMonthYearIncrement value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrement get(quickfix.field.MaturityMonthYearIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrement getMaturityMonthYearIncrement() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrement());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrement() {
    return isSetField(1229);
  }
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

  public void set(quickfix.fixlatest.component.Stipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Stipulations get(quickfix.fixlatest.component.Stipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Stipulations getStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Stipulations());
  }

  public void set(quickfix.field.NoStipulations value) {
    setField(value);
  }

  public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoStipulations());
  }

  public boolean isSet(quickfix.field.NoStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoStipulations() {
    return isSetField(232);
  }

public static class NoStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {233, 234, 0};

  public NoStipulations() {
    super(232, 233, ORDER);
  }

  public void set(quickfix.field.StipulationType value) {
    setField(value);
  }

  public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
    return get(new quickfix.field.StipulationType());
  }

  public boolean isSet(quickfix.field.StipulationType field) {
    return isSetField(field);
  }

  public boolean isSetStipulationType() {
    return isSetField(233);
  }

  public void set(quickfix.field.StipulationValue value) {
    setField(value);
  }

  public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.StipulationValue());
  }

  public boolean isSet(quickfix.field.StipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetStipulationValue() {
    return isSetField(234);
  }
}

  public void set(quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp get(quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp getSecLstUpdRelSymsLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecLstUpdRelSymsLegGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 690, 587, 683, 676, 677, 678, 679, 680, 0};

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

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
}

  public void set(quickfix.fixlatest.component.LegBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegBenchmarkCurveData get(quickfix.fixlatest.component.LegBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegBenchmarkCurveData getLegBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegBenchmarkCurveData());
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

  public void set(quickfix.field.RelSymTransactTime value) {
    setField(value);
  }

  public quickfix.field.RelSymTransactTime get(quickfix.field.RelSymTransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelSymTransactTime getRelSymTransactTime() throws FieldNotFound {
    return get(new quickfix.field.RelSymTransactTime());
  }

  public boolean isSet(quickfix.field.RelSymTransactTime field) {
    return isSetField(field);
  }

  public boolean isSetRelSymTransactTime() {
    return isSetField(1504);
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
