/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStubStartDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42993, 42994, 42995, 42996, 42997, 42998, 42999, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStubStartDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateUnadjusted get(quickfix.field.UnderlyingPaymentStubStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateUnadjusted getUnderlyingPaymentStubStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateUnadjusted() {
    return isSetField(42993);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessDayConvention get(quickfix.field.UnderlyingPaymentStubStartDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessDayConvention getUnderlyingPaymentStubStartDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateBusinessDayConvention() {
    return isSetField(42994);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubStartDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStubStartDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDateBusinessCenterGrp getUnderlyingPaymentStubStartDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubStartDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters getNoUnderlyingPaymentStubStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubStartDateBusinessCenters() {
    return isSetField(43000);
  }

public static class NoUnderlyingPaymentStubStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43001, 0};

  public NoUnderlyingPaymentStubStartDateBusinessCenters() {
    super(43000, 43001, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter get(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter getUnderlyingPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateBusinessCenter() {
    return isSetField(43001);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStubStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateRelativeTo get(quickfix.field.UnderlyingPaymentStubStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateRelativeTo getUnderlyingPaymentStubStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateRelativeTo() {
    return isSetField(42995);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStubStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateOffsetPeriod getUnderlyingPaymentStubStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateOffsetPeriod() {
    return isSetField(42996);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateOffsetUnit get(quickfix.field.UnderlyingPaymentStubStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateOffsetUnit getUnderlyingPaymentStubStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateOffsetUnit() {
    return isSetField(42997);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateOffsetDayType get(quickfix.field.UnderlyingPaymentStubStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateOffsetDayType getUnderlyingPaymentStubStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateOffsetDayType() {
    return isSetField(42998);
  }

  public void set(quickfix.field.UnderlyingPaymentStubStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubStartDateAdjusted get(quickfix.field.UnderlyingPaymentStubStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubStartDateAdjusted getUnderlyingPaymentStubStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubStartDateAdjusted() {
    return isSetField(42999);
  }
}
