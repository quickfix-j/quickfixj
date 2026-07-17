/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class SettlementObligationReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BQ";

  public SettlementObligationReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public SettlementObligationReport (quickfix.field.SettlObligMsgID settlObligMsgID, quickfix.field.SettlObligMode settlObligMode) {
    this();
    setField(settlObligMsgID);
    setField(settlObligMode);
  }

  public void set(quickfix.fixlatest.component.ApplicationSequenceControl component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl get(quickfix.fixlatest.component.ApplicationSequenceControl component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl getApplicationSequenceControlComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ApplicationSequenceControl());
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

  public void set(quickfix.field.SettlementCycleNo value) {
    setField(value);
  }

  public quickfix.field.SettlementCycleNo get(quickfix.field.SettlementCycleNo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementCycleNo getSettlementCycleNo() throws FieldNotFound {
    return get(new quickfix.field.SettlementCycleNo());
  }

  public boolean isSet(quickfix.field.SettlementCycleNo field) {
    return isSetField(field);
  }

  public boolean isSetSettlementCycleNo() {
    return isSetField(1153);
  }

  public void set(quickfix.field.SettlObligMsgID value) {
    setField(value);
  }

  public quickfix.field.SettlObligMsgID get(quickfix.field.SettlObligMsgID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligMsgID getSettlObligMsgID() throws FieldNotFound {
    return get(new quickfix.field.SettlObligMsgID());
  }

  public boolean isSet(quickfix.field.SettlObligMsgID field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligMsgID() {
    return isSetField(1160);
  }

  public void set(quickfix.field.SettlObligMode value) {
    setField(value);
  }

  public quickfix.field.SettlObligMode get(quickfix.field.SettlObligMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligMode getSettlObligMode() throws FieldNotFound {
    return get(new quickfix.field.SettlObligMode());
  }

  public boolean isSet(quickfix.field.SettlObligMode field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligMode() {
    return isSetField(1159);
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

  public void set(quickfix.fixlatest.component.SettlObligationInstructions component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlObligationInstructions get(quickfix.fixlatest.component.SettlObligationInstructions component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlObligationInstructions getSettlObligationInstructionsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlObligationInstructions());
  }

  public void set(quickfix.field.NoSettlOblig value) {
    setField(value);
  }

  public quickfix.field.NoSettlOblig get(quickfix.field.NoSettlOblig value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlOblig getNoSettlOblig() throws FieldNotFound {
    return get(new quickfix.field.NoSettlOblig());
  }

  public boolean isSet(quickfix.field.NoSettlOblig field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlOblig() {
    return isSetField(1165);
  }

public static class NoSettlOblig extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {430, 1161, 1162, 1163, 1157, 119, 15, 120, 155, 64, 55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 453, 168, 126, 779, 1158, 0};

  public NoSettlOblig() {
    super(1165, 430, ORDER);
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

  public void set(quickfix.field.SettlObligID value) {
    setField(value);
  }

  public quickfix.field.SettlObligID get(quickfix.field.SettlObligID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligID getSettlObligID() throws FieldNotFound {
    return get(new quickfix.field.SettlObligID());
  }

  public boolean isSet(quickfix.field.SettlObligID field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligID() {
    return isSetField(1161);
  }

  public void set(quickfix.field.SettlObligTransType value) {
    setField(value);
  }

  public quickfix.field.SettlObligTransType get(quickfix.field.SettlObligTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligTransType getSettlObligTransType() throws FieldNotFound {
    return get(new quickfix.field.SettlObligTransType());
  }

  public boolean isSet(quickfix.field.SettlObligTransType field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligTransType() {
    return isSetField(1162);
  }

  public void set(quickfix.field.SettlObligRefID value) {
    setField(value);
  }

  public quickfix.field.SettlObligRefID get(quickfix.field.SettlObligRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlObligRefID getSettlObligRefID() throws FieldNotFound {
    return get(new quickfix.field.SettlObligRefID());
  }

  public boolean isSet(quickfix.field.SettlObligRefID field) {
    return isSetField(field);
  }

  public boolean isSetSettlObligRefID() {
    return isSetField(1163);
  }

  public void set(quickfix.field.CcyAmt value) {
    setField(value);
  }

  public quickfix.field.CcyAmt get(quickfix.field.CcyAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CcyAmt getCcyAmt() throws FieldNotFound {
    return get(new quickfix.field.CcyAmt());
  }

  public boolean isSet(quickfix.field.CcyAmt field) {
    return isSetField(field);
  }

  public boolean isSetCcyAmt() {
    return isSetField(1157);
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

  public void set(quickfix.field.SettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrency());
  }

  public boolean isSet(quickfix.field.SettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrency() {
    return isSetField(120);
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

  public void set(quickfix.field.EffectiveTime value) {
    setField(value);
  }

  public quickfix.field.EffectiveTime get(quickfix.field.EffectiveTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
    return get(new quickfix.field.EffectiveTime());
  }

  public boolean isSet(quickfix.field.EffectiveTime field) {
    return isSetField(field);
  }

  public boolean isSetEffectiveTime() {
    return isSetField(168);
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

  public void set(quickfix.field.LastUpdateTime value) {
    setField(value);
  }

  public quickfix.field.LastUpdateTime get(quickfix.field.LastUpdateTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastUpdateTime getLastUpdateTime() throws FieldNotFound {
    return get(new quickfix.field.LastUpdateTime());
  }

  public boolean isSet(quickfix.field.LastUpdateTime field) {
    return isSetField(field);
  }

  public boolean isSetLastUpdateTime() {
    return isSetField(779);
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
}
