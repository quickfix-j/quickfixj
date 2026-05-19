
package quickfix.fix42;

import quickfix.FieldNotFound;


public class SecurityStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "f";
	

	public SecurityStatus() {
		
		super(new int[] {324, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 15, 336, 325, 326, 291, 292, 327, 328, 329, 330, 331, 332, 333, 31, 60, 334,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public SecurityStatus(quickfix.field.Symbol symbol) {
		this();
		setField(symbol);
	}
	
	public void set(quickfix.field.SecurityStatusReqID value) {
		setField(value);
	}

	public quickfix.field.SecurityStatusReqID get(quickfix.field.SecurityStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityStatusReqID getSecurityStatusReqID() throws FieldNotFound {
		return get(new quickfix.field.SecurityStatusReqID());
	}

	public boolean isSet(quickfix.field.SecurityStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityStatusReqID() {
		return isSetField(324);
	}

	public void set(quickfix.field.Symbol value) {
		setField(value);
	}

	public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.field.Symbol());
	}

	public boolean isSet(quickfix.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
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

	public void set(quickfix.field.Currency value) {
		setField(value);
	}

	public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.field.Currency());
	}

	public boolean isSet(quickfix.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
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

	public void set(quickfix.field.SecurityTradingStatus value) {
		setField(value);
	}

	public quickfix.field.SecurityTradingStatus get(quickfix.field.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new quickfix.field.SecurityTradingStatus());
	}

	public boolean isSet(quickfix.field.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
	}

	public void set(quickfix.field.FinancialStatus value) {
		setField(value);
	}

	public quickfix.field.FinancialStatus get(quickfix.field.FinancialStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FinancialStatus getFinancialStatus() throws FieldNotFound {
		return get(new quickfix.field.FinancialStatus());
	}

	public boolean isSet(quickfix.field.FinancialStatus field) {
		return isSetField(field);
	}

	public boolean isSetFinancialStatus() {
		return isSetField(291);
	}

	public void set(quickfix.field.CorporateAction value) {
		setField(value);
	}

	public quickfix.field.CorporateAction get(quickfix.field.CorporateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CorporateAction getCorporateAction() throws FieldNotFound {
		return get(new quickfix.field.CorporateAction());
	}

	public boolean isSet(quickfix.field.CorporateAction field) {
		return isSetField(field);
	}

	public boolean isSetCorporateAction() {
		return isSetField(292);
	}

	public void set(quickfix.field.HaltReason value) {
		setField(value);
	}

	public quickfix.field.HaltReason get(quickfix.field.HaltReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HaltReason getHaltReason() throws FieldNotFound {
		return get(new quickfix.field.HaltReason());
	}

	public boolean isSet(quickfix.field.HaltReason field) {
		return isSetField(field);
	}

	public boolean isSetHaltReason() {
		return isSetField(327);
	}

	public void set(quickfix.field.InViewOfCommon value) {
		setField(value);
	}

	public quickfix.field.InViewOfCommon get(quickfix.field.InViewOfCommon value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InViewOfCommon getInViewOfCommon() throws FieldNotFound {
		return get(new quickfix.field.InViewOfCommon());
	}

	public boolean isSet(quickfix.field.InViewOfCommon field) {
		return isSetField(field);
	}

	public boolean isSetInViewOfCommon() {
		return isSetField(328);
	}

	public void set(quickfix.field.DueToRelated value) {
		setField(value);
	}

	public quickfix.field.DueToRelated get(quickfix.field.DueToRelated value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DueToRelated getDueToRelated() throws FieldNotFound {
		return get(new quickfix.field.DueToRelated());
	}

	public boolean isSet(quickfix.field.DueToRelated field) {
		return isSetField(field);
	}

	public boolean isSetDueToRelated() {
		return isSetField(329);
	}

	public void set(quickfix.field.BuyVolume value) {
		setField(value);
	}

	public quickfix.field.BuyVolume get(quickfix.field.BuyVolume value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BuyVolume getBuyVolume() throws FieldNotFound {
		return get(new quickfix.field.BuyVolume());
	}

	public boolean isSet(quickfix.field.BuyVolume field) {
		return isSetField(field);
	}

	public boolean isSetBuyVolume() {
		return isSetField(330);
	}

	public void set(quickfix.field.SellVolume value) {
		setField(value);
	}

	public quickfix.field.SellVolume get(quickfix.field.SellVolume value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SellVolume getSellVolume() throws FieldNotFound {
		return get(new quickfix.field.SellVolume());
	}

	public boolean isSet(quickfix.field.SellVolume field) {
		return isSetField(field);
	}

	public boolean isSetSellVolume() {
		return isSetField(331);
	}

	public void set(quickfix.field.HighPx value) {
		setField(value);
	}

	public quickfix.field.HighPx get(quickfix.field.HighPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HighPx getHighPx() throws FieldNotFound {
		return get(new quickfix.field.HighPx());
	}

	public boolean isSet(quickfix.field.HighPx field) {
		return isSetField(field);
	}

	public boolean isSetHighPx() {
		return isSetField(332);
	}

	public void set(quickfix.field.LowPx value) {
		setField(value);
	}

	public quickfix.field.LowPx get(quickfix.field.LowPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LowPx getLowPx() throws FieldNotFound {
		return get(new quickfix.field.LowPx());
	}

	public boolean isSet(quickfix.field.LowPx field) {
		return isSetField(field);
	}

	public boolean isSetLowPx() {
		return isSetField(333);
	}

	public void set(quickfix.field.LastPx value) {
		setField(value);
	}

	public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.field.LastPx());
	}

	public boolean isSet(quickfix.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
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

	public void set(quickfix.field.Adjustment value) {
		setField(value);
	}

	public quickfix.field.Adjustment get(quickfix.field.Adjustment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Adjustment getAdjustment() throws FieldNotFound {
		return get(new quickfix.field.Adjustment());
	}

	public boolean isSet(quickfix.field.Adjustment field) {
		return isSetField(field);
	}

	public boolean isSetAdjustment() {
		return isSetField(334);
	}

}
