/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class CollateralReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BA";

  public CollateralReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public CollateralReport (quickfix.field.CollRptID collRptID, quickfix.field.CollStatus collStatus) {
    this();
    setField(collRptID);
    setField(collStatus);
  }

  public void set(quickfix.field.CollRptID value) {
    setField(value);
  }

  public quickfix.field.CollRptID get(quickfix.field.CollRptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollRptID getCollRptID() throws FieldNotFound {
    return get(new quickfix.field.CollRptID());
  }

  public boolean isSet(quickfix.field.CollRptID field) {
    return isSetField(field);
  }

  public boolean isSetCollRptID() {
    return isSetField(908);
  }

  public void set(quickfix.field.CollInquiryID value) {
    setField(value);
  }

  public quickfix.field.CollInquiryID get(quickfix.field.CollInquiryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollInquiryID getCollInquiryID() throws FieldNotFound {
    return get(new quickfix.field.CollInquiryID());
  }

  public boolean isSet(quickfix.field.CollInquiryID field) {
    return isSetField(field);
  }

  public boolean isSetCollInquiryID() {
    return isSetField(909);
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

  public void set(quickfix.field.CollApplType value) {
    setField(value);
  }

  public quickfix.field.CollApplType get(quickfix.field.CollApplType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollApplType getCollApplType() throws FieldNotFound {
    return get(new quickfix.field.CollApplType());
  }

  public boolean isSet(quickfix.field.CollApplType field) {
    return isSetField(field);
  }

  public boolean isSetCollApplType() {
    return isSetField(1043);
  }

  public void set(quickfix.field.FinancialStatus value) {
    setField(value);
  }

  public quickfix.field.FinancialStatus get(quickfix.field.FinancialStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancialStatus getFinancialStatus() throws FieldNotFound {
    return get(new quickfix.field.FinancialStatus());
  }

  public boolean isSet(quickfix.field.FinancialStatus field) {
    return isSetField(field);
  }

  public boolean isSetFinancialStatus() {
    return isSetField(291);
  }

  public void set(quickfix.field.CollStatus value) {
    setField(value);
  }

  public quickfix.field.CollStatus get(quickfix.field.CollStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollStatus getCollStatus() throws FieldNotFound {
    return get(new quickfix.field.CollStatus());
  }

  public boolean isSet(quickfix.field.CollStatus field) {
    return isSetField(field);
  }

  public boolean isSetCollStatus() {
    return isSetField(910);
  }

  public void set(quickfix.field.TotNumReports value) {
    setField(value);
  }

  public quickfix.field.TotNumReports get(quickfix.field.TotNumReports value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotNumReports getTotNumReports() throws FieldNotFound {
    return get(new quickfix.field.TotNumReports());
  }

  public boolean isSet(quickfix.field.TotNumReports field) {
    return isSetField(field);
  }

  public boolean isSetTotNumReports() {
    return isSetField(911);
  }

  public void set(quickfix.field.LastRptRequested value) {
    setField(value);
  }

  public quickfix.field.LastRptRequested get(quickfix.field.LastRptRequested value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastRptRequested getLastRptRequested() throws FieldNotFound {
    return get(new quickfix.field.LastRptRequested());
  }

  public boolean isSet(quickfix.field.LastRptRequested field) {
    return isSetField(field);
  }

  public boolean isSetLastRptRequested() {
    return isSetField(912);
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

  public void set(quickfix.field.Account value) {
    setField(value);
  }

  public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Account getAccount() throws FieldNotFound {
    return get(new quickfix.field.Account());
  }

  public boolean isSet(quickfix.field.Account field) {
    return isSetField(field);
  }

  public boolean isSetAccount() {
    return isSetField(1);
  }

  public void set(quickfix.field.AccountType value) {
    setField(value);
  }

  public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccountType getAccountType() throws FieldNotFound {
    return get(new quickfix.field.AccountType());
  }

  public boolean isSet(quickfix.field.AccountType field) {
    return isSetField(field);
  }

  public boolean isSetAccountType() {
    return isSetField(581);
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

  public void set(quickfix.field.SecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryOrderID());
  }

  public boolean isSet(quickfix.field.SecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryOrderID() {
    return isSetField(198);
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

  public void set(quickfix.fixlatest.component.ExecCollGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ExecCollGrp get(quickfix.fixlatest.component.ExecCollGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ExecCollGrp getExecCollGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ExecCollGrp());
  }

  public void set(quickfix.field.NoExecs value) {
    setField(value);
  }

  public quickfix.field.NoExecs get(quickfix.field.NoExecs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
    return get(new quickfix.field.NoExecs());
  }

  public boolean isSet(quickfix.field.NoExecs field) {
    return isSetField(field);
  }

  public boolean isSetNoExecs() {
    return isSetField(124);
  }

public static class NoExecs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {17, 0};

  public NoExecs() {
    super(124, 17, ORDER);
  }

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }
}

  public void set(quickfix.fixlatest.component.TrdCollGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdCollGrp get(quickfix.fixlatest.component.TrdCollGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdCollGrp getTrdCollGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdCollGrp());
  }

  public void set(quickfix.field.NoTrades value) {
    setField(value);
  }

  public quickfix.field.NoTrades get(quickfix.field.NoTrades value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrades getNoTrades() throws FieldNotFound {
    return get(new quickfix.field.NoTrades());
  }

  public boolean isSet(quickfix.field.NoTrades field) {
    return isSetField(field);
  }

  public boolean isSetNoTrades() {
    return isSetField(897);
  }

public static class NoTrades extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {571, 818, 0};

  public NoTrades() {
    super(897, 571, ORDER);
  }

  public void set(quickfix.field.TradeReportID value) {
    setField(value);
  }

  public quickfix.field.TradeReportID get(quickfix.field.TradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportID getTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.TradeReportID());
  }

  public boolean isSet(quickfix.field.TradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportID() {
    return isSetField(571);
  }

  public void set(quickfix.field.SecondaryTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SecondaryTradeReportID get(quickfix.field.SecondaryTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTradeReportID getSecondaryTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTradeReportID());
  }

  public boolean isSet(quickfix.field.SecondaryTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTradeReportID() {
    return isSetField(818);
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

  public void set(quickfix.fixlatest.component.FinancingDetails component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FinancingDetails get(quickfix.fixlatest.component.FinancingDetails component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FinancingDetails getFinancingDetailsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FinancingDetails());
  }

  public void set(quickfix.field.SettlDate value) {
    setField(value);
  }

  public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
    return get(new quickfix.field.SettlDate());
  }

  public boolean isSet(quickfix.field.SettlDate field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate() {
    return isSetField(64);
  }

  public void set(quickfix.field.Quantity value) {
    setField(value);
  }

  public quickfix.field.Quantity get(quickfix.field.Quantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Quantity getQuantity() throws FieldNotFound {
    return get(new quickfix.field.Quantity());
  }

  public boolean isSet(quickfix.field.Quantity field) {
    return isSetField(field);
  }

  public boolean isSetQuantity() {
    return isSetField(53);
  }

  public void set(quickfix.field.QtyType value) {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound {
    return get(new quickfix.field.QtyType());
  }

  public boolean isSet(quickfix.field.QtyType field) {
    return isSetField(field);
  }

  public boolean isSetQtyType() {
    return isSetField(854);
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

  public void set(quickfix.field.MarginExcess value) {
    setField(value);
  }

  public quickfix.field.MarginExcess get(quickfix.field.MarginExcess value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginExcess getMarginExcess() throws FieldNotFound {
    return get(new quickfix.field.MarginExcess());
  }

  public boolean isSet(quickfix.field.MarginExcess field) {
    return isSetField(field);
  }

  public boolean isSetMarginExcess() {
    return isSetField(899);
  }

  public void set(quickfix.field.TotalNetValue value) {
    setField(value);
  }

  public quickfix.field.TotalNetValue get(quickfix.field.TotalNetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalNetValue getTotalNetValue() throws FieldNotFound {
    return get(new quickfix.field.TotalNetValue());
  }

  public boolean isSet(quickfix.field.TotalNetValue field) {
    return isSetField(field);
  }

  public boolean isSetTotalNetValue() {
    return isSetField(900);
  }

  public void set(quickfix.field.CashOutstanding value) {
    setField(value);
  }

  public quickfix.field.CashOutstanding get(quickfix.field.CashOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashOutstanding getCashOutstanding() throws FieldNotFound {
    return get(new quickfix.field.CashOutstanding());
  }

  public boolean isSet(quickfix.field.CashOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetCashOutstanding() {
    return isSetField(901);
  }

  public void set(quickfix.fixlatest.component.CollateralAmountGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CollateralAmountGrp get(quickfix.fixlatest.component.CollateralAmountGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CollateralAmountGrp getCollateralAmountGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CollateralAmountGrp());
  }

  public void set(quickfix.field.NoCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoCollateralAmounts get(quickfix.field.NoCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCollateralAmounts getNoCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoCollateralAmounts() {
    return isSetField(1703);
  }

public static class NoCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1704, 1705, 2632, 2090, 2091, 1706, 2092, 2093, 1902, 2350, 2690, 2689, 2840, 2841, 0};

  public NoCollateralAmounts() {
    super(1703, 1704, ORDER);
  }

  public void set(quickfix.field.CurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.CurrentCollateralAmount get(quickfix.field.CurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCollateralAmount getCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.CurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.CurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCollateralAmount() {
    return isSetField(1704);
  }

  public void set(quickfix.field.CollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.CollateralCurrency get(quickfix.field.CollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralCurrency getCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.CollateralCurrency());
  }

  public boolean isSet(quickfix.field.CollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCollateralCurrency() {
    return isSetField(1705);
  }

  public void set(quickfix.field.CollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountType get(quickfix.field.CollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountType getCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountType());
  }

  public boolean isSet(quickfix.field.CollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountType() {
    return isSetField(2632);
  }

  public void set(quickfix.field.CollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRate get(quickfix.field.CollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRate getCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRate());
  }

  public boolean isSet(quickfix.field.CollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRate() {
    return isSetField(2090);
  }

  public void set(quickfix.field.CollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRateCalc get(quickfix.field.CollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRateCalc getCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.CollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRateCalc() {
    return isSetField(2091);
  }

  public void set(quickfix.field.CollateralType value) {
    setField(value);
  }

  public quickfix.field.CollateralType get(quickfix.field.CollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralType getCollateralType() throws FieldNotFound {
    return get(new quickfix.field.CollateralType());
  }

  public boolean isSet(quickfix.field.CollateralType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralType() {
    return isSetField(1706);
  }

  public void set(quickfix.field.CollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketSegmentID get(quickfix.field.CollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketSegmentID getCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketSegmentID() {
    return isSetField(2092);
  }

  public void set(quickfix.field.CollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketID get(quickfix.field.CollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketID getCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketID() {
    return isSetField(2093);
  }

  public void set(quickfix.field.HaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.HaircutIndicator get(quickfix.field.HaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HaircutIndicator getHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.HaircutIndicator());
  }

  public boolean isSet(quickfix.field.HaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetHaircutIndicator() {
    return isSetField(1902);
  }

  public void set(quickfix.field.CollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.CollateralPortfolioID get(quickfix.field.CollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPortfolioID getCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.CollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.CollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPortfolioID() {
    return isSetField(2350);
  }

  public void set(quickfix.field.CollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.CollateralPercentOverage get(quickfix.field.CollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPercentOverage getCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.CollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.CollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPercentOverage() {
    return isSetField(2690);
  }

  public void set(quickfix.field.CollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.CollateralMarketPrice get(quickfix.field.CollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralMarketPrice getCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.CollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.CollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetCollateralMarketPrice() {
    return isSetField(2689);
  }

  public void set(quickfix.field.CollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.CollateralReinvestmentRate get(quickfix.field.CollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralReinvestmentRate getCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.CollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralReinvestmentRate() {
    return isSetField(2840);
  }

  public void set(quickfix.field.UnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRefID get(quickfix.field.UnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRefID getUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRefID() {
    return isSetField(2841);
  }
}

  public void set(quickfix.field.CollateralizationValueDate value) {
    setField(value);
  }

  public quickfix.field.CollateralizationValueDate get(quickfix.field.CollateralizationValueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralizationValueDate getCollateralizationValueDate() throws FieldNotFound {
    return get(new quickfix.field.CollateralizationValueDate());
  }

  public boolean isSet(quickfix.field.CollateralizationValueDate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralizationValueDate() {
    return isSetField(2868);
  }

  public void set(quickfix.field.TradeCollateralization value) {
    setField(value);
  }

  public quickfix.field.TradeCollateralization get(quickfix.field.TradeCollateralization value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeCollateralization getTradeCollateralization() throws FieldNotFound {
    return get(new quickfix.field.TradeCollateralization());
  }

  public boolean isSet(quickfix.field.TradeCollateralization field) {
    return isSetField(field);
  }

  public boolean isSetTradeCollateralization() {
    return isSetField(1936);
  }

  public void set(quickfix.fixlatest.component.RegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RegulatoryTradeIDGrp get(quickfix.fixlatest.component.RegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RegulatoryTradeIDGrp getRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoRegulatoryTradeIDs get(quickfix.field.NoRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRegulatoryTradeIDs getNoRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRegulatoryTradeIDs() {
    return isSetField(1907);
  }

public static class NoRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1903, 1905, 1904, 1906, 2411, 2397, 0};

  public NoRegulatoryTradeIDs() {
    super(1907, 1903, ORDER);
  }

  public void set(quickfix.field.RegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeID get(quickfix.field.RegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeID getRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeID() {
    return isSetField(1903);
  }

  public void set(quickfix.field.RegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDSource get(quickfix.field.RegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDSource getRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDSource() {
    return isSetField(1905);
  }

  public void set(quickfix.field.RegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDEvent get(quickfix.field.RegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDEvent getRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDEvent() {
    return isSetField(1904);
  }

  public void set(quickfix.field.RegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDType get(quickfix.field.RegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDType getRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDType() {
    return isSetField(1906);
  }

  public void set(quickfix.field.RegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.RegulatoryLegRefID get(quickfix.field.RegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryLegRefID getRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.RegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryLegRefID() {
    return isSetField(2411);
  }

  public void set(quickfix.field.RegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTradeIDScope get(quickfix.field.RegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTradeIDScope getRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.RegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTradeIDScope() {
    return isSetField(2397);
  }
}

  public void set(quickfix.fixlatest.component.TrdRegTimestamps component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegTimestamps get(quickfix.fixlatest.component.TrdRegTimestamps component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegTimestamps getTrdRegTimestampsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegTimestamps());
  }

  public void set(quickfix.field.NoTrdRegTimestamps value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegTimestamps get(quickfix.field.NoTrdRegTimestamps value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegTimestamps());
  }

  public boolean isSet(quickfix.field.NoTrdRegTimestamps field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegTimestamps() {
    return isSetField(768);
  }

public static class NoTrdRegTimestamps extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {769, 770, 771, 2839, 1033, 1034, 1035, 1727, 2831, 2832, 2833, 2834, 0};

  public NoTrdRegTimestamps() {
    super(768, 769, ORDER);
  }

  public void set(quickfix.field.TrdRegTimestamp value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestamp get(quickfix.field.TrdRegTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestamp());
  }

  public boolean isSet(quickfix.field.TrdRegTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestamp() {
    return isSetField(769);
  }

  public void set(quickfix.field.TrdRegTimestampType value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestampType get(quickfix.field.TrdRegTimestampType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestampType());
  }

  public boolean isSet(quickfix.field.TrdRegTimestampType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestampType() {
    return isSetField(770);
  }

  public void set(quickfix.field.TrdRegTimestampOrigin value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestampOrigin get(quickfix.field.TrdRegTimestampOrigin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestampOrigin());
  }

  public boolean isSet(quickfix.field.TrdRegTimestampOrigin field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestampOrigin() {
    return isSetField(771);
  }

  public void set(quickfix.field.TrdRegTimestampManualIndicator value) {
    setField(value);
  }

  public quickfix.field.TrdRegTimestampManualIndicator get(quickfix.field.TrdRegTimestampManualIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegTimestampManualIndicator getTrdRegTimestampManualIndicator() throws FieldNotFound {
    return get(new quickfix.field.TrdRegTimestampManualIndicator());
  }

  public boolean isSet(quickfix.field.TrdRegTimestampManualIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegTimestampManualIndicator() {
    return isSetField(2839);
  }

  public void set(quickfix.field.DeskType value) {
    setField(value);
  }

  public quickfix.field.DeskType get(quickfix.field.DeskType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskType getDeskType() throws FieldNotFound {
    return get(new quickfix.field.DeskType());
  }

  public boolean isSet(quickfix.field.DeskType field) {
    return isSetField(field);
  }

  public boolean isSetDeskType() {
    return isSetField(1033);
  }

  public void set(quickfix.field.DeskTypeSource value) {
    setField(value);
  }

  public quickfix.field.DeskTypeSource get(quickfix.field.DeskTypeSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskTypeSource getDeskTypeSource() throws FieldNotFound {
    return get(new quickfix.field.DeskTypeSource());
  }

  public boolean isSet(quickfix.field.DeskTypeSource field) {
    return isSetField(field);
  }

  public boolean isSetDeskTypeSource() {
    return isSetField(1034);
  }

  public void set(quickfix.field.DeskOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.DeskOrderHandlingInst get(quickfix.field.DeskOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskOrderHandlingInst getDeskOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.DeskOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.DeskOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetDeskOrderHandlingInst() {
    return isSetField(1035);
  }

  public void set(quickfix.field.InformationBarrierID value) {
    setField(value);
  }

  public quickfix.field.InformationBarrierID get(quickfix.field.InformationBarrierID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InformationBarrierID getInformationBarrierID() throws FieldNotFound {
    return get(new quickfix.field.InformationBarrierID());
  }

  public boolean isSet(quickfix.field.InformationBarrierID field) {
    return isSetField(field);
  }

  public boolean isSetInformationBarrierID() {
    return isSetField(1727);
  }

  public void set(quickfix.field.NBBOEntryType value) {
    setField(value);
  }

  public quickfix.field.NBBOEntryType get(quickfix.field.NBBOEntryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOEntryType getNBBOEntryType() throws FieldNotFound {
    return get(new quickfix.field.NBBOEntryType());
  }

  public boolean isSet(quickfix.field.NBBOEntryType field) {
    return isSetField(field);
  }

  public boolean isSetNBBOEntryType() {
    return isSetField(2831);
  }

  public void set(quickfix.field.NBBOPrice value) {
    setField(value);
  }

  public quickfix.field.NBBOPrice get(quickfix.field.NBBOPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOPrice getNBBOPrice() throws FieldNotFound {
    return get(new quickfix.field.NBBOPrice());
  }

  public boolean isSet(quickfix.field.NBBOPrice field) {
    return isSetField(field);
  }

  public boolean isSetNBBOPrice() {
    return isSetField(2832);
  }

  public void set(quickfix.field.NBBOQty value) {
    setField(value);
  }

  public quickfix.field.NBBOQty get(quickfix.field.NBBOQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOQty getNBBOQty() throws FieldNotFound {
    return get(new quickfix.field.NBBOQty());
  }

  public boolean isSet(quickfix.field.NBBOQty field) {
    return isSetField(field);
  }

  public boolean isSetNBBOQty() {
    return isSetField(2833);
  }

  public void set(quickfix.field.NBBOSource value) {
    setField(value);
  }

  public quickfix.field.NBBOSource get(quickfix.field.NBBOSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NBBOSource getNBBOSource() throws FieldNotFound {
    return get(new quickfix.field.NBBOSource());
  }

  public boolean isSet(quickfix.field.NBBOSource field) {
    return isSetField(field);
  }

  public boolean isSetNBBOSource() {
    return isSetField(2834);
  }
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

  public void set(quickfix.fixlatest.component.MiscFeesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesGrp get(quickfix.fixlatest.component.MiscFeesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesGrp getMiscFeesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesGrp());
  }

  public void set(quickfix.field.NoMiscFees value) {
    setField(value);
  }

  public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFees());
  }

  public boolean isSet(quickfix.field.NoMiscFees field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFees() {
    return isSetField(136);
  }

public static class NoMiscFees extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {137, 138, 139, 2712, 2633, 891, 2216, 2217, 2713, 0};

  public NoMiscFees() {
    super(136, 137, ORDER);
  }

  public void set(quickfix.field.MiscFeeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmt() {
    return isSetField(137);
  }

  public void set(quickfix.field.MiscFeeCurr value) {
    setField(value);
  }

  public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeCurr());
  }

  public boolean isSet(quickfix.field.MiscFeeCurr field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeCurr() {
    return isSetField(138);
  }

  public void set(quickfix.field.MiscFeeType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeType());
  }

  public boolean isSet(quickfix.field.MiscFeeType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeType() {
    return isSetField(139);
  }

  public void set(quickfix.field.MiscFeeQualifier value) {
    setField(value);
  }

  public quickfix.field.MiscFeeQualifier get(quickfix.field.MiscFeeQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeQualifier getMiscFeeQualifier() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeQualifier());
  }

  public boolean isSet(quickfix.field.MiscFeeQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeQualifier() {
    return isSetField(2712);
  }

  public void set(quickfix.fixlatest.component.MiscFeesSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp get(quickfix.fixlatest.component.MiscFeesSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MiscFeesSubGrp getMiscFeesSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MiscFeesSubGrp());
  }

  public void set(quickfix.field.NoMiscFeeSubTypes value) {
    setField(value);
  }

  public quickfix.field.NoMiscFeeSubTypes get(quickfix.field.NoMiscFeeSubTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFeeSubTypes getNoMiscFeeSubTypes() throws FieldNotFound {
    return get(new quickfix.field.NoMiscFeeSubTypes());
  }

  public boolean isSet(quickfix.field.NoMiscFeeSubTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoMiscFeeSubTypes() {
    return isSetField(2633);
  }

public static class NoMiscFeeSubTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2634, 2635, 2636, 2637, 2638, 0};

  public NoMiscFeeSubTypes() {
    super(2633, 2634, ORDER);
  }

  public void set(quickfix.field.MiscFeeSubType value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubType get(quickfix.field.MiscFeeSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubType getMiscFeeSubType() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubType());
  }

  public boolean isSet(quickfix.field.MiscFeeSubType field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubType() {
    return isSetField(2634);
  }

  public void set(quickfix.field.MiscFeeSubTypeAmt value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeAmt get(quickfix.field.MiscFeeSubTypeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeAmt getMiscFeeSubTypeAmt() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeAmt());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeAmt field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeAmt() {
    return isSetField(2635);
  }

  public void set(quickfix.field.MiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeSubTypeDesc get(quickfix.field.MiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeSubTypeDesc getMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeSubTypeDesc() {
    return isSetField(2636);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen get(quickfix.field.EncodedMiscFeeSubTypeDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDescLen getEncodedMiscFeeSubTypeDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDescLen() {
    return isSetField(2637);
  }

  public void set(quickfix.field.EncodedMiscFeeSubTypeDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc get(quickfix.field.EncodedMiscFeeSubTypeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMiscFeeSubTypeDesc getEncodedMiscFeeSubTypeDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMiscFeeSubTypeDesc());
  }

  public boolean isSet(quickfix.field.EncodedMiscFeeSubTypeDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMiscFeeSubTypeDesc() {
    return isSetField(2638);
  }
}

  public void set(quickfix.field.MiscFeeBasis value) {
    setField(value);
  }

  public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeBasis());
  }

  public boolean isSet(quickfix.field.MiscFeeBasis field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeBasis() {
    return isSetField(891);
  }

  public void set(quickfix.field.MiscFeeRate value) {
    setField(value);
  }

  public quickfix.field.MiscFeeRate get(quickfix.field.MiscFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeRate getMiscFeeRate() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeRate());
  }

  public boolean isSet(quickfix.field.MiscFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeRate() {
    return isSetField(2216);
  }

  public void set(quickfix.field.MiscFeeAmountDue value) {
    setField(value);
  }

  public quickfix.field.MiscFeeAmountDue get(quickfix.field.MiscFeeAmountDue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmountDue getMiscFeeAmountDue() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeAmountDue());
  }

  public boolean isSet(quickfix.field.MiscFeeAmountDue field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmountDue() {
    return isSetField(2217);
  }

  public void set(quickfix.field.MiscFeeDesc value) {
    setField(value);
  }

  public quickfix.field.MiscFeeDesc get(quickfix.field.MiscFeeDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeDesc getMiscFeeDesc() throws FieldNotFound {
    return get(new quickfix.field.MiscFeeDesc());
  }

  public boolean isSet(quickfix.field.MiscFeeDesc field) {
    return isSetField(field);
  }

  public boolean isSetMiscFeeDesc() {
    return isSetField(2713);
  }
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

  public void set(quickfix.field.PriceType value) {
    setField(value);
  }

  public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceType getPriceType() throws FieldNotFound {
    return get(new quickfix.field.PriceType());
  }

  public boolean isSet(quickfix.field.PriceType field) {
    return isSetField(field);
  }

  public boolean isSetPriceType() {
    return isSetField(423);
  }

  public void set(quickfix.field.AccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.AccruedInterestAmt get(quickfix.field.AccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.AccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.AccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestAmt() {
    return isSetField(159);
  }

  public void set(quickfix.field.EndAccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.EndAccruedInterestAmt get(quickfix.field.EndAccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.EndAccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.EndAccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetEndAccruedInterestAmt() {
    return isSetField(920);
  }

  public void set(quickfix.field.StartCash value) {
    setField(value);
  }

  public quickfix.field.StartCash get(quickfix.field.StartCash value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartCash getStartCash() throws FieldNotFound {
    return get(new quickfix.field.StartCash());
  }

  public boolean isSet(quickfix.field.StartCash field) {
    return isSetField(field);
  }

  public boolean isSetStartCash() {
    return isSetField(921);
  }

  public void set(quickfix.field.EndCash value) {
    setField(value);
  }

  public quickfix.field.EndCash get(quickfix.field.EndCash value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndCash getEndCash() throws FieldNotFound {
    return get(new quickfix.field.EndCash());
  }

  public boolean isSet(quickfix.field.EndCash field) {
    return isSetField(field);
  }

  public boolean isSetEndCash() {
    return isSetField(922);
  }

  public void set(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData get(quickfix.fixlatest.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SpreadOrBenchmarkCurveData());
  }

  public void set(quickfix.fixlatest.component.Stipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Stipulations get(quickfix.fixlatest.component.Stipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Stipulations getStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Stipulations());
  }

  public void set(quickfix.field.NoStipulations value) {
    setField(value);
  }

  public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoStipulations());
  }

  public boolean isSet(quickfix.field.NoStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoStipulations() {
    return isSetField(232);
  }

public static class NoStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {233, 234, 0};

  public NoStipulations() {
    super(232, 233, ORDER);
  }

  public void set(quickfix.field.StipulationType value) {
    setField(value);
  }

  public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
    return get(new quickfix.field.StipulationType());
  }

  public boolean isSet(quickfix.field.StipulationType field) {
    return isSetField(field);
  }

  public boolean isSetStipulationType() {
    return isSetField(233);
  }

  public void set(quickfix.field.StipulationValue value) {
    setField(value);
  }

  public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.StipulationValue());
  }

  public boolean isSet(quickfix.field.StipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetStipulationValue() {
    return isSetField(234);
  }
}

  public void set(quickfix.fixlatest.component.SettlInstructionsData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlInstructionsData get(quickfix.fixlatest.component.SettlInstructionsData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlInstructionsData getSettlInstructionsDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlInstructionsData());
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

  public void set(quickfix.field.RegulatoryReportType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportType get(quickfix.field.RegulatoryReportType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportType getRegulatoryReportType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportType());
  }

  public boolean isSet(quickfix.field.RegulatoryReportType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportType() {
    return isSetField(1934);
  }

  public void set(quickfix.field.RegulatoryReportTypeBusinessDate value) {
    setField(value);
  }

  public quickfix.field.RegulatoryReportTypeBusinessDate get(quickfix.field.RegulatoryReportTypeBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryReportTypeBusinessDate getRegulatoryReportTypeBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryReportTypeBusinessDate());
  }

  public boolean isSet(quickfix.field.RegulatoryReportTypeBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryReportTypeBusinessDate() {
    return isSetField(2869);
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

  public void set(quickfix.field.WireReference value) {
    setField(value);
  }

  public quickfix.field.WireReference get(quickfix.field.WireReference value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.WireReference getWireReference() throws FieldNotFound {
    return get(new quickfix.field.WireReference());
  }

  public boolean isSet(quickfix.field.WireReference field) {
    return isSetField(field);
  }

  public boolean isSetWireReference() {
    return isSetField(2486);
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

  public void set(quickfix.field.TransactionID value) {
    setField(value);
  }

  public quickfix.field.TransactionID get(quickfix.field.TransactionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionID getTransactionID() throws FieldNotFound {
    return get(new quickfix.field.TransactionID());
  }

  public boolean isSet(quickfix.field.TransactionID field) {
    return isSetField(field);
  }

  public boolean isSetTransactionID() {
    return isSetField(2485);
  }

  public void set(quickfix.field.FirmTransactionID value) {
    setField(value);
  }

  public quickfix.field.FirmTransactionID get(quickfix.field.FirmTransactionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTransactionID getFirmTransactionID() throws FieldNotFound {
    return get(new quickfix.field.FirmTransactionID());
  }

  public boolean isSet(quickfix.field.FirmTransactionID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTransactionID() {
    return isSetField(2484);
  }

  public void set(quickfix.fixlatest.component.FundingSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FundingSourceGrp get(quickfix.fixlatest.component.FundingSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FundingSourceGrp getFundingSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FundingSourceGrp());
  }

  public void set(quickfix.field.NoFundingSources value) {
    setField(value);
  }

  public quickfix.field.NoFundingSources get(quickfix.field.NoFundingSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFundingSources getNoFundingSources() throws FieldNotFound {
    return get(new quickfix.field.NoFundingSources());
  }

  public boolean isSet(quickfix.field.NoFundingSources field) {
    return isSetField(field);
  }

  public boolean isSetNoFundingSources() {
    return isSetField(2849);
  }

public static class NoFundingSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2846, 2848, 2847, 0};

  public NoFundingSources() {
    super(2849, 2846, ORDER);
  }

  public void set(quickfix.field.FundingSource value) {
    setField(value);
  }

  public quickfix.field.FundingSource get(quickfix.field.FundingSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSource getFundingSource() throws FieldNotFound {
    return get(new quickfix.field.FundingSource());
  }

  public boolean isSet(quickfix.field.FundingSource field) {
    return isSetField(field);
  }

  public boolean isSetFundingSource() {
    return isSetField(2846);
  }

  public void set(quickfix.field.FundingSourceMarketValue value) {
    setField(value);
  }

  public quickfix.field.FundingSourceMarketValue get(quickfix.field.FundingSourceMarketValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSourceMarketValue getFundingSourceMarketValue() throws FieldNotFound {
    return get(new quickfix.field.FundingSourceMarketValue());
  }

  public boolean isSet(quickfix.field.FundingSourceMarketValue field) {
    return isSetField(field);
  }

  public boolean isSetFundingSourceMarketValue() {
    return isSetField(2848);
  }

  public void set(quickfix.field.FundingSourceCurrency value) {
    setField(value);
  }

  public quickfix.field.FundingSourceCurrency get(quickfix.field.FundingSourceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSourceCurrency getFundingSourceCurrency() throws FieldNotFound {
    return get(new quickfix.field.FundingSourceCurrency());
  }

  public boolean isSet(quickfix.field.FundingSourceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetFundingSourceCurrency() {
    return isSetField(2847);
  }
}

  public void set(quickfix.fixlatest.component.TransactionAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TransactionAttributeGrp get(quickfix.fixlatest.component.TransactionAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TransactionAttributeGrp getTransactionAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TransactionAttributeGrp());
  }

  public void set(quickfix.field.NoTransactionAttributes value) {
    setField(value);
  }

  public quickfix.field.NoTransactionAttributes get(quickfix.field.NoTransactionAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTransactionAttributes getNoTransactionAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoTransactionAttributes());
  }

  public boolean isSet(quickfix.field.NoTransactionAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoTransactionAttributes() {
    return isSetField(2871);
  }

public static class NoTransactionAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2872, 2873, 0};

  public NoTransactionAttributes() {
    super(2871, 2872, ORDER);
  }

  public void set(quickfix.field.TransactionAttributeType value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeType get(quickfix.field.TransactionAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeType getTransactionAttributeType() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeType());
  }

  public boolean isSet(quickfix.field.TransactionAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeType() {
    return isSetField(2872);
  }

  public void set(quickfix.field.TransactionAttributeValue value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeValue get(quickfix.field.TransactionAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeValue getTransactionAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeValue());
  }

  public boolean isSet(quickfix.field.TransactionAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeValue() {
    return isSetField(2873);
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
