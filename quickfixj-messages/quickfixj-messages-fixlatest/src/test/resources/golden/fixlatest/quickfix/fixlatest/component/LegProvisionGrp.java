/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40448, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisions value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisions get(quickfix.field.NoLegProvisions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisions getNoLegProvisions() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisions());
  }

  public boolean isSet(quickfix.field.NoLegProvisions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisions() {
    return isSetField(40448);
  }

public static class NoLegProvisions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40449, 40450, 40451, 40939, 40453, 40454, 40455, 42506, 42507, 40456, 40457, 40458, 40524, 40525, 40526, 40935, 40528, 40529, 40530, 40531, 40532, 40476, 40936, 40495, 40478, 40479, 40480, 40481, 40482, 40483, 40484, 40485, 40486, 40487, 40488, 40489, 40490, 40491, 40492, 40493, 40494, 40498, 40499, 40937, 40501, 40502, 40503, 40504, 40505, 40506, 40507, 40508, 40509, 40938, 40511, 40512, 40513, 40514, 40515, 40459, 40460, 40461, 40462, 40463, 40464, 40465, 40516, 40934, 40518, 40519, 40520, 40521, 40522, 40523, 40473, 40466, 40467, 40468, 40469, 40470, 41407, 40472, 40980, 40981, 40533, 0};

  public NoLegProvisions() {
    super(40448, 40449, ORDER);
  }

  public void set(quickfix.field.LegProvisionType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionType get(quickfix.field.LegProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionType getLegProvisionType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionType());
  }

  public boolean isSet(quickfix.field.LegProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionType() {
    return isSetField(40449);
  }

  public void set(quickfix.field.LegProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateUnadjusted get(quickfix.field.LegProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateUnadjusted getLegProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateUnadjusted() {
    return isSetField(40450);
  }

  public void set(quickfix.field.LegProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessDayConvention get(quickfix.field.LegProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessDayConvention getLegProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessDayConvention() {
    return isSetField(40451);
  }

  public void set(quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp getLegProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters get(quickfix.field.NoLegProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters getNoLegProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionDateBusinessCenters() {
    return isSetField(40939);
  }

public static class NoLegProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40452, 0};

  public NoLegProvisionDateBusinessCenters() {
    super(40939, 40452, ORDER);
  }

  public void set(quickfix.field.LegProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessCenter get(quickfix.field.LegProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessCenter getLegProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessCenter() {
    return isSetField(40452);
  }
}

  public void set(quickfix.field.LegProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateAdjusted get(quickfix.field.LegProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateAdjusted getLegProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateAdjusted() {
    return isSetField(40453);
  }

  public void set(quickfix.field.LegProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateTenorPeriod get(quickfix.field.LegProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateTenorPeriod getLegProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateTenorPeriod() {
    return isSetField(40454);
  }

  public void set(quickfix.field.LegProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateTenorUnit get(quickfix.field.LegProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateTenorUnit getLegProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateTenorUnit() {
    return isSetField(40455);
  }

  public void set(quickfix.field.LegProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.LegProvisionBreakFeeElection get(quickfix.field.LegProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionBreakFeeElection getLegProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.LegProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionBreakFeeElection() {
    return isSetField(42506);
  }

  public void set(quickfix.field.LegProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionBreakFeeRate get(quickfix.field.LegProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionBreakFeeRate getLegProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.LegProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionBreakFeeRate() {
    return isSetField(42507);
  }

  public void set(quickfix.field.LegProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCalculationAgent get(quickfix.field.LegProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCalculationAgent getLegProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCalculationAgent() {
    return isSetField(40456);
  }

  public void set(quickfix.field.LegProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionSinglePartyBuyerSide get(quickfix.field.LegProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionSinglePartyBuyerSide getLegProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionSinglePartyBuyerSide() {
    return isSetField(40457);
  }

  public void set(quickfix.field.LegProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionSinglePartySellerSide get(quickfix.field.LegProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionSinglePartySellerSide getLegProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionSinglePartySellerSide() {
    return isSetField(40458);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDates get(quickfix.fixlatest.component.LegProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDates getLegProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseDates get(quickfix.fixlatest.component.LegProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseDates getLegProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDate get(quickfix.fixlatest.component.LegProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDate getLegProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate getLegProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStyle get(quickfix.field.LegProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStyle getLegProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStyle() {
    return isSetField(40459);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMultipleNotional get(quickfix.field.LegProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMultipleNotional getLegProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMultipleNotional() {
    return isSetField(40460);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMinimumNotional get(quickfix.field.LegProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMinimumNotional getLegProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMinimumNotional() {
    return isSetField(40461);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMaximumNotional get(quickfix.field.LegProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMaximumNotional getLegProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMaximumNotional() {
    return isSetField(40462);
  }

  public void set(quickfix.field.LegProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionMinimumNumber get(quickfix.field.LegProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionMinimumNumber getLegProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionMinimumNumber() {
    return isSetField(40463);
  }

  public void set(quickfix.field.LegProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionMaximumNumber get(quickfix.field.LegProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionMaximumNumber getLegProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionMaximumNumber() {
    return isSetField(40464);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseConfirmation get(quickfix.field.LegProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseConfirmation getLegProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseConfirmation() {
    return isSetField(40465);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates getLegProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.LegProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlMethod get(quickfix.field.LegProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlMethod getLegProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlMethod() {
    return isSetField(40466);
  }

  public void set(quickfix.field.LegProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlCurrency get(quickfix.field.LegProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlCurrency getLegProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlCurrency() {
    return isSetField(40467);
  }

  public void set(quickfix.field.LegProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlCurrency2 get(quickfix.field.LegProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlCurrency2 getLegProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlCurrency2() {
    return isSetField(40468);
  }

  public void set(quickfix.field.LegProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlQuoteType get(quickfix.field.LegProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlQuoteType getLegProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlQuoteType() {
    return isSetField(40469);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource getLegProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.LegProvisionText value) {
    setField(value);
  }

  public quickfix.field.LegProvisionText get(quickfix.field.LegProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionText getLegProvisionText() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionText());
  }

  public boolean isSet(quickfix.field.LegProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionText() {
    return isSetField(40472);
  }

  public void set(quickfix.field.EncodedLegProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegProvisionTextLen get(quickfix.field.EncodedLegProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegProvisionTextLen getEncodedLegProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegProvisionTextLen() {
    return isSetField(40980);
  }

  public void set(quickfix.field.EncodedLegProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegProvisionText get(quickfix.field.EncodedLegProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegProvisionText getEncodedLegProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedLegProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegProvisionText() {
    return isSetField(40981);
  }

  public void set(quickfix.fixlatest.component.LegProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionParties get(quickfix.fixlatest.component.LegProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionParties getLegProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionParties());
  }

  public void set(quickfix.field.NoLegProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartyIDs get(quickfix.field.NoLegProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartyIDs getNoLegProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartyIDs() {
    return isSetField(40533);
  }

public static class NoLegProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40534, 40535, 40536, 2380, 40537, 0};

  public NoLegProvisionPartyIDs() {
    super(40533, 40534, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyID get(quickfix.field.LegProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyID getLegProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyID() {
    return isSetField(40534);
  }

  public void set(quickfix.field.LegProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyIDSource get(quickfix.field.LegProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyIDSource getLegProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyIDSource() {
    return isSetField(40535);
  }

  public void set(quickfix.field.LegProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRole get(quickfix.field.LegProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRole getLegProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRole() {
    return isSetField(40536);
  }

  public void set(quickfix.field.LegProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRoleQualifier get(quickfix.field.LegProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRoleQualifier getLegProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRoleQualifier() {
    return isSetField(2380);
  }

  public void set(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp get(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp getLegProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoLegProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartySubIDs get(quickfix.field.NoLegProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartySubIDs getNoLegProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartySubIDs() {
    return isSetField(40537);
  }

public static class NoLegProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40538, 40539, 0};

  public NoLegProvisionPartySubIDs() {
    super(40537, 40538, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}
}
}

  public void set(quickfix.field.LegProvisionType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionType get(quickfix.field.LegProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionType getLegProvisionType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionType());
  }

  public boolean isSet(quickfix.field.LegProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionType() {
    return isSetField(40449);
  }

  public void set(quickfix.field.LegProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateUnadjusted get(quickfix.field.LegProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateUnadjusted getLegProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateUnadjusted() {
    return isSetField(40450);
  }

  public void set(quickfix.field.LegProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessDayConvention get(quickfix.field.LegProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessDayConvention getLegProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessDayConvention() {
    return isSetField(40451);
  }

  public void set(quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp getLegProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters get(quickfix.field.NoLegProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters getNoLegProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionDateBusinessCenters() {
    return isSetField(40939);
  }

public static class NoLegProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40452, 0};

  public NoLegProvisionDateBusinessCenters() {
    super(40939, 40452, ORDER);
  }

  public void set(quickfix.field.LegProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessCenter get(quickfix.field.LegProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessCenter getLegProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessCenter() {
    return isSetField(40452);
  }
}

  public void set(quickfix.field.LegProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateAdjusted get(quickfix.field.LegProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateAdjusted getLegProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateAdjusted() {
    return isSetField(40453);
  }

  public void set(quickfix.field.LegProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateTenorPeriod get(quickfix.field.LegProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateTenorPeriod getLegProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateTenorPeriod() {
    return isSetField(40454);
  }

  public void set(quickfix.field.LegProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateTenorUnit get(quickfix.field.LegProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateTenorUnit getLegProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateTenorUnit() {
    return isSetField(40455);
  }

  public void set(quickfix.field.LegProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.LegProvisionBreakFeeElection get(quickfix.field.LegProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionBreakFeeElection getLegProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.LegProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionBreakFeeElection() {
    return isSetField(42506);
  }

  public void set(quickfix.field.LegProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionBreakFeeRate get(quickfix.field.LegProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionBreakFeeRate getLegProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.LegProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionBreakFeeRate() {
    return isSetField(42507);
  }

  public void set(quickfix.field.LegProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCalculationAgent get(quickfix.field.LegProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCalculationAgent getLegProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCalculationAgent() {
    return isSetField(40456);
  }

  public void set(quickfix.field.LegProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionSinglePartyBuyerSide get(quickfix.field.LegProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionSinglePartyBuyerSide getLegProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionSinglePartyBuyerSide() {
    return isSetField(40457);
  }

  public void set(quickfix.field.LegProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionSinglePartySellerSide get(quickfix.field.LegProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionSinglePartySellerSide getLegProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionSinglePartySellerSide() {
    return isSetField(40458);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDates get(quickfix.fixlatest.component.LegProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDates getLegProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseDates get(quickfix.fixlatest.component.LegProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseDates getLegProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDate get(quickfix.fixlatest.component.LegProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDate getLegProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate getLegProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStyle get(quickfix.field.LegProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStyle getLegProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStyle() {
    return isSetField(40459);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMultipleNotional get(quickfix.field.LegProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMultipleNotional getLegProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMultipleNotional() {
    return isSetField(40460);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMinimumNotional get(quickfix.field.LegProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMinimumNotional getLegProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMinimumNotional() {
    return isSetField(40461);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMaximumNotional get(quickfix.field.LegProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMaximumNotional getLegProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMaximumNotional() {
    return isSetField(40462);
  }

  public void set(quickfix.field.LegProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionMinimumNumber get(quickfix.field.LegProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionMinimumNumber getLegProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionMinimumNumber() {
    return isSetField(40463);
  }

  public void set(quickfix.field.LegProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionMaximumNumber get(quickfix.field.LegProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionMaximumNumber getLegProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionMaximumNumber() {
    return isSetField(40464);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseConfirmation get(quickfix.field.LegProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseConfirmation getLegProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseConfirmation() {
    return isSetField(40465);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates getLegProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.LegProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlMethod get(quickfix.field.LegProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlMethod getLegProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlMethod() {
    return isSetField(40466);
  }

  public void set(quickfix.field.LegProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlCurrency get(quickfix.field.LegProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlCurrency getLegProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlCurrency() {
    return isSetField(40467);
  }

  public void set(quickfix.field.LegProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlCurrency2 get(quickfix.field.LegProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlCurrency2 getLegProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlCurrency2() {
    return isSetField(40468);
  }

  public void set(quickfix.field.LegProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlQuoteType get(quickfix.field.LegProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlQuoteType getLegProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlQuoteType() {
    return isSetField(40469);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource getLegProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.LegProvisionText value) {
    setField(value);
  }

  public quickfix.field.LegProvisionText get(quickfix.field.LegProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionText getLegProvisionText() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionText());
  }

  public boolean isSet(quickfix.field.LegProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionText() {
    return isSetField(40472);
  }

  public void set(quickfix.field.EncodedLegProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegProvisionTextLen get(quickfix.field.EncodedLegProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegProvisionTextLen getEncodedLegProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegProvisionTextLen() {
    return isSetField(40980);
  }

  public void set(quickfix.field.EncodedLegProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegProvisionText get(quickfix.field.EncodedLegProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegProvisionText getEncodedLegProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedLegProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegProvisionText() {
    return isSetField(40981);
  }

  public void set(quickfix.fixlatest.component.LegProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionParties get(quickfix.fixlatest.component.LegProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionParties getLegProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionParties());
  }

  public void set(quickfix.field.NoLegProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartyIDs get(quickfix.field.NoLegProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartyIDs getNoLegProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartyIDs() {
    return isSetField(40533);
  }

public static class NoLegProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40534, 40535, 40536, 2380, 40537, 0};

  public NoLegProvisionPartyIDs() {
    super(40533, 40534, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyID get(quickfix.field.LegProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyID getLegProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyID() {
    return isSetField(40534);
  }

  public void set(quickfix.field.LegProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyIDSource get(quickfix.field.LegProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyIDSource getLegProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyIDSource() {
    return isSetField(40535);
  }

  public void set(quickfix.field.LegProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRole get(quickfix.field.LegProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRole getLegProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRole() {
    return isSetField(40536);
  }

  public void set(quickfix.field.LegProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRoleQualifier get(quickfix.field.LegProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRoleQualifier getLegProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRoleQualifier() {
    return isSetField(2380);
  }

  public void set(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp get(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp getLegProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoLegProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartySubIDs get(quickfix.field.NoLegProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartySubIDs getNoLegProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartySubIDs() {
    return isSetField(40537);
  }

public static class NoLegProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40538, 40539, 0};

  public NoLegProvisionPartySubIDs() {
    super(40537, 40538, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}
}
}
