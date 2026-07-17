/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionCashSettlValueDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42104, 42105, 42106, 42107, 42108, 42109, 42110, 42111, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionCashSettlValueDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueTime get(quickfix.field.UnderlyingProvisionCashSettlValueTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueTime getUnderlyingProvisionCashSettlValueTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueTime());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueTime() {
    return isSetField(42104);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueTimeBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlValueTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueTimeBusinessCenter getUnderlyingProvisionCashSettlValueTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueTimeBusinessCenter() {
    return isSetField(42105);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessDayConvention getUnderlyingProvisionCashSettlValueDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateBusinessDayConvention() {
    return isSetField(42106);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDateBusinessCenterGrp getUnderlyingProvisionCashSettlValueDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters getNoUnderlyingProvisionCashSettlValueDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionCashSettlValueDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionCashSettlValueDateBusinessCenters() {
    return isSetField(42182);
  }

public static class NoUnderlyingProvisionCashSettlValueDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42183, 0};

  public NoUnderlyingProvisionCashSettlValueDateBusinessCenters() {
    super(42182, 42183, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter get(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter getUnderlyingProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(42183);
  }
}

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateRelativeTo get(quickfix.field.UnderlyingProvisionCashSettlValueDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateRelativeTo getUnderlyingProvisionCashSettlValueDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateRelativeTo() {
    return isSetField(42107);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetPeriod get(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetPeriod getUnderlyingProvisionCashSettlValueDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateOffsetPeriod() {
    return isSetField(42108);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetUnit get(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetUnit getUnderlyingProvisionCashSettlValueDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateOffsetUnit() {
    return isSetField(42109);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetDayType get(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetDayType getUnderlyingProvisionCashSettlValueDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateOffsetDayType() {
    return isSetField(42110);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlValueDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateAdjusted get(quickfix.field.UnderlyingProvisionCashSettlValueDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlValueDateAdjusted getUnderlyingProvisionCashSettlValueDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlValueDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlValueDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlValueDateAdjusted() {
    return isSetField(42111);
  }
}
