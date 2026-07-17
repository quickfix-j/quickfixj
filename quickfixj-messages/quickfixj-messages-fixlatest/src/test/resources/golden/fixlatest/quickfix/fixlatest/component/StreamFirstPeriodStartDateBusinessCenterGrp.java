/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamFirstPeriodStartDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40959, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamFirstPeriodStartDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters get(quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters getNoStreamFirstPeriodStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamFirstPeriodStartDateBusinessCenters() {
    return isSetField(40959);
  }

public static class NoStreamFirstPeriodStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40077, 0};

  public NoStreamFirstPeriodStartDateBusinessCenters() {
    super(40959, 40077, ORDER);
  }

  public void set(quickfix.field.StreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessCenter get(quickfix.field.StreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessCenter getStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40077);
  }
}

  public void set(quickfix.field.StreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessCenter get(quickfix.field.StreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessCenter getStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40077);
  }
}
