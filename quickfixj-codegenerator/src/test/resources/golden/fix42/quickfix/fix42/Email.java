
package quickfix.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Email extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "C";
	

	public Email() {
		
		super(new int[] {164, 94, 42, 147, 356, 357, 215, 146, 37, 11, 33, 95, 96,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Email(quickfix.field.EmailThreadID emailThreadID, quickfix.field.EmailType emailType, quickfix.field.Subject subject) {
		this();
		setField(emailThreadID);
		setField(emailType);
		setField(subject);
	}
	
	public void set(quickfix.field.EmailThreadID value) {
		setField(value);
	}

	public quickfix.field.EmailThreadID get(quickfix.field.EmailThreadID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EmailThreadID getEmailThreadID() throws FieldNotFound {
		return get(new quickfix.field.EmailThreadID());
	}

	public boolean isSet(quickfix.field.EmailThreadID field) {
		return isSetField(field);
	}

	public boolean isSetEmailThreadID() {
		return isSetField(164);
	}

	public void set(quickfix.field.EmailType value) {
		setField(value);
	}

	public quickfix.field.EmailType get(quickfix.field.EmailType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EmailType getEmailType() throws FieldNotFound {
		return get(new quickfix.field.EmailType());
	}

	public boolean isSet(quickfix.field.EmailType field) {
		return isSetField(field);
	}

	public boolean isSetEmailType() {
		return isSetField(94);
	}

	public void set(quickfix.field.OrigTime value) {
		setField(value);
	}

	public quickfix.field.OrigTime get(quickfix.field.OrigTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigTime getOrigTime() throws FieldNotFound {
		return get(new quickfix.field.OrigTime());
	}

	public boolean isSet(quickfix.field.OrigTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigTime() {
		return isSetField(42);
	}

	public void set(quickfix.field.Subject value) {
		setField(value);
	}

	public quickfix.field.Subject get(quickfix.field.Subject value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Subject getSubject() throws FieldNotFound {
		return get(new quickfix.field.Subject());
	}

	public boolean isSet(quickfix.field.Subject field) {
		return isSetField(field);
	}

	public boolean isSetSubject() {
		return isSetField(147);
	}

	public void set(quickfix.field.EncodedSubjectLen value) {
		setField(value);
	}

	public quickfix.field.EncodedSubjectLen get(quickfix.field.EncodedSubjectLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSubjectLen getEncodedSubjectLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedSubjectLen());
	}

	public boolean isSet(quickfix.field.EncodedSubjectLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSubjectLen() {
		return isSetField(356);
	}

	public void set(quickfix.field.EncodedSubject value) {
		setField(value);
	}

	public quickfix.field.EncodedSubject get(quickfix.field.EncodedSubject value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSubject getEncodedSubject() throws FieldNotFound {
		return get(new quickfix.field.EncodedSubject());
	}

	public boolean isSet(quickfix.field.EncodedSubject field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSubject() {
		return isSetField(357);
	}

	public void set(quickfix.field.NoRoutingIDs value) {
		setField(value);
	}

	public quickfix.field.NoRoutingIDs get(quickfix.field.NoRoutingIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRoutingIDs getNoRoutingIDs() throws FieldNotFound {
		return get(new quickfix.field.NoRoutingIDs());
	}

	public boolean isSet(quickfix.field.NoRoutingIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoRoutingIDs() {
		return isSetField(215);
	}

	public static class NoRoutingIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {216, 217, 0};

		public NoRoutingIDs() {
			super(215, 216, ORDER);
		}
		
	public void set(quickfix.field.RoutingType value) {
		setField(value);
	}

	public quickfix.field.RoutingType get(quickfix.field.RoutingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoutingType getRoutingType() throws FieldNotFound {
		return get(new quickfix.field.RoutingType());
	}

	public boolean isSet(quickfix.field.RoutingType field) {
		return isSetField(field);
	}

	public boolean isSetRoutingType() {
		return isSetField(216);
	}

	public void set(quickfix.field.RoutingID value) {
		setField(value);
	}

	public quickfix.field.RoutingID get(quickfix.field.RoutingID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoutingID getRoutingID() throws FieldNotFound {
		return get(new quickfix.field.RoutingID());
	}

	public boolean isSet(quickfix.field.RoutingID field) {
		return isSetField(field);
	}

	public boolean isSetRoutingID() {
		return isSetField(217);
	}

	}

	public void set(quickfix.field.NoRelatedSym value) {
		setField(value);
	}

	public quickfix.field.NoRelatedSym get(quickfix.field.NoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.field.NoRelatedSym());
	}

	public boolean isSet(quickfix.field.NoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetNoRelatedSym() {
		return isSetField(146);
	}

	public static class NoRelatedSym extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {46, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 0};

		public NoRelatedSym() {
			super(146, 46, ORDER);
		}
		
	public void set(quickfix.field.RelatdSym value) {
		setField(value);
	}

	public quickfix.field.RelatdSym get(quickfix.field.RelatdSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RelatdSym getRelatdSym() throws FieldNotFound {
		return get(new quickfix.field.RelatdSym());
	}

	public boolean isSet(quickfix.field.RelatdSym field) {
		return isSetField(field);
	}

	public boolean isSetRelatdSym() {
		return isSetField(46);
	}

	public void set(quickfix.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.SymbolSfx());
	}

	public boolean isSet(quickfix.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(quickfix.field.SecurityID value) {
		setField(value);
	}

	public quickfix.field.SecurityID get(quickfix.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.field.SecurityID());
	}

	public boolean isSet(quickfix.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.field.IDSource value) {
		setField(value);
	}

	public quickfix.field.IDSource get(quickfix.field.IDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IDSource getIDSource() throws FieldNotFound {
		return get(new quickfix.field.IDSource());
	}

	public boolean isSet(quickfix.field.IDSource field) {
		return isSetField(field);
	}

	public boolean isSetIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.field.MaturityDay value) {
		setField(value);
	}

	public quickfix.field.MaturityDay get(quickfix.field.MaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDay getMaturityDay() throws FieldNotFound {
		return get(new quickfix.field.MaturityDay());
	}

	public boolean isSet(quickfix.field.MaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDay() {
		return isSetField(205);
	}

	public void set(quickfix.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.PutOrCall());
	}

	public boolean isSet(quickfix.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.StrikePrice());
	}

	public boolean isSet(quickfix.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.field.OptAttribute get(quickfix.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.OptAttribute());
	}

	public boolean isSet(quickfix.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.field.ContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.ContractMultiplier get(quickfix.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.ContractMultiplier());
	}

	public boolean isSet(quickfix.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(quickfix.field.CouponRate value) {
		setField(value);
	}

	public quickfix.field.CouponRate get(quickfix.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new quickfix.field.CouponRate());
	}

	public boolean isSet(quickfix.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(quickfix.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.SecurityExchange());
	}

	public boolean isSet(quickfix.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.field.Issuer value) {
		setField(value);
	}

	public quickfix.field.Issuer get(quickfix.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Issuer getIssuer() throws FieldNotFound {
		return get(new quickfix.field.Issuer());
	}

	public boolean isSet(quickfix.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(quickfix.field.EncodedIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuerLen get(quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(quickfix.field.EncodedIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuer get(quickfix.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuer());
	}

	public boolean isSet(quickfix.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(quickfix.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.SecurityDesc());
	}

	public boolean isSet(quickfix.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDescLen get(quickfix.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(quickfix.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDesc get(quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	}

	public void set(quickfix.field.OrderID value) {
		setField(value);
	}

	public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.field.OrderID());
	}

	public boolean isSet(quickfix.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
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

	public void set(quickfix.field.LinesOfText value) {
		setField(value);
	}

	public quickfix.field.LinesOfText get(quickfix.field.LinesOfText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LinesOfText getLinesOfText() throws FieldNotFound {
		return get(new quickfix.field.LinesOfText());
	}

	public boolean isSet(quickfix.field.LinesOfText field) {
		return isSetField(field);
	}

	public boolean isSetLinesOfText() {
		return isSetField(33);
	}

	public static class LinesOfText extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {58, 354, 355, 0};

		public LinesOfText() {
			super(33, 58, ORDER);
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

	public void set(quickfix.field.RawDataLength value) {
		setField(value);
	}

	public quickfix.field.RawDataLength get(quickfix.field.RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RawDataLength getRawDataLength() throws FieldNotFound {
		return get(new quickfix.field.RawDataLength());
	}

	public boolean isSet(quickfix.field.RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(95);
	}

	public void set(quickfix.field.RawData value) {
		setField(value);
	}

	public quickfix.field.RawData get(quickfix.field.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RawData getRawData() throws FieldNotFound {
		return get(new quickfix.field.RawData());
	}

	public boolean isSet(quickfix.field.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

}
