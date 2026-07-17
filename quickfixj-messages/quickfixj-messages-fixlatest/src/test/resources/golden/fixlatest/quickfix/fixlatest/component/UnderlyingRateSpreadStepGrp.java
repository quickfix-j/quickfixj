/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingRateSpreadStepGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43005, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingRateSpreadStepGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingRateSpreadSteps value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingRateSpreadSteps get(quickfix.field.NoUnderlyingRateSpreadSteps value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingRateSpreadSteps getNoUnderlyingRateSpreadSteps() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingRateSpreadSteps());
  }

  public boolean isSet(quickfix.field.NoUnderlyingRateSpreadSteps field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingRateSpreadSteps() {
    return isSetField(43005);
  }

public static class NoUnderlyingRateSpreadSteps extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43006, 43007, 0};

  public NoUnderlyingRateSpreadSteps() {
    super(43005, 43006, ORDER);
  }

  public void set(quickfix.field.UnderlyingRateSpreadStepDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRateSpreadStepDate get(quickfix.field.UnderlyingRateSpreadStepDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRateSpreadStepDate getUnderlyingRateSpreadStepDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRateSpreadStepDate());
  }

  public boolean isSet(quickfix.field.UnderlyingRateSpreadStepDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRateSpreadStepDate() {
    return isSetField(43006);
  }

  public void set(quickfix.field.UnderlyingRateSpreadStepValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRateSpreadStepValue get(quickfix.field.UnderlyingRateSpreadStepValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRateSpreadStepValue getUnderlyingRateSpreadStepValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRateSpreadStepValue());
  }

  public boolean isSet(quickfix.field.UnderlyingRateSpreadStepValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRateSpreadStepValue() {
    return isSetField(43007);
  }
}

  public void set(quickfix.field.UnderlyingRateSpreadStepDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRateSpreadStepDate get(quickfix.field.UnderlyingRateSpreadStepDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRateSpreadStepDate getUnderlyingRateSpreadStepDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRateSpreadStepDate());
  }

  public boolean isSet(quickfix.field.UnderlyingRateSpreadStepDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRateSpreadStepDate() {
    return isSetField(43006);
  }

  public void set(quickfix.field.UnderlyingRateSpreadStepValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRateSpreadStepValue get(quickfix.field.UnderlyingRateSpreadStepValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRateSpreadStepValue getUnderlyingRateSpreadStepValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRateSpreadStepValue());
  }

  public boolean isSet(quickfix.field.UnderlyingRateSpreadStepValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRateSpreadStepValue() {
    return isSetField(43007);
  }
}
