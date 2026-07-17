/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamCompoundingStartDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42941, 42942, 42943, 42944, 42945, 42946, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamCompoundingStartDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateUnadjusted getUnderlyingPaymentStreamCompoundingStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingStartDateUnadjusted() {
    return isSetField(42941);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateRelativeTo getUnderlyingPaymentStreamCompoundingStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingStartDateRelativeTo() {
    return isSetField(42942);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetPeriod getUnderlyingPaymentStreamCompoundingStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingStartDateOffsetPeriod() {
    return isSetField(42943);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetUnit getUnderlyingPaymentStreamCompoundingStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingStartDateOffsetUnit() {
    return isSetField(42944);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetDayType getUnderlyingPaymentStreamCompoundingStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingStartDateOffsetDayType() {
    return isSetField(42945);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateAdjusted get(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingStartDateAdjusted getUnderlyingPaymentStreamCompoundingStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingStartDateAdjusted() {
    return isSetField(42946);
  }
}
