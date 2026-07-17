/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEvents extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2218, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEvents() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEvents get(quickfix.field.NoLegComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEvents getNoLegComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEvents());
  }

  public boolean isSet(quickfix.field.NoLegComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEvents() {
    return isSetField(2218);
  }

public static class NoLegComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2219, 2220, 2221, 2222, 2223, 2224, 2225, 2226, 2227, 2228, 2229, 2230, 2231, 2232, 2250, 2233, 2234, 2235, 2236, 2409, 2410, 2237, 2238, 2239, 2240, 2241, 41382, 41389, 41390, 41391, 41392, 41393, 41394, 41387, 41395, 41396, 41397, 41379, 2242, 2243, 2244, 2245, 2246, 41398, 41366, 2608, 2609, 2610, 2248, 2249, 0};

  public NoLegComplexEvents() {
    super(2218, 2219, ORDER);
  }

  public void set(quickfix.field.LegComplexEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventType get(quickfix.field.LegComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventType getLegComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventType() {
    return isSetField(2219);
  }

  public void set(quickfix.field.LegComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutPaySide get(quickfix.field.LegComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutPaySide getLegComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutPaySide() {
    return isSetField(2220);
  }

  public void set(quickfix.field.LegComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutReceiveSide get(quickfix.field.LegComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutReceiveSide getLegComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutReceiveSide() {
    return isSetField(2221);
  }

  public void set(quickfix.field.LegComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutUnderlier get(quickfix.field.LegComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutUnderlier getLegComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutUnderlier() {
    return isSetField(2222);
  }

  public void set(quickfix.field.LegComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutAmount get(quickfix.field.LegComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutAmount getLegComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutAmount() {
    return isSetField(2223);
  }

  public void set(quickfix.field.LegComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutPercentage get(quickfix.field.LegComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutPercentage getLegComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutPercentage() {
    return isSetField(2224);
  }

  public void set(quickfix.field.LegComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutTime get(quickfix.field.LegComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutTime getLegComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutTime() {
    return isSetField(2225);
  }

  public void set(quickfix.field.LegComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutCurrency get(quickfix.field.LegComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutCurrency getLegComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutCurrency() {
    return isSetField(2226);
  }

  public void set(quickfix.field.LegComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPrice get(quickfix.field.LegComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPrice getLegComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPrice());
  }

  public boolean isSet(quickfix.field.LegComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPrice() {
    return isSetField(2227);
  }

  public void set(quickfix.field.LegComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPricePercentage get(quickfix.field.LegComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPricePercentage getLegComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.LegComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPricePercentage() {
    return isSetField(2228);
  }

  public void set(quickfix.field.LegComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceBoundaryMethod get(quickfix.field.LegComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceBoundaryMethod getLegComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceBoundaryMethod() {
    return isSetField(2229);
  }

  public void set(quickfix.field.LegComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceBoundaryPrecision get(quickfix.field.LegComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceBoundaryPrecision getLegComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceBoundaryPrecision() {
    return isSetField(2230);
  }

  public void set(quickfix.field.LegComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceTimeType get(quickfix.field.LegComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceTimeType getLegComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceTimeType() {
    return isSetField(2231);
  }

  public void set(quickfix.field.LegComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCondition get(quickfix.field.LegComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCondition getLegComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCondition());
  }

  public boolean isSet(quickfix.field.LegComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCondition() {
    return isSetField(2232);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventDates get(quickfix.fixlatest.component.LegComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventDates getLegComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventDates());
  }

  public void set(quickfix.field.NoLegComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventDates get(quickfix.field.NoLegComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventDates getNoLegComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventDates() {
    return isSetField(2250);
  }

public static class NoLegComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2251, 2252, 2253, 0};

  public NoLegComplexEventDates() {
    super(2250, 2251, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartDate get(quickfix.field.LegComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartDate getLegComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartDate() {
    return isSetField(2251);
  }

  public void set(quickfix.field.LegComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndDate get(quickfix.field.LegComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndDate getLegComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndDate() {
    return isSetField(2252);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventTimes get(quickfix.fixlatest.component.LegComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventTimes getLegComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventTimes());
  }

  public void set(quickfix.field.NoLegComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventTimes get(quickfix.field.NoLegComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventTimes getNoLegComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventTimes() {
    return isSetField(2253);
  }

public static class NoLegComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2204, 2247, 0};

  public NoLegComplexEventTimes() {
    super(2253, 2204, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}
}

  public void set(quickfix.field.LegComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCurrencyOne get(quickfix.field.LegComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCurrencyOne getLegComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.LegComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCurrencyOne() {
    return isSetField(2233);
  }

  public void set(quickfix.field.LegComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCurrencyTwo get(quickfix.field.LegComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCurrencyTwo getLegComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.LegComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCurrencyTwo() {
    return isSetField(2234);
  }

  public void set(quickfix.field.LegComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventQuoteBasis get(quickfix.field.LegComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventQuoteBasis getLegComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.LegComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventQuoteBasis() {
    return isSetField(2235);
  }

  public void set(quickfix.field.LegComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFixedFXRate get(quickfix.field.LegComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFixedFXRate getLegComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.LegComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFixedFXRate() {
    return isSetField(2236);
  }

  public void set(quickfix.field.LegComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventSpotRate get(quickfix.field.LegComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventSpotRate getLegComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.LegComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventSpotRate() {
    return isSetField(2409);
  }

  public void set(quickfix.field.LegComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventForwardPoints get(quickfix.field.LegComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventForwardPoints getLegComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.LegComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventForwardPoints() {
    return isSetField(2410);
  }

  public void set(quickfix.field.LegComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDeterminationMethod get(quickfix.field.LegComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDeterminationMethod getLegComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDeterminationMethod() {
    return isSetField(2237);
  }

  public void set(quickfix.field.LegComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCalculationAgent get(quickfix.field.LegComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCalculationAgent getLegComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCalculationAgent() {
    return isSetField(2238);
  }

  public void set(quickfix.field.LegComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikePrice get(quickfix.field.LegComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikePrice getLegComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikePrice() {
    return isSetField(2239);
  }

  public void set(quickfix.field.LegComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikeFactor get(quickfix.field.LegComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikeFactor getLegComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikeFactor() {
    return isSetField(2240);
  }

  public void set(quickfix.field.LegComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikeNumberOfOptions get(quickfix.field.LegComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikeNumberOfOptions getLegComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikeNumberOfOptions() {
    return isSetField(2241);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventRateSourceGrp get(quickfix.fixlatest.component.LegComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventRateSourceGrp getLegComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoLegComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventRateSources get(quickfix.field.NoLegComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventRateSources getNoLegComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventRateSources() {
    return isSetField(41382);
  }

public static class NoLegComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41383, 41384, 41385, 41386, 0};

  public NoLegComplexEventRateSources() {
    super(41382, 41383, ORDER);
  }

  public void set(quickfix.field.LegComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSource get(quickfix.field.LegComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSource getLegComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSource() {
    return isSetField(41383);
  }

  public void set(quickfix.field.LegComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSourceType get(quickfix.field.LegComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSourceType getLegComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSourceType() {
    return isSetField(41384);
  }

  public void set(quickfix.field.LegComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventReferencePage get(quickfix.field.LegComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventReferencePage getLegComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.LegComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventReferencePage() {
    return isSetField(41385);
  }

  public void set(quickfix.field.LegComplexEvenReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegComplexEvenReferencePageHeading get(quickfix.field.LegComplexEvenReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEvenReferencePageHeading getLegComplexEvenReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEvenReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegComplexEvenReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEvenReferencePageHeading() {
    return isSetField(41386);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventRelativeDate get(quickfix.fixlatest.component.LegComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventRelativeDate getLegComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodGrp get(quickfix.fixlatest.component.LegComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodGrp getLegComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriods get(quickfix.field.NoLegComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriods getNoLegComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriods() {
    return isSetField(41379);
  }

public static class NoLegComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41380, 41381, 41400, 41376, 41363, 0};

  public NoLegComplexEventPeriods() {
    super(41379, 41380, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodType get(quickfix.field.LegComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodType getLegComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodType() {
    return isSetField(41380);
  }

  public void set(quickfix.field.LegComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventBusinessCenter get(quickfix.field.LegComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventBusinessCenter getLegComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventBusinessCenter() {
    return isSetField(41381);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp get(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp getLegComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoLegComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventSchedules get(quickfix.field.NoLegComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventSchedules getNoLegComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventSchedules() {
    return isSetField(41400);
  }

public static class NoLegComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41401, 41402, 41403, 41404, 41405, 0};

  public NoLegComplexEventSchedules() {
    super(41400, 41401, ORDER);
  }

  public void set(quickfix.field.LegComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleStartDate get(quickfix.field.LegComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleStartDate getLegComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleStartDate() {
    return isSetField(41401);
  }

  public void set(quickfix.field.LegComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleEndDate get(quickfix.field.LegComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleEndDate getLegComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleEndDate() {
    return isSetField(41402);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod get(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod getLegComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyPeriod() {
    return isSetField(41403);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit get(quickfix.field.LegComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit getLegComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyUnit() {
    return isSetField(41404);
  }

  public void set(quickfix.field.LegComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleRollConvention get(quickfix.field.LegComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleRollConvention getLegComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleRollConvention() {
    return isSetField(41405);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp get(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp getLegComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes get(quickfix.field.NoLegComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes getNoLegComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriodDateTimes() {
    return isSetField(41376);
  }

public static class NoLegComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41377, 41378, 0};

  public NoLegComplexEventPeriodDateTimes() {
    super(41376, 41377, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp getLegComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoLegComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventAveragingObservations get(quickfix.field.NoLegComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventAveragingObservations getNoLegComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventAveragingObservations() {
    return isSetField(41363);
  }

public static class NoLegComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41364, 41365, 0};

  public NoLegComplexEventAveragingObservations() {
    super(41363, 41364, ORDER);
  }

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}
}

  public void set(quickfix.field.LegComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventsXIDRef get(quickfix.field.LegComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventsXIDRef getLegComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventsXIDRef() {
    return isSetField(2242);
  }

  public void set(quickfix.field.LegComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventNotifyingParty get(quickfix.field.LegComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventNotifyingParty getLegComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventNotifyingParty() {
    return isSetField(2243);
  }

  public void set(quickfix.field.LegComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventBusinessCenter get(quickfix.field.LegComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventBusinessCenter getLegComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventBusinessCenter() {
    return isSetField(2244);
  }

  public void set(quickfix.field.LegComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventStandardSources get(quickfix.field.LegComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventStandardSources getLegComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventStandardSources() {
    return isSetField(2245);
  }

  public void set(quickfix.field.LegComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventMinimumSources get(quickfix.field.LegComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventMinimumSources getLegComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventMinimumSources() {
    return isSetField(2246);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp getLegComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventSources get(quickfix.field.NoLegComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventSources getNoLegComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventSources() {
    return isSetField(41398);
  }

public static class NoLegComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41399, 0};

  public NoLegComplexEventCreditEventSources() {
    super(41398, 41399, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventSource get(quickfix.field.LegComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventSource getLegComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventSource() {
    return isSetField(41399);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventGrp getLegComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEvents get(quickfix.field.NoLegComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEvents getNoLegComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEvents() {
    return isSetField(41366);
  }

public static class NoLegComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41367, 41368, 41369, 41370, 41371, 41372, 41373, 41374, 0};

  public NoLegComplexEventCreditEvents() {
    super(41366, 41367, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventType get(quickfix.field.LegComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventType getLegComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventType() {
    return isSetField(41367);
  }

  public void set(quickfix.field.LegComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventValue get(quickfix.field.LegComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventValue getLegComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventValue() {
    return isSetField(41368);
  }

  public void set(quickfix.field.LegComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventCurrency get(quickfix.field.LegComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventCurrency getLegComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventCurrency() {
    return isSetField(41369);
  }

  public void set(quickfix.field.LegComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventPeriod get(quickfix.field.LegComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventPeriod getLegComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventPeriod() {
    return isSetField(41370);
  }

  public void set(quickfix.field.LegComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventUnit get(quickfix.field.LegComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventUnit getLegComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventUnit() {
    return isSetField(41371);
  }

  public void set(quickfix.field.LegComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventDayType get(quickfix.field.LegComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventDayType getLegComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventDayType() {
    return isSetField(41372);
  }

  public void set(quickfix.field.LegComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventRateSource get(quickfix.field.LegComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventRateSource getLegComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventRateSource() {
    return isSetField(41373);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp getLegComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers get(quickfix.field.NoLegComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers getNoLegComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventQualifiers() {
    return isSetField(41374);
  }

public static class NoLegComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41375, 0};

  public NoLegComplexEventCreditEventQualifiers() {
    super(41374, 41375, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}
}

  public void set(quickfix.field.LegComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFuturesPriceValuation get(quickfix.field.LegComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFuturesPriceValuation getLegComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.LegComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFuturesPriceValuation() {
    return isSetField(2608);
  }

  public void set(quickfix.field.LegComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventOptionsPriceValuation get(quickfix.field.LegComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventOptionsPriceValuation getLegComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.LegComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventOptionsPriceValuation() {
    return isSetField(2609);
  }

  public void set(quickfix.field.LegComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPVFinalPriceElectionFallback get(quickfix.field.LegComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPVFinalPriceElectionFallback getLegComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.LegComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2610);
  }

  public void set(quickfix.field.LegComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventXID get(quickfix.field.LegComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventXID getLegComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventXID());
  }

  public boolean isSet(quickfix.field.LegComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventXID() {
    return isSetField(2248);
  }

  public void set(quickfix.field.LegComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventXIDRef get(quickfix.field.LegComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventXIDRef getLegComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.LegComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventXIDRef() {
    return isSetField(2249);
  }
}

  public void set(quickfix.field.LegComplexEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventType get(quickfix.field.LegComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventType getLegComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventType() {
    return isSetField(2219);
  }

  public void set(quickfix.field.LegComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutPaySide get(quickfix.field.LegComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutPaySide getLegComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutPaySide() {
    return isSetField(2220);
  }

  public void set(quickfix.field.LegComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutReceiveSide get(quickfix.field.LegComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutReceiveSide getLegComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutReceiveSide() {
    return isSetField(2221);
  }

  public void set(quickfix.field.LegComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutUnderlier get(quickfix.field.LegComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutUnderlier getLegComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutUnderlier() {
    return isSetField(2222);
  }

  public void set(quickfix.field.LegComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutAmount get(quickfix.field.LegComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutAmount getLegComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutAmount() {
    return isSetField(2223);
  }

  public void set(quickfix.field.LegComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutPercentage get(quickfix.field.LegComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutPercentage getLegComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutPercentage() {
    return isSetField(2224);
  }

  public void set(quickfix.field.LegComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutTime get(quickfix.field.LegComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutTime getLegComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutTime() {
    return isSetField(2225);
  }

  public void set(quickfix.field.LegComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutCurrency get(quickfix.field.LegComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutCurrency getLegComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutCurrency() {
    return isSetField(2226);
  }

  public void set(quickfix.field.LegComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPrice get(quickfix.field.LegComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPrice getLegComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPrice());
  }

  public boolean isSet(quickfix.field.LegComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPrice() {
    return isSetField(2227);
  }

  public void set(quickfix.field.LegComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPricePercentage get(quickfix.field.LegComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPricePercentage getLegComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.LegComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPricePercentage() {
    return isSetField(2228);
  }

  public void set(quickfix.field.LegComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceBoundaryMethod get(quickfix.field.LegComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceBoundaryMethod getLegComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceBoundaryMethod() {
    return isSetField(2229);
  }

  public void set(quickfix.field.LegComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceBoundaryPrecision get(quickfix.field.LegComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceBoundaryPrecision getLegComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceBoundaryPrecision() {
    return isSetField(2230);
  }

  public void set(quickfix.field.LegComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceTimeType get(quickfix.field.LegComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceTimeType getLegComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceTimeType() {
    return isSetField(2231);
  }

  public void set(quickfix.field.LegComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCondition get(quickfix.field.LegComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCondition getLegComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCondition());
  }

  public boolean isSet(quickfix.field.LegComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCondition() {
    return isSetField(2232);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventDates get(quickfix.fixlatest.component.LegComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventDates getLegComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventDates());
  }

  public void set(quickfix.field.NoLegComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventDates get(quickfix.field.NoLegComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventDates getNoLegComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventDates() {
    return isSetField(2250);
  }

public static class NoLegComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2251, 2252, 2253, 0};

  public NoLegComplexEventDates() {
    super(2250, 2251, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartDate get(quickfix.field.LegComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartDate getLegComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartDate() {
    return isSetField(2251);
  }

  public void set(quickfix.field.LegComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndDate get(quickfix.field.LegComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndDate getLegComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndDate() {
    return isSetField(2252);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventTimes get(quickfix.fixlatest.component.LegComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventTimes getLegComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventTimes());
  }

  public void set(quickfix.field.NoLegComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventTimes get(quickfix.field.NoLegComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventTimes getNoLegComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventTimes() {
    return isSetField(2253);
  }

public static class NoLegComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2204, 2247, 0};

  public NoLegComplexEventTimes() {
    super(2253, 2204, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}
}

  public void set(quickfix.field.LegComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCurrencyOne get(quickfix.field.LegComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCurrencyOne getLegComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.LegComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCurrencyOne() {
    return isSetField(2233);
  }

  public void set(quickfix.field.LegComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCurrencyTwo get(quickfix.field.LegComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCurrencyTwo getLegComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.LegComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCurrencyTwo() {
    return isSetField(2234);
  }

  public void set(quickfix.field.LegComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventQuoteBasis get(quickfix.field.LegComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventQuoteBasis getLegComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.LegComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventQuoteBasis() {
    return isSetField(2235);
  }

  public void set(quickfix.field.LegComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFixedFXRate get(quickfix.field.LegComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFixedFXRate getLegComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.LegComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFixedFXRate() {
    return isSetField(2236);
  }

  public void set(quickfix.field.LegComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventSpotRate get(quickfix.field.LegComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventSpotRate getLegComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.LegComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventSpotRate() {
    return isSetField(2409);
  }

  public void set(quickfix.field.LegComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventForwardPoints get(quickfix.field.LegComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventForwardPoints getLegComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.LegComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventForwardPoints() {
    return isSetField(2410);
  }

  public void set(quickfix.field.LegComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDeterminationMethod get(quickfix.field.LegComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDeterminationMethod getLegComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDeterminationMethod() {
    return isSetField(2237);
  }

  public void set(quickfix.field.LegComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCalculationAgent get(quickfix.field.LegComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCalculationAgent getLegComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCalculationAgent() {
    return isSetField(2238);
  }

  public void set(quickfix.field.LegComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikePrice get(quickfix.field.LegComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikePrice getLegComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikePrice() {
    return isSetField(2239);
  }

  public void set(quickfix.field.LegComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikeFactor get(quickfix.field.LegComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikeFactor getLegComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikeFactor() {
    return isSetField(2240);
  }

  public void set(quickfix.field.LegComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikeNumberOfOptions get(quickfix.field.LegComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikeNumberOfOptions getLegComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikeNumberOfOptions() {
    return isSetField(2241);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventRateSourceGrp get(quickfix.fixlatest.component.LegComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventRateSourceGrp getLegComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoLegComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventRateSources get(quickfix.field.NoLegComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventRateSources getNoLegComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventRateSources() {
    return isSetField(41382);
  }

public static class NoLegComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41383, 41384, 41385, 41386, 0};

  public NoLegComplexEventRateSources() {
    super(41382, 41383, ORDER);
  }

  public void set(quickfix.field.LegComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSource get(quickfix.field.LegComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSource getLegComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSource() {
    return isSetField(41383);
  }

  public void set(quickfix.field.LegComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSourceType get(quickfix.field.LegComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSourceType getLegComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSourceType() {
    return isSetField(41384);
  }

  public void set(quickfix.field.LegComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventReferencePage get(quickfix.field.LegComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventReferencePage getLegComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.LegComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventReferencePage() {
    return isSetField(41385);
  }

  public void set(quickfix.field.LegComplexEvenReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegComplexEvenReferencePageHeading get(quickfix.field.LegComplexEvenReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEvenReferencePageHeading getLegComplexEvenReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEvenReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegComplexEvenReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEvenReferencePageHeading() {
    return isSetField(41386);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventRelativeDate get(quickfix.fixlatest.component.LegComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventRelativeDate getLegComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodGrp get(quickfix.fixlatest.component.LegComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodGrp getLegComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriods get(quickfix.field.NoLegComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriods getNoLegComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriods() {
    return isSetField(41379);
  }

public static class NoLegComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41380, 41381, 41400, 41376, 41363, 0};

  public NoLegComplexEventPeriods() {
    super(41379, 41380, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodType get(quickfix.field.LegComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodType getLegComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodType() {
    return isSetField(41380);
  }

  public void set(quickfix.field.LegComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventBusinessCenter get(quickfix.field.LegComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventBusinessCenter getLegComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventBusinessCenter() {
    return isSetField(41381);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp get(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp getLegComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoLegComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventSchedules get(quickfix.field.NoLegComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventSchedules getNoLegComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventSchedules() {
    return isSetField(41400);
  }

public static class NoLegComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41401, 41402, 41403, 41404, 41405, 0};

  public NoLegComplexEventSchedules() {
    super(41400, 41401, ORDER);
  }

  public void set(quickfix.field.LegComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleStartDate get(quickfix.field.LegComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleStartDate getLegComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleStartDate() {
    return isSetField(41401);
  }

  public void set(quickfix.field.LegComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleEndDate get(quickfix.field.LegComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleEndDate getLegComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleEndDate() {
    return isSetField(41402);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod get(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod getLegComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyPeriod() {
    return isSetField(41403);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit get(quickfix.field.LegComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit getLegComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyUnit() {
    return isSetField(41404);
  }

  public void set(quickfix.field.LegComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleRollConvention get(quickfix.field.LegComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleRollConvention getLegComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleRollConvention() {
    return isSetField(41405);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp get(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp getLegComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes get(quickfix.field.NoLegComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes getNoLegComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriodDateTimes() {
    return isSetField(41376);
  }

public static class NoLegComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41377, 41378, 0};

  public NoLegComplexEventPeriodDateTimes() {
    super(41376, 41377, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp getLegComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoLegComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventAveragingObservations get(quickfix.field.NoLegComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventAveragingObservations getNoLegComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventAveragingObservations() {
    return isSetField(41363);
  }

public static class NoLegComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41364, 41365, 0};

  public NoLegComplexEventAveragingObservations() {
    super(41363, 41364, ORDER);
  }

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}
}

  public void set(quickfix.field.LegComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventsXIDRef get(quickfix.field.LegComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventsXIDRef getLegComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventsXIDRef() {
    return isSetField(2242);
  }

  public void set(quickfix.field.LegComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventNotifyingParty get(quickfix.field.LegComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventNotifyingParty getLegComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventNotifyingParty() {
    return isSetField(2243);
  }

  public void set(quickfix.field.LegComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventBusinessCenter get(quickfix.field.LegComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventBusinessCenter getLegComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventBusinessCenter() {
    return isSetField(2244);
  }

  public void set(quickfix.field.LegComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventStandardSources get(quickfix.field.LegComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventStandardSources getLegComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventStandardSources() {
    return isSetField(2245);
  }

  public void set(quickfix.field.LegComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventMinimumSources get(quickfix.field.LegComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventMinimumSources getLegComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventMinimumSources() {
    return isSetField(2246);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp getLegComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventSources get(quickfix.field.NoLegComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventSources getNoLegComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventSources() {
    return isSetField(41398);
  }

public static class NoLegComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41399, 0};

  public NoLegComplexEventCreditEventSources() {
    super(41398, 41399, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventSource get(quickfix.field.LegComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventSource getLegComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventSource() {
    return isSetField(41399);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventGrp getLegComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEvents get(quickfix.field.NoLegComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEvents getNoLegComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEvents() {
    return isSetField(41366);
  }

public static class NoLegComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41367, 41368, 41369, 41370, 41371, 41372, 41373, 41374, 0};

  public NoLegComplexEventCreditEvents() {
    super(41366, 41367, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventType get(quickfix.field.LegComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventType getLegComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventType() {
    return isSetField(41367);
  }

  public void set(quickfix.field.LegComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventValue get(quickfix.field.LegComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventValue getLegComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventValue() {
    return isSetField(41368);
  }

  public void set(quickfix.field.LegComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventCurrency get(quickfix.field.LegComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventCurrency getLegComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventCurrency() {
    return isSetField(41369);
  }

  public void set(quickfix.field.LegComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventPeriod get(quickfix.field.LegComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventPeriod getLegComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventPeriod() {
    return isSetField(41370);
  }

  public void set(quickfix.field.LegComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventUnit get(quickfix.field.LegComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventUnit getLegComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventUnit() {
    return isSetField(41371);
  }

  public void set(quickfix.field.LegComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventDayType get(quickfix.field.LegComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventDayType getLegComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventDayType() {
    return isSetField(41372);
  }

  public void set(quickfix.field.LegComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventRateSource get(quickfix.field.LegComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventRateSource getLegComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventRateSource() {
    return isSetField(41373);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp getLegComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers get(quickfix.field.NoLegComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers getNoLegComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventQualifiers() {
    return isSetField(41374);
  }

public static class NoLegComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41375, 0};

  public NoLegComplexEventCreditEventQualifiers() {
    super(41374, 41375, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}
}

  public void set(quickfix.field.LegComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFuturesPriceValuation get(quickfix.field.LegComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFuturesPriceValuation getLegComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.LegComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFuturesPriceValuation() {
    return isSetField(2608);
  }

  public void set(quickfix.field.LegComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventOptionsPriceValuation get(quickfix.field.LegComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventOptionsPriceValuation getLegComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.LegComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventOptionsPriceValuation() {
    return isSetField(2609);
  }

  public void set(quickfix.field.LegComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPVFinalPriceElectionFallback get(quickfix.field.LegComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPVFinalPriceElectionFallback getLegComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.LegComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2610);
  }

  public void set(quickfix.field.LegComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventXID get(quickfix.field.LegComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventXID getLegComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventXID());
  }

  public boolean isSet(quickfix.field.LegComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventXID() {
    return isSetField(2248);
  }

  public void set(quickfix.field.LegComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventXIDRef get(quickfix.field.LegComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventXIDRef getLegComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.LegComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventXIDRef() {
    return isSetField(2249);
  }
}
