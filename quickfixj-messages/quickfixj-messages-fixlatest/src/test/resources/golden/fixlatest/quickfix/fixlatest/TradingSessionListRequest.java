/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class TradingSessionListRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BI";

  public TradingSessionListRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public TradingSessionListRequest (quickfix.field.TradSesReqID tradSesReqID, quickfix.field.SubscriptionRequestType subscriptionRequestType) {
    this();
    setField(tradSesReqID);
    setField(subscriptionRequestType);
  }

  public void set(quickfix.field.TradSesReqID value) {
    setField(value);
  }

  public quickfix.field.TradSesReqID get(quickfix.field.TradSesReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
    return get(new quickfix.field.TradSesReqID());
  }

  public boolean isSet(quickfix.field.TradSesReqID field) {
    return isSetField(field);
  }

  public boolean isSetTradSesReqID() {
    return isSetField(335);
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

  public void set(quickfix.field.SecurityExchange value) {
    setField(value);
  }

  public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.SecurityExchange());
  }

  public boolean isSet(quickfix.field.SecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetSecurityExchange() {
    return isSetField(207);
  }

  public void set(quickfix.field.TradSesMethod value) {
    setField(value);
  }

  public quickfix.field.TradSesMethod get(quickfix.field.TradSesMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
    return get(new quickfix.field.TradSesMethod());
  }

  public boolean isSet(quickfix.field.TradSesMethod field) {
    return isSetField(field);
  }

  public boolean isSetTradSesMethod() {
    return isSetField(338);
  }

  public void set(quickfix.field.TradSesMode value) {
    setField(value);
  }

  public quickfix.field.TradSesMode get(quickfix.field.TradSesMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesMode getTradSesMode() throws FieldNotFound {
    return get(new quickfix.field.TradSesMode());
  }

  public boolean isSet(quickfix.field.TradSesMode field) {
    return isSetField(field);
  }

  public boolean isSetTradSesMode() {
    return isSetField(339);
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
