/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionExerciseFixedDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40495, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionExerciseFixedDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionOptionExerciseFixedDates value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionExerciseFixedDates get(quickfix.field.NoLegProvisionOptionExerciseFixedDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionExerciseFixedDates getNoLegProvisionOptionExerciseFixedDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionExerciseFixedDates());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionExerciseFixedDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionExerciseFixedDates() {
    return isSetField(40495);
  }

public static class NoLegProvisionOptionExerciseFixedDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40496, 40497, 0};

  public NoLegProvisionOptionExerciseFixedDates() {
    super(40495, 40496, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDate get(quickfix.field.LegProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDate getLegProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFixedDate() {
    return isSetField(40496);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDateType get(quickfix.field.LegProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDateType getLegProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFixedDateType() {
    return isSetField(40497);
  }
}

  public void set(quickfix.field.LegProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDate get(quickfix.field.LegProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDate getLegProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFixedDate() {
    return isSetField(40496);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDateType get(quickfix.field.LegProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDateType getLegProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFixedDateType() {
    return isSetField(40497);
  }
}
