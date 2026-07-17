/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class UserRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BE";

  public UserRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public UserRequest (quickfix.field.UserRequestID userRequestID, quickfix.field.UserRequestType userRequestType, quickfix.field.Username username) {
    this();
    setField(userRequestID);
    setField(userRequestType);
    setField(username);
  }

  public void set(quickfix.field.UserRequestID value) {
    setField(value);
  }

  public quickfix.field.UserRequestID get(quickfix.field.UserRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UserRequestID getUserRequestID() throws FieldNotFound {
    return get(new quickfix.field.UserRequestID());
  }

  public boolean isSet(quickfix.field.UserRequestID field) {
    return isSetField(field);
  }

  public boolean isSetUserRequestID() {
    return isSetField(923);
  }

  public void set(quickfix.field.UserRequestType value) {
    setField(value);
  }

  public quickfix.field.UserRequestType get(quickfix.field.UserRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UserRequestType getUserRequestType() throws FieldNotFound {
    return get(new quickfix.field.UserRequestType());
  }

  public boolean isSet(quickfix.field.UserRequestType field) {
    return isSetField(field);
  }

  public boolean isSetUserRequestType() {
    return isSetField(924);
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

  public void set(quickfix.field.Password value) {
    setField(value);
  }

  public quickfix.field.Password get(quickfix.field.Password value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Password getPassword() throws FieldNotFound {
    return get(new quickfix.field.Password());
  }

  public boolean isSet(quickfix.field.Password field) {
    return isSetField(field);
  }

  public boolean isSetPassword() {
    return isSetField(554);
  }

  public void set(quickfix.field.NewPassword value) {
    setField(value);
  }

  public quickfix.field.NewPassword get(quickfix.field.NewPassword value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NewPassword getNewPassword() throws FieldNotFound {
    return get(new quickfix.field.NewPassword());
  }

  public boolean isSet(quickfix.field.NewPassword field) {
    return isSetField(field);
  }

  public boolean isSetNewPassword() {
    return isSetField(925);
  }

  public void set(quickfix.field.EncryptedPasswordMethod value) {
    setField(value);
  }

  public quickfix.field.EncryptedPasswordMethod get(quickfix.field.EncryptedPasswordMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncryptedPasswordMethod getEncryptedPasswordMethod() throws FieldNotFound {
    return get(new quickfix.field.EncryptedPasswordMethod());
  }

  public boolean isSet(quickfix.field.EncryptedPasswordMethod field) {
    return isSetField(field);
  }

  public boolean isSetEncryptedPasswordMethod() {
    return isSetField(1400);
  }

  public void set(quickfix.field.EncryptedPasswordLen value) {
    setField(value);
  }

  public quickfix.field.EncryptedPasswordLen get(quickfix.field.EncryptedPasswordLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncryptedPasswordLen getEncryptedPasswordLen() throws FieldNotFound {
    return get(new quickfix.field.EncryptedPasswordLen());
  }

  public boolean isSet(quickfix.field.EncryptedPasswordLen field) {
    return isSetField(field);
  }

  public boolean isSetEncryptedPasswordLen() {
    return isSetField(1401);
  }

  public void set(quickfix.field.EncryptedPassword value) {
    setField(value);
  }

  public quickfix.field.EncryptedPassword get(quickfix.field.EncryptedPassword value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncryptedPassword getEncryptedPassword() throws FieldNotFound {
    return get(new quickfix.field.EncryptedPassword());
  }

  public boolean isSet(quickfix.field.EncryptedPassword field) {
    return isSetField(field);
  }

  public boolean isSetEncryptedPassword() {
    return isSetField(1402);
  }

  public void set(quickfix.field.EncryptedNewPasswordLen value) {
    setField(value);
  }

  public quickfix.field.EncryptedNewPasswordLen get(quickfix.field.EncryptedNewPasswordLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncryptedNewPasswordLen getEncryptedNewPasswordLen() throws FieldNotFound {
    return get(new quickfix.field.EncryptedNewPasswordLen());
  }

  public boolean isSet(quickfix.field.EncryptedNewPasswordLen field) {
    return isSetField(field);
  }

  public boolean isSetEncryptedNewPasswordLen() {
    return isSetField(1403);
  }

  public void set(quickfix.field.EncryptedNewPassword value) {
    setField(value);
  }

  public quickfix.field.EncryptedNewPassword get(quickfix.field.EncryptedNewPassword value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncryptedNewPassword getEncryptedNewPassword() throws FieldNotFound {
    return get(new quickfix.field.EncryptedNewPassword());
  }

  public boolean isSet(quickfix.field.EncryptedNewPassword field) {
    return isSetField(field);
  }

  public boolean isSetEncryptedNewPassword() {
    return isSetField(1404);
  }

  public void set(quickfix.field.RawDataLength value) {
    setField(value);
  }

  public quickfix.field.RawDataLength get(quickfix.field.RawDataLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RawDataLength getRawDataLength() throws FieldNotFound {
    return get(new quickfix.field.RawDataLength());
  }

  public boolean isSet(quickfix.field.RawDataLength field) {
    return isSetField(field);
  }

  public boolean isSetRawDataLength() {
    return isSetField(95);
  }

  public void set(quickfix.field.RawData value) {
    setField(value);
  }

  public quickfix.field.RawData get(quickfix.field.RawData value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RawData getRawData() throws FieldNotFound {
    return get(new quickfix.field.RawData());
  }

  public boolean isSet(quickfix.field.RawData field) {
    return isSetField(field);
  }

  public boolean isSetRawData() {
    return isSetField(96);
  }
}
