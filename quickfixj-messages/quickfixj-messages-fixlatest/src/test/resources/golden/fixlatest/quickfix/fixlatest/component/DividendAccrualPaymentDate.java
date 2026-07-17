/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendAccrualPaymentDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42238, 42239, 42240, 42241, 42242, 42243, 42244, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DividendAccrualPaymentDate() {
    super();
  }

  public void set(quickfix.field.DividendAccrualPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateRelativeTo get(quickfix.field.DividendAccrualPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateRelativeTo getDividendAccrualPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateRelativeTo() {
    return isSetField(42238);
  }

  public void set(quickfix.field.DividendAccrualPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateOffsetPeriod get(quickfix.field.DividendAccrualPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateOffsetPeriod getDividendAccrualPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateOffsetPeriod() {
    return isSetField(42239);
  }

  public void set(quickfix.field.DividendAccrualPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateOffsetUnit get(quickfix.field.DividendAccrualPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateOffsetUnit getDividendAccrualPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateOffsetUnit() {
    return isSetField(42240);
  }

  public void set(quickfix.field.DividendAccrualPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateOffsetDayType get(quickfix.field.DividendAccrualPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateOffsetDayType getDividendAccrualPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateOffsetDayType() {
    return isSetField(42241);
  }

  public void set(quickfix.field.DividendAccrualPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateUnadjusted get(quickfix.field.DividendAccrualPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateUnadjusted getDividendAccrualPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateUnadjusted() {
    return isSetField(42242);
  }

  public void set(quickfix.field.DividendAccrualPaymeentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymeentDateBusinessDayConvention get(quickfix.field.DividendAccrualPaymeentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymeentDateBusinessDayConvention getDividendAccrualPaymeentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymeentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymeentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymeentDateBusinessDayConvention() {
    return isSetField(42243);
  }

  public void set(quickfix.fixlatest.component.DividendAccrualPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendAccrualPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.DividendAccrualPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendAccrualPaymentDateBusinessCenterGrp getDividendAccrualPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendAccrualPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoDividendAccrualPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoDividendAccrualPaymentDateBusinessCenters get(quickfix.field.NoDividendAccrualPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendAccrualPaymentDateBusinessCenters getNoDividendAccrualPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoDividendAccrualPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoDividendAccrualPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendAccrualPaymentDateBusinessCenters() {
    return isSetField(42236);
  }

public static class NoDividendAccrualPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42237, 0};

  public NoDividendAccrualPaymentDateBusinessCenters() {
    super(42236, 42237, ORDER);
  }

  public void set(quickfix.field.DividendAccrualPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateBusinessCenter get(quickfix.field.DividendAccrualPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateBusinessCenter getDividendAccrualPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateBusinessCenter() {
    return isSetField(42237);
  }
}

  public void set(quickfix.field.DividendAccrualPaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualPaymentDateAdjusted get(quickfix.field.DividendAccrualPaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualPaymentDateAdjusted getDividendAccrualPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualPaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.DividendAccrualPaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualPaymentDateAdjusted() {
    return isSetField(42244);
  }
}
