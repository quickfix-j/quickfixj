/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlRateDisruptionFallbackGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40085, };
  protected int[] getGroupFields() { return componentGroups; }

  public SettlRateDisruptionFallbackGrp() {
    super();
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
