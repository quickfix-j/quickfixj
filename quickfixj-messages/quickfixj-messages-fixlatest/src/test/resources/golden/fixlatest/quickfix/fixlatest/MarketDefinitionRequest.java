/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDefinitionRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BT";

  public MarketDefinitionRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarketDefinitionRequest (quickfix.field.MarketReqID marketReqID, quickfix.field.SubscriptionRequestType subscriptionRequestType) {
    this();
    setField(marketReqID);
    setField(subscriptionRequestType);
  }

  public void set(quickfix.field.MarketReqID value) {
    setField(value);
  }

  public quickfix.field.MarketReqID get(quickfix.field.MarketReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketReqID getMarketReqID() throws FieldNotFound {
    return get(new quickfix.field.MarketReqID());
  }

  public boolean isSet(quickfix.field.MarketReqID field) {
    return isSetField(field);
  }

  public boolean isSetMarketReqID() {
    return isSetField(1393);
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

  public void set(quickfix.field.ParentMktSegmID value) {
    setField(value);
  }

  public quickfix.field.ParentMktSegmID get(quickfix.field.ParentMktSegmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentMktSegmID getParentMktSegmID() throws FieldNotFound {
    return get(new quickfix.field.ParentMktSegmID());
  }

  public boolean isSet(quickfix.field.ParentMktSegmID field) {
    return isSetField(field);
  }

  public boolean isSetParentMktSegmID() {
    return isSetField(1325);
  }
}
