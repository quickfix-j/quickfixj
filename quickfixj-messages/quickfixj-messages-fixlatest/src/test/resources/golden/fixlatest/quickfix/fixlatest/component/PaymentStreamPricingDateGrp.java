/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamPricingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41224, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamPricingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamPricingDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPricingDates get(quickfix.field.NoPaymentStreamPricingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPricingDates getNoPaymentStreamPricingDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPricingDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPricingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPricingDates() {
    return isSetField(41224);
  }

public static class NoPaymentStreamPricingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41225, 41226, 0};

  public NoPaymentStreamPricingDates() {
    super(41224, 41225, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPricingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDate get(quickfix.field.PaymentStreamPricingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDate getPaymentStreamPricingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDate() {
    return isSetField(41225);
  }

  public void set(quickfix.field.PaymentStreamPricingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDateType get(quickfix.field.PaymentStreamPricingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDateType getPaymentStreamPricingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDateType() {
    return isSetField(41226);
  }
}

  public void set(quickfix.field.PaymentStreamPricingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDate get(quickfix.field.PaymentStreamPricingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDate getPaymentStreamPricingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDate() {
    return isSetField(41225);
  }

  public void set(quickfix.field.PaymentStreamPricingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDateType get(quickfix.field.PaymentStreamPricingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDateType getPaymentStreamPricingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDateType() {
    return isSetField(41226);
  }
}
