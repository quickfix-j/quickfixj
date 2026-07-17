/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40929, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters get(quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters getNoLegPaymentStreamNonDeliverableFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamNonDeliverableFixingDateBusinessCenters() {
    return isSetField(40929);
  }

public static class NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40361, 0};

  public NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters() {
    super(40929, 40361, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter getLegPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40361);
  }
}

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter getLegPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40361);
  }
}
