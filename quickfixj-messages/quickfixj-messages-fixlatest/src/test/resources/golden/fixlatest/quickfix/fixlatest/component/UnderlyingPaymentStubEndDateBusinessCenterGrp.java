/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStubEndDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42991, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStubEndDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters getNoUnderlyingPaymentStubEndDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubEndDateBusinessCenters() {
    return isSetField(42991);
  }

public static class NoUnderlyingPaymentStubEndDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42992, 0};

  public NoUnderlyingPaymentStubEndDateBusinessCenters() {
    super(42991, 42992, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter get(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter getUnderlyingPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateBusinessCenter() {
    return isSetField(42992);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter get(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter getUnderlyingPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateBusinessCenter() {
    return isSetField(42992);
  }
}
