/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40828, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSchedules get(quickfix.field.NoPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSchedules getNoPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSchedules() {
    return isSetField(40828);
  }

public static class NoPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40829, 41164, 41165, 40830, 40831, 40832, 40833, 40834, 40835, 40836, 40837, 40838, 40839, 41166, 41167, 41168, 41169, 40840, 40841, 40842, 40843, 41170, 41171, 41172, 41173, 40844, 40845, 40846, 40847, 40848, 40849, 40868, 40850, 40851, 40852, 40853, 40977, 40855, 40856, 40857, 41174, 41175, 40858, 41161, 41176, 41177, 41178, 41179, 40859, 40860, 40861, 40862, 40945, 40864, 40865, 40866, 40867, 0};

  public NoPaymentSchedules() {
    super(40828, 40829, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleType get(quickfix.field.PaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleType getPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleType() {
    return isSetField(40829);
  }

  public void set(quickfix.field.PaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXID get(quickfix.field.PaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXID getPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXID() {
    return isSetField(41164);
  }

  public void set(quickfix.field.PaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXIDRef get(quickfix.field.PaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXIDRef getPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXIDRef() {
    return isSetField(41165);
  }

  public void set(quickfix.field.PaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStubType get(quickfix.field.PaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStubType getPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStubType() {
    return isSetField(40830);
  }

  public void set(quickfix.field.PaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted get(quickfix.field.PaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted getPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStartDateUnadjusted() {
    return isSetField(40831);
  }

  public void set(quickfix.field.PaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted get(quickfix.field.PaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted getPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleEndDateUnadjusted() {
    return isSetField(40832);
  }

  public void set(quickfix.field.PaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentSchedulePaySide get(quickfix.field.PaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSchedulePaySide getPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.PaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSchedulePaySide() {
    return isSetField(40833);
  }

  public void set(quickfix.field.PaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReceiveSide get(quickfix.field.PaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReceiveSide getPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReceiveSide() {
    return isSetField(40834);
  }

  public void set(quickfix.field.PaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleNotional get(quickfix.field.PaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleNotional getPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.PaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleNotional() {
    return isSetField(40835);
  }

  public void set(quickfix.field.PaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleCurrency get(quickfix.field.PaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleCurrency getPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleCurrency() {
    return isSetField(40836);
  }

  public void set(quickfix.field.PaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRate get(quickfix.field.PaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRate getPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRate() {
    return isSetField(40837);
  }

  public void set(quickfix.field.PaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateMultiplier get(quickfix.field.PaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateMultiplier getPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateMultiplier() {
    return isSetField(40838);
  }

  public void set(quickfix.field.PaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpread get(quickfix.field.PaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpread getPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpread() {
    return isSetField(40839);
  }

  public void set(quickfix.field.PaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateCurrency get(quickfix.field.PaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateCurrency getPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateCurrency() {
    return isSetField(41166);
  }

  public void set(quickfix.field.PaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure get(quickfix.field.PaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure getPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41167);
  }

  public void set(quickfix.field.PaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateConversionFactor get(quickfix.field.PaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateConversionFactor getPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateConversionFactor() {
    return isSetField(41168);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadType get(quickfix.field.PaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadType getPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadType() {
    return isSetField(41169);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType get(quickfix.field.PaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType getPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadPositionType() {
    return isSetField(40840);
  }

  public void set(quickfix.field.PaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateTreatment get(quickfix.field.PaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateTreatment getPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateTreatment() {
    return isSetField(40841);
  }

  public void set(quickfix.field.PaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedAmount get(quickfix.field.PaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedAmount getPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedAmount() {
    return isSetField(40842);
  }

  public void set(quickfix.field.PaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedCurrency get(quickfix.field.PaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedCurrency getPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedCurrency() {
    return isSetField(40843);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice get(quickfix.field.PaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice getPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPrice() {
    return isSetField(41170);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency getPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41171);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure getPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41172);
  }

  public void set(quickfix.field.PaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure get(quickfix.field.PaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure getPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41173);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod get(quickfix.field.PaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod getPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40844);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit get(quickfix.field.PaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit getPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyUnit() {
    return isSetField(40845);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetValue get(quickfix.field.PaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetValue getPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetValue() {
    return isSetField(40846);
  }

  public void set(quickfix.field.PaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRate get(quickfix.field.PaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRate getPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRate() {
    return isSetField(40847);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetRate get(quickfix.field.PaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetRate getPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetRate() {
    return isSetField(40848);
  }

  public void set(quickfix.field.PaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRelativeTo get(quickfix.field.PaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRelativeTo getPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRelativeTo() {
    return isSetField(40849);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp getPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleRateSources get(quickfix.field.NoPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleRateSources getNoPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleRateSources() {
    return isSetField(40868);
  }

public static class NoPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40869, 40870, 40871, 0};

  public NoPaymentScheduleRateSources() {
    super(40868, 40869, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted get(quickfix.field.PaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted getPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40850);
  }

  public void set(quickfix.field.PaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleWeight get(quickfix.field.PaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleWeight getPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.PaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleWeight() {
    return isSetField(40851);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo get(quickfix.field.PaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo getPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40852);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention getPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40853);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp getPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters getNoPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40977);
  }

public static class NoPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40854, 0};

  public NoPaymentScheduleFixingDateBusinessCenters() {
    super(40977, 40854, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod getPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40855);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit get(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit getPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40856);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType get(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType getPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40857);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution get(quickfix.field.PaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution getPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayDistribution() {
    return isSetField(41174);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayCount get(quickfix.field.PaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayCount getPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayCount() {
    return isSetField(41175);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted get(quickfix.field.PaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted getPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateAdjusted() {
    return isSetField(40858);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp getPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDays get(quickfix.field.NoPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDays getNoPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDays() {
    return isSetField(41161);
  }

public static class NoPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41162, 41163, 0};

  public NoPaymentScheduleFixingDays() {
    super(41161, 41162, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod get(quickfix.field.PaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod getPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagPeriod() {
    return isSetField(41176);
  }

  public void set(quickfix.field.PaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagUnit get(quickfix.field.PaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagUnit getPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagUnit() {
    return isSetField(41177);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod getPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41178);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit getPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41179);
  }

  public void set(quickfix.field.PaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTime get(quickfix.field.PaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTime getPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTime() {
    return isSetField(40859);
  }

  public void set(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter get(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter getPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40860);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo getPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40861);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention getPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40862);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp getPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters getNoPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40945);
  }

public static class NoPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40863, 0};

  public NoPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40945, 40863, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod getPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40864);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit getPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40865);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType getPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40866);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted getPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40867);
  }
}

  public void set(quickfix.field.PaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleType get(quickfix.field.PaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleType getPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleType() {
    return isSetField(40829);
  }

  public void set(quickfix.field.PaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXID get(quickfix.field.PaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXID getPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXID() {
    return isSetField(41164);
  }

  public void set(quickfix.field.PaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXIDRef get(quickfix.field.PaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXIDRef getPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXIDRef() {
    return isSetField(41165);
  }

  public void set(quickfix.field.PaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStubType get(quickfix.field.PaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStubType getPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStubType() {
    return isSetField(40830);
  }

  public void set(quickfix.field.PaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted get(quickfix.field.PaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted getPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStartDateUnadjusted() {
    return isSetField(40831);
  }

  public void set(quickfix.field.PaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted get(quickfix.field.PaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted getPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleEndDateUnadjusted() {
    return isSetField(40832);
  }

  public void set(quickfix.field.PaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentSchedulePaySide get(quickfix.field.PaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSchedulePaySide getPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.PaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSchedulePaySide() {
    return isSetField(40833);
  }

  public void set(quickfix.field.PaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReceiveSide get(quickfix.field.PaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReceiveSide getPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReceiveSide() {
    return isSetField(40834);
  }

  public void set(quickfix.field.PaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleNotional get(quickfix.field.PaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleNotional getPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.PaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleNotional() {
    return isSetField(40835);
  }

  public void set(quickfix.field.PaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleCurrency get(quickfix.field.PaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleCurrency getPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleCurrency() {
    return isSetField(40836);
  }

  public void set(quickfix.field.PaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRate get(quickfix.field.PaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRate getPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRate() {
    return isSetField(40837);
  }

  public void set(quickfix.field.PaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateMultiplier get(quickfix.field.PaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateMultiplier getPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateMultiplier() {
    return isSetField(40838);
  }

  public void set(quickfix.field.PaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpread get(quickfix.field.PaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpread getPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpread() {
    return isSetField(40839);
  }

  public void set(quickfix.field.PaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateCurrency get(quickfix.field.PaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateCurrency getPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateCurrency() {
    return isSetField(41166);
  }

  public void set(quickfix.field.PaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure get(quickfix.field.PaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure getPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41167);
  }

  public void set(quickfix.field.PaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateConversionFactor get(quickfix.field.PaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateConversionFactor getPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateConversionFactor() {
    return isSetField(41168);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadType get(quickfix.field.PaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadType getPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadType() {
    return isSetField(41169);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType get(quickfix.field.PaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType getPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadPositionType() {
    return isSetField(40840);
  }

  public void set(quickfix.field.PaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateTreatment get(quickfix.field.PaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateTreatment getPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateTreatment() {
    return isSetField(40841);
  }

  public void set(quickfix.field.PaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedAmount get(quickfix.field.PaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedAmount getPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedAmount() {
    return isSetField(40842);
  }

  public void set(quickfix.field.PaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedCurrency get(quickfix.field.PaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedCurrency getPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedCurrency() {
    return isSetField(40843);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice get(quickfix.field.PaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice getPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPrice() {
    return isSetField(41170);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency getPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41171);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure getPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41172);
  }

  public void set(quickfix.field.PaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure get(quickfix.field.PaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure getPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41173);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod get(quickfix.field.PaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod getPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40844);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit get(quickfix.field.PaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit getPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyUnit() {
    return isSetField(40845);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetValue get(quickfix.field.PaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetValue getPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetValue() {
    return isSetField(40846);
  }

  public void set(quickfix.field.PaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRate get(quickfix.field.PaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRate getPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRate() {
    return isSetField(40847);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetRate get(quickfix.field.PaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetRate getPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetRate() {
    return isSetField(40848);
  }

  public void set(quickfix.field.PaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRelativeTo get(quickfix.field.PaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRelativeTo getPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRelativeTo() {
    return isSetField(40849);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp getPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleRateSources get(quickfix.field.NoPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleRateSources getNoPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleRateSources() {
    return isSetField(40868);
  }

public static class NoPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40869, 40870, 40871, 0};

  public NoPaymentScheduleRateSources() {
    super(40868, 40869, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted get(quickfix.field.PaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted getPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40850);
  }

  public void set(quickfix.field.PaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleWeight get(quickfix.field.PaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleWeight getPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.PaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleWeight() {
    return isSetField(40851);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo get(quickfix.field.PaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo getPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40852);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention getPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40853);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp getPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters getNoPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40977);
  }

public static class NoPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40854, 0};

  public NoPaymentScheduleFixingDateBusinessCenters() {
    super(40977, 40854, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod getPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40855);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit get(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit getPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40856);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType get(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType getPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40857);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution get(quickfix.field.PaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution getPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayDistribution() {
    return isSetField(41174);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayCount get(quickfix.field.PaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayCount getPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayCount() {
    return isSetField(41175);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted get(quickfix.field.PaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted getPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateAdjusted() {
    return isSetField(40858);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp getPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDays get(quickfix.field.NoPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDays getNoPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDays() {
    return isSetField(41161);
  }

public static class NoPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41162, 41163, 0};

  public NoPaymentScheduleFixingDays() {
    super(41161, 41162, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod get(quickfix.field.PaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod getPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagPeriod() {
    return isSetField(41176);
  }

  public void set(quickfix.field.PaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagUnit get(quickfix.field.PaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagUnit getPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagUnit() {
    return isSetField(41177);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod getPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41178);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit getPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41179);
  }

  public void set(quickfix.field.PaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTime get(quickfix.field.PaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTime getPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTime() {
    return isSetField(40859);
  }

  public void set(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter get(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter getPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40860);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo getPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40861);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention getPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40862);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp getPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters getNoPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40945);
  }

public static class NoPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40863, 0};

  public NoPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40945, 40863, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod getPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40864);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit getPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40865);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType getPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40866);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted getPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40867);
  }
}
