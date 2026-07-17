/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamNonDeliverableSettlTerms extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40817, 40818, 40820, 40821, 40822, 40823, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamNonDeliverableSettlTerms() {
    super();
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableRefCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableRefCurrency get(quickfix.field.PaymentStreamNonDeliverableRefCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableRefCurrency getPaymentStreamNonDeliverableRefCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableRefCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableRefCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableRefCurrency() {
    return isSetField(40817);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessDayConvention get(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessDayConvention getPaymentStreamNonDeliverableFixingDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesBusinessDayConvention() {
    return isSetField(40818);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp getPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDatesBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters get(quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters getNoPaymentStreamNonDeliverableFixingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamNonDeliverableFixingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    return isSetField(40946);
  }

public static class NoPaymentStreamNonDeliverableFixingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40819, 0};

  public NoPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    super(40946, 40819, ORDER);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter getPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40819);
  }
}

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesRelativeTo get(quickfix.field.PaymentStreamNonDeliverableFixingDatesRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesRelativeTo getPaymentStreamNonDeliverableFixingDatesRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesRelativeTo() {
    return isSetField(40820);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetPeriod get(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetPeriod getPaymentStreamNonDeliverableFixingDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesOffsetPeriod() {
    return isSetField(40821);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetUnit get(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetUnit getPaymentStreamNonDeliverableFixingDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesOffsetUnit() {
    return isSetField(40822);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetDayType get(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetDayType getPaymentStreamNonDeliverableFixingDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableFixingDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableFixingDatesOffsetDayType() {
    return isSetField(40823);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlRateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlRateSource get(quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlRateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlRateSource getPaymentStreamNonDeliverableSettlRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamNonDeliverableSettlRateSource());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDateGrp get(quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDateGrp getPaymentStreamNonDeliverableFixingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamNonDeliverableFixingDateGrp());
  }

  public void set(quickfix.field.NoNonDeliverableFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoNonDeliverableFixingDates get(quickfix.field.NoNonDeliverableFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNonDeliverableFixingDates getNoNonDeliverableFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoNonDeliverableFixingDates());
  }

  public boolean isSet(quickfix.field.NoNonDeliverableFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoNonDeliverableFixingDates() {
    return isSetField(40825);
  }

public static class NoNonDeliverableFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40826, 40827, 0};

  public NoNonDeliverableFixingDates() {
    super(40825, 40826, ORDER);
  }

  public void set(quickfix.field.NonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.NonDeliverableFixingDate get(quickfix.field.NonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonDeliverableFixingDate getNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.NonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.NonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetNonDeliverableFixingDate() {
    return isSetField(40826);
  }

  public void set(quickfix.field.NonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.NonDeliverableFixingDateType get(quickfix.field.NonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonDeliverableFixingDateType getNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.NonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.NonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetNonDeliverableFixingDateType() {
    return isSetField(40827);
  }
}

  public void set(quickfix.fixlatest.component.SettlRateDisruptionFallbackGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlRateDisruptionFallbackGrp get(quickfix.fixlatest.component.SettlRateDisruptionFallbackGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlRateDisruptionFallbackGrp getSettlRateDisruptionFallbackGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlRateDisruptionFallbackGrp());
  }

  public void set(quickfix.field.NoSettlRateFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoSettlRateFallbacks get(quickfix.field.NoSettlRateFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlRateFallbacks getNoSettlRateFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoSettlRateFallbacks());
  }

  public boolean isSet(quickfix.field.NoSettlRateFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlRateFallbacks() {
    return isSetField(40085);
  }

public static class NoSettlRateFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40086, 40373, 40655, 40088, 40089, 0};

  public NoSettlRateFallbacks() {
    super(40085, 40086, ORDER);
  }

  public void set(quickfix.field.SettlRatePostponementMaximumDays value) {
    setField(value);
  }

  public quickfix.field.SettlRatePostponementMaximumDays get(quickfix.field.SettlRatePostponementMaximumDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRatePostponementMaximumDays getSettlRatePostponementMaximumDays() throws FieldNotFound {
    return get(new quickfix.field.SettlRatePostponementMaximumDays());
  }

  public boolean isSet(quickfix.field.SettlRatePostponementMaximumDays field) {
    return isSetField(field);
  }

  public boolean isSetSettlRatePostponementMaximumDays() {
    return isSetField(40086);
  }

  public void set(quickfix.fixlatest.component.SettlRateFallbackRateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlRateFallbackRateSource get(quickfix.fixlatest.component.SettlRateFallbackRateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlRateFallbackRateSource getSettlRateFallbackRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlRateFallbackRateSource());
  }

  public void set(quickfix.field.SettlRatePostponementSurvey value) {
    setField(value);
  }

  public quickfix.field.SettlRatePostponementSurvey get(quickfix.field.SettlRatePostponementSurvey value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRatePostponementSurvey getSettlRatePostponementSurvey() throws FieldNotFound {
    return get(new quickfix.field.SettlRatePostponementSurvey());
  }

  public boolean isSet(quickfix.field.SettlRatePostponementSurvey field) {
    return isSetField(field);
  }

  public boolean isSetSettlRatePostponementSurvey() {
    return isSetField(40088);
  }

  public void set(quickfix.field.SettlRatePostponementCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.SettlRatePostponementCalculationAgent get(quickfix.field.SettlRatePostponementCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRatePostponementCalculationAgent getSettlRatePostponementCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.SettlRatePostponementCalculationAgent());
  }

  public boolean isSet(quickfix.field.SettlRatePostponementCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetSettlRatePostponementCalculationAgent() {
    return isSetField(40089);
  }
}
}
