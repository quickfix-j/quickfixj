/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41387, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventDateBusinessCenters get(quickfix.field.NoLegComplexEventDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventDateBusinessCenters getNoLegComplexEventDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventDateBusinessCenters() {
    return isSetField(41387);
  }

public static class NoLegComplexEventDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41388, 0};

  public NoLegComplexEventDateBusinessCenters() {
    super(41387, 41388, ORDER);
  }

  public void set(quickfix.field.LegComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateBusinessCenter get(quickfix.field.LegComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateBusinessCenter getLegComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateBusinessCenter() {
    return isSetField(41388);
  }
}

  public void set(quickfix.field.LegComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateBusinessCenter get(quickfix.field.LegComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateBusinessCenter getLegComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateBusinessCenter() {
    return isSetField(41388);
  }
}
