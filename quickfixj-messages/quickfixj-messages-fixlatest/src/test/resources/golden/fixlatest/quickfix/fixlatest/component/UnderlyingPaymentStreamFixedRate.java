/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFixedRate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40615, 40616, 40617, 41904, 41905, 40618, 40619, 41906, 41907, 41908, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFixedRate() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamRate get(quickfix.field.UnderlyingPaymentStreamRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamRate getUnderlyingPaymentStreamRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamRate() {
    return isSetField(40615);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixedAmount get(quickfix.field.UnderlyingPaymentStreamFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixedAmount getUnderlyingPaymentStreamFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixedAmount() {
    return isSetField(40616);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamRateOrAmountCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamRateOrAmountCurrency get(quickfix.field.UnderlyingPaymentStreamRateOrAmountCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamRateOrAmountCurrency getUnderlyingPaymentStreamRateOrAmountCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamRateOrAmountCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamRateOrAmountCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamRateOrAmountCurrency() {
    return isSetField(40617);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixedAmountUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixedAmountUnitOfMeasure get(quickfix.field.UnderlyingPaymentStreamFixedAmountUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixedAmountUnitOfMeasure getUnderlyingPaymentStreamFixedAmountUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixedAmountUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixedAmountUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixedAmountUnitOfMeasure() {
    return isSetField(41904);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamTotalFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamTotalFixedAmount get(quickfix.field.UnderlyingPaymentStreamTotalFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamTotalFixedAmount getUnderlyingPaymentStreamTotalFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamTotalFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamTotalFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamTotalFixedAmount() {
    return isSetField(41905);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFutureValueNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFutureValueNotional get(quickfix.field.UnderlyingPaymentStreamFutureValueNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFutureValueNotional getUnderlyingPaymentStreamFutureValueNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFutureValueNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFutureValueNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFutureValueNotional() {
    return isSetField(40618);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFutureValueDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFutureValueDateAdjusted get(quickfix.field.UnderlyingPaymentStreamFutureValueDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFutureValueDateAdjusted getUnderlyingPaymentStreamFutureValueDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFutureValueDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFutureValueDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFutureValueDateAdjusted() {
    return isSetField(40619);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamWorldScaleRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamWorldScaleRate get(quickfix.field.UnderlyingPaymentStreamWorldScaleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamWorldScaleRate getUnderlyingPaymentStreamWorldScaleRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamWorldScaleRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamWorldScaleRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamWorldScaleRate() {
    return isSetField(41906);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamContractPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamContractPrice get(quickfix.field.UnderlyingPaymentStreamContractPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamContractPrice getUnderlyingPaymentStreamContractPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamContractPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamContractPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamContractPrice() {
    return isSetField(41907);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamContractPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamContractPriceCurrency get(quickfix.field.UnderlyingPaymentStreamContractPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamContractPriceCurrency getUnderlyingPaymentStreamContractPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamContractPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamContractPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamContractPriceCurrency() {
    return isSetField(41908);
  }
}
