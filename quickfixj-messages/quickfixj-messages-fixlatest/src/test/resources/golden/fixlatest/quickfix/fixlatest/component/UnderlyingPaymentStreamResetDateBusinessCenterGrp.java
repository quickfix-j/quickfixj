/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamResetDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40970, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamResetDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters getNoUnderlyingPaymentStreamResetDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamResetDateBusinessCenters() {
    return isSetField(40970);
  }

public static class NoUnderlyingPaymentStreamResetDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40594, 0};

  public NoUnderlyingPaymentStreamResetDateBusinessCenters() {
    super(40970, 40594, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter getUnderlyingPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetDateBusinessCenter() {
    return isSetField(40594);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter getUnderlyingPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetDateBusinessCenter() {
    return isSetField(40594);
  }
}
