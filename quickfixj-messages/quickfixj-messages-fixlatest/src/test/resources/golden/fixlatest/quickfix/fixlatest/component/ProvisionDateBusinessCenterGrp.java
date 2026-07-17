/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40957, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionDateBusinessCenters get(quickfix.field.NoProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionDateBusinessCenters getNoProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionDateBusinessCenters() {
    return isSetField(40957);
  }

public static class NoProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40094, 0};

  public NoProvisionDateBusinessCenters() {
    super(40957, 40094, ORDER);
  }

  public void set(quickfix.field.ProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessCenter get(quickfix.field.ProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessCenter getProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessCenter() {
    return isSetField(40094);
  }
}

  public void set(quickfix.field.ProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessCenter get(quickfix.field.ProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessCenter getProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessCenter() {
    return isSetField(40094);
  }
}
