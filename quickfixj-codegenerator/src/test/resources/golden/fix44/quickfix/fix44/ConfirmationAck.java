
package quickfix.fix44;

import quickfix.FieldNotFound;


public class ConfirmationAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AU";
	

	public ConfirmationAck() {
		
		super(new int[] {664, 75, 60, 940, 774, 573, 58, 354, 355,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ConfirmationAck(quickfix.field.ConfirmID confirmID, quickfix.field.TradeDate tradeDate, quickfix.field.TransactTime transactTime, quickfix.field.AffirmStatus affirmStatus) {
		this();
		setField(confirmID);
		setField(tradeDate);
		setField(transactTime);
		setField(affirmStatus);
	}
	
	public void set(quickfix.field.ConfirmID value) {
		setField(value);
	}

	public quickfix.field.ConfirmID get(quickfix.field.ConfirmID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ConfirmID getConfirmID() throws FieldNotFound {
		return get(new quickfix.field.ConfirmID());
	}

	public boolean isSet(quickfix.field.ConfirmID field) {
		return isSetField(field);
	}

	public boolean isSetConfirmID() {
		return isSetField(664);
	}

	public void set(quickfix.field.TradeDate value) {
		setField(value);
	}

	public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new quickfix.field.TradeDate());
	}

	public boolean isSet(quickfix.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
	}

	public void set(quickfix.field.TransactTime value) {
		setField(value);
	}

	public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.field.TransactTime());
	}

	public boolean isSet(quickfix.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.field.AffirmStatus value) {
		setField(value);
	}

	public quickfix.field.AffirmStatus get(quickfix.field.AffirmStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AffirmStatus getAffirmStatus() throws FieldNotFound {
		return get(new quickfix.field.AffirmStatus());
	}

	public boolean isSet(quickfix.field.AffirmStatus field) {
		return isSetField(field);
	}

	public boolean isSetAffirmStatus() {
		return isSetField(940);
	}

	public void set(quickfix.field.ConfirmRejReason value) {
		setField(value);
	}

	public quickfix.field.ConfirmRejReason get(quickfix.field.ConfirmRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ConfirmRejReason getConfirmRejReason() throws FieldNotFound {
		return get(new quickfix.field.ConfirmRejReason());
	}

	public boolean isSet(quickfix.field.ConfirmRejReason field) {
		return isSetField(field);
	}

	public boolean isSetConfirmRejReason() {
		return isSetField(774);
	}

	public void set(quickfix.field.MatchStatus value) {
		setField(value);
	}

	public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new quickfix.field.MatchStatus());
	}

	public boolean isSet(quickfix.field.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
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
