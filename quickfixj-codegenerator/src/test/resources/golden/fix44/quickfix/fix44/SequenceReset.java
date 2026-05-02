
package quickfix.fix44;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		
		super(new int[] {123, 36,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(quickfix.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(quickfix.field.GapFillFlag value) {
		setField(value);
	}

	public quickfix.field.GapFillFlag get(quickfix.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new quickfix.field.GapFillFlag());
	}

	public boolean isSet(quickfix.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(quickfix.field.NewSeqNo value) {
		setField(value);
	}

	public quickfix.field.NewSeqNo get(quickfix.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new quickfix.field.NewSeqNo());
	}

	public boolean isSet(quickfix.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
