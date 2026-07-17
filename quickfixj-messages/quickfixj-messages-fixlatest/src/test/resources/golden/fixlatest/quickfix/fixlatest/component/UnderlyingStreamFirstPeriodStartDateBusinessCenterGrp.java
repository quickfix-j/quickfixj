/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40974, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters get(quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters getNoUnderlyingStreamFirstPeriodStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamFirstPeriodStartDateBusinessCenters() {
    return isSetField(40974);
  }

public static class NoUnderlyingStreamFirstPeriodStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40560, 0};

  public NoUnderlyingStreamFirstPeriodStartDateBusinessCenters() {
    super(40974, 40560, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter get(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter getUnderlyingStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40560);
  }
}

  public void set(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter get(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter getUnderlyingStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40560);
  }
}
