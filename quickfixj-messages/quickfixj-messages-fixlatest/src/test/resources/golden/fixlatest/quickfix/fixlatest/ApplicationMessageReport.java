/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class ApplicationMessageReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BY";

  public ApplicationMessageReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public ApplicationMessageReport (quickfix.field.ApplReportID applReportID, quickfix.field.ApplReportType applReportType) {
    this();
    setField(applReportID);
    setField(applReportType);
  }

  public void set(quickfix.field.ApplReportID value) {
    setField(value);
  }

  public quickfix.field.ApplReportID get(quickfix.field.ApplReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplReportID getApplReportID() throws FieldNotFound {
    return get(new quickfix.field.ApplReportID());
  }

  public boolean isSet(quickfix.field.ApplReportID field) {
    return isSetField(field);
  }

  public boolean isSetApplReportID() {
    return isSetField(1356);
  }

  public void set(quickfix.field.ApplReqID value) {
    setField(value);
  }

  public quickfix.field.ApplReqID get(quickfix.field.ApplReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplReqID getApplReqID() throws FieldNotFound {
    return get(new quickfix.field.ApplReqID());
  }

  public boolean isSet(quickfix.field.ApplReqID field) {
    return isSetField(field);
  }

  public boolean isSetApplReqID() {
    return isSetField(1346);
  }

  public void set(quickfix.field.ApplReportType value) {
    setField(value);
  }

  public quickfix.field.ApplReportType get(quickfix.field.ApplReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplReportType getApplReportType() throws FieldNotFound {
    return get(new quickfix.field.ApplReportType());
  }

  public boolean isSet(quickfix.field.ApplReportType field) {
    return isSetField(field);
  }

  public boolean isSetApplReportType() {
    return isSetField(1426);
  }

  public void set(quickfix.fixlatest.component.ApplIDReportGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ApplIDReportGrp get(quickfix.fixlatest.component.ApplIDReportGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ApplIDReportGrp getApplIDReportGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ApplIDReportGrp());
  }

  public void set(quickfix.field.NoApplIDs value) {
    setField(value);
  }

  public quickfix.field.NoApplIDs get(quickfix.field.NoApplIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoApplIDs getNoApplIDs() throws FieldNotFound {
    return get(new quickfix.field.NoApplIDs());
  }

  public boolean isSet(quickfix.field.NoApplIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoApplIDs() {
    return isSetField(1351);
  }

public static class NoApplIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1355, 1399, 1357, 0};

  public NoApplIDs() {
    super(1351, 1355, ORDER);
  }

  public void set(quickfix.field.RefApplID value) {
    setField(value);
  }

  public quickfix.field.RefApplID get(quickfix.field.RefApplID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplID getRefApplID() throws FieldNotFound {
    return get(new quickfix.field.RefApplID());
  }

  public boolean isSet(quickfix.field.RefApplID field) {
    return isSetField(field);
  }

  public boolean isSetRefApplID() {
    return isSetField(1355);
  }

  public void set(quickfix.field.ApplNewSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplNewSeqNum get(quickfix.field.ApplNewSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplNewSeqNum getApplNewSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplNewSeqNum());
  }

  public boolean isSet(quickfix.field.ApplNewSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplNewSeqNum() {
    return isSetField(1399);
  }

  public void set(quickfix.field.RefApplLastSeqNum value) {
    setField(value);
  }

  public quickfix.field.RefApplLastSeqNum get(quickfix.field.RefApplLastSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplLastSeqNum getRefApplLastSeqNum() throws FieldNotFound {
    return get(new quickfix.field.RefApplLastSeqNum());
  }

  public boolean isSet(quickfix.field.RefApplLastSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetRefApplLastSeqNum() {
    return isSetField(1357);
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
}
