/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCalculationPeriodDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41241, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCalculationPeriodDateGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCalculationPeriodDates value) {
    setField(value);
  }

  public quickfix.field.NoStreamCalculationPeriodDates get(quickfix.field.NoStreamCalculationPeriodDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCalculationPeriodDates getNoStreamCalculationPeriodDates() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCalculationPeriodDates());
  }

  public boolean isSet(quickfix.field.NoStreamCalculationPeriodDates field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCalculationPeriodDates() {
    return isSetField(41241);
  }

public static class NoStreamCalculationPeriodDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41242, 41243, 0};

  public NoStreamCalculationPeriodDates() {
    super(41241, 41242, ORDER);
  }

  public void set(quickfix.field.StreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDate get(quickfix.field.StreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDate getStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDate() {
    return isSetField(41242);
  }

  public void set(quickfix.field.StreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDateType get(quickfix.field.StreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDateType getStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDateType() {
    return isSetField(41243);
  }
}

  public void set(quickfix.field.StreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDate get(quickfix.field.StreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDate getStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDate() {
    return isSetField(41242);
  }

  public void set(quickfix.field.StreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDateType get(quickfix.field.StreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDateType getStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDateType() {
    return isSetField(41243);
  }
}
