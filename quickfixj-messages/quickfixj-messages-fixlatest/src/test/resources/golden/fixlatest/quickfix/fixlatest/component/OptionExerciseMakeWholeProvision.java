/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseMakeWholeProvision extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42591, 42592, 42593, 42594, 42595, 42596, 42597, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseMakeWholeProvision() {
    super();
  }

  public void set(quickfix.field.MakeWholeDate value) {
    setField(value);
  }

  public quickfix.field.MakeWholeDate get(quickfix.field.MakeWholeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeDate getMakeWholeDate() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeDate());
  }

  public boolean isSet(quickfix.field.MakeWholeDate field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeDate() {
    return isSetField(42591);
  }

  public void set(quickfix.field.MakeWholeAmount value) {
    setField(value);
  }

  public quickfix.field.MakeWholeAmount get(quickfix.field.MakeWholeAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeAmount getMakeWholeAmount() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeAmount());
  }

  public boolean isSet(quickfix.field.MakeWholeAmount field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeAmount() {
    return isSetField(42592);
  }

  public void set(quickfix.field.MakeWholeBenchmarkCurveName value) {
    setField(value);
  }

  public quickfix.field.MakeWholeBenchmarkCurveName get(quickfix.field.MakeWholeBenchmarkCurveName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeBenchmarkCurveName getMakeWholeBenchmarkCurveName() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeBenchmarkCurveName());
  }

  public boolean isSet(quickfix.field.MakeWholeBenchmarkCurveName field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeBenchmarkCurveName() {
    return isSetField(42593);
  }

  public void set(quickfix.field.MakeWholeBenchmarkCurvePoint value) {
    setField(value);
  }

  public quickfix.field.MakeWholeBenchmarkCurvePoint get(quickfix.field.MakeWholeBenchmarkCurvePoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeBenchmarkCurvePoint getMakeWholeBenchmarkCurvePoint() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeBenchmarkCurvePoint());
  }

  public boolean isSet(quickfix.field.MakeWholeBenchmarkCurvePoint field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeBenchmarkCurvePoint() {
    return isSetField(42594);
  }

  public void set(quickfix.field.MakeWholeRecallSpread value) {
    setField(value);
  }

  public quickfix.field.MakeWholeRecallSpread get(quickfix.field.MakeWholeRecallSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeRecallSpread getMakeWholeRecallSpread() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeRecallSpread());
  }

  public boolean isSet(quickfix.field.MakeWholeRecallSpread field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeRecallSpread() {
    return isSetField(42595);
  }

  public void set(quickfix.field.MakeWholeBenchmarkQuote value) {
    setField(value);
  }

  public quickfix.field.MakeWholeBenchmarkQuote get(quickfix.field.MakeWholeBenchmarkQuote value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeBenchmarkQuote getMakeWholeBenchmarkQuote() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeBenchmarkQuote());
  }

  public boolean isSet(quickfix.field.MakeWholeBenchmarkQuote field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeBenchmarkQuote() {
    return isSetField(42596);
  }

  public void set(quickfix.field.MakeWholeInterpolationMethod value) {
    setField(value);
  }

  public quickfix.field.MakeWholeInterpolationMethod get(quickfix.field.MakeWholeInterpolationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MakeWholeInterpolationMethod getMakeWholeInterpolationMethod() throws FieldNotFound {
    return get(new quickfix.field.MakeWholeInterpolationMethod());
  }

  public boolean isSet(quickfix.field.MakeWholeInterpolationMethod field) {
    return isSetField(field);
  }

  public boolean isSetMakeWholeInterpolationMethod() {
    return isSetField(42597);
  }
}
