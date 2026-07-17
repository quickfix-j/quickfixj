/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PartyRiskLimitsRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CL";

  public PartyRiskLimitsRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PartyRiskLimitsRequest (quickfix.field.RiskLimitRequestID riskLimitRequestID) {
    this();
    setField(riskLimitRequestID);
  }

  public void set(quickfix.field.RiskLimitRequestID value) {
    setField(value);
  }

  public quickfix.field.RiskLimitRequestID get(quickfix.field.RiskLimitRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitRequestID getRiskLimitRequestID() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitRequestID());
  }

  public boolean isSet(quickfix.field.RiskLimitRequestID field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitRequestID() {
    return isSetField(1666);
  }

  public void set(quickfix.field.RiskLimitRequestType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitRequestType get(quickfix.field.RiskLimitRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitRequestType getRiskLimitRequestType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitRequestType());
  }

  public boolean isSet(quickfix.field.RiskLimitRequestType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitRequestType() {
    return isSetField(1760);
  }

  public void set(quickfix.field.SubscriptionRequestType value) {
    setField(value);
  }

  public quickfix.field.SubscriptionRequestType get(quickfix.field.SubscriptionRequestType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
    return get(new quickfix.field.SubscriptionRequestType());
  }

  public boolean isSet(quickfix.field.SubscriptionRequestType field) {
    return isSetField(field);
  }

  public boolean isSetSubscriptionRequestType() {
    return isSetField(263);
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

  public void set(quickfix.fixlatest.component.RequestedPartyRoleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RequestedPartyRoleGrp get(quickfix.fixlatest.component.RequestedPartyRoleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RequestedPartyRoleGrp getRequestedPartyRoleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RequestedPartyRoleGrp());
  }

  public void set(quickfix.field.NoRequestedPartyRoles value) {
    setField(value);
  }

  public quickfix.field.NoRequestedPartyRoles get(quickfix.field.NoRequestedPartyRoles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestedPartyRoles getNoRequestedPartyRoles() throws FieldNotFound {
    return get(new quickfix.field.NoRequestedPartyRoles());
  }

  public boolean isSet(quickfix.field.NoRequestedPartyRoles field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestedPartyRoles() {
    return isSetField(1508);
  }

public static class NoRequestedPartyRoles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1509, 2386, 0};

  public NoRequestedPartyRoles() {
    super(1508, 1509, ORDER);
  }

  public void set(quickfix.field.RequestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.RequestedPartyRole get(quickfix.field.RequestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestedPartyRole getRequestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RequestedPartyRole());
  }

  public boolean isSet(quickfix.field.RequestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRequestedPartyRole() {
    return isSetField(1509);
  }

  public void set(quickfix.field.RequestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RequestedPartyRoleQualifier get(quickfix.field.RequestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestedPartyRoleQualifier getRequestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RequestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RequestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRequestedPartyRoleQualifier() {
    return isSetField(2386);
  }
}

  public void set(quickfix.fixlatest.component.RequestedRiskLimitTypesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RequestedRiskLimitTypesGrp get(quickfix.fixlatest.component.RequestedRiskLimitTypesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RequestedRiskLimitTypesGrp getRequestedRiskLimitTypesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RequestedRiskLimitTypesGrp());
  }

  public void set(quickfix.field.NoRequestedRiskLimitType value) {
    setField(value);
  }

  public quickfix.field.NoRequestedRiskLimitType get(quickfix.field.NoRequestedRiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestedRiskLimitType getNoRequestedRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.NoRequestedRiskLimitType());
  }

  public boolean isSet(quickfix.field.NoRequestedRiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestedRiskLimitType() {
    return isSetField(1668);
  }

public static class NoRequestedRiskLimitType extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1530, 0};

  public NoRequestedRiskLimitType() {
    super(1668, 1530, ORDER);
  }

  public void set(quickfix.field.RiskLimitType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitType get(quickfix.field.RiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitType getRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitType());
  }

  public boolean isSet(quickfix.field.RiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitType() {
    return isSetField(1530);
  }
}

  public void set(quickfix.field.RiskLimitPlatform value) {
    setField(value);
  }

  public quickfix.field.RiskLimitPlatform get(quickfix.field.RiskLimitPlatform value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitPlatform getRiskLimitPlatform() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitPlatform());
  }

  public boolean isSet(quickfix.field.RiskLimitPlatform field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitPlatform() {
    return isSetField(1533);
  }

  public void set(quickfix.fixlatest.component.RiskInstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskInstrumentScopeGrp get(quickfix.fixlatest.component.RiskInstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskInstrumentScopeGrp getRiskInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskInstrumentScopeGrp());
  }

  public void set(quickfix.field.NoRiskInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoRiskInstrumentScopes get(quickfix.field.NoRiskInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskInstrumentScopes getNoRiskInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoRiskInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoRiskInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskInstrumentScopes() {
    return isSetField(1534);
  }

public static class NoRiskInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 1558, 0};

  public NoRiskInstrumentScopes() {
    super(1534, 1535, ORDER);
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

  public void set(quickfix.field.RiskInstrumentMultiplier value) {
    setField(value);
  }

  public quickfix.field.RiskInstrumentMultiplier get(quickfix.field.RiskInstrumentMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskInstrumentMultiplier getRiskInstrumentMultiplier() throws FieldNotFound {
    return get(new quickfix.field.RiskInstrumentMultiplier());
  }

  public boolean isSet(quickfix.field.RiskInstrumentMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetRiskInstrumentMultiplier() {
    return isSetField(1558);
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
