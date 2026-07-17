/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class OrderCancelReplaceRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "G";

  public OrderCancelReplaceRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public OrderCancelReplaceRequest (quickfix.field.ClOrdID clOrdID, quickfix.field.Side side, quickfix.field.TransactTime transactTime, quickfix.field.OrdType ordType) {
    this();
    setField(clOrdID);
    setField(side);
    setField(transactTime);
    setField(ordType);
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

  public void set(quickfix.field.OrderRequestID value) {
    setField(value);
  }

  public quickfix.field.OrderRequestID get(quickfix.field.OrderRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRequestID getOrderRequestID() throws FieldNotFound {
    return get(new quickfix.field.OrderRequestID());
  }

  public boolean isSet(quickfix.field.OrderRequestID field) {
    return isSetField(field);
  }

  public boolean isSetOrderRequestID() {
    return isSetField(2422);
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

  public void set(quickfix.fixlatest.component.TargetParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TargetParties get(quickfix.fixlatest.component.TargetParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TargetParties getTargetPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TargetParties());
  }

  public void set(quickfix.field.NoTargetPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoTargetPartyIDs get(quickfix.field.NoTargetPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetPartyIDs getNoTargetPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoTargetPartyIDs());
  }

  public boolean isSet(quickfix.field.NoTargetPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetPartyIDs() {
    return isSetField(1461);
  }

public static class NoTargetPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1462, 1463, 1464, 1818, 2433, 0};

  public NoTargetPartyIDs() {
    super(1461, 1462, ORDER);
  }

  public void set(quickfix.field.TargetPartyID value) {
    setField(value);
  }

  public quickfix.field.TargetPartyID get(quickfix.field.TargetPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyID getTargetPartyID() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyID());
  }

  public boolean isSet(quickfix.field.TargetPartyID field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyID() {
    return isSetField(1462);
  }

  public void set(quickfix.field.TargetPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.TargetPartyIDSource get(quickfix.field.TargetPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyIDSource getTargetPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyIDSource());
  }

  public boolean isSet(quickfix.field.TargetPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyIDSource() {
    return isSetField(1463);
  }

  public void set(quickfix.field.TargetPartyRole value) {
    setField(value);
  }

  public quickfix.field.TargetPartyRole get(quickfix.field.TargetPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyRole getTargetPartyRole() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyRole());
  }

  public boolean isSet(quickfix.field.TargetPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyRole() {
    return isSetField(1464);
  }

  public void set(quickfix.field.TargetPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.TargetPartyRoleQualifier get(quickfix.field.TargetPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyRoleQualifier getTargetPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.TargetPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyRoleQualifier() {
    return isSetField(1818);
  }

  public void set(quickfix.fixlatest.component.TargetPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TargetPtysSubGrp get(quickfix.fixlatest.component.TargetPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TargetPtysSubGrp getTargetPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TargetPtysSubGrp());
  }

  public void set(quickfix.field.NoTargetPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoTargetPartySubIDs get(quickfix.field.NoTargetPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetPartySubIDs getNoTargetPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoTargetPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoTargetPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetPartySubIDs() {
    return isSetField(2433);
  }

public static class NoTargetPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2434, 2435, 0};

  public NoTargetPartySubIDs() {
    super(2433, 2434, ORDER);
  }

  public void set(quickfix.field.TargetPartySubID value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubID get(quickfix.field.TargetPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubID getTargetPartySubID() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubID());
  }

  public boolean isSet(quickfix.field.TargetPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubID() {
    return isSetField(2434);
  }

  public void set(quickfix.field.TargetPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubIDType get(quickfix.field.TargetPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubIDType getTargetPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubIDType());
  }

  public boolean isSet(quickfix.field.TargetPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubIDType() {
    return isSetField(2435);
  }
}
}

  public void set(quickfix.field.TradeOriginationDate value) {
    setField(value);
  }

  public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
    return get(new quickfix.field.TradeOriginationDate());
  }

  public boolean isSet(quickfix.field.TradeOriginationDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeOriginationDate() {
    return isSetField(229);
  }

  public void set(quickfix.field.TradeDate value) {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
    return get(new quickfix.field.TradeDate());
  }

  public boolean isSet(quickfix.field.TradeDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeDate() {
    return isSetField(75);
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

  public void set(quickfix.field.SecondaryClOrdID value) {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryClOrdID());
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID() {
    return isSetField(526);
  }

  public void set(quickfix.field.ClOrdLinkID value) {
    setField(value);
  }

  public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdLinkID());
  }

  public boolean isSet(quickfix.field.ClOrdLinkID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdLinkID() {
    return isSetField(583);
  }

  public void set(quickfix.field.DuplicateClOrdIDIndicator value) {
    setField(value);
  }

  public quickfix.field.DuplicateClOrdIDIndicator get(quickfix.field.DuplicateClOrdIDIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DuplicateClOrdIDIndicator getDuplicateClOrdIDIndicator() throws FieldNotFound {
    return get(new quickfix.field.DuplicateClOrdIDIndicator());
  }

  public boolean isSet(quickfix.field.DuplicateClOrdIDIndicator field) {
    return isSetField(field);
  }

  public boolean isSetDuplicateClOrdIDIndicator() {
    return isSetField(2829);
  }

  public void set(quickfix.field.ListID value) {
    setField(value);
  }

  public quickfix.field.ListID get(quickfix.field.ListID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListID getListID() throws FieldNotFound {
    return get(new quickfix.field.ListID());
  }

  public boolean isSet(quickfix.field.ListID field) {
    return isSetField(field);
  }

  public boolean isSetListID() {
    return isSetField(66);
  }

  public void set(quickfix.field.OrigOrdModTime value) {
    setField(value);
  }

  public quickfix.field.OrigOrdModTime get(quickfix.field.OrigOrdModTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
    return get(new quickfix.field.OrigOrdModTime());
  }

  public boolean isSet(quickfix.field.OrigOrdModTime field) {
    return isSetField(field);
  }

  public boolean isSetOrigOrdModTime() {
    return isSetField(586);
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

  public void set(quickfix.field.AcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AcctIDSource());
  }

  public boolean isSet(quickfix.field.AcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAcctIDSource() {
    return isSetField(660);
  }

  public void set(quickfix.field.AccountType value) {
    setField(value);
  }

  public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccountType getAccountType() throws FieldNotFound {
    return get(new quickfix.field.AccountType());
  }

  public boolean isSet(quickfix.field.AccountType field) {
    return isSetField(field);
  }

  public boolean isSetAccountType() {
    return isSetField(581);
  }

  public void set(quickfix.field.DayBookingInst value) {
    setField(value);
  }

  public quickfix.field.DayBookingInst get(quickfix.field.DayBookingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound {
    return get(new quickfix.field.DayBookingInst());
  }

  public boolean isSet(quickfix.field.DayBookingInst field) {
    return isSetField(field);
  }

  public boolean isSetDayBookingInst() {
    return isSetField(589);
  }

  public void set(quickfix.field.BookingUnit value) {
    setField(value);
  }

  public quickfix.field.BookingUnit get(quickfix.field.BookingUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound {
    return get(new quickfix.field.BookingUnit());
  }

  public boolean isSet(quickfix.field.BookingUnit field) {
    return isSetField(field);
  }

  public boolean isSetBookingUnit() {
    return isSetField(590);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.PreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PreAllocGrp get(quickfix.fixlatest.component.PreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PreAllocGrp getPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PreAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 2727, 539, 209, 80, 1752, 1753, 1754, 1755, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }
}

  public void set(quickfix.field.SettlType value) {
    setField(value);
  }

  public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlType getSettlType() throws FieldNotFound {
    return get(new quickfix.field.SettlType());
  }

  public boolean isSet(quickfix.field.SettlType field) {
    return isSetField(field);
  }

  public boolean isSetSettlType() {
    return isSetField(63);
  }

  public void set(quickfix.field.SettlDate value) {
    setField(value);
  }

  public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
    return get(new quickfix.field.SettlDate());
  }

  public boolean isSet(quickfix.field.SettlDate field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate() {
    return isSetField(64);
  }

  public void set(quickfix.field.CashMargin value) {
    setField(value);
  }

  public quickfix.field.CashMargin get(quickfix.field.CashMargin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashMargin getCashMargin() throws FieldNotFound {
    return get(new quickfix.field.CashMargin());
  }

  public boolean isSet(quickfix.field.CashMargin field) {
    return isSetField(field);
  }

  public boolean isSetCashMargin() {
    return isSetField(544);
  }

  public void set(quickfix.field.ClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearingFeeIndicator() {
    return isSetField(635);
  }

  public void set(quickfix.field.HandlInst value) {
    setField(value);
  }

  public quickfix.field.HandlInst get(quickfix.field.HandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HandlInst getHandlInst() throws FieldNotFound {
    return get(new quickfix.field.HandlInst());
  }

  public boolean isSet(quickfix.field.HandlInst field) {
    return isSetField(field);
  }

  public boolean isSetHandlInst() {
    return isSetField(21);
  }

  public void set(quickfix.field.ExecInst value) {
    setField(value);
  }

  public quickfix.field.ExecInst get(quickfix.field.ExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInst getExecInst() throws FieldNotFound {
    return get(new quickfix.field.ExecInst());
  }

  public boolean isSet(quickfix.field.ExecInst field) {
    return isSetField(field);
  }

  public boolean isSetExecInst() {
    return isSetField(18);
  }

  public void set(quickfix.field.AuctionInstruction value) {
    setField(value);
  }

  public quickfix.field.AuctionInstruction get(quickfix.field.AuctionInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionInstruction getAuctionInstruction() throws FieldNotFound {
    return get(new quickfix.field.AuctionInstruction());
  }

  public boolean isSet(quickfix.field.AuctionInstruction field) {
    return isSetField(field);
  }

  public boolean isSetAuctionInstruction() {
    return isSetField(1805);
  }

  public void set(quickfix.field.MinQty value) {
    setField(value);
  }

  public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinQty getMinQty() throws FieldNotFound {
    return get(new quickfix.field.MinQty());
  }

  public boolean isSet(quickfix.field.MinQty field) {
    return isSetField(field);
  }

  public boolean isSetMinQty() {
    return isSetField(110);
  }

  public void set(quickfix.field.MinQtyMethod value) {
    setField(value);
  }

  public quickfix.field.MinQtyMethod get(quickfix.field.MinQtyMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinQtyMethod getMinQtyMethod() throws FieldNotFound {
    return get(new quickfix.field.MinQtyMethod());
  }

  public boolean isSet(quickfix.field.MinQtyMethod field) {
    return isSetField(field);
  }

  public boolean isSetMinQtyMethod() {
    return isSetField(1822);
  }

  public void set(quickfix.field.MatchIncrement value) {
    setField(value);
  }

  public quickfix.field.MatchIncrement get(quickfix.field.MatchIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchIncrement getMatchIncrement() throws FieldNotFound {
    return get(new quickfix.field.MatchIncrement());
  }

  public boolean isSet(quickfix.field.MatchIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMatchIncrement() {
    return isSetField(1089);
  }

  public void set(quickfix.field.MaxPriceLevels value) {
    setField(value);
  }

  public quickfix.field.MaxPriceLevels get(quickfix.field.MaxPriceLevels value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaxPriceLevels getMaxPriceLevels() throws FieldNotFound {
    return get(new quickfix.field.MaxPriceLevels());
  }

  public boolean isSet(quickfix.field.MaxPriceLevels field) {
    return isSetField(field);
  }

  public boolean isSetMaxPriceLevels() {
    return isSetField(1090);
  }

  public void set(quickfix.field.MaximumPricePercentage value) {
    setField(value);
  }

  public quickfix.field.MaximumPricePercentage get(quickfix.field.MaximumPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaximumPricePercentage getMaximumPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.MaximumPricePercentage());
  }

  public boolean isSet(quickfix.field.MaximumPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetMaximumPricePercentage() {
    return isSetField(2676);
  }

  public void set(quickfix.fixlatest.component.ValueChecksGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ValueChecksGrp get(quickfix.fixlatest.component.ValueChecksGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ValueChecksGrp getValueChecksGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ValueChecksGrp());
  }

  public void set(quickfix.field.NoValueChecks value) {
    setField(value);
  }

  public quickfix.field.NoValueChecks get(quickfix.field.NoValueChecks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoValueChecks getNoValueChecks() throws FieldNotFound {
    return get(new quickfix.field.NoValueChecks());
  }

  public boolean isSet(quickfix.field.NoValueChecks field) {
    return isSetField(field);
  }

  public boolean isSetNoValueChecks() {
    return isSetField(1868);
  }

public static class NoValueChecks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1869, 1870, 0};

  public NoValueChecks() {
    super(1868, 1869, ORDER);
  }

  public void set(quickfix.field.ValueCheckType value) {
    setField(value);
  }

  public quickfix.field.ValueCheckType get(quickfix.field.ValueCheckType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValueCheckType getValueCheckType() throws FieldNotFound {
    return get(new quickfix.field.ValueCheckType());
  }

  public boolean isSet(quickfix.field.ValueCheckType field) {
    return isSetField(field);
  }

  public boolean isSetValueCheckType() {
    return isSetField(1869);
  }

  public void set(quickfix.field.ValueCheckAction value) {
    setField(value);
  }

  public quickfix.field.ValueCheckAction get(quickfix.field.ValueCheckAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValueCheckAction getValueCheckAction() throws FieldNotFound {
    return get(new quickfix.field.ValueCheckAction());
  }

  public boolean isSet(quickfix.field.ValueCheckAction field) {
    return isSetField(field);
  }

  public boolean isSetValueCheckAction() {
    return isSetField(1870);
  }
}

  public void set(quickfix.fixlatest.component.MatchingInstructions component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchingInstructions get(quickfix.fixlatest.component.MatchingInstructions component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchingInstructions getMatchingInstructionsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchingInstructions());
  }

  public void set(quickfix.field.NoMatchInst value) {
    setField(value);
  }

  public quickfix.field.NoMatchInst get(quickfix.field.NoMatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchInst getNoMatchInst() throws FieldNotFound {
    return get(new quickfix.field.NoMatchInst());
  }

  public boolean isSet(quickfix.field.NoMatchInst field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchInst() {
    return isSetField(1624);
  }

public static class NoMatchInst extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1625, 1673, 1626, 1627, 0};

  public NoMatchInst() {
    super(1624, 1625, ORDER);
  }

  public void set(quickfix.field.MatchInst value) {
    setField(value);
  }

  public quickfix.field.MatchInst get(quickfix.field.MatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInst getMatchInst() throws FieldNotFound {
    return get(new quickfix.field.MatchInst());
  }

  public boolean isSet(quickfix.field.MatchInst field) {
    return isSetField(field);
  }

  public boolean isSetMatchInst() {
    return isSetField(1625);
  }

  public void set(quickfix.field.MatchInstMarketID value) {
    setField(value);
  }

  public quickfix.field.MatchInstMarketID get(quickfix.field.MatchInstMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInstMarketID getMatchInstMarketID() throws FieldNotFound {
    return get(new quickfix.field.MatchInstMarketID());
  }

  public boolean isSet(quickfix.field.MatchInstMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMatchInstMarketID() {
    return isSetField(1673);
  }

  public void set(quickfix.field.MatchAttribTagID value) {
    setField(value);
  }

  public quickfix.field.MatchAttribTagID get(quickfix.field.MatchAttribTagID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribTagID getMatchAttribTagID() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribTagID());
  }

  public boolean isSet(quickfix.field.MatchAttribTagID field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribTagID() {
    return isSetField(1626);
  }

  public void set(quickfix.field.MatchAttribValue value) {
    setField(value);
  }

  public quickfix.field.MatchAttribValue get(quickfix.field.MatchAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribValue getMatchAttribValue() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribValue());
  }

  public boolean isSet(quickfix.field.MatchAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribValue() {
    return isSetField(1627);
  }
}

  public void set(quickfix.field.SelfMatchPreventionID value) {
    setField(value);
  }

  public quickfix.field.SelfMatchPreventionID get(quickfix.field.SelfMatchPreventionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SelfMatchPreventionID getSelfMatchPreventionID() throws FieldNotFound {
    return get(new quickfix.field.SelfMatchPreventionID());
  }

  public boolean isSet(quickfix.field.SelfMatchPreventionID field) {
    return isSetField(field);
  }

  public boolean isSetSelfMatchPreventionID() {
    return isSetField(2362);
  }

  public void set(quickfix.fixlatest.component.DisplayInstruction component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DisplayInstruction get(quickfix.fixlatest.component.DisplayInstruction component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DisplayInstruction getDisplayInstructionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DisplayInstruction());
  }

  public void set(quickfix.fixlatest.component.DisclosureInstructionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DisclosureInstructionGrp get(quickfix.fixlatest.component.DisclosureInstructionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DisclosureInstructionGrp getDisclosureInstructionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DisclosureInstructionGrp());
  }

  public void set(quickfix.field.NoDisclosureInstructions value) {
    setField(value);
  }

  public quickfix.field.NoDisclosureInstructions get(quickfix.field.NoDisclosureInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDisclosureInstructions getNoDisclosureInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoDisclosureInstructions());
  }

  public boolean isSet(quickfix.field.NoDisclosureInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoDisclosureInstructions() {
    return isSetField(1812);
  }

public static class NoDisclosureInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1813, 1814, 0};

  public NoDisclosureInstructions() {
    super(1812, 1813, ORDER);
  }

  public void set(quickfix.field.DisclosureType value) {
    setField(value);
  }

  public quickfix.field.DisclosureType get(quickfix.field.DisclosureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisclosureType getDisclosureType() throws FieldNotFound {
    return get(new quickfix.field.DisclosureType());
  }

  public boolean isSet(quickfix.field.DisclosureType field) {
    return isSetField(field);
  }

  public boolean isSetDisclosureType() {
    return isSetField(1813);
  }

  public void set(quickfix.field.DisclosureInstruction value) {
    setField(value);
  }

  public quickfix.field.DisclosureInstruction get(quickfix.field.DisclosureInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisclosureInstruction getDisclosureInstruction() throws FieldNotFound {
    return get(new quickfix.field.DisclosureInstruction());
  }

  public boolean isSet(quickfix.field.DisclosureInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDisclosureInstruction() {
    return isSetField(1814);
  }
}

  public void set(quickfix.field.MaxFloor value) {
    setField(value);
  }

  public quickfix.field.MaxFloor get(quickfix.field.MaxFloor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaxFloor getMaxFloor() throws FieldNotFound {
    return get(new quickfix.field.MaxFloor());
  }

  public boolean isSet(quickfix.field.MaxFloor field) {
    return isSetField(field);
  }

  public boolean isSetMaxFloor() {
    return isSetField(111);
  }

  public void set(quickfix.field.MarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentID() {
    return isSetField(1300);
  }

  public void set(quickfix.field.ExDestination value) {
    setField(value);
  }

  public quickfix.field.ExDestination get(quickfix.field.ExDestination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDestination getExDestination() throws FieldNotFound {
    return get(new quickfix.field.ExDestination());
  }

  public boolean isSet(quickfix.field.ExDestination field) {
    return isSetField(field);
  }

  public boolean isSetExDestination() {
    return isSetField(100);
  }

  public void set(quickfix.field.ExDestinationIDSource value) {
    setField(value);
  }

  public quickfix.field.ExDestinationIDSource get(quickfix.field.ExDestinationIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDestinationIDSource getExDestinationIDSource() throws FieldNotFound {
    return get(new quickfix.field.ExDestinationIDSource());
  }

  public boolean isSet(quickfix.field.ExDestinationIDSource field) {
    return isSetField(field);
  }

  public boolean isSetExDestinationIDSource() {
    return isSetField(1133);
  }

  public void set(quickfix.field.ExDestinationType value) {
    setField(value);
  }

  public quickfix.field.ExDestinationType get(quickfix.field.ExDestinationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDestinationType getExDestinationType() throws FieldNotFound {
    return get(new quickfix.field.ExDestinationType());
  }

  public boolean isSet(quickfix.field.ExDestinationType field) {
    return isSetField(field);
  }

  public boolean isSetExDestinationType() {
    return isSetField(2704);
  }

  public void set(quickfix.fixlatest.component.TrdgSesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdgSesGrp get(quickfix.fixlatest.component.TrdgSesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdgSesGrp getTrdgSesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdgSesGrp());
  }

  public void set(quickfix.field.NoTradingSessions value) {
    setField(value);
  }

  public quickfix.field.NoTradingSessions get(quickfix.field.NoTradingSessions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradingSessions getNoTradingSessions() throws FieldNotFound {
    return get(new quickfix.field.NoTradingSessions());
  }

  public boolean isSet(quickfix.field.NoTradingSessions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradingSessions() {
    return isSetField(386);
  }

public static class NoTradingSessions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {336, 625, 0};

  public NoTradingSessions() {
    super(386, 336, ORDER);
  }

  public void set(quickfix.field.TradingSessionID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionID());
  }

  public boolean isSet(quickfix.field.TradingSessionID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID() {
    return isSetField(336);
  }

  public void set(quickfix.field.TradingSessionSubID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionSubID());
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID() {
    return isSetField(625);
  }
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

  public void set(quickfix.fixlatest.component.FinancingDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FinancingDetails get(quickfix.fixlatest.component.FinancingDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FinancingDetails getFinancingDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FinancingDetails());
  }

  public void set(quickfix.fixlatest.component.UndInstrmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndInstrmtGrp get(quickfix.fixlatest.component.UndInstrmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndInstrmtGrp getUndInstrmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndInstrmtGrp());
  }

  public void set(quickfix.field.NoUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyings());
  }

  public boolean isSet(quickfix.field.NoUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyings() {
    return isSetField(711);
  }

public static class NoUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {311, 312, 309, 305, 457, 2874, 462, 1874, 1875, 1876, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1981, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2080, 2312, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2045, 2295, 2296, 2297, 2756, 2298, 2299, 40964, 40962, 40965, 41949, 41950, 41947, 41951, 41952, 41953, 41859, 41864, 41860, 41866, 41868, 41861, 41862, 41863, 41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, 43076, 43077, 43074, 43078, 43079, 43080, 43081, 43082, 41822, 41820, 41841, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, 41846, 41844, 41856, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, 42888, 42889, 42890, 42891, 42892, 42893, 42894, 40540, 42149, 42036, 42068, 42041, 42060, 43004, 43005, 42860, 42861, 42855, 42884, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, 0};

  public NoUnderlyings() {
    super(711, 311, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingInstrument get(quickfix.fixlatest.component.UnderlyingInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingInstrument getUnderlyingInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingInstrument());
  }
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

  public void set(quickfix.field.ShortMarkingExemptIndicator value) {
    setField(value);
  }

  public quickfix.field.ShortMarkingExemptIndicator get(quickfix.field.ShortMarkingExemptIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortMarkingExemptIndicator getShortMarkingExemptIndicator() throws FieldNotFound {
    return get(new quickfix.field.ShortMarkingExemptIndicator());
  }

  public boolean isSet(quickfix.field.ShortMarkingExemptIndicator field) {
    return isSetField(field);
  }

  public boolean isSetShortMarkingExemptIndicator() {
    return isSetField(2102);
  }

  public void set(quickfix.field.ShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.ShortSaleExemptionReason get(quickfix.field.ShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortSaleExemptionReason getShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.ShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.ShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetShortSaleExemptionReason() {
    return isSetField(1688);
  }

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
  }

  public void set(quickfix.field.QtyType value) {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound {
    return get(new quickfix.field.QtyType());
  }

  public boolean isSet(quickfix.field.QtyType field) {
    return isSetField(field);
  }

  public boolean isSetQtyType() {
    return isSetField(854);
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

  public void set(quickfix.field.PriceType value) {
    setField(value);
  }

  public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceType getPriceType() throws FieldNotFound {
    return get(new quickfix.field.PriceType());
  }

  public boolean isSet(quickfix.field.PriceType field) {
    return isSetField(field);
  }

  public boolean isSetPriceType() {
    return isSetField(423);
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

  public void set(quickfix.field.CurrentWorkingPrice value) {
    setField(value);
  }

  public quickfix.field.CurrentWorkingPrice get(quickfix.field.CurrentWorkingPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentWorkingPrice getCurrentWorkingPrice() throws FieldNotFound {
    return get(new quickfix.field.CurrentWorkingPrice());
  }

  public boolean isSet(quickfix.field.CurrentWorkingPrice field) {
    return isSetField(field);
  }

  public boolean isSetCurrentWorkingPrice() {
    return isSetField(2838);
  }

  public void set(quickfix.field.PriceProtectionScope value) {
    setField(value);
  }

  public quickfix.field.PriceProtectionScope get(quickfix.field.PriceProtectionScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceProtectionScope getPriceProtectionScope() throws FieldNotFound {
    return get(new quickfix.field.PriceProtectionScope());
  }

  public boolean isSet(quickfix.field.PriceProtectionScope field) {
    return isSetField(field);
  }

  public boolean isSetPriceProtectionScope() {
    return isSetField(1092);
  }

  public void set(quickfix.field.StopPx value) {
    setField(value);
  }

  public quickfix.field.StopPx get(quickfix.field.StopPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StopPx getStopPx() throws FieldNotFound {
    return get(new quickfix.field.StopPx());
  }

  public boolean isSet(quickfix.field.StopPx field) {
    return isSetField(field);
  }

  public boolean isSetStopPx() {
    return isSetField(99);
  }

  public void set(quickfix.fixlatest.component.TriggeringInstruction component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TriggeringInstruction get(quickfix.fixlatest.component.TriggeringInstruction component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TriggeringInstruction getTriggeringInstructionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TriggeringInstruction());
  }

  public void set(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData get(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SpreadOrBenchmarkCurveData());
  }

  public void set(quickfix.fixlatest.component.YieldData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.YieldData get(quickfix.fixlatest.component.YieldData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.YieldData getYieldDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.YieldData());
  }

  public void set(quickfix.fixlatest.component.PegInstructions component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PegInstructions get(quickfix.fixlatest.component.PegInstructions component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PegInstructions getPegInstructionsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PegInstructions());
  }

  public void set(quickfix.fixlatest.component.DiscretionInstructions component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DiscretionInstructions get(quickfix.fixlatest.component.DiscretionInstructions component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DiscretionInstructions getDiscretionInstructionsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DiscretionInstructions());
  }

  public void set(quickfix.field.TargetStrategy value) {
    setField(value);
  }

  public quickfix.field.TargetStrategy get(quickfix.field.TargetStrategy value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetStrategy getTargetStrategy() throws FieldNotFound {
    return get(new quickfix.field.TargetStrategy());
  }

  public boolean isSet(quickfix.field.TargetStrategy field) {
    return isSetField(field);
  }

  public boolean isSetTargetStrategy() {
    return isSetField(847);
  }

  public void set(quickfix.fixlatest.component.StrategyParametersGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StrategyParametersGrp get(quickfix.fixlatest.component.StrategyParametersGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StrategyParametersGrp getStrategyParametersGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StrategyParametersGrp());
  }

  public void set(quickfix.field.NoStrategyParameters value) {
    setField(value);
  }

  public quickfix.field.NoStrategyParameters get(quickfix.field.NoStrategyParameters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrategyParameters getNoStrategyParameters() throws FieldNotFound {
    return get(new quickfix.field.NoStrategyParameters());
  }

  public boolean isSet(quickfix.field.NoStrategyParameters field) {
    return isSetField(field);
  }

  public boolean isSetNoStrategyParameters() {
    return isSetField(957);
  }

public static class NoStrategyParameters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {958, 959, 960, 0};

  public NoStrategyParameters() {
    super(957, 958, ORDER);
  }

  public void set(quickfix.field.StrategyParameterName value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterName get(quickfix.field.StrategyParameterName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterName getStrategyParameterName() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterName());
  }

  public boolean isSet(quickfix.field.StrategyParameterName field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterName() {
    return isSetField(958);
  }

  public void set(quickfix.field.StrategyParameterType value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterType get(quickfix.field.StrategyParameterType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterType getStrategyParameterType() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterType());
  }

  public boolean isSet(quickfix.field.StrategyParameterType field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterType() {
    return isSetField(959);
  }

  public void set(quickfix.field.StrategyParameterValue value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterValue get(quickfix.field.StrategyParameterValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterValue getStrategyParameterValue() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterValue());
  }

  public boolean isSet(quickfix.field.StrategyParameterValue field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterValue() {
    return isSetField(960);
  }
}

  public void set(quickfix.field.TargetStrategyParameters value) {
    setField(value);
  }

  public quickfix.field.TargetStrategyParameters get(quickfix.field.TargetStrategyParameters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetStrategyParameters getTargetStrategyParameters() throws FieldNotFound {
    return get(new quickfix.field.TargetStrategyParameters());
  }

  public boolean isSet(quickfix.field.TargetStrategyParameters field) {
    return isSetField(field);
  }

  public boolean isSetTargetStrategyParameters() {
    return isSetField(848);
  }

  public void set(quickfix.field.ParticipationRate value) {
    setField(value);
  }

  public quickfix.field.ParticipationRate get(quickfix.field.ParticipationRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParticipationRate getParticipationRate() throws FieldNotFound {
    return get(new quickfix.field.ParticipationRate());
  }

  public boolean isSet(quickfix.field.ParticipationRate field) {
    return isSetField(field);
  }

  public boolean isSetParticipationRate() {
    return isSetField(849);
  }

  public void set(quickfix.field.ComplianceID value) {
    setField(value);
  }

  public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
    return get(new quickfix.field.ComplianceID());
  }

  public boolean isSet(quickfix.field.ComplianceID field) {
    return isSetField(field);
  }

  public boolean isSetComplianceID() {
    return isSetField(376);
  }

  public void set(quickfix.field.ComplianceText value) {
    setField(value);
  }

  public quickfix.field.ComplianceText get(quickfix.field.ComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceText getComplianceText() throws FieldNotFound {
    return get(new quickfix.field.ComplianceText());
  }

  public boolean isSet(quickfix.field.ComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetComplianceText() {
    return isSetField(2404);
  }

  public void set(quickfix.field.EncodedComplianceTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceTextLen get(quickfix.field.EncodedComplianceTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceTextLen getEncodedComplianceTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceTextLen());
  }

  public boolean isSet(quickfix.field.EncodedComplianceTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceTextLen() {
    return isSetField(2351);
  }

  public void set(quickfix.field.EncodedComplianceText value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceText get(quickfix.field.EncodedComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceText getEncodedComplianceText() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceText());
  }

  public boolean isSet(quickfix.field.EncodedComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceText() {
    return isSetField(2352);
  }

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
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

  public void set(quickfix.field.EffectiveTime value) {
    setField(value);
  }

  public quickfix.field.EffectiveTime get(quickfix.field.EffectiveTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
    return get(new quickfix.field.EffectiveTime());
  }

  public boolean isSet(quickfix.field.EffectiveTime field) {
    return isSetField(field);
  }

  public boolean isSetEffectiveTime() {
    return isSetField(168);
  }

  public void set(quickfix.field.ExpireDate value) {
    setField(value);
  }

  public quickfix.field.ExpireDate get(quickfix.field.ExpireDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireDate getExpireDate() throws FieldNotFound {
    return get(new quickfix.field.ExpireDate());
  }

  public boolean isSet(quickfix.field.ExpireDate field) {
    return isSetField(field);
  }

  public boolean isSetExpireDate() {
    return isSetField(432);
  }

  public void set(quickfix.field.ExpireTime value) {
    setField(value);
  }

  public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
    return get(new quickfix.field.ExpireTime());
  }

  public boolean isSet(quickfix.field.ExpireTime field) {
    return isSetField(field);
  }

  public boolean isSetExpireTime() {
    return isSetField(126);
  }

  public void set(quickfix.field.GTBookingInst value) {
    setField(value);
  }

  public quickfix.field.GTBookingInst get(quickfix.field.GTBookingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.GTBookingInst getGTBookingInst() throws FieldNotFound {
    return get(new quickfix.field.GTBookingInst());
  }

  public boolean isSet(quickfix.field.GTBookingInst field) {
    return isSetField(field);
  }

  public boolean isSetGTBookingInst() {
    return isSetField(427);
  }

  public void set(quickfix.field.ExposureDuration value) {
    setField(value);
  }

  public quickfix.field.ExposureDuration get(quickfix.field.ExposureDuration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDuration getExposureDuration() throws FieldNotFound {
    return get(new quickfix.field.ExposureDuration());
  }

  public boolean isSet(quickfix.field.ExposureDuration field) {
    return isSetField(field);
  }

  public boolean isSetExposureDuration() {
    return isSetField(1629);
  }

  public void set(quickfix.field.ExposureDurationUnit value) {
    setField(value);
  }

  public quickfix.field.ExposureDurationUnit get(quickfix.field.ExposureDurationUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDurationUnit getExposureDurationUnit() throws FieldNotFound {
    return get(new quickfix.field.ExposureDurationUnit());
  }

  public boolean isSet(quickfix.field.ExposureDurationUnit field) {
    return isSetField(field);
  }

  public boolean isSetExposureDurationUnit() {
    return isSetField(1916);
  }

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
  }

  public void set(quickfix.fixlatest.component.CommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionDataGrp get(quickfix.fixlatest.component.CommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionDataGrp getCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionDataGrp());
  }

  public void set(quickfix.field.NoCommissions value) {
    setField(value);
  }

  public quickfix.field.NoCommissions get(quickfix.field.NoCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCommissions getNoCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoCommissions());
  }

  public boolean isSet(quickfix.field.NoCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoCommissions() {
    return isSetField(2639);
  }

public static class NoCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2640, 2641, 2725, 2642, 2643, 2644, 2645, 2646, 2647, 2648, 2649, 2650, 2651, 2652, 0};

  public NoCommissions() {
    super(2639, 2640, ORDER);
  }

  public void set(quickfix.field.CommissionAmount value) {
    setField(value);
  }

  public quickfix.field.CommissionAmount get(quickfix.field.CommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmount getCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmount());
  }

  public boolean isSet(quickfix.field.CommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmount() {
    return isSetField(2640);
  }

  public void set(quickfix.field.CommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountType get(quickfix.field.CommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountType getCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountType());
  }

  public boolean isSet(quickfix.field.CommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountType() {
    return isSetField(2641);
  }

  public void set(quickfix.field.CommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountSubType get(quickfix.field.CommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountSubType getCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.CommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountSubType() {
    return isSetField(2725);
  }

  public void set(quickfix.field.CommissionBasis value) {
    setField(value);
  }

  public quickfix.field.CommissionBasis get(quickfix.field.CommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionBasis getCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.CommissionBasis());
  }

  public boolean isSet(quickfix.field.CommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetCommissionBasis() {
    return isSetField(2642);
  }

  public void set(quickfix.field.CommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionCurrency get(quickfix.field.CommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionCurrency getCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionCurrency());
  }

  public boolean isSet(quickfix.field.CommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionCurrency() {
    return isSetField(2643);
  }

  public void set(quickfix.field.CommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasure get(quickfix.field.CommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasure getCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasure() {
    return isSetField(2644);
  }

  public void set(quickfix.field.CommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency get(quickfix.field.CommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency getCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasureCurrency() {
    return isSetField(2645);
  }

  public void set(quickfix.field.CommissionRate value) {
    setField(value);
  }

  public quickfix.field.CommissionRate get(quickfix.field.CommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionRate getCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.CommissionRate());
  }

  public boolean isSet(quickfix.field.CommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetCommissionRate() {
    return isSetField(2646);
  }

  public void set(quickfix.field.CommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.CommissionSharedIndicator get(quickfix.field.CommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionSharedIndicator getCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.CommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.CommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCommissionSharedIndicator() {
    return isSetField(2647);
  }

  public void set(quickfix.field.CommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountShared get(quickfix.field.CommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountShared getCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountShared());
  }

  public boolean isSet(quickfix.field.CommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountShared() {
    return isSetField(2648);
  }

  public void set(quickfix.field.CommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.CommissionLegRefID get(quickfix.field.CommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionLegRefID getCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.CommissionLegRefID());
  }

  public boolean isSet(quickfix.field.CommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetCommissionLegRefID() {
    return isSetField(2649);
  }

  public void set(quickfix.field.CommissionDesc value) {
    setField(value);
  }

  public quickfix.field.CommissionDesc get(quickfix.field.CommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionDesc getCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.CommissionDesc());
  }

  public boolean isSet(quickfix.field.CommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetCommissionDesc() {
    return isSetField(2650);
  }

  public void set(quickfix.field.EncodedCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDescLen get(quickfix.field.EncodedCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDescLen getEncodedCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDescLen() {
    return isSetField(2651);
  }

  public void set(quickfix.field.EncodedCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDesc get(quickfix.field.EncodedCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDesc getEncodedCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDesc() {
    return isSetField(2652);
  }
}

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.TradingCapacity value) {
    setField(value);
  }

  public quickfix.field.TradingCapacity get(quickfix.field.TradingCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingCapacity getTradingCapacity() throws FieldNotFound {
    return get(new quickfix.field.TradingCapacity());
  }

  public boolean isSet(quickfix.field.TradingCapacity field) {
    return isSetField(field);
  }

  public boolean isSetTradingCapacity() {
    return isSetField(1815);
  }

  public void set(quickfix.field.PreTradeAnonymity value) {
    setField(value);
  }

  public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
    return get(new quickfix.field.PreTradeAnonymity());
  }

  public boolean isSet(quickfix.field.PreTradeAnonymity field) {
    return isSetField(field);
  }

  public boolean isSetPreTradeAnonymity() {
    return isSetField(1091);
  }

  public void set(quickfix.field.TradePublishIndicator value) {
    setField(value);
  }

  public quickfix.field.TradePublishIndicator get(quickfix.field.TradePublishIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePublishIndicator getTradePublishIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradePublishIndicator());
  }

  public boolean isSet(quickfix.field.TradePublishIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradePublishIndicator() {
    return isSetField(1390);
  }

  public void set(quickfix.field.CustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.CustOrderCapacity());
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity() {
    return isSetField(582);
  }

  public void set(quickfix.fixlatest.component.OrderAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderAttributeGrp get(quickfix.fixlatest.component.OrderAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderAttributeGrp getOrderAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderAttributeGrp());
  }

  public void set(quickfix.field.NoOrderAttributes value) {
    setField(value);
  }

  public quickfix.field.NoOrderAttributes get(quickfix.field.NoOrderAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrderAttributes getNoOrderAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoOrderAttributes());
  }

  public boolean isSet(quickfix.field.NoOrderAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoOrderAttributes() {
    return isSetField(2593);
  }

public static class NoOrderAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2594, 2595, 0};

  public NoOrderAttributes() {
    super(2593, 2594, ORDER);
  }

  public void set(quickfix.field.OrderAttributeType value) {
    setField(value);
  }

  public quickfix.field.OrderAttributeType get(quickfix.field.OrderAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAttributeType getOrderAttributeType() throws FieldNotFound {
    return get(new quickfix.field.OrderAttributeType());
  }

  public boolean isSet(quickfix.field.OrderAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetOrderAttributeType() {
    return isSetField(2594);
  }

  public void set(quickfix.field.OrderAttributeValue value) {
    setField(value);
  }

  public quickfix.field.OrderAttributeValue get(quickfix.field.OrderAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAttributeValue getOrderAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.OrderAttributeValue());
  }

  public boolean isSet(quickfix.field.OrderAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetOrderAttributeValue() {
    return isSetField(2595);
  }
}

  public void set(quickfix.field.ForexReq value) {
    setField(value);
  }

  public quickfix.field.ForexReq get(quickfix.field.ForexReq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ForexReq getForexReq() throws FieldNotFound {
    return get(new quickfix.field.ForexReq());
  }

  public boolean isSet(quickfix.field.ForexReq field) {
    return isSetField(field);
  }

  public boolean isSetForexReq() {
    return isSetField(121);
  }

  public void set(quickfix.field.SettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrency());
  }

  public boolean isSet(quickfix.field.SettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrency() {
    return isSetField(120);
  }

  public void set(quickfix.fixlatest.component.RateSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RateSource get(quickfix.fixlatest.component.RateSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RateSource getRateSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RateSource());
  }

  public void set(quickfix.field.NoRateSources value) {
    setField(value);
  }

  public quickfix.field.NoRateSources get(quickfix.field.NoRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRateSources getNoRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoRateSources());
  }

  public boolean isSet(quickfix.field.NoRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoRateSources() {
    return isSetField(1445);
  }

public static class NoRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1446, 1447, 1448, 2412, 2796, 0};

  public NoRateSources() {
    super(1445, 1446, ORDER);
  }

  public void set(quickfix.field.RateSource value) {
    setField(value);
  }

  public quickfix.field.RateSource get(quickfix.field.RateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSource getRateSource() throws FieldNotFound {
    return get(new quickfix.field.RateSource());
  }

  public boolean isSet(quickfix.field.RateSource field) {
    return isSetField(field);
  }

  public boolean isSetRateSource() {
    return isSetField(1446);
  }

  public void set(quickfix.field.RateSourceType value) {
    setField(value);
  }

  public quickfix.field.RateSourceType get(quickfix.field.RateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceType getRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.RateSourceType());
  }

  public boolean isSet(quickfix.field.RateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceType() {
    return isSetField(1447);
  }

  public void set(quickfix.field.ReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReferencePage get(quickfix.field.ReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferencePage getReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReferencePage());
  }

  public boolean isSet(quickfix.field.ReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReferencePage() {
    return isSetField(1448);
  }

  public void set(quickfix.field.RateSourceReferemcePageHeading value) {
    setField(value);
  }

  public quickfix.field.RateSourceReferemcePageHeading get(quickfix.field.RateSourceReferemcePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RateSourceReferemcePageHeading getRateSourceReferemcePageHeading() throws FieldNotFound {
    return get(new quickfix.field.RateSourceReferemcePageHeading());
  }

  public boolean isSet(quickfix.field.RateSourceReferemcePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetRateSourceReferemcePageHeading() {
    return isSetField(2412);
  }

  public void set(quickfix.field.FXBenchmarkRateFix value) {
    setField(value);
  }

  public quickfix.field.FXBenchmarkRateFix get(quickfix.field.FXBenchmarkRateFix value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FXBenchmarkRateFix getFXBenchmarkRateFix() throws FieldNotFound {
    return get(new quickfix.field.FXBenchmarkRateFix());
  }

  public boolean isSet(quickfix.field.FXBenchmarkRateFix field) {
    return isSetField(field);
  }

  public boolean isSetFXBenchmarkRateFix() {
    return isSetField(2796);
  }
}

  public void set(quickfix.field.OffshoreIndicator value) {
    setField(value);
  }

  public quickfix.field.OffshoreIndicator get(quickfix.field.OffshoreIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OffshoreIndicator getOffshoreIndicator() throws FieldNotFound {
    return get(new quickfix.field.OffshoreIndicator());
  }

  public boolean isSet(quickfix.field.OffshoreIndicator field) {
    return isSetField(field);
  }

  public boolean isSetOffshoreIndicator() {
    return isSetField(2795);
  }

  public void set(quickfix.field.BookingType value) {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound {
    return get(new quickfix.field.BookingType());
  }

  public boolean isSet(quickfix.field.BookingType field) {
    return isSetField(field);
  }

  public boolean isSetBookingType() {
    return isSetField(775);
  }

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }

  public void set(quickfix.field.SettlDate2 value) {
    setField(value);
  }

  public quickfix.field.SettlDate2 get(quickfix.field.SettlDate2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate2 getSettlDate2() throws FieldNotFound {
    return get(new quickfix.field.SettlDate2());
  }

  public boolean isSet(quickfix.field.SettlDate2 field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate2() {
    return isSetField(193);
  }

  public void set(quickfix.field.OrderQty2 value) {
    setField(value);
  }

  public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
    return get(new quickfix.field.OrderQty2());
  }

  public boolean isSet(quickfix.field.OrderQty2 field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty2() {
    return isSetField(192);
  }

  public void set(quickfix.field.Price2 value) {
    setField(value);
  }

  public quickfix.field.Price2 get(quickfix.field.Price2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Price2 getPrice2() throws FieldNotFound {
    return get(new quickfix.field.Price2());
  }

  public boolean isSet(quickfix.field.Price2 field) {
    return isSetField(field);
  }

  public boolean isSetPrice2() {
    return isSetField(640);
  }

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
  }

  public void set(quickfix.field.CoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.CoveredOrUncovered get(quickfix.field.CoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.CoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.CoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetCoveredOrUncovered() {
    return isSetField(203);
  }

  public void set(quickfix.field.MaxShow value) {
    setField(value);
  }

  public quickfix.field.MaxShow get(quickfix.field.MaxShow value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaxShow getMaxShow() throws FieldNotFound {
    return get(new quickfix.field.MaxShow());
  }

  public boolean isSet(quickfix.field.MaxShow field) {
    return isSetField(field);
  }

  public boolean isSetMaxShow() {
    return isSetField(210);
  }

  public void set(quickfix.field.LocateReqd value) {
    setField(value);
  }

  public quickfix.field.LocateReqd get(quickfix.field.LocateReqd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LocateReqd getLocateReqd() throws FieldNotFound {
    return get(new quickfix.field.LocateReqd());
  }

  public boolean isSet(quickfix.field.LocateReqd field) {
    return isSetField(field);
  }

  public boolean isSetLocateReqd() {
    return isSetField(114);
  }

  public void set(quickfix.field.CancellationRights value) {
    setField(value);
  }

  public quickfix.field.CancellationRights get(quickfix.field.CancellationRights value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CancellationRights getCancellationRights() throws FieldNotFound {
    return get(new quickfix.field.CancellationRights());
  }

  public boolean isSet(quickfix.field.CancellationRights field) {
    return isSetField(field);
  }

  public boolean isSetCancellationRights() {
    return isSetField(480);
  }

  public void set(quickfix.field.MoneyLaunderingStatus value) {
    setField(value);
  }

  public quickfix.field.MoneyLaunderingStatus get(quickfix.field.MoneyLaunderingStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MoneyLaunderingStatus getMoneyLaunderingStatus() throws FieldNotFound {
    return get(new quickfix.field.MoneyLaunderingStatus());
  }

  public boolean isSet(quickfix.field.MoneyLaunderingStatus field) {
    return isSetField(field);
  }

  public boolean isSetMoneyLaunderingStatus() {
    return isSetField(481);
  }

  public void set(quickfix.field.RegistID value) {
    setField(value);
  }

  public quickfix.field.RegistID get(quickfix.field.RegistID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegistID getRegistID() throws FieldNotFound {
    return get(new quickfix.field.RegistID());
  }

  public boolean isSet(quickfix.field.RegistID field) {
    return isSetField(field);
  }

  public boolean isSetRegistID() {
    return isSetField(513);
  }

  public void set(quickfix.field.Designation value) {
    setField(value);
  }

  public quickfix.field.Designation get(quickfix.field.Designation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Designation getDesignation() throws FieldNotFound {
    return get(new quickfix.field.Designation());
  }

  public boolean isSet(quickfix.field.Designation field) {
    return isSetField(field);
  }

  public boolean isSetDesignation() {
    return isSetField(494);
  }

  public void set(quickfix.field.ManualOrderIndicator value) {
    setField(value);
  }

  public quickfix.field.ManualOrderIndicator get(quickfix.field.ManualOrderIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ManualOrderIndicator getManualOrderIndicator() throws FieldNotFound {
    return get(new quickfix.field.ManualOrderIndicator());
  }

  public boolean isSet(quickfix.field.ManualOrderIndicator field) {
    return isSetField(field);
  }

  public boolean isSetManualOrderIndicator() {
    return isSetField(1028);
  }

  public void set(quickfix.field.CustDirectedOrder value) {
    setField(value);
  }

  public quickfix.field.CustDirectedOrder get(quickfix.field.CustDirectedOrder value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustDirectedOrder getCustDirectedOrder() throws FieldNotFound {
    return get(new quickfix.field.CustDirectedOrder());
  }

  public boolean isSet(quickfix.field.CustDirectedOrder field) {
    return isSetField(field);
  }

  public boolean isSetCustDirectedOrder() {
    return isSetField(1029);
  }

  public void set(quickfix.field.ReceivedDeptID value) {
    setField(value);
  }

  public quickfix.field.ReceivedDeptID get(quickfix.field.ReceivedDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReceivedDeptID getReceivedDeptID() throws FieldNotFound {
    return get(new quickfix.field.ReceivedDeptID());
  }

  public boolean isSet(quickfix.field.ReceivedDeptID field) {
    return isSetField(field);
  }

  public boolean isSetReceivedDeptID() {
    return isSetField(1030);
  }

  public void set(quickfix.field.CustOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.CustOrderHandlingInst get(quickfix.field.CustOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderHandlingInst getCustOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.CustOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.CustOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderHandlingInst() {
    return isSetField(1031);
  }

  public void set(quickfix.field.OrderHandlingInstSource value) {
    setField(value);
  }

  public quickfix.field.OrderHandlingInstSource get(quickfix.field.OrderHandlingInstSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderHandlingInstSource getOrderHandlingInstSource() throws FieldNotFound {
    return get(new quickfix.field.OrderHandlingInstSource());
  }

  public boolean isSet(quickfix.field.OrderHandlingInstSource field) {
    return isSetField(field);
  }

  public boolean isSetOrderHandlingInstSource() {
    return isSetField(1032);
  }

  public void set(quickfix.field.OrderOrigination value) {
    setField(value);
  }

  public quickfix.field.OrderOrigination get(quickfix.field.OrderOrigination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOrigination getOrderOrigination() throws FieldNotFound {
    return get(new quickfix.field.OrderOrigination());
  }

  public boolean isSet(quickfix.field.OrderOrigination field) {
    return isSetField(field);
  }

  public boolean isSetOrderOrigination() {
    return isSetField(1724);
  }

  public void set(quickfix.field.ContraOrderOrigination value) {
    setField(value);
  }

  public quickfix.field.ContraOrderOrigination get(quickfix.field.ContraOrderOrigination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraOrderOrigination getContraOrderOrigination() throws FieldNotFound {
    return get(new quickfix.field.ContraOrderOrigination());
  }

  public boolean isSet(quickfix.field.ContraOrderOrigination field) {
    return isSetField(field);
  }

  public boolean isSetContraOrderOrigination() {
    return isSetField(2882);
  }

  public void set(quickfix.field.OriginatingDeptID value) {
    setField(value);
  }

  public quickfix.field.OriginatingDeptID get(quickfix.field.OriginatingDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OriginatingDeptID getOriginatingDeptID() throws FieldNotFound {
    return get(new quickfix.field.OriginatingDeptID());
  }

  public boolean isSet(quickfix.field.OriginatingDeptID field) {
    return isSetField(field);
  }

  public boolean isSetOriginatingDeptID() {
    return isSetField(1725);
  }

  public void set(quickfix.field.ReceivingDeptID value) {
    setField(value);
  }

  public quickfix.field.ReceivingDeptID get(quickfix.field.ReceivingDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReceivingDeptID getReceivingDeptID() throws FieldNotFound {
    return get(new quickfix.field.ReceivingDeptID());
  }

  public boolean isSet(quickfix.field.ReceivingDeptID field) {
    return isSetField(field);
  }

  public boolean isSetReceivingDeptID() {
    return isSetField(1726);
  }

  public void set(quickfix.field.RoutingArrangmentIndicator value) {
    setField(value);
  }

  public quickfix.field.RoutingArrangmentIndicator get(quickfix.field.RoutingArrangmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingArrangmentIndicator getRoutingArrangmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.RoutingArrangmentIndicator());
  }

  public boolean isSet(quickfix.field.RoutingArrangmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetRoutingArrangmentIndicator() {
    return isSetField(2883);
  }

  public void set(quickfix.field.ContraRoutingArrangmentIndicator value) {
    setField(value);
  }

  public quickfix.field.ContraRoutingArrangmentIndicator get(quickfix.field.ContraRoutingArrangmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraRoutingArrangmentIndicator getContraRoutingArrangmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.ContraRoutingArrangmentIndicator());
  }

  public boolean isSet(quickfix.field.ContraRoutingArrangmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetContraRoutingArrangmentIndicator() {
    return isSetField(2884);
  }

  public void set(quickfix.field.OwnerType value) {
    setField(value);
  }

  public quickfix.field.OwnerType get(quickfix.field.OwnerType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OwnerType getOwnerType() throws FieldNotFound {
    return get(new quickfix.field.OwnerType());
  }

  public boolean isSet(quickfix.field.OwnerType field) {
    return isSetField(field);
  }

  public boolean isSetOwnerType() {
    return isSetField(522);
  }

  public void set(quickfix.field.OrderOwnershipIndicator value) {
    setField(value);
  }

  public quickfix.field.OrderOwnershipIndicator get(quickfix.field.OrderOwnershipIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOwnershipIndicator getOrderOwnershipIndicator() throws FieldNotFound {
    return get(new quickfix.field.OrderOwnershipIndicator());
  }

  public boolean isSet(quickfix.field.OrderOwnershipIndicator field) {
    return isSetField(field);
  }

  public boolean isSetOrderOwnershipIndicator() {
    return isSetField(2679);
  }

  public void set(quickfix.fixlatest.component.TrdRegTimestamps component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegTimestamps get(quickfix.fixlatest.component.TrdRegTimestamps component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegTimestamps getTrdRegTimestampsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegTimestamps());
  }

  public void set(quickfix.field.NoTrdRegTimestamps value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegTimestamps get(quickfix.field.NoTrdRegTimestamps value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegTimestamps());
  }

  public boolean isSet(quickfix.field.NoTrdRegTimestamps field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegTimestamps() {
    return isSetField(768);
  }

public static class NoTrdRegTimestamps extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {769, 770, 771, 2839, 1033, 1034, 1035, 1727, 2831, 2832, 2833, 2834, 0};

  public NoTrdRegTimestamps() {
    super(768, 769, ORDER);
  }

  public void set(quickfix.field.TrdRegTimestamp value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestamp get(quickfix.field.TrdRegTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestamp());
  }

  public boolean isSet(quickfix.field.TrdRegTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestamp() {
    return isSetField(769);
  }

  public void set(quickfix.field.TrdRegTimestampType value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestampType get(quickfix.field.TrdRegTimestampType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestampType());
  }

  public boolean isSet(quickfix.field.TrdRegTimestampType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestampType() {
    return isSetField(770);
  }

  public void set(quickfix.field.TrdRegTimestampOrigin value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestampOrigin get(quickfix.field.TrdRegTimestampOrigin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestampOrigin());
  }

  public boolean isSet(quickfix.field.TrdRegTimestampOrigin field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestampOrigin() {
    return isSetField(771);
  }

  public void set(quickfix.field.TrdRegTimestampManualIndicator value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestampManualIndicator get(quickfix.field.TrdRegTimestampManualIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestampManualIndicator getTrdRegTimestampManualIndicator() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestampManualIndicator());
  }

  public boolean isSet(quickfix.field.TrdRegTimestampManualIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestampManualIndicator() {
    return isSetField(2839);
  }

  public void set(quickfix.field.DeskType value) {
    setField(value);
  }

  public quickfix.field.DeskType get(quickfix.field.DeskType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskType getDeskType() throws FieldNotFound {
    return get(new quickfix.field.DeskType());
  }

  public boolean isSet(quickfix.field.DeskType field) {
    return isSetField(field);
  }

  public boolean isSetDeskType() {
    return isSetField(1033);
  }

  public void set(quickfix.field.DeskTypeSource value) {
    setField(value);
  }

  public quickfix.field.DeskTypeSource get(quickfix.field.DeskTypeSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskTypeSource getDeskTypeSource() throws FieldNotFound {
    return get(new quickfix.field.DeskTypeSource());
  }

  public boolean isSet(quickfix.field.DeskTypeSource field) {
    return isSetField(field);
  }

  public boolean isSetDeskTypeSource() {
    return isSetField(1034);
  }

  public void set(quickfix.field.DeskOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.DeskOrderHandlingInst get(quickfix.field.DeskOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskOrderHandlingInst getDeskOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.DeskOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.DeskOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetDeskOrderHandlingInst() {
    return isSetField(1035);
  }

  public void set(quickfix.field.InformationBarrierID value) {
    setField(value);
  }

  public quickfix.field.InformationBarrierID get(quickfix.field.InformationBarrierID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InformationBarrierID getInformationBarrierID() throws FieldNotFound {
    return get(new quickfix.field.InformationBarrierID());
  }

  public boolean isSet(quickfix.field.InformationBarrierID field) {
    return isSetField(field);
  }

  public boolean isSetInformationBarrierID() {
    return isSetField(1727);
  }

  public void set(quickfix.field.NBBOEntryType value) {
    setField(value);
  }

  public quickfix.field.NBBOEntryType get(quickfix.field.NBBOEntryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOEntryType getNBBOEntryType() throws FieldNotFound {
    return get(new quickfix.field.NBBOEntryType());
  }

  public boolean isSet(quickfix.field.NBBOEntryType field) {
    return isSetField(field);
  }

  public boolean isSetNBBOEntryType() {
    return isSetField(2831);
  }

  public void set(quickfix.field.NBBOPrice value) {
    setField(value);
  }

  public quickfix.field.NBBOPrice get(quickfix.field.NBBOPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOPrice getNBBOPrice() throws FieldNotFound {
    return get(new quickfix.field.NBBOPrice());
  }

  public boolean isSet(quickfix.field.NBBOPrice field) {
    return isSetField(field);
  }

  public boolean isSetNBBOPrice() {
    return isSetField(2832);
  }

  public void set(quickfix.field.NBBOQty value) {
    setField(value);
  }

  public quickfix.field.NBBOQty get(quickfix.field.NBBOQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOQty getNBBOQty() throws FieldNotFound {
    return get(new quickfix.field.NBBOQty());
  }

  public boolean isSet(quickfix.field.NBBOQty field) {
    return isSetField(field);
  }

  public boolean isSetNBBOQty() {
    return isSetField(2833);
  }

  public void set(quickfix.field.NBBOSource value) {
    setField(value);
  }

  public quickfix.field.NBBOSource get(quickfix.field.NBBOSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOSource getNBBOSource() throws FieldNotFound {
    return get(new quickfix.field.NBBOSource());
  }

  public boolean isSet(quickfix.field.NBBOSource field) {
    return isSetField(field);
  }

  public boolean isSetNBBOSource() {
    return isSetField(2834);
  }
}

  public void set(quickfix.field.ThrottleInst value) {
    setField(value);
  }

  public quickfix.field.ThrottleInst get(quickfix.field.ThrottleInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ThrottleInst getThrottleInst() throws FieldNotFound {
    return get(new quickfix.field.ThrottleInst());
  }

  public boolean isSet(quickfix.field.ThrottleInst field) {
    return isSetField(field);
  }

  public boolean isSetThrottleInst() {
    return isSetField(1685);
  }

  public void set(quickfix.field.AuctionType value) {
    setField(value);
  }

  public quickfix.field.AuctionType get(quickfix.field.AuctionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionType getAuctionType() throws FieldNotFound {
    return get(new quickfix.field.AuctionType());
  }

  public boolean isSet(quickfix.field.AuctionType field) {
    return isSetField(field);
  }

  public boolean isSetAuctionType() {
    return isSetField(1803);
  }

  public void set(quickfix.field.AuctionAllocationPct value) {
    setField(value);
  }

  public quickfix.field.AuctionAllocationPct get(quickfix.field.AuctionAllocationPct value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionAllocationPct getAuctionAllocationPct() throws FieldNotFound {
    return get(new quickfix.field.AuctionAllocationPct());
  }

  public boolean isSet(quickfix.field.AuctionAllocationPct field) {
    return isSetField(field);
  }

  public boolean isSetAuctionAllocationPct() {
    return isSetField(1804);
  }

  public void set(quickfix.field.ReleaseInstruction value) {
    setField(value);
  }

  public quickfix.field.ReleaseInstruction get(quickfix.field.ReleaseInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReleaseInstruction getReleaseInstruction() throws FieldNotFound {
    return get(new quickfix.field.ReleaseInstruction());
  }

  public boolean isSet(quickfix.field.ReleaseInstruction field) {
    return isSetField(field);
  }

  public boolean isSetReleaseInstruction() {
    return isSetField(1810);
  }

  public void set(quickfix.field.ReleaseQty value) {
    setField(value);
  }

  public quickfix.field.ReleaseQty get(quickfix.field.ReleaseQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReleaseQty getReleaseQty() throws FieldNotFound {
    return get(new quickfix.field.ReleaseQty());
  }

  public boolean isSet(quickfix.field.ReleaseQty field) {
    return isSetField(field);
  }

  public boolean isSetReleaseQty() {
    return isSetField(1811);
  }
}
