/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41137, };
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseDateGrp() {
    super();
  }

  public void set(quickfix.field.NoOptionExerciseDates value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseDates get(quickfix.field.NoOptionExerciseDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseDates getNoOptionExerciseDates() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseDates());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseDates field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseDates() {
    return isSetField(41137);
  }

public static class NoOptionExerciseDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41138, 41139, 0};

  public NoOptionExerciseDates() {
    super(41137, 41138, ORDER);
  }

  public void set(quickfix.field.OptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseDate get(quickfix.field.OptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseDate getOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseDate());
  }

  public boolean isSet(quickfix.field.OptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseDate() {
    return isSetField(41138);
  }

  public void set(quickfix.field.OptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseDateType get(quickfix.field.OptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseDateType getOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.OptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseDateType() {
    return isSetField(41139);
  }
}

  public void set(quickfix.field.OptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseDate get(quickfix.field.OptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseDate getOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseDate());
  }

  public boolean isSet(quickfix.field.OptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseDate() {
    return isSetField(41138);
  }

  public void set(quickfix.field.OptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseDateType get(quickfix.field.OptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseDateType getOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.OptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseDateType() {
    return isSetField(41139);
  }
}
