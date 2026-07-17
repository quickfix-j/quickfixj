/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class ApplicationMessageRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BX";

  public ApplicationMessageRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public ApplicationMessageRequestAck (quickfix.field.ApplResponseID applResponseID) {
    this();
    setField(applResponseID);
  }

  public void set(quickfix.field.ApplResponseID value) {
    setField(value);
  }

  public quickfix.field.ApplResponseID get(quickfix.field.ApplResponseID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplResponseID getApplResponseID() throws FieldNotFound {
    return get(new quickfix.field.ApplResponseID());
  }

  public boolean isSet(quickfix.field.ApplResponseID field) {
    return isSetField(field);
  }

  public boolean isSetApplResponseID() {
    return isSetField(1353);
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

  public void set(quickfix.field.ApplReqType value) {
    setField(value);
  }

  public quickfix.field.ApplReqType get(quickfix.field.ApplReqType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplReqType getApplReqType() throws FieldNotFound {
    return get(new quickfix.field.ApplReqType());
  }

  public boolean isSet(quickfix.field.ApplReqType field) {
    return isSetField(field);
  }

  public boolean isSetApplReqType() {
    return isSetField(1347);
  }

  public void set(quickfix.field.ApplResponseType value) {
    setField(value);
  }

  public quickfix.field.ApplResponseType get(quickfix.field.ApplResponseType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplResponseType getApplResponseType() throws FieldNotFound {
    return get(new quickfix.field.ApplResponseType());
  }

  public boolean isSet(quickfix.field.ApplResponseType field) {
    return isSetField(field);
  }

  public boolean isSetApplResponseType() {
    return isSetField(1348);
  }

  public void set(quickfix.field.ApplTotalMessageCount value) {
    setField(value);
  }

  public quickfix.field.ApplTotalMessageCount get(quickfix.field.ApplTotalMessageCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplTotalMessageCount getApplTotalMessageCount() throws FieldNotFound {
    return get(new quickfix.field.ApplTotalMessageCount());
  }

  public boolean isSet(quickfix.field.ApplTotalMessageCount field) {
    return isSetField(field);
  }

  public boolean isSetApplTotalMessageCount() {
    return isSetField(1349);
  }

  public void set(quickfix.fixlatest.component.ApplIDRequestAckGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ApplIDRequestAckGrp get(quickfix.fixlatest.component.ApplIDRequestAckGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ApplIDRequestAckGrp getApplIDRequestAckGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ApplIDRequestAckGrp());
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
  private static final int[]  ORDER = {1355, 1433, 1182, 1183, 1357, 1354, 539, 0};

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

  public void set(quickfix.field.RefApplReqID value) {
    setField(value);
  }

  public quickfix.field.RefApplReqID get(quickfix.field.RefApplReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefApplReqID getRefApplReqID() throws FieldNotFound {
    return get(new quickfix.field.RefApplReqID());
  }

  public boolean isSet(quickfix.field.RefApplReqID field) {
    return isSetField(field);
  }

  public boolean isSetRefApplReqID() {
    return isSetField(1433);
  }

  public void set(quickfix.field.ApplBegSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplBegSeqNum get(quickfix.field.ApplBegSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplBegSeqNum getApplBegSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplBegSeqNum());
  }

  public boolean isSet(quickfix.field.ApplBegSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplBegSeqNum() {
    return isSetField(1182);
  }

  public void set(quickfix.field.ApplEndSeqNum value) {
    setField(value);
  }

  public quickfix.field.ApplEndSeqNum get(quickfix.field.ApplEndSeqNum value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplEndSeqNum getApplEndSeqNum() throws FieldNotFound {
    return get(new quickfix.field.ApplEndSeqNum());
  }

  public boolean isSet(quickfix.field.ApplEndSeqNum field) {
    return isSetField(field);
  }

  public boolean isSetApplEndSeqNum() {
    return isSetField(1183);
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

  public void set(quickfix.field.ApplResponseError value) {
    setField(value);
  }

  public quickfix.field.ApplResponseError get(quickfix.field.ApplResponseError value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplResponseError getApplResponseError() throws FieldNotFound {
    return get(new quickfix.field.ApplResponseError());
  }

  public boolean isSet(quickfix.field.ApplResponseError field) {
    return isSetField(field);
  }

  public boolean isSetApplResponseError() {
    return isSetField(1354);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}
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
