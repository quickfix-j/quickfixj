/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDataReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DR";

  public MarketDataReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarketDataReport (quickfix.field.MDReportEvent mDReportEvent, quickfix.field.MDReportCount mDReportCount) {
    this();
    setField(mDReportEvent);
    setField(mDReportCount);
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

  public void set(quickfix.field.MDReportID value) {
    setField(value);
  }

  public quickfix.field.MDReportID get(quickfix.field.MDReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReportID getMDReportID() throws FieldNotFound {
    return get(new quickfix.field.MDReportID());
  }

  public boolean isSet(quickfix.field.MDReportID field) {
    return isSetField(field);
  }

  public boolean isSetMDReportID() {
    return isSetField(963);
  }

  public void set(quickfix.field.MDReportEvent value) {
    setField(value);
  }

  public quickfix.field.MDReportEvent get(quickfix.field.MDReportEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReportEvent getMDReportEvent() throws FieldNotFound {
    return get(new quickfix.field.MDReportEvent());
  }

  public boolean isSet(quickfix.field.MDReportEvent field) {
    return isSetField(field);
  }

  public boolean isSetMDReportEvent() {
    return isSetField(2535);
  }

  public void set(quickfix.field.MDReportCount value) {
    setField(value);
  }

  public quickfix.field.MDReportCount get(quickfix.field.MDReportCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReportCount getMDReportCount() throws FieldNotFound {
    return get(new quickfix.field.MDReportCount());
  }

  public boolean isSet(quickfix.field.MDReportCount field) {
    return isSetField(field);
  }

  public boolean isSetMDReportCount() {
    return isSetField(2536);
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

  public void set(quickfix.field.TotNoMarketSegmentReports value) {
    setField(value);
  }

  public quickfix.field.TotNoMarketSegmentReports get(quickfix.field.TotNoMarketSegmentReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoMarketSegmentReports getTotNoMarketSegmentReports() throws FieldNotFound {
    return get(new quickfix.field.TotNoMarketSegmentReports());
  }

  public boolean isSet(quickfix.field.TotNoMarketSegmentReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNoMarketSegmentReports() {
    return isSetField(2537);
  }

  public void set(quickfix.field.TotNoInstrumentReports value) {
    setField(value);
  }

  public quickfix.field.TotNoInstrumentReports get(quickfix.field.TotNoInstrumentReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoInstrumentReports getTotNoInstrumentReports() throws FieldNotFound {
    return get(new quickfix.field.TotNoInstrumentReports());
  }

  public boolean isSet(quickfix.field.TotNoInstrumentReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNoInstrumentReports() {
    return isSetField(2538);
  }

  public void set(quickfix.field.TotNoPartyDetailReports value) {
    setField(value);
  }

  public quickfix.field.TotNoPartyDetailReports get(quickfix.field.TotNoPartyDetailReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoPartyDetailReports getTotNoPartyDetailReports() throws FieldNotFound {
    return get(new quickfix.field.TotNoPartyDetailReports());
  }

  public boolean isSet(quickfix.field.TotNoPartyDetailReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNoPartyDetailReports() {
    return isSetField(2539);
  }

  public void set(quickfix.field.TotNoEntitlementReports value) {
    setField(value);
  }

  public quickfix.field.TotNoEntitlementReports get(quickfix.field.TotNoEntitlementReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoEntitlementReports getTotNoEntitlementReports() throws FieldNotFound {
    return get(new quickfix.field.TotNoEntitlementReports());
  }

  public boolean isSet(quickfix.field.TotNoEntitlementReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNoEntitlementReports() {
    return isSetField(2540);
  }

  public void set(quickfix.field.TotNoRiskLimitReports value) {
    setField(value);
  }

  public quickfix.field.TotNoRiskLimitReports get(quickfix.field.TotNoRiskLimitReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoRiskLimitReports getTotNoRiskLimitReports() throws FieldNotFound {
    return get(new quickfix.field.TotNoRiskLimitReports());
  }

  public boolean isSet(quickfix.field.TotNoRiskLimitReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNoRiskLimitReports() {
    return isSetField(2541);
  }
}
