/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamPricingDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41227, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamPricingDayGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamPricingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPricingDays get(quickfix.field.NoPaymentStreamPricingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPricingDays getNoPaymentStreamPricingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPricingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPricingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPricingDays() {
    return isSetField(41227);
  }

public static class NoPaymentStreamPricingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41228, 41229, 0};

  public NoPaymentStreamPricingDays() {
    super(41227, 41228, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPricingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDayOfWeek get(quickfix.field.PaymentStreamPricingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDayOfWeek getPaymentStreamPricingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDayOfWeek() {
    return isSetField(41228);
  }

  public void set(quickfix.field.PaymentStreamPricingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDayNumber get(quickfix.field.PaymentStreamPricingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDayNumber getPaymentStreamPricingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDayNumber() {
    return isSetField(41229);
  }
}

  public void set(quickfix.field.PaymentStreamPricingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDayOfWeek get(quickfix.field.PaymentStreamPricingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDayOfWeek getPaymentStreamPricingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDayOfWeek() {
    return isSetField(41228);
  }

  public void set(quickfix.field.PaymentStreamPricingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingDayNumber get(quickfix.field.PaymentStreamPricingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingDayNumber getPaymentStreamPricingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingDayNumber() {
    return isSetField(41229);
  }
}
