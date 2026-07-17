/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41512, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegOptionExerciseDates value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseDates get(quickfix.field.NoLegOptionExerciseDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseDates getNoLegOptionExerciseDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseDates());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseDates() {
    return isSetField(41512);
  }

public static class NoLegOptionExerciseDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41513, 41514, 0};

  public NoLegOptionExerciseDates() {
    super(41512, 41513, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseDate get(quickfix.field.LegOptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseDate getLegOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseDate());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseDate() {
    return isSetField(41513);
  }

  public void set(quickfix.field.LegOptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseDateType get(quickfix.field.LegOptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseDateType getLegOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseDateType() {
    return isSetField(41514);
  }
}

  public void set(quickfix.field.LegOptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseDate get(quickfix.field.LegOptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseDate getLegOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseDate());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseDate() {
    return isSetField(41513);
  }

  public void set(quickfix.field.LegOptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseDateType get(quickfix.field.LegOptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseDateType getLegOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseDateType() {
    return isSetField(41514);
  }
}
