/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionExerciseBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42184, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionExerciseBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters get(quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters getNoUnderlyingProvisionOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionExerciseBusinessCenters() {
    return isSetField(42184);
  }

public static class NoUnderlyingProvisionOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42185, 0};

  public NoUnderlyingProvisionOptionExerciseBusinessCenters() {
    super(42184, 42185, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter getUnderlyingProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseBusinessCenter() {
    return isSetField(42185);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter getUnderlyingProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseBusinessCenter() {
    return isSetField(42185);
  }
}
