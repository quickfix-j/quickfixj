/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStubEndDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42495, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStubEndDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStubEndDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStubEndDateBusinessCenters get(quickfix.field.NoLegPaymentStubEndDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStubEndDateBusinessCenters getNoLegPaymentStubEndDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStubEndDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStubEndDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStubEndDateBusinessCenters() {
    return isSetField(42495);
  }

public static class NoLegPaymentStubEndDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42496, 0};

  public NoLegPaymentStubEndDateBusinessCenters() {
    super(42495, 42496, ORDER);
  }

  public void set(quickfix.field.LegPaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateBusinessCenter get(quickfix.field.LegPaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateBusinessCenter getLegPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateBusinessCenter() {
    return isSetField(42496);
  }
}

  public void set(quickfix.field.LegPaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateBusinessCenter get(quickfix.field.LegPaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateBusinessCenter getLegPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateBusinessCenter() {
    return isSetField(42496);
  }
}
