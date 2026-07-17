/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40872, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStubGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubs get(quickfix.field.NoPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubs getNoPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubs() {
    return isSetField(40872);
  }

public static class NoPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40873, 40874, 42698, 42699, 42705, 42700, 42701, 42702, 42703, 42704, 42689, 42690, 42696, 42691, 42692, 42693, 42694, 42695, 40875, 40876, 40877, 40878, 40879, 40880, 40881, 40882, 40883, 40884, 40885, 40886, 40887, 40888, 40889, 40890, 40891, 40892, 40893, 40894, 40895, 40896, 40897, 40898, 40899, 40900, 40901, 0};

  public NoPaymentStubs() {
    super(40872, 40873, ORDER);
  }

  public void set(quickfix.field.PaymentStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubType get(quickfix.field.PaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubType getPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubType());
  }

  public boolean isSet(quickfix.field.PaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubType() {
    return isSetField(40873);
  }

  public void set(quickfix.field.PaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStubLength get(quickfix.field.PaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubLength getPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubLength());
  }

  public boolean isSet(quickfix.field.PaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubLength() {
    return isSetField(40874);
  }

  public void set(quickfix.fixlatest.component.PaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubStartDate get(quickfix.fixlatest.component.PaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubStartDate getPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.PaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubEndDate get(quickfix.fixlatest.component.PaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubEndDate getPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubEndDate());
  }

  public void set(quickfix.field.PaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubRate get(quickfix.field.PaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubRate getPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubRate());
  }

  public boolean isSet(quickfix.field.PaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubRate() {
    return isSetField(40875);
  }

  public void set(quickfix.field.PaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedAmount get(quickfix.field.PaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedAmount getPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedAmount() {
    return isSetField(40876);
  }

  public void set(quickfix.field.PaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedCurrency get(quickfix.field.PaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedCurrency getPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedCurrency() {
    return isSetField(40877);
  }

  public void set(quickfix.field.PaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex get(quickfix.field.PaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex getPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex() {
    return isSetField(40878);
  }

  public void set(quickfix.field.PaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexSource get(quickfix.field.PaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexSource getPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexSource() {
    return isSetField(40879);
  }

  public void set(quickfix.field.PaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurvePeriod get(quickfix.field.PaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurvePeriod getPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurvePeriod() {
    return isSetField(40880);
  }

  public void set(quickfix.field.PaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurveUnit get(quickfix.field.PaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurveUnit getPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurveUnit() {
    return isSetField(40881);
  }

  public void set(quickfix.field.PaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateMultiplier get(quickfix.field.PaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateMultiplier getPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateMultiplier() {
    return isSetField(40882);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpread get(quickfix.field.PaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpread getPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpread() {
    return isSetField(40883);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType get(quickfix.field.PaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType getPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40884);
  }

  public void set(quickfix.field.PaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateTreatment get(quickfix.field.PaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateTreatment getPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateTreatment() {
    return isSetField(40885);
  }

  public void set(quickfix.field.PaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRate get(quickfix.field.PaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRate getPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRate() {
    return isSetField(40886);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide get(quickfix.field.PaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide getPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateBuySide() {
    return isSetField(40887);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide get(quickfix.field.PaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide getPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateSellSide() {
    return isSetField(40888);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRate get(quickfix.field.PaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRate getPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRate() {
    return isSetField(40889);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide get(quickfix.field.PaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide getPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateBuySide() {
    return isSetField(40890);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide get(quickfix.field.PaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide getPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateSellSide() {
    return isSetField(40891);
  }

  public void set(quickfix.field.PaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2 get(quickfix.field.PaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2 getPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2() {
    return isSetField(40892);
  }

  public void set(quickfix.field.PaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2Source get(quickfix.field.PaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2Source getPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2Source() {
    return isSetField(40893);
  }

  public void set(quickfix.field.PaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod get(quickfix.field.PaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod getPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurvePeriod() {
    return isSetField(40894);
  }

  public void set(quickfix.field.PaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurveUnit get(quickfix.field.PaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurveUnit getPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurveUnit() {
    return isSetField(40895);
  }

  public void set(quickfix.field.PaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier get(quickfix.field.PaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier getPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateMultiplier() {
    return isSetField(40896);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpread get(quickfix.field.PaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpread getPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpread() {
    return isSetField(40897);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType get(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType getPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40898);
  }

  public void set(quickfix.field.PaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateTreatment get(quickfix.field.PaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateTreatment getPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateTreatment() {
    return isSetField(40899);
  }

  public void set(quickfix.field.PaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CapRate get(quickfix.field.PaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CapRate getPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CapRate() {
    return isSetField(40900);
  }

  public void set(quickfix.field.PaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2FloorRate get(quickfix.field.PaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2FloorRate getPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2FloorRate() {
    return isSetField(40901);
  }
}

  public void set(quickfix.field.PaymentStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubType get(quickfix.field.PaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubType getPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubType());
  }

  public boolean isSet(quickfix.field.PaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubType() {
    return isSetField(40873);
  }

  public void set(quickfix.field.PaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStubLength get(quickfix.field.PaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubLength getPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubLength());
  }

  public boolean isSet(quickfix.field.PaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubLength() {
    return isSetField(40874);
  }

  public void set(quickfix.fixlatest.component.PaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubStartDate get(quickfix.fixlatest.component.PaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubStartDate getPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.PaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubEndDate get(quickfix.fixlatest.component.PaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubEndDate getPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubEndDate());
  }

  public void set(quickfix.field.PaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubRate get(quickfix.field.PaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubRate getPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubRate());
  }

  public boolean isSet(quickfix.field.PaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubRate() {
    return isSetField(40875);
  }

  public void set(quickfix.field.PaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedAmount get(quickfix.field.PaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedAmount getPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedAmount() {
    return isSetField(40876);
  }

  public void set(quickfix.field.PaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedCurrency get(quickfix.field.PaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedCurrency getPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedCurrency() {
    return isSetField(40877);
  }

  public void set(quickfix.field.PaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex get(quickfix.field.PaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex getPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex() {
    return isSetField(40878);
  }

  public void set(quickfix.field.PaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexSource get(quickfix.field.PaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexSource getPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexSource() {
    return isSetField(40879);
  }

  public void set(quickfix.field.PaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurvePeriod get(quickfix.field.PaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurvePeriod getPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurvePeriod() {
    return isSetField(40880);
  }

  public void set(quickfix.field.PaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurveUnit get(quickfix.field.PaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurveUnit getPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurveUnit() {
    return isSetField(40881);
  }

  public void set(quickfix.field.PaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateMultiplier get(quickfix.field.PaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateMultiplier getPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateMultiplier() {
    return isSetField(40882);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpread get(quickfix.field.PaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpread getPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpread() {
    return isSetField(40883);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType get(quickfix.field.PaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType getPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40884);
  }

  public void set(quickfix.field.PaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateTreatment get(quickfix.field.PaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateTreatment getPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateTreatment() {
    return isSetField(40885);
  }

  public void set(quickfix.field.PaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRate get(quickfix.field.PaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRate getPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRate() {
    return isSetField(40886);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide get(quickfix.field.PaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide getPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateBuySide() {
    return isSetField(40887);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide get(quickfix.field.PaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide getPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateSellSide() {
    return isSetField(40888);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRate get(quickfix.field.PaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRate getPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRate() {
    return isSetField(40889);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide get(quickfix.field.PaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide getPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateBuySide() {
    return isSetField(40890);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide get(quickfix.field.PaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide getPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateSellSide() {
    return isSetField(40891);
  }

  public void set(quickfix.field.PaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2 get(quickfix.field.PaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2 getPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2() {
    return isSetField(40892);
  }

  public void set(quickfix.field.PaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2Source get(quickfix.field.PaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2Source getPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2Source() {
    return isSetField(40893);
  }

  public void set(quickfix.field.PaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod get(quickfix.field.PaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod getPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurvePeriod() {
    return isSetField(40894);
  }

  public void set(quickfix.field.PaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurveUnit get(quickfix.field.PaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurveUnit getPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurveUnit() {
    return isSetField(40895);
  }

  public void set(quickfix.field.PaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier get(quickfix.field.PaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier getPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateMultiplier() {
    return isSetField(40896);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpread get(quickfix.field.PaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpread getPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpread() {
    return isSetField(40897);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType get(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType getPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40898);
  }

  public void set(quickfix.field.PaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateTreatment get(quickfix.field.PaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateTreatment getPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateTreatment() {
    return isSetField(40899);
  }

  public void set(quickfix.field.PaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CapRate get(quickfix.field.PaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CapRate getPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CapRate() {
    return isSetField(40900);
  }

  public void set(quickfix.field.PaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2FloorRate get(quickfix.field.PaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2FloorRate getPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2FloorRate() {
    return isSetField(40901);
  }
}
