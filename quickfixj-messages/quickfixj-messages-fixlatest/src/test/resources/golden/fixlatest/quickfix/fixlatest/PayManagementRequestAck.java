/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PayManagementRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DZ";

  public PayManagementRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PayManagementRequestAck (quickfix.field.PayRequestID payRequestID, quickfix.field.PayRequestStatus payRequestStatus) {
    this();
    setField(payRequestID);
    setField(payRequestStatus);
  }

  public void set(quickfix.field.PayRequestID value) {
    setField(value);
  }

  public quickfix.field.PayRequestID get(quickfix.field.PayRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayRequestID getPayRequestID() throws FieldNotFound {
    return get(new quickfix.field.PayRequestID());
  }

  public boolean isSet(quickfix.field.PayRequestID field) {
    return isSetField(field);
  }

  public boolean isSetPayRequestID() {
    return isSetField(2812);
  }

  public void set(quickfix.field.PayRequestStatus value) {
    setField(value);
  }

  public quickfix.field.PayRequestStatus get(quickfix.field.PayRequestStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayRequestStatus getPayRequestStatus() throws FieldNotFound {
    return get(new quickfix.field.PayRequestStatus());
  }

  public boolean isSet(quickfix.field.PayRequestStatus field) {
    return isSetField(field);
  }

  public boolean isSetPayRequestStatus() {
    return isSetField(2813);
  }
}
