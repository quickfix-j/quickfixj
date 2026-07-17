/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamNonDeliverableSettlTerms extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40359, 40360, 40362, 40363, 40364, 40365, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamNonDeliverableSettlTerms() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableRefCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableRefCurrency get(quickfix.field.LegPaymentStreamNonDeliverableRefCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableRefCurrency getLegPaymentStreamNonDeliverableRefCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableRefCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableRefCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableRefCurrency() {
    return isSetField(40359);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention getLegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesBusinessDayConvention() {
    return isSetField(40360);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp getLegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters get(quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters getNoLegPaymentStreamNonDeliverableFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamNonDeliverableFixingDateBusinessCenters() {
    return isSetField(40929);
  }

public static class NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40361, 0};

  public NoLegPaymentStreamNonDeliverableFixingDateBusinessCenters() {
    super(40929, 40361, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter getLegPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40361);
  }
}

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesRelativeTo get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesRelativeTo getLegPaymentStreamNonDeliverableFixingDatesRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesRelativeTo() {
    return isSetField(40362);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetPeriod get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetPeriod getLegPaymentStreamNonDeliverableFixingDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesOffsetPeriod() {
    return isSetField(40363);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetUnit get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetUnit getLegPaymentStreamNonDeliverableFixingDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesOffsetUnit() {
    return isSetField(40364);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetDayType get(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetDayType getLegPaymentStreamNonDeliverableFixingDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableFixingDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableFixingDatesOffsetDayType() {
    return isSetField(40365);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlRateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlRateSource get(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlRateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlRateSource getLegPaymentStreamNonDeliverableSettlRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamNonDeliverableSettlRateSource());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDateGrp get(quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDateGrp getLegPaymentStreamNonDeliverableFixingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamNonDeliverableFixingDateGrp());
  }

  public void set(quickfix.field.NoLegNonDeliverableFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegNonDeliverableFixingDates get(quickfix.field.NoLegNonDeliverableFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegNonDeliverableFixingDates getNoLegNonDeliverableFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegNonDeliverableFixingDates());
  }

  public boolean isSet(quickfix.field.NoLegNonDeliverableFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegNonDeliverableFixingDates() {
    return isSetField(40367);
  }

public static class NoLegNonDeliverableFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40368, 40369, 0};

  public NoLegNonDeliverableFixingDates() {
    super(40367, 40368, ORDER);
  }

  public void set(quickfix.field.LegNonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.LegNonDeliverableFixingDate get(quickfix.field.LegNonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonDeliverableFixingDate getLegNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.LegNonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.LegNonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegNonDeliverableFixingDate() {
    return isSetField(40368);
  }

  public void set(quickfix.field.LegNonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.LegNonDeliverableFixingDateType get(quickfix.field.LegNonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonDeliverableFixingDateType getLegNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegNonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.LegNonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegNonDeliverableFixingDateType() {
    return isSetField(40369);
  }
}

  public void set(quickfix.fixlatest.component.LegSettlRateDisruptionFallbackGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSettlRateDisruptionFallbackGrp get(quickfix.fixlatest.component.LegSettlRateDisruptionFallbackGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSettlRateDisruptionFallbackGrp getLegSettlRateDisruptionFallbackGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSettlRateDisruptionFallbackGrp());
  }

  public void set(quickfix.field.NoLegSettlRateFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoLegSettlRateFallbacks get(quickfix.field.NoLegSettlRateFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSettlRateFallbacks getNoLegSettlRateFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoLegSettlRateFallbacks());
  }

  public boolean isSet(quickfix.field.NoLegSettlRateFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSettlRateFallbacks() {
    return isSetField(40902);
  }

public static class NoLegSettlRateFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40903, 40366, 40370, 40905, 40906, 0};

  public NoLegSettlRateFallbacks() {
    super(40902, 40903, ORDER);
  }

  public void set(quickfix.field.LegSettlRatePostponementMaximumDays value) {
    setField(value);
  }

  public quickfix.field.LegSettlRatePostponementMaximumDays get(quickfix.field.LegSettlRatePostponementMaximumDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRatePostponementMaximumDays getLegSettlRatePostponementMaximumDays() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRatePostponementMaximumDays());
  }

  public boolean isSet(quickfix.field.LegSettlRatePostponementMaximumDays field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRatePostponementMaximumDays() {
    return isSetField(40903);
  }

  public void set(quickfix.fixlatest.component.LegSettlRateFallbackRateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSettlRateFallbackRateSource get(quickfix.fixlatest.component.LegSettlRateFallbackRateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSettlRateFallbackRateSource getLegSettlRateFallbackRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSettlRateFallbackRateSource());
  }

  public void set(quickfix.field.LegSettlRatePostponementSurvey value) {
    setField(value);
  }

  public quickfix.field.LegSettlRatePostponementSurvey get(quickfix.field.LegSettlRatePostponementSurvey value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRatePostponementSurvey getLegSettlRatePostponementSurvey() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRatePostponementSurvey());
  }

  public boolean isSet(quickfix.field.LegSettlRatePostponementSurvey field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRatePostponementSurvey() {
    return isSetField(40905);
  }

  public void set(quickfix.field.LegSettlRatePostponementCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegSettlRatePostponementCalculationAgent get(quickfix.field.LegSettlRatePostponementCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRatePostponementCalculationAgent getLegSettlRatePostponementCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRatePostponementCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegSettlRatePostponementCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRatePostponementCalculationAgent() {
    return isSetField(40906);
  }
}
}
