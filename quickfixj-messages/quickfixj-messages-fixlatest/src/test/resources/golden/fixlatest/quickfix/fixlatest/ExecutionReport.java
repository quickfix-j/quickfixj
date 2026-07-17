/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class ExecutionReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "8";

  public ExecutionReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public ExecutionReport (quickfix.field.OrderID orderID, quickfix.field.ExecID execID, quickfix.field.ExecType execType, quickfix.field.OrdStatus ordStatus, quickfix.field.Side side, quickfix.field.LeavesQty leavesQty, quickfix.field.CumQty cumQty) {
    this();
    setField(orderID);
    setField(execID);
    setField(execType);
    setField(ordStatus);
    setField(side);
    setField(leavesQty);
    setField(cumQty);
  }

  public void set(quickfix.fixlatest.component.ApplicationSequenceControl component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl get(quickfix.fixlatest.component.ApplicationSequenceControl component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl getApplicationSequenceControlComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ApplicationSequenceControl());
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

  public void set(quickfix.field.MassOrderRequestID value) {
    setField(value);
  }

  public quickfix.field.MassOrderRequestID get(quickfix.field.MassOrderRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MassOrderRequestID getMassOrderRequestID() throws FieldNotFound {
    return get(new quickfix.field.MassOrderRequestID());
  }

  public boolean isSet(quickfix.field.MassOrderRequestID field) {
    return isSetField(field);
  }

  public boolean isSetMassOrderRequestID() {
    return isSetField(2423);
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

  public void set(quickfix.field.QuoteMsgID value) {
    setField(value);
  }

  public quickfix.field.QuoteMsgID get(quickfix.field.QuoteMsgID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteMsgID getQuoteMsgID() throws FieldNotFound {
    return get(new quickfix.field.QuoteMsgID());
  }

  public boolean isSet(quickfix.field.QuoteMsgID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteMsgID() {
    return isSetField(1166);
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

  public void set(quickfix.field.MDEntryID value) {
    setField(value);
  }

  public quickfix.field.MDEntryID get(quickfix.field.MDEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound {
    return get(new quickfix.field.MDEntryID());
  }

  public boolean isSet(quickfix.field.MDEntryID field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryID() {
    return isSetField(278);
  }

  public void set(quickfix.field.QuoteRespID value) {
    setField(value);
  }

  public quickfix.field.QuoteRespID get(quickfix.field.QuoteRespID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteRespID getQuoteRespID() throws FieldNotFound {
    return get(new quickfix.field.QuoteRespID());
  }

  public boolean isSet(quickfix.field.QuoteRespID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteRespID() {
    return isSetField(693);
  }

  public void set(quickfix.field.OrdStatusReqID value) {
    setField(value);
  }

  public quickfix.field.OrdStatusReqID get(quickfix.field.OrdStatusReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdStatusReqID getOrdStatusReqID() throws FieldNotFound {
    return get(new quickfix.field.OrdStatusReqID());
  }

  public boolean isSet(quickfix.field.OrdStatusReqID field) {
    return isSetField(field);
  }

  public boolean isSetOrdStatusReqID() {
    return isSetField(790);
  }

  public void set(quickfix.field.MassStatusReqID value) {
    setField(value);
  }

  public quickfix.field.MassStatusReqID get(quickfix.field.MassStatusReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MassStatusReqID getMassStatusReqID() throws FieldNotFound {
    return get(new quickfix.field.MassStatusReqID());
  }

  public boolean isSet(quickfix.field.MassStatusReqID field) {
    return isSetField(field);
  }

  public boolean isSetMassStatusReqID() {
    return isSetField(584);
  }

  public void set(quickfix.field.HostCrossID value) {
    setField(value);
  }

  public quickfix.field.HostCrossID get(quickfix.field.HostCrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HostCrossID getHostCrossID() throws FieldNotFound {
    return get(new quickfix.field.HostCrossID());
  }

  public boolean isSet(quickfix.field.HostCrossID field) {
    return isSetField(field);
  }

  public boolean isSetHostCrossID() {
    return isSetField(961);
  }

  public void set(quickfix.field.TotNumReports value) {
    setField(value);
  }

  public quickfix.field.TotNumReports get(quickfix.field.TotNumReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNumReports getTotNumReports() throws FieldNotFound {
    return get(new quickfix.field.TotNumReports());
  }

  public boolean isSet(quickfix.field.TotNumReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNumReports() {
    return isSetField(911);
  }

  public void set(quickfix.field.LastRptRequested value) {
    setField(value);
  }

  public quickfix.field.LastRptRequested get(quickfix.field.LastRptRequested value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastRptRequested getLastRptRequested() throws FieldNotFound {
    return get(new quickfix.field.LastRptRequested());
  }

  public boolean isSet(quickfix.field.LastRptRequested field) {
    return isSetField(field);
  }

  public boolean isSetLastRptRequested() {
    return isSetField(912);
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

  public void set(quickfix.fixlatest.component.ContraGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ContraGrp get(quickfix.fixlatest.component.ContraGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ContraGrp getContraGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ContraGrp());
  }

  public void set(quickfix.field.NoContraBrokers value) {
    setField(value);
  }

  public quickfix.field.NoContraBrokers get(quickfix.field.NoContraBrokers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContraBrokers getNoContraBrokers() throws FieldNotFound {
    return get(new quickfix.field.NoContraBrokers());
  }

  public boolean isSet(quickfix.field.NoContraBrokers field) {
    return isSetField(field);
  }

  public boolean isSetNoContraBrokers() {
    return isSetField(382);
  }

public static class NoContraBrokers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {375, 337, 437, 438, 655, 0};

  public NoContraBrokers() {
    super(382, 375, ORDER);
  }

  public void set(quickfix.field.ContraBroker value) {
    setField(value);
  }

  public quickfix.field.ContraBroker get(quickfix.field.ContraBroker value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraBroker getContraBroker() throws FieldNotFound {
    return get(new quickfix.field.ContraBroker());
  }

  public boolean isSet(quickfix.field.ContraBroker field) {
    return isSetField(field);
  }

  public boolean isSetContraBroker() {
    return isSetField(375);
  }

  public void set(quickfix.field.ContraTrader value) {
    setField(value);
  }

  public quickfix.field.ContraTrader get(quickfix.field.ContraTrader value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTrader getContraTrader() throws FieldNotFound {
    return get(new quickfix.field.ContraTrader());
  }

  public boolean isSet(quickfix.field.ContraTrader field) {
    return isSetField(field);
  }

  public boolean isSetContraTrader() {
    return isSetField(337);
  }

  public void set(quickfix.field.ContraTradeQty value) {
    setField(value);
  }

  public quickfix.field.ContraTradeQty get(quickfix.field.ContraTradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTradeQty getContraTradeQty() throws FieldNotFound {
    return get(new quickfix.field.ContraTradeQty());
  }

  public boolean isSet(quickfix.field.ContraTradeQty field) {
    return isSetField(field);
  }

  public boolean isSetContraTradeQty() {
    return isSetField(437);
  }

  public void set(quickfix.field.ContraTradeTime value) {
    setField(value);
  }

  public quickfix.field.ContraTradeTime get(quickfix.field.ContraTradeTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTradeTime getContraTradeTime() throws FieldNotFound {
    return get(new quickfix.field.ContraTradeTime());
  }

  public boolean isSet(quickfix.field.ContraTradeTime field) {
    return isSetField(field);
  }

  public boolean isSetContraTradeTime() {
    return isSetField(438);
  }

  public void set(quickfix.field.ContraLegRefID value) {
    setField(value);
  }

  public quickfix.field.ContraLegRefID get(quickfix.field.ContraLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraLegRefID getContraLegRefID() throws FieldNotFound {
    return get(new quickfix.field.ContraLegRefID());
  }

  public boolean isSet(quickfix.field.ContraLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetContraLegRefID() {
    return isSetField(655);
  }
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

  public void set(quickfix.field.CrossID value) {
    setField(value);
  }

  public quickfix.field.CrossID get(quickfix.field.CrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossID getCrossID() throws FieldNotFound {
    return get(new quickfix.field.CrossID());
  }

  public boolean isSet(quickfix.field.CrossID field) {
    return isSetField(field);
  }

  public boolean isSetCrossID() {
    return isSetField(548);
  }

  public void set(quickfix.field.OrigCrossID value) {
    setField(value);
  }

  public quickfix.field.OrigCrossID get(quickfix.field.OrigCrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigCrossID getOrigCrossID() throws FieldNotFound {
    return get(new quickfix.field.OrigCrossID());
  }

  public boolean isSet(quickfix.field.OrigCrossID field) {
    return isSetField(field);
  }

  public boolean isSetOrigCrossID() {
    return isSetField(551);
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

  public void set(quickfix.field.RefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.RefRiskLimitCheckID get(quickfix.field.RefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefRiskLimitCheckID getRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.RefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.RefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetRefRiskLimitCheckID() {
    return isSetField(2334);
  }

  public void set(quickfix.field.RefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.RefRiskLimitCheckIDType get(quickfix.field.RefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefRiskLimitCheckIDType getRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.RefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.RefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetRefRiskLimitCheckIDType() {
    return isSetField(2335);
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

  public void set(quickfix.field.TrdMatchSubID value) {
    setField(value);
  }

  public quickfix.field.TrdMatchSubID get(quickfix.field.TrdMatchSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdMatchSubID getTrdMatchSubID() throws FieldNotFound {
    return get(new quickfix.field.TrdMatchSubID());
  }

  public boolean isSet(quickfix.field.TrdMatchSubID field) {
    return isSetField(field);
  }

  public boolean isSetTrdMatchSubID() {
    return isSetField(1891);
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

  public void set(quickfix.field.ExecRefID value) {
    setField(value);
  }

  public quickfix.field.ExecRefID get(quickfix.field.ExecRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecRefID getExecRefID() throws FieldNotFound {
    return get(new quickfix.field.ExecRefID());
  }

  public boolean isSet(quickfix.field.ExecRefID field) {
    return isSetField(field);
  }

  public boolean isSetExecRefID() {
    return isSetField(19);
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

  public void set(quickfix.field.WorkingIndicator value) {
    setField(value);
  }

  public quickfix.field.WorkingIndicator get(quickfix.field.WorkingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.WorkingIndicator getWorkingIndicator() throws FieldNotFound {
    return get(new quickfix.field.WorkingIndicator());
  }

  public boolean isSet(quickfix.field.WorkingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetWorkingIndicator() {
    return isSetField(636);
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

  public void set(quickfix.field.AlgorithmicTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.AlgorithmicTradeIndicator get(quickfix.field.AlgorithmicTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AlgorithmicTradeIndicator getAlgorithmicTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AlgorithmicTradeIndicator());
  }

  public boolean isSet(quickfix.field.AlgorithmicTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAlgorithmicTradeIndicator() {
    return isSetField(2667);
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

  public void set(quickfix.field.RegulatoryTransactionType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTransactionType get(quickfix.field.RegulatoryTransactionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTransactionType getRegulatoryTransactionType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTransactionType());
  }

  public boolean isSet(quickfix.field.RegulatoryTransactionType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTransactionType() {
    return isSetField(2347);
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

  public void set(quickfix.fixlatest.component.PaymentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentGrp get(quickfix.fixlatest.component.PaymentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentGrp getPaymentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentGrp());
  }

  public void set(quickfix.field.NoPayments value) {
    setField(value);
  }

  public quickfix.field.NoPayments get(quickfix.field.NoPayments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPayments getNoPayments() throws FieldNotFound {
    return get(new quickfix.field.NoPayments());
  }

  public boolean isSet(quickfix.field.NoPayments field) {
    return isSetField(field);
  }

  public boolean isSetNoPayments() {
    return isSetField(40212);
  }

public static class NoPayments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40213, 40993, 40214, 40215, 43087, 40216, 40217, 42598, 42599, 43097, 43098, 43100, 43099, 43101, 43105, 43104, 43103, 43102, 40218, 40919, 41155, 40219, 40220, 40944, 41156, 41157, 41158, 41159, 40222, 41160, 40224, 40225, 40226, 40227, 492, 40230, 41304, 40229, 40984, 40985, 0};

  public NoPayments() {
    super(40212, 40213, ORDER);
  }

  public void set(quickfix.field.PaymentType value) {
    setField(value);
  }

  public quickfix.field.PaymentType get(quickfix.field.PaymentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentType getPaymentType() throws FieldNotFound {
    return get(new quickfix.field.PaymentType());
  }

  public boolean isSet(quickfix.field.PaymentType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentType() {
    return isSetField(40213);
  }

  public void set(quickfix.field.PaymentSubType value) {
    setField(value);
  }

  public quickfix.field.PaymentSubType get(quickfix.field.PaymentSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSubType getPaymentSubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSubType());
  }

  public boolean isSet(quickfix.field.PaymentSubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSubType() {
    return isSetField(40993);
  }

  public void set(quickfix.field.PaymentPaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentPaySide get(quickfix.field.PaymentPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPaySide getPaymentPaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentPaySide());
  }

  public boolean isSet(quickfix.field.PaymentPaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPaySide() {
    return isSetField(40214);
  }

  public void set(quickfix.field.PaymentReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentReceiveSide get(quickfix.field.PaymentReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentReceiveSide getPaymentReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentReceiveSide() {
    return isSetField(40215);
  }

  public void set(quickfix.field.PaymentDesc value) {
    setField(value);
  }

  public quickfix.field.PaymentDesc get(quickfix.field.PaymentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDesc getPaymentDesc() throws FieldNotFound {
    return get(new quickfix.field.PaymentDesc());
  }

  public boolean isSet(quickfix.field.PaymentDesc field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDesc() {
    return isSetField(43087);
  }

  public void set(quickfix.field.PaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentCurrency get(quickfix.field.PaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentCurrency getPaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentCurrency());
  }

  public boolean isSet(quickfix.field.PaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentCurrency() {
    return isSetField(40216);
  }

  public void set(quickfix.field.PaymentAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentAmount get(quickfix.field.PaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmount getPaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmount());
  }

  public boolean isSet(quickfix.field.PaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmount() {
    return isSetField(40217);
  }

  public void set(quickfix.field.PaymentAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentAmountRelativeTo get(quickfix.field.PaymentAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmountRelativeTo getPaymentAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmountRelativeTo() {
    return isSetField(42598);
  }

  public void set(quickfix.field.PaymentAmountDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentAmountDeterminationMethod get(quickfix.field.PaymentAmountDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentAmountDeterminationMethod getPaymentAmountDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentAmountDeterminationMethod());
  }

  public boolean isSet(quickfix.field.PaymentAmountDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentAmountDeterminationMethod() {
    return isSetField(42599);
  }

  public void set(quickfix.field.PaymentFixedRate value) {
    setField(value);
  }

  public quickfix.field.PaymentFixedRate get(quickfix.field.PaymentFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFixedRate getPaymentFixedRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentFixedRate());
  }

  public boolean isSet(quickfix.field.PaymentFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFixedRate() {
    return isSetField(43097);
  }

  public void set(quickfix.field.PaymentFloatingRateIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndex get(quickfix.field.PaymentFloatingRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndex getPaymentFloatingRateIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndex());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndex() {
    return isSetField(43098);
  }

  public void set(quickfix.field.PaymentFloatingRateIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndexCurveUnit get(quickfix.field.PaymentFloatingRateIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndexCurveUnit getPaymentFloatingRateIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndexCurveUnit() {
    return isSetField(43100);
  }

  public void set(quickfix.field.PaymentFloatingRateIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateIndexCurvePeriod get(quickfix.field.PaymentFloatingRateIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateIndexCurvePeriod getPaymentFloatingRateIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateIndexCurvePeriod() {
    return isSetField(43099);
  }

  public void set(quickfix.field.PaymentFloatingRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentFloatingRateSpread get(quickfix.field.PaymentFloatingRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFloatingRateSpread getPaymentFloatingRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentFloatingRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentFloatingRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFloatingRateSpread() {
    return isSetField(43101);
  }

  public void set(quickfix.field.PaymentRateResetFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentRateResetFrequencyUnit get(quickfix.field.PaymentRateResetFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentRateResetFrequencyUnit getPaymentRateResetFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentRateResetFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentRateResetFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentRateResetFrequencyUnit() {
    return isSetField(43105);
  }

  public void set(quickfix.field.PaymentRateResetFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentRateResetFrequencyPeriod get(quickfix.field.PaymentRateResetFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentRateResetFrequencyPeriod getPaymentRateResetFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentRateResetFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentRateResetFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentRateResetFrequencyPeriod() {
    return isSetField(43104);
  }

  public void set(quickfix.field.PaymentFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentFrequencyUnit get(quickfix.field.PaymentFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFrequencyUnit getPaymentFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFrequencyUnit() {
    return isSetField(43103);
  }

  public void set(quickfix.field.PaymentFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentFrequencyPeriod get(quickfix.field.PaymentFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentFrequencyPeriod getPaymentFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentFrequencyPeriod() {
    return isSetField(43102);
  }

  public void set(quickfix.field.PaymentPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentPrice get(quickfix.field.PaymentPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPrice getPaymentPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentPrice());
  }

  public boolean isSet(quickfix.field.PaymentPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPrice() {
    return isSetField(40218);
  }

  public void set(quickfix.field.PaymentPriceType value) {
    setField(value);
  }

  public quickfix.field.PaymentPriceType get(quickfix.field.PaymentPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPriceType getPaymentPriceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentPriceType());
  }

  public boolean isSet(quickfix.field.PaymentPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPriceType() {
    return isSetField(40919);
  }

  public void set(quickfix.field.PaymentUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentUnitOfMeasure get(quickfix.field.PaymentUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentUnitOfMeasure getPaymentUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentUnitOfMeasure() {
    return isSetField(41155);
  }

  public void set(quickfix.field.PaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentDateUnadjusted get(quickfix.field.PaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateUnadjusted getPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateUnadjusted() {
    return isSetField(40219);
  }

  public void set(quickfix.field.PaymentBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessDayConvention get(quickfix.field.PaymentBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessDayConvention getPaymentBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessDayConvention() {
    return isSetField(40220);
  }

  public void set(quickfix.fixlatest.component.PaymentBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentBusinessCenterGrp get(quickfix.fixlatest.component.PaymentBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentBusinessCenterGrp getPaymentBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentBusinessCenters get(quickfix.field.NoPaymentBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentBusinessCenters getNoPaymentBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentBusinessCenters() {
    return isSetField(40944);
  }

public static class NoPaymentBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40221, 0};

  public NoPaymentBusinessCenters() {
    super(40944, 40221, ORDER);
  }

  public void set(quickfix.field.PaymentBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentBusinessCenter get(quickfix.field.PaymentBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentBusinessCenter getPaymentBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentBusinessCenter() {
    return isSetField(40221);
  }
}

  public void set(quickfix.field.PaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentDateRelativeTo get(quickfix.field.PaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateRelativeTo getPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateRelativeTo() {
    return isSetField(41156);
  }

  public void set(quickfix.field.PaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetPeriod get(quickfix.field.PaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetPeriod getPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetPeriod() {
    return isSetField(41157);
  }

  public void set(quickfix.field.PaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetUnit get(quickfix.field.PaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetUnit getPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetUnit() {
    return isSetField(41158);
  }

  public void set(quickfix.field.PaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentDateOffsetDayType get(quickfix.field.PaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateOffsetDayType getPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateOffsetDayType() {
    return isSetField(41159);
  }

  public void set(quickfix.field.PaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentDateAdjusted get(quickfix.field.PaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDateAdjusted getPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDateAdjusted() {
    return isSetField(40222);
  }

  public void set(quickfix.field.PaymentForwardStartType value) {
    setField(value);
  }

  public quickfix.field.PaymentForwardStartType get(quickfix.field.PaymentForwardStartType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentForwardStartType getPaymentForwardStartType() throws FieldNotFound {
    return get(new quickfix.field.PaymentForwardStartType());
  }

  public boolean isSet(quickfix.field.PaymentForwardStartType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentForwardStartType() {
    return isSetField(41160);
  }

  public void set(quickfix.field.PaymentDiscountFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentDiscountFactor get(quickfix.field.PaymentDiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentDiscountFactor getPaymentDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentDiscountFactor());
  }

  public boolean isSet(quickfix.field.PaymentDiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentDiscountFactor() {
    return isSetField(40224);
  }

  public void set(quickfix.field.PaymentPresentValueAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentPresentValueAmount get(quickfix.field.PaymentPresentValueAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPresentValueAmount getPaymentPresentValueAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentPresentValueAmount());
  }

  public boolean isSet(quickfix.field.PaymentPresentValueAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPresentValueAmount() {
    return isSetField(40225);
  }

  public void set(quickfix.field.PaymentPresentValueCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentPresentValueCurrency get(quickfix.field.PaymentPresentValueCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentPresentValueCurrency getPaymentPresentValueCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentPresentValueCurrency());
  }

  public boolean isSet(quickfix.field.PaymentPresentValueCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentPresentValueCurrency() {
    return isSetField(40226);
  }

  public void set(quickfix.field.PaymentSettlStyle value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlStyle get(quickfix.field.PaymentSettlStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlStyle getPaymentSettlStyle() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlStyle());
  }

  public boolean isSet(quickfix.field.PaymentSettlStyle field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlStyle() {
    return isSetField(40227);
  }

  public void set(quickfix.field.PaymentMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentMethod get(quickfix.field.PaymentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentMethod getPaymentMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentMethod());
  }

  public boolean isSet(quickfix.field.PaymentMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentMethod() {
    return isSetField(492);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlGrp get(quickfix.fixlatest.component.PaymentSettlGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlGrp getPaymentSettlGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlGrp());
  }

  public void set(quickfix.field.NoPaymentSettls value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettls get(quickfix.field.NoPaymentSettls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettls getNoPaymentSettls() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettls());
  }

  public boolean isSet(quickfix.field.NoPaymentSettls field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettls() {
    return isSetField(40230);
  }

public static class NoPaymentSettls extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40231, 40232, 40233, 0};

  public NoPaymentSettls() {
    super(40230, 40231, ORDER);
  }

  public void set(quickfix.field.PaymentSettlAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlAmount get(quickfix.field.PaymentSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlAmount getPaymentSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlAmount());
  }

  public boolean isSet(quickfix.field.PaymentSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlAmount() {
    return isSetField(40231);
  }

  public void set(quickfix.field.PaymentSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlCurrency get(quickfix.field.PaymentSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlCurrency getPaymentSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlCurrency());
  }

  public boolean isSet(quickfix.field.PaymentSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlCurrency() {
    return isSetField(40232);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlParties get(quickfix.fixlatest.component.PaymentSettlParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlParties getPaymentSettlPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlParties());
  }

  public void set(quickfix.field.NoPaymentSettlPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartyIDs get(quickfix.field.NoPaymentSettlPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartyIDs getNoPaymentSettlPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartyIDs() {
    return isSetField(40233);
  }

public static class NoPaymentSettlPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40234, 40235, 40236, 40237, 40238, 0};

  public NoPaymentSettlPartyIDs() {
    super(40233, 40234, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartyID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyID get(quickfix.field.PaymentSettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyID getPaymentSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyID() {
    return isSetField(40234);
  }

  public void set(quickfix.field.PaymentSettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyIDSource get(quickfix.field.PaymentSettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyIDSource getPaymentSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyIDSource() {
    return isSetField(40235);
  }

  public void set(quickfix.field.PaymentSettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRole get(quickfix.field.PaymentSettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRole getPaymentSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRole());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRole() {
    return isSetField(40236);
  }

  public void set(quickfix.field.PaymentSettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier get(quickfix.field.PaymentSettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartyRoleQualifier getPaymentSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartyRoleQualifier() {
    return isSetField(40237);
  }

  public void set(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp get(quickfix.fixlatest.component.PaymentSettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentSettlPtysSubGrp getPaymentSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentSettlPtysSubGrp());
  }

  public void set(quickfix.field.NoPaymentSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSettlPartySubIDs get(quickfix.field.NoPaymentSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSettlPartySubIDs getNoPaymentSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPaymentSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSettlPartySubIDs() {
    return isSetField(40238);
  }

public static class NoPaymentSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40239, 40240, 0};

  public NoPaymentSettlPartySubIDs() {
    super(40238, 40239, ORDER);
  }

  public void set(quickfix.field.PaymentSettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubID get(quickfix.field.PaymentSettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubID getPaymentSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubID());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubID() {
    return isSetField(40239);
  }

  public void set(quickfix.field.PaymentSettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PaymentSettlPartySubIDType get(quickfix.field.PaymentSettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSettlPartySubIDType getPaymentSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PaymentSettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.PaymentSettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSettlPartySubIDType() {
    return isSetField(40240);
  }
}
}
}

  public void set(quickfix.field.PaymentLegRefID value) {
    setField(value);
  }

  public quickfix.field.PaymentLegRefID get(quickfix.field.PaymentLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentLegRefID getPaymentLegRefID() throws FieldNotFound {
    return get(new quickfix.field.PaymentLegRefID());
  }

  public boolean isSet(quickfix.field.PaymentLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentLegRefID() {
    return isSetField(41304);
  }

  public void set(quickfix.field.PaymentText value) {
    setField(value);
  }

  public quickfix.field.PaymentText get(quickfix.field.PaymentText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentText getPaymentText() throws FieldNotFound {
    return get(new quickfix.field.PaymentText());
  }

  public boolean isSet(quickfix.field.PaymentText field) {
    return isSetField(field);
  }

  public boolean isSetPaymentText() {
    return isSetField(40229);
  }

  public void set(quickfix.field.EncodedPaymentTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedPaymentTextLen get(quickfix.field.EncodedPaymentTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPaymentTextLen getEncodedPaymentTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedPaymentTextLen());
  }

  public boolean isSet(quickfix.field.EncodedPaymentTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPaymentTextLen() {
    return isSetField(40984);
  }

  public void set(quickfix.field.EncodedPaymentText value) {
    setField(value);
  }

  public quickfix.field.EncodedPaymentText get(quickfix.field.EncodedPaymentText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPaymentText getEncodedPaymentText() throws FieldNotFound {
    return get(new quickfix.field.EncodedPaymentText());
  }

  public boolean isSet(quickfix.field.EncodedPaymentText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPaymentText() {
    return isSetField(40985);
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

  public void set(quickfix.field.LotType value) {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound {
    return get(new quickfix.field.LotType());
  }

  public boolean isSet(quickfix.field.LotType field) {
    return isSetField(field);
  }

  public boolean isSetLotType() {
    return isSetField(1093);
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

  public void set(quickfix.field.Triggered value) {
    setField(value);
  }

  public quickfix.field.Triggered get(quickfix.field.Triggered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Triggered getTriggered() throws FieldNotFound {
    return get(new quickfix.field.Triggered());
  }

  public boolean isSet(quickfix.field.Triggered field) {
    return isSetField(field);
  }

  public boolean isSetTriggered() {
    return isSetField(1823);
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

  public void set(quickfix.field.PeggedPrice value) {
    setField(value);
  }

  public quickfix.field.PeggedPrice get(quickfix.field.PeggedPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PeggedPrice getPeggedPrice() throws FieldNotFound {
    return get(new quickfix.field.PeggedPrice());
  }

  public boolean isSet(quickfix.field.PeggedPrice field) {
    return isSetField(field);
  }

  public boolean isSetPeggedPrice() {
    return isSetField(839);
  }

  public void set(quickfix.field.PeggedRefPrice value) {
    setField(value);
  }

  public quickfix.field.PeggedRefPrice get(quickfix.field.PeggedRefPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PeggedRefPrice getPeggedRefPrice() throws FieldNotFound {
    return get(new quickfix.field.PeggedRefPrice());
  }

  public boolean isSet(quickfix.field.PeggedRefPrice field) {
    return isSetField(field);
  }

  public boolean isSetPeggedRefPrice() {
    return isSetField(1095);
  }

  public void set(quickfix.field.DiscretionPrice value) {
    setField(value);
  }

  public quickfix.field.DiscretionPrice get(quickfix.field.DiscretionPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscretionPrice getDiscretionPrice() throws FieldNotFound {
    return get(new quickfix.field.DiscretionPrice());
  }

  public boolean isSet(quickfix.field.DiscretionPrice field) {
    return isSetField(field);
  }

  public boolean isSetDiscretionPrice() {
    return isSetField(845);
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

  public void set(quickfix.field.TargetStrategyPerformance value) {
    setField(value);
  }

  public quickfix.field.TargetStrategyPerformance get(quickfix.field.TargetStrategyPerformance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetStrategyPerformance getTargetStrategyPerformance() throws FieldNotFound {
    return get(new quickfix.field.TargetStrategyPerformance());
  }

  public boolean isSet(quickfix.field.TargetStrategyPerformance field) {
    return isSetField(field);
  }

  public boolean isSetTargetStrategyPerformance() {
    return isSetField(850);
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

  public void set(quickfix.field.RegulatoryReportType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportType get(quickfix.field.RegulatoryReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportType getRegulatoryReportType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportType());
  }

  public boolean isSet(quickfix.field.RegulatoryReportType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportType() {
    return isSetField(1934);
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

  public void set(quickfix.field.UnderlyingLastQty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLastQty get(quickfix.field.UnderlyingLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLastQty getUnderlyingLastQty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLastQty());
  }

  public boolean isSet(quickfix.field.UnderlyingLastQty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLastQty() {
    return isSetField(652);
  }

  public void set(quickfix.field.LastQtyVariance value) {
    setField(value);
  }

  public quickfix.field.LastQtyVariance get(quickfix.field.LastQtyVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastQtyVariance getLastQtyVariance() throws FieldNotFound {
    return get(new quickfix.field.LastQtyVariance());
  }

  public boolean isSet(quickfix.field.LastQtyVariance field) {
    return isSetField(field);
  }

  public boolean isSetLastQtyVariance() {
    return isSetField(1828);
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

  public void set(quickfix.field.UnderlyingLastPx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLastPx get(quickfix.field.UnderlyingLastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLastPx getUnderlyingLastPx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLastPx());
  }

  public boolean isSet(quickfix.field.UnderlyingLastPx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLastPx() {
    return isSetField(651);
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

  public void set(quickfix.field.MidPx value) {
    setField(value);
  }

  public quickfix.field.MidPx get(quickfix.field.MidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidPx getMidPx() throws FieldNotFound {
    return get(new quickfix.field.MidPx());
  }

  public boolean isSet(quickfix.field.MidPx field) {
    return isSetField(field);
  }

  public boolean isSetMidPx() {
    return isSetField(631);
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

  public void set(quickfix.field.LastUpfrontPrice value) {
    setField(value);
  }

  public quickfix.field.LastUpfrontPrice get(quickfix.field.LastUpfrontPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastUpfrontPrice getLastUpfrontPrice() throws FieldNotFound {
    return get(new quickfix.field.LastUpfrontPrice());
  }

  public boolean isSet(quickfix.field.LastUpfrontPrice field) {
    return isSetField(field);
  }

  public boolean isSetLastUpfrontPrice() {
    return isSetField(1743);
  }

  public void set(quickfix.field.ReportingPx value) {
    setField(value);
  }

  public quickfix.field.ReportingPx get(quickfix.field.ReportingPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReportingPx getReportingPx() throws FieldNotFound {
    return get(new quickfix.field.ReportingPx());
  }

  public boolean isSet(quickfix.field.ReportingPx field) {
    return isSetField(field);
  }

  public boolean isSetReportingPx() {
    return isSetField(2750);
  }

  public void set(quickfix.field.ReportingQty value) {
    setField(value);
  }

  public quickfix.field.ReportingQty get(quickfix.field.ReportingQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReportingQty getReportingQty() throws FieldNotFound {
    return get(new quickfix.field.ReportingQty());
  }

  public boolean isSet(quickfix.field.ReportingQty field) {
    return isSetField(field);
  }

  public boolean isSetReportingQty() {
    return isSetField(2751);
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

  public void set(quickfix.field.DayOrderQty value) {
    setField(value);
  }

  public quickfix.field.DayOrderQty get(quickfix.field.DayOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DayOrderQty getDayOrderQty() throws FieldNotFound {
    return get(new quickfix.field.DayOrderQty());
  }

  public boolean isSet(quickfix.field.DayOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetDayOrderQty() {
    return isSetField(424);
  }

  public void set(quickfix.field.DayCumQty value) {
    setField(value);
  }

  public quickfix.field.DayCumQty get(quickfix.field.DayCumQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DayCumQty getDayCumQty() throws FieldNotFound {
    return get(new quickfix.field.DayCumQty());
  }

  public boolean isSet(quickfix.field.DayCumQty field) {
    return isSetField(field);
  }

  public boolean isSetDayCumQty() {
    return isSetField(425);
  }

  public void set(quickfix.field.DayAvgPx value) {
    setField(value);
  }

  public quickfix.field.DayAvgPx get(quickfix.field.DayAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DayAvgPx getDayAvgPx() throws FieldNotFound {
    return get(new quickfix.field.DayAvgPx());
  }

  public boolean isSet(quickfix.field.DayAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetDayAvgPx() {
    return isSetField(426);
  }

  public void set(quickfix.field.TotNoFills value) {
    setField(value);
  }

  public quickfix.field.TotNoFills get(quickfix.field.TotNoFills value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoFills getTotNoFills() throws FieldNotFound {
    return get(new quickfix.field.TotNoFills());
  }

  public boolean isSet(quickfix.field.TotNoFills field) {
    return isSetField(field);
  }

  public boolean isSetTotNoFills() {
    return isSetField(1361);
  }

  public void set(quickfix.field.LastFragment value) {
    setField(value);
  }

  public quickfix.field.LastFragment get(quickfix.field.LastFragment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastFragment getLastFragment() throws FieldNotFound {
    return get(new quickfix.field.LastFragment());
  }

  public boolean isSet(quickfix.field.LastFragment field) {
    return isSetField(field);
  }

  public boolean isSetLastFragment() {
    return isSetField(893);
  }

  public void set(quickfix.fixlatest.component.FillsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FillsGrp get(quickfix.fixlatest.component.FillsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FillsGrp getFillsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FillsGrp());
  }

  public void set(quickfix.field.NoFills value) {
    setField(value);
  }

  public quickfix.field.NoFills get(quickfix.field.NoFills value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFills getNoFills() throws FieldNotFound {
    return get(new quickfix.field.NoFills());
  }

  public boolean isSet(quickfix.field.NoFills field) {
    return isSetField(field);
  }

  public boolean isSetNoFills() {
    return isSetField(1362);
  }

public static class NoFills extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1363, 1364, 1365, 2673, 2674, 1443, 1622, 1623, 1414, 0};

  public NoFills() {
    super(1362, 1363, ORDER);
  }

  public void set(quickfix.field.FillExecID value) {
    setField(value);
  }

  public quickfix.field.FillExecID get(quickfix.field.FillExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillExecID getFillExecID() throws FieldNotFound {
    return get(new quickfix.field.FillExecID());
  }

  public boolean isSet(quickfix.field.FillExecID field) {
    return isSetField(field);
  }

  public boolean isSetFillExecID() {
    return isSetField(1363);
  }

  public void set(quickfix.field.FillPx value) {
    setField(value);
  }

  public quickfix.field.FillPx get(quickfix.field.FillPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillPx getFillPx() throws FieldNotFound {
    return get(new quickfix.field.FillPx());
  }

  public boolean isSet(quickfix.field.FillPx field) {
    return isSetField(field);
  }

  public boolean isSetFillPx() {
    return isSetField(1364);
  }

  public void set(quickfix.field.FillQty value) {
    setField(value);
  }

  public quickfix.field.FillQty get(quickfix.field.FillQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillQty getFillQty() throws FieldNotFound {
    return get(new quickfix.field.FillQty());
  }

  public boolean isSet(quickfix.field.FillQty field) {
    return isSetField(field);
  }

  public boolean isSetFillQty() {
    return isSetField(1365);
  }

  public void set(quickfix.field.FillMatchID value) {
    setField(value);
  }

  public quickfix.field.FillMatchID get(quickfix.field.FillMatchID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillMatchID getFillMatchID() throws FieldNotFound {
    return get(new quickfix.field.FillMatchID());
  }

  public boolean isSet(quickfix.field.FillMatchID field) {
    return isSetField(field);
  }

  public boolean isSetFillMatchID() {
    return isSetField(2673);
  }

  public void set(quickfix.field.FillMatchSubID value) {
    setField(value);
  }

  public quickfix.field.FillMatchSubID get(quickfix.field.FillMatchSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillMatchSubID getFillMatchSubID() throws FieldNotFound {
    return get(new quickfix.field.FillMatchSubID());
  }

  public boolean isSet(quickfix.field.FillMatchSubID field) {
    return isSetField(field);
  }

  public boolean isSetFillMatchSubID() {
    return isSetField(2674);
  }

  public void set(quickfix.field.FillLiquidityInd value) {
    setField(value);
  }

  public quickfix.field.FillLiquidityInd get(quickfix.field.FillLiquidityInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillLiquidityInd getFillLiquidityInd() throws FieldNotFound {
    return get(new quickfix.field.FillLiquidityInd());
  }

  public boolean isSet(quickfix.field.FillLiquidityInd field) {
    return isSetField(field);
  }

  public boolean isSetFillLiquidityInd() {
    return isSetField(1443);
  }

  public void set(quickfix.field.FillYieldType value) {
    setField(value);
  }

  public quickfix.field.FillYieldType get(quickfix.field.FillYieldType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillYieldType getFillYieldType() throws FieldNotFound {
    return get(new quickfix.field.FillYieldType());
  }

  public boolean isSet(quickfix.field.FillYieldType field) {
    return isSetField(field);
  }

  public boolean isSetFillYieldType() {
    return isSetField(1622);
  }

  public void set(quickfix.field.FillYield value) {
    setField(value);
  }

  public quickfix.field.FillYield get(quickfix.field.FillYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillYield getFillYield() throws FieldNotFound {
    return get(new quickfix.field.FillYield());
  }

  public boolean isSet(quickfix.field.FillYield field) {
    return isSetField(field);
  }

  public boolean isSetFillYield() {
    return isSetField(1623);
  }

  public void set(quickfix.fixlatest.component.NestedParties4 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties4 get(quickfix.fixlatest.component.NestedParties4 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties4 getNestedParties4Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties4());
  }

  public void set(quickfix.field.NoNested4PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested4PartyIDs get(quickfix.field.NoNested4PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested4PartyIDs getNoNested4PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested4PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested4PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested4PartyIDs() {
    return isSetField(1414);
  }

public static class NoNested4PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1415, 1416, 1417, 2383, 1413, 0};

  public NoNested4PartyIDs() {
    super(1414, 1415, ORDER);
  }

  public void set(quickfix.field.Nested4PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyID get(quickfix.field.Nested4PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyID getNested4PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyID());
  }

  public boolean isSet(quickfix.field.Nested4PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyID() {
    return isSetField(1415);
  }

  public void set(quickfix.field.Nested4PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyIDSource get(quickfix.field.Nested4PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyIDSource getNested4PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested4PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyIDSource() {
    return isSetField(1416);
  }

  public void set(quickfix.field.Nested4PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyRole get(quickfix.field.Nested4PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyRole getNested4PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyRole());
  }

  public boolean isSet(quickfix.field.Nested4PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyRole() {
    return isSetField(1417);
  }

  public void set(quickfix.field.Nested4PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyRoleQualifier get(quickfix.field.Nested4PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyRoleQualifier getNested4PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested4PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyRoleQualifier() {
    return isSetField(2383);
  }

  public void set(quickfix.fixlatest.component.NstdPtys4SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys4SubGrp get(quickfix.fixlatest.component.NstdPtys4SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys4SubGrp getNstdPtys4SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys4SubGrp());
  }

  public void set(quickfix.field.NoNested4PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested4PartySubIDs get(quickfix.field.NoNested4PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested4PartySubIDs getNoNested4PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested4PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested4PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested4PartySubIDs() {
    return isSetField(1413);
  }

public static class NoNested4PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1412, 1411, 0};

  public NoNested4PartySubIDs() {
    super(1413, 1412, ORDER);
  }

  public void set(quickfix.field.Nested4PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested4PartySubID get(quickfix.field.Nested4PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartySubID getNested4PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartySubID());
  }

  public boolean isSet(quickfix.field.Nested4PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartySubID() {
    return isSetField(1412);
  }

  public void set(quickfix.field.Nested4PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested4PartySubIDType get(quickfix.field.Nested4PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartySubIDType getNested4PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested4PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartySubIDType() {
    return isSetField(1411);
  }
}
}
}

  public void set(quickfix.fixlatest.component.OrderEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderEventGrp get(quickfix.fixlatest.component.OrderEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderEventGrp getOrderEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderEventGrp());
  }

  public void set(quickfix.field.NoOrderEvents value) {
    setField(value);
  }

  public quickfix.field.NoOrderEvents get(quickfix.field.NoOrderEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrderEvents getNoOrderEvents() throws FieldNotFound {
    return get(new quickfix.field.NoOrderEvents());
  }

  public boolean isSet(quickfix.field.NoOrderEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoOrderEvents() {
    return isSetField(1795);
  }

public static class NoOrderEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1796, 1797, 1798, 1799, 1800, 1801, 1802, 0};

  public NoOrderEvents() {
    super(1795, 1796, ORDER);
  }

  public void set(quickfix.field.OrderEventType value) {
    setField(value);
  }

  public quickfix.field.OrderEventType get(quickfix.field.OrderEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventType getOrderEventType() throws FieldNotFound {
    return get(new quickfix.field.OrderEventType());
  }

  public boolean isSet(quickfix.field.OrderEventType field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventType() {
    return isSetField(1796);
  }

  public void set(quickfix.field.OrderEventExecID value) {
    setField(value);
  }

  public quickfix.field.OrderEventExecID get(quickfix.field.OrderEventExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventExecID getOrderEventExecID() throws FieldNotFound {
    return get(new quickfix.field.OrderEventExecID());
  }

  public boolean isSet(quickfix.field.OrderEventExecID field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventExecID() {
    return isSetField(1797);
  }

  public void set(quickfix.field.OrderEventReason value) {
    setField(value);
  }

  public quickfix.field.OrderEventReason get(quickfix.field.OrderEventReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventReason getOrderEventReason() throws FieldNotFound {
    return get(new quickfix.field.OrderEventReason());
  }

  public boolean isSet(quickfix.field.OrderEventReason field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventReason() {
    return isSetField(1798);
  }

  public void set(quickfix.field.OrderEventPx value) {
    setField(value);
  }

  public quickfix.field.OrderEventPx get(quickfix.field.OrderEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventPx getOrderEventPx() throws FieldNotFound {
    return get(new quickfix.field.OrderEventPx());
  }

  public boolean isSet(quickfix.field.OrderEventPx field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventPx() {
    return isSetField(1799);
  }

  public void set(quickfix.field.OrderEventQty value) {
    setField(value);
  }

  public quickfix.field.OrderEventQty get(quickfix.field.OrderEventQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventQty getOrderEventQty() throws FieldNotFound {
    return get(new quickfix.field.OrderEventQty());
  }

  public boolean isSet(quickfix.field.OrderEventQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventQty() {
    return isSetField(1800);
  }

  public void set(quickfix.field.OrderEventLiquidityIndicator value) {
    setField(value);
  }

  public quickfix.field.OrderEventLiquidityIndicator get(quickfix.field.OrderEventLiquidityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventLiquidityIndicator getOrderEventLiquidityIndicator() throws FieldNotFound {
    return get(new quickfix.field.OrderEventLiquidityIndicator());
  }

  public boolean isSet(quickfix.field.OrderEventLiquidityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventLiquidityIndicator() {
    return isSetField(1801);
  }

  public void set(quickfix.field.OrderEventText value) {
    setField(value);
  }

  public quickfix.field.OrderEventText get(quickfix.field.OrderEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventText getOrderEventText() throws FieldNotFound {
    return get(new quickfix.field.OrderEventText());
  }

  public boolean isSet(quickfix.field.OrderEventText field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventText() {
    return isSetField(1802);
  }
}

  public void set(quickfix.field.EventInitiatorType value) {
    setField(value);
  }

  public quickfix.field.EventInitiatorType get(quickfix.field.EventInitiatorType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventInitiatorType getEventInitiatorType() throws FieldNotFound {
    return get(new quickfix.field.EventInitiatorType());
  }

  public boolean isSet(quickfix.field.EventInitiatorType field) {
    return isSetField(field);
  }

  public boolean isSetEventInitiatorType() {
    return isSetField(2830);
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

  public void set(quickfix.field.ReportToExch value) {
    setField(value);
  }

  public quickfix.field.ReportToExch get(quickfix.field.ReportToExch value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReportToExch getReportToExch() throws FieldNotFound {
    return get(new quickfix.field.ReportToExch());
  }

  public boolean isSet(quickfix.field.ReportToExch field) {
    return isSetField(field);
  }

  public boolean isSetReportToExch() {
    return isSetField(113);
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

  public void set(quickfix.fixlatest.component.RelativeValueGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelativeValueGrp get(quickfix.fixlatest.component.RelativeValueGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelativeValueGrp getRelativeValueGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelativeValueGrp());
  }

  public void set(quickfix.field.NoRelativeValues value) {
    setField(value);
  }

  public quickfix.field.NoRelativeValues get(quickfix.field.NoRelativeValues value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelativeValues getNoRelativeValues() throws FieldNotFound {
    return get(new quickfix.field.NoRelativeValues());
  }

  public boolean isSet(quickfix.field.NoRelativeValues field) {
    return isSetField(field);
  }

  public boolean isSetNoRelativeValues() {
    return isSetField(2529);
  }

public static class NoRelativeValues extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2530, 2531, 2532, 0};

  public NoRelativeValues() {
    super(2529, 2530, ORDER);
  }

  public void set(quickfix.field.RelativeValueType value) {
    setField(value);
  }

  public quickfix.field.RelativeValueType get(quickfix.field.RelativeValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValueType getRelativeValueType() throws FieldNotFound {
    return get(new quickfix.field.RelativeValueType());
  }

  public boolean isSet(quickfix.field.RelativeValueType field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValueType() {
    return isSetField(2530);
  }

  public void set(quickfix.field.RelativeValue value) {
    setField(value);
  }

  public quickfix.field.RelativeValue get(quickfix.field.RelativeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValue getRelativeValue() throws FieldNotFound {
    return get(new quickfix.field.RelativeValue());
  }

  public boolean isSet(quickfix.field.RelativeValue field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValue() {
    return isSetField(2531);
  }

  public void set(quickfix.field.RelativeValueSide value) {
    setField(value);
  }

  public quickfix.field.RelativeValueSide get(quickfix.field.RelativeValueSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelativeValueSide getRelativeValueSide() throws FieldNotFound {
    return get(new quickfix.field.RelativeValueSide());
  }

  public boolean isSet(quickfix.field.RelativeValueSide field) {
    return isSetField(field);
  }

  public boolean isSetRelativeValueSide() {
    return isSetField(2532);
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

  public void set(quickfix.field.TradedFlatSwitch value) {
    setField(value);
  }

  public quickfix.field.TradedFlatSwitch get(quickfix.field.TradedFlatSwitch value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradedFlatSwitch getTradedFlatSwitch() throws FieldNotFound {
    return get(new quickfix.field.TradedFlatSwitch());
  }

  public boolean isSet(quickfix.field.TradedFlatSwitch field) {
    return isSetField(field);
  }

  public boolean isSetTradedFlatSwitch() {
    return isSetField(258);
  }

  public void set(quickfix.field.BasisFeatureDate value) {
    setField(value);
  }

  public quickfix.field.BasisFeatureDate get(quickfix.field.BasisFeatureDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BasisFeatureDate getBasisFeatureDate() throws FieldNotFound {
    return get(new quickfix.field.BasisFeatureDate());
  }

  public boolean isSet(quickfix.field.BasisFeatureDate field) {
    return isSetField(field);
  }

  public boolean isSetBasisFeatureDate() {
    return isSetField(259);
  }

  public void set(quickfix.field.BasisFeaturePrice value) {
    setField(value);
  }

  public quickfix.field.BasisFeaturePrice get(quickfix.field.BasisFeaturePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BasisFeaturePrice getBasisFeaturePrice() throws FieldNotFound {
    return get(new quickfix.field.BasisFeaturePrice());
  }

  public boolean isSet(quickfix.field.BasisFeaturePrice field) {
    return isSetField(field);
  }

  public boolean isSetBasisFeaturePrice() {
    return isSetField(260);
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

  public void set(quickfix.field.CrossedIndicator value) {
    setField(value);
  }

  public quickfix.field.CrossedIndicator get(quickfix.field.CrossedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossedIndicator getCrossedIndicator() throws FieldNotFound {
    return get(new quickfix.field.CrossedIndicator());
  }

  public boolean isSet(quickfix.field.CrossedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCrossedIndicator() {
    return isSetField(2523);
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

  public void set(quickfix.field.LastForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.LastForwardPoints2 get(quickfix.field.LastForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastForwardPoints2 getLastForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.LastForwardPoints2());
  }

  public boolean isSet(quickfix.field.LastForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetLastForwardPoints2() {
    return isSetField(641);
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

  public void set(quickfix.field.ContingencyType value) {
    setField(value);
  }

  public quickfix.field.ContingencyType get(quickfix.field.ContingencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContingencyType getContingencyType() throws FieldNotFound {
    return get(new quickfix.field.ContingencyType());
  }

  public boolean isSet(quickfix.field.ContingencyType field) {
    return isSetField(field);
  }

  public boolean isSetContingencyType() {
    return isSetField(1385);
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

  public void set(quickfix.field.TransBkdTime value) {
    setField(value);
  }

  public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound {
    return get(new quickfix.field.TransBkdTime());
  }

  public boolean isSet(quickfix.field.TransBkdTime field) {
    return isSetField(field);
  }

  public boolean isSetTransBkdTime() {
    return isSetField(483);
  }

  public void set(quickfix.field.ExecValuationPoint value) {
    setField(value);
  }

  public quickfix.field.ExecValuationPoint get(quickfix.field.ExecValuationPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecValuationPoint getExecValuationPoint() throws FieldNotFound {
    return get(new quickfix.field.ExecValuationPoint());
  }

  public boolean isSet(quickfix.field.ExecValuationPoint field) {
    return isSetField(field);
  }

  public boolean isSetExecValuationPoint() {
    return isSetField(515);
  }

  public void set(quickfix.field.ExecPriceType value) {
    setField(value);
  }

  public quickfix.field.ExecPriceType get(quickfix.field.ExecPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecPriceType getExecPriceType() throws FieldNotFound {
    return get(new quickfix.field.ExecPriceType());
  }

  public boolean isSet(quickfix.field.ExecPriceType field) {
    return isSetField(field);
  }

  public boolean isSetExecPriceType() {
    return isSetField(484);
  }

  public void set(quickfix.field.ExecPriceAdjustment value) {
    setField(value);
  }

  public quickfix.field.ExecPriceAdjustment get(quickfix.field.ExecPriceAdjustment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecPriceAdjustment getExecPriceAdjustment() throws FieldNotFound {
    return get(new quickfix.field.ExecPriceAdjustment());
  }

  public boolean isSet(quickfix.field.ExecPriceAdjustment field) {
    return isSetField(field);
  }

  public boolean isSetExecPriceAdjustment() {
    return isSetField(485);
  }

  public void set(quickfix.field.PriorityIndicator value) {
    setField(value);
  }

  public quickfix.field.PriorityIndicator get(quickfix.field.PriorityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriorityIndicator getPriorityIndicator() throws FieldNotFound {
    return get(new quickfix.field.PriorityIndicator());
  }

  public boolean isSet(quickfix.field.PriorityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPriorityIndicator() {
    return isSetField(638);
  }

  public void set(quickfix.field.PriceImprovement value) {
    setField(value);
  }

  public quickfix.field.PriceImprovement get(quickfix.field.PriceImprovement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceImprovement getPriceImprovement() throws FieldNotFound {
    return get(new quickfix.field.PriceImprovement());
  }

  public boolean isSet(quickfix.field.PriceImprovement field) {
    return isSetField(field);
  }

  public boolean isSetPriceImprovement() {
    return isSetField(639);
  }

  public void set(quickfix.field.LastLiquidityInd value) {
    setField(value);
  }

  public quickfix.field.LastLiquidityInd get(quickfix.field.LastLiquidityInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastLiquidityInd getLastLiquidityInd() throws FieldNotFound {
    return get(new quickfix.field.LastLiquidityInd());
  }

  public boolean isSet(quickfix.field.LastLiquidityInd field) {
    return isSetField(field);
  }

  public boolean isSetLastLiquidityInd() {
    return isSetField(851);
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

  public void set(quickfix.fixlatest.component.InstrmtLegExecGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrmtLegExecGrp get(quickfix.fixlatest.component.InstrmtLegExecGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrmtLegExecGrp getInstrmtLegExecGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrmtLegExecGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 685, 687, 2346, 690, 683, 1366, 670, 2680, 1817, 564, 565, 948, 654, 587, 588, 637, 675, 1073, 1074, 1075, 1689, 1379, 1381, 1383, 1384, 1418, 2421, 0};

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

  public void set(quickfix.field.FillRefID value) {
    setField(value);
  }

  public quickfix.field.FillRefID get(quickfix.field.FillRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FillRefID getFillRefID() throws FieldNotFound {
    return get(new quickfix.field.FillRefID());
  }

  public boolean isSet(quickfix.field.FillRefID field) {
    return isSetField(field);
  }

  public boolean isSetFillRefID() {
    return isSetField(2421);
  }
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

  public void set(quickfix.field.DividendYield value) {
    setField(value);
  }

  public quickfix.field.DividendYield get(quickfix.field.DividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendYield getDividendYield() throws FieldNotFound {
    return get(new quickfix.field.DividendYield());
  }

  public boolean isSet(quickfix.field.DividendYield field) {
    return isSetField(field);
  }

  public boolean isSetDividendYield() {
    return isSetField(1380);
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

  public void set(quickfix.field.AffiliatedFirmsTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.AffiliatedFirmsTradeIndicator get(quickfix.field.AffiliatedFirmsTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffiliatedFirmsTradeIndicator getAffiliatedFirmsTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AffiliatedFirmsTradeIndicator());
  }

  public boolean isSet(quickfix.field.AffiliatedFirmsTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAffiliatedFirmsTradeIndicator() {
    return isSetField(2525);
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

  public void set(quickfix.field.Volatility value) {
    setField(value);
  }

  public quickfix.field.Volatility get(quickfix.field.Volatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Volatility getVolatility() throws FieldNotFound {
    return get(new quickfix.field.Volatility());
  }

  public boolean isSet(quickfix.field.Volatility field) {
    return isSetField(field);
  }

  public boolean isSetVolatility() {
    return isSetField(1188);
  }

  public void set(quickfix.field.TimeToExpiration value) {
    setField(value);
  }

  public quickfix.field.TimeToExpiration get(quickfix.field.TimeToExpiration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeToExpiration getTimeToExpiration() throws FieldNotFound {
    return get(new quickfix.field.TimeToExpiration());
  }

  public boolean isSet(quickfix.field.TimeToExpiration field) {
    return isSetField(field);
  }

  public boolean isSetTimeToExpiration() {
    return isSetField(1189);
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

  public void set(quickfix.field.PriceDelta value) {
    setField(value);
  }

  public quickfix.field.PriceDelta get(quickfix.field.PriceDelta value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceDelta getPriceDelta() throws FieldNotFound {
    return get(new quickfix.field.PriceDelta());
  }

  public boolean isSet(quickfix.field.PriceDelta field) {
    return isSetField(field);
  }

  public boolean isSetPriceDelta() {
    return isSetField(811);
  }

  public void set(quickfix.field.CoverPrice value) {
    setField(value);
  }

  public quickfix.field.CoverPrice get(quickfix.field.CoverPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoverPrice getCoverPrice() throws FieldNotFound {
    return get(new quickfix.field.CoverPrice());
  }

  public boolean isSet(quickfix.field.CoverPrice field) {
    return isSetField(field);
  }

  public boolean isSetCoverPrice() {
    return isSetField(1917);
  }

  public void set(quickfix.fixlatest.component.ThrottleResponse component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ThrottleResponse get(quickfix.fixlatest.component.ThrottleResponse component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ThrottleResponse getThrottleResponseComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ThrottleResponse());
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

  public void set(quickfix.fixlatest.component.RelatedOrderGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedOrderGrp get(quickfix.fixlatest.component.RelatedOrderGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedOrderGrp getRelatedOrderGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedOrderGrp());
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
  private static final int[]  ORDER = {2887, 2888, 2836, 2889, 2890, 2835, 0};

  public NoOrders() {
    super(73, 2887, ORDER);
  }

  public void set(quickfix.field.RelatedOrderID value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderID get(quickfix.field.RelatedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderID getRelatedOrderID() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderID());
  }

  public boolean isSet(quickfix.field.RelatedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderID() {
    return isSetField(2887);
  }

  public void set(quickfix.field.RelatedOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderIDSource get(quickfix.field.RelatedOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderIDSource getRelatedOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderIDSource());
  }

  public boolean isSet(quickfix.field.RelatedOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderIDSource() {
    return isSetField(2888);
  }

  public void set(quickfix.field.RelatedOrderTime value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderTime get(quickfix.field.RelatedOrderTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderTime getRelatedOrderTime() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderTime());
  }

  public boolean isSet(quickfix.field.RelatedOrderTime field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderTime() {
    return isSetField(2836);
  }

  public void set(quickfix.field.RelatedOrderQty value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderQty get(quickfix.field.RelatedOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderQty getRelatedOrderQty() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderQty());
  }

  public boolean isSet(quickfix.field.RelatedOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderQty() {
    return isSetField(2889);
  }

  public void set(quickfix.field.OrderRelationship value) {
    setField(value);
  }

  public quickfix.field.OrderRelationship get(quickfix.field.OrderRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRelationship getOrderRelationship() throws FieldNotFound {
    return get(new quickfix.field.OrderRelationship());
  }

  public boolean isSet(quickfix.field.OrderRelationship field) {
    return isSetField(field);
  }

  public boolean isSetOrderRelationship() {
    return isSetField(2890);
  }

  public void set(quickfix.field.OrderOriginationFirmID value) {
    setField(value);
  }

  public quickfix.field.OrderOriginationFirmID get(quickfix.field.OrderOriginationFirmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOriginationFirmID getOrderOriginationFirmID() throws FieldNotFound {
    return get(new quickfix.field.OrderOriginationFirmID());
  }

  public boolean isSet(quickfix.field.OrderOriginationFirmID field) {
    return isSetField(field);
  }

  public boolean isSetOrderOriginationFirmID() {
    return isSetField(2835);
  }
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

  public void set(quickfix.field.LockedQty value) {
    setField(value);
  }

  public quickfix.field.LockedQty get(quickfix.field.LockedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LockedQty getLockedQty() throws FieldNotFound {
    return get(new quickfix.field.LockedQty());
  }

  public boolean isSet(quickfix.field.LockedQty field) {
    return isSetField(field);
  }

  public boolean isSetLockedQty() {
    return isSetField(1808);
  }

  public void set(quickfix.field.SecondaryLockedQty value) {
    setField(value);
  }

  public quickfix.field.SecondaryLockedQty get(quickfix.field.SecondaryLockedQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryLockedQty getSecondaryLockedQty() throws FieldNotFound {
    return get(new quickfix.field.SecondaryLockedQty());
  }

  public boolean isSet(quickfix.field.SecondaryLockedQty field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryLockedQty() {
    return isSetField(1809);
  }

  public void set(quickfix.field.LockType value) {
    setField(value);
  }

  public quickfix.field.LockType get(quickfix.field.LockType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LockType getLockType() throws FieldNotFound {
    return get(new quickfix.field.LockType());
  }

  public boolean isSet(quickfix.field.LockType field) {
    return isSetField(field);
  }

  public boolean isSetLockType() {
    return isSetField(1807);
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
