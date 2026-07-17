/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseExpirationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41844, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseExpirationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters get(quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters getNoUnderlyingOptionExerciseExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseExpirationDateBusinessCenters() {
    return isSetField(41844);
  }

public static class NoUnderlyingOptionExerciseExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41845, 0};

  public NoUnderlyingOptionExerciseExpirationDateBusinessCenters() {
    super(41844, 41845, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter get(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter getUnderlyingOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41845);
  }
}

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter get(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter getUnderlyingOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41845);
  }
}
