/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class TradeCaptureReportAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AR";

  public TradeCaptureReportAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public void set(quickfix.field.TradeReportID value) {
    setField(value);
  }

  public quickfix.field.TradeReportID get(quickfix.field.TradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportID getTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.TradeReportID());
  }

  public boolean isSet(quickfix.field.TradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportID() {
    return isSetField(571);
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

  public void set(quickfix.field.SecondaryTradeID value) {
    setField(value);
  }

  public quickfix.field.SecondaryTradeID get(quickfix.field.SecondaryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTradeID getSecondaryTradeID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTradeID());
  }

  public boolean isSet(quickfix.field.SecondaryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTradeID() {
    return isSetField(1040);
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

  public void set(quickfix.field.SecondaryFirmTradeID value) {
    setField(value);
  }

  public quickfix.field.SecondaryFirmTradeID get(quickfix.field.SecondaryFirmTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryFirmTradeID getSecondaryFirmTradeID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryFirmTradeID());
  }

  public boolean isSet(quickfix.field.SecondaryFirmTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryFirmTradeID() {
    return isSetField(1042);
  }

  public void set(quickfix.field.TradeReportTransType value) {
    setField(value);
  }

  public quickfix.field.TradeReportTransType get(quickfix.field.TradeReportTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportTransType getTradeReportTransType() throws FieldNotFound {
    return get(new quickfix.field.TradeReportTransType());
  }

  public boolean isSet(quickfix.field.TradeReportTransType field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportTransType() {
    return isSetField(487);
  }

  public void set(quickfix.field.TradeReportType value) {
    setField(value);
  }

  public quickfix.field.TradeReportType get(quickfix.field.TradeReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportType getTradeReportType() throws FieldNotFound {
    return get(new quickfix.field.TradeReportType());
  }

  public boolean isSet(quickfix.field.TradeReportType field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportType() {
    return isSetField(856);
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

  public void set(quickfix.field.OffsetInstruction value) {
    setField(value);
  }

  public quickfix.field.OffsetInstruction get(quickfix.field.OffsetInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OffsetInstruction getOffsetInstruction() throws FieldNotFound {
    return get(new quickfix.field.OffsetInstruction());
  }

  public boolean isSet(quickfix.field.OffsetInstruction field) {
    return isSetField(field);
  }

  public boolean isSetOffsetInstruction() {
    return isSetField(1849);
  }

  public void set(quickfix.field.TradeHandlingInstr value) {
    setField(value);
  }

  public quickfix.field.TradeHandlingInstr get(quickfix.field.TradeHandlingInstr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeHandlingInstr getTradeHandlingInstr() throws FieldNotFound {
    return get(new quickfix.field.TradeHandlingInstr());
  }

  public boolean isSet(quickfix.field.TradeHandlingInstr field) {
    return isSetField(field);
  }

  public boolean isSetTradeHandlingInstr() {
    return isSetField(1123);
  }

  public void set(quickfix.field.OrigTradeHandlingInstr value) {
    setField(value);
  }

  public quickfix.field.OrigTradeHandlingInstr get(quickfix.field.OrigTradeHandlingInstr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigTradeHandlingInstr getOrigTradeHandlingInstr() throws FieldNotFound {
    return get(new quickfix.field.OrigTradeHandlingInstr());
  }

  public boolean isSet(quickfix.field.OrigTradeHandlingInstr field) {
    return isSetField(field);
  }

  public boolean isSetOrigTradeHandlingInstr() {
    return isSetField(1124);
  }

  public void set(quickfix.field.OrigTradeDate value) {
    setField(value);
  }

  public quickfix.field.OrigTradeDate get(quickfix.field.OrigTradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigTradeDate getOrigTradeDate() throws FieldNotFound {
    return get(new quickfix.field.OrigTradeDate());
  }

  public boolean isSet(quickfix.field.OrigTradeDate field) {
    return isSetField(field);
  }

  public boolean isSetOrigTradeDate() {
    return isSetField(1125);
  }

  public void set(quickfix.field.OrigTradeID value) {
    setField(value);
  }

  public quickfix.field.OrigTradeID get(quickfix.field.OrigTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigTradeID getOrigTradeID() throws FieldNotFound {
    return get(new quickfix.field.OrigTradeID());
  }

  public boolean isSet(quickfix.field.OrigTradeID field) {
    return isSetField(field);
  }

  public boolean isSetOrigTradeID() {
    return isSetField(1126);
  }

  public void set(quickfix.field.OrigSecondaryTradeID value) {
    setField(value);
  }

  public quickfix.field.OrigSecondaryTradeID get(quickfix.field.OrigSecondaryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigSecondaryTradeID getOrigSecondaryTradeID() throws FieldNotFound {
    return get(new quickfix.field.OrigSecondaryTradeID());
  }

  public boolean isSet(quickfix.field.OrigSecondaryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetOrigSecondaryTradeID() {
    return isSetField(1127);
  }

  public void set(quickfix.field.TransferReason value) {
    setField(value);
  }

  public quickfix.field.TransferReason get(quickfix.field.TransferReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransferReason getTransferReason() throws FieldNotFound {
    return get(new quickfix.field.TransferReason());
  }

  public boolean isSet(quickfix.field.TransferReason field) {
    return isSetField(field);
  }

  public boolean isSetTransferReason() {
    return isSetField(830);
  }

  public void set(quickfix.fixlatest.component.RootParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RootParties get(quickfix.fixlatest.component.RootParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RootParties getRootPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RootParties());
  }

  public void set(quickfix.field.NoRootPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoRootPartyIDs get(quickfix.field.NoRootPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRootPartyIDs getNoRootPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRootPartyIDs());
  }

  public boolean isSet(quickfix.field.NoRootPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRootPartyIDs() {
    return isSetField(1116);
  }

public static class NoRootPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1117, 1118, 1119, 2388, 1120, 0};

  public NoRootPartyIDs() {
    super(1116, 1117, ORDER);
  }

  public void set(quickfix.field.RootPartyID value) {
    setField(value);
  }

  public quickfix.field.RootPartyID get(quickfix.field.RootPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyID getRootPartyID() throws FieldNotFound {
    return get(new quickfix.field.RootPartyID());
  }

  public boolean isSet(quickfix.field.RootPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyID() {
    return isSetField(1117);
  }

  public void set(quickfix.field.RootPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RootPartyIDSource get(quickfix.field.RootPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyIDSource getRootPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RootPartyIDSource());
  }

  public boolean isSet(quickfix.field.RootPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyIDSource() {
    return isSetField(1118);
  }

  public void set(quickfix.field.RootPartyRole value) {
    setField(value);
  }

  public quickfix.field.RootPartyRole get(quickfix.field.RootPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRole getRootPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRole());
  }

  public boolean isSet(quickfix.field.RootPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRole() {
    return isSetField(1119);
  }

  public void set(quickfix.field.RootPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RootPartyRoleQualifier get(quickfix.field.RootPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRoleQualifier getRootPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RootPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRoleQualifier() {
    return isSetField(2388);
  }

  public void set(quickfix.fixlatest.component.RootSubParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RootSubParties get(quickfix.fixlatest.component.RootSubParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RootSubParties getRootSubPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RootSubParties());
  }

  public void set(quickfix.field.NoRootPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRootPartySubIDs get(quickfix.field.NoRootPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRootPartySubIDs getNoRootPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRootPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoRootPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRootPartySubIDs() {
    return isSetField(1120);
  }

public static class NoRootPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1121, 1122, 0};

  public NoRootPartySubIDs() {
    super(1120, 1121, ORDER);
  }

  public void set(quickfix.field.RootPartySubID value) {
    setField(value);
  }

  public quickfix.field.RootPartySubID get(quickfix.field.RootPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubID getRootPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubID());
  }

  public boolean isSet(quickfix.field.RootPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubID() {
    return isSetField(1121);
  }

  public void set(quickfix.field.RootPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RootPartySubIDType get(quickfix.field.RootPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubIDType getRootPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubIDType());
  }

  public boolean isSet(quickfix.field.RootPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubIDType() {
    return isSetField(1122);
  }
}
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

  public void set(quickfix.field.TradeReportRefID value) {
    setField(value);
  }

  public quickfix.field.TradeReportRefID get(quickfix.field.TradeReportRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportRefID getTradeReportRefID() throws FieldNotFound {
    return get(new quickfix.field.TradeReportRefID());
  }

  public boolean isSet(quickfix.field.TradeReportRefID field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportRefID() {
    return isSetField(572);
  }

  public void set(quickfix.field.SecondaryTradeReportRefID value) {
    setField(value);
  }

  public quickfix.field.SecondaryTradeReportRefID get(quickfix.field.SecondaryTradeReportRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTradeReportRefID getSecondaryTradeReportRefID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTradeReportRefID());
  }

  public boolean isSet(quickfix.field.SecondaryTradeReportRefID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTradeReportRefID() {
    return isSetField(881);
  }

  public void set(quickfix.field.TrdRptStatus value) {
    setField(value);
  }

  public quickfix.field.TrdRptStatus get(quickfix.field.TrdRptStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRptStatus getTrdRptStatus() throws FieldNotFound {
    return get(new quickfix.field.TrdRptStatus());
  }

  public boolean isSet(quickfix.field.TrdRptStatus field) {
    return isSetField(field);
  }

  public boolean isSetTrdRptStatus() {
    return isSetField(939);
  }

  public void set(quickfix.field.TrdAckStatus value) {
    setField(value);
  }

  public quickfix.field.TrdAckStatus get(quickfix.field.TrdAckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdAckStatus getTrdAckStatus() throws FieldNotFound {
    return get(new quickfix.field.TrdAckStatus());
  }

  public boolean isSet(quickfix.field.TrdAckStatus field) {
    return isSetField(field);
  }

  public boolean isSetTrdAckStatus() {
    return isSetField(1523);
  }

  public void set(quickfix.field.TradeReportRejectReason value) {
    setField(value);
  }

  public quickfix.field.TradeReportRejectReason get(quickfix.field.TradeReportRejectReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportRejectReason getTradeReportRejectReason() throws FieldNotFound {
    return get(new quickfix.field.TradeReportRejectReason());
  }

  public boolean isSet(quickfix.field.TradeReportRejectReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportRejectReason() {
    return isSetField(751);
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

  public void set(quickfix.field.SecondaryTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SecondaryTradeReportID get(quickfix.field.SecondaryTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTradeReportID getSecondaryTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTradeReportID());
  }

  public boolean isSet(quickfix.field.SecondaryTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTradeReportID() {
    return isSetField(818);
  }

  public void set(quickfix.field.SubscriptionRequestType value) {
    setField(value);
  }

  public quickfix.field.SubscriptionRequestType get(quickfix.field.SubscriptionRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
    return get(new quickfix.field.SubscriptionRequestType());
  }

  public boolean isSet(quickfix.field.SubscriptionRequestType field) {
    return isSetField(field);
  }

  public boolean isSetSubscriptionRequestType() {
    return isSetField(263);
  }

  public void set(quickfix.field.TradeLinkID value) {
    setField(value);
  }

  public quickfix.field.TradeLinkID get(quickfix.field.TradeLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeLinkID getTradeLinkID() throws FieldNotFound {
    return get(new quickfix.field.TradeLinkID());
  }

  public boolean isSet(quickfix.field.TradeLinkID field) {
    return isSetField(field);
  }

  public boolean isSetTradeLinkID() {
    return isSetField(820);
  }

  public void set(quickfix.field.TrdMatchID value) {
    setField(value);
  }

  public quickfix.field.TrdMatchID get(quickfix.field.TrdMatchID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdMatchID getTrdMatchID() throws FieldNotFound {
    return get(new quickfix.field.TrdMatchID());
  }

  public boolean isSet(quickfix.field.TrdMatchID field) {
    return isSetField(field);
  }

  public boolean isSetTrdMatchID() {
    return isSetField(880);
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

  public void set(quickfix.field.ExecRestatementReason value) {
    setField(value);
  }

  public quickfix.field.ExecRestatementReason get(quickfix.field.ExecRestatementReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecRestatementReason getExecRestatementReason() throws FieldNotFound {
    return get(new quickfix.field.ExecRestatementReason());
  }

  public boolean isSet(quickfix.field.ExecRestatementReason field) {
    return isSetField(field);
  }

  public boolean isSetExecRestatementReason() {
    return isSetField(378);
  }

  public void set(quickfix.field.PreviouslyReported value) {
    setField(value);
  }

  public quickfix.field.PreviouslyReported get(quickfix.field.PreviouslyReported value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviouslyReported getPreviouslyReported() throws FieldNotFound {
    return get(new quickfix.field.PreviouslyReported());
  }

  public boolean isSet(quickfix.field.PreviouslyReported field) {
    return isSetField(field);
  }

  public boolean isSetPreviouslyReported() {
    return isSetField(570);
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

  public void set(quickfix.field.CrossType value) {
    setField(value);
  }

  public quickfix.field.CrossType get(quickfix.field.CrossType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossType getCrossType() throws FieldNotFound {
    return get(new quickfix.field.CrossType());
  }

  public boolean isSet(quickfix.field.CrossType field) {
    return isSetField(field);
  }

  public boolean isSetCrossType() {
    return isSetField(549);
  }

  public void set(quickfix.field.UnderlyingTradingSessionID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingTradingSessionID get(quickfix.field.UnderlyingTradingSessionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingTradingSessionID getUnderlyingTradingSessionID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingTradingSessionID());
  }

  public boolean isSet(quickfix.field.UnderlyingTradingSessionID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingTradingSessionID() {
    return isSetField(822);
  }

  public void set(quickfix.field.UnderlyingTradingSessionSubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingTradingSessionSubID get(quickfix.field.UnderlyingTradingSessionSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingTradingSessionSubID getUnderlyingTradingSessionSubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingTradingSessionSubID());
  }

  public boolean isSet(quickfix.field.UnderlyingTradingSessionSubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingTradingSessionSubID() {
    return isSetField(823);
  }

  public void set(quickfix.field.SettlSessID value) {
    setField(value);
  }

  public quickfix.field.SettlSessID get(quickfix.field.SettlSessID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSessID getSettlSessID() throws FieldNotFound {
    return get(new quickfix.field.SettlSessID());
  }

  public boolean isSet(quickfix.field.SettlSessID field) {
    return isSetField(field);
  }

  public boolean isSetSettlSessID() {
    return isSetField(716);
  }

  public void set(quickfix.field.SettlSessSubID value) {
    setField(value);
  }

  public quickfix.field.SettlSessSubID get(quickfix.field.SettlSessSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSessSubID getSettlSessSubID() throws FieldNotFound {
    return get(new quickfix.field.SettlSessSubID());
  }

  public boolean isSet(quickfix.field.SettlSessSubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlSessSubID() {
    return isSetField(717);
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

  public void set(quickfix.field.VenueType value) {
    setField(value);
  }

  public quickfix.field.VenueType get(quickfix.field.VenueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VenueType getVenueType() throws FieldNotFound {
    return get(new quickfix.field.VenueType());
  }

  public boolean isSet(quickfix.field.VenueType field) {
    return isSetField(field);
  }

  public boolean isSetVenueType() {
    return isSetField(1430);
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

  public void set(quickfix.field.MarketID value) {
    setField(value);
  }

  public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketID getMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarketID());
  }

  public boolean isSet(quickfix.field.MarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarketID() {
    return isSetField(1301);
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

  public void set(quickfix.field.CalculatedCcyLastQty value) {
    setField(value);
  }

  public quickfix.field.CalculatedCcyLastQty get(quickfix.field.CalculatedCcyLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CalculatedCcyLastQty getCalculatedCcyLastQty() throws FieldNotFound {
    return get(new quickfix.field.CalculatedCcyLastQty());
  }

  public boolean isSet(quickfix.field.CalculatedCcyLastQty field) {
    return isSetField(field);
  }

  public boolean isSetCalculatedCcyLastQty() {
    return isSetField(1056);
  }

  public void set(quickfix.field.LastSwapPoints value) {
    setField(value);
  }

  public quickfix.field.LastSwapPoints get(quickfix.field.LastSwapPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastSwapPoints getLastSwapPoints() throws FieldNotFound {
    return get(new quickfix.field.LastSwapPoints());
  }

  public boolean isSet(quickfix.field.LastSwapPoints field) {
    return isSetField(field);
  }

  public boolean isSetLastSwapPoints() {
    return isSetField(1071);
  }

  public void set(quickfix.field.PriceMarkup value) {
    setField(value);
  }

  public quickfix.field.PriceMarkup get(quickfix.field.PriceMarkup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMarkup getPriceMarkup() throws FieldNotFound {
    return get(new quickfix.field.PriceMarkup());
  }

  public boolean isSet(quickfix.field.PriceMarkup field) {
    return isSetField(field);
  }

  public boolean isSetPriceMarkup() {
    return isSetField(2762);
  }

  public void set(quickfix.fixlatest.component.AveragePriceDetail component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AveragePriceDetail get(quickfix.fixlatest.component.AveragePriceDetail component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AveragePriceDetail getAveragePriceDetailComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AveragePriceDetail());
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

  public void set(quickfix.field.LastSpotRate value) {
    setField(value);
  }

  public quickfix.field.LastSpotRate get(quickfix.field.LastSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastSpotRate getLastSpotRate() throws FieldNotFound {
    return get(new quickfix.field.LastSpotRate());
  }

  public boolean isSet(quickfix.field.LastSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetLastSpotRate() {
    return isSetField(194);
  }

  public void set(quickfix.field.LastForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LastForwardPoints get(quickfix.field.LastForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastForwardPoints getLastForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LastForwardPoints());
  }

  public boolean isSet(quickfix.field.LastForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLastForwardPoints() {
    return isSetField(195);
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

  public void set(quickfix.field.ClearingBusinessDate value) {
    setField(value);
  }

  public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.ClearingBusinessDate());
  }

  public boolean isSet(quickfix.field.ClearingBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetClearingBusinessDate() {
    return isSetField(715);
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

  public void set(quickfix.field.AvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.AvgPxIndicator get(quickfix.field.AvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPxIndicator getAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.AvgPxIndicator());
  }

  public boolean isSet(quickfix.field.AvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAvgPxIndicator() {
    return isSetField(819);
  }

  public void set(quickfix.field.MultiLegReportingType value) {
    setField(value);
  }

  public quickfix.field.MultiLegReportingType get(quickfix.field.MultiLegReportingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound {
    return get(new quickfix.field.MultiLegReportingType());
  }

  public boolean isSet(quickfix.field.MultiLegReportingType field) {
    return isSetField(field);
  }

  public boolean isSetMultiLegReportingType() {
    return isSetField(442);
  }

  public void set(quickfix.field.TradeLegRefID value) {
    setField(value);
  }

  public quickfix.field.TradeLegRefID get(quickfix.field.TradeLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeLegRefID getTradeLegRefID() throws FieldNotFound {
    return get(new quickfix.field.TradeLegRefID());
  }

  public boolean isSet(quickfix.field.TradeLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetTradeLegRefID() {
    return isSetField(824);
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

  public void set(quickfix.fixlatest.component.TrdRepIndicatorsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRepIndicatorsGrp get(quickfix.fixlatest.component.TrdRepIndicatorsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRepIndicatorsGrp getTrdRepIndicatorsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRepIndicatorsGrp());
  }

  public void set(quickfix.field.NoTrdRepIndicators value) {
    setField(value);
  }

  public quickfix.field.NoTrdRepIndicators get(quickfix.field.NoTrdRepIndicators value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRepIndicators getNoTrdRepIndicators() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRepIndicators());
  }

  public boolean isSet(quickfix.field.NoTrdRepIndicators field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRepIndicators() {
    return isSetField(1387);
  }

public static class NoTrdRepIndicators extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1388, 1389, 0};

  public NoTrdRepIndicators() {
    super(1387, 1388, ORDER);
  }

  public void set(quickfix.field.TrdRepPartyRole value) {
    setField(value);
  }

  public quickfix.field.TrdRepPartyRole get(quickfix.field.TrdRepPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRepPartyRole getTrdRepPartyRole() throws FieldNotFound {
    return get(new quickfix.field.TrdRepPartyRole());
  }

  public boolean isSet(quickfix.field.TrdRepPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetTrdRepPartyRole() {
    return isSetField(1388);
  }

  public void set(quickfix.field.TrdRepIndicator value) {
    setField(value);
  }

  public quickfix.field.TrdRepIndicator get(quickfix.field.TrdRepIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRepIndicator getTrdRepIndicator() throws FieldNotFound {
    return get(new quickfix.field.TrdRepIndicator());
  }

  public boolean isSet(quickfix.field.TrdRepIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTrdRepIndicator() {
    return isSetField(1389);
  }
}

  public void set(quickfix.field.PublishTrdIndicator value) {
    setField(value);
  }

  public quickfix.field.PublishTrdIndicator get(quickfix.field.PublishTrdIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PublishTrdIndicator getPublishTrdIndicator() throws FieldNotFound {
    return get(new quickfix.field.PublishTrdIndicator());
  }

  public boolean isSet(quickfix.field.PublishTrdIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPublishTrdIndicator() {
    return isSetField(852);
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

  public void set(quickfix.field.ShortSaleReason value) {
    setField(value);
  }

  public quickfix.field.ShortSaleReason get(quickfix.field.ShortSaleReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortSaleReason getShortSaleReason() throws FieldNotFound {
    return get(new quickfix.field.ShortSaleReason());
  }

  public boolean isSet(quickfix.field.ShortSaleReason field) {
    return isSetField(field);
  }

  public boolean isSetShortSaleReason() {
    return isSetField(853);
  }

  public void set(quickfix.fixlatest.component.TrdInstrmtLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdInstrmtLegGrp get(quickfix.fixlatest.component.TrdInstrmtLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdInstrmtLegGrp getTrdInstrmtLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdInstrmtLegGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 2497, 2498, 2499, 2496, 2495, 2511, 2510, 2512, 2509, 2500, 42198, 42200, 42203, 2502, 2501, 2503, 2507, 2505, 2494, 2493, 2514, 2513, 2506, 2504, 2508, 1586, 685, 687, 2346, 690, 990, 1152, 683, 2680, 1817, 564, 565, 539, 654, 587, 588, 637, 686, 675, 1073, 1074, 1075, 1689, 1379, 1381, 1383, 1384, 1418, 1591, 2358, 2357, 2360, 2359, 1342, 2492, 0};

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

  public void set(quickfix.fixlatest.component.LegPositionAmountData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPositionAmountData get(quickfix.fixlatest.component.LegPositionAmountData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPositionAmountData getLegPositionAmountDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPositionAmountData());
  }

  public void set(quickfix.field.NoLegPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoLegPosAmt get(quickfix.field.NoLegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPosAmt getNoLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoLegPosAmt());
  }

  public boolean isSet(quickfix.field.NoLegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPosAmt() {
    return isSetField(1586);
  }

public static class NoLegPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1587, 1588, 1589, 1590, 0};

  public NoLegPosAmt() {
    super(1586, 1587, ORDER);
  }

  public void set(quickfix.field.LegPosAmt value) {
    setField(value);
  }

  public quickfix.field.LegPosAmt get(quickfix.field.LegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmt getLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmt());
  }

  public boolean isSet(quickfix.field.LegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmt() {
    return isSetField(1587);
  }

  public void set(quickfix.field.LegPosAmtType value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtType get(quickfix.field.LegPosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtType getLegPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtType());
  }

  public boolean isSet(quickfix.field.LegPosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtType() {
    return isSetField(1588);
  }

  public void set(quickfix.field.LegPosCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPosCurrency get(quickfix.field.LegPosCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosCurrency getLegPosCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPosCurrency());
  }

  public boolean isSet(quickfix.field.LegPosCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPosCurrency() {
    return isSetField(1589);
  }

  public void set(quickfix.field.LegPosAmtReason value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtReason get(quickfix.field.LegPosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtReason getLegPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtReason());
  }

  public boolean isSet(quickfix.field.LegPosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtReason() {
    return isSetField(1590);
  }
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

  public void set(quickfix.field.LegMidPx value) {
    setField(value);
  }

  public quickfix.field.LegMidPx get(quickfix.field.LegMidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMidPx getLegMidPx() throws FieldNotFound {
    return get(new quickfix.field.LegMidPx());
  }

  public boolean isSet(quickfix.field.LegMidPx field) {
    return isSetField(field);
  }

  public boolean isSetLegMidPx() {
    return isSetField(2346);
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

  public void set(quickfix.field.LegReportID value) {
    setField(value);
  }

  public quickfix.field.LegReportID get(quickfix.field.LegReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReportID getLegReportID() throws FieldNotFound {
    return get(new quickfix.field.LegReportID());
  }

  public boolean isSet(quickfix.field.LegReportID field) {
    return isSetField(field);
  }

  public boolean isSetLegReportID() {
    return isSetField(990);
  }

  public void set(quickfix.field.LegNumber value) {
    setField(value);
  }

  public quickfix.field.LegNumber get(quickfix.field.LegNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNumber getLegNumber() throws FieldNotFound {
    return get(new quickfix.field.LegNumber());
  }

  public boolean isSet(quickfix.field.LegNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegNumber() {
    return isSetField(1152);
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

  public void set(quickfix.field.LegLastPx value) {
    setField(value);
  }

  public quickfix.field.LegLastPx get(quickfix.field.LegLastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound {
    return get(new quickfix.field.LegLastPx());
  }

  public boolean isSet(quickfix.field.LegLastPx field) {
    return isSetField(field);
  }

  public boolean isSetLegLastPx() {
    return isSetField(637);
  }

  public void set(quickfix.field.LegPriceType value) {
    setField(value);
  }

  public quickfix.field.LegPriceType get(quickfix.field.LegPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceType getLegPriceType() throws FieldNotFound {
    return get(new quickfix.field.LegPriceType());
  }

  public boolean isSet(quickfix.field.LegPriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceType() {
    return isSetField(686);
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

  public void set(quickfix.field.LegLastForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegLastForwardPoints get(quickfix.field.LegLastForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastForwardPoints getLegLastForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegLastForwardPoints());
  }

  public boolean isSet(quickfix.field.LegLastForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegLastForwardPoints() {
    return isSetField(1073);
  }

  public void set(quickfix.field.LegCalculatedCcyLastQty value) {
    setField(value);
  }

  public quickfix.field.LegCalculatedCcyLastQty get(quickfix.field.LegCalculatedCcyLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCalculatedCcyLastQty getLegCalculatedCcyLastQty() throws FieldNotFound {
    return get(new quickfix.field.LegCalculatedCcyLastQty());
  }

  public boolean isSet(quickfix.field.LegCalculatedCcyLastQty field) {
    return isSetField(field);
  }

  public boolean isSetLegCalculatedCcyLastQty() {
    return isSetField(1074);
  }

  public void set(quickfix.field.LegGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.LegGrossTradeAmt get(quickfix.field.LegGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegGrossTradeAmt getLegGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.LegGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.LegGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegGrossTradeAmt() {
    return isSetField(1075);
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

  public void set(quickfix.field.LegLastQty value) {
    setField(value);
  }

  public quickfix.field.LegLastQty get(quickfix.field.LegLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastQty getLegLastQty() throws FieldNotFound {
    return get(new quickfix.field.LegLastQty());
  }

  public boolean isSet(quickfix.field.LegLastQty field) {
    return isSetField(field);
  }

  public boolean isSetLegLastQty() {
    return isSetField(1418);
  }

  public void set(quickfix.field.LegQtyType value) {
    setField(value);
  }

  public quickfix.field.LegQtyType get(quickfix.field.LegQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQtyType getLegQtyType() throws FieldNotFound {
    return get(new quickfix.field.LegQtyType());
  }

  public boolean isSet(quickfix.field.LegQtyType field) {
    return isSetField(field);
  }

  public boolean isSetLegQtyType() {
    return isSetField(1591);
  }

  public void set(quickfix.field.LegLastMultipliedQty value) {
    setField(value);
  }

  public quickfix.field.LegLastMultipliedQty get(quickfix.field.LegLastMultipliedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLastMultipliedQty getLegLastMultipliedQty() throws FieldNotFound {
    return get(new quickfix.field.LegLastMultipliedQty());
  }

  public boolean isSet(quickfix.field.LegLastMultipliedQty field) {
    return isSetField(field);
  }

  public boolean isSetLegLastMultipliedQty() {
    return isSetField(2358);
  }

  public void set(quickfix.field.LegTotalTradeQty value) {
    setField(value);
  }

  public quickfix.field.LegTotalTradeQty get(quickfix.field.LegTotalTradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalTradeQty getLegTotalTradeQty() throws FieldNotFound {
    return get(new quickfix.field.LegTotalTradeQty());
  }

  public boolean isSet(quickfix.field.LegTotalTradeQty field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalTradeQty() {
    return isSetField(2357);
  }

  public void set(quickfix.field.LegTotalTradeMultipliedQty value) {
    setField(value);
  }

  public quickfix.field.LegTotalTradeMultipliedQty get(quickfix.field.LegTotalTradeMultipliedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalTradeMultipliedQty getLegTotalTradeMultipliedQty() throws FieldNotFound {
    return get(new quickfix.field.LegTotalTradeMultipliedQty());
  }

  public boolean isSet(quickfix.field.LegTotalTradeMultipliedQty field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalTradeMultipliedQty() {
    return isSetField(2360);
  }

  public void set(quickfix.field.LegTotalGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.LegTotalGrossTradeAmt get(quickfix.field.LegTotalGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalGrossTradeAmt getLegTotalGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.LegTotalGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.LegTotalGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalGrossTradeAmt() {
    return isSetField(2359);
  }

  public void set(quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp get(quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp getTradeCapLegUnderlyingsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeCapLegUnderlyingsGrp());
  }

  public void set(quickfix.field.NoOfLegUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoOfLegUnderlyings get(quickfix.field.NoOfLegUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfLegUnderlyings getNoOfLegUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoOfLegUnderlyings());
  }

  public boolean isSet(quickfix.field.NoOfLegUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoOfLegUnderlyings() {
    return isSetField(1342);
  }

public static class NoOfLegUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1330, 1331, 1332, 1333, 1334, 1344, 1337, 1338, 1339, 1345, 1405, 1340, 1391, 1343, 1341, 1392, 0};

  public NoOfLegUnderlyings() {
    super(1342, 1330, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingLegInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument get(quickfix.fixlatest.component.UnderlyingLegInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument getUnderlyingLegInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingLegInstrument());
  }
}

  public void set(quickfix.field.LegDifferentialPrice value) {
    setField(value);
  }

  public quickfix.field.LegDifferentialPrice get(quickfix.field.LegDifferentialPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDifferentialPrice getLegDifferentialPrice() throws FieldNotFound {
    return get(new quickfix.field.LegDifferentialPrice());
  }

  public boolean isSet(quickfix.field.LegDifferentialPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegDifferentialPrice() {
    return isSetField(2492);
  }
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

  public void set(quickfix.field.ResponseTransportType value) {
    setField(value);
  }

  public quickfix.field.ResponseTransportType get(quickfix.field.ResponseTransportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ResponseTransportType getResponseTransportType() throws FieldNotFound {
    return get(new quickfix.field.ResponseTransportType());
  }

  public boolean isSet(quickfix.field.ResponseTransportType field) {
    return isSetField(field);
  }

  public boolean isSetResponseTransportType() {
    return isSetField(725);
  }

  public void set(quickfix.field.ResponseDestination value) {
    setField(value);
  }

  public quickfix.field.ResponseDestination get(quickfix.field.ResponseDestination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ResponseDestination getResponseDestination() throws FieldNotFound {
    return get(new quickfix.field.ResponseDestination());
  }

  public boolean isSet(quickfix.field.ResponseDestination field) {
    return isSetField(field);
  }

  public boolean isSetResponseDestination() {
    return isSetField(726);
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

  public void set(quickfix.field.AsOfIndicator value) {
    setField(value);
  }

  public quickfix.field.AsOfIndicator get(quickfix.field.AsOfIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AsOfIndicator getAsOfIndicator() throws FieldNotFound {
    return get(new quickfix.field.AsOfIndicator());
  }

  public boolean isSet(quickfix.field.AsOfIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAsOfIndicator() {
    return isSetField(1015);
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

  public void set(quickfix.fixlatest.component.PositionAmountData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PositionAmountData get(quickfix.fixlatest.component.PositionAmountData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PositionAmountData getPositionAmountDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PositionAmountData());
  }

  public void set(quickfix.field.NoPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoPosAmt());
  }

  public boolean isSet(quickfix.field.NoPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoPosAmt() {
    return isSetField(753);
  }

public static class NoPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {707, 708, 2096, 1055, 2097, 2098, 1585, 2099, 2100, 2876, 2877, 0};

  public NoPosAmt() {
    super(753, 707, ORDER);
  }

  public void set(quickfix.field.PosAmtType value) {
    setField(value);
  }

  public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtType());
  }

  public boolean isSet(quickfix.field.PosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtType() {
    return isSetField(707);
  }

  public void set(quickfix.field.PosAmt value) {
    setField(value);
  }

  public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
    return get(new quickfix.field.PosAmt());
  }

  public boolean isSet(quickfix.field.PosAmt field) {
    return isSetField(field);
  }

  public boolean isSetPosAmt() {
    return isSetField(708);
  }

  public void set(quickfix.field.PosAmtStreamDesc value) {
    setField(value);
  }

  public quickfix.field.PosAmtStreamDesc get(quickfix.field.PosAmtStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtStreamDesc getPosAmtStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.PosAmtStreamDesc());
  }

  public boolean isSet(quickfix.field.PosAmtStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtStreamDesc() {
    return isSetField(2096);
  }

  public void set(quickfix.field.PositionCurrency value) {
    setField(value);
  }

  public quickfix.field.PositionCurrency get(quickfix.field.PositionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionCurrency getPositionCurrency() throws FieldNotFound {
    return get(new quickfix.field.PositionCurrency());
  }

  public boolean isSet(quickfix.field.PositionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPositionCurrency() {
    return isSetField(1055);
  }

  public void set(quickfix.field.PositionFXRate value) {
    setField(value);
  }

  public quickfix.field.PositionFXRate get(quickfix.field.PositionFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRate getPositionFXRate() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRate());
  }

  public boolean isSet(quickfix.field.PositionFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRate() {
    return isSetField(2097);
  }

  public void set(quickfix.field.PositionFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PositionFXRateCalc get(quickfix.field.PositionFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRateCalc getPositionFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRateCalc());
  }

  public boolean isSet(quickfix.field.PositionFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRateCalc() {
    return isSetField(2098);
  }

  public void set(quickfix.field.PosAmtReason value) {
    setField(value);
  }

  public quickfix.field.PosAmtReason get(quickfix.field.PosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtReason getPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.PosAmtReason());
  }

  public boolean isSet(quickfix.field.PosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtReason() {
    return isSetField(1585);
  }

  public void set(quickfix.field.PosAmtMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketSegmentID get(quickfix.field.PosAmtMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketSegmentID getPosAmtMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketSegmentID() {
    return isSetField(2099);
  }

  public void set(quickfix.field.PosAmtMarketID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketID get(quickfix.field.PosAmtMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketID getPosAmtMarketID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketID() {
    return isSetField(2100);
  }

  public void set(quickfix.field.PosAmtPrice value) {
    setField(value);
  }

  public quickfix.field.PosAmtPrice get(quickfix.field.PosAmtPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPrice getPosAmtPrice() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPrice());
  }

  public boolean isSet(quickfix.field.PosAmtPrice field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPrice() {
    return isSetField(2876);
  }

  public void set(quickfix.field.PosAmtPriceType value) {
    setField(value);
  }

  public quickfix.field.PosAmtPriceType get(quickfix.field.PosAmtPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPriceType getPosAmtPriceType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPriceType());
  }

  public boolean isSet(quickfix.field.PosAmtPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPriceType() {
    return isSetField(2877);
  }
}

  public void set(quickfix.field.TierCode value) {
    setField(value);
  }

  public quickfix.field.TierCode get(quickfix.field.TierCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TierCode getTierCode() throws FieldNotFound {
    return get(new quickfix.field.TierCode());
  }

  public boolean isSet(quickfix.field.TierCode field) {
    return isSetField(field);
  }

  public boolean isSetTierCode() {
    return isSetField(994);
  }

  public void set(quickfix.field.MessageEventSource value) {
    setField(value);
  }

  public quickfix.field.MessageEventSource get(quickfix.field.MessageEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MessageEventSource getMessageEventSource() throws FieldNotFound {
    return get(new quickfix.field.MessageEventSource());
  }

  public boolean isSet(quickfix.field.MessageEventSource field) {
    return isSetField(field);
  }

  public boolean isSetMessageEventSource() {
    return isSetField(1011);
  }

  public void set(quickfix.field.LastUpdateTime value) {
    setField(value);
  }

  public quickfix.field.LastUpdateTime get(quickfix.field.LastUpdateTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastUpdateTime getLastUpdateTime() throws FieldNotFound {
    return get(new quickfix.field.LastUpdateTime());
  }

  public boolean isSet(quickfix.field.LastUpdateTime field) {
    return isSetField(field);
  }

  public boolean isSetLastUpdateTime() {
    return isSetField(779);
  }

  public void set(quickfix.field.RndPx value) {
    setField(value);
  }

  public quickfix.field.RndPx get(quickfix.field.RndPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RndPx getRndPx() throws FieldNotFound {
    return get(new quickfix.field.RndPx());
  }

  public boolean isSet(quickfix.field.RndPx field) {
    return isSetField(field);
  }

  public boolean isSetRndPx() {
    return isSetField(991);
  }

  public void set(quickfix.fixlatest.component.TradeQtyGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeQtyGrp get(quickfix.fixlatest.component.TradeQtyGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeQtyGrp getTradeQtyGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeQtyGrp());
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

  public void set(quickfix.fixlatest.component.TrdCapRptAckSideGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdCapRptAckSideGrp get(quickfix.fixlatest.component.TrdCapRptAckSideGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdCapRptAckSideGrp getTrdCapRptAckSideGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdCapRptAckSideGrp());
  }

  public void set(quickfix.field.NoSides value) {
    setField(value);
  }

  public quickfix.field.NoSides get(quickfix.field.NoSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSides getNoSides() throws FieldNotFound {
    return get(new quickfix.field.NoSides());
  }

  public boolean isSet(quickfix.field.NoSides field) {
    return isSetField(field);
  }

  public boolean isSetNoSides() {
    return isSetField(552);
  }

public static class NoSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {54, 1427, 1506, 1507, 1428, 1429, 453, 1, 660, 581, 1630, 81, 575, 576, 2671, 578, 579, 376, 2404, 2351, 2352, 377, 582, 336, 625, 943, 430, 1154, 1155, 12, 13, 479, 1233, 1238, 497, 2639, 157, 230, 158, 159, 738, 920, 921, 922, 238, 237, 118, 119, 155, 156, 77, 752, 518, 232, 136, 825, 1158, 826, 1730, 2771, 2759, 2767, 1853, 1854, 1852, 591, 70, 78, 1072, 1057, 1009, 1005, 1006, 1007, 83, 1008, 1115, 1851, 37, 198, 11, 526, 66, 1080, 1081, 1431, 73, 1091, 40, 44, 99, 18, 39, 38, 152, 516, 468, 469, 151, 14, 59, 126, 1624, 2362, 1629, 1916, 1138, 1082, 1608, 2828, 1083, 1084, 1085, 1086, 1087, 1088, 528, 529, 775, 1432, 1724, 2593, 2704, 821, 1093, 483, 586, 2766, 1016, 1031, 1032, 1855, 1861, 2344, 0};

  public NoSides() {
    super(552, 54, ORDER);
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

  public void set(quickfix.field.SideExecID value) {
    setField(value);
  }

  public quickfix.field.SideExecID get(quickfix.field.SideExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecID getSideExecID() throws FieldNotFound {
    return get(new quickfix.field.SideExecID());
  }

  public boolean isSet(quickfix.field.SideExecID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecID() {
    return isSetField(1427);
  }

  public void set(quickfix.field.SideTradeID value) {
    setField(value);
  }

  public quickfix.field.SideTradeID get(quickfix.field.SideTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeID getSideTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeID());
  }

  public boolean isSet(quickfix.field.SideTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeID() {
    return isSetField(1506);
  }

  public void set(quickfix.field.SideOrigTradeID value) {
    setField(value);
  }

  public quickfix.field.SideOrigTradeID get(quickfix.field.SideOrigTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideOrigTradeID getSideOrigTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideOrigTradeID());
  }

  public boolean isSet(quickfix.field.SideOrigTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideOrigTradeID() {
    return isSetField(1507);
  }

  public void set(quickfix.field.OrderDelay value) {
    setField(value);
  }

  public quickfix.field.OrderDelay get(quickfix.field.OrderDelay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelay getOrderDelay() throws FieldNotFound {
    return get(new quickfix.field.OrderDelay());
  }

  public boolean isSet(quickfix.field.OrderDelay field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelay() {
    return isSetField(1428);
  }

  public void set(quickfix.field.OrderDelayUnit value) {
    setField(value);
  }

  public quickfix.field.OrderDelayUnit get(quickfix.field.OrderDelayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelayUnit getOrderDelayUnit() throws FieldNotFound {
    return get(new quickfix.field.OrderDelayUnit());
  }

  public boolean isSet(quickfix.field.OrderDelayUnit field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelayUnit() {
    return isSetField(1429);
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

  public void set(quickfix.fixlatest.component.LimitAmts component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LimitAmts get(quickfix.fixlatest.component.LimitAmts component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LimitAmts getLimitAmtsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LimitAmts());
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

  public void set(quickfix.field.OddLot value) {
    setField(value);
  }

  public quickfix.field.OddLot get(quickfix.field.OddLot value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OddLot getOddLot() throws FieldNotFound {
    return get(new quickfix.field.OddLot());
  }

  public boolean isSet(quickfix.field.OddLot field) {
    return isSetField(field);
  }

  public boolean isSetOddLot() {
    return isSetField(575);
  }

  public void set(quickfix.fixlatest.component.ClrInstGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClrInstGrp get(quickfix.fixlatest.component.ClrInstGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClrInstGrp getClrInstGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClrInstGrp());
  }

  public void set(quickfix.field.NoClearingInstructions value) {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoClearingInstructions());
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions() {
    return isSetField(576);
  }

public static class NoClearingInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {577, 0};

  public NoClearingInstructions() {
    super(576, 577, ORDER);
  }

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
}

  public void set(quickfix.field.SideTradeReportingIndicator value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportingIndicator get(quickfix.field.SideTradeReportingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportingIndicator getSideTradeReportingIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportingIndicator());
  }

  public boolean isSet(quickfix.field.SideTradeReportingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportingIndicator() {
    return isSetField(2671);
  }

  public void set(quickfix.field.TradeInputSource value) {
    setField(value);
  }

  public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
    return get(new quickfix.field.TradeInputSource());
  }

  public boolean isSet(quickfix.field.TradeInputSource field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputSource() {
    return isSetField(578);
  }

  public void set(quickfix.field.TradeInputDevice value) {
    setField(value);
  }

  public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
    return get(new quickfix.field.TradeInputDevice());
  }

  public boolean isSet(quickfix.field.TradeInputDevice field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputDevice() {
    return isSetField(579);
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

  public void set(quickfix.field.TimeBracket value) {
    setField(value);
  }

  public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
    return get(new quickfix.field.TimeBracket());
  }

  public boolean isSet(quickfix.field.TimeBracket field) {
    return isSetField(field);
  }

  public boolean isSetTimeBracket() {
    return isSetField(943);
  }

  public void set(quickfix.field.NetGrossInd value) {
    setField(value);
  }

  public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
    return get(new quickfix.field.NetGrossInd());
  }

  public boolean isSet(quickfix.field.NetGrossInd field) {
    return isSetField(field);
  }

  public boolean isSetNetGrossInd() {
    return isSetField(430);
  }

  public void set(quickfix.field.SideCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCurrency get(quickfix.field.SideCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrency getSideCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCurrency());
  }

  public boolean isSet(quickfix.field.SideCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrency() {
    return isSetField(1154);
  }

  public void set(quickfix.field.SideSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SideSettlCurrency get(quickfix.field.SideSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideSettlCurrency getSideSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideSettlCurrency());
  }

  public boolean isSet(quickfix.field.SideSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideSettlCurrency() {
    return isSetField(1155);
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

  public void set(quickfix.field.SideMultiLegReportingType value) {
    setField(value);
  }

  public quickfix.field.SideMultiLegReportingType get(quickfix.field.SideMultiLegReportingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound {
    return get(new quickfix.field.SideMultiLegReportingType());
  }

  public boolean isSet(quickfix.field.SideMultiLegReportingType field) {
    return isSetField(field);
  }

  public boolean isSetSideMultiLegReportingType() {
    return isSetField(752);
  }

  public void set(quickfix.fixlatest.component.ContAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ContAmtGrp get(quickfix.fixlatest.component.ContAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ContAmtGrp getContAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ContAmtGrp());
  }

  public void set(quickfix.field.NoContAmts value) {
    setField(value);
  }

  public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
    return get(new quickfix.field.NoContAmts());
  }

  public boolean isSet(quickfix.field.NoContAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoContAmts() {
    return isSetField(518);
  }

public static class NoContAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {519, 520, 521, 0};

  public NoContAmts() {
    super(518, 519, ORDER);
  }

  public void set(quickfix.field.ContAmtType value) {
    setField(value);
  }

  public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
    return get(new quickfix.field.ContAmtType());
  }

  public boolean isSet(quickfix.field.ContAmtType field) {
    return isSetField(field);
  }

  public boolean isSetContAmtType() {
    return isSetField(519);
  }

  public void set(quickfix.field.ContAmtValue value) {
    setField(value);
  }

  public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
    return get(new quickfix.field.ContAmtValue());
  }

  public boolean isSet(quickfix.field.ContAmtValue field) {
    return isSetField(field);
  }

  public boolean isSetContAmtValue() {
    return isSetField(520);
  }

  public void set(quickfix.field.ContAmtCurr value) {
    setField(value);
  }

  public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
    return get(new quickfix.field.ContAmtCurr());
  }

  public boolean isSet(quickfix.field.ContAmtCurr field) {
    return isSetField(field);
  }

  public boolean isSetContAmtCurr() {
    return isSetField(521);
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

  public void set(quickfix.field.ExchangeRule value) {
    setField(value);
  }

  public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
    return get(new quickfix.field.ExchangeRule());
  }

  public boolean isSet(quickfix.field.ExchangeRule field) {
    return isSetField(field);
  }

  public boolean isSetExchangeRule() {
    return isSetField(825);
  }

  public void set(quickfix.fixlatest.component.SettlDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlDetails get(quickfix.fixlatest.component.SettlDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlDetails getSettlDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlDetails());
  }

  public void set(quickfix.field.NoSettlDetails value) {
    setField(value);
  }

  public quickfix.field.NoSettlDetails get(quickfix.field.NoSettlDetails value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlDetails getNoSettlDetails() throws FieldNotFound {
    return get(new quickfix.field.NoSettlDetails());
  }

  public boolean isSet(quickfix.field.NoSettlDetails field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlDetails() {
    return isSetField(1158);
  }

public static class NoSettlDetails extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1164, 169, 170, 171, 781, 0};

  public NoSettlDetails() {
    super(1158, 1164, ORDER);
  }

  public void set(quickfix.field.SettlObligSource value) {
    setField(value);
  }

  public quickfix.field.SettlObligSource get(quickfix.field.SettlObligSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligSource getSettlObligSource() throws FieldNotFound {
    return get(new quickfix.field.SettlObligSource());
  }

  public boolean isSet(quickfix.field.SettlObligSource field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligSource() {
    return isSetField(1164);
  }

  public void set(quickfix.field.StandInstDbType value) {
    setField(value);
  }

  public quickfix.field.StandInstDbType get(quickfix.field.StandInstDbType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandInstDbType getStandInstDbType() throws FieldNotFound {
    return get(new quickfix.field.StandInstDbType());
  }

  public boolean isSet(quickfix.field.StandInstDbType field) {
    return isSetField(field);
  }

  public boolean isSetStandInstDbType() {
    return isSetField(169);
  }

  public void set(quickfix.field.StandInstDbName value) {
    setField(value);
  }

  public quickfix.field.StandInstDbName get(quickfix.field.StandInstDbName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandInstDbName getStandInstDbName() throws FieldNotFound {
    return get(new quickfix.field.StandInstDbName());
  }

  public boolean isSet(quickfix.field.StandInstDbName field) {
    return isSetField(field);
  }

  public boolean isSetStandInstDbName() {
    return isSetField(170);
  }

  public void set(quickfix.field.StandInstDbID value) {
    setField(value);
  }

  public quickfix.field.StandInstDbID get(quickfix.field.StandInstDbID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandInstDbID getStandInstDbID() throws FieldNotFound {
    return get(new quickfix.field.StandInstDbID());
  }

  public boolean isSet(quickfix.field.StandInstDbID field) {
    return isSetField(field);
  }

  public boolean isSetStandInstDbID() {
    return isSetField(171);
  }

  public void set(quickfix.fixlatest.component.SettlParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlParties get(quickfix.fixlatest.component.SettlParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlParties getSettlPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlParties());
  }

  public void set(quickfix.field.NoSettlPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoSettlPartyIDs get(quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSettlPartyIDs());
  }

  public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlPartyIDs() {
    return isSetField(781);
  }

public static class NoSettlPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {782, 783, 784, 2389, 801, 0};

  public NoSettlPartyIDs() {
    super(781, 782, ORDER);
  }

  public void set(quickfix.field.SettlPartyID value) {
    setField(value);
  }

  public quickfix.field.SettlPartyID get(quickfix.field.SettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyID());
  }

  public boolean isSet(quickfix.field.SettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyID() {
    return isSetField(782);
  }

  public void set(quickfix.field.SettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.SettlPartyIDSource get(quickfix.field.SettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.SettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyIDSource() {
    return isSetField(783);
  }

  public void set(quickfix.field.SettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.SettlPartyRole get(quickfix.field.SettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyRole());
  }

  public boolean isSet(quickfix.field.SettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyRole() {
    return isSetField(784);
  }

  public void set(quickfix.field.SettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.SettlPartyRoleQualifier get(quickfix.field.SettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyRoleQualifier getSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.SettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyRoleQualifier() {
    return isSetField(2389);
  }

  public void set(quickfix.fixlatest.component.SettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlPtysSubGrp get(quickfix.fixlatest.component.SettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlPtysSubGrp getSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlPtysSubGrp());
  }

  public void set(quickfix.field.NoSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlPartySubIDs() {
    return isSetField(801);
  }

public static class NoSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {785, 786, 0};

  public NoSettlPartySubIDs() {
    super(801, 785, ORDER);
  }

  public void set(quickfix.field.SettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubID());
  }

  public boolean isSet(quickfix.field.SettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubID() {
    return isSetField(785);
  }

  public void set(quickfix.field.SettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.SettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubIDType() {
    return isSetField(786);
  }
}
}
}

  public void set(quickfix.field.TradeAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocIndicator());
  }

  public boolean isSet(quickfix.field.TradeAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocIndicator() {
    return isSetField(826);
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

  public void set(quickfix.field.PreviousAllocGroupID value) {
    setField(value);
  }

  public quickfix.field.PreviousAllocGroupID get(quickfix.field.PreviousAllocGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviousAllocGroupID getPreviousAllocGroupID() throws FieldNotFound {
    return get(new quickfix.field.PreviousAllocGroupID());
  }

  public boolean isSet(quickfix.field.PreviousAllocGroupID field) {
    return isSetField(field);
  }

  public boolean isSetPreviousAllocGroupID() {
    return isSetField(2771);
  }

  public void set(quickfix.field.GroupAmount value) {
    setField(value);
  }

  public quickfix.field.GroupAmount get(quickfix.field.GroupAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.GroupAmount getGroupAmount() throws FieldNotFound {
    return get(new quickfix.field.GroupAmount());
  }

  public boolean isSet(quickfix.field.GroupAmount field) {
    return isSetField(field);
  }

  public boolean isSetGroupAmount() {
    return isSetField(2759);
  }

  public void set(quickfix.field.AllocGroupStatus value) {
    setField(value);
  }

  public quickfix.field.AllocGroupStatus get(quickfix.field.AllocGroupStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupStatus getAllocGroupStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupStatus());
  }

  public boolean isSet(quickfix.field.AllocGroupStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupStatus() {
    return isSetField(2767);
  }

  public void set(quickfix.field.SideAvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.SideAvgPxIndicator get(quickfix.field.SideAvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPxIndicator getSideAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPxIndicator());
  }

  public boolean isSet(quickfix.field.SideAvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPxIndicator() {
    return isSetField(1853);
  }

  public void set(quickfix.field.SideAvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.SideAvgPxGroupID get(quickfix.field.SideAvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPxGroupID getSideAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPxGroupID());
  }

  public boolean isSet(quickfix.field.SideAvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPxGroupID() {
    return isSetField(1854);
  }

  public void set(quickfix.field.SideAvgPx value) {
    setField(value);
  }

  public quickfix.field.SideAvgPx get(quickfix.field.SideAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPx getSideAvgPx() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPx());
  }

  public boolean isSet(quickfix.field.SideAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPx() {
    return isSetField(1852);
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

  public void set(quickfix.fixlatest.component.TrdAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdAllocGrp get(quickfix.fixlatest.component.TrdAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdAllocGrp getTrdAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdAllocGrp());
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
  private static final int[]  ORDER = {79, 661, 736, 467, 1593, 2727, 1908, 1729, 756, 209, 80, 2515, 1752, 1753, 1754, 1755, 993, 1002, 989, 1136, 1844, 1840, 1735, 161, 360, 361, 1732, 1733, 1734, 2392, 2393, 2653, 0};

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

  public void set(quickfix.field.AllocMethod value) {
    setField(value);
  }

  public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound {
    return get(new quickfix.field.AllocMethod());
  }

  public boolean isSet(quickfix.field.AllocMethod field) {
    return isSetField(field);
  }

  public boolean isSetAllocMethod() {
    return isSetField(1002);
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

  public void set(quickfix.field.AllocClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.AllocClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocClearingFeeIndicator() {
    return isSetField(1136);
  }

  public void set(quickfix.fixlatest.component.TradeAllocAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp get(quickfix.fixlatest.component.TradeAllocAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp getTradeAllocAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeAllocAmtGrp());
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

  public void set(quickfix.field.TradeAllocStatus value) {
    setField(value);
  }

  public quickfix.field.TradeAllocStatus get(quickfix.field.TradeAllocStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocStatus getTradeAllocStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocStatus());
  }

  public boolean isSet(quickfix.field.TradeAllocStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocStatus() {
    return isSetField(1840);
  }

  public void set(quickfix.field.AllocationRollupInstruction value) {
    setField(value);
  }

  public quickfix.field.AllocationRollupInstruction get(quickfix.field.AllocationRollupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocationRollupInstruction getAllocationRollupInstruction() throws FieldNotFound {
    return get(new quickfix.field.AllocationRollupInstruction());
  }

  public boolean isSet(quickfix.field.AllocationRollupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetAllocationRollupInstruction() {
    return isSetField(1735);
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

  public void set(quickfix.field.AllocRefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckID get(quickfix.field.AllocRefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckID getAllocRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckID() {
    return isSetField(2392);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType get(quickfix.field.AllocRefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType getAllocRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckIDType() {
    return isSetField(2393);
  }

  public void set(quickfix.fixlatest.component.AllocCommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp get(quickfix.fixlatest.component.AllocCommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp getAllocCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocCommissionDataGrp());
  }

  public void set(quickfix.field.NoAllocCommissions value) {
    setField(value);
  }

  public quickfix.field.NoAllocCommissions get(quickfix.field.NoAllocCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocCommissions getNoAllocCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoAllocCommissions());
  }

  public boolean isSet(quickfix.field.NoAllocCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocCommissions() {
    return isSetField(2653);
  }

public static class NoAllocCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2654, 2655, 2726, 2656, 2657, 2658, 2659, 2660, 2661, 2662, 2663, 2664, 2665, 2666, 0};

  public NoAllocCommissions() {
    super(2653, 2654, ORDER);
  }

  public void set(quickfix.field.AllocCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmount get(quickfix.field.AllocCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmount getAllocCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmount());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmount() {
    return isSetField(2654);
  }

  public void set(quickfix.field.AllocCommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountType get(quickfix.field.AllocCommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountType getAllocCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountType() {
    return isSetField(2655);
  }

  public void set(quickfix.field.AllocCommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountSubType get(quickfix.field.AllocCommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountSubType getAllocCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountSubType() {
    return isSetField(2726);
  }

  public void set(quickfix.field.AllocCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionBasis get(quickfix.field.AllocCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionBasis getAllocCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionBasis());
  }

  public boolean isSet(quickfix.field.AllocCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionBasis() {
    return isSetField(2656);
  }

  public void set(quickfix.field.AllocCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionCurrency get(quickfix.field.AllocCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionCurrency getAllocCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionCurrency() {
    return isSetField(2657);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasure get(quickfix.field.AllocCommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasure getAllocCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasure() {
    return isSetField(2658);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency get(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency getAllocCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasureCurrency() {
    return isSetField(2659);
  }

  public void set(quickfix.field.AllocCommissionRate value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionRate get(quickfix.field.AllocCommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionRate getAllocCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionRate());
  }

  public boolean isSet(quickfix.field.AllocCommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionRate() {
    return isSetField(2660);
  }

  public void set(quickfix.field.AllocCommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionSharedIndicator get(quickfix.field.AllocCommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionSharedIndicator getAllocCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.AllocCommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionSharedIndicator() {
    return isSetField(2661);
  }

  public void set(quickfix.field.AllocCommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountShared get(quickfix.field.AllocCommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountShared getAllocCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountShared());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountShared() {
    return isSetField(2662);
  }

  public void set(quickfix.field.AllocCommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionLegRefID get(quickfix.field.AllocCommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionLegRefID getAllocCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionLegRefID());
  }

  public boolean isSet(quickfix.field.AllocCommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionLegRefID() {
    return isSetField(2663);
  }

  public void set(quickfix.field.AllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionDesc get(quickfix.field.AllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionDesc getAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.AllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionDesc() {
    return isSetField(2664);
  }

  public void set(quickfix.field.EncodedAllocCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDescLen get(quickfix.field.EncodedAllocCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDescLen getEncodedAllocCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDescLen() {
    return isSetField(2665);
  }

  public void set(quickfix.field.EncodedAllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDesc get(quickfix.field.EncodedAllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDesc getEncodedAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDesc() {
    return isSetField(2666);
  }
}
}

  public void set(quickfix.field.SideGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.SideGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.SideGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetSideGrossTradeAmt() {
    return isSetField(1072);
  }

  public void set(quickfix.field.AggressorIndicator value) {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
    return get(new quickfix.field.AggressorIndicator());
  }

  public boolean isSet(quickfix.field.AggressorIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator() {
    return isSetField(1057);
  }

  public void set(quickfix.field.SideLastQty value) {
    setField(value);
  }

  public quickfix.field.SideLastQty get(quickfix.field.SideLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLastQty getSideLastQty() throws FieldNotFound {
    return get(new quickfix.field.SideLastQty());
  }

  public boolean isSet(quickfix.field.SideLastQty field) {
    return isSetField(field);
  }

  public boolean isSetSideLastQty() {
    return isSetField(1009);
  }

  public void set(quickfix.field.SideTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportID());
  }

  public boolean isSet(quickfix.field.SideTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportID() {
    return isSetField(1005);
  }

  public void set(quickfix.field.SideFillStationCd value) {
    setField(value);
  }

  public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound {
    return get(new quickfix.field.SideFillStationCd());
  }

  public boolean isSet(quickfix.field.SideFillStationCd field) {
    return isSetField(field);
  }

  public boolean isSetSideFillStationCd() {
    return isSetField(1006);
  }

  public void set(quickfix.field.SideReasonCd value) {
    setField(value);
  }

  public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound {
    return get(new quickfix.field.SideReasonCd());
  }

  public boolean isSet(quickfix.field.SideReasonCd field) {
    return isSetField(field);
  }

  public boolean isSetSideReasonCd() {
    return isSetField(1007);
  }

  public void set(quickfix.field.RptSeq value) {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
    return get(new quickfix.field.RptSeq());
  }

  public boolean isSet(quickfix.field.RptSeq field) {
    return isSetField(field);
  }

  public boolean isSetRptSeq() {
    return isSetField(83);
  }

  public void set(quickfix.field.SideTrdSubTyp value) {
    setField(value);
  }

  public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdSubTyp());
  }

  public boolean isSet(quickfix.field.SideTrdSubTyp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdSubTyp() {
    return isSetField(1008);
  }

  public void set(quickfix.field.OrderCategory value) {
    setField(value);
  }

  public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
    return get(new quickfix.field.OrderCategory());
  }

  public boolean isSet(quickfix.field.OrderCategory field) {
    return isSetField(field);
  }

  public boolean isSetOrderCategory() {
    return isSetField(1115);
  }

  public void set(quickfix.field.StrategyLinkID value) {
    setField(value);
  }

  public quickfix.field.StrategyLinkID get(quickfix.field.StrategyLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyLinkID getStrategyLinkID() throws FieldNotFound {
    return get(new quickfix.field.StrategyLinkID());
  }

  public boolean isSet(quickfix.field.StrategyLinkID field) {
    return isSetField(field);
  }

  public boolean isSetStrategyLinkID() {
    return isSetField(1851);
  }

  public void set(quickfix.fixlatest.component.TradeReportOrderDetail component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail get(quickfix.fixlatest.component.TradeReportOrderDetail component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail getTradeReportOrderDetailComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeReportOrderDetail());
  }

  public void set(quickfix.fixlatest.component.SideTrdRegTS component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideTrdRegTS get(quickfix.fixlatest.component.SideTrdRegTS component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideTrdRegTS getSideTrdRegTSComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideTrdRegTS());
  }

  public void set(quickfix.field.NoSideTrdRegTS value) {
    setField(value);
  }

  public quickfix.field.NoSideTrdRegTS get(quickfix.field.NoSideTrdRegTS value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideTrdRegTS getNoSideTrdRegTS() throws FieldNotFound {
    return get(new quickfix.field.NoSideTrdRegTS());
  }

  public boolean isSet(quickfix.field.NoSideTrdRegTS field) {
    return isSetField(field);
  }

  public boolean isSetNoSideTrdRegTS() {
    return isSetField(1016);
  }

public static class NoSideTrdRegTS extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1012, 1013, 1014, 0};

  public NoSideTrdRegTS() {
    super(1016, 1012, ORDER);
  }

  public void set(quickfix.field.SideTrdRegTimestamp value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestamp get(quickfix.field.SideTrdRegTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestamp getSideTrdRegTimestamp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestamp());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestamp() {
    return isSetField(1012);
  }

  public void set(quickfix.field.SideTrdRegTimestampType value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampType get(quickfix.field.SideTrdRegTimestampType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampType getSideTrdRegTimestampType() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestampType());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampType field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampType() {
    return isSetField(1013);
  }

  public void set(quickfix.field.SideTrdRegTimestampSrc value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampSrc get(quickfix.field.SideTrdRegTimestampSrc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampSrc getSideTrdRegTimestampSrc() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestampSrc());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampSrc field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampSrc() {
    return isSetField(1014);
  }
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

  public void set(quickfix.fixlatest.component.RelatedTradeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedTradeGrp get(quickfix.fixlatest.component.RelatedTradeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedTradeGrp getRelatedTradeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedTradeGrp());
  }

  public void set(quickfix.field.NoRelatedTrades value) {
    setField(value);
  }

  public quickfix.field.NoRelatedTrades get(quickfix.field.NoRelatedTrades value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedTrades getNoRelatedTrades() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedTrades());
  }

  public boolean isSet(quickfix.field.NoRelatedTrades field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedTrades() {
    return isSetField(1855);
  }

public static class NoRelatedTrades extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1856, 1857, 2103, 1858, 1859, 1860, 0};

  public NoRelatedTrades() {
    super(1855, 1856, ORDER);
  }

  public void set(quickfix.field.RelatedTradeID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeID get(quickfix.field.RelatedTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeID getRelatedTradeID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeID());
  }

  public boolean isSet(quickfix.field.RelatedTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeID() {
    return isSetField(1856);
  }

  public void set(quickfix.field.RelatedTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeIDSource get(quickfix.field.RelatedTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeIDSource getRelatedTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeIDSource() {
    return isSetField(1857);
  }

  public void set(quickfix.field.RelatedRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource get(quickfix.field.RelatedRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource getRelatedRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedRegulatoryTradeIDSource() {
    return isSetField(2103);
  }

  public void set(quickfix.field.RelatedTradeDate value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeDate get(quickfix.field.RelatedTradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeDate getRelatedTradeDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeDate());
  }

  public boolean isSet(quickfix.field.RelatedTradeDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeDate() {
    return isSetField(1858);
  }

  public void set(quickfix.field.RelatedTradeMarketID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeMarketID get(quickfix.field.RelatedTradeMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeMarketID getRelatedTradeMarketID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeMarketID());
  }

  public boolean isSet(quickfix.field.RelatedTradeMarketID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeMarketID() {
    return isSetField(1859);
  }

  public void set(quickfix.field.RelatedTradeQuantity value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeQuantity get(quickfix.field.RelatedTradeQuantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeQuantity getRelatedTradeQuantity() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeQuantity());
  }

  public boolean isSet(quickfix.field.RelatedTradeQuantity field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeQuantity() {
    return isSetField(1860);
  }
}

  public void set(quickfix.fixlatest.component.RelatedPositionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPositionGrp get(quickfix.fixlatest.component.RelatedPositionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPositionGrp getRelatedPositionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPositionGrp());
  }

  public void set(quickfix.field.NoRelatedPositions value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPositions get(quickfix.field.NoRelatedPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPositions getNoRelatedPositions() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPositions());
  }

  public boolean isSet(quickfix.field.NoRelatedPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPositions() {
    return isSetField(1861);
  }

public static class NoRelatedPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1862, 1863, 1864, 0};

  public NoRelatedPositions() {
    super(1861, 1862, ORDER);
  }

  public void set(quickfix.field.RelatedPositionID value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionID get(quickfix.field.RelatedPositionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionID getRelatedPositionID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionID());
  }

  public boolean isSet(quickfix.field.RelatedPositionID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionID() {
    return isSetField(1862);
  }

  public void set(quickfix.field.RelatedPositionIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionIDSource get(quickfix.field.RelatedPositionIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionIDSource getRelatedPositionIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPositionIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionIDSource() {
    return isSetField(1863);
  }

  public void set(quickfix.field.RelatedPositionDate value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionDate get(quickfix.field.RelatedPositionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionDate getRelatedPositionDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionDate());
  }

  public boolean isSet(quickfix.field.RelatedPositionDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionDate() {
    return isSetField(1864);
  }
}

  public void set(quickfix.field.SideRiskLimitCheckStatus value) {
    setField(value);
  }

  public quickfix.field.SideRiskLimitCheckStatus get(quickfix.field.SideRiskLimitCheckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRiskLimitCheckStatus getSideRiskLimitCheckStatus() throws FieldNotFound {
    return get(new quickfix.field.SideRiskLimitCheckStatus());
  }

  public boolean isSet(quickfix.field.SideRiskLimitCheckStatus field) {
    return isSetField(field);
  }

  public boolean isSetSideRiskLimitCheckStatus() {
    return isSetField(2344);
  }
}

  public void set(quickfix.field.RptSys value) {
    setField(value);
  }

  public quickfix.field.RptSys get(quickfix.field.RptSys value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSys getRptSys() throws FieldNotFound {
    return get(new quickfix.field.RptSys());
  }

  public boolean isSet(quickfix.field.RptSys field) {
    return isSetField(field);
  }

  public boolean isSetRptSys() {
    return isSetField(1135);
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

  public void set(quickfix.field.FeeMultiplier value) {
    setField(value);
  }

  public quickfix.field.FeeMultiplier get(quickfix.field.FeeMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FeeMultiplier getFeeMultiplier() throws FieldNotFound {
    return get(new quickfix.field.FeeMultiplier());
  }

  public boolean isSet(quickfix.field.FeeMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetFeeMultiplier() {
    return isSetField(1329);
  }

  public void set(quickfix.field.RiskLimitCheckStatus value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckStatus get(quickfix.field.RiskLimitCheckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckStatus getRiskLimitCheckStatus() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckStatus());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckStatus field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckStatus() {
    return isSetField(2343);
  }
}
