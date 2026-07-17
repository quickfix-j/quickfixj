/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ThrottleMsgTypeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1618, };
  protected int[] getGroupFields() { return componentGroups; }

  public ThrottleMsgTypeGrp() {
    super();
  }

  public void set(quickfix.field.NoThrottleMsgType value) {
    setField(value);
  }

  public quickfix.field.NoThrottleMsgType get(quickfix.field.NoThrottleMsgType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoThrottleMsgType getNoThrottleMsgType() throws FieldNotFound {
    return get(new quickfix.field.NoThrottleMsgType());
  }

  public boolean isSet(quickfix.field.NoThrottleMsgType field) {
    return isSetField(field);
  }

  public boolean isSetNoThrottleMsgType() {
    return isSetField(1618);
  }

public static class NoThrottleMsgType extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1619, 0};

  public NoThrottleMsgType() {
    super(1618, 1619, ORDER);
  }

  public void set(quickfix.field.ThrottleMsgType value) {
    setField(value);
  }

  public quickfix.field.ThrottleMsgType get(quickfix.field.ThrottleMsgType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleMsgType getThrottleMsgType() throws FieldNotFound {
    return get(new quickfix.field.ThrottleMsgType());
  }

  public boolean isSet(quickfix.field.ThrottleMsgType field) {
    return isSetField(field);
  }

  public boolean isSetThrottleMsgType() {
    return isSetField(1619);
  }
}

  public void set(quickfix.field.ThrottleMsgType value) {
    setField(value);
  }

  public quickfix.field.ThrottleMsgType get(quickfix.field.ThrottleMsgType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleMsgType getThrottleMsgType() throws FieldNotFound {
    return get(new quickfix.field.ThrottleMsgType());
  }

  public boolean isSet(quickfix.field.ThrottleMsgType field) {
    return isSetField(field);
  }

  public boolean isSetThrottleMsgType() {
    return isSetField(1619);
  }
}
