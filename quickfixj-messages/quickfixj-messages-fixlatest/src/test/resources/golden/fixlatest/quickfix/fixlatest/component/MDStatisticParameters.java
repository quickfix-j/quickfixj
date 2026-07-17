/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MDStatisticParameters extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {2456, 2457, 2458, 2459, 2454, 2455, 2481, 2482, 264, 2460, 2461, 2462, 2463, 2464, 2465, 2466, 2467, 2468, 2469, 2470, 2471, 2472, 2584, 1815, 40, 59, 276, 277, 54, 578, 336, 625, 1024, 2711, 338, 1022, 1629, 1916, 1057, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public MDStatisticParameters() {
    super();
  }

  public void set(quickfix.field.MDStatisticType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticType get(quickfix.field.MDStatisticType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticType getMDStatisticType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticType());
  }

  public boolean isSet(quickfix.field.MDStatisticType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticType() {
    return isSetField(2456);
  }

  public void set(quickfix.field.MDStatisticScope value) {
    setField(value);
  }

  public quickfix.field.MDStatisticScope get(quickfix.field.MDStatisticScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticScope getMDStatisticScope() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticScope());
  }

  public boolean isSet(quickfix.field.MDStatisticScope field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticScope() {
    return isSetField(2457);
  }

  public void set(quickfix.field.MDStatisticSubScope value) {
    setField(value);
  }

  public quickfix.field.MDStatisticSubScope get(quickfix.field.MDStatisticSubScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticSubScope getMDStatisticSubScope() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticSubScope());
  }

  public boolean isSet(quickfix.field.MDStatisticSubScope field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticSubScope() {
    return isSetField(2458);
  }

  public void set(quickfix.field.MDStatisticScopeType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticScopeType get(quickfix.field.MDStatisticScopeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticScopeType getMDStatisticScopeType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticScopeType());
  }

  public boolean isSet(quickfix.field.MDStatisticScopeType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticScopeType() {
    return isSetField(2459);
  }

  public void set(quickfix.field.MDStatisticName value) {
    setField(value);
  }

  public quickfix.field.MDStatisticName get(quickfix.field.MDStatisticName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticName getMDStatisticName() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticName());
  }

  public boolean isSet(quickfix.field.MDStatisticName field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticName() {
    return isSetField(2454);
  }

  public void set(quickfix.field.MDStatisticDesc value) {
    setField(value);
  }

  public quickfix.field.MDStatisticDesc get(quickfix.field.MDStatisticDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticDesc getMDStatisticDesc() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticDesc());
  }

  public boolean isSet(quickfix.field.MDStatisticDesc field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticDesc() {
    return isSetField(2455);
  }

  public void set(quickfix.field.EncodedMDStatisticDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMDStatisticDescLen get(quickfix.field.EncodedMDStatisticDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMDStatisticDescLen getEncodedMDStatisticDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMDStatisticDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMDStatisticDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMDStatisticDescLen() {
    return isSetField(2481);
  }

  public void set(quickfix.field.EncodedMDStatisticDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMDStatisticDesc get(quickfix.field.EncodedMDStatisticDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMDStatisticDesc getEncodedMDStatisticDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMDStatisticDesc());
  }

  public boolean isSet(quickfix.field.EncodedMDStatisticDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMDStatisticDesc() {
    return isSetField(2482);
  }

  public void set(quickfix.field.MarketDepth value) {
    setField(value);
  }

  public quickfix.field.MarketDepth get(quickfix.field.MarketDepth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDepth getMarketDepth() throws FieldNotFound {
    return get(new quickfix.field.MarketDepth());
  }

  public boolean isSet(quickfix.field.MarketDepth field) {
    return isSetField(field);
  }

  public boolean isSetMarketDepth() {
    return isSetField(264);
  }

  public void set(quickfix.field.MDStatisticFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.MDStatisticFrequencyPeriod get(quickfix.field.MDStatisticFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticFrequencyPeriod getMDStatisticFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.MDStatisticFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticFrequencyPeriod() {
    return isSetField(2460);
  }

  public void set(quickfix.field.MDStatisticFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticFrequencyUnit get(quickfix.field.MDStatisticFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticFrequencyUnit getMDStatisticFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticFrequencyUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticFrequencyUnit() {
    return isSetField(2461);
  }

  public void set(quickfix.field.MDStatisticDelayPeriod value) {
    setField(value);
  }

  public quickfix.field.MDStatisticDelayPeriod get(quickfix.field.MDStatisticDelayPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticDelayPeriod getMDStatisticDelayPeriod() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticDelayPeriod());
  }

  public boolean isSet(quickfix.field.MDStatisticDelayPeriod field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticDelayPeriod() {
    return isSetField(2462);
  }

  public void set(quickfix.field.MDStatisticDelayUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticDelayUnit get(quickfix.field.MDStatisticDelayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticDelayUnit getMDStatisticDelayUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticDelayUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticDelayUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticDelayUnit() {
    return isSetField(2463);
  }

  public void set(quickfix.field.MDStatisticIntervalType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticIntervalType get(quickfix.field.MDStatisticIntervalType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticIntervalType getMDStatisticIntervalType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticIntervalType());
  }

  public boolean isSet(quickfix.field.MDStatisticIntervalType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticIntervalType() {
    return isSetField(2464);
  }

  public void set(quickfix.field.MDStatisticIntervalTypeUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticIntervalTypeUnit get(quickfix.field.MDStatisticIntervalTypeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticIntervalTypeUnit getMDStatisticIntervalTypeUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticIntervalTypeUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticIntervalTypeUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticIntervalTypeUnit() {
    return isSetField(2465);
  }

  public void set(quickfix.field.MDStatisticIntervalPeriod value) {
    setField(value);
  }

  public quickfix.field.MDStatisticIntervalPeriod get(quickfix.field.MDStatisticIntervalPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticIntervalPeriod getMDStatisticIntervalPeriod() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticIntervalPeriod());
  }

  public boolean isSet(quickfix.field.MDStatisticIntervalPeriod field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticIntervalPeriod() {
    return isSetField(2466);
  }

  public void set(quickfix.field.MDStatisticIntervalUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticIntervalUnit get(quickfix.field.MDStatisticIntervalUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticIntervalUnit getMDStatisticIntervalUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticIntervalUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticIntervalUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticIntervalUnit() {
    return isSetField(2467);
  }

  public void set(quickfix.field.MDStatisticStartDate value) {
    setField(value);
  }

  public quickfix.field.MDStatisticStartDate get(quickfix.field.MDStatisticStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticStartDate getMDStatisticStartDate() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticStartDate());
  }

  public boolean isSet(quickfix.field.MDStatisticStartDate field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticStartDate() {
    return isSetField(2468);
  }

  public void set(quickfix.field.MDStatisticEndDate value) {
    setField(value);
  }

  public quickfix.field.MDStatisticEndDate get(quickfix.field.MDStatisticEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticEndDate getMDStatisticEndDate() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticEndDate());
  }

  public boolean isSet(quickfix.field.MDStatisticEndDate field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticEndDate() {
    return isSetField(2469);
  }

  public void set(quickfix.field.MDStatisticStartTime value) {
    setField(value);
  }

  public quickfix.field.MDStatisticStartTime get(quickfix.field.MDStatisticStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticStartTime getMDStatisticStartTime() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticStartTime());
  }

  public boolean isSet(quickfix.field.MDStatisticStartTime field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticStartTime() {
    return isSetField(2470);
  }

  public void set(quickfix.field.MDStatisticEndTime value) {
    setField(value);
  }

  public quickfix.field.MDStatisticEndTime get(quickfix.field.MDStatisticEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticEndTime getMDStatisticEndTime() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticEndTime());
  }

  public boolean isSet(quickfix.field.MDStatisticEndTime field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticEndTime() {
    return isSetField(2471);
  }

  public void set(quickfix.field.MDStatisticRatioType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticRatioType get(quickfix.field.MDStatisticRatioType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticRatioType getMDStatisticRatioType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticRatioType());
  }

  public boolean isSet(quickfix.field.MDStatisticRatioType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticRatioType() {
    return isSetField(2472);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

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

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

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

  public void set(quickfix.field.AnnualTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.AnnualTradingBusinessDays get(quickfix.field.AnnualTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AnnualTradingBusinessDays getAnnualTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.AnnualTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.AnnualTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetAnnualTradingBusinessDays() {
    return isSetField(2584);
  }

  public void set(quickfix.field.TradingCapacity value) {
    setField(value);
  }

  public quickfix.field.TradingCapacity get(quickfix.field.TradingCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingCapacity getTradingCapacity() throws FieldNotFound {
    return get(new quickfix.field.TradingCapacity());
  }

  public boolean isSet(quickfix.field.TradingCapacity field) {
    return isSetField(field);
  }

  public boolean isSetTradingCapacity() {
    return isSetField(1815);
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

  public void set(quickfix.field.MDOriginType value) {
    setField(value);
  }

  public quickfix.field.MDOriginType get(quickfix.field.MDOriginType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDOriginType getMDOriginType() throws FieldNotFound {
    return get(new quickfix.field.MDOriginType());
  }

  public boolean isSet(quickfix.field.MDOriginType field) {
    return isSetField(field);
  }

  public boolean isSetMDOriginType() {
    return isSetField(1024);
  }

  public void set(quickfix.field.MDValueTier value) {
    setField(value);
  }

  public quickfix.field.MDValueTier get(quickfix.field.MDValueTier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDValueTier getMDValueTier() throws FieldNotFound {
    return get(new quickfix.field.MDValueTier());
  }

  public boolean isSet(quickfix.field.MDValueTier field) {
    return isSetField(field);
  }

  public boolean isSetMDValueTier() {
    return isSetField(2711);
  }

  public void set(quickfix.field.TradSesMethod value) {
    setField(value);
  }

  public quickfix.field.TradSesMethod get(quickfix.field.TradSesMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
    return get(new quickfix.field.TradSesMethod());
  }

  public boolean isSet(quickfix.field.TradSesMethod field) {
    return isSetField(field);
  }

  public boolean isSetTradSesMethod() {
    return isSetField(338);
  }

  public void set(quickfix.field.MDFeedType value) {
    setField(value);
  }

  public quickfix.field.MDFeedType get(quickfix.field.MDFeedType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDFeedType getMDFeedType() throws FieldNotFound {
    return get(new quickfix.field.MDFeedType());
  }

  public boolean isSet(quickfix.field.MDFeedType field) {
    return isSetField(field);
  }

  public boolean isSetMDFeedType() {
    return isSetField(1022);
  }

  public void set(quickfix.field.ExposureDuration value) {
    setField(value);
  }

  public quickfix.field.ExposureDuration get(quickfix.field.ExposureDuration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDuration getExposureDuration() throws FieldNotFound {
    return get(new quickfix.field.ExposureDuration());
  }

  public boolean isSet(quickfix.field.ExposureDuration field) {
    return isSetField(field);
  }

  public boolean isSetExposureDuration() {
    return isSetField(1629);
  }

  public void set(quickfix.field.ExposureDurationUnit value) {
    setField(value);
  }

  public quickfix.field.ExposureDurationUnit get(quickfix.field.ExposureDurationUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDurationUnit getExposureDurationUnit() throws FieldNotFound {
    return get(new quickfix.field.ExposureDurationUnit());
  }

  public boolean isSet(quickfix.field.ExposureDurationUnit field) {
    return isSetField(field);
  }

  public boolean isSetExposureDurationUnit() {
    return isSetField(1916);
  }

  public void set(quickfix.field.AggressorIndicator value) {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
    return get(new quickfix.field.AggressorIndicator());
  }

  public boolean isSet(quickfix.field.AggressorIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator() {
    return isSetField(1057);
  }
}
