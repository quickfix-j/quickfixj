
package quickfix.fix44;

import quickfix.FieldNotFound;


public class UserRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BE";
	

	public UserRequest() {
		
		super(new int[] {923, 924, 553, 554, 925, 95, 96,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public UserRequest(quickfix.field.UserRequestID userRequestID, quickfix.field.UserRequestType userRequestType, quickfix.field.Username username) {
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
