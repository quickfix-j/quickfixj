/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40972, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters getNoUnderlyingPaymentStreamFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamFixingDateBusinessCenters() {
    return isSetField(40972);
  }

public static class NoUnderlyingPaymentStreamFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40607, 0};

  public NoUnderlyingPaymentStreamFixingDateBusinessCenters() {
    super(40972, 40607, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter getUnderlyingPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40607);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter getUnderlyingPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40607);
  }
}
