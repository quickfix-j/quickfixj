/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PayManagementReportAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "EB";

  public PayManagementReportAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PayManagementReportAck (quickfix.field.PayReportID payReportID, quickfix.field.PayReportStatus payReportStatus) {
    this();
    setField(payReportID);
    setField(payReportStatus);
  }

  public void set(quickfix.field.PayReportID value) {
    setField(value);
  }

  public quickfix.field.PayReportID get(quickfix.field.PayReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayReportID getPayReportID() throws FieldNotFound {
    return get(new quickfix.field.PayReportID());
  }

  public boolean isSet(quickfix.field.PayReportID field) {
    return isSetField(field);
  }

  public boolean isSetPayReportID() {
    return isSetField(2799);
  }

  public void set(quickfix.field.PayReportStatus value) {
    setField(value);
  }

  public quickfix.field.PayReportStatus get(quickfix.field.PayReportStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayReportStatus getPayReportStatus() throws FieldNotFound {
    return get(new quickfix.field.PayReportStatus());
  }

  public boolean isSet(quickfix.field.PayReportStatus field) {
    return isSetField(field);
  }

  public boolean isSetPayReportStatus() {
    return isSetField(2806);
  }

  public void set(quickfix.field.PayDisputeReason value) {
    setField(value);
  }

  public quickfix.field.PayDisputeReason get(quickfix.field.PayDisputeReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayDisputeReason getPayDisputeReason() throws FieldNotFound {
    return get(new quickfix.field.PayDisputeReason());
  }

  public boolean isSet(quickfix.field.PayDisputeReason field) {
    return isSetField(field);
  }

  public boolean isSetPayDisputeReason() {
    return isSetField(2800);
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
