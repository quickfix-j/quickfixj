/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40212, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentGrp() {
    super();
  }

  public void set(quickfix.field.NoPayments value) {
    setField(value);
  }

  public quickfix.field.NoPayments get(quickfix.field.NoPayments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPayments getNoPayments() throws FieldNotFound {
    return get(new quickfix.field.NoPayments());
  }

  public boolean isSet(quickfix.field.NoPayments field) {
    return isSetField(field);
  }

  public boolean isSetNoPayments() {
    return isSetField(40212);
  }

public static class NoPayments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40213, 40993, 40214, 40215, 43087, 40216, 40217, 42598, 42599, 43097, 43098, 43100, 43099, 43101, 43105, 43104, 43103, 43102, 40218, 40919, 41155, 40219, 40220, 40944, 41156, 41157, 41158, 41159, 40222, 41160, 40224, 40225, 40226, 40227, 492, 40230, 41304, 40229, 40984, 40985, 0};

  public NoPayments() {
    super(40212, 40213, ORDER);
  }

  public void set(quickfix.field.PaymentType value) {
    setField(value);
  }

  public quickfix.field.PaymentType get(quickfix.field.PaymentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentType getPaymentType() throws FieldNotFound {
    return get(new quickfix.field.PaymentType());
  }

  public boolean isSet(quickfix.field.PaymentType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentType() {
    return isSetField(40213);
  }

  public void set(quickfix.field.PaymentSubType value) {
    setField(value);
  }

  public quickfix.field.PaymentSubType get(quickfix.field.PaymentSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSubType getPaymentSubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSubType());
  }

  public boolean isSet(quickfix.field.PaymentSubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSubType() {
    return isSetField(40993);
  }

  public void set(quickfix.field.PaymentPaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentPaySide get(quickfix.field.PaymentPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPaySide getPaymentPaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentPaySide());
  }

  public boolean isSet(quickfix.field.PaymentPaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPaySide() {
    return isSetField(40214);
  }

  public void set(quickfix.field.PaymentReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentReceiveSide get(quickfix.field.PaymentReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentReceiveSide getPaymentReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentReceiveSide() {
    return isSetField(40215);
  }

  public void set(quickfix.field.PaymentDesc value) {
    setField(value);
  }

  public quickfix.field.PaymentDesc get(quickfix.field.PaymentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDesc getPaymentDesc() throws FieldNotFound {
    return get(new quickfix.field.PaymentDesc());
  }

  public boolean isSet(quickfix.field.PaymentDesc field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDesc() {
    return isSetField(43087);
  }

  public void set(quickfix.field.PaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentCurrency get(quickfix.field.PaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentCurrency getPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentCurrency());
  }

  public boolean isSet(quickfix.field.PaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentCurrency() {
    return isSetField(40216);
  }

  public void set(quickfix.field.PaymentAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentAmount get(quickfix.field.PaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmount getPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmount());
  }

  public boolean isSet(quickfix.field.PaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmount() {
    return isSetField(40217);
  }

  public void set(quickfix.field.PaymentAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentAmountRelativeTo get(quickfix.field.PaymentAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmountRelativeTo getPaymentAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmountRelativeTo() {
    return isSetField(42598);
  }

  public void set(quickfix.field.PaymentAmountDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentAmountDeterminationMethod get(quickfix.field.PaymentAmountDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmountDeterminationMethod getPaymentAmountDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmountDeterminationMethod());
  }

  public boolean isSet(quickfix.field.PaymentAmountDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmountDeterminationMethod() {
    return isSetField(42599);
  }

  public void set(quickfix.field.PaymentFixedRate value) {
    setField(value);
  }

  public quickfix.field.PaymentFixedRate get(quickfix.field.PaymentFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFixedRate getPaymentFixedRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentFixedRate());
  }

  public boolean isSet(quickfix.field.PaymentFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFixedRate() {
    return isSetField(43097);
  }

  public void set(quickfix.field.PaymentFloatingRateIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndex get(quickfix.field.PaymentFloatingRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndex getPaymentFloatingRateIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndex());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndex() {
    return isSetField(43098);
  }

  public void set(quickfix.field.PaymentFloatingRateIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndexCurveUnit get(quickfix.field.PaymentFloatingRateIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndexCurveUnit getPaymentFloatingRateIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndexCurveUnit() {
    return isSetField(43100);
  }

  public void set(quickfix.field.PaymentFloatingRateIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndexCurvePeriod get(quickfix.field.PaymentFloatingRateIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndexCurvePeriod getPaymentFloatingRateIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndexCurvePeriod() {
    return isSetField(43099);
  }

  public void set(quickfix.field.PaymentFloatingRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateSpread get(quickfix.field.PaymentFloatingRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateSpread getPaymentFloatingRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateSpread() {
    return isSetField(43101);
  }

  public void set(quickfix.field.PaymentRateResetFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentRateResetFrequencyUnit get(quickfix.field.PaymentRateResetFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentRateResetFrequencyUnit getPaymentRateResetFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentRateResetFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentRateResetFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentRateResetFrequencyUnit() {
    return isSetField(43105);
  }

  public void set(quickfix.field.PaymentRateResetFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentRateResetFrequencyPeriod get(quickfix.field.PaymentRateResetFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentRateResetFrequencyPeriod getPaymentRateResetFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentRateResetFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentRateResetFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentRateResetFrequencyPeriod() {
    return isSetField(43104);
  }

  public void set(quickfix.field.PaymentFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentFrequencyUnit get(quickfix.field.PaymentFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFrequencyUnit getPaymentFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFrequencyUnit() {
    return isSetField(43103);
  }

  public void set(quickfix.field.PaymentFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentFrequencyPeriod get(quickfix.field.PaymentFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFrequencyPeriod getPaymentFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFrequencyPeriod() {
    return isSetField(43102);
  }

  public void set(quickfix.field.PaymentPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentPrice get(quickfix.field.PaymentPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPrice getPaymentPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentPrice());
  }

  public boolean isSet(quickfix.field.PaymentPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPrice() {
    return isSetField(40218);
  }

  public void set(quickfix.field.PaymentPriceType value) {
    setField(value);
  }

  public quickfix.field.PaymentPriceType get(quickfix.field.PaymentPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPriceType getPaymentPriceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentPriceType());
  }

  public boolean isSet(quickfix.field.PaymentPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPriceType() {
    return isSetField(40919);
  }

  public void set(quickfix.field.PaymentUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentUnitOfMeasure get(quickfix.field.PaymentUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentUnitOfMeasure getPaymentUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentUnitOfMeasure() {
    return isSetField(41155);
  }

  public void set(quickfix.field.PaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentDateUnadjusted get(quickfix.field.PaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateUnadjusted getPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateUnadjusted() {
    return isSetField(40219);
  }

  public void set(quickfix.field.PaymentBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessDayConvention get(quickfix.field.PaymentBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessDayConvention getPaymentBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessDayConvention() {
    return isSetField(40220);
  }

  public void set(quickfix.fixlatest.component.PaymentBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentBusinessCenterGrp get(quickfix.fixlatest.component.PaymentBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentBusinessCenterGrp getPaymentBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentBusinessCenters get(quickfix.field.NoPaymentBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentBusinessCenters getNoPaymentBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentBusinessCenters() {
    return isSetField(40944);
  }

public static class NoPaymentBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40221, 0};

  public NoPaymentBusinessCenters() {
    super(40944, 40221, ORDER);
  }

  public void set(quickfix.field.PaymentBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessCenter get(quickfix.field.PaymentBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessCenter getPaymentBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessCenter() {
    return isSetField(40221);
  }
}

  public void set(quickfix.field.PaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentDateRelativeTo get(quickfix.field.PaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateRelativeTo getPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateRelativeTo() {
    return isSetField(41156);
  }

  public void set(quickfix.field.PaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetPeriod get(quickfix.field.PaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetPeriod getPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetPeriod() {
    return isSetField(41157);
  }

  public void set(quickfix.field.PaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetUnit get(quickfix.field.PaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetUnit getPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetUnit() {
    return isSetField(41158);
  }

  public void set(quickfix.field.PaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetDayType get(quickfix.field.PaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetDayType getPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetDayType() {
    return isSetField(41159);
  }

  public void set(quickfix.field.PaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentDateAdjusted get(quickfix.field.PaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateAdjusted getPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateAdjusted() {
    return isSetField(40222);
  }

  public void set(quickfix.field.PaymentForwardStartType value) {
    setField(value);
  }

  public quickfix.field.PaymentForwardStartType get(quickfix.field.PaymentForwardStartType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentForwardStartType getPaymentForwardStartType() throws FieldNotFound {
    return get(new quickfix.field.PaymentForwardStartType());
  }

  public boolean isSet(quickfix.field.PaymentForwardStartType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentForwardStartType() {
    return isSetField(41160);
  }

  public void set(quickfix.field.PaymentDiscountFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentDiscountFactor get(quickfix.field.PaymentDiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDiscountFactor getPaymentDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentDiscountFactor());
  }

  public boolean isSet(quickfix.field.PaymentDiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDiscountFactor() {
    return isSetField(40224);
  }

  public void set(quickfix.field.PaymentPresentValueAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentPresentValueAmount get(quickfix.field.PaymentPresentValueAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPresentValueAmount getPaymentPresentValueAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentPresentValueAmount());
  }

  public boolean isSet(quickfix.field.PaymentPresentValueAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPresentValueAmount() {
    return isSetField(40225);
  }

  public void set(quickfix.field.PaymentPresentValueCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentPresentValueCurrency get(quickfix.field.PaymentPresentValueCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPresentValueCurrency getPaymentPresentValueCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentPresentValueCurrency());
  }

  public boolean isSet(quickfix.field.PaymentPresentValueCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPresentValueCurrency() {
    return isSetField(40226);
  }

  public void set(quickfix.field.PaymentSettlStyle value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlStyle get(quickfix.field.PaymentSettlStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlStyle getPaymentSettlStyle() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlStyle());
  }

  public boolean isSet(quickfix.field.PaymentSettlStyle field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlStyle() {
    return isSetField(40227);
  }

  public void set(quickfix.field.PaymentMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentMethod get(quickfix.field.PaymentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentMethod getPaymentMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentMethod());
  }

  public boolean isSet(quickfix.field.PaymentMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentMethod() {
    return isSetField(492);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlGrp get(quickfix.fixlatest.component.PaymentSettlGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlGrp getPaymentSettlGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlGrp());
  }

  public void set(quickfix.field.NoPaymentSettls value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettls get(quickfix.field.NoPaymentSettls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettls getNoPaymentSettls() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettls());
  }

  public boolean isSet(quickfix.field.NoPaymentSettls field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettls() {
    return isSetField(40230);
  }

public static class NoPaymentSettls extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40231, 40232, 40233, 0};

  public NoPaymentSettls() {
    super(40230, 40231, ORDER);
  }

  public void set(quickfix.field.PaymentSettlAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlAmount get(quickfix.field.PaymentSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlAmount getPaymentSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlAmount());
  }

  public boolean isSet(quickfix.field.PaymentSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlAmount() {
    return isSetField(40231);
  }

  public void set(quickfix.field.PaymentSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlCurrency get(quickfix.field.PaymentSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlCurrency getPaymentSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlCurrency());
  }

  public boolean isSet(quickfix.field.PaymentSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlCurrency() {
    return isSetField(40232);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlParties get(quickfix.fixlatest.component.PaymentSettlParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlParties getPaymentSettlPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlParties());
  }

  public void set(quickfix.field.NoPaymentSettlPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartyIDs get(quickfix.field.NoPaymentSettlPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartyIDs getNoPaymentSettlPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartyIDs() {
    return isSetField(40233);
  }

public static class NoPaymentSettlPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40234, 40235, 40236, 40237, 40238, 0};

  public NoPaymentSettlPartyIDs() {
    super(40233, 40234, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartyID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyID get(quickfix.field.PaymentSettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyID getPaymentSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyID() {
    return isSetField(40234);
  }

  public void set(quickfix.field.PaymentSettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyIDSource get(quickfix.field.PaymentSettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyIDSource getPaymentSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyIDSource() {
    return isSetField(40235);
  }

  public void set(quickfix.field.PaymentSettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRole get(quickfix.field.PaymentSettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRole getPaymentSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRole());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRole() {
    return isSetField(40236);
  }

  public void set(quickfix.field.PaymentSettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier get(quickfix.field.PaymentSettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier getPaymentSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRoleQualifier() {
    return isSetField(40237);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp get(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp getPaymentSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlPtysSubGrp());
  }

  public void set(quickfix.field.NoPaymentSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartySubIDs get(quickfix.field.NoPaymentSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartySubIDs getNoPaymentSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartySubIDs() {
    return isSetField(40238);
  }

public static class NoPaymentSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40239, 40240, 0};

  public NoPaymentSettlPartySubIDs() {
    super(40238, 40239, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubID get(quickfix.field.PaymentSettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubID getPaymentSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubID() {
    return isSetField(40239);
  }

  public void set(quickfix.field.PaymentSettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubIDType get(quickfix.field.PaymentSettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubIDType getPaymentSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubIDType() {
    return isSetField(40240);
  }
}
}
}

  public void set(quickfix.field.PaymentLegRefID value) {
    setField(value);
  }

  public quickfix.field.PaymentLegRefID get(quickfix.field.PaymentLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentLegRefID getPaymentLegRefID() throws FieldNotFound {
    return get(new quickfix.field.PaymentLegRefID());
  }

  public boolean isSet(quickfix.field.PaymentLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentLegRefID() {
    return isSetField(41304);
  }

  public void set(quickfix.field.PaymentText value) {
    setField(value);
  }

  public quickfix.field.PaymentText get(quickfix.field.PaymentText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentText getPaymentText() throws FieldNotFound {
    return get(new quickfix.field.PaymentText());
  }

  public boolean isSet(quickfix.field.PaymentText field) {
    return isSetField(field);
  }

  public boolean isSetPaymentText() {
    return isSetField(40229);
  }

  public void set(quickfix.field.EncodedPaymentTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedPaymentTextLen get(quickfix.field.EncodedPaymentTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPaymentTextLen getEncodedPaymentTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedPaymentTextLen());
  }

  public boolean isSet(quickfix.field.EncodedPaymentTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPaymentTextLen() {
    return isSetField(40984);
  }

  public void set(quickfix.field.EncodedPaymentText value) {
    setField(value);
  }

  public quickfix.field.EncodedPaymentText get(quickfix.field.EncodedPaymentText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPaymentText getEncodedPaymentText() throws FieldNotFound {
    return get(new quickfix.field.EncodedPaymentText());
  }

  public boolean isSet(quickfix.field.EncodedPaymentText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPaymentText() {
    return isSetField(40985);
  }
}

  public void set(quickfix.field.PaymentType value) {
    setField(value);
  }

  public quickfix.field.PaymentType get(quickfix.field.PaymentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentType getPaymentType() throws FieldNotFound {
    return get(new quickfix.field.PaymentType());
  }

  public boolean isSet(quickfix.field.PaymentType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentType() {
    return isSetField(40213);
  }

  public void set(quickfix.field.PaymentSubType value) {
    setField(value);
  }

  public quickfix.field.PaymentSubType get(quickfix.field.PaymentSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSubType getPaymentSubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSubType());
  }

  public boolean isSet(quickfix.field.PaymentSubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSubType() {
    return isSetField(40993);
  }

  public void set(quickfix.field.PaymentPaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentPaySide get(quickfix.field.PaymentPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPaySide getPaymentPaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentPaySide());
  }

  public boolean isSet(quickfix.field.PaymentPaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPaySide() {
    return isSetField(40214);
  }

  public void set(quickfix.field.PaymentReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentReceiveSide get(quickfix.field.PaymentReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentReceiveSide getPaymentReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentReceiveSide() {
    return isSetField(40215);
  }

  public void set(quickfix.field.PaymentDesc value) {
    setField(value);
  }

  public quickfix.field.PaymentDesc get(quickfix.field.PaymentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDesc getPaymentDesc() throws FieldNotFound {
    return get(new quickfix.field.PaymentDesc());
  }

  public boolean isSet(quickfix.field.PaymentDesc field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDesc() {
    return isSetField(43087);
  }

  public void set(quickfix.field.PaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentCurrency get(quickfix.field.PaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentCurrency getPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentCurrency());
  }

  public boolean isSet(quickfix.field.PaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentCurrency() {
    return isSetField(40216);
  }

  public void set(quickfix.field.PaymentAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentAmount get(quickfix.field.PaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmount getPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmount());
  }

  public boolean isSet(quickfix.field.PaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmount() {
    return isSetField(40217);
  }

  public void set(quickfix.field.PaymentAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentAmountRelativeTo get(quickfix.field.PaymentAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmountRelativeTo getPaymentAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmountRelativeTo() {
    return isSetField(42598);
  }

  public void set(quickfix.field.PaymentAmountDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentAmountDeterminationMethod get(quickfix.field.PaymentAmountDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmountDeterminationMethod getPaymentAmountDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmountDeterminationMethod());
  }

  public boolean isSet(quickfix.field.PaymentAmountDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmountDeterminationMethod() {
    return isSetField(42599);
  }

  public void set(quickfix.field.PaymentFixedRate value) {
    setField(value);
  }

  public quickfix.field.PaymentFixedRate get(quickfix.field.PaymentFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFixedRate getPaymentFixedRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentFixedRate());
  }

  public boolean isSet(quickfix.field.PaymentFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFixedRate() {
    return isSetField(43097);
  }

  public void set(quickfix.field.PaymentFloatingRateIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndex get(quickfix.field.PaymentFloatingRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndex getPaymentFloatingRateIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndex());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndex() {
    return isSetField(43098);
  }

  public void set(quickfix.field.PaymentFloatingRateIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndexCurveUnit get(quickfix.field.PaymentFloatingRateIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndexCurveUnit getPaymentFloatingRateIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndexCurveUnit() {
    return isSetField(43100);
  }

  public void set(quickfix.field.PaymentFloatingRateIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndexCurvePeriod get(quickfix.field.PaymentFloatingRateIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndexCurvePeriod getPaymentFloatingRateIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndexCurvePeriod() {
    return isSetField(43099);
  }

  public void set(quickfix.field.PaymentFloatingRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateSpread get(quickfix.field.PaymentFloatingRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateSpread getPaymentFloatingRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateSpread() {
    return isSetField(43101);
  }

  public void set(quickfix.field.PaymentRateResetFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentRateResetFrequencyUnit get(quickfix.field.PaymentRateResetFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentRateResetFrequencyUnit getPaymentRateResetFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentRateResetFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentRateResetFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentRateResetFrequencyUnit() {
    return isSetField(43105);
  }

  public void set(quickfix.field.PaymentRateResetFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentRateResetFrequencyPeriod get(quickfix.field.PaymentRateResetFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentRateResetFrequencyPeriod getPaymentRateResetFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentRateResetFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentRateResetFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentRateResetFrequencyPeriod() {
    return isSetField(43104);
  }

  public void set(quickfix.field.PaymentFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentFrequencyUnit get(quickfix.field.PaymentFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFrequencyUnit getPaymentFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFrequencyUnit() {
    return isSetField(43103);
  }

  public void set(quickfix.field.PaymentFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentFrequencyPeriod get(quickfix.field.PaymentFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFrequencyPeriod getPaymentFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFrequencyPeriod() {
    return isSetField(43102);
  }

  public void set(quickfix.field.PaymentPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentPrice get(quickfix.field.PaymentPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPrice getPaymentPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentPrice());
  }

  public boolean isSet(quickfix.field.PaymentPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPrice() {
    return isSetField(40218);
  }

  public void set(quickfix.field.PaymentPriceType value) {
    setField(value);
  }

  public quickfix.field.PaymentPriceType get(quickfix.field.PaymentPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPriceType getPaymentPriceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentPriceType());
  }

  public boolean isSet(quickfix.field.PaymentPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPriceType() {
    return isSetField(40919);
  }

  public void set(quickfix.field.PaymentUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentUnitOfMeasure get(quickfix.field.PaymentUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentUnitOfMeasure getPaymentUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentUnitOfMeasure() {
    return isSetField(41155);
  }

  public void set(quickfix.field.PaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentDateUnadjusted get(quickfix.field.PaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateUnadjusted getPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateUnadjusted() {
    return isSetField(40219);
  }

  public void set(quickfix.field.PaymentBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessDayConvention get(quickfix.field.PaymentBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessDayConvention getPaymentBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessDayConvention() {
    return isSetField(40220);
  }

  public void set(quickfix.fixlatest.component.PaymentBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentBusinessCenterGrp get(quickfix.fixlatest.component.PaymentBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentBusinessCenterGrp getPaymentBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentBusinessCenters get(quickfix.field.NoPaymentBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentBusinessCenters getNoPaymentBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentBusinessCenters() {
    return isSetField(40944);
  }

public static class NoPaymentBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40221, 0};

  public NoPaymentBusinessCenters() {
    super(40944, 40221, ORDER);
  }

  public void set(quickfix.field.PaymentBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessCenter get(quickfix.field.PaymentBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessCenter getPaymentBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessCenter() {
    return isSetField(40221);
  }
}

  public void set(quickfix.field.PaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentDateRelativeTo get(quickfix.field.PaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateRelativeTo getPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateRelativeTo() {
    return isSetField(41156);
  }

  public void set(quickfix.field.PaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetPeriod get(quickfix.field.PaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetPeriod getPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetPeriod() {
    return isSetField(41157);
  }

  public void set(quickfix.field.PaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetUnit get(quickfix.field.PaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetUnit getPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetUnit() {
    return isSetField(41158);
  }

  public void set(quickfix.field.PaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetDayType get(quickfix.field.PaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetDayType getPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetDayType() {
    return isSetField(41159);
  }

  public void set(quickfix.field.PaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentDateAdjusted get(quickfix.field.PaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateAdjusted getPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateAdjusted() {
    return isSetField(40222);
  }

  public void set(quickfix.field.PaymentForwardStartType value) {
    setField(value);
  }

  public quickfix.field.PaymentForwardStartType get(quickfix.field.PaymentForwardStartType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentForwardStartType getPaymentForwardStartType() throws FieldNotFound {
    return get(new quickfix.field.PaymentForwardStartType());
  }

  public boolean isSet(quickfix.field.PaymentForwardStartType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentForwardStartType() {
    return isSetField(41160);
  }

  public void set(quickfix.field.PaymentDiscountFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentDiscountFactor get(quickfix.field.PaymentDiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDiscountFactor getPaymentDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentDiscountFactor());
  }

  public boolean isSet(quickfix.field.PaymentDiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDiscountFactor() {
    return isSetField(40224);
  }

  public void set(quickfix.field.PaymentPresentValueAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentPresentValueAmount get(quickfix.field.PaymentPresentValueAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPresentValueAmount getPaymentPresentValueAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentPresentValueAmount());
  }

  public boolean isSet(quickfix.field.PaymentPresentValueAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPresentValueAmount() {
    return isSetField(40225);
  }

  public void set(quickfix.field.PaymentPresentValueCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentPresentValueCurrency get(quickfix.field.PaymentPresentValueCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPresentValueCurrency getPaymentPresentValueCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentPresentValueCurrency());
  }

  public boolean isSet(quickfix.field.PaymentPresentValueCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPresentValueCurrency() {
    return isSetField(40226);
  }

  public void set(quickfix.field.PaymentSettlStyle value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlStyle get(quickfix.field.PaymentSettlStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlStyle getPaymentSettlStyle() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlStyle());
  }

  public boolean isSet(quickfix.field.PaymentSettlStyle field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlStyle() {
    return isSetField(40227);
  }

  public void set(quickfix.field.PaymentMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentMethod get(quickfix.field.PaymentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentMethod getPaymentMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentMethod());
  }

  public boolean isSet(quickfix.field.PaymentMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentMethod() {
    return isSetField(492);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlGrp get(quickfix.fixlatest.component.PaymentSettlGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlGrp getPaymentSettlGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlGrp());
  }

  public void set(quickfix.field.NoPaymentSettls value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettls get(quickfix.field.NoPaymentSettls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettls getNoPaymentSettls() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettls());
  }

  public boolean isSet(quickfix.field.NoPaymentSettls field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettls() {
    return isSetField(40230);
  }

public static class NoPaymentSettls extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40231, 40232, 40233, 0};

  public NoPaymentSettls() {
    super(40230, 40231, ORDER);
  }

  public void set(quickfix.field.PaymentSettlAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlAmount get(quickfix.field.PaymentSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlAmount getPaymentSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlAmount());
  }

  public boolean isSet(quickfix.field.PaymentSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlAmount() {
    return isSetField(40231);
  }

  public void set(quickfix.field.PaymentSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlCurrency get(quickfix.field.PaymentSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlCurrency getPaymentSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlCurrency());
  }

  public boolean isSet(quickfix.field.PaymentSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlCurrency() {
    return isSetField(40232);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlParties get(quickfix.fixlatest.component.PaymentSettlParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlParties getPaymentSettlPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlParties());
  }

  public void set(quickfix.field.NoPaymentSettlPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartyIDs get(quickfix.field.NoPaymentSettlPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartyIDs getNoPaymentSettlPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartyIDs() {
    return isSetField(40233);
  }

public static class NoPaymentSettlPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40234, 40235, 40236, 40237, 40238, 0};

  public NoPaymentSettlPartyIDs() {
    super(40233, 40234, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartyID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyID get(quickfix.field.PaymentSettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyID getPaymentSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyID() {
    return isSetField(40234);
  }

  public void set(quickfix.field.PaymentSettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyIDSource get(quickfix.field.PaymentSettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyIDSource getPaymentSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyIDSource() {
    return isSetField(40235);
  }

  public void set(quickfix.field.PaymentSettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRole get(quickfix.field.PaymentSettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRole getPaymentSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRole());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRole() {
    return isSetField(40236);
  }

  public void set(quickfix.field.PaymentSettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier get(quickfix.field.PaymentSettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier getPaymentSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRoleQualifier() {
    return isSetField(40237);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp get(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp getPaymentSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlPtysSubGrp());
  }

  public void set(quickfix.field.NoPaymentSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartySubIDs get(quickfix.field.NoPaymentSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartySubIDs getNoPaymentSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartySubIDs() {
    return isSetField(40238);
  }

public static class NoPaymentSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40239, 40240, 0};

  public NoPaymentSettlPartySubIDs() {
    super(40238, 40239, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubID get(quickfix.field.PaymentSettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubID getPaymentSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubID() {
    return isSetField(40239);
  }

  public void set(quickfix.field.PaymentSettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubIDType get(quickfix.field.PaymentSettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubIDType getPaymentSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubIDType() {
    return isSetField(40240);
  }
}
}
}

  public void set(quickfix.field.PaymentLegRefID value) {
    setField(value);
  }

  public quickfix.field.PaymentLegRefID get(quickfix.field.PaymentLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentLegRefID getPaymentLegRefID() throws FieldNotFound {
    return get(new quickfix.field.PaymentLegRefID());
  }

  public boolean isSet(quickfix.field.PaymentLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentLegRefID() {
    return isSetField(41304);
  }

  public void set(quickfix.field.PaymentText value) {
    setField(value);
  }

  public quickfix.field.PaymentText get(quickfix.field.PaymentText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentText getPaymentText() throws FieldNotFound {
    return get(new quickfix.field.PaymentText());
  }

  public boolean isSet(quickfix.field.PaymentText field) {
    return isSetField(field);
  }

  public boolean isSetPaymentText() {
    return isSetField(40229);
  }

  public void set(quickfix.field.EncodedPaymentTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedPaymentTextLen get(quickfix.field.EncodedPaymentTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPaymentTextLen getEncodedPaymentTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedPaymentTextLen());
  }

  public boolean isSet(quickfix.field.EncodedPaymentTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPaymentTextLen() {
    return isSetField(40984);
  }

  public void set(quickfix.field.EncodedPaymentText value) {
    setField(value);
  }

  public quickfix.field.EncodedPaymentText get(quickfix.field.EncodedPaymentText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPaymentText getEncodedPaymentText() throws FieldNotFound {
    return get(new quickfix.field.EncodedPaymentText());
  }

  public boolean isSet(quickfix.field.EncodedPaymentText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPaymentText() {
    return isSetField(40985);
  }
}
