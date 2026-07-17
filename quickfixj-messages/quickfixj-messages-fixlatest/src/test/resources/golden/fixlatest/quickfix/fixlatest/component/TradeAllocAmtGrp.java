/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradeAllocAmtGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1844, };
  protected int[] getGroupFields() { return componentGroups; }

  public TradeAllocAmtGrp() {
    super();
  }

  public void set(quickfix.field.NoTradeAllocAmts value) {
    setField(value);
  }

  public quickfix.field.NoTradeAllocAmts get(quickfix.field.NoTradeAllocAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradeAllocAmts getNoTradeAllocAmts() throws FieldNotFound {
    return get(new quickfix.field.NoTradeAllocAmts());
  }

  public boolean isSet(quickfix.field.NoTradeAllocAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoTradeAllocAmts() {
    return isSetField(1844);
  }

public static class NoTradeAllocAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1845, 1846, 1847, 1850, 0};

  public NoTradeAllocAmts() {
    super(1844, 1845, ORDER);
  }

  public void set(quickfix.field.TradeAllocAmtType value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtType get(quickfix.field.TradeAllocAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtType getTradeAllocAmtType() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtType());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtType() {
    return isSetField(1845);
  }

  public void set(quickfix.field.TradeAllocAmt value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmt get(quickfix.field.TradeAllocAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmt getTradeAllocAmt() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmt());
  }

  public boolean isSet(quickfix.field.TradeAllocAmt field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmt() {
    return isSetField(1846);
  }

  public void set(quickfix.field.TradeAllocCurrency value) {
    setField(value);
  }

  public quickfix.field.TradeAllocCurrency get(quickfix.field.TradeAllocCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocCurrency getTradeAllocCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocCurrency());
  }

  public boolean isSet(quickfix.field.TradeAllocCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocCurrency() {
    return isSetField(1847);
  }

  public void set(quickfix.field.TradeAllocAmtReason value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtReason get(quickfix.field.TradeAllocAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtReason getTradeAllocAmtReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtReason());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtReason() {
    return isSetField(1850);
  }
}

  public void set(quickfix.field.TradeAllocAmtType value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtType get(quickfix.field.TradeAllocAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtType getTradeAllocAmtType() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtType());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtType() {
    return isSetField(1845);
  }

  public void set(quickfix.field.TradeAllocAmt value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmt get(quickfix.field.TradeAllocAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmt getTradeAllocAmt() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmt());
  }

  public boolean isSet(quickfix.field.TradeAllocAmt field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmt() {
    return isSetField(1846);
  }

  public void set(quickfix.field.TradeAllocCurrency value) {
    setField(value);
  }

  public quickfix.field.TradeAllocCurrency get(quickfix.field.TradeAllocCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocCurrency getTradeAllocCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocCurrency());
  }

  public boolean isSet(quickfix.field.TradeAllocCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocCurrency() {
    return isSetField(1847);
  }

  public void set(quickfix.field.TradeAllocAmtReason value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtReason get(quickfix.field.TradeAllocAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtReason getTradeAllocAmtReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtReason());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtReason() {
    return isSetField(1850);
  }
}
