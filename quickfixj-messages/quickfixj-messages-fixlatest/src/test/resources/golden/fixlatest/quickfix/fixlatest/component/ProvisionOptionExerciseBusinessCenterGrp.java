/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionExerciseBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40954, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionExerciseBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionExerciseBusinessCenters get(quickfix.field.NoProvisionOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionExerciseBusinessCenters getNoProvisionOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionExerciseBusinessCenters() {
    return isSetField(40954);
  }

public static class NoProvisionOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40124, 0};

  public NoProvisionOptionExerciseBusinessCenters() {
    super(40954, 40124, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseBusinessCenter get(quickfix.field.ProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseBusinessCenter getProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseBusinessCenter() {
    return isSetField(40124);
  }
}

  public void set(quickfix.field.ProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseBusinessCenter get(quickfix.field.ProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseBusinessCenter getProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseBusinessCenter() {
    return isSetField(40124);
  }
}
