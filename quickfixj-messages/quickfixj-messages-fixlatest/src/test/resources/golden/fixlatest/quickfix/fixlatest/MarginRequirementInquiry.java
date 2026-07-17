/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarginRequirementInquiry extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CH";

  public MarginRequirementInquiry() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarginRequirementInquiry (quickfix.field.MarginReqmtInqID marginReqmtInqID) {
    this();
    setField(marginReqmtInqID);
  }

  public void set(quickfix.field.MarginReqmtInqID value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtInqID get(quickfix.field.MarginReqmtInqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtInqID getMarginReqmtInqID() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtInqID());
  }

  public boolean isSet(quickfix.field.MarginReqmtInqID field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtInqID() {
    return isSetField(1635);
  }

  public void set(quickfix.fixlatest.component.MarginReqmtInqQualGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarginReqmtInqQualGrp get(quickfix.fixlatest.component.MarginReqmtInqQualGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarginReqmtInqQualGrp getMarginReqmtInqQualGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarginReqmtInqQualGrp());
  }

  public void set(quickfix.field.NoMarginReqmtInqQualifier value) {
    setField(value);
  }

  public quickfix.field.NoMarginReqmtInqQualifier get(quickfix.field.NoMarginReqmtInqQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarginReqmtInqQualifier getNoMarginReqmtInqQualifier() throws FieldNotFound {
    return get(new quickfix.field.NoMarginReqmtInqQualifier());
  }

  public boolean isSet(quickfix.field.NoMarginReqmtInqQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNoMarginReqmtInqQualifier() {
    return isSetField(1636);
  }

public static class NoMarginReqmtInqQualifier extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1637, 0};

  public NoMarginReqmtInqQualifier() {
    super(1636, 1637, ORDER);
  }

  public void set(quickfix.field.MarginReqmtInqQualifier value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtInqQualifier get(quickfix.field.MarginReqmtInqQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtInqQualifier getMarginReqmtInqQualifier() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtInqQualifier());
  }

  public boolean isSet(quickfix.field.MarginReqmtInqQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtInqQualifier() {
    return isSetField(1637);
  }
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

  public void set(quickfix.field.ResponseTransportType value) {
    setField(value);
  }

  public quickfix.field.ResponseTransportType get(quickfix.field.ResponseTransportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ResponseTransportType getResponseTransportType() throws FieldNotFound {
    return get(new quickfix.field.ResponseTransportType());
  }

  public boolean isSet(quickfix.field.ResponseTransportType field) {
    return isSetField(field);
  }

  public boolean isSetResponseTransportType() {
    return isSetField(725);
  }

  public void set(quickfix.field.ResponseDestination value) {
    setField(value);
  }

  public quickfix.field.ResponseDestination get(quickfix.field.ResponseDestination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ResponseDestination getResponseDestination() throws FieldNotFound {
    return get(new quickfix.field.ResponseDestination());
  }

  public boolean isSet(quickfix.field.ResponseDestination field) {
    return isSetField(field);
  }

  public boolean isSetResponseDestination() {
    return isSetField(726);
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

  public void set(quickfix.field.ClearingBusinessDate value) {
    setField(value);
  }

  public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.ClearingBusinessDate());
  }

  public boolean isSet(quickfix.field.ClearingBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetClearingBusinessDate() {
    return isSetField(715);
  }

  public void set(quickfix.field.SettlSessID value) {
    setField(value);
  }

  public quickfix.field.SettlSessID get(quickfix.field.SettlSessID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSessID getSettlSessID() throws FieldNotFound {
    return get(new quickfix.field.SettlSessID());
  }

  public boolean isSet(quickfix.field.SettlSessID field) {
    return isSetField(field);
  }

  public boolean isSetSettlSessID() {
    return isSetField(716);
  }

  public void set(quickfix.field.SettlSessSubID value) {
    setField(value);
  }

  public quickfix.field.SettlSessSubID get(quickfix.field.SettlSessSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSessSubID getSettlSessSubID() throws FieldNotFound {
    return get(new quickfix.field.SettlSessSubID());
  }

  public boolean isSet(quickfix.field.SettlSessSubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlSessSubID() {
    return isSetField(717);
  }

  public void set(quickfix.field.MarginClass value) {
    setField(value);
  }

  public quickfix.field.MarginClass get(quickfix.field.MarginClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginClass getMarginClass() throws FieldNotFound {
    return get(new quickfix.field.MarginClass());
  }

  public boolean isSet(quickfix.field.MarginClass field) {
    return isSetField(field);
  }

  public boolean isSetMarginClass() {
    return isSetField(1639);
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
