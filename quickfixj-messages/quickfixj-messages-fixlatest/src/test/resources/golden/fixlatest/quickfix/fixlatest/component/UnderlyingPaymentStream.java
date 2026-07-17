/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStream extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40568, 40569, 40570, 42895, 40571, 40572, 43107, 40573, 40574, 40575, 40576, 40577, 42896, 42897, 42898, 42899, 40578, 40579, 40580, 41897, 41898, 41899, 41900, 41901, 41902, 41903, 42900, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStream() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamType get(quickfix.field.UnderlyingPaymentStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamType getUnderlyingPaymentStreamType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamType() {
    return isSetField(40568);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamMarketRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamMarketRate get(quickfix.field.UnderlyingPaymentStreamMarketRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamMarketRate getUnderlyingPaymentStreamMarketRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamMarketRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamMarketRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamMarketRate() {
    return isSetField(40569);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamDelayIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamDelayIndicator get(quickfix.field.UnderlyingPaymentStreamDelayIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamDelayIndicator getUnderlyingPaymentStreamDelayIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamDelayIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamDelayIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamDelayIndicator() {
    return isSetField(40570);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCashSettlIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCashSettlIndicator get(quickfix.field.UnderlyingPaymentStreamCashSettlIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCashSettlIndicator getUnderlyingPaymentStreamCashSettlIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCashSettlIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCashSettlIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCashSettlIndicator() {
    return isSetField(42895);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamSettlCurrency get(quickfix.field.UnderlyingPaymentStreamSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamSettlCurrency getUnderlyingPaymentStreamSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamSettlCurrency() {
    return isSetField(40571);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamDayCount get(quickfix.field.UnderlyingPaymentStreamDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamDayCount getUnderlyingPaymentStreamDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamDayCount() {
    return isSetField(40572);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamOtherDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamOtherDayCount get(quickfix.field.UnderlyingPaymentStreamOtherDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamOtherDayCount getUnderlyingPaymentStreamOtherDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamOtherDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamOtherDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamOtherDayCount() {
    return isSetField(43107);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamAccrualDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamAccrualDays get(quickfix.field.UnderlyingPaymentStreamAccrualDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamAccrualDays getUnderlyingPaymentStreamAccrualDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamAccrualDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamAccrualDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamAccrualDays() {
    return isSetField(40573);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamDiscountType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamDiscountType get(quickfix.field.UnderlyingPaymentStreamDiscountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamDiscountType getUnderlyingPaymentStreamDiscountType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamDiscountType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamDiscountType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamDiscountType() {
    return isSetField(40574);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamDiscountRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamDiscountRate get(quickfix.field.UnderlyingPaymentStreamDiscountRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamDiscountRate getUnderlyingPaymentStreamDiscountRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamDiscountRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamDiscountRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamDiscountRate() {
    return isSetField(40575);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamDiscountRateDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamDiscountRateDayCount get(quickfix.field.UnderlyingPaymentStreamDiscountRateDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamDiscountRateDayCount getUnderlyingPaymentStreamDiscountRateDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamDiscountRateDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamDiscountRateDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamDiscountRateDayCount() {
    return isSetField(40576);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingMethod get(quickfix.field.UnderlyingPaymentStreamCompoundingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingMethod getUnderlyingPaymentStreamCompoundingMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingMethod() {
    return isSetField(40577);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingXIDRef get(quickfix.field.UnderlyingPaymentStreamCompoundingXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingXIDRef getUnderlyingPaymentStreamCompoundingXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingXIDRef() {
    return isSetField(42896);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingSpread get(quickfix.field.UnderlyingPaymentStreamCompoundingSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingSpread getUnderlyingPaymentStreamCompoundingSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingSpread() {
    return isSetField(42897);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInterpolationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInterpolationMethod get(quickfix.field.UnderlyingPaymentStreamInterpolationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInterpolationMethod getUnderlyingPaymentStreamInterpolationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInterpolationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInterpolationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInterpolationMethod() {
    return isSetField(42898);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInterpolationPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInterpolationPeriod get(quickfix.field.UnderlyingPaymentStreamInterpolationPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInterpolationPeriod getUnderlyingPaymentStreamInterpolationPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInterpolationPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInterpolationPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInterpolationPeriod() {
    return isSetField(42899);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialPrincipalExchangeIndicator get(quickfix.field.UnderlyingPaymentStreamInitialPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialPrincipalExchangeIndicator getUnderlyingPaymentStreamInitialPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialPrincipalExchangeIndicator() {
    return isSetField(40578);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInterimPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInterimPrincipalExchangeIndicator get(quickfix.field.UnderlyingPaymentStreamInterimPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInterimPrincipalExchangeIndicator getUnderlyingPaymentStreamInterimPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInterimPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInterimPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInterimPrincipalExchangeIndicator() {
    return isSetField(40579);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFinalPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPrincipalExchangeIndicator get(quickfix.field.UnderlyingPaymentStreamFinalPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFinalPrincipalExchangeIndicator getUnderlyingPaymentStreamFinalPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFinalPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFinalPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFinalPrincipalExchangeIndicator() {
    return isSetField(40580);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFlatRateIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFlatRateIndicator get(quickfix.field.UnderlyingPaymentStreamFlatRateIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFlatRateIndicator getUnderlyingPaymentStreamFlatRateIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFlatRateIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFlatRateIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFlatRateIndicator() {
    return isSetField(41897);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFlatRateAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFlatRateAmount get(quickfix.field.UnderlyingPaymentStreamFlatRateAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFlatRateAmount getUnderlyingPaymentStreamFlatRateAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFlatRateAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFlatRateAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFlatRateAmount() {
    return isSetField(41898);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFlatRateCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFlatRateCurrency get(quickfix.field.UnderlyingPaymentStreamFlatRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFlatRateCurrency getUnderlyingPaymentStreamFlatRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFlatRateCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFlatRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFlatRateCurrency() {
    return isSetField(41899);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamMaximumPaymentAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumPaymentAmount get(quickfix.field.UnderlyingPaymentStreamMaximumPaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumPaymentAmount getUnderlyingPaymentStreamMaximumPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamMaximumPaymentAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamMaximumPaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamMaximumPaymentAmount() {
    return isSetField(41900);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamMaximumPaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumPaymentCurrency get(quickfix.field.UnderlyingPaymentStreamMaximumPaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumPaymentCurrency getUnderlyingPaymentStreamMaximumPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamMaximumPaymentCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamMaximumPaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamMaximumPaymentCurrency() {
    return isSetField(41901);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamMaximumTransactionAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumTransactionAmount get(quickfix.field.UnderlyingPaymentStreamMaximumTransactionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumTransactionAmount getUnderlyingPaymentStreamMaximumTransactionAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamMaximumTransactionAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamMaximumTransactionAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamMaximumTransactionAmount() {
    return isSetField(41902);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamMaximumTransactionCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumTransactionCurrency get(quickfix.field.UnderlyingPaymentStreamMaximumTransactionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamMaximumTransactionCurrency getUnderlyingPaymentStreamMaximumTransactionCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamMaximumTransactionCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamMaximumTransactionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamMaximumTransactionCurrency() {
    return isSetField(41903);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDates get(quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDates getUnderlyingPaymentStreamPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamResetDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamResetDates get(quickfix.fixlatest.component.UnderlyingPaymentStreamResetDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamResetDates getUnderlyingPaymentStreamResetDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamResetDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFixedRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFixedRate get(quickfix.fixlatest.component.UnderlyingPaymentStreamFixedRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFixedRate getUnderlyingPaymentStreamFixedRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFixedRate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFloatingRate get(quickfix.fixlatest.component.UnderlyingPaymentStreamFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFloatingRate getUnderlyingPaymentStreamFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFloatingRate());
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingFixedRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingFixedRate get(quickfix.field.UnderlyingPaymentStreamCompoundingFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingFixedRate getUnderlyingPaymentStreamCompoundingFixedRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingFixedRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingFixedRate() {
    return isSetField(42900);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingFloatingRate get(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingFloatingRate getUnderlyingPaymentStreamCompoundingFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingFloatingRate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDates get(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDates getUnderlyingPaymentStreamCompoundingDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlTerms component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlTerms get(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlTerms component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlTerms getUnderlyingPaymentStreamNonDeliverableSettlTermsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlTerms());
  }
}
