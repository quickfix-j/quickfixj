/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStubEndDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42984, 42985, 42986, 42987, 42988, 42989, 42990, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStubEndDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateUnadjusted get(quickfix.field.UnderlyingPaymentStubEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateUnadjusted getUnderlyingPaymentStubEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateUnadjusted() {
    return isSetField(42984);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessDayConvention get(quickfix.field.UnderlyingPaymentStubEndDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessDayConvention getUnderlyingPaymentStubEndDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateBusinessDayConvention() {
    return isSetField(42985);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubEndDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStubEndDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDateBusinessCenterGrp getUnderlyingPaymentStubEndDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubEndDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters getNoUnderlyingPaymentStubEndDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubEndDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubEndDateBusinessCenters() {
    return isSetField(42991);
  }

public static class NoUnderlyingPaymentStubEndDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42992, 0};

  public NoUnderlyingPaymentStubEndDateBusinessCenters() {
    super(42991, 42992, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter get(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter getUnderlyingPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateBusinessCenter() {
    return isSetField(42992);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStubEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateRelativeTo get(quickfix.field.UnderlyingPaymentStubEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateRelativeTo getUnderlyingPaymentStubEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateRelativeTo() {
    return isSetField(42986);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStubEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateOffsetPeriod getUnderlyingPaymentStubEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateOffsetPeriod() {
    return isSetField(42987);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateOffsetUnit get(quickfix.field.UnderlyingPaymentStubEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateOffsetUnit getUnderlyingPaymentStubEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateOffsetUnit() {
    return isSetField(42988);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateOffsetDayType get(quickfix.field.UnderlyingPaymentStubEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateOffsetDayType getUnderlyingPaymentStubEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateOffsetDayType() {
    return isSetField(42989);
  }

  public void set(quickfix.field.UnderlyingPaymentStubEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubEndDateAdjusted get(quickfix.field.UnderlyingPaymentStubEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubEndDateAdjusted getUnderlyingPaymentStubEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubEndDateAdjusted() {
    return isSetField(42990);
  }
}
