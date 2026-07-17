/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStubStartDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42698, 42699, 42700, 42701, 42702, 42703, 42704, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStubStartDate() {
    super();
  }

  public void set(quickfix.field.PaymentStubStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateUnadjusted get(quickfix.field.PaymentStubStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateUnadjusted getPaymentStubStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateUnadjusted() {
    return isSetField(42698);
  }

  public void set(quickfix.field.PaymentStubStartDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateBusinessDayConvention get(quickfix.field.PaymentStubStartDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateBusinessDayConvention getPaymentStubStartDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateBusinessDayConvention() {
    return isSetField(42699);
  }

  public void set(quickfix.fixlatest.component.PaymentStubStartDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubStartDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStubStartDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubStartDateBusinessCenterGrp getPaymentStubStartDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubStartDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStubStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubStartDateBusinessCenters get(quickfix.field.NoPaymentStubStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubStartDateBusinessCenters getNoPaymentStubStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStubStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubStartDateBusinessCenters() {
    return isSetField(42705);
  }

public static class NoPaymentStubStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42706, 0};

  public NoPaymentStubStartDateBusinessCenters() {
    super(42705, 42706, ORDER);
  }

  public void set(quickfix.field.PaymentStubStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateBusinessCenter get(quickfix.field.PaymentStubStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateBusinessCenter getPaymentStubStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateBusinessCenter() {
    return isSetField(42706);
  }
}

  public void set(quickfix.field.PaymentStubStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateRelativeTo get(quickfix.field.PaymentStubStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateRelativeTo getPaymentStubStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateRelativeTo() {
    return isSetField(42700);
  }

  public void set(quickfix.field.PaymentStubStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateOffsetPeriod get(quickfix.field.PaymentStubStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateOffsetPeriod getPaymentStubStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateOffsetPeriod() {
    return isSetField(42701);
  }

  public void set(quickfix.field.PaymentStubStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateOffsetUnit get(quickfix.field.PaymentStubStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateOffsetUnit getPaymentStubStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateOffsetUnit() {
    return isSetField(42702);
  }

  public void set(quickfix.field.PaymentStubStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateOffsetDayType get(quickfix.field.PaymentStubStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateOffsetDayType getPaymentStubStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateOffsetDayType() {
    return isSetField(42703);
  }

  public void set(quickfix.field.PaymentStubStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStubStartDateAdjusted get(quickfix.field.PaymentStubStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubStartDateAdjusted getPaymentStubStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStubStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubStartDateAdjusted() {
    return isSetField(42704);
  }
}
