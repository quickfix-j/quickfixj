/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamPricingDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41944, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamPricingDayGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPricingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPricingDays get(quickfix.field.NoUnderlyingPaymentStreamPricingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPricingDays getNoUnderlyingPaymentStreamPricingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPricingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPricingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPricingDays() {
    return isSetField(41944);
  }

public static class NoUnderlyingPaymentStreamPricingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41945, 41946, 0};

  public NoUnderlyingPaymentStreamPricingDays() {
    super(41944, 41945, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek get(quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek getUnderlyingPaymentStreamPricingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDayOfWeek() {
    return isSetField(41945);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayNumber get(quickfix.field.UnderlyingPaymentStreamPricingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayNumber getUnderlyingPaymentStreamPricingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDayNumber() {
    return isSetField(41946);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek get(quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek getUnderlyingPaymentStreamPricingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDayOfWeek() {
    return isSetField(41945);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPricingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayNumber get(quickfix.field.UnderlyingPaymentStreamPricingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPricingDayNumber getUnderlyingPaymentStreamPricingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPricingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPricingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPricingDayNumber() {
    return isSetField(41946);
  }
}
