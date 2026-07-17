/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class QuoteAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CW";

  public QuoteAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public QuoteAck (quickfix.field.QuoteAckStatus quoteAckStatus) {
    this();
    setField(quoteAckStatus);
  }

  public void set(quickfix.field.QuoteID value) {
    setField(value);
  }

  public quickfix.field.QuoteID get(quickfix.field.QuoteID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteID getQuoteID() throws FieldNotFound {
    return get(new quickfix.field.QuoteID());
  }

  public boolean isSet(quickfix.field.QuoteID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteID() {
    return isSetField(117);
  }

  public void set(quickfix.field.QuoteMsgID value) {
    setField(value);
  }

  public quickfix.field.QuoteMsgID get(quickfix.field.QuoteMsgID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteMsgID getQuoteMsgID() throws FieldNotFound {
    return get(new quickfix.field.QuoteMsgID());
  }

  public boolean isSet(quickfix.field.QuoteMsgID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteMsgID() {
    return isSetField(1166);
  }

  public void set(quickfix.field.QuoteReqID value) {
    setField(value);
  }

  public quickfix.field.QuoteReqID get(quickfix.field.QuoteReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
    return get(new quickfix.field.QuoteReqID());
  }

  public boolean isSet(quickfix.field.QuoteReqID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteReqID() {
    return isSetField(131);
  }

  public void set(quickfix.field.QuoteType value) {
    setField(value);
  }

  public quickfix.field.QuoteType get(quickfix.field.QuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteType getQuoteType() throws FieldNotFound {
    return get(new quickfix.field.QuoteType());
  }

  public boolean isSet(quickfix.field.QuoteType field) {
    return isSetField(field);
  }

  public boolean isSetQuoteType() {
    return isSetField(537);
  }

  public void set(quickfix.field.QuoteCancelType value) {
    setField(value);
  }

  public quickfix.field.QuoteCancelType get(quickfix.field.QuoteCancelType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteCancelType getQuoteCancelType() throws FieldNotFound {
    return get(new quickfix.field.QuoteCancelType());
  }

  public boolean isSet(quickfix.field.QuoteCancelType field) {
    return isSetField(field);
  }

  public boolean isSetQuoteCancelType() {
    return isSetField(298);
  }

  public void set(quickfix.field.SecondaryQuoteID value) {
    setField(value);
  }

  public quickfix.field.SecondaryQuoteID get(quickfix.field.SecondaryQuoteID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryQuoteID getSecondaryQuoteID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryQuoteID());
  }

  public boolean isSet(quickfix.field.SecondaryQuoteID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryQuoteID() {
    return isSetField(1751);
  }

  public void set(quickfix.field.QuoteAckStatus value) {
    setField(value);
  }

  public quickfix.field.QuoteAckStatus get(quickfix.field.QuoteAckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAckStatus getQuoteAckStatus() throws FieldNotFound {
    return get(new quickfix.field.QuoteAckStatus());
  }

  public boolean isSet(quickfix.field.QuoteAckStatus field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAckStatus() {
    return isSetField(1865);
  }

  public void set(quickfix.field.QuoteRejectReason value) {
    setField(value);
  }

  public quickfix.field.QuoteRejectReason get(quickfix.field.QuoteRejectReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteRejectReason getQuoteRejectReason() throws FieldNotFound {
    return get(new quickfix.field.QuoteRejectReason());
  }

  public boolean isSet(quickfix.field.QuoteRejectReason field) {
    return isSetField(field);
  }

  public boolean isSetQuoteRejectReason() {
    return isSetField(300);
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

  public void set(quickfix.fixlatest.component.QuoteAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.QuoteAttributeGrp get(quickfix.fixlatest.component.QuoteAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.QuoteAttributeGrp getQuoteAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.QuoteAttributeGrp());
  }

  public void set(quickfix.field.NoQuoteAttributes value) {
    setField(value);
  }

  public quickfix.field.NoQuoteAttributes get(quickfix.field.NoQuoteAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteAttributes getNoQuoteAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteAttributes());
  }

  public boolean isSet(quickfix.field.NoQuoteAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteAttributes() {
    return isSetField(2706);
  }

public static class NoQuoteAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2707, 2708, 0};

  public NoQuoteAttributes() {
    super(2706, 2707, ORDER);
  }

  public void set(quickfix.field.QuoteAttributeType value) {
    setField(value);
  }

  public quickfix.field.QuoteAttributeType get(quickfix.field.QuoteAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAttributeType getQuoteAttributeType() throws FieldNotFound {
    return get(new quickfix.field.QuoteAttributeType());
  }

  public boolean isSet(quickfix.field.QuoteAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAttributeType() {
    return isSetField(2707);
  }

  public void set(quickfix.field.QuoteAttributeValue value) {
    setField(value);
  }

  public quickfix.field.QuoteAttributeValue get(quickfix.field.QuoteAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAttributeValue getQuoteAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.QuoteAttributeValue());
  }

  public boolean isSet(quickfix.field.QuoteAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAttributeValue() {
    return isSetField(2708);
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
