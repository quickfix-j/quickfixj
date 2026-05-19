
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class BidRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "k";
	

	public BidRequest() {
		
		super(new int[] {390, 391, 374, 392, 393, 394, 395, 15, 396, 397, 398, 420, 409, 410, 411, 412, 413, 414, 415, 416, 121, 417, 75, 418, 419, 443, 58, 354, 355,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public BidRequest(quickfix.field.ClientBidID clientBidID, quickfix.field.BidRequestTransType bidRequestTransType, quickfix.field.TotNoRelatedSym totNoRelatedSym, quickfix.field.BidType bidType, quickfix.field.BidTradeType bidTradeType, quickfix.field.BasisPxType basisPxType) {
		this();
		setField(clientBidID);
		setField(bidRequestTransType);
		setField(totNoRelatedSym);
		setField(bidType);
		setField(bidTradeType);
		setField(basisPxType);
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

	public void set(quickfix.field.BidRequestTransType value) {
		setField(value);
	}

	public quickfix.field.BidRequestTransType get(quickfix.field.BidRequestTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidRequestTransType getBidRequestTransType() throws FieldNotFound {
		return get(new quickfix.field.BidRequestTransType());
	}

	public boolean isSet(quickfix.field.BidRequestTransType field) {
		return isSetField(field);
	}

	public boolean isSetBidRequestTransType() {
		return isSetField(374);
	}

	public void set(quickfix.field.ListName value) {
		setField(value);
	}

	public quickfix.field.ListName get(quickfix.field.ListName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListName getListName() throws FieldNotFound {
		return get(new quickfix.field.ListName());
	}

	public boolean isSet(quickfix.field.ListName field) {
		return isSetField(field);
	}

	public boolean isSetListName() {
		return isSetField(392);
	}

	public void set(quickfix.field.TotNoRelatedSym value) {
		setField(value);
	}

	public quickfix.field.TotNoRelatedSym get(quickfix.field.TotNoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotNoRelatedSym getTotNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.field.TotNoRelatedSym());
	}

	public boolean isSet(quickfix.field.TotNoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetTotNoRelatedSym() {
		return isSetField(393);
	}

	public void set(quickfix.field.BidType value) {
		setField(value);
	}

	public quickfix.field.BidType get(quickfix.field.BidType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidType getBidType() throws FieldNotFound {
		return get(new quickfix.field.BidType());
	}

	public boolean isSet(quickfix.field.BidType field) {
		return isSetField(field);
	}

	public boolean isSetBidType() {
		return isSetField(394);
	}

	public void set(quickfix.field.NumTickets value) {
		setField(value);
	}

	public quickfix.field.NumTickets get(quickfix.field.NumTickets value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumTickets getNumTickets() throws FieldNotFound {
		return get(new quickfix.field.NumTickets());
	}

	public boolean isSet(quickfix.field.NumTickets field) {
		return isSetField(field);
	}

	public boolean isSetNumTickets() {
		return isSetField(395);
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

	public void set(quickfix.field.SideValue1 value) {
		setField(value);
	}

	public quickfix.field.SideValue1 get(quickfix.field.SideValue1 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideValue1 getSideValue1() throws FieldNotFound {
		return get(new quickfix.field.SideValue1());
	}

	public boolean isSet(quickfix.field.SideValue1 field) {
		return isSetField(field);
	}

	public boolean isSetSideValue1() {
		return isSetField(396);
	}

	public void set(quickfix.field.SideValue2 value) {
		setField(value);
	}

	public quickfix.field.SideValue2 get(quickfix.field.SideValue2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideValue2 getSideValue2() throws FieldNotFound {
		return get(new quickfix.field.SideValue2());
	}

	public boolean isSet(quickfix.field.SideValue2 field) {
		return isSetField(field);
	}

	public boolean isSetSideValue2() {
		return isSetField(397);
	}

	public void set(quickfix.field.NoBidDescriptors value) {
		setField(value);
	}

	public quickfix.field.NoBidDescriptors get(quickfix.field.NoBidDescriptors value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoBidDescriptors getNoBidDescriptors() throws FieldNotFound {
		return get(new quickfix.field.NoBidDescriptors());
	}

	public boolean isSet(quickfix.field.NoBidDescriptors field) {
		return isSetField(field);
	}

	public boolean isSetNoBidDescriptors() {
		return isSetField(398);
	}

	public static class NoBidDescriptors extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {399, 400, 401, 404, 441, 402, 403, 405, 406, 407, 408, 0};

		public NoBidDescriptors() {
			super(398, 399, ORDER);
		}
		
	public void set(quickfix.field.BidDescriptorType value) {
		setField(value);
	}

	public quickfix.field.BidDescriptorType get(quickfix.field.BidDescriptorType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidDescriptorType getBidDescriptorType() throws FieldNotFound {
		return get(new quickfix.field.BidDescriptorType());
	}

	public boolean isSet(quickfix.field.BidDescriptorType field) {
		return isSetField(field);
	}

	public boolean isSetBidDescriptorType() {
		return isSetField(399);
	}

	public void set(quickfix.field.BidDescriptor value) {
		setField(value);
	}

	public quickfix.field.BidDescriptor get(quickfix.field.BidDescriptor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidDescriptor getBidDescriptor() throws FieldNotFound {
		return get(new quickfix.field.BidDescriptor());
	}

	public boolean isSet(quickfix.field.BidDescriptor field) {
		return isSetField(field);
	}

	public boolean isSetBidDescriptor() {
		return isSetField(400);
	}

	public void set(quickfix.field.SideValueInd value) {
		setField(value);
	}

	public quickfix.field.SideValueInd get(quickfix.field.SideValueInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideValueInd getSideValueInd() throws FieldNotFound {
		return get(new quickfix.field.SideValueInd());
	}

	public boolean isSet(quickfix.field.SideValueInd field) {
		return isSetField(field);
	}

	public boolean isSetSideValueInd() {
		return isSetField(401);
	}

	public void set(quickfix.field.LiquidityValue value) {
		setField(value);
	}

	public quickfix.field.LiquidityValue get(quickfix.field.LiquidityValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LiquidityValue getLiquidityValue() throws FieldNotFound {
		return get(new quickfix.field.LiquidityValue());
	}

	public boolean isSet(quickfix.field.LiquidityValue field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityValue() {
		return isSetField(404);
	}

	public void set(quickfix.field.LiquidityNumSecurities value) {
		setField(value);
	}

	public quickfix.field.LiquidityNumSecurities get(quickfix.field.LiquidityNumSecurities value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LiquidityNumSecurities getLiquidityNumSecurities() throws FieldNotFound {
		return get(new quickfix.field.LiquidityNumSecurities());
	}

	public boolean isSet(quickfix.field.LiquidityNumSecurities field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityNumSecurities() {
		return isSetField(441);
	}

	public void set(quickfix.field.LiquidityPctLow value) {
		setField(value);
	}

	public quickfix.field.LiquidityPctLow get(quickfix.field.LiquidityPctLow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LiquidityPctLow getLiquidityPctLow() throws FieldNotFound {
		return get(new quickfix.field.LiquidityPctLow());
	}

	public boolean isSet(quickfix.field.LiquidityPctLow field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityPctLow() {
		return isSetField(402);
	}

	public void set(quickfix.field.LiquidityPctHigh value) {
		setField(value);
	}

	public quickfix.field.LiquidityPctHigh get(quickfix.field.LiquidityPctHigh value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LiquidityPctHigh getLiquidityPctHigh() throws FieldNotFound {
		return get(new quickfix.field.LiquidityPctHigh());
	}

	public boolean isSet(quickfix.field.LiquidityPctHigh field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityPctHigh() {
		return isSetField(403);
	}

	public void set(quickfix.field.EFPTrackingError value) {
		setField(value);
	}

	public quickfix.field.EFPTrackingError get(quickfix.field.EFPTrackingError value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EFPTrackingError getEFPTrackingError() throws FieldNotFound {
		return get(new quickfix.field.EFPTrackingError());
	}

	public boolean isSet(quickfix.field.EFPTrackingError field) {
		return isSetField(field);
	}

	public boolean isSetEFPTrackingError() {
		return isSetField(405);
	}

	public void set(quickfix.field.FairValue value) {
		setField(value);
	}

	public quickfix.field.FairValue get(quickfix.field.FairValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FairValue getFairValue() throws FieldNotFound {
		return get(new quickfix.field.FairValue());
	}

	public boolean isSet(quickfix.field.FairValue field) {
		return isSetField(field);
	}

	public boolean isSetFairValue() {
		return isSetField(406);
	}

	public void set(quickfix.field.OutsideIndexPct value) {
		setField(value);
	}

	public quickfix.field.OutsideIndexPct get(quickfix.field.OutsideIndexPct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OutsideIndexPct getOutsideIndexPct() throws FieldNotFound {
		return get(new quickfix.field.OutsideIndexPct());
	}

	public boolean isSet(quickfix.field.OutsideIndexPct field) {
		return isSetField(field);
	}

	public boolean isSetOutsideIndexPct() {
		return isSetField(407);
	}

	public void set(quickfix.field.ValueOfFutures value) {
		setField(value);
	}

	public quickfix.field.ValueOfFutures get(quickfix.field.ValueOfFutures value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ValueOfFutures getValueOfFutures() throws FieldNotFound {
		return get(new quickfix.field.ValueOfFutures());
	}

	public boolean isSet(quickfix.field.ValueOfFutures field) {
		return isSetField(field);
	}

	public boolean isSetValueOfFutures() {
		return isSetField(408);
	}

	}

	public void set(quickfix.field.NoBidComponents value) {
		setField(value);
	}

	public quickfix.field.NoBidComponents get(quickfix.field.NoBidComponents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoBidComponents getNoBidComponents() throws FieldNotFound {
		return get(new quickfix.field.NoBidComponents());
	}

	public boolean isSet(quickfix.field.NoBidComponents field) {
		return isSetField(field);
	}

	public boolean isSetNoBidComponents() {
		return isSetField(420);
	}

	public static class NoBidComponents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {66, 54, 336, 625, 430, 63, 64, 1, 660, 0};

		public NoBidComponents() {
			super(420, 66, ORDER);
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

	public void set(quickfix.field.NetGrossInd value) {
		setField(value);
	}

	public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
		return get(new quickfix.field.NetGrossInd());
	}

	public boolean isSet(quickfix.field.NetGrossInd field) {
		return isSetField(field);
	}

	public boolean isSetNetGrossInd() {
		return isSetField(430);
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

	}

	public void set(quickfix.field.LiquidityIndType value) {
		setField(value);
	}

	public quickfix.field.LiquidityIndType get(quickfix.field.LiquidityIndType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LiquidityIndType getLiquidityIndType() throws FieldNotFound {
		return get(new quickfix.field.LiquidityIndType());
	}

	public boolean isSet(quickfix.field.LiquidityIndType field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityIndType() {
		return isSetField(409);
	}

	public void set(quickfix.field.WtAverageLiquidity value) {
		setField(value);
	}

	public quickfix.field.WtAverageLiquidity get(quickfix.field.WtAverageLiquidity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.WtAverageLiquidity getWtAverageLiquidity() throws FieldNotFound {
		return get(new quickfix.field.WtAverageLiquidity());
	}

	public boolean isSet(quickfix.field.WtAverageLiquidity field) {
		return isSetField(field);
	}

	public boolean isSetWtAverageLiquidity() {
		return isSetField(410);
	}

	public void set(quickfix.field.ExchangeForPhysical value) {
		setField(value);
	}

	public quickfix.field.ExchangeForPhysical get(quickfix.field.ExchangeForPhysical value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExchangeForPhysical getExchangeForPhysical() throws FieldNotFound {
		return get(new quickfix.field.ExchangeForPhysical());
	}

	public boolean isSet(quickfix.field.ExchangeForPhysical field) {
		return isSetField(field);
	}

	public boolean isSetExchangeForPhysical() {
		return isSetField(411);
	}

	public void set(quickfix.field.OutMainCntryUIndex value) {
		setField(value);
	}

	public quickfix.field.OutMainCntryUIndex get(quickfix.field.OutMainCntryUIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OutMainCntryUIndex getOutMainCntryUIndex() throws FieldNotFound {
		return get(new quickfix.field.OutMainCntryUIndex());
	}

	public boolean isSet(quickfix.field.OutMainCntryUIndex field) {
		return isSetField(field);
	}

	public boolean isSetOutMainCntryUIndex() {
		return isSetField(412);
	}

	public void set(quickfix.field.CrossPercent value) {
		setField(value);
	}

	public quickfix.field.CrossPercent get(quickfix.field.CrossPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CrossPercent getCrossPercent() throws FieldNotFound {
		return get(new quickfix.field.CrossPercent());
	}

	public boolean isSet(quickfix.field.CrossPercent field) {
		return isSetField(field);
	}

	public boolean isSetCrossPercent() {
		return isSetField(413);
	}

	public void set(quickfix.field.ProgRptReqs value) {
		setField(value);
	}

	public quickfix.field.ProgRptReqs get(quickfix.field.ProgRptReqs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ProgRptReqs getProgRptReqs() throws FieldNotFound {
		return get(new quickfix.field.ProgRptReqs());
	}

	public boolean isSet(quickfix.field.ProgRptReqs field) {
		return isSetField(field);
	}

	public boolean isSetProgRptReqs() {
		return isSetField(414);
	}

	public void set(quickfix.field.ProgPeriodInterval value) {
		setField(value);
	}

	public quickfix.field.ProgPeriodInterval get(quickfix.field.ProgPeriodInterval value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ProgPeriodInterval getProgPeriodInterval() throws FieldNotFound {
		return get(new quickfix.field.ProgPeriodInterval());
	}

	public boolean isSet(quickfix.field.ProgPeriodInterval field) {
		return isSetField(field);
	}

	public boolean isSetProgPeriodInterval() {
		return isSetField(415);
	}

	public void set(quickfix.field.IncTaxInd value) {
		setField(value);
	}

	public quickfix.field.IncTaxInd get(quickfix.field.IncTaxInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IncTaxInd getIncTaxInd() throws FieldNotFound {
		return get(new quickfix.field.IncTaxInd());
	}

	public boolean isSet(quickfix.field.IncTaxInd field) {
		return isSetField(field);
	}

	public boolean isSetIncTaxInd() {
		return isSetField(416);
	}

	public void set(quickfix.field.ForexReq value) {
		setField(value);
	}

	public quickfix.field.ForexReq get(quickfix.field.ForexReq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ForexReq getForexReq() throws FieldNotFound {
		return get(new quickfix.field.ForexReq());
	}

	public boolean isSet(quickfix.field.ForexReq field) {
		return isSetField(field);
	}

	public boolean isSetForexReq() {
		return isSetField(121);
	}

	public void set(quickfix.field.NumBidders value) {
		setField(value);
	}

	public quickfix.field.NumBidders get(quickfix.field.NumBidders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumBidders getNumBidders() throws FieldNotFound {
		return get(new quickfix.field.NumBidders());
	}

	public boolean isSet(quickfix.field.NumBidders field) {
		return isSetField(field);
	}

	public boolean isSetNumBidders() {
		return isSetField(417);
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

	public void set(quickfix.field.BidTradeType value) {
		setField(value);
	}

	public quickfix.field.BidTradeType get(quickfix.field.BidTradeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidTradeType getBidTradeType() throws FieldNotFound {
		return get(new quickfix.field.BidTradeType());
	}

	public boolean isSet(quickfix.field.BidTradeType field) {
		return isSetField(field);
	}

	public boolean isSetBidTradeType() {
		return isSetField(418);
	}

	public void set(quickfix.field.BasisPxType value) {
		setField(value);
	}

	public quickfix.field.BasisPxType get(quickfix.field.BasisPxType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BasisPxType getBasisPxType() throws FieldNotFound {
		return get(new quickfix.field.BasisPxType());
	}

	public boolean isSet(quickfix.field.BasisPxType field) {
		return isSetField(field);
	}

	public boolean isSetBasisPxType() {
		return isSetField(419);
	}

	public void set(quickfix.field.StrikeTime value) {
		setField(value);
	}

	public quickfix.field.StrikeTime get(quickfix.field.StrikeTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeTime getStrikeTime() throws FieldNotFound {
		return get(new quickfix.field.StrikeTime());
	}

	public boolean isSet(quickfix.field.StrikeTime field) {
		return isSetField(field);
	}

	public boolean isSetStrikeTime() {
		return isSetField(443);
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
