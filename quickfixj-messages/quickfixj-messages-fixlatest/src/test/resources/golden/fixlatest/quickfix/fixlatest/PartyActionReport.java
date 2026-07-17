/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PartyActionReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DI";

  public PartyActionReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PartyActionReport (quickfix.field.PartyActionReportID partyActionReportID, quickfix.field.PartyActionType partyActionType, quickfix.field.PartyActionResponse partyActionResponse) {
    this();
    setField(partyActionReportID);
    setField(partyActionType);
    setField(partyActionResponse);
  }

  public void set(quickfix.field.EffectiveBusinessDate value) {
    setField(value);
  }

  public quickfix.field.EffectiveBusinessDate get(quickfix.field.EffectiveBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EffectiveBusinessDate getEffectiveBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.EffectiveBusinessDate());
  }

  public boolean isSet(quickfix.field.EffectiveBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetEffectiveBusinessDate() {
    return isSetField(2400);
  }

  public void set(quickfix.field.PartyActionRequestID value) {
    setField(value);
  }

  public quickfix.field.PartyActionRequestID get(quickfix.field.PartyActionRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyActionRequestID getPartyActionRequestID() throws FieldNotFound {
    return get(new quickfix.field.PartyActionRequestID());
  }

  public boolean isSet(quickfix.field.PartyActionRequestID field) {
    return isSetField(field);
  }

  public boolean isSetPartyActionRequestID() {
    return isSetField(2328);
  }

  public void set(quickfix.field.PartyActionReportID value) {
    setField(value);
  }

  public quickfix.field.PartyActionReportID get(quickfix.field.PartyActionReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyActionReportID getPartyActionReportID() throws FieldNotFound {
    return get(new quickfix.field.PartyActionReportID());
  }

  public boolean isSet(quickfix.field.PartyActionReportID field) {
    return isSetField(field);
  }

  public boolean isSetPartyActionReportID() {
    return isSetField(2331);
  }

  public void set(quickfix.field.PartyActionType value) {
    setField(value);
  }

  public quickfix.field.PartyActionType get(quickfix.field.PartyActionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyActionType getPartyActionType() throws FieldNotFound {
    return get(new quickfix.field.PartyActionType());
  }

  public boolean isSet(quickfix.field.PartyActionType field) {
    return isSetField(field);
  }

  public boolean isSetPartyActionType() {
    return isSetField(2329);
  }

  public void set(quickfix.field.PartyActionResponse value) {
    setField(value);
  }

  public quickfix.field.PartyActionResponse get(quickfix.field.PartyActionResponse value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyActionResponse getPartyActionResponse() throws FieldNotFound {
    return get(new quickfix.field.PartyActionResponse());
  }

  public boolean isSet(quickfix.field.PartyActionResponse field) {
    return isSetField(field);
  }

  public boolean isSetPartyActionResponse() {
    return isSetField(2332);
  }

  public void set(quickfix.field.PartyActionRejectReason value) {
    setField(value);
  }

  public quickfix.field.PartyActionRejectReason get(quickfix.field.PartyActionRejectReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyActionRejectReason getPartyActionRejectReason() throws FieldNotFound {
    return get(new quickfix.field.PartyActionRejectReason());
  }

  public boolean isSet(quickfix.field.PartyActionRejectReason field) {
    return isSetField(field);
  }

  public boolean isSetPartyActionRejectReason() {
    return isSetField(2333);
  }

  public void set(quickfix.field.ApplTestMessageIndicator value) {
    setField(value);
  }

  public quickfix.field.ApplTestMessageIndicator get(quickfix.field.ApplTestMessageIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ApplTestMessageIndicator getApplTestMessageIndicator() throws FieldNotFound {
    return get(new quickfix.field.ApplTestMessageIndicator());
  }

  public boolean isSet(quickfix.field.ApplTestMessageIndicator field) {
    return isSetField(field);
  }

  public boolean isSetApplTestMessageIndicator() {
    return isSetField(2330);
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

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }

  public void set(quickfix.fixlatest.component.RequestingPartyGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RequestingPartyGrp get(quickfix.fixlatest.component.RequestingPartyGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RequestingPartyGrp getRequestingPartyGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RequestingPartyGrp());
  }

  public void set(quickfix.field.NoRequestingPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoRequestingPartyIDs get(quickfix.field.NoRequestingPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestingPartyIDs getNoRequestingPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRequestingPartyIDs());
  }

  public boolean isSet(quickfix.field.NoRequestingPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestingPartyIDs() {
    return isSetField(1657);
  }

public static class NoRequestingPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1658, 1659, 1660, 2338, 1661, 0};

  public NoRequestingPartyIDs() {
    super(1657, 1658, ORDER);
  }

  public void set(quickfix.field.RequestingPartyID value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyID get(quickfix.field.RequestingPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyID getRequestingPartyID() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyID());
  }

  public boolean isSet(quickfix.field.RequestingPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyID() {
    return isSetField(1658);
  }

  public void set(quickfix.field.RequestingPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyIDSource get(quickfix.field.RequestingPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyIDSource getRequestingPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyIDSource());
  }

  public boolean isSet(quickfix.field.RequestingPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyIDSource() {
    return isSetField(1659);
  }

  public void set(quickfix.field.RequestingPartyRole value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyRole get(quickfix.field.RequestingPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyRole getRequestingPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyRole());
  }

  public boolean isSet(quickfix.field.RequestingPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyRole() {
    return isSetField(1660);
  }

  public void set(quickfix.field.RequestingPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyRoleQualifier get(quickfix.field.RequestingPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyRoleQualifier getRequestingPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RequestingPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyRoleQualifier() {
    return isSetField(2338);
  }

  public void set(quickfix.fixlatest.component.RequestingPartySubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RequestingPartySubGrp get(quickfix.fixlatest.component.RequestingPartySubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RequestingPartySubGrp getRequestingPartySubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RequestingPartySubGrp());
  }

  public void set(quickfix.field.NoRequestingPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRequestingPartySubIDs get(quickfix.field.NoRequestingPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestingPartySubIDs getNoRequestingPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRequestingPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoRequestingPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestingPartySubIDs() {
    return isSetField(1661);
  }

public static class NoRequestingPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1662, 1663, 0};

  public NoRequestingPartySubIDs() {
    super(1661, 1662, ORDER);
  }

  public void set(quickfix.field.RequestingPartySubID value) {
    setField(value);
  }

  public quickfix.field.RequestingPartySubID get(quickfix.field.RequestingPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartySubID getRequestingPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartySubID());
  }

  public boolean isSet(quickfix.field.RequestingPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartySubID() {
    return isSetField(1662);
  }

  public void set(quickfix.field.RequestingPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RequestingPartySubIDType get(quickfix.field.RequestingPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartySubIDType getRequestingPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartySubIDType());
  }

  public boolean isSet(quickfix.field.RequestingPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartySubIDType() {
    return isSetField(1663);
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

  public void set(quickfix.fixlatest.component.RelatedPartyDetailGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailGrp get(quickfix.fixlatest.component.RelatedPartyDetailGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailGrp getRelatedPartyDetailGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailID value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailID get(quickfix.field.NoRelatedPartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailID getNoRelatedPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailID());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailID() {
    return isSetField(1562);
  }

public static class NoRelatedPartyDetailID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1563, 1564, 1565, 1675, 1566, 1569, 1514, 0};

  public NoRelatedPartyDetailID() {
    super(1562, 1563, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailID get(quickfix.field.RelatedPartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailID getRelatedPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailID() {
    return isSetField(1563);
  }

  public void set(quickfix.field.RelatedPartyDetailIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailIDSource get(quickfix.field.RelatedPartyDetailIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailIDSource getRelatedPartyDetailIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailIDSource() {
    return isSetField(1564);
  }

  public void set(quickfix.field.RelatedPartyDetailRole value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailRole get(quickfix.field.RelatedPartyDetailRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailRole getRelatedPartyDetailRole() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailRole());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailRole field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailRole() {
    return isSetField(1565);
  }

  public void set(quickfix.field.RelatedPartyDetailRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailRoleQualifier get(quickfix.field.RelatedPartyDetailRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailRoleQualifier getRelatedPartyDetailRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailRoleQualifier());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailRoleQualifier() {
    return isSetField(1675);
  }

  public void set(quickfix.fixlatest.component.RelatedPartyDetailSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailSubGrp get(quickfix.fixlatest.component.RelatedPartyDetailSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailSubGrp getRelatedPartyDetailSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailSubGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailSubIDs get(quickfix.field.NoRelatedPartyDetailSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailSubIDs getNoRelatedPartyDetailSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailSubIDs());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailSubIDs() {
    return isSetField(1566);
  }

public static class NoRelatedPartyDetailSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1567, 1568, 0};

  public NoRelatedPartyDetailSubIDs() {
    super(1566, 1567, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailSubID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailSubID get(quickfix.field.RelatedPartyDetailSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailSubID getRelatedPartyDetailSubID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailSubID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailSubID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailSubID() {
    return isSetField(1567);
  }

  public void set(quickfix.field.RelatedPartyDetailSubIDType value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailSubIDType get(quickfix.field.RelatedPartyDetailSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailSubIDType getRelatedPartyDetailSubIDType() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailSubIDType());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailSubIDType() {
    return isSetField(1568);
  }
}

  public void set(quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp get(quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp getRelatedPartyDetailAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailAltID get(quickfix.field.NoRelatedPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailAltID getNoRelatedPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailAltID() {
    return isSetField(1569);
  }

public static class NoRelatedPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1570, 1571, 1572, 0};

  public NoRelatedPartyDetailAltID() {
    super(1569, 1570, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltID get(quickfix.field.RelatedPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltID getRelatedPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltID() {
    return isSetField(1570);
  }

  public void set(quickfix.field.RelatedPartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltIDSource get(quickfix.field.RelatedPartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltIDSource getRelatedPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltIDSource() {
    return isSetField(1571);
  }

  public void set(quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp get(quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp getRelatedPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailAltSubIDs get(quickfix.field.NoRelatedPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailAltSubIDs getNoRelatedPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailAltSubIDs() {
    return isSetField(1572);
  }

public static class NoRelatedPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1573, 1574, 0};

  public NoRelatedPartyDetailAltSubIDs() {
    super(1572, 1573, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltSubID get(quickfix.field.RelatedPartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltSubID getRelatedPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltSubID() {
    return isSetField(1573);
  }

  public void set(quickfix.field.RelatedPartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltSubIDType get(quickfix.field.RelatedPartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltSubIDType getRelatedPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltSubIDType() {
    return isSetField(1574);
  }
}
}

  public void set(quickfix.fixlatest.component.PartyRelationshipGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyRelationshipGrp get(quickfix.fixlatest.component.PartyRelationshipGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyRelationshipGrp getPartyRelationshipGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyRelationshipGrp());
  }

  public void set(quickfix.field.NoPartyRelationships value) {
    setField(value);
  }

  public quickfix.field.NoPartyRelationships get(quickfix.field.NoPartyRelationships value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyRelationships getNoPartyRelationships() throws FieldNotFound {
    return get(new quickfix.field.NoPartyRelationships());
  }

  public boolean isSet(quickfix.field.NoPartyRelationships field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyRelationships() {
    return isSetField(1514);
  }

public static class NoPartyRelationships extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1515, 0};

  public NoPartyRelationships() {
    super(1514, 1515, ORDER);
  }

  public void set(quickfix.field.PartyRelationship value) {
    setField(value);
  }

  public quickfix.field.PartyRelationship get(quickfix.field.PartyRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRelationship getPartyRelationship() throws FieldNotFound {
    return get(new quickfix.field.PartyRelationship());
  }

  public boolean isSet(quickfix.field.PartyRelationship field) {
    return isSetField(field);
  }

  public boolean isSetPartyRelationship() {
    return isSetField(1515);
  }
}
}

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
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

  public void set(quickfix.field.CopyMsgIndicator value) {
    setField(value);
  }

  public quickfix.field.CopyMsgIndicator get(quickfix.field.CopyMsgIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CopyMsgIndicator getCopyMsgIndicator() throws FieldNotFound {
    return get(new quickfix.field.CopyMsgIndicator());
  }

  public boolean isSet(quickfix.field.CopyMsgIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCopyMsgIndicator() {
    return isSetField(797);
  }
}
