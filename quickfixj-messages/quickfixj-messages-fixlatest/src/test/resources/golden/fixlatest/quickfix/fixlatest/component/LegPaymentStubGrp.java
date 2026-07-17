/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40418, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStubGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStubs get(quickfix.field.NoLegPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStubs getNoLegPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStubs() {
    return isSetField(40418);
  }

public static class NoLegPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40419, 40420, 42497, 42498, 42504, 42499, 42500, 42501, 42502, 42503, 42488, 42489, 42495, 42490, 42491, 42492, 42493, 42494, 40421, 40422, 40423, 40424, 40425, 40426, 40427, 40428, 40429, 40430, 40431, 40432, 40433, 40434, 40435, 40436, 40437, 40438, 40439, 40440, 40441, 40442, 40443, 40444, 40445, 40446, 40447, 0};

  public NoLegPaymentStubs() {
    super(40418, 40419, ORDER);
  }

  public void set(quickfix.field.LegPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubType get(quickfix.field.LegPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubType getLegPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubType() {
    return isSetField(40419);
  }

  public void set(quickfix.field.LegPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubLength get(quickfix.field.LegPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubLength getLegPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubLength() {
    return isSetField(40420);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate get(quickfix.fixlatest.component.LegPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate getLegPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate get(quickfix.fixlatest.component.LegPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate getLegPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubEndDate());
  }

  public void set(quickfix.field.LegPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubRate get(quickfix.field.LegPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubRate getLegPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubRate() {
    return isSetField(40421);
  }

  public void set(quickfix.field.LegPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedAmount get(quickfix.field.LegPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedAmount getLegPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedAmount() {
    return isSetField(40422);
  }

  public void set(quickfix.field.LegPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedCurrency get(quickfix.field.LegPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedCurrency getLegPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedCurrency() {
    return isSetField(40423);
  }

  public void set(quickfix.field.LegPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex get(quickfix.field.LegPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex getLegPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex() {
    return isSetField(40424);
  }

  public void set(quickfix.field.LegPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexSource get(quickfix.field.LegPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexSource getLegPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexSource() {
    return isSetField(40425);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod get(quickfix.field.LegPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod getLegPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurvePeriod() {
    return isSetField(40426);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit get(quickfix.field.LegPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit getLegPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurveUnit() {
    return isSetField(40427);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier get(quickfix.field.LegPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier getLegPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateMultiplier() {
    return isSetField(40428);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpread get(quickfix.field.LegPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpread getLegPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpread() {
    return isSetField(40429);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType get(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType getLegPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40430);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment get(quickfix.field.LegPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment getLegPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateTreatment() {
    return isSetField(40431);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRate get(quickfix.field.LegPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRate getLegPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRate() {
    return isSetField(40432);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide get(quickfix.field.LegPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide getLegPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateBuySide() {
    return isSetField(40433);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide get(quickfix.field.LegPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide getLegPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateSellSide() {
    return isSetField(40434);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRate get(quickfix.field.LegPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRate getLegPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRate() {
    return isSetField(40435);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide get(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide getLegPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateBuySide() {
    return isSetField(40436);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide get(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide getLegPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateSellSide() {
    return isSetField(40437);
  }

  public void set(quickfix.field.LegPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2 get(quickfix.field.LegPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2 getLegPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2() {
    return isSetField(40438);
  }

  public void set(quickfix.field.LegPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2Source get(quickfix.field.LegPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2Source getLegPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2Source() {
    return isSetField(40439);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod get(quickfix.field.LegPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod getLegPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurvePeriod() {
    return isSetField(40440);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit get(quickfix.field.LegPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit getLegPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurveUnit() {
    return isSetField(40441);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier get(quickfix.field.LegPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier getLegPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateMultiplier() {
    return isSetField(40442);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread get(quickfix.field.LegPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread getLegPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpread() {
    return isSetField(40443);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType get(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType getLegPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40444);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment get(quickfix.field.LegPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment getLegPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateTreatment() {
    return isSetField(40445);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CapRate get(quickfix.field.LegPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CapRate getLegPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CapRate() {
    return isSetField(40446);
  }

  public void set(quickfix.field.LegPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate get(quickfix.field.LegPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate getLegPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2FloorRate() {
    return isSetField(40447);
  }
}

  public void set(quickfix.field.LegPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubType get(quickfix.field.LegPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubType getLegPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubType() {
    return isSetField(40419);
  }

  public void set(quickfix.field.LegPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubLength get(quickfix.field.LegPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubLength getLegPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubLength() {
    return isSetField(40420);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate get(quickfix.fixlatest.component.LegPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate getLegPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate get(quickfix.fixlatest.component.LegPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate getLegPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubEndDate());
  }

  public void set(quickfix.field.LegPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubRate get(quickfix.field.LegPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubRate getLegPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubRate() {
    return isSetField(40421);
  }

  public void set(quickfix.field.LegPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedAmount get(quickfix.field.LegPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedAmount getLegPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedAmount() {
    return isSetField(40422);
  }

  public void set(quickfix.field.LegPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedCurrency get(quickfix.field.LegPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedCurrency getLegPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedCurrency() {
    return isSetField(40423);
  }

  public void set(quickfix.field.LegPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex get(quickfix.field.LegPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex getLegPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex() {
    return isSetField(40424);
  }

  public void set(quickfix.field.LegPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexSource get(quickfix.field.LegPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexSource getLegPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexSource() {
    return isSetField(40425);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod get(quickfix.field.LegPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod getLegPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurvePeriod() {
    return isSetField(40426);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit get(quickfix.field.LegPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit getLegPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurveUnit() {
    return isSetField(40427);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier get(quickfix.field.LegPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier getLegPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateMultiplier() {
    return isSetField(40428);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpread get(quickfix.field.LegPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpread getLegPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpread() {
    return isSetField(40429);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType get(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType getLegPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40430);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment get(quickfix.field.LegPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment getLegPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateTreatment() {
    return isSetField(40431);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRate get(quickfix.field.LegPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRate getLegPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRate() {
    return isSetField(40432);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide get(quickfix.field.LegPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide getLegPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateBuySide() {
    return isSetField(40433);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide get(quickfix.field.LegPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide getLegPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateSellSide() {
    return isSetField(40434);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRate get(quickfix.field.LegPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRate getLegPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRate() {
    return isSetField(40435);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide get(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide getLegPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateBuySide() {
    return isSetField(40436);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide get(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide getLegPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateSellSide() {
    return isSetField(40437);
  }

  public void set(quickfix.field.LegPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2 get(quickfix.field.LegPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2 getLegPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2() {
    return isSetField(40438);
  }

  public void set(quickfix.field.LegPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2Source get(quickfix.field.LegPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2Source getLegPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2Source() {
    return isSetField(40439);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod get(quickfix.field.LegPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod getLegPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurvePeriod() {
    return isSetField(40440);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit get(quickfix.field.LegPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit getLegPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurveUnit() {
    return isSetField(40441);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier get(quickfix.field.LegPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier getLegPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateMultiplier() {
    return isSetField(40442);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread get(quickfix.field.LegPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread getLegPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpread() {
    return isSetField(40443);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType get(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType getLegPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40444);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment get(quickfix.field.LegPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment getLegPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateTreatment() {
    return isSetField(40445);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CapRate get(quickfix.field.LegPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CapRate getLegPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CapRate() {
    return isSetField(40446);
  }

  public void set(quickfix.field.LegPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate get(quickfix.field.LegPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate getLegPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2FloorRate() {
    return isSetField(40447);
  }
}
