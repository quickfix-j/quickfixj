/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PriceMovementValueGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1920, };
  protected int[] getGroupFields() { return componentGroups; }

  public PriceMovementValueGrp() {
    super();
  }

  public void set(quickfix.field.NoPriceMovementValues value) {
    setField(value);
  }

  public quickfix.field.NoPriceMovementValues get(quickfix.field.NoPriceMovementValues value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceMovementValues getNoPriceMovementValues() throws FieldNotFound {
    return get(new quickfix.field.NoPriceMovementValues());
  }

  public boolean isSet(quickfix.field.NoPriceMovementValues field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceMovementValues() {
    return isSetField(1920);
  }

public static class NoPriceMovementValues extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1921, 1922, 1923, 0};

  public NoPriceMovementValues() {
    super(1920, 1921, ORDER);
  }

  public void set(quickfix.field.PriceMovementValue value) {
    setField(value);
  }

  public quickfix.field.PriceMovementValue get(quickfix.field.PriceMovementValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementValue getPriceMovementValue() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementValue());
  }

  public boolean isSet(quickfix.field.PriceMovementValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementValue() {
    return isSetField(1921);
  }

  public void set(quickfix.field.PriceMovementPoint value) {
    setField(value);
  }

  public quickfix.field.PriceMovementPoint get(quickfix.field.PriceMovementPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementPoint getPriceMovementPoint() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementPoint());
  }

  public boolean isSet(quickfix.field.PriceMovementPoint field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementPoint() {
    return isSetField(1922);
  }

  public void set(quickfix.field.PriceMovementType value) {
    setField(value);
  }

  public quickfix.field.PriceMovementType get(quickfix.field.PriceMovementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementType getPriceMovementType() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementType());
  }

  public boolean isSet(quickfix.field.PriceMovementType field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementType() {
    return isSetField(1923);
  }
}

  public void set(quickfix.field.PriceMovementValue value) {
    setField(value);
  }

  public quickfix.field.PriceMovementValue get(quickfix.field.PriceMovementValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementValue getPriceMovementValue() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementValue());
  }

  public boolean isSet(quickfix.field.PriceMovementValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementValue() {
    return isSetField(1921);
  }

  public void set(quickfix.field.PriceMovementPoint value) {
    setField(value);
  }

  public quickfix.field.PriceMovementPoint get(quickfix.field.PriceMovementPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementPoint getPriceMovementPoint() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementPoint());
  }

  public boolean isSet(quickfix.field.PriceMovementPoint field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementPoint() {
    return isSetField(1922);
  }

  public void set(quickfix.field.PriceMovementType value) {
    setField(value);
  }

  public quickfix.field.PriceMovementType get(quickfix.field.PriceMovementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementType getPriceMovementType() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementType());
  }

  public boolean isSet(quickfix.field.PriceMovementType field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementType() {
    return isSetField(1923);
  }
}
