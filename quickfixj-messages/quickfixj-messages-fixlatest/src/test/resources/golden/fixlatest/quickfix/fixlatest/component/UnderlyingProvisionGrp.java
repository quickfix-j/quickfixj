/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42149, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisions value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisions get(quickfix.field.NoUnderlyingProvisions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisions getNoUnderlyingProvisions() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisions());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisions field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisions() {
    return isSetField(42149);
  }

public static class NoUnderlyingProvisions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42150, 42151, 42152, 42190, 42153, 42154, 42155, 43002, 43003, 42156, 42157, 42158, 42104, 42105, 42106, 42182, 42107, 42108, 42109, 42110, 42111, 42115, 42184, 42112, 42116, 42117, 42118, 42119, 42120, 42121, 42122, 42123, 42124, 42125, 42126, 42127, 42128, 42129, 42130, 42131, 42132, 42133, 42134, 42186, 42135, 42136, 42137, 42138, 42139, 42140, 42141, 42142, 42143, 42188, 42144, 42145, 42146, 42147, 42148, 42159, 42160, 42161, 42162, 42163, 42164, 42165, 42092, 42180, 42093, 42094, 42095, 42096, 42097, 42098, 42099, 42166, 42167, 42168, 42169, 42102, 42103, 42170, 42171, 42172, 42173, 0};

  public NoUnderlyingProvisions() {
    super(42149, 42150, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionType get(quickfix.field.UnderlyingProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionType getUnderlyingProvisionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionType() {
    return isSetField(42150);
  }

  public void set(quickfix.field.UnderlyingProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateUnadjusted get(quickfix.field.UnderlyingProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateUnadjusted getUnderlyingProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateUnadjusted() {
    return isSetField(42151);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessDayConvention getUnderlyingProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessDayConvention() {
    return isSetField(42152);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp getUnderlyingProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters getNoUnderlyingProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionDateBusinessCenters() {
    return isSetField(42190);
  }

public static class NoUnderlyingProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42191, 0};

  public NoUnderlyingProvisionDateBusinessCenters() {
    super(42190, 42191, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter get(quickfix.field.UnderlyingProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter getUnderlyingProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessCenter() {
    return isSetField(42191);
  }
}

  public void set(quickfix.field.UnderlyingProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateAdjusted get(quickfix.field.UnderlyingProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateAdjusted getUnderlyingProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateAdjusted() {
    return isSetField(42153);
  }

  public void set(quickfix.field.UnderlyingProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateTenorPeriod get(quickfix.field.UnderlyingProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateTenorPeriod getUnderlyingProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateTenorPeriod() {
    return isSetField(42154);
  }

  public void set(quickfix.field.UnderlyingProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateTenorUnit get(quickfix.field.UnderlyingProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateTenorUnit getUnderlyingProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateTenorUnit() {
    return isSetField(42155);
  }

  public void set(quickfix.field.UnderlyingProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionBreakFeeElection get(quickfix.field.UnderlyingProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionBreakFeeElection getUnderlyingProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionBreakFeeElection() {
    return isSetField(43002);
  }

  public void set(quickfix.field.UnderlyingProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionBreakFeeRate get(quickfix.field.UnderlyingProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionBreakFeeRate getUnderlyingProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionBreakFeeRate() {
    return isSetField(43003);
  }

  public void set(quickfix.field.UnderlyingProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCalculationAgent get(quickfix.field.UnderlyingProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCalculationAgent getUnderlyingProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCalculationAgent() {
    return isSetField(42156);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide get(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide getUnderlyingProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionSinglePartyBuyerSide() {
    return isSetField(42157);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide get(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide getUnderlyingProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionSinglePartySellerSide() {
    return isSetField(42158);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates getUnderlyingProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates get(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates getUnderlyingProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate get(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate getUnderlyingProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate getUnderlyingProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStyle get(quickfix.field.UnderlyingProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStyle getUnderlyingProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStyle() {
    return isSetField(42159);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional getUnderlyingProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMultipleNotional() {
    return isSetField(42160);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional getUnderlyingProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMinimumNotional() {
    return isSetField(42161);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional getUnderlyingProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMaximumNotional() {
    return isSetField(42162);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionMinimumNumber get(quickfix.field.UnderlyingProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionMinimumNumber getUnderlyingProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionMinimumNumber() {
    return isSetField(42163);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionMaximumNumber get(quickfix.field.UnderlyingProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionMaximumNumber getUnderlyingProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionMaximumNumber() {
    return isSetField(42164);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseConfirmation get(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseConfirmation getUnderlyingProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseConfirmation() {
    return isSetField(42165);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates getUnderlyingProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlMethod get(quickfix.field.UnderlyingProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlMethod getUnderlyingProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlMethod() {
    return isSetField(42166);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency get(quickfix.field.UnderlyingProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency getUnderlyingProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlCurrency() {
    return isSetField(42167);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency2 get(quickfix.field.UnderlyingProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency2 getUnderlyingProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlCurrency2() {
    return isSetField(42168);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteType get(quickfix.field.UnderlyingProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteType getUnderlyingProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlQuoteType() {
    return isSetField(42169);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource getUnderlyingProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.UnderlyingProvisionText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionText get(quickfix.field.UnderlyingProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionText getUnderlyingProvisionText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionText());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionText() {
    return isSetField(42170);
  }

  public void set(quickfix.field.EncodedUnderlyingProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingProvisionTextLen get(quickfix.field.EncodedUnderlyingProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingProvisionTextLen getEncodedUnderlyingProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingProvisionTextLen() {
    return isSetField(42171);
  }

  public void set(quickfix.field.EncodedUnderlyingProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingProvisionText get(quickfix.field.EncodedUnderlyingProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingProvisionText getEncodedUnderlyingProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingProvisionText() {
    return isSetField(42172);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionParties get(quickfix.fixlatest.component.UnderlyingProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionParties getUnderlyingProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionParties());
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs get(quickfix.field.NoUnderlyingProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs getNoUnderlyingProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartyIDs() {
    return isSetField(42173);
  }

public static class NoUnderlyingProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42174, 42175, 42176, 40918, 42177, 0};

  public NoUnderlyingProvisionPartyIDs() {
    super(42173, 42174, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyID get(quickfix.field.UnderlyingProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyID getUnderlyingProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyID() {
    return isSetField(42174);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource get(quickfix.field.UnderlyingProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource getUnderlyingProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyIDSource() {
    return isSetField(42175);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRole get(quickfix.field.UnderlyingProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRole getUnderlyingProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRole() {
    return isSetField(42176);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier get(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier getUnderlyingProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRoleQualifier() {
    return isSetField(40918);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp get(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp getUnderlyingProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs get(quickfix.field.NoUnderlyingProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs getNoUnderlyingProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartySubIDs() {
    return isSetField(42177);
  }

public static class NoUnderlyingProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42178, 42179, 0};

  public NoUnderlyingProvisionPartySubIDs() {
    super(42177, 42178, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubID get(quickfix.field.UnderlyingProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubID getUnderlyingProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubID() {
    return isSetField(42178);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType get(quickfix.field.UnderlyingProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType getUnderlyingProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubIDType() {
    return isSetField(42179);
  }
}
}
}

  public void set(quickfix.field.UnderlyingProvisionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionType get(quickfix.field.UnderlyingProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionType getUnderlyingProvisionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionType() {
    return isSetField(42150);
  }

  public void set(quickfix.field.UnderlyingProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateUnadjusted get(quickfix.field.UnderlyingProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateUnadjusted getUnderlyingProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateUnadjusted() {
    return isSetField(42151);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessDayConvention getUnderlyingProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessDayConvention() {
    return isSetField(42152);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp getUnderlyingProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters getNoUnderlyingProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionDateBusinessCenters() {
    return isSetField(42190);
  }

public static class NoUnderlyingProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42191, 0};

  public NoUnderlyingProvisionDateBusinessCenters() {
    super(42190, 42191, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter get(quickfix.field.UnderlyingProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter getUnderlyingProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessCenter() {
    return isSetField(42191);
  }
}

  public void set(quickfix.field.UnderlyingProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateAdjusted get(quickfix.field.UnderlyingProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateAdjusted getUnderlyingProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateAdjusted() {
    return isSetField(42153);
  }

  public void set(quickfix.field.UnderlyingProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateTenorPeriod get(quickfix.field.UnderlyingProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateTenorPeriod getUnderlyingProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateTenorPeriod() {
    return isSetField(42154);
  }

  public void set(quickfix.field.UnderlyingProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateTenorUnit get(quickfix.field.UnderlyingProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateTenorUnit getUnderlyingProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateTenorUnit() {
    return isSetField(42155);
  }

  public void set(quickfix.field.UnderlyingProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionBreakFeeElection get(quickfix.field.UnderlyingProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionBreakFeeElection getUnderlyingProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionBreakFeeElection() {
    return isSetField(43002);
  }

  public void set(quickfix.field.UnderlyingProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionBreakFeeRate get(quickfix.field.UnderlyingProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionBreakFeeRate getUnderlyingProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionBreakFeeRate() {
    return isSetField(43003);
  }

  public void set(quickfix.field.UnderlyingProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCalculationAgent get(quickfix.field.UnderlyingProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCalculationAgent getUnderlyingProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCalculationAgent() {
    return isSetField(42156);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide get(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide getUnderlyingProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionSinglePartyBuyerSide() {
    return isSetField(42157);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide get(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide getUnderlyingProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionSinglePartySellerSide() {
    return isSetField(42158);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates getUnderlyingProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates get(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates getUnderlyingProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate get(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate getUnderlyingProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate getUnderlyingProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStyle get(quickfix.field.UnderlyingProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStyle getUnderlyingProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStyle() {
    return isSetField(42159);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional getUnderlyingProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMultipleNotional() {
    return isSetField(42160);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional getUnderlyingProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMinimumNotional() {
    return isSetField(42161);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional getUnderlyingProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMaximumNotional() {
    return isSetField(42162);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionMinimumNumber get(quickfix.field.UnderlyingProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionMinimumNumber getUnderlyingProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionMinimumNumber() {
    return isSetField(42163);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionMaximumNumber get(quickfix.field.UnderlyingProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionMaximumNumber getUnderlyingProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionMaximumNumber() {
    return isSetField(42164);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseConfirmation get(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseConfirmation getUnderlyingProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseConfirmation() {
    return isSetField(42165);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates getUnderlyingProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlMethod get(quickfix.field.UnderlyingProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlMethod getUnderlyingProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlMethod() {
    return isSetField(42166);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency get(quickfix.field.UnderlyingProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency getUnderlyingProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlCurrency() {
    return isSetField(42167);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency2 get(quickfix.field.UnderlyingProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency2 getUnderlyingProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlCurrency2() {
    return isSetField(42168);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteType get(quickfix.field.UnderlyingProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteType getUnderlyingProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlQuoteType() {
    return isSetField(42169);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource getUnderlyingProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.UnderlyingProvisionText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionText get(quickfix.field.UnderlyingProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionText getUnderlyingProvisionText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionText());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionText() {
    return isSetField(42170);
  }

  public void set(quickfix.field.EncodedUnderlyingProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingProvisionTextLen get(quickfix.field.EncodedUnderlyingProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingProvisionTextLen getEncodedUnderlyingProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingProvisionTextLen() {
    return isSetField(42171);
  }

  public void set(quickfix.field.EncodedUnderlyingProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingProvisionText get(quickfix.field.EncodedUnderlyingProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingProvisionText getEncodedUnderlyingProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingProvisionText() {
    return isSetField(42172);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionParties get(quickfix.fixlatest.component.UnderlyingProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionParties getUnderlyingProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionParties());
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs get(quickfix.field.NoUnderlyingProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs getNoUnderlyingProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartyIDs() {
    return isSetField(42173);
  }

public static class NoUnderlyingProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42174, 42175, 42176, 40918, 42177, 0};

  public NoUnderlyingProvisionPartyIDs() {
    super(42173, 42174, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyID get(quickfix.field.UnderlyingProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyID getUnderlyingProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyID() {
    return isSetField(42174);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource get(quickfix.field.UnderlyingProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource getUnderlyingProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyIDSource() {
    return isSetField(42175);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRole get(quickfix.field.UnderlyingProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRole getUnderlyingProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRole() {
    return isSetField(42176);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier get(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier getUnderlyingProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRoleQualifier() {
    return isSetField(40918);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp get(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp getUnderlyingProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs get(quickfix.field.NoUnderlyingProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs getNoUnderlyingProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartySubIDs() {
    return isSetField(42177);
  }

public static class NoUnderlyingProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42178, 42179, 0};

  public NoUnderlyingProvisionPartySubIDs() {
    super(42177, 42178, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubID get(quickfix.field.UnderlyingProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubID getUnderlyingProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubID() {
    return isSetField(42178);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType get(quickfix.field.UnderlyingProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType getUnderlyingProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubIDType() {
    return isSetField(42179);
  }
}
}
}
