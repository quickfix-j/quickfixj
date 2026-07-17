/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStream extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40738, 40739, 40740, 42600, 40741, 40742, 43106, 40743, 40744, 40745, 40746, 40747, 42601, 42602, 42603, 42604, 40748, 40749, 40750, 41180, 41181, 41182, 41183, 41184, 41185, 41186, 42605, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStream() {
    super();
  }

  public void set(quickfix.field.PaymentStreamType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamType get(quickfix.field.PaymentStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamType getPaymentStreamType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamType());
  }

  public boolean isSet(quickfix.field.PaymentStreamType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamType() {
    return isSetField(40738);
  }

  public void set(quickfix.field.PaymentStreamMarketRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamMarketRate get(quickfix.field.PaymentStreamMarketRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamMarketRate getPaymentStreamMarketRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamMarketRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamMarketRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamMarketRate() {
    return isSetField(40739);
  }

  public void set(quickfix.field.PaymentStreamDelayIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamDelayIndicator get(quickfix.field.PaymentStreamDelayIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamDelayIndicator getPaymentStreamDelayIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamDelayIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamDelayIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamDelayIndicator() {
    return isSetField(40740);
  }

  public void set(quickfix.field.PaymentStreamCashSettlIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCashSettlIndicator get(quickfix.field.PaymentStreamCashSettlIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCashSettlIndicator getPaymentStreamCashSettlIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCashSettlIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamCashSettlIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCashSettlIndicator() {
    return isSetField(42600);
  }

  public void set(quickfix.field.PaymentStreamSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamSettlCurrency get(quickfix.field.PaymentStreamSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamSettlCurrency getPaymentStreamSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamSettlCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamSettlCurrency() {
    return isSetField(40741);
  }

  public void set(quickfix.field.PaymentStreamDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamDayCount get(quickfix.field.PaymentStreamDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamDayCount getPaymentStreamDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamDayCount());
  }

  public boolean isSet(quickfix.field.PaymentStreamDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamDayCount() {
    return isSetField(40742);
  }

  public void set(quickfix.field.PaymentStreamOtherDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamOtherDayCount get(quickfix.field.PaymentStreamOtherDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamOtherDayCount getPaymentStreamOtherDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamOtherDayCount());
  }

  public boolean isSet(quickfix.field.PaymentStreamOtherDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamOtherDayCount() {
    return isSetField(43106);
  }

  public void set(quickfix.field.PaymentStreamAccrualDays value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamAccrualDays get(quickfix.field.PaymentStreamAccrualDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamAccrualDays getPaymentStreamAccrualDays() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamAccrualDays());
  }

  public boolean isSet(quickfix.field.PaymentStreamAccrualDays field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamAccrualDays() {
    return isSetField(40743);
  }

  public void set(quickfix.field.PaymentStreamDiscountType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamDiscountType get(quickfix.field.PaymentStreamDiscountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamDiscountType getPaymentStreamDiscountType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamDiscountType());
  }

  public boolean isSet(quickfix.field.PaymentStreamDiscountType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamDiscountType() {
    return isSetField(40744);
  }

  public void set(quickfix.field.PaymentStreamDiscountRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamDiscountRate get(quickfix.field.PaymentStreamDiscountRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamDiscountRate getPaymentStreamDiscountRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamDiscountRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamDiscountRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamDiscountRate() {
    return isSetField(40745);
  }

  public void set(quickfix.field.PaymentStreamDiscountRateDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamDiscountRateDayCount get(quickfix.field.PaymentStreamDiscountRateDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamDiscountRateDayCount getPaymentStreamDiscountRateDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamDiscountRateDayCount());
  }

  public boolean isSet(quickfix.field.PaymentStreamDiscountRateDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamDiscountRateDayCount() {
    return isSetField(40746);
  }

  public void set(quickfix.field.PaymentStreamCompoundingMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingMethod get(quickfix.field.PaymentStreamCompoundingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingMethod getPaymentStreamCompoundingMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingMethod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingMethod() {
    return isSetField(40747);
  }

  public void set(quickfix.field.PaymentStreamCompoundingXIDRef value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingXIDRef get(quickfix.field.PaymentStreamCompoundingXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingXIDRef getPaymentStreamCompoundingXIDRef() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingXIDRef());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingXIDRef() {
    return isSetField(42601);
  }

  public void set(quickfix.field.PaymentStreamCompoundingSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingSpread get(quickfix.field.PaymentStreamCompoundingSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingSpread getPaymentStreamCompoundingSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingSpread());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingSpread() {
    return isSetField(42602);
  }

  public void set(quickfix.field.PaymentStreamInterpolationMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInterpolationMethod get(quickfix.field.PaymentStreamInterpolationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInterpolationMethod getPaymentStreamInterpolationMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInterpolationMethod());
  }

  public boolean isSet(quickfix.field.PaymentStreamInterpolationMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInterpolationMethod() {
    return isSetField(42603);
  }

  public void set(quickfix.field.PaymentStreamInterpolationPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInterpolationPeriod get(quickfix.field.PaymentStreamInterpolationPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInterpolationPeriod getPaymentStreamInterpolationPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInterpolationPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamInterpolationPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInterpolationPeriod() {
    return isSetField(42604);
  }

  public void set(quickfix.field.PaymentStreamInitialPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialPrincipalExchangeIndicator get(quickfix.field.PaymentStreamInitialPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialPrincipalExchangeIndicator getPaymentStreamInitialPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialPrincipalExchangeIndicator() {
    return isSetField(40748);
  }

  public void set(quickfix.field.PaymentStreamInterimPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInterimPrincipalExchangeIndicator get(quickfix.field.PaymentStreamInterimPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInterimPrincipalExchangeIndicator getPaymentStreamInterimPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInterimPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamInterimPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInterimPrincipalExchangeIndicator() {
    return isSetField(40749);
  }

  public void set(quickfix.field.PaymentStreamFinalPrincipalExchangeIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFinalPrincipalExchangeIndicator get(quickfix.field.PaymentStreamFinalPrincipalExchangeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFinalPrincipalExchangeIndicator getPaymentStreamFinalPrincipalExchangeIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFinalPrincipalExchangeIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamFinalPrincipalExchangeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFinalPrincipalExchangeIndicator() {
    return isSetField(40750);
  }

  public void set(quickfix.field.PaymentStreamFlatRateIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFlatRateIndicator get(quickfix.field.PaymentStreamFlatRateIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFlatRateIndicator getPaymentStreamFlatRateIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFlatRateIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamFlatRateIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFlatRateIndicator() {
    return isSetField(41180);
  }

  public void set(quickfix.field.PaymentStreamFlatRateAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFlatRateAmount get(quickfix.field.PaymentStreamFlatRateAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFlatRateAmount getPaymentStreamFlatRateAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFlatRateAmount());
  }

  public boolean isSet(quickfix.field.PaymentStreamFlatRateAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFlatRateAmount() {
    return isSetField(41181);
  }

  public void set(quickfix.field.PaymentStreamFlatRateCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFlatRateCurrency get(quickfix.field.PaymentStreamFlatRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFlatRateCurrency getPaymentStreamFlatRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFlatRateCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamFlatRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFlatRateCurrency() {
    return isSetField(41182);
  }

  public void set(quickfix.field.PaymentStreamMaximumPaymentAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamMaximumPaymentAmount get(quickfix.field.PaymentStreamMaximumPaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamMaximumPaymentAmount getPaymentStreamMaximumPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamMaximumPaymentAmount());
  }

  public boolean isSet(quickfix.field.PaymentStreamMaximumPaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamMaximumPaymentAmount() {
    return isSetField(41183);
  }

  public void set(quickfix.field.PaymentStreamMaximumPaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamMaximumPaymentCurrency get(quickfix.field.PaymentStreamMaximumPaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamMaximumPaymentCurrency getPaymentStreamMaximumPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamMaximumPaymentCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamMaximumPaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamMaximumPaymentCurrency() {
    return isSetField(41184);
  }

  public void set(quickfix.field.PaymentStreamMaximumTransactionAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamMaximumTransactionAmount get(quickfix.field.PaymentStreamMaximumTransactionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamMaximumTransactionAmount getPaymentStreamMaximumTransactionAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamMaximumTransactionAmount());
  }

  public boolean isSet(quickfix.field.PaymentStreamMaximumTransactionAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamMaximumTransactionAmount() {
    return isSetField(41185);
  }

  public void set(quickfix.field.PaymentStreamMaximumTransactionCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamMaximumTransactionCurrency get(quickfix.field.PaymentStreamMaximumTransactionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamMaximumTransactionCurrency getPaymentStreamMaximumTransactionCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamMaximumTransactionCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamMaximumTransactionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamMaximumTransactionCurrency() {
    return isSetField(41186);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamPaymentDates get(quickfix.fixlatest.component.PaymentStreamPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamPaymentDates getPaymentStreamPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamPaymentDates());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamResetDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamResetDates get(quickfix.fixlatest.component.PaymentStreamResetDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamResetDates getPaymentStreamResetDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamResetDates());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamFixedRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFixedRate get(quickfix.fixlatest.component.PaymentStreamFixedRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFixedRate getPaymentStreamFixedRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFixedRate());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFloatingRate get(quickfix.fixlatest.component.PaymentStreamFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFloatingRate getPaymentStreamFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFloatingRate());
  }

  public void set(quickfix.field.PaymentStreamCompoundingFixedRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFixedRate get(quickfix.field.PaymentStreamCompoundingFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFixedRate getPaymentStreamCompoundingFixedRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFixedRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFixedRate() {
    return isSetField(42605);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamCompoundingFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingFloatingRate get(quickfix.fixlatest.component.PaymentStreamCompoundingFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingFloatingRate getPaymentStreamCompoundingFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamCompoundingFloatingRate());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamCompoundingDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingDates get(quickfix.fixlatest.component.PaymentStreamCompoundingDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingDates getPaymentStreamCompoundingDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamCompoundingDates());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlTerms component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlTerms get(quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlTerms component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlTerms getPaymentStreamNonDeliverableSettlTermsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlTerms());
  }
}
