/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MDFullGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {268, };
  protected int[] getGroupFields() { return componentGroups; }

  public MDFullGrp() {
    super();
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {269, 278, 270, 423, 2709, 819, 235, 236, 701, 696, 697, 698, 218, 220, 221, 222, 662, 663, 699, 761, 40, 15, 120, 1445, 271, 1177, 1093, 272, 273, 274, 275, 336, 625, 326, 327, 2447, 2705, 276, 277, 1838, 2667, 282, 283, 284, 286, 59, 432, 126, 1629, 1916, 110, 18, 287, 37, 198, 299, 1003, 1851, 288, 289, 2449, 2450, 346, 290, 546, 811, 828, 829, 855, 2896, 1934, 2405, 574, 1115, 1390, 2668, 2373, 570, 1855, 58, 354, 355, 1023, 528, 1024, 332, 333, 1025, 31, 1592, 1020, 1306, 1148, 1149, 1150, 1143, 731, 2451, 63, 64, 1070, 83, 1048, 1026, 1027, 453, 2445, 2446, 654, 0};

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

  public void set(quickfix.field.MDEntryID value) {
    setField(value);
  }

  public quickfix.field.MDEntryID get(quickfix.field.MDEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound {
    return get(new quickfix.field.MDEntryID());
  }

  public boolean isSet(quickfix.field.MDEntryID field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryID() {
    return isSetField(278);
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

  public void set(quickfix.fixlatest.component.PriceQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceQualifierGrp get(quickfix.fixlatest.component.PriceQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceQualifierGrp getPriceQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceQualifierGrp());
  }

  public void set(quickfix.field.NoPriceQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoPriceQualifiers get(quickfix.field.NoPriceQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceQualifiers getNoPriceQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoPriceQualifiers());
  }

  public boolean isSet(quickfix.field.NoPriceQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceQualifiers() {
    return isSetField(2709);
  }

public static class NoPriceQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2710, 0};

  public NoPriceQualifiers() {
    super(2709, 2710, ORDER);
  }

  public void set(quickfix.field.PriceQualifier value) {
    setField(value);
  }

  public quickfix.field.PriceQualifier get(quickfix.field.PriceQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQualifier getPriceQualifier() throws FieldNotFound {
    return get(new quickfix.field.PriceQualifier());
  }

  public boolean isSet(quickfix.field.PriceQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPriceQualifier() {
    return isSetField(2710);
  }
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

  public void set(quickfix.fixlatest.component.YieldData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.YieldData get(quickfix.fixlatest.component.YieldData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.YieldData getYieldDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.YieldData());
  }

  public void set(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData get(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SpreadOrBenchmarkCurveData());
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

  public void set(quickfix.fixlatest.component.RateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RateSource get(quickfix.fixlatest.component.RateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RateSource getRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RateSource());
  }

  public void set(quickfix.field.NoRateSources value) {
    setField(value);
  }

  public quickfix.field.NoRateSources get(quickfix.field.NoRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRateSources getNoRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoRateSources());
  }

  public boolean isSet(quickfix.field.NoRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoRateSources() {
    return isSetField(1445);
  }

public static class NoRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1446, 1447, 1448, 2412, 2796, 0};

  public NoRateSources() {
    super(1445, 1446, ORDER);
  }

  public void set(quickfix.field.RateSource value) {
    setField(value);
  }

  public quickfix.field.RateSource get(quickfix.field.RateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSource getRateSource() throws FieldNotFound {
    return get(new quickfix.field.RateSource());
  }

  public boolean isSet(quickfix.field.RateSource field) {
    return isSetField(field);
  }

  public boolean isSetRateSource() {
    return isSetField(1446);
  }

  public void set(quickfix.field.RateSourceType value) {
    setField(value);
  }

  public quickfix.field.RateSourceType get(quickfix.field.RateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceType getRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.RateSourceType());
  }

  public boolean isSet(quickfix.field.RateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceType() {
    return isSetField(1447);
  }

  public void set(quickfix.field.ReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReferencePage get(quickfix.field.ReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferencePage getReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReferencePage());
  }

  public boolean isSet(quickfix.field.ReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReferencePage() {
    return isSetField(1448);
  }

  public void set(quickfix.field.RateSourceReferemcePageHeading value) {
    setField(value);
  }

  public quickfix.field.RateSourceReferemcePageHeading get(quickfix.field.RateSourceReferemcePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceReferemcePageHeading getRateSourceReferemcePageHeading() throws FieldNotFound {
    return get(new quickfix.field.RateSourceReferemcePageHeading());
  }

  public boolean isSet(quickfix.field.RateSourceReferemcePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceReferemcePageHeading() {
    return isSetField(2412);
  }

  public void set(quickfix.field.FXBenchmarkRateFix value) {
    setField(value);
  }

  public quickfix.field.FXBenchmarkRateFix get(quickfix.field.FXBenchmarkRateFix value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FXBenchmarkRateFix getFXBenchmarkRateFix() throws FieldNotFound {
    return get(new quickfix.field.FXBenchmarkRateFix());
  }

  public boolean isSet(quickfix.field.FXBenchmarkRateFix field) {
    return isSetField(field);
  }

  public boolean isSetFXBenchmarkRateFix() {
    return isSetField(2796);
  }
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

  public void set(quickfix.fixlatest.component.SecSizesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecSizesGrp get(quickfix.fixlatest.component.SecSizesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecSizesGrp getSecSizesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecSizesGrp());
  }

  public void set(quickfix.field.NoOfSecSizes value) {
    setField(value);
  }

  public quickfix.field.NoOfSecSizes get(quickfix.field.NoOfSecSizes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfSecSizes getNoOfSecSizes() throws FieldNotFound {
    return get(new quickfix.field.NoOfSecSizes());
  }

  public boolean isSet(quickfix.field.NoOfSecSizes field) {
    return isSetField(field);
  }

  public boolean isSetNoOfSecSizes() {
    return isSetField(1177);
  }

public static class NoOfSecSizes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1178, 1179, 0};

  public NoOfSecSizes() {
    super(1177, 1178, ORDER);
  }

  public void set(quickfix.field.MDSecSizeType value) {
    setField(value);
  }

  public quickfix.field.MDSecSizeType get(quickfix.field.MDSecSizeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSizeType getMDSecSizeType() throws FieldNotFound {
    return get(new quickfix.field.MDSecSizeType());
  }

  public boolean isSet(quickfix.field.MDSecSizeType field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSizeType() {
    return isSetField(1178);
  }

  public void set(quickfix.field.MDSecSize value) {
    setField(value);
  }

  public quickfix.field.MDSecSize get(quickfix.field.MDSecSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSize getMDSecSize() throws FieldNotFound {
    return get(new quickfix.field.MDSecSize());
  }

  public boolean isSet(quickfix.field.MDSecSize field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSize() {
    return isSetField(1179);
  }
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

  public void set(quickfix.field.MarketCondition value) {
    setField(value);
  }

  public quickfix.field.MarketCondition get(quickfix.field.MarketCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketCondition getMarketCondition() throws FieldNotFound {
    return get(new quickfix.field.MarketCondition());
  }

  public boolean isSet(quickfix.field.MarketCondition field) {
    return isSetField(field);
  }

  public boolean isSetMarketCondition() {
    return isSetField(2705);
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

  public void set(quickfix.fixlatest.component.TradePriceConditionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp get(quickfix.fixlatest.component.TradePriceConditionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp getTradePriceConditionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePriceConditionGrp());
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}

  public void set(quickfix.field.AlgorithmicTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.AlgorithmicTradeIndicator get(quickfix.field.AlgorithmicTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AlgorithmicTradeIndicator getAlgorithmicTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AlgorithmicTradeIndicator());
  }

  public boolean isSet(quickfix.field.AlgorithmicTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAlgorithmicTradeIndicator() {
    return isSetField(2667);
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

  public void set(quickfix.field.OpenCloseSettlFlag value) {
    setField(value);
  }

  public quickfix.field.OpenCloseSettlFlag get(quickfix.field.OpenCloseSettlFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound {
    return get(new quickfix.field.OpenCloseSettlFlag());
  }

  public boolean isSet(quickfix.field.OpenCloseSettlFlag field) {
    return isSetField(field);
  }

  public boolean isSetOpenCloseSettlFlag() {
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

  public void set(quickfix.field.TradeID value) {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound {
    return get(new quickfix.field.TradeID());
  }

  public boolean isSet(quickfix.field.TradeID field) {
    return isSetField(field);
  }

  public boolean isSetTradeID() {
    return isSetField(1003);
  }

  public void set(quickfix.field.StrategyLinkID value) {
    setField(value);
  }

  public quickfix.field.StrategyLinkID get(quickfix.field.StrategyLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyLinkID getStrategyLinkID() throws FieldNotFound {
    return get(new quickfix.field.StrategyLinkID());
  }

  public boolean isSet(quickfix.field.StrategyLinkID field) {
    return isSetField(field);
  }

  public boolean isSetStrategyLinkID() {
    return isSetField(1851);
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

  public void set(quickfix.field.NumberOfBuyOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfBuyOrders get(quickfix.field.NumberOfBuyOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfBuyOrders getNumberOfBuyOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfBuyOrders());
  }

  public boolean isSet(quickfix.field.NumberOfBuyOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfBuyOrders() {
    return isSetField(2449);
  }

  public void set(quickfix.field.NumberOfSellOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfSellOrders get(quickfix.field.NumberOfSellOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfSellOrders getNumberOfSellOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfSellOrders());
  }

  public boolean isSet(quickfix.field.NumberOfSellOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfSellOrders() {
    return isSetField(2450);
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

  public void set(quickfix.field.Scope value) {
    setField(value);
  }

  public quickfix.field.Scope get(quickfix.field.Scope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Scope getScope() throws FieldNotFound {
    return get(new quickfix.field.Scope());
  }

  public boolean isSet(quickfix.field.Scope field) {
    return isSetField(field);
  }

  public boolean isSetScope() {
    return isSetField(546);
  }

  public void set(quickfix.field.PriceDelta value) {
    setField(value);
  }

  public quickfix.field.PriceDelta get(quickfix.field.PriceDelta value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceDelta getPriceDelta() throws FieldNotFound {
    return get(new quickfix.field.PriceDelta());
  }

  public boolean isSet(quickfix.field.PriceDelta field) {
    return isSetField(field);
  }

  public boolean isSetPriceDelta() {
    return isSetField(811);
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

  public void set(quickfix.field.TertiaryTrdType value) {
    setField(value);
  }

  public quickfix.field.TertiaryTrdType get(quickfix.field.TertiaryTrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TertiaryTrdType getTertiaryTrdType() throws FieldNotFound {
    return get(new quickfix.field.TertiaryTrdType());
  }

  public boolean isSet(quickfix.field.TertiaryTrdType field) {
    return isSetField(field);
  }

  public boolean isSetTertiaryTrdType() {
    return isSetField(2896);
  }

  public void set(quickfix.field.RegulatoryReportType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportType get(quickfix.field.RegulatoryReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportType getRegulatoryReportType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportType());
  }

  public boolean isSet(quickfix.field.RegulatoryReportType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportType() {
    return isSetField(1934);
  }

  public void set(quickfix.field.ExecMethod value) {
    setField(value);
  }

  public quickfix.field.ExecMethod get(quickfix.field.ExecMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecMethod getExecMethod() throws FieldNotFound {
    return get(new quickfix.field.ExecMethod());
  }

  public boolean isSet(quickfix.field.ExecMethod field) {
    return isSetField(field);
  }

  public boolean isSetExecMethod() {
    return isSetField(2405);
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

  public void set(quickfix.field.OrderCategory value) {
    setField(value);
  }

  public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
    return get(new quickfix.field.OrderCategory());
  }

  public boolean isSet(quickfix.field.OrderCategory field) {
    return isSetField(field);
  }

  public boolean isSetOrderCategory() {
    return isSetField(1115);
  }

  public void set(quickfix.field.TradePublishIndicator value) {
    setField(value);
  }

  public quickfix.field.TradePublishIndicator get(quickfix.field.TradePublishIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePublishIndicator getTradePublishIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradePublishIndicator());
  }

  public boolean isSet(quickfix.field.TradePublishIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradePublishIndicator() {
    return isSetField(1390);
  }

  public void set(quickfix.fixlatest.component.TrdRegPublicationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp get(quickfix.fixlatest.component.TrdRegPublicationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp getTrdRegPublicationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegPublicationGrp());
  }

  public void set(quickfix.field.NoTrdRegPublications value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegPublications get(quickfix.field.NoTrdRegPublications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegPublications getNoTrdRegPublications() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegPublications());
  }

  public boolean isSet(quickfix.field.NoTrdRegPublications field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegPublications() {
    return isSetField(2668);
  }

public static class NoTrdRegPublications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2669, 2670, 0};

  public NoTrdRegPublications() {
    super(2668, 2669, ORDER);
  }

  public void set(quickfix.field.TrdRegPublicationType value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationType get(quickfix.field.TrdRegPublicationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationType getTrdRegPublicationType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationType());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationType() {
    return isSetField(2669);
  }

  public void set(quickfix.field.TrdRegPublicationReason value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationReason get(quickfix.field.TrdRegPublicationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationReason getTrdRegPublicationReason() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationReason());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationReason field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationReason() {
    return isSetField(2670);
  }
}

  public void set(quickfix.field.IntraFirmTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.IntraFirmTradeIndicator get(quickfix.field.IntraFirmTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IntraFirmTradeIndicator getIntraFirmTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.IntraFirmTradeIndicator());
  }

  public boolean isSet(quickfix.field.IntraFirmTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetIntraFirmTradeIndicator() {
    return isSetField(2373);
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

  public void set(quickfix.fixlatest.component.RelatedTradeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedTradeGrp get(quickfix.fixlatest.component.RelatedTradeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedTradeGrp getRelatedTradeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedTradeGrp());
  }

  public void set(quickfix.field.NoRelatedTrades value) {
    setField(value);
  }

  public quickfix.field.NoRelatedTrades get(quickfix.field.NoRelatedTrades value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedTrades getNoRelatedTrades() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedTrades());
  }

  public boolean isSet(quickfix.field.NoRelatedTrades field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedTrades() {
    return isSetField(1855);
  }

public static class NoRelatedTrades extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1856, 1857, 2103, 1858, 1859, 1860, 0};

  public NoRelatedTrades() {
    super(1855, 1856, ORDER);
  }

  public void set(quickfix.field.RelatedTradeID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeID get(quickfix.field.RelatedTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeID getRelatedTradeID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeID());
  }

  public boolean isSet(quickfix.field.RelatedTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeID() {
    return isSetField(1856);
  }

  public void set(quickfix.field.RelatedTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeIDSource get(quickfix.field.RelatedTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeIDSource getRelatedTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeIDSource() {
    return isSetField(1857);
  }

  public void set(quickfix.field.RelatedRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource get(quickfix.field.RelatedRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource getRelatedRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedRegulatoryTradeIDSource() {
    return isSetField(2103);
  }

  public void set(quickfix.field.RelatedTradeDate value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeDate get(quickfix.field.RelatedTradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeDate getRelatedTradeDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeDate());
  }

  public boolean isSet(quickfix.field.RelatedTradeDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeDate() {
    return isSetField(1858);
  }

  public void set(quickfix.field.RelatedTradeMarketID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeMarketID get(quickfix.field.RelatedTradeMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeMarketID getRelatedTradeMarketID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeMarketID());
  }

  public boolean isSet(quickfix.field.RelatedTradeMarketID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeMarketID() {
    return isSetField(1859);
  }

  public void set(quickfix.field.RelatedTradeQuantity value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeQuantity get(quickfix.field.RelatedTradeQuantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeQuantity getRelatedTradeQuantity() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeQuantity());
  }

  public boolean isSet(quickfix.field.RelatedTradeQuantity field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeQuantity() {
    return isSetField(1860);
  }
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

  public void set(quickfix.field.MDPriceLevel value) {
    setField(value);
  }

  public quickfix.field.MDPriceLevel get(quickfix.field.MDPriceLevel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDPriceLevel getMDPriceLevel() throws FieldNotFound {
    return get(new quickfix.field.MDPriceLevel());
  }

  public boolean isSet(quickfix.field.MDPriceLevel field) {
    return isSetField(field);
  }

  public boolean isSetMDPriceLevel() {
    return isSetField(1023);
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

  public void set(quickfix.field.FirstPx value) {
    setField(value);
  }

  public quickfix.field.FirstPx get(quickfix.field.FirstPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirstPx getFirstPx() throws FieldNotFound {
    return get(new quickfix.field.FirstPx());
  }

  public boolean isSet(quickfix.field.FirstPx field) {
    return isSetField(field);
  }

  public boolean isSetFirstPx() {
    return isSetField(1025);
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

  public void set(quickfix.field.DiscountFactor value) {
    setField(value);
  }

  public quickfix.field.DiscountFactor get(quickfix.field.DiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscountFactor getDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.DiscountFactor());
  }

  public boolean isSet(quickfix.field.DiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetDiscountFactor() {
    return isSetField(1592);
  }

  public void set(quickfix.field.TradeVolume value) {
    setField(value);
  }

  public quickfix.field.TradeVolume get(quickfix.field.TradeVolume value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeVolume getTradeVolume() throws FieldNotFound {
    return get(new quickfix.field.TradeVolume());
  }

  public boolean isSet(quickfix.field.TradeVolume field) {
    return isSetField(field);
  }

  public boolean isSetTradeVolume() {
    return isSetField(1020);
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

  public void set(quickfix.field.SettlPriceType value) {
    setField(value);
  }

  public quickfix.field.SettlPriceType get(quickfix.field.SettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceType getSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceType());
  }

  public boolean isSet(quickfix.field.SettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceType() {
    return isSetField(731);
  }

  public void set(quickfix.field.SettlPriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.SettlPriceDeterminationMethod get(quickfix.field.SettlPriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceDeterminationMethod getSettlPriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.SettlPriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceDeterminationMethod() {
    return isSetField(2451);
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

  public void set(quickfix.field.MDQuoteType value) {
    setField(value);
  }

  public quickfix.field.MDQuoteType get(quickfix.field.MDQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDQuoteType getMDQuoteType() throws FieldNotFound {
    return get(new quickfix.field.MDQuoteType());
  }

  public boolean isSet(quickfix.field.MDQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetMDQuoteType() {
    return isSetField(1070);
  }

  public void set(quickfix.field.RptSeq value) {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
    return get(new quickfix.field.RptSeq());
  }

  public boolean isSet(quickfix.field.RptSeq field) {
    return isSetField(field);
  }

  public boolean isSetRptSeq() {
    return isSetField(83);
  }

  public void set(quickfix.field.DealingCapacity value) {
    setField(value);
  }

  public quickfix.field.DealingCapacity get(quickfix.field.DealingCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DealingCapacity getDealingCapacity() throws FieldNotFound {
    return get(new quickfix.field.DealingCapacity());
  }

  public boolean isSet(quickfix.field.DealingCapacity field) {
    return isSetField(field);
  }

  public boolean isSetDealingCapacity() {
    return isSetField(1048);
  }

  public void set(quickfix.field.MDEntrySpotRate value) {
    setField(value);
  }

  public quickfix.field.MDEntrySpotRate get(quickfix.field.MDEntrySpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySpotRate getMDEntrySpotRate() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySpotRate());
  }

  public boolean isSet(quickfix.field.MDEntrySpotRate field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySpotRate() {
    return isSetField(1026);
  }

  public void set(quickfix.field.MDEntryForwardPoints value) {
    setField(value);
  }

  public quickfix.field.MDEntryForwardPoints get(quickfix.field.MDEntryForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryForwardPoints getMDEntryForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.MDEntryForwardPoints());
  }

  public boolean isSet(quickfix.field.MDEntryForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryForwardPoints() {
    return isSetField(1027);
  }

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

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

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

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

  public void set(quickfix.field.AggressorTime value) {
    setField(value);
  }

  public quickfix.field.AggressorTime get(quickfix.field.AggressorTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorTime getAggressorTime() throws FieldNotFound {
    return get(new quickfix.field.AggressorTime());
  }

  public boolean isSet(quickfix.field.AggressorTime field) {
    return isSetField(field);
  }

  public boolean isSetAggressorTime() {
    return isSetField(2445);
  }

  public void set(quickfix.field.AggressorSide value) {
    setField(value);
  }

  public quickfix.field.AggressorSide get(quickfix.field.AggressorSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorSide getAggressorSide() throws FieldNotFound {
    return get(new quickfix.field.AggressorSide());
  }

  public boolean isSet(quickfix.field.AggressorSide field) {
    return isSetField(field);
  }

  public boolean isSetAggressorSide() {
    return isSetField(2446);
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

  public void set(quickfix.field.MDEntryID value) {
    setField(value);
  }

  public quickfix.field.MDEntryID get(quickfix.field.MDEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound {
    return get(new quickfix.field.MDEntryID());
  }

  public boolean isSet(quickfix.field.MDEntryID field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryID() {
    return isSetField(278);
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

  public void set(quickfix.fixlatest.component.PriceQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceQualifierGrp get(quickfix.fixlatest.component.PriceQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceQualifierGrp getPriceQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceQualifierGrp());
  }

  public void set(quickfix.field.NoPriceQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoPriceQualifiers get(quickfix.field.NoPriceQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceQualifiers getNoPriceQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoPriceQualifiers());
  }

  public boolean isSet(quickfix.field.NoPriceQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceQualifiers() {
    return isSetField(2709);
  }

public static class NoPriceQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2710, 0};

  public NoPriceQualifiers() {
    super(2709, 2710, ORDER);
  }

  public void set(quickfix.field.PriceQualifier value) {
    setField(value);
  }

  public quickfix.field.PriceQualifier get(quickfix.field.PriceQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQualifier getPriceQualifier() throws FieldNotFound {
    return get(new quickfix.field.PriceQualifier());
  }

  public boolean isSet(quickfix.field.PriceQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPriceQualifier() {
    return isSetField(2710);
  }
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

  public void set(quickfix.fixlatest.component.YieldData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.YieldData get(quickfix.fixlatest.component.YieldData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.YieldData getYieldDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.YieldData());
  }

  public void set(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData get(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SpreadOrBenchmarkCurveData());
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

  public void set(quickfix.fixlatest.component.RateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RateSource get(quickfix.fixlatest.component.RateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RateSource getRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RateSource());
  }

  public void set(quickfix.field.NoRateSources value) {
    setField(value);
  }

  public quickfix.field.NoRateSources get(quickfix.field.NoRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRateSources getNoRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoRateSources());
  }

  public boolean isSet(quickfix.field.NoRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoRateSources() {
    return isSetField(1445);
  }

public static class NoRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1446, 1447, 1448, 2412, 2796, 0};

  public NoRateSources() {
    super(1445, 1446, ORDER);
  }

  public void set(quickfix.field.RateSource value) {
    setField(value);
  }

  public quickfix.field.RateSource get(quickfix.field.RateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSource getRateSource() throws FieldNotFound {
    return get(new quickfix.field.RateSource());
  }

  public boolean isSet(quickfix.field.RateSource field) {
    return isSetField(field);
  }

  public boolean isSetRateSource() {
    return isSetField(1446);
  }

  public void set(quickfix.field.RateSourceType value) {
    setField(value);
  }

  public quickfix.field.RateSourceType get(quickfix.field.RateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceType getRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.RateSourceType());
  }

  public boolean isSet(quickfix.field.RateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceType() {
    return isSetField(1447);
  }

  public void set(quickfix.field.ReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReferencePage get(quickfix.field.ReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferencePage getReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReferencePage());
  }

  public boolean isSet(quickfix.field.ReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReferencePage() {
    return isSetField(1448);
  }

  public void set(quickfix.field.RateSourceReferemcePageHeading value) {
    setField(value);
  }

  public quickfix.field.RateSourceReferemcePageHeading get(quickfix.field.RateSourceReferemcePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceReferemcePageHeading getRateSourceReferemcePageHeading() throws FieldNotFound {
    return get(new quickfix.field.RateSourceReferemcePageHeading());
  }

  public boolean isSet(quickfix.field.RateSourceReferemcePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceReferemcePageHeading() {
    return isSetField(2412);
  }

  public void set(quickfix.field.FXBenchmarkRateFix value) {
    setField(value);
  }

  public quickfix.field.FXBenchmarkRateFix get(quickfix.field.FXBenchmarkRateFix value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FXBenchmarkRateFix getFXBenchmarkRateFix() throws FieldNotFound {
    return get(new quickfix.field.FXBenchmarkRateFix());
  }

  public boolean isSet(quickfix.field.FXBenchmarkRateFix field) {
    return isSetField(field);
  }

  public boolean isSetFXBenchmarkRateFix() {
    return isSetField(2796);
  }
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

  public void set(quickfix.fixlatest.component.SecSizesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecSizesGrp get(quickfix.fixlatest.component.SecSizesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecSizesGrp getSecSizesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecSizesGrp());
  }

  public void set(quickfix.field.NoOfSecSizes value) {
    setField(value);
  }

  public quickfix.field.NoOfSecSizes get(quickfix.field.NoOfSecSizes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfSecSizes getNoOfSecSizes() throws FieldNotFound {
    return get(new quickfix.field.NoOfSecSizes());
  }

  public boolean isSet(quickfix.field.NoOfSecSizes field) {
    return isSetField(field);
  }

  public boolean isSetNoOfSecSizes() {
    return isSetField(1177);
  }

public static class NoOfSecSizes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1178, 1179, 0};

  public NoOfSecSizes() {
    super(1177, 1178, ORDER);
  }

  public void set(quickfix.field.MDSecSizeType value) {
    setField(value);
  }

  public quickfix.field.MDSecSizeType get(quickfix.field.MDSecSizeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSizeType getMDSecSizeType() throws FieldNotFound {
    return get(new quickfix.field.MDSecSizeType());
  }

  public boolean isSet(quickfix.field.MDSecSizeType field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSizeType() {
    return isSetField(1178);
  }

  public void set(quickfix.field.MDSecSize value) {
    setField(value);
  }

  public quickfix.field.MDSecSize get(quickfix.field.MDSecSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSize getMDSecSize() throws FieldNotFound {
    return get(new quickfix.field.MDSecSize());
  }

  public boolean isSet(quickfix.field.MDSecSize field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSize() {
    return isSetField(1179);
  }
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

  public void set(quickfix.field.MarketCondition value) {
    setField(value);
  }

  public quickfix.field.MarketCondition get(quickfix.field.MarketCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketCondition getMarketCondition() throws FieldNotFound {
    return get(new quickfix.field.MarketCondition());
  }

  public boolean isSet(quickfix.field.MarketCondition field) {
    return isSetField(field);
  }

  public boolean isSetMarketCondition() {
    return isSetField(2705);
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

  public void set(quickfix.fixlatest.component.TradePriceConditionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp get(quickfix.fixlatest.component.TradePriceConditionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp getTradePriceConditionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePriceConditionGrp());
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}

  public void set(quickfix.field.AlgorithmicTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.AlgorithmicTradeIndicator get(quickfix.field.AlgorithmicTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AlgorithmicTradeIndicator getAlgorithmicTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AlgorithmicTradeIndicator());
  }

  public boolean isSet(quickfix.field.AlgorithmicTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAlgorithmicTradeIndicator() {
    return isSetField(2667);
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

  public void set(quickfix.field.OpenCloseSettlFlag value) {
    setField(value);
  }

  public quickfix.field.OpenCloseSettlFlag get(quickfix.field.OpenCloseSettlFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound {
    return get(new quickfix.field.OpenCloseSettlFlag());
  }

  public boolean isSet(quickfix.field.OpenCloseSettlFlag field) {
    return isSetField(field);
  }

  public boolean isSetOpenCloseSettlFlag() {
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

  public void set(quickfix.field.TradeID value) {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound {
    return get(new quickfix.field.TradeID());
  }

  public boolean isSet(quickfix.field.TradeID field) {
    return isSetField(field);
  }

  public boolean isSetTradeID() {
    return isSetField(1003);
  }

  public void set(quickfix.field.StrategyLinkID value) {
    setField(value);
  }

  public quickfix.field.StrategyLinkID get(quickfix.field.StrategyLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyLinkID getStrategyLinkID() throws FieldNotFound {
    return get(new quickfix.field.StrategyLinkID());
  }

  public boolean isSet(quickfix.field.StrategyLinkID field) {
    return isSetField(field);
  }

  public boolean isSetStrategyLinkID() {
    return isSetField(1851);
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

  public void set(quickfix.field.NumberOfBuyOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfBuyOrders get(quickfix.field.NumberOfBuyOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfBuyOrders getNumberOfBuyOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfBuyOrders());
  }

  public boolean isSet(quickfix.field.NumberOfBuyOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfBuyOrders() {
    return isSetField(2449);
  }

  public void set(quickfix.field.NumberOfSellOrders value) {
    setField(value);
  }

  public quickfix.field.NumberOfSellOrders get(quickfix.field.NumberOfSellOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfSellOrders getNumberOfSellOrders() throws FieldNotFound {
    return get(new quickfix.field.NumberOfSellOrders());
  }

  public boolean isSet(quickfix.field.NumberOfSellOrders field) {
    return isSetField(field);
  }

  public boolean isSetNumberOfSellOrders() {
    return isSetField(2450);
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

  public void set(quickfix.field.Scope value) {
    setField(value);
  }

  public quickfix.field.Scope get(quickfix.field.Scope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Scope getScope() throws FieldNotFound {
    return get(new quickfix.field.Scope());
  }

  public boolean isSet(quickfix.field.Scope field) {
    return isSetField(field);
  }

  public boolean isSetScope() {
    return isSetField(546);
  }

  public void set(quickfix.field.PriceDelta value) {
    setField(value);
  }

  public quickfix.field.PriceDelta get(quickfix.field.PriceDelta value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceDelta getPriceDelta() throws FieldNotFound {
    return get(new quickfix.field.PriceDelta());
  }

  public boolean isSet(quickfix.field.PriceDelta field) {
    return isSetField(field);
  }

  public boolean isSetPriceDelta() {
    return isSetField(811);
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

  public void set(quickfix.field.TertiaryTrdType value) {
    setField(value);
  }

  public quickfix.field.TertiaryTrdType get(quickfix.field.TertiaryTrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TertiaryTrdType getTertiaryTrdType() throws FieldNotFound {
    return get(new quickfix.field.TertiaryTrdType());
  }

  public boolean isSet(quickfix.field.TertiaryTrdType field) {
    return isSetField(field);
  }

  public boolean isSetTertiaryTrdType() {
    return isSetField(2896);
  }

  public void set(quickfix.field.RegulatoryReportType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportType get(quickfix.field.RegulatoryReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportType getRegulatoryReportType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportType());
  }

  public boolean isSet(quickfix.field.RegulatoryReportType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportType() {
    return isSetField(1934);
  }

  public void set(quickfix.field.ExecMethod value) {
    setField(value);
  }

  public quickfix.field.ExecMethod get(quickfix.field.ExecMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecMethod getExecMethod() throws FieldNotFound {
    return get(new quickfix.field.ExecMethod());
  }

  public boolean isSet(quickfix.field.ExecMethod field) {
    return isSetField(field);
  }

  public boolean isSetExecMethod() {
    return isSetField(2405);
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

  public void set(quickfix.field.OrderCategory value) {
    setField(value);
  }

  public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
    return get(new quickfix.field.OrderCategory());
  }

  public boolean isSet(quickfix.field.OrderCategory field) {
    return isSetField(field);
  }

  public boolean isSetOrderCategory() {
    return isSetField(1115);
  }

  public void set(quickfix.field.TradePublishIndicator value) {
    setField(value);
  }

  public quickfix.field.TradePublishIndicator get(quickfix.field.TradePublishIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePublishIndicator getTradePublishIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradePublishIndicator());
  }

  public boolean isSet(quickfix.field.TradePublishIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradePublishIndicator() {
    return isSetField(1390);
  }

  public void set(quickfix.fixlatest.component.TrdRegPublicationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp get(quickfix.fixlatest.component.TrdRegPublicationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp getTrdRegPublicationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegPublicationGrp());
  }

  public void set(quickfix.field.NoTrdRegPublications value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegPublications get(quickfix.field.NoTrdRegPublications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegPublications getNoTrdRegPublications() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegPublications());
  }

  public boolean isSet(quickfix.field.NoTrdRegPublications field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegPublications() {
    return isSetField(2668);
  }

public static class NoTrdRegPublications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2669, 2670, 0};

  public NoTrdRegPublications() {
    super(2668, 2669, ORDER);
  }

  public void set(quickfix.field.TrdRegPublicationType value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationType get(quickfix.field.TrdRegPublicationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationType getTrdRegPublicationType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationType());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationType() {
    return isSetField(2669);
  }

  public void set(quickfix.field.TrdRegPublicationReason value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationReason get(quickfix.field.TrdRegPublicationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationReason getTrdRegPublicationReason() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationReason());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationReason field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationReason() {
    return isSetField(2670);
  }
}

  public void set(quickfix.field.IntraFirmTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.IntraFirmTradeIndicator get(quickfix.field.IntraFirmTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IntraFirmTradeIndicator getIntraFirmTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.IntraFirmTradeIndicator());
  }

  public boolean isSet(quickfix.field.IntraFirmTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetIntraFirmTradeIndicator() {
    return isSetField(2373);
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

  public void set(quickfix.fixlatest.component.RelatedTradeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedTradeGrp get(quickfix.fixlatest.component.RelatedTradeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedTradeGrp getRelatedTradeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedTradeGrp());
  }

  public void set(quickfix.field.NoRelatedTrades value) {
    setField(value);
  }

  public quickfix.field.NoRelatedTrades get(quickfix.field.NoRelatedTrades value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedTrades getNoRelatedTrades() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedTrades());
  }

  public boolean isSet(quickfix.field.NoRelatedTrades field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedTrades() {
    return isSetField(1855);
  }

public static class NoRelatedTrades extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1856, 1857, 2103, 1858, 1859, 1860, 0};

  public NoRelatedTrades() {
    super(1855, 1856, ORDER);
  }

  public void set(quickfix.field.RelatedTradeID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeID get(quickfix.field.RelatedTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeID getRelatedTradeID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeID());
  }

  public boolean isSet(quickfix.field.RelatedTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeID() {
    return isSetField(1856);
  }

  public void set(quickfix.field.RelatedTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeIDSource get(quickfix.field.RelatedTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeIDSource getRelatedTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeIDSource() {
    return isSetField(1857);
  }

  public void set(quickfix.field.RelatedRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource get(quickfix.field.RelatedRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource getRelatedRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedRegulatoryTradeIDSource() {
    return isSetField(2103);
  }

  public void set(quickfix.field.RelatedTradeDate value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeDate get(quickfix.field.RelatedTradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeDate getRelatedTradeDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeDate());
  }

  public boolean isSet(quickfix.field.RelatedTradeDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeDate() {
    return isSetField(1858);
  }

  public void set(quickfix.field.RelatedTradeMarketID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeMarketID get(quickfix.field.RelatedTradeMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeMarketID getRelatedTradeMarketID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeMarketID());
  }

  public boolean isSet(quickfix.field.RelatedTradeMarketID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeMarketID() {
    return isSetField(1859);
  }

  public void set(quickfix.field.RelatedTradeQuantity value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeQuantity get(quickfix.field.RelatedTradeQuantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeQuantity getRelatedTradeQuantity() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeQuantity());
  }

  public boolean isSet(quickfix.field.RelatedTradeQuantity field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeQuantity() {
    return isSetField(1860);
  }
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

  public void set(quickfix.field.MDPriceLevel value) {
    setField(value);
  }

  public quickfix.field.MDPriceLevel get(quickfix.field.MDPriceLevel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDPriceLevel getMDPriceLevel() throws FieldNotFound {
    return get(new quickfix.field.MDPriceLevel());
  }

  public boolean isSet(quickfix.field.MDPriceLevel field) {
    return isSetField(field);
  }

  public boolean isSetMDPriceLevel() {
    return isSetField(1023);
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

  public void set(quickfix.field.FirstPx value) {
    setField(value);
  }

  public quickfix.field.FirstPx get(quickfix.field.FirstPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirstPx getFirstPx() throws FieldNotFound {
    return get(new quickfix.field.FirstPx());
  }

  public boolean isSet(quickfix.field.FirstPx field) {
    return isSetField(field);
  }

  public boolean isSetFirstPx() {
    return isSetField(1025);
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

  public void set(quickfix.field.DiscountFactor value) {
    setField(value);
  }

  public quickfix.field.DiscountFactor get(quickfix.field.DiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscountFactor getDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.DiscountFactor());
  }

  public boolean isSet(quickfix.field.DiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetDiscountFactor() {
    return isSetField(1592);
  }

  public void set(quickfix.field.TradeVolume value) {
    setField(value);
  }

  public quickfix.field.TradeVolume get(quickfix.field.TradeVolume value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeVolume getTradeVolume() throws FieldNotFound {
    return get(new quickfix.field.TradeVolume());
  }

  public boolean isSet(quickfix.field.TradeVolume field) {
    return isSetField(field);
  }

  public boolean isSetTradeVolume() {
    return isSetField(1020);
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

  public void set(quickfix.field.SettlPriceType value) {
    setField(value);
  }

  public quickfix.field.SettlPriceType get(quickfix.field.SettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceType getSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceType());
  }

  public boolean isSet(quickfix.field.SettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceType() {
    return isSetField(731);
  }

  public void set(quickfix.field.SettlPriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.SettlPriceDeterminationMethod get(quickfix.field.SettlPriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceDeterminationMethod getSettlPriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.SettlPriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceDeterminationMethod() {
    return isSetField(2451);
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

  public void set(quickfix.field.MDQuoteType value) {
    setField(value);
  }

  public quickfix.field.MDQuoteType get(quickfix.field.MDQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDQuoteType getMDQuoteType() throws FieldNotFound {
    return get(new quickfix.field.MDQuoteType());
  }

  public boolean isSet(quickfix.field.MDQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetMDQuoteType() {
    return isSetField(1070);
  }

  public void set(quickfix.field.RptSeq value) {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
    return get(new quickfix.field.RptSeq());
  }

  public boolean isSet(quickfix.field.RptSeq field) {
    return isSetField(field);
  }

  public boolean isSetRptSeq() {
    return isSetField(83);
  }

  public void set(quickfix.field.DealingCapacity value) {
    setField(value);
  }

  public quickfix.field.DealingCapacity get(quickfix.field.DealingCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DealingCapacity getDealingCapacity() throws FieldNotFound {
    return get(new quickfix.field.DealingCapacity());
  }

  public boolean isSet(quickfix.field.DealingCapacity field) {
    return isSetField(field);
  }

  public boolean isSetDealingCapacity() {
    return isSetField(1048);
  }

  public void set(quickfix.field.MDEntrySpotRate value) {
    setField(value);
  }

  public quickfix.field.MDEntrySpotRate get(quickfix.field.MDEntrySpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySpotRate getMDEntrySpotRate() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySpotRate());
  }

  public boolean isSet(quickfix.field.MDEntrySpotRate field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySpotRate() {
    return isSetField(1026);
  }

  public void set(quickfix.field.MDEntryForwardPoints value) {
    setField(value);
  }

  public quickfix.field.MDEntryForwardPoints get(quickfix.field.MDEntryForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryForwardPoints getMDEntryForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.MDEntryForwardPoints());
  }

  public boolean isSet(quickfix.field.MDEntryForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryForwardPoints() {
    return isSetField(1027);
  }

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

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

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
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
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

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

  public void set(quickfix.field.AggressorTime value) {
    setField(value);
  }

  public quickfix.field.AggressorTime get(quickfix.field.AggressorTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorTime getAggressorTime() throws FieldNotFound {
    return get(new quickfix.field.AggressorTime());
  }

  public boolean isSet(quickfix.field.AggressorTime field) {
    return isSetField(field);
  }

  public boolean isSetAggressorTime() {
    return isSetField(2445);
  }

  public void set(quickfix.field.AggressorSide value) {
    setField(value);
  }

  public quickfix.field.AggressorSide get(quickfix.field.AggressorSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorSide getAggressorSide() throws FieldNotFound {
    return get(new quickfix.field.AggressorSide());
  }

  public boolean isSet(quickfix.field.AggressorSide field) {
    return isSetField(field);
  }

  public boolean isSetAggressorSide() {
    return isSetField(2446);
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
}
