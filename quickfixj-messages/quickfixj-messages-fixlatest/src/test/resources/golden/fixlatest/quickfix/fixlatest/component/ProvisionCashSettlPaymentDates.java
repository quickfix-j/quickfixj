/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionCashSettlPaymentDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40163, 40165, 40166, 40167, 40168, 40169, 40170, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionCashSettlPaymentDates() {
    super();
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessDayConvention get(quickfix.field.ProvisionCashSettlPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessDayConvention getProvisionCashSettlPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateBusinessDayConvention() {
    return isSetField(40163);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionCashSettlPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDateBusinessCenterGrp getProvisionCashSettlPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters get(quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters getNoProvisionCashSettlPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionCashSettlPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionCashSettlPaymentDateBusinessCenters() {
    return isSetField(40952);
  }

public static class NoProvisionCashSettlPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40164, 0};

  public NoProvisionCashSettlPaymentDateBusinessCenters() {
    super(40952, 40164, ORDER);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter get(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter getProvisionCashSettlPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateBusinessCenter() {
    return isSetField(40164);
  }
}

  public void set(quickfix.field.ProvisionCashSettlPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateRelativeTo get(quickfix.field.ProvisionCashSettlPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateRelativeTo getProvisionCashSettlPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateRelativeTo() {
    return isSetField(40165);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateOffsetPeriod get(quickfix.field.ProvisionCashSettlPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateOffsetPeriod getProvisionCashSettlPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateOffsetPeriod() {
    return isSetField(40166);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateOffsetUnit get(quickfix.field.ProvisionCashSettlPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateOffsetUnit getProvisionCashSettlPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateOffsetUnit() {
    return isSetField(40167);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateOffsetDayType get(quickfix.field.ProvisionCashSettlPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateOffsetDayType getProvisionCashSettlPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateOffsetDayType() {
    return isSetField(40168);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateRangeFirst value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateRangeFirst get(quickfix.field.ProvisionCashSettlPaymentDateRangeFirst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateRangeFirst getProvisionCashSettlPaymentDateRangeFirst() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateRangeFirst());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateRangeFirst field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateRangeFirst() {
    return isSetField(40169);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateRangeLast value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateRangeLast get(quickfix.field.ProvisionCashSettlPaymentDateRangeLast value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateRangeLast getProvisionCashSettlPaymentDateRangeLast() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateRangeLast());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateRangeLast field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateRangeLast() {
    return isSetField(40170);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlPaymentFixedDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentFixedDateGrp get(quickfix.fixlatest.component.ProvisionCashSettlPaymentFixedDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentFixedDateGrp getProvisionCashSettlPaymentFixedDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlPaymentFixedDateGrp());
  }

  public void set(quickfix.field.NoProvisionCashSettlPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoProvisionCashSettlPaymentDates get(quickfix.field.NoProvisionCashSettlPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionCashSettlPaymentDates getNoProvisionCashSettlPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionCashSettlPaymentDates());
  }

  public boolean isSet(quickfix.field.NoProvisionCashSettlPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionCashSettlPaymentDates() {
    return isSetField(40171);
  }

public static class NoProvisionCashSettlPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40172, 40173, 0};

  public NoProvisionCashSettlPaymentDates() {
    super(40171, 40172, ORDER);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDate value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDate get(quickfix.field.ProvisionCashSettlPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDate getProvisionCashSettlPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDate());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDate() {
    return isSetField(40172);
  }

  public void set(quickfix.field.ProvisionCashSettlPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlPaymentDateType get(quickfix.field.ProvisionCashSettlPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlPaymentDateType getProvisionCashSettlPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlPaymentDateType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlPaymentDateType() {
    return isSetField(40173);
  }
}
}
