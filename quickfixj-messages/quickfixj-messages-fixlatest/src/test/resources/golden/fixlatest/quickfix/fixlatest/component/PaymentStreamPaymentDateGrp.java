/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamPaymentDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41220, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamPaymentDateGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPaymentDates get(quickfix.field.NoPaymentStreamPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPaymentDates getNoPaymentStreamPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPaymentDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPaymentDates() {
    return isSetField(41220);
  }

public static class NoPaymentStreamPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41221, 41222, 0};

  public NoPaymentStreamPaymentDates() {
    super(41220, 41221, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDate get(quickfix.field.PaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDate getPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDate() {
    return isSetField(41221);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateType get(quickfix.field.PaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateType getPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateType() {
    return isSetField(41222);
  }
}

  public void set(quickfix.field.PaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDate get(quickfix.field.PaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDate getPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDate() {
    return isSetField(41221);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateType get(quickfix.field.PaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateType getPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateType() {
    return isSetField(41222);
  }
}
