/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamTerminationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40943, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamTerminationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamTerminationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamTerminationDateBusinessCenters get(quickfix.field.NoLegStreamTerminationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamTerminationDateBusinessCenters getNoLegStreamTerminationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamTerminationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamTerminationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamTerminationDateBusinessCenters() {
    return isSetField(40943);
  }

public static class NoLegStreamTerminationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40259, 0};

  public NoLegStreamTerminationDateBusinessCenters() {
    super(40943, 40259, ORDER);
  }

  public void set(quickfix.field.LegStreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateBusinessCenter get(quickfix.field.LegStreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateBusinessCenter getLegStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateBusinessCenter() {
    return isSetField(40259);
  }
}

  public void set(quickfix.field.LegStreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateBusinessCenter get(quickfix.field.LegStreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateBusinessCenter getLegStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateBusinessCenter() {
    return isSetField(40259);
  }
}
