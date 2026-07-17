/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFinalPricePaymentDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42654, 42655, 42656, 42657, 42658, 42659, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFinalPricePaymentDate() {
    super();
  }

  public void set(quickfix.field.PaymentStreamFinalPricePaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateUnadjusted get(quickfix.field.PaymentStreamFinalPricePaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateUnadjusted getPaymentStreamFinalPricePaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPricePaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPricePaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPricePaymentDateUnadjusted() {
    return isSetField(42654);
  }

  public void set(quickfix.field.PaymentStreamFinalPricePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateRelativeTo get(quickfix.field.PaymentStreamFinalPricePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateRelativeTo getPaymentStreamFinalPricePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPricePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPricePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPricePaymentDateRelativeTo() {
    return isSetField(42655);
  }

  public void set(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetfPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateOffsetfPeriod get(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetfPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateOffsetfPeriod getPaymentStreamFinalPricePaymentDateOffsetfPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPricePaymentDateOffsetfPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetfPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPricePaymentDateOffsetfPeriod() {
    return isSetField(42656);
  }

  public void set(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateOffsetUnit get(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateOffsetUnit getPaymentStreamFinalPricePaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPricePaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPricePaymentDateOffsetUnit() {
    return isSetField(42657);
  }

  public void set(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateOffsetDayType get(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateOffsetDayType getPaymentStreamFinalPricePaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPricePaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPricePaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPricePaymentDateOffsetDayType() {
    return isSetField(42658);
  }

  public void set(quickfix.field.PaymentStreamFinalPricePaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateAdjusted get(quickfix.field.PaymentStreamFinalPricePaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPricePaymentDateAdjusted getPaymentStreamFinalPricePaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPricePaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPricePaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPricePaymentDateAdjusted() {
    return isSetField(42659);
  }
}
