/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseExpirationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41515, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseExpirationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters get(quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters getNoLegOptionExerciseExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseExpirationDateBusinessCenters() {
    return isSetField(41515);
  }

public static class NoLegOptionExerciseExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41516, 0};

  public NoLegOptionExerciseExpirationDateBusinessCenters() {
    super(41515, 41516, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessCenter get(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessCenter getLegOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41516);
  }
}

  public void set(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessCenter get(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessCenter getLegOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41516);
  }
}
