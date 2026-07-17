/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRateValuationDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43071, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRateValuationDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates get(quickfix.field.NoUnderlyingReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates getNoUnderlyingReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDates() {
    return isSetField(43071);
  }

public static class NoUnderlyingReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43072, 43073, 0};

  public NoUnderlyingReturnRateValuationDates() {
    super(43071, 43072, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDate get(quickfix.field.UnderlyingReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDate getUnderlyingReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDate() {
    return isSetField(43072);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType get(quickfix.field.UnderlyingReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType getUnderlyingReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateType() {
    return isSetField(43073);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDate get(quickfix.field.UnderlyingReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDate getUnderlyingReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDate() {
    return isSetField(43072);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType get(quickfix.field.UnderlyingReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType getUnderlyingReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateType() {
    return isSetField(43073);
  }
}
