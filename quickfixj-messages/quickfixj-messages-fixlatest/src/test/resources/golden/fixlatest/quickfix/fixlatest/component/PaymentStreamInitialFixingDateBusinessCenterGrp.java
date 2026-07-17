/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamInitialFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40949, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamInitialFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters get(quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters getNoPaymentStreamInitialFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamInitialFixingDateBusinessCenters() {
    return isSetField(40949);
  }

public static class NoPaymentStreamInitialFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40769, 0};

  public NoPaymentStreamInitialFixingDateBusinessCenters() {
    super(40949, 40769, ORDER);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessCenter getPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40769);
  }
}

  public void set(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessCenter getPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40769);
  }
}
