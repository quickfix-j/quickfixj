/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseExpirationDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41856, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseExpirationDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseExpirationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDates get(quickfix.field.NoUnderlyingOptionExerciseExpirationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDates getNoUnderlyingOptionExerciseExpirationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseExpirationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseExpirationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseExpirationDates() {
    return isSetField(41856);
  }

public static class NoUnderlyingOptionExerciseExpirationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41857, 41858, 0};

  public NoUnderlyingOptionExerciseExpirationDates() {
    super(41856, 41857, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDate get(quickfix.field.UnderlyingOptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDate getUnderlyingOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDate() {
    return isSetField(41857);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateType get(quickfix.field.UnderlyingOptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateType getUnderlyingOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateType() {
    return isSetField(41858);
  }
}

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDate get(quickfix.field.UnderlyingOptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDate getUnderlyingOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDate() {
    return isSetField(41857);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateType get(quickfix.field.UnderlyingOptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateType getUnderlyingOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateType() {
    return isSetField(41858);
  }
}
