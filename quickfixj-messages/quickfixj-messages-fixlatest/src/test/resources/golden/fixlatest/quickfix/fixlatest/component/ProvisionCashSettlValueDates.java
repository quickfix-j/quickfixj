/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionCashSettlValueDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40114, 40115, 40116, 40118, 40119, 40120, 40121, 40122, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionCashSettlValueDates() {
    super();
  }

  public void set(quickfix.field.ProvisionCashSettlValueTime value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueTime get(quickfix.field.ProvisionCashSettlValueTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueTime getProvisionCashSettlValueTime() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueTime());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueTime field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueTime() {
    return isSetField(40114);
  }

  public void set(quickfix.field.ProvisionCashSettlValueTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueTimeBusinessCenter get(quickfix.field.ProvisionCashSettlValueTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueTimeBusinessCenter getProvisionCashSettlValueTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueTimeBusinessCenter() {
    return isSetField(40115);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessDayConvention get(quickfix.field.ProvisionCashSettlValueDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessDayConvention getProvisionCashSettlValueDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateBusinessDayConvention() {
    return isSetField(40116);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlValueDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionCashSettlValueDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDateBusinessCenterGrp getProvisionCashSettlValueDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlValueDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionCashSettlValueDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionCashSettlValueDateBusinessCenters get(quickfix.field.NoProvisionCashSettlValueDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionCashSettlValueDateBusinessCenters getNoProvisionCashSettlValueDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionCashSettlValueDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionCashSettlValueDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionCashSettlValueDateBusinessCenters() {
    return isSetField(40953);
  }

public static class NoProvisionCashSettlValueDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40117, 0};

  public NoProvisionCashSettlValueDateBusinessCenters() {
    super(40953, 40117, ORDER);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessCenter get(quickfix.field.ProvisionCashSettlValueDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateBusinessCenter getProvisionCashSettlValueDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateBusinessCenter() {
    return isSetField(40117);
  }
}

  public void set(quickfix.field.ProvisionCashSettlValueDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateRelativeTo get(quickfix.field.ProvisionCashSettlValueDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateRelativeTo getProvisionCashSettlValueDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateRelativeTo() {
    return isSetField(40118);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateOffsetPeriod get(quickfix.field.ProvisionCashSettlValueDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateOffsetPeriod getProvisionCashSettlValueDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateOffsetPeriod() {
    return isSetField(40119);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateOffsetUnit get(quickfix.field.ProvisionCashSettlValueDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateOffsetUnit getProvisionCashSettlValueDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateOffsetUnit() {
    return isSetField(40120);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateOffsetDayType get(quickfix.field.ProvisionCashSettlValueDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateOffsetDayType getProvisionCashSettlValueDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateOffsetDayType() {
    return isSetField(40121);
  }

  public void set(quickfix.field.ProvisionCashSettlValueDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlValueDateAdjusted get(quickfix.field.ProvisionCashSettlValueDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlValueDateAdjusted getProvisionCashSettlValueDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlValueDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlValueDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlValueDateAdjusted() {
    return isSetField(40122);
  }
}
