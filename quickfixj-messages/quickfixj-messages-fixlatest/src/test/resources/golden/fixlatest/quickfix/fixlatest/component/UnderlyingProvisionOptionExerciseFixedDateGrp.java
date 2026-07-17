/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionExerciseFixedDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42112, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionExerciseFixedDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates get(quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates getNoUnderlyingProvisionOptionExerciseFixedDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionExerciseFixedDates() {
    return isSetField(42112);
  }

public static class NoUnderlyingProvisionOptionExerciseFixedDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42113, 42114, 0};

  public NoUnderlyingProvisionOptionExerciseFixedDates() {
    super(42112, 42113, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDate get(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDate getUnderlyingProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFixedDate() {
    return isSetField(42113);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType get(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType getUnderlyingProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFixedDateType() {
    return isSetField(42114);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDate get(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDate getUnderlyingProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFixedDate() {
    return isSetField(42113);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType get(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType getUnderlyingProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFixedDateType() {
    return isSetField(42114);
  }
}
