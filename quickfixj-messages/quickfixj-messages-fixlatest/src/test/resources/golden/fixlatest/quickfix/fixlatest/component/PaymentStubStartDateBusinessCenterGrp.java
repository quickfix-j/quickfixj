/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStubStartDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42705, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStubStartDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStubStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubStartDateBusinessCenters get(quickfix.field.NoPaymentStubStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubStartDateBusinessCenters getNoPaymentStubStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStubStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubStartDateBusinessCenters() {
    return isSetField(42705);
  }

public static class NoPaymentStubStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42706, 0};

  public NoPaymentStubStartDateBusinessCenters() {
    super(42705, 42706, ORDER);
  }

  public void set(quickfix.field.PaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateBusinessCenter get(quickfix.field.PaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateBusinessCenter getPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateBusinessCenter() {
    return isSetField(42706);
  }
}

  public void set(quickfix.field.PaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateBusinessCenter get(quickfix.field.PaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateBusinessCenter getPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateBusinessCenter() {
    return isSetField(42706);
  }
}
