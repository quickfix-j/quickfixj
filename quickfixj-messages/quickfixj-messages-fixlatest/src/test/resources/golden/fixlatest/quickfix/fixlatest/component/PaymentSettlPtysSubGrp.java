/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentSettlPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40238, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentSettlPtysSubGrp() {
    super();
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
