/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class OrderMassActionRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CA";

  public OrderMassActionRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public OrderMassActionRequest (quickfix.field.ClOrdID clOrdID, quickfix.field.MassActionType massActionType, quickfix.field.MassActionScope massActionScope, quickfix.field.TransactTime transactTime) {
    this();
    setField(clOrdID);
    setField(massActionType);
    setField(massActionScope);
    setField(transactTime);
  }

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.SecondaryClOrdID value) {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryClOrdID());
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID() {
    return isSetField(526);
  }

  public void set(quickfix.field.MassActionType value) {
    setField(value);
  }

  public quickfix.field.MassActionType get(quickfix.field.MassActionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MassActionType getMassActionType() throws FieldNotFound {
    return get(new quickfix.field.MassActionType());
  }

  public boolean isSet(quickfix.field.MassActionType field) {
    return isSetField(field);
  }

  public boolean isSetMassActionType() {
    return isSetField(1373);
  }

  public void set(quickfix.field.MassActionScope value) {
    setField(value);
  }

  public quickfix.field.MassActionScope get(quickfix.field.MassActionScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MassActionScope getMassActionScope() throws FieldNotFound {
    return get(new quickfix.field.MassActionScope());
  }

  public boolean isSet(quickfix.field.MassActionScope field) {
    return isSetField(field);
  }

  public boolean isSetMassActionScope() {
    return isSetField(1374);
  }

  public void set(quickfix.field.MassActionReason value) {
    setField(value);
  }

  public quickfix.field.MassActionReason get(quickfix.field.MassActionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MassActionReason getMassActionReason() throws FieldNotFound {
    return get(new quickfix.field.MassActionReason());
  }

  public boolean isSet(quickfix.field.MassActionReason field) {
    return isSetField(field);
  }

  public boolean isSetMassActionReason() {
    return isSetField(2675);
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

  public void set(quickfix.fixlatest.component.TargetMarketSegmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TargetMarketSegmentGrp get(quickfix.fixlatest.component.TargetMarketSegmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TargetMarketSegmentGrp getTargetMarketSegmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TargetMarketSegmentGrp());
  }

  public void set(quickfix.field.NoTargetMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoTargetMarketSegments get(quickfix.field.NoTargetMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetMarketSegments getNoTargetMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoTargetMarketSegments());
  }

  public boolean isSet(quickfix.field.NoTargetMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetMarketSegments() {
    return isSetField(1789);
  }

public static class NoTargetMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1790, 0};

  public NoTargetMarketSegments() {
    super(1789, 1790, ORDER);
  }

  public void set(quickfix.field.TargetMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.TargetMarketSegmentID get(quickfix.field.TargetMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetMarketSegmentID getTargetMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.TargetMarketSegmentID());
  }

  public boolean isSet(quickfix.field.TargetMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetTargetMarketSegmentID() {
    return isSetField(1790);
  }
}

  public void set(quickfix.field.TradingSessionID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionID());
  }

  public boolean isSet(quickfix.field.TradingSessionID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID() {
    return isSetField(336);
  }

  public void set(quickfix.field.TradingSessionSubID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionSubID());
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID() {
    return isSetField(625);
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

  public void set(quickfix.fixlatest.component.TargetParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TargetParties get(quickfix.fixlatest.component.TargetParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TargetParties getTargetPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TargetParties());
  }

  public void set(quickfix.field.NoTargetPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoTargetPartyIDs get(quickfix.field.NoTargetPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetPartyIDs getNoTargetPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoTargetPartyIDs());
  }

  public boolean isSet(quickfix.field.NoTargetPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetPartyIDs() {
    return isSetField(1461);
  }

public static class NoTargetPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1462, 1463, 1464, 1818, 2433, 0};

  public NoTargetPartyIDs() {
    super(1461, 1462, ORDER);
  }

  public void set(quickfix.field.TargetPartyID value) {
    setField(value);
  }

  public quickfix.field.TargetPartyID get(quickfix.field.TargetPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyID getTargetPartyID() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyID());
  }

  public boolean isSet(quickfix.field.TargetPartyID field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyID() {
    return isSetField(1462);
  }

  public void set(quickfix.field.TargetPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.TargetPartyIDSource get(quickfix.field.TargetPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyIDSource getTargetPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyIDSource());
  }

  public boolean isSet(quickfix.field.TargetPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyIDSource() {
    return isSetField(1463);
  }

  public void set(quickfix.field.TargetPartyRole value) {
    setField(value);
  }

  public quickfix.field.TargetPartyRole get(quickfix.field.TargetPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyRole getTargetPartyRole() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyRole());
  }

  public boolean isSet(quickfix.field.TargetPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyRole() {
    return isSetField(1464);
  }

  public void set(quickfix.field.TargetPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.TargetPartyRoleQualifier get(quickfix.field.TargetPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartyRoleQualifier getTargetPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.TargetPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.TargetPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartyRoleQualifier() {
    return isSetField(1818);
  }

  public void set(quickfix.fixlatest.component.TargetPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TargetPtysSubGrp get(quickfix.fixlatest.component.TargetPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TargetPtysSubGrp getTargetPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TargetPtysSubGrp());
  }

  public void set(quickfix.field.NoTargetPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoTargetPartySubIDs get(quickfix.field.NoTargetPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetPartySubIDs getNoTargetPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoTargetPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoTargetPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetPartySubIDs() {
    return isSetField(2433);
  }

public static class NoTargetPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2434, 2435, 0};

  public NoTargetPartySubIDs() {
    super(2433, 2434, ORDER);
  }

  public void set(quickfix.field.TargetPartySubID value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubID get(quickfix.field.TargetPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubID getTargetPartySubID() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubID());
  }

  public boolean isSet(quickfix.field.TargetPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubID() {
    return isSetField(2434);
  }

  public void set(quickfix.field.TargetPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.TargetPartySubIDType get(quickfix.field.TargetPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetPartySubIDType getTargetPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.TargetPartySubIDType());
  }

  public boolean isSet(quickfix.field.TargetPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetTargetPartySubIDType() {
    return isSetField(2435);
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

  public void set(quickfix.field.Price value) {
    setField(value);
  }

  public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Price getPrice() throws FieldNotFound {
    return get(new quickfix.field.Price());
  }

  public boolean isSet(quickfix.field.Price field) {
    return isSetField(field);
  }

  public boolean isSetPrice() {
    return isSetField(44);
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

  public void set(quickfix.field.ComplianceID value) {
    setField(value);
  }

  public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
    return get(new quickfix.field.ComplianceID());
  }

  public boolean isSet(quickfix.field.ComplianceID field) {
    return isSetField(field);
  }

  public boolean isSetComplianceID() {
    return isSetField(376);
  }

  public void set(quickfix.field.ComplianceText value) {
    setField(value);
  }

  public quickfix.field.ComplianceText get(quickfix.field.ComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceText getComplianceText() throws FieldNotFound {
    return get(new quickfix.field.ComplianceText());
  }

  public boolean isSet(quickfix.field.ComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetComplianceText() {
    return isSetField(2404);
  }

  public void set(quickfix.field.EncodedComplianceTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceTextLen get(quickfix.field.EncodedComplianceTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceTextLen getEncodedComplianceTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceTextLen());
  }

  public boolean isSet(quickfix.field.EncodedComplianceTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceTextLen() {
    return isSetField(2351);
  }

  public void set(quickfix.field.EncodedComplianceText value) {
    setField(value);
  }

  public quickfix.field.EncodedComplianceText get(quickfix.field.EncodedComplianceText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedComplianceText getEncodedComplianceText() throws FieldNotFound {
    return get(new quickfix.field.EncodedComplianceText());
  }

  public boolean isSet(quickfix.field.EncodedComplianceText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedComplianceText() {
    return isSetField(2352);
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
