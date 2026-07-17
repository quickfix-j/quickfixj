/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class UserNotification extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CB";

  public UserNotification() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public UserNotification (quickfix.field.UserStatus userStatus) {
    this();
    setField(userStatus);
  }

  public void set(quickfix.fixlatest.component.UsernameGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UsernameGrp get(quickfix.fixlatest.component.UsernameGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UsernameGrp getUsernameGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UsernameGrp());
  }

  public void set(quickfix.field.NoUsernames value) {
    setField(value);
  }

  public quickfix.field.NoUsernames get(quickfix.field.NoUsernames value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUsernames getNoUsernames() throws FieldNotFound {
    return get(new quickfix.field.NoUsernames());
  }

  public boolean isSet(quickfix.field.NoUsernames field) {
    return isSetField(field);
  }

  public boolean isSetNoUsernames() {
    return isSetField(809);
  }

public static class NoUsernames extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {553, 0};

  public NoUsernames() {
    super(809, 553, ORDER);
  }

  public void set(quickfix.field.Username value) {
    setField(value);
  }

  public quickfix.field.Username get(quickfix.field.Username value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Username getUsername() throws FieldNotFound {
    return get(new quickfix.field.Username());
  }

  public boolean isSet(quickfix.field.Username field) {
    return isSetField(field);
  }

  public boolean isSetUsername() {
    return isSetField(553);
  }
}

  public void set(quickfix.field.UserStatus value) {
    setField(value);
  }

  public quickfix.field.UserStatus get(quickfix.field.UserStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UserStatus getUserStatus() throws FieldNotFound {
    return get(new quickfix.field.UserStatus());
  }

  public boolean isSet(quickfix.field.UserStatus field) {
    return isSetField(field);
  }

  public boolean isSetUserStatus() {
    return isSetField(926);
  }

  public void set(quickfix.fixlatest.component.ThrottleParamsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ThrottleParamsGrp get(quickfix.fixlatest.component.ThrottleParamsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ThrottleParamsGrp getThrottleParamsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ThrottleParamsGrp());
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

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }
}
