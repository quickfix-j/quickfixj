/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class AllocationInstructionAlertRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DV";

  public AllocationInstructionAlertRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public AllocationInstructionAlertRequestAck (quickfix.field.AllocRequestID allocRequestID, quickfix.field.AllocRequestStatus allocRequestStatus) {
    this();
    setField(allocRequestID);
    setField(allocRequestStatus);
  }

  public void set(quickfix.field.AllocRequestID value) {
    setField(value);
  }

  public quickfix.field.AllocRequestID get(quickfix.field.AllocRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRequestID getAllocRequestID() throws FieldNotFound {
    return get(new quickfix.field.AllocRequestID());
  }

  public boolean isSet(quickfix.field.AllocRequestID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRequestID() {
    return isSetField(2758);
  }

  public void set(quickfix.field.AllocRequestStatus value) {
    setField(value);
  }

  public quickfix.field.AllocRequestStatus get(quickfix.field.AllocRequestStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRequestStatus getAllocRequestStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocRequestStatus());
  }

  public boolean isSet(quickfix.field.AllocRequestStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocRequestStatus() {
    return isSetField(2768);
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
