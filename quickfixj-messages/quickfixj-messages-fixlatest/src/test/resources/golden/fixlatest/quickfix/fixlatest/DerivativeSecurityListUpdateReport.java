/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class DerivativeSecurityListUpdateReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BR";

  public DerivativeSecurityListUpdateReport() {
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

  public void set(quickfix.field.SecurityReqID value) {
    setField(value);
  }

  public quickfix.field.SecurityReqID get(quickfix.field.SecurityReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
    return get(new quickfix.field.SecurityReqID());
  }

  public boolean isSet(quickfix.field.SecurityReqID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityReqID() {
    return isSetField(320);
  }

  public void set(quickfix.field.SecurityResponseID value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseID get(quickfix.field.SecurityResponseID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseID());
  }

  public boolean isSet(quickfix.field.SecurityResponseID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseID() {
    return isSetField(322);
  }

  public void set(quickfix.field.SecurityRequestResult value) {
    setField(value);
  }

  public quickfix.field.SecurityRequestResult get(quickfix.field.SecurityRequestResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityRequestResult getSecurityRequestResult() throws FieldNotFound {
    return get(new quickfix.field.SecurityRequestResult());
  }

  public boolean isSet(quickfix.field.SecurityRequestResult field) {
    return isSetField(field);
  }

  public boolean isSetSecurityRequestResult() {
    return isSetField(560);
  }

  public void set(quickfix.field.SecurityUpdateAction value) {
    setField(value);
  }

  public quickfix.field.SecurityUpdateAction get(quickfix.field.SecurityUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityUpdateAction getSecurityUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.SecurityUpdateAction());
  }

  public boolean isSet(quickfix.field.SecurityUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetSecurityUpdateAction() {
    return isSetField(980);
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

  public void set(quickfix.fixlatest.component.DerivativeSecurityDefinition component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeSecurityDefinition get(quickfix.fixlatest.component.DerivativeSecurityDefinition component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeSecurityDefinition getDerivativeSecurityDefinitionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeSecurityDefinition());
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

  public void set(quickfix.field.TotNoRelatedSym value) {
    setField(value);
  }

  public quickfix.field.TotNoRelatedSym get(quickfix.field.TotNoRelatedSym value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoRelatedSym getTotNoRelatedSym() throws FieldNotFound {
    return get(new quickfix.field.TotNoRelatedSym());
  }

  public boolean isSet(quickfix.field.TotNoRelatedSym field) {
    return isSetField(field);
  }

  public boolean isSetTotNoRelatedSym() {
    return isSetField(393);
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

  public void set(quickfix.fixlatest.component.RelSymDerivSecUpdGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelSymDerivSecUpdGrp get(quickfix.fixlatest.component.RelSymDerivSecUpdGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelSymDerivSecUpdGrp getRelSymDerivSecUpdGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelSymDerivSecUpdGrp());
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
  private static final int[]  ORDER = {1324, 292, 55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 668, 869, 870, 2736, 2734, 2738, 2731, 2732, 2730, 2728, 2729, 2746, 1305, 1221, 1230, 1240, 15, 555, 1504, 58, 354, 355, 0};

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

  public void set(quickfix.fixlatest.component.SecondaryPriceLimits component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecondaryPriceLimits get(quickfix.fixlatest.component.SecondaryPriceLimits component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecondaryPriceLimits getSecondaryPriceLimitsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecondaryPriceLimits());
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
}
