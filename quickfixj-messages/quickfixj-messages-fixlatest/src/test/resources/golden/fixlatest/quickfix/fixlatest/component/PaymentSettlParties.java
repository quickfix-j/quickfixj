/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentSettlParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40233, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentSettlParties() {
    super();
  }

  public void set(quickfix.field.NoPaymentSettlPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartyIDs get(quickfix.field.NoPaymentSettlPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartyIDs getNoPaymentSettlPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartyIDs() {
    return isSetField(40233);
  }

public static class NoPaymentSettlPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40234, 40235, 40236, 40237, 40238, 0};

  public NoPaymentSettlPartyIDs() {
    super(40233, 40234, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartyID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyID get(quickfix.field.PaymentSettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyID getPaymentSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyID() {
    return isSetField(40234);
  }

  public void set(quickfix.field.PaymentSettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyIDSource get(quickfix.field.PaymentSettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyIDSource getPaymentSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyIDSource() {
    return isSetField(40235);
  }

  public void set(quickfix.field.PaymentSettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRole get(quickfix.field.PaymentSettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRole getPaymentSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRole());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRole() {
    return isSetField(40236);
  }

  public void set(quickfix.field.PaymentSettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier get(quickfix.field.PaymentSettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier getPaymentSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRoleQualifier() {
    return isSetField(40237);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp get(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp getPaymentSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlPtysSubGrp());
  }

  public void set(quickfix.field.NoPaymentSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartySubIDs get(quickfix.field.NoPaymentSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartySubIDs getNoPaymentSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartySubIDs() {
    return isSetField(40238);
  }

public static class NoPaymentSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40239, 40240, 0};

  public NoPaymentSettlPartySubIDs() {
    super(40238, 40239, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubID get(quickfix.field.PaymentSettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubID getPaymentSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubID() {
    return isSetField(40239);
  }

  public void set(quickfix.field.PaymentSettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubIDType get(quickfix.field.PaymentSettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubIDType getPaymentSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubIDType() {
    return isSetField(40240);
  }
}
}

  public void set(quickfix.field.PaymentSettlPartyID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyID get(quickfix.field.PaymentSettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyID getPaymentSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyID() {
    return isSetField(40234);
  }

  public void set(quickfix.field.PaymentSettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyIDSource get(quickfix.field.PaymentSettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyIDSource getPaymentSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyIDSource() {
    return isSetField(40235);
  }

  public void set(quickfix.field.PaymentSettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRole get(quickfix.field.PaymentSettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRole getPaymentSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRole());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRole() {
    return isSetField(40236);
  }

  public void set(quickfix.field.PaymentSettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier get(quickfix.field.PaymentSettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier getPaymentSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRoleQualifier() {
    return isSetField(40237);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp get(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp getPaymentSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlPtysSubGrp());
  }

  public void set(quickfix.field.NoPaymentSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartySubIDs get(quickfix.field.NoPaymentSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartySubIDs getNoPaymentSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartySubIDs() {
    return isSetField(40238);
  }

public static class NoPaymentSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40239, 40240, 0};

  public NoPaymentSettlPartySubIDs() {
    super(40238, 40239, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubID get(quickfix.field.PaymentSettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubID getPaymentSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubID() {
    return isSetField(40239);
  }

  public void set(quickfix.field.PaymentSettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubIDType get(quickfix.field.PaymentSettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubIDType getPaymentSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubIDType() {
    return isSetField(40240);
  }
}
}
