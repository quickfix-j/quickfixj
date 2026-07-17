/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSettlRateDisruptionFallbackGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40902, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegSettlRateDisruptionFallbackGrp() {
    super();
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
