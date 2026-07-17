/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionExerciseFixedDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40142, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionExerciseFixedDateGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionOptionExerciseFixedDates value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionExerciseFixedDates get(quickfix.field.NoProvisionOptionExerciseFixedDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionExerciseFixedDates getNoProvisionOptionExerciseFixedDates() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionExerciseFixedDates());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionExerciseFixedDates field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionExerciseFixedDates() {
    return isSetField(40142);
  }

public static class NoProvisionOptionExerciseFixedDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40143, 40144, 0};

  public NoProvisionOptionExerciseFixedDates() {
    super(40142, 40143, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFixedDate get(quickfix.field.ProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFixedDate getProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFixedDate() {
    return isSetField(40143);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFixedDateType get(quickfix.field.ProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFixedDateType getProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFixedDateType() {
    return isSetField(40144);
  }
}

  public void set(quickfix.field.ProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFixedDate get(quickfix.field.ProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFixedDate getProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFixedDate() {
    return isSetField(40143);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFixedDateType get(quickfix.field.ProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFixedDateType getProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFixedDateType() {
    return isSetField(40144);
  }
}
