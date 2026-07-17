/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class StreamAssignmentReportACK extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CE";

  public StreamAssignmentReportACK() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public StreamAssignmentReportACK (quickfix.field.StreamAsgnAckType streamAsgnAckType, quickfix.field.StreamAsgnRptID streamAsgnRptID) {
    this();
    setField(streamAsgnAckType);
    setField(streamAsgnRptID);
  }

  public void set(quickfix.field.StreamAsgnAckType value) {
    setField(value);
  }

  public quickfix.field.StreamAsgnAckType get(quickfix.field.StreamAsgnAckType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAsgnAckType getStreamAsgnAckType() throws FieldNotFound {
    return get(new quickfix.field.StreamAsgnAckType());
  }

  public boolean isSet(quickfix.field.StreamAsgnAckType field) {
    return isSetField(field);
  }

  public boolean isSetStreamAsgnAckType() {
    return isSetField(1503);
  }

  public void set(quickfix.field.StreamAsgnRptID value) {
    setField(value);
  }

  public quickfix.field.StreamAsgnRptID get(quickfix.field.StreamAsgnRptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAsgnRptID getStreamAsgnRptID() throws FieldNotFound {
    return get(new quickfix.field.StreamAsgnRptID());
  }

  public boolean isSet(quickfix.field.StreamAsgnRptID field) {
    return isSetField(field);
  }

  public boolean isSetStreamAsgnRptID() {
    return isSetField(1501);
  }

  public void set(quickfix.field.StreamAsgnRejReason value) {
    setField(value);
  }

  public quickfix.field.StreamAsgnRejReason get(quickfix.field.StreamAsgnRejReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAsgnRejReason getStreamAsgnRejReason() throws FieldNotFound {
    return get(new quickfix.field.StreamAsgnRejReason());
  }

  public boolean isSet(quickfix.field.StreamAsgnRejReason field) {
    return isSetField(field);
  }

  public boolean isSetStreamAsgnRejReason() {
    return isSetField(1502);
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
