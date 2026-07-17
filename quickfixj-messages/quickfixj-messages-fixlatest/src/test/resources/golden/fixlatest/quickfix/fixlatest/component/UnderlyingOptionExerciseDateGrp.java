/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41841, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseDates get(quickfix.field.NoUnderlyingOptionExerciseDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseDates getNoUnderlyingOptionExerciseDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseDates() {
    return isSetField(41841);
  }

public static class NoUnderlyingOptionExerciseDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41842, 41843, 0};

  public NoUnderlyingOptionExerciseDates() {
    super(41841, 41842, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseDate get(quickfix.field.UnderlyingOptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseDate getUnderlyingOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseDate());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseDate() {
    return isSetField(41842);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseDateType get(quickfix.field.UnderlyingOptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseDateType getUnderlyingOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseDateType() {
    return isSetField(41843);
  }
}

  public void set(quickfix.field.UnderlyingOptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseDate get(quickfix.field.UnderlyingOptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseDate getUnderlyingOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseDate());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseDate() {
    return isSetField(41842);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseDateType get(quickfix.field.UnderlyingOptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseDateType getUnderlyingOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseDateType() {
    return isSetField(41843);
  }
}
