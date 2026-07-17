/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingInstrument extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {311, 312, 309, 305, 2874, 462, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 1044, 1045, 1046, 1038, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2295, 2296, 2297, 2756, 2298, 2299, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingInstrument() {
    super();
  }

  public void set(quickfix.field.UnderlyingSymbol value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSymbol get(quickfix.field.UnderlyingSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSymbol());
  }

  public boolean isSet(quickfix.field.UnderlyingSymbol field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSymbol() {
    return isSetField(311);
  }

  public void set(quickfix.field.UnderlyingSymbolSfx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSymbolSfx get(quickfix.field.UnderlyingSymbolSfx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSymbolSfx());
  }

  public boolean isSet(quickfix.field.UnderlyingSymbolSfx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSymbolSfx() {
    return isSetField(312);
  }

  public void set(quickfix.field.UnderlyingSecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityID get(quickfix.field.UnderlyingSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityID() {
    return isSetField(309);
  }

  public void set(quickfix.field.UnderlyingSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityIDSource get(quickfix.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityIDSource() {
    return isSetField(305);
  }

  public void set(quickfix.fixlatest.component.UndSecAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndSecAltIDGrp get(quickfix.fixlatest.component.UndSecAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndSecAltIDGrp getUndSecAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndSecAltIDGrp());
  }

  public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSecurityAltID() {
    return isSetField(457);
  }

public static class NoUnderlyingSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {458, 459, 0};

  public NoUnderlyingSecurityAltID() {
    super(457, 458, ORDER);
  }

  public void set(quickfix.field.UnderlyingSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltID() {
    return isSetField(458);
  }

  public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltIDSource() {
    return isSetField(459);
  }
}

  public void set(quickfix.field.UnderlyingID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingID get(quickfix.field.UnderlyingID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingID getUnderlyingID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingID());
  }

  public boolean isSet(quickfix.field.UnderlyingID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingID() {
    return isSetField(2874);
  }

  public void set(quickfix.field.UnderlyingProduct value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProduct get(quickfix.field.UnderlyingProduct value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProduct());
  }

  public boolean isSet(quickfix.field.UnderlyingProduct field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProduct() {
    return isSetField(462);
  }

  public void set(quickfix.fixlatest.component.UnderlyingSecurityXML component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingSecurityXML get(quickfix.fixlatest.component.UnderlyingSecurityXML component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingSecurityXML getUnderlyingSecurityXMLComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingSecurityXML());
  }

  public void set(quickfix.field.UnderlyingCFICode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCFICode get(quickfix.field.UnderlyingCFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCFICode());
  }

  public boolean isSet(quickfix.field.UnderlyingCFICode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCFICode() {
    return isSetField(463);
  }

  public void set(quickfix.field.UnderlyingUPICode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingUPICode get(quickfix.field.UnderlyingUPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingUPICode getUnderlyingUPICode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingUPICode());
  }

  public boolean isSet(quickfix.field.UnderlyingUPICode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingUPICode() {
    return isSetField(2894);
  }

  public void set(quickfix.field.UnderlyingSecurityType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityType get(quickfix.field.UnderlyingSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityType() {
    return isSetField(310);
  }

  public void set(quickfix.field.UnderlyingSecuritySubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecuritySubType get(quickfix.field.UnderlyingSecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecuritySubType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecuritySubType() {
    return isSetField(763);
  }

  public void set(quickfix.field.UnderlyingMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMaturityMonthYear get(quickfix.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.UnderlyingMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMaturityMonthYear() {
    return isSetField(313);
  }

  public void set(quickfix.field.UnderlyingMaturityDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMaturityDate get(quickfix.field.UnderlyingMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMaturityDate());
  }

  public boolean isSet(quickfix.field.UnderlyingMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMaturityDate() {
    return isSetField(542);
  }

  public void set(quickfix.field.UnderlyingMaturityTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMaturityTime get(quickfix.field.UnderlyingMaturityTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMaturityTime getUnderlyingMaturityTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMaturityTime());
  }

  public boolean isSet(quickfix.field.UnderlyingMaturityTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMaturityTime() {
    return isSetField(1213);
  }

  public void set(quickfix.field.UnderlyingContractPriceRefMonth value) {
    setField(value);
  }

  public quickfix.field.UnderlyingContractPriceRefMonth get(quickfix.field.UnderlyingContractPriceRefMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingContractPriceRefMonth getUnderlyingContractPriceRefMonth() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingContractPriceRefMonth());
  }

  public boolean isSet(quickfix.field.UnderlyingContractPriceRefMonth field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingContractPriceRefMonth() {
    return isSetField(1837);
  }

  public void set(quickfix.field.UnderlyingCouponPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponPaymentDate get(quickfix.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponPaymentDate() {
    return isSetField(241);
  }

  public void set(quickfix.field.UnderlyingRestructuringType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRestructuringType get(quickfix.field.UnderlyingRestructuringType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRestructuringType getUnderlyingRestructuringType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRestructuringType());
  }

  public boolean isSet(quickfix.field.UnderlyingRestructuringType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRestructuringType() {
    return isSetField(1453);
  }

  public void set(quickfix.field.UnderlyingSeniority value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSeniority get(quickfix.field.UnderlyingSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSeniority getUnderlyingSeniority() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSeniority());
  }

  public boolean isSet(quickfix.field.UnderlyingSeniority field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSeniority() {
    return isSetField(1454);
  }

  public void set(quickfix.field.UnderlyingNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNotional get(quickfix.field.UnderlyingNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNotional getUnderlyingNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNotional() {
    return isSetField(2614);
  }

  public void set(quickfix.field.UnderlyingNotionalCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNotionalCurrency get(quickfix.field.UnderlyingNotionalCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNotionalCurrency getUnderlyingNotionalCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNotionalCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingNotionalCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNotionalCurrency() {
    return isSetField(2615);
  }

  public void set(quickfix.field.UnderlyingNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNotionalDeterminationMethod get(quickfix.field.UnderlyingNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNotionalDeterminationMethod getUnderlyingNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNotionalDeterminationMethod() {
    return isSetField(2616);
  }

  public void set(quickfix.field.UnderlyingNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNotionalAdjustments get(quickfix.field.UnderlyingNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNotionalAdjustments getUnderlyingNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.UnderlyingNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNotionalAdjustments() {
    return isSetField(2617);
  }

  public void set(quickfix.field.UnderlyingNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNotionalXIDRef get(quickfix.field.UnderlyingNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNotionalXIDRef getUnderlyingNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNotionalXIDRef() {
    return isSetField(2619);
  }

  public void set(quickfix.field.UnderlyingNotionalPercentageOutstanding value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNotionalPercentageOutstanding get(quickfix.field.UnderlyingNotionalPercentageOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNotionalPercentageOutstanding getUnderlyingNotionalPercentageOutstanding() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNotionalPercentageOutstanding());
  }

  public boolean isSet(quickfix.field.UnderlyingNotionalPercentageOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNotionalPercentageOutstanding() {
    return isSetField(1455);
  }

  public void set(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding get(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding getUnderlyingOriginalNotionalPercentageOutstanding() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding());
  }

  public boolean isSet(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOriginalNotionalPercentageOutstanding() {
    return isSetField(1456);
  }

  public void set(quickfix.field.UnderlyingAttachmentPoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAttachmentPoint get(quickfix.field.UnderlyingAttachmentPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAttachmentPoint getUnderlyingAttachmentPoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAttachmentPoint());
  }

  public boolean isSet(quickfix.field.UnderlyingAttachmentPoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAttachmentPoint() {
    return isSetField(1459);
  }

  public void set(quickfix.field.UnderlyingDetachmentPoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDetachmentPoint get(quickfix.field.UnderlyingDetachmentPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDetachmentPoint getUnderlyingDetachmentPoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDetachmentPoint());
  }

  public boolean isSet(quickfix.field.UnderlyingDetachmentPoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDetachmentPoint() {
    return isSetField(1460);
  }

  public void set(quickfix.field.UnderlyingIssueDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIssueDate get(quickfix.field.UnderlyingIssueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIssueDate());
  }

  public boolean isSet(quickfix.field.UnderlyingIssueDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIssueDate() {
    return isSetField(242);
  }

  public void set(quickfix.field.UnderlyingRepoCollateralSecurityType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRepoCollateralSecurityType get(quickfix.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRepoCollateralSecurityType());
  }

  public boolean isSet(quickfix.field.UnderlyingRepoCollateralSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRepoCollateralSecurityType() {
    return isSetField(243);
  }

  public void set(quickfix.field.UnderlyingRepurchaseTerm value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRepurchaseTerm get(quickfix.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRepurchaseTerm());
  }

  public boolean isSet(quickfix.field.UnderlyingRepurchaseTerm field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRepurchaseTerm() {
    return isSetField(244);
  }

  public void set(quickfix.field.UnderlyingRepurchaseRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRepurchaseRate get(quickfix.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRepurchaseRate());
  }

  public boolean isSet(quickfix.field.UnderlyingRepurchaseRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRepurchaseRate() {
    return isSetField(245);
  }

  public void set(quickfix.field.UnderlyingFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFactor get(quickfix.field.UnderlyingFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFactor() {
    return isSetField(246);
  }

  public void set(quickfix.field.UnderlyingCreditRating value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCreditRating get(quickfix.field.UnderlyingCreditRating value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCreditRating());
  }

  public boolean isSet(quickfix.field.UnderlyingCreditRating field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCreditRating() {
    return isSetField(256);
  }

  public void set(quickfix.field.UnderlyingInstrRegistry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrRegistry get(quickfix.field.UnderlyingInstrRegistry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrRegistry());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrRegistry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrRegistry() {
    return isSetField(595);
  }

  public void set(quickfix.field.UnderlyingCountryOfIssue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCountryOfIssue get(quickfix.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCountryOfIssue());
  }

  public boolean isSet(quickfix.field.UnderlyingCountryOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCountryOfIssue() {
    return isSetField(592);
  }

  public void set(quickfix.field.UnderlyingStateOrProvinceOfIssue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStateOrProvinceOfIssue get(quickfix.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStateOrProvinceOfIssue());
  }

  public boolean isSet(quickfix.field.UnderlyingStateOrProvinceOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStateOrProvinceOfIssue() {
    return isSetField(593);
  }

  public void set(quickfix.field.UnderlyingLocaleOfIssue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLocaleOfIssue get(quickfix.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLocaleOfIssue());
  }

  public boolean isSet(quickfix.field.UnderlyingLocaleOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLocaleOfIssue() {
    return isSetField(594);
  }

  public void set(quickfix.field.UnderlyingRedemptionDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRedemptionDate get(quickfix.field.UnderlyingRedemptionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRedemptionDate());
  }

  public boolean isSet(quickfix.field.UnderlyingRedemptionDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRedemptionDate() {
    return isSetField(247);
  }

  public void set(quickfix.field.UnderlyingStrikePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikePrice get(quickfix.field.UnderlyingStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikePrice() {
    return isSetField(316);
  }

  public void set(quickfix.field.UnderlyingStrikeCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeCurrency get(quickfix.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeCurrency() {
    return isSetField(941);
  }

  public void set(quickfix.field.UnderlyingOptAttribute value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptAttribute get(quickfix.field.UnderlyingOptAttribute value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptAttribute());
  }

  public boolean isSet(quickfix.field.UnderlyingOptAttribute field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptAttribute() {
    return isSetField(317);
  }

  public void set(quickfix.field.UnderlyingContractMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingContractMultiplier get(quickfix.field.UnderlyingContractMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingContractMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingContractMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingContractMultiplier() {
    return isSetField(436);
  }

  public void set(quickfix.field.UnderlyingContractMultiplierUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingContractMultiplierUnit get(quickfix.field.UnderlyingContractMultiplierUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingContractMultiplierUnit getUnderlyingContractMultiplierUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingContractMultiplierUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingContractMultiplierUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingContractMultiplierUnit() {
    return isSetField(1437);
  }

  public void set(quickfix.field.UnderlyingTradingUnitPeriodMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingTradingUnitPeriodMultiplier get(quickfix.field.UnderlyingTradingUnitPeriodMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingTradingUnitPeriodMultiplier getUnderlyingTradingUnitPeriodMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingTradingUnitPeriodMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingTradingUnitPeriodMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingTradingUnitPeriodMultiplier() {
    return isSetField(2363);
  }

  public void set(quickfix.field.UnderlyingFlowScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFlowScheduleType get(quickfix.field.UnderlyingFlowScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFlowScheduleType getUnderlyingFlowScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFlowScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingFlowScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFlowScheduleType() {
    return isSetField(1441);
  }

  public void set(quickfix.field.UnderlyingUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingUnitOfMeasure get(quickfix.field.UnderlyingUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingUnitOfMeasure getUnderlyingUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingUnitOfMeasure() {
    return isSetField(998);
  }

  public void set(quickfix.field.UnderlyingUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingUnitOfMeasureQty get(quickfix.field.UnderlyingUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingUnitOfMeasureQty getUnderlyingUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.UnderlyingUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingUnitOfMeasureQty() {
    return isSetField(1423);
  }

  public void set(quickfix.field.UnderlyingUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingUnitOfMeasureCurrency get(quickfix.field.UnderlyingUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingUnitOfMeasureCurrency getUnderlyingUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingUnitOfMeasureCurrency() {
    return isSetField(1718);
  }

  public void set(quickfix.field.UnderlyingPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPriceUnitOfMeasure get(quickfix.field.UnderlyingPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPriceUnitOfMeasure getUnderlyingPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPriceUnitOfMeasure() {
    return isSetField(1424);
  }

  public void set(quickfix.field.UnderlyingPriceUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPriceUnitOfMeasureQty get(quickfix.field.UnderlyingPriceUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPriceUnitOfMeasureQty getUnderlyingPriceUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPriceUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPriceUnitOfMeasureQty() {
    return isSetField(1425);
  }

  public void set(quickfix.field.UnderlyingPriceUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPriceUnitOfMeasureCurrency get(quickfix.field.UnderlyingPriceUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPriceUnitOfMeasureCurrency getUnderlyingPriceUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPriceUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPriceUnitOfMeasureCurrency() {
    return isSetField(1719);
  }

  public void set(quickfix.field.UnderlyingTimeUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingTimeUnit get(quickfix.field.UnderlyingTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingTimeUnit getUnderlyingTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingTimeUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingTimeUnit() {
    return isSetField(1000);
  }

  public void set(quickfix.field.UnderlyingExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExerciseStyle get(quickfix.field.UnderlyingExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExerciseStyle getUnderlyingExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExerciseStyle());
  }

  public boolean isSet(quickfix.field.UnderlyingExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExerciseStyle() {
    return isSetField(1419);
  }

  public void set(quickfix.field.UnderlyingPriceQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPriceQuoteCurrency get(quickfix.field.UnderlyingPriceQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPriceQuoteCurrency getUnderlyingPriceQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPriceQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPriceQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPriceQuoteCurrency() {
    return isSetField(1526);
  }

  public void set(quickfix.field.UnderlyingCouponRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponRate get(quickfix.field.UnderlyingCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponRate());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponRate() {
    return isSetField(435);
  }

  public void set(quickfix.field.UnderlyingSecurityExchange value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityExchange get(quickfix.field.UnderlyingSecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityExchange());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityExchange() {
    return isSetField(308);
  }

  public void set(quickfix.field.UnderlyingIssuer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIssuer get(quickfix.field.UnderlyingIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIssuer());
  }

  public boolean isSet(quickfix.field.UnderlyingIssuer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIssuer() {
    return isSetField(306);
  }

  public void set(quickfix.field.EncodedUnderlyingIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingIssuerLen get(quickfix.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingIssuerLen() {
    return isSetField(362);
  }

  public void set(quickfix.field.EncodedUnderlyingIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingIssuer get(quickfix.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingIssuer());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingIssuer() {
    return isSetField(363);
  }

  public void set(quickfix.field.UnderlyingFinancialInstrumentShortName value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFinancialInstrumentShortName get(quickfix.field.UnderlyingFinancialInstrumentShortName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFinancialInstrumentShortName getUnderlyingFinancialInstrumentShortName() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFinancialInstrumentShortName());
  }

  public boolean isSet(quickfix.field.UnderlyingFinancialInstrumentShortName field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFinancialInstrumentShortName() {
    return isSetField(2742);
  }

  public void set(quickfix.field.UnderlyingFinancialInstrumentFullName value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFinancialInstrumentFullName get(quickfix.field.UnderlyingFinancialInstrumentFullName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFinancialInstrumentFullName getUnderlyingFinancialInstrumentFullName() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFinancialInstrumentFullName());
  }

  public boolean isSet(quickfix.field.UnderlyingFinancialInstrumentFullName field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFinancialInstrumentFullName() {
    return isSetField(2720);
  }

  public void set(quickfix.field.EncodedUnderlyingFinancialInstrumentFullNameLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingFinancialInstrumentFullNameLen get(quickfix.field.EncodedUnderlyingFinancialInstrumentFullNameLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingFinancialInstrumentFullNameLen getEncodedUnderlyingFinancialInstrumentFullNameLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingFinancialInstrumentFullNameLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingFinancialInstrumentFullNameLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingFinancialInstrumentFullNameLen() {
    return isSetField(2721);
  }

  public void set(quickfix.field.EncodedUnderlyingFinancialInstrumentFullName value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingFinancialInstrumentFullName get(quickfix.field.EncodedUnderlyingFinancialInstrumentFullName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingFinancialInstrumentFullName getEncodedUnderlyingFinancialInstrumentFullName() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingFinancialInstrumentFullName());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingFinancialInstrumentFullName field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingFinancialInstrumentFullName() {
    return isSetField(2722);
  }

  public void set(quickfix.field.UnderlyingIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIndexCurveUnit get(quickfix.field.UnderlyingIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIndexCurveUnit getUnderlyingIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIndexCurveUnit() {
    return isSetField(2723);
  }

  public void set(quickfix.field.UnderlyingIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIndexCurvePeriod get(quickfix.field.UnderlyingIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIndexCurvePeriod getUnderlyingIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIndexCurvePeriod() {
    return isSetField(2724);
  }

  public void set(quickfix.field.UnderlyingSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityDesc get(quickfix.field.UnderlyingSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityDesc() {
    return isSetField(307);
  }

  public void set(quickfix.field.EncodedUnderlyingSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingSecurityDescLen get(quickfix.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingSecurityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingSecurityDescLen() {
    return isSetField(364);
  }

  public void set(quickfix.field.EncodedUnderlyingSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingSecurityDesc get(quickfix.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingSecurityDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingSecurityDesc() {
    return isSetField(365);
  }

  public void set(quickfix.field.UnderlyingCPProgram value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCPProgram get(quickfix.field.UnderlyingCPProgram value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCPProgram());
  }

  public boolean isSet(quickfix.field.UnderlyingCPProgram field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCPProgram() {
    return isSetField(877);
  }

  public void set(quickfix.field.UnderlyingCPRegType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCPRegType get(quickfix.field.UnderlyingCPRegType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCPRegType());
  }

  public boolean isSet(quickfix.field.UnderlyingCPRegType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCPRegType() {
    return isSetField(878);
  }

  public void set(quickfix.field.UnderlyingAllocationPercent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAllocationPercent get(quickfix.field.UnderlyingAllocationPercent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAllocationPercent getUnderlyingAllocationPercent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAllocationPercent());
  }

  public boolean isSet(quickfix.field.UnderlyingAllocationPercent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAllocationPercent() {
    return isSetField(972);
  }

  public void set(quickfix.field.UnderlyingCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCurrency get(quickfix.field.UnderlyingCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCurrency() {
    return isSetField(318);
  }

  public void set(quickfix.field.UnderlyingQty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingQty get(quickfix.field.UnderlyingQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingQty());
  }

  public boolean isSet(quickfix.field.UnderlyingQty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingQty() {
    return isSetField(879);
  }

  public void set(quickfix.field.UnderlyingSettlementType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementType get(quickfix.field.UnderlyingSettlementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementType getUnderlyingSettlementType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementType());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementType() {
    return isSetField(975);
  }

  public void set(quickfix.field.UnderlyingCashAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashAmount get(quickfix.field.UnderlyingCashAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashAmount getUnderlyingCashAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashAmount() {
    return isSetField(973);
  }

  public void set(quickfix.field.UnderlyingCashType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashType get(quickfix.field.UnderlyingCashType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashType getUnderlyingCashType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashType());
  }

  public boolean isSet(quickfix.field.UnderlyingCashType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashType() {
    return isSetField(974);
  }

  public void set(quickfix.field.UnderlyingPx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPx get(quickfix.field.UnderlyingPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPx());
  }

  public boolean isSet(quickfix.field.UnderlyingPx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPx() {
    return isSetField(810);
  }

  public void set(quickfix.field.UnderlyingDirtyPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDirtyPrice get(quickfix.field.UnderlyingDirtyPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDirtyPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingDirtyPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDirtyPrice() {
    return isSetField(882);
  }

  public void set(quickfix.field.UnderlyingEndPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEndPrice get(quickfix.field.UnderlyingEndPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEndPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingEndPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEndPrice() {
    return isSetField(883);
  }

  public void set(quickfix.field.UnderlyingStartValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStartValue get(quickfix.field.UnderlyingStartValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStartValue());
  }

  public boolean isSet(quickfix.field.UnderlyingStartValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStartValue() {
    return isSetField(884);
  }

  public void set(quickfix.field.UnderlyingCurrentValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCurrentValue get(quickfix.field.UnderlyingCurrentValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCurrentValue());
  }

  public boolean isSet(quickfix.field.UnderlyingCurrentValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCurrentValue() {
    return isSetField(885);
  }

  public void set(quickfix.field.UnderlyingEndValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEndValue get(quickfix.field.UnderlyingEndValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEndValue());
  }

  public boolean isSet(quickfix.field.UnderlyingEndValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEndValue() {
    return isSetField(886);
  }

  public void set(quickfix.field.UnderlyingAccruedInterestAmt value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAccruedInterestAmt get(quickfix.field.UnderlyingAccruedInterestAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAccruedInterestAmt getUnderlyingAccruedInterestAmt() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAccruedInterestAmt());
  }

  public boolean isSet(quickfix.field.UnderlyingAccruedInterestAmt field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAccruedInterestAmt() {
    return isSetField(2885);
  }

  public void set(quickfix.field.UnderlyingNumDaysInterest value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNumDaysInterest get(quickfix.field.UnderlyingNumDaysInterest value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNumDaysInterest getUnderlyingNumDaysInterest() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNumDaysInterest());
  }

  public boolean isSet(quickfix.field.UnderlyingNumDaysInterest field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNumDaysInterest() {
    return isSetField(2886);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStipulations get(quickfix.fixlatest.component.UnderlyingStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStipulations getUnderlyingStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStipulations());
  }

  public void set(quickfix.field.NoUnderlyingStips value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStips());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStips field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStips() {
    return isSetField(887);
  }

public static class NoUnderlyingStips extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {888, 889, 0};

  public NoUnderlyingStips() {
    super(887, 888, ORDER);
  }

  public void set(quickfix.field.UnderlyingStipType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStipType());
  }

  public boolean isSet(quickfix.field.UnderlyingStipType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStipType() {
    return isSetField(888);
  }

  public void set(quickfix.field.UnderlyingStipValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStipValue());
  }

  public boolean isSet(quickfix.field.UnderlyingStipValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStipValue() {
    return isSetField(889);
  }
}

  public void set(quickfix.field.UnderlyingAdjustedQuantity value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdjustedQuantity get(quickfix.field.UnderlyingAdjustedQuantity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdjustedQuantity getUnderlyingAdjustedQuantity() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdjustedQuantity());
  }

  public boolean isSet(quickfix.field.UnderlyingAdjustedQuantity field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdjustedQuantity() {
    return isSetField(1044);
  }

  public void set(quickfix.field.UnderlyingFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFXRate get(quickfix.field.UnderlyingFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFXRate getUnderlyingFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFXRate() {
    return isSetField(1045);
  }

  public void set(quickfix.field.UnderlyingFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFXRateCalc get(quickfix.field.UnderlyingFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFXRateCalc getUnderlyingFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFXRateCalc());
  }

  public boolean isSet(quickfix.field.UnderlyingFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFXRateCalc() {
    return isSetField(1046);
  }

  public void set(quickfix.field.UnderlyingCapValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCapValue get(quickfix.field.UnderlyingCapValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCapValue getUnderlyingCapValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCapValue());
  }

  public boolean isSet(quickfix.field.UnderlyingCapValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCapValue() {
    return isSetField(1038);
  }

  public void set(quickfix.fixlatest.component.UndlyInstrumentParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndlyInstrumentParties get(quickfix.fixlatest.component.UndlyInstrumentParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndlyInstrumentParties getUndlyInstrumentPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndlyInstrumentParties());
  }

  public void set(quickfix.field.NoUndlyInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentParties get(quickfix.field.NoUndlyInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentParties getNoUndlyInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoUndlyInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentParties() {
    return isSetField(1058);
  }

public static class NoUndlyInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1059, 1060, 1061, 2391, 1062, 0};

  public NoUndlyInstrumentParties() {
    super(1058, 1059, ORDER);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyID get(quickfix.field.UnderlyingInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyID getUnderlyingInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyID() {
    return isSetField(1059);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyIDSource get(quickfix.field.UnderlyingInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyIDSource getUnderlyingInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyIDSource() {
    return isSetField(1060);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyRole get(quickfix.field.UnderlyingInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyRole getUnderlyingInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyRole() {
    return isSetField(1061);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyRoleQualifier get(quickfix.field.UnderlyingInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyRoleQualifier getUnderlyingInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyRoleQualifier() {
    return isSetField(2391);
  }

  public void set(quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp get(quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUndlyInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentPartySubIDs() {
    return isSetField(1062);
  }

public static class NoUndlyInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1063, 1064, 0};

  public NoUndlyInstrumentPartySubIDs() {
    super(1062, 1063, ORDER);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartySubID get(quickfix.field.UnderlyingInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartySubID getUnderlyingInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartySubID() {
    return isSetField(1063);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartySubIDType get(quickfix.field.UnderlyingInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartySubIDType getUnderlyingInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartySubIDType() {
    return isSetField(1064);
  }
}
}

  public void set(quickfix.field.UnderlyingSettlMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethod get(quickfix.field.UnderlyingSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethod getUnderlyingSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethod() {
    return isSetField(1039);
  }

  public void set(quickfix.field.UnderlyingPutOrCall value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPutOrCall get(quickfix.field.UnderlyingPutOrCall value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPutOrCall());
  }

  public boolean isSet(quickfix.field.UnderlyingPutOrCall field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPutOrCall() {
    return isSetField(315);
  }

  public void set(quickfix.field.UnderlyingInTheMoneyCondition value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInTheMoneyCondition get(quickfix.field.UnderlyingInTheMoneyCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInTheMoneyCondition getUnderlyingInTheMoneyCondition() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInTheMoneyCondition());
  }

  public boolean isSet(quickfix.field.UnderlyingInTheMoneyCondition field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInTheMoneyCondition() {
    return isSetField(2683);
  }

  public void set(quickfix.field.UnderlyingContraryInstructionEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingContraryInstructionEligibilityIndicator get(quickfix.field.UnderlyingContraryInstructionEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingContraryInstructionEligibilityIndicator getUnderlyingContraryInstructionEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingContraryInstructionEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingContraryInstructionEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingContraryInstructionEligibilityIndicator() {
    return isSetField(2687);
  }

  public void set(quickfix.field.UnderlyingConstituentWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingConstituentWeight get(quickfix.field.UnderlyingConstituentWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingConstituentWeight getUnderlyingConstituentWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingConstituentWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingConstituentWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingConstituentWeight() {
    return isSetField(1988);
  }

  public void set(quickfix.field.UnderlyingCouponType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponType get(quickfix.field.UnderlyingCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponType getUnderlyingCouponType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponType());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponType() {
    return isSetField(1989);
  }

  public void set(quickfix.field.UnderlyingTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingTotalIssuedAmount get(quickfix.field.UnderlyingTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingTotalIssuedAmount getUnderlyingTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingTotalIssuedAmount() {
    return isSetField(1990);
  }

  public void set(quickfix.field.UnderlyingCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponFrequencyPeriod get(quickfix.field.UnderlyingCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponFrequencyPeriod getUnderlyingCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponFrequencyPeriod() {
    return isSetField(1991);
  }

  public void set(quickfix.field.UnderlyingCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponFrequencyUnit get(quickfix.field.UnderlyingCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponFrequencyUnit getUnderlyingCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponFrequencyUnit() {
    return isSetField(1992);
  }

  public void set(quickfix.field.UnderlyingCouponDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponDayCount get(quickfix.field.UnderlyingCouponDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponDayCount getUnderlyingCouponDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponDayCount() {
    return isSetField(1993);
  }

  public void set(quickfix.field.UnderlyingCouponOtherDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponOtherDayCount get(quickfix.field.UnderlyingCouponOtherDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponOtherDayCount getUnderlyingCouponOtherDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCouponOtherDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingCouponOtherDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponOtherDayCount() {
    return isSetField(2881);
  }

  public void set(quickfix.field.UnderlyingObligationID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingObligationID get(quickfix.field.UnderlyingObligationID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingObligationID getUnderlyingObligationID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingObligationID());
  }

  public boolean isSet(quickfix.field.UnderlyingObligationID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingObligationID() {
    return isSetField(1994);
  }

  public void set(quickfix.field.UnderlyingObligationIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingObligationIDSource get(quickfix.field.UnderlyingObligationIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingObligationIDSource getUnderlyingObligationIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingObligationIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingObligationIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingObligationIDSource() {
    return isSetField(1995);
  }

  public void set(quickfix.field.UnderlyingEquityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEquityID get(quickfix.field.UnderlyingEquityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEquityID getUnderlyingEquityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEquityID());
  }

  public boolean isSet(quickfix.field.UnderlyingEquityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEquityID() {
    return isSetField(1996);
  }

  public void set(quickfix.field.UnderlyingEquityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEquityIDSource get(quickfix.field.UnderlyingEquityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEquityIDSource getUnderlyingEquityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEquityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingEquityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEquityIDSource() {
    return isSetField(1997);
  }

  public void set(quickfix.field.UnderlyingFutureID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFutureID get(quickfix.field.UnderlyingFutureID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFutureID getUnderlyingFutureID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFutureID());
  }

  public boolean isSet(quickfix.field.UnderlyingFutureID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFutureID() {
    return isSetField(2620);
  }

  public void set(quickfix.field.UnderlyingFutureIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFutureIDSource get(quickfix.field.UnderlyingFutureIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFutureIDSource getUnderlyingFutureIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFutureIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingFutureIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFutureIDSource() {
    return isSetField(2621);
  }

  public void set(quickfix.fixlatest.component.UnderlyingEvntGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingEvntGrp get(quickfix.fixlatest.component.UnderlyingEvntGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingEvntGrp getUnderlyingEvntGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingEvntGrp());
  }

  public void set(quickfix.field.NoUnderlyingEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingEvents get(quickfix.field.NoUnderlyingEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingEvents getNoUnderlyingEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingEvents() {
    return isSetField(1981);
  }

public static class NoUnderlyingEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1982, 1983, 1984, 1985, 1986, 2342, 1987, 2071, 2072, 2073, 0};

  public NoUnderlyingEvents() {
    super(1981, 1982, ORDER);
  }

  public void set(quickfix.field.UnderlyingEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventType get(quickfix.field.UnderlyingEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventType getUnderlyingEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventType() {
    return isSetField(1982);
  }

  public void set(quickfix.field.UnderlyingEventDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventDate get(quickfix.field.UnderlyingEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventDate getUnderlyingEventDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventDate());
  }

  public boolean isSet(quickfix.field.UnderlyingEventDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventDate() {
    return isSetField(1983);
  }

  public void set(quickfix.field.UnderlyingEventTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTime get(quickfix.field.UnderlyingEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTime getUnderlyingEventTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTime());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTime() {
    return isSetField(1984);
  }

  public void set(quickfix.field.UnderlyingEventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTimeUnit get(quickfix.field.UnderlyingEventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTimeUnit getUnderlyingEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTimeUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTimeUnit() {
    return isSetField(1985);
  }

  public void set(quickfix.field.UnderlyingEventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTimePeriod get(quickfix.field.UnderlyingEventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTimePeriod getUnderlyingEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTimePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTimePeriod() {
    return isSetField(1986);
  }

  public void set(quickfix.field.UnderlyingEventMonthYear value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventMonthYear get(quickfix.field.UnderlyingEventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventMonthYear getUnderlyingEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventMonthYear());
  }

  public boolean isSet(quickfix.field.UnderlyingEventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventMonthYear() {
    return isSetField(2342);
  }

  public void set(quickfix.field.UnderlyingEventPx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventPx get(quickfix.field.UnderlyingEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventPx getUnderlyingEventPx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventPx());
  }

  public boolean isSet(quickfix.field.UnderlyingEventPx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventPx() {
    return isSetField(1987);
  }

  public void set(quickfix.field.UnderlyingEventText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventText get(quickfix.field.UnderlyingEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventText getUnderlyingEventText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventText());
  }

  public boolean isSet(quickfix.field.UnderlyingEventText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventText() {
    return isSetField(2071);
  }

  public void set(quickfix.field.EncodedUnderlyingEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingEventTextLen get(quickfix.field.EncodedUnderlyingEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingEventTextLen getEncodedUnderlyingEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingEventTextLen() {
    return isSetField(2072);
  }

  public void set(quickfix.field.EncodedUnderlyingEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingEventText get(quickfix.field.EncodedUnderlyingEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingEventText getEncodedUnderlyingEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingEventText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingEventText() {
    return isSetField(2073);
  }
}

  public void set(quickfix.field.UnderlyingLienSeniority value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLienSeniority get(quickfix.field.UnderlyingLienSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLienSeniority getUnderlyingLienSeniority() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLienSeniority());
  }

  public boolean isSet(quickfix.field.UnderlyingLienSeniority field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLienSeniority() {
    return isSetField(1998);
  }

  public void set(quickfix.field.UnderlyingLoanFacility value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLoanFacility get(quickfix.field.UnderlyingLoanFacility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLoanFacility getUnderlyingLoanFacility() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLoanFacility());
  }

  public boolean isSet(quickfix.field.UnderlyingLoanFacility field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLoanFacility() {
    return isSetField(1999);
  }

  public void set(quickfix.field.UnderlyingReferenceEntityType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReferenceEntityType get(quickfix.field.UnderlyingReferenceEntityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReferenceEntityType getUnderlyingReferenceEntityType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReferenceEntityType());
  }

  public boolean isSet(quickfix.field.UnderlyingReferenceEntityType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReferenceEntityType() {
    return isSetField(2000);
  }

  public void set(quickfix.field.UnderlyingIndexSeries value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIndexSeries get(quickfix.field.UnderlyingIndexSeries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIndexSeries getUnderlyingIndexSeries() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIndexSeries());
  }

  public boolean isSet(quickfix.field.UnderlyingIndexSeries field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIndexSeries() {
    return isSetField(2003);
  }

  public void set(quickfix.field.UnderlyingIndexAnnexVersion value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIndexAnnexVersion get(quickfix.field.UnderlyingIndexAnnexVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIndexAnnexVersion getUnderlyingIndexAnnexVersion() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIndexAnnexVersion());
  }

  public boolean isSet(quickfix.field.UnderlyingIndexAnnexVersion field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIndexAnnexVersion() {
    return isSetField(2004);
  }

  public void set(quickfix.field.UnderlyingIndexAnnexDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIndexAnnexDate get(quickfix.field.UnderlyingIndexAnnexDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIndexAnnexDate getUnderlyingIndexAnnexDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIndexAnnexDate());
  }

  public boolean isSet(quickfix.field.UnderlyingIndexAnnexDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIndexAnnexDate() {
    return isSetField(2005);
  }

  public void set(quickfix.field.UnderlyingIndexAnnexSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingIndexAnnexSource get(quickfix.field.UnderlyingIndexAnnexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIndexAnnexSource getUnderlyingIndexAnnexSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingIndexAnnexSource());
  }

  public boolean isSet(quickfix.field.UnderlyingIndexAnnexSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIndexAnnexSource() {
    return isSetField(2006);
  }

  public void set(quickfix.field.UnderlyingSettlRateIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRateIndex get(quickfix.field.UnderlyingSettlRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRateIndex getUnderlyingSettlRateIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRateIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRateIndex() {
    return isSetField(2284);
  }

  public void set(quickfix.field.UnderlyingSettlRateIndexLocation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRateIndexLocation get(quickfix.field.UnderlyingSettlRateIndexLocation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRateIndexLocation getUnderlyingSettlRateIndexLocation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRateIndexLocation());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRateIndexLocation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRateIndexLocation() {
    return isSetField(2285);
  }

  public void set(quickfix.field.UnderlyingOptionExpirationDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExpirationDesc get(quickfix.field.UnderlyingOptionExpirationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExpirationDesc getUnderlyingOptionExpirationDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExpirationDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExpirationDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExpirationDesc() {
    return isSetField(2286);
  }

  public void set(quickfix.field.EncodedUnderlyingOptionExpirationDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingOptionExpirationDescLen get(quickfix.field.EncodedUnderlyingOptionExpirationDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingOptionExpirationDescLen getEncodedUnderlyingOptionExpirationDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingOptionExpirationDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingOptionExpirationDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingOptionExpirationDescLen() {
    return isSetField(2287);
  }

  public void set(quickfix.field.EncodedUnderlyingOptionExpirationDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingOptionExpirationDesc get(quickfix.field.EncodedUnderlyingOptionExpirationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingOptionExpirationDesc getEncodedUnderlyingOptionExpirationDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingOptionExpirationDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingOptionExpirationDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingOptionExpirationDesc() {
    return isSetField(2288);
  }

  public void set(quickfix.field.UnderlyingProductComplex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProductComplex get(quickfix.field.UnderlyingProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProductComplex getUnderlyingProductComplex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProductComplex());
  }

  public boolean isSet(quickfix.field.UnderlyingProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProductComplex() {
    return isSetField(2007);
  }

  public void set(quickfix.field.UnderlyingSecurityGroup value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityGroup get(quickfix.field.UnderlyingSecurityGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityGroup getUnderlyingSecurityGroup() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityGroup());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityGroup field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityGroup() {
    return isSetField(2008);
  }

  public void set(quickfix.field.UnderlyingSettleOnOpenFlag value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettleOnOpenFlag get(quickfix.field.UnderlyingSettleOnOpenFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettleOnOpenFlag getUnderlyingSettleOnOpenFlag() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettleOnOpenFlag());
  }

  public boolean isSet(quickfix.field.UnderlyingSettleOnOpenFlag field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettleOnOpenFlag() {
    return isSetField(2009);
  }

  public void set(quickfix.field.UnderlyingAssignmentMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssignmentMethod get(quickfix.field.UnderlyingAssignmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssignmentMethod getUnderlyingAssignmentMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssignmentMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingAssignmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssignmentMethod() {
    return isSetField(2010);
  }

  public void set(quickfix.field.UnderlyingSecurityStatus value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityStatus get(quickfix.field.UnderlyingSecurityStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityStatus getUnderlyingSecurityStatus() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityStatus());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityStatus field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityStatus() {
    return isSetField(2011);
  }

  public void set(quickfix.field.UnderlyingObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingObligationType get(quickfix.field.UnderlyingObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingObligationType getUnderlyingObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingObligationType() {
    return isSetField(2012);
  }

  public void set(quickfix.field.UnderlyingAssetGroup value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetGroup get(quickfix.field.UnderlyingAssetGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetGroup getUnderlyingAssetGroup() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetGroup());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetGroup field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetGroup() {
    return isSetField(2491);
  }

  public void set(quickfix.field.UnderlyingAssetClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetClass get(quickfix.field.UnderlyingAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetClass getUnderlyingAssetClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetClass());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetClass() {
    return isSetField(2013);
  }

  public void set(quickfix.field.UnderlyingAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetSubClass get(quickfix.field.UnderlyingAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetSubClass getUnderlyingAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetSubClass());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetSubClass() {
    return isSetField(2014);
  }

  public void set(quickfix.field.UnderlyingAssetType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetType get(quickfix.field.UnderlyingAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetType getUnderlyingAssetType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetType());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetType() {
    return isSetField(2015);
  }

  public void set(quickfix.field.UnderlyingAssetSubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetSubType get(quickfix.field.UnderlyingAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetSubType getUnderlyingAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetSubType());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetSubType() {
    return isSetField(2744);
  }

  public void set(quickfix.fixlatest.component.UnderlyingSecondaryAssetGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingSecondaryAssetGrp get(quickfix.fixlatest.component.UnderlyingSecondaryAssetGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingSecondaryAssetGrp getUnderlyingSecondaryAssetGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingSecondaryAssetGrp());
  }

  public void set(quickfix.field.NoUnderlyingSecondaryAssetClasses value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSecondaryAssetClasses get(quickfix.field.NoUnderlyingSecondaryAssetClasses value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSecondaryAssetClasses getNoUnderlyingSecondaryAssetClasses() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSecondaryAssetClasses());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSecondaryAssetClasses field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSecondaryAssetClasses() {
    return isSetField(2080);
  }

public static class NoUnderlyingSecondaryAssetClasses extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2081, 2082, 2083, 2745, 0};

  public NoUnderlyingSecondaryAssetClasses() {
    super(2080, 2081, ORDER);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetClass get(quickfix.field.UnderlyingSecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetClass getUnderlyingSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetClass() {
    return isSetField(2081);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetSubClass get(quickfix.field.UnderlyingSecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetSubClass getUnderlyingSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetSubClass() {
    return isSetField(2082);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetType get(quickfix.field.UnderlyingSecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetType getUnderlyingSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetType() {
    return isSetField(2083);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetSubType get(quickfix.field.UnderlyingSecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetSubType getUnderlyingSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetSubType() {
    return isSetField(2745);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingAssetAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAssetAttributeGrp get(quickfix.fixlatest.component.UnderlyingAssetAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAssetAttributeGrp getUnderlyingAssetAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAssetAttributeGrp());
  }

  public void set(quickfix.field.NoUnderlyingAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAssetAttributes get(quickfix.field.NoUnderlyingAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAssetAttributes getNoUnderlyingAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAssetAttributes() {
    return isSetField(2312);
  }

public static class NoUnderlyingAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2313, 2314, 2315, 0};

  public NoUnderlyingAssetAttributes() {
    super(2312, 2313, ORDER);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeType get(quickfix.field.UnderlyingAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeType getUnderlyingAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeType());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeType() {
    return isSetField(2313);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeValue get(quickfix.field.UnderlyingAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeValue getUnderlyingAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeValue() {
    return isSetField(2314);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeLimit get(quickfix.field.UnderlyingAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeLimit getUnderlyingAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeLimit() {
    return isSetField(2315);
  }
}

  public void set(quickfix.field.UnderlyingSwapClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSwapClass get(quickfix.field.UnderlyingSwapClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSwapClass getUnderlyingSwapClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSwapClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSwapClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSwapClass() {
    return isSetField(2016);
  }

  public void set(quickfix.field.UnderlyingSwapSubClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSwapSubClass get(quickfix.field.UnderlyingSwapSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSwapSubClass getUnderlyingSwapSubClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSwapSubClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSwapSubClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSwapSubClass() {
    return isSetField(2289);
  }

  public void set(quickfix.field.UnderlyingNthToDefault value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNthToDefault get(quickfix.field.UnderlyingNthToDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNthToDefault getUnderlyingNthToDefault() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNthToDefault());
  }

  public boolean isSet(quickfix.field.UnderlyingNthToDefault field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNthToDefault() {
    return isSetField(2017);
  }

  public void set(quickfix.field.UnderlyingMthToDefault value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMthToDefault get(quickfix.field.UnderlyingMthToDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMthToDefault getUnderlyingMthToDefault() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMthToDefault());
  }

  public boolean isSet(quickfix.field.UnderlyingMthToDefault field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMthToDefault() {
    return isSetField(2018);
  }

  public void set(quickfix.field.UnderlyingSettledEntityMatrixSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettledEntityMatrixSource get(quickfix.field.UnderlyingSettledEntityMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettledEntityMatrixSource getUnderlyingSettledEntityMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettledEntityMatrixSource());
  }

  public boolean isSet(quickfix.field.UnderlyingSettledEntityMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettledEntityMatrixSource() {
    return isSetField(2019);
  }

  public void set(quickfix.field.UnderlyingSettledEntityMatrixPublicationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettledEntityMatrixPublicationDate get(quickfix.field.UnderlyingSettledEntityMatrixPublicationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettledEntityMatrixPublicationDate getUnderlyingSettledEntityMatrixPublicationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettledEntityMatrixPublicationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingSettledEntityMatrixPublicationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettledEntityMatrixPublicationDate() {
    return isSetField(2020);
  }

  public void set(quickfix.field.UnderlyingStrikeMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeMultiplier get(quickfix.field.UnderlyingStrikeMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeMultiplier getUnderlyingStrikeMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeMultiplier() {
    return isSetField(2021);
  }

  public void set(quickfix.field.UnderlyingStrikeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeValue get(quickfix.field.UnderlyingStrikeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeValue getUnderlyingStrikeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeValue() {
    return isSetField(2022);
  }

  public void set(quickfix.field.UnderlyingStrikeUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeUnitOfMeasure get(quickfix.field.UnderlyingStrikeUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeUnitOfMeasure getUnderlyingStrikeUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeUnitOfMeasure() {
    return isSetField(2290);
  }

  public void set(quickfix.field.UnderlyingStrikeIndexCurvePoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeIndexCurvePoint get(quickfix.field.UnderlyingStrikeIndexCurvePoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeIndexCurvePoint getUnderlyingStrikeIndexCurvePoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeIndexCurvePoint());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeIndexCurvePoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeIndexCurvePoint() {
    return isSetField(2622);
  }

  public void set(quickfix.field.UnderlyingStrikeIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeIndex get(quickfix.field.UnderlyingStrikeIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeIndex getUnderlyingStrikeIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeIndex() {
    return isSetField(2291);
  }

  public void set(quickfix.field.UnderlyingStrikeIndexQuote value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeIndexQuote get(quickfix.field.UnderlyingStrikeIndexQuote value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeIndexQuote getUnderlyingStrikeIndexQuote() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeIndexQuote());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeIndexQuote field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeIndexQuote() {
    return isSetField(2623);
  }

  public void set(quickfix.field.UnderlyingStrikeIndexSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeIndexSpread get(quickfix.field.UnderlyingStrikeIndexSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeIndexSpread getUnderlyingStrikeIndexSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikeIndexSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeIndexSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeIndexSpread() {
    return isSetField(2292);
  }

  public void set(quickfix.field.UnderlyingStrikePriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikePriceDeterminationMethod get(quickfix.field.UnderlyingStrikePriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikePriceDeterminationMethod getUnderlyingStrikePriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikePriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikePriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikePriceDeterminationMethod() {
    return isSetField(2023);
  }

  public void set(quickfix.field.UnderlyingStrikePriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikePriceBoundaryMethod get(quickfix.field.UnderlyingStrikePriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikePriceBoundaryMethod getUnderlyingStrikePriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikePriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikePriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikePriceBoundaryMethod() {
    return isSetField(2024);
  }

  public void set(quickfix.field.UnderlyingStrikePriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikePriceBoundaryPrecision get(quickfix.field.UnderlyingStrikePriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikePriceBoundaryPrecision getUnderlyingStrikePriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrikePriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.UnderlyingStrikePriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikePriceBoundaryPrecision() {
    return isSetField(2025);
  }

  public void set(quickfix.field.UnderlyingMinPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMinPriceIncrement get(quickfix.field.UnderlyingMinPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMinPriceIncrement getUnderlyingMinPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMinPriceIncrement());
  }

  public boolean isSet(quickfix.field.UnderlyingMinPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMinPriceIncrement() {
    return isSetField(2026);
  }

  public void set(quickfix.field.UnderlyingMinPriceIncrementAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMinPriceIncrementAmount get(quickfix.field.UnderlyingMinPriceIncrementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMinPriceIncrementAmount getUnderlyingMinPriceIncrementAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMinPriceIncrementAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingMinPriceIncrementAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMinPriceIncrementAmount() {
    return isSetField(2027);
  }

  public void set(quickfix.field.UnderlyingOptPayoutType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptPayoutType get(quickfix.field.UnderlyingOptPayoutType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptPayoutType getUnderlyingOptPayoutType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptPayoutType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptPayoutType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptPayoutType() {
    return isSetField(2028);
  }

  public void set(quickfix.field.UnderlyingOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptPayoutAmount get(quickfix.field.UnderlyingOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptPayoutAmount getUnderlyingOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptPayoutAmount() {
    return isSetField(2029);
  }

  public void set(quickfix.field.UnderlyingReturnTrigger value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnTrigger get(quickfix.field.UnderlyingReturnTrigger value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnTrigger getUnderlyingReturnTrigger() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnTrigger());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnTrigger field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnTrigger() {
    return isSetField(2757);
  }

  public void set(quickfix.field.UnderlyingPriceQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPriceQuoteMethod get(quickfix.field.UnderlyingPriceQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPriceQuoteMethod getUnderlyingPriceQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPriceQuoteMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingPriceQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPriceQuoteMethod() {
    return isSetField(2030);
  }

  public void set(quickfix.field.UnderlyingValuationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingValuationMethod get(quickfix.field.UnderlyingValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingValuationMethod getUnderlyingValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingValuationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingValuationMethod() {
    return isSetField(2031);
  }

  public void set(quickfix.field.UnderlyingValuationSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingValuationSource get(quickfix.field.UnderlyingValuationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingValuationSource getUnderlyingValuationSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingValuationSource());
  }

  public boolean isSet(quickfix.field.UnderlyingValuationSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingValuationSource() {
    return isSetField(2293);
  }

  public void set(quickfix.field.UnderlyingValuationReferenceModel value) {
    setField(value);
  }

  public quickfix.field.UnderlyingValuationReferenceModel get(quickfix.field.UnderlyingValuationReferenceModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingValuationReferenceModel getUnderlyingValuationReferenceModel() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingValuationReferenceModel());
  }

  public boolean isSet(quickfix.field.UnderlyingValuationReferenceModel field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingValuationReferenceModel() {
    return isSetField(2294);
  }

  public void set(quickfix.field.UnderlyingListMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingListMethod get(quickfix.field.UnderlyingListMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingListMethod getUnderlyingListMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingListMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingListMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingListMethod() {
    return isSetField(2032);
  }

  public void set(quickfix.field.UnderlyingCapPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCapPrice get(quickfix.field.UnderlyingCapPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCapPrice getUnderlyingCapPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCapPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingCapPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCapPrice() {
    return isSetField(2033);
  }

  public void set(quickfix.field.UnderlyingFloorPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFloorPrice get(quickfix.field.UnderlyingFloorPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFloorPrice getUnderlyingFloorPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFloorPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingFloorPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFloorPrice() {
    return isSetField(2034);
  }

  public void set(quickfix.field.UnderlyingFlexibleIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFlexibleIndicator get(quickfix.field.UnderlyingFlexibleIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFlexibleIndicator getUnderlyingFlexibleIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFlexibleIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingFlexibleIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFlexibleIndicator() {
    return isSetField(2035);
  }

  public void set(quickfix.field.UnderlyingFlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFlexProductEligibilityIndicator get(quickfix.field.UnderlyingFlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFlexProductEligibilityIndicator getUnderlyingFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingFlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFlexProductEligibilityIndicator() {
    return isSetField(2036);
  }

  public void set(quickfix.field.UnderlyingPositionLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPositionLimit get(quickfix.field.UnderlyingPositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPositionLimit getUnderlyingPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPositionLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingPositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPositionLimit() {
    return isSetField(2037);
  }

  public void set(quickfix.field.UnderlyingNTPositionLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNTPositionLimit get(quickfix.field.UnderlyingNTPositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNTPositionLimit getUnderlyingNTPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNTPositionLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingNTPositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNTPositionLimit() {
    return isSetField(2038);
  }

  public void set(quickfix.field.UnderlyingPool value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPool get(quickfix.field.UnderlyingPool value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPool getUnderlyingPool() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPool());
  }

  public boolean isSet(quickfix.field.UnderlyingPool field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPool() {
    return isSetField(2039);
  }

  public void set(quickfix.field.UnderlyingContractSettlMonth value) {
    setField(value);
  }

  public quickfix.field.UnderlyingContractSettlMonth get(quickfix.field.UnderlyingContractSettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingContractSettlMonth getUnderlyingContractSettlMonth() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingContractSettlMonth());
  }

  public boolean isSet(quickfix.field.UnderlyingContractSettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingContractSettlMonth() {
    return isSetField(2040);
  }

  public void set(quickfix.field.UnderlyingDatedDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDatedDate get(quickfix.field.UnderlyingDatedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDatedDate getUnderlyingDatedDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDatedDate());
  }

  public boolean isSet(quickfix.field.UnderlyingDatedDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDatedDate() {
    return isSetField(2041);
  }

  public void set(quickfix.field.UnderlyingInterestAccrualDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInterestAccrualDate get(quickfix.field.UnderlyingInterestAccrualDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInterestAccrualDate getUnderlyingInterestAccrualDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInterestAccrualDate());
  }

  public boolean isSet(quickfix.field.UnderlyingInterestAccrualDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInterestAccrualDate() {
    return isSetField(2042);
  }

  public void set(quickfix.field.UnderlyingShortSaleRestriction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingShortSaleRestriction get(quickfix.field.UnderlyingShortSaleRestriction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingShortSaleRestriction getUnderlyingShortSaleRestriction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingShortSaleRestriction());
  }

  public boolean isSet(quickfix.field.UnderlyingShortSaleRestriction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingShortSaleRestriction() {
    return isSetField(2043);
  }

  public void set(quickfix.field.UnderlyingRefTickTableID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRefTickTableID get(quickfix.field.UnderlyingRefTickTableID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRefTickTableID getUnderlyingRefTickTableID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRefTickTableID());
  }

  public boolean isSet(quickfix.field.UnderlyingRefTickTableID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRefTickTableID() {
    return isSetField(2044);
  }

  public void set(quickfix.field.UnderlyingProtectionTermXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermXIDRef get(quickfix.field.UnderlyingProtectionTermXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermXIDRef getUnderlyingProtectionTermXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermXIDRef() {
    return isSetField(41314);
  }

  public void set(quickfix.field.UnderlyingSettlTermXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlTermXIDRef get(quickfix.field.UnderlyingSettlTermXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlTermXIDRef getUnderlyingSettlTermXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlTermXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlTermXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlTermXIDRef() {
    return isSetField(41315);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEvents component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEvents get(quickfix.fixlatest.component.UnderlyingComplexEvents component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEvents getUnderlyingComplexEventsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEvents());
  }

  public void set(quickfix.field.NoUnderlyingComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEvents get(quickfix.field.NoUnderlyingComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEvents getNoUnderlyingComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEvents() {
    return isSetField(2045);
  }

public static class NoUnderlyingComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2046, 2261, 2262, 2263, 2047, 2264, 2265, 2266, 2048, 2267, 2049, 2050, 2051, 2052, 2053, 2268, 2269, 2270, 2271, 2419, 2420, 2272, 2273, 2274, 2275, 2276, 41732, 41739, 41740, 41741, 41742, 41743, 41744, 41737, 41745, 41746, 41747, 41729, 2277, 2278, 2279, 2280, 2281, 41748, 41716, 2611, 2612, 2613, 2282, 2283, 0};

  public NoUnderlyingComplexEvents() {
    super(2045, 2046, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventType get(quickfix.field.UnderlyingComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventType getUnderlyingComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventType() {
    return isSetField(2046);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutPaySide get(quickfix.field.UnderlyingComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutPaySide getUnderlyingComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutPaySide() {
    return isSetField(2261);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutReceiveSide get(quickfix.field.UnderlyingComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutReceiveSide getUnderlyingComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutReceiveSide() {
    return isSetField(2262);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutUnderlier get(quickfix.field.UnderlyingComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutUnderlier getUnderlyingComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutUnderlier() {
    return isSetField(2263);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutAmount get(quickfix.field.UnderlyingComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutAmount getUnderlyingComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutAmount() {
    return isSetField(2047);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutPercentage get(quickfix.field.UnderlyingComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutPercentage getUnderlyingComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutPercentage() {
    return isSetField(2264);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutTime get(quickfix.field.UnderlyingComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutTime getUnderlyingComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutTime() {
    return isSetField(2265);
  }

  public void set(quickfix.field.UnderlyingComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexOptPayoutCurrency get(quickfix.field.UnderlyingComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexOptPayoutCurrency getUnderlyingComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexOptPayoutCurrency() {
    return isSetField(2266);
  }

  public void set(quickfix.field.UnderlyingComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPrice get(quickfix.field.UnderlyingComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPrice getUnderlyingComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPrice() {
    return isSetField(2048);
  }

  public void set(quickfix.field.UnderlyingComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPricePercentage get(quickfix.field.UnderlyingComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPricePercentage getUnderlyingComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPricePercentage() {
    return isSetField(2267);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryMethod get(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryMethod getUnderlyingComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceBoundaryMethod() {
    return isSetField(2049);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision get(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision getUnderlyingComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceBoundaryPrecision() {
    return isSetField(2050);
  }

  public void set(quickfix.field.UnderlyingComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPriceTimeType get(quickfix.field.UnderlyingComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPriceTimeType getUnderlyingComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPriceTimeType() {
    return isSetField(2051);
  }

  public void set(quickfix.field.UnderlyingComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCondition get(quickfix.field.UnderlyingComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCondition getUnderlyingComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCondition());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCondition() {
    return isSetField(2052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDates get(quickfix.fixlatest.component.UnderlyingComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventDates getUnderlyingComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventDates());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventDates get(quickfix.field.NoUnderlyingComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventDates getNoUnderlyingComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventDates() {
    return isSetField(2053);
  }

public static class NoUnderlyingComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2054, 2055, 2056, 0};

  public NoUnderlyingComplexEventDates() {
    super(2053, 2054, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartDate get(quickfix.field.UnderlyingComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartDate getUnderlyingComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartDate() {
    return isSetField(2054);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndDate get(quickfix.field.UnderlyingComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndDate getUnderlyingComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndDate() {
    return isSetField(2055);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes get(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes getUnderlyingComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventTimes());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventTimes get(quickfix.field.NoUnderlyingComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventTimes getNoUnderlyingComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventTimes() {
    return isSetField(2056);
  }

public static class NoUnderlyingComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2057, 2058, 0};

  public NoUnderlyingComplexEventTimes() {
    super(2056, 2057, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCurrencyOne get(quickfix.field.UnderlyingComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCurrencyOne getUnderlyingComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCurrencyOne() {
    return isSetField(2268);
  }

  public void set(quickfix.field.UnderlyingComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCurrencyTwo get(quickfix.field.UnderlyingComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCurrencyTwo getUnderlyingComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCurrencyTwo() {
    return isSetField(2269);
  }

  public void set(quickfix.field.UnderlyingComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventQuoteBasis get(quickfix.field.UnderlyingComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventQuoteBasis getUnderlyingComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventQuoteBasis() {
    return isSetField(2270);
  }

  public void set(quickfix.field.UnderlyingComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFixedFXRate get(quickfix.field.UnderlyingComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFixedFXRate getUnderlyingComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFixedFXRate() {
    return isSetField(2271);
  }

  public void set(quickfix.field.UnderlyingComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventSpotRate get(quickfix.field.UnderlyingComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventSpotRate getUnderlyingComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventSpotRate() {
    return isSetField(2419);
  }

  public void set(quickfix.field.UnderlyingComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventForwardPoints get(quickfix.field.UnderlyingComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventForwardPoints getUnderlyingComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventForwardPoints() {
    return isSetField(2420);
  }

  public void set(quickfix.field.UnderlyingComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDeterminationMethod get(quickfix.field.UnderlyingComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDeterminationMethod getUnderlyingComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDeterminationMethod() {
    return isSetField(2272);
  }

  public void set(quickfix.field.UnderlyingComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCalculationAgent get(quickfix.field.UnderlyingComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCalculationAgent getUnderlyingComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCalculationAgent() {
    return isSetField(2273);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikePrice get(quickfix.field.UnderlyingComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikePrice getUnderlyingComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikePrice() {
    return isSetField(2274);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikeFactor get(quickfix.field.UnderlyingComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikeFactor getUnderlyingComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikeFactor() {
    return isSetField(2275);
  }

  public void set(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions get(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions getUnderlyingComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStrikeNumberOfOptions() {
    return isSetField(2276);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp get(quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp getUnderlyingComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventRateSources get(quickfix.field.NoUnderlyingComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventRateSources getNoUnderlyingComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventRateSources() {
    return isSetField(41732);
  }

public static class NoUnderlyingComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41733, 41734, 41735, 41736, 0};

  public NoUnderlyingComplexEventRateSources() {
    super(41732, 41733, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventRateSource get(quickfix.field.UnderlyingComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventRateSource getUnderlyingComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventRateSource() {
    return isSetField(41733);
  }

  public void set(quickfix.field.UnderlyingComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventRateSourceType get(quickfix.field.UnderlyingComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventRateSourceType getUnderlyingComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventRateSourceType() {
    return isSetField(41734);
  }

  public void set(quickfix.field.UnderlyingComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventReferencePage get(quickfix.field.UnderlyingComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventReferencePage getUnderlyingComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventReferencePage() {
    return isSetField(41735);
  }

  public void set(quickfix.field.UnderlyingComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventReferencePageHeading get(quickfix.field.UnderlyingComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventReferencePageHeading getUnderlyingComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventReferencePageHeading() {
    return isSetField(41736);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate get(quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate getUnderlyingComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp getUnderlyingComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods get(quickfix.field.NoUnderlyingComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods getNoUnderlyingComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriods() {
    return isSetField(41729);
  }

public static class NoUnderlyingComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41730, 41731, 41750, 41726, 41713, 0};

  public NoUnderlyingComplexEventPeriods() {
    super(41729, 41730, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodType get(quickfix.field.UnderlyingComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodType getUnderlyingComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodType() {
    return isSetField(41730);
  }

  public void set(quickfix.field.UnderlyingComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter get(quickfix.field.UnderlyingComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter getUnderlyingComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventBusinessCenter() {
    return isSetField(41731);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp get(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp getUnderlyingComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules get(quickfix.field.NoUnderlyingComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules getNoUnderlyingComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventSchedules() {
    return isSetField(41750);
  }

public static class NoUnderlyingComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41751, 41752, 41753, 41754, 41755, 0};

  public NoUnderlyingComplexEventSchedules() {
    super(41750, 41751, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate get(quickfix.field.UnderlyingComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate getUnderlyingComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleStartDate() {
    return isSetField(41751);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate get(quickfix.field.UnderlyingComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate getUnderlyingComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleEndDate() {
    return isSetField(41752);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod get(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod getUnderlyingComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyPeriod() {
    return isSetField(41753);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit get(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit getUnderlyingComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyUnit() {
    return isSetField(41754);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention get(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention getUnderlyingComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleRollConvention() {
    return isSetField(41755);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp getUnderlyingComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes get(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes getNoUnderlyingComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriodDateTimes() {
    return isSetField(41726);
  }

public static class NoUnderlyingComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41727, 41728, 0};

  public NoUnderlyingComplexEventPeriodDateTimes() {
    super(41726, 41727, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp getUnderlyingComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations get(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations getNoUnderlyingComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventAveragingObservations() {
    return isSetField(41713);
  }

public static class NoUnderlyingComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41714, 41715, 0};

  public NoUnderlyingComplexEventAveragingObservations() {
    super(41713, 41714, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventsXIDRef get(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventsXIDRef getUnderlyingComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventsXIDRef() {
    return isSetField(2277);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty get(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty getUnderlyingComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventNotifyingParty() {
    return isSetField(2278);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter get(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter getUnderlyingComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventBusinessCenter() {
    return isSetField(2279);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventStandardSources get(quickfix.field.UnderlyingComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventStandardSources getUnderlyingComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventStandardSources() {
    return isSetField(2280);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventMinimumSources get(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventMinimumSources getUnderlyingComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventMinimumSources() {
    return isSetField(2281);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp getUnderlyingComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources get(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources getNoUnderlyingComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventSources() {
    return isSetField(41748);
  }

public static class NoUnderlyingComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41749, 0};

  public NoUnderlyingComplexEventCreditEventSources() {
    super(41748, 41749, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource get(quickfix.field.UnderlyingComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource getUnderlyingComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventSource() {
    return isSetField(41749);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp getUnderlyingComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents get(quickfix.field.NoUnderlyingComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents getNoUnderlyingComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEvents() {
    return isSetField(41716);
  }

public static class NoUnderlyingComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41717, 41718, 41719, 41720, 41721, 41722, 41723, 41724, 0};

  public NoUnderlyingComplexEventCreditEvents() {
    super(41716, 41717, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType get(quickfix.field.UnderlyingComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType getUnderlyingComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventType() {
    return isSetField(41717);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue get(quickfix.field.UnderlyingComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue getUnderlyingComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventValue() {
    return isSetField(41718);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency get(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency getUnderlyingComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventCurrency() {
    return isSetField(41719);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod get(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod getUnderlyingComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventPeriod() {
    return isSetField(41720);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit get(quickfix.field.UnderlyingComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit getUnderlyingComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventUnit() {
    return isSetField(41721);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType get(quickfix.field.UnderlyingComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType getUnderlyingComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventDayType() {
    return isSetField(41722);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource get(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource getUnderlyingComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventRateSource() {
    return isSetField(41723);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp getUnderlyingComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers get(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers getNoUnderlyingComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventQualifiers() {
    return isSetField(41724);
  }

public static class NoUnderlyingComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41725, 0};

  public NoUnderlyingComplexEventCreditEventQualifiers() {
    super(41724, 41725, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventFuturesPriceValuation get(quickfix.field.UnderlyingComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventFuturesPriceValuation getUnderlyingComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventFuturesPriceValuation() {
    return isSetField(2611);
  }

  public void set(quickfix.field.UnderlyingComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventOptionsPriceValuation get(quickfix.field.UnderlyingComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventOptionsPriceValuation getUnderlyingComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventOptionsPriceValuation() {
    return isSetField(2612);
  }

  public void set(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback get(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback getUnderlyingComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2613);
  }

  public void set(quickfix.field.UnderlyingComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventXID get(quickfix.field.UnderlyingComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventXID getUnderlyingComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventXID());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventXID() {
    return isSetField(2282);
  }

  public void set(quickfix.field.UnderlyingComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventXIDRef get(quickfix.field.UnderlyingComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventXIDRef getUnderlyingComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventXIDRef() {
    return isSetField(2283);
  }
}

  public void set(quickfix.field.UnderlyingStrategyType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStrategyType get(quickfix.field.UnderlyingStrategyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrategyType getUnderlyingStrategyType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStrategyType());
  }

  public boolean isSet(quickfix.field.UnderlyingStrategyType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrategyType() {
    return isSetField(2295);
  }

  public void set(quickfix.field.UnderlyingCommonPricingIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCommonPricingIndicator get(quickfix.field.UnderlyingCommonPricingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCommonPricingIndicator getUnderlyingCommonPricingIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCommonPricingIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCommonPricingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCommonPricingIndicator() {
    return isSetField(2296);
  }

  public void set(quickfix.field.UnderlyingSettlDisruptionProvision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlDisruptionProvision get(quickfix.field.UnderlyingSettlDisruptionProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlDisruptionProvision getUnderlyingSettlDisruptionProvision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlDisruptionProvision());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlDisruptionProvision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlDisruptionProvision() {
    return isSetField(2297);
  }

  public void set(quickfix.field.UnderlyingDeliveryRouteOrCharter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryRouteOrCharter get(quickfix.field.UnderlyingDeliveryRouteOrCharter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryRouteOrCharter getUnderlyingDeliveryRouteOrCharter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryRouteOrCharter());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryRouteOrCharter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryRouteOrCharter() {
    return isSetField(2756);
  }

  public void set(quickfix.field.UnderlyingInstrumentRoundingDirection value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentRoundingDirection get(quickfix.field.UnderlyingInstrumentRoundingDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentRoundingDirection getUnderlyingInstrumentRoundingDirection() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentRoundingDirection());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentRoundingDirection field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentRoundingDirection() {
    return isSetField(2298);
  }

  public void set(quickfix.field.UnderlyingInstrumentRoundingPrecision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentRoundingPrecision get(quickfix.field.UnderlyingInstrumentRoundingPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentRoundingPrecision getUnderlyingInstrumentRoundingPrecision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentRoundingPrecision());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentRoundingPrecision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentRoundingPrecision() {
    return isSetField(2299);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDateAdjustment component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDateAdjustment get(quickfix.fixlatest.component.UnderlyingDateAdjustment component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDateAdjustment getUnderlyingDateAdjustmentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDateAdjustment());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPricingDateTime component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPricingDateTime get(quickfix.fixlatest.component.UnderlyingPricingDateTime component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPricingDateTime getUnderlyingPricingDateTimeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPricingDateTime());
  }

  public void set(quickfix.fixlatest.component.UnderlyingMarketDisruption component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruption get(quickfix.fixlatest.component.UnderlyingMarketDisruption component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruption getUnderlyingMarketDisruptionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingMarketDisruption());
  }

  public void set(quickfix.fixlatest.component.UnderlyingOptionExercise component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExercise get(quickfix.fixlatest.component.UnderlyingOptionExercise component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExercise getUnderlyingOptionExerciseComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExercise());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamGrp get(quickfix.fixlatest.component.UnderlyingStreamGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamGrp getUnderlyingStreamGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreams value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreams get(quickfix.field.NoUnderlyingStreams value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreams getNoUnderlyingStreams() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreams());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreams field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreams() {
    return isSetField(40540);
  }

public static class NoUnderlyingStreams extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40541, 42016, 40542, 43083, 43084, 40543, 40544, 42018, 40545, 40546, 43085, 43086, 42019, 42020, 42021, 42022, 42023, 42024, 41964, 41965, 41966, 41967, 41990, 41968, 41969, 41970, 42589, 41800, 41971, 41972, 41973, 41974, 41975, 41976, 41977, 41993, 41978, 41979, 41980, 41981, 41982, 41962, 41983, 41984, 41985, 41986, 41987, 42002, 41988, 41989, 40057, 40058, 40975, 40060, 40061, 40062, 40063, 40064, 40548, 40549, 40976, 40551, 40552, 40553, 40554, 40555, 41957, 41958, 40556, 40973, 41954, 40558, 40559, 40974, 40561, 40562, 40563, 40564, 40565, 40566, 40567, 41959, 41960, 41961, 40568, 40569, 40570, 42895, 40571, 40572, 43107, 40573, 40574, 40575, 40576, 40577, 42896, 42897, 42898, 42899, 40578, 40579, 40580, 41897, 41898, 41899, 41900, 41901, 41902, 41903, 40581, 40969, 41937, 40583, 40584, 40585, 40586, 40587, 40588, 40589, 40590, 40591, 41940, 42949, 42950, 42951, 42952, 42953, 42954, 40592, 40593, 40970, 40595, 40596, 40597, 40598, 40599, 40971, 40601, 40602, 40603, 40604, 40605, 40606, 40972, 40608, 40609, 40610, 40611, 40612, 40613, 40614, 42955, 40615, 40616, 40617, 41904, 41905, 40618, 40619, 41906, 41907, 41908, 40620, 40621, 43092, 43093, 40622, 40623, 41911, 41912, 41913, 41914, 41915, 41916, 41917, 41918, 41919, 40624, 40625, 41920, 41921, 41922, 41923, 40626, 40627, 40628, 40629, 40630, 40631, 40632, 40633, 40634, 41924, 41925, 40635, 40636, 40637, 40638, 41926, 41927, 42958, 42959, 42960, 41928, 41929, 42961, 41930, 41931, 41932, 41933, 41934, 41909, 41944, 41941, 40639, 40640, 40641, 40642, 40643, 40644, 40645, 40646, 40647, 42962, 42978, 42979, 42980, 42981, 42947, 42948, 42826, 42827, 42828, 42829, 42862, 42830, 42831, 42832, 42833, 42846, 42847, 42848, 42849, 42850, 42851, 42853, 42852, 42801, 42802, 42803, 42804, 42805, 42806, 42807, 42808, 42809, 42810, 42811, 42812, 42813, 42814, 42815, 42816, 42817, 42818, 42834, 42819, 42820, 42821, 42822, 42823, 42824, 42799, 42825, 42835, 42836, 42837, 42838, 42839, 42840, 42841, 42842, 42843, 42844, 42845, 42963, 43034, 42964, 42965, 42966, 42967, 42968, 42969, 42970, 42971, 42972, 42973, 42974, 42975, 42976, 42977, 42900, 42923, 42924, 42925, 42926, 42927, 42928, 42929, 42930, 42931, 42932, 42933, 42934, 42935, 42936, 42937, 42938, 42939, 42940, 42904, 42915, 42901, 42905, 42906, 42907, 42908, 42909, 42941, 42942, 42943, 42944, 42945, 42946, 42917, 42918, 42919, 42920, 42921, 42922, 42910, 42911, 42912, 42913, 42914, 40648, 40649, 40968, 40651, 40652, 40653, 40654, 40661, 40824, 40656, 40659, 40664, 40708, 41777, 41808, 41778, 41779, 41780, 41781, 42196, 42197, 41782, 41783, 41784, 41785, 41786, 41587, 41804, 41787, 41788, 41789, 41790, 41791, 41792, 41793, 41794, 41795, 41796, 41797, 41798, 41799, 43096, 41756, 40547, 40988, 40989, 0};

  public NoUnderlyingStreams() {
    super(40540, 40541, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamType get(quickfix.field.UnderlyingStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamType getUnderlyingStreamType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamType() {
    return isSetField(40541);
  }

  public void set(quickfix.field.UnderlyingStreamXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamXID get(quickfix.field.UnderlyingStreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamXID getUnderlyingStreamXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamXID() {
    return isSetField(42016);
  }

  public void set(quickfix.field.UnderlyingStreamDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamDesc get(quickfix.field.UnderlyingStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamDesc getUnderlyingStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamDesc() {
    return isSetField(40542);
  }

  public void set(quickfix.field.UnderlyingStreamVersion value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamVersion get(quickfix.field.UnderlyingStreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamVersion getUnderlyingStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamVersion());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamVersion() {
    return isSetField(43083);
  }

  public void set(quickfix.field.UnderlyingStreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamVersionEffectiveDate get(quickfix.field.UnderlyingStreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamVersionEffectiveDate getUnderlyingStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamVersionEffectiveDate() {
    return isSetField(43084);
  }

  public void set(quickfix.field.UnderlyingStreamPaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamPaySide get(quickfix.field.UnderlyingStreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamPaySide getUnderlyingStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamPaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamPaySide() {
    return isSetField(40543);
  }

  public void set(quickfix.field.UnderlyingStreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamReceiveSide get(quickfix.field.UnderlyingStreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamReceiveSide getUnderlyingStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamReceiveSide() {
    return isSetField(40544);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalXIDRef get(quickfix.field.UnderlyingStreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalXIDRef getUnderlyingStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalXIDRef() {
    return isSetField(42018);
  }

  public void set(quickfix.field.UnderlyingStreamNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotional get(quickfix.field.UnderlyingStreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotional getUnderlyingStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotional() {
    return isSetField(40545);
  }

  public void set(quickfix.field.UnderlyingStreamCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCurrency get(quickfix.field.UnderlyingStreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCurrency getUnderlyingStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCurrency() {
    return isSetField(40546);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalDeterminationMethod get(quickfix.field.UnderlyingStreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalDeterminationMethod getUnderlyingStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalDeterminationMethod() {
    return isSetField(43085);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalAdjustments get(quickfix.field.UnderlyingStreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalAdjustments getUnderlyingStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalAdjustments() {
    return isSetField(43086);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyPeriod get(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyPeriod getUnderlyingStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalFrequencyPeriod() {
    return isSetField(42019);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyUnit get(quickfix.field.UnderlyingStreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyUnit getUnderlyingStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalFrequencyUnit() {
    return isSetField(42020);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalCommodityFrequency get(quickfix.field.UnderlyingStreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalCommodityFrequency getUnderlyingStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalCommodityFrequency() {
    return isSetField(42021);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalUnitOfMeasure getUnderlyingStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalUnitOfMeasure() {
    return isSetField(42022);
  }

  public void set(quickfix.field.UnderlyingStreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTotalNotional get(quickfix.field.UnderlyingStreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTotalNotional getUnderlyingStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTotalNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTotalNotional() {
    return isSetField(42023);
  }

  public void set(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure getUnderlyingStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTotalNotionalUnitOfMeasure() {
    return isSetField(42024);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodity get(quickfix.fixlatest.component.UnderlyingStreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodity getUnderlyingStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommodity());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDate get(quickfix.fixlatest.component.UnderlyingStreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDate getUnderlyingStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDate get(quickfix.fixlatest.component.UnderlyingStreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDate getUnderlyingStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates get(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates getUnderlyingStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStream get(quickfix.fixlatest.component.UnderlyingPaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStream getUnderlyingPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStream());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp getUnderlyingPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentSchedules get(quickfix.field.NoUnderlyingPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentSchedules getNoUnderlyingPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentSchedules() {
    return isSetField(40664);
  }

public static class NoUnderlyingPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40665, 41881, 41882, 40666, 40667, 40668, 40669, 40670, 40671, 40672, 40673, 40674, 40675, 41883, 41884, 41885, 41886, 40676, 40677, 40678, 40679, 41887, 41888, 41889, 41890, 40680, 40681, 40682, 40683, 40684, 40685, 40704, 40686, 40687, 40688, 40689, 40966, 40691, 40692, 40693, 41891, 41892, 40694, 41878, 41893, 41894, 41895, 41896, 40695, 40696, 40697, 40698, 40967, 40700, 40701, 40702, 40703, 0};

  public NoUnderlyingPaymentSchedules() {
    super(40664, 40665, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleType get(quickfix.field.UnderlyingPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleType getUnderlyingPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleType() {
    return isSetField(40665);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXID get(quickfix.field.UnderlyingPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXID getUnderlyingPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXID() {
    return isSetField(41881);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef get(quickfix.field.UnderlyingPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef getUnderlyingPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXIDRef() {
    return isSetField(41882);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType get(quickfix.field.UnderlyingPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType getUnderlyingPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStubType() {
    return isSetField(40666);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted getUnderlyingPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStartDateUnadjusted() {
    return isSetField(40667);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted getUnderlyingPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleEndDateUnadjusted() {
    return isSetField(40668);
  }

  public void set(quickfix.field.UnderlyingPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide get(quickfix.field.UnderlyingPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide getUnderlyingPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentSchedulePaySide() {
    return isSetField(40669);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide get(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide getUnderlyingPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReceiveSide() {
    return isSetField(40670);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional get(quickfix.field.UnderlyingPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional getUnderlyingPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleNotional() {
    return isSetField(40671);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency get(quickfix.field.UnderlyingPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency getUnderlyingPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleCurrency() {
    return isSetField(40672);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRate get(quickfix.field.UnderlyingPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRate getUnderlyingPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRate() {
    return isSetField(40673);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier get(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier getUnderlyingPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateMultiplier() {
    return isSetField(40674);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread get(quickfix.field.UnderlyingPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread getUnderlyingPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpread() {
    return isSetField(40675);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency get(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency getUnderlyingPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateCurrency() {
    return isSetField(41883);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure getUnderlyingPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41884);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor get(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor getUnderlyingPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateConversionFactor() {
    return isSetField(41885);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType getUnderlyingPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadType() {
    return isSetField(41886);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType getUnderlyingPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadPositionType() {
    return isSetField(40676);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment get(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment getUnderlyingPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateTreatment() {
    return isSetField(40677);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount get(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount getUnderlyingPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedAmount() {
    return isSetField(40678);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency get(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency getUnderlyingPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedCurrency() {
    return isSetField(40679);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice getUnderlyingPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPrice() {
    return isSetField(41887);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency getUnderlyingPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41888);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure getUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41889);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure getUnderlyingPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41890);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod getUnderlyingPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40680);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit getUnderlyingPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyUnit() {
    return isSetField(40681);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue get(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue getUnderlyingPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetValue() {
    return isSetField(40682);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate get(quickfix.field.UnderlyingPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate getUnderlyingPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRate() {
    return isSetField(40683);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate get(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate getUnderlyingPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetRate() {
    return isSetField(40684);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo get(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo getUnderlyingPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRelativeTo() {
    return isSetField(40685);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp getUnderlyingPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources get(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources getNoUnderlyingPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleRateSources() {
    return isSetField(40704);
  }

public static class NoUnderlyingPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40705, 40706, 40707, 0};

  public NoUnderlyingPaymentScheduleRateSources() {
    super(40704, 40705, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted getUnderlyingPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40686);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight get(quickfix.field.UnderlyingPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight getUnderlyingPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleWeight() {
    return isSetField(40687);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo getUnderlyingPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40688);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn getUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() {
    return isSetField(40689);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp getUnderlyingPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters getNoUnderlyingPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40966);
  }

public static class NoUnderlyingPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40690, 0};

  public NoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    super(40966, 40690, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod getUnderlyingPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40691);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit getUnderlyingPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40692);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType getUnderlyingPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40693);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution get(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution getUnderlyingPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayDistribution() {
    return isSetField(41891);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount get(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount getUnderlyingPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayCount() {
    return isSetField(41892);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted getUnderlyingPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateAdjusted() {
    return isSetField(40694);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp getUnderlyingPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays get(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays getNoUnderlyingPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDays() {
    return isSetField(41878);
  }

public static class NoUnderlyingPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41879, 41880, 0};

  public NoUnderlyingPaymentScheduleFixingDays() {
    super(41878, 41879, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod getUnderlyingPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagPeriod() {
    return isSetField(41893);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit get(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit getUnderlyingPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagUnit() {
    return isSetField(41894);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41895);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41896);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime get(quickfix.field.UnderlyingPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime getUnderlyingPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTime() {
    return isSetField(40695);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter getUnderlyingPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40696);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo getUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40697);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention getUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40698);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp getUnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters getNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40967);
  }

public static class NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40699, 0};

  public NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40967, 40699, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter getUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40699);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod getUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40700);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit getUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40701);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType getUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40702);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted getUnderlyingPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40703);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubGrp get(quickfix.fixlatest.component.UnderlyingPaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubGrp getUnderlyingPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubs get(quickfix.field.NoUnderlyingPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubs getNoUnderlyingPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubs() {
    return isSetField(40708);
  }

public static class NoUnderlyingPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40709, 40710, 42993, 42994, 43000, 42995, 42996, 42997, 42998, 42999, 42984, 42985, 42991, 42986, 42987, 42988, 42989, 42990, 40711, 40712, 40713, 40714, 40715, 40716, 40717, 40718, 40719, 40720, 40721, 40722, 40723, 40724, 40725, 40726, 40727, 40728, 40729, 40730, 40731, 40732, 40733, 40734, 40735, 40736, 40737, 0};

  public NoUnderlyingPaymentStubs() {
    super(40708, 40709, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubType get(quickfix.field.UnderlyingPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubType getUnderlyingPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubType() {
    return isSetField(40709);
  }

  public void set(quickfix.field.UnderlyingPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubLength get(quickfix.field.UnderlyingPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubLength getUnderlyingPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubLength() {
    return isSetField(40710);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate get(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate getUnderlyingPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate get(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate getUnderlyingPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubEndDate());
  }

  public void set(quickfix.field.UnderlyingPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubRate get(quickfix.field.UnderlyingPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubRate getUnderlyingPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubRate() {
    return isSetField(40711);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount get(quickfix.field.UnderlyingPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount getUnderlyingPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedAmount() {
    return isSetField(40712);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency get(quickfix.field.UnderlyingPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency getUnderlyingPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedCurrency() {
    return isSetField(40713);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex get(quickfix.field.UnderlyingPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex getUnderlyingPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex() {
    return isSetField(40714);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource get(quickfix.field.UnderlyingPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource getUnderlyingPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexSource() {
    return isSetField(40715);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod get(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod getUnderlyingPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurvePeriod() {
    return isSetField(40716);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit get(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit getUnderlyingPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurveUnit() {
    return isSetField(40717);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier get(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier getUnderlyingPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateMultiplier() {
    return isSetField(40718);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread get(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread getUnderlyingPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpread() {
    return isSetField(40719);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType getUnderlyingPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40720);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment get(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment getUnderlyingPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateTreatment() {
    return isSetField(40721);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate get(quickfix.field.UnderlyingPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate getUnderlyingPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRate() {
    return isSetField(40722);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide getUnderlyingPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateBuySide() {
    return isSetField(40723);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide getUnderlyingPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateSellSide() {
    return isSetField(40724);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate get(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate getUnderlyingPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRate() {
    return isSetField(40725);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide getUnderlyingPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateBuySide() {
    return isSetField(40726);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide getUnderlyingPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateSellSide() {
    return isSetField(40727);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 get(quickfix.field.UnderlyingPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 getUnderlyingPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2() {
    return isSetField(40728);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source get(quickfix.field.UnderlyingPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source getUnderlyingPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2Source() {
    return isSetField(40729);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod get(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod getUnderlyingPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurvePeriod() {
    return isSetField(40730);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit get(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit getUnderlyingPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurveUnit() {
    return isSetField(40731);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier get(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier getUnderlyingPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateMultiplier() {
    return isSetField(40732);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread get(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread getUnderlyingPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpread() {
    return isSetField(40733);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType getUnderlyingPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40734);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment get(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment getUnderlyingPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateTreatment() {
    return isSetField(40735);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate get(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate getUnderlyingPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CapRate() {
    return isSetField(40736);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate get(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate getUnderlyingPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2FloorRate() {
    return isSetField(40737);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStream get(quickfix.fixlatest.component.UnderlyingDeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStream getUnderlyingDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryStream());
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp getUnderlyingDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliverySchedules get(quickfix.field.NoUnderlyingDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliverySchedules getNoUnderlyingDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliverySchedules() {
    return isSetField(41756);
  }

public static class NoUnderlyingDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41757, 41758, 41759, 41760, 41761, 41762, 41763, 41764, 41765, 41766, 41767, 41768, 41769, 41770, 0};

  public NoUnderlyingDeliverySchedules() {
    super(41756, 41757, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleType get(quickfix.field.UnderlyingDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleType getUnderlyingDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleType() {
    return isSetField(41757);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID get(quickfix.field.UnderlyingDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID getUnderlyingDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleXID() {
    return isSetField(41758);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional get(quickfix.field.UnderlyingDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional getUnderlyingDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotional() {
    return isSetField(41759);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure getUnderlyingDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41760);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency getUnderlyingDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41761);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance get(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance getUnderlyingDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNegativeTolerance() {
    return isSetField(41762);
  }

  public void set(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance get(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance getUnderlyingDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliverySchedulePositiveTolerance() {
    return isSetField(41763);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure getUnderlyingDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41764);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType get(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType getUnderlyingDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceType() {
    return isSetField(41765);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry get(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry getUnderlyingDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlCountry() {
    return isSetField(41766);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone getUnderlyingDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeZone() {
    return isSetField(41767);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType get(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType getUnderlyingDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlFlowType() {
    return isSetField(41768);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction getUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41769);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp getUnderlyingDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays get(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays getNoUnderlyingDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlDays() {
    return isSetField(41770);
  }

public static class NoUnderlyingDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41771, 41772, 41773, 0};

  public NoUnderlyingDeliveryScheduleSettlDays() {
    super(41770, 41771, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay get(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay getUnderlyingDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlDay() {
    return isSetField(41771);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours get(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours getUnderlyingDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTotalHours() {
    return isSetField(41772);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp getUnderlyingDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes get(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes getNoUnderlyingDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlTimes() {
    return isSetField(41773);
  }

public static class NoUnderlyingDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41774, 41775, 41776, 0};

  public NoUnderlyingDeliveryScheduleSettlTimes() {
    super(41773, 41774, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart get(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart getUnderlyingDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlStart() {
    return isSetField(41774);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd get(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd getUnderlyingDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlEnd() {
    return isSetField(41775);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType getUnderlyingDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeType() {
    return isSetField(41776);
  }
}
}
}

  public void set(quickfix.field.UnderlyingStreamText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamText get(quickfix.field.UnderlyingStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamText getUnderlyingStreamText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamText());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamText() {
    return isSetField(40547);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamTextLen get(quickfix.field.EncodedUnderlyingStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamTextLen getEncodedUnderlyingStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamTextLen() {
    return isSetField(40988);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamText get(quickfix.field.EncodedUnderlyingStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamText getEncodedUnderlyingStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamText() {
    return isSetField(40989);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingProvisionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionGrp get(quickfix.fixlatest.component.UnderlyingProvisionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionGrp getUnderlyingProvisionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisions value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisions get(quickfix.field.NoUnderlyingProvisions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisions getNoUnderlyingProvisions() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisions());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisions field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisions() {
    return isSetField(42149);
  }

public static class NoUnderlyingProvisions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42150, 42151, 42152, 42190, 42153, 42154, 42155, 43002, 43003, 42156, 42157, 42158, 42104, 42105, 42106, 42182, 42107, 42108, 42109, 42110, 42111, 42115, 42184, 42112, 42116, 42117, 42118, 42119, 42120, 42121, 42122, 42123, 42124, 42125, 42126, 42127, 42128, 42129, 42130, 42131, 42132, 42133, 42134, 42186, 42135, 42136, 42137, 42138, 42139, 42140, 42141, 42142, 42143, 42188, 42144, 42145, 42146, 42147, 42148, 42159, 42160, 42161, 42162, 42163, 42164, 42165, 42092, 42180, 42093, 42094, 42095, 42096, 42097, 42098, 42099, 42166, 42167, 42168, 42169, 42102, 42103, 42170, 42171, 42172, 42173, 0};

  public NoUnderlyingProvisions() {
    super(42149, 42150, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionType get(quickfix.field.UnderlyingProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionType getUnderlyingProvisionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionType() {
    return isSetField(42150);
  }

  public void set(quickfix.field.UnderlyingProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateUnadjusted get(quickfix.field.UnderlyingProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateUnadjusted getUnderlyingProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateUnadjusted() {
    return isSetField(42151);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessDayConvention getUnderlyingProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessDayConvention() {
    return isSetField(42152);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp getUnderlyingProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters getNoUnderlyingProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionDateBusinessCenters() {
    return isSetField(42190);
  }

public static class NoUnderlyingProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42191, 0};

  public NoUnderlyingProvisionDateBusinessCenters() {
    super(42190, 42191, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter get(quickfix.field.UnderlyingProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter getUnderlyingProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessCenter() {
    return isSetField(42191);
  }
}

  public void set(quickfix.field.UnderlyingProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateAdjusted get(quickfix.field.UnderlyingProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateAdjusted getUnderlyingProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateAdjusted() {
    return isSetField(42153);
  }

  public void set(quickfix.field.UnderlyingProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateTenorPeriod get(quickfix.field.UnderlyingProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateTenorPeriod getUnderlyingProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateTenorPeriod() {
    return isSetField(42154);
  }

  public void set(quickfix.field.UnderlyingProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateTenorUnit get(quickfix.field.UnderlyingProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateTenorUnit getUnderlyingProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateTenorUnit() {
    return isSetField(42155);
  }

  public void set(quickfix.field.UnderlyingProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionBreakFeeElection get(quickfix.field.UnderlyingProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionBreakFeeElection getUnderlyingProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionBreakFeeElection() {
    return isSetField(43002);
  }

  public void set(quickfix.field.UnderlyingProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionBreakFeeRate get(quickfix.field.UnderlyingProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionBreakFeeRate getUnderlyingProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionBreakFeeRate() {
    return isSetField(43003);
  }

  public void set(quickfix.field.UnderlyingProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCalculationAgent get(quickfix.field.UnderlyingProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCalculationAgent getUnderlyingProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCalculationAgent() {
    return isSetField(42156);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide get(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide getUnderlyingProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionSinglePartyBuyerSide() {
    return isSetField(42157);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide get(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide getUnderlyingProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionSinglePartySellerSide() {
    return isSetField(42158);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates getUnderlyingProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates get(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates getUnderlyingProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate get(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate getUnderlyingProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate getUnderlyingProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStyle get(quickfix.field.UnderlyingProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStyle getUnderlyingProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStyle() {
    return isSetField(42159);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional getUnderlyingProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMultipleNotional() {
    return isSetField(42160);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional getUnderlyingProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMinimumNotional() {
    return isSetField(42161);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional get(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional getUnderlyingProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseMaximumNotional() {
    return isSetField(42162);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionMinimumNumber get(quickfix.field.UnderlyingProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionMinimumNumber getUnderlyingProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionMinimumNumber() {
    return isSetField(42163);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionMaximumNumber get(quickfix.field.UnderlyingProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionMaximumNumber getUnderlyingProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionMaximumNumber() {
    return isSetField(42164);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseConfirmation get(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseConfirmation getUnderlyingProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseConfirmation() {
    return isSetField(42165);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates getUnderlyingProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlMethod get(quickfix.field.UnderlyingProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlMethod getUnderlyingProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlMethod() {
    return isSetField(42166);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency get(quickfix.field.UnderlyingProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency getUnderlyingProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlCurrency() {
    return isSetField(42167);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency2 get(quickfix.field.UnderlyingProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlCurrency2 getUnderlyingProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlCurrency2() {
    return isSetField(42168);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteType get(quickfix.field.UnderlyingProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteType getUnderlyingProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlQuoteType() {
    return isSetField(42169);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource getUnderlyingProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.UnderlyingProvisionText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionText get(quickfix.field.UnderlyingProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionText getUnderlyingProvisionText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionText());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionText() {
    return isSetField(42170);
  }

  public void set(quickfix.field.EncodedUnderlyingProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingProvisionTextLen get(quickfix.field.EncodedUnderlyingProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingProvisionTextLen getEncodedUnderlyingProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingProvisionTextLen() {
    return isSetField(42171);
  }

  public void set(quickfix.field.EncodedUnderlyingProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingProvisionText get(quickfix.field.EncodedUnderlyingProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingProvisionText getEncodedUnderlyingProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingProvisionText() {
    return isSetField(42172);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionParties get(quickfix.fixlatest.component.UnderlyingProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionParties getUnderlyingProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionParties());
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs get(quickfix.field.NoUnderlyingProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs getNoUnderlyingProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartyIDs() {
    return isSetField(42173);
  }

public static class NoUnderlyingProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42174, 42175, 42176, 40918, 42177, 0};

  public NoUnderlyingProvisionPartyIDs() {
    super(42173, 42174, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyID get(quickfix.field.UnderlyingProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyID getUnderlyingProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyID() {
    return isSetField(42174);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource get(quickfix.field.UnderlyingProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource getUnderlyingProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyIDSource() {
    return isSetField(42175);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRole get(quickfix.field.UnderlyingProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRole getUnderlyingProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRole() {
    return isSetField(42176);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier get(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier getUnderlyingProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRoleQualifier() {
    return isSetField(40918);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp get(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp getUnderlyingProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs get(quickfix.field.NoUnderlyingProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs getNoUnderlyingProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartySubIDs() {
    return isSetField(42177);
  }

public static class NoUnderlyingProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42178, 42179, 0};

  public NoUnderlyingProvisionPartySubIDs() {
    super(42177, 42178, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubID get(quickfix.field.UnderlyingProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubID getUnderlyingProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubID() {
    return isSetField(42178);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType get(quickfix.field.UnderlyingProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType getUnderlyingProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubIDType() {
    return isSetField(42179);
  }
}
}
}

  public void set(quickfix.fixlatest.component.UnderlyingAdditionalTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermGrp get(quickfix.fixlatest.component.UnderlyingAdditionalTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermGrp getUnderlyingAdditionalTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAdditionalTermGrp());
  }

  public void set(quickfix.field.NoUnderlyingAdditionalTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAdditionalTerms get(quickfix.field.NoUnderlyingAdditionalTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAdditionalTerms getNoUnderlyingAdditionalTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAdditionalTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAdditionalTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAdditionalTerms() {
    return isSetField(42036);
  }

public static class NoUnderlyingAdditionalTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42037, 42038, 41340, 0};

  public NoUnderlyingAdditionalTerms() {
    super(42036, 42037, ORDER);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator get(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator getUnderlyingAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(42037);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator get(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator getUnderlyingAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(42038);
  }

  public void set(quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp get(quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp getUnderlyingAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoUnderlyingAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAdditionalTermBondRefs get(quickfix.field.NoUnderlyingAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAdditionalTermBondRefs getNoUnderlyingAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAdditionalTermBondRefs() {
    return isSetField(41340);
  }

public static class NoUnderlyingAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41341, 41701, 41709, 41710, 41711, 41712, 42017, 42025, 42026, 42027, 42028, 42029, 42030, 42031, 42032, 42033, 42034, 42035, 0};

  public NoUnderlyingAdditionalTermBondRefs() {
    super(41340, 41341, ORDER);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityID get(quickfix.field.UnderlyingAdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityID getUnderlyingAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSecurityID() {
    return isSetField(41341);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource get(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource getUnderlyingAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSecurityIDSource() {
    return isSetField(41701);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondDesc get(quickfix.field.UnderlyingAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondDesc getUnderlyingAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondDesc() {
    return isSetField(41709);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen get(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen getEncodedUnderlyingAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondDescLen() {
    return isSetField(41710);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDesc get(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDesc getEncodedUnderlyingAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondDesc() {
    return isSetField(41711);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrency get(quickfix.field.UnderlyingAdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrency getUnderlyingAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCurrency() {
    return isSetField(41712);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondIssuer get(quickfix.field.UnderlyingAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondIssuer getUnderlyingAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondIssuer() {
    return isSetField(42017);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen get(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen getEncodedUnderlyingAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondIssuerLen() {
    return isSetField(42025);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer get(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer getEncodedUnderlyingAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondIssuer() {
    return isSetField(42026);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSeniority get(quickfix.field.UnderlyingAdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSeniority getUnderlyingAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSeniority() {
    return isSetField(42027);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponType get(quickfix.field.UnderlyingAdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponType getUnderlyingAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponType() {
    return isSetField(42028);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponRate get(quickfix.field.UnderlyingAdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponRate getUnderlyingAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponRate() {
    return isSetField(42029);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondMaturityDate get(quickfix.field.UnderlyingAdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondMaturityDate getUnderlyingAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondMaturityDate() {
    return isSetField(42030);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondParValue get(quickfix.field.UnderlyingAdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondParValue getUnderlyingAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondParValue() {
    return isSetField(42031);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount getUnderlyingAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(42032);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod get(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod getUnderlyingAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(42033);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit get(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit getUnderlyingAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(42034);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondDayCount get(quickfix.field.UnderlyingAdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondDayCount getUnderlyingAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondDayCount() {
    return isSetField(42035);
  }
}
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermGrp getUnderlyingProtectionTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTerms get(quickfix.field.NoUnderlyingProtectionTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTerms getNoUnderlyingProtectionTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTerms() {
    return isSetField(42068);
  }

public static class NoUnderlyingProtectionTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42069, 42070, 42071, 42072, 42073, 42074, 42075, 42090, 42077, 42087, 42076, 0};

  public NoUnderlyingProtectionTerms() {
    super(42068, 42069, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermNotional get(quickfix.field.UnderlyingProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermNotional getUnderlyingProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermNotional() {
    return isSetField(42069);
  }

  public void set(quickfix.field.UnderlyingProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermCurrency get(quickfix.field.UnderlyingProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermCurrency getUnderlyingProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermCurrency() {
    return isSetField(42070);
  }

  public void set(quickfix.field.UnderlyingProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermSellerNotifies get(quickfix.field.UnderlyingProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermSellerNotifies getUnderlyingProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermSellerNotifies() {
    return isSetField(42071);
  }

  public void set(quickfix.field.UnderlyingProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermBuyerNotifies get(quickfix.field.UnderlyingProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermBuyerNotifies getUnderlyingProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermBuyerNotifies() {
    return isSetField(42072);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventBusinessCenter get(quickfix.field.UnderlyingProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventBusinessCenter getUnderlyingProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventBusinessCenter() {
    return isSetField(42073);
  }

  public void set(quickfix.field.UnderlyingProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermStandardSources get(quickfix.field.UnderlyingProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermStandardSources getUnderlyingProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermStandardSources() {
    return isSetField(42074);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventMinimumSources get(quickfix.field.UnderlyingProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventMinimumSources getUnderlyingProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventMinimumSources() {
    return isSetField(42075);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp getUnderlyingProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources get(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources getNoUnderlyingProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventNewsSources() {
    return isSetField(42090);
  }

public static class NoUnderlyingProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42091, 0};

  public NoUnderlyingProtectionTermEventNewsSources() {
    super(42090, 42091, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource get(quickfix.field.UnderlyingProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource getUnderlyingProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventNewsSource() {
    return isSetField(42091);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp getUnderlyingProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents get(quickfix.field.NoUnderlyingProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents getNoUnderlyingProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEvents() {
    return isSetField(42077);
  }

public static class NoUnderlyingProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42078, 42079, 42080, 42081, 42082, 42083, 42084, 42085, 0};

  public NoUnderlyingProtectionTermEvents() {
    super(42077, 42078, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventType get(quickfix.field.UnderlyingProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventType getUnderlyingProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventType() {
    return isSetField(42078);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventValue get(quickfix.field.UnderlyingProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventValue getUnderlyingProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventValue() {
    return isSetField(42079);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency get(quickfix.field.UnderlyingProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency getUnderlyingProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventCurrency() {
    return isSetField(42080);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod get(quickfix.field.UnderlyingProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod getUnderlyingProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventPeriod() {
    return isSetField(42081);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit get(quickfix.field.UnderlyingProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit getUnderlyingProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventUnit() {
    return isSetField(42082);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType get(quickfix.field.UnderlyingProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType getUnderlyingProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventDayType() {
    return isSetField(42083);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource get(quickfix.field.UnderlyingProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource getUnderlyingProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventRateSource() {
    return isSetField(42084);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp getUnderlyingProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers get(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers getNoUnderlyingProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventQualifiers() {
    return isSetField(42085);
  }

public static class NoUnderlyingProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42086, 0};

  public NoUnderlyingProtectionTermEventQualifiers() {
    super(42085, 42086, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp getUnderlyingProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations get(quickfix.field.NoUnderlyingProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations getNoUnderlyingProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermObligations() {
    return isSetField(42087);
  }

public static class NoUnderlyingProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42088, 42089, 0};

  public NoUnderlyingProtectionTermObligations() {
    super(42087, 42088, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationType get(quickfix.field.UnderlyingProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationType getUnderlyingProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationType() {
    return isSetField(42088);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue get(quickfix.field.UnderlyingProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue getUnderlyingProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationValue() {
    return isSetField(42089);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermXID get(quickfix.field.UnderlyingProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermXID getUnderlyingProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermXID() {
    return isSetField(42076);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlTermGrp get(quickfix.fixlatest.component.UnderlyingCashSettlTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlTermGrp getUnderlyingCashSettlTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlTermGrp());
  }

  public void set(quickfix.field.NoUnderlyingCashSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlTerms get(quickfix.field.NoUnderlyingCashSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlTerms getNoUnderlyingCashSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlTerms() {
    return isSetField(42041);
  }

public static class NoUnderlyingCashSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42042, 42043, 42044, 42045, 42046, 42047, 42048, 42049, 42050, 42051, 42052, 42039, 42797, 42798, 42053, 42054, 42790, 42791, 42788, 42792, 42793, 42794, 42795, 42796, 42055, 42056, 42057, 42058, 42059, 0};

  public NoUnderlyingCashSettlTerms() {
    super(42041, 42042, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlCurrency get(quickfix.field.UnderlyingCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlCurrency getUnderlyingCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlCurrency() {
    return isSetField(42042);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset get(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset getUnderlyingCashSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationFirstBusinessDayOffset() {
    return isSetField(42043);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset getUnderlyingCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(42044);
  }

  public void set(quickfix.field.UnderlyingCashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlNumOfValuationDates get(quickfix.field.UnderlyingCashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlNumOfValuationDates getUnderlyingCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlNumOfValuationDates() {
    return isSetField(42045);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationTime get(quickfix.field.UnderlyingCashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationTime getUnderlyingCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationTime() {
    return isSetField(42046);
  }

  public void set(quickfix.field.UnderlyingCashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlBusinessCenter get(quickfix.field.UnderlyingCashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlBusinessCenter getUnderlyingCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlBusinessCenter() {
    return isSetField(42047);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteMethod get(quickfix.field.UnderlyingCashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteMethod getUnderlyingCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteMethod() {
    return isSetField(42048);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteAmount get(quickfix.field.UnderlyingCashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteAmount getUnderlyingCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteAmount() {
    return isSetField(42049);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteCurrency get(quickfix.field.UnderlyingCashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteCurrency getUnderlyingCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteCurrency() {
    return isSetField(42050);
  }

  public void set(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteAmount get(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteAmount getUnderlyingCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlMinimumQuoteAmount() {
    return isSetField(42051);
  }

  public void set(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency get(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency getUnderlyingCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlMinimumQuoteCurrency() {
    return isSetField(42052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp get(quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp getUnderlyingCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp());
  }

  public void set(quickfix.field.NoUnderlyingCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlDealers get(quickfix.field.NoUnderlyingCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlDealers getNoUnderlyingCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlDealers() {
    return isSetField(42039);
  }

public static class NoUnderlyingCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42040, 0};

  public NoUnderlyingCashSettlDealers() {
    super(42039, 42040, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDealer get(quickfix.field.UnderlyingCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDealer getUnderlyingCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDealer());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDealer() {
    return isSetField(42040);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlPriceSource get(quickfix.field.UnderlyingCashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlPriceSource getUnderlyingCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlPriceSource() {
    return isSetField(42797);
  }

  public void set(quickfix.field.UnderlyingCashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlPriceDefault get(quickfix.field.UnderlyingCashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlPriceDefault getUnderlyingCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlPriceDefault() {
    return isSetField(42798);
  }

  public void set(quickfix.field.UnderlyingCashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlBusinessDays get(quickfix.field.UnderlyingCashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlBusinessDays getUnderlyingCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlBusinessDays() {
    return isSetField(42053);
  }

  public void set(quickfix.field.UnderlyingCashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlAmount get(quickfix.field.UnderlyingCashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlAmount getUnderlyingCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlAmount() {
    return isSetField(42054);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDate get(quickfix.fixlatest.component.UnderlyingCashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDate getUnderlyingCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDate());
  }

  public void set(quickfix.field.UnderlyingCashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlRecoveryFactor get(quickfix.field.UnderlyingCashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlRecoveryFactor getUnderlyingCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlRecoveryFactor() {
    return isSetField(42055);
  }

  public void set(quickfix.field.UnderlyingCashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlFixedTermIndicator get(quickfix.field.UnderlyingCashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlFixedTermIndicator getUnderlyingCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlFixedTermIndicator() {
    return isSetField(42056);
  }

  public void set(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlAccruedInterestIndicator get(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlAccruedInterestIndicator getUnderlyingCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlAccruedInterestIndicator() {
    return isSetField(42057);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationMethod get(quickfix.field.UnderlyingCashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationMethod getUnderlyingCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationMethod() {
    return isSetField(42058);
  }

  public void set(quickfix.field.UnderlyingCashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlTermXID get(quickfix.field.UnderlyingCashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlTermXID getUnderlyingCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlTermXID() {
    return isSetField(42059);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPhysicalSettlTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlTermGrp get(quickfix.fixlatest.component.UnderlyingPhysicalSettlTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlTermGrp getUnderlyingPhysicalSettlTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPhysicalSettlTermGrp());
  }

  public void set(quickfix.field.NoUnderlyingPhysicalSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPhysicalSettlTerms get(quickfix.field.NoUnderlyingPhysicalSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPhysicalSettlTerms getNoUnderlyingPhysicalSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPhysicalSettlTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPhysicalSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPhysicalSettlTerms() {
    return isSetField(42060);
  }

public static class NoUnderlyingPhysicalSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42065, 42061, 42062, 42063, 42064, 0};

  public NoUnderlyingPhysicalSettlTerms() {
    super(42060, 42065, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp getUnderlyingPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp());
  }

  public void set(quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations get(quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations getNoUnderlyingPhysicalSettlDeliverableObligations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPhysicalSettlDeliverableObligations() {
    return isSetField(42065);
  }

public static class NoUnderlyingPhysicalSettlDeliverableObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42066, 42067, 0};

  public NoUnderlyingPhysicalSettlDeliverableObligations() {
    super(42065, 42066, ORDER);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType get(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType getUnderlyingPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlDeliverableObligationType() {
    return isSetField(42066);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue get(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue getUnderlyingPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlDeliverableObligationValue() {
    return isSetField(42067);
  }
}

  public void set(quickfix.field.UnderlyingPhysicalSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlCurrency get(quickfix.field.UnderlyingPhysicalSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlCurrency getUnderlyingPhysicalSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlCurrency() {
    return isSetField(42061);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlBusinessDays get(quickfix.field.UnderlyingPhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlBusinessDays getUnderlyingPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlBusinessDays() {
    return isSetField(42062);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays get(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays getUnderlyingPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlMaximumBusinessDays() {
    return isSetField(42063);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlTermXID get(quickfix.field.UnderlyingPhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlTermXID getUnderlyingPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlTermXID() {
    return isSetField(42064);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingRateSpreadSchedule component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingRateSpreadSchedule get(quickfix.fixlatest.component.UnderlyingRateSpreadSchedule component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingRateSpreadSchedule getUnderlyingRateSpreadScheduleComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingRateSpreadSchedule());
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendPayout component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendPayout get(quickfix.fixlatest.component.UnderlyingDividendPayout component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendPayout getUnderlyingDividendPayoutComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendPayout());
  }

  public void set(quickfix.fixlatest.component.UnderlyingExtraordinaryEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingExtraordinaryEventGrp get(quickfix.fixlatest.component.UnderlyingExtraordinaryEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingExtraordinaryEventGrp getUnderlyingExtraordinaryEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingExtraordinaryEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingExtraordinaryEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingExtraordinaryEvents get(quickfix.field.NoUnderlyingExtraordinaryEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingExtraordinaryEvents getNoUnderlyingExtraordinaryEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingExtraordinaryEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingExtraordinaryEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingExtraordinaryEvents() {
    return isSetField(42884);
  }

public static class NoUnderlyingExtraordinaryEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42885, 42886, 0};

  public NoUnderlyingExtraordinaryEvents() {
    super(42884, 42885, ORDER);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventType get(quickfix.field.UnderlyingExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventType getUnderlyingExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventType() {
    return isSetField(42885);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventValue get(quickfix.field.UnderlyingExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventValue getUnderlyingExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventValue() {
    return isSetField(42886);
  }
}

  public void set(quickfix.field.UnderlyingExtraordinaryEventAdjustmentMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventAdjustmentMethod get(quickfix.field.UnderlyingExtraordinaryEventAdjustmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventAdjustmentMethod getUnderlyingExtraordinaryEventAdjustmentMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventAdjustmentMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventAdjustmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventAdjustmentMethod() {
    return isSetField(2624);
  }

  public void set(quickfix.field.UnderlyingExchangeLookAlike value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExchangeLookAlike get(quickfix.field.UnderlyingExchangeLookAlike value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExchangeLookAlike getUnderlyingExchangeLookAlike() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExchangeLookAlike());
  }

  public boolean isSet(quickfix.field.UnderlyingExchangeLookAlike field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExchangeLookAlike() {
    return isSetField(2625);
  }

  public void set(quickfix.field.UnderlyingAverageVolumeLimitationPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAverageVolumeLimitationPercentage get(quickfix.field.UnderlyingAverageVolumeLimitationPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAverageVolumeLimitationPercentage getUnderlyingAverageVolumeLimitationPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAverageVolumeLimitationPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingAverageVolumeLimitationPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAverageVolumeLimitationPercentage() {
    return isSetField(2626);
  }

  public void set(quickfix.field.UnderlyingAverageVolumeLimitationPeriodDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAverageVolumeLimitationPeriodDays get(quickfix.field.UnderlyingAverageVolumeLimitationPeriodDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAverageVolumeLimitationPeriodDays getUnderlyingAverageVolumeLimitationPeriodDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAverageVolumeLimitationPeriodDays());
  }

  public boolean isSet(quickfix.field.UnderlyingAverageVolumeLimitationPeriodDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAverageVolumeLimitationPeriodDays() {
    return isSetField(2627);
  }

  public void set(quickfix.field.UnderlyingDepositoryReceiptIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDepositoryReceiptIndicator get(quickfix.field.UnderlyingDepositoryReceiptIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDepositoryReceiptIndicator getUnderlyingDepositoryReceiptIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDepositoryReceiptIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingDepositoryReceiptIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDepositoryReceiptIndicator() {
    return isSetField(2628);
  }

  public void set(quickfix.field.UnderlyingOpenUnits value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOpenUnits get(quickfix.field.UnderlyingOpenUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOpenUnits getUnderlyingOpenUnits() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOpenUnits());
  }

  public boolean isSet(quickfix.field.UnderlyingOpenUnits field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOpenUnits() {
    return isSetField(2629);
  }

  public void set(quickfix.field.UnderlyingBasketDivisor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingBasketDivisor get(quickfix.field.UnderlyingBasketDivisor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingBasketDivisor getUnderlyingBasketDivisor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingBasketDivisor());
  }

  public boolean isSet(quickfix.field.UnderlyingBasketDivisor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingBasketDivisor() {
    return isSetField(2630);
  }

  public void set(quickfix.field.UnderlyingInstrumentXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentXID get(quickfix.field.UnderlyingInstrumentXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentXID getUnderlyingInstrumentXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentXID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentXID() {
    return isSetField(2631);
  }
}
