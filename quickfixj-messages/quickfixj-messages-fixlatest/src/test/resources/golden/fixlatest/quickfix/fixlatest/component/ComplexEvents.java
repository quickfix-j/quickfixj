/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEvents extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1483, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEvents() {
    super();
  }

  public void set(quickfix.field.NoComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEvents get(quickfix.field.NoComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEvents getNoComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEvents() {
    return isSetField(1483);
  }

public static class NoComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1484, 2117, 2118, 2119, 1485, 2120, 2121, 2122, 1486, 2123, 1487, 1488, 1489, 1490, 1491, 2124, 2125, 2126, 2127, 2407, 2408, 2128, 2129, 2130, 2131, 2132, 41013, 41020, 41021, 41022, 41023, 41024, 41025, 41018, 41026, 41027, 41028, 41010, 2133, 2134, 2135, 2136, 2137, 41029, 40997, 2597, 2598, 2599, 2138, 2139, 0};

  public NoComplexEvents() {
    super(1483, 1484, ORDER);
  }

  public void set(quickfix.field.ComplexEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventType() {
    return isSetField(1484);
  }

  public void set(quickfix.field.ComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutPaySide get(quickfix.field.ComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutPaySide getComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutPaySide() {
    return isSetField(2117);
  }

  public void set(quickfix.field.ComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutReceiveSide get(quickfix.field.ComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutReceiveSide getComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutReceiveSide() {
    return isSetField(2118);
  }

  public void set(quickfix.field.ComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutUnderlier get(quickfix.field.ComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutUnderlier getComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutUnderlier() {
    return isSetField(2119);
  }

  public void set(quickfix.field.ComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutAmount get(quickfix.field.ComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutAmount getComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutAmount() {
    return isSetField(1485);
  }

  public void set(quickfix.field.ComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutPercentage get(quickfix.field.ComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutPercentage getComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutPercentage() {
    return isSetField(2120);
  }

  public void set(quickfix.field.ComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutTime get(quickfix.field.ComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutTime getComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutTime() {
    return isSetField(2121);
  }

  public void set(quickfix.field.ComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutCurrency get(quickfix.field.ComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutCurrency getComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutCurrency() {
    return isSetField(2122);
  }

  public void set(quickfix.field.ComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPrice get(quickfix.field.ComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPrice getComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPrice());
  }

  public boolean isSet(quickfix.field.ComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPrice() {
    return isSetField(1486);
  }

  public void set(quickfix.field.ComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPricePercentage get(quickfix.field.ComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPricePercentage getComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.ComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPricePercentage() {
    return isSetField(2123);
  }

  public void set(quickfix.field.ComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceBoundaryMethod get(quickfix.field.ComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceBoundaryMethod getComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceBoundaryMethod() {
    return isSetField(1487);
  }

  public void set(quickfix.field.ComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceBoundaryPrecision get(quickfix.field.ComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceBoundaryPrecision getComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceBoundaryPrecision() {
    return isSetField(1488);
  }

  public void set(quickfix.field.ComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceTimeType get(quickfix.field.ComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceTimeType getComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceTimeType() {
    return isSetField(1489);
  }

  public void set(quickfix.field.ComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCondition get(quickfix.field.ComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCondition getComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCondition());
  }

  public boolean isSet(quickfix.field.ComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCondition() {
    return isSetField(1490);
  }

  public void set(quickfix.fixlatest.component.ComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventDates get(quickfix.fixlatest.component.ComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventDates getComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventDates());
  }

  public void set(quickfix.field.NoComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventDates() {
    return isSetField(1491);
  }

public static class NoComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1492, 1493, 1494, 0};

  public NoComplexEventDates() {
    super(1491, 1492, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartDate() {
    return isSetField(1492);
  }

  public void set(quickfix.field.ComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndDate() {
    return isSetField(1493);
  }

  public void set(quickfix.fixlatest.component.ComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventTimes get(quickfix.fixlatest.component.ComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventTimes getComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventTimes());
  }

  public void set(quickfix.field.NoComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventTimes() {
    return isSetField(1494);
  }

public static class NoComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1495, 1496, 0};

  public NoComplexEventTimes() {
    super(1494, 1495, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}
}

  public void set(quickfix.field.ComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCurrencyOne get(quickfix.field.ComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCurrencyOne getComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.ComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCurrencyOne() {
    return isSetField(2124);
  }

  public void set(quickfix.field.ComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCurrencyTwo get(quickfix.field.ComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCurrencyTwo getComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.ComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCurrencyTwo() {
    return isSetField(2125);
  }

  public void set(quickfix.field.ComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.ComplexEventQuoteBasis get(quickfix.field.ComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventQuoteBasis getComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.ComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventQuoteBasis() {
    return isSetField(2126);
  }

  public void set(quickfix.field.ComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFixedFXRate get(quickfix.field.ComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFixedFXRate getComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.ComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFixedFXRate() {
    return isSetField(2127);
  }

  public void set(quickfix.field.ComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventSpotRate get(quickfix.field.ComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventSpotRate getComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.ComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventSpotRate() {
    return isSetField(2407);
  }

  public void set(quickfix.field.ComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.ComplexEventForwardPoints get(quickfix.field.ComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventForwardPoints getComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.ComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventForwardPoints() {
    return isSetField(2408);
  }

  public void set(quickfix.field.ComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDeterminationMethod get(quickfix.field.ComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDeterminationMethod getComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.ComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDeterminationMethod() {
    return isSetField(2128);
  }

  public void set(quickfix.field.ComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCalculationAgent get(quickfix.field.ComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCalculationAgent getComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.ComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCalculationAgent() {
    return isSetField(2129);
  }

  public void set(quickfix.field.ComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikePrice get(quickfix.field.ComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikePrice getComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikePrice() {
    return isSetField(2130);
  }

  public void set(quickfix.field.ComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikeFactor get(quickfix.field.ComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikeFactor getComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikeFactor() {
    return isSetField(2131);
  }

  public void set(quickfix.field.ComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikeNumberOfOptions get(quickfix.field.ComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikeNumberOfOptions getComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikeNumberOfOptions() {
    return isSetField(2132);
  }

  public void set(quickfix.fixlatest.component.ComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventRateSourceGrp get(quickfix.fixlatest.component.ComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventRateSourceGrp getComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventRateSources get(quickfix.field.NoComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventRateSources getNoComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventRateSources() {
    return isSetField(41013);
  }

public static class NoComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41014, 41015, 41016, 41017, 0};

  public NoComplexEventRateSources() {
    super(41013, 41014, ORDER);
  }

  public void set(quickfix.field.ComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSource get(quickfix.field.ComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSource getComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSource() {
    return isSetField(41014);
  }

  public void set(quickfix.field.ComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSourceType get(quickfix.field.ComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSourceType getComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSourceType() {
    return isSetField(41015);
  }

  public void set(quickfix.field.ComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePage get(quickfix.field.ComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePage getComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePage() {
    return isSetField(41016);
  }

  public void set(quickfix.field.ComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePageHeading get(quickfix.field.ComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePageHeading getComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePageHeading() {
    return isSetField(41017);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventRelativeDate get(quickfix.fixlatest.component.ComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventRelativeDate getComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.ComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodGrp get(quickfix.fixlatest.component.ComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodGrp getComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriods get(quickfix.field.NoComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriods getNoComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriods() {
    return isSetField(41010);
  }

public static class NoComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41011, 41012, 41031, 41007, 40994, 0};

  public NoComplexEventPeriods() {
    super(41010, 41011, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodType get(quickfix.field.ComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodType getComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodType() {
    return isSetField(41011);
  }

  public void set(quickfix.field.ComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventBusinessCenter get(quickfix.field.ComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventBusinessCenter getComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventBusinessCenter() {
    return isSetField(41012);
  }

  public void set(quickfix.fixlatest.component.ComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp get(quickfix.fixlatest.component.ComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp getComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventSchedules get(quickfix.field.NoComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventSchedules getNoComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventSchedules() {
    return isSetField(41031);
  }

public static class NoComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41032, 41033, 41034, 41035, 41036, 0};

  public NoComplexEventSchedules() {
    super(41031, 41032, ORDER);
  }

  public void set(quickfix.field.ComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleStartDate get(quickfix.field.ComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleStartDate getComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleStartDate() {
    return isSetField(41032);
  }

  public void set(quickfix.field.ComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleEndDate get(quickfix.field.ComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleEndDate getComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleEndDate() {
    return isSetField(41033);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod get(quickfix.field.ComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod getComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyPeriod() {
    return isSetField(41034);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit get(quickfix.field.ComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit getComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyUnit() {
    return isSetField(41035);
  }

  public void set(quickfix.field.ComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleRollConvention get(quickfix.field.ComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleRollConvention getComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleRollConvention() {
    return isSetField(41036);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp get(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp getComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriodDateTimes get(quickfix.field.NoComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriodDateTimes getNoComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriodDateTimes() {
    return isSetField(41007);
  }

public static class NoComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41008, 41009, 0};

  public NoComplexEventPeriodDateTimes() {
    super(41007, 41008, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp getComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventAveragingObservations get(quickfix.field.NoComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventAveragingObservations getNoComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventAveragingObservations() {
    return isSetField(40994);
  }

public static class NoComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40995, 40996, 0};

  public NoComplexEventAveragingObservations() {
    super(40994, 40995, ORDER);
  }

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}
}

  public void set(quickfix.field.ComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventsXIDRef get(quickfix.field.ComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventsXIDRef getComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventsXIDRef() {
    return isSetField(2133);
  }

  public void set(quickfix.field.ComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventNotifyingParty get(quickfix.field.ComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventNotifyingParty getComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventNotifyingParty() {
    return isSetField(2134);
  }

  public void set(quickfix.field.ComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventBusinessCenter get(quickfix.field.ComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventBusinessCenter getComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventBusinessCenter() {
    return isSetField(2135);
  }

  public void set(quickfix.field.ComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventStandardSources get(quickfix.field.ComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventStandardSources getComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventStandardSources() {
    return isSetField(2136);
  }

  public void set(quickfix.field.ComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventMinimumSources get(quickfix.field.ComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventMinimumSources getComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventMinimumSources() {
    return isSetField(2137);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp getComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventSources get(quickfix.field.NoComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventSources getNoComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventSources() {
    return isSetField(41029);
  }

public static class NoComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41030, 0};

  public NoComplexEventCreditEventSources() {
    super(41029, 41030, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventSource get(quickfix.field.ComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventSource getComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventSource() {
    return isSetField(41030);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventGrp get(quickfix.fixlatest.component.ComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventGrp getComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEvents get(quickfix.field.NoComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEvents getNoComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEvents() {
    return isSetField(40997);
  }

public static class NoComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40998, 40999, 41000, 41001, 41002, 41003, 41004, 41005, 0};

  public NoComplexEventCreditEvents() {
    super(40997, 40998, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventType get(quickfix.field.ComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventType getComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventType() {
    return isSetField(40998);
  }

  public void set(quickfix.field.ComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventValue get(quickfix.field.ComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventValue getComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventValue() {
    return isSetField(40999);
  }

  public void set(quickfix.field.ComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventCurrency get(quickfix.field.ComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventCurrency getComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventCurrency() {
    return isSetField(41000);
  }

  public void set(quickfix.field.ComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventPeriod get(quickfix.field.ComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventPeriod getComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventPeriod() {
    return isSetField(41001);
  }

  public void set(quickfix.field.ComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventUnit get(quickfix.field.ComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventUnit getComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventUnit() {
    return isSetField(41002);
  }

  public void set(quickfix.field.ComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventDayType get(quickfix.field.ComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventDayType getComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventDayType() {
    return isSetField(41003);
  }

  public void set(quickfix.field.ComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventRateSource get(quickfix.field.ComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventRateSource getComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventRateSource() {
    return isSetField(41004);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp getComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers get(quickfix.field.NoComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers getNoComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventQualifiers() {
    return isSetField(41005);
  }

public static class NoComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41006, 0};

  public NoComplexEventCreditEventQualifiers() {
    super(41005, 41006, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}
}

  public void set(quickfix.field.ComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFuturesPriceValuation get(quickfix.field.ComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFuturesPriceValuation getComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.ComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFuturesPriceValuation() {
    return isSetField(2597);
  }

  public void set(quickfix.field.ComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.ComplexEventOptionsPriceValuation get(quickfix.field.ComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventOptionsPriceValuation getComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.ComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventOptionsPriceValuation() {
    return isSetField(2598);
  }

  public void set(quickfix.field.ComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPVFinalPriceElectionFallback get(quickfix.field.ComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPVFinalPriceElectionFallback getComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.ComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2599);
  }

  public void set(quickfix.field.ComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.ComplexEventXID get(quickfix.field.ComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventXID getComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventXID());
  }

  public boolean isSet(quickfix.field.ComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventXID() {
    return isSetField(2138);
  }

  public void set(quickfix.field.ComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.ComplexEventXIDRef get(quickfix.field.ComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventXIDRef getComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.ComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventXIDRef() {
    return isSetField(2139);
  }
}

  public void set(quickfix.field.ComplexEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventType() {
    return isSetField(1484);
  }

  public void set(quickfix.field.ComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutPaySide get(quickfix.field.ComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutPaySide getComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutPaySide() {
    return isSetField(2117);
  }

  public void set(quickfix.field.ComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutReceiveSide get(quickfix.field.ComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutReceiveSide getComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutReceiveSide() {
    return isSetField(2118);
  }

  public void set(quickfix.field.ComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutUnderlier get(quickfix.field.ComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutUnderlier getComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutUnderlier() {
    return isSetField(2119);
  }

  public void set(quickfix.field.ComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutAmount get(quickfix.field.ComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutAmount getComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutAmount() {
    return isSetField(1485);
  }

  public void set(quickfix.field.ComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutPercentage get(quickfix.field.ComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutPercentage getComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutPercentage() {
    return isSetField(2120);
  }

  public void set(quickfix.field.ComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutTime get(quickfix.field.ComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutTime getComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutTime() {
    return isSetField(2121);
  }

  public void set(quickfix.field.ComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutCurrency get(quickfix.field.ComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutCurrency getComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutCurrency() {
    return isSetField(2122);
  }

  public void set(quickfix.field.ComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPrice get(quickfix.field.ComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPrice getComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPrice());
  }

  public boolean isSet(quickfix.field.ComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPrice() {
    return isSetField(1486);
  }

  public void set(quickfix.field.ComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPricePercentage get(quickfix.field.ComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPricePercentage getComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.ComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPricePercentage() {
    return isSetField(2123);
  }

  public void set(quickfix.field.ComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceBoundaryMethod get(quickfix.field.ComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceBoundaryMethod getComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceBoundaryMethod() {
    return isSetField(1487);
  }

  public void set(quickfix.field.ComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceBoundaryPrecision get(quickfix.field.ComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceBoundaryPrecision getComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceBoundaryPrecision() {
    return isSetField(1488);
  }

  public void set(quickfix.field.ComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceTimeType get(quickfix.field.ComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceTimeType getComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceTimeType() {
    return isSetField(1489);
  }

  public void set(quickfix.field.ComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCondition get(quickfix.field.ComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCondition getComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCondition());
  }

  public boolean isSet(quickfix.field.ComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCondition() {
    return isSetField(1490);
  }

  public void set(quickfix.fixlatest.component.ComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventDates get(quickfix.fixlatest.component.ComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventDates getComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventDates());
  }

  public void set(quickfix.field.NoComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventDates() {
    return isSetField(1491);
  }

public static class NoComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1492, 1493, 1494, 0};

  public NoComplexEventDates() {
    super(1491, 1492, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartDate() {
    return isSetField(1492);
  }

  public void set(quickfix.field.ComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndDate() {
    return isSetField(1493);
  }

  public void set(quickfix.fixlatest.component.ComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventTimes get(quickfix.fixlatest.component.ComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventTimes getComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventTimes());
  }

  public void set(quickfix.field.NoComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventTimes() {
    return isSetField(1494);
  }

public static class NoComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1495, 1496, 0};

  public NoComplexEventTimes() {
    super(1494, 1495, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}
}

  public void set(quickfix.field.ComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCurrencyOne get(quickfix.field.ComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCurrencyOne getComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.ComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCurrencyOne() {
    return isSetField(2124);
  }

  public void set(quickfix.field.ComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCurrencyTwo get(quickfix.field.ComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCurrencyTwo getComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.ComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCurrencyTwo() {
    return isSetField(2125);
  }

  public void set(quickfix.field.ComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.ComplexEventQuoteBasis get(quickfix.field.ComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventQuoteBasis getComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.ComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventQuoteBasis() {
    return isSetField(2126);
  }

  public void set(quickfix.field.ComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFixedFXRate get(quickfix.field.ComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFixedFXRate getComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.ComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFixedFXRate() {
    return isSetField(2127);
  }

  public void set(quickfix.field.ComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventSpotRate get(quickfix.field.ComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventSpotRate getComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.ComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventSpotRate() {
    return isSetField(2407);
  }

  public void set(quickfix.field.ComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.ComplexEventForwardPoints get(quickfix.field.ComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventForwardPoints getComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.ComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventForwardPoints() {
    return isSetField(2408);
  }

  public void set(quickfix.field.ComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDeterminationMethod get(quickfix.field.ComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDeterminationMethod getComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.ComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDeterminationMethod() {
    return isSetField(2128);
  }

  public void set(quickfix.field.ComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCalculationAgent get(quickfix.field.ComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCalculationAgent getComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.ComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCalculationAgent() {
    return isSetField(2129);
  }

  public void set(quickfix.field.ComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikePrice get(quickfix.field.ComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikePrice getComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikePrice() {
    return isSetField(2130);
  }

  public void set(quickfix.field.ComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikeFactor get(quickfix.field.ComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikeFactor getComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikeFactor() {
    return isSetField(2131);
  }

  public void set(quickfix.field.ComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikeNumberOfOptions get(quickfix.field.ComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikeNumberOfOptions getComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikeNumberOfOptions() {
    return isSetField(2132);
  }

  public void set(quickfix.fixlatest.component.ComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventRateSourceGrp get(quickfix.fixlatest.component.ComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventRateSourceGrp getComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventRateSources get(quickfix.field.NoComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventRateSources getNoComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventRateSources() {
    return isSetField(41013);
  }

public static class NoComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41014, 41015, 41016, 41017, 0};

  public NoComplexEventRateSources() {
    super(41013, 41014, ORDER);
  }

  public void set(quickfix.field.ComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSource get(quickfix.field.ComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSource getComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSource() {
    return isSetField(41014);
  }

  public void set(quickfix.field.ComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSourceType get(quickfix.field.ComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSourceType getComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSourceType() {
    return isSetField(41015);
  }

  public void set(quickfix.field.ComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePage get(quickfix.field.ComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePage getComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePage() {
    return isSetField(41016);
  }

  public void set(quickfix.field.ComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePageHeading get(quickfix.field.ComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePageHeading getComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePageHeading() {
    return isSetField(41017);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventRelativeDate get(quickfix.fixlatest.component.ComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventRelativeDate getComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.ComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodGrp get(quickfix.fixlatest.component.ComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodGrp getComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriods get(quickfix.field.NoComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriods getNoComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriods() {
    return isSetField(41010);
  }

public static class NoComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41011, 41012, 41031, 41007, 40994, 0};

  public NoComplexEventPeriods() {
    super(41010, 41011, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodType get(quickfix.field.ComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodType getComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodType() {
    return isSetField(41011);
  }

  public void set(quickfix.field.ComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventBusinessCenter get(quickfix.field.ComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventBusinessCenter getComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventBusinessCenter() {
    return isSetField(41012);
  }

  public void set(quickfix.fixlatest.component.ComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp get(quickfix.fixlatest.component.ComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp getComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventSchedules get(quickfix.field.NoComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventSchedules getNoComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventSchedules() {
    return isSetField(41031);
  }

public static class NoComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41032, 41033, 41034, 41035, 41036, 0};

  public NoComplexEventSchedules() {
    super(41031, 41032, ORDER);
  }

  public void set(quickfix.field.ComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleStartDate get(quickfix.field.ComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleStartDate getComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleStartDate() {
    return isSetField(41032);
  }

  public void set(quickfix.field.ComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleEndDate get(quickfix.field.ComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleEndDate getComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleEndDate() {
    return isSetField(41033);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod get(quickfix.field.ComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod getComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyPeriod() {
    return isSetField(41034);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit get(quickfix.field.ComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit getComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyUnit() {
    return isSetField(41035);
  }

  public void set(quickfix.field.ComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleRollConvention get(quickfix.field.ComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleRollConvention getComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleRollConvention() {
    return isSetField(41036);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp get(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp getComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriodDateTimes get(quickfix.field.NoComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriodDateTimes getNoComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriodDateTimes() {
    return isSetField(41007);
  }

public static class NoComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41008, 41009, 0};

  public NoComplexEventPeriodDateTimes() {
    super(41007, 41008, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp getComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventAveragingObservations get(quickfix.field.NoComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventAveragingObservations getNoComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventAveragingObservations() {
    return isSetField(40994);
  }

public static class NoComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40995, 40996, 0};

  public NoComplexEventAveragingObservations() {
    super(40994, 40995, ORDER);
  }

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}
}

  public void set(quickfix.field.ComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventsXIDRef get(quickfix.field.ComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventsXIDRef getComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventsXIDRef() {
    return isSetField(2133);
  }

  public void set(quickfix.field.ComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventNotifyingParty get(quickfix.field.ComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventNotifyingParty getComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventNotifyingParty() {
    return isSetField(2134);
  }

  public void set(quickfix.field.ComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventBusinessCenter get(quickfix.field.ComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventBusinessCenter getComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventBusinessCenter() {
    return isSetField(2135);
  }

  public void set(quickfix.field.ComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventStandardSources get(quickfix.field.ComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventStandardSources getComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventStandardSources() {
    return isSetField(2136);
  }

  public void set(quickfix.field.ComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventMinimumSources get(quickfix.field.ComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventMinimumSources getComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventMinimumSources() {
    return isSetField(2137);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp getComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventSources get(quickfix.field.NoComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventSources getNoComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventSources() {
    return isSetField(41029);
  }

public static class NoComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41030, 0};

  public NoComplexEventCreditEventSources() {
    super(41029, 41030, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventSource get(quickfix.field.ComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventSource getComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventSource() {
    return isSetField(41030);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventGrp get(quickfix.fixlatest.component.ComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventGrp getComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEvents get(quickfix.field.NoComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEvents getNoComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEvents() {
    return isSetField(40997);
  }

public static class NoComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40998, 40999, 41000, 41001, 41002, 41003, 41004, 41005, 0};

  public NoComplexEventCreditEvents() {
    super(40997, 40998, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventType get(quickfix.field.ComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventType getComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventType() {
    return isSetField(40998);
  }

  public void set(quickfix.field.ComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventValue get(quickfix.field.ComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventValue getComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventValue() {
    return isSetField(40999);
  }

  public void set(quickfix.field.ComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventCurrency get(quickfix.field.ComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventCurrency getComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventCurrency() {
    return isSetField(41000);
  }

  public void set(quickfix.field.ComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventPeriod get(quickfix.field.ComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventPeriod getComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventPeriod() {
    return isSetField(41001);
  }

  public void set(quickfix.field.ComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventUnit get(quickfix.field.ComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventUnit getComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventUnit() {
    return isSetField(41002);
  }

  public void set(quickfix.field.ComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventDayType get(quickfix.field.ComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventDayType getComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventDayType() {
    return isSetField(41003);
  }

  public void set(quickfix.field.ComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventRateSource get(quickfix.field.ComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventRateSource getComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventRateSource() {
    return isSetField(41004);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp getComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers get(quickfix.field.NoComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers getNoComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventQualifiers() {
    return isSetField(41005);
  }

public static class NoComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41006, 0};

  public NoComplexEventCreditEventQualifiers() {
    super(41005, 41006, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}
}

  public void set(quickfix.field.ComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFuturesPriceValuation get(quickfix.field.ComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFuturesPriceValuation getComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.ComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFuturesPriceValuation() {
    return isSetField(2597);
  }

  public void set(quickfix.field.ComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.ComplexEventOptionsPriceValuation get(quickfix.field.ComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventOptionsPriceValuation getComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.ComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventOptionsPriceValuation() {
    return isSetField(2598);
  }

  public void set(quickfix.field.ComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPVFinalPriceElectionFallback get(quickfix.field.ComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPVFinalPriceElectionFallback getComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.ComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2599);
  }

  public void set(quickfix.field.ComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.ComplexEventXID get(quickfix.field.ComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventXID getComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventXID());
  }

  public boolean isSet(quickfix.field.ComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventXID() {
    return isSetField(2138);
  }

  public void set(quickfix.field.ComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.ComplexEventXIDRef get(quickfix.field.ComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventXIDRef getComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.ComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventXIDRef() {
    return isSetField(2139);
  }
}
