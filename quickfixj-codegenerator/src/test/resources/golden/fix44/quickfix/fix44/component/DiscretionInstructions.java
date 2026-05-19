
package quickfix.fix44.component;

import quickfix.FieldNotFound;


public class DiscretionInstructions extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 388, 389, 841, 842, 843, 844, 846,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public DiscretionInstructions() {
		
		super(new int[] {388, 389, 841, 842, 843, 844, 846,  0 });
		
	}
	
	public void set(quickfix.field.DiscretionInst value) {
		setField(value);
	}

	public quickfix.field.DiscretionInst get(quickfix.field.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new quickfix.field.DiscretionInst());
	}

	public boolean isSet(quickfix.field.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(quickfix.field.DiscretionOffsetValue value) {
		setField(value);
	}

	public quickfix.field.DiscretionOffsetValue get(quickfix.field.DiscretionOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionOffsetValue getDiscretionOffsetValue() throws FieldNotFound {
		return get(new quickfix.field.DiscretionOffsetValue());
	}

	public boolean isSet(quickfix.field.DiscretionOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetValue() {
		return isSetField(389);
	}

	public void set(quickfix.field.DiscretionMoveType value) {
		setField(value);
	}

	public quickfix.field.DiscretionMoveType get(quickfix.field.DiscretionMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionMoveType getDiscretionMoveType() throws FieldNotFound {
		return get(new quickfix.field.DiscretionMoveType());
	}

	public boolean isSet(quickfix.field.DiscretionMoveType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionMoveType() {
		return isSetField(841);
	}

	public void set(quickfix.field.DiscretionOffsetType value) {
		setField(value);
	}

	public quickfix.field.DiscretionOffsetType get(quickfix.field.DiscretionOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionOffsetType getDiscretionOffsetType() throws FieldNotFound {
		return get(new quickfix.field.DiscretionOffsetType());
	}

	public boolean isSet(quickfix.field.DiscretionOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetType() {
		return isSetField(842);
	}

	public void set(quickfix.field.DiscretionLimitType value) {
		setField(value);
	}

	public quickfix.field.DiscretionLimitType get(quickfix.field.DiscretionLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionLimitType getDiscretionLimitType() throws FieldNotFound {
		return get(new quickfix.field.DiscretionLimitType());
	}

	public boolean isSet(quickfix.field.DiscretionLimitType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionLimitType() {
		return isSetField(843);
	}

	public void set(quickfix.field.DiscretionRoundDirection value) {
		setField(value);
	}

	public quickfix.field.DiscretionRoundDirection get(quickfix.field.DiscretionRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionRoundDirection getDiscretionRoundDirection() throws FieldNotFound {
		return get(new quickfix.field.DiscretionRoundDirection());
	}

	public boolean isSet(quickfix.field.DiscretionRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionRoundDirection() {
		return isSetField(844);
	}

	public void set(quickfix.field.DiscretionScope value) {
		setField(value);
	}

	public quickfix.field.DiscretionScope get(quickfix.field.DiscretionScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionScope getDiscretionScope() throws FieldNotFound {
		return get(new quickfix.field.DiscretionScope());
	}

	public boolean isSet(quickfix.field.DiscretionScope field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionScope() {
		return isSetField(846);
	}

}
