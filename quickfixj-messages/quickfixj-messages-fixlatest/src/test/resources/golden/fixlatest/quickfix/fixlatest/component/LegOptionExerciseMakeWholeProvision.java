/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseMakeWholeProvision extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42392, 42393, 42394, 42395, 42396, 42397, 42398, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseMakeWholeProvision() {
    super();
  }

  public void set(quickfix.field.LegMakeWholeDate value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeDate get(quickfix.field.LegMakeWholeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeDate getLegMakeWholeDate() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeDate());
  }

  public boolean isSet(quickfix.field.LegMakeWholeDate field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeDate() {
    return isSetField(42392);
  }

  public void set(quickfix.field.LegMakeWholeAmount value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeAmount get(quickfix.field.LegMakeWholeAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeAmount getLegMakeWholeAmount() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeAmount());
  }

  public boolean isSet(quickfix.field.LegMakeWholeAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeAmount() {
    return isSetField(42393);
  }

  public void set(quickfix.field.LegMakeWholeBenchmarkCurveName value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeBenchmarkCurveName get(quickfix.field.LegMakeWholeBenchmarkCurveName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeBenchmarkCurveName getLegMakeWholeBenchmarkCurveName() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeBenchmarkCurveName());
  }

  public boolean isSet(quickfix.field.LegMakeWholeBenchmarkCurveName field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeBenchmarkCurveName() {
    return isSetField(42394);
  }

  public void set(quickfix.field.LegMakeWholeBenchmarkCurvePoint value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeBenchmarkCurvePoint get(quickfix.field.LegMakeWholeBenchmarkCurvePoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeBenchmarkCurvePoint getLegMakeWholeBenchmarkCurvePoint() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeBenchmarkCurvePoint());
  }

  public boolean isSet(quickfix.field.LegMakeWholeBenchmarkCurvePoint field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeBenchmarkCurvePoint() {
    return isSetField(42395);
  }

  public void set(quickfix.field.LegMakeWholeRecallSpread value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeRecallSpread get(quickfix.field.LegMakeWholeRecallSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeRecallSpread getLegMakeWholeRecallSpread() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeRecallSpread());
  }

  public boolean isSet(quickfix.field.LegMakeWholeRecallSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeRecallSpread() {
    return isSetField(42396);
  }

  public void set(quickfix.field.LegMakeWholeBenchmarkQuote value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeBenchmarkQuote get(quickfix.field.LegMakeWholeBenchmarkQuote value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeBenchmarkQuote getLegMakeWholeBenchmarkQuote() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeBenchmarkQuote());
  }

  public boolean isSet(quickfix.field.LegMakeWholeBenchmarkQuote field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeBenchmarkQuote() {
    return isSetField(42397);
  }

  public void set(quickfix.field.LegMakeWholeInterpolationMethod value) {
    setField(value);
  }

  public quickfix.field.LegMakeWholeInterpolationMethod get(quickfix.field.LegMakeWholeInterpolationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMakeWholeInterpolationMethod getLegMakeWholeInterpolationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegMakeWholeInterpolationMethod());
  }

  public boolean isSet(quickfix.field.LegMakeWholeInterpolationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegMakeWholeInterpolationMethod() {
    return isSetField(42398);
  }
}
