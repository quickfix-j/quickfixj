
package quickfix.fix44.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdRegTimestamps extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 768,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdRegTimestamps() {
		
		super(new int[] {768,  0 });
		
	}
	
	public void set(quickfix.field.NoTrdRegTimestamps value) {
		setField(value);
	}

	public quickfix.field.NoTrdRegTimestamps get(quickfix.field.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.field.NoTrdRegTimestamps());
	}

	public boolean isSet(quickfix.field.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(quickfix.field.TrdRegTimestamp value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestamp get(quickfix.field.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestamp());
	}

	public boolean isSet(quickfix.field.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(quickfix.field.TrdRegTimestampType value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampType get(quickfix.field.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampType());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(quickfix.field.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampOrigin get(quickfix.field.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampOrigin());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	}

}
