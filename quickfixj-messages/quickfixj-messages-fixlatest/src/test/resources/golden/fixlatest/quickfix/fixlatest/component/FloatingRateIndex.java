/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FloatingRateIndex extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {2731, 2732, 2730, 2728, 2729, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public FloatingRateIndex() {
    super();
  }

  public void set(quickfix.field.FloatingRateIndexID value) {
    setField(value);
  }

  public quickfix.field.FloatingRateIndexID get(quickfix.field.FloatingRateIndexID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FloatingRateIndexID getFloatingRateIndexID() throws FieldNotFound {
    return get(new quickfix.field.FloatingRateIndexID());
  }

  public boolean isSet(quickfix.field.FloatingRateIndexID field) {
    return isSetField(field);
  }

  public boolean isSetFloatingRateIndexID() {
    return isSetField(2731);
  }

  public void set(quickfix.field.FloatingRateIndexIDSource value) {
    setField(value);
  }

  public quickfix.field.FloatingRateIndexIDSource get(quickfix.field.FloatingRateIndexIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FloatingRateIndexIDSource getFloatingRateIndexIDSource() throws FieldNotFound {
    return get(new quickfix.field.FloatingRateIndexIDSource());
  }

  public boolean isSet(quickfix.field.FloatingRateIndexIDSource field) {
    return isSetField(field);
  }

  public boolean isSetFloatingRateIndexIDSource() {
    return isSetField(2732);
  }

  public void set(quickfix.field.FloatingRateIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.FloatingRateIndexCurveUnit get(quickfix.field.FloatingRateIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FloatingRateIndexCurveUnit getFloatingRateIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.FloatingRateIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.FloatingRateIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetFloatingRateIndexCurveUnit() {
    return isSetField(2730);
  }

  public void set(quickfix.field.FloatingRateIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.FloatingRateIndexCurvePeriod get(quickfix.field.FloatingRateIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FloatingRateIndexCurvePeriod getFloatingRateIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.FloatingRateIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.FloatingRateIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetFloatingRateIndexCurvePeriod() {
    return isSetField(2728);
  }

  public void set(quickfix.field.FloatingRateIndexCurveSpread value) {
    setField(value);
  }

  public quickfix.field.FloatingRateIndexCurveSpread get(quickfix.field.FloatingRateIndexCurveSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FloatingRateIndexCurveSpread getFloatingRateIndexCurveSpread() throws FieldNotFound {
    return get(new quickfix.field.FloatingRateIndexCurveSpread());
  }

  public boolean isSet(quickfix.field.FloatingRateIndexCurveSpread field) {
    return isSetField(field);
  }

  public boolean isSetFloatingRateIndexCurveSpread() {
    return isSetField(2729);
  }
}
