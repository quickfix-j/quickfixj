/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class Confirmation extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AK";

  public Confirmation() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public Confirmation (quickfix.field.ConfirmID confirmID, quickfix.field.ConfirmTransType confirmTransType, quickfix.field.ConfirmType confirmType, quickfix.field.ConfirmStatus confirmStatus, quickfix.field.TransactTime transactTime, quickfix.field.TradeDate tradeDate, quickfix.field.AllocQty allocQty, quickfix.field.Side side, quickfix.field.AllocAccount allocAccount, quickfix.field.AvgPx avgPx, quickfix.field.GrossTradeAmt grossTradeAmt, quickfix.field.NetMoney netMoney) {
    this();
    setField(confirmID);
    setField(confirmTransType);
    setField(confirmType);
    setField(confirmStatus);
    setField(transactTime);
    setField(tradeDate);
    setField(allocQty);
    setField(side);
    setField(allocAccount);
    setField(avgPx);
    setField(grossTradeAmt);
    setField(netMoney);
  }

  public void set(quickfix.field.ConfirmID value) {
    setField(value);
  }

  public quickfix.field.ConfirmID get(quickfix.field.ConfirmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmID getConfirmID() throws FieldNotFound {
    return get(new quickfix.field.ConfirmID());
  }

  public boolean isSet(quickfix.field.ConfirmID field) {
    return isSetField(field);
  }

  public boolean isSetConfirmID() {
    return isSetField(664);
  }

  public void set(quickfix.field.ConfirmRefID value) {
    setField(value);
  }

  public quickfix.field.ConfirmRefID get(quickfix.field.ConfirmRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmRefID getConfirmRefID() throws FieldNotFound {
    return get(new quickfix.field.ConfirmRefID());
  }

  public boolean isSet(quickfix.field.ConfirmRefID field) {
    return isSetField(field);
  }

  public boolean isSetConfirmRefID() {
    return isSetField(772);
  }

  public void set(quickfix.field.ConfirmReqID value) {
    setField(value);
  }

  public quickfix.field.ConfirmReqID get(quickfix.field.ConfirmReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmReqID getConfirmReqID() throws FieldNotFound {
    return get(new quickfix.field.ConfirmReqID());
  }

  public boolean isSet(quickfix.field.ConfirmReqID field) {
    return isSetField(field);
  }

  public boolean isSetConfirmReqID() {
    return isSetField(859);
  }

  public void set(quickfix.field.ConfirmTransType value) {
    setField(value);
  }

  public quickfix.field.ConfirmTransType get(quickfix.field.ConfirmTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmTransType getConfirmTransType() throws FieldNotFound {
    return get(new quickfix.field.ConfirmTransType());
  }

  public boolean isSet(quickfix.field.ConfirmTransType field) {
    return isSetField(field);
  }

  public boolean isSetConfirmTransType() {
    return isSetField(666);
  }

  public void set(quickfix.field.ConfirmType value) {
    setField(value);
  }

  public quickfix.field.ConfirmType get(quickfix.field.ConfirmType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmType getConfirmType() throws FieldNotFound {
    return get(new quickfix.field.ConfirmType());
  }

  public boolean isSet(quickfix.field.ConfirmType field) {
    return isSetField(field);
  }

  public boolean isSetConfirmType() {
    return isSetField(773);
  }

  public void set(quickfix.field.CopyMsgIndicator value) {
    setField(value);
  }

  public quickfix.field.CopyMsgIndicator get(quickfix.field.CopyMsgIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CopyMsgIndicator getCopyMsgIndicator() throws FieldNotFound {
    return get(new quickfix.field.CopyMsgIndicator());
  }

  public boolean isSet(quickfix.field.CopyMsgIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCopyMsgIndicator() {
    return isSetField(797);
  }

  public void set(quickfix.field.LegalConfirm value) {
    setField(value);
  }

  public quickfix.field.LegalConfirm get(quickfix.field.LegalConfirm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegalConfirm getLegalConfirm() throws FieldNotFound {
    return get(new quickfix.field.LegalConfirm());
  }

  public boolean isSet(quickfix.field.LegalConfirm field) {
    return isSetField(field);
  }

  public boolean isSetLegalConfirm() {
    return isSetField(650);
  }

  public void set(quickfix.field.ConfirmStatus value) {
    setField(value);
  }

  public quickfix.field.ConfirmStatus get(quickfix.field.ConfirmStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmStatus getConfirmStatus() throws FieldNotFound {
    return get(new quickfix.field.ConfirmStatus());
  }

  public boolean isSet(quickfix.field.ConfirmStatus field) {
    return isSetField(field);
  }

  public boolean isSetConfirmStatus() {
    return isSetField(665);
  }

  public void set(quickfix.field.MatchStatus value) {
    setField(value);
  }

  public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
    return get(new quickfix.field.MatchStatus());
  }

  public boolean isSet(quickfix.field.MatchStatus field) {
    return isSetField(field);
  }

  public boolean isSetMatchStatus() {
    return isSetField(573);
  }

  public void set(quickfix.field.AffirmStatus value) {
    setField(value);
  }

  public quickfix.field.AffirmStatus get(quickfix.field.AffirmStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffirmStatus getAffirmStatus() throws FieldNotFound {
    return get(new quickfix.field.AffirmStatus());
  }

  public boolean isSet(quickfix.field.AffirmStatus field) {
    return isSetField(field);
  }

  public boolean isSetAffirmStatus() {
    return isSetField(940);
  }

  public void set(quickfix.field.TradeConfirmationReferenceID value) {
    setField(value);
  }

  public quickfix.field.TradeConfirmationReferenceID get(quickfix.field.TradeConfirmationReferenceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeConfirmationReferenceID getTradeConfirmationReferenceID() throws FieldNotFound {
    return get(new quickfix.field.TradeConfirmationReferenceID());
  }

  public boolean isSet(quickfix.field.TradeConfirmationReferenceID field) {
    return isSetField(field);
  }

  public boolean isSetTradeConfirmationReferenceID() {
    return isSetField(2390);
  }

  public void set(quickfix.field.ClearedIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearedIndicator get(quickfix.field.ClearedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearedIndicator getClearedIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearedIndicator());
  }

  public boolean isSet(quickfix.field.ClearedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearedIndicator() {
    return isSetField(1832);
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

  public void set(quickfix.fixlatest.component.OrdAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrdAllocGrp get(quickfix.fixlatest.component.OrdAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrdAllocGrp getOrdAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrdAllocGrp());
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
  private static final int[]  ORDER = {11, 37, 198, 526, 66, 756, 38, 799, 800, 40, 0};

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

  public void set(quickfix.field.SecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryOrderID());
  }

  public boolean isSet(quickfix.field.SecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryOrderID() {
    return isSetField(198);
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

  public void set(quickfix.fixlatest.component.NestedParties2 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties2 get(quickfix.fixlatest.component.NestedParties2 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties2 getNestedParties2Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties2());
  }

  public void set(quickfix.field.NoNested2PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs() {
    return isSetField(756);
  }

public static class NoNested2PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {757, 758, 759, 2381, 806, 0};

  public NoNested2PartyIDs() {
    super(756, 757, ORDER);
  }

  public void set(quickfix.field.Nested2PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyID());
  }

  public boolean isSet(quickfix.field.Nested2PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID() {
    return isSetField(757);
  }

  public void set(quickfix.field.Nested2PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource() {
    return isSetField(758);
  }

  public void set(quickfix.field.Nested2PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRole());
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole() {
    return isSetField(759);
  }

  public void set(quickfix.field.Nested2PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRoleQualifier get(quickfix.field.Nested2PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRoleQualifier getNested2PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested2PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRoleQualifier() {
    return isSetField(2381);
  }

  public void set(quickfix.fixlatest.component.NstdPtys2SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp get(quickfix.fixlatest.component.NstdPtys2SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp getNstdPtys2SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys2SubGrp());
  }

  public void set(quickfix.field.NoNested2PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs() {
    return isSetField(806);
  }

public static class NoNested2PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {760, 807, 0};

  public NoNested2PartySubIDs() {
    super(806, 760, ORDER);
  }

  public void set(quickfix.field.Nested2PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubID());
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID() {
    return isSetField(760);
  }

  public void set(quickfix.field.Nested2PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType() {
    return isSetField(807);
  }
}
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

  public void set(quickfix.field.OrderBookingQty value) {
    setField(value);
  }

  public quickfix.field.OrderBookingQty get(quickfix.field.OrderBookingQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderBookingQty getOrderBookingQty() throws FieldNotFound {
    return get(new quickfix.field.OrderBookingQty());
  }

  public boolean isSet(quickfix.field.OrderBookingQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderBookingQty() {
    return isSetField(800);
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
}

  public void set(quickfix.fixlatest.component.ExecAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ExecAllocGrp get(quickfix.fixlatest.component.ExecAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ExecAllocGrp getExecAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ExecAllocGrp());
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
  private static final int[]  ORDER = {32, 17, 527, 31, 669, 29, 1003, 1041, 2749, 2524, 2668, 1838, 0};

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

  public void set(quickfix.field.SecondaryExecID value) {
    setField(value);
  }

  public quickfix.field.SecondaryExecID get(quickfix.field.SecondaryExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryExecID());
  }

  public boolean isSet(quickfix.field.SecondaryExecID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryExecID() {
    return isSetField(527);
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

  public void set(quickfix.field.LastParPx value) {
    setField(value);
  }

  public quickfix.field.LastParPx get(quickfix.field.LastParPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastParPx getLastParPx() throws FieldNotFound {
    return get(new quickfix.field.LastParPx());
  }

  public boolean isSet(quickfix.field.LastParPx field) {
    return isSetField(field);
  }

  public boolean isSetLastParPx() {
    return isSetField(669);
  }

  public void set(quickfix.field.LastCapacity value) {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
    return get(new quickfix.field.LastCapacity());
  }

  public boolean isSet(quickfix.field.LastCapacity field) {
    return isSetField(field);
  }

  public boolean isSetLastCapacity() {
    return isSetField(29);
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

  public void set(quickfix.field.FirmTradeID value) {
    setField(value);
  }

  public quickfix.field.FirmTradeID get(quickfix.field.FirmTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeID getFirmTradeID() throws FieldNotFound {
    return get(new quickfix.field.FirmTradeID());
  }

  public boolean isSet(quickfix.field.FirmTradeID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTradeID() {
    return isSetField(1041);
  }

  public void set(quickfix.field.ExecutionTimestamp value) {
    setField(value);
  }

  public quickfix.field.ExecutionTimestamp get(quickfix.field.ExecutionTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecutionTimestamp getExecutionTimestamp() throws FieldNotFound {
    return get(new quickfix.field.ExecutionTimestamp());
  }

  public boolean isSet(quickfix.field.ExecutionTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetExecutionTimestamp() {
    return isSetField(2749);
  }

  public void set(quickfix.field.TradeReportingIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeReportingIndicator get(quickfix.field.TradeReportingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportingIndicator getTradeReportingIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeReportingIndicator());
  }

  public boolean isSet(quickfix.field.TradeReportingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportingIndicator() {
    return isSetField(2524);
  }

  public void set(quickfix.fixlatest.component.TrdRegPublicationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp get(quickfix.fixlatest.component.TrdRegPublicationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp getTrdRegPublicationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegPublicationGrp());
  }

  public void set(quickfix.field.NoTrdRegPublications value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegPublications get(quickfix.field.NoTrdRegPublications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegPublications getNoTrdRegPublications() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegPublications());
  }

  public boolean isSet(quickfix.field.NoTrdRegPublications field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegPublications() {
    return isSetField(2668);
  }

public static class NoTrdRegPublications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2669, 2670, 0};

  public NoTrdRegPublications() {
    super(2668, 2669, ORDER);
  }

  public void set(quickfix.field.TrdRegPublicationType value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationType get(quickfix.field.TrdRegPublicationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationType getTrdRegPublicationType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationType());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationType() {
    return isSetField(2669);
  }

  public void set(quickfix.field.TrdRegPublicationReason value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationReason get(quickfix.field.TrdRegPublicationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationReason getTrdRegPublicationReason() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationReason());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationReason field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationReason() {
    return isSetField(2670);
  }
}

  public void set(quickfix.fixlatest.component.TradePriceConditionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp get(quickfix.fixlatest.component.TradePriceConditionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp getTradePriceConditionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePriceConditionGrp());
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}
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

  public void set(quickfix.field.SecondaryAllocID value) {
    setField(value);
  }

  public quickfix.field.SecondaryAllocID get(quickfix.field.SecondaryAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAllocID getSecondaryAllocID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAllocID());
  }

  public boolean isSet(quickfix.field.SecondaryAllocID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAllocID() {
    return isSetField(793);
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

  public void set(quickfix.field.TrdType value) {
    setField(value);
  }

  public quickfix.field.TrdType get(quickfix.field.TrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdType getTrdType() throws FieldNotFound {
    return get(new quickfix.field.TrdType());
  }

  public boolean isSet(quickfix.field.TrdType field) {
    return isSetField(field);
  }

  public boolean isSetTrdType() {
    return isSetField(828);
  }

  public void set(quickfix.field.TrdSubType value) {
    setField(value);
  }

  public quickfix.field.TrdSubType get(quickfix.field.TrdSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdSubType getTrdSubType() throws FieldNotFound {
    return get(new quickfix.field.TrdSubType());
  }

  public boolean isSet(quickfix.field.TrdSubType field) {
    return isSetField(field);
  }

  public boolean isSetTrdSubType() {
    return isSetField(829);
  }

  public void set(quickfix.field.SecondaryTrdType value) {
    setField(value);
  }

  public quickfix.field.SecondaryTrdType get(quickfix.field.SecondaryTrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTrdType getSecondaryTrdType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTrdType());
  }

  public boolean isSet(quickfix.field.SecondaryTrdType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTrdType() {
    return isSetField(855);
  }

  public void set(quickfix.field.TradeContinuation value) {
    setField(value);
  }

  public quickfix.field.TradeContinuation get(quickfix.field.TradeContinuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeContinuation getTradeContinuation() throws FieldNotFound {
    return get(new quickfix.field.TradeContinuation());
  }

  public boolean isSet(quickfix.field.TradeContinuation field) {
    return isSetField(field);
  }

  public boolean isSetTradeContinuation() {
    return isSetField(1937);
  }

  public void set(quickfix.field.TradeContinuationText value) {
    setField(value);
  }

  public quickfix.field.TradeContinuationText get(quickfix.field.TradeContinuationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeContinuationText getTradeContinuationText() throws FieldNotFound {
    return get(new quickfix.field.TradeContinuationText());
  }

  public boolean isSet(quickfix.field.TradeContinuationText field) {
    return isSetField(field);
  }

  public boolean isSetTradeContinuationText() {
    return isSetField(2374);
  }

  public void set(quickfix.field.EncodedTradeContinuationTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTradeContinuationTextLen get(quickfix.field.EncodedTradeContinuationTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTradeContinuationTextLen getEncodedTradeContinuationTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTradeContinuationTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTradeContinuationTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTradeContinuationTextLen() {
    return isSetField(2372);
  }

  public void set(quickfix.field.EncodedTradeContinuationText value) {
    setField(value);
  }

  public quickfix.field.EncodedTradeContinuationText get(quickfix.field.EncodedTradeContinuationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTradeContinuationText getEncodedTradeContinuationText() throws FieldNotFound {
    return get(new quickfix.field.EncodedTradeContinuationText());
  }

  public boolean isSet(quickfix.field.EncodedTradeContinuationText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTradeContinuationText() {
    return isSetField(2371);
  }

  public void set(quickfix.field.MatchType value) {
    setField(value);
  }

  public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchType getMatchType() throws FieldNotFound {
    return get(new quickfix.field.MatchType());
  }

  public boolean isSet(quickfix.field.MatchType field) {
    return isSetField(field);
  }

  public boolean isSetMatchType() {
    return isSetField(574);
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

  public void set(quickfix.fixlatest.component.InstrumentExtension component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentExtension get(quickfix.fixlatest.component.InstrumentExtension component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentExtension getInstrumentExtensionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentExtension());
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

  public void set(quickfix.fixlatest.component.InstrmtLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrmtLegGrp get(quickfix.fixlatest.component.InstrmtLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrmtLegGrp getInstrmtLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrmtLegGrp());
  }

  public void set(quickfix.field.NoLegs value) {
    setField(value);
  }

  public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
    return get(new quickfix.field.NoLegs());
  }

  public boolean isSet(quickfix.field.NoLegs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegs() {
    return isSetField(555);
  }

public static class NoLegs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 2497, 2498, 2499, 2496, 2495, 2511, 2510, 2512, 2509, 2500, 42198, 42200, 42203, 2502, 2501, 2503, 2507, 2505, 2494, 2493, 2514, 2513, 2506, 2504, 2508, 0};

  public NoLegs() {
    super(555, 600, ORDER);
  }

  public void set(quickfix.fixlatest.component.InstrumentLeg component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentLeg get(quickfix.fixlatest.component.InstrumentLeg component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentLeg getInstrumentLegComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentLeg());
  }

  public void set(quickfix.fixlatest.component.LegFinancingDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegFinancingDetails get(quickfix.fixlatest.component.LegFinancingDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegFinancingDetails getLegFinancingDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegFinancingDetails());
  }
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

  public void set(quickfix.field.LastMkt value) {
    setField(value);
  }

  public quickfix.field.LastMkt get(quickfix.field.LastMkt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastMkt getLastMkt() throws FieldNotFound {
    return get(new quickfix.field.LastMkt());
  }

  public boolean isSet(quickfix.field.LastMkt field) {
    return isSetField(field);
  }

  public boolean isSetLastMkt() {
    return isSetField(30);
  }

  public void set(quickfix.fixlatest.component.CpctyConfGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CpctyConfGrp get(quickfix.fixlatest.component.CpctyConfGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CpctyConfGrp getCpctyConfGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CpctyConfGrp());
  }

  public void set(quickfix.field.NoCapacities value) {
    setField(value);
  }

  public quickfix.field.NoCapacities get(quickfix.field.NoCapacities value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCapacities getNoCapacities() throws FieldNotFound {
    return get(new quickfix.field.NoCapacities());
  }

  public boolean isSet(quickfix.field.NoCapacities field) {
    return isSetField(field);
  }

  public boolean isSetNoCapacities() {
    return isSetField(862);
  }

public static class NoCapacities extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {528, 529, 863, 0};

  public NoCapacities() {
    super(862, 528, ORDER);
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

  public void set(quickfix.field.OrderCapacityQty value) {
    setField(value);
  }

  public quickfix.field.OrderCapacityQty get(quickfix.field.OrderCapacityQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacityQty getOrderCapacityQty() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacityQty());
  }

  public boolean isSet(quickfix.field.OrderCapacityQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacityQty() {
    return isSetField(863);
  }
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

  public void set(quickfix.field.AllocAccountType value) {
    setField(value);
  }

  public quickfix.field.AllocAccountType get(quickfix.field.AllocAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccountType getAllocAccountType() throws FieldNotFound {
    return get(new quickfix.field.AllocAccountType());
  }

  public boolean isSet(quickfix.field.AllocAccountType field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccountType() {
    return isSetField(798);
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

  public void set(quickfix.field.AvgPxPrecision value) {
    setField(value);
  }

  public quickfix.field.AvgPxPrecision get(quickfix.field.AvgPxPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPxPrecision getAvgPxPrecision() throws FieldNotFound {
    return get(new quickfix.field.AvgPxPrecision());
  }

  public boolean isSet(quickfix.field.AvgPxPrecision field) {
    return isSetField(field);
  }

  public boolean isSetAvgPxPrecision() {
    return isSetField(74);
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

  public void set(quickfix.fixlatest.component.PriceQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceQualifierGrp get(quickfix.fixlatest.component.PriceQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceQualifierGrp getPriceQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceQualifierGrp());
  }

  public void set(quickfix.field.NoPriceQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoPriceQualifiers get(quickfix.field.NoPriceQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceQualifiers getNoPriceQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoPriceQualifiers());
  }

  public boolean isSet(quickfix.field.NoPriceQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceQualifiers() {
    return isSetField(2709);
  }

public static class NoPriceQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2710, 0};

  public NoPriceQualifiers() {
    super(2709, 2710, ORDER);
  }

  public void set(quickfix.field.PriceQualifier value) {
    setField(value);
  }

  public quickfix.field.PriceQualifier get(quickfix.field.PriceQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQualifier getPriceQualifier() throws FieldNotFound {
    return get(new quickfix.field.PriceQualifier());
  }

  public boolean isSet(quickfix.field.PriceQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPriceQualifier() {
    return isSetField(2710);
  }
}

  public void set(quickfix.field.AvgParPx value) {
    setField(value);
  }

  public quickfix.field.AvgParPx get(quickfix.field.AvgParPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgParPx getAvgParPx() throws FieldNotFound {
    return get(new quickfix.field.AvgParPx());
  }

  public boolean isSet(quickfix.field.AvgParPx field) {
    return isSetField(field);
  }

  public boolean isSetAvgParPx() {
    return isSetField(860);
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

  public void set(quickfix.field.ReportedPx value) {
    setField(value);
  }

  public quickfix.field.ReportedPx get(quickfix.field.ReportedPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReportedPx getReportedPx() throws FieldNotFound {
    return get(new quickfix.field.ReportedPx());
  }

  public boolean isSet(quickfix.field.ReportedPx field) {
    return isSetField(field);
  }

  public boolean isSetReportedPx() {
    return isSetField(861);
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

  public void set(quickfix.field.ProcessCode value) {
    setField(value);
  }

  public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
    return get(new quickfix.field.ProcessCode());
  }

  public boolean isSet(quickfix.field.ProcessCode field) {
    return isSetField(field);
  }

  public boolean isSetProcessCode() {
    return isSetField(81);
  }

  public void set(quickfix.field.GrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.GrossTradeAmt get(quickfix.field.GrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.GrossTradeAmt getGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.GrossTradeAmt());
  }

  public boolean isSet(quickfix.field.GrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetGrossTradeAmt() {
    return isSetField(381);
  }

  public void set(quickfix.field.NumDaysInterest value) {
    setField(value);
  }

  public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
    return get(new quickfix.field.NumDaysInterest());
  }

  public boolean isSet(quickfix.field.NumDaysInterest field) {
    return isSetField(field);
  }

  public boolean isSetNumDaysInterest() {
    return isSetField(157);
  }

  public void set(quickfix.field.ExDate value) {
    setField(value);
  }

  public quickfix.field.ExDate get(quickfix.field.ExDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDate getExDate() throws FieldNotFound {
    return get(new quickfix.field.ExDate());
  }

  public boolean isSet(quickfix.field.ExDate field) {
    return isSetField(field);
  }

  public boolean isSetExDate() {
    return isSetField(230);
  }

  public void set(quickfix.field.AccruedInterestRate value) {
    setField(value);
  }

  public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
    return get(new quickfix.field.AccruedInterestRate());
  }

  public boolean isSet(quickfix.field.AccruedInterestRate field) {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestRate() {
    return isSetField(158);
  }

  public void set(quickfix.field.AccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.AccruedInterestAmt get(quickfix.field.AccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.AccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.AccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestAmt() {
    return isSetField(159);
  }

  public void set(quickfix.field.InterestAtMaturity value) {
    setField(value);
  }

  public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
    return get(new quickfix.field.InterestAtMaturity());
  }

  public boolean isSet(quickfix.field.InterestAtMaturity field) {
    return isSetField(field);
  }

  public boolean isSetInterestAtMaturity() {
    return isSetField(738);
  }

  public void set(quickfix.field.EndAccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.EndAccruedInterestAmt get(quickfix.field.EndAccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.EndAccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.EndAccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetEndAccruedInterestAmt() {
    return isSetField(920);
  }

  public void set(quickfix.field.StartCash value) {
    setField(value);
  }

  public quickfix.field.StartCash get(quickfix.field.StartCash value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartCash getStartCash() throws FieldNotFound {
    return get(new quickfix.field.StartCash());
  }

  public boolean isSet(quickfix.field.StartCash field) {
    return isSetField(field);
  }

  public boolean isSetStartCash() {
    return isSetField(921);
  }

  public void set(quickfix.field.EndCash value) {
    setField(value);
  }

  public quickfix.field.EndCash get(quickfix.field.EndCash value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndCash getEndCash() throws FieldNotFound {
    return get(new quickfix.field.EndCash());
  }

  public boolean isSet(quickfix.field.EndCash field) {
    return isSetField(field);
  }

  public boolean isSetEndCash() {
    return isSetField(922);
  }

  public void set(quickfix.field.Concession value) {
    setField(value);
  }

  public quickfix.field.Concession get(quickfix.field.Concession value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Concession getConcession() throws FieldNotFound {
    return get(new quickfix.field.Concession());
  }

  public boolean isSet(quickfix.field.Concession field) {
    return isSetField(field);
  }

  public boolean isSetConcession() {
    return isSetField(238);
  }

  public void set(quickfix.field.TotalTakedown value) {
    setField(value);
  }

  public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
    return get(new quickfix.field.TotalTakedown());
  }

  public boolean isSet(quickfix.field.TotalTakedown field) {
    return isSetField(field);
  }

  public boolean isSetTotalTakedown() {
    return isSetField(237);
  }

  public void set(quickfix.field.NetMoney value) {
    setField(value);
  }

  public quickfix.field.NetMoney get(quickfix.field.NetMoney value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetMoney getNetMoney() throws FieldNotFound {
    return get(new quickfix.field.NetMoney());
  }

  public boolean isSet(quickfix.field.NetMoney field) {
    return isSetField(field);
  }

  public boolean isSetNetMoney() {
    return isSetField(118);
  }

  public void set(quickfix.field.MaturityNetMoney value) {
    setField(value);
  }

  public quickfix.field.MaturityNetMoney get(quickfix.field.MaturityNetMoney value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityNetMoney getMaturityNetMoney() throws FieldNotFound {
    return get(new quickfix.field.MaturityNetMoney());
  }

  public boolean isSet(quickfix.field.MaturityNetMoney field) {
    return isSetField(field);
  }

  public boolean isSetMaturityNetMoney() {
    return isSetField(890);
  }

  public void set(quickfix.field.SettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrAmt());
  }

  public boolean isSet(quickfix.field.SettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrAmt() {
    return isSetField(119);
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

  public void set(quickfix.field.SettlCurrFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRate() {
    return isSetField(155);
  }

  public void set(quickfix.field.SettlCurrFxRateCalc value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRateCalc());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRateCalc() {
    return isSetField(156);
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

  public void set(quickfix.fixlatest.component.SettlInstructionsData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlInstructionsData get(quickfix.fixlatest.component.SettlInstructionsData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlInstructionsData getSettlInstructionsDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlInstructionsData());
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

  public void set(quickfix.field.SharedCommission value) {
    setField(value);
  }

  public quickfix.field.SharedCommission get(quickfix.field.SharedCommission value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SharedCommission getSharedCommission() throws FieldNotFound {
    return get(new quickfix.field.SharedCommission());
  }

  public boolean isSet(quickfix.field.SharedCommission field) {
    return isSetField(field);
  }

  public boolean isSetSharedCommission() {
    return isSetField(858);
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

  public void set(quickfix.fixlatest.component.Stipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Stipulations get(quickfix.fixlatest.component.Stipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Stipulations getStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Stipulations());
  }

  public void set(quickfix.field.NoStipulations value) {
    setField(value);
  }

  public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoStipulations());
  }

  public boolean isSet(quickfix.field.NoStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoStipulations() {
    return isSetField(232);
  }

public static class NoStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {233, 234, 0};

  public NoStipulations() {
    super(232, 233, ORDER);
  }

  public void set(quickfix.field.StipulationType value) {
    setField(value);
  }

  public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
    return get(new quickfix.field.StipulationType());
  }

  public boolean isSet(quickfix.field.StipulationType field) {
    return isSetField(field);
  }

  public boolean isSetStipulationType() {
    return isSetField(233);
  }

  public void set(quickfix.field.StipulationValue value) {
    setField(value);
  }

  public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.StipulationValue());
  }

  public boolean isSet(quickfix.field.StipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetStipulationValue() {
    return isSetField(234);
  }
}

  public void set(quickfix.fixlatest.component.MiscFeesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesGrp get(quickfix.fixlatest.component.MiscFeesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesGrp getMiscFeesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesGrp());
  }

  public void set(quickfix.field.NoMiscFees value) {
    setField(value);
  }

  public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFees());
  }

  public boolean isSet(quickfix.field.NoMiscFees field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFees() {
    return isSetField(136);
  }

public static class NoMiscFees extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {137, 138, 139, 2712, 2633, 891, 2216, 2217, 2713, 0};

  public NoMiscFees() {
    super(136, 137, ORDER);
  }

  public void set(quickfix.field.MiscFeeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmt() {
    return isSetField(137);
  }

  public void set(quickfix.field.MiscFeeCurr value) {
    setField(value);
  }

  public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeCurr());
  }

  public boolean isSet(quickfix.field.MiscFeeCurr field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeCurr() {
    return isSetField(138);
  }

  public void set(quickfix.field.MiscFeeType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeType());
  }

  public boolean isSet(quickfix.field.MiscFeeType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeType() {
    return isSetField(139);
  }

  public void set(quickfix.field.MiscFeeQualifier value) {
    setField(value);
  }

  public quickfix.field.MiscFeeQualifier get(quickfix.field.MiscFeeQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeQualifier getMiscFeeQualifier() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeQualifier());
  }

  public boolean isSet(quickfix.field.MiscFeeQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeQualifier() {
    return isSetField(2712);
  }

  public void set(quickfix.fixlatest.component.MiscFeesSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp get(quickfix.fixlatest.component.MiscFeesSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp getMiscFeesSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesSubGrp());
  }

  public void set(quickfix.field.NoMiscFeeSubTypes value) {
    setField(value);
  }

  public quickfix.field.NoMiscFeeSubTypes get(quickfix.field.NoMiscFeeSubTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFeeSubTypes getNoMiscFeeSubTypes() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFeeSubTypes());
  }

  public boolean isSet(quickfix.field.NoMiscFeeSubTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFeeSubTypes() {
    return isSetField(2633);
  }

public static class NoMiscFeeSubTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2634, 2635, 2636, 2637, 2638, 0};

  public NoMiscFeeSubTypes() {
    super(2633, 2634, ORDER);
  }

  public void set(quickfix.field.MiscFeeSubType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubType get(quickfix.field.MiscFeeSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubType getMiscFeeSubType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubType());
  }

  public boolean isSet(quickfix.field.MiscFeeSubType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubType() {
    return isSetField(2634);
  }

  public void set(quickfix.field.MiscFeeSubTypeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeAmt get(quickfix.field.MiscFeeSubTypeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeAmt getMiscFeeSubTypeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeAmt() {
    return isSetField(2635);
  }

  public void set(quickfix.field.MiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeDesc get(quickfix.field.MiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeDesc getMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeDesc() {
    return isSetField(2636);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen get(quickfix.field.EncodedMiscFeeSubTypeDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen getEncodedMiscFeeSubTypeDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDescLen() {
    return isSetField(2637);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc get(quickfix.field.EncodedMiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc getEncodedMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDesc() {
    return isSetField(2638);
  }
}

  public void set(quickfix.field.MiscFeeBasis value) {
    setField(value);
  }

  public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeBasis());
  }

  public boolean isSet(quickfix.field.MiscFeeBasis field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeBasis() {
    return isSetField(891);
  }

  public void set(quickfix.field.MiscFeeRate value) {
    setField(value);
  }

  public quickfix.field.MiscFeeRate get(quickfix.field.MiscFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeRate getMiscFeeRate() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeRate());
  }

  public boolean isSet(quickfix.field.MiscFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeRate() {
    return isSetField(2216);
  }

  public void set(quickfix.field.MiscFeeAmountDue value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmountDue get(quickfix.field.MiscFeeAmountDue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmountDue getMiscFeeAmountDue() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmountDue());
  }

  public boolean isSet(quickfix.field.MiscFeeAmountDue field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmountDue() {
    return isSetField(2217);
  }

  public void set(quickfix.field.MiscFeeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeDesc get(quickfix.field.MiscFeeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeDesc getMiscFeeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeDesc() {
    return isSetField(2713);
  }
}

  public void set(quickfix.fixlatest.component.MatchExceptionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchExceptionGrp get(quickfix.fixlatest.component.MatchExceptionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchExceptionGrp getMatchExceptionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchExceptionGrp());
  }

  public void set(quickfix.field.NoMatchExceptions value) {
    setField(value);
  }

  public quickfix.field.NoMatchExceptions get(quickfix.field.NoMatchExceptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchExceptions getNoMatchExceptions() throws FieldNotFound {
    return get(new quickfix.field.NoMatchExceptions());
  }

  public boolean isSet(quickfix.field.NoMatchExceptions field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchExceptions() {
    return isSetField(2772);
  }

public static class NoMatchExceptions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2773, 2774, 2775, 2776, 2777, 2778, 2779, 2780, 2797, 2798, 0};

  public NoMatchExceptions() {
    super(2772, 2773, ORDER);
  }

  public void set(quickfix.field.MatchExceptionType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionType get(quickfix.field.MatchExceptionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionType getMatchExceptionType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionType());
  }

  public boolean isSet(quickfix.field.MatchExceptionType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionType() {
    return isSetField(2773);
  }

  public void set(quickfix.field.MatchExceptionElementType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementType get(quickfix.field.MatchExceptionElementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementType getMatchExceptionElementType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementType());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementType() {
    return isSetField(2774);
  }

  public void set(quickfix.field.MatchExceptionElementName value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementName get(quickfix.field.MatchExceptionElementName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementName getMatchExceptionElementName() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementName());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementName field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementName() {
    return isSetField(2775);
  }

  public void set(quickfix.field.MatchExceptionAllocValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionAllocValue get(quickfix.field.MatchExceptionAllocValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionAllocValue getMatchExceptionAllocValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionAllocValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionAllocValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionAllocValue() {
    return isSetField(2776);
  }

  public void set(quickfix.field.MatchExceptionConfirmValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionConfirmValue get(quickfix.field.MatchExceptionConfirmValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionConfirmValue getMatchExceptionConfirmValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionConfirmValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionConfirmValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionConfirmValue() {
    return isSetField(2777);
  }

  public void set(quickfix.field.MatchExceptionToleranceValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValue get(quickfix.field.MatchExceptionToleranceValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValue getMatchExceptionToleranceValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValue() {
    return isSetField(2778);
  }

  public void set(quickfix.field.MatchExceptionToleranceValueType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValueType get(quickfix.field.MatchExceptionToleranceValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValueType getMatchExceptionToleranceValueType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValueType());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValueType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValueType() {
    return isSetField(2779);
  }

  public void set(quickfix.field.MatchExceptionText value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionText get(quickfix.field.MatchExceptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionText getMatchExceptionText() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionText());
  }

  public boolean isSet(quickfix.field.MatchExceptionText field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionText() {
    return isSetField(2780);
  }

  public void set(quickfix.field.EncodedMatchExceptionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExceptionTextLen get(quickfix.field.EncodedMatchExceptionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExceptionTextLen getEncodedMatchExceptionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExceptionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedMatchExceptionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExceptionTextLen() {
    return isSetField(2797);
  }

  public void set(quickfix.field.EncodedMatchExecptionText value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExecptionText get(quickfix.field.EncodedMatchExecptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExecptionText getEncodedMatchExecptionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExecptionText());
  }

  public boolean isSet(quickfix.field.EncodedMatchExecptionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExecptionText() {
    return isSetField(2798);
  }
}

  public void set(quickfix.fixlatest.component.MatchingDataPointGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchingDataPointGrp get(quickfix.fixlatest.component.MatchingDataPointGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchingDataPointGrp getMatchingDataPointGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchingDataPointGrp());
  }

  public void set(quickfix.field.NoMatchingDataPoints value) {
    setField(value);
  }

  public quickfix.field.NoMatchingDataPoints get(quickfix.field.NoMatchingDataPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchingDataPoints getNoMatchingDataPoints() throws FieldNotFound {
    return get(new quickfix.field.NoMatchingDataPoints());
  }

  public boolean isSet(quickfix.field.NoMatchingDataPoints field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchingDataPoints() {
    return isSetField(2781);
  }

public static class NoMatchingDataPoints extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2782, 2783, 2784, 2785, 0};

  public NoMatchingDataPoints() {
    super(2781, 2782, ORDER);
  }

  public void set(quickfix.field.MatchingDataPointIndicator value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointIndicator get(quickfix.field.MatchingDataPointIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointIndicator getMatchingDataPointIndicator() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointIndicator());
  }

  public boolean isSet(quickfix.field.MatchingDataPointIndicator field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointIndicator() {
    return isSetField(2782);
  }

  public void set(quickfix.field.MatchingDataPointValue value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointValue get(quickfix.field.MatchingDataPointValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointValue getMatchingDataPointValue() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointValue());
  }

  public boolean isSet(quickfix.field.MatchingDataPointValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointValue() {
    return isSetField(2783);
  }

  public void set(quickfix.field.MatchingDataPointType value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointType get(quickfix.field.MatchingDataPointType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointType getMatchingDataPointType() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointType());
  }

  public boolean isSet(quickfix.field.MatchingDataPointType field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointType() {
    return isSetField(2784);
  }

  public void set(quickfix.field.MatchingDataPointName value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointName get(quickfix.field.MatchingDataPointName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointName getMatchingDataPointName() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointName());
  }

  public boolean isSet(quickfix.field.MatchingDataPointName field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointName() {
    return isSetField(2785);
  }
}
}
