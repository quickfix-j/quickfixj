/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class CrossRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DT";

  public CrossRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public CrossRequestAck (quickfix.field.CrossRequestID crossRequestID) {
    this();
    setField(crossRequestID);
  }

  public void set(quickfix.field.CrossRequestID value) {
    setField(value);
  }

  public quickfix.field.CrossRequestID get(quickfix.field.CrossRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossRequestID getCrossRequestID() throws FieldNotFound {
    return get(new quickfix.field.CrossRequestID());
  }

  public boolean isSet(quickfix.field.CrossRequestID field) {
    return isSetField(field);
  }

  public boolean isSetCrossRequestID() {
    return isSetField(2672);
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

  public void set(quickfix.field.OrderQty value) {
    setField(value);
  }

  public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
    return get(new quickfix.field.OrderQty());
  }

  public boolean isSet(quickfix.field.OrderQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty() {
    return isSetField(38);
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
}
