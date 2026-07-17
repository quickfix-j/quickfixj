/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PartyEntitlementsDefinitionRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DB";

  public PartyEntitlementsDefinitionRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PartyEntitlementsDefinitionRequestAck (quickfix.field.EntitlementRequestID entitlementRequestID, quickfix.field.EntitlementRequestStatus entitlementRequestStatus) {
    this();
    setField(entitlementRequestID);
    setField(entitlementRequestStatus);
  }

  public void set(quickfix.field.EntitlementRequestID value) {
    setField(value);
  }

  public quickfix.field.EntitlementRequestID get(quickfix.field.EntitlementRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementRequestID getEntitlementRequestID() throws FieldNotFound {
    return get(new quickfix.field.EntitlementRequestID());
  }

  public boolean isSet(quickfix.field.EntitlementRequestID field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementRequestID() {
    return isSetField(1770);
  }

  public void set(quickfix.field.EntitlementRequestStatus value) {
    setField(value);
  }

  public quickfix.field.EntitlementRequestStatus get(quickfix.field.EntitlementRequestStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementRequestStatus getEntitlementRequestStatus() throws FieldNotFound {
    return get(new quickfix.field.EntitlementRequestStatus());
  }

  public boolean isSet(quickfix.field.EntitlementRequestStatus field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementRequestStatus() {
    return isSetField(1882);
  }

  public void set(quickfix.field.EntitlementRequestResult value) {
    setField(value);
  }

  public quickfix.field.EntitlementRequestResult get(quickfix.field.EntitlementRequestResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementRequestResult getEntitlementRequestResult() throws FieldNotFound {
    return get(new quickfix.field.EntitlementRequestResult());
  }

  public boolean isSet(quickfix.field.EntitlementRequestResult field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementRequestResult() {
    return isSetField(1881);
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

  public void set(quickfix.fixlatest.component.PartyEntitlementAckGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyEntitlementAckGrp get(quickfix.fixlatest.component.PartyEntitlementAckGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyEntitlementAckGrp getPartyEntitlementAckGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyEntitlementAckGrp());
  }

  public void set(quickfix.field.NoPartyEntitlements value) {
    setField(value);
  }

  public quickfix.field.NoPartyEntitlements get(quickfix.field.NoPartyEntitlements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyEntitlements getNoPartyEntitlements() throws FieldNotFound {
    return get(new quickfix.field.NoPartyEntitlements());
  }

  public boolean isSet(quickfix.field.NoPartyEntitlements field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyEntitlements() {
    return isSetField(1772);
  }

public static class NoPartyEntitlements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1324, 1883, 1884, 1328, 1664, 1665, 1671, 1773, 1885, 0};

  public NoPartyEntitlements() {
    super(1772, 1324, ORDER);
  }

  public void set(quickfix.field.ListUpdateAction value) {
    setField(value);
  }

  public quickfix.field.ListUpdateAction get(quickfix.field.ListUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListUpdateAction getListUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.ListUpdateAction());
  }

  public boolean isSet(quickfix.field.ListUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetListUpdateAction() {
    return isSetField(1324);
  }

  public void set(quickfix.field.EntitlementStatus value) {
    setField(value);
  }

  public quickfix.field.EntitlementStatus get(quickfix.field.EntitlementStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementStatus getEntitlementStatus() throws FieldNotFound {
    return get(new quickfix.field.EntitlementStatus());
  }

  public boolean isSet(quickfix.field.EntitlementStatus field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementStatus() {
    return isSetField(1883);
  }

  public void set(quickfix.field.EntitlementResult value) {
    setField(value);
  }

  public quickfix.field.EntitlementResult get(quickfix.field.EntitlementResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementResult getEntitlementResult() throws FieldNotFound {
    return get(new quickfix.field.EntitlementResult());
  }

  public boolean isSet(quickfix.field.EntitlementResult field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementResult() {
    return isSetField(1884);
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

  public void set(quickfix.fixlatest.component.PartyDetailGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailGrp get(quickfix.fixlatest.component.PartyDetailGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailGrp getPartyDetailGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailGrp());
  }

  public void set(quickfix.field.NoPartyDetails value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetails get(quickfix.field.NoPartyDetails value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetails getNoPartyDetails() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetails());
  }

  public boolean isSet(quickfix.field.NoPartyDetails field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetails() {
    return isSetField(1671);
  }

public static class NoPartyDetails extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1691, 1692, 1693, 1674, 1694, 1516, 1562, 1672, 0};

  public NoPartyDetails() {
    super(1671, 1691, ORDER);
  }

  public void set(quickfix.field.PartyDetailID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailID get(quickfix.field.PartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailID getPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailID());
  }

  public boolean isSet(quickfix.field.PartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailID() {
    return isSetField(1691);
  }

  public void set(quickfix.field.PartyDetailIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailIDSource get(quickfix.field.PartyDetailIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailIDSource getPartyDetailIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailIDSource() {
    return isSetField(1692);
  }

  public void set(quickfix.field.PartyDetailRole value) {
    setField(value);
  }

  public quickfix.field.PartyDetailRole get(quickfix.field.PartyDetailRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailRole getPartyDetailRole() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailRole());
  }

  public boolean isSet(quickfix.field.PartyDetailRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailRole() {
    return isSetField(1693);
  }

  public void set(quickfix.field.PartyDetailRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyDetailRoleQualifier get(quickfix.field.PartyDetailRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailRoleQualifier getPartyDetailRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyDetailRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailRoleQualifier() {
    return isSetField(1674);
  }

  public void set(quickfix.fixlatest.component.PartyDetailSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailSubGrp get(quickfix.fixlatest.component.PartyDetailSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailSubGrp getPartyDetailSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailSubIDs get(quickfix.field.NoPartyDetailSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailSubIDs getNoPartyDetailSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailSubIDs() {
    return isSetField(1694);
  }

public static class NoPartyDetailSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1695, 1696, 0};

  public NoPartyDetailSubIDs() {
    super(1694, 1695, ORDER);
  }

  public void set(quickfix.field.PartyDetailSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailSubID get(quickfix.field.PartyDetailSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailSubID getPartyDetailSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailSubID() {
    return isSetField(1695);
  }

  public void set(quickfix.field.PartyDetailSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailSubIDType get(quickfix.field.PartyDetailSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailSubIDType getPartyDetailSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailSubIDType() {
    return isSetField(1696);
  }
}

  public void set(quickfix.fixlatest.component.PartyDetailAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltIDGrp get(quickfix.fixlatest.component.PartyDetailAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltIDGrp getPartyDetailAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltIDGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltID get(quickfix.field.NoPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltID getNoPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltID() {
    return isSetField(1516);
  }

public static class NoPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1517, 1518, 1519, 0};

  public NoPartyDetailAltID() {
    super(1516, 1517, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltID get(quickfix.field.PartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltID getPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltID() {
    return isSetField(1517);
  }

  public void set(quickfix.field.PartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltIDSource get(quickfix.field.PartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltIDSource getPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltIDSource() {
    return isSetField(1518);
  }

  public void set(quickfix.fixlatest.component.PartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp get(quickfix.fixlatest.component.PartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp getPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltSubIDs get(quickfix.field.NoPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltSubIDs getNoPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltSubIDs() {
    return isSetField(1519);
  }

public static class NoPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1520, 1521, 0};

  public NoPartyDetailAltSubIDs() {
    super(1519, 1520, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubID get(quickfix.field.PartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubID getPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubID() {
    return isSetField(1520);
  }

  public void set(quickfix.field.PartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubIDType get(quickfix.field.PartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubIDType getPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubIDType() {
    return isSetField(1521);
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

  public void set(quickfix.field.PartyDetailStatus value) {
    setField(value);
  }

  public quickfix.field.PartyDetailStatus get(quickfix.field.PartyDetailStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailStatus getPartyDetailStatus() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailStatus());
  }

  public boolean isSet(quickfix.field.PartyDetailStatus field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailStatus() {
    return isSetField(1672);
  }
}

  public void set(quickfix.fixlatest.component.EntitlementGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.EntitlementGrp get(quickfix.fixlatest.component.EntitlementGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.EntitlementGrp getEntitlementGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.EntitlementGrp());
  }

  public void set(quickfix.field.NoEntitlements value) {
    setField(value);
  }

  public quickfix.field.NoEntitlements get(quickfix.field.NoEntitlements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlements getNoEntitlements() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlements());
  }

  public boolean isSet(quickfix.field.NoEntitlements field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlements() {
    return isSetField(1773);
  }

public static class NoEntitlements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1774, 1775, 2402, 1777, 1776, 1784, 1656, 1310, 1782, 1783, 0};

  public NoEntitlements() {
    super(1773, 1774, ORDER);
  }

  public void set(quickfix.field.EntitlementIndicator value) {
    setField(value);
  }

  public quickfix.field.EntitlementIndicator get(quickfix.field.EntitlementIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementIndicator getEntitlementIndicator() throws FieldNotFound {
    return get(new quickfix.field.EntitlementIndicator());
  }

  public boolean isSet(quickfix.field.EntitlementIndicator field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementIndicator() {
    return isSetField(1774);
  }

  public void set(quickfix.field.EntitlementType value) {
    setField(value);
  }

  public quickfix.field.EntitlementType get(quickfix.field.EntitlementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementType getEntitlementType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementType());
  }

  public boolean isSet(quickfix.field.EntitlementType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementType() {
    return isSetField(1775);
  }

  public void set(quickfix.field.EntitlementSubType value) {
    setField(value);
  }

  public quickfix.field.EntitlementSubType get(quickfix.field.EntitlementSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementSubType getEntitlementSubType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementSubType());
  }

  public boolean isSet(quickfix.field.EntitlementSubType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementSubType() {
    return isSetField(2402);
  }

  public void set(quickfix.fixlatest.component.EntitlementAttribGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.EntitlementAttribGrp get(quickfix.fixlatest.component.EntitlementAttribGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.EntitlementAttribGrp getEntitlementAttribGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.EntitlementAttribGrp());
  }

  public void set(quickfix.field.NoEntitlementAttrib value) {
    setField(value);
  }

  public quickfix.field.NoEntitlementAttrib get(quickfix.field.NoEntitlementAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlementAttrib getNoEntitlementAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlementAttrib());
  }

  public boolean isSet(quickfix.field.NoEntitlementAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlementAttrib() {
    return isSetField(1777);
  }

public static class NoEntitlementAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1778, 1779, 1780, 1781, 0};

  public NoEntitlementAttrib() {
    super(1777, 1778, ORDER);
  }

  public void set(quickfix.field.EntitlementAttribType value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribType get(quickfix.field.EntitlementAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribType getEntitlementAttribType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribType());
  }

  public boolean isSet(quickfix.field.EntitlementAttribType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribType() {
    return isSetField(1778);
  }

  public void set(quickfix.field.EntitlementAttribDatatype value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribDatatype get(quickfix.field.EntitlementAttribDatatype value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribDatatype getEntitlementAttribDatatype() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribDatatype());
  }

  public boolean isSet(quickfix.field.EntitlementAttribDatatype field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribDatatype() {
    return isSetField(1779);
  }

  public void set(quickfix.field.EntitlementAttribValue value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribValue get(quickfix.field.EntitlementAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribValue getEntitlementAttribValue() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribValue());
  }

  public boolean isSet(quickfix.field.EntitlementAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribValue() {
    return isSetField(1780);
  }

  public void set(quickfix.field.EntitlementAttribCurrency value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribCurrency get(quickfix.field.EntitlementAttribCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribCurrency getEntitlementAttribCurrency() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribCurrency());
  }

  public boolean isSet(quickfix.field.EntitlementAttribCurrency field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribCurrency() {
    return isSetField(1781);
  }
}

  public void set(quickfix.field.EntitlementID value) {
    setField(value);
  }

  public quickfix.field.EntitlementID get(quickfix.field.EntitlementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementID getEntitlementID() throws FieldNotFound {
    return get(new quickfix.field.EntitlementID());
  }

  public boolean isSet(quickfix.field.EntitlementID field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementID() {
    return isSetField(1776);
  }

  public void set(quickfix.field.EntitlementPlatform value) {
    setField(value);
  }

  public quickfix.field.EntitlementPlatform get(quickfix.field.EntitlementPlatform value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementPlatform getEntitlementPlatform() throws FieldNotFound {
    return get(new quickfix.field.EntitlementPlatform());
  }

  public boolean isSet(quickfix.field.EntitlementPlatform field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementPlatform() {
    return isSetField(1784);
  }

  public void set(quickfix.fixlatest.component.InstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp get(quickfix.fixlatest.component.InstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp getInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScopeGrp());
  }

  public void set(quickfix.field.NoInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentScopes get(quickfix.field.NoInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentScopes getNoInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentScopes() {
    return isSetField(1656);
  }

public static class NoInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 0};

  public NoInstrumentScopes() {
    super(1656, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
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
}

  public void set(quickfix.fixlatest.component.MarketSegmentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketSegmentScopeGrp get(quickfix.fixlatest.component.MarketSegmentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketSegmentScopeGrp getMarketSegmentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketSegmentScopeGrp());
  }

  public void set(quickfix.field.NoMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoMarketSegments get(quickfix.field.NoMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketSegments getNoMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoMarketSegments());
  }

  public boolean isSet(quickfix.field.NoMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketSegments() {
    return isSetField(1310);
  }

public static class NoMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1301, 1300, 0};

  public NoMarketSegments() {
    super(1310, 1301, ORDER);
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
}

  public void set(quickfix.field.EntitlementStartDate value) {
    setField(value);
  }

  public quickfix.field.EntitlementStartDate get(quickfix.field.EntitlementStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementStartDate getEntitlementStartDate() throws FieldNotFound {
    return get(new quickfix.field.EntitlementStartDate());
  }

  public boolean isSet(quickfix.field.EntitlementStartDate field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementStartDate() {
    return isSetField(1782);
  }

  public void set(quickfix.field.EntitlementEndDate value) {
    setField(value);
  }

  public quickfix.field.EntitlementEndDate get(quickfix.field.EntitlementEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementEndDate getEntitlementEndDate() throws FieldNotFound {
    return get(new quickfix.field.EntitlementEndDate());
  }

  public boolean isSet(quickfix.field.EntitlementEndDate field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementEndDate() {
    return isSetField(1783);
  }
}

  public void set(quickfix.field.EntitlementRefID value) {
    setField(value);
  }

  public quickfix.field.EntitlementRefID get(quickfix.field.EntitlementRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementRefID getEntitlementRefID() throws FieldNotFound {
    return get(new quickfix.field.EntitlementRefID());
  }

  public boolean isSet(quickfix.field.EntitlementRefID field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementRefID() {
    return isSetField(1885);
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
