/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseExpirationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41140, };
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseExpirationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoOptionExerciseExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseExpirationDateBusinessCenters get(quickfix.field.NoOptionExerciseExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseExpirationDateBusinessCenters getNoOptionExerciseExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseExpirationDateBusinessCenters() {
    return isSetField(41140);
  }

public static class NoOptionExerciseExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41141, 0};

  public NoOptionExerciseExpirationDateBusinessCenters() {
    super(41140, 41141, ORDER);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessCenter get(quickfix.field.OptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessCenter getOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41141);
  }
}

  public void set(quickfix.field.OptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessCenter get(quickfix.field.OptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessCenter getOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41141);
  }
}
