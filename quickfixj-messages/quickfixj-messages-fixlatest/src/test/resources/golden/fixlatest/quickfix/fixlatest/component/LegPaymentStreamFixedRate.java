/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFixedRate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40326, 40327, 40328, 41556, 41557, 40329, 40330, 41558, 41559, 41560, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFixedRate() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamRate get(quickfix.field.LegPaymentStreamRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamRate getLegPaymentStreamRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamRate() {
    return isSetField(40326);
  }

  public void set(quickfix.field.LegPaymentStreamFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixedAmount get(quickfix.field.LegPaymentStreamFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixedAmount getLegPaymentStreamFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixedAmount() {
    return isSetField(40327);
  }

  public void set(quickfix.field.LegPaymentStreamRateOrAmountCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamRateOrAmountCurrency get(quickfix.field.LegPaymentStreamRateOrAmountCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamRateOrAmountCurrency getLegPaymentStreamRateOrAmountCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamRateOrAmountCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamRateOrAmountCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamRateOrAmountCurrency() {
    return isSetField(40328);
  }

  public void set(quickfix.field.LegPaymentStreamFixedAmountUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixedAmountUnitOfMeasure get(quickfix.field.LegPaymentStreamFixedAmountUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixedAmountUnitOfMeasure getLegPaymentStreamFixedAmountUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixedAmountUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixedAmountUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixedAmountUnitOfMeasure() {
    return isSetField(41556);
  }

  public void set(quickfix.field.LegPaymentStreamTotalFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamTotalFixedAmount get(quickfix.field.LegPaymentStreamTotalFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamTotalFixedAmount getLegPaymentStreamTotalFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamTotalFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamTotalFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamTotalFixedAmount() {
    return isSetField(41557);
  }

  public void set(quickfix.field.LegPaymentStreamFutureValueNotional value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFutureValueNotional get(quickfix.field.LegPaymentStreamFutureValueNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFutureValueNotional getLegPaymentStreamFutureValueNotional() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFutureValueNotional());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFutureValueNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFutureValueNotional() {
    return isSetField(40329);
  }

  public void set(quickfix.field.LegPaymentStreamFutureValueDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFutureValueDateAdjusted get(quickfix.field.LegPaymentStreamFutureValueDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFutureValueDateAdjusted getLegPaymentStreamFutureValueDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFutureValueDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFutureValueDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFutureValueDateAdjusted() {
    return isSetField(40330);
  }

  public void set(quickfix.field.LegPaymentStreamWorldScaleRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamWorldScaleRate get(quickfix.field.LegPaymentStreamWorldScaleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamWorldScaleRate getLegPaymentStreamWorldScaleRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamWorldScaleRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamWorldScaleRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamWorldScaleRate() {
    return isSetField(41558);
  }

  public void set(quickfix.field.LegPaymentStreamContractPrice value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamContractPrice get(quickfix.field.LegPaymentStreamContractPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamContractPrice getLegPaymentStreamContractPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamContractPrice());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamContractPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamContractPrice() {
    return isSetField(41559);
  }

  public void set(quickfix.field.LegPaymentStreamContractPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamContractPriceCurrency get(quickfix.field.LegPaymentStreamContractPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamContractPriceCurrency getLegPaymentStreamContractPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamContractPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamContractPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamContractPriceCurrency() {
    return isSetField(41560);
  }
}
