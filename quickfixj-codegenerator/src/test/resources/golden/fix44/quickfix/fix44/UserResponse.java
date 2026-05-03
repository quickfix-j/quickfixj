
package quickfix.fix44;

import quickfix.FieldNotFound;


public class UserResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BF";
	

	public UserResponse() {
		
		super(new int[] {923, 553, 926, 927,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public UserResponse(quickfix.field.UserRequestID userRequestID, quickfix.field.Username username) {
		this();
		setField(userRequestID);
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

	public void set(quickfix.field.UserStatusText value) {
		setField(value);
	}

	public quickfix.field.UserStatusText get(quickfix.field.UserStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UserStatusText getUserStatusText() throws FieldNotFound {
		return get(new quickfix.field.UserStatusText());
	}

	public boolean isSet(quickfix.field.UserStatusText field) {
		return isSetField(field);
	}

	public boolean isSetUserStatusText() {
		return isSetField(927);
	}

}
