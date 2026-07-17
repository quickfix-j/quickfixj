/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class CrossOrderCancelRequest extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "u";

  public CrossOrderCancelRequest() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public CrossOrderCancelRequest (quickfix.field.CrossID crossID, quickfix.field.OrigCrossID origCrossID, quickfix.field.CrossType crossType, quickfix.field.CrossPrioritization crossPrioritization, quickfix.field.TransactTime transactTime) {
    this();
    setField(crossID);
    setField(origCrossID);
    setField(crossType);
    setField(crossPrioritization);
    setField(transactTime);
  }

  public void set(quickfix.field.OrderID value) {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound {
    return get(new quickfix.field.OrderID());
  }

  public boolean isSet(quickfix.field.OrderID field) {
    return isSetField(field);
  }

  public boolean isSetOrderID() {
    return isSetField(37);
  }

  public void set(quickfix.field.OrderRequestID value) {
    setField(value);
  }

  public quickfix.field.OrderRequestID get(quickfix.field.OrderRequestID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRequestID getOrderRequestID() throws FieldNotFound {
    return get(new quickfix.field.OrderRequestID());
  }

  public boolean isSet(quickfix.field.OrderRequestID field) {
    return isSetField(field);
  }

  public boolean isSetOrderRequestID() {
    return isSetField(2422);
  }

  public void set(quickfix.field.CrossID value) {
    setField(value);
  }

  public quickfix.field.CrossID get(quickfix.field.CrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossID getCrossID() throws FieldNotFound {
    return get(new quickfix.field.CrossID());
  }

  public boolean isSet(quickfix.field.CrossID field) {
    return isSetField(field);
  }

  public boolean isSetCrossID() {
    return isSetField(548);
  }

  public void set(quickfix.field.OrigCrossID value) {
    setField(value);
  }

  public quickfix.field.OrigCrossID get(quickfix.field.OrigCrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigCrossID getOrigCrossID() throws FieldNotFound {
    return get(new quickfix.field.OrigCrossID());
  }

  public boolean isSet(quickfix.field.OrigCrossID field) {
    return isSetField(field);
  }

  public boolean isSetOrigCrossID() {
    return isSetField(551);
  }

  public void set(quickfix.field.HostCrossID value) {
    setField(value);
  }

  public quickfix.field.HostCrossID get(quickfix.field.HostCrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HostCrossID getHostCrossID() throws FieldNotFound {
    return get(new quickfix.field.HostCrossID());
  }

  public boolean isSet(quickfix.field.HostCrossID field) {
    return isSetField(field);
  }

  public boolean isSetHostCrossID() {
    return isSetField(961);
  }

  public void set(quickfix.field.CrossType value) {
    setField(value);
  }

  public quickfix.field.CrossType get(quickfix.field.CrossType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossType getCrossType() throws FieldNotFound {
    return get(new quickfix.field.CrossType());
  }

  public boolean isSet(quickfix.field.CrossType field) {
    return isSetField(field);
  }

  public boolean isSetCrossType() {
    return isSetField(549);
  }

  public void set(quickfix.field.CrossPrioritization value) {
    setField(value);
  }

  public quickfix.field.CrossPrioritization get(quickfix.field.CrossPrioritization value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossPrioritization getCrossPrioritization() throws FieldNotFound {
    return get(new quickfix.field.CrossPrioritization());
  }

  public boolean isSet(quickfix.field.CrossPrioritization field) {
    return isSetField(field);
  }

  public boolean isSetCrossPrioritization() {
    return isSetField(550);
  }

  public void set(quickfix.fixlatest.component.RootParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RootParties get(quickfix.fixlatest.component.RootParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RootParties getRootPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RootParties());
  }

  public void set(quickfix.field.NoRootPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoRootPartyIDs get(quickfix.field.NoRootPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRootPartyIDs getNoRootPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRootPartyIDs());
  }

  public boolean isSet(quickfix.field.NoRootPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRootPartyIDs() {
    return isSetField(1116);
  }

public static class NoRootPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1117, 1118, 1119, 2388, 1120, 0};

  public NoRootPartyIDs() {
    super(1116, 1117, ORDER);
  }

  public void set(quickfix.field.RootPartyID value) {
    setField(value);
  }

  public quickfix.field.RootPartyID get(quickfix.field.RootPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyID getRootPartyID() throws FieldNotFound {
    return get(new quickfix.field.RootPartyID());
  }

  public boolean isSet(quickfix.field.RootPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyID() {
    return isSetField(1117);
  }

  public void set(quickfix.field.RootPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RootPartyIDSource get(quickfix.field.RootPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyIDSource getRootPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RootPartyIDSource());
  }

  public boolean isSet(quickfix.field.RootPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyIDSource() {
    return isSetField(1118);
  }

  public void set(quickfix.field.RootPartyRole value) {
    setField(value);
  }

  public quickfix.field.RootPartyRole get(quickfix.field.RootPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRole getRootPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRole());
  }

  public boolean isSet(quickfix.field.RootPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRole() {
    return isSetField(1119);
  }

  public void set(quickfix.field.RootPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RootPartyRoleQualifier get(quickfix.field.RootPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRoleQualifier getRootPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RootPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRoleQualifier() {
    return isSetField(2388);
  }

  public void set(quickfix.fixlatest.component.RootSubParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RootSubParties get(quickfix.fixlatest.component.RootSubParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RootSubParties getRootSubPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RootSubParties());
  }

  public void set(quickfix.field.NoRootPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRootPartySubIDs get(quickfix.field.NoRootPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRootPartySubIDs getNoRootPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRootPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoRootPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRootPartySubIDs() {
    return isSetField(1120);
  }

public static class NoRootPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1121, 1122, 0};

  public NoRootPartySubIDs() {
    super(1120, 1121, ORDER);
  }

  public void set(quickfix.field.RootPartySubID value) {
    setField(value);
  }

  public quickfix.field.RootPartySubID get(quickfix.field.RootPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubID getRootPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubID());
  }

  public boolean isSet(quickfix.field.RootPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubID() {
    return isSetField(1121);
  }

  public void set(quickfix.field.RootPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RootPartySubIDType get(quickfix.field.RootPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubIDType getRootPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubIDType());
  }

  public boolean isSet(quickfix.field.RootPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubIDType() {
    return isSetField(1122);
  }
}
}

  public void set(quickfix.fixlatest.component.SideCrossOrdCxlGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCrossOrdCxlGrp get(quickfix.fixlatest.component.SideCrossOrdCxlGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCrossOrdCxlGrp getSideCrossOrdCxlGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCrossOrdCxlGrp());
  }

  public void set(quickfix.field.NoSides value) {
    setField(value);
  }

  public quickfix.field.NoSides get(quickfix.field.NoSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSides getNoSides() throws FieldNotFound {
    return get(new quickfix.field.NoSides());
  }

  public boolean isSet(quickfix.field.NoSides field) {
    return isSetField(field);
  }

  public boolean isSetNoSides() {
    return isSetField(552);
  }

public static class NoSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {54, 41, 11, 526, 583, 586, 453, 229, 75, 38, 152, 516, 468, 469, 376, 2404, 2351, 2352, 58, 354, 355, 0};

  public NoSides() {
    super(552, 54, ORDER);
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

  public void set(quickfix.field.OrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.OrigClOrdID());
  }

  public boolean isSet(quickfix.field.OrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID() {
    return isSetField(41);
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

  public void set(quickfix.field.ClOrdLinkID value) {
    setField(value);
  }

  public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdLinkID());
  }

  public boolean isSet(quickfix.field.ClOrdLinkID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdLinkID() {
    return isSetField(583);
  }

  public void set(quickfix.field.OrigOrdModTime value) {
    setField(value);
  }

  public quickfix.field.OrigOrdModTime get(quickfix.field.OrigOrdModTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
    return get(new quickfix.field.OrigOrdModTime());
  }

  public boolean isSet(quickfix.field.OrigOrdModTime field) {
    return isSetField(field);
  }

  public boolean isSetOrigOrdModTime() {
    return isSetField(586);
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

  public void set(quickfix.field.TradeOriginationDate value) {
    setField(value);
  }

  public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
    return get(new quickfix.field.TradeOriginationDate());
  }

  public boolean isSet(quickfix.field.TradeOriginationDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeOriginationDate() {
    return isSetField(229);
  }

  public void set(quickfix.field.TradeDate value) {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
    return get(new quickfix.field.TradeDate());
  }

  public boolean isSet(quickfix.field.TradeDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeDate() {
    return isSetField(75);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
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

  public void set(quickfix.fixlatest.component.InstrmtLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrmtLegGrp get(quickfix.fixlatest.component.InstrmtLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrmtLegGrp getInstrmtLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrmtLegGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 2497, 2498, 2499, 2496, 2495, 2511, 2510, 2512, 2509, 2500, 42198, 42200, 42203, 2502, 2501, 2503, 2507, 2505, 2494, 2493, 2514, 2513, 2506, 2504, 2508, 0};

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

  public void set(quickfix.fixlatest.component.LegFinancingDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegFinancingDetails get(quickfix.fixlatest.component.LegFinancingDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegFinancingDetails getLegFinancingDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegFinancingDetails());
  }
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
}
