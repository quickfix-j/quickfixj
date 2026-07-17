/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStream extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40279, 40280, 40281, 42399, 40282, 40283, 43108, 40284, 40285, 40286, 40287, 40288, 42400, 42401, 42402, 42403, 40289, 40290, 40291, 41549, 41550, 41551, 41552, 41553, 41554, 41555, 42404, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStream() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamType get(quickfix.field.LegPaymentStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamType getLegPaymentStreamType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamType() {
    return isSetField(40279);
  }

  public void set(quickfix.field.LegPaymentStreamMarketRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamMarketRate get(quickfix.field.LegPaymentStreamMarketRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamMarketRate getLegPaymentStreamMarketRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamMarketRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamMarketRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamMarketRate() {
    return isSetField(40280);
  }

  public void set(quickfix.field.LegPaymentStreamDelayIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamDelayIndicator get(quickfix.field.LegPaymentStreamDelayIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamDelayIndicator getLegPaymentStreamDelayIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamDelayIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamDelayIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamDelayIndicator() {
    return isSetField(40281);
  }

  public void set(quickfix.field.LegPaymentStreamCashSettlIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCashSettlIndicator get(quickfix.field.LegPaymentStreamCashSettlIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCashSettlIndicator getLegPaymentStreamCashSettlIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCashSettlIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCashSettlIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCashSettlIndicator() {
    return isSetField(42399);
  }

  public void set(quickfix.field.LegPaymentStreamSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamSettlCurrency get(quickfix.field.LegPaymentStreamSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamSettlCurrency getLegPaymentStreamSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamSettlCurrency() {
    return isSetField(40282);
  }

  public void set(quickfix.field.LegPaymentStreamDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamDayCount get(quickfix.field.LegPaymentStreamDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamDayCount getLegPaymentStreamDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamDayCount() {
    return isSetField(40283);
  }

  public void set(quickfix.field.LegPaymentStreamOtherDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamOtherDayCount get(quickfix.field.LegPaymentStreamOtherDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamOtherDayCount getLegPaymentStreamOtherDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamOtherDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamOtherDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamOtherDayCount() {
    return isSetField(43108);
  }

  public void set(quickfix.field.LegPaymentStreamAccrualDays value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamAccrualDays get(quickfix.field.LegPaymentStreamAccrualDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamAccrualDays getLegPaymentStreamAccrualDays() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamAccrualDays());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamAccrualDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamAccrualDays() {
    return isSetField(40284);
  }

  public void set(quickfix.field.LegPaymentStreamDiscountType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamDiscountType get(quickfix.field.LegPaymentStreamDiscountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamDiscountType getLegPaymentStreamDiscountType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamDiscountType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamDiscountType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamDiscountType() {
    return isSetField(40285);
  }

  public void set(quickfix.field.LegPaymentStreamDiscountRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamDiscountRate get(quickfix.field.LegPaymentStreamDiscountRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamDiscountRate getLegPaymentStreamDiscountRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamDiscountRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamDiscountRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamDiscountRate() {
    return isSetField(40286);
  }

  public void set(quickfix.field.LegPaymentStreamDiscountRateDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamDiscountRateDayCount get(quickfix.field.LegPaymentStreamDiscountRateDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamDiscountRateDayCount getLegPaymentStreamDiscountRateDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamDiscountRateDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamDiscountRateDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamDiscountRateDayCount() {
    return isSetField(40287);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingMethod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingMethod get(quickfix.field.LegPaymentStreamCompoundingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingMethod getLegPaymentStreamCompoundingMethod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingMethod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingMethod() {
    return isSetField(40288);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingXIDRef get(quickfix.field.LegPaymentStreamCompoundingXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingXIDRef getLegPaymentStreamCompoundingXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingXIDRef());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingXIDRef() {
    return isSetField(42400);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingSpread get(quickfix.field.LegPaymentStreamCompoundingSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingSpread getLegPaymentStreamCompoundingSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingSpread() {
    return isSetField(42401);
  }

  public void set(quickfix.field.LegPaymentStreamInterpolationMethod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInterpolationMethod get(quickfix.field.LegPaymentStreamInterpolationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInterpolationMethod getLegPaymentStreamInterpolationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInterpolationMethod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInterpolationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInterpolationMethod() {
    return isSetField(42402);
  }

  public void set(quickfix.field.LegPaymentStreamInterpolationPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInterpolationPeriod get(quickfix.field.LegPaymentStreamInterpolationPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInterpolationPeriod getLegPaymentStreamInterpolationPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInterpolationPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInterpolationPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInterpolationPeriod() {
    return isSetField(42403);
  }

  public void set(quickfix.field.LegPaymentStreamInitialPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialPrincipalExchangeIndicator get(quickfix.field.LegPaymentStreamInitialPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialPrincipalExchangeIndicator getLegPaymentStreamInitialPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialPrincipalExchangeIndicator() {
    return isSetField(40289);
  }

  public void set(quickfix.field.LegPaymentStreamInterimPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInterimPrincipalExchangeIndicator get(quickfix.field.LegPaymentStreamInterimPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInterimPrincipalExchangeIndicator getLegPaymentStreamInterimPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInterimPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInterimPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInterimPrincipalExchangeIndicator() {
    return isSetField(40290);
  }

  public void set(quickfix.field.LegPaymentStreamFinalPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPrincipalExchangeIndicator get(quickfix.field.LegPaymentStreamFinalPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPrincipalExchangeIndicator getLegPaymentStreamFinalPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPrincipalExchangeIndicator() {
    return isSetField(40291);
  }

  public void set(quickfix.field.LegPaymentStreamFlatRateIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFlatRateIndicator get(quickfix.field.LegPaymentStreamFlatRateIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFlatRateIndicator getLegPaymentStreamFlatRateIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFlatRateIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFlatRateIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFlatRateIndicator() {
    return isSetField(41549);
  }

  public void set(quickfix.field.LegPaymentStreamFlatRateAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFlatRateAmount get(quickfix.field.LegPaymentStreamFlatRateAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFlatRateAmount getLegPaymentStreamFlatRateAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFlatRateAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFlatRateAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFlatRateAmount() {
    return isSetField(41550);
  }

  public void set(quickfix.field.LegPaymentStreamFlatRateCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFlatRateCurrency get(quickfix.field.LegPaymentStreamFlatRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFlatRateCurrency getLegPaymentStreamFlatRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFlatRateCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFlatRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFlatRateCurrency() {
    return isSetField(41551);
  }

  public void set(quickfix.field.LegStreamMaximumPaymentAmount value) {
    setField(value);
  }

  public quickfix.field.LegStreamMaximumPaymentAmount get(quickfix.field.LegStreamMaximumPaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamMaximumPaymentAmount getLegStreamMaximumPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.LegStreamMaximumPaymentAmount());
  }

  public boolean isSet(quickfix.field.LegStreamMaximumPaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamMaximumPaymentAmount() {
    return isSetField(41552);
  }

  public void set(quickfix.field.LegStreamMaximumPaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamMaximumPaymentCurrency get(quickfix.field.LegStreamMaximumPaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamMaximumPaymentCurrency getLegStreamMaximumPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamMaximumPaymentCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamMaximumPaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamMaximumPaymentCurrency() {
    return isSetField(41553);
  }

  public void set(quickfix.field.LegStreamMaximumTransactionAmount value) {
    setField(value);
  }

  public quickfix.field.LegStreamMaximumTransactionAmount get(quickfix.field.LegStreamMaximumTransactionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamMaximumTransactionAmount getLegStreamMaximumTransactionAmount() throws FieldNotFound {
    return get(new quickfix.field.LegStreamMaximumTransactionAmount());
  }

  public boolean isSet(quickfix.field.LegStreamMaximumTransactionAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamMaximumTransactionAmount() {
    return isSetField(41554);
  }

  public void set(quickfix.field.LegStreamMaximumTransactionCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamMaximumTransactionCurrency get(quickfix.field.LegStreamMaximumTransactionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamMaximumTransactionCurrency getLegStreamMaximumTransactionCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamMaximumTransactionCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamMaximumTransactionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamMaximumTransactionCurrency() {
    return isSetField(41555);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamPaymentDates get(quickfix.fixlatest.component.LegPaymentStreamPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamPaymentDates getLegPaymentStreamPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamPaymentDates());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamResetDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamResetDates get(quickfix.fixlatest.component.LegPaymentStreamResetDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamResetDates getLegPaymentStreamResetDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamResetDates());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamFixedRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFixedRate get(quickfix.fixlatest.component.LegPaymentStreamFixedRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFixedRate getLegPaymentStreamFixedRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFixedRate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFloatingRate get(quickfix.fixlatest.component.LegPaymentStreamFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFloatingRate getLegPaymentStreamFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFloatingRate());
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingFixedRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingFixedRate get(quickfix.field.LegPaymentStreamCompoundingFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingFixedRate getLegPaymentStreamCompoundingFixedRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingFixedRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingFixedRate() {
    return isSetField(42404);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamCompoundingFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingFloatingRate get(quickfix.fixlatest.component.LegPaymentStreamCompoundingFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingFloatingRate getLegPaymentStreamCompoundingFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamCompoundingFloatingRate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamCompoundingDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingDates get(quickfix.fixlatest.component.LegPaymentStreamCompoundingDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingDates getLegPaymentStreamCompoundingDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamCompoundingDates());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlTerms component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlTerms get(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlTerms component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlTerms getLegPaymentStreamNonDeliverableSettlTermsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlTerms());
  }
}
