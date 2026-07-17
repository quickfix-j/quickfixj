/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseExpirationDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41527, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseExpirationDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegOptionExerciseExpirationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseExpirationDates get(quickfix.field.NoLegOptionExerciseExpirationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseExpirationDates getNoLegOptionExerciseExpirationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseExpirationDates());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseExpirationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseExpirationDates() {
    return isSetField(41527);
  }

public static class NoLegOptionExerciseExpirationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41528, 41529, 0};

  public NoLegOptionExerciseExpirationDates() {
    super(41527, 41528, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDate get(quickfix.field.LegOptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDate getLegOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDate() {
    return isSetField(41528);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateType get(quickfix.field.LegOptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateType getLegOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateType() {
    return isSetField(41529);
  }
}

  public void set(quickfix.field.LegOptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDate get(quickfix.field.LegOptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDate getLegOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDate() {
    return isSetField(41528);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateType get(quickfix.field.LegOptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateType getLegOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateType() {
    return isSetField(41529);
  }
}
