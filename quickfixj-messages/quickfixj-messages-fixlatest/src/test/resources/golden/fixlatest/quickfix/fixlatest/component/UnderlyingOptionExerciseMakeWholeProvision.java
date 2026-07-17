/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseMakeWholeProvision extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42888, 42889, 42890, 42891, 42892, 42893, 42894, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseMakeWholeProvision() {
    super();
  }

  public void set(quickfix.field.UnderlyingMakeWholeDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeDate get(quickfix.field.UnderlyingMakeWholeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeDate getUnderlyingMakeWholeDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeDate());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeDate() {
    return isSetField(42888);
  }

  public void set(quickfix.field.UnderlyingMakeWholeAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeAmount get(quickfix.field.UnderlyingMakeWholeAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeAmount getUnderlyingMakeWholeAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeAmount() {
    return isSetField(42889);
  }

  public void set(quickfix.field.UnderlyingMakeWholeBenchmarkCurveName value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeBenchmarkCurveName get(quickfix.field.UnderlyingMakeWholeBenchmarkCurveName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeBenchmarkCurveName getUnderlyingMakeWholeBenchmarkCurveName() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeBenchmarkCurveName());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeBenchmarkCurveName field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeBenchmarkCurveName() {
    return isSetField(42890);
  }

  public void set(quickfix.field.UnderlyingMakeWholeBenchmarkCurvePoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeBenchmarkCurvePoint get(quickfix.field.UnderlyingMakeWholeBenchmarkCurvePoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeBenchmarkCurvePoint getUnderlyingMakeWholeBenchmarkCurvePoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeBenchmarkCurvePoint());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeBenchmarkCurvePoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeBenchmarkCurvePoint() {
    return isSetField(42891);
  }

  public void set(quickfix.field.UnderlyingMakeWholeRecallSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeRecallSpread get(quickfix.field.UnderlyingMakeWholeRecallSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeRecallSpread getUnderlyingMakeWholeRecallSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeRecallSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeRecallSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeRecallSpread() {
    return isSetField(42892);
  }

  public void set(quickfix.field.UnderlyingMakeWholeBenchmarkQuote value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeBenchmarkQuote get(quickfix.field.UnderlyingMakeWholeBenchmarkQuote value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeBenchmarkQuote getUnderlyingMakeWholeBenchmarkQuote() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeBenchmarkQuote());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeBenchmarkQuote field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeBenchmarkQuote() {
    return isSetField(42893);
  }

  public void set(quickfix.field.UnderlyingMakeWholeInterpolationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMakeWholeInterpolationMethod get(quickfix.field.UnderlyingMakeWholeInterpolationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMakeWholeInterpolationMethod getUnderlyingMakeWholeInterpolationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMakeWholeInterpolationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingMakeWholeInterpolationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMakeWholeInterpolationMethod() {
    return isSetField(42894);
  }
}
