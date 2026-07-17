/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStubEndDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42488, 42489, 42490, 42491, 42492, 42493, 42494, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStubEndDate() {
    super();
  }

  public void set(quickfix.field.LegPaymentStubEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateUnadjusted get(quickfix.field.LegPaymentStubEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateUnadjusted getLegPaymentStubEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateUnadjusted() {
    return isSetField(42488);
  }

  public void set(quickfix.field.LegPaymentStubEndDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateBusinessDayConvention get(quickfix.field.LegPaymentStubEndDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateBusinessDayConvention getLegPaymentStubEndDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateBusinessDayConvention() {
    return isSetField(42489);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubEndDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStubEndDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDateBusinessCenterGrp getLegPaymentStubEndDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubEndDateBusinessCenterGrp());
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

  public void set(quickfix.field.LegPaymentStubEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateRelativeTo get(quickfix.field.LegPaymentStubEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateRelativeTo getLegPaymentStubEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateRelativeTo() {
    return isSetField(42490);
  }

  public void set(quickfix.field.LegPaymentStubEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateOffsetPeriod get(quickfix.field.LegPaymentStubEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateOffsetPeriod getLegPaymentStubEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateOffsetPeriod() {
    return isSetField(42491);
  }

  public void set(quickfix.field.LegPaymentStubEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateOffsetUnit get(quickfix.field.LegPaymentStubEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateOffsetUnit getLegPaymentStubEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateOffsetUnit() {
    return isSetField(42492);
  }

  public void set(quickfix.field.LegPaymentStubEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateOffsetDayType get(quickfix.field.LegPaymentStubEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateOffsetDayType getLegPaymentStubEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateOffsetDayType() {
    return isSetField(42493);
  }

  public void set(quickfix.field.LegPaymentStubEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubEndDateAdjusted get(quickfix.field.LegPaymentStubEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubEndDateAdjusted getLegPaymentStubEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStubEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubEndDateAdjusted() {
    return isSetField(42494);
  }
}
