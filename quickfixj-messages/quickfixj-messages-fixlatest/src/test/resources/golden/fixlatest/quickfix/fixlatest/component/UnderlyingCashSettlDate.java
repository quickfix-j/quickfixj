/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingCashSettlDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42790, 42791, 42792, 42793, 42794, 42795, 42796, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingCashSettlDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingCashSettlDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateUnadjusted get(quickfix.field.UnderlyingCashSettlDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateUnadjusted getUnderlyingCashSettlDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateUnadjusted() {
    return isSetField(42790);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessDayConvention get(quickfix.field.UnderlyingCashSettlDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessDayConvention getUnderlyingCashSettlDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateBusinessDayConvention() {
    return isSetField(42791);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingCashSettlDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDateBusinessCenterGrp getUnderlyingCashSettlDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingCashSettlDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlDateBusinessCenters get(quickfix.field.NoUnderlyingCashSettlDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlDateBusinessCenters getNoUnderlyingCashSettlDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlDateBusinessCenters() {
    return isSetField(42788);
  }

public static class NoUnderlyingCashSettlDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42789, 0};

  public NoUnderlyingCashSettlDateBusinessCenters() {
    super(42788, 42789, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessCenter get(quickfix.field.UnderlyingCashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessCenter getUnderlyingCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateBusinessCenter() {
    return isSetField(42789);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateRelativeTo get(quickfix.field.UnderlyingCashSettlDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateRelativeTo getUnderlyingCashSettlDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateRelativeTo() {
    return isSetField(42792);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateOffsetPeriod get(quickfix.field.UnderlyingCashSettlDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateOffsetPeriod getUnderlyingCashSettlDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateOffsetPeriod() {
    return isSetField(42793);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateOffsetUnit get(quickfix.field.UnderlyingCashSettlDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateOffsetUnit getUnderlyingCashSettlDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateOffsetUnit() {
    return isSetField(42794);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateOffsetDayType get(quickfix.field.UnderlyingCashSettlDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateOffsetDayType getUnderlyingCashSettlDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateOffsetDayType() {
    return isSetField(42795);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateAdjusted get(quickfix.field.UnderlyingCashSettlDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateAdjusted getUnderlyingCashSettlDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateAdjusted() {
    return isSetField(42796);
  }
}
