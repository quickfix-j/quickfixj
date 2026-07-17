/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class NewOrderMultileg extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AB";

  public NewOrderMultileg() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public NewOrderMultileg (quickfix.field.ClOrdID clOrdID, quickfix.field.Side side, quickfix.field.TransactTime transactTime, quickfix.field.OrdType ordType) {
    this();
    setField(clOrdID);
    setField(side);
    setField(transactTime);
    setField(ordType);
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

  public void set(quickfix.fixlatest.component.PreAllocMlegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PreAllocMlegGrp get(quickfix.fixlatest.component.PreAllocMlegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PreAllocMlegGrp getPreAllocMlegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PreAllocMlegGrp());
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
  private static final int[]  ORDER = {79, 661, 736, 467, 2727, 948, 80, 1752, 1753, 1754, 1755, 0};

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

  public void set(quickfix.fixlatest.component.NestedParties3 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties3 get(quickfix.fixlatest.component.NestedParties3 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties3 getNestedParties3Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties3());
  }

  public void set(quickfix.field.NoNested3PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartyIDs get(quickfix.field.NoNested3PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartyIDs getNoNested3PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartyIDs() {
    return isSetField(948);
  }

public static class NoNested3PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {949, 950, 951, 2382, 952, 0};

  public NoNested3PartyIDs() {
    super(948, 949, ORDER);
  }

  public void set(quickfix.field.Nested3PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyID get(quickfix.field.Nested3PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyID getNested3PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyID());
  }

  public boolean isSet(quickfix.field.Nested3PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyID() {
    return isSetField(949);
  }

  public void set(quickfix.field.Nested3PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyIDSource get(quickfix.field.Nested3PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyIDSource getNested3PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested3PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyIDSource() {
    return isSetField(950);
  }

  public void set(quickfix.field.Nested3PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRole get(quickfix.field.Nested3PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRole getNested3PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRole());
  }

  public boolean isSet(quickfix.field.Nested3PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRole() {
    return isSetField(951);
  }

  public void set(quickfix.field.Nested3PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRoleQualifier get(quickfix.field.Nested3PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRoleQualifier getNested3PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested3PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRoleQualifier() {
    return isSetField(2382);
  }

  public void set(quickfix.fixlatest.component.NstdPtys3SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp get(quickfix.fixlatest.component.NstdPtys3SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp getNstdPtys3SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys3SubGrp());
  }

  public void set(quickfix.field.NoNested3PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartySubIDs get(quickfix.field.NoNested3PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartySubIDs() {
    return isSetField(952);
  }

public static class NoNested3PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {953, 954, 0};

  public NoNested3PartySubIDs() {
    super(952, 953, ORDER);
  }

  public void set(quickfix.field.Nested3PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubID get(quickfix.field.Nested3PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubID getNested3PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubID());
  }

  public boolean isSet(quickfix.field.Nested3PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubID() {
    return isSetField(953);
  }

  public void set(quickfix.field.Nested3PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubIDType get(quickfix.field.Nested3PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubIDType() {
    return isSetField(954);
  }
}
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

  public void set(quickfix.field.PrevClosePx value) {
    setField(value);
  }

  public quickfix.field.PrevClosePx get(quickfix.field.PrevClosePx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PrevClosePx getPrevClosePx() throws FieldNotFound {
    return get(new quickfix.field.PrevClosePx());
  }

  public boolean isSet(quickfix.field.PrevClosePx field) {
    return isSetField(field);
  }

  public boolean isSetPrevClosePx() {
    return isSetField(140);
  }

  public void set(quickfix.field.SwapPoints value) {
    setField(value);
  }

  public quickfix.field.SwapPoints get(quickfix.field.SwapPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SwapPoints getSwapPoints() throws FieldNotFound {
    return get(new quickfix.field.SwapPoints());
  }

  public boolean isSet(quickfix.field.SwapPoints field) {
    return isSetField(field);
  }

  public boolean isSetSwapPoints() {
    return isSetField(1069);
  }

  public void set(quickfix.fixlatest.component.LegOrdGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOrdGrp get(quickfix.fixlatest.component.LegOrdGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOrdGrp getLegOrdGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOrdGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 685, 687, 690, 683, 1366, 670, 2680, 1817, 564, 565, 539, 654, 587, 588, 675, 1379, 1381, 1383, 1384, 1689, 0};

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

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegQty value) {
    setField(value);
  }

  public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQty getLegQty() throws FieldNotFound {
    return get(new quickfix.field.LegQty());
  }

  public boolean isSet(quickfix.field.LegQty field) {
    return isSetField(field);
  }

  public boolean isSetLegQty() {
    return isSetField(687);
  }

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
}

  public void set(quickfix.field.LegAllocID value) {
    setField(value);
  }

  public quickfix.field.LegAllocID get(quickfix.field.LegAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocID getLegAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegAllocID());
  }

  public boolean isSet(quickfix.field.LegAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocID() {
    return isSetField(1366);
  }

  public void set(quickfix.fixlatest.component.LegPreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPreAllocGrp get(quickfix.fixlatest.component.LegPreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPreAllocGrp getLegPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPreAllocGrp());
  }

  public void set(quickfix.field.NoLegAllocs value) {
    setField(value);
  }

  public quickfix.field.NoLegAllocs get(quickfix.field.NoLegAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAllocs getNoLegAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAllocs());
  }

  public boolean isSet(quickfix.field.NoLegAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAllocs() {
    return isSetField(670);
  }

public static class NoLegAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {671, 672, 756, 673, 674, 1367, 1756, 1757, 1758, 1759, 0};

  public NoLegAllocs() {
    super(670, 671, ORDER);
  }

  public void set(quickfix.field.LegAllocAccount value) {
    setField(value);
  }

  public quickfix.field.LegAllocAccount get(quickfix.field.LegAllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAccount getLegAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAccount());
  }

  public boolean isSet(quickfix.field.LegAllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAccount() {
    return isSetField(671);
  }

  public void set(quickfix.field.LegIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.LegIndividualAllocID get(quickfix.field.LegIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndividualAllocID getLegIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegIndividualAllocID());
  }

  public boolean isSet(quickfix.field.LegIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegIndividualAllocID() {
    return isSetField(672);
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

  public void set(quickfix.field.LegAllocQty value) {
    setField(value);
  }

  public quickfix.field.LegAllocQty get(quickfix.field.LegAllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocQty getLegAllocQty() throws FieldNotFound {
    return get(new quickfix.field.LegAllocQty());
  }

  public boolean isSet(quickfix.field.LegAllocQty field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocQty() {
    return isSetField(673);
  }

  public void set(quickfix.field.LegAllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAllocAcctIDSource get(quickfix.field.LegAllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAcctIDSource getLegAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.LegAllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAcctIDSource() {
    return isSetField(674);
  }

  public void set(quickfix.field.LegAllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAllocSettlCurrency get(quickfix.field.LegAllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocSettlCurrency getLegAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegAllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocSettlCurrency() {
    return isSetField(1367);
  }

  public void set(quickfix.field.LegCustodialLotID value) {
    setField(value);
  }

  public quickfix.field.LegCustodialLotID get(quickfix.field.LegCustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCustodialLotID getLegCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.LegCustodialLotID());
  }

  public boolean isSet(quickfix.field.LegCustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetLegCustodialLotID() {
    return isSetField(1756);
  }

  public void set(quickfix.field.LegVersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchaseDate get(quickfix.field.LegVersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchaseDate getLegVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.LegVersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchaseDate() {
    return isSetField(1757);
  }

  public void set(quickfix.field.LegVersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchasePrice get(quickfix.field.LegVersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchasePrice getLegVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.LegVersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchasePrice() {
    return isSetField(1758);
  }

  public void set(quickfix.field.LegCurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.LegCurrentCostBasis get(quickfix.field.LegCurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrentCostBasis getLegCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.LegCurrentCostBasis());
  }

  public boolean isSet(quickfix.field.LegCurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrentCostBasis() {
    return isSetField(1759);
  }
}

  public void set(quickfix.field.LegAccount value) {
    setField(value);
  }

  public quickfix.field.LegAccount get(quickfix.field.LegAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAccount getLegAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAccount());
  }

  public boolean isSet(quickfix.field.LegAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAccount() {
    return isSetField(2680);
  }

  public void set(quickfix.field.LegClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.LegClearingAccountType get(quickfix.field.LegClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegClearingAccountType getLegClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.LegClearingAccountType());
  }

  public boolean isSet(quickfix.field.LegClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetLegClearingAccountType() {
    return isSetField(1817);
  }

  public void set(quickfix.field.LegPositionEffect value) {
    setField(value);
  }

  public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.LegPositionEffect());
  }

  public boolean isSet(quickfix.field.LegPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionEffect() {
    return isSetField(564);
  }

  public void set(quickfix.field.LegCoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.LegCoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetLegCoveredOrUncovered() {
    return isSetField(565);
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

  public void set(quickfix.field.LegRefID value) {
    setField(value);
  }

  public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
    return get(new quickfix.field.LegRefID());
  }

  public boolean isSet(quickfix.field.LegRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegRefID() {
    return isSetField(654);
  }

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
  }

  public void set(quickfix.field.LegSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlCurrency() {
    return isSetField(675);
  }

  public void set(quickfix.field.LegVolatility value) {
    setField(value);
  }

  public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
    return get(new quickfix.field.LegVolatility());
  }

  public boolean isSet(quickfix.field.LegVolatility field) {
    return isSetField(field);
  }

  public boolean isSetLegVolatility() {
    return isSetField(1379);
  }

  public void set(quickfix.field.LegDividendYield value) {
    setField(value);
  }

  public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
    return get(new quickfix.field.LegDividendYield());
  }

  public boolean isSet(quickfix.field.LegDividendYield field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendYield() {
    return isSetField(1381);
  }

  public void set(quickfix.field.LegCurrencyRatio value) {
    setField(value);
  }

  public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
    return get(new quickfix.field.LegCurrencyRatio());
  }

  public boolean isSet(quickfix.field.LegCurrencyRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrencyRatio() {
    return isSetField(1383);
  }

  public void set(quickfix.field.LegExecInst value) {
    setField(value);
  }

  public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
    return get(new quickfix.field.LegExecInst());
  }

  public boolean isSet(quickfix.field.LegExecInst field) {
    return isSetField(field);
  }

  public boolean isSetLegExecInst() {
    return isSetField(1384);
  }

  public void set(quickfix.field.LegShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleExemptionReason get(quickfix.field.LegShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleExemptionReason getLegShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.LegShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleExemptionReason() {
    return isSetField(1689);
  }
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

  public void set(quickfix.field.MultilegModel value) {
    setField(value);
  }

  public quickfix.field.MultilegModel get(quickfix.field.MultilegModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultilegModel getMultilegModel() throws FieldNotFound {
    return get(new quickfix.field.MultilegModel());
  }

  public boolean isSet(quickfix.field.MultilegModel field) {
    return isSetField(field);
  }

  public boolean isSetMultilegModel() {
    return isSetField(1377);
  }

  public void set(quickfix.field.MultilegPriceMethod value) {
    setField(value);
  }

  public quickfix.field.MultilegPriceMethod get(quickfix.field.MultilegPriceMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultilegPriceMethod getMultilegPriceMethod() throws FieldNotFound {
    return get(new quickfix.field.MultilegPriceMethod());
  }

  public boolean isSet(quickfix.field.MultilegPriceMethod field) {
    return isSetField(field);
  }

  public boolean isSetMultilegPriceMethod() {
    return isSetField(1378);
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

  public void set(quickfix.field.TradePriceNegotiationMethod value) {
    setField(value);
  }

  public quickfix.field.TradePriceNegotiationMethod get(quickfix.field.TradePriceNegotiationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceNegotiationMethod getTradePriceNegotiationMethod() throws FieldNotFound {
    return get(new quickfix.field.TradePriceNegotiationMethod());
  }

  public boolean isSet(quickfix.field.TradePriceNegotiationMethod field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceNegotiationMethod() {
    return isSetField(1740);
  }

  public void set(quickfix.field.UpfrontPriceType value) {
    setField(value);
  }

  public quickfix.field.UpfrontPriceType get(quickfix.field.UpfrontPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UpfrontPriceType getUpfrontPriceType() throws FieldNotFound {
    return get(new quickfix.field.UpfrontPriceType());
  }

  public boolean isSet(quickfix.field.UpfrontPriceType field) {
    return isSetField(field);
  }

  public boolean isSetUpfrontPriceType() {
    return isSetField(1741);
  }

  public void set(quickfix.field.UpfrontPrice value) {
    setField(value);
  }

  public quickfix.field.UpfrontPrice get(quickfix.field.UpfrontPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UpfrontPrice getUpfrontPrice() throws FieldNotFound {
    return get(new quickfix.field.UpfrontPrice());
  }

  public boolean isSet(quickfix.field.UpfrontPrice field) {
    return isSetField(field);
  }

  public boolean isSetUpfrontPrice() {
    return isSetField(1742);
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

  public void set(quickfix.field.IOIID value) {
    setField(value);
  }

  public quickfix.field.IOIID get(quickfix.field.IOIID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IOIID getIOIID() throws FieldNotFound {
    return get(new quickfix.field.IOIID());
  }

  public boolean isSet(quickfix.field.IOIID field) {
    return isSetField(field);
  }

  public boolean isSetIOIID() {
    return isSetField(23);
  }

  public void set(quickfix.field.QuoteID value) {
    setField(value);
  }

  public quickfix.field.QuoteID get(quickfix.field.QuoteID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteID getQuoteID() throws FieldNotFound {
    return get(new quickfix.field.QuoteID());
  }

  public boolean isSet(quickfix.field.QuoteID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteID() {
    return isSetField(117);
  }

  public void set(quickfix.field.RefOrderID value) {
    setField(value);
  }

  public quickfix.field.RefOrderID get(quickfix.field.RefOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrderID getRefOrderID() throws FieldNotFound {
    return get(new quickfix.field.RefOrderID());
  }

  public boolean isSet(quickfix.field.RefOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRefOrderID() {
    return isSetField(1080);
  }

  public void set(quickfix.field.RefOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RefOrderIDSource get(quickfix.field.RefOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RefOrderIDSource());
  }

  public boolean isSet(quickfix.field.RefOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRefOrderIDSource() {
    return isSetField(1081);
  }

  public void set(quickfix.field.RefClOrdID value) {
    setField(value);
  }

  public quickfix.field.RefClOrdID get(quickfix.field.RefClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefClOrdID getRefClOrdID() throws FieldNotFound {
    return get(new quickfix.field.RefClOrdID());
  }

  public boolean isSet(quickfix.field.RefClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetRefClOrdID() {
    return isSetField(1806);
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

  public void set(quickfix.field.RiskFreeRate value) {
    setField(value);
  }

  public quickfix.field.RiskFreeRate get(quickfix.field.RiskFreeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskFreeRate getRiskFreeRate() throws FieldNotFound {
    return get(new quickfix.field.RiskFreeRate());
  }

  public boolean isSet(quickfix.field.RiskFreeRate field) {
    return isSetField(field);
  }

  public boolean isSetRiskFreeRate() {
    return isSetField(1190);
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

  public void set(quickfix.field.MultiLegRptTypeReq value) {
    setField(value);
  }

  public quickfix.field.MultiLegRptTypeReq get(quickfix.field.MultiLegRptTypeReq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultiLegRptTypeReq getMultiLegRptTypeReq() throws FieldNotFound {
    return get(new quickfix.field.MultiLegRptTypeReq());
  }

  public boolean isSet(quickfix.field.MultiLegRptTypeReq field) {
    return isSetField(field);
  }

  public boolean isSetMultiLegRptTypeReq() {
    return isSetField(563);
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

  public void set(quickfix.field.RelatedHighPrice value) {
    setField(value);
  }

  public quickfix.field.RelatedHighPrice get(quickfix.field.RelatedHighPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedHighPrice getRelatedHighPrice() throws FieldNotFound {
    return get(new quickfix.field.RelatedHighPrice());
  }

  public boolean isSet(quickfix.field.RelatedHighPrice field) {
    return isSetField(field);
  }

  public boolean isSetRelatedHighPrice() {
    return isSetField(1819);
  }

  public void set(quickfix.field.RelatedLowPrice value) {
    setField(value);
  }

  public quickfix.field.RelatedLowPrice get(quickfix.field.RelatedLowPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedLowPrice getRelatedLowPrice() throws FieldNotFound {
    return get(new quickfix.field.RelatedLowPrice());
  }

  public boolean isSet(quickfix.field.RelatedLowPrice field) {
    return isSetField(field);
  }

  public boolean isSetRelatedLowPrice() {
    return isSetField(1820);
  }

  public void set(quickfix.field.RelatedPriceSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPriceSource get(quickfix.field.RelatedPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPriceSource getRelatedPriceSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPriceSource());
  }

  public boolean isSet(quickfix.field.RelatedPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPriceSource() {
    return isSetField(1821);
  }
}
