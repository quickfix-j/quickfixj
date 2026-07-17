/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamPricingBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41192, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamPricingBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamPricingBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPricingBusinessCenters get(quickfix.field.NoPaymentStreamPricingBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPricingBusinessCenters getNoPaymentStreamPricingBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPricingBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPricingBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPricingBusinessCenters() {
    return isSetField(41192);
  }

public static class NoPaymentStreamPricingBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41193, 0};

  public NoPaymentStreamPricingBusinessCenters() {
    super(41192, 41193, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPricingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingBusinessCenter get(quickfix.field.PaymentStreamPricingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingBusinessCenter getPaymentStreamPricingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingBusinessCenter() {
    return isSetField(41193);
  }
}

  public void set(quickfix.field.PaymentStreamPricingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPricingBusinessCenter get(quickfix.field.PaymentStreamPricingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPricingBusinessCenter getPaymentStreamPricingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPricingBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamPricingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPricingBusinessCenter() {
    return isSetField(41193);
  }
}
