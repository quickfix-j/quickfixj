/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PreAllocGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {78, };
  protected int[] getGroupFields() { return componentGroups; }

  public PreAllocGrp() {
    super();
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
  private static final int[]  ORDER = {79, 661, 736, 467, 2727, 539, 209, 80, 1752, 1753, 1754, 1755, 0};

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
}
