
package quickfix.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Allocation extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "J";
	

	public Allocation() {
		
		super(new int[] {70, 71, 72, 196, 197, 73, 124, 54, 55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 53, 30, 336, 6, 15, 74, 75, 60, 63, 64, 381, 118, 77, 58, 354, 355, 157, 158, 78,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Allocation(quickfix.field.AllocID allocID, quickfix.field.AllocTransType allocTransType, quickfix.field.Side side, quickfix.field.Symbol symbol, quickfix.field.Shares shares, quickfix.field.AvgPx avgPx, quickfix.field.TradeDate tradeDate) {
		this();
		setField(allocID);
		setField(allocTransType);
		setField(side);
		setField(symbol);
		setField(shares);
		setField(avgPx);
		setField(tradeDate);
	}
	
	public void set(quickfix.field.AllocID value) {
		setField(value);
	}

	public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocID getAllocID() throws FieldNotFound {
		return get(new quickfix.field.AllocID());
	}

	public boolean isSet(quickfix.field.AllocID field) {
		return isSetField(field);
	}

	public boolean isSetAllocID() {
		return isSetField(70);
	}

	public void set(quickfix.field.AllocTransType value) {
		setField(value);
	}

	public quickfix.field.AllocTransType get(quickfix.field.AllocTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocTransType getAllocTransType() throws FieldNotFound {
		return get(new quickfix.field.AllocTransType());
	}

	public boolean isSet(quickfix.field.AllocTransType field) {
		return isSetField(field);
	}

	public boolean isSetAllocTransType() {
		return isSetField(71);
	}

	public void set(quickfix.field.RefAllocID value) {
		setField(value);
	}

	public quickfix.field.RefAllocID get(quickfix.field.RefAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefAllocID getRefAllocID() throws FieldNotFound {
		return get(new quickfix.field.RefAllocID());
	}

	public boolean isSet(quickfix.field.RefAllocID field) {
		return isSetField(field);
	}

	public boolean isSetRefAllocID() {
		return isSetField(72);
	}

	public void set(quickfix.field.AllocLinkID value) {
		setField(value);
	}

	public quickfix.field.AllocLinkID get(quickfix.field.AllocLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocLinkID getAllocLinkID() throws FieldNotFound {
		return get(new quickfix.field.AllocLinkID());
	}

	public boolean isSet(quickfix.field.AllocLinkID field) {
		return isSetField(field);
	}

	public boolean isSetAllocLinkID() {
		return isSetField(196);
	}

	public void set(quickfix.field.AllocLinkType value) {
		setField(value);
	}

	public quickfix.field.AllocLinkType get(quickfix.field.AllocLinkType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocLinkType getAllocLinkType() throws FieldNotFound {
		return get(new quickfix.field.AllocLinkType());
	}

	public boolean isSet(quickfix.field.AllocLinkType field) {
		return isSetField(field);
	}

	public boolean isSetAllocLinkType() {
		return isSetField(197);
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
		private static final int[] ORDER = {11, 37, 198, 66, 105, 0};

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

	public void set(quickfix.field.SecondaryOrderID value) {
		setField(value);
	}

	public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryOrderID());
	}

	public boolean isSet(quickfix.field.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
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

	public void set(quickfix.field.WaveNo value) {
		setField(value);
	}

	public quickfix.field.WaveNo get(quickfix.field.WaveNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.WaveNo getWaveNo() throws FieldNotFound {
		return get(new quickfix.field.WaveNo());
	}

	public boolean isSet(quickfix.field.WaveNo field) {
		return isSetField(field);
	}

	public boolean isSetWaveNo() {
		return isSetField(105);
	}

	}

	public void set(quickfix.field.NoExecs value) {
		setField(value);
	}

	public quickfix.field.NoExecs get(quickfix.field.NoExecs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
		return get(new quickfix.field.NoExecs());
	}

	public boolean isSet(quickfix.field.NoExecs field) {
		return isSetField(field);
	}

	public boolean isSetNoExecs() {
		return isSetField(124);
	}

	public static class NoExecs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {32, 17, 31, 29, 0};

		public NoExecs() {
			super(124, 32, ORDER);
		}
		
	public void set(quickfix.field.LastShares value) {
		setField(value);
	}

	public quickfix.field.LastShares get(quickfix.field.LastShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastShares getLastShares() throws FieldNotFound {
		return get(new quickfix.field.LastShares());
	}

	public boolean isSet(quickfix.field.LastShares field) {
		return isSetField(field);
	}

	public boolean isSetLastShares() {
		return isSetField(32);
	}

	public void set(quickfix.field.ExecID value) {
		setField(value);
	}

	public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.field.ExecID());
	}

	public boolean isSet(quickfix.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
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

	public void set(quickfix.field.LastCapacity value) {
		setField(value);
	}

	public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
		return get(new quickfix.field.LastCapacity());
	}

	public boolean isSet(quickfix.field.LastCapacity field) {
		return isSetField(field);
	}

	public boolean isSetLastCapacity() {
		return isSetField(29);
	}

	}

	public void set(quickfix.field.Side value) {
		setField(value);
	}

	public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.field.Side());
	}

	public boolean isSet(quickfix.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
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

	public void set(quickfix.field.Shares value) {
		setField(value);
	}

	public quickfix.field.Shares get(quickfix.field.Shares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Shares getShares() throws FieldNotFound {
		return get(new quickfix.field.Shares());
	}

	public boolean isSet(quickfix.field.Shares field) {
		return isSetField(field);
	}

	public boolean isSetShares() {
		return isSetField(53);
	}

	public void set(quickfix.field.LastMkt value) {
		setField(value);
	}

	public quickfix.field.LastMkt get(quickfix.field.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastMkt getLastMkt() throws FieldNotFound {
		return get(new quickfix.field.LastMkt());
	}

	public boolean isSet(quickfix.field.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
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

	public void set(quickfix.field.AvgPrxPrecision value) {
		setField(value);
	}

	public quickfix.field.AvgPrxPrecision get(quickfix.field.AvgPrxPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPrxPrecision getAvgPrxPrecision() throws FieldNotFound {
		return get(new quickfix.field.AvgPrxPrecision());
	}

	public boolean isSet(quickfix.field.AvgPrxPrecision field) {
		return isSetField(field);
	}

	public boolean isSetAvgPrxPrecision() {
		return isSetField(74);
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

	public void set(quickfix.field.SettlmntTyp value) {
		setField(value);
	}

	public quickfix.field.SettlmntTyp get(quickfix.field.SettlmntTyp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlmntTyp getSettlmntTyp() throws FieldNotFound {
		return get(new quickfix.field.SettlmntTyp());
	}

	public boolean isSet(quickfix.field.SettlmntTyp field) {
		return isSetField(field);
	}

	public boolean isSetSettlmntTyp() {
		return isSetField(63);
	}

	public void set(quickfix.field.FutSettDate value) {
		setField(value);
	}

	public quickfix.field.FutSettDate get(quickfix.field.FutSettDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound {
		return get(new quickfix.field.FutSettDate());
	}

	public boolean isSet(quickfix.field.FutSettDate field) {
		return isSetField(field);
	}

	public boolean isSetFutSettDate() {
		return isSetField(64);
	}

	public void set(quickfix.field.GrossTradeAmt value) {
		setField(value);
	}

	public quickfix.field.GrossTradeAmt get(quickfix.field.GrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.GrossTradeAmt getGrossTradeAmt() throws FieldNotFound {
		return get(new quickfix.field.GrossTradeAmt());
	}

	public boolean isSet(quickfix.field.GrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetGrossTradeAmt() {
		return isSetField(381);
	}

	public void set(quickfix.field.NetMoney value) {
		setField(value);
	}

	public quickfix.field.NetMoney get(quickfix.field.NetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetMoney getNetMoney() throws FieldNotFound {
		return get(new quickfix.field.NetMoney());
	}

	public boolean isSet(quickfix.field.NetMoney field) {
		return isSetField(field);
	}

	public boolean isSetNetMoney() {
		return isSetField(118);
	}

	public void set(quickfix.field.OpenClose value) {
		setField(value);
	}

	public quickfix.field.OpenClose get(quickfix.field.OpenClose value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenClose getOpenClose() throws FieldNotFound {
		return get(new quickfix.field.OpenClose());
	}

	public boolean isSet(quickfix.field.OpenClose field) {
		return isSetField(field);
	}

	public boolean isSetOpenClose() {
		return isSetField(77);
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

	public void set(quickfix.field.NumDaysInterest value) {
		setField(value);
	}

	public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
		return get(new quickfix.field.NumDaysInterest());
	}

	public boolean isSet(quickfix.field.NumDaysInterest field) {
		return isSetField(field);
	}

	public boolean isSetNumDaysInterest() {
		return isSetField(157);
	}

	public void set(quickfix.field.AccruedInterestRate value) {
		setField(value);
	}

	public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
		return get(new quickfix.field.AccruedInterestRate());
	}

	public boolean isSet(quickfix.field.AccruedInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestRate() {
		return isSetField(158);
	}

	public void set(quickfix.field.NoAllocs value) {
		setField(value);
	}

	public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
		return get(new quickfix.field.NoAllocs());
	}

	public boolean isSet(quickfix.field.NoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoAllocs() {
		return isSetField(78);
	}

	public static class NoAllocs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {79, 366, 80, 81, 92, 208, 209, 161, 360, 361, 76, 109, 12, 13, 153, 154, 119, 120, 155, 156, 159, 160, 136, 0};

		public NoAllocs() {
			super(78, 79, ORDER);
		}
		
	public void set(quickfix.field.AllocAccount value) {
		setField(value);
	}

	public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
		return get(new quickfix.field.AllocAccount());
	}

	public boolean isSet(quickfix.field.AllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccount() {
		return isSetField(79);
	}

	public void set(quickfix.field.AllocPrice value) {
		setField(value);
	}

	public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocPrice getAllocPrice() throws FieldNotFound {
		return get(new quickfix.field.AllocPrice());
	}

	public boolean isSet(quickfix.field.AllocPrice field) {
		return isSetField(field);
	}

	public boolean isSetAllocPrice() {
		return isSetField(366);
	}

	public void set(quickfix.field.AllocShares value) {
		setField(value);
	}

	public quickfix.field.AllocShares get(quickfix.field.AllocShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocShares getAllocShares() throws FieldNotFound {
		return get(new quickfix.field.AllocShares());
	}

	public boolean isSet(quickfix.field.AllocShares field) {
		return isSetField(field);
	}

	public boolean isSetAllocShares() {
		return isSetField(80);
	}

	public void set(quickfix.field.ProcessCode value) {
		setField(value);
	}

	public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
		return get(new quickfix.field.ProcessCode());
	}

	public boolean isSet(quickfix.field.ProcessCode field) {
		return isSetField(field);
	}

	public boolean isSetProcessCode() {
		return isSetField(81);
	}

	public void set(quickfix.field.BrokerOfCredit value) {
		setField(value);
	}

	public quickfix.field.BrokerOfCredit get(quickfix.field.BrokerOfCredit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BrokerOfCredit getBrokerOfCredit() throws FieldNotFound {
		return get(new quickfix.field.BrokerOfCredit());
	}

	public boolean isSet(quickfix.field.BrokerOfCredit field) {
		return isSetField(field);
	}

	public boolean isSetBrokerOfCredit() {
		return isSetField(92);
	}

	public void set(quickfix.field.NotifyBrokerOfCredit value) {
		setField(value);
	}

	public quickfix.field.NotifyBrokerOfCredit get(quickfix.field.NotifyBrokerOfCredit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NotifyBrokerOfCredit getNotifyBrokerOfCredit() throws FieldNotFound {
		return get(new quickfix.field.NotifyBrokerOfCredit());
	}

	public boolean isSet(quickfix.field.NotifyBrokerOfCredit field) {
		return isSetField(field);
	}

	public boolean isSetNotifyBrokerOfCredit() {
		return isSetField(208);
	}

	public void set(quickfix.field.AllocHandlInst value) {
		setField(value);
	}

	public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
		return get(new quickfix.field.AllocHandlInst());
	}

	public boolean isSet(quickfix.field.AllocHandlInst field) {
		return isSetField(field);
	}

	public boolean isSetAllocHandlInst() {
		return isSetField(209);
	}

	public void set(quickfix.field.AllocText value) {
		setField(value);
	}

	public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocText getAllocText() throws FieldNotFound {
		return get(new quickfix.field.AllocText());
	}

	public boolean isSet(quickfix.field.AllocText field) {
		return isSetField(field);
	}

	public boolean isSetAllocText() {
		return isSetField(161);
	}

	public void set(quickfix.field.EncodedAllocTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedAllocTextLen());
	}

	public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocTextLen() {
		return isSetField(360);
	}

	public void set(quickfix.field.EncodedAllocText value) {
		setField(value);
	}

	public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
		return get(new quickfix.field.EncodedAllocText());
	}

	public boolean isSet(quickfix.field.EncodedAllocText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocText() {
		return isSetField(361);
	}

	public void set(quickfix.field.ExecBroker value) {
		setField(value);
	}

	public quickfix.field.ExecBroker get(quickfix.field.ExecBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecBroker getExecBroker() throws FieldNotFound {
		return get(new quickfix.field.ExecBroker());
	}

	public boolean isSet(quickfix.field.ExecBroker field) {
		return isSetField(field);
	}

	public boolean isSetExecBroker() {
		return isSetField(76);
	}

	public void set(quickfix.field.ClientID value) {
		setField(value);
	}

	public quickfix.field.ClientID get(quickfix.field.ClientID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClientID getClientID() throws FieldNotFound {
		return get(new quickfix.field.ClientID());
	}

	public boolean isSet(quickfix.field.ClientID field) {
		return isSetField(field);
	}

	public boolean isSetClientID() {
		return isSetField(109);
	}

	public void set(quickfix.field.Commission value) {
		setField(value);
	}

	public quickfix.field.Commission get(quickfix.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Commission getCommission() throws FieldNotFound {
		return get(new quickfix.field.Commission());
	}

	public boolean isSet(quickfix.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(quickfix.field.CommType value) {
		setField(value);
	}

	public quickfix.field.CommType get(quickfix.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CommType getCommType() throws FieldNotFound {
		return get(new quickfix.field.CommType());
	}

	public boolean isSet(quickfix.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(quickfix.field.AllocAvgPx value) {
		setField(value);
	}

	public quickfix.field.AllocAvgPx get(quickfix.field.AllocAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAvgPx getAllocAvgPx() throws FieldNotFound {
		return get(new quickfix.field.AllocAvgPx());
	}

	public boolean isSet(quickfix.field.AllocAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAllocAvgPx() {
		return isSetField(153);
	}

	public void set(quickfix.field.AllocNetMoney value) {
		setField(value);
	}

	public quickfix.field.AllocNetMoney get(quickfix.field.AllocNetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocNetMoney getAllocNetMoney() throws FieldNotFound {
		return get(new quickfix.field.AllocNetMoney());
	}

	public boolean isSet(quickfix.field.AllocNetMoney field) {
		return isSetField(field);
	}

	public boolean isSetAllocNetMoney() {
		return isSetField(154);
	}

	public void set(quickfix.field.SettlCurrAmt value) {
		setField(value);
	}

	public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrAmt());
	}

	public boolean isSet(quickfix.field.SettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrAmt() {
		return isSetField(119);
	}

	public void set(quickfix.field.SettlCurrency value) {
		setField(value);
	}

	public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrency());
	}

	public boolean isSet(quickfix.field.SettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrency() {
		return isSetField(120);
	}

	public void set(quickfix.field.SettlCurrFxRate value) {
		setField(value);
	}

	public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrFxRate());
	}

	public boolean isSet(quickfix.field.SettlCurrFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRate() {
		return isSetField(155);
	}

	public void set(quickfix.field.SettlCurrFxRateCalc value) {
		setField(value);
	}

	public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrFxRateCalc());
	}

	public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRateCalc() {
		return isSetField(156);
	}

	public void set(quickfix.field.AccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.AccruedInterestAmt get(quickfix.field.AccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.AccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.AccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestAmt() {
		return isSetField(159);
	}

	public void set(quickfix.field.SettlInstMode value) {
		setField(value);
	}

	public quickfix.field.SettlInstMode get(quickfix.field.SettlInstMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstMode getSettlInstMode() throws FieldNotFound {
		return get(new quickfix.field.SettlInstMode());
	}

	public boolean isSet(quickfix.field.SettlInstMode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMode() {
		return isSetField(160);
	}

	public void set(quickfix.field.NoMiscFees value) {
		setField(value);
	}

	public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
		return get(new quickfix.field.NoMiscFees());
	}

	public boolean isSet(quickfix.field.NoMiscFees field) {
		return isSetField(field);
	}

	public boolean isSetNoMiscFees() {
		return isSetField(136);
	}

	public static class NoMiscFees extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {137, 138, 139, 0};

		public NoMiscFees() {
			super(136, 137, ORDER);
		}
		
	public void set(quickfix.field.MiscFeeAmt value) {
		setField(value);
	}

	public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeAmt());
	}

	public boolean isSet(quickfix.field.MiscFeeAmt field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeAmt() {
		return isSetField(137);
	}

	public void set(quickfix.field.MiscFeeCurr value) {
		setField(value);
	}

	public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeCurr());
	}

	public boolean isSet(quickfix.field.MiscFeeCurr field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeCurr() {
		return isSetField(138);
	}

	public void set(quickfix.field.MiscFeeType value) {
		setField(value);
	}

	public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeType());
	}

	public boolean isSet(quickfix.field.MiscFeeType field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeType() {
		return isSetField(139);
	}

	}

	}

}
