
package quickfix.fix44.component;

import quickfix.FieldNotFound;


public class PegInstructions extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 211, 835, 836, 837, 838, 840,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public PegInstructions() {
		
		super(new int[] {211, 835, 836, 837, 838, 840,  0 });
		
	}
	
	public void set(quickfix.field.PegOffsetValue value) {
		setField(value);
	}

	public quickfix.field.PegOffsetValue get(quickfix.field.PegOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegOffsetValue getPegOffsetValue() throws FieldNotFound {
		return get(new quickfix.field.PegOffsetValue());
	}

	public boolean isSet(quickfix.field.PegOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetValue() {
		return isSetField(211);
	}

	public void set(quickfix.field.PegMoveType value) {
		setField(value);
	}

	public quickfix.field.PegMoveType get(quickfix.field.PegMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegMoveType getPegMoveType() throws FieldNotFound {
		return get(new quickfix.field.PegMoveType());
	}

	public boolean isSet(quickfix.field.PegMoveType field) {
		return isSetField(field);
	}

	public boolean isSetPegMoveType() {
		return isSetField(835);
	}

	public void set(quickfix.field.PegOffsetType value) {
		setField(value);
	}

	public quickfix.field.PegOffsetType get(quickfix.field.PegOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegOffsetType getPegOffsetType() throws FieldNotFound {
		return get(new quickfix.field.PegOffsetType());
	}

	public boolean isSet(quickfix.field.PegOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetType() {
		return isSetField(836);
	}

	public void set(quickfix.field.PegLimitType value) {
		setField(value);
	}

	public quickfix.field.PegLimitType get(quickfix.field.PegLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegLimitType getPegLimitType() throws FieldNotFound {
		return get(new quickfix.field.PegLimitType());
	}

	public boolean isSet(quickfix.field.PegLimitType field) {
		return isSetField(field);
	}

	public boolean isSetPegLimitType() {
		return isSetField(837);
	}

	public void set(quickfix.field.PegRoundDirection value) {
		setField(value);
	}

	public quickfix.field.PegRoundDirection get(quickfix.field.PegRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegRoundDirection getPegRoundDirection() throws FieldNotFound {
		return get(new quickfix.field.PegRoundDirection());
	}

	public boolean isSet(quickfix.field.PegRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetPegRoundDirection() {
		return isSetField(838);
	}

	public void set(quickfix.field.PegScope value) {
		setField(value);
	}

	public quickfix.field.PegScope get(quickfix.field.PegScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegScope getPegScope() throws FieldNotFound {
		return get(new quickfix.field.PegScope());
	}

	public boolean isSet(quickfix.field.PegScope field) {
		return isSetField(field);
	}

	public boolean isSetPegScope() {
		return isSetField(840);
	}

}
