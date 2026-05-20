
package quickfix.fix44.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NestedParties2 extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 756,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public NestedParties2() {
		
		super(new int[] {756,  0 });
		
	}
	
	public void set(quickfix.field.NoNested2PartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartyIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {757, 758, 759, 806, 0};

		public NoNested2PartyIDs() {
			super(756, 757, ORDER);
		}
		
	public void set(quickfix.field.Nested2PartyID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyID());
	}

	public boolean isSet(quickfix.field.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(quickfix.field.Nested2PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyIDSource());
	}

	public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(quickfix.field.Nested2PartyRole value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyRole());
	}

	public boolean isSet(quickfix.field.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(quickfix.field.NoNested2PartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {760, 807, 0};

		public NoNested2PartySubIDs() {
			super(806, 760, ORDER);
		}
		
	public void set(quickfix.field.Nested2PartySubID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubID());
	}

	public boolean isSet(quickfix.field.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(quickfix.field.Nested2PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubIDType());
	}

	public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

	}

}
