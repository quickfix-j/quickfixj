/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class TradeAggregationRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DW";

  public TradeAggregationRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public TradeAggregationRequest (quickfix.field.TradeAggregationRequestID tradeAggregationRequestID, quickfix.field.TradeAggregationTransType tradeAggregationTransType, quickfix.field.Side side) {
    this();
    setField(tradeAggregationRequestID);
    setField(tradeAggregationTransType);
    setField(side);
  }

  public void set(quickfix.field.TradeAggregationRequestID value) {
    setField(value);
  }

  public quickfix.field.TradeAggregationRequestID get(quickfix.field.TradeAggregationRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAggregationRequestID getTradeAggregationRequestID() throws FieldNotFound {
    return get(new quickfix.field.TradeAggregationRequestID());
  }

  public boolean isSet(quickfix.field.TradeAggregationRequestID field) {
    return isSetField(field);
  }

  public boolean isSetTradeAggregationRequestID() {
    return isSetField(2786);
  }

  public void set(quickfix.field.TradeAggregationRequestRefID value) {
    setField(value);
  }

  public quickfix.field.TradeAggregationRequestRefID get(quickfix.field.TradeAggregationRequestRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAggregationRequestRefID getTradeAggregationRequestRefID() throws FieldNotFound {
    return get(new quickfix.field.TradeAggregationRequestRefID());
  }

  public boolean isSet(quickfix.field.TradeAggregationRequestRefID field) {
    return isSetField(field);
  }

  public boolean isSetTradeAggregationRequestRefID() {
    return isSetField(2787);
  }

  public void set(quickfix.field.TradeAggregationTransType value) {
    setField(value);
  }

  public quickfix.field.TradeAggregationTransType get(quickfix.field.TradeAggregationTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAggregationTransType getTradeAggregationTransType() throws FieldNotFound {
    return get(new quickfix.field.TradeAggregationTransType());
  }

  public boolean isSet(quickfix.field.TradeAggregationTransType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAggregationTransType() {
    return isSetField(2788);
  }

  public void set(quickfix.field.AggregatedQty value) {
    setField(value);
  }

  public quickfix.field.AggregatedQty get(quickfix.field.AggregatedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggregatedQty getAggregatedQty() throws FieldNotFound {
    return get(new quickfix.field.AggregatedQty());
  }

  public boolean isSet(quickfix.field.AggregatedQty field) {
    return isSetField(field);
  }

  public boolean isSetAggregatedQty() {
    return isSetField(2789);
  }

  public void set(quickfix.field.Currency value) {
    setField(value);
  }

  public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Currency getCurrency() throws FieldNotFound {
    return get(new quickfix.field.Currency());
  }

  public boolean isSet(quickfix.field.Currency field) {
    return isSetField(field);
  }

  public boolean isSetCurrency() {
    return isSetField(15);
  }

  public void set(quickfix.field.AvgPx value) {
    setField(value);
  }

  public quickfix.field.AvgPx get(quickfix.field.AvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPx getAvgPx() throws FieldNotFound {
    return get(new quickfix.field.AvgPx());
  }

  public boolean isSet(quickfix.field.AvgPx field) {
    return isSetField(field);
  }

  public boolean isSetAvgPx() {
    return isSetField(6);
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

  public void set(quickfix.field.PricePrecision value) {
    setField(value);
  }

  public quickfix.field.PricePrecision get(quickfix.field.PricePrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PricePrecision getPricePrecision() throws FieldNotFound {
    return get(new quickfix.field.PricePrecision());
  }

  public boolean isSet(quickfix.field.PricePrecision field) {
    return isSetField(field);
  }

  public boolean isSetPricePrecision() {
    return isSetField(2349);
  }

  public void set(quickfix.fixlatest.component.OrderAggregationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderAggregationGrp get(quickfix.fixlatest.component.OrderAggregationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderAggregationGrp getOrderAggregationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderAggregationGrp());
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

  public void set(quickfix.fixlatest.component.ExecutionAggregationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ExecutionAggregationGrp get(quickfix.fixlatest.component.ExecutionAggregationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ExecutionAggregationGrp getExecutionAggregationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ExecutionAggregationGrp());
  }

  public void set(quickfix.field.NoExecs value) {
    setField(value);
  }

  public quickfix.field.NoExecs get(quickfix.field.NoExecs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
    return get(new quickfix.field.NoExecs());
  }

  public boolean isSet(quickfix.field.NoExecs field) {
    return isSetField(field);
  }

  public boolean isSetNoExecs() {
    return isSetField(124);
  }

public static class NoExecs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {32, 17, 1003, 31, 0};

  public NoExecs() {
    super(124, 32, ORDER);
  }

  public void set(quickfix.field.LastQty value) {
    setField(value);
  }

  public quickfix.field.LastQty get(quickfix.field.LastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastQty getLastQty() throws FieldNotFound {
    return get(new quickfix.field.LastQty());
  }

  public boolean isSet(quickfix.field.LastQty field) {
    return isSetField(field);
  }

  public boolean isSetLastQty() {
    return isSetField(32);
  }

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }

  public void set(quickfix.field.TradeID value) {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound {
    return get(new quickfix.field.TradeID());
  }

  public boolean isSet(quickfix.field.TradeID field) {
    return isSetField(field);
  }

  public boolean isSetTradeID() {
    return isSetField(1003);
  }

  public void set(quickfix.field.LastPx value) {
    setField(value);
  }

  public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastPx getLastPx() throws FieldNotFound {
    return get(new quickfix.field.LastPx());
  }

  public boolean isSet(quickfix.field.LastPx field) {
    return isSetField(field);
  }

  public boolean isSetLastPx() {
    return isSetField(31);
  }
}

  public void set(quickfix.field.Account value) {
    setField(value);
  }

  public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Account getAccount() throws FieldNotFound {
    return get(new quickfix.field.Account());
  }

  public boolean isSet(quickfix.field.Account field) {
    return isSetField(field);
  }

  public boolean isSetAccount() {
    return isSetField(1);
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

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
  }

  public void set(quickfix.field.NoPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs() {
    return isSetField(802);
  }

public static class NoPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

  public NoPartySubIDs() {
    super(802, 523, ORDER);
  }

  public void set(quickfix.field.PartySubID value) {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PartySubID());
  }

  public boolean isSet(quickfix.field.PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPartySubID() {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartySubIDType());
  }

  public boolean isSet(quickfix.field.PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType() {
    return isSetField(803);
  }
}
}
}
