/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamResetDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40948, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamResetDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStreamResetDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamResetDateBusinessCenters get(quickfix.field.NoPaymentStreamResetDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamResetDateBusinessCenters getNoPaymentStreamResetDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamResetDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamResetDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamResetDateBusinessCenters() {
    return isSetField(40948);
  }

public static class NoPaymentStreamResetDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40763, 0};

  public NoPaymentStreamResetDateBusinessCenters() {
    super(40948, 40763, ORDER);
  }

  public void set(quickfix.field.PaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetDateBusinessCenter get(quickfix.field.PaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetDateBusinessCenter getPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetDateBusinessCenter() {
    return isSetField(40763);
  }
}

  public void set(quickfix.field.PaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetDateBusinessCenter get(quickfix.field.PaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetDateBusinessCenter getPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetDateBusinessCenter() {
    return isSetField(40763);
  }
}
