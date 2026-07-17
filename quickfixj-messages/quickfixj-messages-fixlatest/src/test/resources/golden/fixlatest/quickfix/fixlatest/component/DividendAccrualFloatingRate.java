/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendAccrualFloatingRate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42218, 42219, 42220, 42221, 42222, 42223, 42224, 42225, 42226, 42227, 42228, 42229, 42230, 42231, 42232, 42233, 42234, 42235, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DividendAccrualFloatingRate() {
    super();
  }

  public void set(quickfix.field.DividendFloatingRateIndex value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateIndex get(quickfix.field.DividendFloatingRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateIndex getDividendFloatingRateIndex() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateIndex());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateIndex() {
    return isSetField(42218);
  }

  public void set(quickfix.field.DividendFloatingRateIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateIndexCurvePeriod get(quickfix.field.DividendFloatingRateIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateIndexCurvePeriod getDividendFloatingRateIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateIndexCurvePeriod() {
    return isSetField(42219);
  }

  public void set(quickfix.field.DividendFloatingRateIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateIndexCurveUnit get(quickfix.field.DividendFloatingRateIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateIndexCurveUnit getDividendFloatingRateIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateIndexCurveUnit() {
    return isSetField(42220);
  }

  public void set(quickfix.field.DividendFloatingRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateMultiplier get(quickfix.field.DividendFloatingRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateMultiplier getDividendFloatingRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateMultiplier());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateMultiplier() {
    return isSetField(42221);
  }

  public void set(quickfix.field.DividendFloatingRateSpread value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateSpread get(quickfix.field.DividendFloatingRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateSpread getDividendFloatingRateSpread() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateSpread());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateSpread() {
    return isSetField(42222);
  }

  public void set(quickfix.field.DividendFloatingRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateSpreadPositionType get(quickfix.field.DividendFloatingRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateSpreadPositionType getDividendFloatingRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateSpreadPositionType() {
    return isSetField(42223);
  }

  public void set(quickfix.field.DividendFloatingRateTreatment value) {
    setField(value);
  }

  public quickfix.field.DividendFloatingRateTreatment get(quickfix.field.DividendFloatingRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloatingRateTreatment getDividendFloatingRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.DividendFloatingRateTreatment());
  }

  public boolean isSet(quickfix.field.DividendFloatingRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloatingRateTreatment() {
    return isSetField(42224);
  }

  public void set(quickfix.field.DividendCapRate value) {
    setField(value);
  }

  public quickfix.field.DividendCapRate get(quickfix.field.DividendCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendCapRate getDividendCapRate() throws FieldNotFound {
    return get(new quickfix.field.DividendCapRate());
  }

  public boolean isSet(quickfix.field.DividendCapRate field) {
    return isSetField(field);
  }

  public boolean isSetDividendCapRate() {
    return isSetField(42225);
  }

  public void set(quickfix.field.DividendCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.DividendCapRateBuySide get(quickfix.field.DividendCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendCapRateBuySide getDividendCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.DividendCapRateBuySide());
  }

  public boolean isSet(quickfix.field.DividendCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetDividendCapRateBuySide() {
    return isSetField(42226);
  }

  public void set(quickfix.field.DividendCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.DividendCapRateSellSide get(quickfix.field.DividendCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendCapRateSellSide getDividendCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.DividendCapRateSellSide());
  }

  public boolean isSet(quickfix.field.DividendCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetDividendCapRateSellSide() {
    return isSetField(42227);
  }

  public void set(quickfix.field.DividendFloorRate value) {
    setField(value);
  }

  public quickfix.field.DividendFloorRate get(quickfix.field.DividendFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloorRate getDividendFloorRate() throws FieldNotFound {
    return get(new quickfix.field.DividendFloorRate());
  }

  public boolean isSet(quickfix.field.DividendFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloorRate() {
    return isSetField(42228);
  }

  public void set(quickfix.field.DividendFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.DividendFloorRateBuySide get(quickfix.field.DividendFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloorRateBuySide getDividendFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.DividendFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.DividendFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloorRateBuySide() {
    return isSetField(42229);
  }

  public void set(quickfix.field.DividendFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.DividendFloorRateSellSide get(quickfix.field.DividendFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFloorRateSellSide getDividendFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.DividendFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.DividendFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetDividendFloorRateSellSide() {
    return isSetField(42230);
  }

  public void set(quickfix.field.DividendInitialRate value) {
    setField(value);
  }

  public quickfix.field.DividendInitialRate get(quickfix.field.DividendInitialRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendInitialRate getDividendInitialRate() throws FieldNotFound {
    return get(new quickfix.field.DividendInitialRate());
  }

  public boolean isSet(quickfix.field.DividendInitialRate field) {
    return isSetField(field);
  }

  public boolean isSetDividendInitialRate() {
    return isSetField(42231);
  }

  public void set(quickfix.field.DividendFinalRateRoundingDirection value) {
    setField(value);
  }

  public quickfix.field.DividendFinalRateRoundingDirection get(quickfix.field.DividendFinalRateRoundingDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFinalRateRoundingDirection getDividendFinalRateRoundingDirection() throws FieldNotFound {
    return get(new quickfix.field.DividendFinalRateRoundingDirection());
  }

  public boolean isSet(quickfix.field.DividendFinalRateRoundingDirection field) {
    return isSetField(field);
  }

  public boolean isSetDividendFinalRateRoundingDirection() {
    return isSetField(42232);
  }

  public void set(quickfix.field.DividendFinalRatePrecision value) {
    setField(value);
  }

  public quickfix.field.DividendFinalRatePrecision get(quickfix.field.DividendFinalRatePrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFinalRatePrecision getDividendFinalRatePrecision() throws FieldNotFound {
    return get(new quickfix.field.DividendFinalRatePrecision());
  }

  public boolean isSet(quickfix.field.DividendFinalRatePrecision field) {
    return isSetField(field);
  }

  public boolean isSetDividendFinalRatePrecision() {
    return isSetField(42233);
  }

  public void set(quickfix.field.DividendAveragingMethod value) {
    setField(value);
  }

  public quickfix.field.DividendAveragingMethod get(quickfix.field.DividendAveragingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAveragingMethod getDividendAveragingMethod() throws FieldNotFound {
    return get(new quickfix.field.DividendAveragingMethod());
  }

  public boolean isSet(quickfix.field.DividendAveragingMethod field) {
    return isSetField(field);
  }

  public boolean isSetDividendAveragingMethod() {
    return isSetField(42234);
  }

  public void set(quickfix.field.DividendNegativeRateTreatment value) {
    setField(value);
  }

  public quickfix.field.DividendNegativeRateTreatment get(quickfix.field.DividendNegativeRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendNegativeRateTreatment getDividendNegativeRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.DividendNegativeRateTreatment());
  }

  public boolean isSet(quickfix.field.DividendNegativeRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetDividendNegativeRateTreatment() {
    return isSetField(42235);
  }
}
