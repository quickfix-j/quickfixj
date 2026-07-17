/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamInitialFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40932, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamInitialFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters get(quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters getNoLegPaymentStreamInitialFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamInitialFixingDateBusinessCenters() {
    return isSetField(40932);
  }

public static class NoLegPaymentStreamInitialFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40311, 0};

  public NoLegPaymentStreamInitialFixingDateBusinessCenters() {
    super(40932, 40311, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter getLegPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40311);
  }
}

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter getLegPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40311);
  }
}
