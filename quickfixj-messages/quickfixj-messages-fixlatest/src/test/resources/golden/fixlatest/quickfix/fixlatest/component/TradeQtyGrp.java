/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradeQtyGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1841, };
  protected int[] getGroupFields() { return componentGroups; }

  public TradeQtyGrp() {
    super();
  }

  public void set(quickfix.field.NoTradeQtys value) {
    setField(value);
  }

  public quickfix.field.NoTradeQtys get(quickfix.field.NoTradeQtys value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradeQtys getNoTradeQtys() throws FieldNotFound {
    return get(new quickfix.field.NoTradeQtys());
  }

  public boolean isSet(quickfix.field.NoTradeQtys field) {
    return isSetField(field);
  }

  public boolean isSetNoTradeQtys() {
    return isSetField(1841);
  }

public static class NoTradeQtys extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1842, 1843, 0};

  public NoTradeQtys() {
    super(1841, 1842, ORDER);
  }

  public void set(quickfix.field.TradeQtyType value) {
    setField(value);
  }

  public quickfix.field.TradeQtyType get(quickfix.field.TradeQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeQtyType getTradeQtyType() throws FieldNotFound {
    return get(new quickfix.field.TradeQtyType());
  }

  public boolean isSet(quickfix.field.TradeQtyType field) {
    return isSetField(field);
  }

  public boolean isSetTradeQtyType() {
    return isSetField(1842);
  }

  public void set(quickfix.field.TradeQty value) {
    setField(value);
  }

  public quickfix.field.TradeQty get(quickfix.field.TradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeQty getTradeQty() throws FieldNotFound {
    return get(new quickfix.field.TradeQty());
  }

  public boolean isSet(quickfix.field.TradeQty field) {
    return isSetField(field);
  }

  public boolean isSetTradeQty() {
    return isSetField(1843);
  }
}

  public void set(quickfix.field.TradeQtyType value) {
    setField(value);
  }

  public quickfix.field.TradeQtyType get(quickfix.field.TradeQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeQtyType getTradeQtyType() throws FieldNotFound {
    return get(new quickfix.field.TradeQtyType());
  }

  public boolean isSet(quickfix.field.TradeQtyType field) {
    return isSetField(field);
  }

  public boolean isSetTradeQtyType() {
    return isSetField(1842);
  }

  public void set(quickfix.field.TradeQty value) {
    setField(value);
  }

  public quickfix.field.TradeQty get(quickfix.field.TradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeQty getTradeQty() throws FieldNotFound {
    return get(new quickfix.field.TradeQty());
  }

  public boolean isSet(quickfix.field.TradeQty field) {
    return isSetField(field);
  }

  public boolean isSetTradeQty() {
    return isSetField(1843);
  }
}
