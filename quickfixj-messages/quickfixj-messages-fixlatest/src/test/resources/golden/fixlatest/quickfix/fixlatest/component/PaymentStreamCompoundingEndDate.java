/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamCompoundingEndDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42622, 42623, 42624, 42625, 42626, 42627, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamCompoundingEndDate() {
    super();
  }

  public void set(quickfix.field.PaymentStreamCompoundingEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingEndDateUnadjusted get(quickfix.field.PaymentStreamCompoundingEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingEndDateUnadjusted getPaymentStreamCompoundingEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingEndDateUnadjusted() {
    return isSetField(42622);
  }

  public void set(quickfix.field.PaymentStreamCompoundingEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingEndDateRelativeTo get(quickfix.field.PaymentStreamCompoundingEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingEndDateRelativeTo getPaymentStreamCompoundingEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingEndDateRelativeTo() {
    return isSetField(42623);
  }

  public void set(quickfix.field.PaymentStreamCompoundingEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingEndDateOffsetPeriod get(quickfix.field.PaymentStreamCompoundingEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingEndDateOffsetPeriod getPaymentStreamCompoundingEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingEndDateOffsetPeriod() {
    return isSetField(42624);
  }

  public void set(quickfix.field.PaymentStreamCompoundingEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingEndDateOffsetUnit get(quickfix.field.PaymentStreamCompoundingEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingEndDateOffsetUnit getPaymentStreamCompoundingEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingEndDateOffsetUnit() {
    return isSetField(42625);
  }

  public void set(quickfix.field.PaymentStreamCompoundingEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingEndDateOffsetDayType get(quickfix.field.PaymentStreamCompoundingEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingEndDateOffsetDayType getPaymentStreamCompoundingEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingEndDateOffsetDayType() {
    return isSetField(42626);
  }

  public void set(quickfix.field.PaymentStreamCompoundingEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingEndDateAdjusted get(quickfix.field.PaymentStreamCompoundingEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingEndDateAdjusted getPaymentStreamCompoundingEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingEndDateAdjusted() {
    return isSetField(42627);
  }
}
