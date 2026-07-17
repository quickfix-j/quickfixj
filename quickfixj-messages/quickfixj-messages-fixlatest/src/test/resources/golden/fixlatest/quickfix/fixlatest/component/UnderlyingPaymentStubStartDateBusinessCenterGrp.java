/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStubStartDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43000, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStubStartDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters getNoUnderlyingPaymentStubStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubStartDateBusinessCenters() {
    return isSetField(43000);
  }

public static class NoUnderlyingPaymentStubStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43001, 0};

  public NoUnderlyingPaymentStubStartDateBusinessCenters() {
    super(43000, 43001, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter get(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter getUnderlyingPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateBusinessCenter() {
    return isSetField(43001);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter get(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter getUnderlyingPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateBusinessCenter() {
    return isSetField(43001);
  }
}
