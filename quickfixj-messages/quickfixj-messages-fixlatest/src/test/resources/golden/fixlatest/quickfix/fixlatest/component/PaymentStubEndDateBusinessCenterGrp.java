/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStubEndDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42696, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStubEndDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStubEndDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubEndDateBusinessCenters get(quickfix.field.NoPaymentStubEndDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubEndDateBusinessCenters getNoPaymentStubEndDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubEndDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStubEndDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubEndDateBusinessCenters() {
    return isSetField(42696);
  }

public static class NoPaymentStubEndDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42697, 0};

  public NoPaymentStubEndDateBusinessCenters() {
    super(42696, 42697, ORDER);
  }

  public void set(quickfix.field.PaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateBusinessCenter get(quickfix.field.PaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateBusinessCenter getPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateBusinessCenter() {
    return isSetField(42697);
  }
}

  public void set(quickfix.field.PaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateBusinessCenter get(quickfix.field.PaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateBusinessCenter getPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateBusinessCenter() {
    return isSetField(42697);
  }
}
