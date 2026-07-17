/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamNonDeliverableFixingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40825, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamNonDeliverableFixingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoNonDeliverableFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoNonDeliverableFixingDates get(quickfix.field.NoNonDeliverableFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNonDeliverableFixingDates getNoNonDeliverableFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoNonDeliverableFixingDates());
  }

  public boolean isSet(quickfix.field.NoNonDeliverableFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoNonDeliverableFixingDates() {
    return isSetField(40825);
  }

public static class NoNonDeliverableFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40826, 40827, 0};

  public NoNonDeliverableFixingDates() {
    super(40825, 40826, ORDER);
  }

  public void set(quickfix.field.NonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.NonDeliverableFixingDate get(quickfix.field.NonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonDeliverableFixingDate getNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.NonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.NonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetNonDeliverableFixingDate() {
    return isSetField(40826);
  }

  public void set(quickfix.field.NonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.NonDeliverableFixingDateType get(quickfix.field.NonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonDeliverableFixingDateType getNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.NonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.NonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetNonDeliverableFixingDateType() {
    return isSetField(40827);
  }
}

  public void set(quickfix.field.NonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.NonDeliverableFixingDate get(quickfix.field.NonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonDeliverableFixingDate getNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.NonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.NonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetNonDeliverableFixingDate() {
    return isSetField(40826);
  }

  public void set(quickfix.field.NonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.NonDeliverableFixingDateType get(quickfix.field.NonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonDeliverableFixingDateType getNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.NonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.NonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetNonDeliverableFixingDateType() {
    return isSetField(40827);
  }
}
