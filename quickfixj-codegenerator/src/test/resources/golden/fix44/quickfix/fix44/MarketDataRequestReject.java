
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequestReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Y";
	

	public MarketDataRequestReject() {
		
		super(new int[] {262, 281, 816, 58, 354, 355,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequestReject(quickfix.field.MDReqID mDReqID) {
		this();
		setField(mDReqID);
	}
	
	public void set(quickfix.field.MDReqID value) {
		setField(value);
	}

	public quickfix.field.MDReqID get(quickfix.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.field.MDReqID());
	}

	public boolean isSet(quickfix.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.field.MDReqRejReason value) {
		setField(value);
	}

	public quickfix.field.MDReqRejReason get(quickfix.field.MDReqRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDReqRejReason getMDReqRejReason() throws FieldNotFound {
		return get(new quickfix.field.MDReqRejReason());
	}

	public boolean isSet(quickfix.field.MDReqRejReason field) {
		return isSetField(field);
	}

	public boolean isSetMDReqRejReason() {
		return isSetField(281);
	}

	public void set(quickfix.field.NoAltMDSource value) {
		setField(value);
	}

	public quickfix.field.NoAltMDSource get(quickfix.field.NoAltMDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoAltMDSource getNoAltMDSource() throws FieldNotFound {
		return get(new quickfix.field.NoAltMDSource());
	}

	public boolean isSet(quickfix.field.NoAltMDSource field) {
		return isSetField(field);
	}

	public boolean isSetNoAltMDSource() {
		return isSetField(816);
	}

	public static class NoAltMDSource extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {817, 0};

		public NoAltMDSource() {
			super(816, 817, ORDER);
		}
		
	public void set(quickfix.field.AltMDSourceID value) {
		setField(value);
	}

	public quickfix.field.AltMDSourceID get(quickfix.field.AltMDSourceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
		return get(new quickfix.field.AltMDSourceID());
	}

	public boolean isSet(quickfix.field.AltMDSourceID field) {
		return isSetField(field);
	}

	public boolean isSetAltMDSourceID() {
		return isSetField(817);
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
