/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class ContraryIntentionReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BO";

  public ContraryIntentionReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public ContraryIntentionReport (quickfix.field.ContIntRptID contIntRptID, quickfix.field.ClearingBusinessDate clearingBusinessDate) {
    this();
    setField(contIntRptID);
    setField(clearingBusinessDate);
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

  public void set(quickfix.field.ContIntRptID value) {
    setField(value);
  }

  public quickfix.field.ContIntRptID get(quickfix.field.ContIntRptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContIntRptID getContIntRptID() throws FieldNotFound {
    return get(new quickfix.field.ContIntRptID());
  }

  public boolean isSet(quickfix.field.ContIntRptID field) {
    return isSetField(field);
  }

  public boolean isSetContIntRptID() {
    return isSetField(977);
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

  public void set(quickfix.field.LateIndicator value) {
    setField(value);
  }

  public quickfix.field.LateIndicator get(quickfix.field.LateIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LateIndicator getLateIndicator() throws FieldNotFound {
    return get(new quickfix.field.LateIndicator());
  }

  public boolean isSet(quickfix.field.LateIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLateIndicator() {
    return isSetField(978);
  }

  public void set(quickfix.field.InputSource value) {
    setField(value);
  }

  public quickfix.field.InputSource get(quickfix.field.InputSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InputSource getInputSource() throws FieldNotFound {
    return get(new quickfix.field.InputSource());
  }

  public boolean isSet(quickfix.field.InputSource field) {
    return isSetField(field);
  }

  public boolean isSetInputSource() {
    return isSetField(979);
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

  public void set(quickfix.fixlatest.component.ExpirationQty component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ExpirationQty get(quickfix.fixlatest.component.ExpirationQty component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ExpirationQty getExpirationQtyComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ExpirationQty());
  }

  public void set(quickfix.field.NoExpiration value) {
    setField(value);
  }

  public quickfix.field.NoExpiration get(quickfix.field.NoExpiration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExpiration getNoExpiration() throws FieldNotFound {
    return get(new quickfix.field.NoExpiration());
  }

  public boolean isSet(quickfix.field.NoExpiration field) {
    return isSetField(field);
  }

  public boolean isSetNoExpiration() {
    return isSetField(981);
  }

public static class NoExpiration extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {982, 983, 0};

  public NoExpiration() {
    super(981, 982, ORDER);
  }

  public void set(quickfix.field.ExpirationQtyType value) {
    setField(value);
  }

  public quickfix.field.ExpirationQtyType get(quickfix.field.ExpirationQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpirationQtyType getExpirationQtyType() throws FieldNotFound {
    return get(new quickfix.field.ExpirationQtyType());
  }

  public boolean isSet(quickfix.field.ExpirationQtyType field) {
    return isSetField(field);
  }

  public boolean isSetExpirationQtyType() {
    return isSetField(982);
  }

  public void set(quickfix.field.ExpQty value) {
    setField(value);
  }

  public quickfix.field.ExpQty get(quickfix.field.ExpQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpQty getExpQty() throws FieldNotFound {
    return get(new quickfix.field.ExpQty());
  }

  public boolean isSet(quickfix.field.ExpQty field) {
    return isSetField(field);
  }

  public boolean isSetExpQty() {
    return isSetField(983);
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
