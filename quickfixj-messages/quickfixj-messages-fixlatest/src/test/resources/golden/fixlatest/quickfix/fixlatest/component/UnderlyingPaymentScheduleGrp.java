/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40664, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentSchedules get(quickfix.field.NoUnderlyingPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentSchedules getNoUnderlyingPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentSchedules() {
    return isSetField(40664);
  }

public static class NoUnderlyingPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40665, 41881, 41882, 40666, 40667, 40668, 40669, 40670, 40671, 40672, 40673, 40674, 40675, 41883, 41884, 41885, 41886, 40676, 40677, 40678, 40679, 41887, 41888, 41889, 41890, 40680, 40681, 40682, 40683, 40684, 40685, 40704, 40686, 40687, 40688, 40689, 40966, 40691, 40692, 40693, 41891, 41892, 40694, 41878, 41893, 41894, 41895, 41896, 40695, 40696, 40697, 40698, 40967, 40700, 40701, 40702, 40703, 0};

  public NoUnderlyingPaymentSchedules() {
    super(40664, 40665, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleType get(quickfix.field.UnderlyingPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleType getUnderlyingPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleType() {
    return isSetField(40665);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXID get(quickfix.field.UnderlyingPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXID getUnderlyingPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXID() {
    return isSetField(41881);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef get(quickfix.field.UnderlyingPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef getUnderlyingPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXIDRef() {
    return isSetField(41882);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType get(quickfix.field.UnderlyingPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType getUnderlyingPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStubType() {
    return isSetField(40666);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted getUnderlyingPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStartDateUnadjusted() {
    return isSetField(40667);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted getUnderlyingPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleEndDateUnadjusted() {
    return isSetField(40668);
  }

  public void set(quickfix.field.UnderlyingPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide get(quickfix.field.UnderlyingPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide getUnderlyingPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentSchedulePaySide() {
    return isSetField(40669);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide get(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide getUnderlyingPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReceiveSide() {
    return isSetField(40670);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional get(quickfix.field.UnderlyingPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional getUnderlyingPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleNotional() {
    return isSetField(40671);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency get(quickfix.field.UnderlyingPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency getUnderlyingPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleCurrency() {
    return isSetField(40672);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRate get(quickfix.field.UnderlyingPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRate getUnderlyingPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRate() {
    return isSetField(40673);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier get(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier getUnderlyingPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateMultiplier() {
    return isSetField(40674);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread get(quickfix.field.UnderlyingPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread getUnderlyingPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpread() {
    return isSetField(40675);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency get(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency getUnderlyingPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateCurrency() {
    return isSetField(41883);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure getUnderlyingPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41884);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor get(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor getUnderlyingPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateConversionFactor() {
    return isSetField(41885);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType getUnderlyingPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadType() {
    return isSetField(41886);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType getUnderlyingPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadPositionType() {
    return isSetField(40676);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment get(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment getUnderlyingPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateTreatment() {
    return isSetField(40677);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount get(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount getUnderlyingPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedAmount() {
    return isSetField(40678);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency get(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency getUnderlyingPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedCurrency() {
    return isSetField(40679);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice getUnderlyingPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPrice() {
    return isSetField(41887);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency getUnderlyingPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41888);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure getUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41889);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure getUnderlyingPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41890);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod getUnderlyingPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40680);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit getUnderlyingPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyUnit() {
    return isSetField(40681);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue get(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue getUnderlyingPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetValue() {
    return isSetField(40682);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate get(quickfix.field.UnderlyingPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate getUnderlyingPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRate() {
    return isSetField(40683);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate get(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate getUnderlyingPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetRate() {
    return isSetField(40684);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo get(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo getUnderlyingPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRelativeTo() {
    return isSetField(40685);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp getUnderlyingPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources get(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources getNoUnderlyingPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleRateSources() {
    return isSetField(40704);
  }

public static class NoUnderlyingPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40705, 40706, 40707, 0};

  public NoUnderlyingPaymentScheduleRateSources() {
    super(40704, 40705, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted getUnderlyingPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40686);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight get(quickfix.field.UnderlyingPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight getUnderlyingPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleWeight() {
    return isSetField(40687);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo getUnderlyingPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40688);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn getUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() {
    return isSetField(40689);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp getUnderlyingPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters getNoUnderlyingPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40966);
  }

public static class NoUnderlyingPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40690, 0};

  public NoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    super(40966, 40690, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod getUnderlyingPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40691);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit getUnderlyingPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40692);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType getUnderlyingPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40693);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution get(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution getUnderlyingPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayDistribution() {
    return isSetField(41891);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount get(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount getUnderlyingPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayCount() {
    return isSetField(41892);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted getUnderlyingPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateAdjusted() {
    return isSetField(40694);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp getUnderlyingPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays get(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays getNoUnderlyingPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDays() {
    return isSetField(41878);
  }

public static class NoUnderlyingPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41879, 41880, 0};

  public NoUnderlyingPaymentScheduleFixingDays() {
    super(41878, 41879, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod getUnderlyingPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagPeriod() {
    return isSetField(41893);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit get(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit getUnderlyingPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagUnit() {
    return isSetField(41894);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41895);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41896);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime get(quickfix.field.UnderlyingPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime getUnderlyingPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTime() {
    return isSetField(40695);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter getUnderlyingPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40696);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo getUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40697);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention getUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40698);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp getUnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters getNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40967);
  }

public static class NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40699, 0};

  public NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40967, 40699, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter getUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40699);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod getUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40700);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit getUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40701);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType getUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40702);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted getUnderlyingPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40703);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleType get(quickfix.field.UnderlyingPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleType getUnderlyingPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleType() {
    return isSetField(40665);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXID get(quickfix.field.UnderlyingPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXID getUnderlyingPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXID() {
    return isSetField(41881);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef get(quickfix.field.UnderlyingPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef getUnderlyingPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXIDRef() {
    return isSetField(41882);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType get(quickfix.field.UnderlyingPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType getUnderlyingPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStubType() {
    return isSetField(40666);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted getUnderlyingPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStartDateUnadjusted() {
    return isSetField(40667);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted getUnderlyingPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleEndDateUnadjusted() {
    return isSetField(40668);
  }

  public void set(quickfix.field.UnderlyingPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide get(quickfix.field.UnderlyingPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide getUnderlyingPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentSchedulePaySide() {
    return isSetField(40669);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide get(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide getUnderlyingPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReceiveSide() {
    return isSetField(40670);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional get(quickfix.field.UnderlyingPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional getUnderlyingPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleNotional() {
    return isSetField(40671);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency get(quickfix.field.UnderlyingPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency getUnderlyingPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleCurrency() {
    return isSetField(40672);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRate get(quickfix.field.UnderlyingPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRate getUnderlyingPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRate() {
    return isSetField(40673);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier get(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier getUnderlyingPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateMultiplier() {
    return isSetField(40674);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread get(quickfix.field.UnderlyingPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread getUnderlyingPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpread() {
    return isSetField(40675);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency get(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency getUnderlyingPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateCurrency() {
    return isSetField(41883);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure getUnderlyingPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41884);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor get(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor getUnderlyingPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateConversionFactor() {
    return isSetField(41885);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType getUnderlyingPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadType() {
    return isSetField(41886);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType getUnderlyingPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadPositionType() {
    return isSetField(40676);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment get(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment getUnderlyingPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateTreatment() {
    return isSetField(40677);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount get(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount getUnderlyingPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedAmount() {
    return isSetField(40678);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency get(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency getUnderlyingPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedCurrency() {
    return isSetField(40679);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice getUnderlyingPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPrice() {
    return isSetField(41887);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency getUnderlyingPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41888);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure getUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41889);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure getUnderlyingPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41890);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod getUnderlyingPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40680);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit getUnderlyingPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyUnit() {
    return isSetField(40681);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue get(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue getUnderlyingPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetValue() {
    return isSetField(40682);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate get(quickfix.field.UnderlyingPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate getUnderlyingPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRate() {
    return isSetField(40683);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate get(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate getUnderlyingPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetRate() {
    return isSetField(40684);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo get(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo getUnderlyingPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRelativeTo() {
    return isSetField(40685);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp getUnderlyingPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources get(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources getNoUnderlyingPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleRateSources() {
    return isSetField(40704);
  }

public static class NoUnderlyingPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40705, 40706, 40707, 0};

  public NoUnderlyingPaymentScheduleRateSources() {
    super(40704, 40705, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted getUnderlyingPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40686);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight get(quickfix.field.UnderlyingPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight getUnderlyingPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleWeight() {
    return isSetField(40687);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo getUnderlyingPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40688);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn getUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() {
    return isSetField(40689);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp getUnderlyingPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters getNoUnderlyingPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40966);
  }

public static class NoUnderlyingPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40690, 0};

  public NoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    super(40966, 40690, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod getUnderlyingPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40691);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit getUnderlyingPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40692);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType getUnderlyingPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40693);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution get(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution getUnderlyingPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayDistribution() {
    return isSetField(41891);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount get(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount getUnderlyingPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayCount() {
    return isSetField(41892);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted getUnderlyingPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateAdjusted() {
    return isSetField(40694);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp getUnderlyingPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays get(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays getNoUnderlyingPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDays() {
    return isSetField(41878);
  }

public static class NoUnderlyingPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41879, 41880, 0};

  public NoUnderlyingPaymentScheduleFixingDays() {
    super(41878, 41879, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod getUnderlyingPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagPeriod() {
    return isSetField(41893);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit get(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit getUnderlyingPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagUnit() {
    return isSetField(41894);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41895);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41896);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime get(quickfix.field.UnderlyingPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime getUnderlyingPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTime() {
    return isSetField(40695);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter getUnderlyingPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40696);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo getUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40697);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention getUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40698);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp getUnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters getNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40967);
  }

public static class NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40699, 0};

  public NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40967, 40699, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter getUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40699);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod getUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40700);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit getUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40701);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType getUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40702);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted getUnderlyingPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40703);
  }
}
