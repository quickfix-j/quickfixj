/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40708, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStubGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubs get(quickfix.field.NoUnderlyingPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubs getNoUnderlyingPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubs() {
    return isSetField(40708);
  }

public static class NoUnderlyingPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40709, 40710, 42993, 42994, 43000, 42995, 42996, 42997, 42998, 42999, 42984, 42985, 42991, 42986, 42987, 42988, 42989, 42990, 40711, 40712, 40713, 40714, 40715, 40716, 40717, 40718, 40719, 40720, 40721, 40722, 40723, 40724, 40725, 40726, 40727, 40728, 40729, 40730, 40731, 40732, 40733, 40734, 40735, 40736, 40737, 0};

  public NoUnderlyingPaymentStubs() {
    super(40708, 40709, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubType get(quickfix.field.UnderlyingPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubType getUnderlyingPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubType() {
    return isSetField(40709);
  }

  public void set(quickfix.field.UnderlyingPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubLength get(quickfix.field.UnderlyingPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubLength getUnderlyingPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubLength() {
    return isSetField(40710);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate get(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate getUnderlyingPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate get(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate getUnderlyingPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubEndDate());
  }

  public void set(quickfix.field.UnderlyingPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubRate get(quickfix.field.UnderlyingPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubRate getUnderlyingPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubRate() {
    return isSetField(40711);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount get(quickfix.field.UnderlyingPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount getUnderlyingPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedAmount() {
    return isSetField(40712);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency get(quickfix.field.UnderlyingPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency getUnderlyingPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedCurrency() {
    return isSetField(40713);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex get(quickfix.field.UnderlyingPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex getUnderlyingPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex() {
    return isSetField(40714);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource get(quickfix.field.UnderlyingPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource getUnderlyingPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexSource() {
    return isSetField(40715);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod get(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod getUnderlyingPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurvePeriod() {
    return isSetField(40716);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit get(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit getUnderlyingPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurveUnit() {
    return isSetField(40717);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier get(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier getUnderlyingPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateMultiplier() {
    return isSetField(40718);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread get(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread getUnderlyingPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpread() {
    return isSetField(40719);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType getUnderlyingPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40720);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment get(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment getUnderlyingPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateTreatment() {
    return isSetField(40721);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate get(quickfix.field.UnderlyingPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate getUnderlyingPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRate() {
    return isSetField(40722);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide getUnderlyingPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateBuySide() {
    return isSetField(40723);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide getUnderlyingPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateSellSide() {
    return isSetField(40724);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate get(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate getUnderlyingPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRate() {
    return isSetField(40725);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide getUnderlyingPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateBuySide() {
    return isSetField(40726);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide getUnderlyingPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateSellSide() {
    return isSetField(40727);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 get(quickfix.field.UnderlyingPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 getUnderlyingPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2() {
    return isSetField(40728);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source get(quickfix.field.UnderlyingPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source getUnderlyingPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2Source() {
    return isSetField(40729);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod get(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod getUnderlyingPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurvePeriod() {
    return isSetField(40730);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit get(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit getUnderlyingPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurveUnit() {
    return isSetField(40731);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier get(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier getUnderlyingPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateMultiplier() {
    return isSetField(40732);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread get(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread getUnderlyingPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpread() {
    return isSetField(40733);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType getUnderlyingPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40734);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment get(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment getUnderlyingPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateTreatment() {
    return isSetField(40735);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate get(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate getUnderlyingPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CapRate() {
    return isSetField(40736);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate get(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate getUnderlyingPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2FloorRate() {
    return isSetField(40737);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubType get(quickfix.field.UnderlyingPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubType getUnderlyingPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubType() {
    return isSetField(40709);
  }

  public void set(quickfix.field.UnderlyingPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubLength get(quickfix.field.UnderlyingPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubLength getUnderlyingPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubLength() {
    return isSetField(40710);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate get(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate getUnderlyingPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate get(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate getUnderlyingPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubEndDate());
  }

  public void set(quickfix.field.UnderlyingPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubRate get(quickfix.field.UnderlyingPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubRate getUnderlyingPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubRate() {
    return isSetField(40711);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount get(quickfix.field.UnderlyingPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount getUnderlyingPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedAmount() {
    return isSetField(40712);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency get(quickfix.field.UnderlyingPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency getUnderlyingPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedCurrency() {
    return isSetField(40713);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex get(quickfix.field.UnderlyingPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex getUnderlyingPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex() {
    return isSetField(40714);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource get(quickfix.field.UnderlyingPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource getUnderlyingPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexSource() {
    return isSetField(40715);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod get(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod getUnderlyingPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurvePeriod() {
    return isSetField(40716);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit get(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit getUnderlyingPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurveUnit() {
    return isSetField(40717);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier get(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier getUnderlyingPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateMultiplier() {
    return isSetField(40718);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread get(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread getUnderlyingPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpread() {
    return isSetField(40719);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType getUnderlyingPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40720);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment get(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment getUnderlyingPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateTreatment() {
    return isSetField(40721);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate get(quickfix.field.UnderlyingPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate getUnderlyingPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRate() {
    return isSetField(40722);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide getUnderlyingPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateBuySide() {
    return isSetField(40723);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide getUnderlyingPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateSellSide() {
    return isSetField(40724);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate get(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate getUnderlyingPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRate() {
    return isSetField(40725);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide getUnderlyingPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateBuySide() {
    return isSetField(40726);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide getUnderlyingPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateSellSide() {
    return isSetField(40727);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 get(quickfix.field.UnderlyingPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 getUnderlyingPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2() {
    return isSetField(40728);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source get(quickfix.field.UnderlyingPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source getUnderlyingPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2Source() {
    return isSetField(40729);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod get(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod getUnderlyingPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurvePeriod() {
    return isSetField(40730);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit get(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit getUnderlyingPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurveUnit() {
    return isSetField(40731);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier get(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier getUnderlyingPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateMultiplier() {
    return isSetField(40732);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread get(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread getUnderlyingPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpread() {
    return isSetField(40733);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType getUnderlyingPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40734);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment get(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment getUnderlyingPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateTreatment() {
    return isSetField(40735);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate get(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate getUnderlyingPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CapRate() {
    return isSetField(40736);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate get(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate getUnderlyingPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2FloorRate() {
    return isSetField(40737);
  }
}
