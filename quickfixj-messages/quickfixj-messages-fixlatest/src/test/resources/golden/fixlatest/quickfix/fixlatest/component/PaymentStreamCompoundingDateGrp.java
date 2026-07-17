/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamCompoundingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42606, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamCompoundingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamCompoundingDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamCompoundingDates get(quickfix.field.NoPaymentStreamCompoundingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamCompoundingDates getNoPaymentStreamCompoundingDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamCompoundingDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamCompoundingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamCompoundingDates() {
    return isSetField(42606);
  }

public static class NoPaymentStreamCompoundingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42607, 42608, 0};

  public NoPaymentStreamCompoundingDates() {
    super(42606, 42607, ORDER);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDate get(quickfix.field.PaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDate getPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDate() {
    return isSetField(42607);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDateType get(quickfix.field.PaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDateType getPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDateType() {
    return isSetField(42608);
  }
}

  public void set(quickfix.field.PaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDate get(quickfix.field.PaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDate getPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDate() {
    return isSetField(42607);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDateType get(quickfix.field.PaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDateType getPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDateType() {
    return isSetField(42608);
  }
}
