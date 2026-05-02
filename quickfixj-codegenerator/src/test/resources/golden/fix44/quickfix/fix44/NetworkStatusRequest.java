
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NetworkStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BC";
	

	public NetworkStatusRequest() {
		
		super(new int[] {935, 933, 936,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public NetworkStatusRequest(quickfix.field.NetworkRequestType networkRequestType, quickfix.field.NetworkRequestID networkRequestID) {
		this();
		setField(networkRequestType);
		setField(networkRequestID);
	}
	
	public void set(quickfix.field.NetworkRequestType value) {
		setField(value);
	}

	public quickfix.field.NetworkRequestType get(quickfix.field.NetworkRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetworkRequestType getNetworkRequestType() throws FieldNotFound {
		return get(new quickfix.field.NetworkRequestType());
	}

	public boolean isSet(quickfix.field.NetworkRequestType field) {
		return isSetField(field);
	}

	public boolean isSetNetworkRequestType() {
		return isSetField(935);
	}

	public void set(quickfix.field.NetworkRequestID value) {
		setField(value);
	}

	public quickfix.field.NetworkRequestID get(quickfix.field.NetworkRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetworkRequestID getNetworkRequestID() throws FieldNotFound {
		return get(new quickfix.field.NetworkRequestID());
	}

	public boolean isSet(quickfix.field.NetworkRequestID field) {
		return isSetField(field);
	}

	public boolean isSetNetworkRequestID() {
		return isSetField(933);
	}

	public void set(quickfix.field.NoCompIDs value) {
		setField(value);
	}

	public quickfix.field.NoCompIDs get(quickfix.field.NoCompIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoCompIDs getNoCompIDs() throws FieldNotFound {
		return get(new quickfix.field.NoCompIDs());
	}

	public boolean isSet(quickfix.field.NoCompIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoCompIDs() {
		return isSetField(936);
	}

	public static class NoCompIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {930, 931, 283, 284, 0};

		public NoCompIDs() {
			super(936, 930, ORDER);
		}
		
	public void set(quickfix.field.RefCompID value) {
		setField(value);
	}

	public quickfix.field.RefCompID get(quickfix.field.RefCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefCompID getRefCompID() throws FieldNotFound {
		return get(new quickfix.field.RefCompID());
	}

	public boolean isSet(quickfix.field.RefCompID field) {
		return isSetField(field);
	}

	public boolean isSetRefCompID() {
		return isSetField(930);
	}

	public void set(quickfix.field.RefSubID value) {
		setField(value);
	}

	public quickfix.field.RefSubID get(quickfix.field.RefSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefSubID getRefSubID() throws FieldNotFound {
		return get(new quickfix.field.RefSubID());
	}

	public boolean isSet(quickfix.field.RefSubID field) {
		return isSetField(field);
	}

	public boolean isSetRefSubID() {
		return isSetField(931);
	}

	public void set(quickfix.field.LocationID value) {
		setField(value);
	}

	public quickfix.field.LocationID get(quickfix.field.LocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocationID getLocationID() throws FieldNotFound {
		return get(new quickfix.field.LocationID());
	}

	public boolean isSet(quickfix.field.LocationID field) {
		return isSetField(field);
	}

	public boolean isSetLocationID() {
		return isSetField(283);
	}

	public void set(quickfix.field.DeskID value) {
		setField(value);
	}

	public quickfix.field.DeskID get(quickfix.field.DeskID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskID getDeskID() throws FieldNotFound {
		return get(new quickfix.field.DeskID());
	}

	public boolean isSet(quickfix.field.DeskID field) {
		return isSetField(field);
	}

	public boolean isSetDeskID() {
		return isSetField(284);
	}

	}

}
