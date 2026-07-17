/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCalculationPeriodDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41954, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCalculationPeriodDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCalculationPeriodDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodDates get(quickfix.field.NoUnderlyingStreamCalculationPeriodDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodDates getNoUnderlyingStreamCalculationPeriodDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCalculationPeriodDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCalculationPeriodDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCalculationPeriodDates() {
    return isSetField(41954);
  }

public static class NoUnderlyingStreamCalculationPeriodDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41955, 41956, 0};

  public NoUnderlyingStreamCalculationPeriodDates() {
    super(41954, 41955, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDate get(quickfix.field.UnderlyingStreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDate getUnderlyingStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDate() {
    return isSetField(41955);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDateType get(quickfix.field.UnderlyingStreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDateType getUnderlyingStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDateType() {
    return isSetField(41956);
  }
}

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDate get(quickfix.field.UnderlyingStreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDate getUnderlyingStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDate() {
    return isSetField(41955);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDateType get(quickfix.field.UnderlyingStreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDateType getUnderlyingStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDateType() {
    return isSetField(41956);
  }
}
