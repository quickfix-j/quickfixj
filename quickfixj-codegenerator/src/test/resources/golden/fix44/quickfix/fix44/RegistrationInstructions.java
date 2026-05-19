
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class RegistrationInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "o";
	

	public RegistrationInstructions() {
		
		super(new int[] {513, 514, 508, 11, 453, 1, 660, 493, 495, 517, 473, 510,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public RegistrationInstructions(quickfix.field.RegistID registID, quickfix.field.RegistTransType registTransType, quickfix.field.RegistRefID registRefID) {
		this();
		setField(registID);
		setField(registTransType);
		setField(registRefID);
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

	public void set(quickfix.field.RegistAcctType value) {
		setField(value);
	}

	public quickfix.field.RegistAcctType get(quickfix.field.RegistAcctType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistAcctType getRegistAcctType() throws FieldNotFound {
		return get(new quickfix.field.RegistAcctType());
	}

	public boolean isSet(quickfix.field.RegistAcctType field) {
		return isSetField(field);
	}

	public boolean isSetRegistAcctType() {
		return isSetField(493);
	}

	public void set(quickfix.field.TaxAdvantageType value) {
		setField(value);
	}

	public quickfix.field.TaxAdvantageType get(quickfix.field.TaxAdvantageType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TaxAdvantageType getTaxAdvantageType() throws FieldNotFound {
		return get(new quickfix.field.TaxAdvantageType());
	}

	public boolean isSet(quickfix.field.TaxAdvantageType field) {
		return isSetField(field);
	}

	public boolean isSetTaxAdvantageType() {
		return isSetField(495);
	}

	public void set(quickfix.field.OwnershipType value) {
		setField(value);
	}

	public quickfix.field.OwnershipType get(quickfix.field.OwnershipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OwnershipType getOwnershipType() throws FieldNotFound {
		return get(new quickfix.field.OwnershipType());
	}

	public boolean isSet(quickfix.field.OwnershipType field) {
		return isSetField(field);
	}

	public boolean isSetOwnershipType() {
		return isSetField(517);
	}

	public void set(quickfix.field.NoRegistDtls value) {
		setField(value);
	}

	public quickfix.field.NoRegistDtls get(quickfix.field.NoRegistDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRegistDtls getNoRegistDtls() throws FieldNotFound {
		return get(new quickfix.field.NoRegistDtls());
	}

	public boolean isSet(quickfix.field.NoRegistDtls field) {
		return isSetField(field);
	}

	public boolean isSetNoRegistDtls() {
		return isSetField(473);
	}

	public static class NoRegistDtls extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {509, 511, 474, 482, 539, 522, 486, 475, 0};

		public NoRegistDtls() {
			super(473, 509, ORDER);
		}
		
	public void set(quickfix.field.RegistDtls value) {
		setField(value);
	}

	public quickfix.field.RegistDtls get(quickfix.field.RegistDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistDtls getRegistDtls() throws FieldNotFound {
		return get(new quickfix.field.RegistDtls());
	}

	public boolean isSet(quickfix.field.RegistDtls field) {
		return isSetField(field);
	}

	public boolean isSetRegistDtls() {
		return isSetField(509);
	}

	public void set(quickfix.field.RegistEmail value) {
		setField(value);
	}

	public quickfix.field.RegistEmail get(quickfix.field.RegistEmail value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistEmail getRegistEmail() throws FieldNotFound {
		return get(new quickfix.field.RegistEmail());
	}

	public boolean isSet(quickfix.field.RegistEmail field) {
		return isSetField(field);
	}

	public boolean isSetRegistEmail() {
		return isSetField(511);
	}

	public void set(quickfix.field.MailingDtls value) {
		setField(value);
	}

	public quickfix.field.MailingDtls get(quickfix.field.MailingDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MailingDtls getMailingDtls() throws FieldNotFound {
		return get(new quickfix.field.MailingDtls());
	}

	public boolean isSet(quickfix.field.MailingDtls field) {
		return isSetField(field);
	}

	public boolean isSetMailingDtls() {
		return isSetField(474);
	}

	public void set(quickfix.field.MailingInst value) {
		setField(value);
	}

	public quickfix.field.MailingInst get(quickfix.field.MailingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MailingInst getMailingInst() throws FieldNotFound {
		return get(new quickfix.field.MailingInst());
	}

	public boolean isSet(quickfix.field.MailingInst field) {
		return isSetField(field);
	}

	public boolean isSetMailingInst() {
		return isSetField(482);
	}

	public void set(quickfix.fix44.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix44.component.NestedParties get(quickfix.fix44.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix44.component.NestedParties());
	}

	public void set(quickfix.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(quickfix.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyID());
	}

	public boolean isSet(quickfix.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(quickfix.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	public void set(quickfix.field.OwnerType value) {
		setField(value);
	}

	public quickfix.field.OwnerType get(quickfix.field.OwnerType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OwnerType getOwnerType() throws FieldNotFound {
		return get(new quickfix.field.OwnerType());
	}

	public boolean isSet(quickfix.field.OwnerType field) {
		return isSetField(field);
	}

	public boolean isSetOwnerType() {
		return isSetField(522);
	}

	public void set(quickfix.field.DateOfBirth value) {
		setField(value);
	}

	public quickfix.field.DateOfBirth get(quickfix.field.DateOfBirth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DateOfBirth getDateOfBirth() throws FieldNotFound {
		return get(new quickfix.field.DateOfBirth());
	}

	public boolean isSet(quickfix.field.DateOfBirth field) {
		return isSetField(field);
	}

	public boolean isSetDateOfBirth() {
		return isSetField(486);
	}

	public void set(quickfix.field.InvestorCountryOfResidence value) {
		setField(value);
	}

	public quickfix.field.InvestorCountryOfResidence get(quickfix.field.InvestorCountryOfResidence value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InvestorCountryOfResidence getInvestorCountryOfResidence() throws FieldNotFound {
		return get(new quickfix.field.InvestorCountryOfResidence());
	}

	public boolean isSet(quickfix.field.InvestorCountryOfResidence field) {
		return isSetField(field);
	}

	public boolean isSetInvestorCountryOfResidence() {
		return isSetField(475);
	}

	}

	public void set(quickfix.field.NoDistribInsts value) {
		setField(value);
	}

	public quickfix.field.NoDistribInsts get(quickfix.field.NoDistribInsts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDistribInsts getNoDistribInsts() throws FieldNotFound {
		return get(new quickfix.field.NoDistribInsts());
	}

	public boolean isSet(quickfix.field.NoDistribInsts field) {
		return isSetField(field);
	}

	public boolean isSetNoDistribInsts() {
		return isSetField(510);
	}

	public static class NoDistribInsts extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {477, 512, 478, 498, 499, 500, 501, 502, 0};

		public NoDistribInsts() {
			super(510, 477, ORDER);
		}
		
	public void set(quickfix.field.DistribPaymentMethod value) {
		setField(value);
	}

	public quickfix.field.DistribPaymentMethod get(quickfix.field.DistribPaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DistribPaymentMethod getDistribPaymentMethod() throws FieldNotFound {
		return get(new quickfix.field.DistribPaymentMethod());
	}

	public boolean isSet(quickfix.field.DistribPaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetDistribPaymentMethod() {
		return isSetField(477);
	}

	public void set(quickfix.field.DistribPercentage value) {
		setField(value);
	}

	public quickfix.field.DistribPercentage get(quickfix.field.DistribPercentage value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DistribPercentage getDistribPercentage() throws FieldNotFound {
		return get(new quickfix.field.DistribPercentage());
	}

	public boolean isSet(quickfix.field.DistribPercentage field) {
		return isSetField(field);
	}

	public boolean isSetDistribPercentage() {
		return isSetField(512);
	}

	public void set(quickfix.field.CashDistribCurr value) {
		setField(value);
	}

	public quickfix.field.CashDistribCurr get(quickfix.field.CashDistribCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashDistribCurr getCashDistribCurr() throws FieldNotFound {
		return get(new quickfix.field.CashDistribCurr());
	}

	public boolean isSet(quickfix.field.CashDistribCurr field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribCurr() {
		return isSetField(478);
	}

	public void set(quickfix.field.CashDistribAgentName value) {
		setField(value);
	}

	public quickfix.field.CashDistribAgentName get(quickfix.field.CashDistribAgentName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashDistribAgentName getCashDistribAgentName() throws FieldNotFound {
		return get(new quickfix.field.CashDistribAgentName());
	}

	public boolean isSet(quickfix.field.CashDistribAgentName field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentName() {
		return isSetField(498);
	}

	public void set(quickfix.field.CashDistribAgentCode value) {
		setField(value);
	}

	public quickfix.field.CashDistribAgentCode get(quickfix.field.CashDistribAgentCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashDistribAgentCode getCashDistribAgentCode() throws FieldNotFound {
		return get(new quickfix.field.CashDistribAgentCode());
	}

	public boolean isSet(quickfix.field.CashDistribAgentCode field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentCode() {
		return isSetField(499);
	}

	public void set(quickfix.field.CashDistribAgentAcctNumber value) {
		setField(value);
	}

	public quickfix.field.CashDistribAgentAcctNumber get(quickfix.field.CashDistribAgentAcctNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashDistribAgentAcctNumber getCashDistribAgentAcctNumber() throws FieldNotFound {
		return get(new quickfix.field.CashDistribAgentAcctNumber());
	}

	public boolean isSet(quickfix.field.CashDistribAgentAcctNumber field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentAcctNumber() {
		return isSetField(500);
	}

	public void set(quickfix.field.CashDistribPayRef value) {
		setField(value);
	}

	public quickfix.field.CashDistribPayRef get(quickfix.field.CashDistribPayRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashDistribPayRef getCashDistribPayRef() throws FieldNotFound {
		return get(new quickfix.field.CashDistribPayRef());
	}

	public boolean isSet(quickfix.field.CashDistribPayRef field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribPayRef() {
		return isSetField(501);
	}

	public void set(quickfix.field.CashDistribAgentAcctName value) {
		setField(value);
	}

	public quickfix.field.CashDistribAgentAcctName get(quickfix.field.CashDistribAgentAcctName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashDistribAgentAcctName getCashDistribAgentAcctName() throws FieldNotFound {
		return get(new quickfix.field.CashDistribAgentAcctName());
	}

	public boolean isSet(quickfix.field.CashDistribAgentAcctName field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentAcctName() {
		return isSetField(502);
	}

	}

}
