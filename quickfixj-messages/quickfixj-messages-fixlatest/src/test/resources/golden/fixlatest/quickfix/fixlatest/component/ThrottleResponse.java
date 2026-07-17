/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ThrottleResponse extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1685, 1609, 1686, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ThrottleResponse() {
    super();
  }

  public void set(quickfix.field.ThrottleInst value) {
    setField(value);
  }

  public quickfix.field.ThrottleInst get(quickfix.field.ThrottleInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleInst getThrottleInst() throws FieldNotFound {
    return get(new quickfix.field.ThrottleInst());
  }

  public boolean isSet(quickfix.field.ThrottleInst field) {
    return isSetField(field);
  }

  public boolean isSetThrottleInst() {
    return isSetField(1685);
  }

  public void set(quickfix.field.ThrottleStatus value) {
    setField(value);
  }

  public quickfix.field.ThrottleStatus get(quickfix.field.ThrottleStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleStatus getThrottleStatus() throws FieldNotFound {
    return get(new quickfix.field.ThrottleStatus());
  }

  public boolean isSet(quickfix.field.ThrottleStatus field) {
    return isSetField(field);
  }

  public boolean isSetThrottleStatus() {
    return isSetField(1609);
  }

  public void set(quickfix.field.ThrottleCountIndicator value) {
    setField(value);
  }

  public quickfix.field.ThrottleCountIndicator get(quickfix.field.ThrottleCountIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleCountIndicator getThrottleCountIndicator() throws FieldNotFound {
    return get(new quickfix.field.ThrottleCountIndicator());
  }

  public boolean isSet(quickfix.field.ThrottleCountIndicator field) {
    return isSetField(field);
  }

  public boolean isSetThrottleCountIndicator() {
    return isSetField(1686);
  }
}
