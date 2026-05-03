
package quickfix.fix44;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		
		super(new int[] {7, 16,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(quickfix.field.BeginSeqNo beginSeqNo, quickfix.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(quickfix.field.BeginSeqNo value) {
		setField(value);
	}

	public quickfix.field.BeginSeqNo get(quickfix.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new quickfix.field.BeginSeqNo());
	}

	public boolean isSet(quickfix.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(quickfix.field.EndSeqNo value) {
		setField(value);
	}

	public quickfix.field.EndSeqNo get(quickfix.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new quickfix.field.EndSeqNo());
	}

	public boolean isSet(quickfix.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
