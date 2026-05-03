
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradeCaptureReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AE";
	

	public TradeCaptureReport() {
		
		super(new int[] {571, 487, 856, 568, 828, 829, 855, 830, 150, 748, 912, 325, 263, 572, 881, 818, 820, 880, 17, 39, 527, 378, 570, 423, 55, 65, 48, 22, 454, 460, 461, 167, 762, 200, 541, 201, 224, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 691, 667, 875, 876, 864, 873, 874, 913, 914, 915, 918, 788, 916, 917, 919, 898, 38, 152, 516, 468, 469, 854, 235, 236, 701, 696, 697, 698, 711, 822, 823, 32, 31, 669, 194, 195, 30, 75, 715, 6, 218, 220, 221, 222, 662, 663, 699, 761, 819, 753, 442, 824, 555, 60, 768, 63, 64, 573, 574, 552, 797, 852, 853,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public TradeCaptureReport(quickfix.field.TradeReportID tradeReportID, quickfix.field.PreviouslyReported previouslyReported, quickfix.field.LastQty lastQty, quickfix.field.LastPx lastPx, quickfix.field.TradeDate tradeDate, quickfix.field.TransactTime transactTime) {
		this();
		setField(tradeReportID);
		setField(previouslyReported);
		setField(lastQty);
		setField(lastPx);
		setField(tradeDate);
		setField(transactTime);
	}
	
	public void set(quickfix.field.TradeReportID value) {
		setField(value);
	}

	public quickfix.field.TradeReportID get(quickfix.field.TradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeReportID getTradeReportID() throws FieldNotFound {
		return get(new quickfix.field.TradeReportID());
	}

	public boolean isSet(quickfix.field.TradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportID() {
		return isSetField(571);
	}

	public void set(quickfix.field.TradeReportTransType value) {
		setField(value);
	}

	public quickfix.field.TradeReportTransType get(quickfix.field.TradeReportTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeReportTransType getTradeReportTransType() throws FieldNotFound {
		return get(new quickfix.field.TradeReportTransType());
	}

	public boolean isSet(quickfix.field.TradeReportTransType field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportTransType() {
		return isSetField(487);
	}

	public void set(quickfix.field.TradeReportType value) {
		setField(value);
	}

	public quickfix.field.TradeReportType get(quickfix.field.TradeReportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeReportType getTradeReportType() throws FieldNotFound {
		return get(new quickfix.field.TradeReportType());
	}

	public boolean isSet(quickfix.field.TradeReportType field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportType() {
		return isSetField(856);
	}

	public void set(quickfix.field.TradeRequestID value) {
		setField(value);
	}

	public quickfix.field.TradeRequestID get(quickfix.field.TradeRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeRequestID getTradeRequestID() throws FieldNotFound {
		return get(new quickfix.field.TradeRequestID());
	}

	public boolean isSet(quickfix.field.TradeRequestID field) {
		return isSetField(field);
	}

	public boolean isSetTradeRequestID() {
		return isSetField(568);
	}

	public void set(quickfix.field.TrdType value) {
		setField(value);
	}

	public quickfix.field.TrdType get(quickfix.field.TrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdType getTrdType() throws FieldNotFound {
		return get(new quickfix.field.TrdType());
	}

	public boolean isSet(quickfix.field.TrdType field) {
		return isSetField(field);
	}

	public boolean isSetTrdType() {
		return isSetField(828);
	}

	public void set(quickfix.field.TrdSubType value) {
		setField(value);
	}

	public quickfix.field.TrdSubType get(quickfix.field.TrdSubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdSubType getTrdSubType() throws FieldNotFound {
		return get(new quickfix.field.TrdSubType());
	}

	public boolean isSet(quickfix.field.TrdSubType field) {
		return isSetField(field);
	}

	public boolean isSetTrdSubType() {
		return isSetField(829);
	}

	public void set(quickfix.field.SecondaryTrdType value) {
		setField(value);
	}

	public quickfix.field.SecondaryTrdType get(quickfix.field.SecondaryTrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryTrdType getSecondaryTrdType() throws FieldNotFound {
		return get(new quickfix.field.SecondaryTrdType());
	}

	public boolean isSet(quickfix.field.SecondaryTrdType field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTrdType() {
		return isSetField(855);
	}

	public void set(quickfix.field.TransferReason value) {
		setField(value);
	}

	public quickfix.field.TransferReason get(quickfix.field.TransferReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransferReason getTransferReason() throws FieldNotFound {
		return get(new quickfix.field.TransferReason());
	}

	public boolean isSet(quickfix.field.TransferReason field) {
		return isSetField(field);
	}

	public boolean isSetTransferReason() {
		return isSetField(830);
	}

	public void set(quickfix.field.ExecType value) {
		setField(value);
	}

	public quickfix.field.ExecType get(quickfix.field.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecType getExecType() throws FieldNotFound {
		return get(new quickfix.field.ExecType());
	}

	public boolean isSet(quickfix.field.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
	}

	public void set(quickfix.field.TotNumTradeReports value) {
		setField(value);
	}

	public quickfix.field.TotNumTradeReports get(quickfix.field.TotNumTradeReports value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotNumTradeReports getTotNumTradeReports() throws FieldNotFound {
		return get(new quickfix.field.TotNumTradeReports());
	}

	public boolean isSet(quickfix.field.TotNumTradeReports field) {
		return isSetField(field);
	}

	public boolean isSetTotNumTradeReports() {
		return isSetField(748);
	}

	public void set(quickfix.field.LastRptRequested value) {
		setField(value);
	}

	public quickfix.field.LastRptRequested get(quickfix.field.LastRptRequested value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastRptRequested getLastRptRequested() throws FieldNotFound {
		return get(new quickfix.field.LastRptRequested());
	}

	public boolean isSet(quickfix.field.LastRptRequested field) {
		return isSetField(field);
	}

	public boolean isSetLastRptRequested() {
		return isSetField(912);
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

	public void set(quickfix.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.field.SubscriptionRequestType get(quickfix.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

	public void set(quickfix.field.TradeReportRefID value) {
		setField(value);
	}

	public quickfix.field.TradeReportRefID get(quickfix.field.TradeReportRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeReportRefID getTradeReportRefID() throws FieldNotFound {
		return get(new quickfix.field.TradeReportRefID());
	}

	public boolean isSet(quickfix.field.TradeReportRefID field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportRefID() {
		return isSetField(572);
	}

	public void set(quickfix.field.SecondaryTradeReportRefID value) {
		setField(value);
	}

	public quickfix.field.SecondaryTradeReportRefID get(quickfix.field.SecondaryTradeReportRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryTradeReportRefID getSecondaryTradeReportRefID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryTradeReportRefID());
	}

	public boolean isSet(quickfix.field.SecondaryTradeReportRefID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTradeReportRefID() {
		return isSetField(881);
	}

	public void set(quickfix.field.SecondaryTradeReportID value) {
		setField(value);
	}

	public quickfix.field.SecondaryTradeReportID get(quickfix.field.SecondaryTradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryTradeReportID getSecondaryTradeReportID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryTradeReportID());
	}

	public boolean isSet(quickfix.field.SecondaryTradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTradeReportID() {
		return isSetField(818);
	}

	public void set(quickfix.field.TradeLinkID value) {
		setField(value);
	}

	public quickfix.field.TradeLinkID get(quickfix.field.TradeLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeLinkID getTradeLinkID() throws FieldNotFound {
		return get(new quickfix.field.TradeLinkID());
	}

	public boolean isSet(quickfix.field.TradeLinkID field) {
		return isSetField(field);
	}

	public boolean isSetTradeLinkID() {
		return isSetField(820);
	}

	public void set(quickfix.field.TrdMatchID value) {
		setField(value);
	}

	public quickfix.field.TrdMatchID get(quickfix.field.TrdMatchID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdMatchID getTrdMatchID() throws FieldNotFound {
		return get(new quickfix.field.TrdMatchID());
	}

	public boolean isSet(quickfix.field.TrdMatchID field) {
		return isSetField(field);
	}

	public boolean isSetTrdMatchID() {
		return isSetField(880);
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

	public void set(quickfix.field.SecondaryExecID value) {
		setField(value);
	}

	public quickfix.field.SecondaryExecID get(quickfix.field.SecondaryExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryExecID());
	}

	public boolean isSet(quickfix.field.SecondaryExecID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryExecID() {
		return isSetField(527);
	}

	public void set(quickfix.field.ExecRestatementReason value) {
		setField(value);
	}

	public quickfix.field.ExecRestatementReason get(quickfix.field.ExecRestatementReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecRestatementReason getExecRestatementReason() throws FieldNotFound {
		return get(new quickfix.field.ExecRestatementReason());
	}

	public boolean isSet(quickfix.field.ExecRestatementReason field) {
		return isSetField(field);
	}

	public boolean isSetExecRestatementReason() {
		return isSetField(378);
	}

	public void set(quickfix.field.PreviouslyReported value) {
		setField(value);
	}

	public quickfix.field.PreviouslyReported get(quickfix.field.PreviouslyReported value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PreviouslyReported getPreviouslyReported() throws FieldNotFound {
		return get(new quickfix.field.PreviouslyReported());
	}

	public boolean isSet(quickfix.field.PreviouslyReported field) {
		return isSetField(field);
	}

	public boolean isSetPreviouslyReported() {
		return isSetField(570);
	}

	public void set(quickfix.field.PriceType value) {
		setField(value);
	}

	public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceType getPriceType() throws FieldNotFound {
		return get(new quickfix.field.PriceType());
	}

	public boolean isSet(quickfix.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
	}

	public void set(quickfix.fix44.component.Instrument component) {
		setComponent(component);
	}

	public quickfix.fix44.component.Instrument get(quickfix.fix44.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.Instrument getInstrument() throws FieldNotFound {
		return get(new quickfix.fix44.component.Instrument());
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

	public void set(quickfix.field.SecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityIDSource());
	}

	public boolean isSet(quickfix.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.field.NoSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(quickfix.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltID());
	}

	public boolean isSet(quickfix.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(quickfix.field.SecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(quickfix.field.Product value) {
		setField(value);
	}

	public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Product getProduct() throws FieldNotFound {
		return get(new quickfix.field.Product());
	}

	public boolean isSet(quickfix.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(quickfix.field.CFICode value) {
		setField(value);
	}

	public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.field.CFICode());
	}

	public boolean isSet(quickfix.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
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

	public void set(quickfix.field.SecuritySubType value) {
		setField(value);
	}

	public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.SecuritySubType());
	}

	public boolean isSet(quickfix.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
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

	public void set(quickfix.field.MaturityDate value) {
		setField(value);
	}

	public quickfix.field.MaturityDate get(quickfix.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.MaturityDate());
	}

	public boolean isSet(quickfix.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
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

	public void set(quickfix.field.CouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.CouponPaymentDate get(quickfix.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.CouponPaymentDate());
	}

	public boolean isSet(quickfix.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(quickfix.field.IssueDate value) {
		setField(value);
	}

	public quickfix.field.IssueDate get(quickfix.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new quickfix.field.IssueDate());
	}

	public boolean isSet(quickfix.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(quickfix.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.RepoCollateralSecurityType get(quickfix.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.RepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(quickfix.field.RepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.RepurchaseTerm get(quickfix.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseTerm());
	}

	public boolean isSet(quickfix.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(quickfix.field.RepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.RepurchaseRate get(quickfix.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseRate());
	}

	public boolean isSet(quickfix.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(quickfix.field.Factor value) {
		setField(value);
	}

	public quickfix.field.Factor get(quickfix.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Factor getFactor() throws FieldNotFound {
		return get(new quickfix.field.Factor());
	}

	public boolean isSet(quickfix.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(quickfix.field.CreditRating value) {
		setField(value);
	}

	public quickfix.field.CreditRating get(quickfix.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new quickfix.field.CreditRating());
	}

	public boolean isSet(quickfix.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(quickfix.field.InstrRegistry value) {
		setField(value);
	}

	public quickfix.field.InstrRegistry get(quickfix.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.InstrRegistry());
	}

	public boolean isSet(quickfix.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(quickfix.field.CountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.CountryOfIssue get(quickfix.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.CountryOfIssue());
	}

	public boolean isSet(quickfix.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(quickfix.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.StateOrProvinceOfIssue get(quickfix.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(quickfix.field.LocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LocaleOfIssue get(quickfix.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(quickfix.field.RedemptionDate value) {
		setField(value);
	}

	public quickfix.field.RedemptionDate get(quickfix.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.RedemptionDate());
	}

	public boolean isSet(quickfix.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
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

	public void set(quickfix.field.StrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.StrikeCurrency get(quickfix.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.StrikeCurrency());
	}

	public boolean isSet(quickfix.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
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

	public void set(quickfix.field.Pool value) {
		setField(value);
	}

	public quickfix.field.Pool get(quickfix.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Pool getPool() throws FieldNotFound {
		return get(new quickfix.field.Pool());
	}

	public boolean isSet(quickfix.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(quickfix.field.ContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.ContractSettlMonth get(quickfix.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.ContractSettlMonth());
	}

	public boolean isSet(quickfix.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(quickfix.field.CPProgram value) {
		setField(value);
	}

	public quickfix.field.CPProgram get(quickfix.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new quickfix.field.CPProgram());
	}

	public boolean isSet(quickfix.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(quickfix.field.CPRegType value) {
		setField(value);
	}

	public quickfix.field.CPRegType get(quickfix.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new quickfix.field.CPRegType());
	}

	public boolean isSet(quickfix.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(quickfix.field.NoEvents value) {
		setField(value);
	}

	public quickfix.field.NoEvents get(quickfix.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new quickfix.field.NoEvents());
	}

	public boolean isSet(quickfix.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(quickfix.field.EventType value) {
		setField(value);
	}

	public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventType getEventType() throws FieldNotFound {
		return get(new quickfix.field.EventType());
	}

	public boolean isSet(quickfix.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(quickfix.field.EventDate value) {
		setField(value);
	}

	public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventDate getEventDate() throws FieldNotFound {
		return get(new quickfix.field.EventDate());
	}

	public boolean isSet(quickfix.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(quickfix.field.EventPx value) {
		setField(value);
	}

	public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventPx getEventPx() throws FieldNotFound {
		return get(new quickfix.field.EventPx());
	}

	public boolean isSet(quickfix.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(quickfix.field.EventText value) {
		setField(value);
	}

	public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventText getEventText() throws FieldNotFound {
		return get(new quickfix.field.EventText());
	}

	public boolean isSet(quickfix.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(quickfix.field.DatedDate value) {
		setField(value);
	}

	public quickfix.field.DatedDate get(quickfix.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new quickfix.field.DatedDate());
	}

	public boolean isSet(quickfix.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(quickfix.field.InterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.InterestAccrualDate get(quickfix.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.InterestAccrualDate());
	}

	public boolean isSet(quickfix.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(quickfix.fix44.component.FinancingDetails component) {
		setComponent(component);
	}

	public quickfix.fix44.component.FinancingDetails get(quickfix.fix44.component.FinancingDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.FinancingDetails getFinancingDetails() throws FieldNotFound {
		return get(new quickfix.fix44.component.FinancingDetails());
	}

	public void set(quickfix.field.AgreementDesc value) {
		setField(value);
	}

	public quickfix.field.AgreementDesc get(quickfix.field.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new quickfix.field.AgreementDesc());
	}

	public boolean isSet(quickfix.field.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(quickfix.field.AgreementID value) {
		setField(value);
	}

	public quickfix.field.AgreementID get(quickfix.field.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementID getAgreementID() throws FieldNotFound {
		return get(new quickfix.field.AgreementID());
	}

	public boolean isSet(quickfix.field.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(quickfix.field.AgreementDate value) {
		setField(value);
	}

	public quickfix.field.AgreementDate get(quickfix.field.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new quickfix.field.AgreementDate());
	}

	public boolean isSet(quickfix.field.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(quickfix.field.AgreementCurrency value) {
		setField(value);
	}

	public quickfix.field.AgreementCurrency get(quickfix.field.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new quickfix.field.AgreementCurrency());
	}

	public boolean isSet(quickfix.field.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(quickfix.field.TerminationType value) {
		setField(value);
	}

	public quickfix.field.TerminationType get(quickfix.field.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TerminationType getTerminationType() throws FieldNotFound {
		return get(new quickfix.field.TerminationType());
	}

	public boolean isSet(quickfix.field.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(quickfix.field.StartDate value) {
		setField(value);
	}

	public quickfix.field.StartDate get(quickfix.field.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartDate getStartDate() throws FieldNotFound {
		return get(new quickfix.field.StartDate());
	}

	public boolean isSet(quickfix.field.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(quickfix.field.EndDate value) {
		setField(value);
	}

	public quickfix.field.EndDate get(quickfix.field.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndDate getEndDate() throws FieldNotFound {
		return get(new quickfix.field.EndDate());
	}

	public boolean isSet(quickfix.field.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(quickfix.field.DeliveryType value) {
		setField(value);
	}

	public quickfix.field.DeliveryType get(quickfix.field.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new quickfix.field.DeliveryType());
	}

	public boolean isSet(quickfix.field.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(quickfix.field.MarginRatio value) {
		setField(value);
	}

	public quickfix.field.MarginRatio get(quickfix.field.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new quickfix.field.MarginRatio());
	}

	public boolean isSet(quickfix.field.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
	}

	public void set(quickfix.fix44.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.fix44.component.OrderQtyData get(quickfix.fix44.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.fix44.component.OrderQtyData());
	}

	public void set(quickfix.field.OrderQty value) {
		setField(value);
	}

	public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.field.OrderQty());
	}

	public boolean isSet(quickfix.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.field.CashOrderQty value) {
		setField(value);
	}

	public quickfix.field.CashOrderQty get(quickfix.field.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new quickfix.field.CashOrderQty());
	}

	public boolean isSet(quickfix.field.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(quickfix.field.OrderPercent value) {
		setField(value);
	}

	public quickfix.field.OrderPercent get(quickfix.field.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new quickfix.field.OrderPercent());
	}

	public boolean isSet(quickfix.field.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(quickfix.field.RoundingDirection value) {
		setField(value);
	}

	public quickfix.field.RoundingDirection get(quickfix.field.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new quickfix.field.RoundingDirection());
	}

	public boolean isSet(quickfix.field.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(quickfix.field.RoundingModulus value) {
		setField(value);
	}

	public quickfix.field.RoundingModulus get(quickfix.field.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new quickfix.field.RoundingModulus());
	}

	public boolean isSet(quickfix.field.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

	public void set(quickfix.field.QtyType value) {
		setField(value);
	}

	public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QtyType getQtyType() throws FieldNotFound {
		return get(new quickfix.field.QtyType());
	}

	public boolean isSet(quickfix.field.QtyType field) {
		return isSetField(field);
	}

	public boolean isSetQtyType() {
		return isSetField(854);
	}

	public void set(quickfix.fix44.component.YieldData component) {
		setComponent(component);
	}

	public quickfix.fix44.component.YieldData get(quickfix.fix44.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.YieldData getYieldData() throws FieldNotFound {
		return get(new quickfix.fix44.component.YieldData());
	}

	public void set(quickfix.field.YieldType value) {
		setField(value);
	}

	public quickfix.field.YieldType get(quickfix.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldType getYieldType() throws FieldNotFound {
		return get(new quickfix.field.YieldType());
	}

	public boolean isSet(quickfix.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(quickfix.field.Yield value) {
		setField(value);
	}

	public quickfix.field.Yield get(quickfix.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Yield getYield() throws FieldNotFound {
		return get(new quickfix.field.Yield());
	}

	public boolean isSet(quickfix.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(quickfix.field.YieldCalcDate value) {
		setField(value);
	}

	public quickfix.field.YieldCalcDate get(quickfix.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new quickfix.field.YieldCalcDate());
	}

	public boolean isSet(quickfix.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(quickfix.field.YieldRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionDate get(quickfix.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionDate());
	}

	public boolean isSet(quickfix.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(quickfix.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPrice get(quickfix.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPrice());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(quickfix.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPriceType get(quickfix.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPriceType());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

	public void set(quickfix.field.NoUnderlyings value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyings());
	}

	public boolean isSet(quickfix.field.NoUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyings() {
		return isSetField(711);
	}

	public static class NoUnderlyings extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 315, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887, 0};

		public NoUnderlyings() {
			super(711, 311, ORDER);
		}
		
	public void set(quickfix.fix44.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public quickfix.fix44.component.UnderlyingInstrument get(quickfix.fix44.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new quickfix.fix44.component.UnderlyingInstrument());
	}

	public void set(quickfix.field.UnderlyingSymbol value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbol get(quickfix.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbol());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(quickfix.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbolSfx get(quickfix.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(quickfix.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityID get(quickfix.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(quickfix.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityIDSource get(quickfix.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(quickfix.field.UnderlyingProduct value) {
		setField(value);
	}

	public quickfix.field.UnderlyingProduct get(quickfix.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingProduct());
	}

	public boolean isSet(quickfix.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(quickfix.field.UnderlyingCFICode value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCFICode get(quickfix.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCFICode());
	}

	public boolean isSet(quickfix.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(quickfix.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityType get(quickfix.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(quickfix.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecuritySubType get(quickfix.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(quickfix.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityMonthYear get(quickfix.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(quickfix.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityDate get(quickfix.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityDate());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(quickfix.field.UnderlyingPutOrCall value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPutOrCall get(quickfix.field.UnderlyingPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPutOrCall());
	}

	public boolean isSet(quickfix.field.UnderlyingPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPutOrCall() {
		return isSetField(315);
	}

	public void set(quickfix.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponPaymentDate get(quickfix.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(quickfix.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssueDate get(quickfix.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssueDate());
	}

	public boolean isSet(quickfix.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(quickfix.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType get(quickfix.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(quickfix.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseTerm get(quickfix.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(quickfix.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseRate get(quickfix.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(quickfix.field.UnderlyingFactor value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFactor get(quickfix.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFactor());
	}

	public boolean isSet(quickfix.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(quickfix.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCreditRating get(quickfix.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCreditRating());
	}

	public boolean isSet(quickfix.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(quickfix.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrRegistry get(quickfix.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(quickfix.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCountryOfIssue get(quickfix.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(quickfix.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue get(quickfix.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(quickfix.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLocaleOfIssue get(quickfix.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(quickfix.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRedemptionDate get(quickfix.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(quickfix.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(quickfix.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikePrice get(quickfix.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikePrice());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(quickfix.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikeCurrency get(quickfix.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(quickfix.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public quickfix.field.UnderlyingOptAttribute get(quickfix.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingOptAttribute());
	}

	public boolean isSet(quickfix.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(quickfix.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.UnderlyingContractMultiplier get(quickfix.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(quickfix.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(quickfix.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponRate get(quickfix.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponRate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(quickfix.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityExchange get(quickfix.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(quickfix.field.UnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssuer get(quickfix.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuerLen get(quickfix.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuer get(quickfix.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(quickfix.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityDesc get(quickfix.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen get(quickfix.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc get(quickfix.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(quickfix.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPProgram get(quickfix.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPProgram());
	}

	public boolean isSet(quickfix.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(quickfix.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPRegType get(quickfix.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPRegType());
	}

	public boolean isSet(quickfix.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(quickfix.field.UnderlyingCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrency get(quickfix.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(quickfix.field.UnderlyingQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingQty get(quickfix.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingQty());
	}

	public boolean isSet(quickfix.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(quickfix.field.UnderlyingPx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPx get(quickfix.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPx());
	}

	public boolean isSet(quickfix.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(quickfix.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingDirtyPrice get(quickfix.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(quickfix.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndPrice get(quickfix.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(quickfix.field.UnderlyingStartValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStartValue get(quickfix.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStartValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(quickfix.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrentValue get(quickfix.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrentValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(quickfix.field.UnderlyingEndValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndValue get(quickfix.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndValue());
	}

	public boolean isSet(quickfix.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(quickfix.fix44.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public quickfix.fix44.component.UnderlyingStipulations get(quickfix.fix44.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new quickfix.fix44.component.UnderlyingStipulations());
	}

	public void set(quickfix.field.NoUnderlyingStips value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingStips());
	}

	public boolean isSet(quickfix.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingStipType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipType());
	}

	public boolean isSet(quickfix.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(quickfix.field.UnderlyingStipValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	}

	public void set(quickfix.field.UnderlyingTradingSessionID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingTradingSessionID get(quickfix.field.UnderlyingTradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingTradingSessionID getUnderlyingTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingTradingSessionID());
	}

	public boolean isSet(quickfix.field.UnderlyingTradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTradingSessionID() {
		return isSetField(822);
	}

	public void set(quickfix.field.UnderlyingTradingSessionSubID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingTradingSessionSubID get(quickfix.field.UnderlyingTradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingTradingSessionSubID getUnderlyingTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingTradingSessionSubID());
	}

	public boolean isSet(quickfix.field.UnderlyingTradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTradingSessionSubID() {
		return isSetField(823);
	}

	public void set(quickfix.field.LastQty value) {
		setField(value);
	}

	public quickfix.field.LastQty get(quickfix.field.LastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastQty getLastQty() throws FieldNotFound {
		return get(new quickfix.field.LastQty());
	}

	public boolean isSet(quickfix.field.LastQty field) {
		return isSetField(field);
	}

	public boolean isSetLastQty() {
		return isSetField(32);
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

	public void set(quickfix.field.LastParPx value) {
		setField(value);
	}

	public quickfix.field.LastParPx get(quickfix.field.LastParPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastParPx getLastParPx() throws FieldNotFound {
		return get(new quickfix.field.LastParPx());
	}

	public boolean isSet(quickfix.field.LastParPx field) {
		return isSetField(field);
	}

	public boolean isSetLastParPx() {
		return isSetField(669);
	}

	public void set(quickfix.field.LastSpotRate value) {
		setField(value);
	}

	public quickfix.field.LastSpotRate get(quickfix.field.LastSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastSpotRate getLastSpotRate() throws FieldNotFound {
		return get(new quickfix.field.LastSpotRate());
	}

	public boolean isSet(quickfix.field.LastSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetLastSpotRate() {
		return isSetField(194);
	}

	public void set(quickfix.field.LastForwardPoints value) {
		setField(value);
	}

	public quickfix.field.LastForwardPoints get(quickfix.field.LastForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastForwardPoints getLastForwardPoints() throws FieldNotFound {
		return get(new quickfix.field.LastForwardPoints());
	}

	public boolean isSet(quickfix.field.LastForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetLastForwardPoints() {
		return isSetField(195);
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

	public void set(quickfix.field.ClearingBusinessDate value) {
		setField(value);
	}

	public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
		return get(new quickfix.field.ClearingBusinessDate());
	}

	public boolean isSet(quickfix.field.ClearingBusinessDate field) {
		return isSetField(field);
	}

	public boolean isSetClearingBusinessDate() {
		return isSetField(715);
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

	public void set(quickfix.fix44.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public quickfix.fix44.component.SpreadOrBenchmarkCurveData get(quickfix.fix44.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new quickfix.fix44.component.SpreadOrBenchmarkCurveData());
	}

	public void set(quickfix.field.Spread value) {
		setField(value);
	}

	public quickfix.field.Spread get(quickfix.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Spread getSpread() throws FieldNotFound {
		return get(new quickfix.field.Spread());
	}

	public boolean isSet(quickfix.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(quickfix.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveCurrency get(quickfix.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(quickfix.field.BenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveName get(quickfix.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveName());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(quickfix.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurvePoint get(quickfix.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(quickfix.field.BenchmarkPrice value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPrice get(quickfix.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPrice());
	}

	public boolean isSet(quickfix.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(quickfix.field.BenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPriceType get(quickfix.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPriceType());
	}

	public boolean isSet(quickfix.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(quickfix.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityID get(quickfix.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityID());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(quickfix.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityIDSource get(quickfix.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

	public void set(quickfix.field.AvgPxIndicator value) {
		setField(value);
	}

	public quickfix.field.AvgPxIndicator get(quickfix.field.AvgPxIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPxIndicator getAvgPxIndicator() throws FieldNotFound {
		return get(new quickfix.field.AvgPxIndicator());
	}

	public boolean isSet(quickfix.field.AvgPxIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAvgPxIndicator() {
		return isSetField(819);
	}

	public void set(quickfix.fix44.component.PositionAmountData component) {
		setComponent(component);
	}

	public quickfix.fix44.component.PositionAmountData get(quickfix.fix44.component.PositionAmountData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.PositionAmountData getPositionAmountData() throws FieldNotFound {
		return get(new quickfix.fix44.component.PositionAmountData());
	}

	public void set(quickfix.field.NoPosAmt value) {
		setField(value);
	}

	public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
		return get(new quickfix.field.NoPosAmt());
	}

	public boolean isSet(quickfix.field.NoPosAmt field) {
		return isSetField(field);
	}

	public boolean isSetNoPosAmt() {
		return isSetField(753);
	}

	public static class NoPosAmt extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {707, 708, 0};

		public NoPosAmt() {
			super(753, 707, ORDER);
		}
		
	public void set(quickfix.field.PosAmtType value) {
		setField(value);
	}

	public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
		return get(new quickfix.field.PosAmtType());
	}

	public boolean isSet(quickfix.field.PosAmtType field) {
		return isSetField(field);
	}

	public boolean isSetPosAmtType() {
		return isSetField(707);
	}

	public void set(quickfix.field.PosAmt value) {
		setField(value);
	}

	public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
		return get(new quickfix.field.PosAmt());
	}

	public boolean isSet(quickfix.field.PosAmt field) {
		return isSetField(field);
	}

	public boolean isSetPosAmt() {
		return isSetField(708);
	}

	}

	public void set(quickfix.field.MultiLegReportingType value) {
		setField(value);
	}

	public quickfix.field.MultiLegReportingType get(quickfix.field.MultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound {
		return get(new quickfix.field.MultiLegReportingType());
	}

	public boolean isSet(quickfix.field.MultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetMultiLegReportingType() {
		return isSetField(442);
	}

	public void set(quickfix.field.TradeLegRefID value) {
		setField(value);
	}

	public quickfix.field.TradeLegRefID get(quickfix.field.TradeLegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeLegRefID getTradeLegRefID() throws FieldNotFound {
		return get(new quickfix.field.TradeLegRefID());
	}

	public boolean isSet(quickfix.field.TradeLegRefID field) {
		return isSetField(field);
	}

	public boolean isSetTradeLegRefID() {
		return isSetField(824);
	}

	public void set(quickfix.field.NoLegs value) {
		setField(value);
	}

	public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new quickfix.field.NoLegs());
	}

	public boolean isSet(quickfix.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 687, 690, 683, 564, 565, 539, 654, 566, 587, 588, 637, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(quickfix.fix44.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.fix44.component.InstrumentLeg get(quickfix.fix44.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.fix44.component.InstrumentLeg());
	}

	public void set(quickfix.field.LegSymbol value) {
		setField(value);
	}

	public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new quickfix.field.LegSymbol());
	}

	public boolean isSet(quickfix.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(quickfix.field.LegSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.LegSymbolSfx get(quickfix.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.LegSymbolSfx());
	}

	public boolean isSet(quickfix.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(quickfix.field.LegSecurityID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityID get(quickfix.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityID());
	}

	public boolean isSet(quickfix.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(quickfix.field.LegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityIDSource get(quickfix.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(quickfix.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoLegSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(quickfix.field.LegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltID());
	}

	public boolean isSet(quickfix.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(quickfix.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(quickfix.field.LegProduct value) {
		setField(value);
	}

	public quickfix.field.LegProduct get(quickfix.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new quickfix.field.LegProduct());
	}

	public boolean isSet(quickfix.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(quickfix.field.LegCFICode value) {
		setField(value);
	}

	public quickfix.field.LegCFICode get(quickfix.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new quickfix.field.LegCFICode());
	}

	public boolean isSet(quickfix.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(quickfix.field.LegSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegSecurityType get(quickfix.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityType());
	}

	public boolean isSet(quickfix.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(quickfix.field.LegSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.LegSecuritySubType get(quickfix.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.LegSecuritySubType());
	}

	public boolean isSet(quickfix.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(quickfix.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.LegMaturityMonthYear get(quickfix.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(quickfix.field.LegMaturityDate value) {
		setField(value);
	}

	public quickfix.field.LegMaturityDate get(quickfix.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityDate());
	}

	public boolean isSet(quickfix.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(quickfix.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.LegCouponPaymentDate get(quickfix.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(quickfix.field.LegIssueDate value) {
		setField(value);
	}

	public quickfix.field.LegIssueDate get(quickfix.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new quickfix.field.LegIssueDate());
	}

	public boolean isSet(quickfix.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(quickfix.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegRepoCollateralSecurityType get(quickfix.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(quickfix.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseTerm get(quickfix.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(quickfix.field.LegRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseRate get(quickfix.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseRate());
	}

	public boolean isSet(quickfix.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(quickfix.field.LegFactor value) {
		setField(value);
	}

	public quickfix.field.LegFactor get(quickfix.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new quickfix.field.LegFactor());
	}

	public boolean isSet(quickfix.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(quickfix.field.LegCreditRating value) {
		setField(value);
	}

	public quickfix.field.LegCreditRating get(quickfix.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new quickfix.field.LegCreditRating());
	}

	public boolean isSet(quickfix.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(quickfix.field.LegInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.LegInstrRegistry get(quickfix.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.LegInstrRegistry());
	}

	public boolean isSet(quickfix.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(quickfix.field.LegCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegCountryOfIssue get(quickfix.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegCountryOfIssue());
	}

	public boolean isSet(quickfix.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(quickfix.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegStateOrProvinceOfIssue get(quickfix.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(quickfix.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegLocaleOfIssue get(quickfix.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(quickfix.field.LegRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.LegRedemptionDate get(quickfix.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.LegRedemptionDate());
	}

	public boolean isSet(quickfix.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(quickfix.field.LegStrikePrice value) {
		setField(value);
	}

	public quickfix.field.LegStrikePrice get(quickfix.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.LegStrikePrice());
	}

	public boolean isSet(quickfix.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(quickfix.field.LegStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.LegStrikeCurrency get(quickfix.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegStrikeCurrency());
	}

	public boolean isSet(quickfix.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(quickfix.field.LegOptAttribute value) {
		setField(value);
	}

	public quickfix.field.LegOptAttribute get(quickfix.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.LegOptAttribute());
	}

	public boolean isSet(quickfix.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(quickfix.field.LegContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.LegContractMultiplier get(quickfix.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.LegContractMultiplier());
	}

	public boolean isSet(quickfix.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(quickfix.field.LegCouponRate value) {
		setField(value);
	}

	public quickfix.field.LegCouponRate get(quickfix.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponRate());
	}

	public boolean isSet(quickfix.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(quickfix.field.LegSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.LegSecurityExchange get(quickfix.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityExchange());
	}

	public boolean isSet(quickfix.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(quickfix.field.LegIssuer value) {
		setField(value);
	}

	public quickfix.field.LegIssuer get(quickfix.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.LegIssuer());
	}

	public boolean isSet(quickfix.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(quickfix.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuerLen get(quickfix.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(quickfix.field.EncodedLegIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuer get(quickfix.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuer());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(quickfix.field.LegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.LegSecurityDesc get(quickfix.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityDesc());
	}

	public boolean isSet(quickfix.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(quickfix.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDescLen get(quickfix.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(quickfix.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDesc get(quickfix.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(quickfix.field.LegRatioQty value) {
		setField(value);
	}

	public quickfix.field.LegRatioQty get(quickfix.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new quickfix.field.LegRatioQty());
	}

	public boolean isSet(quickfix.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(quickfix.field.LegSide value) {
		setField(value);
	}

	public quickfix.field.LegSide get(quickfix.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSide getLegSide() throws FieldNotFound {
		return get(new quickfix.field.LegSide());
	}

	public boolean isSet(quickfix.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(quickfix.field.LegCurrency value) {
		setField(value);
	}

	public quickfix.field.LegCurrency get(quickfix.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegCurrency());
	}

	public boolean isSet(quickfix.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(quickfix.field.LegPool value) {
		setField(value);
	}

	public quickfix.field.LegPool get(quickfix.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPool getLegPool() throws FieldNotFound {
		return get(new quickfix.field.LegPool());
	}

	public boolean isSet(quickfix.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(quickfix.field.LegDatedDate value) {
		setField(value);
	}

	public quickfix.field.LegDatedDate get(quickfix.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new quickfix.field.LegDatedDate());
	}

	public boolean isSet(quickfix.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(quickfix.field.LegContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.LegContractSettlMonth get(quickfix.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.LegContractSettlMonth());
	}

	public boolean isSet(quickfix.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(quickfix.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.LegInterestAccrualDate get(quickfix.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.LegInterestAccrualDate());
	}

	public boolean isSet(quickfix.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	public void set(quickfix.field.LegQty value) {
		setField(value);
	}

	public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegQty getLegQty() throws FieldNotFound {
		return get(new quickfix.field.LegQty());
	}

	public boolean isSet(quickfix.field.LegQty field) {
		return isSetField(field);
	}

	public boolean isSetLegQty() {
		return isSetField(687);
	}

	public void set(quickfix.field.LegSwapType value) {
		setField(value);
	}

	public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
		return get(new quickfix.field.LegSwapType());
	}

	public boolean isSet(quickfix.field.LegSwapType field) {
		return isSetField(field);
	}

	public boolean isSetLegSwapType() {
		return isSetField(690);
	}

	public void set(quickfix.fix44.component.LegStipulations component) {
		setComponent(component);
	}

	public quickfix.fix44.component.LegStipulations get(quickfix.fix44.component.LegStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.LegStipulations getLegStipulations() throws FieldNotFound {
		return get(new quickfix.fix44.component.LegStipulations());
	}

	public void set(quickfix.field.NoLegStipulations value) {
		setField(value);
	}

	public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoLegStipulations());
	}

	public boolean isSet(quickfix.field.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(quickfix.field.LegStipulationType value) {
		setField(value);
	}

	public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationType());
	}

	public boolean isSet(quickfix.field.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(quickfix.field.LegStipulationValue value) {
		setField(value);
	}

	public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationValue());
	}

	public boolean isSet(quickfix.field.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

	public void set(quickfix.field.LegPositionEffect value) {
		setField(value);
	}

	public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.LegPositionEffect());
	}

	public boolean isSet(quickfix.field.LegPositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetLegPositionEffect() {
		return isSetField(564);
	}

	public void set(quickfix.field.LegCoveredOrUncovered value) {
		setField(value);
	}

	public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
		return get(new quickfix.field.LegCoveredOrUncovered());
	}

	public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
		return isSetField(field);
	}

	public boolean isSetLegCoveredOrUncovered() {
		return isSetField(565);
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

	public void set(quickfix.field.LegRefID value) {
		setField(value);
	}

	public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
		return get(new quickfix.field.LegRefID());
	}

	public boolean isSet(quickfix.field.LegRefID field) {
		return isSetField(field);
	}

	public boolean isSetLegRefID() {
		return isSetField(654);
	}

	public void set(quickfix.field.LegPrice value) {
		setField(value);
	}

	public quickfix.field.LegPrice get(quickfix.field.LegPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPrice getLegPrice() throws FieldNotFound {
		return get(new quickfix.field.LegPrice());
	}

	public boolean isSet(quickfix.field.LegPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegPrice() {
		return isSetField(566);
	}

	public void set(quickfix.field.LegSettlType value) {
		setField(value);
	}

	public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
		return get(new quickfix.field.LegSettlType());
	}

	public boolean isSet(quickfix.field.LegSettlType field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlType() {
		return isSetField(587);
	}

	public void set(quickfix.field.LegSettlDate value) {
		setField(value);
	}

	public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
		return get(new quickfix.field.LegSettlDate());
	}

	public boolean isSet(quickfix.field.LegSettlDate field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlDate() {
		return isSetField(588);
	}

	public void set(quickfix.field.LegLastPx value) {
		setField(value);
	}

	public quickfix.field.LegLastPx get(quickfix.field.LegLastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound {
		return get(new quickfix.field.LegLastPx());
	}

	public boolean isSet(quickfix.field.LegLastPx field) {
		return isSetField(field);
	}

	public boolean isSetLegLastPx() {
		return isSetField(637);
	}

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

	public void set(quickfix.fix44.component.TrdRegTimestamps component) {
		setComponent(component);
	}

	public quickfix.fix44.component.TrdRegTimestamps get(quickfix.fix44.component.TrdRegTimestamps component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.TrdRegTimestamps getTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.fix44.component.TrdRegTimestamps());
	}

	public void set(quickfix.field.NoTrdRegTimestamps value) {
		setField(value);
	}

	public quickfix.field.NoTrdRegTimestamps get(quickfix.field.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.field.NoTrdRegTimestamps());
	}

	public boolean isSet(quickfix.field.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(quickfix.field.TrdRegTimestamp value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestamp get(quickfix.field.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestamp());
	}

	public boolean isSet(quickfix.field.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(quickfix.field.TrdRegTimestampType value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampType get(quickfix.field.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampType());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(quickfix.field.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampOrigin get(quickfix.field.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampOrigin());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	}

	public void set(quickfix.field.SettlType value) {
		setField(value);
	}

	public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.field.SettlType());
	}

	public boolean isSet(quickfix.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.field.SettlDate value) {
		setField(value);
	}

	public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new quickfix.field.SettlDate());
	}

	public boolean isSet(quickfix.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
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

	public void set(quickfix.field.MatchType value) {
		setField(value);
	}

	public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchType getMatchType() throws FieldNotFound {
		return get(new quickfix.field.MatchType());
	}

	public boolean isSet(quickfix.field.MatchType field) {
		return isSetField(field);
	}

	public boolean isSetMatchType() {
		return isSetField(574);
	}

	public void set(quickfix.field.NoSides value) {
		setField(value);
	}

	public quickfix.field.NoSides get(quickfix.field.NoSides value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSides getNoSides() throws FieldNotFound {
		return get(new quickfix.field.NoSides());
	}

	public boolean isSet(quickfix.field.NoSides field) {
		return isSetField(field);
	}

	public boolean isSetNoSides() {
		return isSetField(552);
	}

	public static class NoSides extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {54, 37, 198, 11, 526, 66, 453, 1, 660, 581, 81, 575, 576, 635, 578, 579, 821, 15, 376, 377, 528, 529, 582, 40, 18, 483, 336, 625, 943, 12, 13, 479, 497, 381, 157, 230, 158, 159, 738, 920, 921, 922, 238, 237, 118, 119, 120, 155, 156, 77, 58, 354, 355, 752, 518, 232, 136, 825, 826, 591, 70, 78, 0};

		public NoSides() {
			super(552, 54, ORDER);
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

	public void set(quickfix.field.SecondaryClOrdID value) {
		setField(value);
	}

	public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryClOrdID());
	}

	public boolean isSet(quickfix.field.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
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

	public void set(quickfix.field.AccountType value) {
		setField(value);
	}

	public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccountType getAccountType() throws FieldNotFound {
		return get(new quickfix.field.AccountType());
	}

	public boolean isSet(quickfix.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
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

	public void set(quickfix.field.OddLot value) {
		setField(value);
	}

	public quickfix.field.OddLot get(quickfix.field.OddLot value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OddLot getOddLot() throws FieldNotFound {
		return get(new quickfix.field.OddLot());
	}

	public boolean isSet(quickfix.field.OddLot field) {
		return isSetField(field);
	}

	public boolean isSetOddLot() {
		return isSetField(575);
	}

	public void set(quickfix.field.NoClearingInstructions value) {
		setField(value);
	}

	public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
		return get(new quickfix.field.NoClearingInstructions());
	}

	public boolean isSet(quickfix.field.NoClearingInstructions field) {
		return isSetField(field);
	}

	public boolean isSetNoClearingInstructions() {
		return isSetField(576);
	}

	public static class NoClearingInstructions extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {577, 0};

		public NoClearingInstructions() {
			super(576, 577, ORDER);
		}
		
	public void set(quickfix.field.ClearingInstruction value) {
		setField(value);
	}

	public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
		return get(new quickfix.field.ClearingInstruction());
	}

	public boolean isSet(quickfix.field.ClearingInstruction field) {
		return isSetField(field);
	}

	public boolean isSetClearingInstruction() {
		return isSetField(577);
	}

	}

	public void set(quickfix.field.ClearingFeeIndicator value) {
		setField(value);
	}

	public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
		return get(new quickfix.field.ClearingFeeIndicator());
	}

	public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
		return isSetField(field);
	}

	public boolean isSetClearingFeeIndicator() {
		return isSetField(635);
	}

	public void set(quickfix.field.TradeInputSource value) {
		setField(value);
	}

	public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
		return get(new quickfix.field.TradeInputSource());
	}

	public boolean isSet(quickfix.field.TradeInputSource field) {
		return isSetField(field);
	}

	public boolean isSetTradeInputSource() {
		return isSetField(578);
	}

	public void set(quickfix.field.TradeInputDevice value) {
		setField(value);
	}

	public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
		return get(new quickfix.field.TradeInputDevice());
	}

	public boolean isSet(quickfix.field.TradeInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetTradeInputDevice() {
		return isSetField(579);
	}

	public void set(quickfix.field.OrderInputDevice value) {
		setField(value);
	}

	public quickfix.field.OrderInputDevice get(quickfix.field.OrderInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderInputDevice getOrderInputDevice() throws FieldNotFound {
		return get(new quickfix.field.OrderInputDevice());
	}

	public boolean isSet(quickfix.field.OrderInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetOrderInputDevice() {
		return isSetField(821);
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

	public void set(quickfix.field.ComplianceID value) {
		setField(value);
	}

	public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
		return get(new quickfix.field.ComplianceID());
	}

	public boolean isSet(quickfix.field.ComplianceID field) {
		return isSetField(field);
	}

	public boolean isSetComplianceID() {
		return isSetField(376);
	}

	public void set(quickfix.field.SolicitedFlag value) {
		setField(value);
	}

	public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
		return get(new quickfix.field.SolicitedFlag());
	}

	public boolean isSet(quickfix.field.SolicitedFlag field) {
		return isSetField(field);
	}

	public boolean isSetSolicitedFlag() {
		return isSetField(377);
	}

	public void set(quickfix.field.OrderCapacity value) {
		setField(value);
	}

	public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.OrderCapacity());
	}

	public boolean isSet(quickfix.field.OrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrderCapacity() {
		return isSetField(528);
	}

	public void set(quickfix.field.OrderRestrictions value) {
		setField(value);
	}

	public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
		return get(new quickfix.field.OrderRestrictions());
	}

	public boolean isSet(quickfix.field.OrderRestrictions field) {
		return isSetField(field);
	}

	public boolean isSetOrderRestrictions() {
		return isSetField(529);
	}

	public void set(quickfix.field.CustOrderCapacity value) {
		setField(value);
	}

	public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.CustOrderCapacity());
	}

	public boolean isSet(quickfix.field.CustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetCustOrderCapacity() {
		return isSetField(582);
	}

	public void set(quickfix.field.OrdType value) {
		setField(value);
	}

	public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.field.OrdType());
	}

	public boolean isSet(quickfix.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
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

	public void set(quickfix.field.TransBkdTime value) {
		setField(value);
	}

	public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound {
		return get(new quickfix.field.TransBkdTime());
	}

	public boolean isSet(quickfix.field.TransBkdTime field) {
		return isSetField(field);
	}

	public boolean isSetTransBkdTime() {
		return isSetField(483);
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

	public void set(quickfix.field.TradingSessionSubID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionSubID());
	}

	public boolean isSet(quickfix.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(quickfix.field.TimeBracket value) {
		setField(value);
	}

	public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
		return get(new quickfix.field.TimeBracket());
	}

	public boolean isSet(quickfix.field.TimeBracket field) {
		return isSetField(field);
	}

	public boolean isSetTimeBracket() {
		return isSetField(943);
	}

	public void set(quickfix.fix44.component.CommissionData component) {
		setComponent(component);
	}

	public quickfix.fix44.component.CommissionData get(quickfix.fix44.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new quickfix.fix44.component.CommissionData());
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

	public void set(quickfix.field.CommCurrency value) {
		setField(value);
	}

	public quickfix.field.CommCurrency get(quickfix.field.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new quickfix.field.CommCurrency());
	}

	public boolean isSet(quickfix.field.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(quickfix.field.FundRenewWaiv value) {
		setField(value);
	}

	public quickfix.field.FundRenewWaiv get(quickfix.field.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new quickfix.field.FundRenewWaiv());
	}

	public boolean isSet(quickfix.field.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
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

	public void set(quickfix.field.ExDate value) {
		setField(value);
	}

	public quickfix.field.ExDate get(quickfix.field.ExDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExDate getExDate() throws FieldNotFound {
		return get(new quickfix.field.ExDate());
	}

	public boolean isSet(quickfix.field.ExDate field) {
		return isSetField(field);
	}

	public boolean isSetExDate() {
		return isSetField(230);
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

	public void set(quickfix.field.InterestAtMaturity value) {
		setField(value);
	}

	public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
		return get(new quickfix.field.InterestAtMaturity());
	}

	public boolean isSet(quickfix.field.InterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetInterestAtMaturity() {
		return isSetField(738);
	}

	public void set(quickfix.field.EndAccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.EndAccruedInterestAmt get(quickfix.field.EndAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.EndAccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.EndAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetEndAccruedInterestAmt() {
		return isSetField(920);
	}

	public void set(quickfix.field.StartCash value) {
		setField(value);
	}

	public quickfix.field.StartCash get(quickfix.field.StartCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartCash getStartCash() throws FieldNotFound {
		return get(new quickfix.field.StartCash());
	}

	public boolean isSet(quickfix.field.StartCash field) {
		return isSetField(field);
	}

	public boolean isSetStartCash() {
		return isSetField(921);
	}

	public void set(quickfix.field.EndCash value) {
		setField(value);
	}

	public quickfix.field.EndCash get(quickfix.field.EndCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndCash getEndCash() throws FieldNotFound {
		return get(new quickfix.field.EndCash());
	}

	public boolean isSet(quickfix.field.EndCash field) {
		return isSetField(field);
	}

	public boolean isSetEndCash() {
		return isSetField(922);
	}

	public void set(quickfix.field.Concession value) {
		setField(value);
	}

	public quickfix.field.Concession get(quickfix.field.Concession value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Concession getConcession() throws FieldNotFound {
		return get(new quickfix.field.Concession());
	}

	public boolean isSet(quickfix.field.Concession field) {
		return isSetField(field);
	}

	public boolean isSetConcession() {
		return isSetField(238);
	}

	public void set(quickfix.field.TotalTakedown value) {
		setField(value);
	}

	public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
		return get(new quickfix.field.TotalTakedown());
	}

	public boolean isSet(quickfix.field.TotalTakedown field) {
		return isSetField(field);
	}

	public boolean isSetTotalTakedown() {
		return isSetField(237);
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

	public void set(quickfix.field.PositionEffect value) {
		setField(value);
	}

	public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.PositionEffect());
	}

	public boolean isSet(quickfix.field.PositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetPositionEffect() {
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

	public void set(quickfix.field.SideMultiLegReportingType value) {
		setField(value);
	}

	public quickfix.field.SideMultiLegReportingType get(quickfix.field.SideMultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound {
		return get(new quickfix.field.SideMultiLegReportingType());
	}

	public boolean isSet(quickfix.field.SideMultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetSideMultiLegReportingType() {
		return isSetField(752);
	}

	public void set(quickfix.field.NoContAmts value) {
		setField(value);
	}

	public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
		return get(new quickfix.field.NoContAmts());
	}

	public boolean isSet(quickfix.field.NoContAmts field) {
		return isSetField(field);
	}

	public boolean isSetNoContAmts() {
		return isSetField(518);
	}

	public static class NoContAmts extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {519, 520, 521, 0};

		public NoContAmts() {
			super(518, 519, ORDER);
		}
		
	public void set(quickfix.field.ContAmtType value) {
		setField(value);
	}

	public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
		return get(new quickfix.field.ContAmtType());
	}

	public boolean isSet(quickfix.field.ContAmtType field) {
		return isSetField(field);
	}

	public boolean isSetContAmtType() {
		return isSetField(519);
	}

	public void set(quickfix.field.ContAmtValue value) {
		setField(value);
	}

	public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
		return get(new quickfix.field.ContAmtValue());
	}

	public boolean isSet(quickfix.field.ContAmtValue field) {
		return isSetField(field);
	}

	public boolean isSetContAmtValue() {
		return isSetField(520);
	}

	public void set(quickfix.field.ContAmtCurr value) {
		setField(value);
	}

	public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
		return get(new quickfix.field.ContAmtCurr());
	}

	public boolean isSet(quickfix.field.ContAmtCurr field) {
		return isSetField(field);
	}

	public boolean isSetContAmtCurr() {
		return isSetField(521);
	}

	}

	public void set(quickfix.fix44.component.Stipulations component) {
		setComponent(component);
	}

	public quickfix.fix44.component.Stipulations get(quickfix.fix44.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new quickfix.fix44.component.Stipulations());
	}

	public void set(quickfix.field.NoStipulations value) {
		setField(value);
	}

	public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoStipulations());
	}

	public boolean isSet(quickfix.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(quickfix.field.StipulationType value) {
		setField(value);
	}

	public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new quickfix.field.StipulationType());
	}

	public boolean isSet(quickfix.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(quickfix.field.StipulationValue value) {
		setField(value);
	}

	public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.StipulationValue());
	}

	public boolean isSet(quickfix.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

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
		private static final int[] ORDER = {137, 138, 139, 891, 0};

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

	public void set(quickfix.field.MiscFeeBasis value) {
		setField(value);
	}

	public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeBasis());
	}

	public boolean isSet(quickfix.field.MiscFeeBasis field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeBasis() {
		return isSetField(891);
	}

	}

	public void set(quickfix.field.ExchangeRule value) {
		setField(value);
	}

	public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
		return get(new quickfix.field.ExchangeRule());
	}

	public boolean isSet(quickfix.field.ExchangeRule field) {
		return isSetField(field);
	}

	public boolean isSetExchangeRule() {
		return isSetField(825);
	}

	public void set(quickfix.field.TradeAllocIndicator value) {
		setField(value);
	}

	public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
		return get(new quickfix.field.TradeAllocIndicator());
	}

	public boolean isSet(quickfix.field.TradeAllocIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTradeAllocIndicator() {
		return isSetField(826);
	}

	public void set(quickfix.field.PreallocMethod value) {
		setField(value);
	}

	public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
		return get(new quickfix.field.PreallocMethod());
	}

	public boolean isSet(quickfix.field.PreallocMethod field) {
		return isSetField(field);
	}

	public boolean isSetPreallocMethod() {
		return isSetField(591);
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
		private static final int[] ORDER = {79, 661, 736, 467, 756, 80, 0};

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

	public void set(quickfix.field.AllocAcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AllocAcctIDSource());
	}

	public boolean isSet(quickfix.field.AllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAllocAcctIDSource() {
		return isSetField(661);
	}

	public void set(quickfix.field.AllocSettlCurrency value) {
		setField(value);
	}

	public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.AllocSettlCurrency());
	}

	public boolean isSet(quickfix.field.AllocSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlCurrency() {
		return isSetField(736);
	}

	public void set(quickfix.field.IndividualAllocID value) {
		setField(value);
	}

	public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
		return get(new quickfix.field.IndividualAllocID());
	}

	public boolean isSet(quickfix.field.IndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocID() {
		return isSetField(467);
	}

	public void set(quickfix.fix44.component.NestedParties2 component) {
		setComponent(component);
	}

	public quickfix.fix44.component.NestedParties2 get(quickfix.fix44.component.NestedParties2 component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.NestedParties2 getNestedParties2() throws FieldNotFound {
		return get(new quickfix.fix44.component.NestedParties2());
	}

	public void set(quickfix.field.NoNested2PartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartyIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {757, 758, 759, 806, 0};

		public NoNested2PartyIDs() {
			super(756, 757, ORDER);
		}
		
	public void set(quickfix.field.Nested2PartyID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyID());
	}

	public boolean isSet(quickfix.field.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(quickfix.field.Nested2PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyIDSource());
	}

	public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(quickfix.field.Nested2PartyRole value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyRole());
	}

	public boolean isSet(quickfix.field.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(quickfix.field.NoNested2PartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {760, 807, 0};

		public NoNested2PartySubIDs() {
			super(806, 760, ORDER);
		}
		
	public void set(quickfix.field.Nested2PartySubID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubID());
	}

	public boolean isSet(quickfix.field.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(quickfix.field.Nested2PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubIDType());
	}

	public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

	}

	public void set(quickfix.field.AllocQty value) {
		setField(value);
	}

	public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
		return get(new quickfix.field.AllocQty());
	}

	public boolean isSet(quickfix.field.AllocQty field) {
		return isSetField(field);
	}

	public boolean isSetAllocQty() {
		return isSetField(80);
	}

	}

	}

	public void set(quickfix.field.CopyMsgIndicator value) {
		setField(value);
	}

	public quickfix.field.CopyMsgIndicator get(quickfix.field.CopyMsgIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CopyMsgIndicator getCopyMsgIndicator() throws FieldNotFound {
		return get(new quickfix.field.CopyMsgIndicator());
	}

	public boolean isSet(quickfix.field.CopyMsgIndicator field) {
		return isSetField(field);
	}

	public boolean isSetCopyMsgIndicator() {
		return isSetField(797);
	}

	public void set(quickfix.field.PublishTrdIndicator value) {
		setField(value);
	}

	public quickfix.field.PublishTrdIndicator get(quickfix.field.PublishTrdIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PublishTrdIndicator getPublishTrdIndicator() throws FieldNotFound {
		return get(new quickfix.field.PublishTrdIndicator());
	}

	public boolean isSet(quickfix.field.PublishTrdIndicator field) {
		return isSetField(field);
	}

	public boolean isSetPublishTrdIndicator() {
		return isSetField(852);
	}

	public void set(quickfix.field.ShortSaleReason value) {
		setField(value);
	}

	public quickfix.field.ShortSaleReason get(quickfix.field.ShortSaleReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ShortSaleReason getShortSaleReason() throws FieldNotFound {
		return get(new quickfix.field.ShortSaleReason());
	}

	public boolean isSet(quickfix.field.ShortSaleReason field) {
		return isSetField(field);
	}

	public boolean isSetShortSaleReason() {
		return isSetField(853);
	}

}
