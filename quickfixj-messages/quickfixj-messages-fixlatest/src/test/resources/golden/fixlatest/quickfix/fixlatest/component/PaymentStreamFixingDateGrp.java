/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFixingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42660, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFixingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamFixingDates get(quickfix.field.NoPaymentStreamFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamFixingDates getNoPaymentStreamFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamFixingDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamFixingDates() {
    return isSetField(42660);
  }

public static class NoPaymentStreamFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42661, 42662, 0};

  public NoPaymentStreamFixingDates() {
    super(42660, 42661, ORDER);
  }

  public void set(quickfix.field.PaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDate get(quickfix.field.PaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDate getPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDate() {
    return isSetField(42661);
  }

  public void set(quickfix.field.PaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateType get(quickfix.field.PaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateType getPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateType() {
    return isSetField(42662);
  }
}

  public void set(quickfix.field.PaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDate get(quickfix.field.PaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDate getPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDate() {
    return isSetField(42661);
  }

  public void set(quickfix.field.PaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateType get(quickfix.field.PaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateType getPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateType() {
    return isSetField(42662);
  }
}
