/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class SecurityTypes extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "w";

  public SecurityTypes() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public SecurityTypes (quickfix.field.SecurityReqID securityReqID, quickfix.field.SecurityResponseID securityResponseID, quickfix.field.SecurityResponseType securityResponseType) {
    this();
    setField(securityReqID);
    setField(securityResponseID);
    setField(securityResponseType);
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

  public void set(quickfix.field.SecurityResponseID value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseID get(quickfix.field.SecurityResponseID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseID());
  }

  public boolean isSet(quickfix.field.SecurityResponseID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseID() {
    return isSetField(322);
  }

  public void set(quickfix.field.SecurityResponseType value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseType get(quickfix.field.SecurityResponseType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseType getSecurityResponseType() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseType());
  }

  public boolean isSet(quickfix.field.SecurityResponseType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseType() {
    return isSetField(323);
  }

  public void set(quickfix.field.TotNoSecurityTypes value) {
    setField(value);
  }

  public quickfix.field.TotNoSecurityTypes get(quickfix.field.TotNoSecurityTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNoSecurityTypes getTotNoSecurityTypes() throws FieldNotFound {
    return get(new quickfix.field.TotNoSecurityTypes());
  }

  public boolean isSet(quickfix.field.TotNoSecurityTypes field) {
    return isSetField(field);
  }

  public boolean isSetTotNoSecurityTypes() {
    return isSetField(557);
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

  public void set(quickfix.fixlatest.component.SecTypesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecTypesGrp get(quickfix.fixlatest.component.SecTypesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecTypesGrp getSecTypesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecTypesGrp());
  }

  public void set(quickfix.field.NoSecurityTypes value) {
    setField(value);
  }

  public quickfix.field.NoSecurityTypes get(quickfix.field.NoSecurityTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityTypes getNoSecurityTypes() throws FieldNotFound {
    return get(new quickfix.field.NoSecurityTypes());
  }

  public boolean isSet(quickfix.field.NoSecurityTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoSecurityTypes() {
    return isSetField(558);
  }

public static class NoSecurityTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {167, 762, 460, 461, 2891, 60, 0};

  public NoSecurityTypes() {
    super(558, 167, ORDER);
  }

  public void set(quickfix.field.SecurityType value) {
    setField(value);
  }

  public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
    return get(new quickfix.field.SecurityType());
  }

  public boolean isSet(quickfix.field.SecurityType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityType() {
    return isSetField(167);
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

  public void set(quickfix.field.Product value) {
    setField(value);
  }

  public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Product getProduct() throws FieldNotFound {
    return get(new quickfix.field.Product());
  }

  public boolean isSet(quickfix.field.Product field) {
    return isSetField(field);
  }

  public boolean isSetProduct() {
    return isSetField(460);
  }

  public void set(quickfix.field.CFICode value) {
    setField(value);
  }

  public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CFICode getCFICode() throws FieldNotFound {
    return get(new quickfix.field.CFICode());
  }

  public boolean isSet(quickfix.field.CFICode field) {
    return isSetField(field);
  }

  public boolean isSetCFICode() {
    return isSetField(461);
  }

  public void set(quickfix.field.UPICode value) {
    setField(value);
  }

  public quickfix.field.UPICode get(quickfix.field.UPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UPICode getUPICode() throws FieldNotFound {
    return get(new quickfix.field.UPICode());
  }

  public boolean isSet(quickfix.field.UPICode field) {
    return isSetField(field);
  }

  public boolean isSetUPICode() {
    return isSetField(2891);
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
