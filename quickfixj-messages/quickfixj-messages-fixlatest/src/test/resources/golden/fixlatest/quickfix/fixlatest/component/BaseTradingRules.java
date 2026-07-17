/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class BaseTradingRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {827, 1786, 562, 1140, 1143, 1144, 1245, 561, 1377, 1378, 423, 2557, 2559, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public BaseTradingRules() {
    super();
  }

  public void set(quickfix.fixlatest.component.TickRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TickRules get(quickfix.fixlatest.component.TickRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TickRules getTickRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TickRules());
  }

  public void set(quickfix.field.NoTickRules value) {
    setField(value);
  }

  public quickfix.field.NoTickRules get(quickfix.field.NoTickRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTickRules getNoTickRules() throws FieldNotFound {
    return get(new quickfix.field.NoTickRules());
  }

  public boolean isSet(quickfix.field.NoTickRules field) {
    return isSetField(field);
  }

  public boolean isSetNoTickRules() {
    return isSetField(1205);
  }

public static class NoTickRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1206, 1207, 1208, 1209, 2571, 1830, 1831, 0};

  public NoTickRules() {
    super(1205, 1206, ORDER);
  }

  public void set(quickfix.field.StartTickPriceRange value) {
    setField(value);
  }

  public quickfix.field.StartTickPriceRange get(quickfix.field.StartTickPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartTickPriceRange getStartTickPriceRange() throws FieldNotFound {
    return get(new quickfix.field.StartTickPriceRange());
  }

  public boolean isSet(quickfix.field.StartTickPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetStartTickPriceRange() {
    return isSetField(1206);
  }

  public void set(quickfix.field.EndTickPriceRange value) {
    setField(value);
  }

  public quickfix.field.EndTickPriceRange get(quickfix.field.EndTickPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndTickPriceRange getEndTickPriceRange() throws FieldNotFound {
    return get(new quickfix.field.EndTickPriceRange());
  }

  public boolean isSet(quickfix.field.EndTickPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetEndTickPriceRange() {
    return isSetField(1207);
  }

  public void set(quickfix.field.TickIncrement value) {
    setField(value);
  }

  public quickfix.field.TickIncrement get(quickfix.field.TickIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickIncrement getTickIncrement() throws FieldNotFound {
    return get(new quickfix.field.TickIncrement());
  }

  public boolean isSet(quickfix.field.TickIncrement field) {
    return isSetField(field);
  }

  public boolean isSetTickIncrement() {
    return isSetField(1208);
  }

  public void set(quickfix.field.TickRuleType value) {
    setField(value);
  }

  public quickfix.field.TickRuleType get(quickfix.field.TickRuleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickRuleType getTickRuleType() throws FieldNotFound {
    return get(new quickfix.field.TickRuleType());
  }

  public boolean isSet(quickfix.field.TickRuleType field) {
    return isSetField(field);
  }

  public boolean isSetTickRuleType() {
    return isSetField(1209);
  }

  public void set(quickfix.field.TickRuleProductComplex value) {
    setField(value);
  }

  public quickfix.field.TickRuleProductComplex get(quickfix.field.TickRuleProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickRuleProductComplex getTickRuleProductComplex() throws FieldNotFound {
    return get(new quickfix.field.TickRuleProductComplex());
  }

  public boolean isSet(quickfix.field.TickRuleProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetTickRuleProductComplex() {
    return isSetField(2571);
  }

  public void set(quickfix.field.SettlPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.SettlPriceIncrement get(quickfix.field.SettlPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceIncrement getSettlPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceIncrement());
  }

  public boolean isSet(quickfix.field.SettlPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceIncrement() {
    return isSetField(1830);
  }

  public void set(quickfix.field.SettlPriceSecondaryIncrement value) {
    setField(value);
  }

  public quickfix.field.SettlPriceSecondaryIncrement get(quickfix.field.SettlPriceSecondaryIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceSecondaryIncrement getSettlPriceSecondaryIncrement() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceSecondaryIncrement());
  }

  public boolean isSet(quickfix.field.SettlPriceSecondaryIncrement field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceSecondaryIncrement() {
    return isSetField(1831);
  }
}

  public void set(quickfix.fixlatest.component.LotTypeRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LotTypeRules get(quickfix.fixlatest.component.LotTypeRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LotTypeRules getLotTypeRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LotTypeRules());
  }

  public void set(quickfix.field.NoLotTypeRules value) {
    setField(value);
  }

  public quickfix.field.NoLotTypeRules get(quickfix.field.NoLotTypeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLotTypeRules getNoLotTypeRules() throws FieldNotFound {
    return get(new quickfix.field.NoLotTypeRules());
  }

  public boolean isSet(quickfix.field.NoLotTypeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoLotTypeRules() {
    return isSetField(1234);
  }

public static class NoLotTypeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1093, 1231, 0};

  public NoLotTypeRules() {
    super(1234, 1093, ORDER);
  }

  public void set(quickfix.field.LotType value) {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound {
    return get(new quickfix.field.LotType());
  }

  public boolean isSet(quickfix.field.LotType field) {
    return isSetField(field);
  }

  public boolean isSetLotType() {
    return isSetField(1093);
  }

  public void set(quickfix.field.MinLotSize value) {
    setField(value);
  }

  public quickfix.field.MinLotSize get(quickfix.field.MinLotSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinLotSize getMinLotSize() throws FieldNotFound {
    return get(new quickfix.field.MinLotSize());
  }

  public boolean isSet(quickfix.field.MinLotSize field) {
    return isSetField(field);
  }

  public boolean isSetMinLotSize() {
    return isSetField(1231);
  }
}

  public void set(quickfix.fixlatest.component.PriceLimits component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceLimits get(quickfix.fixlatest.component.PriceLimits component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceLimits getPriceLimitsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceLimits());
  }

  public void set(quickfix.fixlatest.component.PriceRangeRuleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceRangeRuleGrp get(quickfix.fixlatest.component.PriceRangeRuleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceRangeRuleGrp getPriceRangeRuleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceRangeRuleGrp());
  }

  public void set(quickfix.field.NoPriceRangeRules value) {
    setField(value);
  }

  public quickfix.field.NoPriceRangeRules get(quickfix.field.NoPriceRangeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceRangeRules getNoPriceRangeRules() throws FieldNotFound {
    return get(new quickfix.field.NoPriceRangeRules());
  }

  public boolean isSet(quickfix.field.NoPriceRangeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceRangeRules() {
    return isSetField(2550);
  }

public static class NoPriceRangeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2551, 2552, 2553, 2554, 2556, 2555, 0};

  public NoPriceRangeRules() {
    super(2550, 2551, ORDER);
  }

  public void set(quickfix.field.StartPriceRange value) {
    setField(value);
  }

  public quickfix.field.StartPriceRange get(quickfix.field.StartPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartPriceRange getStartPriceRange() throws FieldNotFound {
    return get(new quickfix.field.StartPriceRange());
  }

  public boolean isSet(quickfix.field.StartPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetStartPriceRange() {
    return isSetField(2551);
  }

  public void set(quickfix.field.EndPriceRange value) {
    setField(value);
  }

  public quickfix.field.EndPriceRange get(quickfix.field.EndPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndPriceRange getEndPriceRange() throws FieldNotFound {
    return get(new quickfix.field.EndPriceRange());
  }

  public boolean isSet(quickfix.field.EndPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetEndPriceRange() {
    return isSetField(2552);
  }

  public void set(quickfix.field.PriceRangeValue value) {
    setField(value);
  }

  public quickfix.field.PriceRangeValue get(quickfix.field.PriceRangeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeValue getPriceRangeValue() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeValue());
  }

  public boolean isSet(quickfix.field.PriceRangeValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeValue() {
    return isSetField(2553);
  }

  public void set(quickfix.field.PriceRangePercentage value) {
    setField(value);
  }

  public quickfix.field.PriceRangePercentage get(quickfix.field.PriceRangePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangePercentage getPriceRangePercentage() throws FieldNotFound {
    return get(new quickfix.field.PriceRangePercentage());
  }

  public boolean isSet(quickfix.field.PriceRangePercentage field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangePercentage() {
    return isSetField(2554);
  }

  public void set(quickfix.field.PriceRangeRuleID value) {
    setField(value);
  }

  public quickfix.field.PriceRangeRuleID get(quickfix.field.PriceRangeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeRuleID getPriceRangeRuleID() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeRuleID());
  }

  public boolean isSet(quickfix.field.PriceRangeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeRuleID() {
    return isSetField(2556);
  }

  public void set(quickfix.field.PriceRangeProductComplex value) {
    setField(value);
  }

  public quickfix.field.PriceRangeProductComplex get(quickfix.field.PriceRangeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeProductComplex getPriceRangeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeProductComplex());
  }

  public boolean isSet(quickfix.field.PriceRangeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeProductComplex() {
    return isSetField(2555);
  }
}

  public void set(quickfix.fixlatest.component.QuoteSizeRuleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.QuoteSizeRuleGrp get(quickfix.fixlatest.component.QuoteSizeRuleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.QuoteSizeRuleGrp getQuoteSizeRuleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.QuoteSizeRuleGrp());
  }

  public void set(quickfix.field.NoQuoteSizeRules value) {
    setField(value);
  }

  public quickfix.field.NoQuoteSizeRules get(quickfix.field.NoQuoteSizeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteSizeRules getNoQuoteSizeRules() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteSizeRules());
  }

  public boolean isSet(quickfix.field.NoQuoteSizeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteSizeRules() {
    return isSetField(2558);
  }

public static class NoQuoteSizeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {647, 648, 2447, 0};

  public NoQuoteSizeRules() {
    super(2558, 647, ORDER);
  }

  public void set(quickfix.field.MinBidSize value) {
    setField(value);
  }

  public quickfix.field.MinBidSize get(quickfix.field.MinBidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinBidSize getMinBidSize() throws FieldNotFound {
    return get(new quickfix.field.MinBidSize());
  }

  public boolean isSet(quickfix.field.MinBidSize field) {
    return isSetField(field);
  }

  public boolean isSetMinBidSize() {
    return isSetField(647);
  }

  public void set(quickfix.field.MinOfferSize value) {
    setField(value);
  }

  public quickfix.field.MinOfferSize get(quickfix.field.MinOfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinOfferSize getMinOfferSize() throws FieldNotFound {
    return get(new quickfix.field.MinOfferSize());
  }

  public boolean isSet(quickfix.field.MinOfferSize field) {
    return isSetField(field);
  }

  public boolean isSetMinOfferSize() {
    return isSetField(648);
  }

  public void set(quickfix.field.FastMarketIndicator value) {
    setField(value);
  }

  public quickfix.field.FastMarketIndicator get(quickfix.field.FastMarketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FastMarketIndicator getFastMarketIndicator() throws FieldNotFound {
    return get(new quickfix.field.FastMarketIndicator());
  }

  public boolean isSet(quickfix.field.FastMarketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFastMarketIndicator() {
    return isSetField(2447);
  }
}

  public void set(quickfix.field.ExpirationCycle value) {
    setField(value);
  }

  public quickfix.field.ExpirationCycle get(quickfix.field.ExpirationCycle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpirationCycle getExpirationCycle() throws FieldNotFound {
    return get(new quickfix.field.ExpirationCycle());
  }

  public boolean isSet(quickfix.field.ExpirationCycle field) {
    return isSetField(field);
  }

  public boolean isSetExpirationCycle() {
    return isSetField(827);
  }

  public void set(quickfix.field.TradeVolType value) {
    setField(value);
  }

  public quickfix.field.TradeVolType get(quickfix.field.TradeVolType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeVolType getTradeVolType() throws FieldNotFound {
    return get(new quickfix.field.TradeVolType());
  }

  public boolean isSet(quickfix.field.TradeVolType field) {
    return isSetField(field);
  }

  public boolean isSetTradeVolType() {
    return isSetField(1786);
  }

  public void set(quickfix.field.MinTradeVol value) {
    setField(value);
  }

  public quickfix.field.MinTradeVol get(quickfix.field.MinTradeVol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinTradeVol getMinTradeVol() throws FieldNotFound {
    return get(new quickfix.field.MinTradeVol());
  }

  public boolean isSet(quickfix.field.MinTradeVol field) {
    return isSetField(field);
  }

  public boolean isSetMinTradeVol() {
    return isSetField(562);
  }

  public void set(quickfix.field.MaxTradeVol value) {
    setField(value);
  }

  public quickfix.field.MaxTradeVol get(quickfix.field.MaxTradeVol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaxTradeVol getMaxTradeVol() throws FieldNotFound {
    return get(new quickfix.field.MaxTradeVol());
  }

  public boolean isSet(quickfix.field.MaxTradeVol field) {
    return isSetField(field);
  }

  public boolean isSetMaxTradeVol() {
    return isSetField(1140);
  }

  public void set(quickfix.field.MaxPriceVariation value) {
    setField(value);
  }

  public quickfix.field.MaxPriceVariation get(quickfix.field.MaxPriceVariation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaxPriceVariation getMaxPriceVariation() throws FieldNotFound {
    return get(new quickfix.field.MaxPriceVariation());
  }

  public boolean isSet(quickfix.field.MaxPriceVariation field) {
    return isSetField(field);
  }

  public boolean isSetMaxPriceVariation() {
    return isSetField(1143);
  }

  public void set(quickfix.field.ImpliedMarketIndicator value) {
    setField(value);
  }

  public quickfix.field.ImpliedMarketIndicator get(quickfix.field.ImpliedMarketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ImpliedMarketIndicator getImpliedMarketIndicator() throws FieldNotFound {
    return get(new quickfix.field.ImpliedMarketIndicator());
  }

  public boolean isSet(quickfix.field.ImpliedMarketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetImpliedMarketIndicator() {
    return isSetField(1144);
  }

  public void set(quickfix.field.TradingCurrency value) {
    setField(value);
  }

  public quickfix.field.TradingCurrency get(quickfix.field.TradingCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingCurrency getTradingCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradingCurrency());
  }

  public boolean isSet(quickfix.field.TradingCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradingCurrency() {
    return isSetField(1245);
  }

  public void set(quickfix.field.RoundLot value) {
    setField(value);
  }

  public quickfix.field.RoundLot get(quickfix.field.RoundLot value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoundLot getRoundLot() throws FieldNotFound {
    return get(new quickfix.field.RoundLot());
  }

  public boolean isSet(quickfix.field.RoundLot field) {
    return isSetField(field);
  }

  public boolean isSetRoundLot() {
    return isSetField(561);
  }

  public void set(quickfix.field.MultilegModel value) {
    setField(value);
  }

  public quickfix.field.MultilegModel get(quickfix.field.MultilegModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultilegModel getMultilegModel() throws FieldNotFound {
    return get(new quickfix.field.MultilegModel());
  }

  public boolean isSet(quickfix.field.MultilegModel field) {
    return isSetField(field);
  }

  public boolean isSetMultilegModel() {
    return isSetField(1377);
  }

  public void set(quickfix.field.MultilegPriceMethod value) {
    setField(value);
  }

  public quickfix.field.MultilegPriceMethod get(quickfix.field.MultilegPriceMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultilegPriceMethod getMultilegPriceMethod() throws FieldNotFound {
    return get(new quickfix.field.MultilegPriceMethod());
  }

  public boolean isSet(quickfix.field.MultilegPriceMethod field) {
    return isSetField(field);
  }

  public boolean isSetMultilegPriceMethod() {
    return isSetField(1378);
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

  public void set(quickfix.field.FastMarketPercentage value) {
    setField(value);
  }

  public quickfix.field.FastMarketPercentage get(quickfix.field.FastMarketPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FastMarketPercentage getFastMarketPercentage() throws FieldNotFound {
    return get(new quickfix.field.FastMarketPercentage());
  }

  public boolean isSet(quickfix.field.FastMarketPercentage field) {
    return isSetField(field);
  }

  public boolean isSetFastMarketPercentage() {
    return isSetField(2557);
  }

  public void set(quickfix.field.QuoteSideIndicator value) {
    setField(value);
  }

  public quickfix.field.QuoteSideIndicator get(quickfix.field.QuoteSideIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteSideIndicator getQuoteSideIndicator() throws FieldNotFound {
    return get(new quickfix.field.QuoteSideIndicator());
  }

  public boolean isSet(quickfix.field.QuoteSideIndicator field) {
    return isSetField(field);
  }

  public boolean isSetQuoteSideIndicator() {
    return isSetField(2559);
  }
}
