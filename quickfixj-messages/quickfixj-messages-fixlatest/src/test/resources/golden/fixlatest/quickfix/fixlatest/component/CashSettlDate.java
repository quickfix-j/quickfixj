/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CashSettlDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42207, 42208, 42209, 42210, 42211, 42212, 42213, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public CashSettlDate() {
    super();
  }

  public void set(quickfix.field.CashSettlDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateUnadjusted get(quickfix.field.CashSettlDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateUnadjusted getCashSettlDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateUnadjusted());
  }

  public boolean isSet(quickfix.field.CashSettlDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateUnadjusted() {
    return isSetField(42207);
  }

  public void set(quickfix.field.CashSettlDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateBusinessDayConvention get(quickfix.field.CashSettlDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateBusinessDayConvention getCashSettlDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.CashSettlDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateBusinessDayConvention() {
    return isSetField(42208);
  }

  public void set(quickfix.fixlatest.component.CashSettlDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDateBusinessCenterGrp get(quickfix.fixlatest.component.CashSettlDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDateBusinessCenterGrp getCashSettlDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoCashSettlDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlDateBusinessCenters get(quickfix.field.NoCashSettlDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlDateBusinessCenters getNoCashSettlDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoCashSettlDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlDateBusinessCenters() {
    return isSetField(42214);
  }

public static class NoCashSettlDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42215, 0};

  public NoCashSettlDateBusinessCenters() {
    super(42214, 42215, ORDER);
  }

  public void set(quickfix.field.CashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateBusinessCenter get(quickfix.field.CashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateBusinessCenter getCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.CashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateBusinessCenter() {
    return isSetField(42215);
  }
}

  public void set(quickfix.field.CashSettlDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateRelativeTo get(quickfix.field.CashSettlDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateRelativeTo getCashSettlDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateRelativeTo());
  }

  public boolean isSet(quickfix.field.CashSettlDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateRelativeTo() {
    return isSetField(42209);
  }

  public void set(quickfix.field.CashSettlDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateOffsetPeriod get(quickfix.field.CashSettlDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateOffsetPeriod getCashSettlDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.CashSettlDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateOffsetPeriod() {
    return isSetField(42210);
  }

  public void set(quickfix.field.CashSettlDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateOffsetUnit get(quickfix.field.CashSettlDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateOffsetUnit getCashSettlDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.CashSettlDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateOffsetUnit() {
    return isSetField(42211);
  }

  public void set(quickfix.field.CashSettlDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateOffsetDayType get(quickfix.field.CashSettlDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateOffsetDayType getCashSettlDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.CashSettlDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateOffsetDayType() {
    return isSetField(42212);
  }

  public void set(quickfix.field.CashSettlDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateAdjusted get(quickfix.field.CashSettlDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateAdjusted getCashSettlDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateAdjusted());
  }

  public boolean isSet(quickfix.field.CashSettlDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateAdjusted() {
    return isSetField(42213);
  }
}
