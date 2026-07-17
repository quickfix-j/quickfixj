/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class DerivativeSecurityListRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "z";

  public DerivativeSecurityListRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public DerivativeSecurityListRequest (quickfix.field.SecurityReqID securityReqID, quickfix.field.SecurityListRequestType securityListRequestType) {
    this();
    setField(securityReqID);
    setField(securityListRequestType);
  }

  public void set(quickfix.field.SecurityReqID value) {
    setField(value);
  }

  public quickfix.field.SecurityReqID get(quickfix.field.SecurityReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
    return get(new quickfix.field.SecurityReqID());
  }

  public boolean isSet(quickfix.field.SecurityReqID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityReqID() {
    return isSetField(320);
  }

  public void set(quickfix.field.SecurityListRequestType value) {
    setField(value);
  }

  public quickfix.field.SecurityListRequestType get(quickfix.field.SecurityListRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityListRequestType getSecurityListRequestType() throws FieldNotFound {
    return get(new quickfix.field.SecurityListRequestType());
  }

  public boolean isSet(quickfix.field.SecurityListRequestType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityListRequestType() {
    return isSetField(559);
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

  public void set(quickfix.fixlatest.component.DerivativeInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrument get(quickfix.fixlatest.component.DerivativeInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrument getDerivativeInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrument());
  }

  public void set(quickfix.field.SecuritySubType value) {
    setField(value);
  }

  public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.SecuritySubType());
  }

  public boolean isSet(quickfix.field.SecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetSecuritySubType() {
    return isSetField(762);
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
}
