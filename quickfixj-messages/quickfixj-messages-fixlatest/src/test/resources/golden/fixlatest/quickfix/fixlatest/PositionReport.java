/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PositionReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AP";

  public PositionReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PositionReport (quickfix.field.PosMaintRptID posMaintRptID, quickfix.field.ClearingBusinessDate clearingBusinessDate) {
    this();
    setField(posMaintRptID);
    setField(clearingBusinessDate);
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

  public void set(quickfix.field.PosMaintRptID value) {
    setField(value);
  }

  public quickfix.field.PosMaintRptID get(quickfix.field.PosMaintRptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosMaintRptID getPosMaintRptID() throws FieldNotFound {
    return get(new quickfix.field.PosMaintRptID());
  }

  public boolean isSet(quickfix.field.PosMaintRptID field) {
    return isSetField(field);
  }

  public boolean isSetPosMaintRptID() {
    return isSetField(721);
  }

  public void set(quickfix.field.PositionID value) {
    setField(value);
  }

  public quickfix.field.PositionID get(quickfix.field.PositionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionID getPositionID() throws FieldNotFound {
    return get(new quickfix.field.PositionID());
  }

  public boolean isSet(quickfix.field.PositionID field) {
    return isSetField(field);
  }

  public boolean isSetPositionID() {
    return isSetField(2618);
  }

  public void set(quickfix.field.PosReqID value) {
    setField(value);
  }

  public quickfix.field.PosReqID get(quickfix.field.PosReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosReqID getPosReqID() throws FieldNotFound {
    return get(new quickfix.field.PosReqID());
  }

  public boolean isSet(quickfix.field.PosReqID field) {
    return isSetField(field);
  }

  public boolean isSetPosReqID() {
    return isSetField(710);
  }

  public void set(quickfix.field.PosReqType value) {
    setField(value);
  }

  public quickfix.field.PosReqType get(quickfix.field.PosReqType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosReqType getPosReqType() throws FieldNotFound {
    return get(new quickfix.field.PosReqType());
  }

  public boolean isSet(quickfix.field.PosReqType field) {
    return isSetField(field);
  }

  public boolean isSetPosReqType() {
    return isSetField(724);
  }

  public void set(quickfix.field.PosReportAction value) {
    setField(value);
  }

  public quickfix.field.PosReportAction get(quickfix.field.PosReportAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosReportAction getPosReportAction() throws FieldNotFound {
    return get(new quickfix.field.PosReportAction());
  }

  public boolean isSet(quickfix.field.PosReportAction field) {
    return isSetField(field);
  }

  public boolean isSetPosReportAction() {
    return isSetField(2364);
  }

  public void set(quickfix.field.MarginReqmtInqID value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtInqID get(quickfix.field.MarginReqmtInqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtInqID getMarginReqmtInqID() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtInqID());
  }

  public boolean isSet(quickfix.field.MarginReqmtInqID field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtInqID() {
    return isSetField(1635);
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

  public void set(quickfix.field.TotalNumPosReports value) {
    setField(value);
  }

  public quickfix.field.TotalNumPosReports get(quickfix.field.TotalNumPosReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalNumPosReports getTotalNumPosReports() throws FieldNotFound {
    return get(new quickfix.field.TotalNumPosReports());
  }

  public boolean isSet(quickfix.field.TotalNumPosReports field) {
    return isSetField(field);
  }

  public boolean isSetTotalNumPosReports() {
    return isSetField(727);
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

  public void set(quickfix.field.PosReqResult value) {
    setField(value);
  }

  public quickfix.field.PosReqResult get(quickfix.field.PosReqResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosReqResult getPosReqResult() throws FieldNotFound {
    return get(new quickfix.field.PosReqResult());
  }

  public boolean isSet(quickfix.field.PosReqResult field) {
    return isSetField(field);
  }

  public boolean isSetPosReqResult() {
    return isSetField(728);
  }

  public void set(quickfix.field.UnsolicitedIndicator value) {
    setField(value);
  }

  public quickfix.field.UnsolicitedIndicator get(quickfix.field.UnsolicitedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnsolicitedIndicator());
  }

  public boolean isSet(quickfix.field.UnsolicitedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnsolicitedIndicator() {
    return isSetField(325);
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

  public void set(quickfix.field.RegulatoryReportTypeBusinessDate value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportTypeBusinessDate get(quickfix.field.RegulatoryReportTypeBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportTypeBusinessDate getRegulatoryReportTypeBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportTypeBusinessDate());
  }

  public boolean isSet(quickfix.field.RegulatoryReportTypeBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportTypeBusinessDate() {
    return isSetField(2869);
  }

  public void set(quickfix.fixlatest.component.TransactionAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TransactionAttributeGrp get(quickfix.fixlatest.component.TransactionAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TransactionAttributeGrp getTransactionAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TransactionAttributeGrp());
  }

  public void set(quickfix.field.NoTransactionAttributes value) {
    setField(value);
  }

  public quickfix.field.NoTransactionAttributes get(quickfix.field.NoTransactionAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTransactionAttributes getNoTransactionAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoTransactionAttributes());
  }

  public boolean isSet(quickfix.field.NoTransactionAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoTransactionAttributes() {
    return isSetField(2871);
  }

public static class NoTransactionAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2872, 2873, 0};

  public NoTransactionAttributes() {
    super(2871, 2872, ORDER);
  }

  public void set(quickfix.field.TransactionAttributeType value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeType get(quickfix.field.TransactionAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeType getTransactionAttributeType() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeType());
  }

  public boolean isSet(quickfix.field.TransactionAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeType() {
    return isSetField(2872);
  }

  public void set(quickfix.field.TransactionAttributeValue value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeValue get(quickfix.field.TransactionAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeValue getTransactionAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeValue());
  }

  public boolean isSet(quickfix.field.TransactionAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeValue() {
    return isSetField(2873);
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

  public void set(quickfix.field.PreviousClearingBusinessDate value) {
    setField(value);
  }

  public quickfix.field.PreviousClearingBusinessDate get(quickfix.field.PreviousClearingBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviousClearingBusinessDate getPreviousClearingBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.PreviousClearingBusinessDate());
  }

  public boolean isSet(quickfix.field.PreviousClearingBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetPreviousClearingBusinessDate() {
    return isSetField(2084);
  }

  public void set(quickfix.field.ClearingPortfolioID value) {
    setField(value);
  }

  public quickfix.field.ClearingPortfolioID get(quickfix.field.ClearingPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingPortfolioID getClearingPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.ClearingPortfolioID());
  }

  public boolean isSet(quickfix.field.ClearingPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetClearingPortfolioID() {
    return isSetField(2870);
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

  public void set(quickfix.field.ContractRefPosType value) {
    setField(value);
  }

  public quickfix.field.ContractRefPosType get(quickfix.field.ContractRefPosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractRefPosType getContractRefPosType() throws FieldNotFound {
    return get(new quickfix.field.ContractRefPosType());
  }

  public boolean isSet(quickfix.field.ContractRefPosType field) {
    return isSetField(field);
  }

  public boolean isSetContractRefPosType() {
    return isSetField(1833);
  }

  public void set(quickfix.field.PositionCapacity value) {
    setField(value);
  }

  public quickfix.field.PositionCapacity get(quickfix.field.PositionCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionCapacity getPositionCapacity() throws FieldNotFound {
    return get(new quickfix.field.PositionCapacity());
  }

  public boolean isSet(quickfix.field.PositionCapacity field) {
    return isSetField(field);
  }

  public boolean isSetPositionCapacity() {
    return isSetField(1834);
  }

  public void set(quickfix.field.TerminatedIndicator value) {
    setField(value);
  }

  public quickfix.field.TerminatedIndicator get(quickfix.field.TerminatedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TerminatedIndicator getTerminatedIndicator() throws FieldNotFound {
    return get(new quickfix.field.TerminatedIndicator());
  }

  public boolean isSet(quickfix.field.TerminatedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTerminatedIndicator() {
    return isSetField(2101);
  }

  public void set(quickfix.field.TerminationDate value) {
    setField(value);
  }

  public quickfix.field.TerminationDate get(quickfix.field.TerminationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TerminationDate getTerminationDate() throws FieldNotFound {
    return get(new quickfix.field.TerminationDate());
  }

  public boolean isSet(quickfix.field.TerminationDate field) {
    return isSetField(field);
  }

  public boolean isSetTerminationDate() {
    return isSetField(2878);
  }

  public void set(quickfix.field.IntraFirmTradeIndicator value) {
    setField(value);
  }

  public quickfix.field.IntraFirmTradeIndicator get(quickfix.field.IntraFirmTradeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IntraFirmTradeIndicator getIntraFirmTradeIndicator() throws FieldNotFound {
    return get(new quickfix.field.IntraFirmTradeIndicator());
  }

  public boolean isSet(quickfix.field.IntraFirmTradeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetIntraFirmTradeIndicator() {
    return isSetField(2373);
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

  public void set(quickfix.field.TradeCollateralization value) {
    setField(value);
  }

  public quickfix.field.TradeCollateralization get(quickfix.field.TradeCollateralization value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeCollateralization getTradeCollateralization() throws FieldNotFound {
    return get(new quickfix.field.TradeCollateralization());
  }

  public boolean isSet(quickfix.field.TradeCollateralization field) {
    return isSetField(field);
  }

  public boolean isSetTradeCollateralization() {
    return isSetField(1936);
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

  public void set(quickfix.field.TaxonomyType value) {
    setField(value);
  }

  public quickfix.field.TaxonomyType get(quickfix.field.TaxonomyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TaxonomyType getTaxonomyType() throws FieldNotFound {
    return get(new quickfix.field.TaxonomyType());
  }

  public boolean isSet(quickfix.field.TaxonomyType field) {
    return isSetField(field);
  }

  public boolean isSetTaxonomyType() {
    return isSetField(2375);
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

  public void set(quickfix.field.SettlPrice value) {
    setField(value);
  }

  public quickfix.field.SettlPrice get(quickfix.field.SettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPrice getSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.SettlPrice());
  }

  public boolean isSet(quickfix.field.SettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetSettlPrice() {
    return isSetField(730);
  }

  public void set(quickfix.field.SettlPriceFxRateCalc value) {
    setField(value);
  }

  public quickfix.field.SettlPriceFxRateCalc get(quickfix.field.SettlPriceFxRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceFxRateCalc getSettlPriceFxRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceFxRateCalc());
  }

  public boolean isSet(quickfix.field.SettlPriceFxRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceFxRateCalc() {
    return isSetField(2366);
  }

  public void set(quickfix.field.SettlForwardPoints value) {
    setField(value);
  }

  public quickfix.field.SettlForwardPoints get(quickfix.field.SettlForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlForwardPoints getSettlForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.SettlForwardPoints());
  }

  public boolean isSet(quickfix.field.SettlForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetSettlForwardPoints() {
    return isSetField(2365);
  }

  public void set(quickfix.field.SettlPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.SettlPriceUnitOfMeasure get(quickfix.field.SettlPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceUnitOfMeasure getSettlPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.SettlPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceUnitOfMeasure() {
    return isSetField(1886);
  }

  public void set(quickfix.field.SettlPriceUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlPriceUnitOfMeasureCurrency get(quickfix.field.SettlPriceUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceUnitOfMeasureCurrency getSettlPriceUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.SettlPriceUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceUnitOfMeasureCurrency() {
    return isSetField(1887);
  }

  public void set(quickfix.field.SettlPriceType value) {
    setField(value);
  }

  public quickfix.field.SettlPriceType get(quickfix.field.SettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceType getSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceType());
  }

  public boolean isSet(quickfix.field.SettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceType() {
    return isSetField(731);
  }

  public void set(quickfix.field.PriorSettlPrice value) {
    setField(value);
  }

  public quickfix.field.PriorSettlPrice get(quickfix.field.PriorSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriorSettlPrice getPriorSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.PriorSettlPrice());
  }

  public boolean isSet(quickfix.field.PriorSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetPriorSettlPrice() {
    return isSetField(734);
  }

  public void set(quickfix.field.PositionContingentPrice value) {
    setField(value);
  }

  public quickfix.field.PositionContingentPrice get(quickfix.field.PositionContingentPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionContingentPrice getPositionContingentPrice() throws FieldNotFound {
    return get(new quickfix.field.PositionContingentPrice());
  }

  public boolean isSet(quickfix.field.PositionContingentPrice field) {
    return isSetField(field);
  }

  public boolean isSetPositionContingentPrice() {
    return isSetField(1595);
  }

  public void set(quickfix.field.DiscountFactor value) {
    setField(value);
  }

  public quickfix.field.DiscountFactor get(quickfix.field.DiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscountFactor getDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.DiscountFactor());
  }

  public boolean isSet(quickfix.field.DiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetDiscountFactor() {
    return isSetField(1592);
  }

  public void set(quickfix.field.ValuationDate value) {
    setField(value);
  }

  public quickfix.field.ValuationDate get(quickfix.field.ValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValuationDate getValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ValuationDate());
  }

  public boolean isSet(quickfix.field.ValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetValuationDate() {
    return isSetField(2085);
  }

  public void set(quickfix.field.ValuationTime value) {
    setField(value);
  }

  public quickfix.field.ValuationTime get(quickfix.field.ValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValuationTime getValuationTime() throws FieldNotFound {
    return get(new quickfix.field.ValuationTime());
  }

  public boolean isSet(quickfix.field.ValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetValuationTime() {
    return isSetField(2086);
  }

  public void set(quickfix.field.ValuationBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ValuationBusinessCenter get(quickfix.field.ValuationBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValuationBusinessCenter getValuationBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ValuationBusinessCenter());
  }

  public boolean isSet(quickfix.field.ValuationBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetValuationBusinessCenter() {
    return isSetField(2087);
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

  public void set(quickfix.fixlatest.component.RelatedInstrumentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedInstrumentGrp get(quickfix.fixlatest.component.RelatedInstrumentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedInstrumentGrp getRelatedInstrumentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedInstrumentGrp());
  }

  public void set(quickfix.field.NoRelatedInstruments value) {
    setField(value);
  }

  public quickfix.field.NoRelatedInstruments get(quickfix.field.NoRelatedInstruments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedInstruments getNoRelatedInstruments() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedInstruments());
  }

  public boolean isSet(quickfix.field.NoRelatedInstruments field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedInstruments() {
    return isSetField(1647);
  }

public static class NoRelatedInstruments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1648, 1649, 1650, 1651, 1652, 1653, 2413, 2414, 2415, 2417, 0};

  public NoRelatedInstruments() {
    super(1647, 1648, ORDER);
  }

  public void set(quickfix.field.RelatedInstrumentType value) {
    setField(value);
  }

  public quickfix.field.RelatedInstrumentType get(quickfix.field.RelatedInstrumentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedInstrumentType getRelatedInstrumentType() throws FieldNotFound {
    return get(new quickfix.field.RelatedInstrumentType());
  }

  public boolean isSet(quickfix.field.RelatedInstrumentType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedInstrumentType() {
    return isSetField(1648);
  }

  public void set(quickfix.field.RelatedSymbol value) {
    setField(value);
  }

  public quickfix.field.RelatedSymbol get(quickfix.field.RelatedSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSymbol getRelatedSymbol() throws FieldNotFound {
    return get(new quickfix.field.RelatedSymbol());
  }

  public boolean isSet(quickfix.field.RelatedSymbol field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSymbol() {
    return isSetField(1649);
  }

  public void set(quickfix.field.RelatedSecurityID value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityID get(quickfix.field.RelatedSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityID getRelatedSecurityID() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityID());
  }

  public boolean isSet(quickfix.field.RelatedSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityID() {
    return isSetField(1650);
  }

  public void set(quickfix.field.RelatedSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityIDSource get(quickfix.field.RelatedSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityIDSource getRelatedSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityIDSource());
  }

  public boolean isSet(quickfix.field.RelatedSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityIDSource() {
    return isSetField(1651);
  }

  public void set(quickfix.field.RelatedSecurityType value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityType get(quickfix.field.RelatedSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityType getRelatedSecurityType() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityType());
  }

  public boolean isSet(quickfix.field.RelatedSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityType() {
    return isSetField(1652);
  }

  public void set(quickfix.field.RelatedMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.RelatedMaturityMonthYear get(quickfix.field.RelatedMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedMaturityMonthYear getRelatedMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.RelatedMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.RelatedMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetRelatedMaturityMonthYear() {
    return isSetField(1653);
  }

  public void set(quickfix.field.RelatedToSecurityID value) {
    setField(value);
  }

  public quickfix.field.RelatedToSecurityID get(quickfix.field.RelatedToSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToSecurityID getRelatedToSecurityID() throws FieldNotFound {
    return get(new quickfix.field.RelatedToSecurityID());
  }

  public boolean isSet(quickfix.field.RelatedToSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToSecurityID() {
    return isSetField(2413);
  }

  public void set(quickfix.field.RelatedToSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedToSecurityIDSource get(quickfix.field.RelatedToSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToSecurityIDSource getRelatedToSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedToSecurityIDSource());
  }

  public boolean isSet(quickfix.field.RelatedToSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToSecurityIDSource() {
    return isSetField(2414);
  }

  public void set(quickfix.field.RelatedToStreamXIDRef value) {
    setField(value);
  }

  public quickfix.field.RelatedToStreamXIDRef get(quickfix.field.RelatedToStreamXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToStreamXIDRef getRelatedToStreamXIDRef() throws FieldNotFound {
    return get(new quickfix.field.RelatedToStreamXIDRef());
  }

  public boolean isSet(quickfix.field.RelatedToStreamXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToStreamXIDRef() {
    return isSetField(2415);
  }

  public void set(quickfix.field.RelatedToDividendPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.RelatedToDividendPeriodXIDRef get(quickfix.field.RelatedToDividendPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToDividendPeriodXIDRef getRelatedToDividendPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.RelatedToDividendPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.RelatedToDividendPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToDividendPeriodXIDRef() {
    return isSetField(2417);
  }
}

  public void set(quickfix.fixlatest.component.CollateralAmountGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CollateralAmountGrp get(quickfix.fixlatest.component.CollateralAmountGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CollateralAmountGrp getCollateralAmountGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CollateralAmountGrp());
  }

  public void set(quickfix.field.NoCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoCollateralAmounts get(quickfix.field.NoCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCollateralAmounts getNoCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoCollateralAmounts() {
    return isSetField(1703);
  }

public static class NoCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1704, 1705, 2632, 2090, 2091, 1706, 2092, 2093, 1902, 2350, 2690, 2689, 2840, 2841, 0};

  public NoCollateralAmounts() {
    super(1703, 1704, ORDER);
  }

  public void set(quickfix.field.CurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.CurrentCollateralAmount get(quickfix.field.CurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCollateralAmount getCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.CurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.CurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCollateralAmount() {
    return isSetField(1704);
  }

  public void set(quickfix.field.CollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.CollateralCurrency get(quickfix.field.CollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralCurrency getCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.CollateralCurrency());
  }

  public boolean isSet(quickfix.field.CollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCollateralCurrency() {
    return isSetField(1705);
  }

  public void set(quickfix.field.CollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountType get(quickfix.field.CollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountType getCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountType());
  }

  public boolean isSet(quickfix.field.CollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountType() {
    return isSetField(2632);
  }

  public void set(quickfix.field.CollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRate get(quickfix.field.CollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRate getCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRate());
  }

  public boolean isSet(quickfix.field.CollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRate() {
    return isSetField(2090);
  }

  public void set(quickfix.field.CollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRateCalc get(quickfix.field.CollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRateCalc getCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.CollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRateCalc() {
    return isSetField(2091);
  }

  public void set(quickfix.field.CollateralType value) {
    setField(value);
  }

  public quickfix.field.CollateralType get(quickfix.field.CollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralType getCollateralType() throws FieldNotFound {
    return get(new quickfix.field.CollateralType());
  }

  public boolean isSet(quickfix.field.CollateralType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralType() {
    return isSetField(1706);
  }

  public void set(quickfix.field.CollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketSegmentID get(quickfix.field.CollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketSegmentID getCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketSegmentID() {
    return isSetField(2092);
  }

  public void set(quickfix.field.CollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketID get(quickfix.field.CollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketID getCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketID() {
    return isSetField(2093);
  }

  public void set(quickfix.field.HaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.HaircutIndicator get(quickfix.field.HaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HaircutIndicator getHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.HaircutIndicator());
  }

  public boolean isSet(quickfix.field.HaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetHaircutIndicator() {
    return isSetField(1902);
  }

  public void set(quickfix.field.CollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.CollateralPortfolioID get(quickfix.field.CollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPortfolioID getCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.CollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.CollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPortfolioID() {
    return isSetField(2350);
  }

  public void set(quickfix.field.CollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.CollateralPercentOverage get(quickfix.field.CollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPercentOverage getCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.CollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.CollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPercentOverage() {
    return isSetField(2690);
  }

  public void set(quickfix.field.CollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.CollateralMarketPrice get(quickfix.field.CollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralMarketPrice getCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.CollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.CollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetCollateralMarketPrice() {
    return isSetField(2689);
  }

  public void set(quickfix.field.CollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.CollateralReinvestmentRate get(quickfix.field.CollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralReinvestmentRate getCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.CollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralReinvestmentRate() {
    return isSetField(2840);
  }

  public void set(quickfix.field.UnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRefID get(quickfix.field.UnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRefID getUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRefID() {
    return isSetField(2841);
  }
}

  public void set(quickfix.field.CollateralizationValueDate value) {
    setField(value);
  }

  public quickfix.field.CollateralizationValueDate get(quickfix.field.CollateralizationValueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralizationValueDate getCollateralizationValueDate() throws FieldNotFound {
    return get(new quickfix.field.CollateralizationValueDate());
  }

  public boolean isSet(quickfix.field.CollateralizationValueDate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralizationValueDate() {
    return isSetField(2868);
  }

  public void set(quickfix.fixlatest.component.PosUndInstrmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PosUndInstrmtGrp get(quickfix.fixlatest.component.PosUndInstrmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PosUndInstrmtGrp getPosUndInstrmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PosUndInstrmtGrp());
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
  private static final int[]  ORDER = {311, 312, 309, 305, 457, 2874, 462, 1874, 1875, 1876, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1981, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2080, 2312, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2045, 2295, 2296, 2297, 2756, 2298, 2299, 40964, 40962, 40965, 41949, 41950, 41947, 41951, 41952, 41953, 41859, 41864, 41860, 41866, 41868, 41861, 41862, 41863, 41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, 43076, 43077, 43074, 43078, 43079, 43080, 43081, 43082, 41822, 41820, 41841, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, 41846, 41844, 41856, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, 42888, 42889, 42890, 42891, 42892, 42893, 42894, 40540, 42149, 42036, 42068, 42041, 42060, 43004, 43005, 42860, 42861, 42855, 42884, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, 732, 733, 1037, 984, 0};

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

  public void set(quickfix.field.UnderlyingSettlPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlPrice get(quickfix.field.UnderlyingSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlPrice getUnderlyingSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlPrice() {
    return isSetField(732);
  }

  public void set(quickfix.field.UnderlyingSettlPriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlPriceType get(quickfix.field.UnderlyingSettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlPriceType getUnderlyingSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlPriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlPriceType() {
    return isSetField(733);
  }

  public void set(quickfix.field.UnderlyingDeliveryAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryAmount get(quickfix.field.UnderlyingDeliveryAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryAmount getUnderlyingDeliveryAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryAmount() {
    return isSetField(1037);
  }

  public void set(quickfix.fixlatest.component.UnderlyingAmount component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAmount get(quickfix.fixlatest.component.UnderlyingAmount component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAmount getUnderlyingAmountComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAmount());
  }

  public void set(quickfix.field.NoUnderlyingAmounts value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAmounts get(quickfix.field.NoUnderlyingAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAmounts getNoUnderlyingAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAmounts());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAmounts() {
    return isSetField(984);
  }

public static class NoUnderlyingAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {985, 986, 987, 988, 0};

  public NoUnderlyingAmounts() {
    super(984, 985, ORDER);
  }

  public void set(quickfix.field.UnderlyingPayAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPayAmount get(quickfix.field.UnderlyingPayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPayAmount getUnderlyingPayAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPayAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPayAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPayAmount() {
    return isSetField(985);
  }

  public void set(quickfix.field.UnderlyingCollectAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCollectAmount get(quickfix.field.UnderlyingCollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCollectAmount getUnderlyingCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCollectAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCollectAmount() {
    return isSetField(986);
  }

  public void set(quickfix.field.UnderlyingSettlementDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementDate get(quickfix.field.UnderlyingSettlementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementDate getUnderlyingSettlementDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementDate());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementDate() {
    return isSetField(987);
  }

  public void set(quickfix.field.UnderlyingSettlementStatus value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementStatus get(quickfix.field.UnderlyingSettlementStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementStatus getUnderlyingSettlementStatus() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementStatus());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementStatus field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementStatus() {
    return isSetField(988);
  }
}
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

  public void set(quickfix.fixlatest.component.PositionQty component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PositionQty get(quickfix.fixlatest.component.PositionQty component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PositionQty getPositionQtyComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PositionQty());
  }

  public void set(quickfix.field.NoPositions value) {
    setField(value);
  }

  public quickfix.field.NoPositions get(quickfix.field.NoPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPositions getNoPositions() throws FieldNotFound {
    return get(new quickfix.field.NoPositions());
  }

  public boolean isSet(quickfix.field.NoPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoPositions() {
    return isSetField(702);
  }

public static class NoPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {703, 704, 705, 1654, 706, 976, 1836, 1835, 539, 0};

  public NoPositions() {
    super(702, 703, ORDER);
  }

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasure get(quickfix.field.PosQtyUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasure getPosQtyUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasure() {
    return isSetField(1836);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency get(quickfix.field.PosQtyUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency getPosQtyUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasureCurrency() {
    return isSetField(1835);
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

  public void set(quickfix.field.RegistStatus value) {
    setField(value);
  }

  public quickfix.field.RegistStatus get(quickfix.field.RegistStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegistStatus getRegistStatus() throws FieldNotFound {
    return get(new quickfix.field.RegistStatus());
  }

  public boolean isSet(quickfix.field.RegistStatus field) {
    return isSetField(field);
  }

  public boolean isSetRegistStatus() {
    return isSetField(506);
  }

  public void set(quickfix.field.DeliveryDate value) {
    setField(value);
  }

  public quickfix.field.DeliveryDate get(quickfix.field.DeliveryDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryDate getDeliveryDate() throws FieldNotFound {
    return get(new quickfix.field.DeliveryDate());
  }

  public boolean isSet(quickfix.field.DeliveryDate field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryDate() {
    return isSetField(743);
  }

  public void set(quickfix.field.ModelType value) {
    setField(value);
  }

  public quickfix.field.ModelType get(quickfix.field.ModelType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ModelType getModelType() throws FieldNotFound {
    return get(new quickfix.field.ModelType());
  }

  public boolean isSet(quickfix.field.ModelType field) {
    return isSetField(field);
  }

  public boolean isSetModelType() {
    return isSetField(1434);
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
}
