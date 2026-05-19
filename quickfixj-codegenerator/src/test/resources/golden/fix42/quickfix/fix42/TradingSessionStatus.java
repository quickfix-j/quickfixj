
package quickfix.fix42;

import quickfix.FieldNotFound;


public class TradingSessionStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "h";
	

	public TradingSessionStatus() {
		
		super(new int[] {335, 336, 338, 339, 325, 340, 341, 342, 343, 344, 345, 387, 58, 354, 355,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatus(quickfix.field.TradingSessionID tradingSessionID, quickfix.field.TradSesStatus tradSesStatus) {
		this();
		setField(tradingSessionID);
		setField(tradSesStatus);
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

	public void set(quickfix.field.UnsolicitedIndicator value) {
		setField(value);
	}

	public quickfix.field.UnsolicitedIndicator get(quickfix.field.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new quickfix.field.UnsolicitedIndicator());
	}

	public boolean isSet(quickfix.field.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
	}

	public void set(quickfix.field.TradSesStatus value) {
		setField(value);
	}

	public quickfix.field.TradSesStatus get(quickfix.field.TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesStatus getTradSesStatus() throws FieldNotFound {
		return get(new quickfix.field.TradSesStatus());
	}

	public boolean isSet(quickfix.field.TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField(340);
	}

	public void set(quickfix.field.TradSesStartTime value) {
		setField(value);
	}

	public quickfix.field.TradSesStartTime get(quickfix.field.TradSesStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesStartTime getTradSesStartTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesStartTime());
	}

	public boolean isSet(quickfix.field.TradSesStartTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStartTime() {
		return isSetField(341);
	}

	public void set(quickfix.field.TradSesOpenTime value) {
		setField(value);
	}

	public quickfix.field.TradSesOpenTime get(quickfix.field.TradSesOpenTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesOpenTime getTradSesOpenTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesOpenTime());
	}

	public boolean isSet(quickfix.field.TradSesOpenTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesOpenTime() {
		return isSetField(342);
	}

	public void set(quickfix.field.TradSesPreCloseTime value) {
		setField(value);
	}

	public quickfix.field.TradSesPreCloseTime get(quickfix.field.TradSesPreCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesPreCloseTime getTradSesPreCloseTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesPreCloseTime());
	}

	public boolean isSet(quickfix.field.TradSesPreCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesPreCloseTime() {
		return isSetField(343);
	}

	public void set(quickfix.field.TradSesCloseTime value) {
		setField(value);
	}

	public quickfix.field.TradSesCloseTime get(quickfix.field.TradSesCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesCloseTime getTradSesCloseTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesCloseTime());
	}

	public boolean isSet(quickfix.field.TradSesCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesCloseTime() {
		return isSetField(344);
	}

	public void set(quickfix.field.TradSesEndTime value) {
		setField(value);
	}

	public quickfix.field.TradSesEndTime get(quickfix.field.TradSesEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesEndTime getTradSesEndTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesEndTime());
	}

	public boolean isSet(quickfix.field.TradSesEndTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesEndTime() {
		return isSetField(345);
	}

	public void set(quickfix.field.TotalVolumeTraded value) {
		setField(value);
	}

	public quickfix.field.TotalVolumeTraded get(quickfix.field.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new quickfix.field.TotalVolumeTraded());
	}

	public boolean isSet(quickfix.field.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
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
