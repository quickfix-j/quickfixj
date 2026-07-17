/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseExpirationDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41152, };
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseExpirationDateGrp() {
    super();
  }

  public void set(quickfix.field.NoOptionExerciseExpirationDates value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseExpirationDates get(quickfix.field.NoOptionExerciseExpirationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseExpirationDates getNoOptionExerciseExpirationDates() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseExpirationDates());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseExpirationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseExpirationDates() {
    return isSetField(41152);
  }

public static class NoOptionExerciseExpirationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41153, 41154, 0};

  public NoOptionExerciseExpirationDates() {
    super(41152, 41153, ORDER);
  }

  public void set(quickfix.field.OptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDate get(quickfix.field.OptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDate getOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDate() {
    return isSetField(41153);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateType get(quickfix.field.OptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateType getOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateType() {
    return isSetField(41154);
  }
}

  public void set(quickfix.field.OptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDate get(quickfix.field.OptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDate getOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDate() {
    return isSetField(41153);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateType get(quickfix.field.OptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateType getOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateType() {
    return isSetField(41154);
  }
}
