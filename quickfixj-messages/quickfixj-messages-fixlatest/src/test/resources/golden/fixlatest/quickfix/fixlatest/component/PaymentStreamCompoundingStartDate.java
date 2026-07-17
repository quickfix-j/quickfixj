/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamCompoundingStartDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42646, 42647, 42648, 42649, 42650, 42651, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamCompoundingStartDate() {
    super();
  }

  public void set(quickfix.field.PaymentStreamCompoundingStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingStartDateUnadjusted get(quickfix.field.PaymentStreamCompoundingStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingStartDateUnadjusted getPaymentStreamCompoundingStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingStartDateUnadjusted() {
    return isSetField(42646);
  }

  public void set(quickfix.field.PaymentStreamCompoundingStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingStartDateRelativeTo get(quickfix.field.PaymentStreamCompoundingStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingStartDateRelativeTo getPaymentStreamCompoundingStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingStartDateRelativeTo() {
    return isSetField(42647);
  }

  public void set(quickfix.field.PaymentStreamCompoundingStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingStartDateOffsetPeriod get(quickfix.field.PaymentStreamCompoundingStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingStartDateOffsetPeriod getPaymentStreamCompoundingStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingStartDateOffsetPeriod() {
    return isSetField(42648);
  }

  public void set(quickfix.field.PaymentStreamCompoundingStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingStartDateOffsetUnit get(quickfix.field.PaymentStreamCompoundingStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingStartDateOffsetUnit getPaymentStreamCompoundingStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingStartDateOffsetUnit() {
    return isSetField(42649);
  }

  public void set(quickfix.field.PaymentStreamCompoundingStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingStartDateOffsetDayType get(quickfix.field.PaymentStreamCompoundingStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingStartDateOffsetDayType getPaymentStreamCompoundingStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingStartDateOffsetDayType() {
    return isSetField(42650);
  }

  public void set(quickfix.field.PaymentStreamCompoundingStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingStartDateAdjusted get(quickfix.field.PaymentStreamCompoundingStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingStartDateAdjusted getPaymentStreamCompoundingStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingStartDateAdjusted() {
    return isSetField(42651);
  }
}
