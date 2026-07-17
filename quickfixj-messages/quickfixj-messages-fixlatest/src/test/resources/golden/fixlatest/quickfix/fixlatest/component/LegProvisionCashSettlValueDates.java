/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionCashSettlValueDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40524, 40525, 40526, 40528, 40529, 40530, 40531, 40532, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionCashSettlValueDates() {
    super();
  }

  public void set(quickfix.field.LegProvisionCashSettlValueTime value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueTime get(quickfix.field.LegProvisionCashSettlValueTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueTime getLegProvisionCashSettlValueTime() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueTime());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueTime field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueTime() {
    return isSetField(40524);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueTimeBusinessCenter get(quickfix.field.LegProvisionCashSettlValueTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueTimeBusinessCenter getLegProvisionCashSettlValueTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueTimeBusinessCenter() {
    return isSetField(40525);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessDayConvention get(quickfix.field.LegProvisionCashSettlValueDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessDayConvention getLegProvisionCashSettlValueDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateBusinessDayConvention() {
    return isSetField(40526);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlValueDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionCashSettlValueDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDateBusinessCenterGrp getLegProvisionCashSettlValueDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlValueDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters get(quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters getNoLegProvisionCashSettlValueDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionCashSettlValueDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionCashSettlValueDateBusinessCenters() {
    return isSetField(40935);
  }

public static class NoLegProvisionCashSettlValueDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40527, 0};

  public NoLegProvisionCashSettlValueDateBusinessCenters() {
    super(40935, 40527, ORDER);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessCenter get(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateBusinessCenter getLegProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(40527);
  }
}

  public void set(quickfix.field.LegProvisionCashSettlValueDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateRelativeTo get(quickfix.field.LegProvisionCashSettlValueDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateRelativeTo getLegProvisionCashSettlValueDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateRelativeTo() {
    return isSetField(40528);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateOffsetPeriod get(quickfix.field.LegProvisionCashSettlValueDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateOffsetPeriod getLegProvisionCashSettlValueDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateOffsetPeriod() {
    return isSetField(40529);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateOffsetUnit get(quickfix.field.LegProvisionCashSettlValueDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateOffsetUnit getLegProvisionCashSettlValueDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateOffsetUnit() {
    return isSetField(40530);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateOffsetDayType get(quickfix.field.LegProvisionCashSettlValueDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateOffsetDayType getLegProvisionCashSettlValueDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateOffsetDayType() {
    return isSetField(40531);
  }

  public void set(quickfix.field.LegProvisionCashSettlValueDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlValueDateAdjusted get(quickfix.field.LegProvisionCashSettlValueDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlValueDateAdjusted getLegProvisionCashSettlValueDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlValueDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlValueDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlValueDateAdjusted() {
    return isSetField(40532);
  }
}
