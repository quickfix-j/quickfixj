/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ContAmtGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {518, };
  protected int[] getGroupFields() { return componentGroups; }

  public ContAmtGrp() {
    super();
  }

  public void set(quickfix.field.NoContAmts value) {
    setField(value);
  }

  public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
    return get(new quickfix.field.NoContAmts());
  }

  public boolean isSet(quickfix.field.NoContAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoContAmts() {
    return isSetField(518);
  }

public static class NoContAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {519, 520, 521, 0};

  public NoContAmts() {
    super(518, 519, ORDER);
  }

  public void set(quickfix.field.ContAmtType value) {
    setField(value);
  }

  public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
    return get(new quickfix.field.ContAmtType());
  }

  public boolean isSet(quickfix.field.ContAmtType field) {
    return isSetField(field);
  }

  public boolean isSetContAmtType() {
    return isSetField(519);
  }

  public void set(quickfix.field.ContAmtValue value) {
    setField(value);
  }

  public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
    return get(new quickfix.field.ContAmtValue());
  }

  public boolean isSet(quickfix.field.ContAmtValue field) {
    return isSetField(field);
  }

  public boolean isSetContAmtValue() {
    return isSetField(520);
  }

  public void set(quickfix.field.ContAmtCurr value) {
    setField(value);
  }

  public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
    return get(new quickfix.field.ContAmtCurr());
  }

  public boolean isSet(quickfix.field.ContAmtCurr field) {
    return isSetField(field);
  }

  public boolean isSetContAmtCurr() {
    return isSetField(521);
  }
}

  public void set(quickfix.field.ContAmtType value) {
    setField(value);
  }

  public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
    return get(new quickfix.field.ContAmtType());
  }

  public boolean isSet(quickfix.field.ContAmtType field) {
    return isSetField(field);
  }

  public boolean isSetContAmtType() {
    return isSetField(519);
  }

  public void set(quickfix.field.ContAmtValue value) {
    setField(value);
  }

  public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
    return get(new quickfix.field.ContAmtValue());
  }

  public boolean isSet(quickfix.field.ContAmtValue field) {
    return isSetField(field);
  }

  public boolean isSetContAmtValue() {
    return isSetField(520);
  }

  public void set(quickfix.field.ContAmtCurr value) {
    setField(value);
  }

  public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
    return get(new quickfix.field.ContAmtCurr());
  }

  public boolean isSet(quickfix.field.ContAmtCurr field) {
    return isSetField(field);
  }

  public boolean isSetContAmtCurr() {
    return isSetField(521);
  }
}
