/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40947, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPaymentDateBusinessCenters get(quickfix.field.NoPaymentStreamPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPaymentDateBusinessCenters getNoPaymentStreamPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPaymentDateBusinessCenters() {
    return isSetField(40947);
  }

public static class NoPaymentStreamPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40752, 0};

  public NoPaymentStreamPaymentDateBusinessCenters() {
    super(40947, 40752, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessCenter get(quickfix.field.PaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessCenter getPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40752);
  }
}

  public void set(quickfix.field.PaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessCenter get(quickfix.field.PaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessCenter getPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40752);
  }
}
