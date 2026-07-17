/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40950, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamFixingDateBusinessCenters get(quickfix.field.NoPaymentStreamFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamFixingDateBusinessCenters getNoPaymentStreamFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamFixingDateBusinessCenters() {
    return isSetField(40950);
  }

public static class NoPaymentStreamFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40776, 0};

  public NoPaymentStreamFixingDateBusinessCenters() {
    super(40950, 40776, ORDER);
  }

  public void set(quickfix.field.PaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateBusinessCenter get(quickfix.field.PaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateBusinessCenter getPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40776);
  }
}

  public void set(quickfix.field.PaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateBusinessCenter get(quickfix.field.PaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateBusinessCenter getPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40776);
  }
}
