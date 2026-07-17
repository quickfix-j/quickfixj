/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PayManagementRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DY";

  public PayManagementRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PayManagementRequest (quickfix.field.PayRequestID payRequestID, quickfix.field.PayRequestTransType payRequestTransType, quickfix.field.TransactTime transactTime) {
    this();
    setField(payRequestID);
    setField(payRequestTransType);
    setField(transactTime);
  }

  public void set(quickfix.field.PayRequestID value) {
    setField(value);
  }

  public quickfix.field.PayRequestID get(quickfix.field.PayRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayRequestID getPayRequestID() throws FieldNotFound {
    return get(new quickfix.field.PayRequestID());
  }

  public boolean isSet(quickfix.field.PayRequestID field) {
    return isSetField(field);
  }

  public boolean isSetPayRequestID() {
    return isSetField(2812);
  }

  public void set(quickfix.field.PayRequestTransType value) {
    setField(value);
  }

  public quickfix.field.PayRequestTransType get(quickfix.field.PayRequestTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayRequestTransType getPayRequestTransType() throws FieldNotFound {
    return get(new quickfix.field.PayRequestTransType());
  }

  public boolean isSet(quickfix.field.PayRequestTransType field) {
    return isSetField(field);
  }

  public boolean isSetPayRequestTransType() {
    return isSetField(2811);
  }

  public void set(quickfix.field.PayRequestRefID value) {
    setField(value);
  }

  public quickfix.field.PayRequestRefID get(quickfix.field.PayRequestRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayRequestRefID getPayRequestRefID() throws FieldNotFound {
    return get(new quickfix.field.PayRequestRefID());
  }

  public boolean isSet(quickfix.field.PayRequestRefID field) {
    return isSetField(field);
  }

  public boolean isSetPayRequestRefID() {
    return isSetField(2810);
  }

  public void set(quickfix.field.CancelText value) {
    setField(value);
  }

  public quickfix.field.CancelText get(quickfix.field.CancelText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CancelText getCancelText() throws FieldNotFound {
    return get(new quickfix.field.CancelText());
  }

  public boolean isSet(quickfix.field.CancelText field) {
    return isSetField(field);
  }

  public boolean isSetCancelText() {
    return isSetField(2807);
  }

  public void set(quickfix.field.EncodedCancelTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedCancelTextLen get(quickfix.field.EncodedCancelTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCancelTextLen getEncodedCancelTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedCancelTextLen());
  }

  public boolean isSet(quickfix.field.EncodedCancelTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCancelTextLen() {
    return isSetField(2809);
  }

  public void set(quickfix.field.EncodedCancelText value) {
    setField(value);
  }

  public quickfix.field.EncodedCancelText get(quickfix.field.EncodedCancelText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCancelText getEncodedCancelText() throws FieldNotFound {
    return get(new quickfix.field.EncodedCancelText());
  }

  public boolean isSet(quickfix.field.EncodedCancelText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCancelText() {
    return isSetField(2808);
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

  public void set(quickfix.fixlatest.component.RelatedTradeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedTradeGrp get(quickfix.fixlatest.component.RelatedTradeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedTradeGrp getRelatedTradeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedTradeGrp());
  }

  public void set(quickfix.field.NoRelatedTrades value) {
    setField(value);
  }

  public quickfix.field.NoRelatedTrades get(quickfix.field.NoRelatedTrades value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedTrades getNoRelatedTrades() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedTrades());
  }

  public boolean isSet(quickfix.field.NoRelatedTrades field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedTrades() {
    return isSetField(1855);
  }

public static class NoRelatedTrades extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1856, 1857, 2103, 1858, 1859, 1860, 0};

  public NoRelatedTrades() {
    super(1855, 1856, ORDER);
  }

  public void set(quickfix.field.RelatedTradeID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeID get(quickfix.field.RelatedTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeID getRelatedTradeID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeID());
  }

  public boolean isSet(quickfix.field.RelatedTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeID() {
    return isSetField(1856);
  }

  public void set(quickfix.field.RelatedTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeIDSource get(quickfix.field.RelatedTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeIDSource getRelatedTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeIDSource() {
    return isSetField(1857);
  }

  public void set(quickfix.field.RelatedRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource get(quickfix.field.RelatedRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedRegulatoryTradeIDSource getRelatedRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RelatedRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedRegulatoryTradeIDSource() {
    return isSetField(2103);
  }

  public void set(quickfix.field.RelatedTradeDate value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeDate get(quickfix.field.RelatedTradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeDate getRelatedTradeDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeDate());
  }

  public boolean isSet(quickfix.field.RelatedTradeDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeDate() {
    return isSetField(1858);
  }

  public void set(quickfix.field.RelatedTradeMarketID value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeMarketID get(quickfix.field.RelatedTradeMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeMarketID getRelatedTradeMarketID() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeMarketID());
  }

  public boolean isSet(quickfix.field.RelatedTradeMarketID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeMarketID() {
    return isSetField(1859);
  }

  public void set(quickfix.field.RelatedTradeQuantity value) {
    setField(value);
  }

  public quickfix.field.RelatedTradeQuantity get(quickfix.field.RelatedTradeQuantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedTradeQuantity getRelatedTradeQuantity() throws FieldNotFound {
    return get(new quickfix.field.RelatedTradeQuantity());
  }

  public boolean isSet(quickfix.field.RelatedTradeQuantity field) {
    return isSetField(field);
  }

  public boolean isSetRelatedTradeQuantity() {
    return isSetField(1860);
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

  public void set(quickfix.fixlatest.component.PostTradePayment component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PostTradePayment get(quickfix.fixlatest.component.PostTradePayment component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PostTradePayment getPostTradePaymentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PostTradePayment());
  }

  public void set(quickfix.fixlatest.component.SettlDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlDetails get(quickfix.fixlatest.component.SettlDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlDetails getSettlDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlDetails());
  }

  public void set(quickfix.field.NoSettlDetails value) {
    setField(value);
  }

  public quickfix.field.NoSettlDetails get(quickfix.field.NoSettlDetails value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlDetails getNoSettlDetails() throws FieldNotFound {
    return get(new quickfix.field.NoSettlDetails());
  }

  public boolean isSet(quickfix.field.NoSettlDetails field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlDetails() {
    return isSetField(1158);
  }

public static class NoSettlDetails extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1164, 169, 170, 171, 781, 0};

  public NoSettlDetails() {
    super(1158, 1164, ORDER);
  }

  public void set(quickfix.field.SettlObligSource value) {
    setField(value);
  }

  public quickfix.field.SettlObligSource get(quickfix.field.SettlObligSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligSource getSettlObligSource() throws FieldNotFound {
    return get(new quickfix.field.SettlObligSource());
  }

  public boolean isSet(quickfix.field.SettlObligSource field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligSource() {
    return isSetField(1164);
  }

  public void set(quickfix.field.StandInstDbType value) {
    setField(value);
  }

  public quickfix.field.StandInstDbType get(quickfix.field.StandInstDbType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandInstDbType getStandInstDbType() throws FieldNotFound {
    return get(new quickfix.field.StandInstDbType());
  }

  public boolean isSet(quickfix.field.StandInstDbType field) {
    return isSetField(field);
  }

  public boolean isSetStandInstDbType() {
    return isSetField(169);
  }

  public void set(quickfix.field.StandInstDbName value) {
    setField(value);
  }

  public quickfix.field.StandInstDbName get(quickfix.field.StandInstDbName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandInstDbName getStandInstDbName() throws FieldNotFound {
    return get(new quickfix.field.StandInstDbName());
  }

  public boolean isSet(quickfix.field.StandInstDbName field) {
    return isSetField(field);
  }

  public boolean isSetStandInstDbName() {
    return isSetField(170);
  }

  public void set(quickfix.field.StandInstDbID value) {
    setField(value);
  }

  public quickfix.field.StandInstDbID get(quickfix.field.StandInstDbID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandInstDbID getStandInstDbID() throws FieldNotFound {
    return get(new quickfix.field.StandInstDbID());
  }

  public boolean isSet(quickfix.field.StandInstDbID field) {
    return isSetField(field);
  }

  public boolean isSetStandInstDbID() {
    return isSetField(171);
  }

  public void set(quickfix.fixlatest.component.SettlParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlParties get(quickfix.fixlatest.component.SettlParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlParties getSettlPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlParties());
  }

  public void set(quickfix.field.NoSettlPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoSettlPartyIDs get(quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSettlPartyIDs());
  }

  public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlPartyIDs() {
    return isSetField(781);
  }

public static class NoSettlPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {782, 783, 784, 2389, 801, 0};

  public NoSettlPartyIDs() {
    super(781, 782, ORDER);
  }

  public void set(quickfix.field.SettlPartyID value) {
    setField(value);
  }

  public quickfix.field.SettlPartyID get(quickfix.field.SettlPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyID());
  }

  public boolean isSet(quickfix.field.SettlPartyID field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyID() {
    return isSetField(782);
  }

  public void set(quickfix.field.SettlPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.SettlPartyIDSource get(quickfix.field.SettlPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyIDSource());
  }

  public boolean isSet(quickfix.field.SettlPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyIDSource() {
    return isSetField(783);
  }

  public void set(quickfix.field.SettlPartyRole value) {
    setField(value);
  }

  public quickfix.field.SettlPartyRole get(quickfix.field.SettlPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyRole());
  }

  public boolean isSet(quickfix.field.SettlPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyRole() {
    return isSetField(784);
  }

  public void set(quickfix.field.SettlPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.SettlPartyRoleQualifier get(quickfix.field.SettlPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartyRoleQualifier getSettlPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.SettlPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.SettlPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartyRoleQualifier() {
    return isSetField(2389);
  }

  public void set(quickfix.fixlatest.component.SettlPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlPtysSubGrp get(quickfix.fixlatest.component.SettlPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlPtysSubGrp getSettlPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlPtysSubGrp());
  }

  public void set(quickfix.field.NoSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlPartySubIDs() {
    return isSetField(801);
  }

public static class NoSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {785, 786, 0};

  public NoSettlPartySubIDs() {
    super(801, 785, ORDER);
  }

  public void set(quickfix.field.SettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubID());
  }

  public boolean isSet(quickfix.field.SettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubID() {
    return isSetField(785);
  }

  public void set(quickfix.field.SettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.SettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubIDType() {
    return isSetField(786);
  }
}
}
}
}
