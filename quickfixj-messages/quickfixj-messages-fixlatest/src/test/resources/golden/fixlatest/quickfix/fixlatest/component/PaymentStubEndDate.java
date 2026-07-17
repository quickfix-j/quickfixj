/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStubEndDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42689, 42690, 42691, 42692, 42693, 42694, 42695, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStubEndDate() {
    super();
  }

  public void set(quickfix.field.PaymentStubEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateUnadjusted get(quickfix.field.PaymentStubEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateUnadjusted getPaymentStubEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateUnadjusted() {
    return isSetField(42689);
  }

  public void set(quickfix.field.PaymentStubEndDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateBusinessDayConvention get(quickfix.field.PaymentStubEndDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateBusinessDayConvention getPaymentStubEndDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateBusinessDayConvention() {
    return isSetField(42690);
  }

  public void set(quickfix.fixlatest.component.PaymentStubEndDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubEndDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStubEndDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubEndDateBusinessCenterGrp getPaymentStubEndDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubEndDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStubEndDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubEndDateBusinessCenters get(quickfix.field.NoPaymentStubEndDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubEndDateBusinessCenters getNoPaymentStubEndDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubEndDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStubEndDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubEndDateBusinessCenters() {
    return isSetField(42696);
  }

public static class NoPaymentStubEndDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42697, 0};

  public NoPaymentStubEndDateBusinessCenters() {
    super(42696, 42697, ORDER);
  }

  public void set(quickfix.field.PaymentStubEndDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateBusinessCenter get(quickfix.field.PaymentStubEndDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateBusinessCenter getPaymentStubEndDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateBusinessCenter() {
    return isSetField(42697);
  }
}

  public void set(quickfix.field.PaymentStubEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateRelativeTo get(quickfix.field.PaymentStubEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateRelativeTo getPaymentStubEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateRelativeTo() {
    return isSetField(42691);
  }

  public void set(quickfix.field.PaymentStubEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateOffsetPeriod get(quickfix.field.PaymentStubEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateOffsetPeriod getPaymentStubEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateOffsetPeriod() {
    return isSetField(42692);
  }

  public void set(quickfix.field.PaymentStubEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateOffsetUnit get(quickfix.field.PaymentStubEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateOffsetUnit getPaymentStubEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateOffsetUnit() {
    return isSetField(42693);
  }

  public void set(quickfix.field.PaymentStubEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateOffsetDayType get(quickfix.field.PaymentStubEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateOffsetDayType getPaymentStubEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateOffsetDayType() {
    return isSetField(42694);
  }

  public void set(quickfix.field.PaymentStubEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStubEndDateAdjusted get(quickfix.field.PaymentStubEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubEndDateAdjusted getPaymentStubEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStubEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubEndDateAdjusted() {
    return isSetField(42695);
  }
}
