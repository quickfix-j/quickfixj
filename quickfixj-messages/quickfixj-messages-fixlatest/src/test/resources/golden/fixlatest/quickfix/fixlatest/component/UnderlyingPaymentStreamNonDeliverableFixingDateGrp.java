/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamNonDeliverableFixingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40656, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamNonDeliverableFixingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingNonDeliverableFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingNonDeliverableFixingDates get(quickfix.field.NoUnderlyingNonDeliverableFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingNonDeliverableFixingDates getNoUnderlyingNonDeliverableFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingNonDeliverableFixingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingNonDeliverableFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingNonDeliverableFixingDates() {
    return isSetField(40656);
  }

public static class NoUnderlyingNonDeliverableFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40657, 40658, 0};

  public NoUnderlyingNonDeliverableFixingDates() {
    super(40656, 40657, ORDER);
  }

  public void set(quickfix.field.UnderlyingNonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDate get(quickfix.field.UnderlyingNonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDate getUnderlyingNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingNonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonDeliverableFixingDate() {
    return isSetField(40657);
  }

  public void set(quickfix.field.UnderlyingNonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDateType get(quickfix.field.UnderlyingNonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDateType getUnderlyingNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingNonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonDeliverableFixingDateType() {
    return isSetField(40658);
  }
}

  public void set(quickfix.field.UnderlyingNonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDate get(quickfix.field.UnderlyingNonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDate getUnderlyingNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingNonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonDeliverableFixingDate() {
    return isSetField(40657);
  }

  public void set(quickfix.field.UnderlyingNonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDateType get(quickfix.field.UnderlyingNonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDateType getUnderlyingNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingNonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonDeliverableFixingDateType() {
    return isSetField(40658);
  }
}
