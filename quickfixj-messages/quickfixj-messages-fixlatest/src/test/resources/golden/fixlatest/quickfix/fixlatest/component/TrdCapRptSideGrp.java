/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TrdCapRptSideGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {552, };
  protected int[] getGroupFields() { return componentGroups; }

  public TrdCapRptSideGrp() {
    super();
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
  private static final int[]  ORDER = {54, 2102, 1427, 1428, 1429, 1009, 1597, 1599, 1598, 1005, 1506, 1507, 1006, 1007, 83, 1008, 430, 1154, 1155, 453, 1671, 1, 660, 581, 522, 1630, 81, 575, 576, 1971, 2671, 2418, 578, 579, 376, 2404, 2351, 2352, 377, 582, 336, 625, 943, 2356, 12, 13, 479, 1233, 1238, 497, 2639, 157, 230, 158, 159, 738, 920, 921, 922, 238, 237, 118, 119, 155, 156, 77, 58, 354, 355, 752, 518, 232, 136, 825, 826, 1848, 1730, 2771, 2759, 2767, 1853, 1854, 1852, 591, 70, 78, 1016, 1158, 1072, 1057, 1139, 1690, 1115, 1444, 1851, 37, 198, 11, 526, 66, 1080, 1081, 1431, 73, 1091, 40, 44, 99, 18, 39, 38, 152, 516, 468, 469, 151, 14, 59, 126, 1624, 2362, 1629, 1916, 1138, 1082, 1608, 2828, 1083, 1084, 1085, 1086, 1087, 1088, 528, 529, 775, 1432, 1724, 2593, 2704, 821, 1093, 483, 586, 2766, 1031, 1032, 702, 1855, 1861, 1980, 2344, 29, 2334, 2335, 2361, 2691, 0};

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

  public void set(quickfix.field.ShortMarkingExemptIndicator value) {
    setField(value);
  }

  public quickfix.field.ShortMarkingExemptIndicator get(quickfix.field.ShortMarkingExemptIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortMarkingExemptIndicator getShortMarkingExemptIndicator() throws FieldNotFound {
    return get(new quickfix.field.ShortMarkingExemptIndicator());
  }

  public boolean isSet(quickfix.field.ShortMarkingExemptIndicator field) {
    return isSetField(field);
  }

  public boolean isSetShortMarkingExemptIndicator() {
    return isSetField(2102);
  }

  public void set(quickfix.field.SideExecID value) {
    setField(value);
  }

  public quickfix.field.SideExecID get(quickfix.field.SideExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecID getSideExecID() throws FieldNotFound {
    return get(new quickfix.field.SideExecID());
  }

  public boolean isSet(quickfix.field.SideExecID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecID() {
    return isSetField(1427);
  }

  public void set(quickfix.field.OrderDelay value) {
    setField(value);
  }

  public quickfix.field.OrderDelay get(quickfix.field.OrderDelay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelay getOrderDelay() throws FieldNotFound {
    return get(new quickfix.field.OrderDelay());
  }

  public boolean isSet(quickfix.field.OrderDelay field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelay() {
    return isSetField(1428);
  }

  public void set(quickfix.field.OrderDelayUnit value) {
    setField(value);
  }

  public quickfix.field.OrderDelayUnit get(quickfix.field.OrderDelayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelayUnit getOrderDelayUnit() throws FieldNotFound {
    return get(new quickfix.field.OrderDelayUnit());
  }

  public boolean isSet(quickfix.field.OrderDelayUnit field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelayUnit() {
    return isSetField(1429);
  }

  public void set(quickfix.field.SideLastQty value) {
    setField(value);
  }

  public quickfix.field.SideLastQty get(quickfix.field.SideLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLastQty getSideLastQty() throws FieldNotFound {
    return get(new quickfix.field.SideLastQty());
  }

  public boolean isSet(quickfix.field.SideLastQty field) {
    return isSetField(field);
  }

  public boolean isSetSideLastQty() {
    return isSetField(1009);
  }

  public void set(quickfix.field.SideClearingTradePrice value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePrice get(quickfix.field.SideClearingTradePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePrice getSideClearingTradePrice() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePrice());
  }

  public boolean isSet(quickfix.field.SideClearingTradePrice field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePrice() {
    return isSetField(1597);
  }

  public void set(quickfix.field.SidePriceDifferential value) {
    setField(value);
  }

  public quickfix.field.SidePriceDifferential get(quickfix.field.SidePriceDifferential value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SidePriceDifferential getSidePriceDifferential() throws FieldNotFound {
    return get(new quickfix.field.SidePriceDifferential());
  }

  public boolean isSet(quickfix.field.SidePriceDifferential field) {
    return isSetField(field);
  }

  public boolean isSetSidePriceDifferential() {
    return isSetField(1599);
  }

  public void set(quickfix.field.SideClearingTradePriceType value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePriceType get(quickfix.field.SideClearingTradePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePriceType getSideClearingTradePriceType() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePriceType());
  }

  public boolean isSet(quickfix.field.SideClearingTradePriceType field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePriceType() {
    return isSetField(1598);
  }

  public void set(quickfix.field.SideTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportID());
  }

  public boolean isSet(quickfix.field.SideTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportID() {
    return isSetField(1005);
  }

  public void set(quickfix.field.SideTradeID value) {
    setField(value);
  }

  public quickfix.field.SideTradeID get(quickfix.field.SideTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeID getSideTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeID());
  }

  public boolean isSet(quickfix.field.SideTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeID() {
    return isSetField(1506);
  }

  public void set(quickfix.field.SideOrigTradeID value) {
    setField(value);
  }

  public quickfix.field.SideOrigTradeID get(quickfix.field.SideOrigTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideOrigTradeID getSideOrigTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideOrigTradeID());
  }

  public boolean isSet(quickfix.field.SideOrigTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideOrigTradeID() {
    return isSetField(1507);
  }

  public void set(quickfix.field.SideFillStationCd value) {
    setField(value);
  }

  public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound {
    return get(new quickfix.field.SideFillStationCd());
  }

  public boolean isSet(quickfix.field.SideFillStationCd field) {
    return isSetField(field);
  }

  public boolean isSetSideFillStationCd() {
    return isSetField(1006);
  }

  public void set(quickfix.field.SideReasonCd value) {
    setField(value);
  }

  public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound {
    return get(new quickfix.field.SideReasonCd());
  }

  public boolean isSet(quickfix.field.SideReasonCd field) {
    return isSetField(field);
  }

  public boolean isSetSideReasonCd() {
    return isSetField(1007);
  }

  public void set(quickfix.field.RptSeq value) {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
    return get(new quickfix.field.RptSeq());
  }

  public boolean isSet(quickfix.field.RptSeq field) {
    return isSetField(field);
  }

  public boolean isSetRptSeq() {
    return isSetField(83);
  }

  public void set(quickfix.field.SideTrdSubTyp value) {
    setField(value);
  }

  public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdSubTyp());
  }

  public boolean isSet(quickfix.field.SideTrdSubTyp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdSubTyp() {
    return isSetField(1008);
  }

  public void set(quickfix.field.NetGrossInd value) {
    setField(value);
  }

  public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
    return get(new quickfix.field.NetGrossInd());
  }

  public boolean isSet(quickfix.field.NetGrossInd field) {
    return isSetField(field);
  }

  public boolean isSetNetGrossInd() {
    return isSetField(430);
  }

  public void set(quickfix.field.SideCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCurrency get(quickfix.field.SideCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrency getSideCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCurrency());
  }

  public boolean isSet(quickfix.field.SideCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrency() {
    return isSetField(1154);
  }

  public void set(quickfix.field.SideSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SideSettlCurrency get(quickfix.field.SideSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideSettlCurrency getSideSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideSettlCurrency());
  }

  public boolean isSet(quickfix.field.SideSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideSettlCurrency() {
    return isSetField(1155);
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

  public void set(quickfix.field.AcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AcctIDSource());
  }

  public boolean isSet(quickfix.field.AcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAcctIDSource() {
    return isSetField(660);
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

  public void set(quickfix.field.OwnerType value) {
    setField(value);
  }

  public quickfix.field.OwnerType get(quickfix.field.OwnerType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OwnerType getOwnerType() throws FieldNotFound {
    return get(new quickfix.field.OwnerType());
  }

  public boolean isSet(quickfix.field.OwnerType field) {
    return isSetField(field);
  }

  public boolean isSetOwnerType() {
    return isSetField(522);
  }

  public void set(quickfix.fixlatest.component.LimitAmts component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LimitAmts get(quickfix.fixlatest.component.LimitAmts component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LimitAmts getLimitAmtsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LimitAmts());
  }

  public void set(quickfix.field.NoLimitAmts value) {
    setField(value);
  }

  public quickfix.field.NoLimitAmts get(quickfix.field.NoLimitAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLimitAmts getNoLimitAmts() throws FieldNotFound {
    return get(new quickfix.field.NoLimitAmts());
  }

  public boolean isSet(quickfix.field.NoLimitAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoLimitAmts() {
    return isSetField(1630);
  }

public static class NoLimitAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1631, 1632, 1633, 2394, 2395, 1634, 2396, 0};

  public NoLimitAmts() {
    super(1630, 1631, ORDER);
  }

  public void set(quickfix.field.LimitAmtType value) {
    setField(value);
  }

  public quickfix.field.LimitAmtType get(quickfix.field.LimitAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtType getLimitAmtType() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtType());
  }

  public boolean isSet(quickfix.field.LimitAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtType() {
    return isSetField(1631);
  }

  public void set(quickfix.field.LastLimitAmt value) {
    setField(value);
  }

  public quickfix.field.LastLimitAmt get(quickfix.field.LastLimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastLimitAmt getLastLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LastLimitAmt());
  }

  public boolean isSet(quickfix.field.LastLimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLastLimitAmt() {
    return isSetField(1632);
  }

  public void set(quickfix.field.LimitAmtRemaining value) {
    setField(value);
  }

  public quickfix.field.LimitAmtRemaining get(quickfix.field.LimitAmtRemaining value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtRemaining getLimitAmtRemaining() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtRemaining());
  }

  public boolean isSet(quickfix.field.LimitAmtRemaining field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtRemaining() {
    return isSetField(1633);
  }

  public void set(quickfix.field.LimitUtilizationAmt value) {
    setField(value);
  }

  public quickfix.field.LimitUtilizationAmt get(quickfix.field.LimitUtilizationAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitUtilizationAmt getLimitUtilizationAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitUtilizationAmt());
  }

  public boolean isSet(quickfix.field.LimitUtilizationAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitUtilizationAmt() {
    return isSetField(2394);
  }

  public void set(quickfix.field.LimitAmt value) {
    setField(value);
  }

  public quickfix.field.LimitAmt get(quickfix.field.LimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmt getLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitAmt());
  }

  public boolean isSet(quickfix.field.LimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmt() {
    return isSetField(2395);
  }

  public void set(quickfix.field.LimitAmtCurrency value) {
    setField(value);
  }

  public quickfix.field.LimitAmtCurrency get(quickfix.field.LimitAmtCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtCurrency getLimitAmtCurrency() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtCurrency());
  }

  public boolean isSet(quickfix.field.LimitAmtCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtCurrency() {
    return isSetField(1634);
  }

  public void set(quickfix.field.LimitRole value) {
    setField(value);
  }

  public quickfix.field.LimitRole get(quickfix.field.LimitRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitRole getLimitRole() throws FieldNotFound {
    return get(new quickfix.field.LimitRole());
  }

  public boolean isSet(quickfix.field.LimitRole field) {
    return isSetField(field);
  }

  public boolean isSetLimitRole() {
    return isSetField(2396);
  }
}

  public void set(quickfix.field.ProcessCode value) {
    setField(value);
  }

  public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
    return get(new quickfix.field.ProcessCode());
  }

  public boolean isSet(quickfix.field.ProcessCode field) {
    return isSetField(field);
  }

  public boolean isSetProcessCode() {
    return isSetField(81);
  }

  public void set(quickfix.field.OddLot value) {
    setField(value);
  }

  public quickfix.field.OddLot get(quickfix.field.OddLot value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OddLot getOddLot() throws FieldNotFound {
    return get(new quickfix.field.OddLot());
  }

  public boolean isSet(quickfix.field.OddLot field) {
    return isSetField(field);
  }

  public boolean isSetOddLot() {
    return isSetField(575);
  }

  public void set(quickfix.fixlatest.component.ClrInstGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClrInstGrp get(quickfix.fixlatest.component.ClrInstGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClrInstGrp getClrInstGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClrInstGrp());
  }

  public void set(quickfix.field.NoClearingInstructions value) {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoClearingInstructions());
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions() {
    return isSetField(576);
  }

public static class NoClearingInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {577, 0};

  public NoClearingInstructions() {
    super(576, 577, ORDER);
  }

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
}

  public void set(quickfix.fixlatest.component.SideRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideRegulatoryTradeIDGrp get(quickfix.fixlatest.component.SideRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideRegulatoryTradeIDGrp getSideRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoSideRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoSideRegulatoryTradeIDs get(quickfix.field.NoSideRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideRegulatoryTradeIDs getNoSideRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSideRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoSideRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSideRegulatoryTradeIDs() {
    return isSetField(1971);
  }

public static class NoSideRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1972, 1973, 1974, 1975, 2416, 2398, 0};

  public NoSideRegulatoryTradeIDs() {
    super(1971, 1972, ORDER);
  }

  public void set(quickfix.field.SideRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeID get(quickfix.field.SideRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeID getSideRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeID() {
    return isSetField(1972);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDSource get(quickfix.field.SideRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDSource getSideRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDSource() {
    return isSetField(1973);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDEvent get(quickfix.field.SideRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDEvent getSideRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDEvent() {
    return isSetField(1974);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDType get(quickfix.field.SideRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDType getSideRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDType() {
    return isSetField(1975);
  }

  public void set(quickfix.field.SideRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryLegRefID get(quickfix.field.SideRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryLegRefID getSideRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryLegRefID() {
    return isSetField(2416);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDScope get(quickfix.field.SideRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDScope getSideRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDScope() {
    return isSetField(2398);
  }
}

  public void set(quickfix.field.SideTradeReportingIndicator value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportingIndicator get(quickfix.field.SideTradeReportingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportingIndicator getSideTradeReportingIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportingIndicator());
  }

  public boolean isSet(quickfix.field.SideTradeReportingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportingIndicator() {
    return isSetField(2671);
  }

  public void set(quickfix.field.FirmTradeEventID value) {
    setField(value);
  }

  public quickfix.field.FirmTradeEventID get(quickfix.field.FirmTradeEventID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeEventID getFirmTradeEventID() throws FieldNotFound {
    return get(new quickfix.field.FirmTradeEventID());
  }

  public boolean isSet(quickfix.field.FirmTradeEventID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTradeEventID() {
    return isSetField(2418);
  }

  public void set(quickfix.field.TradeInputSource value) {
    setField(value);
  }

  public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
    return get(new quickfix.field.TradeInputSource());
  }

  public boolean isSet(quickfix.field.TradeInputSource field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputSource() {
    return isSetField(578);
  }

  public void set(quickfix.field.TradeInputDevice value) {
    setField(value);
  }

  public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
    return get(new quickfix.field.TradeInputDevice());
  }

  public boolean isSet(quickfix.field.TradeInputDevice field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputDevice() {
    return isSetField(579);
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

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
  }

  public void set(quickfix.field.CustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.CustOrderCapacity());
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity() {
    return isSetField(582);
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

  public void set(quickfix.field.TimeBracket value) {
    setField(value);
  }

  public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
    return get(new quickfix.field.TimeBracket());
  }

  public boolean isSet(quickfix.field.TimeBracket field) {
    return isSetField(field);
  }

  public boolean isSetTimeBracket() {
    return isSetField(943);
  }

  public void set(quickfix.field.RemunerationIndicator value) {
    setField(value);
  }

  public quickfix.field.RemunerationIndicator get(quickfix.field.RemunerationIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RemunerationIndicator getRemunerationIndicator() throws FieldNotFound {
    return get(new quickfix.field.RemunerationIndicator());
  }

  public boolean isSet(quickfix.field.RemunerationIndicator field) {
    return isSetField(field);
  }

  public boolean isSetRemunerationIndicator() {
    return isSetField(2356);
  }

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
  }

  public void set(quickfix.fixlatest.component.CommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionDataGrp get(quickfix.fixlatest.component.CommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionDataGrp getCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionDataGrp());
  }

  public void set(quickfix.field.NoCommissions value) {
    setField(value);
  }

  public quickfix.field.NoCommissions get(quickfix.field.NoCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCommissions getNoCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoCommissions());
  }

  public boolean isSet(quickfix.field.NoCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoCommissions() {
    return isSetField(2639);
  }

public static class NoCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2640, 2641, 2725, 2642, 2643, 2644, 2645, 2646, 2647, 2648, 2649, 2650, 2651, 2652, 0};

  public NoCommissions() {
    super(2639, 2640, ORDER);
  }

  public void set(quickfix.field.CommissionAmount value) {
    setField(value);
  }

  public quickfix.field.CommissionAmount get(quickfix.field.CommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmount getCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmount());
  }

  public boolean isSet(quickfix.field.CommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmount() {
    return isSetField(2640);
  }

  public void set(quickfix.field.CommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountType get(quickfix.field.CommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountType getCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountType());
  }

  public boolean isSet(quickfix.field.CommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountType() {
    return isSetField(2641);
  }

  public void set(quickfix.field.CommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountSubType get(quickfix.field.CommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountSubType getCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.CommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountSubType() {
    return isSetField(2725);
  }

  public void set(quickfix.field.CommissionBasis value) {
    setField(value);
  }

  public quickfix.field.CommissionBasis get(quickfix.field.CommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionBasis getCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.CommissionBasis());
  }

  public boolean isSet(quickfix.field.CommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetCommissionBasis() {
    return isSetField(2642);
  }

  public void set(quickfix.field.CommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionCurrency get(quickfix.field.CommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionCurrency getCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionCurrency());
  }

  public boolean isSet(quickfix.field.CommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionCurrency() {
    return isSetField(2643);
  }

  public void set(quickfix.field.CommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasure get(quickfix.field.CommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasure getCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasure() {
    return isSetField(2644);
  }

  public void set(quickfix.field.CommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency get(quickfix.field.CommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency getCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasureCurrency() {
    return isSetField(2645);
  }

  public void set(quickfix.field.CommissionRate value) {
    setField(value);
  }

  public quickfix.field.CommissionRate get(quickfix.field.CommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionRate getCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.CommissionRate());
  }

  public boolean isSet(quickfix.field.CommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetCommissionRate() {
    return isSetField(2646);
  }

  public void set(quickfix.field.CommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.CommissionSharedIndicator get(quickfix.field.CommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionSharedIndicator getCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.CommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.CommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCommissionSharedIndicator() {
    return isSetField(2647);
  }

  public void set(quickfix.field.CommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountShared get(quickfix.field.CommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountShared getCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountShared());
  }

  public boolean isSet(quickfix.field.CommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountShared() {
    return isSetField(2648);
  }

  public void set(quickfix.field.CommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.CommissionLegRefID get(quickfix.field.CommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionLegRefID getCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.CommissionLegRefID());
  }

  public boolean isSet(quickfix.field.CommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetCommissionLegRefID() {
    return isSetField(2649);
  }

  public void set(quickfix.field.CommissionDesc value) {
    setField(value);
  }

  public quickfix.field.CommissionDesc get(quickfix.field.CommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionDesc getCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.CommissionDesc());
  }

  public boolean isSet(quickfix.field.CommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetCommissionDesc() {
    return isSetField(2650);
  }

  public void set(quickfix.field.EncodedCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDescLen get(quickfix.field.EncodedCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDescLen getEncodedCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDescLen() {
    return isSetField(2651);
  }

  public void set(quickfix.field.EncodedCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDesc get(quickfix.field.EncodedCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDesc getEncodedCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDesc() {
    return isSetField(2652);
  }
}

  public void set(quickfix.field.NumDaysInterest value) {
    setField(value);
  }

  public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
    return get(new quickfix.field.NumDaysInterest());
  }

  public boolean isSet(quickfix.field.NumDaysInterest field) {
    return isSetField(field);
  }

  public boolean isSetNumDaysInterest() {
    return isSetField(157);
  }

  public void set(quickfix.field.ExDate value) {
    setField(value);
  }

  public quickfix.field.ExDate get(quickfix.field.ExDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDate getExDate() throws FieldNotFound {
    return get(new quickfix.field.ExDate());
  }

  public boolean isSet(quickfix.field.ExDate field) {
    return isSetField(field);
  }

  public boolean isSetExDate() {
    return isSetField(230);
  }

  public void set(quickfix.field.AccruedInterestRate value) {
    setField(value);
  }

  public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
    return get(new quickfix.field.AccruedInterestRate());
  }

  public boolean isSet(quickfix.field.AccruedInterestRate field) {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestRate() {
    return isSetField(158);
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

  public void set(quickfix.field.InterestAtMaturity value) {
    setField(value);
  }

  public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
    return get(new quickfix.field.InterestAtMaturity());
  }

  public boolean isSet(quickfix.field.InterestAtMaturity field) {
    return isSetField(field);
  }

  public boolean isSetInterestAtMaturity() {
    return isSetField(738);
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

  public void set(quickfix.field.Concession value) {
    setField(value);
  }

  public quickfix.field.Concession get(quickfix.field.Concession value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Concession getConcession() throws FieldNotFound {
    return get(new quickfix.field.Concession());
  }

  public boolean isSet(quickfix.field.Concession field) {
    return isSetField(field);
  }

  public boolean isSetConcession() {
    return isSetField(238);
  }

  public void set(quickfix.field.TotalTakedown value) {
    setField(value);
  }

  public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
    return get(new quickfix.field.TotalTakedown());
  }

  public boolean isSet(quickfix.field.TotalTakedown field) {
    return isSetField(field);
  }

  public boolean isSetTotalTakedown() {
    return isSetField(237);
  }

  public void set(quickfix.field.NetMoney value) {
    setField(value);
  }

  public quickfix.field.NetMoney get(quickfix.field.NetMoney value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetMoney getNetMoney() throws FieldNotFound {
    return get(new quickfix.field.NetMoney());
  }

  public boolean isSet(quickfix.field.NetMoney field) {
    return isSetField(field);
  }

  public boolean isSetNetMoney() {
    return isSetField(118);
  }

  public void set(quickfix.field.SettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrAmt());
  }

  public boolean isSet(quickfix.field.SettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrAmt() {
    return isSetField(119);
  }

  public void set(quickfix.field.SettlCurrFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRate() {
    return isSetField(155);
  }

  public void set(quickfix.field.SettlCurrFxRateCalc value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRateCalc());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRateCalc() {
    return isSetField(156);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
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

  public void set(quickfix.field.SideMultiLegReportingType value) {
    setField(value);
  }

  public quickfix.field.SideMultiLegReportingType get(quickfix.field.SideMultiLegReportingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound {
    return get(new quickfix.field.SideMultiLegReportingType());
  }

  public boolean isSet(quickfix.field.SideMultiLegReportingType field) {
    return isSetField(field);
  }

  public boolean isSetSideMultiLegReportingType() {
    return isSetField(752);
  }

  public void set(quickfix.fixlatest.component.ContAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ContAmtGrp get(quickfix.fixlatest.component.ContAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ContAmtGrp getContAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ContAmtGrp());
  }

  public void set(quickfix.field.NoContAmts value) {
    setField(value);
  }

  public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
    return get(new quickfix.field.NoContAmts());
  }

  public boolean isSet(quickfix.field.NoContAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoContAmts() {
    return isSetField(518);
  }

public static class NoContAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {519, 520, 521, 0};

  public NoContAmts() {
    super(518, 519, ORDER);
  }

  public void set(quickfix.field.ContAmtType value) {
    setField(value);
  }

  public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
    return get(new quickfix.field.ContAmtType());
  }

  public boolean isSet(quickfix.field.ContAmtType field) {
    return isSetField(field);
  }

  public boolean isSetContAmtType() {
    return isSetField(519);
  }

  public void set(quickfix.field.ContAmtValue value) {
    setField(value);
  }

  public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
    return get(new quickfix.field.ContAmtValue());
  }

  public boolean isSet(quickfix.field.ContAmtValue field) {
    return isSetField(field);
  }

  public boolean isSetContAmtValue() {
    return isSetField(520);
  }

  public void set(quickfix.field.ContAmtCurr value) {
    setField(value);
  }

  public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
    return get(new quickfix.field.ContAmtCurr());
  }

  public boolean isSet(quickfix.field.ContAmtCurr field) {
    return isSetField(field);
  }

  public boolean isSetContAmtCurr() {
    return isSetField(521);
  }
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

  public void set(quickfix.field.ExchangeRule value) {
    setField(value);
  }

  public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
    return get(new quickfix.field.ExchangeRule());
  }

  public boolean isSet(quickfix.field.ExchangeRule field) {
    return isSetField(field);
  }

  public boolean isSetExchangeRule() {
    return isSetField(825);
  }

  public void set(quickfix.field.TradeAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocIndicator());
  }

  public boolean isSet(quickfix.field.TradeAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocIndicator() {
    return isSetField(826);
  }

  public void set(quickfix.field.TradeAllocGroupInstruction value) {
    setField(value);
  }

  public quickfix.field.TradeAllocGroupInstruction get(quickfix.field.TradeAllocGroupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocGroupInstruction getTradeAllocGroupInstruction() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocGroupInstruction());
  }

  public boolean isSet(quickfix.field.TradeAllocGroupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocGroupInstruction() {
    return isSetField(1848);
  }

  public void set(quickfix.field.AllocGroupID value) {
    setField(value);
  }

  public quickfix.field.AllocGroupID get(quickfix.field.AllocGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupID getAllocGroupID() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupID());
  }

  public boolean isSet(quickfix.field.AllocGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupID() {
    return isSetField(1730);
  }

  public void set(quickfix.field.PreviousAllocGroupID value) {
    setField(value);
  }

  public quickfix.field.PreviousAllocGroupID get(quickfix.field.PreviousAllocGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviousAllocGroupID getPreviousAllocGroupID() throws FieldNotFound {
    return get(new quickfix.field.PreviousAllocGroupID());
  }

  public boolean isSet(quickfix.field.PreviousAllocGroupID field) {
    return isSetField(field);
  }

  public boolean isSetPreviousAllocGroupID() {
    return isSetField(2771);
  }

  public void set(quickfix.field.GroupAmount value) {
    setField(value);
  }

  public quickfix.field.GroupAmount get(quickfix.field.GroupAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.GroupAmount getGroupAmount() throws FieldNotFound {
    return get(new quickfix.field.GroupAmount());
  }

  public boolean isSet(quickfix.field.GroupAmount field) {
    return isSetField(field);
  }

  public boolean isSetGroupAmount() {
    return isSetField(2759);
  }

  public void set(quickfix.field.AllocGroupStatus value) {
    setField(value);
  }

  public quickfix.field.AllocGroupStatus get(quickfix.field.AllocGroupStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupStatus getAllocGroupStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupStatus());
  }

  public boolean isSet(quickfix.field.AllocGroupStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupStatus() {
    return isSetField(2767);
  }

  public void set(quickfix.field.SideAvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.SideAvgPxIndicator get(quickfix.field.SideAvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPxIndicator getSideAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPxIndicator());
  }

  public boolean isSet(quickfix.field.SideAvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPxIndicator() {
    return isSetField(1853);
  }

  public void set(quickfix.field.SideAvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.SideAvgPxGroupID get(quickfix.field.SideAvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPxGroupID getSideAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPxGroupID());
  }

  public boolean isSet(quickfix.field.SideAvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPxGroupID() {
    return isSetField(1854);
  }

  public void set(quickfix.field.SideAvgPx value) {
    setField(value);
  }

  public quickfix.field.SideAvgPx get(quickfix.field.SideAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPx getSideAvgPx() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPx());
  }

  public boolean isSet(quickfix.field.SideAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPx() {
    return isSetField(1852);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.TrdAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdAllocGrp get(quickfix.fixlatest.component.TrdAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdAllocGrp getTrdAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 1593, 2727, 1908, 1729, 756, 209, 80, 2515, 1752, 1753, 1754, 1755, 993, 1002, 989, 1136, 1844, 1840, 1735, 161, 360, 361, 1732, 1733, 1734, 2392, 2393, 2653, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.ParentAllocID value) {
    setField(value);
  }

  public quickfix.field.ParentAllocID get(quickfix.field.ParentAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentAllocID getParentAllocID() throws FieldNotFound {
    return get(new quickfix.field.ParentAllocID());
  }

  public boolean isSet(quickfix.field.ParentAllocID field) {
    return isSetField(field);
  }

  public boolean isSetParentAllocID() {
    return isSetField(1593);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp get(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp getAllocRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoAllocRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs get(quickfix.field.NoAllocRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs getNoAllocRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoAllocRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocRegulatoryTradeIDs() {
    return isSetField(1908);
  }

public static class NoAllocRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1909, 1910, 1911, 1912, 2406, 2399, 0};

  public NoAllocRegulatoryTradeIDs() {
    super(1908, 1909, ORDER);
  }

  public void set(quickfix.field.AllocRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeID get(quickfix.field.AllocRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeID getAllocRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeID() {
    return isSetField(1909);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDSource get(quickfix.field.AllocRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDSource getAllocRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDSource() {
    return isSetField(1910);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent get(quickfix.field.AllocRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent getAllocRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDEvent() {
    return isSetField(1911);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDType get(quickfix.field.AllocRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDType getAllocRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDType() {
    return isSetField(1912);
  }

  public void set(quickfix.field.AllocRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryLegRefID get(quickfix.field.AllocRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryLegRefID getAllocRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryLegRefID() {
    return isSetField(2406);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDScope get(quickfix.field.AllocRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDScope getAllocRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDScope() {
    return isSetField(2399);
  }
}

  public void set(quickfix.field.FirmMnemonic value) {
    setField(value);
  }

  public quickfix.field.FirmMnemonic get(quickfix.field.FirmMnemonic value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmMnemonic getFirmMnemonic() throws FieldNotFound {
    return get(new quickfix.field.FirmMnemonic());
  }

  public boolean isSet(quickfix.field.FirmMnemonic field) {
    return isSetField(field);
  }

  public boolean isSetFirmMnemonic() {
    return isSetField(1729);
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

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.AllocCalculatedCcyQty value) {
    setField(value);
  }

  public quickfix.field.AllocCalculatedCcyQty get(quickfix.field.AllocCalculatedCcyQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCalculatedCcyQty getAllocCalculatedCcyQty() throws FieldNotFound {
    return get(new quickfix.field.AllocCalculatedCcyQty());
  }

  public boolean isSet(quickfix.field.AllocCalculatedCcyQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocCalculatedCcyQty() {
    return isSetField(2515);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }

  public void set(quickfix.field.AllocCustomerCapacity value) {
    setField(value);
  }

  public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
    return get(new quickfix.field.AllocCustomerCapacity());
  }

  public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
    return isSetField(field);
  }

  public boolean isSetAllocCustomerCapacity() {
    return isSetField(993);
  }

  public void set(quickfix.field.AllocMethod value) {
    setField(value);
  }

  public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound {
    return get(new quickfix.field.AllocMethod());
  }

  public boolean isSet(quickfix.field.AllocMethod field) {
    return isSetField(field);
  }

  public boolean isSetAllocMethod() {
    return isSetField(1002);
  }

  public void set(quickfix.field.SecondaryIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryIndividualAllocID());
  }

  public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryIndividualAllocID() {
    return isSetField(989);
  }

  public void set(quickfix.field.AllocClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.AllocClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocClearingFeeIndicator() {
    return isSetField(1136);
  }

  public void set(quickfix.fixlatest.component.TradeAllocAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp get(quickfix.fixlatest.component.TradeAllocAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp getTradeAllocAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeAllocAmtGrp());
  }

  public void set(quickfix.field.NoTradeAllocAmts value) {
    setField(value);
  }

  public quickfix.field.NoTradeAllocAmts get(quickfix.field.NoTradeAllocAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradeAllocAmts getNoTradeAllocAmts() throws FieldNotFound {
    return get(new quickfix.field.NoTradeAllocAmts());
  }

  public boolean isSet(quickfix.field.NoTradeAllocAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoTradeAllocAmts() {
    return isSetField(1844);
  }

public static class NoTradeAllocAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1845, 1846, 1847, 1850, 0};

  public NoTradeAllocAmts() {
    super(1844, 1845, ORDER);
  }

  public void set(quickfix.field.TradeAllocAmtType value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtType get(quickfix.field.TradeAllocAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtType getTradeAllocAmtType() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtType());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtType() {
    return isSetField(1845);
  }

  public void set(quickfix.field.TradeAllocAmt value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmt get(quickfix.field.TradeAllocAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmt getTradeAllocAmt() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmt());
  }

  public boolean isSet(quickfix.field.TradeAllocAmt field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmt() {
    return isSetField(1846);
  }

  public void set(quickfix.field.TradeAllocCurrency value) {
    setField(value);
  }

  public quickfix.field.TradeAllocCurrency get(quickfix.field.TradeAllocCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocCurrency getTradeAllocCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocCurrency());
  }

  public boolean isSet(quickfix.field.TradeAllocCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocCurrency() {
    return isSetField(1847);
  }

  public void set(quickfix.field.TradeAllocAmtReason value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtReason get(quickfix.field.TradeAllocAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtReason getTradeAllocAmtReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtReason());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtReason() {
    return isSetField(1850);
  }
}

  public void set(quickfix.field.TradeAllocStatus value) {
    setField(value);
  }

  public quickfix.field.TradeAllocStatus get(quickfix.field.TradeAllocStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocStatus getTradeAllocStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocStatus());
  }

  public boolean isSet(quickfix.field.TradeAllocStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocStatus() {
    return isSetField(1840);
  }

  public void set(quickfix.field.AllocationRollupInstruction value) {
    setField(value);
  }

  public quickfix.field.AllocationRollupInstruction get(quickfix.field.AllocationRollupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocationRollupInstruction getAllocationRollupInstruction() throws FieldNotFound {
    return get(new quickfix.field.AllocationRollupInstruction());
  }

  public boolean isSet(quickfix.field.AllocationRollupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetAllocationRollupInstruction() {
    return isSetField(1735);
  }

  public void set(quickfix.field.AllocText value) {
    setField(value);
  }

  public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocText getAllocText() throws FieldNotFound {
    return get(new quickfix.field.AllocText());
  }

  public boolean isSet(quickfix.field.AllocText field) {
    return isSetField(field);
  }

  public boolean isSetAllocText() {
    return isSetField(161);
  }

  public void set(quickfix.field.EncodedAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocTextLen() {
    return isSetField(360);
  }

  public void set(quickfix.field.EncodedAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocText());
  }

  public boolean isSet(quickfix.field.EncodedAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocText() {
    return isSetField(361);
  }

  public void set(quickfix.field.FirmAllocText value) {
    setField(value);
  }

  public quickfix.field.FirmAllocText get(quickfix.field.FirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmAllocText getFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.FirmAllocText());
  }

  public boolean isSet(quickfix.field.FirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetFirmAllocText() {
    return isSetField(1732);
  }

  public void set(quickfix.field.EncodedFirmAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocTextLen get(quickfix.field.EncodedFirmAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocTextLen getEncodedFirmAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocTextLen() {
    return isSetField(1733);
  }

  public void set(quickfix.field.EncodedFirmAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocText get(quickfix.field.EncodedFirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocText getEncodedFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocText());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocText() {
    return isSetField(1734);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckID get(quickfix.field.AllocRefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckID getAllocRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckID() {
    return isSetField(2392);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType get(quickfix.field.AllocRefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType getAllocRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckIDType() {
    return isSetField(2393);
  }

  public void set(quickfix.fixlatest.component.AllocCommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp get(quickfix.fixlatest.component.AllocCommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp getAllocCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocCommissionDataGrp());
  }

  public void set(quickfix.field.NoAllocCommissions value) {
    setField(value);
  }

  public quickfix.field.NoAllocCommissions get(quickfix.field.NoAllocCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocCommissions getNoAllocCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoAllocCommissions());
  }

  public boolean isSet(quickfix.field.NoAllocCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocCommissions() {
    return isSetField(2653);
  }

public static class NoAllocCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2654, 2655, 2726, 2656, 2657, 2658, 2659, 2660, 2661, 2662, 2663, 2664, 2665, 2666, 0};

  public NoAllocCommissions() {
    super(2653, 2654, ORDER);
  }

  public void set(quickfix.field.AllocCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmount get(quickfix.field.AllocCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmount getAllocCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmount());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmount() {
    return isSetField(2654);
  }

  public void set(quickfix.field.AllocCommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountType get(quickfix.field.AllocCommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountType getAllocCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountType() {
    return isSetField(2655);
  }

  public void set(quickfix.field.AllocCommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountSubType get(quickfix.field.AllocCommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountSubType getAllocCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountSubType() {
    return isSetField(2726);
  }

  public void set(quickfix.field.AllocCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionBasis get(quickfix.field.AllocCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionBasis getAllocCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionBasis());
  }

  public boolean isSet(quickfix.field.AllocCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionBasis() {
    return isSetField(2656);
  }

  public void set(quickfix.field.AllocCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionCurrency get(quickfix.field.AllocCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionCurrency getAllocCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionCurrency() {
    return isSetField(2657);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasure get(quickfix.field.AllocCommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasure getAllocCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasure() {
    return isSetField(2658);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency get(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency getAllocCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasureCurrency() {
    return isSetField(2659);
  }

  public void set(quickfix.field.AllocCommissionRate value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionRate get(quickfix.field.AllocCommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionRate getAllocCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionRate());
  }

  public boolean isSet(quickfix.field.AllocCommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionRate() {
    return isSetField(2660);
  }

  public void set(quickfix.field.AllocCommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionSharedIndicator get(quickfix.field.AllocCommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionSharedIndicator getAllocCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.AllocCommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionSharedIndicator() {
    return isSetField(2661);
  }

  public void set(quickfix.field.AllocCommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountShared get(quickfix.field.AllocCommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountShared getAllocCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountShared());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountShared() {
    return isSetField(2662);
  }

  public void set(quickfix.field.AllocCommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionLegRefID get(quickfix.field.AllocCommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionLegRefID getAllocCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionLegRefID());
  }

  public boolean isSet(quickfix.field.AllocCommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionLegRefID() {
    return isSetField(2663);
  }

  public void set(quickfix.field.AllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionDesc get(quickfix.field.AllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionDesc getAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.AllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionDesc() {
    return isSetField(2664);
  }

  public void set(quickfix.field.EncodedAllocCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDescLen get(quickfix.field.EncodedAllocCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDescLen getEncodedAllocCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDescLen() {
    return isSetField(2665);
  }

  public void set(quickfix.field.EncodedAllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDesc get(quickfix.field.EncodedAllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDesc getEncodedAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDesc() {
    return isSetField(2666);
  }
}
}

  public void set(quickfix.fixlatest.component.SideTrdRegTS component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideTrdRegTS get(quickfix.fixlatest.component.SideTrdRegTS component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideTrdRegTS getSideTrdRegTSComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideTrdRegTS());
  }

  public void set(quickfix.field.NoSideTrdRegTS value) {
    setField(value);
  }

  public quickfix.field.NoSideTrdRegTS get(quickfix.field.NoSideTrdRegTS value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideTrdRegTS getNoSideTrdRegTS() throws FieldNotFound {
    return get(new quickfix.field.NoSideTrdRegTS());
  }

  public boolean isSet(quickfix.field.NoSideTrdRegTS field) {
    return isSetField(field);
  }

  public boolean isSetNoSideTrdRegTS() {
    return isSetField(1016);
  }

public static class NoSideTrdRegTS extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1012, 1013, 1014, 0};

  public NoSideTrdRegTS() {
    super(1016, 1012, ORDER);
  }

  public void set(quickfix.field.SideTrdRegTimestamp value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestamp get(quickfix.field.SideTrdRegTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestamp getSideTrdRegTimestamp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestamp());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestamp() {
    return isSetField(1012);
  }

  public void set(quickfix.field.SideTrdRegTimestampType value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampType get(quickfix.field.SideTrdRegTimestampType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampType getSideTrdRegTimestampType() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestampType());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampType field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampType() {
    return isSetField(1013);
  }

  public void set(quickfix.field.SideTrdRegTimestampSrc value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampSrc get(quickfix.field.SideTrdRegTimestampSrc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampSrc getSideTrdRegTimestampSrc() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestampSrc());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampSrc field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampSrc() {
    return isSetField(1014);
  }
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

  public void set(quickfix.field.SideGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.SideGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.SideGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetSideGrossTradeAmt() {
    return isSetField(1072);
  }

  public void set(quickfix.field.AggressorIndicator value) {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
    return get(new quickfix.field.AggressorIndicator());
  }

  public boolean isSet(quickfix.field.AggressorIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator() {
    return isSetField(1057);
  }

  public void set(quickfix.field.ExchangeSpecialInstructions value) {
    setField(value);
  }

  public quickfix.field.ExchangeSpecialInstructions get(quickfix.field.ExchangeSpecialInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeSpecialInstructions getExchangeSpecialInstructions() throws FieldNotFound {
    return get(new quickfix.field.ExchangeSpecialInstructions());
  }

  public boolean isSet(quickfix.field.ExchangeSpecialInstructions field) {
    return isSetField(field);
  }

  public boolean isSetExchangeSpecialInstructions() {
    return isSetField(1139);
  }

  public void set(quickfix.field.SideShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.SideShortSaleExemptionReason get(quickfix.field.SideShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideShortSaleExemptionReason getSideShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.SideShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.SideShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetSideShortSaleExemptionReason() {
    return isSetField(1690);
  }

  public void set(quickfix.field.OrderCategory value) {
    setField(value);
  }

  public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
    return get(new quickfix.field.OrderCategory());
  }

  public boolean isSet(quickfix.field.OrderCategory field) {
    return isSetField(field);
  }

  public boolean isSetOrderCategory() {
    return isSetField(1115);
  }

  public void set(quickfix.field.SideLiquidityInd value) {
    setField(value);
  }

  public quickfix.field.SideLiquidityInd get(quickfix.field.SideLiquidityInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLiquidityInd getSideLiquidityInd() throws FieldNotFound {
    return get(new quickfix.field.SideLiquidityInd());
  }

  public boolean isSet(quickfix.field.SideLiquidityInd field) {
    return isSetField(field);
  }

  public boolean isSetSideLiquidityInd() {
    return isSetField(1444);
  }

  public void set(quickfix.field.StrategyLinkID value) {
    setField(value);
  }

  public quickfix.field.StrategyLinkID get(quickfix.field.StrategyLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyLinkID getStrategyLinkID() throws FieldNotFound {
    return get(new quickfix.field.StrategyLinkID());
  }

  public boolean isSet(quickfix.field.StrategyLinkID field) {
    return isSetField(field);
  }

  public boolean isSetStrategyLinkID() {
    return isSetField(1851);
  }

  public void set(quickfix.fixlatest.component.TradeReportOrderDetail component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail get(quickfix.fixlatest.component.TradeReportOrderDetail component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail getTradeReportOrderDetailComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeReportOrderDetail());
  }

  public void set(quickfix.field.CustOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.CustOrderHandlingInst get(quickfix.field.CustOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderHandlingInst getCustOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.CustOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.CustOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderHandlingInst() {
    return isSetField(1031);
  }

  public void set(quickfix.field.OrderHandlingInstSource value) {
    setField(value);
  }

  public quickfix.field.OrderHandlingInstSource get(quickfix.field.OrderHandlingInstSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderHandlingInstSource getOrderHandlingInstSource() throws FieldNotFound {
    return get(new quickfix.field.OrderHandlingInstSource());
  }

  public boolean isSet(quickfix.field.OrderHandlingInstSource field) {
    return isSetField(field);
  }

  public boolean isSetOrderHandlingInstSource() {
    return isSetField(1032);
  }

  public void set(quickfix.fixlatest.component.TradePositionQty component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePositionQty get(quickfix.fixlatest.component.TradePositionQty component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePositionQty getTradePositionQtyComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePositionQty());
  }

  public void set(quickfix.field.NoPositions value) {
    setField(value);
  }

  public quickfix.field.NoPositions get(quickfix.field.NoPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPositions getNoPositions() throws FieldNotFound {
    return get(new quickfix.field.NoPositions());
  }

  public boolean isSet(quickfix.field.NoPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoPositions() {
    return isSetField(702);
  }

public static class NoPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {703, 704, 705, 1654, 706, 976, 0};

  public NoPositions() {
    super(702, 703, ORDER);
  }

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }
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

  public void set(quickfix.fixlatest.component.RelatedPositionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPositionGrp get(quickfix.fixlatest.component.RelatedPositionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPositionGrp getRelatedPositionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPositionGrp());
  }

  public void set(quickfix.field.NoRelatedPositions value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPositions get(quickfix.field.NoRelatedPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPositions getNoRelatedPositions() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPositions());
  }

  public boolean isSet(quickfix.field.NoRelatedPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPositions() {
    return isSetField(1861);
  }

public static class NoRelatedPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1862, 1863, 1864, 0};

  public NoRelatedPositions() {
    super(1861, 1862, ORDER);
  }

  public void set(quickfix.field.RelatedPositionID value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionID get(quickfix.field.RelatedPositionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionID getRelatedPositionID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionID());
  }

  public boolean isSet(quickfix.field.RelatedPositionID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionID() {
    return isSetField(1862);
  }

  public void set(quickfix.field.RelatedPositionIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionIDSource get(quickfix.field.RelatedPositionIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionIDSource getRelatedPositionIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPositionIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionIDSource() {
    return isSetField(1863);
  }

  public void set(quickfix.field.RelatedPositionDate value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionDate get(quickfix.field.RelatedPositionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionDate getRelatedPositionDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionDate());
  }

  public boolean isSet(quickfix.field.RelatedPositionDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionDate() {
    return isSetField(1864);
  }
}

  public void set(quickfix.field.BlockTrdAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.BlockTrdAllocIndicator get(quickfix.field.BlockTrdAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BlockTrdAllocIndicator getBlockTrdAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.BlockTrdAllocIndicator());
  }

  public boolean isSet(quickfix.field.BlockTrdAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetBlockTrdAllocIndicator() {
    return isSetField(1980);
  }

  public void set(quickfix.field.SideRiskLimitCheckStatus value) {
    setField(value);
  }

  public quickfix.field.SideRiskLimitCheckStatus get(quickfix.field.SideRiskLimitCheckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRiskLimitCheckStatus getSideRiskLimitCheckStatus() throws FieldNotFound {
    return get(new quickfix.field.SideRiskLimitCheckStatus());
  }

  public boolean isSet(quickfix.field.SideRiskLimitCheckStatus field) {
    return isSetField(field);
  }

  public boolean isSetSideRiskLimitCheckStatus() {
    return isSetField(2344);
  }

  public void set(quickfix.field.LastCapacity value) {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
    return get(new quickfix.field.LastCapacity());
  }

  public boolean isSet(quickfix.field.LastCapacity field) {
    return isSetField(field);
  }

  public boolean isSetLastCapacity() {
    return isSetField(29);
  }

  public void set(quickfix.field.RefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.RefRiskLimitCheckID get(quickfix.field.RefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefRiskLimitCheckID getRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.RefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.RefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetRefRiskLimitCheckID() {
    return isSetField(2334);
  }

  public void set(quickfix.field.RefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.RefRiskLimitCheckIDType get(quickfix.field.RefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefRiskLimitCheckIDType getRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.RefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.RefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetRefRiskLimitCheckIDType() {
    return isSetField(2335);
  }

  public void set(quickfix.field.CompressionGroupID value) {
    setField(value);
  }

  public quickfix.field.CompressionGroupID get(quickfix.field.CompressionGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CompressionGroupID getCompressionGroupID() throws FieldNotFound {
    return get(new quickfix.field.CompressionGroupID());
  }

  public boolean isSet(quickfix.field.CompressionGroupID field) {
    return isSetField(field);
  }

  public boolean isSetCompressionGroupID() {
    return isSetField(2361);
  }

  public void set(quickfix.fixlatest.component.SideCollateralAmountGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCollateralAmountGrp get(quickfix.fixlatest.component.SideCollateralAmountGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCollateralAmountGrp getSideCollateralAmountGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCollateralAmountGrp());
  }

  public void set(quickfix.field.NoSideCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralAmounts get(quickfix.field.NoSideCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralAmounts getNoSideCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoSideCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralAmounts() {
    return isSetField(2691);
  }

public static class NoSideCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2702, 2695, 2694, 2696, 2697, 2701, 2693, 2692, 2703, 2700, 2699, 2698, 2862, 2864, 2863, 0};

  public NoSideCollateralAmounts() {
    super(2691, 2702, ORDER);
  }

  public void set(quickfix.field.SideCurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.SideCurrentCollateralAmount get(quickfix.field.SideCurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrentCollateralAmount getSideCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.SideCurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrentCollateralAmount() {
    return isSetField(2702);
  }

  public void set(quickfix.field.SideCollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralCurrency get(quickfix.field.SideCollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralCurrency getSideCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralCurrency() {
    return isSetField(2695);
  }

  public void set(quickfix.field.SideCollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountType get(quickfix.field.SideCollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountType getSideCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountType());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountType() {
    return isSetField(2694);
  }

  public void set(quickfix.field.SideCollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRate get(quickfix.field.SideCollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRate getSideCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRate());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRate() {
    return isSetField(2696);
  }

  public void set(quickfix.field.SideCollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRateCalc get(quickfix.field.SideCollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRateCalc getSideCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRateCalc() {
    return isSetField(2697);
  }

  public void set(quickfix.field.SideCollateralType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralType get(quickfix.field.SideCollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralType getSideCollateralType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralType());
  }

  public boolean isSet(quickfix.field.SideCollateralType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralType() {
    return isSetField(2701);
  }

  public void set(quickfix.field.SideCollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID get(quickfix.field.SideCollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID getSideCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketSegmentID() {
    return isSetField(2693);
  }

  public void set(quickfix.field.SideCollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketID get(quickfix.field.SideCollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketID getSideCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketID() {
    return isSetField(2692);
  }

  public void set(quickfix.field.SideHaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.SideHaircutIndicator get(quickfix.field.SideHaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideHaircutIndicator getSideHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideHaircutIndicator());
  }

  public boolean isSet(quickfix.field.SideHaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideHaircutIndicator() {
    return isSetField(2703);
  }

  public void set(quickfix.field.SideCollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPortfolioID get(quickfix.field.SideCollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPortfolioID getSideCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.SideCollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPortfolioID() {
    return isSetField(2700);
  }

  public void set(quickfix.field.SideCollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPercentOverage get(quickfix.field.SideCollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPercentOverage getSideCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.SideCollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPercentOverage() {
    return isSetField(2699);
  }

  public void set(quickfix.field.SideCollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.SideCollateralMarketPrice get(quickfix.field.SideCollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralMarketPrice getSideCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.SideCollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralMarketPrice() {
    return isSetField(2698);
  }

  public void set(quickfix.field.SideCollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentRate get(quickfix.field.SideCollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentRate getSideCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentRate() {
    return isSetField(2862);
  }

  public void set(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp get(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp getSideCollateralReinvestmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCollateralReinvestmentGrp());
  }

  public void set(quickfix.field.NoSideCollateralReinvestments value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralReinvestments get(quickfix.field.NoSideCollateralReinvestments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralReinvestments getNoSideCollateralReinvestments() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralReinvestments());
  }

  public boolean isSet(quickfix.field.NoSideCollateralReinvestments field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralReinvestments() {
    return isSetField(2864);
  }

public static class NoSideCollateralReinvestments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2867, 2865, 2866, 0};

  public NoSideCollateralReinvestments() {
    super(2864, 2867, ORDER);
  }

  public void set(quickfix.field.SideCollateralReinvestmentType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentType get(quickfix.field.SideCollateralReinvestmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentType getSideCollateralReinvestmentType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentType());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentType() {
    return isSetField(2867);
  }

  public void set(quickfix.field.SideCollateralReinvestmentAmount value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentAmount get(quickfix.field.SideCollateralReinvestmentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentAmount getSideCollateralReinvestmentAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentAmount());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentAmount() {
    return isSetField(2865);
  }

  public void set(quickfix.field.SideCollateralReinvestmentCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentCurrency get(quickfix.field.SideCollateralReinvestmentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentCurrency getSideCollateralReinvestmentCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentCurrency() {
    return isSetField(2866);
  }
}

  public void set(quickfix.field.SideUnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.SideUnderlyingRefID get(quickfix.field.SideUnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideUnderlyingRefID getSideUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.SideUnderlyingRefID());
  }

  public boolean isSet(quickfix.field.SideUnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideUnderlyingRefID() {
    return isSetField(2863);
  }
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

  public void set(quickfix.field.ShortMarkingExemptIndicator value) {
    setField(value);
  }

  public quickfix.field.ShortMarkingExemptIndicator get(quickfix.field.ShortMarkingExemptIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortMarkingExemptIndicator getShortMarkingExemptIndicator() throws FieldNotFound {
    return get(new quickfix.field.ShortMarkingExemptIndicator());
  }

  public boolean isSet(quickfix.field.ShortMarkingExemptIndicator field) {
    return isSetField(field);
  }

  public boolean isSetShortMarkingExemptIndicator() {
    return isSetField(2102);
  }

  public void set(quickfix.field.SideExecID value) {
    setField(value);
  }

  public quickfix.field.SideExecID get(quickfix.field.SideExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideExecID getSideExecID() throws FieldNotFound {
    return get(new quickfix.field.SideExecID());
  }

  public boolean isSet(quickfix.field.SideExecID field) {
    return isSetField(field);
  }

  public boolean isSetSideExecID() {
    return isSetField(1427);
  }

  public void set(quickfix.field.OrderDelay value) {
    setField(value);
  }

  public quickfix.field.OrderDelay get(quickfix.field.OrderDelay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelay getOrderDelay() throws FieldNotFound {
    return get(new quickfix.field.OrderDelay());
  }

  public boolean isSet(quickfix.field.OrderDelay field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelay() {
    return isSetField(1428);
  }

  public void set(quickfix.field.OrderDelayUnit value) {
    setField(value);
  }

  public quickfix.field.OrderDelayUnit get(quickfix.field.OrderDelayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderDelayUnit getOrderDelayUnit() throws FieldNotFound {
    return get(new quickfix.field.OrderDelayUnit());
  }

  public boolean isSet(quickfix.field.OrderDelayUnit field) {
    return isSetField(field);
  }

  public boolean isSetOrderDelayUnit() {
    return isSetField(1429);
  }

  public void set(quickfix.field.SideLastQty value) {
    setField(value);
  }

  public quickfix.field.SideLastQty get(quickfix.field.SideLastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLastQty getSideLastQty() throws FieldNotFound {
    return get(new quickfix.field.SideLastQty());
  }

  public boolean isSet(quickfix.field.SideLastQty field) {
    return isSetField(field);
  }

  public boolean isSetSideLastQty() {
    return isSetField(1009);
  }

  public void set(quickfix.field.SideClearingTradePrice value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePrice get(quickfix.field.SideClearingTradePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePrice getSideClearingTradePrice() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePrice());
  }

  public boolean isSet(quickfix.field.SideClearingTradePrice field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePrice() {
    return isSetField(1597);
  }

  public void set(quickfix.field.SidePriceDifferential value) {
    setField(value);
  }

  public quickfix.field.SidePriceDifferential get(quickfix.field.SidePriceDifferential value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SidePriceDifferential getSidePriceDifferential() throws FieldNotFound {
    return get(new quickfix.field.SidePriceDifferential());
  }

  public boolean isSet(quickfix.field.SidePriceDifferential field) {
    return isSetField(field);
  }

  public boolean isSetSidePriceDifferential() {
    return isSetField(1599);
  }

  public void set(quickfix.field.SideClearingTradePriceType value) {
    setField(value);
  }

  public quickfix.field.SideClearingTradePriceType get(quickfix.field.SideClearingTradePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideClearingTradePriceType getSideClearingTradePriceType() throws FieldNotFound {
    return get(new quickfix.field.SideClearingTradePriceType());
  }

  public boolean isSet(quickfix.field.SideClearingTradePriceType field) {
    return isSetField(field);
  }

  public boolean isSetSideClearingTradePriceType() {
    return isSetField(1598);
  }

  public void set(quickfix.field.SideTradeReportID value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportID());
  }

  public boolean isSet(quickfix.field.SideTradeReportID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportID() {
    return isSetField(1005);
  }

  public void set(quickfix.field.SideTradeID value) {
    setField(value);
  }

  public quickfix.field.SideTradeID get(quickfix.field.SideTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeID getSideTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideTradeID());
  }

  public boolean isSet(quickfix.field.SideTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeID() {
    return isSetField(1506);
  }

  public void set(quickfix.field.SideOrigTradeID value) {
    setField(value);
  }

  public quickfix.field.SideOrigTradeID get(quickfix.field.SideOrigTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideOrigTradeID getSideOrigTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideOrigTradeID());
  }

  public boolean isSet(quickfix.field.SideOrigTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideOrigTradeID() {
    return isSetField(1507);
  }

  public void set(quickfix.field.SideFillStationCd value) {
    setField(value);
  }

  public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound {
    return get(new quickfix.field.SideFillStationCd());
  }

  public boolean isSet(quickfix.field.SideFillStationCd field) {
    return isSetField(field);
  }

  public boolean isSetSideFillStationCd() {
    return isSetField(1006);
  }

  public void set(quickfix.field.SideReasonCd value) {
    setField(value);
  }

  public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound {
    return get(new quickfix.field.SideReasonCd());
  }

  public boolean isSet(quickfix.field.SideReasonCd field) {
    return isSetField(field);
  }

  public boolean isSetSideReasonCd() {
    return isSetField(1007);
  }

  public void set(quickfix.field.RptSeq value) {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
    return get(new quickfix.field.RptSeq());
  }

  public boolean isSet(quickfix.field.RptSeq field) {
    return isSetField(field);
  }

  public boolean isSetRptSeq() {
    return isSetField(83);
  }

  public void set(quickfix.field.SideTrdSubTyp value) {
    setField(value);
  }

  public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdSubTyp());
  }

  public boolean isSet(quickfix.field.SideTrdSubTyp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdSubTyp() {
    return isSetField(1008);
  }

  public void set(quickfix.field.NetGrossInd value) {
    setField(value);
  }

  public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
    return get(new quickfix.field.NetGrossInd());
  }

  public boolean isSet(quickfix.field.NetGrossInd field) {
    return isSetField(field);
  }

  public boolean isSetNetGrossInd() {
    return isSetField(430);
  }

  public void set(quickfix.field.SideCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCurrency get(quickfix.field.SideCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrency getSideCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCurrency());
  }

  public boolean isSet(quickfix.field.SideCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrency() {
    return isSetField(1154);
  }

  public void set(quickfix.field.SideSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SideSettlCurrency get(quickfix.field.SideSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideSettlCurrency getSideSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideSettlCurrency());
  }

  public boolean isSet(quickfix.field.SideSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideSettlCurrency() {
    return isSetField(1155);
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

  public void set(quickfix.field.AcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AcctIDSource());
  }

  public boolean isSet(quickfix.field.AcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAcctIDSource() {
    return isSetField(660);
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

  public void set(quickfix.field.OwnerType value) {
    setField(value);
  }

  public quickfix.field.OwnerType get(quickfix.field.OwnerType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OwnerType getOwnerType() throws FieldNotFound {
    return get(new quickfix.field.OwnerType());
  }

  public boolean isSet(quickfix.field.OwnerType field) {
    return isSetField(field);
  }

  public boolean isSetOwnerType() {
    return isSetField(522);
  }

  public void set(quickfix.fixlatest.component.LimitAmts component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LimitAmts get(quickfix.fixlatest.component.LimitAmts component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LimitAmts getLimitAmtsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LimitAmts());
  }

  public void set(quickfix.field.NoLimitAmts value) {
    setField(value);
  }

  public quickfix.field.NoLimitAmts get(quickfix.field.NoLimitAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLimitAmts getNoLimitAmts() throws FieldNotFound {
    return get(new quickfix.field.NoLimitAmts());
  }

  public boolean isSet(quickfix.field.NoLimitAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoLimitAmts() {
    return isSetField(1630);
  }

public static class NoLimitAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1631, 1632, 1633, 2394, 2395, 1634, 2396, 0};

  public NoLimitAmts() {
    super(1630, 1631, ORDER);
  }

  public void set(quickfix.field.LimitAmtType value) {
    setField(value);
  }

  public quickfix.field.LimitAmtType get(quickfix.field.LimitAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtType getLimitAmtType() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtType());
  }

  public boolean isSet(quickfix.field.LimitAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtType() {
    return isSetField(1631);
  }

  public void set(quickfix.field.LastLimitAmt value) {
    setField(value);
  }

  public quickfix.field.LastLimitAmt get(quickfix.field.LastLimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastLimitAmt getLastLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LastLimitAmt());
  }

  public boolean isSet(quickfix.field.LastLimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLastLimitAmt() {
    return isSetField(1632);
  }

  public void set(quickfix.field.LimitAmtRemaining value) {
    setField(value);
  }

  public quickfix.field.LimitAmtRemaining get(quickfix.field.LimitAmtRemaining value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtRemaining getLimitAmtRemaining() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtRemaining());
  }

  public boolean isSet(quickfix.field.LimitAmtRemaining field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtRemaining() {
    return isSetField(1633);
  }

  public void set(quickfix.field.LimitUtilizationAmt value) {
    setField(value);
  }

  public quickfix.field.LimitUtilizationAmt get(quickfix.field.LimitUtilizationAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitUtilizationAmt getLimitUtilizationAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitUtilizationAmt());
  }

  public boolean isSet(quickfix.field.LimitUtilizationAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitUtilizationAmt() {
    return isSetField(2394);
  }

  public void set(quickfix.field.LimitAmt value) {
    setField(value);
  }

  public quickfix.field.LimitAmt get(quickfix.field.LimitAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmt getLimitAmt() throws FieldNotFound {
    return get(new quickfix.field.LimitAmt());
  }

  public boolean isSet(quickfix.field.LimitAmt field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmt() {
    return isSetField(2395);
  }

  public void set(quickfix.field.LimitAmtCurrency value) {
    setField(value);
  }

  public quickfix.field.LimitAmtCurrency get(quickfix.field.LimitAmtCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitAmtCurrency getLimitAmtCurrency() throws FieldNotFound {
    return get(new quickfix.field.LimitAmtCurrency());
  }

  public boolean isSet(quickfix.field.LimitAmtCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLimitAmtCurrency() {
    return isSetField(1634);
  }

  public void set(quickfix.field.LimitRole value) {
    setField(value);
  }

  public quickfix.field.LimitRole get(quickfix.field.LimitRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitRole getLimitRole() throws FieldNotFound {
    return get(new quickfix.field.LimitRole());
  }

  public boolean isSet(quickfix.field.LimitRole field) {
    return isSetField(field);
  }

  public boolean isSetLimitRole() {
    return isSetField(2396);
  }
}

  public void set(quickfix.field.ProcessCode value) {
    setField(value);
  }

  public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
    return get(new quickfix.field.ProcessCode());
  }

  public boolean isSet(quickfix.field.ProcessCode field) {
    return isSetField(field);
  }

  public boolean isSetProcessCode() {
    return isSetField(81);
  }

  public void set(quickfix.field.OddLot value) {
    setField(value);
  }

  public quickfix.field.OddLot get(quickfix.field.OddLot value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OddLot getOddLot() throws FieldNotFound {
    return get(new quickfix.field.OddLot());
  }

  public boolean isSet(quickfix.field.OddLot field) {
    return isSetField(field);
  }

  public boolean isSetOddLot() {
    return isSetField(575);
  }

  public void set(quickfix.fixlatest.component.ClrInstGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClrInstGrp get(quickfix.fixlatest.component.ClrInstGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClrInstGrp getClrInstGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClrInstGrp());
  }

  public void set(quickfix.field.NoClearingInstructions value) {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoClearingInstructions());
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions() {
    return isSetField(576);
  }

public static class NoClearingInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {577, 0};

  public NoClearingInstructions() {
    super(576, 577, ORDER);
  }

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
}

  public void set(quickfix.fixlatest.component.SideRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideRegulatoryTradeIDGrp get(quickfix.fixlatest.component.SideRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideRegulatoryTradeIDGrp getSideRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoSideRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoSideRegulatoryTradeIDs get(quickfix.field.NoSideRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideRegulatoryTradeIDs getNoSideRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSideRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoSideRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSideRegulatoryTradeIDs() {
    return isSetField(1971);
  }

public static class NoSideRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1972, 1973, 1974, 1975, 2416, 2398, 0};

  public NoSideRegulatoryTradeIDs() {
    super(1971, 1972, ORDER);
  }

  public void set(quickfix.field.SideRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeID get(quickfix.field.SideRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeID getSideRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeID() {
    return isSetField(1972);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDSource get(quickfix.field.SideRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDSource getSideRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDSource() {
    return isSetField(1973);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDEvent get(quickfix.field.SideRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDEvent getSideRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDEvent() {
    return isSetField(1974);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDType get(quickfix.field.SideRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDType getSideRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDType() {
    return isSetField(1975);
  }

  public void set(quickfix.field.SideRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryLegRefID get(quickfix.field.SideRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryLegRefID getSideRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.SideRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryLegRefID() {
    return isSetField(2416);
  }

  public void set(quickfix.field.SideRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.SideRegulatoryTradeIDScope get(quickfix.field.SideRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRegulatoryTradeIDScope getSideRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.SideRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.SideRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetSideRegulatoryTradeIDScope() {
    return isSetField(2398);
  }
}

  public void set(quickfix.field.SideTradeReportingIndicator value) {
    setField(value);
  }

  public quickfix.field.SideTradeReportingIndicator get(quickfix.field.SideTradeReportingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportingIndicator getSideTradeReportingIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideTradeReportingIndicator());
  }

  public boolean isSet(quickfix.field.SideTradeReportingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportingIndicator() {
    return isSetField(2671);
  }

  public void set(quickfix.field.FirmTradeEventID value) {
    setField(value);
  }

  public quickfix.field.FirmTradeEventID get(quickfix.field.FirmTradeEventID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeEventID getFirmTradeEventID() throws FieldNotFound {
    return get(new quickfix.field.FirmTradeEventID());
  }

  public boolean isSet(quickfix.field.FirmTradeEventID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTradeEventID() {
    return isSetField(2418);
  }

  public void set(quickfix.field.TradeInputSource value) {
    setField(value);
  }

  public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
    return get(new quickfix.field.TradeInputSource());
  }

  public boolean isSet(quickfix.field.TradeInputSource field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputSource() {
    return isSetField(578);
  }

  public void set(quickfix.field.TradeInputDevice value) {
    setField(value);
  }

  public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
    return get(new quickfix.field.TradeInputDevice());
  }

  public boolean isSet(quickfix.field.TradeInputDevice field) {
    return isSetField(field);
  }

  public boolean isSetTradeInputDevice() {
    return isSetField(579);
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

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
  }

  public void set(quickfix.field.CustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.CustOrderCapacity());
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity() {
    return isSetField(582);
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

  public void set(quickfix.field.TimeBracket value) {
    setField(value);
  }

  public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
    return get(new quickfix.field.TimeBracket());
  }

  public boolean isSet(quickfix.field.TimeBracket field) {
    return isSetField(field);
  }

  public boolean isSetTimeBracket() {
    return isSetField(943);
  }

  public void set(quickfix.field.RemunerationIndicator value) {
    setField(value);
  }

  public quickfix.field.RemunerationIndicator get(quickfix.field.RemunerationIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RemunerationIndicator getRemunerationIndicator() throws FieldNotFound {
    return get(new quickfix.field.RemunerationIndicator());
  }

  public boolean isSet(quickfix.field.RemunerationIndicator field) {
    return isSetField(field);
  }

  public boolean isSetRemunerationIndicator() {
    return isSetField(2356);
  }

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
  }

  public void set(quickfix.fixlatest.component.CommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionDataGrp get(quickfix.fixlatest.component.CommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionDataGrp getCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionDataGrp());
  }

  public void set(quickfix.field.NoCommissions value) {
    setField(value);
  }

  public quickfix.field.NoCommissions get(quickfix.field.NoCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCommissions getNoCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoCommissions());
  }

  public boolean isSet(quickfix.field.NoCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoCommissions() {
    return isSetField(2639);
  }

public static class NoCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2640, 2641, 2725, 2642, 2643, 2644, 2645, 2646, 2647, 2648, 2649, 2650, 2651, 2652, 0};

  public NoCommissions() {
    super(2639, 2640, ORDER);
  }

  public void set(quickfix.field.CommissionAmount value) {
    setField(value);
  }

  public quickfix.field.CommissionAmount get(quickfix.field.CommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmount getCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmount());
  }

  public boolean isSet(quickfix.field.CommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmount() {
    return isSetField(2640);
  }

  public void set(quickfix.field.CommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountType get(quickfix.field.CommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountType getCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountType());
  }

  public boolean isSet(quickfix.field.CommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountType() {
    return isSetField(2641);
  }

  public void set(quickfix.field.CommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountSubType get(quickfix.field.CommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountSubType getCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.CommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountSubType() {
    return isSetField(2725);
  }

  public void set(quickfix.field.CommissionBasis value) {
    setField(value);
  }

  public quickfix.field.CommissionBasis get(quickfix.field.CommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionBasis getCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.CommissionBasis());
  }

  public boolean isSet(quickfix.field.CommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetCommissionBasis() {
    return isSetField(2642);
  }

  public void set(quickfix.field.CommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionCurrency get(quickfix.field.CommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionCurrency getCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionCurrency());
  }

  public boolean isSet(quickfix.field.CommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionCurrency() {
    return isSetField(2643);
  }

  public void set(quickfix.field.CommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasure get(quickfix.field.CommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasure getCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasure() {
    return isSetField(2644);
  }

  public void set(quickfix.field.CommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency get(quickfix.field.CommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency getCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasureCurrency() {
    return isSetField(2645);
  }

  public void set(quickfix.field.CommissionRate value) {
    setField(value);
  }

  public quickfix.field.CommissionRate get(quickfix.field.CommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionRate getCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.CommissionRate());
  }

  public boolean isSet(quickfix.field.CommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetCommissionRate() {
    return isSetField(2646);
  }

  public void set(quickfix.field.CommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.CommissionSharedIndicator get(quickfix.field.CommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionSharedIndicator getCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.CommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.CommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCommissionSharedIndicator() {
    return isSetField(2647);
  }

  public void set(quickfix.field.CommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountShared get(quickfix.field.CommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountShared getCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountShared());
  }

  public boolean isSet(quickfix.field.CommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountShared() {
    return isSetField(2648);
  }

  public void set(quickfix.field.CommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.CommissionLegRefID get(quickfix.field.CommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionLegRefID getCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.CommissionLegRefID());
  }

  public boolean isSet(quickfix.field.CommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetCommissionLegRefID() {
    return isSetField(2649);
  }

  public void set(quickfix.field.CommissionDesc value) {
    setField(value);
  }

  public quickfix.field.CommissionDesc get(quickfix.field.CommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionDesc getCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.CommissionDesc());
  }

  public boolean isSet(quickfix.field.CommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetCommissionDesc() {
    return isSetField(2650);
  }

  public void set(quickfix.field.EncodedCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDescLen get(quickfix.field.EncodedCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDescLen getEncodedCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDescLen() {
    return isSetField(2651);
  }

  public void set(quickfix.field.EncodedCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDesc get(quickfix.field.EncodedCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDesc getEncodedCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDesc() {
    return isSetField(2652);
  }
}

  public void set(quickfix.field.NumDaysInterest value) {
    setField(value);
  }

  public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
    return get(new quickfix.field.NumDaysInterest());
  }

  public boolean isSet(quickfix.field.NumDaysInterest field) {
    return isSetField(field);
  }

  public boolean isSetNumDaysInterest() {
    return isSetField(157);
  }

  public void set(quickfix.field.ExDate value) {
    setField(value);
  }

  public quickfix.field.ExDate get(quickfix.field.ExDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDate getExDate() throws FieldNotFound {
    return get(new quickfix.field.ExDate());
  }

  public boolean isSet(quickfix.field.ExDate field) {
    return isSetField(field);
  }

  public boolean isSetExDate() {
    return isSetField(230);
  }

  public void set(quickfix.field.AccruedInterestRate value) {
    setField(value);
  }

  public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
    return get(new quickfix.field.AccruedInterestRate());
  }

  public boolean isSet(quickfix.field.AccruedInterestRate field) {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestRate() {
    return isSetField(158);
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

  public void set(quickfix.field.InterestAtMaturity value) {
    setField(value);
  }

  public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
    return get(new quickfix.field.InterestAtMaturity());
  }

  public boolean isSet(quickfix.field.InterestAtMaturity field) {
    return isSetField(field);
  }

  public boolean isSetInterestAtMaturity() {
    return isSetField(738);
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

  public void set(quickfix.field.Concession value) {
    setField(value);
  }

  public quickfix.field.Concession get(quickfix.field.Concession value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Concession getConcession() throws FieldNotFound {
    return get(new quickfix.field.Concession());
  }

  public boolean isSet(quickfix.field.Concession field) {
    return isSetField(field);
  }

  public boolean isSetConcession() {
    return isSetField(238);
  }

  public void set(quickfix.field.TotalTakedown value) {
    setField(value);
  }

  public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
    return get(new quickfix.field.TotalTakedown());
  }

  public boolean isSet(quickfix.field.TotalTakedown field) {
    return isSetField(field);
  }

  public boolean isSetTotalTakedown() {
    return isSetField(237);
  }

  public void set(quickfix.field.NetMoney value) {
    setField(value);
  }

  public quickfix.field.NetMoney get(quickfix.field.NetMoney value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NetMoney getNetMoney() throws FieldNotFound {
    return get(new quickfix.field.NetMoney());
  }

  public boolean isSet(quickfix.field.NetMoney field) {
    return isSetField(field);
  }

  public boolean isSetNetMoney() {
    return isSetField(118);
  }

  public void set(quickfix.field.SettlCurrAmt value) {
    setField(value);
  }

  public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrAmt());
  }

  public boolean isSet(quickfix.field.SettlCurrAmt field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrAmt() {
    return isSetField(119);
  }

  public void set(quickfix.field.SettlCurrFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRate() {
    return isSetField(155);
  }

  public void set(quickfix.field.SettlCurrFxRateCalc value) {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrFxRateCalc());
  }

  public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRateCalc() {
    return isSetField(156);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
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

  public void set(quickfix.field.SideMultiLegReportingType value) {
    setField(value);
  }

  public quickfix.field.SideMultiLegReportingType get(quickfix.field.SideMultiLegReportingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound {
    return get(new quickfix.field.SideMultiLegReportingType());
  }

  public boolean isSet(quickfix.field.SideMultiLegReportingType field) {
    return isSetField(field);
  }

  public boolean isSetSideMultiLegReportingType() {
    return isSetField(752);
  }

  public void set(quickfix.fixlatest.component.ContAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ContAmtGrp get(quickfix.fixlatest.component.ContAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ContAmtGrp getContAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ContAmtGrp());
  }

  public void set(quickfix.field.NoContAmts value) {
    setField(value);
  }

  public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
    return get(new quickfix.field.NoContAmts());
  }

  public boolean isSet(quickfix.field.NoContAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoContAmts() {
    return isSetField(518);
  }

public static class NoContAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {519, 520, 521, 0};

  public NoContAmts() {
    super(518, 519, ORDER);
  }

  public void set(quickfix.field.ContAmtType value) {
    setField(value);
  }

  public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
    return get(new quickfix.field.ContAmtType());
  }

  public boolean isSet(quickfix.field.ContAmtType field) {
    return isSetField(field);
  }

  public boolean isSetContAmtType() {
    return isSetField(519);
  }

  public void set(quickfix.field.ContAmtValue value) {
    setField(value);
  }

  public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
    return get(new quickfix.field.ContAmtValue());
  }

  public boolean isSet(quickfix.field.ContAmtValue field) {
    return isSetField(field);
  }

  public boolean isSetContAmtValue() {
    return isSetField(520);
  }

  public void set(quickfix.field.ContAmtCurr value) {
    setField(value);
  }

  public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
    return get(new quickfix.field.ContAmtCurr());
  }

  public boolean isSet(quickfix.field.ContAmtCurr field) {
    return isSetField(field);
  }

  public boolean isSetContAmtCurr() {
    return isSetField(521);
  }
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

  public void set(quickfix.field.ExchangeRule value) {
    setField(value);
  }

  public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
    return get(new quickfix.field.ExchangeRule());
  }

  public boolean isSet(quickfix.field.ExchangeRule field) {
    return isSetField(field);
  }

  public boolean isSetExchangeRule() {
    return isSetField(825);
  }

  public void set(quickfix.field.TradeAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocIndicator());
  }

  public boolean isSet(quickfix.field.TradeAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocIndicator() {
    return isSetField(826);
  }

  public void set(quickfix.field.TradeAllocGroupInstruction value) {
    setField(value);
  }

  public quickfix.field.TradeAllocGroupInstruction get(quickfix.field.TradeAllocGroupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocGroupInstruction getTradeAllocGroupInstruction() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocGroupInstruction());
  }

  public boolean isSet(quickfix.field.TradeAllocGroupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocGroupInstruction() {
    return isSetField(1848);
  }

  public void set(quickfix.field.AllocGroupID value) {
    setField(value);
  }

  public quickfix.field.AllocGroupID get(quickfix.field.AllocGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupID getAllocGroupID() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupID());
  }

  public boolean isSet(quickfix.field.AllocGroupID field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupID() {
    return isSetField(1730);
  }

  public void set(quickfix.field.PreviousAllocGroupID value) {
    setField(value);
  }

  public quickfix.field.PreviousAllocGroupID get(quickfix.field.PreviousAllocGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviousAllocGroupID getPreviousAllocGroupID() throws FieldNotFound {
    return get(new quickfix.field.PreviousAllocGroupID());
  }

  public boolean isSet(quickfix.field.PreviousAllocGroupID field) {
    return isSetField(field);
  }

  public boolean isSetPreviousAllocGroupID() {
    return isSetField(2771);
  }

  public void set(quickfix.field.GroupAmount value) {
    setField(value);
  }

  public quickfix.field.GroupAmount get(quickfix.field.GroupAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.GroupAmount getGroupAmount() throws FieldNotFound {
    return get(new quickfix.field.GroupAmount());
  }

  public boolean isSet(quickfix.field.GroupAmount field) {
    return isSetField(field);
  }

  public boolean isSetGroupAmount() {
    return isSetField(2759);
  }

  public void set(quickfix.field.AllocGroupStatus value) {
    setField(value);
  }

  public quickfix.field.AllocGroupStatus get(quickfix.field.AllocGroupStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocGroupStatus getAllocGroupStatus() throws FieldNotFound {
    return get(new quickfix.field.AllocGroupStatus());
  }

  public boolean isSet(quickfix.field.AllocGroupStatus field) {
    return isSetField(field);
  }

  public boolean isSetAllocGroupStatus() {
    return isSetField(2767);
  }

  public void set(quickfix.field.SideAvgPxIndicator value) {
    setField(value);
  }

  public quickfix.field.SideAvgPxIndicator get(quickfix.field.SideAvgPxIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPxIndicator getSideAvgPxIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPxIndicator());
  }

  public boolean isSet(quickfix.field.SideAvgPxIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPxIndicator() {
    return isSetField(1853);
  }

  public void set(quickfix.field.SideAvgPxGroupID value) {
    setField(value);
  }

  public quickfix.field.SideAvgPxGroupID get(quickfix.field.SideAvgPxGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPxGroupID getSideAvgPxGroupID() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPxGroupID());
  }

  public boolean isSet(quickfix.field.SideAvgPxGroupID field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPxGroupID() {
    return isSetField(1854);
  }

  public void set(quickfix.field.SideAvgPx value) {
    setField(value);
  }

  public quickfix.field.SideAvgPx get(quickfix.field.SideAvgPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideAvgPx getSideAvgPx() throws FieldNotFound {
    return get(new quickfix.field.SideAvgPx());
  }

  public boolean isSet(quickfix.field.SideAvgPx field) {
    return isSetField(field);
  }

  public boolean isSetSideAvgPx() {
    return isSetField(1852);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.TrdAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdAllocGrp get(quickfix.fixlatest.component.TrdAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdAllocGrp getTrdAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 1593, 2727, 1908, 1729, 756, 209, 80, 2515, 1752, 1753, 1754, 1755, 993, 1002, 989, 1136, 1844, 1840, 1735, 161, 360, 361, 1732, 1733, 1734, 2392, 2393, 2653, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.ParentAllocID value) {
    setField(value);
  }

  public quickfix.field.ParentAllocID get(quickfix.field.ParentAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentAllocID getParentAllocID() throws FieldNotFound {
    return get(new quickfix.field.ParentAllocID());
  }

  public boolean isSet(quickfix.field.ParentAllocID field) {
    return isSetField(field);
  }

  public boolean isSetParentAllocID() {
    return isSetField(1593);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp get(quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp getAllocRegulatoryTradeIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocRegulatoryTradeIDGrp());
  }

  public void set(quickfix.field.NoAllocRegulatoryTradeIDs value) {
    setField(value);
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs get(quickfix.field.NoAllocRegulatoryTradeIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocRegulatoryTradeIDs getNoAllocRegulatoryTradeIDs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocRegulatoryTradeIDs());
  }

  public boolean isSet(quickfix.field.NoAllocRegulatoryTradeIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocRegulatoryTradeIDs() {
    return isSetField(1908);
  }

public static class NoAllocRegulatoryTradeIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1909, 1910, 1911, 1912, 2406, 2399, 0};

  public NoAllocRegulatoryTradeIDs() {
    super(1908, 1909, ORDER);
  }

  public void set(quickfix.field.AllocRegulatoryTradeID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeID get(quickfix.field.AllocRegulatoryTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeID getAllocRegulatoryTradeID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeID() {
    return isSetField(1909);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDSource get(quickfix.field.AllocRegulatoryTradeIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDSource getAllocRegulatoryTradeIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDSource());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDSource() {
    return isSetField(1910);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDEvent value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent get(quickfix.field.AllocRegulatoryTradeIDEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDEvent getAllocRegulatoryTradeIDEvent() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDEvent());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDEvent field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDEvent() {
    return isSetField(1911);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDType get(quickfix.field.AllocRegulatoryTradeIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDType getAllocRegulatoryTradeIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDType());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDType() {
    return isSetField(1912);
  }

  public void set(quickfix.field.AllocRegulatoryLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryLegRefID get(quickfix.field.AllocRegulatoryLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryLegRefID getAllocRegulatoryLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryLegRefID());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryLegRefID() {
    return isSetField(2406);
  }

  public void set(quickfix.field.AllocRegulatoryTradeIDScope value) {
    setField(value);
  }

  public quickfix.field.AllocRegulatoryTradeIDScope get(quickfix.field.AllocRegulatoryTradeIDScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRegulatoryTradeIDScope getAllocRegulatoryTradeIDScope() throws FieldNotFound {
    return get(new quickfix.field.AllocRegulatoryTradeIDScope());
  }

  public boolean isSet(quickfix.field.AllocRegulatoryTradeIDScope field) {
    return isSetField(field);
  }

  public boolean isSetAllocRegulatoryTradeIDScope() {
    return isSetField(2399);
  }
}

  public void set(quickfix.field.FirmMnemonic value) {
    setField(value);
  }

  public quickfix.field.FirmMnemonic get(quickfix.field.FirmMnemonic value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmMnemonic getFirmMnemonic() throws FieldNotFound {
    return get(new quickfix.field.FirmMnemonic());
  }

  public boolean isSet(quickfix.field.FirmMnemonic field) {
    return isSetField(field);
  }

  public boolean isSetFirmMnemonic() {
    return isSetField(1729);
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

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.AllocCalculatedCcyQty value) {
    setField(value);
  }

  public quickfix.field.AllocCalculatedCcyQty get(quickfix.field.AllocCalculatedCcyQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCalculatedCcyQty getAllocCalculatedCcyQty() throws FieldNotFound {
    return get(new quickfix.field.AllocCalculatedCcyQty());
  }

  public boolean isSet(quickfix.field.AllocCalculatedCcyQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocCalculatedCcyQty() {
    return isSetField(2515);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }

  public void set(quickfix.field.AllocCustomerCapacity value) {
    setField(value);
  }

  public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
    return get(new quickfix.field.AllocCustomerCapacity());
  }

  public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
    return isSetField(field);
  }

  public boolean isSetAllocCustomerCapacity() {
    return isSetField(993);
  }

  public void set(quickfix.field.AllocMethod value) {
    setField(value);
  }

  public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound {
    return get(new quickfix.field.AllocMethod());
  }

  public boolean isSet(quickfix.field.AllocMethod field) {
    return isSetField(field);
  }

  public boolean isSetAllocMethod() {
    return isSetField(1002);
  }

  public void set(quickfix.field.SecondaryIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryIndividualAllocID());
  }

  public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryIndividualAllocID() {
    return isSetField(989);
  }

  public void set(quickfix.field.AllocClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.AllocClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocClearingFeeIndicator() {
    return isSetField(1136);
  }

  public void set(quickfix.fixlatest.component.TradeAllocAmtGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp get(quickfix.fixlatest.component.TradeAllocAmtGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeAllocAmtGrp getTradeAllocAmtGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeAllocAmtGrp());
  }

  public void set(quickfix.field.NoTradeAllocAmts value) {
    setField(value);
  }

  public quickfix.field.NoTradeAllocAmts get(quickfix.field.NoTradeAllocAmts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradeAllocAmts getNoTradeAllocAmts() throws FieldNotFound {
    return get(new quickfix.field.NoTradeAllocAmts());
  }

  public boolean isSet(quickfix.field.NoTradeAllocAmts field) {
    return isSetField(field);
  }

  public boolean isSetNoTradeAllocAmts() {
    return isSetField(1844);
  }

public static class NoTradeAllocAmts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1845, 1846, 1847, 1850, 0};

  public NoTradeAllocAmts() {
    super(1844, 1845, ORDER);
  }

  public void set(quickfix.field.TradeAllocAmtType value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtType get(quickfix.field.TradeAllocAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtType getTradeAllocAmtType() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtType());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtType field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtType() {
    return isSetField(1845);
  }

  public void set(quickfix.field.TradeAllocAmt value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmt get(quickfix.field.TradeAllocAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmt getTradeAllocAmt() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmt());
  }

  public boolean isSet(quickfix.field.TradeAllocAmt field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmt() {
    return isSetField(1846);
  }

  public void set(quickfix.field.TradeAllocCurrency value) {
    setField(value);
  }

  public quickfix.field.TradeAllocCurrency get(quickfix.field.TradeAllocCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocCurrency getTradeAllocCurrency() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocCurrency());
  }

  public boolean isSet(quickfix.field.TradeAllocCurrency field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocCurrency() {
    return isSetField(1847);
  }

  public void set(quickfix.field.TradeAllocAmtReason value) {
    setField(value);
  }

  public quickfix.field.TradeAllocAmtReason get(quickfix.field.TradeAllocAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocAmtReason getTradeAllocAmtReason() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocAmtReason());
  }

  public boolean isSet(quickfix.field.TradeAllocAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocAmtReason() {
    return isSetField(1850);
  }
}

  public void set(quickfix.field.TradeAllocStatus value) {
    setField(value);
  }

  public quickfix.field.TradeAllocStatus get(quickfix.field.TradeAllocStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocStatus getTradeAllocStatus() throws FieldNotFound {
    return get(new quickfix.field.TradeAllocStatus());
  }

  public boolean isSet(quickfix.field.TradeAllocStatus field) {
    return isSetField(field);
  }

  public boolean isSetTradeAllocStatus() {
    return isSetField(1840);
  }

  public void set(quickfix.field.AllocationRollupInstruction value) {
    setField(value);
  }

  public quickfix.field.AllocationRollupInstruction get(quickfix.field.AllocationRollupInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocationRollupInstruction getAllocationRollupInstruction() throws FieldNotFound {
    return get(new quickfix.field.AllocationRollupInstruction());
  }

  public boolean isSet(quickfix.field.AllocationRollupInstruction field) {
    return isSetField(field);
  }

  public boolean isSetAllocationRollupInstruction() {
    return isSetField(1735);
  }

  public void set(quickfix.field.AllocText value) {
    setField(value);
  }

  public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocText getAllocText() throws FieldNotFound {
    return get(new quickfix.field.AllocText());
  }

  public boolean isSet(quickfix.field.AllocText field) {
    return isSetField(field);
  }

  public boolean isSetAllocText() {
    return isSetField(161);
  }

  public void set(quickfix.field.EncodedAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocTextLen() {
    return isSetField(360);
  }

  public void set(quickfix.field.EncodedAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocText());
  }

  public boolean isSet(quickfix.field.EncodedAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocText() {
    return isSetField(361);
  }

  public void set(quickfix.field.FirmAllocText value) {
    setField(value);
  }

  public quickfix.field.FirmAllocText get(quickfix.field.FirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmAllocText getFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.FirmAllocText());
  }

  public boolean isSet(quickfix.field.FirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetFirmAllocText() {
    return isSetField(1732);
  }

  public void set(quickfix.field.EncodedFirmAllocTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocTextLen get(quickfix.field.EncodedFirmAllocTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocTextLen getEncodedFirmAllocTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocTextLen());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocTextLen() {
    return isSetField(1733);
  }

  public void set(quickfix.field.EncodedFirmAllocText value) {
    setField(value);
  }

  public quickfix.field.EncodedFirmAllocText get(quickfix.field.EncodedFirmAllocText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFirmAllocText getEncodedFirmAllocText() throws FieldNotFound {
    return get(new quickfix.field.EncodedFirmAllocText());
  }

  public boolean isSet(quickfix.field.EncodedFirmAllocText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFirmAllocText() {
    return isSetField(1734);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckID get(quickfix.field.AllocRefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckID getAllocRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckID() {
    return isSetField(2392);
  }

  public void set(quickfix.field.AllocRefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType get(quickfix.field.AllocRefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocRefRiskLimitCheckIDType getAllocRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.AllocRefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.AllocRefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetAllocRefRiskLimitCheckIDType() {
    return isSetField(2393);
  }

  public void set(quickfix.fixlatest.component.AllocCommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp get(quickfix.fixlatest.component.AllocCommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AllocCommissionDataGrp getAllocCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AllocCommissionDataGrp());
  }

  public void set(quickfix.field.NoAllocCommissions value) {
    setField(value);
  }

  public quickfix.field.NoAllocCommissions get(quickfix.field.NoAllocCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocCommissions getNoAllocCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoAllocCommissions());
  }

  public boolean isSet(quickfix.field.NoAllocCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocCommissions() {
    return isSetField(2653);
  }

public static class NoAllocCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2654, 2655, 2726, 2656, 2657, 2658, 2659, 2660, 2661, 2662, 2663, 2664, 2665, 2666, 0};

  public NoAllocCommissions() {
    super(2653, 2654, ORDER);
  }

  public void set(quickfix.field.AllocCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmount get(quickfix.field.AllocCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmount getAllocCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmount());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmount() {
    return isSetField(2654);
  }

  public void set(quickfix.field.AllocCommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountType get(quickfix.field.AllocCommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountType getAllocCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountType() {
    return isSetField(2655);
  }

  public void set(quickfix.field.AllocCommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountSubType get(quickfix.field.AllocCommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountSubType getAllocCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountSubType() {
    return isSetField(2726);
  }

  public void set(quickfix.field.AllocCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionBasis get(quickfix.field.AllocCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionBasis getAllocCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionBasis());
  }

  public boolean isSet(quickfix.field.AllocCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionBasis() {
    return isSetField(2656);
  }

  public void set(quickfix.field.AllocCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionCurrency get(quickfix.field.AllocCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionCurrency getAllocCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionCurrency() {
    return isSetField(2657);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasure get(quickfix.field.AllocCommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasure getAllocCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasure() {
    return isSetField(2658);
  }

  public void set(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency get(quickfix.field.AllocCommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionUnitOfMeasureCurrency getAllocCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.AllocCommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionUnitOfMeasureCurrency() {
    return isSetField(2659);
  }

  public void set(quickfix.field.AllocCommissionRate value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionRate get(quickfix.field.AllocCommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionRate getAllocCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionRate());
  }

  public boolean isSet(quickfix.field.AllocCommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionRate() {
    return isSetField(2660);
  }

  public void set(quickfix.field.AllocCommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionSharedIndicator get(quickfix.field.AllocCommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionSharedIndicator getAllocCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.AllocCommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionSharedIndicator() {
    return isSetField(2661);
  }

  public void set(quickfix.field.AllocCommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionAmountShared get(quickfix.field.AllocCommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionAmountShared getAllocCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionAmountShared());
  }

  public boolean isSet(quickfix.field.AllocCommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionAmountShared() {
    return isSetField(2662);
  }

  public void set(quickfix.field.AllocCommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionLegRefID get(quickfix.field.AllocCommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionLegRefID getAllocCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionLegRefID());
  }

  public boolean isSet(quickfix.field.AllocCommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionLegRefID() {
    return isSetField(2663);
  }

  public void set(quickfix.field.AllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.AllocCommissionDesc get(quickfix.field.AllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCommissionDesc getAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.AllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.AllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetAllocCommissionDesc() {
    return isSetField(2664);
  }

  public void set(quickfix.field.EncodedAllocCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDescLen get(quickfix.field.EncodedAllocCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDescLen getEncodedAllocCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDescLen() {
    return isSetField(2665);
  }

  public void set(quickfix.field.EncodedAllocCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAllocCommissionDesc get(quickfix.field.EncodedAllocCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAllocCommissionDesc getEncodedAllocCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAllocCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedAllocCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAllocCommissionDesc() {
    return isSetField(2666);
  }
}
}

  public void set(quickfix.fixlatest.component.SideTrdRegTS component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideTrdRegTS get(quickfix.fixlatest.component.SideTrdRegTS component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideTrdRegTS getSideTrdRegTSComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideTrdRegTS());
  }

  public void set(quickfix.field.NoSideTrdRegTS value) {
    setField(value);
  }

  public quickfix.field.NoSideTrdRegTS get(quickfix.field.NoSideTrdRegTS value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideTrdRegTS getNoSideTrdRegTS() throws FieldNotFound {
    return get(new quickfix.field.NoSideTrdRegTS());
  }

  public boolean isSet(quickfix.field.NoSideTrdRegTS field) {
    return isSetField(field);
  }

  public boolean isSetNoSideTrdRegTS() {
    return isSetField(1016);
  }

public static class NoSideTrdRegTS extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1012, 1013, 1014, 0};

  public NoSideTrdRegTS() {
    super(1016, 1012, ORDER);
  }

  public void set(quickfix.field.SideTrdRegTimestamp value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestamp get(quickfix.field.SideTrdRegTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestamp getSideTrdRegTimestamp() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestamp());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestamp() {
    return isSetField(1012);
  }

  public void set(quickfix.field.SideTrdRegTimestampType value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampType get(quickfix.field.SideTrdRegTimestampType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampType getSideTrdRegTimestampType() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestampType());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampType field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampType() {
    return isSetField(1013);
  }

  public void set(quickfix.field.SideTrdRegTimestampSrc value) {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampSrc get(quickfix.field.SideTrdRegTimestampSrc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampSrc getSideTrdRegTimestampSrc() throws FieldNotFound {
    return get(new quickfix.field.SideTrdRegTimestampSrc());
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampSrc field) {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampSrc() {
    return isSetField(1014);
  }
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

  public void set(quickfix.field.SideGrossTradeAmt value) {
    setField(value);
  }

  public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound {
    return get(new quickfix.field.SideGrossTradeAmt());
  }

  public boolean isSet(quickfix.field.SideGrossTradeAmt field) {
    return isSetField(field);
  }

  public boolean isSetSideGrossTradeAmt() {
    return isSetField(1072);
  }

  public void set(quickfix.field.AggressorIndicator value) {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
    return get(new quickfix.field.AggressorIndicator());
  }

  public boolean isSet(quickfix.field.AggressorIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator() {
    return isSetField(1057);
  }

  public void set(quickfix.field.ExchangeSpecialInstructions value) {
    setField(value);
  }

  public quickfix.field.ExchangeSpecialInstructions get(quickfix.field.ExchangeSpecialInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeSpecialInstructions getExchangeSpecialInstructions() throws FieldNotFound {
    return get(new quickfix.field.ExchangeSpecialInstructions());
  }

  public boolean isSet(quickfix.field.ExchangeSpecialInstructions field) {
    return isSetField(field);
  }

  public boolean isSetExchangeSpecialInstructions() {
    return isSetField(1139);
  }

  public void set(quickfix.field.SideShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.SideShortSaleExemptionReason get(quickfix.field.SideShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideShortSaleExemptionReason getSideShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.SideShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.SideShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetSideShortSaleExemptionReason() {
    return isSetField(1690);
  }

  public void set(quickfix.field.OrderCategory value) {
    setField(value);
  }

  public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
    return get(new quickfix.field.OrderCategory());
  }

  public boolean isSet(quickfix.field.OrderCategory field) {
    return isSetField(field);
  }

  public boolean isSetOrderCategory() {
    return isSetField(1115);
  }

  public void set(quickfix.field.SideLiquidityInd value) {
    setField(value);
  }

  public quickfix.field.SideLiquidityInd get(quickfix.field.SideLiquidityInd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideLiquidityInd getSideLiquidityInd() throws FieldNotFound {
    return get(new quickfix.field.SideLiquidityInd());
  }

  public boolean isSet(quickfix.field.SideLiquidityInd field) {
    return isSetField(field);
  }

  public boolean isSetSideLiquidityInd() {
    return isSetField(1444);
  }

  public void set(quickfix.field.StrategyLinkID value) {
    setField(value);
  }

  public quickfix.field.StrategyLinkID get(quickfix.field.StrategyLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyLinkID getStrategyLinkID() throws FieldNotFound {
    return get(new quickfix.field.StrategyLinkID());
  }

  public boolean isSet(quickfix.field.StrategyLinkID field) {
    return isSetField(field);
  }

  public boolean isSetStrategyLinkID() {
    return isSetField(1851);
  }

  public void set(quickfix.fixlatest.component.TradeReportOrderDetail component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail get(quickfix.fixlatest.component.TradeReportOrderDetail component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradeReportOrderDetail getTradeReportOrderDetailComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradeReportOrderDetail());
  }

  public void set(quickfix.field.CustOrderHandlingInst value) {
    setField(value);
  }

  public quickfix.field.CustOrderHandlingInst get(quickfix.field.CustOrderHandlingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderHandlingInst getCustOrderHandlingInst() throws FieldNotFound {
    return get(new quickfix.field.CustOrderHandlingInst());
  }

  public boolean isSet(quickfix.field.CustOrderHandlingInst field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderHandlingInst() {
    return isSetField(1031);
  }

  public void set(quickfix.field.OrderHandlingInstSource value) {
    setField(value);
  }

  public quickfix.field.OrderHandlingInstSource get(quickfix.field.OrderHandlingInstSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderHandlingInstSource getOrderHandlingInstSource() throws FieldNotFound {
    return get(new quickfix.field.OrderHandlingInstSource());
  }

  public boolean isSet(quickfix.field.OrderHandlingInstSource field) {
    return isSetField(field);
  }

  public boolean isSetOrderHandlingInstSource() {
    return isSetField(1032);
  }

  public void set(quickfix.fixlatest.component.TradePositionQty component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePositionQty get(quickfix.fixlatest.component.TradePositionQty component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePositionQty getTradePositionQtyComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePositionQty());
  }

  public void set(quickfix.field.NoPositions value) {
    setField(value);
  }

  public quickfix.field.NoPositions get(quickfix.field.NoPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPositions getNoPositions() throws FieldNotFound {
    return get(new quickfix.field.NoPositions());
  }

  public boolean isSet(quickfix.field.NoPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoPositions() {
    return isSetField(702);
  }

public static class NoPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {703, 704, 705, 1654, 706, 976, 0};

  public NoPositions() {
    super(702, 703, ORDER);
  }

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }
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

  public void set(quickfix.fixlatest.component.RelatedPositionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPositionGrp get(quickfix.fixlatest.component.RelatedPositionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPositionGrp getRelatedPositionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPositionGrp());
  }

  public void set(quickfix.field.NoRelatedPositions value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPositions get(quickfix.field.NoRelatedPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPositions getNoRelatedPositions() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPositions());
  }

  public boolean isSet(quickfix.field.NoRelatedPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPositions() {
    return isSetField(1861);
  }

public static class NoRelatedPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1862, 1863, 1864, 0};

  public NoRelatedPositions() {
    super(1861, 1862, ORDER);
  }

  public void set(quickfix.field.RelatedPositionID value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionID get(quickfix.field.RelatedPositionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionID getRelatedPositionID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionID());
  }

  public boolean isSet(quickfix.field.RelatedPositionID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionID() {
    return isSetField(1862);
  }

  public void set(quickfix.field.RelatedPositionIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionIDSource get(quickfix.field.RelatedPositionIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionIDSource getRelatedPositionIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPositionIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionIDSource() {
    return isSetField(1863);
  }

  public void set(quickfix.field.RelatedPositionDate value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionDate get(quickfix.field.RelatedPositionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionDate getRelatedPositionDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionDate());
  }

  public boolean isSet(quickfix.field.RelatedPositionDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionDate() {
    return isSetField(1864);
  }
}

  public void set(quickfix.field.BlockTrdAllocIndicator value) {
    setField(value);
  }

  public quickfix.field.BlockTrdAllocIndicator get(quickfix.field.BlockTrdAllocIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BlockTrdAllocIndicator getBlockTrdAllocIndicator() throws FieldNotFound {
    return get(new quickfix.field.BlockTrdAllocIndicator());
  }

  public boolean isSet(quickfix.field.BlockTrdAllocIndicator field) {
    return isSetField(field);
  }

  public boolean isSetBlockTrdAllocIndicator() {
    return isSetField(1980);
  }

  public void set(quickfix.field.SideRiskLimitCheckStatus value) {
    setField(value);
  }

  public quickfix.field.SideRiskLimitCheckStatus get(quickfix.field.SideRiskLimitCheckStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideRiskLimitCheckStatus getSideRiskLimitCheckStatus() throws FieldNotFound {
    return get(new quickfix.field.SideRiskLimitCheckStatus());
  }

  public boolean isSet(quickfix.field.SideRiskLimitCheckStatus field) {
    return isSetField(field);
  }

  public boolean isSetSideRiskLimitCheckStatus() {
    return isSetField(2344);
  }

  public void set(quickfix.field.LastCapacity value) {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
    return get(new quickfix.field.LastCapacity());
  }

  public boolean isSet(quickfix.field.LastCapacity field) {
    return isSetField(field);
  }

  public boolean isSetLastCapacity() {
    return isSetField(29);
  }

  public void set(quickfix.field.RefRiskLimitCheckID value) {
    setField(value);
  }

  public quickfix.field.RefRiskLimitCheckID get(quickfix.field.RefRiskLimitCheckID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefRiskLimitCheckID getRefRiskLimitCheckID() throws FieldNotFound {
    return get(new quickfix.field.RefRiskLimitCheckID());
  }

  public boolean isSet(quickfix.field.RefRiskLimitCheckID field) {
    return isSetField(field);
  }

  public boolean isSetRefRiskLimitCheckID() {
    return isSetField(2334);
  }

  public void set(quickfix.field.RefRiskLimitCheckIDType value) {
    setField(value);
  }

  public quickfix.field.RefRiskLimitCheckIDType get(quickfix.field.RefRiskLimitCheckIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefRiskLimitCheckIDType getRefRiskLimitCheckIDType() throws FieldNotFound {
    return get(new quickfix.field.RefRiskLimitCheckIDType());
  }

  public boolean isSet(quickfix.field.RefRiskLimitCheckIDType field) {
    return isSetField(field);
  }

  public boolean isSetRefRiskLimitCheckIDType() {
    return isSetField(2335);
  }

  public void set(quickfix.field.CompressionGroupID value) {
    setField(value);
  }

  public quickfix.field.CompressionGroupID get(quickfix.field.CompressionGroupID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CompressionGroupID getCompressionGroupID() throws FieldNotFound {
    return get(new quickfix.field.CompressionGroupID());
  }

  public boolean isSet(quickfix.field.CompressionGroupID field) {
    return isSetField(field);
  }

  public boolean isSetCompressionGroupID() {
    return isSetField(2361);
  }

  public void set(quickfix.fixlatest.component.SideCollateralAmountGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCollateralAmountGrp get(quickfix.fixlatest.component.SideCollateralAmountGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCollateralAmountGrp getSideCollateralAmountGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCollateralAmountGrp());
  }

  public void set(quickfix.field.NoSideCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralAmounts get(quickfix.field.NoSideCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralAmounts getNoSideCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoSideCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralAmounts() {
    return isSetField(2691);
  }

public static class NoSideCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2702, 2695, 2694, 2696, 2697, 2701, 2693, 2692, 2703, 2700, 2699, 2698, 2862, 2864, 2863, 0};

  public NoSideCollateralAmounts() {
    super(2691, 2702, ORDER);
  }

  public void set(quickfix.field.SideCurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.SideCurrentCollateralAmount get(quickfix.field.SideCurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrentCollateralAmount getSideCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.SideCurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrentCollateralAmount() {
    return isSetField(2702);
  }

  public void set(quickfix.field.SideCollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralCurrency get(quickfix.field.SideCollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralCurrency getSideCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralCurrency() {
    return isSetField(2695);
  }

  public void set(quickfix.field.SideCollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountType get(quickfix.field.SideCollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountType getSideCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountType());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountType() {
    return isSetField(2694);
  }

  public void set(quickfix.field.SideCollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRate get(quickfix.field.SideCollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRate getSideCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRate());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRate() {
    return isSetField(2696);
  }

  public void set(quickfix.field.SideCollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRateCalc get(quickfix.field.SideCollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRateCalc getSideCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRateCalc() {
    return isSetField(2697);
  }

  public void set(quickfix.field.SideCollateralType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralType get(quickfix.field.SideCollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralType getSideCollateralType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralType());
  }

  public boolean isSet(quickfix.field.SideCollateralType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralType() {
    return isSetField(2701);
  }

  public void set(quickfix.field.SideCollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID get(quickfix.field.SideCollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID getSideCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketSegmentID() {
    return isSetField(2693);
  }

  public void set(quickfix.field.SideCollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketID get(quickfix.field.SideCollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketID getSideCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketID() {
    return isSetField(2692);
  }

  public void set(quickfix.field.SideHaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.SideHaircutIndicator get(quickfix.field.SideHaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideHaircutIndicator getSideHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideHaircutIndicator());
  }

  public boolean isSet(quickfix.field.SideHaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideHaircutIndicator() {
    return isSetField(2703);
  }

  public void set(quickfix.field.SideCollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPortfolioID get(quickfix.field.SideCollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPortfolioID getSideCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.SideCollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPortfolioID() {
    return isSetField(2700);
  }

  public void set(quickfix.field.SideCollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPercentOverage get(quickfix.field.SideCollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPercentOverage getSideCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.SideCollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPercentOverage() {
    return isSetField(2699);
  }

  public void set(quickfix.field.SideCollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.SideCollateralMarketPrice get(quickfix.field.SideCollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralMarketPrice getSideCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.SideCollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralMarketPrice() {
    return isSetField(2698);
  }

  public void set(quickfix.field.SideCollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentRate get(quickfix.field.SideCollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentRate getSideCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentRate() {
    return isSetField(2862);
  }

  public void set(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp get(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp getSideCollateralReinvestmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCollateralReinvestmentGrp());
  }

  public void set(quickfix.field.NoSideCollateralReinvestments value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralReinvestments get(quickfix.field.NoSideCollateralReinvestments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralReinvestments getNoSideCollateralReinvestments() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralReinvestments());
  }

  public boolean isSet(quickfix.field.NoSideCollateralReinvestments field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralReinvestments() {
    return isSetField(2864);
  }

public static class NoSideCollateralReinvestments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2867, 2865, 2866, 0};

  public NoSideCollateralReinvestments() {
    super(2864, 2867, ORDER);
  }

  public void set(quickfix.field.SideCollateralReinvestmentType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentType get(quickfix.field.SideCollateralReinvestmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentType getSideCollateralReinvestmentType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentType());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentType() {
    return isSetField(2867);
  }

  public void set(quickfix.field.SideCollateralReinvestmentAmount value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentAmount get(quickfix.field.SideCollateralReinvestmentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentAmount getSideCollateralReinvestmentAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentAmount());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentAmount() {
    return isSetField(2865);
  }

  public void set(quickfix.field.SideCollateralReinvestmentCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentCurrency get(quickfix.field.SideCollateralReinvestmentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentCurrency getSideCollateralReinvestmentCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentCurrency() {
    return isSetField(2866);
  }
}

  public void set(quickfix.field.SideUnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.SideUnderlyingRefID get(quickfix.field.SideUnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideUnderlyingRefID getSideUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.SideUnderlyingRefID());
  }

  public boolean isSet(quickfix.field.SideUnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideUnderlyingRefID() {
    return isSetField(2863);
  }
}
}
