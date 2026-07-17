/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendAccrualPaymentDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42819, 42820, 42821, 42822, 42823, 42824, 42825, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendAccrualPaymentDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateRelativeTo get(quickfix.field.UnderlyingDividendAccrualPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateRelativeTo getUnderlyingDividendAccrualPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateRelativeTo() {
    return isSetField(42819);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetPeriod get(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetPeriod getUnderlyingDividendAccrualPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateOffsetPeriod() {
    return isSetField(42820);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetUnit get(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetUnit getUnderlyingDividendAccrualPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateOffsetUnit() {
    return isSetField(42821);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetDayType get(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetDayType getUnderlyingDividendAccrualPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateOffsetDayType() {
    return isSetField(42822);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateUnadjusted get(quickfix.field.UnderlyingDividendAccrualPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateUnadjusted getUnderlyingDividendAccrualPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateUnadjusted() {
    return isSetField(42823);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessDayConvention get(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessDayConvention getUnderlyingDividendAccrualPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateBusinessDayConvention() {
    return isSetField(42824);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDateBusinessCenterGrp getUnderlyingDividendAccrualPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters get(quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters getNoUnderlyingDividendAccrualPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendAccrualPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendAccrualPaymentDateBusinessCenters() {
    return isSetField(42799);
  }

public static class NoUnderlyingDividendAccrualPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42800, 0};

  public NoUnderlyingDividendAccrualPaymentDateBusinessCenters() {
    super(42799, 42800, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter get(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter getUnderlyingDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42800);
  }
}

  public void set(quickfix.field.UnderlyingDividendAccrualPaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateAdjusted get(quickfix.field.UnderlyingDividendAccrualPaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualPaymentDateAdjusted getUnderlyingDividendAccrualPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualPaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualPaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualPaymentDateAdjusted() {
    return isSetField(42825);
  }
}
