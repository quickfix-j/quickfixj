/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamPaymentDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40930, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamPaymentDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters get(quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters getNoLegPaymentStreamPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPaymentDateBusinessCenters() {
    return isSetField(40930);
  }

public static class NoLegPaymentStreamPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40293, 0};

  public NoLegPaymentStreamPaymentDateBusinessCenters() {
    super(40930, 40293, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessCenter get(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessCenter getLegPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40293);
  }
}

  public void set(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessCenter get(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessCenter getLegPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40293);
  }
}
