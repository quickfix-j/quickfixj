/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class PositionTransferInstruction extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "DL";

  public PositionTransferInstruction() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public PositionTransferInstruction (quickfix.field.TransferInstructionID transferInstructionID) {
    this();
    setField(transferInstructionID);
  }

  public void set(quickfix.field.TransferInstructionID value) {
    setField(value);
  }

  public quickfix.field.TransferInstructionID get(quickfix.field.TransferInstructionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransferInstructionID getTransferInstructionID() throws FieldNotFound {
    return get(new quickfix.field.TransferInstructionID());
  }

  public boolean isSet(quickfix.field.TransferInstructionID field) {
    return isSetField(field);
  }

  public boolean isSetTransferInstructionID() {
    return isSetField(2436);
  }

  public void set(quickfix.field.TransferID value) {
    setField(value);
  }

  public quickfix.field.TransferID get(quickfix.field.TransferID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransferID getTransferID() throws FieldNotFound {
    return get(new quickfix.field.TransferID());
  }

  public boolean isSet(quickfix.field.TransferID field) {
    return isSetField(field);
  }

  public boolean isSetTransferID() {
    return isSetField(2437);
  }

  public void set(quickfix.field.TransferTransType value) {
    setField(value);
  }

  public quickfix.field.TransferTransType get(quickfix.field.TransferTransType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransferTransType getTransferTransType() throws FieldNotFound {
    return get(new quickfix.field.TransferTransType());
  }

  public boolean isSet(quickfix.field.TransferTransType field) {
    return isSetField(field);
  }

  public boolean isSetTransferTransType() {
    return isSetField(2439);
  }

  public void set(quickfix.field.TransferType value) {
    setField(value);
  }

  public quickfix.field.TransferType get(quickfix.field.TransferType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransferType getTransferType() throws FieldNotFound {
    return get(new quickfix.field.TransferType());
  }

  public boolean isSet(quickfix.field.TransferType field) {
    return isSetField(field);
  }

  public boolean isSetTransferType() {
    return isSetField(2440);
  }

  public void set(quickfix.field.TransferScope value) {
    setField(value);
  }

  public quickfix.field.TransferScope get(quickfix.field.TransferScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransferScope getTransferScope() throws FieldNotFound {
    return get(new quickfix.field.TransferScope());
  }

  public boolean isSet(quickfix.field.TransferScope field) {
    return isSetField(field);
  }

  public boolean isSetTransferScope() {
    return isSetField(2441);
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

  public void set(quickfix.fixlatest.component.PositionQty component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PositionQty get(quickfix.fixlatest.component.PositionQty component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PositionQty getPositionQtyComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PositionQty());
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
  private static final int[]  ORDER = {703, 704, 705, 1654, 706, 976, 1836, 1835, 539, 0};

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

  public void set(quickfix.field.PosQtyUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasure get(quickfix.field.PosQtyUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasure getPosQtyUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasure() {
    return isSetField(1836);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency get(quickfix.field.PosQtyUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency getPosQtyUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasureCurrency() {
    return isSetField(1835);
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
}

  public void set(quickfix.field.ClearingTradePrice value) {
    setField(value);
  }

  public quickfix.field.ClearingTradePrice get(quickfix.field.ClearingTradePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingTradePrice getClearingTradePrice() throws FieldNotFound {
    return get(new quickfix.field.ClearingTradePrice());
  }

  public boolean isSet(quickfix.field.ClearingTradePrice field) {
    return isSetField(field);
  }

  public boolean isSetClearingTradePrice() {
    return isSetField(1596);
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

  public void set(quickfix.fixlatest.component.PositionAmountData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PositionAmountData get(quickfix.fixlatest.component.PositionAmountData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PositionAmountData getPositionAmountDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PositionAmountData());
  }

  public void set(quickfix.field.NoPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoPosAmt());
  }

  public boolean isSet(quickfix.field.NoPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoPosAmt() {
    return isSetField(753);
  }

public static class NoPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {707, 708, 2096, 1055, 2097, 2098, 1585, 2099, 2100, 2876, 2877, 0};

  public NoPosAmt() {
    super(753, 707, ORDER);
  }

  public void set(quickfix.field.PosAmtType value) {
    setField(value);
  }

  public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtType());
  }

  public boolean isSet(quickfix.field.PosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtType() {
    return isSetField(707);
  }

  public void set(quickfix.field.PosAmt value) {
    setField(value);
  }

  public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
    return get(new quickfix.field.PosAmt());
  }

  public boolean isSet(quickfix.field.PosAmt field) {
    return isSetField(field);
  }

  public boolean isSetPosAmt() {
    return isSetField(708);
  }

  public void set(quickfix.field.PosAmtStreamDesc value) {
    setField(value);
  }

  public quickfix.field.PosAmtStreamDesc get(quickfix.field.PosAmtStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtStreamDesc getPosAmtStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.PosAmtStreamDesc());
  }

  public boolean isSet(quickfix.field.PosAmtStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtStreamDesc() {
    return isSetField(2096);
  }

  public void set(quickfix.field.PositionCurrency value) {
    setField(value);
  }

  public quickfix.field.PositionCurrency get(quickfix.field.PositionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionCurrency getPositionCurrency() throws FieldNotFound {
    return get(new quickfix.field.PositionCurrency());
  }

  public boolean isSet(quickfix.field.PositionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPositionCurrency() {
    return isSetField(1055);
  }

  public void set(quickfix.field.PositionFXRate value) {
    setField(value);
  }

  public quickfix.field.PositionFXRate get(quickfix.field.PositionFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRate getPositionFXRate() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRate());
  }

  public boolean isSet(quickfix.field.PositionFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRate() {
    return isSetField(2097);
  }

  public void set(quickfix.field.PositionFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PositionFXRateCalc get(quickfix.field.PositionFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRateCalc getPositionFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRateCalc());
  }

  public boolean isSet(quickfix.field.PositionFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRateCalc() {
    return isSetField(2098);
  }

  public void set(quickfix.field.PosAmtReason value) {
    setField(value);
  }

  public quickfix.field.PosAmtReason get(quickfix.field.PosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtReason getPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.PosAmtReason());
  }

  public boolean isSet(quickfix.field.PosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtReason() {
    return isSetField(1585);
  }

  public void set(quickfix.field.PosAmtMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketSegmentID get(quickfix.field.PosAmtMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketSegmentID getPosAmtMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketSegmentID() {
    return isSetField(2099);
  }

  public void set(quickfix.field.PosAmtMarketID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketID get(quickfix.field.PosAmtMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketID getPosAmtMarketID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketID() {
    return isSetField(2100);
  }

  public void set(quickfix.field.PosAmtPrice value) {
    setField(value);
  }

  public quickfix.field.PosAmtPrice get(quickfix.field.PosAmtPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPrice getPosAmtPrice() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPrice());
  }

  public boolean isSet(quickfix.field.PosAmtPrice field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPrice() {
    return isSetField(2876);
  }

  public void set(quickfix.field.PosAmtPriceType value) {
    setField(value);
  }

  public quickfix.field.PosAmtPriceType get(quickfix.field.PosAmtPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPriceType getPosAmtPriceType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPriceType());
  }

  public boolean isSet(quickfix.field.PosAmtPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPriceType() {
    return isSetField(2877);
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
