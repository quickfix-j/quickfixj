/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RelativeValueGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2529, };
  protected int[] getGroupFields() { return componentGroups; }

  public RelativeValueGrp() {
    super();
  }

  public void set(quickfix.field.NoRelativeValues value) {
    setField(value);
  }

  public quickfix.field.NoRelativeValues get(quickfix.field.NoRelativeValues value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelativeValues getNoRelativeValues() throws FieldNotFound {
    return get(new quickfix.field.NoRelativeValues());
  }

  public boolean isSet(quickfix.field.NoRelativeValues field) {
    return isSetField(field);
  }

  public boolean isSetNoRelativeValues() {
    return isSetField(2529);
  }

public static class NoRelativeValues extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2530, 2531, 2532, 0};

  public NoRelativeValues() {
    super(2529, 2530, ORDER);
  }

  public void set(quickfix.field.RelativeValueType value) {
    setField(value);
  }

  public quickfix.field.RelativeValueType get(quickfix.field.RelativeValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValueType getRelativeValueType() throws FieldNotFound {
    return get(new quickfix.field.RelativeValueType());
  }

  public boolean isSet(quickfix.field.RelativeValueType field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValueType() {
    return isSetField(2530);
  }

  public void set(quickfix.field.RelativeValue value) {
    setField(value);
  }

  public quickfix.field.RelativeValue get(quickfix.field.RelativeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValue getRelativeValue() throws FieldNotFound {
    return get(new quickfix.field.RelativeValue());
  }

  public boolean isSet(quickfix.field.RelativeValue field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValue() {
    return isSetField(2531);
  }

  public void set(quickfix.field.RelativeValueSide value) {
    setField(value);
  }

  public quickfix.field.RelativeValueSide get(quickfix.field.RelativeValueSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValueSide getRelativeValueSide() throws FieldNotFound {
    return get(new quickfix.field.RelativeValueSide());
  }

  public boolean isSet(quickfix.field.RelativeValueSide field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValueSide() {
    return isSetField(2532);
  }
}

  public void set(quickfix.field.RelativeValueType value) {
    setField(value);
  }

  public quickfix.field.RelativeValueType get(quickfix.field.RelativeValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValueType getRelativeValueType() throws FieldNotFound {
    return get(new quickfix.field.RelativeValueType());
  }

  public boolean isSet(quickfix.field.RelativeValueType field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValueType() {
    return isSetField(2530);
  }

  public void set(quickfix.field.RelativeValue value) {
    setField(value);
  }

  public quickfix.field.RelativeValue get(quickfix.field.RelativeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValue getRelativeValue() throws FieldNotFound {
    return get(new quickfix.field.RelativeValue());
  }

  public boolean isSet(quickfix.field.RelativeValue field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValue() {
    return isSetField(2531);
  }

  public void set(quickfix.field.RelativeValueSide value) {
    setField(value);
  }

  public quickfix.field.RelativeValueSide get(quickfix.field.RelativeValueSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValueSide getRelativeValueSide() throws FieldNotFound {
    return get(new quickfix.field.RelativeValueSide());
  }

  public boolean isSet(quickfix.field.RelativeValueSide field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValueSide() {
    return isSetField(2532);
  }
}
