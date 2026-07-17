/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41116, };
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseBusinessCenters get(quickfix.field.NoOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseBusinessCenters getNoOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseBusinessCenters() {
    return isSetField(41116);
  }

public static class NoOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41117, 0};

  public NoOptionExerciseBusinessCenters() {
    super(41116, 41117, ORDER);
  }

  public void set(quickfix.field.OptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseBusinessCenter get(quickfix.field.OptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseBusinessCenter getOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseBusinessCenter() {
    return isSetField(41117);
  }
}

  public void set(quickfix.field.OptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseBusinessCenter get(quickfix.field.OptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseBusinessCenter getOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseBusinessCenter() {
    return isSetField(41117);
  }
}
