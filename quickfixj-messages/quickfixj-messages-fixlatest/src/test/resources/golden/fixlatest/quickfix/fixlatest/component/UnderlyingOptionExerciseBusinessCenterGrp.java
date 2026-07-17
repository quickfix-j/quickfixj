/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41820, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseBusinessCenters get(quickfix.field.NoUnderlyingOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseBusinessCenters getNoUnderlyingOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseBusinessCenters() {
    return isSetField(41820);
  }

public static class NoUnderlyingOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41821, 0};

  public NoUnderlyingOptionExerciseBusinessCenters() {
    super(41820, 41821, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessCenter get(quickfix.field.UnderlyingOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessCenter getUnderlyingOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseBusinessCenter() {
    return isSetField(41821);
  }
}

  public void set(quickfix.field.UnderlyingOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessCenter get(quickfix.field.UnderlyingOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessCenter getUnderlyingOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseBusinessCenter() {
    return isSetField(41821);
  }
}
