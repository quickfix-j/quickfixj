/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamCompoundingFloatingRate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42628, 42629, 42630, 42631, 42632, 42633, 42634, 42635, 42636, 42637, 42638, 42639, 42640, 42641, 42642, 42643, 42644, 42645, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamCompoundingFloatingRate() {
    super();
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateIndex get(quickfix.field.PaymentStreamCompoundingRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateIndex getPaymentStreamCompoundingRateIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateIndex());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateIndex() {
    return isSetField(42628);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateIndexCurvePeriod get(quickfix.field.PaymentStreamCompoundingRateIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateIndexCurvePeriod getPaymentStreamCompoundingRateIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateIndexCurvePeriod() {
    return isSetField(42629);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateIndexCurveUnit get(quickfix.field.PaymentStreamCompoundingRateIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateIndexCurveUnit getPaymentStreamCompoundingRateIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateIndexCurveUnit() {
    return isSetField(42630);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateMultiplier get(quickfix.field.PaymentStreamCompoundingRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateMultiplier getPaymentStreamCompoundingRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateMultiplier() {
    return isSetField(42631);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateSpread get(quickfix.field.PaymentStreamCompoundingRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateSpread getPaymentStreamCompoundingRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateSpread() {
    return isSetField(42632);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateSpreadPositionType get(quickfix.field.PaymentStreamCompoundingRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateSpreadPositionType getPaymentStreamCompoundingRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateSpreadPositionType() {
    return isSetField(42633);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRateTreatment get(quickfix.field.PaymentStreamCompoundingRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRateTreatment getPaymentStreamCompoundingRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRateTreatment() {
    return isSetField(42634);
  }

  public void set(quickfix.field.PaymentStreamCompoundingCapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingCapRate get(quickfix.field.PaymentStreamCompoundingCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingCapRate getPaymentStreamCompoundingCapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingCapRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingCapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingCapRate() {
    return isSetField(42635);
  }

  public void set(quickfix.field.PaymentStreamCompoundingCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingCapRateBuySide get(quickfix.field.PaymentStreamCompoundingCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingCapRateBuySide getPaymentStreamCompoundingCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingCapRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingCapRateBuySide() {
    return isSetField(42636);
  }

  public void set(quickfix.field.PaymentStreamCompoundingCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingCapRateSellSide get(quickfix.field.PaymentStreamCompoundingCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingCapRateSellSide getPaymentStreamCompoundingCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingCapRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingCapRateSellSide() {
    return isSetField(42637);
  }

  public void set(quickfix.field.PaymentStreamCompoundingFloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFloorRate get(quickfix.field.PaymentStreamCompoundingFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFloorRate getPaymentStreamCompoundingFloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFloorRate() {
    return isSetField(42638);
  }

  public void set(quickfix.field.PaymentStreamCompoundingFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFloorRateBuySide get(quickfix.field.PaymentStreamCompoundingFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFloorRateBuySide getPaymentStreamCompoundingFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFloorRateBuySide() {
    return isSetField(42639);
  }

  public void set(quickfix.field.PaymentStreamCompoundingFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFloorRateSellSide get(quickfix.field.PaymentStreamCompoundingFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFloorRateSellSide getPaymentStreamCompoundingFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFloorRateSellSide() {
    return isSetField(42640);
  }

  public void set(quickfix.field.PaymentStreamCompoundingInitialRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingInitialRate get(quickfix.field.PaymentStreamCompoundingInitialRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingInitialRate getPaymentStreamCompoundingInitialRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingInitialRate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingInitialRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingInitialRate() {
    return isSetField(42641);
  }

  public void set(quickfix.field.PaymentStreamCompoundingFinalRateRoundingDirection value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFinalRateRoundingDirection get(quickfix.field.PaymentStreamCompoundingFinalRateRoundingDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFinalRateRoundingDirection getPaymentStreamCompoundingFinalRateRoundingDirection() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFinalRateRoundingDirection());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFinalRateRoundingDirection field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFinalRateRoundingDirection() {
    return isSetField(42642);
  }

  public void set(quickfix.field.PaymentStreamCompoundingFinalRatePrecision value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFinalRatePrecision get(quickfix.field.PaymentStreamCompoundingFinalRatePrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFinalRatePrecision getPaymentStreamCompoundingFinalRatePrecision() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFinalRatePrecision());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFinalRatePrecision field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFinalRatePrecision() {
    return isSetField(42643);
  }

  public void set(quickfix.field.PaymentStreamCompoundingAveragingMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingAveragingMethod get(quickfix.field.PaymentStreamCompoundingAveragingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingAveragingMethod getPaymentStreamCompoundingAveragingMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingAveragingMethod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingAveragingMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingAveragingMethod() {
    return isSetField(42644);
  }

  public void set(quickfix.field.PaymentStreamCompoundingNegativeRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingNegativeRateTreatment get(quickfix.field.PaymentStreamCompoundingNegativeRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingNegativeRateTreatment getPaymentStreamCompoundingNegativeRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingNegativeRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingNegativeRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingNegativeRateTreatment() {
    return isSetField(42645);
  }
}
