
package quickfix.fix42;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		
		super(new int[] {112,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.field.TestReqID value) {
		setField(value);
	}

	public quickfix.field.TestReqID get(quickfix.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.field.TestReqID());
	}

	public boolean isSet(quickfix.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
