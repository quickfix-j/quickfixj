/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40939, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters get(quickfix.field.NoLegProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters getNoLegProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionDateBusinessCenters() {
    return isSetField(40939);
  }

public static class NoLegProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40452, 0};

  public NoLegProvisionDateBusinessCenters() {
    super(40939, 40452, ORDER);
  }

  public void set(quickfix.field.LegProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessCenter get(quickfix.field.LegProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessCenter getLegProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessCenter() {
    return isSetField(40452);
  }
}

  public void set(quickfix.field.LegProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessCenter get(quickfix.field.LegProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessCenter getLegProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessCenter() {
    return isSetField(40452);
  }
}
