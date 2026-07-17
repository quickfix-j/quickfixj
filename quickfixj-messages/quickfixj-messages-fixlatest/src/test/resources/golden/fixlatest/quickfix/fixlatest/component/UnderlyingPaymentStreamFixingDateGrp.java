/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFixingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42955, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFixingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDates get(quickfix.field.NoUnderlyingPaymentStreamFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDates getNoUnderlyingPaymentStreamFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamFixingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamFixingDates() {
    return isSetField(42955);
  }

public static class NoUnderlyingPaymentStreamFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42956, 42957, 0};

  public NoUnderlyingPaymentStreamFixingDates() {
    super(42955, 42956, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDate get(quickfix.field.UnderlyingPaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDate getUnderlyingPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDate() {
    return isSetField(42956);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateType get(quickfix.field.UnderlyingPaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateType getUnderlyingPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateType() {
    return isSetField(42957);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDate get(quickfix.field.UnderlyingPaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDate getUnderlyingPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDate() {
    return isSetField(42956);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateType get(quickfix.field.UnderlyingPaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateType getUnderlyingPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateType() {
    return isSetField(42957);
  }
}
