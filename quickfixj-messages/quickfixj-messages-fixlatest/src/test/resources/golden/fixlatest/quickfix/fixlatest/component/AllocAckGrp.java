/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AllocAckGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {78, };
  protected int[] getGroupFields() { return componentGroups; }

  public AllocAckGrp() {
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
  private static final int[]  ORDER = {79, 661, 366, 1047, 467, 1593, 1729, 1832, 2727, 1908, 776, 539, 209, 161, 360, 361, 1732, 1733, 1734, 989, 993, 992, 80, 2515, 1752, 1753, 1754, 1755, 2770, 2769, 0};

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

  public void set(quickfix.field.ClearedIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearedIndicator get(quickfix.field.ClearedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearedIndicator getClearedIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearedIndicator());
  }

  public boolean isSet(quickfix.field.ClearedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearedIndicator() {
    return isSetField(1832);
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

  public void set(quickfix.field.IndividualAllocRejCode value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocRejCode get(quickfix.field.IndividualAllocRejCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocRejCode getIndividualAllocRejCode() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocRejCode());
  }

  public boolean isSet(quickfix.field.IndividualAllocRejCode field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocRejCode() {
    return isSetField(776);
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

  public void set(quickfix.field.ClearedIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearedIndicator get(quickfix.field.ClearedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearedIndicator getClearedIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearedIndicator());
  }

  public boolean isSet(quickfix.field.ClearedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearedIndicator() {
    return isSetField(1832);
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

  public void set(quickfix.field.IndividualAllocRejCode value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocRejCode get(quickfix.field.IndividualAllocRejCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocRejCode getIndividualAllocRejCode() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocRejCode());
  }

  public boolean isSet(quickfix.field.IndividualAllocRejCode field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocRejCode() {
    return isSetField(776);
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
}
