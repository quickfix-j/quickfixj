/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ThrottleParamsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1610, };
  protected int[] getGroupFields() { return componentGroups; }

  public ThrottleParamsGrp() {
    super();
  }

  public void set(quickfix.field.NoThrottles value) {
    setField(value);
  }

  public quickfix.field.NoThrottles get(quickfix.field.NoThrottles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoThrottles getNoThrottles() throws FieldNotFound {
    return get(new quickfix.field.NoThrottles());
  }

  public boolean isSet(quickfix.field.NoThrottles field) {
    return isSetField(field);
  }

  public boolean isSetNoThrottles() {
    return isSetField(1610);
  }

public static class NoThrottles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1611, 1612, 1613, 1614, 1615, 1618, 0};

  public NoThrottles() {
    super(1610, 1611, ORDER);
  }

  public void set(quickfix.field.ThrottleAction value) {
    setField(value);
  }

  public quickfix.field.ThrottleAction get(quickfix.field.ThrottleAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleAction getThrottleAction() throws FieldNotFound {
    return get(new quickfix.field.ThrottleAction());
  }

  public boolean isSet(quickfix.field.ThrottleAction field) {
    return isSetField(field);
  }

  public boolean isSetThrottleAction() {
    return isSetField(1611);
  }

  public void set(quickfix.field.ThrottleType value) {
    setField(value);
  }

  public quickfix.field.ThrottleType get(quickfix.field.ThrottleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleType getThrottleType() throws FieldNotFound {
    return get(new quickfix.field.ThrottleType());
  }

  public boolean isSet(quickfix.field.ThrottleType field) {
    return isSetField(field);
  }

  public boolean isSetThrottleType() {
    return isSetField(1612);
  }

  public void set(quickfix.field.ThrottleNoMsgs value) {
    setField(value);
  }

  public quickfix.field.ThrottleNoMsgs get(quickfix.field.ThrottleNoMsgs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleNoMsgs getThrottleNoMsgs() throws FieldNotFound {
    return get(new quickfix.field.ThrottleNoMsgs());
  }

  public boolean isSet(quickfix.field.ThrottleNoMsgs field) {
    return isSetField(field);
  }

  public boolean isSetThrottleNoMsgs() {
    return isSetField(1613);
  }

  public void set(quickfix.field.ThrottleTimeInterval value) {
    setField(value);
  }

  public quickfix.field.ThrottleTimeInterval get(quickfix.field.ThrottleTimeInterval value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleTimeInterval getThrottleTimeInterval() throws FieldNotFound {
    return get(new quickfix.field.ThrottleTimeInterval());
  }

  public boolean isSet(quickfix.field.ThrottleTimeInterval field) {
    return isSetField(field);
  }

  public boolean isSetThrottleTimeInterval() {
    return isSetField(1614);
  }

  public void set(quickfix.field.ThrottleTimeUnit value) {
    setField(value);
  }

  public quickfix.field.ThrottleTimeUnit get(quickfix.field.ThrottleTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleTimeUnit getThrottleTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.ThrottleTimeUnit());
  }

  public boolean isSet(quickfix.field.ThrottleTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetThrottleTimeUnit() {
    return isSetField(1615);
  }

  public void set(quickfix.fixlatest.component.ThrottleMsgTypeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ThrottleMsgTypeGrp get(quickfix.fixlatest.component.ThrottleMsgTypeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ThrottleMsgTypeGrp getThrottleMsgTypeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ThrottleMsgTypeGrp());
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
}

  public void set(quickfix.field.ThrottleAction value) {
    setField(value);
  }

  public quickfix.field.ThrottleAction get(quickfix.field.ThrottleAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleAction getThrottleAction() throws FieldNotFound {
    return get(new quickfix.field.ThrottleAction());
  }

  public boolean isSet(quickfix.field.ThrottleAction field) {
    return isSetField(field);
  }

  public boolean isSetThrottleAction() {
    return isSetField(1611);
  }

  public void set(quickfix.field.ThrottleType value) {
    setField(value);
  }

  public quickfix.field.ThrottleType get(quickfix.field.ThrottleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleType getThrottleType() throws FieldNotFound {
    return get(new quickfix.field.ThrottleType());
  }

  public boolean isSet(quickfix.field.ThrottleType field) {
    return isSetField(field);
  }

  public boolean isSetThrottleType() {
    return isSetField(1612);
  }

  public void set(quickfix.field.ThrottleNoMsgs value) {
    setField(value);
  }

  public quickfix.field.ThrottleNoMsgs get(quickfix.field.ThrottleNoMsgs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleNoMsgs getThrottleNoMsgs() throws FieldNotFound {
    return get(new quickfix.field.ThrottleNoMsgs());
  }

  public boolean isSet(quickfix.field.ThrottleNoMsgs field) {
    return isSetField(field);
  }

  public boolean isSetThrottleNoMsgs() {
    return isSetField(1613);
  }

  public void set(quickfix.field.ThrottleTimeInterval value) {
    setField(value);
  }

  public quickfix.field.ThrottleTimeInterval get(quickfix.field.ThrottleTimeInterval value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleTimeInterval getThrottleTimeInterval() throws FieldNotFound {
    return get(new quickfix.field.ThrottleTimeInterval());
  }

  public boolean isSet(quickfix.field.ThrottleTimeInterval field) {
    return isSetField(field);
  }

  public boolean isSetThrottleTimeInterval() {
    return isSetField(1614);
  }

  public void set(quickfix.field.ThrottleTimeUnit value) {
    setField(value);
  }

  public quickfix.field.ThrottleTimeUnit get(quickfix.field.ThrottleTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleTimeUnit getThrottleTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.ThrottleTimeUnit());
  }

  public boolean isSet(quickfix.field.ThrottleTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetThrottleTimeUnit() {
    return isSetField(1615);
  }

  public void set(quickfix.fixlatest.component.ThrottleMsgTypeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ThrottleMsgTypeGrp get(quickfix.fixlatest.component.ThrottleMsgTypeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ThrottleMsgTypeGrp getThrottleMsgTypeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ThrottleMsgTypeGrp());
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
}
