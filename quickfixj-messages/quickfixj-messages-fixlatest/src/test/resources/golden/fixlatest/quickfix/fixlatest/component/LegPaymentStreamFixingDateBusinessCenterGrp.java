/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40933, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters get(quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters getNoLegPaymentStreamFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamFixingDateBusinessCenters() {
    return isSetField(40933);
  }

public static class NoLegPaymentStreamFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40318, 0};

  public NoLegPaymentStreamFixingDateBusinessCenters() {
    super(40933, 40318, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessCenter get(quickfix.field.LegPaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessCenter getLegPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40318);
  }
}

  public void set(quickfix.field.LegPaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessCenter get(quickfix.field.LegPaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessCenter getLegPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40318);
  }
}
