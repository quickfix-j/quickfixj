
package quickfix.fix42;

import quickfix.FieldNotFound;


public class ListExecute extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "L";
	

	public ListExecute() {
		
		super(new int[] {66, 391, 390, 60, 58, 354, 355,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ListExecute(quickfix.field.ListID listID, quickfix.field.TransactTime transactTime) {
		this();
		setField(listID);
		setField(transactTime);
	}
	
	public void set(quickfix.field.ListID value) {
		setField(value);
	}

	public quickfix.field.ListID get(quickfix.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListID getListID() throws FieldNotFound {
		return get(new quickfix.field.ListID());
	}

	public boolean isSet(quickfix.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(quickfix.field.ClientBidID value) {
		setField(value);
	}

	public quickfix.field.ClientBidID get(quickfix.field.ClientBidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClientBidID getClientBidID() throws FieldNotFound {
		return get(new quickfix.field.ClientBidID());
	}

	public boolean isSet(quickfix.field.ClientBidID field) {
		return isSetField(field);
	}

	public boolean isSetClientBidID() {
		return isSetField(391);
	}

	public void set(quickfix.field.BidID value) {
		setField(value);
	}

	public quickfix.field.BidID get(quickfix.field.BidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidID getBidID() throws FieldNotFound {
		return get(new quickfix.field.BidID());
	}

	public boolean isSet(quickfix.field.BidID field) {
		return isSetField(field);
	}

	public boolean isSetBidID() {
		return isSetField(390);
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
