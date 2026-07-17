/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TrdInstrmtLegExecGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1892, };
  protected int[] getGroupFields() { return componentGroups; }

  public TrdInstrmtLegExecGrp() {
    super();
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
