/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class QuoteResponse extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AJ";

  public QuoteResponse() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public QuoteResponse (quickfix.field.QuoteRespID quoteRespID, quickfix.field.QuoteRespType quoteRespType) {
    this();
    setField(quoteRespID);
    setField(quoteRespType);
  }

  public void set(quickfix.field.QuoteRespID value) {
    setField(value);
  }

  public quickfix.field.QuoteRespID get(quickfix.field.QuoteRespID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteRespID getQuoteRespID() throws FieldNotFound {
    return get(new quickfix.field.QuoteRespID());
  }

  public boolean isSet(quickfix.field.QuoteRespID field) {
    return isSetField(field);
  }

  public boolean isSetQuoteRespID() {
    return isSetField(693);
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

  public void set(quickfix.field.QuoteRespType value) {
    setField(value);
  }

  public quickfix.field.QuoteRespType get(quickfix.field.QuoteRespType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteRespType getQuoteRespType() throws FieldNotFound {
    return get(new quickfix.field.QuoteRespType());
  }

  public boolean isSet(quickfix.field.QuoteRespType field) {
    return isSetField(field);
  }

  public boolean isSetQuoteRespType() {
    return isSetField(694);
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

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.IOIID value) {
    setField(value);
  }

  public quickfix.field.IOIID get(quickfix.field.IOIID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IOIID getIOIID() throws FieldNotFound {
    return get(new quickfix.field.IOIID());
  }

  public boolean isSet(quickfix.field.IOIID field) {
    return isSetField(field);
  }

  public boolean isSetIOIID() {
    return isSetField(23);
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

  public void set(quickfix.field.PreTradeAnonymity value) {
    setField(value);
  }

  public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
    return get(new quickfix.field.PreTradeAnonymity());
  }

  public boolean isSet(quickfix.field.PreTradeAnonymity field) {
    return isSetField(field);
  }

  public boolean isSetPreTradeAnonymity() {
    return isSetField(1091);
  }

  public void set(quickfix.fixlatest.component.QuotQualGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.QuotQualGrp get(quickfix.fixlatest.component.QuotQualGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.QuotQualGrp getQuotQualGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.QuotQualGrp());
  }

  public void set(quickfix.field.NoQuoteQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoQuoteQualifiers get(quickfix.field.NoQuoteQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteQualifiers getNoQuoteQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteQualifiers());
  }

  public boolean isSet(quickfix.field.NoQuoteQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteQualifiers() {
    return isSetField(735);
  }

public static class NoQuoteQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {695, 0};

  public NoQuoteQualifiers() {
    super(735, 695, ORDER);
  }

  public void set(quickfix.field.QuoteQualifier value) {
    setField(value);
  }

  public quickfix.field.QuoteQualifier get(quickfix.field.QuoteQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteQualifier getQuoteQualifier() throws FieldNotFound {
    return get(new quickfix.field.QuoteQualifier());
  }

  public boolean isSet(quickfix.field.QuoteQualifier field) {
    return isSetField(field);
  }

  public boolean isSetQuoteQualifier() {
    return isSetField(695);
  }
}

  public void set(quickfix.field.TrdType value) {
    setField(value);
  }

  public quickfix.field.TrdType get(quickfix.field.TrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdType getTrdType() throws FieldNotFound {
    return get(new quickfix.field.TrdType());
  }

  public boolean isSet(quickfix.field.TrdType field) {
    return isSetField(field);
  }

  public boolean isSetTrdType() {
    return isSetField(828);
  }

  public void set(quickfix.field.RegulatoryTransactionType value) {
    setField(value);
  }

  public quickfix.field.RegulatoryTransactionType get(quickfix.field.RegulatoryTransactionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegulatoryTransactionType getRegulatoryTransactionType() throws FieldNotFound {
    return get(new quickfix.field.RegulatoryTransactionType());
  }

  public boolean isSet(quickfix.field.RegulatoryTransactionType field) {
    return isSetField(field);
  }

  public boolean isSetRegulatoryTransactionType() {
    return isSetField(2347);
  }

  public void set(quickfix.field.NegotiationMethod value) {
    setField(value);
  }

  public quickfix.field.NegotiationMethod get(quickfix.field.NegotiationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NegotiationMethod getNegotiationMethod() throws FieldNotFound {
    return get(new quickfix.field.NegotiationMethod());
  }

  public boolean isSet(quickfix.field.NegotiationMethod field) {
    return isSetField(field);
  }

  public boolean isSetNegotiationMethod() {
    return isSetField(2115);
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

  public void set(quickfix.field.MinQty value) {
    setField(value);
  }

  public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinQty getMinQty() throws FieldNotFound {
    return get(new quickfix.field.MinQty());
  }

  public boolean isSet(quickfix.field.MinQty field) {
    return isSetField(field);
  }

  public boolean isSetMinQty() {
    return isSetField(110);
  }

  public void set(quickfix.field.SettlType value) {
    setField(value);
  }

  public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlType getSettlType() throws FieldNotFound {
    return get(new quickfix.field.SettlType());
  }

  public boolean isSet(quickfix.field.SettlType field) {
    return isSetField(field);
  }

  public boolean isSetSettlType() {
    return isSetField(63);
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

  public void set(quickfix.field.TerminationDate value) {
    setField(value);
  }

  public quickfix.field.TerminationDate get(quickfix.field.TerminationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TerminationDate getTerminationDate() throws FieldNotFound {
    return get(new quickfix.field.TerminationDate());
  }

  public boolean isSet(quickfix.field.TerminationDate field) {
    return isSetField(field);
  }

  public boolean isSetTerminationDate() {
    return isSetField(2878);
  }

  public void set(quickfix.field.SettlDate2 value) {
    setField(value);
  }

  public quickfix.field.SettlDate2 get(quickfix.field.SettlDate2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate2 getSettlDate2() throws FieldNotFound {
    return get(new quickfix.field.SettlDate2());
  }

  public boolean isSet(quickfix.field.SettlDate2 field) {
    return isSetField(field);
  }

  public boolean isSetSettlDate2() {
    return isSetField(193);
  }

  public void set(quickfix.field.OrderQty2 value) {
    setField(value);
  }

  public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
    return get(new quickfix.field.OrderQty2());
  }

  public boolean isSet(quickfix.field.OrderQty2 field) {
    return isSetField(field);
  }

  public boolean isSetOrderQty2() {
    return isSetField(192);
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

  public void set(quickfix.fixlatest.component.LegQuotGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegQuotGrp get(quickfix.fixlatest.component.LegQuotGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegQuotGrp getLegQuotGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegQuotGrp());
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
  private static final int[]  ORDER = {600, 601, 602, 603, 604, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2076, 2308, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 1871, 1872, 1873, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2059, 2254, 2209, 2218, 2211, 2212, 2213, 2754, 2214, 2215, 40925, 40923, 40926, 41609, 41610, 41607, 41611, 41612, 41613, 41462, 41467, 41463, 41469, 41471, 41464, 41465, 41466, 41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, 42574, 42575, 42581, 42576, 42577, 42578, 42579, 42580, 41493, 41491, 41512, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, 41517, 41515, 41527, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, 42392, 42393, 42394, 42395, 42396, 42397, 42398, 40241, 40448, 41335, 41616, 41344, 41599, 42388, 2606, 2607, 685, 687, 2346, 690, 587, 588, 683, 539, 686, 681, 684, 676, 677, 678, 679, 680, 654, 1067, 1068, 0};

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

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegQty value) {
    setField(value);
  }

  public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegQty getLegQty() throws FieldNotFound {
    return get(new quickfix.field.LegQty());
  }

  public boolean isSet(quickfix.field.LegQty field) {
    return isSetField(field);
  }

  public boolean isSetLegQty() {
    return isSetField(687);
  }

  public void set(quickfix.field.LegMidPx value) {
    setField(value);
  }

  public quickfix.field.LegMidPx get(quickfix.field.LegMidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMidPx getLegMidPx() throws FieldNotFound {
    return get(new quickfix.field.LegMidPx());
  }

  public boolean isSet(quickfix.field.LegMidPx field) {
    return isSetField(field);
  }

  public boolean isSetLegMidPx() {
    return isSetField(2346);
  }

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
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

  public void set(quickfix.field.LegPriceType value) {
    setField(value);
  }

  public quickfix.field.LegPriceType get(quickfix.field.LegPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceType getLegPriceType() throws FieldNotFound {
    return get(new quickfix.field.LegPriceType());
  }

  public boolean isSet(quickfix.field.LegPriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceType() {
    return isSetField(686);
  }

  public void set(quickfix.field.LegBidPx value) {
    setField(value);
  }

  public quickfix.field.LegBidPx get(quickfix.field.LegBidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegBidPx getLegBidPx() throws FieldNotFound {
    return get(new quickfix.field.LegBidPx());
  }

  public boolean isSet(quickfix.field.LegBidPx field) {
    return isSetField(field);
  }

  public boolean isSetLegBidPx() {
    return isSetField(681);
  }

  public void set(quickfix.field.LegOfferPx value) {
    setField(value);
  }

  public quickfix.field.LegOfferPx get(quickfix.field.LegOfferPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOfferPx getLegOfferPx() throws FieldNotFound {
    return get(new quickfix.field.LegOfferPx());
  }

  public boolean isSet(quickfix.field.LegOfferPx field) {
    return isSetField(field);
  }

  public boolean isSetLegOfferPx() {
    return isSetField(684);
  }

  public void set(quickfix.fixlatest.component.LegBenchmarkCurveData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegBenchmarkCurveData get(quickfix.fixlatest.component.LegBenchmarkCurveData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegBenchmarkCurveData getLegBenchmarkCurveDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegBenchmarkCurveData());
  }

  public void set(quickfix.field.LegRefID value) {
    setField(value);
  }

  public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
    return get(new quickfix.field.LegRefID());
  }

  public boolean isSet(quickfix.field.LegRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegRefID() {
    return isSetField(654);
  }

  public void set(quickfix.field.LegBidForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegBidForwardPoints get(quickfix.field.LegBidForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegBidForwardPoints getLegBidForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegBidForwardPoints());
  }

  public boolean isSet(quickfix.field.LegBidForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegBidForwardPoints() {
    return isSetField(1067);
  }

  public void set(quickfix.field.LegOfferForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegOfferForwardPoints get(quickfix.field.LegOfferForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOfferForwardPoints getLegOfferForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegOfferForwardPoints());
  }

  public boolean isSet(quickfix.field.LegOfferForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegOfferForwardPoints() {
    return isSetField(1068);
  }
}

  public void set(quickfix.field.BidPx value) {
    setField(value);
  }

  public quickfix.field.BidPx get(quickfix.field.BidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidPx getBidPx() throws FieldNotFound {
    return get(new quickfix.field.BidPx());
  }

  public boolean isSet(quickfix.field.BidPx field) {
    return isSetField(field);
  }

  public boolean isSetBidPx() {
    return isSetField(132);
  }

  public void set(quickfix.field.OfferPx value) {
    setField(value);
  }

  public quickfix.field.OfferPx get(quickfix.field.OfferPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferPx getOfferPx() throws FieldNotFound {
    return get(new quickfix.field.OfferPx());
  }

  public boolean isSet(quickfix.field.OfferPx field) {
    return isSetField(field);
  }

  public boolean isSetOfferPx() {
    return isSetField(133);
  }

  public void set(quickfix.field.MktBidPx value) {
    setField(value);
  }

  public quickfix.field.MktBidPx get(quickfix.field.MktBidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MktBidPx getMktBidPx() throws FieldNotFound {
    return get(new quickfix.field.MktBidPx());
  }

  public boolean isSet(quickfix.field.MktBidPx field) {
    return isSetField(field);
  }

  public boolean isSetMktBidPx() {
    return isSetField(645);
  }

  public void set(quickfix.field.MktOfferPx value) {
    setField(value);
  }

  public quickfix.field.MktOfferPx get(quickfix.field.MktOfferPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MktOfferPx getMktOfferPx() throws FieldNotFound {
    return get(new quickfix.field.MktOfferPx());
  }

  public boolean isSet(quickfix.field.MktOfferPx field) {
    return isSetField(field);
  }

  public boolean isSetMktOfferPx() {
    return isSetField(646);
  }

  public void set(quickfix.field.MinBidSize value) {
    setField(value);
  }

  public quickfix.field.MinBidSize get(quickfix.field.MinBidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinBidSize getMinBidSize() throws FieldNotFound {
    return get(new quickfix.field.MinBidSize());
  }

  public boolean isSet(quickfix.field.MinBidSize field) {
    return isSetField(field);
  }

  public boolean isSetMinBidSize() {
    return isSetField(647);
  }

  public void set(quickfix.field.BidSize value) {
    setField(value);
  }

  public quickfix.field.BidSize get(quickfix.field.BidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidSize getBidSize() throws FieldNotFound {
    return get(new quickfix.field.BidSize());
  }

  public boolean isSet(quickfix.field.BidSize field) {
    return isSetField(field);
  }

  public boolean isSetBidSize() {
    return isSetField(134);
  }

  public void set(quickfix.field.MinOfferSize value) {
    setField(value);
  }

  public quickfix.field.MinOfferSize get(quickfix.field.MinOfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinOfferSize getMinOfferSize() throws FieldNotFound {
    return get(new quickfix.field.MinOfferSize());
  }

  public boolean isSet(quickfix.field.MinOfferSize field) {
    return isSetField(field);
  }

  public boolean isSetMinOfferSize() {
    return isSetField(648);
  }

  public void set(quickfix.field.OfferSize value) {
    setField(value);
  }

  public quickfix.field.OfferSize get(quickfix.field.OfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferSize getOfferSize() throws FieldNotFound {
    return get(new quickfix.field.OfferSize());
  }

  public boolean isSet(quickfix.field.OfferSize field) {
    return isSetField(field);
  }

  public boolean isSetOfferSize() {
    return isSetField(135);
  }

  public void set(quickfix.field.ValidUntilTime value) {
    setField(value);
  }

  public quickfix.field.ValidUntilTime get(quickfix.field.ValidUntilTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
    return get(new quickfix.field.ValidUntilTime());
  }

  public boolean isSet(quickfix.field.ValidUntilTime field) {
    return isSetField(field);
  }

  public boolean isSetValidUntilTime() {
    return isSetField(62);
  }

  public void set(quickfix.field.BidSpotRate value) {
    setField(value);
  }

  public quickfix.field.BidSpotRate get(quickfix.field.BidSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidSpotRate getBidSpotRate() throws FieldNotFound {
    return get(new quickfix.field.BidSpotRate());
  }

  public boolean isSet(quickfix.field.BidSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetBidSpotRate() {
    return isSetField(188);
  }

  public void set(quickfix.field.OfferSpotRate value) {
    setField(value);
  }

  public quickfix.field.OfferSpotRate get(quickfix.field.OfferSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferSpotRate getOfferSpotRate() throws FieldNotFound {
    return get(new quickfix.field.OfferSpotRate());
  }

  public boolean isSet(quickfix.field.OfferSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetOfferSpotRate() {
    return isSetField(190);
  }

  public void set(quickfix.field.BidForwardPoints value) {
    setField(value);
  }

  public quickfix.field.BidForwardPoints get(quickfix.field.BidForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidForwardPoints getBidForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.BidForwardPoints());
  }

  public boolean isSet(quickfix.field.BidForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetBidForwardPoints() {
    return isSetField(189);
  }

  public void set(quickfix.field.OfferForwardPoints value) {
    setField(value);
  }

  public quickfix.field.OfferForwardPoints get(quickfix.field.OfferForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferForwardPoints getOfferForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.OfferForwardPoints());
  }

  public boolean isSet(quickfix.field.OfferForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetOfferForwardPoints() {
    return isSetField(191);
  }

  public void set(quickfix.field.MidPx value) {
    setField(value);
  }

  public quickfix.field.MidPx get(quickfix.field.MidPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidPx getMidPx() throws FieldNotFound {
    return get(new quickfix.field.MidPx());
  }

  public boolean isSet(quickfix.field.MidPx field) {
    return isSetField(field);
  }

  public boolean isSetMidPx() {
    return isSetField(631);
  }

  public void set(quickfix.field.BidYield value) {
    setField(value);
  }

  public quickfix.field.BidYield get(quickfix.field.BidYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidYield getBidYield() throws FieldNotFound {
    return get(new quickfix.field.BidYield());
  }

  public boolean isSet(quickfix.field.BidYield field) {
    return isSetField(field);
  }

  public boolean isSetBidYield() {
    return isSetField(632);
  }

  public void set(quickfix.field.MidYield value) {
    setField(value);
  }

  public quickfix.field.MidYield get(quickfix.field.MidYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MidYield getMidYield() throws FieldNotFound {
    return get(new quickfix.field.MidYield());
  }

  public boolean isSet(quickfix.field.MidYield field) {
    return isSetField(field);
  }

  public boolean isSetMidYield() {
    return isSetField(633);
  }

  public void set(quickfix.field.OfferYield value) {
    setField(value);
  }

  public quickfix.field.OfferYield get(quickfix.field.OfferYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferYield getOfferYield() throws FieldNotFound {
    return get(new quickfix.field.OfferYield());
  }

  public boolean isSet(quickfix.field.OfferYield field) {
    return isSetField(field);
  }

  public boolean isSetOfferYield() {
    return isSetField(634);
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

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
  }

  public void set(quickfix.field.BidForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.BidForwardPoints2 get(quickfix.field.BidForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BidForwardPoints2 getBidForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.BidForwardPoints2());
  }

  public boolean isSet(quickfix.field.BidForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetBidForwardPoints2() {
    return isSetField(642);
  }

  public void set(quickfix.field.OfferForwardPoints2 value) {
    setField(value);
  }

  public quickfix.field.OfferForwardPoints2 get(quickfix.field.OfferForwardPoints2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OfferForwardPoints2 getOfferForwardPoints2() throws FieldNotFound {
    return get(new quickfix.field.OfferForwardPoints2());
  }

  public boolean isSet(quickfix.field.OfferForwardPoints2 field) {
    return isSetField(field);
  }

  public boolean isSetOfferForwardPoints2() {
    return isSetField(643);
  }

  public void set(quickfix.field.SettlCurrBidFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrBidFxRate get(quickfix.field.SettlCurrBidFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrBidFxRate getSettlCurrBidFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrBidFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrBidFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrBidFxRate() {
    return isSetField(656);
  }

  public void set(quickfix.field.SettlCurrOfferFxRate value) {
    setField(value);
  }

  public quickfix.field.SettlCurrOfferFxRate get(quickfix.field.SettlCurrOfferFxRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrOfferFxRate getSettlCurrOfferFxRate() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrOfferFxRate());
  }

  public boolean isSet(quickfix.field.SettlCurrOfferFxRate field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrOfferFxRate() {
    return isSetField(657);
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

  public void set(quickfix.field.ExDestination value) {
    setField(value);
  }

  public quickfix.field.ExDestination get(quickfix.field.ExDestination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDestination getExDestination() throws FieldNotFound {
    return get(new quickfix.field.ExDestination());
  }

  public boolean isSet(quickfix.field.ExDestination field) {
    return isSetField(field);
  }

  public boolean isSetExDestination() {
    return isSetField(100);
  }

  public void set(quickfix.field.ExDestinationIDSource value) {
    setField(value);
  }

  public quickfix.field.ExDestinationIDSource get(quickfix.field.ExDestinationIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDestinationIDSource getExDestinationIDSource() throws FieldNotFound {
    return get(new quickfix.field.ExDestinationIDSource());
  }

  public boolean isSet(quickfix.field.ExDestinationIDSource field) {
    return isSetField(field);
  }

  public boolean isSetExDestinationIDSource() {
    return isSetField(1133);
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

  public void set(quickfix.fixlatest.component.PriceQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceQualifierGrp get(quickfix.fixlatest.component.PriceQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceQualifierGrp getPriceQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceQualifierGrp());
  }

  public void set(quickfix.field.NoPriceQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoPriceQualifiers get(quickfix.field.NoPriceQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceQualifiers getNoPriceQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoPriceQualifiers());
  }

  public boolean isSet(quickfix.field.NoPriceQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceQualifiers() {
    return isSetField(2709);
  }

public static class NoPriceQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2710, 0};

  public NoPriceQualifiers() {
    super(2709, 2710, ORDER);
  }

  public void set(quickfix.field.PriceQualifier value) {
    setField(value);
  }

  public quickfix.field.PriceQualifier get(quickfix.field.PriceQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQualifier getPriceQualifier() throws FieldNotFound {
    return get(new quickfix.field.PriceQualifier());
  }

  public boolean isSet(quickfix.field.PriceQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPriceQualifier() {
    return isSetField(2710);
  }
}

  public void set(quickfix.field.CoverPrice value) {
    setField(value);
  }

  public quickfix.field.CoverPrice get(quickfix.field.CoverPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoverPrice getCoverPrice() throws FieldNotFound {
    return get(new quickfix.field.CoverPrice());
  }

  public boolean isSet(quickfix.field.CoverPrice field) {
    return isSetField(field);
  }

  public boolean isSetCoverPrice() {
    return isSetField(1917);
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

  public void set(quickfix.fixlatest.component.YieldData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.YieldData get(quickfix.fixlatest.component.YieldData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.YieldData getYieldDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.YieldData());
  }

  public void set(quickfix.field.TradeContinuation value) {
    setField(value);
  }

  public quickfix.field.TradeContinuation get(quickfix.field.TradeContinuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeContinuation getTradeContinuation() throws FieldNotFound {
    return get(new quickfix.field.TradeContinuation());
  }

  public boolean isSet(quickfix.field.TradeContinuation field) {
    return isSetField(field);
  }

  public boolean isSetTradeContinuation() {
    return isSetField(1937);
  }

  public void set(quickfix.field.TradeContinuationText value) {
    setField(value);
  }

  public quickfix.field.TradeContinuationText get(quickfix.field.TradeContinuationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeContinuationText getTradeContinuationText() throws FieldNotFound {
    return get(new quickfix.field.TradeContinuationText());
  }

  public boolean isSet(quickfix.field.TradeContinuationText field) {
    return isSetField(field);
  }

  public boolean isSetTradeContinuationText() {
    return isSetField(2374);
  }

  public void set(quickfix.field.EncodedTradeContinuationTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTradeContinuationTextLen get(quickfix.field.EncodedTradeContinuationTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTradeContinuationTextLen getEncodedTradeContinuationTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTradeContinuationTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTradeContinuationTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTradeContinuationTextLen() {
    return isSetField(2372);
  }

  public void set(quickfix.field.EncodedTradeContinuationText value) {
    setField(value);
  }

  public quickfix.field.EncodedTradeContinuationText get(quickfix.field.EncodedTradeContinuationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTradeContinuationText getEncodedTradeContinuationText() throws FieldNotFound {
    return get(new quickfix.field.EncodedTradeContinuationText());
  }

  public boolean isSet(quickfix.field.EncodedTradeContinuationText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTradeContinuationText() {
    return isSetField(2371);
  }

  public void set(quickfix.field.StrikeTime value) {
    setField(value);
  }

  public quickfix.field.StrikeTime get(quickfix.field.StrikeTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeTime getStrikeTime() throws FieldNotFound {
    return get(new quickfix.field.StrikeTime());
  }

  public boolean isSet(quickfix.field.StrikeTime field) {
    return isSetField(field);
  }

  public boolean isSetStrikeTime() {
    return isSetField(443);
  }
}
