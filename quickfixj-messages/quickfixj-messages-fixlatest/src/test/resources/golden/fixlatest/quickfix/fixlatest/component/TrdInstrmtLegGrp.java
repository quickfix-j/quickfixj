/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TrdInstrmtLegGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {555, };
  protected int[] getGroupFields() { return componentGroups; }

  public TrdInstrmtLegGrp() {
    super();
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 2497, 2498, 2499, 2496, 2495, 2511, 2510, 2512, 2509, 2500, 42198, 42200, 42203, 2502, 2501, 2503, 2507, 2505, 2494, 2493, 2514, 2513, 2506, 2504, 2508, 1586, 685, 687, 2346, 690, 990, 1152, 683, 2680, 1817, 564, 565, 539, 654, 587, 588, 637, 686, 675, 1073, 1074, 1075, 1689, 1379, 1381, 1383, 1384, 1418, 1591, 2358, 2357, 2360, 2359, 1342, 2492, 0};

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

  public void set(quickfix.fixlatest.component.LegPositionAmountData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPositionAmountData get(quickfix.fixlatest.component.LegPositionAmountData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPositionAmountData getLegPositionAmountDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPositionAmountData());
  }

  public void set(quickfix.field.NoLegPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoLegPosAmt get(quickfix.field.NoLegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPosAmt getNoLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoLegPosAmt());
  }

  public boolean isSet(quickfix.field.NoLegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPosAmt() {
    return isSetField(1586);
  }

public static class NoLegPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1587, 1588, 1589, 1590, 0};

  public NoLegPosAmt() {
    super(1586, 1587, ORDER);
  }

  public void set(quickfix.field.LegPosAmt value) {
    setField(value);
  }

  public quickfix.field.LegPosAmt get(quickfix.field.LegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmt getLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmt());
  }

  public boolean isSet(quickfix.field.LegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmt() {
    return isSetField(1587);
  }

  public void set(quickfix.field.LegPosAmtType value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtType get(quickfix.field.LegPosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtType getLegPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtType());
  }

  public boolean isSet(quickfix.field.LegPosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtType() {
    return isSetField(1588);
  }

  public void set(quickfix.field.LegPosCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPosCurrency get(quickfix.field.LegPosCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosCurrency getLegPosCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPosCurrency());
  }

  public boolean isSet(quickfix.field.LegPosCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPosCurrency() {
    return isSetField(1589);
  }

  public void set(quickfix.field.LegPosAmtReason value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtReason get(quickfix.field.LegPosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtReason getLegPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtReason());
  }

  public boolean isSet(quickfix.field.LegPosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtReason() {
    return isSetField(1590);
  }
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

  public void set(quickfix.field.LegQty value) {
    setField(value);
  }

  public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQty getLegQty() throws FieldNotFound {
    return get(new quickfix.field.LegQty());
  }

  public boolean isSet(quickfix.field.LegQty field) {
    return isSetField(field);
  }

  public boolean isSetLegQty() {
    return isSetField(687);
  }

  public void set(quickfix.field.LegMidPx value) {
    setField(value);
  }

  public quickfix.field.LegMidPx get(quickfix.field.LegMidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMidPx getLegMidPx() throws FieldNotFound {
    return get(new quickfix.field.LegMidPx());
  }

  public boolean isSet(quickfix.field.LegMidPx field) {
    return isSetField(field);
  }

  public boolean isSetLegMidPx() {
    return isSetField(2346);
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

  public void set(quickfix.field.LegReportID value) {
    setField(value);
  }

  public quickfix.field.LegReportID get(quickfix.field.LegReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReportID getLegReportID() throws FieldNotFound {
    return get(new quickfix.field.LegReportID());
  }

  public boolean isSet(quickfix.field.LegReportID field) {
    return isSetField(field);
  }

  public boolean isSetLegReportID() {
    return isSetField(990);
  }

  public void set(quickfix.field.LegNumber value) {
    setField(value);
  }

  public quickfix.field.LegNumber get(quickfix.field.LegNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNumber getLegNumber() throws FieldNotFound {
    return get(new quickfix.field.LegNumber());
  }

  public boolean isSet(quickfix.field.LegNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegNumber() {
    return isSetField(1152);
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

  public void set(quickfix.field.LegAccount value) {
    setField(value);
  }

  public quickfix.field.LegAccount get(quickfix.field.LegAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAccount getLegAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAccount());
  }

  public boolean isSet(quickfix.field.LegAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAccount() {
    return isSetField(2680);
  }

  public void set(quickfix.field.LegClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.LegClearingAccountType get(quickfix.field.LegClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegClearingAccountType getLegClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.LegClearingAccountType());
  }

  public boolean isSet(quickfix.field.LegClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetLegClearingAccountType() {
    return isSetField(1817);
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

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
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

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
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

  public void set(quickfix.field.LegLastForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegLastForwardPoints get(quickfix.field.LegLastForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastForwardPoints getLegLastForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegLastForwardPoints());
  }

  public boolean isSet(quickfix.field.LegLastForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegLastForwardPoints() {
    return isSetField(1073);
  }

  public void set(quickfix.field.LegCalculatedCcyLastQty value) {
    setField(value);
  }

  public quickfix.field.LegCalculatedCcyLastQty get(quickfix.field.LegCalculatedCcyLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCalculatedCcyLastQty getLegCalculatedCcyLastQty() throws FieldNotFound {
    return get(new quickfix.field.LegCalculatedCcyLastQty());
  }

  public boolean isSet(quickfix.field.LegCalculatedCcyLastQty field) {
    return isSetField(field);
  }

  public boolean isSetLegCalculatedCcyLastQty() {
    return isSetField(1074);
  }

  public void set(quickfix.field.LegGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.LegGrossTradeAmt get(quickfix.field.LegGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegGrossTradeAmt getLegGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.LegGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.LegGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegGrossTradeAmt() {
    return isSetField(1075);
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

  public void set(quickfix.field.LegVolatility value) {
    setField(value);
  }

  public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
    return get(new quickfix.field.LegVolatility());
  }

  public boolean isSet(quickfix.field.LegVolatility field) {
    return isSetField(field);
  }

  public boolean isSetLegVolatility() {
    return isSetField(1379);
  }

  public void set(quickfix.field.LegDividendYield value) {
    setField(value);
  }

  public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
    return get(new quickfix.field.LegDividendYield());
  }

  public boolean isSet(quickfix.field.LegDividendYield field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendYield() {
    return isSetField(1381);
  }

  public void set(quickfix.field.LegCurrencyRatio value) {
    setField(value);
  }

  public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
    return get(new quickfix.field.LegCurrencyRatio());
  }

  public boolean isSet(quickfix.field.LegCurrencyRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrencyRatio() {
    return isSetField(1383);
  }

  public void set(quickfix.field.LegExecInst value) {
    setField(value);
  }

  public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
    return get(new quickfix.field.LegExecInst());
  }

  public boolean isSet(quickfix.field.LegExecInst field) {
    return isSetField(field);
  }

  public boolean isSetLegExecInst() {
    return isSetField(1384);
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

  public void set(quickfix.field.LegLastMultipliedQty value) {
    setField(value);
  }

  public quickfix.field.LegLastMultipliedQty get(quickfix.field.LegLastMultipliedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastMultipliedQty getLegLastMultipliedQty() throws FieldNotFound {
    return get(new quickfix.field.LegLastMultipliedQty());
  }

  public boolean isSet(quickfix.field.LegLastMultipliedQty field) {
    return isSetField(field);
  }

  public boolean isSetLegLastMultipliedQty() {
    return isSetField(2358);
  }

  public void set(quickfix.field.LegTotalTradeQty value) {
    setField(value);
  }

  public quickfix.field.LegTotalTradeQty get(quickfix.field.LegTotalTradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalTradeQty getLegTotalTradeQty() throws FieldNotFound {
    return get(new quickfix.field.LegTotalTradeQty());
  }

  public boolean isSet(quickfix.field.LegTotalTradeQty field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalTradeQty() {
    return isSetField(2357);
  }

  public void set(quickfix.field.LegTotalTradeMultipliedQty value) {
    setField(value);
  }

  public quickfix.field.LegTotalTradeMultipliedQty get(quickfix.field.LegTotalTradeMultipliedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalTradeMultipliedQty getLegTotalTradeMultipliedQty() throws FieldNotFound {
    return get(new quickfix.field.LegTotalTradeMultipliedQty());
  }

  public boolean isSet(quickfix.field.LegTotalTradeMultipliedQty field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalTradeMultipliedQty() {
    return isSetField(2360);
  }

  public void set(quickfix.field.LegTotalGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.LegTotalGrossTradeAmt get(quickfix.field.LegTotalGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalGrossTradeAmt getLegTotalGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.LegTotalGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.LegTotalGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalGrossTradeAmt() {
    return isSetField(2359);
  }

  public void set(quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp get(quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp getTradeCapLegUnderlyingsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp());
  }

  public void set(quickfix.field.NoOfLegUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoOfLegUnderlyings get(quickfix.field.NoOfLegUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfLegUnderlyings getNoOfLegUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoOfLegUnderlyings());
  }

  public boolean isSet(quickfix.field.NoOfLegUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoOfLegUnderlyings() {
    return isSetField(1342);
  }

public static class NoOfLegUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1330, 1331, 1332, 1333, 1334, 1344, 1337, 1338, 1339, 1345, 1405, 1340, 1391, 1343, 1341, 1392, 0};

  public NoOfLegUnderlyings() {
    super(1342, 1330, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingLegInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument get(quickfix.fixlatest.component.UnderlyingLegInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument getUnderlyingLegInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingLegInstrument());
  }
}

  public void set(quickfix.field.LegDifferentialPrice value) {
    setField(value);
  }

  public quickfix.field.LegDifferentialPrice get(quickfix.field.LegDifferentialPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDifferentialPrice getLegDifferentialPrice() throws FieldNotFound {
    return get(new quickfix.field.LegDifferentialPrice());
  }

  public boolean isSet(quickfix.field.LegDifferentialPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegDifferentialPrice() {
    return isSetField(2492);
  }
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

  public void set(quickfix.fixlatest.component.LegPositionAmountData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPositionAmountData get(quickfix.fixlatest.component.LegPositionAmountData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPositionAmountData getLegPositionAmountDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPositionAmountData());
  }

  public void set(quickfix.field.NoLegPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoLegPosAmt get(quickfix.field.NoLegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPosAmt getNoLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoLegPosAmt());
  }

  public boolean isSet(quickfix.field.NoLegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPosAmt() {
    return isSetField(1586);
  }

public static class NoLegPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1587, 1588, 1589, 1590, 0};

  public NoLegPosAmt() {
    super(1586, 1587, ORDER);
  }

  public void set(quickfix.field.LegPosAmt value) {
    setField(value);
  }

  public quickfix.field.LegPosAmt get(quickfix.field.LegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmt getLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmt());
  }

  public boolean isSet(quickfix.field.LegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmt() {
    return isSetField(1587);
  }

  public void set(quickfix.field.LegPosAmtType value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtType get(quickfix.field.LegPosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtType getLegPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtType());
  }

  public boolean isSet(quickfix.field.LegPosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtType() {
    return isSetField(1588);
  }

  public void set(quickfix.field.LegPosCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPosCurrency get(quickfix.field.LegPosCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosCurrency getLegPosCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPosCurrency());
  }

  public boolean isSet(quickfix.field.LegPosCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPosCurrency() {
    return isSetField(1589);
  }

  public void set(quickfix.field.LegPosAmtReason value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtReason get(quickfix.field.LegPosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtReason getLegPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtReason());
  }

  public boolean isSet(quickfix.field.LegPosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtReason() {
    return isSetField(1590);
  }
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

  public void set(quickfix.field.LegQty value) {
    setField(value);
  }

  public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQty getLegQty() throws FieldNotFound {
    return get(new quickfix.field.LegQty());
  }

  public boolean isSet(quickfix.field.LegQty field) {
    return isSetField(field);
  }

  public boolean isSetLegQty() {
    return isSetField(687);
  }

  public void set(quickfix.field.LegMidPx value) {
    setField(value);
  }

  public quickfix.field.LegMidPx get(quickfix.field.LegMidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMidPx getLegMidPx() throws FieldNotFound {
    return get(new quickfix.field.LegMidPx());
  }

  public boolean isSet(quickfix.field.LegMidPx field) {
    return isSetField(field);
  }

  public boolean isSetLegMidPx() {
    return isSetField(2346);
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

  public void set(quickfix.field.LegReportID value) {
    setField(value);
  }

  public quickfix.field.LegReportID get(quickfix.field.LegReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReportID getLegReportID() throws FieldNotFound {
    return get(new quickfix.field.LegReportID());
  }

  public boolean isSet(quickfix.field.LegReportID field) {
    return isSetField(field);
  }

  public boolean isSetLegReportID() {
    return isSetField(990);
  }

  public void set(quickfix.field.LegNumber value) {
    setField(value);
  }

  public quickfix.field.LegNumber get(quickfix.field.LegNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNumber getLegNumber() throws FieldNotFound {
    return get(new quickfix.field.LegNumber());
  }

  public boolean isSet(quickfix.field.LegNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegNumber() {
    return isSetField(1152);
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

  public void set(quickfix.field.LegAccount value) {
    setField(value);
  }

  public quickfix.field.LegAccount get(quickfix.field.LegAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAccount getLegAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAccount());
  }

  public boolean isSet(quickfix.field.LegAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAccount() {
    return isSetField(2680);
  }

  public void set(quickfix.field.LegClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.LegClearingAccountType get(quickfix.field.LegClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegClearingAccountType getLegClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.LegClearingAccountType());
  }

  public boolean isSet(quickfix.field.LegClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetLegClearingAccountType() {
    return isSetField(1817);
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

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
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

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
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

  public void set(quickfix.field.LegLastForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegLastForwardPoints get(quickfix.field.LegLastForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastForwardPoints getLegLastForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegLastForwardPoints());
  }

  public boolean isSet(quickfix.field.LegLastForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegLastForwardPoints() {
    return isSetField(1073);
  }

  public void set(quickfix.field.LegCalculatedCcyLastQty value) {
    setField(value);
  }

  public quickfix.field.LegCalculatedCcyLastQty get(quickfix.field.LegCalculatedCcyLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCalculatedCcyLastQty getLegCalculatedCcyLastQty() throws FieldNotFound {
    return get(new quickfix.field.LegCalculatedCcyLastQty());
  }

  public boolean isSet(quickfix.field.LegCalculatedCcyLastQty field) {
    return isSetField(field);
  }

  public boolean isSetLegCalculatedCcyLastQty() {
    return isSetField(1074);
  }

  public void set(quickfix.field.LegGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.LegGrossTradeAmt get(quickfix.field.LegGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegGrossTradeAmt getLegGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.LegGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.LegGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegGrossTradeAmt() {
    return isSetField(1075);
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

  public void set(quickfix.field.LegVolatility value) {
    setField(value);
  }

  public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
    return get(new quickfix.field.LegVolatility());
  }

  public boolean isSet(quickfix.field.LegVolatility field) {
    return isSetField(field);
  }

  public boolean isSetLegVolatility() {
    return isSetField(1379);
  }

  public void set(quickfix.field.LegDividendYield value) {
    setField(value);
  }

  public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
    return get(new quickfix.field.LegDividendYield());
  }

  public boolean isSet(quickfix.field.LegDividendYield field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendYield() {
    return isSetField(1381);
  }

  public void set(quickfix.field.LegCurrencyRatio value) {
    setField(value);
  }

  public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
    return get(new quickfix.field.LegCurrencyRatio());
  }

  public boolean isSet(quickfix.field.LegCurrencyRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrencyRatio() {
    return isSetField(1383);
  }

  public void set(quickfix.field.LegExecInst value) {
    setField(value);
  }

  public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
    return get(new quickfix.field.LegExecInst());
  }

  public boolean isSet(quickfix.field.LegExecInst field) {
    return isSetField(field);
  }

  public boolean isSetLegExecInst() {
    return isSetField(1384);
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

  public void set(quickfix.field.LegLastMultipliedQty value) {
    setField(value);
  }

  public quickfix.field.LegLastMultipliedQty get(quickfix.field.LegLastMultipliedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastMultipliedQty getLegLastMultipliedQty() throws FieldNotFound {
    return get(new quickfix.field.LegLastMultipliedQty());
  }

  public boolean isSet(quickfix.field.LegLastMultipliedQty field) {
    return isSetField(field);
  }

  public boolean isSetLegLastMultipliedQty() {
    return isSetField(2358);
  }

  public void set(quickfix.field.LegTotalTradeQty value) {
    setField(value);
  }

  public quickfix.field.LegTotalTradeQty get(quickfix.field.LegTotalTradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalTradeQty getLegTotalTradeQty() throws FieldNotFound {
    return get(new quickfix.field.LegTotalTradeQty());
  }

  public boolean isSet(quickfix.field.LegTotalTradeQty field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalTradeQty() {
    return isSetField(2357);
  }

  public void set(quickfix.field.LegTotalTradeMultipliedQty value) {
    setField(value);
  }

  public quickfix.field.LegTotalTradeMultipliedQty get(quickfix.field.LegTotalTradeMultipliedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalTradeMultipliedQty getLegTotalTradeMultipliedQty() throws FieldNotFound {
    return get(new quickfix.field.LegTotalTradeMultipliedQty());
  }

  public boolean isSet(quickfix.field.LegTotalTradeMultipliedQty field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalTradeMultipliedQty() {
    return isSetField(2360);
  }

  public void set(quickfix.field.LegTotalGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.LegTotalGrossTradeAmt get(quickfix.field.LegTotalGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalGrossTradeAmt getLegTotalGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.LegTotalGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.LegTotalGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalGrossTradeAmt() {
    return isSetField(2359);
  }

  public void set(quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp get(quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp getTradeCapLegUnderlyingsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp());
  }

  public void set(quickfix.field.NoOfLegUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoOfLegUnderlyings get(quickfix.field.NoOfLegUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfLegUnderlyings getNoOfLegUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoOfLegUnderlyings());
  }

  public boolean isSet(quickfix.field.NoOfLegUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoOfLegUnderlyings() {
    return isSetField(1342);
  }

public static class NoOfLegUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1330, 1331, 1332, 1333, 1334, 1344, 1337, 1338, 1339, 1345, 1405, 1340, 1391, 1343, 1341, 1392, 0};

  public NoOfLegUnderlyings() {
    super(1342, 1330, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingLegInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument get(quickfix.fixlatest.component.UnderlyingLegInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument getUnderlyingLegInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingLegInstrument());
  }
}

  public void set(quickfix.field.LegDifferentialPrice value) {
    setField(value);
  }

  public quickfix.field.LegDifferentialPrice get(quickfix.field.LegDifferentialPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDifferentialPrice getLegDifferentialPrice() throws FieldNotFound {
    return get(new quickfix.field.LegDifferentialPrice());
  }

  public boolean isSet(quickfix.field.LegDifferentialPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegDifferentialPrice() {
    return isSetField(2492);
  }
}
