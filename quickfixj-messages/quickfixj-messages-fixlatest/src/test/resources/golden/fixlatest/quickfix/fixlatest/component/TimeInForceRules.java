/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TimeInForceRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1239, };
  protected int[] getGroupFields() { return componentGroups; }

  public TimeInForceRules() {
    super();
  }

  public void set(quickfix.field.NoTimeInForceRules value) {
    setField(value);
  }

  public quickfix.field.NoTimeInForceRules get(quickfix.field.NoTimeInForceRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTimeInForceRules getNoTimeInForceRules() throws FieldNotFound {
    return get(new quickfix.field.NoTimeInForceRules());
  }

  public boolean isSet(quickfix.field.NoTimeInForceRules field) {
    return isSetField(field);
  }

  public boolean isSetNoTimeInForceRules() {
    return isSetField(1239);
  }

public static class NoTimeInForceRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {59, 0};

  public NoTimeInForceRules() {
    super(1239, 59, ORDER);
  }

  public void set(quickfix.field.TimeInForce value) {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.TimeInForce());
  }

  public boolean isSet(quickfix.field.TimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetTimeInForce() {
    return isSetField(59);
  }
}

  public void set(quickfix.field.TimeInForce value) {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.TimeInForce());
  }

  public boolean isSet(quickfix.field.TimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetTimeInForce() {
    return isSetField(59);
  }
}
