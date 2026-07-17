/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionCashSettlPaymentDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40516, 40518, 40519, 40520, 40521, 40522, 40523, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionCashSettlPaymentDates() {
    super();
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessDayConvention get(quickfix.field.LegProvisionCashSettlPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessDayConvention getLegProvisionCashSettlPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateBusinessDayConvention() {
    return isSetField(40516);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDateBusinessCenterGrp getLegProvisionCashSettlPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters get(quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters getNoLegProvisionCashSettlPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionCashSettlPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionCashSettlPaymentDateBusinessCenters() {
    return isSetField(40934);
  }

public static class NoLegProvisionCashSettlPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40517, 0};

  public NoLegProvisionCashSettlPaymentDateBusinessCenters() {
    super(40934, 40517, ORDER);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter getLegProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(40517);
  }
}

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateRelativeTo get(quickfix.field.LegProvisionCashSettlPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateRelativeTo getLegProvisionCashSettlPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateRelativeTo() {
    return isSetField(40518);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateOffsetPeriod get(quickfix.field.LegProvisionCashSettlPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateOffsetPeriod getLegProvisionCashSettlPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateOffsetPeriod() {
    return isSetField(40519);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateOffsetUnit get(quickfix.field.LegProvisionCashSettlPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateOffsetUnit getLegProvisionCashSettlPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateOffsetUnit() {
    return isSetField(40520);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateOffsetDayType get(quickfix.field.LegProvisionCashSettlPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateOffsetDayType getLegProvisionCashSettlPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateOffsetDayType() {
    return isSetField(40521);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateRangeFirst value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateRangeFirst get(quickfix.field.LegProvisionCashSettlPaymentDateRangeFirst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateRangeFirst getLegProvisionCashSettlPaymentDateRangeFirst() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateRangeFirst());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateRangeFirst field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateRangeFirst() {
    return isSetField(40522);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateRangeLast value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateRangeLast get(quickfix.field.LegProvisionCashSettlPaymentDateRangeLast value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateRangeLast getLegProvisionCashSettlPaymentDateRangeLast() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateRangeLast());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateRangeLast field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateRangeLast() {
    return isSetField(40523);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlPaymentFixedDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentFixedDateGrp get(quickfix.fixlatest.component.LegProvisionCashSettlPaymentFixedDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentFixedDateGrp getLegProvisionCashSettlPaymentFixedDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlPaymentFixedDateGrp());
  }

  public void set(quickfix.field.NoLegProvisionCashSettlPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDates get(quickfix.field.NoLegProvisionCashSettlPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionCashSettlPaymentDates getNoLegProvisionCashSettlPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionCashSettlPaymentDates());
  }

  public boolean isSet(quickfix.field.NoLegProvisionCashSettlPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionCashSettlPaymentDates() {
    return isSetField(40473);
  }

public static class NoLegProvisionCashSettlPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40474, 40475, 0};

  public NoLegProvisionCashSettlPaymentDates() {
    super(40473, 40474, ORDER);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDate get(quickfix.field.LegProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDate getLegProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDate() {
    return isSetField(40474);
  }

  public void set(quickfix.field.LegProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateType get(quickfix.field.LegProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlPaymentDateType getLegProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlPaymentDateType() {
    return isSetField(40475);
  }
}
}
