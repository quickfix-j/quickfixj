
package quickfix.fix42;

import quickfix.FieldNotFound;


public class TradingSessionStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "g";
	

	public TradingSessionStatusRequest() {
		
		super(new int[] {335, 336, 338, 339, 263,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatusRequest(quickfix.field.TradSesReqID tradSesReqID, quickfix.field.SubscriptionRequestType subscriptionRequestType) {
		this();
		setField(tradSesReqID);
		setField(subscriptionRequestType);
	}
	
	public void set(quickfix.field.TradSesReqID value) {
		setField(value);
	}

	public quickfix.field.TradSesReqID get(quickfix.field.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new quickfix.field.TradSesReqID());
	}

	public boolean isSet(quickfix.field.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
	}

	public void set(quickfix.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionID());
	}

	public boolean isSet(quickfix.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.field.TradSesMethod value) {
		setField(value);
	}

	public quickfix.field.TradSesMethod get(quickfix.field.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new quickfix.field.TradSesMethod());
	}

	public boolean isSet(quickfix.field.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(quickfix.field.TradSesMode value) {
		setField(value);
	}

	public quickfix.field.TradSesMode get(quickfix.field.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new quickfix.field.TradSesMode());
	}

	public boolean isSet(quickfix.field.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
	}

	public void set(quickfix.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.field.SubscriptionRequestType get(quickfix.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

}
