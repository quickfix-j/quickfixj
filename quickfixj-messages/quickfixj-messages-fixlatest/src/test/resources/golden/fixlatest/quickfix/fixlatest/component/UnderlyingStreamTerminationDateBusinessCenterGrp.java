/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamTerminationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40976, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamTerminationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters get(quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters getNoUnderlyingStreamTerminationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamTerminationDateBusinessCenters() {
    return isSetField(40976);
  }

public static class NoUnderlyingStreamTerminationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40550, 0};

  public NoUnderlyingStreamTerminationDateBusinessCenters() {
    super(40976, 40550, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessCenter get(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessCenter getUnderlyingStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateBusinessCenter() {
    return isSetField(40550);
  }
}

  public void set(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessCenter get(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessCenter getUnderlyingStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateBusinessCenter() {
    return isSetField(40550);
  }
}
