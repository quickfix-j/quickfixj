/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionExerciseBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40936, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionExerciseBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionExerciseBusinessCenters get(quickfix.field.NoLegProvisionOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionExerciseBusinessCenters getNoLegProvisionOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionExerciseBusinessCenters() {
    return isSetField(40936);
  }

public static class NoLegProvisionOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40477, 0};

  public NoLegProvisionOptionExerciseBusinessCenters() {
    super(40936, 40477, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessCenter get(quickfix.field.LegProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessCenter getLegProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseBusinessCenter() {
    return isSetField(40477);
  }
}

  public void set(quickfix.field.LegProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessCenter get(quickfix.field.LegProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessCenter getLegProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseBusinessCenter() {
    return isSetField(40477);
  }
}
