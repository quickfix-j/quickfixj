/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentScheduleFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40927, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentScheduleFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters getNoLegPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40927);
  }

public static class NoLegPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40400, 0};

  public NoLegPaymentScheduleFixingDateBusinessCenters() {
    super(40927, 40400, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}
