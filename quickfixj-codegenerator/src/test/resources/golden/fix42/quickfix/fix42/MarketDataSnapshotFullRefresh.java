
package quickfix.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataSnapshotFullRefresh extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "W";
	

	public MarketDataSnapshotFullRefresh() {
		
		super(new int[] {262, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 291, 292, 387, 268,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public MarketDataSnapshotFullRefresh(quickfix.field.Symbol symbol) {
		this();
		setField(symbol);
	}
	
	public void set(quickfix.field.MDReqID value) {
		setField(value);
	}

	public quickfix.field.MDReqID get(quickfix.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.field.MDReqID());
	}

	public boolean isSet(quickfix.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
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

	public void set(quickfix.field.NoMDEntries value) {
		setField(value);
	}

	public quickfix.field.NoMDEntries get(quickfix.field.NoMDEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMDEntries getNoMDEntries() throws FieldNotFound {
		return get(new quickfix.field.NoMDEntries());
	}

	public boolean isSet(quickfix.field.NoMDEntries field) {
		return isSetField(field);
	}

	public boolean isSetNoMDEntries() {
		return isSetField(268);
	}

	public static class NoMDEntries extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {269, 270, 15, 271, 272, 273, 274, 275, 336, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 299, 288, 289, 346, 290, 58, 354, 355, 0};

		public NoMDEntries() {
			super(268, 269, ORDER);
		}
		
	public void set(quickfix.field.MDEntryType value) {
		setField(value);
	}

	public quickfix.field.MDEntryType get(quickfix.field.MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound {
		return get(new quickfix.field.MDEntryType());
	}

	public boolean isSet(quickfix.field.MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(269);
	}

	public void set(quickfix.field.MDEntryPx value) {
		setField(value);
	}

	public quickfix.field.MDEntryPx get(quickfix.field.MDEntryPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryPx getMDEntryPx() throws FieldNotFound {
		return get(new quickfix.field.MDEntryPx());
	}

	public boolean isSet(quickfix.field.MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(270);
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

	public void set(quickfix.field.MDEntrySize value) {
		setField(value);
	}

	public quickfix.field.MDEntrySize get(quickfix.field.MDEntrySize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
		return get(new quickfix.field.MDEntrySize());
	}

	public boolean isSet(quickfix.field.MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(271);
	}

	public void set(quickfix.field.MDEntryDate value) {
		setField(value);
	}

	public quickfix.field.MDEntryDate get(quickfix.field.MDEntryDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryDate getMDEntryDate() throws FieldNotFound {
		return get(new quickfix.field.MDEntryDate());
	}

	public boolean isSet(quickfix.field.MDEntryDate field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryDate() {
		return isSetField(272);
	}

	public void set(quickfix.field.MDEntryTime value) {
		setField(value);
	}

	public quickfix.field.MDEntryTime get(quickfix.field.MDEntryTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryTime getMDEntryTime() throws FieldNotFound {
		return get(new quickfix.field.MDEntryTime());
	}

	public boolean isSet(quickfix.field.MDEntryTime field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryTime() {
		return isSetField(273);
	}

	public void set(quickfix.field.TickDirection value) {
		setField(value);
	}

	public quickfix.field.TickDirection get(quickfix.field.TickDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TickDirection getTickDirection() throws FieldNotFound {
		return get(new quickfix.field.TickDirection());
	}

	public boolean isSet(quickfix.field.TickDirection field) {
		return isSetField(field);
	}

	public boolean isSetTickDirection() {
		return isSetField(274);
	}

	public void set(quickfix.field.MDMkt value) {
		setField(value);
	}

	public quickfix.field.MDMkt get(quickfix.field.MDMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDMkt getMDMkt() throws FieldNotFound {
		return get(new quickfix.field.MDMkt());
	}

	public boolean isSet(quickfix.field.MDMkt field) {
		return isSetField(field);
	}

	public boolean isSetMDMkt() {
		return isSetField(275);
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

	public void set(quickfix.field.QuoteCondition value) {
		setField(value);
	}

	public quickfix.field.QuoteCondition get(quickfix.field.QuoteCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteCondition getQuoteCondition() throws FieldNotFound {
		return get(new quickfix.field.QuoteCondition());
	}

	public boolean isSet(quickfix.field.QuoteCondition field) {
		return isSetField(field);
	}

	public boolean isSetQuoteCondition() {
		return isSetField(276);
	}

	public void set(quickfix.field.TradeCondition value) {
		setField(value);
	}

	public quickfix.field.TradeCondition get(quickfix.field.TradeCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeCondition getTradeCondition() throws FieldNotFound {
		return get(new quickfix.field.TradeCondition());
	}

	public boolean isSet(quickfix.field.TradeCondition field) {
		return isSetField(field);
	}

	public boolean isSetTradeCondition() {
		return isSetField(277);
	}

	public void set(quickfix.field.MDEntryOriginator value) {
		setField(value);
	}

	public quickfix.field.MDEntryOriginator get(quickfix.field.MDEntryOriginator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryOriginator getMDEntryOriginator() throws FieldNotFound {
		return get(new quickfix.field.MDEntryOriginator());
	}

	public boolean isSet(quickfix.field.MDEntryOriginator field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryOriginator() {
		return isSetField(282);
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

	public void set(quickfix.field.OpenCloseSettleFlag value) {
		setField(value);
	}

	public quickfix.field.OpenCloseSettleFlag get(quickfix.field.OpenCloseSettleFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenCloseSettleFlag getOpenCloseSettleFlag() throws FieldNotFound {
		return get(new quickfix.field.OpenCloseSettleFlag());
	}

	public boolean isSet(quickfix.field.OpenCloseSettleFlag field) {
		return isSetField(field);
	}

	public boolean isSetOpenCloseSettleFlag() {
		return isSetField(286);
	}

	public void set(quickfix.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.field.TimeInForce());
	}

	public boolean isSet(quickfix.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	public void set(quickfix.field.ExpireDate value) {
		setField(value);
	}

	public quickfix.field.ExpireDate get(quickfix.field.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new quickfix.field.ExpireDate());
	}

	public boolean isSet(quickfix.field.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
	}

	public void set(quickfix.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.field.ExpireTime());
	}

	public boolean isSet(quickfix.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.field.MinQty value) {
		setField(value);
	}

	public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.field.MinQty());
	}

	public boolean isSet(quickfix.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

	public void set(quickfix.field.ExecInst value) {
		setField(value);
	}

	public quickfix.field.ExecInst get(quickfix.field.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecInst getExecInst() throws FieldNotFound {
		return get(new quickfix.field.ExecInst());
	}

	public boolean isSet(quickfix.field.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
	}

	public void set(quickfix.field.SellerDays value) {
		setField(value);
	}

	public quickfix.field.SellerDays get(quickfix.field.SellerDays value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SellerDays getSellerDays() throws FieldNotFound {
		return get(new quickfix.field.SellerDays());
	}

	public boolean isSet(quickfix.field.SellerDays field) {
		return isSetField(field);
	}

	public boolean isSetSellerDays() {
		return isSetField(287);
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

	public void set(quickfix.field.QuoteEntryID value) {
		setField(value);
	}

	public quickfix.field.QuoteEntryID get(quickfix.field.QuoteEntryID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteEntryID getQuoteEntryID() throws FieldNotFound {
		return get(new quickfix.field.QuoteEntryID());
	}

	public boolean isSet(quickfix.field.QuoteEntryID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteEntryID() {
		return isSetField(299);
	}

	public void set(quickfix.field.MDEntryBuyer value) {
		setField(value);
	}

	public quickfix.field.MDEntryBuyer get(quickfix.field.MDEntryBuyer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryBuyer getMDEntryBuyer() throws FieldNotFound {
		return get(new quickfix.field.MDEntryBuyer());
	}

	public boolean isSet(quickfix.field.MDEntryBuyer field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryBuyer() {
		return isSetField(288);
	}

	public void set(quickfix.field.MDEntrySeller value) {
		setField(value);
	}

	public quickfix.field.MDEntrySeller get(quickfix.field.MDEntrySeller value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntrySeller getMDEntrySeller() throws FieldNotFound {
		return get(new quickfix.field.MDEntrySeller());
	}

	public boolean isSet(quickfix.field.MDEntrySeller field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySeller() {
		return isSetField(289);
	}

	public void set(quickfix.field.NumberOfOrders value) {
		setField(value);
	}

	public quickfix.field.NumberOfOrders get(quickfix.field.NumberOfOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumberOfOrders getNumberOfOrders() throws FieldNotFound {
		return get(new quickfix.field.NumberOfOrders());
	}

	public boolean isSet(quickfix.field.NumberOfOrders field) {
		return isSetField(field);
	}

	public boolean isSetNumberOfOrders() {
		return isSetField(346);
	}

	public void set(quickfix.field.MDEntryPositionNo value) {
		setField(value);
	}

	public quickfix.field.MDEntryPositionNo get(quickfix.field.MDEntryPositionNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
		return get(new quickfix.field.MDEntryPositionNo());
	}

	public boolean isSet(quickfix.field.MDEntryPositionNo field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPositionNo() {
		return isSetField(290);
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
