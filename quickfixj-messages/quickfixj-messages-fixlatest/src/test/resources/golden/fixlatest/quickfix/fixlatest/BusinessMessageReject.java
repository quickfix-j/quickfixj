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
}
