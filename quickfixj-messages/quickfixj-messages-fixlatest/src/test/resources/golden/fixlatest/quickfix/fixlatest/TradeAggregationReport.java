/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class TradeAggregationReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DX";

  public TradeAggregationReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public TradeAggregationReport (quickfix.field.TradeAggregationReportID tradeAggregationReportID, quickfix.field.TradeAggregationRequestStatus tradeAggregationRequestStatus) {
    this();
    setField(tradeAggregationReportID);
    setField(tradeAggregationRequestStatus);
  }

  public void set(quickfix.field.TradeAggregationReportID value) {
    setField(value);
  }

  public quickfix.field.TradeAggregationReportID get(quickfix.field.TradeAggregationReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAggregationReportID getTradeAggregationReportID() throws FieldNotFound {
    return get(new quickfix.field.TradeAggregationReportID());
  }

  public boolean isSet(quickfix.field.TradeAggregationReportID field) {
    return isSetField(field);
  }

  public boolean isSetTradeAggregationReportID() {
    return isSetField(2792);
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

  public void set(quickfix.field.TradeAggregationRequestStatus value) {
    setField(value);
  }

  public quickfix.field.TradeAggregationRequestStatus get(quickfix.field.TradeAggregationRequestStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAggregationRequestStatus getTradeAggregationRequestStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeAggregationRequestStatus());
  }

  public boolean isSet(quickfix.field.TradeAggregationRequestStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeAggregationRequestStatus() {
    return isSetField(2790);
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

  public void set(quickfix.field.TradeAggregationRejectReason value) {
    setField(value);
  }

  public quickfix.field.TradeAggregationRejectReason get(quickfix.field.TradeAggregationRejectReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAggregationRejectReason getTradeAggregationRejectReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAggregationRejectReason());
  }

  public boolean isSet(quickfix.field.TradeAggregationRejectReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAggregationRejectReason() {
    return isSetField(2791);
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

  public void set(quickfix.field.AvgSpotRate value) {
    setField(value);
  }

  public quickfix.field.AvgSpotRate get(quickfix.field.AvgSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgSpotRate getAvgSpotRate() throws FieldNotFound {
    return get(new quickfix.field.AvgSpotRate());
  }

  public boolean isSet(quickfix.field.AvgSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetAvgSpotRate() {
    return isSetField(2793);
  }

  public void set(quickfix.field.AvgForwardPoints value) {
    setField(value);
  }

  public quickfix.field.AvgForwardPoints get(quickfix.field.AvgForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AvgForwardPoints getAvgForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.AvgForwardPoints());
  }

  public boolean isSet(quickfix.field.AvgForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetAvgForwardPoints() {
    return isSetField(2794);
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
}
