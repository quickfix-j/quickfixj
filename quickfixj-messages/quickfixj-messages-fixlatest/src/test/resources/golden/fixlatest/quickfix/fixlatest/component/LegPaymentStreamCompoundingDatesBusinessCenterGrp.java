/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamCompoundingDatesBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42419, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamCompoundingDatesBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters get(quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters getNoLegPaymentStreamCompoundingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamCompoundingDatesBusinessCenters() {
    return isSetField(42419);
  }

public static class NoLegPaymentStreamCompoundingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42420, 0};

  public NoLegPaymentStreamCompoundingDatesBusinessCenters() {
    super(42419, 42420, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter getLegPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42420);
  }
}

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter getLegPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42420);
  }
}
