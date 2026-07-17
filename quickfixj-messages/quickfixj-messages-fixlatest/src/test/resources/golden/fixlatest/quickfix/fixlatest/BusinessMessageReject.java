/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class BusinessMessageReject extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "j";

  public BusinessMessageReject() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public BusinessMessageReject (quickfix.field.RefMsgType refMsgType, quickfix.field.BusinessRejectReason businessRejectReason) {
    this();
    setField(refMsgType);
    setField(businessRejectReason);
  }

  public void set(quickfix.field.RefSeqNum value) {
    setField(value);
  }

  public quickfix.field.RefSeqNum get(quickfix.field.RefSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
    return get(new quickfix.field.RefSeqNum());
  }

  public boolean isSet(quickfix.field.RefSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetRefSeqNum() {
    return isSetField(45);
  }

  public void set(quickfix.field.RefMsgType value) {
    setField(value);
  }

  public quickfix.field.RefMsgType get(quickfix.field.RefMsgType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefMsgType getRefMsgType() throws FieldNotFound {
    return get(new quickfix.field.RefMsgType());
  }

  public boolean isSet(quickfix.field.RefMsgType field) {
    return isSetField(field);
  }

  public boolean isSetRefMsgType() {
    return isSetField(372);
  }

  public void set(quickfix.field.RefApplVerID value) {
    setField(value);
  }

  public quickfix.field.RefApplVerID get(quickfix.field.RefApplVerID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplVerID getRefApplVerID() throws FieldNotFound {
    return get(new quickfix.field.RefApplVerID());
  }

  public boolean isSet(quickfix.field.RefApplVerID field) {
    return isSetField(field);
  }

  public boolean isSetRefApplVerID() {
    return isSetField(1130);
  }

  public void set(quickfix.field.RefApplExtID value) {
    setField(value);
  }

  public quickfix.field.RefApplExtID get(quickfix.field.RefApplExtID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplExtID getRefApplExtID() throws FieldNotFound {
    return get(new quickfix.field.RefApplExtID());
  }

  public boolean isSet(quickfix.field.RefApplExtID field) {
    return isSetField(field);
  }

  public boolean isSetRefApplExtID() {
    return isSetField(1406);
  }

  public void set(quickfix.field.RefCstmApplVerID value) {
    setField(value);
  }

  public quickfix.field.RefCstmApplVerID get(quickfix.field.RefCstmApplVerID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefCstmApplVerID getRefCstmApplVerID() throws FieldNotFound {
    return get(new quickfix.field.RefCstmApplVerID());
  }

  public boolean isSet(quickfix.field.RefCstmApplVerID field) {
    return isSetField(field);
  }

  public boolean isSetRefCstmApplVerID() {
    return isSetField(1131);
  }

  public void set(quickfix.field.BusinessRejectRefID value) {
    setField(value);
  }

  public quickfix.field.BusinessRejectRefID get(quickfix.field.BusinessRejectRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound {
    return get(new quickfix.field.BusinessRejectRefID());
  }

  public boolean isSet(quickfix.field.BusinessRejectRefID field) {
    return isSetField(field);
  }

  public boolean isSetBusinessRejectRefID() {
    return isSetField(379);
  }

  public void set(quickfix.field.BusinessRejectReason value) {
    setField(value);
  }

  public quickfix.field.BusinessRejectReason get(quickfix.field.BusinessRejectReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound {
    return get(new quickfix.field.BusinessRejectReason());
  }

  public boolean isSet(quickfix.field.BusinessRejectReason field) {
    return isSetField(field);
  }

  public boolean isSetBusinessRejectReason() {
    return isSetField(380);
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
