/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class AllocationInstructionAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "P";

  public AllocationInstructionAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public AllocationInstructionAck (quickfix.field.AllocID allocID, quickfix.field.AllocStatus allocStatus) {
    this();
    setField(allocID);
    setField(allocStatus);
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

  public void set(quickfix.field.AllocRequestID value) {
    setField(value);
  }

  public quickfix.field.AllocRequestID get(quickfix.field.AllocRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRequestID getAllocRequestID() throws FieldNotFound {
    return get(new quickfix.field.AllocRequestID());
  }

  public boolean isSet(quickfix.field.AllocRequestID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRequestID() {
    return isSetField(2758);
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

  public void set(quickfix.field.AllocGroupID value) {
    setField(value);
  }

  public quickfix.field.AllocGroupID get(quickfix.field.AllocGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupID getAllocGroupID() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupID());
  }

  public boolean isSet(quickfix.field.AllocGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupID() {
    return isSetField(1730);
  }

  public void set(quickfix.field.FirmGroupID value) {
    setField(value);
  }

  public quickfix.field.FirmGroupID get(quickfix.field.FirmGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmGroupID getFirmGroupID() throws FieldNotFound {
    return get(new quickfix.field.FirmGroupID());
  }

  public boolean isSet(quickfix.field.FirmGroupID field) {
    return isSetField(field);
  }

  public boolean isSetFirmGroupID() {
    return isSetField(1728);
  }

  public void set(quickfix.field.AvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.AvgPxGroupID get(quickfix.field.AvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPxGroupID getAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.AvgPxGroupID());
  }

  public boolean isSet(quickfix.field.AvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAvgPxGroupID() {
    return isSetField(1731);
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

  public void set(quickfix.field.AllocStatus value) {
    setField(value);
  }

  public quickfix.field.AllocStatus get(quickfix.field.AllocStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocStatus getAllocStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocStatus());
  }

  public boolean isSet(quickfix.field.AllocStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocStatus() {
    return isSetField(87);
  }

  public void set(quickfix.field.AllocRejCode value) {
    setField(value);
  }

  public quickfix.field.AllocRejCode get(quickfix.field.AllocRejCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRejCode getAllocRejCode() throws FieldNotFound {
    return get(new quickfix.field.AllocRejCode());
  }

  public boolean isSet(quickfix.field.AllocRejCode field) {
    return isSetField(field);
  }

  public boolean isSetAllocRejCode() {
    return isSetField(88);
  }

  public void set(quickfix.field.AllocType value) {
    setField(value);
  }

  public quickfix.field.AllocType get(quickfix.field.AllocType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocType getAllocType() throws FieldNotFound {
    return get(new quickfix.field.AllocType());
  }

  public boolean isSet(quickfix.field.AllocType field) {
    return isSetField(field);
  }

  public boolean isSetAllocType() {
    return isSetField(626);
  }

  public void set(quickfix.field.AllocIntermedReqType value) {
    setField(value);
  }

  public quickfix.field.AllocIntermedReqType get(quickfix.field.AllocIntermedReqType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocIntermedReqType getAllocIntermedReqType() throws FieldNotFound {
    return get(new quickfix.field.AllocIntermedReqType());
  }

  public boolean isSet(quickfix.field.AllocIntermedReqType field) {
    return isSetField(field);
  }

  public boolean isSetAllocIntermedReqType() {
    return isSetField(808);
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

  public void set(quickfix.field.RejectText value) {
    setField(value);
  }

  public quickfix.field.RejectText get(quickfix.field.RejectText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RejectText getRejectText() throws FieldNotFound {
    return get(new quickfix.field.RejectText());
  }

  public boolean isSet(quickfix.field.RejectText field) {
    return isSetField(field);
  }

  public boolean isSetRejectText() {
    return isSetField(1328);
  }

  public void set(quickfix.field.EncodedRejectTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedRejectTextLen get(quickfix.field.EncodedRejectTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedRejectTextLen getEncodedRejectTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedRejectTextLen());
  }

  public boolean isSet(quickfix.field.EncodedRejectTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedRejectTextLen() {
    return isSetField(1664);
  }

  public void set(quickfix.field.EncodedRejectText value) {
    setField(value);
  }

  public quickfix.field.EncodedRejectText get(quickfix.field.EncodedRejectText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedRejectText getEncodedRejectText() throws FieldNotFound {
    return get(new quickfix.field.EncodedRejectText());
  }

  public boolean isSet(quickfix.field.EncodedRejectText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedRejectText() {
    return isSetField(1665);
  }

  public void set(quickfix.fixlatest.component.RegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RegulatoryTradeIDGrp get(quickfix.fixlatest.component.RegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RegulatoryTradeIDGrp getRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoRegulatoryTradeIDs get(quickfix.field.NoRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRegulatoryTradeIDs getNoRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRegulatoryTradeIDs() {
    return isSetField(1907);
  }

public static class NoRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1903, 1905, 1904, 1906, 2411, 2397, 0};

  public NoRegulatoryTradeIDs() {
    super(1907, 1903, ORDER);
  }

  public void set(quickfix.field.RegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeID get(quickfix.field.RegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeID getRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeID() {
    return isSetField(1903);
  }

  public void set(quickfix.field.RegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDSource get(quickfix.field.RegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDSource getRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDSource() {
    return isSetField(1905);
  }

  public void set(quickfix.field.RegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDEvent get(quickfix.field.RegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDEvent getRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDEvent() {
    return isSetField(1904);
  }

  public void set(quickfix.field.RegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDType get(quickfix.field.RegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDType getRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDType() {
    return isSetField(1906);
  }

  public void set(quickfix.field.RegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryLegRefID get(quickfix.field.RegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryLegRefID getRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.RegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryLegRefID() {
    return isSetField(2411);
  }

  public void set(quickfix.field.RegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDScope get(quickfix.field.RegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDScope getRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDScope() {
    return isSetField(2397);
  }
}

  public void set(quickfix.fixlatest.component.AllocAckGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocAckGrp get(quickfix.fixlatest.component.AllocAckGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocAckGrp getAllocAckGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocAckGrp());
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
  private static final int[]  ORDER = {79, 661, 366, 1047, 467, 1593, 1729, 1832, 2727, 1908, 776, 539, 209, 161, 360, 361, 1732, 1733, 1734, 989, 993, 992, 80, 2515, 1752, 1753, 1754, 1755, 2770, 2769, 0};

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

  public void set(quickfix.field.AllocPrice value) {
    setField(value);
  }

  public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocPrice getAllocPrice() throws FieldNotFound {
    return get(new quickfix.field.AllocPrice());
  }

  public boolean isSet(quickfix.field.AllocPrice field) {
    return isSetField(field);
  }

  public boolean isSetAllocPrice() {
    return isSetField(366);
  }

  public void set(quickfix.field.AllocPositionEffect value) {
    setField(value);
  }

  public quickfix.field.AllocPositionEffect get(quickfix.field.AllocPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocPositionEffect getAllocPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.AllocPositionEffect());
  }

  public boolean isSet(quickfix.field.AllocPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetAllocPositionEffect() {
    return isSetField(1047);
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

  public void set(quickfix.field.ParentAllocID value) {
    setField(value);
  }

  public quickfix.field.ParentAllocID get(quickfix.field.ParentAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentAllocID getParentAllocID() throws FieldNotFound {
    return get(new quickfix.field.ParentAllocID());
  }

  public boolean isSet(quickfix.field.ParentAllocID field) {
    return isSetField(field);
  }

  public boolean isSetParentAllocID() {
    return isSetField(1593);
  }

  public void set(quickfix.field.FirmMnemonic value) {
    setField(value);
  }

  public quickfix.field.FirmMnemonic get(quickfix.field.FirmMnemonic value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmMnemonic getFirmMnemonic() throws FieldNotFound {
    return get(new quickfix.field.FirmMnemonic());
  }

  public boolean isSet(quickfix.field.FirmMnemonic field) {
    return isSetField(field);
  }

  public boolean isSetFirmMnemonic() {
    return isSetField(1729);
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

  public void set(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp get(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp getAllocRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoAllocRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs get(quickfix.field.NoAllocRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs getNoAllocRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoAllocRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocRegulatoryTradeIDs() {
    return isSetField(1908);
  }

public static class NoAllocRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1909, 1910, 1911, 1912, 2406, 2399, 0};

  public NoAllocRegulatoryTradeIDs() {
    super(1908, 1909, ORDER);
  }

  public void set(quickfix.field.AllocRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeID get(quickfix.field.AllocRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeID getAllocRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeID() {
    return isSetField(1909);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDSource get(quickfix.field.AllocRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDSource getAllocRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDSource() {
    return isSetField(1910);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent get(quickfix.field.AllocRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent getAllocRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDEvent() {
    return isSetField(1911);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDType get(quickfix.field.AllocRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDType getAllocRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDType() {
    return isSetField(1912);
  }

  public void set(quickfix.field.AllocRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryLegRefID get(quickfix.field.AllocRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryLegRefID getAllocRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryLegRefID() {
    return isSetField(2406);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDScope get(quickfix.field.AllocRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDScope getAllocRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDScope() {
    return isSetField(2399);
  }
}

  public void set(quickfix.field.IndividualAllocRejCode value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocRejCode get(quickfix.field.IndividualAllocRejCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocRejCode getIndividualAllocRejCode() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocRejCode());
  }

  public boolean isSet(quickfix.field.IndividualAllocRejCode field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocRejCode() {
    return isSetField(776);
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

  public void set(quickfix.field.AllocText value) {
    setField(value);
  }

  public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocText getAllocText() throws FieldNotFound {
    return get(new quickfix.field.AllocText());
  }

  public boolean isSet(quickfix.field.AllocText field) {
    return isSetField(field);
  }

  public boolean isSetAllocText() {
    return isSetField(161);
  }

  public void set(quickfix.field.EncodedAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocTextLen() {
    return isSetField(360);
  }

  public void set(quickfix.field.EncodedAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocText());
  }

  public boolean isSet(quickfix.field.EncodedAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocText() {
    return isSetField(361);
  }

  public void set(quickfix.field.FirmAllocText value) {
    setField(value);
  }

  public quickfix.field.FirmAllocText get(quickfix.field.FirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmAllocText getFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.FirmAllocText());
  }

  public boolean isSet(quickfix.field.FirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetFirmAllocText() {
    return isSetField(1732);
  }

  public void set(quickfix.field.EncodedFirmAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocTextLen get(quickfix.field.EncodedFirmAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocTextLen getEncodedFirmAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocTextLen() {
    return isSetField(1733);
  }

  public void set(quickfix.field.EncodedFirmAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocText get(quickfix.field.EncodedFirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocText getEncodedFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocText());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocText() {
    return isSetField(1734);
  }

  public void set(quickfix.field.SecondaryIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryIndividualAllocID());
  }

  public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryIndividualAllocID() {
    return isSetField(989);
  }

  public void set(quickfix.field.AllocCustomerCapacity value) {
    setField(value);
  }

  public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
    return get(new quickfix.field.AllocCustomerCapacity());
  }

  public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
    return isSetField(field);
  }

  public boolean isSetAllocCustomerCapacity() {
    return isSetField(993);
  }

  public void set(quickfix.field.IndividualAllocType value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocType get(quickfix.field.IndividualAllocType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocType getIndividualAllocType() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocType());
  }

  public boolean isSet(quickfix.field.IndividualAllocType field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocType() {
    return isSetField(992);
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

  public void set(quickfix.field.AllocCalculatedCcyQty value) {
    setField(value);
  }

  public quickfix.field.AllocCalculatedCcyQty get(quickfix.field.AllocCalculatedCcyQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCalculatedCcyQty getAllocCalculatedCcyQty() throws FieldNotFound {
    return get(new quickfix.field.AllocCalculatedCcyQty());
  }

  public boolean isSet(quickfix.field.AllocCalculatedCcyQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocCalculatedCcyQty() {
    return isSetField(2515);
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

  public void set(quickfix.field.AllocAvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPxGroupID get(quickfix.field.AllocAvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPxGroupID getAllocAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPxGroupID());
  }

  public boolean isSet(quickfix.field.AllocAvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPxGroupID() {
    return isSetField(2770);
  }

  public void set(quickfix.field.AllocAvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocAvgPxIndicator get(quickfix.field.AllocAvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAvgPxIndicator getAllocAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocAvgPxIndicator());
  }

  public boolean isSet(quickfix.field.AllocAvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocAvgPxIndicator() {
    return isSetField(2769);
  }
}
}
