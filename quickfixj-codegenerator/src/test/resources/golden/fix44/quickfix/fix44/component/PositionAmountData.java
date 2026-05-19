
package quickfix.fix44.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class PositionAmountData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 753,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public PositionAmountData() {
		
		super(new int[] {753,  0 });
		
	}
	
	public void set(quickfix.field.NoPosAmt value) {
		setField(value);
	}

	public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
		return get(new quickfix.field.NoPosAmt());
	}

	public boolean isSet(quickfix.field.NoPosAmt field) {
		return isSetField(field);
	}

	public boolean isSetNoPosAmt() {
		return isSetField(753);
	}

	public static class NoPosAmt extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {707, 708, 0};

		public NoPosAmt() {
			super(753, 707, ORDER);
		}
		
	public void set(quickfix.field.PosAmtType value) {
		setField(value);
	}

	public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
		return get(new quickfix.field.PosAmtType());
	}

	public boolean isSet(quickfix.field.PosAmtType field) {
		return isSetField(field);
	}

	public boolean isSetPosAmtType() {
		return isSetField(707);
	}

	public void set(quickfix.field.PosAmt value) {
		setField(value);
	}

	public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
		return get(new quickfix.field.PosAmt());
	}

	public boolean isSet(quickfix.field.PosAmt field) {
		return isSetField(field);
	}

	public boolean isSetPosAmt() {
		return isSetField(708);
	}

	}

}
