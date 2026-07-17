/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40090, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisions value) {
    setField(value);
  }

  public quickfix.field.NoProvisions get(quickfix.field.NoProvisions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisions getNoProvisions() throws FieldNotFound {
    return get(new quickfix.field.NoProvisions());
  }

  public boolean isSet(quickfix.field.NoProvisions field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisions() {
    return isSetField(40090);
  }

public static class NoProvisions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40091, 40092, 40093, 40957, 40095, 40096, 40097, 42707, 42708, 40098, 40099, 40100, 40114, 40115, 40116, 40953, 40118, 40119, 40120, 40121, 40122, 40123, 40954, 40142, 40125, 40126, 40127, 40128, 40129, 40130, 40131, 40132, 40133, 40134, 40135, 40136, 40137, 40138, 40139, 40140, 40141, 40145, 40146, 40955, 40148, 40149, 40150, 40151, 40152, 40153, 40154, 40155, 40156, 40956, 40158, 40159, 40160, 40161, 40162, 40101, 40102, 40103, 40104, 40105, 40106, 40107, 40163, 40952, 40165, 40166, 40167, 40168, 40169, 40170, 40171, 40108, 40109, 40110, 40111, 40112, 41406, 40113, 40986, 40987, 40174, 0};

  public NoProvisions() {
    super(40090, 40091, ORDER);
  }

  public void set(quickfix.field.ProvisionType value) {
    setField(value);
  }

  public quickfix.field.ProvisionType get(quickfix.field.ProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionType getProvisionType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionType());
  }

  public boolean isSet(quickfix.field.ProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionType() {
    return isSetField(40091);
  }

  public void set(quickfix.field.ProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateUnadjusted get(quickfix.field.ProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateUnadjusted getProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateUnadjusted() {
    return isSetField(40092);
  }

  public void set(quickfix.field.ProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessDayConvention get(quickfix.field.ProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessDayConvention getProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessDayConvention() {
    return isSetField(40093);
  }

  public void set(quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp getProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionDateBusinessCenters get(quickfix.field.NoProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionDateBusinessCenters getNoProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionDateBusinessCenters() {
    return isSetField(40957);
  }

public static class NoProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40094, 0};

  public NoProvisionDateBusinessCenters() {
    super(40957, 40094, ORDER);
  }

  public void set(quickfix.field.ProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessCenter get(quickfix.field.ProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessCenter getProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessCenter() {
    return isSetField(40094);
  }
}

  public void set(quickfix.field.ProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateAdjusted get(quickfix.field.ProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateAdjusted getProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateAdjusted() {
    return isSetField(40095);
  }

  public void set(quickfix.field.ProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateTenorPeriod get(quickfix.field.ProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateTenorPeriod getProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateTenorPeriod() {
    return isSetField(40096);
  }

  public void set(quickfix.field.ProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateTenorUnit get(quickfix.field.ProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateTenorUnit getProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.ProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateTenorUnit() {
    return isSetField(40097);
  }

  public void set(quickfix.field.ProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.ProvisionBreakFeeElection get(quickfix.field.ProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionBreakFeeElection getProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.ProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.ProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetProvisionBreakFeeElection() {
    return isSetField(42707);
  }

  public void set(quickfix.field.ProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.ProvisionBreakFeeRate get(quickfix.field.ProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionBreakFeeRate getProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.ProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionBreakFeeRate() {
    return isSetField(42708);
  }

  public void set(quickfix.field.ProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.ProvisionCalculationAgent get(quickfix.field.ProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCalculationAgent getProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.ProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCalculationAgent() {
    return isSetField(40098);
  }

  public void set(quickfix.field.ProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionSinglePartyBuyerSide get(quickfix.field.ProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionSinglePartyBuyerSide getProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.ProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionSinglePartyBuyerSide() {
    return isSetField(40099);
  }

  public void set(quickfix.field.ProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionSinglePartySellerSide get(quickfix.field.ProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionSinglePartySellerSide getProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.ProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionSinglePartySellerSide() {
    return isSetField(40100);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDates get(quickfix.fixlatest.component.ProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDates getProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseDates get(quickfix.fixlatest.component.ProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseDates getProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDate get(quickfix.fixlatest.component.ProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDate getProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate getProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.ProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStyle get(quickfix.field.ProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStyle getProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStyle() {
    return isSetField(40101);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMultipleNotional get(quickfix.field.ProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMultipleNotional getProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMultipleNotional() {
    return isSetField(40102);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMinimumNotional get(quickfix.field.ProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMinimumNotional getProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMinimumNotional() {
    return isSetField(40103);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMaximumNotional get(quickfix.field.ProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMaximumNotional getProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMaximumNotional() {
    return isSetField(40104);
  }

  public void set(quickfix.field.ProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionMinimumNumber get(quickfix.field.ProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionMinimumNumber getProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.ProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionMinimumNumber() {
    return isSetField(40105);
  }

  public void set(quickfix.field.ProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionMaximumNumber get(quickfix.field.ProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionMaximumNumber getProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.ProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionMaximumNumber() {
    return isSetField(40106);
  }

  public void set(quickfix.field.ProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseConfirmation get(quickfix.field.ProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseConfirmation getProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseConfirmation() {
    return isSetField(40107);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.ProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDates getProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.ProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlMethod get(quickfix.field.ProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlMethod getProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlMethod() {
    return isSetField(40108);
  }

  public void set(quickfix.field.ProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlCurrency get(quickfix.field.ProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlCurrency getProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlCurrency() {
    return isSetField(40109);
  }

  public void set(quickfix.field.ProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlCurrency2 get(quickfix.field.ProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlCurrency2 getProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlCurrency2() {
    return isSetField(40110);
  }

  public void set(quickfix.field.ProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlQuoteType get(quickfix.field.ProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlQuoteType getProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlQuoteType() {
    return isSetField(40111);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.ProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlQuoteSource getProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.ProvisionText value) {
    setField(value);
  }

  public quickfix.field.ProvisionText get(quickfix.field.ProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionText getProvisionText() throws FieldNotFound {
    return get(new quickfix.field.ProvisionText());
  }

  public boolean isSet(quickfix.field.ProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetProvisionText() {
    return isSetField(40113);
  }

  public void set(quickfix.field.EncodedProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedProvisionTextLen get(quickfix.field.EncodedProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedProvisionTextLen getEncodedProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedProvisionTextLen() {
    return isSetField(40986);
  }

  public void set(quickfix.field.EncodedProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedProvisionText get(quickfix.field.EncodedProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedProvisionText getEncodedProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedProvisionText() {
    return isSetField(40987);
  }

  public void set(quickfix.fixlatest.component.ProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionParties get(quickfix.fixlatest.component.ProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionParties getProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionParties());
  }

  public void set(quickfix.field.NoProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartyIDs get(quickfix.field.NoProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartyIDs getNoProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartyIDs() {
    return isSetField(40174);
  }

public static class NoProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40175, 40176, 40177, 2385, 40178, 0};

  public NoProvisionPartyIDs() {
    super(40174, 40175, ORDER);
  }

  public void set(quickfix.field.ProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyID get(quickfix.field.ProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyID getProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyID());
  }

  public boolean isSet(quickfix.field.ProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyID() {
    return isSetField(40175);
  }

  public void set(quickfix.field.ProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyIDSource get(quickfix.field.ProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyIDSource getProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.ProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyIDSource() {
    return isSetField(40176);
  }

  public void set(quickfix.field.ProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRole get(quickfix.field.ProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRole getProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRole() {
    return isSetField(40177);
  }

  public void set(quickfix.field.ProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRoleQualifier get(quickfix.field.ProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRoleQualifier getProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRoleQualifier() {
    return isSetField(2385);
  }

  public void set(quickfix.fixlatest.component.ProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp get(quickfix.fixlatest.component.ProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp getProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartySubIDs get(quickfix.field.NoProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartySubIDs getNoProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartySubIDs() {
    return isSetField(40178);
  }

public static class NoProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40179, 40180, 0};

  public NoProvisionPartySubIDs() {
    super(40178, 40179, ORDER);
  }

  public void set(quickfix.field.ProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubID get(quickfix.field.ProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubID getProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubID() {
    return isSetField(40179);
  }

  public void set(quickfix.field.ProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubIDType get(quickfix.field.ProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubIDType getProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubIDType() {
    return isSetField(40180);
  }
}
}
}

  public void set(quickfix.field.ProvisionType value) {
    setField(value);
  }

  public quickfix.field.ProvisionType get(quickfix.field.ProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionType getProvisionType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionType());
  }

  public boolean isSet(quickfix.field.ProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionType() {
    return isSetField(40091);
  }

  public void set(quickfix.field.ProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateUnadjusted get(quickfix.field.ProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateUnadjusted getProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateUnadjusted() {
    return isSetField(40092);
  }

  public void set(quickfix.field.ProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessDayConvention get(quickfix.field.ProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessDayConvention getProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessDayConvention() {
    return isSetField(40093);
  }

  public void set(quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp getProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionDateBusinessCenters get(quickfix.field.NoProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionDateBusinessCenters getNoProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionDateBusinessCenters() {
    return isSetField(40957);
  }

public static class NoProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40094, 0};

  public NoProvisionDateBusinessCenters() {
    super(40957, 40094, ORDER);
  }

  public void set(quickfix.field.ProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessCenter get(quickfix.field.ProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessCenter getProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessCenter() {
    return isSetField(40094);
  }
}

  public void set(quickfix.field.ProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateAdjusted get(quickfix.field.ProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateAdjusted getProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateAdjusted() {
    return isSetField(40095);
  }

  public void set(quickfix.field.ProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateTenorPeriod get(quickfix.field.ProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateTenorPeriod getProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateTenorPeriod() {
    return isSetField(40096);
  }

  public void set(quickfix.field.ProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateTenorUnit get(quickfix.field.ProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateTenorUnit getProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.ProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateTenorUnit() {
    return isSetField(40097);
  }

  public void set(quickfix.field.ProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.ProvisionBreakFeeElection get(quickfix.field.ProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionBreakFeeElection getProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.ProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.ProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetProvisionBreakFeeElection() {
    return isSetField(42707);
  }

  public void set(quickfix.field.ProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.ProvisionBreakFeeRate get(quickfix.field.ProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionBreakFeeRate getProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.ProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionBreakFeeRate() {
    return isSetField(42708);
  }

  public void set(quickfix.field.ProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.ProvisionCalculationAgent get(quickfix.field.ProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCalculationAgent getProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.ProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCalculationAgent() {
    return isSetField(40098);
  }

  public void set(quickfix.field.ProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionSinglePartyBuyerSide get(quickfix.field.ProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionSinglePartyBuyerSide getProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.ProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionSinglePartyBuyerSide() {
    return isSetField(40099);
  }

  public void set(quickfix.field.ProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionSinglePartySellerSide get(quickfix.field.ProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionSinglePartySellerSide getProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.ProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionSinglePartySellerSide() {
    return isSetField(40100);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDates get(quickfix.fixlatest.component.ProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDates getProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseDates get(quickfix.fixlatest.component.ProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseDates getProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDate get(quickfix.fixlatest.component.ProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDate getProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate getProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.ProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStyle get(quickfix.field.ProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStyle getProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStyle() {
    return isSetField(40101);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMultipleNotional get(quickfix.field.ProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMultipleNotional getProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMultipleNotional() {
    return isSetField(40102);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMinimumNotional get(quickfix.field.ProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMinimumNotional getProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMinimumNotional() {
    return isSetField(40103);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMaximumNotional get(quickfix.field.ProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMaximumNotional getProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMaximumNotional() {
    return isSetField(40104);
  }

  public void set(quickfix.field.ProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionMinimumNumber get(quickfix.field.ProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionMinimumNumber getProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.ProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionMinimumNumber() {
    return isSetField(40105);
  }

  public void set(quickfix.field.ProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionMaximumNumber get(quickfix.field.ProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionMaximumNumber getProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.ProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionMaximumNumber() {
    return isSetField(40106);
  }

  public void set(quickfix.field.ProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseConfirmation get(quickfix.field.ProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseConfirmation getProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseConfirmation() {
    return isSetField(40107);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.ProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDates getProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.ProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlMethod get(quickfix.field.ProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlMethod getProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlMethod() {
    return isSetField(40108);
  }

  public void set(quickfix.field.ProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlCurrency get(quickfix.field.ProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlCurrency getProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlCurrency() {
    return isSetField(40109);
  }

  public void set(quickfix.field.ProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlCurrency2 get(quickfix.field.ProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlCurrency2 getProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlCurrency2() {
    return isSetField(40110);
  }

  public void set(quickfix.field.ProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlQuoteType get(quickfix.field.ProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlQuoteType getProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlQuoteType() {
    return isSetField(40111);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.ProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlQuoteSource getProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.ProvisionText value) {
    setField(value);
  }

  public quickfix.field.ProvisionText get(quickfix.field.ProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionText getProvisionText() throws FieldNotFound {
    return get(new quickfix.field.ProvisionText());
  }

  public boolean isSet(quickfix.field.ProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetProvisionText() {
    return isSetField(40113);
  }

  public void set(quickfix.field.EncodedProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedProvisionTextLen get(quickfix.field.EncodedProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedProvisionTextLen getEncodedProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedProvisionTextLen() {
    return isSetField(40986);
  }

  public void set(quickfix.field.EncodedProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedProvisionText get(quickfix.field.EncodedProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedProvisionText getEncodedProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedProvisionText() {
    return isSetField(40987);
  }

  public void set(quickfix.fixlatest.component.ProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionParties get(quickfix.fixlatest.component.ProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionParties getProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionParties());
  }

  public void set(quickfix.field.NoProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartyIDs get(quickfix.field.NoProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartyIDs getNoProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartyIDs() {
    return isSetField(40174);
  }

public static class NoProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40175, 40176, 40177, 2385, 40178, 0};

  public NoProvisionPartyIDs() {
    super(40174, 40175, ORDER);
  }

  public void set(quickfix.field.ProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyID get(quickfix.field.ProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyID getProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyID());
  }

  public boolean isSet(quickfix.field.ProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyID() {
    return isSetField(40175);
  }

  public void set(quickfix.field.ProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyIDSource get(quickfix.field.ProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyIDSource getProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.ProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyIDSource() {
    return isSetField(40176);
  }

  public void set(quickfix.field.ProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRole get(quickfix.field.ProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRole getProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRole() {
    return isSetField(40177);
  }

  public void set(quickfix.field.ProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRoleQualifier get(quickfix.field.ProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRoleQualifier getProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRoleQualifier() {
    return isSetField(2385);
  }

  public void set(quickfix.fixlatest.component.ProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp get(quickfix.fixlatest.component.ProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp getProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartySubIDs get(quickfix.field.NoProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartySubIDs getNoProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartySubIDs() {
    return isSetField(40178);
  }

public static class NoProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40179, 40180, 0};

  public NoProvisionPartySubIDs() {
    super(40178, 40179, ORDER);
  }

  public void set(quickfix.field.ProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubID get(quickfix.field.ProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubID getProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubID() {
    return isSetField(40179);
  }

  public void set(quickfix.field.ProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubIDType get(quickfix.field.ProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubIDType getProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubIDType() {
    return isSetField(40180);
  }
}
}
}
