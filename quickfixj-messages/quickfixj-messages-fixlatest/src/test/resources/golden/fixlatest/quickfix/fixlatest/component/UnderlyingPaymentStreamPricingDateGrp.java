/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamPricingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41941, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamPricingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPricingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPricingDates get(quickfix.field.NoUnderlyingPaymentStreamPricingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPricingDates getNoUnderlyingPaymentStreamPricingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPricingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPricingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPricingDates() {
    return isSetField(41941);
  }

public static class NoUnderlyingPaymentStreamPricingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41942, 41943, 0};

  public NoUnderlyingPaymentStreamPricingDates() {
    super(41941, 41942, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDate get(quickfix.field.UnderlyingPaymentStreamPricingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDate getUnderlyingPaymentStreamPricingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDate() {
    return isSetField(41942);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDateType get(quickfix.field.UnderlyingPaymentStreamPricingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDateType getUnderlyingPaymentStreamPricingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDateType() {
    return isSetField(41943);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDate get(quickfix.field.UnderlyingPaymentStreamPricingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDate getUnderlyingPaymentStreamPricingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDate() {
    return isSetField(41942);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDateType get(quickfix.field.UnderlyingPaymentStreamPricingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDateType getUnderlyingPaymentStreamPricingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDateType() {
    return isSetField(41943);
  }
}
