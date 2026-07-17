/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStubStartDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42497, 42498, 42499, 42500, 42501, 42502, 42503, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStubStartDate() {
    super();
  }

  public void set(quickfix.field.LegPaymentStubStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateUnadjusted get(quickfix.field.LegPaymentStubStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateUnadjusted getLegPaymentStubStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateUnadjusted() {
    return isSetField(42497);
  }

  public void set(quickfix.field.LegPaymentStubStartDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateBusinessDayConvention get(quickfix.field.LegPaymentStubStartDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateBusinessDayConvention getLegPaymentStubStartDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateBusinessDayConvention() {
    return isSetField(42498);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubStartDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStubStartDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDateBusinessCenterGrp getLegPaymentStubStartDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubStartDateBusinessCenterGrp());
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

  public void set(quickfix.field.LegPaymentStubStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateRelativeTo get(quickfix.field.LegPaymentStubStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateRelativeTo getLegPaymentStubStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateRelativeTo() {
    return isSetField(42499);
  }

  public void set(quickfix.field.LegPaymentStubStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateOffsetPeriod get(quickfix.field.LegPaymentStubStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateOffsetPeriod getLegPaymentStubStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateOffsetPeriod() {
    return isSetField(42500);
  }

  public void set(quickfix.field.LegPaymentStubStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateOffsetUnit get(quickfix.field.LegPaymentStubStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateOffsetUnit getLegPaymentStubStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateOffsetUnit() {
    return isSetField(42501);
  }

  public void set(quickfix.field.LegPaymentStubStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateOffsetDayType get(quickfix.field.LegPaymentStubStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateOffsetDayType getLegPaymentStubStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateOffsetDayType() {
    return isSetField(42502);
  }

  public void set(quickfix.field.LegPaymentStubStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubStartDateAdjusted get(quickfix.field.LegPaymentStubStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubStartDateAdjusted getLegPaymentStubStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStubStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubStartDateAdjusted() {
    return isSetField(42503);
  }
}
