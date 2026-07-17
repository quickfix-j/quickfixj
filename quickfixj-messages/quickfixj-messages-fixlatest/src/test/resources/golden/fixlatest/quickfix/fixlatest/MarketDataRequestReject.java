/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDataRequestReject extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "Y";

  public MarketDataRequestReject() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarketDataRequestReject (quickfix.field.MDReqID mDReqID) {
    this();
    setField(mDReqID);
  }

  public void set(quickfix.field.MDReqID value) {
    setField(value);
  }

  public quickfix.field.MDReqID get(quickfix.field.MDReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReqID getMDReqID() throws FieldNotFound {
    return get(new quickfix.field.MDReqID());
  }

  public boolean isSet(quickfix.field.MDReqID field) {
    return isSetField(field);
  }

  public boolean isSetMDReqID() {
    return isSetField(262);
  }

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
  }

  public void set(quickfix.field.NoPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs() {
    return isSetField(802);
  }

public static class NoPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

  public NoPartySubIDs() {
    super(802, 523, ORDER);
  }

  public void set(quickfix.field.PartySubID value) {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PartySubID());
  }

  public boolean isSet(quickfix.field.PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPartySubID() {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartySubIDType());
  }

  public boolean isSet(quickfix.field.PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType() {
    return isSetField(803);
  }
}
}

  public void set(quickfix.field.MDReqRejReason value) {
    setField(value);
  }

  public quickfix.field.MDReqRejReason get(quickfix.field.MDReqRejReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDReqRejReason getMDReqRejReason() throws FieldNotFound {
    return get(new quickfix.field.MDReqRejReason());
  }

  public boolean isSet(quickfix.field.MDReqRejReason field) {
    return isSetField(field);
  }

  public boolean isSetMDReqRejReason() {
    return isSetField(281);
  }

  public void set(quickfix.fixlatest.component.MDRjctGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDRjctGrp get(quickfix.fixlatest.component.MDRjctGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDRjctGrp getMDRjctGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDRjctGrp());
  }

  public void set(quickfix.field.NoAltMDSource value) {
    setField(value);
  }

  public quickfix.field.NoAltMDSource get(quickfix.field.NoAltMDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAltMDSource getNoAltMDSource() throws FieldNotFound {
    return get(new quickfix.field.NoAltMDSource());
  }

  public boolean isSet(quickfix.field.NoAltMDSource field) {
    return isSetField(field);
  }

  public boolean isSetNoAltMDSource() {
    return isSetField(816);
  }

public static class NoAltMDSource extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {817, 0};

  public NoAltMDSource() {
    super(816, 817, ORDER);
  }

  public void set(quickfix.field.AltMDSourceID value) {
    setField(value);
  }

  public quickfix.field.AltMDSourceID get(quickfix.field.AltMDSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
    return get(new quickfix.field.AltMDSourceID());
  }

  public boolean isSet(quickfix.field.AltMDSourceID field) {
    return isSetField(field);
  }

  public boolean isSetAltMDSourceID() {
    return isSetField(817);
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
