/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamCompoundingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42901, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamCompoundingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamCompoundingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDates get(quickfix.field.NoUnderlyingPaymentStreamCompoundingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDates getNoUnderlyingPaymentStreamCompoundingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamCompoundingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamCompoundingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamCompoundingDates() {
    return isSetField(42901);
  }

public static class NoUnderlyingPaymentStreamCompoundingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42902, 42903, 0};

  public NoUnderlyingPaymentStreamCompoundingDates() {
    super(42901, 42902, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDate get(quickfix.field.UnderlyingPaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDate getUnderlyingPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDate() {
    return isSetField(42902);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDateType get(quickfix.field.UnderlyingPaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDateType getUnderlyingPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDateType() {
    return isSetField(42903);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDate get(quickfix.field.UnderlyingPaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDate getUnderlyingPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDate() {
    return isSetField(42902);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDateType get(quickfix.field.UnderlyingPaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDateType getUnderlyingPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDateType() {
    return isSetField(42903);
  }
}
