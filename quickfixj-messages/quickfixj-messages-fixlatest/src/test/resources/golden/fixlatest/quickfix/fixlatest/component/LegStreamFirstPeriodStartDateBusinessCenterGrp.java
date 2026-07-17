/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamFirstPeriodStartDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40941, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamFirstPeriodStartDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters get(quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters getNoLegStreamFirstPeriodStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamFirstPeriodStartDateBusinessCenters() {
    return isSetField(40941);
  }

public static class NoLegStreamFirstPeriodStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40269, 0};

  public NoLegStreamFirstPeriodStartDateBusinessCenters() {
    super(40941, 40269, ORDER);
  }

  public void set(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter get(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter getLegStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40269);
  }
}

  public void set(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter get(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter getLegStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40269);
  }
}
