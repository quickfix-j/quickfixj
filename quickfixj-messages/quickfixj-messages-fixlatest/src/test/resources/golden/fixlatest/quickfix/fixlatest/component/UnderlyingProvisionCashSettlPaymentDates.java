/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionCashSettlPaymentDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42092, 42093, 42094, 42095, 42096, 42097, 42098, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionCashSettlPaymentDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessDayConvention getUnderlyingProvisionCashSettlPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateBusinessDayConvention() {
    return isSetField(42092);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp getUnderlyingProvisionCashSettlPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters getNoUnderlyingProvisionCashSettlPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionCashSettlPaymentDateBusinessCenters() {
    return isSetField(42180);
  }

public static class NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42181, 0};

  public NoUnderlyingProvisionCashSettlPaymentDateBusinessCenters() {
    super(42180, 42181, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter getUnderlyingProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(42181);
  }
}

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateRelativeTo get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateRelativeTo getUnderlyingProvisionCashSettlPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateRelativeTo() {
    return isSetField(42093);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetPeriod get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetPeriod getUnderlyingProvisionCashSettlPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateOffsetPeriod() {
    return isSetField(42094);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetUnit get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetUnit getUnderlyingProvisionCashSettlPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateOffsetUnit() {
    return isSetField(42095);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetDayType get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetDayType getUnderlyingProvisionCashSettlPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateOffsetDayType() {
    return isSetField(42096);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeFirst value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeFirst get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeFirst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeFirst getUnderlyingProvisionCashSettlPaymentDateRangeFirst() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeFirst());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeFirst field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateRangeFirst() {
    return isSetField(42097);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeLast value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeLast get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeLast value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeLast getUnderlyingProvisionCashSettlPaymentDateRangeLast() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeLast());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateRangeLast field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateRangeLast() {
    return isSetField(42098);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentFixedDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentFixedDateGrp get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentFixedDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentFixedDateGrp getUnderlyingProvisionCashSettlPaymentFixedDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentFixedDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates get(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates getNoUnderlyingProvisionCashSettlPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionCashSettlPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionCashSettlPaymentDates() {
    return isSetField(42099);
  }

public static class NoUnderlyingProvisionCashSettlPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42100, 42101, 0};

  public NoUnderlyingProvisionCashSettlPaymentDates() {
    super(42099, 42100, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDate get(quickfix.field.UnderlyingProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDate getUnderlyingProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDate() {
    return isSetField(42100);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateType get(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlPaymentDateType getUnderlyingProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlPaymentDateType() {
    return isSetField(42101);
  }
}
}
