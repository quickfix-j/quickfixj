/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEvents extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2045, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEvents() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEvents get(quickfix.field.NoUnderlyingComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEvents getNoUnderlyingComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEvents() {
    return isSetField(2045);
  }

public static class NoUnderlyingComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2046, 2261, 2262, 2263, 2047, 2264, 2265, 2266, 2048, 2267, 2049, 2050, 2051, 2052, 2053, 2268, 2269, 2270, 2271, 2419, 2420, 2272, 2273, 2274, 2275, 2276, 41732, 41739, 41740, 41741, 41742, 41743, 41744, 41737, 41745, 41746, 41747, 41729, 2277, 2278, 2279, 2280, 2281, 41748, 41716, 2611, 2612, 2613, 2282, 2283, 0};

  public NoUnderlyingComplexEvents() {
    super(2045, 2046, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventType get(quickfix.field.UnderlyingComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventType getUnderlyingComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventType() {
    return isSetField(2046);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutPaySide get(quickfix.field.UnderlyingComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutPaySide getUnderlyingComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutPaySide() {
    return isSetField(2261);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutReceiveSide get(quickfix.field.UnderlyingComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutReceiveSide getUnderlyingComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutReceiveSide() {
    return isSetField(2262);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutUnderlier get(quickfix.field.UnderlyingComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutUnderlier getUnderlyingComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutUnderlier() {
    return isSetField(2263);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutAmount get(quickfix.field.UnderlyingComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutAmount getUnderlyingComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutAmount() {
    return isSetField(2047);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutPercentage get(quickfix.field.UnderlyingComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutPercentage getUnderlyingComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutPercentage() {
    return isSetField(2264);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutTime get(quickfix.field.UnderlyingComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutTime getUnderlyingComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutTime() {
    return isSetField(2265);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutCurrency get(quickfix.field.UnderlyingComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutCurrency getUnderlyingComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutCurrency() {
    return isSetField(2266);
  }

  public void set(quickfix.field.UnderlyingComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPrice get(quickfix.field.UnderlyingComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPrice getUnderlyingComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPrice() {
    return isSetField(2048);
  }

  public void set(quickfix.field.UnderlyingComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPricePercentage get(quickfix.field.UnderlyingComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPricePercentage getUnderlyingComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPricePercentage() {
    return isSetField(2267);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryMethod get(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryMethod getUnderlyingComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceBoundaryMethod() {
    return isSetField(2049);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision get(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision getUnderlyingComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceBoundaryPrecision() {
    return isSetField(2050);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceTimeType get(quickfix.field.UnderlyingComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceTimeType getUnderlyingComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceTimeType() {
    return isSetField(2051);
  }

  public void set(quickfix.field.UnderlyingComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCondition get(quickfix.field.UnderlyingComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCondition getUnderlyingComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCondition());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCondition() {
    return isSetField(2052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDates get(quickfix.fixlatest.component.UnderlyingComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDates getUnderlyingComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventDates());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventDates get(quickfix.field.NoUnderlyingComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventDates getNoUnderlyingComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventDates() {
    return isSetField(2053);
  }

public static class NoUnderlyingComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2054, 2055, 2056, 0};

  public NoUnderlyingComplexEventDates() {
    super(2053, 2054, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartDate get(quickfix.field.UnderlyingComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartDate getUnderlyingComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartDate() {
    return isSetField(2054);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndDate get(quickfix.field.UnderlyingComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndDate getUnderlyingComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndDate() {
    return isSetField(2055);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes get(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes getUnderlyingComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventTimes());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventTimes get(quickfix.field.NoUnderlyingComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventTimes getNoUnderlyingComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventTimes() {
    return isSetField(2056);
  }

public static class NoUnderlyingComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2057, 2058, 0};

  public NoUnderlyingComplexEventTimes() {
    super(2056, 2057, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCurrencyOne get(quickfix.field.UnderlyingComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCurrencyOne getUnderlyingComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCurrencyOne() {
    return isSetField(2268);
  }

  public void set(quickfix.field.UnderlyingComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCurrencyTwo get(quickfix.field.UnderlyingComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCurrencyTwo getUnderlyingComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCurrencyTwo() {
    return isSetField(2269);
  }

  public void set(quickfix.field.UnderlyingComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventQuoteBasis get(quickfix.field.UnderlyingComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventQuoteBasis getUnderlyingComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventQuoteBasis() {
    return isSetField(2270);
  }

  public void set(quickfix.field.UnderlyingComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFixedFXRate get(quickfix.field.UnderlyingComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFixedFXRate getUnderlyingComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFixedFXRate() {
    return isSetField(2271);
  }

  public void set(quickfix.field.UnderlyingComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventSpotRate get(quickfix.field.UnderlyingComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventSpotRate getUnderlyingComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventSpotRate() {
    return isSetField(2419);
  }

  public void set(quickfix.field.UnderlyingComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventForwardPoints get(quickfix.field.UnderlyingComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventForwardPoints getUnderlyingComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventForwardPoints() {
    return isSetField(2420);
  }

  public void set(quickfix.field.UnderlyingComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDeterminationMethod get(quickfix.field.UnderlyingComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDeterminationMethod getUnderlyingComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDeterminationMethod() {
    return isSetField(2272);
  }

  public void set(quickfix.field.UnderlyingComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCalculationAgent get(quickfix.field.UnderlyingComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCalculationAgent getUnderlyingComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCalculationAgent() {
    return isSetField(2273);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikePrice get(quickfix.field.UnderlyingComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikePrice getUnderlyingComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikePrice() {
    return isSetField(2274);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikeFactor get(quickfix.field.UnderlyingComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikeFactor getUnderlyingComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikeFactor() {
    return isSetField(2275);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions get(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions getUnderlyingComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikeNumberOfOptions() {
    return isSetField(2276);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp get(quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp getUnderlyingComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventRateSources get(quickfix.field.NoUnderlyingComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventRateSources getNoUnderlyingComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventRateSources() {
    return isSetField(41732);
  }

public static class NoUnderlyingComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41733, 41734, 41735, 41736, 0};

  public NoUnderlyingComplexEventRateSources() {
    super(41732, 41733, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventRateSource get(quickfix.field.UnderlyingComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventRateSource getUnderlyingComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventRateSource() {
    return isSetField(41733);
  }

  public void set(quickfix.field.UnderlyingComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventRateSourceType get(quickfix.field.UnderlyingComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventRateSourceType getUnderlyingComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventRateSourceType() {
    return isSetField(41734);
  }

  public void set(quickfix.field.UnderlyingComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventReferencePage get(quickfix.field.UnderlyingComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventReferencePage getUnderlyingComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventReferencePage() {
    return isSetField(41735);
  }

  public void set(quickfix.field.UnderlyingComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventReferencePageHeading get(quickfix.field.UnderlyingComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventReferencePageHeading getUnderlyingComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventReferencePageHeading() {
    return isSetField(41736);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate get(quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate getUnderlyingComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp getUnderlyingComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods get(quickfix.field.NoUnderlyingComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods getNoUnderlyingComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriods() {
    return isSetField(41729);
  }

public static class NoUnderlyingComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41730, 41731, 41750, 41726, 41713, 0};

  public NoUnderlyingComplexEventPeriods() {
    super(41729, 41730, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodType get(quickfix.field.UnderlyingComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodType getUnderlyingComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodType() {
    return isSetField(41730);
  }

  public void set(quickfix.field.UnderlyingComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter get(quickfix.field.UnderlyingComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter getUnderlyingComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventBusinessCenter() {
    return isSetField(41731);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp get(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp getUnderlyingComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules get(quickfix.field.NoUnderlyingComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules getNoUnderlyingComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventSchedules() {
    return isSetField(41750);
  }

public static class NoUnderlyingComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41751, 41752, 41753, 41754, 41755, 0};

  public NoUnderlyingComplexEventSchedules() {
    super(41750, 41751, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate get(quickfix.field.UnderlyingComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate getUnderlyingComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleStartDate() {
    return isSetField(41751);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate get(quickfix.field.UnderlyingComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate getUnderlyingComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleEndDate() {
    return isSetField(41752);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod get(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod getUnderlyingComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyPeriod() {
    return isSetField(41753);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit get(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit getUnderlyingComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyUnit() {
    return isSetField(41754);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention get(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention getUnderlyingComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleRollConvention() {
    return isSetField(41755);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp getUnderlyingComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes get(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes getNoUnderlyingComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriodDateTimes() {
    return isSetField(41726);
  }

public static class NoUnderlyingComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41727, 41728, 0};

  public NoUnderlyingComplexEventPeriodDateTimes() {
    super(41726, 41727, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp getUnderlyingComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations get(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations getNoUnderlyingComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventAveragingObservations() {
    return isSetField(41713);
  }

public static class NoUnderlyingComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41714, 41715, 0};

  public NoUnderlyingComplexEventAveragingObservations() {
    super(41713, 41714, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventsXIDRef get(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventsXIDRef getUnderlyingComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventsXIDRef() {
    return isSetField(2277);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty get(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty getUnderlyingComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventNotifyingParty() {
    return isSetField(2278);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter get(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter getUnderlyingComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventBusinessCenter() {
    return isSetField(2279);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventStandardSources get(quickfix.field.UnderlyingComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventStandardSources getUnderlyingComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventStandardSources() {
    return isSetField(2280);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventMinimumSources get(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventMinimumSources getUnderlyingComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventMinimumSources() {
    return isSetField(2281);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp getUnderlyingComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources get(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources getNoUnderlyingComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventSources() {
    return isSetField(41748);
  }

public static class NoUnderlyingComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41749, 0};

  public NoUnderlyingComplexEventCreditEventSources() {
    super(41748, 41749, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource get(quickfix.field.UnderlyingComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource getUnderlyingComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventSource() {
    return isSetField(41749);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp getUnderlyingComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents get(quickfix.field.NoUnderlyingComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents getNoUnderlyingComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEvents() {
    return isSetField(41716);
  }

public static class NoUnderlyingComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41717, 41718, 41719, 41720, 41721, 41722, 41723, 41724, 0};

  public NoUnderlyingComplexEventCreditEvents() {
    super(41716, 41717, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType get(quickfix.field.UnderlyingComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType getUnderlyingComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventType() {
    return isSetField(41717);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue get(quickfix.field.UnderlyingComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue getUnderlyingComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventValue() {
    return isSetField(41718);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency get(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency getUnderlyingComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventCurrency() {
    return isSetField(41719);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod get(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod getUnderlyingComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventPeriod() {
    return isSetField(41720);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit get(quickfix.field.UnderlyingComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit getUnderlyingComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventUnit() {
    return isSetField(41721);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType get(quickfix.field.UnderlyingComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType getUnderlyingComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventDayType() {
    return isSetField(41722);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource get(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource getUnderlyingComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventRateSource() {
    return isSetField(41723);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp getUnderlyingComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers get(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers getNoUnderlyingComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventQualifiers() {
    return isSetField(41724);
  }

public static class NoUnderlyingComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41725, 0};

  public NoUnderlyingComplexEventCreditEventQualifiers() {
    super(41724, 41725, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFuturesPriceValuation get(quickfix.field.UnderlyingComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFuturesPriceValuation getUnderlyingComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFuturesPriceValuation() {
    return isSetField(2611);
  }

  public void set(quickfix.field.UnderlyingComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventOptionsPriceValuation get(quickfix.field.UnderlyingComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventOptionsPriceValuation getUnderlyingComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventOptionsPriceValuation() {
    return isSetField(2612);
  }

  public void set(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback get(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback getUnderlyingComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2613);
  }

  public void set(quickfix.field.UnderlyingComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventXID get(quickfix.field.UnderlyingComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventXID getUnderlyingComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventXID());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventXID() {
    return isSetField(2282);
  }

  public void set(quickfix.field.UnderlyingComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventXIDRef get(quickfix.field.UnderlyingComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventXIDRef getUnderlyingComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventXIDRef() {
    return isSetField(2283);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventType get(quickfix.field.UnderlyingComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventType getUnderlyingComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventType() {
    return isSetField(2046);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutPaySide get(quickfix.field.UnderlyingComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutPaySide getUnderlyingComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutPaySide() {
    return isSetField(2261);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutReceiveSide get(quickfix.field.UnderlyingComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutReceiveSide getUnderlyingComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutReceiveSide() {
    return isSetField(2262);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutUnderlier get(quickfix.field.UnderlyingComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutUnderlier getUnderlyingComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutUnderlier() {
    return isSetField(2263);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutAmount get(quickfix.field.UnderlyingComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutAmount getUnderlyingComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutAmount() {
    return isSetField(2047);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutPercentage get(quickfix.field.UnderlyingComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutPercentage getUnderlyingComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutPercentage() {
    return isSetField(2264);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutTime get(quickfix.field.UnderlyingComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutTime getUnderlyingComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutTime() {
    return isSetField(2265);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutCurrency get(quickfix.field.UnderlyingComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutCurrency getUnderlyingComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutCurrency() {
    return isSetField(2266);
  }

  public void set(quickfix.field.UnderlyingComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPrice get(quickfix.field.UnderlyingComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPrice getUnderlyingComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPrice() {
    return isSetField(2048);
  }

  public void set(quickfix.field.UnderlyingComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPricePercentage get(quickfix.field.UnderlyingComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPricePercentage getUnderlyingComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPricePercentage() {
    return isSetField(2267);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryMethod get(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryMethod getUnderlyingComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceBoundaryMethod() {
    return isSetField(2049);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision get(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision getUnderlyingComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceBoundaryPrecision() {
    return isSetField(2050);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceTimeType get(quickfix.field.UnderlyingComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceTimeType getUnderlyingComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceTimeType() {
    return isSetField(2051);
  }

  public void set(quickfix.field.UnderlyingComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCondition get(quickfix.field.UnderlyingComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCondition getUnderlyingComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCondition());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCondition() {
    return isSetField(2052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDates get(quickfix.fixlatest.component.UnderlyingComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDates getUnderlyingComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventDates());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventDates get(quickfix.field.NoUnderlyingComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventDates getNoUnderlyingComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventDates() {
    return isSetField(2053);
  }

public static class NoUnderlyingComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2054, 2055, 2056, 0};

  public NoUnderlyingComplexEventDates() {
    super(2053, 2054, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartDate get(quickfix.field.UnderlyingComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartDate getUnderlyingComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartDate() {
    return isSetField(2054);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndDate get(quickfix.field.UnderlyingComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndDate getUnderlyingComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndDate() {
    return isSetField(2055);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes get(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes getUnderlyingComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventTimes());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventTimes get(quickfix.field.NoUnderlyingComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventTimes getNoUnderlyingComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventTimes() {
    return isSetField(2056);
  }

public static class NoUnderlyingComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2057, 2058, 0};

  public NoUnderlyingComplexEventTimes() {
    super(2056, 2057, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCurrencyOne get(quickfix.field.UnderlyingComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCurrencyOne getUnderlyingComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCurrencyOne() {
    return isSetField(2268);
  }

  public void set(quickfix.field.UnderlyingComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCurrencyTwo get(quickfix.field.UnderlyingComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCurrencyTwo getUnderlyingComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCurrencyTwo() {
    return isSetField(2269);
  }

  public void set(quickfix.field.UnderlyingComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventQuoteBasis get(quickfix.field.UnderlyingComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventQuoteBasis getUnderlyingComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventQuoteBasis() {
    return isSetField(2270);
  }

  public void set(quickfix.field.UnderlyingComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFixedFXRate get(quickfix.field.UnderlyingComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFixedFXRate getUnderlyingComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFixedFXRate() {
    return isSetField(2271);
  }

  public void set(quickfix.field.UnderlyingComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventSpotRate get(quickfix.field.UnderlyingComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventSpotRate getUnderlyingComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventSpotRate() {
    return isSetField(2419);
  }

  public void set(quickfix.field.UnderlyingComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventForwardPoints get(quickfix.field.UnderlyingComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventForwardPoints getUnderlyingComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventForwardPoints() {
    return isSetField(2420);
  }

  public void set(quickfix.field.UnderlyingComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDeterminationMethod get(quickfix.field.UnderlyingComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDeterminationMethod getUnderlyingComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDeterminationMethod() {
    return isSetField(2272);
  }

  public void set(quickfix.field.UnderlyingComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCalculationAgent get(quickfix.field.UnderlyingComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCalculationAgent getUnderlyingComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCalculationAgent() {
    return isSetField(2273);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikePrice get(quickfix.field.UnderlyingComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikePrice getUnderlyingComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikePrice() {
    return isSetField(2274);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikeFactor get(quickfix.field.UnderlyingComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikeFactor getUnderlyingComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikeFactor() {
    return isSetField(2275);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions get(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions getUnderlyingComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikeNumberOfOptions() {
    return isSetField(2276);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp get(quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp getUnderlyingComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventRateSources get(quickfix.field.NoUnderlyingComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventRateSources getNoUnderlyingComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventRateSources() {
    return isSetField(41732);
  }

public static class NoUnderlyingComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41733, 41734, 41735, 41736, 0};

  public NoUnderlyingComplexEventRateSources() {
    super(41732, 41733, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventRateSource get(quickfix.field.UnderlyingComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventRateSource getUnderlyingComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventRateSource() {
    return isSetField(41733);
  }

  public void set(quickfix.field.UnderlyingComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventRateSourceType get(quickfix.field.UnderlyingComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventRateSourceType getUnderlyingComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventRateSourceType() {
    return isSetField(41734);
  }

  public void set(quickfix.field.UnderlyingComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventReferencePage get(quickfix.field.UnderlyingComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventReferencePage getUnderlyingComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventReferencePage() {
    return isSetField(41735);
  }

  public void set(quickfix.field.UnderlyingComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventReferencePageHeading get(quickfix.field.UnderlyingComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventReferencePageHeading getUnderlyingComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventReferencePageHeading() {
    return isSetField(41736);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate get(quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate getUnderlyingComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp getUnderlyingComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods get(quickfix.field.NoUnderlyingComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods getNoUnderlyingComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriods() {
    return isSetField(41729);
  }

public static class NoUnderlyingComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41730, 41731, 41750, 41726, 41713, 0};

  public NoUnderlyingComplexEventPeriods() {
    super(41729, 41730, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodType get(quickfix.field.UnderlyingComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodType getUnderlyingComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodType() {
    return isSetField(41730);
  }

  public void set(quickfix.field.UnderlyingComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter get(quickfix.field.UnderlyingComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter getUnderlyingComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventBusinessCenter() {
    return isSetField(41731);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp get(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp getUnderlyingComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules get(quickfix.field.NoUnderlyingComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules getNoUnderlyingComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventSchedules() {
    return isSetField(41750);
  }

public static class NoUnderlyingComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41751, 41752, 41753, 41754, 41755, 0};

  public NoUnderlyingComplexEventSchedules() {
    super(41750, 41751, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate get(quickfix.field.UnderlyingComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate getUnderlyingComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleStartDate() {
    return isSetField(41751);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate get(quickfix.field.UnderlyingComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate getUnderlyingComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleEndDate() {
    return isSetField(41752);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod get(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod getUnderlyingComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyPeriod() {
    return isSetField(41753);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit get(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit getUnderlyingComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyUnit() {
    return isSetField(41754);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention get(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention getUnderlyingComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleRollConvention() {
    return isSetField(41755);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp getUnderlyingComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes get(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes getNoUnderlyingComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriodDateTimes() {
    return isSetField(41726);
  }

public static class NoUnderlyingComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41727, 41728, 0};

  public NoUnderlyingComplexEventPeriodDateTimes() {
    super(41726, 41727, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp getUnderlyingComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations get(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations getNoUnderlyingComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventAveragingObservations() {
    return isSetField(41713);
  }

public static class NoUnderlyingComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41714, 41715, 0};

  public NoUnderlyingComplexEventAveragingObservations() {
    super(41713, 41714, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventsXIDRef get(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventsXIDRef getUnderlyingComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventsXIDRef() {
    return isSetField(2277);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty get(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty getUnderlyingComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventNotifyingParty() {
    return isSetField(2278);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter get(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter getUnderlyingComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventBusinessCenter() {
    return isSetField(2279);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventStandardSources get(quickfix.field.UnderlyingComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventStandardSources getUnderlyingComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventStandardSources() {
    return isSetField(2280);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventMinimumSources get(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventMinimumSources getUnderlyingComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventMinimumSources() {
    return isSetField(2281);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp getUnderlyingComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources get(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources getNoUnderlyingComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventSources() {
    return isSetField(41748);
  }

public static class NoUnderlyingComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41749, 0};

  public NoUnderlyingComplexEventCreditEventSources() {
    super(41748, 41749, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource get(quickfix.field.UnderlyingComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource getUnderlyingComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventSource() {
    return isSetField(41749);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp getUnderlyingComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents get(quickfix.field.NoUnderlyingComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents getNoUnderlyingComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEvents() {
    return isSetField(41716);
  }

public static class NoUnderlyingComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41717, 41718, 41719, 41720, 41721, 41722, 41723, 41724, 0};

  public NoUnderlyingComplexEventCreditEvents() {
    super(41716, 41717, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType get(quickfix.field.UnderlyingComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType getUnderlyingComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventType() {
    return isSetField(41717);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue get(quickfix.field.UnderlyingComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue getUnderlyingComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventValue() {
    return isSetField(41718);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency get(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency getUnderlyingComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventCurrency() {
    return isSetField(41719);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod get(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod getUnderlyingComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventPeriod() {
    return isSetField(41720);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit get(quickfix.field.UnderlyingComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit getUnderlyingComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventUnit() {
    return isSetField(41721);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType get(quickfix.field.UnderlyingComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType getUnderlyingComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventDayType() {
    return isSetField(41722);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource get(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource getUnderlyingComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventRateSource() {
    return isSetField(41723);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp getUnderlyingComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers get(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers getNoUnderlyingComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventQualifiers() {
    return isSetField(41724);
  }

public static class NoUnderlyingComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41725, 0};

  public NoUnderlyingComplexEventCreditEventQualifiers() {
    super(41724, 41725, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFuturesPriceValuation get(quickfix.field.UnderlyingComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFuturesPriceValuation getUnderlyingComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFuturesPriceValuation() {
    return isSetField(2611);
  }

  public void set(quickfix.field.UnderlyingComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventOptionsPriceValuation get(quickfix.field.UnderlyingComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventOptionsPriceValuation getUnderlyingComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventOptionsPriceValuation() {
    return isSetField(2612);
  }

  public void set(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback get(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback getUnderlyingComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2613);
  }

  public void set(quickfix.field.UnderlyingComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventXID get(quickfix.field.UnderlyingComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventXID getUnderlyingComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventXID());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventXID() {
    return isSetField(2282);
  }

  public void set(quickfix.field.UnderlyingComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventXIDRef get(quickfix.field.UnderlyingComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventXIDRef getUnderlyingComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventXIDRef() {
    return isSetField(2283);
  }
}
