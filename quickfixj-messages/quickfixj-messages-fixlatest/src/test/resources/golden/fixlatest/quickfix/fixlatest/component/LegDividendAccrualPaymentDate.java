/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDividendAccrualPaymentDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42330, 42331, 42332, 42333, 42334, 42335, 42336, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegDividendAccrualPaymentDate() {
    super();
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateRelativeTo get(quickfix.field.LegDividendAccrualPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateRelativeTo getLegDividendAccrualPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateRelativeTo() {
    return isSetField(42330);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateOffsetPeriod get(quickfix.field.LegDividendAccrualPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateOffsetPeriod getLegDividendAccrualPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateOffsetPeriod() {
    return isSetField(42331);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateOffsetUnit get(quickfix.field.LegDividendAccrualPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateOffsetUnit getLegDividendAccrualPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateOffsetUnit() {
    return isSetField(42332);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateOffsetDayType get(quickfix.field.LegDividendAccrualPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateOffsetDayType getLegDividendAccrualPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateOffsetDayType() {
    return isSetField(42333);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateUnadjusted get(quickfix.field.LegDividendAccrualPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateUnadjusted getLegDividendAccrualPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateUnadjusted() {
    return isSetField(42334);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessDayConvention get(quickfix.field.LegDividendAccrualPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessDayConvention getLegDividendAccrualPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateBusinessDayConvention() {
    return isSetField(42335);
  }

  public void set(quickfix.fixlatest.component.LegDividendAccrualPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendAccrualPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.LegDividendAccrualPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendAccrualPaymentDateBusinessCenterGrp getLegDividendAccrualPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendAccrualPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters get(quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters getNoLegDividendAccrualPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegDividendAccrualPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendAccrualPaymentDateBusinessCenters() {
    return isSetField(42310);
  }

public static class NoLegDividendAccrualPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42311, 0};

  public NoLegDividendAccrualPaymentDateBusinessCenters() {
    super(42310, 42311, ORDER);
  }

  public void set(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessCenter get(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateBusinessCenter getLegDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42311);
  }
}

  public void set(quickfix.field.LegDividendAccrualPaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualPaymentDateAdjusted get(quickfix.field.LegDividendAccrualPaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualPaymentDateAdjusted getLegDividendAccrualPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualPaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualPaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualPaymentDateAdjusted() {
    return isSetField(42336);
  }
}
