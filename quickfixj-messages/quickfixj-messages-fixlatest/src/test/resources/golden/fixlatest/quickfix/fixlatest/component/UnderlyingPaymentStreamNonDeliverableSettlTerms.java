/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamNonDeliverableSettlTerms extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40648, 40649, 40651, 40652, 40653, 40654, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamNonDeliverableSettlTerms() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableRefCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableRefCurrency get(quickfix.field.UnderlyingPaymentStreamNonDeliverableRefCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableRefCurrency getUnderlyingPaymentStreamNonDeliverableRefCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableRefCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableRefCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableRefCurrency() {
    return isSetField(40648);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention getUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessDayConvention() {
    return isSetField(40649);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp getUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters getNoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    return isSetField(40968);
  }

public static class NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40650, 0};

  public NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    super(40968, 40650, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter getUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40650);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo getUnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesRelativeTo() {
    return isSetField(40651);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod getUnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesOffsetPeriod() {
    return isSetField(40652);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit getUnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesOffsetUnit() {
    return isSetField(40653);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType getUnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesOffsetDayType() {
    return isSetField(40654);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlRateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlRateSource get(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlRateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlRateSource getUnderlyingPaymentStreamNonDeliverableSettlRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableSettlRateSource());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDateGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDateGrp getUnderlyingPaymentStreamNonDeliverableFixingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamNonDeliverableFixingDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingNonDeliverableFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingNonDeliverableFixingDates get(quickfix.field.NoUnderlyingNonDeliverableFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingNonDeliverableFixingDates getNoUnderlyingNonDeliverableFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingNonDeliverableFixingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingNonDeliverableFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingNonDeliverableFixingDates() {
    return isSetField(40656);
  }

public static class NoUnderlyingNonDeliverableFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40657, 40658, 0};

  public NoUnderlyingNonDeliverableFixingDates() {
    super(40656, 40657, ORDER);
  }

  public void set(quickfix.field.UnderlyingNonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDate get(quickfix.field.UnderlyingNonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDate getUnderlyingNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingNonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonDeliverableFixingDate() {
    return isSetField(40657);
  }

  public void set(quickfix.field.UnderlyingNonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDateType get(quickfix.field.UnderlyingNonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonDeliverableFixingDateType getUnderlyingNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingNonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonDeliverableFixingDateType() {
    return isSetField(40658);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingSettlRateDisruptionFallbackGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingSettlRateDisruptionFallbackGrp get(quickfix.fixlatest.component.UnderlyingSettlRateDisruptionFallbackGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingSettlRateDisruptionFallbackGrp getUnderlyingSettlRateDisruptionFallbackGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingSettlRateDisruptionFallbackGrp());
  }

  public void set(quickfix.field.NoUnderlyingSettlRateFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSettlRateFallbacks get(quickfix.field.NoUnderlyingSettlRateFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSettlRateFallbacks getNoUnderlyingSettlRateFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSettlRateFallbacks());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSettlRateFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSettlRateFallbacks() {
    return isSetField(40659);
  }

public static class NoUnderlyingSettlRateFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40660, 40904, 40915, 40662, 40663, 0};

  public NoUnderlyingSettlRateFallbacks() {
    super(40659, 40660, ORDER);
  }

  public void set(quickfix.field.UnderlyingSettlRatePostponementMaximumDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRatePostponementMaximumDays get(quickfix.field.UnderlyingSettlRatePostponementMaximumDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRatePostponementMaximumDays getUnderlyingSettlRatePostponementMaximumDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRatePostponementMaximumDays());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRatePostponementMaximumDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRatePostponementMaximumDays() {
    return isSetField(40660);
  }

  public void set(quickfix.fixlatest.component.UnderlyingSettlRateFallbackRateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingSettlRateFallbackRateSource get(quickfix.fixlatest.component.UnderlyingSettlRateFallbackRateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingSettlRateFallbackRateSource getUnderlyingSettlRateFallbackRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingSettlRateFallbackRateSource());
  }

  public void set(quickfix.field.UnderlyingSettlRatePostponementSurvey value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRatePostponementSurvey get(quickfix.field.UnderlyingSettlRatePostponementSurvey value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRatePostponementSurvey getUnderlyingSettlRatePostponementSurvey() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRatePostponementSurvey());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRatePostponementSurvey field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRatePostponementSurvey() {
    return isSetField(40662);
  }

  public void set(quickfix.field.UnderlyingSettlRatePostponementCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRatePostponementCalculationAgent get(quickfix.field.UnderlyingSettlRatePostponementCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRatePostponementCalculationAgent getUnderlyingSettlRatePostponementCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRatePostponementCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRatePostponementCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRatePostponementCalculationAgent() {
    return isSetField(40663);
  }
}
}
