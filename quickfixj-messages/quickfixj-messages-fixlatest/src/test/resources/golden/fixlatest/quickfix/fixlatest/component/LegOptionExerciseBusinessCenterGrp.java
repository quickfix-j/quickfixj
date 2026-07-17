/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41491, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseBusinessCenters get(quickfix.field.NoLegOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseBusinessCenters getNoLegOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseBusinessCenters() {
    return isSetField(41491);
  }

public static class NoLegOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41492, 0};

  public NoLegOptionExerciseBusinessCenters() {
    super(41491, 41492, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseBusinessCenter get(quickfix.field.LegOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseBusinessCenter getLegOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseBusinessCenter() {
    return isSetField(41492);
  }
}

  public void set(quickfix.field.LegOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseBusinessCenter get(quickfix.field.LegOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseBusinessCenter getLegOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseBusinessCenter() {
    return isSetField(41492);
  }
}
