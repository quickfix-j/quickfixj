/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class TradeMatchReportAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DD";

  public TradeMatchReportAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public TradeMatchReportAck (quickfix.field.TrdMatchID trdMatchID, quickfix.field.TradeMatchAckStatus tradeMatchAckStatus) {
    this();
    setField(trdMatchID);
    setField(tradeMatchAckStatus);
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

  public void set(quickfix.field.TradeMatchAckStatus value) {
    setField(value);
  }

  public quickfix.field.TradeMatchAckStatus get(quickfix.field.TradeMatchAckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeMatchAckStatus getTradeMatchAckStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeMatchAckStatus());
  }

  public boolean isSet(quickfix.field.TradeMatchAckStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeMatchAckStatus() {
    return isSetField(1896);
  }

  public void set(quickfix.field.TradeMatchRejectReason value) {
    setField(value);
  }

  public quickfix.field.TradeMatchRejectReason get(quickfix.field.TradeMatchRejectReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeMatchRejectReason getTradeMatchRejectReason() throws FieldNotFound {
    return get(new quickfix.field.TradeMatchRejectReason());
  }

  public boolean isSet(quickfix.field.TradeMatchRejectReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeMatchRejectReason() {
    return isSetField(1897);
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
