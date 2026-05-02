
package quickfix.fix44;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		
		super(new int[] {45, 371, 372, 373, 58, 354, 355,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Reject(quickfix.field.RefSeqNum refSeqNum) {
		this();
		setField(refSeqNum);
	}
	
	public void set(quickfix.field.RefSeqNum value) {
		setField(value);
	}

	public quickfix.field.RefSeqNum get(quickfix.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new quickfix.field.RefSeqNum());
	}

	public boolean isSet(quickfix.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(quickfix.field.RefTagID value) {
		setField(value);
	}

	public quickfix.field.RefTagID get(quickfix.field.RefTagID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefTagID getRefTagID() throws FieldNotFound {
		return get(new quickfix.field.RefTagID());
	}

	public boolean isSet(quickfix.field.RefTagID field) {
		return isSetField(field);
	}

	public boolean isSetRefTagID() {
		return isSetField(371);
	}

	public void set(quickfix.field.RefMsgType value) {
		setField(value);
	}

	public quickfix.field.RefMsgType get(quickfix.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new quickfix.field.RefMsgType());
	}

	public boolean isSet(quickfix.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(quickfix.field.SessionRejectReason value) {
		setField(value);
	}

	public quickfix.field.SessionRejectReason get(quickfix.field.SessionRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SessionRejectReason getSessionRejectReason() throws FieldNotFound {
		return get(new quickfix.field.SessionRejectReason());
	}

	public boolean isSet(quickfix.field.SessionRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetSessionRejectReason() {
		return isSetField(373);
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
