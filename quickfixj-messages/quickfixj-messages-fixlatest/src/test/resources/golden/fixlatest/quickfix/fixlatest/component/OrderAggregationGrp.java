/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OrderAggregationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {73, };
  protected int[] getGroupFields() { return componentGroups; }

  public OrderAggregationGrp() {
    super();
  }

  public void set(quickfix.field.NoOrders value) {
    setField(value);
  }

  public quickfix.field.NoOrders get(quickfix.field.NoOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrders getNoOrders() throws FieldNotFound {
    return get(new quickfix.field.NoOrders());
  }

  public boolean isSet(quickfix.field.NoOrders field) {
    return isSetField(field);
  }

  public boolean isSetNoOrders() {
    return isSetField(73);
  }

public static class NoOrders extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {11, 37, 38, 799, 0};

  public NoOrders() {
    super(73, 11, ORDER);
  }

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.OrderID value) {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound {
    return get(new quickfix.field.OrderID());
  }

  public boolean isSet(quickfix.field.OrderID field) {
    return isSetField(field);
  }

  public boolean isSetOrderID() {
    return isSetField(37);
  }

  public void set(quickfix.field.OrderQty value) {
    setField(value);
  }

  public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
    return get(new quickfix.field.OrderQty());
  }

  public boolean isSet(quickfix.field.OrderQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty() {
    return isSetField(38);
  }

  public void set(quickfix.field.OrderAvgPx value) {
    setField(value);
  }

  public quickfix.field.OrderAvgPx get(quickfix.field.OrderAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAvgPx getOrderAvgPx() throws FieldNotFound {
    return get(new quickfix.field.OrderAvgPx());
  }

  public boolean isSet(quickfix.field.OrderAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetOrderAvgPx() {
    return isSetField(799);
  }
}

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.OrderID value) {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound {
    return get(new quickfix.field.OrderID());
  }

  public boolean isSet(quickfix.field.OrderID field) {
    return isSetField(field);
  }

  public boolean isSetOrderID() {
    return isSetField(37);
  }

  public void set(quickfix.field.OrderQty value) {
    setField(value);
  }

  public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
    return get(new quickfix.field.OrderQty());
  }

  public boolean isSet(quickfix.field.OrderQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty() {
    return isSetField(38);
  }

  public void set(quickfix.field.OrderAvgPx value) {
    setField(value);
  }

  public quickfix.field.OrderAvgPx get(quickfix.field.OrderAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAvgPx getOrderAvgPx() throws FieldNotFound {
    return get(new quickfix.field.OrderAvgPx());
  }

  public boolean isSet(quickfix.field.OrderAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetOrderAvgPx() {
    return isSetField(799);
  }
}
