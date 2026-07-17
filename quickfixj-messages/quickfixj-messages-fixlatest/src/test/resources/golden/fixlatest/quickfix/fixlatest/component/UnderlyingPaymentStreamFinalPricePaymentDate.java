/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFinalPricePaymentDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42949, 42950, 42951, 42952, 42953, 42954, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFinalPricePaymentDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateUnadjusted getUnderlyingPaymentStreamFinalPricePaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPricePaymentDateUnadjusted() {
    return isSetField(42949);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateRelativeTo getUnderlyingPaymentStreamFinalPricePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPricePaymentDateRelativeTo() {
    return isSetField(42950);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod getUnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPricePaymentDateOffsetPeriod() {
    return isSetField(42951);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit getUnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPricePaymentDateOffsetUnit() {
    return isSetField(42952);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType getUnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPricePaymentDateOffsetDayType() {
    return isSetField(42953);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateAdjusted get(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateAdjusted getUnderlyingPaymentStreamFinalPricePaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPricePaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPricePaymentDateAdjusted() {
    return isSetField(42954);
  }
}
