/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OrderEntryAckGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2428, };
  protected int[] getGroupFields() { return componentGroups; }

  public OrderEntryAckGrp() {
    super();
  }

  public void set(quickfix.field.NoOrderEntries value) {
    setField(value);
  }

  public quickfix.field.NoOrderEntries get(quickfix.field.NoOrderEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrderEntries getNoOrderEntries() throws FieldNotFound {
    return get(new quickfix.field.NoOrderEntries());
  }

  public boolean isSet(quickfix.field.NoOrderEntries field) {
    return isSetField(field);
  }

  public boolean isSetNoOrderEntries() {
    return isSetField(2428);
  }

public static class NoOrderEntries extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {39, 150, 2431, 2429, 2430, 11, 41, 37, 103, 14, 151, 84, 40, 44, 54, 59, 38, 152, 516, 468, 469, 55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 0};

  public NoOrderEntries() {
    super(2428, 39, ORDER);
  }

  public void set(quickfix.field.OrdStatus value) {
    setField(value);
  }

  public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
    return get(new quickfix.field.OrdStatus());
  }

  public boolean isSet(quickfix.field.OrdStatus field) {
    return isSetField(field);
  }

  public boolean isSetOrdStatus() {
    return isSetField(39);
  }

  public void set(quickfix.field.ExecType value) {
    setField(value);
  }

  public quickfix.field.ExecType get(quickfix.field.ExecType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecType getExecType() throws FieldNotFound {
    return get(new quickfix.field.ExecType());
  }

  public boolean isSet(quickfix.field.ExecType field) {
    return isSetField(field);
  }

  public boolean isSetExecType() {
    return isSetField(150);
  }

  public void set(quickfix.field.ExecTypeReason value) {
    setField(value);
  }

  public quickfix.field.ExecTypeReason get(quickfix.field.ExecTypeReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecTypeReason getExecTypeReason() throws FieldNotFound {
    return get(new quickfix.field.ExecTypeReason());
  }

  public boolean isSet(quickfix.field.ExecTypeReason field) {
    return isSetField(field);
  }

  public boolean isSetExecTypeReason() {
    return isSetField(2431);
  }

  public void set(quickfix.field.OrderEntryAction value) {
    setField(value);
  }

  public quickfix.field.OrderEntryAction get(quickfix.field.OrderEntryAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEntryAction getOrderEntryAction() throws FieldNotFound {
    return get(new quickfix.field.OrderEntryAction());
  }

  public boolean isSet(quickfix.field.OrderEntryAction field) {
    return isSetField(field);
  }

  public boolean isSetOrderEntryAction() {
    return isSetField(2429);
  }

  public void set(quickfix.field.OrderEntryID value) {
    setField(value);
  }

  public quickfix.field.OrderEntryID get(quickfix.field.OrderEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEntryID getOrderEntryID() throws FieldNotFound {
    return get(new quickfix.field.OrderEntryID());
  }

  public boolean isSet(quickfix.field.OrderEntryID field) {
    return isSetField(field);
  }

  public boolean isSetOrderEntryID() {
    return isSetField(2430);
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

  public void set(quickfix.field.OrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.OrigClOrdID());
  }

  public boolean isSet(quickfix.field.OrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID() {
    return isSetField(41);
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

  public void set(quickfix.field.OrdRejReason value) {
    setField(value);
  }

  public quickfix.field.OrdRejReason get(quickfix.field.OrdRejReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
    return get(new quickfix.field.OrdRejReason());
  }

  public boolean isSet(quickfix.field.OrdRejReason field) {
    return isSetField(field);
  }

  public boolean isSetOrdRejReason() {
    return isSetField(103);
  }

  public void set(quickfix.field.CumQty value) {
    setField(value);
  }

  public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CumQty getCumQty() throws FieldNotFound {
    return get(new quickfix.field.CumQty());
  }

  public boolean isSet(quickfix.field.CumQty field) {
    return isSetField(field);
  }

  public boolean isSetCumQty() {
    return isSetField(14);
  }

  public void set(quickfix.field.LeavesQty value) {
    setField(value);
  }

  public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
    return get(new quickfix.field.LeavesQty());
  }

  public boolean isSet(quickfix.field.LeavesQty field) {
    return isSetField(field);
  }

  public boolean isSetLeavesQty() {
    return isSetField(151);
  }

  public void set(quickfix.field.CxlQty value) {
    setField(value);
  }

  public quickfix.field.CxlQty get(quickfix.field.CxlQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CxlQty getCxlQty() throws FieldNotFound {
    return get(new quickfix.field.CxlQty());
  }

  public boolean isSet(quickfix.field.CxlQty field) {
    return isSetField(field);
  }

  public boolean isSetCxlQty() {
    return isSetField(84);
  }

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
  }

  public void set(quickfix.field.Price value) {
    setField(value);
  }

  public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Price getPrice() throws FieldNotFound {
    return get(new quickfix.field.Price());
  }

  public boolean isSet(quickfix.field.Price field) {
    return isSetField(field);
  }

  public boolean isSetPrice() {
    return isSetField(44);
  }

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.field.TimeInForce value) {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.TimeInForce());
  }

  public boolean isSet(quickfix.field.TimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetTimeInForce() {
    return isSetField(59);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
  }

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }
}

  public void set(quickfix.field.OrdStatus value) {
    setField(value);
  }

  public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
    return get(new quickfix.field.OrdStatus());
  }

  public boolean isSet(quickfix.field.OrdStatus field) {
    return isSetField(field);
  }

  public boolean isSetOrdStatus() {
    return isSetField(39);
  }

  public void set(quickfix.field.ExecType value) {
    setField(value);
  }

  public quickfix.field.ExecType get(quickfix.field.ExecType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecType getExecType() throws FieldNotFound {
    return get(new quickfix.field.ExecType());
  }

  public boolean isSet(quickfix.field.ExecType field) {
    return isSetField(field);
  }

  public boolean isSetExecType() {
    return isSetField(150);
  }

  public void set(quickfix.field.ExecTypeReason value) {
    setField(value);
  }

  public quickfix.field.ExecTypeReason get(quickfix.field.ExecTypeReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecTypeReason getExecTypeReason() throws FieldNotFound {
    return get(new quickfix.field.ExecTypeReason());
  }

  public boolean isSet(quickfix.field.ExecTypeReason field) {
    return isSetField(field);
  }

  public boolean isSetExecTypeReason() {
    return isSetField(2431);
  }

  public void set(quickfix.field.OrderEntryAction value) {
    setField(value);
  }

  public quickfix.field.OrderEntryAction get(quickfix.field.OrderEntryAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEntryAction getOrderEntryAction() throws FieldNotFound {
    return get(new quickfix.field.OrderEntryAction());
  }

  public boolean isSet(quickfix.field.OrderEntryAction field) {
    return isSetField(field);
  }

  public boolean isSetOrderEntryAction() {
    return isSetField(2429);
  }

  public void set(quickfix.field.OrderEntryID value) {
    setField(value);
  }

  public quickfix.field.OrderEntryID get(quickfix.field.OrderEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEntryID getOrderEntryID() throws FieldNotFound {
    return get(new quickfix.field.OrderEntryID());
  }

  public boolean isSet(quickfix.field.OrderEntryID field) {
    return isSetField(field);
  }

  public boolean isSetOrderEntryID() {
    return isSetField(2430);
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

  public void set(quickfix.field.OrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.OrigClOrdID());
  }

  public boolean isSet(quickfix.field.OrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID() {
    return isSetField(41);
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

  public void set(quickfix.field.OrdRejReason value) {
    setField(value);
  }

  public quickfix.field.OrdRejReason get(quickfix.field.OrdRejReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
    return get(new quickfix.field.OrdRejReason());
  }

  public boolean isSet(quickfix.field.OrdRejReason field) {
    return isSetField(field);
  }

  public boolean isSetOrdRejReason() {
    return isSetField(103);
  }

  public void set(quickfix.field.CumQty value) {
    setField(value);
  }

  public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CumQty getCumQty() throws FieldNotFound {
    return get(new quickfix.field.CumQty());
  }

  public boolean isSet(quickfix.field.CumQty field) {
    return isSetField(field);
  }

  public boolean isSetCumQty() {
    return isSetField(14);
  }

  public void set(quickfix.field.LeavesQty value) {
    setField(value);
  }

  public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
    return get(new quickfix.field.LeavesQty());
  }

  public boolean isSet(quickfix.field.LeavesQty field) {
    return isSetField(field);
  }

  public boolean isSetLeavesQty() {
    return isSetField(151);
  }

  public void set(quickfix.field.CxlQty value) {
    setField(value);
  }

  public quickfix.field.CxlQty get(quickfix.field.CxlQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CxlQty getCxlQty() throws FieldNotFound {
    return get(new quickfix.field.CxlQty());
  }

  public boolean isSet(quickfix.field.CxlQty field) {
    return isSetField(field);
  }

  public boolean isSetCxlQty() {
    return isSetField(84);
  }

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
  }

  public void set(quickfix.field.Price value) {
    setField(value);
  }

  public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Price getPrice() throws FieldNotFound {
    return get(new quickfix.field.Price());
  }

  public boolean isSet(quickfix.field.Price field) {
    return isSetField(field);
  }

  public boolean isSetPrice() {
    return isSetField(44);
  }

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.field.TimeInForce value) {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.TimeInForce());
  }

  public boolean isSet(quickfix.field.TimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetTimeInForce() {
    return isSetField(59);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
  }

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }
}
