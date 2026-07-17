/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LimitAmts extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1630, };
  protected int[] getGroupFields() { return componentGroups; }

  public LimitAmts() {
    super();
  }

  public void set(quickfix.field.NoLimitAmts value) {
    setField(value);
  }

  public quickfix.field.NoLimitAmts get(quickfix.field.NoLimitAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLimitAmts getNoLimitAmts() throws FieldNotFound {
    return get(new quickfix.field.NoLimitAmts());
  }

  public boolean isSet(quickfix.field.NoLimitAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoLimitAmts() {
    return isSetField(1630);
  }

public static class NoLimitAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1631, 1632, 1633, 2394, 2395, 1634, 2396, 0};

  public NoLimitAmts() {
    super(1630, 1631, ORDER);
  }

  public void set(quickfix.field.LimitAmtType value) {
    setField(value);
  }

  public quickfix.field.LimitAmtType get(quickfix.field.LimitAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtType getLimitAmtType() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtType());
  }

  public boolean isSet(quickfix.field.LimitAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtType() {
    return isSetField(1631);
  }

  public void set(quickfix.field.LastLimitAmt value) {
    setField(value);
  }

  public quickfix.field.LastLimitAmt get(quickfix.field.LastLimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastLimitAmt getLastLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LastLimitAmt());
  }

  public boolean isSet(quickfix.field.LastLimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLastLimitAmt() {
    return isSetField(1632);
  }

  public void set(quickfix.field.LimitAmtRemaining value) {
    setField(value);
  }

  public quickfix.field.LimitAmtRemaining get(quickfix.field.LimitAmtRemaining value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtRemaining getLimitAmtRemaining() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtRemaining());
  }

  public boolean isSet(quickfix.field.LimitAmtRemaining field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtRemaining() {
    return isSetField(1633);
  }

  public void set(quickfix.field.LimitUtilizationAmt value) {
    setField(value);
  }

  public quickfix.field.LimitUtilizationAmt get(quickfix.field.LimitUtilizationAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitUtilizationAmt getLimitUtilizationAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitUtilizationAmt());
  }

  public boolean isSet(quickfix.field.LimitUtilizationAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitUtilizationAmt() {
    return isSetField(2394);
  }

  public void set(quickfix.field.LimitAmt value) {
    setField(value);
  }

  public quickfix.field.LimitAmt get(quickfix.field.LimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmt getLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitAmt());
  }

  public boolean isSet(quickfix.field.LimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmt() {
    return isSetField(2395);
  }

  public void set(quickfix.field.LimitAmtCurrency value) {
    setField(value);
  }

  public quickfix.field.LimitAmtCurrency get(quickfix.field.LimitAmtCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtCurrency getLimitAmtCurrency() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtCurrency());
  }

  public boolean isSet(quickfix.field.LimitAmtCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtCurrency() {
    return isSetField(1634);
  }

  public void set(quickfix.field.LimitRole value) {
    setField(value);
  }

  public quickfix.field.LimitRole get(quickfix.field.LimitRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitRole getLimitRole() throws FieldNotFound {
    return get(new quickfix.field.LimitRole());
  }

  public boolean isSet(quickfix.field.LimitRole field) {
    return isSetField(field);
  }

  public boolean isSetLimitRole() {
    return isSetField(2396);
  }
}

  public void set(quickfix.field.LimitAmtType value) {
    setField(value);
  }

  public quickfix.field.LimitAmtType get(quickfix.field.LimitAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtType getLimitAmtType() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtType());
  }

  public boolean isSet(quickfix.field.LimitAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtType() {
    return isSetField(1631);
  }

  public void set(quickfix.field.LastLimitAmt value) {
    setField(value);
  }

  public quickfix.field.LastLimitAmt get(quickfix.field.LastLimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastLimitAmt getLastLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LastLimitAmt());
  }

  public boolean isSet(quickfix.field.LastLimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLastLimitAmt() {
    return isSetField(1632);
  }

  public void set(quickfix.field.LimitAmtRemaining value) {
    setField(value);
  }

  public quickfix.field.LimitAmtRemaining get(quickfix.field.LimitAmtRemaining value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtRemaining getLimitAmtRemaining() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtRemaining());
  }

  public boolean isSet(quickfix.field.LimitAmtRemaining field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtRemaining() {
    return isSetField(1633);
  }

  public void set(quickfix.field.LimitUtilizationAmt value) {
    setField(value);
  }

  public quickfix.field.LimitUtilizationAmt get(quickfix.field.LimitUtilizationAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitUtilizationAmt getLimitUtilizationAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitUtilizationAmt());
  }

  public boolean isSet(quickfix.field.LimitUtilizationAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitUtilizationAmt() {
    return isSetField(2394);
  }

  public void set(quickfix.field.LimitAmt value) {
    setField(value);
  }

  public quickfix.field.LimitAmt get(quickfix.field.LimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmt getLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitAmt());
  }

  public boolean isSet(quickfix.field.LimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmt() {
    return isSetField(2395);
  }

  public void set(quickfix.field.LimitAmtCurrency value) {
    setField(value);
  }

  public quickfix.field.LimitAmtCurrency get(quickfix.field.LimitAmtCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtCurrency getLimitAmtCurrency() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtCurrency());
  }

  public boolean isSet(quickfix.field.LimitAmtCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtCurrency() {
    return isSetField(1634);
  }

  public void set(quickfix.field.LimitRole value) {
    setField(value);
  }

  public quickfix.field.LimitRole get(quickfix.field.LimitRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitRole getLimitRole() throws FieldNotFound {
    return get(new quickfix.field.LimitRole());
  }

  public boolean isSet(quickfix.field.LimitRole field) {
    return isSetField(field);
  }

  public boolean isSetLimitRole() {
    return isSetField(2396);
  }
}
