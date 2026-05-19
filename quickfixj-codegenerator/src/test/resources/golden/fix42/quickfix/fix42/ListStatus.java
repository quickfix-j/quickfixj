
package quickfix.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ListStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "N";
	

	public ListStatus() {
		
		super(new int[] {66, 429, 82, 431, 83, 444, 445, 446, 60, 68, 73,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ListStatus(quickfix.field.ListID listID, quickfix.field.ListStatusType listStatusType, quickfix.field.NoRpts noRpts, quickfix.field.ListOrderStatus listOrderStatus, quickfix.field.RptSeq rptSeq, quickfix.field.TotNoOrders totNoOrders) {
		this();
		setField(listID);
		setField(listStatusType);
		setField(noRpts);
		setField(listOrderStatus);
		setField(rptSeq);
		setField(totNoOrders);
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

	public void set(quickfix.field.ListStatusType value) {
		setField(value);
	}

	public quickfix.field.ListStatusType get(quickfix.field.ListStatusType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListStatusType getListStatusType() throws FieldNotFound {
		return get(new quickfix.field.ListStatusType());
	}

	public boolean isSet(quickfix.field.ListStatusType field) {
		return isSetField(field);
	}

	public boolean isSetListStatusType() {
		return isSetField(429);
	}

	public void set(quickfix.field.NoRpts value) {
		setField(value);
	}

	public quickfix.field.NoRpts get(quickfix.field.NoRpts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRpts getNoRpts() throws FieldNotFound {
		return get(new quickfix.field.NoRpts());
	}

	public boolean isSet(quickfix.field.NoRpts field) {
		return isSetField(field);
	}

	public boolean isSetNoRpts() {
		return isSetField(82);
	}

	public void set(quickfix.field.ListOrderStatus value) {
		setField(value);
	}

	public quickfix.field.ListOrderStatus get(quickfix.field.ListOrderStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListOrderStatus getListOrderStatus() throws FieldNotFound {
		return get(new quickfix.field.ListOrderStatus());
	}

	public boolean isSet(quickfix.field.ListOrderStatus field) {
		return isSetField(field);
	}

	public boolean isSetListOrderStatus() {
		return isSetField(431);
	}

	public void set(quickfix.field.RptSeq value) {
		setField(value);
	}

	public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
		return get(new quickfix.field.RptSeq());
	}

	public boolean isSet(quickfix.field.RptSeq field) {
		return isSetField(field);
	}

	public boolean isSetRptSeq() {
		return isSetField(83);
	}

	public void set(quickfix.field.ListStatusText value) {
		setField(value);
	}

	public quickfix.field.ListStatusText get(quickfix.field.ListStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListStatusText getListStatusText() throws FieldNotFound {
		return get(new quickfix.field.ListStatusText());
	}

	public boolean isSet(quickfix.field.ListStatusText field) {
		return isSetField(field);
	}

	public boolean isSetListStatusText() {
		return isSetField(444);
	}

	public void set(quickfix.field.EncodedListStatusTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedListStatusTextLen get(quickfix.field.EncodedListStatusTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedListStatusTextLen getEncodedListStatusTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedListStatusTextLen());
	}

	public boolean isSet(quickfix.field.EncodedListStatusTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedListStatusTextLen() {
		return isSetField(445);
	}

	public void set(quickfix.field.EncodedListStatusText value) {
		setField(value);
	}

	public quickfix.field.EncodedListStatusText get(quickfix.field.EncodedListStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedListStatusText getEncodedListStatusText() throws FieldNotFound {
		return get(new quickfix.field.EncodedListStatusText());
	}

	public boolean isSet(quickfix.field.EncodedListStatusText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedListStatusText() {
		return isSetField(446);
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

	public void set(quickfix.field.TotNoOrders value) {
		setField(value);
	}

	public quickfix.field.TotNoOrders get(quickfix.field.TotNoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotNoOrders getTotNoOrders() throws FieldNotFound {
		return get(new quickfix.field.TotNoOrders());
	}

	public boolean isSet(quickfix.field.TotNoOrders field) {
		return isSetField(field);
	}

	public boolean isSetTotNoOrders() {
		return isSetField(68);
	}

	public void set(quickfix.field.NoOrders value) {
		setField(value);
	}

	public quickfix.field.NoOrders get(quickfix.field.NoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoOrders getNoOrders() throws FieldNotFound {
		return get(new quickfix.field.NoOrders());
	}

	public boolean isSet(quickfix.field.NoOrders field) {
		return isSetField(field);
	}

	public boolean isSetNoOrders() {
		return isSetField(73);
	}

	public static class NoOrders extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {11, 14, 39, 151, 84, 6, 103, 58, 354, 355, 0};

		public NoOrders() {
			super(73, 11, ORDER);
		}
		
	public void set(quickfix.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.field.ClOrdID());
	}

	public boolean isSet(quickfix.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.field.CumQty value) {
		setField(value);
	}

	public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.field.CumQty());
	}

	public boolean isSet(quickfix.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
	}

	public void set(quickfix.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.field.OrdStatus());
	}

	public boolean isSet(quickfix.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.field.LeavesQty());
	}

	public boolean isSet(quickfix.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(quickfix.field.CxlQty value) {
		setField(value);
	}

	public quickfix.field.CxlQty get(quickfix.field.CxlQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CxlQty getCxlQty() throws FieldNotFound {
		return get(new quickfix.field.CxlQty());
	}

	public boolean isSet(quickfix.field.CxlQty field) {
		return isSetField(field);
	}

	public boolean isSetCxlQty() {
		return isSetField(84);
	}

	public void set(quickfix.field.AvgPx value) {
		setField(value);
	}

	public quickfix.field.AvgPx get(quickfix.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.field.AvgPx());
	}

	public boolean isSet(quickfix.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
	}

	public void set(quickfix.field.OrdRejReason value) {
		setField(value);
	}

	public quickfix.field.OrdRejReason get(quickfix.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new quickfix.field.OrdRejReason());
	}

	public boolean isSet(quickfix.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
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

}
