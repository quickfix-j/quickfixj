/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamResetDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40931, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamResetDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamResetDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamResetDateBusinessCenters get(quickfix.field.NoLegPaymentStreamResetDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamResetDateBusinessCenters getNoLegPaymentStreamResetDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamResetDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamResetDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamResetDateBusinessCenters() {
    return isSetField(40931);
  }

public static class NoLegPaymentStreamResetDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40305, 0};

  public NoLegPaymentStreamResetDateBusinessCenters() {
    super(40931, 40305, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessCenter get(quickfix.field.LegPaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessCenter getLegPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetDateBusinessCenter() {
    return isSetField(40305);
  }
}

  public void set(quickfix.field.LegPaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessCenter get(quickfix.field.LegPaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessCenter getLegPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetDateBusinessCenter() {
    return isSetField(40305);
  }
}
