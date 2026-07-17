/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class SecurityDefinitionUpdateReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BP";

  public SecurityDefinitionUpdateReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
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

  public void set(quickfix.field.SecurityReportID value) {
    setField(value);
  }

  public quickfix.field.SecurityReportID get(quickfix.field.SecurityReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityReportID getSecurityReportID() throws FieldNotFound {
    return get(new quickfix.field.SecurityReportID());
  }

  public boolean isSet(quickfix.field.SecurityReportID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityReportID() {
    return isSetField(964);
  }

  public void set(quickfix.field.SecurityReqID value) {
    setField(value);
  }

  public quickfix.field.SecurityReqID get(quickfix.field.SecurityReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
    return get(new quickfix.field.SecurityReqID());
  }

  public boolean isSet(quickfix.field.SecurityReqID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityReqID() {
    return isSetField(320);
  }

  public void set(quickfix.field.SecurityResponseID value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseID get(quickfix.field.SecurityResponseID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseID());
  }

  public boolean isSet(quickfix.field.SecurityResponseID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseID() {
    return isSetField(322);
  }

  public void set(quickfix.field.SecurityResponseType value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseType get(quickfix.field.SecurityResponseType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseType getSecurityResponseType() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseType());
  }

  public boolean isSet(quickfix.field.SecurityResponseType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseType() {
    return isSetField(323);
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

  public void set(quickfix.field.SecurityUpdateAction value) {
    setField(value);
  }

  public quickfix.field.SecurityUpdateAction get(quickfix.field.SecurityUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityUpdateAction getSecurityUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.SecurityUpdateAction());
  }

  public boolean isSet(quickfix.field.SecurityUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetSecurityUpdateAction() {
    return isSetField(980);
  }

  public void set(quickfix.field.CorporateAction value) {
    setField(value);
  }

  public quickfix.field.CorporateAction get(quickfix.field.CorporateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CorporateAction getCorporateAction() throws FieldNotFound {
    return get(new quickfix.field.CorporateAction());
  }

  public boolean isSet(quickfix.field.CorporateAction field) {
    return isSetField(field);
  }

  public boolean isSetCorporateAction() {
    return isSetField(292);
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

  public void set(quickfix.fixlatest.component.InstrumentExtension component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentExtension get(quickfix.fixlatest.component.InstrumentExtension component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentExtension getInstrumentExtensionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentExtension());
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

  public void set(quickfix.fixlatest.component.RelatedInstrumentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedInstrumentGrp get(quickfix.fixlatest.component.RelatedInstrumentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedInstrumentGrp getRelatedInstrumentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedInstrumentGrp());
  }

  public void set(quickfix.field.NoRelatedInstruments value) {
    setField(value);
  }

  public quickfix.field.NoRelatedInstruments get(quickfix.field.NoRelatedInstruments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedInstruments getNoRelatedInstruments() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedInstruments());
  }

  public boolean isSet(quickfix.field.NoRelatedInstruments field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedInstruments() {
    return isSetField(1647);
  }

public static class NoRelatedInstruments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1648, 1649, 1650, 1651, 1652, 1653, 2413, 2414, 2415, 2417, 0};

  public NoRelatedInstruments() {
    super(1647, 1648, ORDER);
  }

  public void set(quickfix.field.RelatedInstrumentType value) {
    setField(value);
  }

  public quickfix.field.RelatedInstrumentType get(quickfix.field.RelatedInstrumentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedInstrumentType getRelatedInstrumentType() throws FieldNotFound {
    return get(new quickfix.field.RelatedInstrumentType());
  }

  public boolean isSet(quickfix.field.RelatedInstrumentType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedInstrumentType() {
    return isSetField(1648);
  }

  public void set(quickfix.field.RelatedSymbol value) {
    setField(value);
  }

  public quickfix.field.RelatedSymbol get(quickfix.field.RelatedSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSymbol getRelatedSymbol() throws FieldNotFound {
    return get(new quickfix.field.RelatedSymbol());
  }

  public boolean isSet(quickfix.field.RelatedSymbol field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSymbol() {
    return isSetField(1649);
  }

  public void set(quickfix.field.RelatedSecurityID value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityID get(quickfix.field.RelatedSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityID getRelatedSecurityID() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityID());
  }

  public boolean isSet(quickfix.field.RelatedSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityID() {
    return isSetField(1650);
  }

  public void set(quickfix.field.RelatedSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityIDSource get(quickfix.field.RelatedSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityIDSource getRelatedSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityIDSource());
  }

  public boolean isSet(quickfix.field.RelatedSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityIDSource() {
    return isSetField(1651);
  }

  public void set(quickfix.field.RelatedSecurityType value) {
    setField(value);
  }

  public quickfix.field.RelatedSecurityType get(quickfix.field.RelatedSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedSecurityType getRelatedSecurityType() throws FieldNotFound {
    return get(new quickfix.field.RelatedSecurityType());
  }

  public boolean isSet(quickfix.field.RelatedSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedSecurityType() {
    return isSetField(1652);
  }

  public void set(quickfix.field.RelatedMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.RelatedMaturityMonthYear get(quickfix.field.RelatedMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedMaturityMonthYear getRelatedMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.RelatedMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.RelatedMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetRelatedMaturityMonthYear() {
    return isSetField(1653);
  }

  public void set(quickfix.field.RelatedToSecurityID value) {
    setField(value);
  }

  public quickfix.field.RelatedToSecurityID get(quickfix.field.RelatedToSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToSecurityID getRelatedToSecurityID() throws FieldNotFound {
    return get(new quickfix.field.RelatedToSecurityID());
  }

  public boolean isSet(quickfix.field.RelatedToSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToSecurityID() {
    return isSetField(2413);
  }

  public void set(quickfix.field.RelatedToSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedToSecurityIDSource get(quickfix.field.RelatedToSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToSecurityIDSource getRelatedToSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedToSecurityIDSource());
  }

  public boolean isSet(quickfix.field.RelatedToSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToSecurityIDSource() {
    return isSetField(2414);
  }

  public void set(quickfix.field.RelatedToStreamXIDRef value) {
    setField(value);
  }

  public quickfix.field.RelatedToStreamXIDRef get(quickfix.field.RelatedToStreamXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToStreamXIDRef getRelatedToStreamXIDRef() throws FieldNotFound {
    return get(new quickfix.field.RelatedToStreamXIDRef());
  }

  public boolean isSet(quickfix.field.RelatedToStreamXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToStreamXIDRef() {
    return isSetField(2415);
  }

  public void set(quickfix.field.RelatedToDividendPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.RelatedToDividendPeriodXIDRef get(quickfix.field.RelatedToDividendPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedToDividendPeriodXIDRef getRelatedToDividendPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.RelatedToDividendPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.RelatedToDividendPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetRelatedToDividendPeriodXIDRef() {
    return isSetField(2417);
  }
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

  public void set(quickfix.field.PreviousAdjustedOpenInterest value) {
    setField(value);
  }

  public quickfix.field.PreviousAdjustedOpenInterest get(quickfix.field.PreviousAdjustedOpenInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviousAdjustedOpenInterest getPreviousAdjustedOpenInterest() throws FieldNotFound {
    return get(new quickfix.field.PreviousAdjustedOpenInterest());
  }

  public boolean isSet(quickfix.field.PreviousAdjustedOpenInterest field) {
    return isSetField(field);
  }

  public boolean isSetPreviousAdjustedOpenInterest() {
    return isSetField(2572);
  }

  public void set(quickfix.field.PreviousUnadjustedOpenInterest value) {
    setField(value);
  }

  public quickfix.field.PreviousUnadjustedOpenInterest get(quickfix.field.PreviousUnadjustedOpenInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreviousUnadjustedOpenInterest getPreviousUnadjustedOpenInterest() throws FieldNotFound {
    return get(new quickfix.field.PreviousUnadjustedOpenInterest());
  }

  public boolean isSet(quickfix.field.PreviousUnadjustedOpenInterest field) {
    return isSetField(field);
  }

  public boolean isSetPreviousUnadjustedOpenInterest() {
    return isSetField(2573);
  }

  public void set(quickfix.field.PriorSettlPrice value) {
    setField(value);
  }

  public quickfix.field.PriorSettlPrice get(quickfix.field.PriorSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriorSettlPrice getPriorSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.PriorSettlPrice());
  }

  public boolean isSet(quickfix.field.PriorSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetPriorSettlPrice() {
    return isSetField(734);
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

  public void set(quickfix.field.NumOfSimpleInstruments value) {
    setField(value);
  }

  public quickfix.field.NumOfSimpleInstruments get(quickfix.field.NumOfSimpleInstruments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumOfSimpleInstruments getNumOfSimpleInstruments() throws FieldNotFound {
    return get(new quickfix.field.NumOfSimpleInstruments());
  }

  public boolean isSet(quickfix.field.NumOfSimpleInstruments field) {
    return isSetField(field);
  }

  public boolean isSetNumOfSimpleInstruments() {
    return isSetField(1606);
  }

  public void set(quickfix.field.NumOfComplexInstruments value) {
    setField(value);
  }

  public quickfix.field.NumOfComplexInstruments get(quickfix.field.NumOfComplexInstruments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NumOfComplexInstruments getNumOfComplexInstruments() throws FieldNotFound {
    return get(new quickfix.field.NumOfComplexInstruments());
  }

  public boolean isSet(quickfix.field.NumOfComplexInstruments field) {
    return isSetField(field);
  }

  public boolean isSetNumOfComplexInstruments() {
    return isSetField(2562);
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

  public void set(quickfix.fixlatest.component.MarketSegmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketSegmentGrp get(quickfix.fixlatest.component.MarketSegmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketSegmentGrp getMarketSegmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketSegmentGrp());
  }

  public void set(quickfix.field.NoMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoMarketSegments get(quickfix.field.NoMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketSegments getNoMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoMarketSegments());
  }

  public boolean isSet(quickfix.field.NoMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketSegments() {
    return isSetField(1310);
  }

public static class NoMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1301, 1300, 1205, 1234, 1306, 1148, 1149, 1150, 2550, 2558, 827, 1786, 562, 1140, 1143, 1144, 1245, 561, 1377, 1378, 423, 2557, 2559, 1309, 1312, 1201, 0};

  public NoMarketSegments() {
    super(1310, 1301, ORDER);
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

  public void set(quickfix.fixlatest.component.SecurityTradingRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecurityTradingRules get(quickfix.fixlatest.component.SecurityTradingRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecurityTradingRules getSecurityTradingRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecurityTradingRules());
  }

  public void set(quickfix.fixlatest.component.StrikeRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StrikeRules get(quickfix.fixlatest.component.StrikeRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StrikeRules getStrikeRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StrikeRules());
  }

  public void set(quickfix.field.NoStrikeRules value) {
    setField(value);
  }

  public quickfix.field.NoStrikeRules get(quickfix.field.NoStrikeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrikeRules getNoStrikeRules() throws FieldNotFound {
    return get(new quickfix.field.NoStrikeRules());
  }

  public boolean isSet(quickfix.field.NoStrikeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoStrikeRules() {
    return isSetField(1201);
  }

public static class NoStrikeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1223, 1202, 1203, 1204, 1304, 1236, 0};

  public NoStrikeRules() {
    super(1201, 1223, ORDER);
  }

  public void set(quickfix.field.StrikeRuleID value) {
    setField(value);
  }

  public quickfix.field.StrikeRuleID get(quickfix.field.StrikeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeRuleID getStrikeRuleID() throws FieldNotFound {
    return get(new quickfix.field.StrikeRuleID());
  }

  public boolean isSet(quickfix.field.StrikeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetStrikeRuleID() {
    return isSetField(1223);
  }

  public void set(quickfix.field.StartStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.StartStrikePxRange get(quickfix.field.StartStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartStrikePxRange getStartStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.StartStrikePxRange());
  }

  public boolean isSet(quickfix.field.StartStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetStartStrikePxRange() {
    return isSetField(1202);
  }

  public void set(quickfix.field.EndStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.EndStrikePxRange get(quickfix.field.EndStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndStrikePxRange getEndStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.EndStrikePxRange());
  }

  public boolean isSet(quickfix.field.EndStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetEndStrikePxRange() {
    return isSetField(1203);
  }

  public void set(quickfix.field.StrikeIncrement value) {
    setField(value);
  }

  public quickfix.field.StrikeIncrement get(quickfix.field.StrikeIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIncrement getStrikeIncrement() throws FieldNotFound {
    return get(new quickfix.field.StrikeIncrement());
  }

  public boolean isSet(quickfix.field.StrikeIncrement field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIncrement() {
    return isSetField(1204);
  }

  public void set(quickfix.field.StrikeExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.StrikeExerciseStyle get(quickfix.field.StrikeExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeExerciseStyle getStrikeExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.StrikeExerciseStyle());
  }

  public boolean isSet(quickfix.field.StrikeExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetStrikeExerciseStyle() {
    return isSetField(1304);
  }

  public void set(quickfix.fixlatest.component.MaturityRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MaturityRules get(quickfix.fixlatest.component.MaturityRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MaturityRules getMaturityRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MaturityRules());
  }

  public void set(quickfix.field.NoMaturityRules value) {
    setField(value);
  }

  public quickfix.field.NoMaturityRules get(quickfix.field.NoMaturityRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMaturityRules getNoMaturityRules() throws FieldNotFound {
    return get(new quickfix.field.NoMaturityRules());
  }

  public boolean isSet(quickfix.field.NoMaturityRules field) {
    return isSetField(field);
  }

  public boolean isSetNoMaturityRules() {
    return isSetField(1236);
  }

public static class NoMaturityRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1222, 1303, 1302, 1241, 1226, 1229, 0};

  public NoMaturityRules() {
    super(1236, 1222, ORDER);
  }

  public void set(quickfix.field.MaturityRuleID value) {
    setField(value);
  }

  public quickfix.field.MaturityRuleID get(quickfix.field.MaturityRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityRuleID getMaturityRuleID() throws FieldNotFound {
    return get(new quickfix.field.MaturityRuleID());
  }

  public boolean isSet(quickfix.field.MaturityRuleID field) {
    return isSetField(field);
  }

  public boolean isSetMaturityRuleID() {
    return isSetField(1222);
  }

  public void set(quickfix.field.MaturityMonthYearFormat value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearFormat get(quickfix.field.MaturityMonthYearFormat value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearFormat getMaturityMonthYearFormat() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearFormat());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearFormat field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearFormat() {
    return isSetField(1303);
  }

  public void set(quickfix.field.MaturityMonthYearIncrementUnits value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrementUnits get(quickfix.field.MaturityMonthYearIncrementUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrementUnits getMaturityMonthYearIncrementUnits() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrementUnits());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrementUnits field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrementUnits() {
    return isSetField(1302);
  }

  public void set(quickfix.field.StartMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.StartMaturityMonthYear get(quickfix.field.StartMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartMaturityMonthYear getStartMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.StartMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.StartMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetStartMaturityMonthYear() {
    return isSetField(1241);
  }

  public void set(quickfix.field.EndMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.EndMaturityMonthYear get(quickfix.field.EndMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndMaturityMonthYear getEndMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EndMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.EndMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEndMaturityMonthYear() {
    return isSetField(1226);
  }

  public void set(quickfix.field.MaturityMonthYearIncrement value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrement get(quickfix.field.MaturityMonthYearIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrement getMaturityMonthYearIncrement() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrement());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrement() {
    return isSetField(1229);
  }
}
}
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

  public void set(quickfix.field.EffectiveBusinessDate value) {
    setField(value);
  }

  public quickfix.field.EffectiveBusinessDate get(quickfix.field.EffectiveBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EffectiveBusinessDate getEffectiveBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.EffectiveBusinessDate());
  }

  public boolean isSet(quickfix.field.EffectiveBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetEffectiveBusinessDate() {
    return isSetField(2400);
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
