/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40969, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters getNoUnderlyingPaymentStreamPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPaymentDateBusinessCenters() {
    return isSetField(40969);
  }

public static class NoUnderlyingPaymentStreamPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40582, 0};

  public NoUnderlyingPaymentStreamPaymentDateBusinessCenters() {
    super(40969, 40582, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter getUnderlyingPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40582);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter getUnderlyingPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40582);
  }
}
