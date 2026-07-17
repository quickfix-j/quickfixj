/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFixedRate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40784, 40785, 40786, 41187, 41188, 40787, 40788, 41189, 41190, 41191, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFixedRate() {
    super();
  }

  public void set(quickfix.field.PaymentStreamRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamRate get(quickfix.field.PaymentStreamRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamRate getPaymentStreamRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamRate() {
    return isSetField(40784);
  }

  public void set(quickfix.field.PaymentStreamFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixedAmount get(quickfix.field.PaymentStreamFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixedAmount getPaymentStreamFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixedAmount() {
    return isSetField(40785);
  }

  public void set(quickfix.field.PaymentStreamRateOrAmountCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamRateOrAmountCurrency get(quickfix.field.PaymentStreamRateOrAmountCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamRateOrAmountCurrency getPaymentStreamRateOrAmountCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamRateOrAmountCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamRateOrAmountCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamRateOrAmountCurrency() {
    return isSetField(40786);
  }

  public void set(quickfix.field.PaymentStreamFixedAmountUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixedAmountUnitOfMeasure get(quickfix.field.PaymentStreamFixedAmountUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixedAmountUnitOfMeasure getPaymentStreamFixedAmountUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixedAmountUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixedAmountUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixedAmountUnitOfMeasure() {
    return isSetField(41187);
  }

  public void set(quickfix.field.PaymentStreamTotalFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamTotalFixedAmount get(quickfix.field.PaymentStreamTotalFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamTotalFixedAmount getPaymentStreamTotalFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamTotalFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStreamTotalFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamTotalFixedAmount() {
    return isSetField(41188);
  }

  public void set(quickfix.field.PaymentStreamFutureValueNotional value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFutureValueNotional get(quickfix.field.PaymentStreamFutureValueNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFutureValueNotional getPaymentStreamFutureValueNotional() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFutureValueNotional());
  }

  public boolean isSet(quickfix.field.PaymentStreamFutureValueNotional field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFutureValueNotional() {
    return isSetField(40787);
  }

  public void set(quickfix.field.PaymentStreamFutureValueDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFutureValueDateAdjusted get(quickfix.field.PaymentStreamFutureValueDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFutureValueDateAdjusted getPaymentStreamFutureValueDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFutureValueDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamFutureValueDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFutureValueDateAdjusted() {
    return isSetField(40788);
  }

  public void set(quickfix.field.PaymentStreamWorldScaleRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamWorldScaleRate get(quickfix.field.PaymentStreamWorldScaleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamWorldScaleRate getPaymentStreamWorldScaleRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamWorldScaleRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamWorldScaleRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamWorldScaleRate() {
    return isSetField(41189);
  }

  public void set(quickfix.field.PaymentStreamContractPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamContractPrice get(quickfix.field.PaymentStreamContractPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamContractPrice getPaymentStreamContractPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamContractPrice());
  }

  public boolean isSet(quickfix.field.PaymentStreamContractPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamContractPrice() {
    return isSetField(41190);
  }

  public void set(quickfix.field.PaymentStreamContractPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamContractPriceCurrency get(quickfix.field.PaymentStreamContractPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamContractPriceCurrency getPaymentStreamContractPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamContractPriceCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamContractPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamContractPriceCurrency() {
    return isSetField(41191);
  }
}
