/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamCompoundingEndDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42917, 42918, 42919, 42920, 42921, 42922, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamCompoundingEndDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateUnadjusted getUnderlyingPaymentStreamCompoundingEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingEndDateUnadjusted() {
    return isSetField(42917);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateRelativeTo getUnderlyingPaymentStreamCompoundingEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingEndDateRelativeTo() {
    return isSetField(42918);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetPeriod getUnderlyingPaymentStreamCompoundingEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingEndDateOffsetPeriod() {
    return isSetField(42919);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetUnit getUnderlyingPaymentStreamCompoundingEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingEndDateOffsetUnit() {
    return isSetField(42920);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetDayType getUnderlyingPaymentStreamCompoundingEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingEndDateOffsetDayType() {
    return isSetField(42921);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateAdjusted get(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingEndDateAdjusted getUnderlyingPaymentStreamCompoundingEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingEndDateAdjusted() {
    return isSetField(42922);
  }
}
