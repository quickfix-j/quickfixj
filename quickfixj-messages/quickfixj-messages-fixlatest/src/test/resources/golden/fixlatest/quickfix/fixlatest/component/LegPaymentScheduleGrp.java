/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40374, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentSchedules get(quickfix.field.NoLegPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentSchedules getNoLegPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoLegPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentSchedules() {
    return isSetField(40374);
  }

public static class NoLegPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40375, 41533, 41534, 40376, 40377, 40378, 40379, 40380, 40381, 40382, 40383, 40384, 40385, 41535, 41536, 41537, 41538, 40386, 40387, 40388, 40389, 41539, 41540, 41541, 41542, 40390, 40391, 40392, 40393, 40394, 40395, 40414, 40396, 40397, 40398, 40399, 40927, 40401, 40402, 40403, 41543, 41544, 40404, 41530, 41545, 41546, 41547, 41548, 40405, 40406, 40407, 40408, 40928, 40410, 40411, 40412, 40413, 0};

  public NoLegPaymentSchedules() {
    super(40374, 40375, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleType get(quickfix.field.LegPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleType getLegPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleType() {
    return isSetField(40375);
  }

  public void set(quickfix.field.LegPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXID get(quickfix.field.LegPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXID getLegPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXID() {
    return isSetField(41533);
  }

  public void set(quickfix.field.LegPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXIDRef get(quickfix.field.LegPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXIDRef getLegPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXIDRef() {
    return isSetField(41534);
  }

  public void set(quickfix.field.LegPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStubType get(quickfix.field.LegPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStubType getLegPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStubType() {
    return isSetField(40376);
  }

  public void set(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted get(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted getLegPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStartDateUnadjusted() {
    return isSetField(40377);
  }

  public void set(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted get(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted getLegPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleEndDateUnadjusted() {
    return isSetField(40378);
  }

  public void set(quickfix.field.LegPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentSchedulePaySide get(quickfix.field.LegPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentSchedulePaySide getLegPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.LegPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentSchedulePaySide() {
    return isSetField(40379);
  }

  public void set(quickfix.field.LegPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReceiveSide get(quickfix.field.LegPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReceiveSide getLegPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReceiveSide() {
    return isSetField(40380);
  }

  public void set(quickfix.field.LegPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleNotional get(quickfix.field.LegPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleNotional getLegPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleNotional() {
    return isSetField(40381);
  }

  public void set(quickfix.field.LegPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleCurrency get(quickfix.field.LegPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleCurrency getLegPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleCurrency() {
    return isSetField(40382);
  }

  public void set(quickfix.field.LegPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRate get(quickfix.field.LegPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRate getLegPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRate() {
    return isSetField(40383);
  }

  public void set(quickfix.field.LegPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier get(quickfix.field.LegPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier getLegPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateMultiplier() {
    return isSetField(40384);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpread get(quickfix.field.LegPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpread getLegPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpread() {
    return isSetField(40385);
  }

  public void set(quickfix.field.LegPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateCurrency get(quickfix.field.LegPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateCurrency getLegPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateCurrency() {
    return isSetField(41535);
  }

  public void set(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure get(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure getLegPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41536);
  }

  public void set(quickfix.field.LegPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor get(quickfix.field.LegPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor getLegPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateConversionFactor() {
    return isSetField(41537);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType get(quickfix.field.LegPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType getLegPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadType() {
    return isSetField(41538);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType get(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType getLegPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadPositionType() {
    return isSetField(40386);
  }

  public void set(quickfix.field.LegPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateTreatment get(quickfix.field.LegPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateTreatment getLegPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateTreatment() {
    return isSetField(40387);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedAmount get(quickfix.field.LegPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedAmount getLegPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedAmount() {
    return isSetField(40388);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency get(quickfix.field.LegPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency getLegPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedCurrency() {
    return isSetField(40389);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice get(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice getLegPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPrice() {
    return isSetField(41539);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency getLegPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41540);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure getLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41541);
  }

  public void set(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure get(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure getLegPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41542);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod get(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod getLegPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40390);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit get(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit getLegPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyUnit() {
    return isSetField(40391);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue get(quickfix.field.LegPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue getLegPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetValue() {
    return isSetField(40392);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRate get(quickfix.field.LegPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRate getLegPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRate() {
    return isSetField(40393);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate get(quickfix.field.LegPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate getLegPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetRate() {
    return isSetField(40394);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo get(quickfix.field.LegPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo getLegPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRelativeTo() {
    return isSetField(40395);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp getLegPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleRateSources get(quickfix.field.NoLegPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleRateSources getNoLegPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleRateSources() {
    return isSetField(40414);
  }

public static class NoLegPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40415, 40416, 40417, 0};

  public NoLegPaymentScheduleRateSources() {
    super(40414, 40415, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted get(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted getLegPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40396);
  }

  public void set(quickfix.field.LegPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleWeight get(quickfix.field.LegPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleWeight getLegPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleWeight() {
    return isSetField(40397);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo get(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo getLegPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40398);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention getLegPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40399);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp getLegPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters getNoLegPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40927);
  }

public static class NoLegPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40400, 0};

  public NoLegPaymentScheduleFixingDateBusinessCenters() {
    super(40927, 40400, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod getLegPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40401);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit getLegPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40402);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType get(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType getLegPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40403);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution get(quickfix.field.LegPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution getLegPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayDistribution() {
    return isSetField(41543);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount get(quickfix.field.LegPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount getLegPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayCount() {
    return isSetField(41544);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted get(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted getLegPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateAdjusted() {
    return isSetField(40404);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp getLegPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays get(quickfix.field.NoLegPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays getNoLegPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDays() {
    return isSetField(41530);
  }

public static class NoLegPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41531, 41532, 0};

  public NoLegPaymentScheduleFixingDays() {
    super(41530, 41531, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod get(quickfix.field.LegPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod getLegPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagPeriod() {
    return isSetField(41545);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit get(quickfix.field.LegPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit getLegPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagUnit() {
    return isSetField(41546);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod getLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41547);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit getLegPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41548);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTime get(quickfix.field.LegPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTime getLegPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTime() {
    return isSetField(40405);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter getLegPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40406);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo getLegPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40407);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention getLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40408);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp getLegPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters getNoLegPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40928);
  }

public static class NoLegPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40409, 0};

  public NoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40928, 40409, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter getLegPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40409);
  }
}

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod getLegPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40410);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit getLegPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40411);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType getLegPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40412);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted getLegPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40413);
  }
}

  public void set(quickfix.field.LegPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleType get(quickfix.field.LegPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleType getLegPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleType() {
    return isSetField(40375);
  }

  public void set(quickfix.field.LegPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXID get(quickfix.field.LegPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXID getLegPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXID() {
    return isSetField(41533);
  }

  public void set(quickfix.field.LegPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXIDRef get(quickfix.field.LegPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXIDRef getLegPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXIDRef() {
    return isSetField(41534);
  }

  public void set(quickfix.field.LegPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStubType get(quickfix.field.LegPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStubType getLegPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStubType() {
    return isSetField(40376);
  }

  public void set(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted get(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted getLegPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStartDateUnadjusted() {
    return isSetField(40377);
  }

  public void set(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted get(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted getLegPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleEndDateUnadjusted() {
    return isSetField(40378);
  }

  public void set(quickfix.field.LegPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentSchedulePaySide get(quickfix.field.LegPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentSchedulePaySide getLegPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.LegPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentSchedulePaySide() {
    return isSetField(40379);
  }

  public void set(quickfix.field.LegPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReceiveSide get(quickfix.field.LegPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReceiveSide getLegPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReceiveSide() {
    return isSetField(40380);
  }

  public void set(quickfix.field.LegPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleNotional get(quickfix.field.LegPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleNotional getLegPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleNotional() {
    return isSetField(40381);
  }

  public void set(quickfix.field.LegPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleCurrency get(quickfix.field.LegPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleCurrency getLegPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleCurrency() {
    return isSetField(40382);
  }

  public void set(quickfix.field.LegPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRate get(quickfix.field.LegPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRate getLegPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRate() {
    return isSetField(40383);
  }

  public void set(quickfix.field.LegPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier get(quickfix.field.LegPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier getLegPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateMultiplier() {
    return isSetField(40384);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpread get(quickfix.field.LegPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpread getLegPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpread() {
    return isSetField(40385);
  }

  public void set(quickfix.field.LegPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateCurrency get(quickfix.field.LegPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateCurrency getLegPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateCurrency() {
    return isSetField(41535);
  }

  public void set(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure get(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure getLegPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41536);
  }

  public void set(quickfix.field.LegPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor get(quickfix.field.LegPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor getLegPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateConversionFactor() {
    return isSetField(41537);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType get(quickfix.field.LegPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType getLegPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadType() {
    return isSetField(41538);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType get(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType getLegPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadPositionType() {
    return isSetField(40386);
  }

  public void set(quickfix.field.LegPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateTreatment get(quickfix.field.LegPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateTreatment getLegPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateTreatment() {
    return isSetField(40387);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedAmount get(quickfix.field.LegPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedAmount getLegPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedAmount() {
    return isSetField(40388);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency get(quickfix.field.LegPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency getLegPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedCurrency() {
    return isSetField(40389);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice get(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice getLegPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPrice() {
    return isSetField(41539);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency getLegPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41540);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure getLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41541);
  }

  public void set(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure get(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure getLegPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41542);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod get(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod getLegPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40390);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit get(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit getLegPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyUnit() {
    return isSetField(40391);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue get(quickfix.field.LegPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue getLegPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetValue() {
    return isSetField(40392);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRate get(quickfix.field.LegPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRate getLegPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRate() {
    return isSetField(40393);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate get(quickfix.field.LegPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate getLegPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetRate() {
    return isSetField(40394);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo get(quickfix.field.LegPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo getLegPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRelativeTo() {
    return isSetField(40395);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp getLegPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleRateSources get(quickfix.field.NoLegPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleRateSources getNoLegPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleRateSources() {
    return isSetField(40414);
  }

public static class NoLegPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40415, 40416, 40417, 0};

  public NoLegPaymentScheduleRateSources() {
    super(40414, 40415, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted get(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted getLegPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40396);
  }

  public void set(quickfix.field.LegPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleWeight get(quickfix.field.LegPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleWeight getLegPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleWeight() {
    return isSetField(40397);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo get(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo getLegPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40398);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention getLegPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40399);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp getLegPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters getNoLegPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40927);
  }

public static class NoLegPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40400, 0};

  public NoLegPaymentScheduleFixingDateBusinessCenters() {
    super(40927, 40400, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod getLegPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40401);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit getLegPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40402);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType get(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType getLegPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40403);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution get(quickfix.field.LegPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution getLegPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayDistribution() {
    return isSetField(41543);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount get(quickfix.field.LegPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount getLegPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayCount() {
    return isSetField(41544);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted get(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted getLegPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateAdjusted() {
    return isSetField(40404);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp getLegPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays get(quickfix.field.NoLegPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays getNoLegPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDays() {
    return isSetField(41530);
  }

public static class NoLegPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41531, 41532, 0};

  public NoLegPaymentScheduleFixingDays() {
    super(41530, 41531, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod get(quickfix.field.LegPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod getLegPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagPeriod() {
    return isSetField(41545);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit get(quickfix.field.LegPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit getLegPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagUnit() {
    return isSetField(41546);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod getLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41547);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit getLegPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41548);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTime get(quickfix.field.LegPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTime getLegPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTime() {
    return isSetField(40405);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter getLegPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40406);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo getLegPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40407);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention getLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40408);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp getLegPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters getNoLegPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40928);
  }

public static class NoLegPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40409, 0};

  public NoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40928, 40409, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter getLegPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40409);
  }
}

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod getLegPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40410);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit getLegPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40411);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType getLegPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40412);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted getLegPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40413);
  }
}
