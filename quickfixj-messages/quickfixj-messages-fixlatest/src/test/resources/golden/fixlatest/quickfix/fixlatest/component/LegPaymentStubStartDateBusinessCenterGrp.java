/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStubStartDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42504, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStubStartDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStubStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStubStartDateBusinessCenters get(quickfix.field.NoLegPaymentStubStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStubStartDateBusinessCenters getNoLegPaymentStubStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStubStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStubStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStubStartDateBusinessCenters() {
    return isSetField(42504);
  }

public static class NoLegPaymentStubStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42505, 0};

  public NoLegPaymentStubStartDateBusinessCenters() {
    super(42504, 42505, ORDER);
  }

  public void set(quickfix.field.LegPaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateBusinessCenter get(quickfix.field.LegPaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateBusinessCenter getLegPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateBusinessCenter() {
    return isSetField(42505);
  }
}

  public void set(quickfix.field.LegPaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateBusinessCenter get(quickfix.field.LegPaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateBusinessCenter getLegPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateBusinessCenter() {
    return isSetField(42505);
  }
}
