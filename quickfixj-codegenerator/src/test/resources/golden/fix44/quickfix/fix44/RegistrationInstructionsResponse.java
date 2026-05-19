
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class RegistrationInstructionsResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "p";
	

	public RegistrationInstructionsResponse() {
		
		super(new int[] {513, 514, 508, 11, 453, 1, 660, 506, 507, 496,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public RegistrationInstructionsResponse(quickfix.field.RegistID registID, quickfix.field.RegistTransType registTransType, quickfix.field.RegistRefID registRefID, quickfix.field.RegistStatus registStatus) {
		this();
		setField(registID);
		setField(registTransType);
		setField(registRefID);
		setField(registStatus);
	}
	
	public void set(quickfix.field.RegistID value) {
		setField(value);
	}

	public quickfix.field.RegistID get(quickfix.field.RegistID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistID getRegistID() throws FieldNotFound {
		return get(new quickfix.field.RegistID());
	}

	public boolean isSet(quickfix.field.RegistID field) {
		return isSetField(field);
	}

	public boolean isSetRegistID() {
		return isSetField(513);
	}

	public void set(quickfix.field.RegistTransType value) {
		setField(value);
	}

	public quickfix.field.RegistTransType get(quickfix.field.RegistTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistTransType getRegistTransType() throws FieldNotFound {
		return get(new quickfix.field.RegistTransType());
	}

	public boolean isSet(quickfix.field.RegistTransType field) {
		return isSetField(field);
	}

	public boolean isSetRegistTransType() {
		return isSetField(514);
	}

	public void set(quickfix.field.RegistRefID value) {
		setField(value);
	}

	public quickfix.field.RegistRefID get(quickfix.field.RegistRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistRefID getRegistRefID() throws FieldNotFound {
		return get(new quickfix.field.RegistRefID());
	}

	public boolean isSet(quickfix.field.RegistRefID field) {
		return isSetField(field);
	}

	public boolean isSetRegistRefID() {
		return isSetField(508);
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

	public void set(quickfix.fix44.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix44.component.Parties get(quickfix.fix44.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix44.component.Parties());
	}

	public void set(quickfix.field.NoPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartyIDs());
	}

	public boolean isSet(quickfix.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(quickfix.field.PartyID value) {
		setField(value);
	}

	public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyID getPartyID() throws FieldNotFound {
		return get(new quickfix.field.PartyID());
	}

	public boolean isSet(quickfix.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(quickfix.field.PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.PartyIDSource());
	}

	public boolean isSet(quickfix.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(quickfix.field.PartyRole value) {
		setField(value);
	}

	public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new quickfix.field.PartyRole());
	}

	public boolean isSet(quickfix.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(quickfix.field.NoPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(quickfix.field.PartySubID value) {
		setField(value);
	}

	public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new quickfix.field.PartySubID());
	}

	public boolean isSet(quickfix.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(quickfix.field.PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.PartySubIDType());
	}

	public boolean isSet(quickfix.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

	public void set(quickfix.field.Account value) {
		setField(value);
	}

	public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.field.Account());
	}

	public boolean isSet(quickfix.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.field.AcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AcctIDSource());
	}

	public boolean isSet(quickfix.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(quickfix.field.RegistStatus value) {
		setField(value);
	}

	public quickfix.field.RegistStatus get(quickfix.field.RegistStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistStatus getRegistStatus() throws FieldNotFound {
		return get(new quickfix.field.RegistStatus());
	}

	public boolean isSet(quickfix.field.RegistStatus field) {
		return isSetField(field);
	}

	public boolean isSetRegistStatus() {
		return isSetField(506);
	}

	public void set(quickfix.field.RegistRejReasonCode value) {
		setField(value);
	}

	public quickfix.field.RegistRejReasonCode get(quickfix.field.RegistRejReasonCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistRejReasonCode getRegistRejReasonCode() throws FieldNotFound {
		return get(new quickfix.field.RegistRejReasonCode());
	}

	public boolean isSet(quickfix.field.RegistRejReasonCode field) {
		return isSetField(field);
	}

	public boolean isSetRegistRejReasonCode() {
		return isSetField(507);
	}

	public void set(quickfix.field.RegistRejReasonText value) {
		setField(value);
	}

	public quickfix.field.RegistRejReasonText get(quickfix.field.RegistRejReasonText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistRejReasonText getRegistRejReasonText() throws FieldNotFound {
		return get(new quickfix.field.RegistRejReasonText());
	}

	public boolean isSet(quickfix.field.RegistRejReasonText field) {
		return isSetField(field);
	}

	public boolean isSetRegistRejReasonText() {
		return isSetField(496);
	}

}
