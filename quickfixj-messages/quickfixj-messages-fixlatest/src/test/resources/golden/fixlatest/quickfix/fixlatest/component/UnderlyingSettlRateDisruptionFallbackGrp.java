/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingSettlRateDisruptionFallbackGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40659, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingSettlRateDisruptionFallbackGrp() {
    super();
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
