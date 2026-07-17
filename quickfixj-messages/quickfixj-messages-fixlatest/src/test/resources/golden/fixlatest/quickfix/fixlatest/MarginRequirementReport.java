/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarginRequirementReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CJ";

  public MarginRequirementReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarginRequirementReport (quickfix.field.MarginReqmtRptID marginReqmtRptID, quickfix.field.MarginReqmtRptType marginReqmtRptType) {
    this();
    setField(marginReqmtRptID);
    setField(marginReqmtRptType);
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

  public void set(quickfix.field.MarginReqmtRptID value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtRptID get(quickfix.field.MarginReqmtRptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtRptID getMarginReqmtRptID() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtRptID());
  }

  public boolean isSet(quickfix.field.MarginReqmtRptID field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtRptID() {
    return isSetField(1642);
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

  public void set(quickfix.field.MarginReqmtRptType value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtRptType get(quickfix.field.MarginReqmtRptType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtRptType getMarginReqmtRptType() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtRptType());
  }

  public boolean isSet(quickfix.field.MarginReqmtRptType field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtRptType() {
    return isSetField(1638);
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

  public void set(quickfix.field.MarginClass value) {
    setField(value);
  }

  public quickfix.field.MarginClass get(quickfix.field.MarginClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginClass getMarginClass() throws FieldNotFound {
    return get(new quickfix.field.MarginClass());
  }

  public boolean isSet(quickfix.field.MarginClass field) {
    return isSetField(field);
  }

  public boolean isSetMarginClass() {
    return isSetField(1639);
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

  public void set(quickfix.fixlatest.component.MarginAmount component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarginAmount get(quickfix.fixlatest.component.MarginAmount component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarginAmount getMarginAmountComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarginAmount());
  }

  public void set(quickfix.field.NoMarginAmt value) {
    setField(value);
  }

  public quickfix.field.NoMarginAmt get(quickfix.field.NoMarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarginAmt getNoMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.NoMarginAmt());
  }

  public boolean isSet(quickfix.field.NoMarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoMarginAmt() {
    return isSetField(1643);
  }

public static class NoMarginAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1645, 1644, 1646, 2088, 2089, 1714, 1715, 2851, 0};

  public NoMarginAmt() {
    super(1643, 1645, ORDER);
  }

  public void set(quickfix.field.MarginAmt value) {
    setField(value);
  }

  public quickfix.field.MarginAmt get(quickfix.field.MarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmt getMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.MarginAmt());
  }

  public boolean isSet(quickfix.field.MarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmt() {
    return isSetField(1645);
  }

  public void set(quickfix.field.MarginAmtType value) {
    setField(value);
  }

  public quickfix.field.MarginAmtType get(quickfix.field.MarginAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtType getMarginAmtType() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtType());
  }

  public boolean isSet(quickfix.field.MarginAmtType field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtType() {
    return isSetField(1644);
  }

  public void set(quickfix.field.MarginAmtCcy value) {
    setField(value);
  }

  public quickfix.field.MarginAmtCcy get(quickfix.field.MarginAmtCcy value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtCcy getMarginAmtCcy() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtCcy());
  }

  public boolean isSet(quickfix.field.MarginAmtCcy field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtCcy() {
    return isSetField(1646);
  }

  public void set(quickfix.field.MarginAmtFXRate value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRate get(quickfix.field.MarginAmtFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRate getMarginAmtFXRate() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRate());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRate field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRate() {
    return isSetField(2088);
  }

  public void set(quickfix.field.MarginAmtFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRateCalc get(quickfix.field.MarginAmtFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRateCalc getMarginAmtFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRateCalc());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRateCalc() {
    return isSetField(2089);
  }

  public void set(quickfix.field.MarginAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketSegmentID get(quickfix.field.MarginAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketSegmentID getMarginAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketSegmentID() {
    return isSetField(1714);
  }

  public void set(quickfix.field.MarginAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketID get(quickfix.field.MarginAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketID getMarginAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketID() {
    return isSetField(1715);
  }

  public void set(quickfix.field.MarginDirection value) {
    setField(value);
  }

  public quickfix.field.MarginDirection get(quickfix.field.MarginDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginDirection getMarginDirection() throws FieldNotFound {
    return get(new quickfix.field.MarginDirection());
  }

  public boolean isSet(quickfix.field.MarginDirection field) {
    return isSetField(field);
  }

  public boolean isSetMarginDirection() {
    return isSetField(2851);
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
