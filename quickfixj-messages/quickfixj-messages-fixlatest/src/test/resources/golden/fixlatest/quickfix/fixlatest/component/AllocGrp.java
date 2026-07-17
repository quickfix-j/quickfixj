/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AllocGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {78, };
  protected int[] getGroupFields() { return componentGroups; }

  public AllocGrp() {
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
  private static final int[]  ORDER = {79, 661, 573, 366, 80, 2515, 1752, 1753, 1754, 1755, 467, 1729, 1593, 2727, 1908, 81, 989, 1002, 1735, 993, 1047, 992, 539, 208, 209, 161, 360, 361, 1732, 1733, 1734, 12, 13, 479, 1233, 1238, 497, 2653, 153, 154, 119, 2300, 737, 120, 736, 155, 156, 742, 741, 136, 576, 635, 780, 172, 169, 170, 171, 85, 2392, 2393, 2483, 2761, 2770, 2769, 1844, 0};

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

  public void set(quickfix.field.MatchStatus value) {
    setField(value);
  }

  public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
    return get(new quickfix.field.MatchStatus());
  }

  public boolean isSet(quickfix.field.MatchStatus field) {
    return isSetField(field);
  }

  public boolean isSetMatchStatus() {
    return isSetField(573);
  }

  public void set(quickfix.field.AllocPrice value) {
    setField(value);
  }

  public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocPrice getAllocPrice() throws FieldNotFound {
    return get(new quickfix.field.AllocPrice());
  }

  public boolean isSet(quickfix.field.AllocPrice field) {
    return isSetField(field);
  }

  public boolean isSetAllocPrice() {
    return isSetField(366);
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

  public void set(quickfix.field.ProcessCode value) {
    setField(value);
  }

  public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
    return get(new quickfix.field.ProcessCode());
  }

  public boolean isSet(quickfix.field.ProcessCode field) {
    return isSetField(field);
  }

  public boolean isSetProcessCode() {
    return isSetField(81);
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

  public void set(quickfix.field.AllocPositionEffect value) {
    setField(value);
  }

  public quickfix.field.AllocPositionEffect get(quickfix.field.AllocPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocPositionEffect getAllocPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.AllocPositionEffect());
  }

  public boolean isSet(quickfix.field.AllocPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetAllocPositionEffect() {
    return isSetField(1047);
  }

  public void set(quickfix.field.IndividualAllocType value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocType get(quickfix.field.IndividualAllocType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocType getIndividualAllocType() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocType());
  }

  public boolean isSet(quickfix.field.IndividualAllocType field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocType() {
    return isSetField(992);
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

  public void set(quickfix.field.NotifyBrokerOfCredit value) {
    setField(value);
  }

  public quickfix.field.NotifyBrokerOfCredit get(quickfix.field.NotifyBrokerOfCredit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotifyBrokerOfCredit getNotifyBrokerOfCredit() throws FieldNotFound {
    return get(new quickfix.field.NotifyBrokerOfCredit());
  }

  public boolean isSet(quickfix.field.NotifyBrokerOfCredit field) {
    return isSetField(field);
  }

  public boolean isSetNotifyBrokerOfCredit() {
    return isSetField(208);
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

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
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

  public void set(quickfix.field.AllocAvgPx value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPx get(quickfix.field.AllocAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPx getAllocAvgPx() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPx());
  }

  public boolean isSet(quickfix.field.AllocAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPx() {
    return isSetField(153);
  }

  public void set(quickfix.field.AllocNetMoney value) {
    setField(value);
  }

  public quickfix.field.AllocNetMoney get(quickfix.field.AllocNetMoney value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocNetMoney getAllocNetMoney() throws FieldNotFound {
    return get(new quickfix.field.AllocNetMoney());
  }

  public boolean isSet(quickfix.field.AllocNetMoney field) {
    return isSetField(field);
  }

  public boolean isSetAllocNetMoney() {
    return isSetField(154);
  }

  public void set(quickfix.field.SettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrAmt());
  }

  public boolean isSet(quickfix.field.SettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrAmt() {
    return isSetField(119);
  }

  public void set(quickfix.field.AllocGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.AllocGrossTradeAmt get(quickfix.field.AllocGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGrossTradeAmt getAllocGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.AllocGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.AllocGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetAllocGrossTradeAmt() {
    return isSetField(2300);
  }

  public void set(quickfix.field.AllocSettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrAmt get(quickfix.field.AllocSettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrAmt getAllocSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrAmt());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrAmt() {
    return isSetField(737);
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

  public void set(quickfix.field.SettlCurrFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRate() {
    return isSetField(155);
  }

  public void set(quickfix.field.SettlCurrFxRateCalc value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRateCalc());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRateCalc() {
    return isSetField(156);
  }

  public void set(quickfix.field.AllocAccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.AllocAccruedInterestAmt get(quickfix.field.AllocAccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccruedInterestAmt getAllocAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.AllocAccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.AllocAccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccruedInterestAmt() {
    return isSetField(742);
  }

  public void set(quickfix.field.AllocInterestAtMaturity value) {
    setField(value);
  }

  public quickfix.field.AllocInterestAtMaturity get(quickfix.field.AllocInterestAtMaturity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocInterestAtMaturity getAllocInterestAtMaturity() throws FieldNotFound {
    return get(new quickfix.field.AllocInterestAtMaturity());
  }

  public boolean isSet(quickfix.field.AllocInterestAtMaturity field) {
    return isSetField(field);
  }

  public boolean isSetAllocInterestAtMaturity() {
    return isSetField(741);
  }

  public void set(quickfix.fixlatest.component.MiscFeesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesGrp get(quickfix.fixlatest.component.MiscFeesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesGrp getMiscFeesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesGrp());
  }

  public void set(quickfix.field.NoMiscFees value) {
    setField(value);
  }

  public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFees());
  }

  public boolean isSet(quickfix.field.NoMiscFees field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFees() {
    return isSetField(136);
  }

public static class NoMiscFees extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {137, 138, 139, 2712, 2633, 891, 2216, 2217, 2713, 0};

  public NoMiscFees() {
    super(136, 137, ORDER);
  }

  public void set(quickfix.field.MiscFeeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmt() {
    return isSetField(137);
  }

  public void set(quickfix.field.MiscFeeCurr value) {
    setField(value);
  }

  public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeCurr());
  }

  public boolean isSet(quickfix.field.MiscFeeCurr field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeCurr() {
    return isSetField(138);
  }

  public void set(quickfix.field.MiscFeeType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeType());
  }

  public boolean isSet(quickfix.field.MiscFeeType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeType() {
    return isSetField(139);
  }

  public void set(quickfix.field.MiscFeeQualifier value) {
    setField(value);
  }

  public quickfix.field.MiscFeeQualifier get(quickfix.field.MiscFeeQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeQualifier getMiscFeeQualifier() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeQualifier());
  }

  public boolean isSet(quickfix.field.MiscFeeQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeQualifier() {
    return isSetField(2712);
  }

  public void set(quickfix.fixlatest.component.MiscFeesSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp get(quickfix.fixlatest.component.MiscFeesSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp getMiscFeesSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesSubGrp());
  }

  public void set(quickfix.field.NoMiscFeeSubTypes value) {
    setField(value);
  }

  public quickfix.field.NoMiscFeeSubTypes get(quickfix.field.NoMiscFeeSubTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFeeSubTypes getNoMiscFeeSubTypes() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFeeSubTypes());
  }

  public boolean isSet(quickfix.field.NoMiscFeeSubTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFeeSubTypes() {
    return isSetField(2633);
  }

public static class NoMiscFeeSubTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2634, 2635, 2636, 2637, 2638, 0};

  public NoMiscFeeSubTypes() {
    super(2633, 2634, ORDER);
  }

  public void set(quickfix.field.MiscFeeSubType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubType get(quickfix.field.MiscFeeSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubType getMiscFeeSubType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubType());
  }

  public boolean isSet(quickfix.field.MiscFeeSubType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubType() {
    return isSetField(2634);
  }

  public void set(quickfix.field.MiscFeeSubTypeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeAmt get(quickfix.field.MiscFeeSubTypeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeAmt getMiscFeeSubTypeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeAmt() {
    return isSetField(2635);
  }

  public void set(quickfix.field.MiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeDesc get(quickfix.field.MiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeDesc getMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeDesc() {
    return isSetField(2636);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen get(quickfix.field.EncodedMiscFeeSubTypeDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen getEncodedMiscFeeSubTypeDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDescLen() {
    return isSetField(2637);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc get(quickfix.field.EncodedMiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc getEncodedMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDesc() {
    return isSetField(2638);
  }
}

  public void set(quickfix.field.MiscFeeBasis value) {
    setField(value);
  }

  public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeBasis());
  }

  public boolean isSet(quickfix.field.MiscFeeBasis field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeBasis() {
    return isSetField(891);
  }

  public void set(quickfix.field.MiscFeeRate value) {
    setField(value);
  }

  public quickfix.field.MiscFeeRate get(quickfix.field.MiscFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeRate getMiscFeeRate() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeRate());
  }

  public boolean isSet(quickfix.field.MiscFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeRate() {
    return isSetField(2216);
  }

  public void set(quickfix.field.MiscFeeAmountDue value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmountDue get(quickfix.field.MiscFeeAmountDue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmountDue getMiscFeeAmountDue() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmountDue());
  }

  public boolean isSet(quickfix.field.MiscFeeAmountDue field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmountDue() {
    return isSetField(2217);
  }

  public void set(quickfix.field.MiscFeeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeDesc get(quickfix.field.MiscFeeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeDesc getMiscFeeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeDesc() {
    return isSetField(2713);
  }
}

  public void set(quickfix.fixlatest.component.ClrInstGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClrInstGrp get(quickfix.fixlatest.component.ClrInstGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClrInstGrp getClrInstGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClrInstGrp());
  }

  public void set(quickfix.field.NoClearingInstructions value) {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoClearingInstructions());
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions() {
    return isSetField(576);
  }

public static class NoClearingInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {577, 0};

  public NoClearingInstructions() {
    super(576, 577, ORDER);
  }

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
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

  public void set(quickfix.field.AllocSettlInstType value) {
    setField(value);
  }

  public quickfix.field.AllocSettlInstType get(quickfix.field.AllocSettlInstType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlInstType getAllocSettlInstType() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlInstType());
  }

  public boolean isSet(quickfix.field.AllocSettlInstType field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlInstType() {
    return isSetField(780);
  }

  public void set(quickfix.fixlatest.component.SettlInstructionsData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlInstructionsData get(quickfix.fixlatest.component.SettlInstructionsData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlInstructionsData getSettlInstructionsDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlInstructionsData());
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

  public void set(quickfix.field.AllocRiskLimitCheckStatus value) {
    setField(value);
  }

  public quickfix.field.AllocRiskLimitCheckStatus get(quickfix.field.AllocRiskLimitCheckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRiskLimitCheckStatus getAllocRiskLimitCheckStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocRiskLimitCheckStatus());
  }

  public boolean isSet(quickfix.field.AllocRiskLimitCheckStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocRiskLimitCheckStatus() {
    return isSetField(2483);
  }

  public void set(quickfix.field.AllocGroupAmount value) {
    setField(value);
  }

  public quickfix.field.AllocGroupAmount get(quickfix.field.AllocGroupAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupAmount getAllocGroupAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupAmount());
  }

  public boolean isSet(quickfix.field.AllocGroupAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupAmount() {
    return isSetField(2761);
  }

  public void set(quickfix.field.AllocAvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPxGroupID get(quickfix.field.AllocAvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPxGroupID getAllocAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPxGroupID());
  }

  public boolean isSet(quickfix.field.AllocAvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPxGroupID() {
    return isSetField(2770);
  }

  public void set(quickfix.field.AllocAvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPxIndicator get(quickfix.field.AllocAvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPxIndicator getAllocAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPxIndicator());
  }

  public boolean isSet(quickfix.field.AllocAvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPxIndicator() {
    return isSetField(2769);
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

  public void set(quickfix.field.MatchStatus value) {
    setField(value);
  }

  public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
    return get(new quickfix.field.MatchStatus());
  }

  public boolean isSet(quickfix.field.MatchStatus field) {
    return isSetField(field);
  }

  public boolean isSetMatchStatus() {
    return isSetField(573);
  }

  public void set(quickfix.field.AllocPrice value) {
    setField(value);
  }

  public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocPrice getAllocPrice() throws FieldNotFound {
    return get(new quickfix.field.AllocPrice());
  }

  public boolean isSet(quickfix.field.AllocPrice field) {
    return isSetField(field);
  }

  public boolean isSetAllocPrice() {
    return isSetField(366);
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

  public void set(quickfix.field.ProcessCode value) {
    setField(value);
  }

  public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
    return get(new quickfix.field.ProcessCode());
  }

  public boolean isSet(quickfix.field.ProcessCode field) {
    return isSetField(field);
  }

  public boolean isSetProcessCode() {
    return isSetField(81);
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

  public void set(quickfix.field.AllocPositionEffect value) {
    setField(value);
  }

  public quickfix.field.AllocPositionEffect get(quickfix.field.AllocPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocPositionEffect getAllocPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.AllocPositionEffect());
  }

  public boolean isSet(quickfix.field.AllocPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetAllocPositionEffect() {
    return isSetField(1047);
  }

  public void set(quickfix.field.IndividualAllocType value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocType get(quickfix.field.IndividualAllocType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocType getIndividualAllocType() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocType());
  }

  public boolean isSet(quickfix.field.IndividualAllocType field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocType() {
    return isSetField(992);
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

  public void set(quickfix.field.NotifyBrokerOfCredit value) {
    setField(value);
  }

  public quickfix.field.NotifyBrokerOfCredit get(quickfix.field.NotifyBrokerOfCredit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotifyBrokerOfCredit getNotifyBrokerOfCredit() throws FieldNotFound {
    return get(new quickfix.field.NotifyBrokerOfCredit());
  }

  public boolean isSet(quickfix.field.NotifyBrokerOfCredit field) {
    return isSetField(field);
  }

  public boolean isSetNotifyBrokerOfCredit() {
    return isSetField(208);
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

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
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

  public void set(quickfix.field.AllocAvgPx value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPx get(quickfix.field.AllocAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPx getAllocAvgPx() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPx());
  }

  public boolean isSet(quickfix.field.AllocAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPx() {
    return isSetField(153);
  }

  public void set(quickfix.field.AllocNetMoney value) {
    setField(value);
  }

  public quickfix.field.AllocNetMoney get(quickfix.field.AllocNetMoney value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocNetMoney getAllocNetMoney() throws FieldNotFound {
    return get(new quickfix.field.AllocNetMoney());
  }

  public boolean isSet(quickfix.field.AllocNetMoney field) {
    return isSetField(field);
  }

  public boolean isSetAllocNetMoney() {
    return isSetField(154);
  }

  public void set(quickfix.field.SettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrAmt());
  }

  public boolean isSet(quickfix.field.SettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrAmt() {
    return isSetField(119);
  }

  public void set(quickfix.field.AllocGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.AllocGrossTradeAmt get(quickfix.field.AllocGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGrossTradeAmt getAllocGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.AllocGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.AllocGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetAllocGrossTradeAmt() {
    return isSetField(2300);
  }

  public void set(quickfix.field.AllocSettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrAmt get(quickfix.field.AllocSettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrAmt getAllocSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrAmt());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrAmt() {
    return isSetField(737);
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

  public void set(quickfix.field.SettlCurrFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRate() {
    return isSetField(155);
  }

  public void set(quickfix.field.SettlCurrFxRateCalc value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRateCalc());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRateCalc() {
    return isSetField(156);
  }

  public void set(quickfix.field.AllocAccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.AllocAccruedInterestAmt get(quickfix.field.AllocAccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccruedInterestAmt getAllocAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.AllocAccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.AllocAccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccruedInterestAmt() {
    return isSetField(742);
  }

  public void set(quickfix.field.AllocInterestAtMaturity value) {
    setField(value);
  }

  public quickfix.field.AllocInterestAtMaturity get(quickfix.field.AllocInterestAtMaturity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocInterestAtMaturity getAllocInterestAtMaturity() throws FieldNotFound {
    return get(new quickfix.field.AllocInterestAtMaturity());
  }

  public boolean isSet(quickfix.field.AllocInterestAtMaturity field) {
    return isSetField(field);
  }

  public boolean isSetAllocInterestAtMaturity() {
    return isSetField(741);
  }

  public void set(quickfix.fixlatest.component.MiscFeesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesGrp get(quickfix.fixlatest.component.MiscFeesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesGrp getMiscFeesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesGrp());
  }

  public void set(quickfix.field.NoMiscFees value) {
    setField(value);
  }

  public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFees());
  }

  public boolean isSet(quickfix.field.NoMiscFees field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFees() {
    return isSetField(136);
  }

public static class NoMiscFees extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {137, 138, 139, 2712, 2633, 891, 2216, 2217, 2713, 0};

  public NoMiscFees() {
    super(136, 137, ORDER);
  }

  public void set(quickfix.field.MiscFeeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmt() {
    return isSetField(137);
  }

  public void set(quickfix.field.MiscFeeCurr value) {
    setField(value);
  }

  public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeCurr());
  }

  public boolean isSet(quickfix.field.MiscFeeCurr field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeCurr() {
    return isSetField(138);
  }

  public void set(quickfix.field.MiscFeeType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeType());
  }

  public boolean isSet(quickfix.field.MiscFeeType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeType() {
    return isSetField(139);
  }

  public void set(quickfix.field.MiscFeeQualifier value) {
    setField(value);
  }

  public quickfix.field.MiscFeeQualifier get(quickfix.field.MiscFeeQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeQualifier getMiscFeeQualifier() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeQualifier());
  }

  public boolean isSet(quickfix.field.MiscFeeQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeQualifier() {
    return isSetField(2712);
  }

  public void set(quickfix.fixlatest.component.MiscFeesSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp get(quickfix.fixlatest.component.MiscFeesSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp getMiscFeesSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesSubGrp());
  }

  public void set(quickfix.field.NoMiscFeeSubTypes value) {
    setField(value);
  }

  public quickfix.field.NoMiscFeeSubTypes get(quickfix.field.NoMiscFeeSubTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFeeSubTypes getNoMiscFeeSubTypes() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFeeSubTypes());
  }

  public boolean isSet(quickfix.field.NoMiscFeeSubTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFeeSubTypes() {
    return isSetField(2633);
  }

public static class NoMiscFeeSubTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2634, 2635, 2636, 2637, 2638, 0};

  public NoMiscFeeSubTypes() {
    super(2633, 2634, ORDER);
  }

  public void set(quickfix.field.MiscFeeSubType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubType get(quickfix.field.MiscFeeSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubType getMiscFeeSubType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubType());
  }

  public boolean isSet(quickfix.field.MiscFeeSubType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubType() {
    return isSetField(2634);
  }

  public void set(quickfix.field.MiscFeeSubTypeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeAmt get(quickfix.field.MiscFeeSubTypeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeAmt getMiscFeeSubTypeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeAmt() {
    return isSetField(2635);
  }

  public void set(quickfix.field.MiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeDesc get(quickfix.field.MiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeDesc getMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeDesc() {
    return isSetField(2636);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen get(quickfix.field.EncodedMiscFeeSubTypeDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen getEncodedMiscFeeSubTypeDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDescLen() {
    return isSetField(2637);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc get(quickfix.field.EncodedMiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc getEncodedMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDesc() {
    return isSetField(2638);
  }
}

  public void set(quickfix.field.MiscFeeBasis value) {
    setField(value);
  }

  public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeBasis());
  }

  public boolean isSet(quickfix.field.MiscFeeBasis field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeBasis() {
    return isSetField(891);
  }

  public void set(quickfix.field.MiscFeeRate value) {
    setField(value);
  }

  public quickfix.field.MiscFeeRate get(quickfix.field.MiscFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeRate getMiscFeeRate() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeRate());
  }

  public boolean isSet(quickfix.field.MiscFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeRate() {
    return isSetField(2216);
  }

  public void set(quickfix.field.MiscFeeAmountDue value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmountDue get(quickfix.field.MiscFeeAmountDue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmountDue getMiscFeeAmountDue() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmountDue());
  }

  public boolean isSet(quickfix.field.MiscFeeAmountDue field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmountDue() {
    return isSetField(2217);
  }

  public void set(quickfix.field.MiscFeeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeDesc get(quickfix.field.MiscFeeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeDesc getMiscFeeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeDesc() {
    return isSetField(2713);
  }
}

  public void set(quickfix.fixlatest.component.ClrInstGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClrInstGrp get(quickfix.fixlatest.component.ClrInstGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClrInstGrp getClrInstGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClrInstGrp());
  }

  public void set(quickfix.field.NoClearingInstructions value) {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoClearingInstructions());
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions() {
    return isSetField(576);
  }

public static class NoClearingInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {577, 0};

  public NoClearingInstructions() {
    super(576, 577, ORDER);
  }

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
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

  public void set(quickfix.field.AllocSettlInstType value) {
    setField(value);
  }

  public quickfix.field.AllocSettlInstType get(quickfix.field.AllocSettlInstType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlInstType getAllocSettlInstType() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlInstType());
  }

  public boolean isSet(quickfix.field.AllocSettlInstType field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlInstType() {
    return isSetField(780);
  }

  public void set(quickfix.fixlatest.component.SettlInstructionsData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlInstructionsData get(quickfix.fixlatest.component.SettlInstructionsData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlInstructionsData getSettlInstructionsDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlInstructionsData());
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

  public void set(quickfix.field.AllocRiskLimitCheckStatus value) {
    setField(value);
  }

  public quickfix.field.AllocRiskLimitCheckStatus get(quickfix.field.AllocRiskLimitCheckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRiskLimitCheckStatus getAllocRiskLimitCheckStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocRiskLimitCheckStatus());
  }

  public boolean isSet(quickfix.field.AllocRiskLimitCheckStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocRiskLimitCheckStatus() {
    return isSetField(2483);
  }

  public void set(quickfix.field.AllocGroupAmount value) {
    setField(value);
  }

  public quickfix.field.AllocGroupAmount get(quickfix.field.AllocGroupAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupAmount getAllocGroupAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupAmount());
  }

  public boolean isSet(quickfix.field.AllocGroupAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupAmount() {
    return isSetField(2761);
  }

  public void set(quickfix.field.AllocAvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPxGroupID get(quickfix.field.AllocAvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPxGroupID getAllocAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPxGroupID());
  }

  public boolean isSet(quickfix.field.AllocAvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPxGroupID() {
    return isSetField(2770);
  }

  public void set(quickfix.field.AllocAvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPxIndicator get(quickfix.field.AllocAvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPxIndicator getAllocAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPxIndicator());
  }

  public boolean isSet(quickfix.field.AllocAvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPxIndicator() {
    return isSetField(2769);
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
}
