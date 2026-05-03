
package quickfix.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		
		super(new int[] {98, 108, 95, 96, 141, 383, 384,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.field.EncryptMethod encryptMethod, quickfix.field.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(quickfix.field.EncryptMethod value) {
		setField(value);
	}

	public quickfix.field.EncryptMethod get(quickfix.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new quickfix.field.EncryptMethod());
	}

	public boolean isSet(quickfix.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(quickfix.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.field.HeartBtInt get(quickfix.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.field.HeartBtInt());
	}

	public boolean isSet(quickfix.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
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

	public void set(quickfix.field.ResetSeqNumFlag value) {
		setField(value);
	}

	public quickfix.field.ResetSeqNumFlag get(quickfix.field.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new quickfix.field.ResetSeqNumFlag());
	}

	public boolean isSet(quickfix.field.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

	public void set(quickfix.field.MaxMessageSize value) {
		setField(value);
	}

	public quickfix.field.MaxMessageSize get(quickfix.field.MaxMessageSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxMessageSize getMaxMessageSize() throws FieldNotFound {
		return get(new quickfix.field.MaxMessageSize());
	}

	public boolean isSet(quickfix.field.MaxMessageSize field) {
		return isSetField(field);
	}

	public boolean isSetMaxMessageSize() {
		return isSetField(383);
	}

	public void set(quickfix.field.NoMsgTypes value) {
		setField(value);
	}

	public quickfix.field.NoMsgTypes get(quickfix.field.NoMsgTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMsgTypes getNoMsgTypes() throws FieldNotFound {
		return get(new quickfix.field.NoMsgTypes());
	}

	public boolean isSet(quickfix.field.NoMsgTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMsgTypes() {
		return isSetField(384);
	}

	public static class NoMsgTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {372, 385, 0};

		public NoMsgTypes() {
			super(384, 372, ORDER);
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

	public void set(quickfix.field.MsgDirection value) {
		setField(value);
	}

	public quickfix.field.MsgDirection get(quickfix.field.MsgDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MsgDirection getMsgDirection() throws FieldNotFound {
		return get(new quickfix.field.MsgDirection());
	}

	public boolean isSet(quickfix.field.MsgDirection field) {
		return isSetField(field);
	}

	public boolean isSetMsgDirection() {
		return isSetField(385);
	}

	}

}
