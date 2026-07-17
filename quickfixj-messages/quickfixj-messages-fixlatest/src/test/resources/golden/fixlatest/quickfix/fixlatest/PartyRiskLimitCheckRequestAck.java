/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PartyRiskLimitCheckRequestAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DG";

  public PartyRiskLimitCheckRequestAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PartyRiskLimitCheckRequestAck (quickfix.field.RiskLimitCheckRequestStatus riskLimitCheckRequestStatus, quickfix.field.RiskLimitCheckTransType riskLimitCheckTransType, quickfix.field.RiskLimitCheckType riskLimitCheckType) {
    this();
    setField(riskLimitCheckRequestStatus);
    setField(riskLimitCheckTransType);
    setField(riskLimitCheckType);
  }

  public void set(quickfix.field.RiskLimitCheckRequestID value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckRequestID get(quickfix.field.RiskLimitCheckRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckRequestID getRiskLimitCheckRequestID() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckRequestID());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckRequestID field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckRequestID() {
    return isSetField(2318);
  }

  public void set(quickfix.field.RiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckID get(quickfix.field.RiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckID getRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckID() {
    return isSetField(2319);
  }

  public void set(quickfix.field.RiskLimitCheckRequestStatus value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckRequestStatus get(quickfix.field.RiskLimitCheckRequestStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckRequestStatus getRiskLimitCheckRequestStatus() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckRequestStatus());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckRequestStatus field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckRequestStatus() {
    return isSetField(2325);
  }

  public void set(quickfix.field.RiskLimitCheckRequestResult value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckRequestResult get(quickfix.field.RiskLimitCheckRequestResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckRequestResult getRiskLimitCheckRequestResult() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckRequestResult());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckRequestResult field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckRequestResult() {
    return isSetField(2326);
  }

  public void set(quickfix.field.RiskLimitCheckTransType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckTransType get(quickfix.field.RiskLimitCheckTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckTransType getRiskLimitCheckTransType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckTransType());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckTransType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckTransType() {
    return isSetField(2320);
  }

  public void set(quickfix.field.RiskLimitCheckType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckType get(quickfix.field.RiskLimitCheckType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckType getRiskLimitCheckType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckType());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckType() {
    return isSetField(2321);
  }

  public void set(quickfix.field.RiskLimitCheckRequestRefID value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckRequestRefID get(quickfix.field.RiskLimitCheckRequestRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckRequestRefID getRiskLimitCheckRequestRefID() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckRequestRefID());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckRequestRefID field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckRequestRefID() {
    return isSetField(2322);
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

  public void set(quickfix.field.RefOrderID value) {
    setField(value);
  }

  public quickfix.field.RefOrderID get(quickfix.field.RefOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrderID getRefOrderID() throws FieldNotFound {
    return get(new quickfix.field.RefOrderID());
  }

  public boolean isSet(quickfix.field.RefOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRefOrderID() {
    return isSetField(1080);
  }

  public void set(quickfix.field.RefOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RefOrderIDSource get(quickfix.field.RefOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RefOrderIDSource());
  }

  public boolean isSet(quickfix.field.RefOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRefOrderIDSource() {
    return isSetField(1081);
  }

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.field.RiskLimitApprovedAmount value) {
    setField(value);
  }

  public quickfix.field.RiskLimitApprovedAmount get(quickfix.field.RiskLimitApprovedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitApprovedAmount getRiskLimitApprovedAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitApprovedAmount());
  }

  public boolean isSet(quickfix.field.RiskLimitApprovedAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitApprovedAmount() {
    return isSetField(2327);
  }

  public void set(quickfix.field.RiskLimitCheckAmount value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCheckAmount get(quickfix.field.RiskLimitCheckAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCheckAmount getRiskLimitCheckAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCheckAmount());
  }

  public boolean isSet(quickfix.field.RiskLimitCheckAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCheckAmount() {
    return isSetField(2324);
  }

  public void set(quickfix.field.RiskLimitID value) {
    setField(value);
  }

  public quickfix.field.RiskLimitID get(quickfix.field.RiskLimitID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitID getRiskLimitID() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitID());
  }

  public boolean isSet(quickfix.field.RiskLimitID field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitID() {
    return isSetField(1670);
  }

  public void set(quickfix.field.Currency value) {
    setField(value);
  }

  public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Currency getCurrency() throws FieldNotFound {
    return get(new quickfix.field.Currency());
  }

  public boolean isSet(quickfix.field.Currency field) {
    return isSetField(field);
  }

  public boolean isSetCurrency() {
    return isSetField(15);
  }

  public void set(quickfix.field.ExpireTime value) {
    setField(value);
  }

  public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
    return get(new quickfix.field.ExpireTime());
  }

  public boolean isSet(quickfix.field.ExpireTime field) {
    return isSetField(field);
  }

  public boolean isSetExpireTime() {
    return isSetField(126);
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

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }

  public void set(quickfix.fixlatest.component.LegOrdGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOrdGrp get(quickfix.fixlatest.component.LegOrdGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOrdGrp getLegOrdGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOrdGrp());
  }

  public void set(quickfix.field.NoLegs value) {
    setField(value);
  }

  public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
    return get(new quickfix.field.NoLegs());
  }

  public boolean isSet(quickfix.field.NoLegs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegs() {
    return isSetField(555);
  }

public static class NoLegs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 685, 687, 690, 683, 1366, 670, 2680, 1817, 564, 565, 539, 654, 587, 588, 675, 1379, 1381, 1383, 1384, 1689, 0};

  public NoLegs() {
    super(555, 600, ORDER);
  }

  public void set(quickfix.fixlatest.component.InstrumentLeg component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentLeg get(quickfix.fixlatest.component.InstrumentLeg component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentLeg getInstrumentLegComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentLeg());
  }

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegQty value) {
    setField(value);
  }

  public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQty getLegQty() throws FieldNotFound {
    return get(new quickfix.field.LegQty());
  }

  public boolean isSet(quickfix.field.LegQty field) {
    return isSetField(field);
  }

  public boolean isSetLegQty() {
    return isSetField(687);
  }

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
}

  public void set(quickfix.field.LegAllocID value) {
    setField(value);
  }

  public quickfix.field.LegAllocID get(quickfix.field.LegAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocID getLegAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegAllocID());
  }

  public boolean isSet(quickfix.field.LegAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocID() {
    return isSetField(1366);
  }

  public void set(quickfix.fixlatest.component.LegPreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPreAllocGrp get(quickfix.fixlatest.component.LegPreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPreAllocGrp getLegPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPreAllocGrp());
  }

  public void set(quickfix.field.NoLegAllocs value) {
    setField(value);
  }

  public quickfix.field.NoLegAllocs get(quickfix.field.NoLegAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAllocs getNoLegAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAllocs());
  }

  public boolean isSet(quickfix.field.NoLegAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAllocs() {
    return isSetField(670);
  }

public static class NoLegAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {671, 672, 756, 673, 674, 1367, 1756, 1757, 1758, 1759, 0};

  public NoLegAllocs() {
    super(670, 671, ORDER);
  }

  public void set(quickfix.field.LegAllocAccount value) {
    setField(value);
  }

  public quickfix.field.LegAllocAccount get(quickfix.field.LegAllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAccount getLegAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAccount());
  }

  public boolean isSet(quickfix.field.LegAllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAccount() {
    return isSetField(671);
  }

  public void set(quickfix.field.LegIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.LegIndividualAllocID get(quickfix.field.LegIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndividualAllocID getLegIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegIndividualAllocID());
  }

  public boolean isSet(quickfix.field.LegIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegIndividualAllocID() {
    return isSetField(672);
  }

  public void set(quickfix.fixlatest.component.NestedParties2 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties2 get(quickfix.fixlatest.component.NestedParties2 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties2 getNestedParties2Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties2());
  }

  public void set(quickfix.field.NoNested2PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs() {
    return isSetField(756);
  }

public static class NoNested2PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {757, 758, 759, 2381, 806, 0};

  public NoNested2PartyIDs() {
    super(756, 757, ORDER);
  }

  public void set(quickfix.field.Nested2PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyID());
  }

  public boolean isSet(quickfix.field.Nested2PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID() {
    return isSetField(757);
  }

  public void set(quickfix.field.Nested2PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource() {
    return isSetField(758);
  }

  public void set(quickfix.field.Nested2PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRole());
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole() {
    return isSetField(759);
  }

  public void set(quickfix.field.Nested2PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRoleQualifier get(quickfix.field.Nested2PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRoleQualifier getNested2PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested2PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRoleQualifier() {
    return isSetField(2381);
  }

  public void set(quickfix.fixlatest.component.NstdPtys2SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp get(quickfix.fixlatest.component.NstdPtys2SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp getNstdPtys2SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys2SubGrp());
  }

  public void set(quickfix.field.NoNested2PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs() {
    return isSetField(806);
  }

public static class NoNested2PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {760, 807, 0};

  public NoNested2PartySubIDs() {
    super(806, 760, ORDER);
  }

  public void set(quickfix.field.Nested2PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubID());
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID() {
    return isSetField(760);
  }

  public void set(quickfix.field.Nested2PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType() {
    return isSetField(807);
  }
}
}

  public void set(quickfix.field.LegAllocQty value) {
    setField(value);
  }

  public quickfix.field.LegAllocQty get(quickfix.field.LegAllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocQty getLegAllocQty() throws FieldNotFound {
    return get(new quickfix.field.LegAllocQty());
  }

  public boolean isSet(quickfix.field.LegAllocQty field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocQty() {
    return isSetField(673);
  }

  public void set(quickfix.field.LegAllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAllocAcctIDSource get(quickfix.field.LegAllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAcctIDSource getLegAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.LegAllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAcctIDSource() {
    return isSetField(674);
  }

  public void set(quickfix.field.LegAllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAllocSettlCurrency get(quickfix.field.LegAllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocSettlCurrency getLegAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegAllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocSettlCurrency() {
    return isSetField(1367);
  }

  public void set(quickfix.field.LegCustodialLotID value) {
    setField(value);
  }

  public quickfix.field.LegCustodialLotID get(quickfix.field.LegCustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCustodialLotID getLegCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.LegCustodialLotID());
  }

  public boolean isSet(quickfix.field.LegCustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetLegCustodialLotID() {
    return isSetField(1756);
  }

  public void set(quickfix.field.LegVersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchaseDate get(quickfix.field.LegVersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchaseDate getLegVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.LegVersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchaseDate() {
    return isSetField(1757);
  }

  public void set(quickfix.field.LegVersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchasePrice get(quickfix.field.LegVersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchasePrice getLegVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.LegVersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchasePrice() {
    return isSetField(1758);
  }

  public void set(quickfix.field.LegCurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.LegCurrentCostBasis get(quickfix.field.LegCurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrentCostBasis getLegCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.LegCurrentCostBasis());
  }

  public boolean isSet(quickfix.field.LegCurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrentCostBasis() {
    return isSetField(1759);
  }
}

  public void set(quickfix.field.LegAccount value) {
    setField(value);
  }

  public quickfix.field.LegAccount get(quickfix.field.LegAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAccount getLegAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAccount());
  }

  public boolean isSet(quickfix.field.LegAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAccount() {
    return isSetField(2680);
  }

  public void set(quickfix.field.LegClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.LegClearingAccountType get(quickfix.field.LegClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegClearingAccountType getLegClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.LegClearingAccountType());
  }

  public boolean isSet(quickfix.field.LegClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetLegClearingAccountType() {
    return isSetField(1817);
  }

  public void set(quickfix.field.LegPositionEffect value) {
    setField(value);
  }

  public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.LegPositionEffect());
  }

  public boolean isSet(quickfix.field.LegPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionEffect() {
    return isSetField(564);
  }

  public void set(quickfix.field.LegCoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.LegCoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetLegCoveredOrUncovered() {
    return isSetField(565);
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

  public void set(quickfix.field.LegRefID value) {
    setField(value);
  }

  public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
    return get(new quickfix.field.LegRefID());
  }

  public boolean isSet(quickfix.field.LegRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegRefID() {
    return isSetField(654);
  }

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
  }

  public void set(quickfix.field.LegSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlCurrency() {
    return isSetField(675);
  }

  public void set(quickfix.field.LegVolatility value) {
    setField(value);
  }

  public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
    return get(new quickfix.field.LegVolatility());
  }

  public boolean isSet(quickfix.field.LegVolatility field) {
    return isSetField(field);
  }

  public boolean isSetLegVolatility() {
    return isSetField(1379);
  }

  public void set(quickfix.field.LegDividendYield value) {
    setField(value);
  }

  public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
    return get(new quickfix.field.LegDividendYield());
  }

  public boolean isSet(quickfix.field.LegDividendYield field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendYield() {
    return isSetField(1381);
  }

  public void set(quickfix.field.LegCurrencyRatio value) {
    setField(value);
  }

  public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
    return get(new quickfix.field.LegCurrencyRatio());
  }

  public boolean isSet(quickfix.field.LegCurrencyRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrencyRatio() {
    return isSetField(1383);
  }

  public void set(quickfix.field.LegExecInst value) {
    setField(value);
  }

  public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
    return get(new quickfix.field.LegExecInst());
  }

  public boolean isSet(quickfix.field.LegExecInst field) {
    return isSetField(field);
  }

  public boolean isSetLegExecInst() {
    return isSetField(1384);
  }

  public void set(quickfix.field.LegShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleExemptionReason get(quickfix.field.LegShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleExemptionReason getLegShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.LegShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleExemptionReason() {
    return isSetField(1689);
  }
}

  public void set(quickfix.fixlatest.component.UndInstrmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndInstrmtGrp get(quickfix.fixlatest.component.UndInstrmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndInstrmtGrp getUndInstrmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndInstrmtGrp());
  }

  public void set(quickfix.field.NoUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyings());
  }

  public boolean isSet(quickfix.field.NoUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyings() {
    return isSetField(711);
  }

public static class NoUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {311, 312, 309, 305, 457, 2874, 462, 1874, 1875, 1876, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1981, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2080, 2312, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2045, 2295, 2296, 2297, 2756, 2298, 2299, 40964, 40962, 40965, 41949, 41950, 41947, 41951, 41952, 41953, 41859, 41864, 41860, 41866, 41868, 41861, 41862, 41863, 41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, 43076, 43077, 43074, 43078, 43079, 43080, 43081, 43082, 41822, 41820, 41841, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, 41846, 41844, 41856, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, 42888, 42889, 42890, 42891, 42892, 42893, 42894, 40540, 42149, 42036, 42068, 42041, 42060, 43004, 43005, 42860, 42861, 42855, 42884, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, 0};

  public NoUnderlyings() {
    super(711, 311, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingInstrument get(quickfix.fixlatest.component.UnderlyingInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingInstrument getUnderlyingInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingInstrument());
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
}
