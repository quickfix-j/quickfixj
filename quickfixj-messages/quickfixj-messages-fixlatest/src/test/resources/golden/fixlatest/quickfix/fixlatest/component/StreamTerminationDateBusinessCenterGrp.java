/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamTerminationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40961, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamTerminationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamTerminationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamTerminationDateBusinessCenters get(quickfix.field.NoStreamTerminationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamTerminationDateBusinessCenters getNoStreamTerminationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamTerminationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamTerminationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamTerminationDateBusinessCenters() {
    return isSetField(40961);
  }

public static class NoStreamTerminationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40067, 0};

  public NoStreamTerminationDateBusinessCenters() {
    super(40961, 40067, ORDER);
  }

  public void set(quickfix.field.StreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateBusinessCenter get(quickfix.field.StreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateBusinessCenter getStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateBusinessCenter() {
    return isSetField(40067);
  }
}

  public void set(quickfix.field.StreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateBusinessCenter get(quickfix.field.StreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateBusinessCenter getStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateBusinessCenter() {
    return isSetField(40067);
  }
}
