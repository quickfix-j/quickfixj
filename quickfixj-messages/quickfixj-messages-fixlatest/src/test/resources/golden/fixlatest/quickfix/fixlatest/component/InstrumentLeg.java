/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentLeg extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {600, 601, 602, 603, 1788, 607, 1594, 608, 2893, 609, 764, 610, 611, 1212, 2146, 2147, 2148, 248, 2149, 2150, 2151, 2152, 2153, 2154, 2155, 2348, 2067, 2068, 2069, 2739, 2070, 2156, 2157, 2158, 2159, 2160, 2161, 2162, 2163, 2164, 2165, 2880, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 2181, 2182, 2183, 2184, 2604, 2185, 2605, 2186, 2187, 2188, 2189, 613, 614, 1436, 2354, 1440, 2190, 2191, 999, 1224, 1720, 1421, 1422, 1721, 2192, 1001, 1420, 2193, 2194, 2755, 2195, 2196, 2197, 2198, 1528, 2199, 2200, 2201, 2202, 2203, 615, 616, 2205, 2206, 617, 618, 619, 2740, 2717, 2718, 2719, 620, 621, 622, 2207, 2208, 623, 624, 556, 740, 739, 955, 956, 1358, 2682, 2686, 1017, 566, 2209, 2211, 2212, 2213, 2754, 2214, 2215, 2606, 2607, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentLeg() {
    super();
  }

  public void set(quickfix.field.LegSymbol value) {
    setField(value);
  }

  public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound {
    return get(new quickfix.field.LegSymbol());
  }

  public boolean isSet(quickfix.field.LegSymbol field) {
    return isSetField(field);
  }

  public boolean isSetLegSymbol() {
    return isSetField(600);
  }

  public void set(quickfix.field.LegSymbolSfx value) {
    setField(value);
  }

  public quickfix.field.LegSymbolSfx get(quickfix.field.LegSymbolSfx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
    return get(new quickfix.field.LegSymbolSfx());
  }

  public boolean isSet(quickfix.field.LegSymbolSfx field) {
    return isSetField(field);
  }

  public boolean isSetLegSymbolSfx() {
    return isSetField(601);
  }

  public void set(quickfix.field.LegSecurityID value) {
    setField(value);
  }

  public quickfix.field.LegSecurityID get(quickfix.field.LegSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityID());
  }

  public boolean isSet(quickfix.field.LegSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityID() {
    return isSetField(602);
  }

  public void set(quickfix.field.LegSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegSecurityIDSource get(quickfix.field.LegSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityIDSource());
  }

  public boolean isSet(quickfix.field.LegSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityIDSource() {
    return isSetField(603);
  }

  public void set(quickfix.fixlatest.component.LegSecAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSecAltIDGrp get(quickfix.fixlatest.component.LegSecAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSecAltIDGrp getLegSecAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSecAltIDGrp());
  }

  public void set(quickfix.field.NoLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSecurityAltID() {
    return isSetField(604);
  }

public static class NoLegSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {605, 606, 0};

  public NoLegSecurityAltID() {
    super(604, 605, ORDER);
  }

  public void set(quickfix.field.LegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityAltID());
  }

  public boolean isSet(quickfix.field.LegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityAltID() {
    return isSetField(605);
  }

  public void set(quickfix.field.LegSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityAltIDSource() {
    return isSetField(606);
  }
}

  public void set(quickfix.field.LegID value) {
    setField(value);
  }

  public quickfix.field.LegID get(quickfix.field.LegID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegID getLegID() throws FieldNotFound {
    return get(new quickfix.field.LegID());
  }

  public boolean isSet(quickfix.field.LegID field) {
    return isSetField(field);
  }

  public boolean isSetLegID() {
    return isSetField(1788);
  }

  public void set(quickfix.field.LegProduct value) {
    setField(value);
  }

  public quickfix.field.LegProduct get(quickfix.field.LegProduct value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProduct getLegProduct() throws FieldNotFound {
    return get(new quickfix.field.LegProduct());
  }

  public boolean isSet(quickfix.field.LegProduct field) {
    return isSetField(field);
  }

  public boolean isSetLegProduct() {
    return isSetField(607);
  }

  public void set(quickfix.field.LegSecurityGroup value) {
    setField(value);
  }

  public quickfix.field.LegSecurityGroup get(quickfix.field.LegSecurityGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityGroup getLegSecurityGroup() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityGroup());
  }

  public boolean isSet(quickfix.field.LegSecurityGroup field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityGroup() {
    return isSetField(1594);
  }

  public void set(quickfix.field.LegCFICode value) {
    setField(value);
  }

  public quickfix.field.LegCFICode get(quickfix.field.LegCFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCFICode getLegCFICode() throws FieldNotFound {
    return get(new quickfix.field.LegCFICode());
  }

  public boolean isSet(quickfix.field.LegCFICode field) {
    return isSetField(field);
  }

  public boolean isSetLegCFICode() {
    return isSetField(608);
  }

  public void set(quickfix.field.LegUPICode value) {
    setField(value);
  }

  public quickfix.field.LegUPICode get(quickfix.field.LegUPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegUPICode getLegUPICode() throws FieldNotFound {
    return get(new quickfix.field.LegUPICode());
  }

  public boolean isSet(quickfix.field.LegUPICode field) {
    return isSetField(field);
  }

  public boolean isSetLegUPICode() {
    return isSetField(2893);
  }

  public void set(quickfix.field.LegSecurityType value) {
    setField(value);
  }

  public quickfix.field.LegSecurityType get(quickfix.field.LegSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityType());
  }

  public boolean isSet(quickfix.field.LegSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityType() {
    return isSetField(609);
  }

  public void set(quickfix.field.LegSecuritySubType value) {
    setField(value);
  }

  public quickfix.field.LegSecuritySubType get(quickfix.field.LegSecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.LegSecuritySubType());
  }

  public boolean isSet(quickfix.field.LegSecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecuritySubType() {
    return isSetField(764);
  }

  public void set(quickfix.field.LegMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.LegMaturityMonthYear get(quickfix.field.LegMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.LegMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.LegMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetLegMaturityMonthYear() {
    return isSetField(610);
  }

  public void set(quickfix.field.LegMaturityDate value) {
    setField(value);
  }

  public quickfix.field.LegMaturityDate get(quickfix.field.LegMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.LegMaturityDate());
  }

  public boolean isSet(quickfix.field.LegMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetLegMaturityDate() {
    return isSetField(611);
  }

  public void set(quickfix.field.LegMaturityTime value) {
    setField(value);
  }

  public quickfix.field.LegMaturityTime get(quickfix.field.LegMaturityTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMaturityTime getLegMaturityTime() throws FieldNotFound {
    return get(new quickfix.field.LegMaturityTime());
  }

  public boolean isSet(quickfix.field.LegMaturityTime field) {
    return isSetField(field);
  }

  public boolean isSetLegMaturityTime() {
    return isSetField(1212);
  }

  public void set(quickfix.field.LegSettleOnOpenFlag value) {
    setField(value);
  }

  public quickfix.field.LegSettleOnOpenFlag get(quickfix.field.LegSettleOnOpenFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettleOnOpenFlag getLegSettleOnOpenFlag() throws FieldNotFound {
    return get(new quickfix.field.LegSettleOnOpenFlag());
  }

  public boolean isSet(quickfix.field.LegSettleOnOpenFlag field) {
    return isSetField(field);
  }

  public boolean isSetLegSettleOnOpenFlag() {
    return isSetField(2146);
  }

  public void set(quickfix.field.LegInstrmtAssignmentMethod value) {
    setField(value);
  }

  public quickfix.field.LegInstrmtAssignmentMethod get(quickfix.field.LegInstrmtAssignmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrmtAssignmentMethod getLegInstrmtAssignmentMethod() throws FieldNotFound {
    return get(new quickfix.field.LegInstrmtAssignmentMethod());
  }

  public boolean isSet(quickfix.field.LegInstrmtAssignmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrmtAssignmentMethod() {
    return isSetField(2147);
  }

  public void set(quickfix.field.LegSecurityStatus value) {
    setField(value);
  }

  public quickfix.field.LegSecurityStatus get(quickfix.field.LegSecurityStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityStatus getLegSecurityStatus() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityStatus());
  }

  public boolean isSet(quickfix.field.LegSecurityStatus field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityStatus() {
    return isSetField(2148);
  }

  public void set(quickfix.field.LegCouponPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegCouponPaymentDate get(quickfix.field.LegCouponPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegCouponPaymentDate());
  }

  public boolean isSet(quickfix.field.LegCouponPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponPaymentDate() {
    return isSetField(248);
  }

  public void set(quickfix.field.LegRestructuringType value) {
    setField(value);
  }

  public quickfix.field.LegRestructuringType get(quickfix.field.LegRestructuringType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRestructuringType getLegRestructuringType() throws FieldNotFound {
    return get(new quickfix.field.LegRestructuringType());
  }

  public boolean isSet(quickfix.field.LegRestructuringType field) {
    return isSetField(field);
  }

  public boolean isSetLegRestructuringType() {
    return isSetField(2149);
  }

  public void set(quickfix.field.LegSeniority value) {
    setField(value);
  }

  public quickfix.field.LegSeniority get(quickfix.field.LegSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSeniority getLegSeniority() throws FieldNotFound {
    return get(new quickfix.field.LegSeniority());
  }

  public boolean isSet(quickfix.field.LegSeniority field) {
    return isSetField(field);
  }

  public boolean isSetLegSeniority() {
    return isSetField(2150);
  }

  public void set(quickfix.field.LegNotionalPercentageOutstanding value) {
    setField(value);
  }

  public quickfix.field.LegNotionalPercentageOutstanding get(quickfix.field.LegNotionalPercentageOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNotionalPercentageOutstanding getLegNotionalPercentageOutstanding() throws FieldNotFound {
    return get(new quickfix.field.LegNotionalPercentageOutstanding());
  }

  public boolean isSet(quickfix.field.LegNotionalPercentageOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetLegNotionalPercentageOutstanding() {
    return isSetField(2151);
  }

  public void set(quickfix.field.LegOriginalNotionalPercentageOutstanding value) {
    setField(value);
  }

  public quickfix.field.LegOriginalNotionalPercentageOutstanding get(quickfix.field.LegOriginalNotionalPercentageOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOriginalNotionalPercentageOutstanding getLegOriginalNotionalPercentageOutstanding() throws FieldNotFound {
    return get(new quickfix.field.LegOriginalNotionalPercentageOutstanding());
  }

  public boolean isSet(quickfix.field.LegOriginalNotionalPercentageOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetLegOriginalNotionalPercentageOutstanding() {
    return isSetField(2152);
  }

  public void set(quickfix.field.LegAttachmentPoint value) {
    setField(value);
  }

  public quickfix.field.LegAttachmentPoint get(quickfix.field.LegAttachmentPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAttachmentPoint getLegAttachmentPoint() throws FieldNotFound {
    return get(new quickfix.field.LegAttachmentPoint());
  }

  public boolean isSet(quickfix.field.LegAttachmentPoint field) {
    return isSetField(field);
  }

  public boolean isSetLegAttachmentPoint() {
    return isSetField(2153);
  }

  public void set(quickfix.field.LegDetachmentPoint value) {
    setField(value);
  }

  public quickfix.field.LegDetachmentPoint get(quickfix.field.LegDetachmentPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDetachmentPoint getLegDetachmentPoint() throws FieldNotFound {
    return get(new quickfix.field.LegDetachmentPoint());
  }

  public boolean isSet(quickfix.field.LegDetachmentPoint field) {
    return isSetField(field);
  }

  public boolean isSetLegDetachmentPoint() {
    return isSetField(2154);
  }

  public void set(quickfix.field.LegObligationType value) {
    setField(value);
  }

  public quickfix.field.LegObligationType get(quickfix.field.LegObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegObligationType getLegObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegObligationType());
  }

  public boolean isSet(quickfix.field.LegObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegObligationType() {
    return isSetField(2155);
  }

  public void set(quickfix.field.LegAssetGroup value) {
    setField(value);
  }

  public quickfix.field.LegAssetGroup get(quickfix.field.LegAssetGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetGroup getLegAssetGroup() throws FieldNotFound {
    return get(new quickfix.field.LegAssetGroup());
  }

  public boolean isSet(quickfix.field.LegAssetGroup field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetGroup() {
    return isSetField(2348);
  }

  public void set(quickfix.field.LegAssetClass value) {
    setField(value);
  }

  public quickfix.field.LegAssetClass get(quickfix.field.LegAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetClass getLegAssetClass() throws FieldNotFound {
    return get(new quickfix.field.LegAssetClass());
  }

  public boolean isSet(quickfix.field.LegAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetClass() {
    return isSetField(2067);
  }

  public void set(quickfix.field.LegAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.LegAssetSubClass get(quickfix.field.LegAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetSubClass getLegAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.LegAssetSubClass());
  }

  public boolean isSet(quickfix.field.LegAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetSubClass() {
    return isSetField(2068);
  }

  public void set(quickfix.field.LegAssetType value) {
    setField(value);
  }

  public quickfix.field.LegAssetType get(quickfix.field.LegAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetType getLegAssetType() throws FieldNotFound {
    return get(new quickfix.field.LegAssetType());
  }

  public boolean isSet(quickfix.field.LegAssetType field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetType() {
    return isSetField(2069);
  }

  public void set(quickfix.field.LegAssetSubType value) {
    setField(value);
  }

  public quickfix.field.LegAssetSubType get(quickfix.field.LegAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetSubType getLegAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.LegAssetSubType());
  }

  public boolean isSet(quickfix.field.LegAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetSubType() {
    return isSetField(2739);
  }

  public void set(quickfix.fixlatest.component.LegSecondaryAssetGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSecondaryAssetGrp get(quickfix.fixlatest.component.LegSecondaryAssetGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSecondaryAssetGrp getLegSecondaryAssetGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSecondaryAssetGrp());
  }

  public void set(quickfix.field.NoLegSecondaryAssetClasses value) {
    setField(value);
  }

  public quickfix.field.NoLegSecondaryAssetClasses get(quickfix.field.NoLegSecondaryAssetClasses value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSecondaryAssetClasses getNoLegSecondaryAssetClasses() throws FieldNotFound {
    return get(new quickfix.field.NoLegSecondaryAssetClasses());
  }

  public boolean isSet(quickfix.field.NoLegSecondaryAssetClasses field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSecondaryAssetClasses() {
    return isSetField(2076);
  }

public static class NoLegSecondaryAssetClasses extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2077, 2078, 2079, 2743, 0};

  public NoLegSecondaryAssetClasses() {
    super(2076, 2077, ORDER);
  }

  public void set(quickfix.field.LegSecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetClass get(quickfix.field.LegSecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetClass getLegSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetClass() {
    return isSetField(2077);
  }

  public void set(quickfix.field.LegSecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetSubClass get(quickfix.field.LegSecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetSubClass getLegSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetSubClass() {
    return isSetField(2078);
  }

  public void set(quickfix.field.LegSecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetType get(quickfix.field.LegSecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetType getLegSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetType());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetType() {
    return isSetField(2079);
  }

  public void set(quickfix.field.LegSecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetSubType get(quickfix.field.LegSecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetSubType getLegSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetSubType() {
    return isSetField(2743);
  }
}

  public void set(quickfix.fixlatest.component.LegAssetAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegAssetAttributeGrp get(quickfix.fixlatest.component.LegAssetAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegAssetAttributeGrp getLegAssetAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegAssetAttributeGrp());
  }

  public void set(quickfix.field.NoLegAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoLegAssetAttributes get(quickfix.field.NoLegAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAssetAttributes getNoLegAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoLegAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoLegAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAssetAttributes() {
    return isSetField(2308);
  }

public static class NoLegAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2309, 2310, 2311, 0};

  public NoLegAssetAttributes() {
    super(2308, 2309, ORDER);
  }

  public void set(quickfix.field.LegAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeType get(quickfix.field.LegAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeType getLegAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeType());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeType() {
    return isSetField(2309);
  }

  public void set(quickfix.field.LegAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeValue get(quickfix.field.LegAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeValue getLegAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeValue() {
    return isSetField(2310);
  }

  public void set(quickfix.field.LegAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeLimit get(quickfix.field.LegAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeLimit getLegAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeLimit() {
    return isSetField(2311);
  }
}

  public void set(quickfix.field.LegSwapClass value) {
    setField(value);
  }

  public quickfix.field.LegSwapClass get(quickfix.field.LegSwapClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapClass getLegSwapClass() throws FieldNotFound {
    return get(new quickfix.field.LegSwapClass());
  }

  public boolean isSet(quickfix.field.LegSwapClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapClass() {
    return isSetField(2070);
  }

  public void set(quickfix.field.LegSwapSubClass value) {
    setField(value);
  }

  public quickfix.field.LegSwapSubClass get(quickfix.field.LegSwapSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapSubClass getLegSwapSubClass() throws FieldNotFound {
    return get(new quickfix.field.LegSwapSubClass());
  }

  public boolean isSet(quickfix.field.LegSwapSubClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapSubClass() {
    return isSetField(2156);
  }

  public void set(quickfix.field.LegNthToDefault value) {
    setField(value);
  }

  public quickfix.field.LegNthToDefault get(quickfix.field.LegNthToDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNthToDefault getLegNthToDefault() throws FieldNotFound {
    return get(new quickfix.field.LegNthToDefault());
  }

  public boolean isSet(quickfix.field.LegNthToDefault field) {
    return isSetField(field);
  }

  public boolean isSetLegNthToDefault() {
    return isSetField(2157);
  }

  public void set(quickfix.field.LegMthToDefault value) {
    setField(value);
  }

  public quickfix.field.LegMthToDefault get(quickfix.field.LegMthToDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMthToDefault getLegMthToDefault() throws FieldNotFound {
    return get(new quickfix.field.LegMthToDefault());
  }

  public boolean isSet(quickfix.field.LegMthToDefault field) {
    return isSetField(field);
  }

  public boolean isSetLegMthToDefault() {
    return isSetField(2158);
  }

  public void set(quickfix.field.LegSettledEntityMatrixSource value) {
    setField(value);
  }

  public quickfix.field.LegSettledEntityMatrixSource get(quickfix.field.LegSettledEntityMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettledEntityMatrixSource getLegSettledEntityMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.LegSettledEntityMatrixSource());
  }

  public boolean isSet(quickfix.field.LegSettledEntityMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetLegSettledEntityMatrixSource() {
    return isSetField(2159);
  }

  public void set(quickfix.field.LegSettledEntityMatrixPublicationDate value) {
    setField(value);
  }

  public quickfix.field.LegSettledEntityMatrixPublicationDate get(quickfix.field.LegSettledEntityMatrixPublicationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettledEntityMatrixPublicationDate getLegSettledEntityMatrixPublicationDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettledEntityMatrixPublicationDate());
  }

  public boolean isSet(quickfix.field.LegSettledEntityMatrixPublicationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettledEntityMatrixPublicationDate() {
    return isSetField(2160);
  }

  public void set(quickfix.field.LegCouponType value) {
    setField(value);
  }

  public quickfix.field.LegCouponType get(quickfix.field.LegCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponType getLegCouponType() throws FieldNotFound {
    return get(new quickfix.field.LegCouponType());
  }

  public boolean isSet(quickfix.field.LegCouponType field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponType() {
    return isSetField(2161);
  }

  public void set(quickfix.field.LegTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.LegTotalIssuedAmount get(quickfix.field.LegTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTotalIssuedAmount getLegTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.LegTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegTotalIssuedAmount() {
    return isSetField(2162);
  }

  public void set(quickfix.field.LegCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegCouponFrequencyPeriod get(quickfix.field.LegCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponFrequencyPeriod getLegCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponFrequencyPeriod() {
    return isSetField(2163);
  }

  public void set(quickfix.field.LegCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegCouponFrequencyUnit get(quickfix.field.LegCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponFrequencyUnit getLegCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponFrequencyUnit() {
    return isSetField(2164);
  }

  public void set(quickfix.field.LegCouponDayCount value) {
    setField(value);
  }

  public quickfix.field.LegCouponDayCount get(quickfix.field.LegCouponDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponDayCount getLegCouponDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegCouponDayCount());
  }

  public boolean isSet(quickfix.field.LegCouponDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponDayCount() {
    return isSetField(2165);
  }

  public void set(quickfix.field.LegCouponOtherDayCount value) {
    setField(value);
  }

  public quickfix.field.LegCouponOtherDayCount get(quickfix.field.LegCouponOtherDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponOtherDayCount getLegCouponOtherDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegCouponOtherDayCount());
  }

  public boolean isSet(quickfix.field.LegCouponOtherDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponOtherDayCount() {
    return isSetField(2880);
  }

  public void set(quickfix.field.LegConvertibleBondEquityID value) {
    setField(value);
  }

  public quickfix.field.LegConvertibleBondEquityID get(quickfix.field.LegConvertibleBondEquityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegConvertibleBondEquityID getLegConvertibleBondEquityID() throws FieldNotFound {
    return get(new quickfix.field.LegConvertibleBondEquityID());
  }

  public boolean isSet(quickfix.field.LegConvertibleBondEquityID field) {
    return isSetField(field);
  }

  public boolean isSetLegConvertibleBondEquityID() {
    return isSetField(2166);
  }

  public void set(quickfix.field.LegConvertibleBondEquityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegConvertibleBondEquityIDSource get(quickfix.field.LegConvertibleBondEquityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegConvertibleBondEquityIDSource getLegConvertibleBondEquityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegConvertibleBondEquityIDSource());
  }

  public boolean isSet(quickfix.field.LegConvertibleBondEquityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegConvertibleBondEquityIDSource() {
    return isSetField(2167);
  }

  public void set(quickfix.field.LegContractPriceRefMonth value) {
    setField(value);
  }

  public quickfix.field.LegContractPriceRefMonth get(quickfix.field.LegContractPriceRefMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractPriceRefMonth getLegContractPriceRefMonth() throws FieldNotFound {
    return get(new quickfix.field.LegContractPriceRefMonth());
  }

  public boolean isSet(quickfix.field.LegContractPriceRefMonth field) {
    return isSetField(field);
  }

  public boolean isSetLegContractPriceRefMonth() {
    return isSetField(2168);
  }

  public void set(quickfix.field.LegLienSeniority value) {
    setField(value);
  }

  public quickfix.field.LegLienSeniority get(quickfix.field.LegLienSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLienSeniority getLegLienSeniority() throws FieldNotFound {
    return get(new quickfix.field.LegLienSeniority());
  }

  public boolean isSet(quickfix.field.LegLienSeniority field) {
    return isSetField(field);
  }

  public boolean isSetLegLienSeniority() {
    return isSetField(2169);
  }

  public void set(quickfix.field.LegLoanFacility value) {
    setField(value);
  }

  public quickfix.field.LegLoanFacility get(quickfix.field.LegLoanFacility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLoanFacility getLegLoanFacility() throws FieldNotFound {
    return get(new quickfix.field.LegLoanFacility());
  }

  public boolean isSet(quickfix.field.LegLoanFacility field) {
    return isSetField(field);
  }

  public boolean isSetLegLoanFacility() {
    return isSetField(2170);
  }

  public void set(quickfix.field.LegReferenceEntityType value) {
    setField(value);
  }

  public quickfix.field.LegReferenceEntityType get(quickfix.field.LegReferenceEntityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReferenceEntityType getLegReferenceEntityType() throws FieldNotFound {
    return get(new quickfix.field.LegReferenceEntityType());
  }

  public boolean isSet(quickfix.field.LegReferenceEntityType field) {
    return isSetField(field);
  }

  public boolean isSetLegReferenceEntityType() {
    return isSetField(2171);
  }

  public void set(quickfix.field.LegIndexSeries value) {
    setField(value);
  }

  public quickfix.field.LegIndexSeries get(quickfix.field.LegIndexSeries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndexSeries getLegIndexSeries() throws FieldNotFound {
    return get(new quickfix.field.LegIndexSeries());
  }

  public boolean isSet(quickfix.field.LegIndexSeries field) {
    return isSetField(field);
  }

  public boolean isSetLegIndexSeries() {
    return isSetField(2172);
  }

  public void set(quickfix.field.LegIndexAnnexVersion value) {
    setField(value);
  }

  public quickfix.field.LegIndexAnnexVersion get(quickfix.field.LegIndexAnnexVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndexAnnexVersion getLegIndexAnnexVersion() throws FieldNotFound {
    return get(new quickfix.field.LegIndexAnnexVersion());
  }

  public boolean isSet(quickfix.field.LegIndexAnnexVersion field) {
    return isSetField(field);
  }

  public boolean isSetLegIndexAnnexVersion() {
    return isSetField(2173);
  }

  public void set(quickfix.field.LegIndexAnnexDate value) {
    setField(value);
  }

  public quickfix.field.LegIndexAnnexDate get(quickfix.field.LegIndexAnnexDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndexAnnexDate getLegIndexAnnexDate() throws FieldNotFound {
    return get(new quickfix.field.LegIndexAnnexDate());
  }

  public boolean isSet(quickfix.field.LegIndexAnnexDate field) {
    return isSetField(field);
  }

  public boolean isSetLegIndexAnnexDate() {
    return isSetField(2174);
  }

  public void set(quickfix.field.LegIndexAnnexSource value) {
    setField(value);
  }

  public quickfix.field.LegIndexAnnexSource get(quickfix.field.LegIndexAnnexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndexAnnexSource getLegIndexAnnexSource() throws FieldNotFound {
    return get(new quickfix.field.LegIndexAnnexSource());
  }

  public boolean isSet(quickfix.field.LegIndexAnnexSource field) {
    return isSetField(field);
  }

  public boolean isSetLegIndexAnnexSource() {
    return isSetField(2175);
  }

  public void set(quickfix.field.LegSettlRateIndex value) {
    setField(value);
  }

  public quickfix.field.LegSettlRateIndex get(quickfix.field.LegSettlRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRateIndex getLegSettlRateIndex() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRateIndex());
  }

  public boolean isSet(quickfix.field.LegSettlRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRateIndex() {
    return isSetField(2176);
  }

  public void set(quickfix.field.LegSettlRateIndexLocation value) {
    setField(value);
  }

  public quickfix.field.LegSettlRateIndexLocation get(quickfix.field.LegSettlRateIndexLocation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRateIndexLocation getLegSettlRateIndexLocation() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRateIndexLocation());
  }

  public boolean isSet(quickfix.field.LegSettlRateIndexLocation field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRateIndexLocation() {
    return isSetField(2177);
  }

  public void set(quickfix.field.LegOptionExpirationDesc value) {
    setField(value);
  }

  public quickfix.field.LegOptionExpirationDesc get(quickfix.field.LegOptionExpirationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExpirationDesc getLegOptionExpirationDesc() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExpirationDesc());
  }

  public boolean isSet(quickfix.field.LegOptionExpirationDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExpirationDesc() {
    return isSetField(2178);
  }

  public void set(quickfix.field.EncodedLegOptionExpirationDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegOptionExpirationDescLen get(quickfix.field.EncodedLegOptionExpirationDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegOptionExpirationDescLen getEncodedLegOptionExpirationDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegOptionExpirationDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegOptionExpirationDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegOptionExpirationDescLen() {
    return isSetField(2179);
  }

  public void set(quickfix.field.EncodedLegOptionExpirationDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegOptionExpirationDesc get(quickfix.field.EncodedLegOptionExpirationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegOptionExpirationDesc getEncodedLegOptionExpirationDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegOptionExpirationDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegOptionExpirationDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegOptionExpirationDesc() {
    return isSetField(2180);
  }

  public void set(quickfix.field.LegIssueDate value) {
    setField(value);
  }

  public quickfix.field.LegIssueDate get(quickfix.field.LegIssueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
    return get(new quickfix.field.LegIssueDate());
  }

  public boolean isSet(quickfix.field.LegIssueDate field) {
    return isSetField(field);
  }

  public boolean isSetLegIssueDate() {
    return isSetField(249);
  }

  public void set(quickfix.field.LegRepoCollateralSecurityType value) {
    setField(value);
  }

  public quickfix.field.LegRepoCollateralSecurityType get(quickfix.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
    return get(new quickfix.field.LegRepoCollateralSecurityType());
  }

  public boolean isSet(quickfix.field.LegRepoCollateralSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetLegRepoCollateralSecurityType() {
    return isSetField(250);
  }

  public void set(quickfix.field.LegRepurchaseTerm value) {
    setField(value);
  }

  public quickfix.field.LegRepurchaseTerm get(quickfix.field.LegRepurchaseTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
    return get(new quickfix.field.LegRepurchaseTerm());
  }

  public boolean isSet(quickfix.field.LegRepurchaseTerm field) {
    return isSetField(field);
  }

  public boolean isSetLegRepurchaseTerm() {
    return isSetField(251);
  }

  public void set(quickfix.field.LegRepurchaseRate value) {
    setField(value);
  }

  public quickfix.field.LegRepurchaseRate get(quickfix.field.LegRepurchaseRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
    return get(new quickfix.field.LegRepurchaseRate());
  }

  public boolean isSet(quickfix.field.LegRepurchaseRate field) {
    return isSetField(field);
  }

  public boolean isSetLegRepurchaseRate() {
    return isSetField(252);
  }

  public void set(quickfix.field.LegFactor value) {
    setField(value);
  }

  public quickfix.field.LegFactor get(quickfix.field.LegFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFactor getLegFactor() throws FieldNotFound {
    return get(new quickfix.field.LegFactor());
  }

  public boolean isSet(quickfix.field.LegFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegFactor() {
    return isSetField(253);
  }

  public void set(quickfix.field.LegCreditRating value) {
    setField(value);
  }

  public quickfix.field.LegCreditRating get(quickfix.field.LegCreditRating value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
    return get(new quickfix.field.LegCreditRating());
  }

  public boolean isSet(quickfix.field.LegCreditRating field) {
    return isSetField(field);
  }

  public boolean isSetLegCreditRating() {
    return isSetField(257);
  }

  public void set(quickfix.field.LegInstrRegistry value) {
    setField(value);
  }

  public quickfix.field.LegInstrRegistry get(quickfix.field.LegInstrRegistry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
    return get(new quickfix.field.LegInstrRegistry());
  }

  public boolean isSet(quickfix.field.LegInstrRegistry field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrRegistry() {
    return isSetField(599);
  }

  public void set(quickfix.field.LegCountryOfIssue value) {
    setField(value);
  }

  public quickfix.field.LegCountryOfIssue get(quickfix.field.LegCountryOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
    return get(new quickfix.field.LegCountryOfIssue());
  }

  public boolean isSet(quickfix.field.LegCountryOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetLegCountryOfIssue() {
    return isSetField(596);
  }

  public void set(quickfix.field.LegStateOrProvinceOfIssue value) {
    setField(value);
  }

  public quickfix.field.LegStateOrProvinceOfIssue get(quickfix.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
    return get(new quickfix.field.LegStateOrProvinceOfIssue());
  }

  public boolean isSet(quickfix.field.LegStateOrProvinceOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetLegStateOrProvinceOfIssue() {
    return isSetField(597);
  }

  public void set(quickfix.field.LegLocaleOfIssue value) {
    setField(value);
  }

  public quickfix.field.LegLocaleOfIssue get(quickfix.field.LegLocaleOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
    return get(new quickfix.field.LegLocaleOfIssue());
  }

  public boolean isSet(quickfix.field.LegLocaleOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetLegLocaleOfIssue() {
    return isSetField(598);
  }

  public void set(quickfix.field.LegRedemptionDate value) {
    setField(value);
  }

  public quickfix.field.LegRedemptionDate get(quickfix.field.LegRedemptionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
    return get(new quickfix.field.LegRedemptionDate());
  }

  public boolean isSet(quickfix.field.LegRedemptionDate field) {
    return isSetField(field);
  }

  public boolean isSetLegRedemptionDate() {
    return isSetField(254);
  }

  public void set(quickfix.field.LegStrikePrice value) {
    setField(value);
  }

  public quickfix.field.LegStrikePrice get(quickfix.field.LegStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.LegStrikePrice());
  }

  public boolean isSet(quickfix.field.LegStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikePrice() {
    return isSetField(612);
  }

  public void set(quickfix.field.LegStrikeCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStrikeCurrency get(quickfix.field.LegStrikeCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeCurrency());
  }

  public boolean isSet(quickfix.field.LegStrikeCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeCurrency() {
    return isSetField(942);
  }

  public void set(quickfix.field.LegStrikeMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegStrikeMultiplier get(quickfix.field.LegStrikeMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeMultiplier getLegStrikeMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeMultiplier());
  }

  public boolean isSet(quickfix.field.LegStrikeMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeMultiplier() {
    return isSetField(2181);
  }

  public void set(quickfix.field.LegStrikeValue value) {
    setField(value);
  }

  public quickfix.field.LegStrikeValue get(quickfix.field.LegStrikeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeValue getLegStrikeValue() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeValue());
  }

  public boolean isSet(quickfix.field.LegStrikeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeValue() {
    return isSetField(2182);
  }

  public void set(quickfix.field.LegStrikeUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStrikeUnitOfMeasure get(quickfix.field.LegStrikeUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeUnitOfMeasure getLegStrikeUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStrikeUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeUnitOfMeasure() {
    return isSetField(2183);
  }

  public void set(quickfix.field.LegStrikeIndex value) {
    setField(value);
  }

  public quickfix.field.LegStrikeIndex get(quickfix.field.LegStrikeIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeIndex getLegStrikeIndex() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeIndex());
  }

  public boolean isSet(quickfix.field.LegStrikeIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeIndex() {
    return isSetField(2184);
  }

  public void set(quickfix.field.LegStrikeIndexCurvePoint value) {
    setField(value);
  }

  public quickfix.field.LegStrikeIndexCurvePoint get(quickfix.field.LegStrikeIndexCurvePoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeIndexCurvePoint getLegStrikeIndexCurvePoint() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeIndexCurvePoint());
  }

  public boolean isSet(quickfix.field.LegStrikeIndexCurvePoint field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeIndexCurvePoint() {
    return isSetField(2604);
  }

  public void set(quickfix.field.LegStrikeIndexSpread value) {
    setField(value);
  }

  public quickfix.field.LegStrikeIndexSpread get(quickfix.field.LegStrikeIndexSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeIndexSpread getLegStrikeIndexSpread() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeIndexSpread());
  }

  public boolean isSet(quickfix.field.LegStrikeIndexSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeIndexSpread() {
    return isSetField(2185);
  }

  public void set(quickfix.field.LegStrikeIndexQuote value) {
    setField(value);
  }

  public quickfix.field.LegStrikeIndexQuote get(quickfix.field.LegStrikeIndexQuote value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikeIndexQuote getLegStrikeIndexQuote() throws FieldNotFound {
    return get(new quickfix.field.LegStrikeIndexQuote());
  }

  public boolean isSet(quickfix.field.LegStrikeIndexQuote field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikeIndexQuote() {
    return isSetField(2605);
  }

  public void set(quickfix.field.LegStrikePriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegStrikePriceDeterminationMethod get(quickfix.field.LegStrikePriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikePriceDeterminationMethod getLegStrikePriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegStrikePriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegStrikePriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikePriceDeterminationMethod() {
    return isSetField(2186);
  }

  public void set(quickfix.field.LegStrikePriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.LegStrikePriceBoundaryMethod get(quickfix.field.LegStrikePriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikePriceBoundaryMethod getLegStrikePriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.LegStrikePriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.LegStrikePriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikePriceBoundaryMethod() {
    return isSetField(2187);
  }

  public void set(quickfix.field.LegStrikePriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.LegStrikePriceBoundaryPrecision get(quickfix.field.LegStrikePriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrikePriceBoundaryPrecision getLegStrikePriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.LegStrikePriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.LegStrikePriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetLegStrikePriceBoundaryPrecision() {
    return isSetField(2188);
  }

  public void set(quickfix.field.LegUnderlyingPriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegUnderlyingPriceDeterminationMethod get(quickfix.field.LegUnderlyingPriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegUnderlyingPriceDeterminationMethod getLegUnderlyingPriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegUnderlyingPriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegUnderlyingPriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegUnderlyingPriceDeterminationMethod() {
    return isSetField(2189);
  }

  public void set(quickfix.field.LegOptAttribute value) {
    setField(value);
  }

  public quickfix.field.LegOptAttribute get(quickfix.field.LegOptAttribute value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
    return get(new quickfix.field.LegOptAttribute());
  }

  public boolean isSet(quickfix.field.LegOptAttribute field) {
    return isSetField(field);
  }

  public boolean isSetLegOptAttribute() {
    return isSetField(613);
  }

  public void set(quickfix.field.LegContractMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegContractMultiplier get(quickfix.field.LegContractMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegContractMultiplier());
  }

  public boolean isSet(quickfix.field.LegContractMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegContractMultiplier() {
    return isSetField(614);
  }

  public void set(quickfix.field.LegContractMultiplierUnit value) {
    setField(value);
  }

  public quickfix.field.LegContractMultiplierUnit get(quickfix.field.LegContractMultiplierUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractMultiplierUnit getLegContractMultiplierUnit() throws FieldNotFound {
    return get(new quickfix.field.LegContractMultiplierUnit());
  }

  public boolean isSet(quickfix.field.LegContractMultiplierUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegContractMultiplierUnit() {
    return isSetField(1436);
  }

  public void set(quickfix.field.LegTradingUnitPeriodMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegTradingUnitPeriodMultiplier get(quickfix.field.LegTradingUnitPeriodMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTradingUnitPeriodMultiplier getLegTradingUnitPeriodMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegTradingUnitPeriodMultiplier());
  }

  public boolean isSet(quickfix.field.LegTradingUnitPeriodMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegTradingUnitPeriodMultiplier() {
    return isSetField(2354);
  }

  public void set(quickfix.field.LegFlowScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegFlowScheduleType get(quickfix.field.LegFlowScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFlowScheduleType getLegFlowScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegFlowScheduleType());
  }

  public boolean isSet(quickfix.field.LegFlowScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegFlowScheduleType() {
    return isSetField(1440);
  }

  public void set(quickfix.field.LegMinPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.LegMinPriceIncrement get(quickfix.field.LegMinPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMinPriceIncrement getLegMinPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.LegMinPriceIncrement());
  }

  public boolean isSet(quickfix.field.LegMinPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetLegMinPriceIncrement() {
    return isSetField(2190);
  }

  public void set(quickfix.field.LegMinPriceIncrementAmount value) {
    setField(value);
  }

  public quickfix.field.LegMinPriceIncrementAmount get(quickfix.field.LegMinPriceIncrementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMinPriceIncrementAmount getLegMinPriceIncrementAmount() throws FieldNotFound {
    return get(new quickfix.field.LegMinPriceIncrementAmount());
  }

  public boolean isSet(quickfix.field.LegMinPriceIncrementAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegMinPriceIncrementAmount() {
    return isSetField(2191);
  }

  public void set(quickfix.field.LegUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegUnitOfMeasure get(quickfix.field.LegUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegUnitOfMeasure getLegUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegUnitOfMeasure() {
    return isSetField(999);
  }

  public void set(quickfix.field.LegUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.LegUnitOfMeasureQty get(quickfix.field.LegUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegUnitOfMeasureQty getLegUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.LegUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.LegUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetLegUnitOfMeasureQty() {
    return isSetField(1224);
  }

  public void set(quickfix.field.LegUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.LegUnitOfMeasureCurrency get(quickfix.field.LegUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegUnitOfMeasureCurrency getLegUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.LegUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegUnitOfMeasureCurrency() {
    return isSetField(1720);
  }

  public void set(quickfix.field.LegPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPriceUnitOfMeasure get(quickfix.field.LegPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceUnitOfMeasure getLegPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceUnitOfMeasure() {
    return isSetField(1421);
  }

  public void set(quickfix.field.LegPriceUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.LegPriceUnitOfMeasureQty get(quickfix.field.LegPriceUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceUnitOfMeasureQty getLegPriceUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.LegPriceUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.LegPriceUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceUnitOfMeasureQty() {
    return isSetField(1422);
  }

  public void set(quickfix.field.LegPriceUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPriceUnitOfMeasureCurrency get(quickfix.field.LegPriceUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceUnitOfMeasureCurrency getLegPriceUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPriceUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.LegPriceUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceUnitOfMeasureCurrency() {
    return isSetField(1721);
  }

  public void set(quickfix.field.LegSettlMethod value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethod get(quickfix.field.LegSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethod getLegSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethod());
  }

  public boolean isSet(quickfix.field.LegSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethod() {
    return isSetField(2192);
  }

  public void set(quickfix.field.LegTimeUnit value) {
    setField(value);
  }

  public quickfix.field.LegTimeUnit get(quickfix.field.LegTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTimeUnit getLegTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.LegTimeUnit());
  }

  public boolean isSet(quickfix.field.LegTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegTimeUnit() {
    return isSetField(1001);
  }

  public void set(quickfix.field.LegExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.LegExerciseStyle get(quickfix.field.LegExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExerciseStyle getLegExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.LegExerciseStyle());
  }

  public boolean isSet(quickfix.field.LegExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetLegExerciseStyle() {
    return isSetField(1420);
  }

  public void set(quickfix.field.LegOptPayoutType value) {
    setField(value);
  }

  public quickfix.field.LegOptPayoutType get(quickfix.field.LegOptPayoutType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptPayoutType getLegOptPayoutType() throws FieldNotFound {
    return get(new quickfix.field.LegOptPayoutType());
  }

  public boolean isSet(quickfix.field.LegOptPayoutType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptPayoutType() {
    return isSetField(2193);
  }

  public void set(quickfix.field.LegOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.LegOptPayoutAmount get(quickfix.field.LegOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptPayoutAmount getLegOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.LegOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.LegOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegOptPayoutAmount() {
    return isSetField(2194);
  }

  public void set(quickfix.field.LegReturnTrigger value) {
    setField(value);
  }

  public quickfix.field.LegReturnTrigger get(quickfix.field.LegReturnTrigger value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnTrigger getLegReturnTrigger() throws FieldNotFound {
    return get(new quickfix.field.LegReturnTrigger());
  }

  public boolean isSet(quickfix.field.LegReturnTrigger field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnTrigger() {
    return isSetField(2755);
  }

  public void set(quickfix.field.LegPriceQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.LegPriceQuoteMethod get(quickfix.field.LegPriceQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceQuoteMethod getLegPriceQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.LegPriceQuoteMethod());
  }

  public boolean isSet(quickfix.field.LegPriceQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceQuoteMethod() {
    return isSetField(2195);
  }

  public void set(quickfix.field.LegValuationMethod value) {
    setField(value);
  }

  public quickfix.field.LegValuationMethod get(quickfix.field.LegValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegValuationMethod getLegValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegValuationMethod());
  }

  public boolean isSet(quickfix.field.LegValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegValuationMethod() {
    return isSetField(2196);
  }

  public void set(quickfix.field.LegValuationSource value) {
    setField(value);
  }

  public quickfix.field.LegValuationSource get(quickfix.field.LegValuationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegValuationSource getLegValuationSource() throws FieldNotFound {
    return get(new quickfix.field.LegValuationSource());
  }

  public boolean isSet(quickfix.field.LegValuationSource field) {
    return isSetField(field);
  }

  public boolean isSetLegValuationSource() {
    return isSetField(2197);
  }

  public void set(quickfix.field.LegValuationReferenceModel value) {
    setField(value);
  }

  public quickfix.field.LegValuationReferenceModel get(quickfix.field.LegValuationReferenceModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegValuationReferenceModel getLegValuationReferenceModel() throws FieldNotFound {
    return get(new quickfix.field.LegValuationReferenceModel());
  }

  public boolean isSet(quickfix.field.LegValuationReferenceModel field) {
    return isSetField(field);
  }

  public boolean isSetLegValuationReferenceModel() {
    return isSetField(2198);
  }

  public void set(quickfix.field.LegPriceQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPriceQuoteCurrency get(quickfix.field.LegPriceQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPriceQuoteCurrency getLegPriceQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPriceQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegPriceQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPriceQuoteCurrency() {
    return isSetField(1528);
  }

  public void set(quickfix.field.LegListMethod value) {
    setField(value);
  }

  public quickfix.field.LegListMethod get(quickfix.field.LegListMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegListMethod getLegListMethod() throws FieldNotFound {
    return get(new quickfix.field.LegListMethod());
  }

  public boolean isSet(quickfix.field.LegListMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegListMethod() {
    return isSetField(2199);
  }

  public void set(quickfix.field.LegCapPrice value) {
    setField(value);
  }

  public quickfix.field.LegCapPrice get(quickfix.field.LegCapPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCapPrice getLegCapPrice() throws FieldNotFound {
    return get(new quickfix.field.LegCapPrice());
  }

  public boolean isSet(quickfix.field.LegCapPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegCapPrice() {
    return isSetField(2200);
  }

  public void set(quickfix.field.LegFloorPrice value) {
    setField(value);
  }

  public quickfix.field.LegFloorPrice get(quickfix.field.LegFloorPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFloorPrice getLegFloorPrice() throws FieldNotFound {
    return get(new quickfix.field.LegFloorPrice());
  }

  public boolean isSet(quickfix.field.LegFloorPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegFloorPrice() {
    return isSetField(2201);
  }

  public void set(quickfix.field.LegFlexibleIndicator value) {
    setField(value);
  }

  public quickfix.field.LegFlexibleIndicator get(quickfix.field.LegFlexibleIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFlexibleIndicator getLegFlexibleIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegFlexibleIndicator());
  }

  public boolean isSet(quickfix.field.LegFlexibleIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegFlexibleIndicator() {
    return isSetField(2202);
  }

  public void set(quickfix.field.LegFlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.LegFlexProductEligibilityIndicator get(quickfix.field.LegFlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFlexProductEligibilityIndicator getLegFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegFlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.LegFlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegFlexProductEligibilityIndicator() {
    return isSetField(2203);
  }

  public void set(quickfix.field.LegCouponRate value) {
    setField(value);
  }

  public quickfix.field.LegCouponRate get(quickfix.field.LegCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
    return get(new quickfix.field.LegCouponRate());
  }

  public boolean isSet(quickfix.field.LegCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetLegCouponRate() {
    return isSetField(615);
  }

  public void set(quickfix.field.LegSecurityExchange value) {
    setField(value);
  }

  public quickfix.field.LegSecurityExchange get(quickfix.field.LegSecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityExchange());
  }

  public boolean isSet(quickfix.field.LegSecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityExchange() {
    return isSetField(616);
  }

  public void set(quickfix.field.LegPositionLimit value) {
    setField(value);
  }

  public quickfix.field.LegPositionLimit get(quickfix.field.LegPositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionLimit getLegPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.LegPositionLimit());
  }

  public boolean isSet(quickfix.field.LegPositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionLimit() {
    return isSetField(2205);
  }

  public void set(quickfix.field.LegNTPositionLimit value) {
    setField(value);
  }

  public quickfix.field.LegNTPositionLimit get(quickfix.field.LegNTPositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNTPositionLimit getLegNTPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.LegNTPositionLimit());
  }

  public boolean isSet(quickfix.field.LegNTPositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegNTPositionLimit() {
    return isSetField(2206);
  }

  public void set(quickfix.field.LegIssuer value) {
    setField(value);
  }

  public quickfix.field.LegIssuer get(quickfix.field.LegIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIssuer getLegIssuer() throws FieldNotFound {
    return get(new quickfix.field.LegIssuer());
  }

  public boolean isSet(quickfix.field.LegIssuer field) {
    return isSetField(field);
  }

  public boolean isSetLegIssuer() {
    return isSetField(617);
  }

  public void set(quickfix.field.EncodedLegIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegIssuerLen get(quickfix.field.EncodedLegIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedLegIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegIssuerLen() {
    return isSetField(618);
  }

  public void set(quickfix.field.EncodedLegIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedLegIssuer get(quickfix.field.EncodedLegIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegIssuer());
  }

  public boolean isSet(quickfix.field.EncodedLegIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegIssuer() {
    return isSetField(619);
  }

  public void set(quickfix.field.LegFinancialInstrumentShortName value) {
    setField(value);
  }

  public quickfix.field.LegFinancialInstrumentShortName get(quickfix.field.LegFinancialInstrumentShortName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancialInstrumentShortName getLegFinancialInstrumentShortName() throws FieldNotFound {
    return get(new quickfix.field.LegFinancialInstrumentShortName());
  }

  public boolean isSet(quickfix.field.LegFinancialInstrumentShortName field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancialInstrumentShortName() {
    return isSetField(2740);
  }

  public void set(quickfix.field.LegFinancialInstrumentFullName value) {
    setField(value);
  }

  public quickfix.field.LegFinancialInstrumentFullName get(quickfix.field.LegFinancialInstrumentFullName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancialInstrumentFullName getLegFinancialInstrumentFullName() throws FieldNotFound {
    return get(new quickfix.field.LegFinancialInstrumentFullName());
  }

  public boolean isSet(quickfix.field.LegFinancialInstrumentFullName field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancialInstrumentFullName() {
    return isSetField(2717);
  }

  public void set(quickfix.field.EncodedLegFinancialInstrumentFullNameLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegFinancialInstrumentFullNameLen get(quickfix.field.EncodedLegFinancialInstrumentFullNameLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegFinancialInstrumentFullNameLen getEncodedLegFinancialInstrumentFullNameLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegFinancialInstrumentFullNameLen());
  }

  public boolean isSet(quickfix.field.EncodedLegFinancialInstrumentFullNameLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegFinancialInstrumentFullNameLen() {
    return isSetField(2718);
  }

  public void set(quickfix.field.EncodedLegFinancialInstrumentFullName value) {
    setField(value);
  }

  public quickfix.field.EncodedLegFinancialInstrumentFullName get(quickfix.field.EncodedLegFinancialInstrumentFullName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegFinancialInstrumentFullName getEncodedLegFinancialInstrumentFullName() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegFinancialInstrumentFullName());
  }

  public boolean isSet(quickfix.field.EncodedLegFinancialInstrumentFullName field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegFinancialInstrumentFullName() {
    return isSetField(2719);
  }

  public void set(quickfix.field.LegSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.LegSecurityDesc get(quickfix.field.LegSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityDesc());
  }

  public boolean isSet(quickfix.field.LegSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityDesc() {
    return isSetField(620);
  }

  public void set(quickfix.field.EncodedLegSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegSecurityDescLen get(quickfix.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegSecurityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegSecurityDescLen() {
    return isSetField(621);
  }

  public void set(quickfix.field.EncodedLegSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegSecurityDesc get(quickfix.field.EncodedLegSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegSecurityDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegSecurityDesc() {
    return isSetField(622);
  }

  public void set(quickfix.fixlatest.component.LegSecurityXML component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSecurityXML get(quickfix.fixlatest.component.LegSecurityXML component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSecurityXML getLegSecurityXMLComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSecurityXML());
  }

  public void set(quickfix.field.LegCPProgram value) {
    setField(value);
  }

  public quickfix.field.LegCPProgram get(quickfix.field.LegCPProgram value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCPProgram getLegCPProgram() throws FieldNotFound {
    return get(new quickfix.field.LegCPProgram());
  }

  public boolean isSet(quickfix.field.LegCPProgram field) {
    return isSetField(field);
  }

  public boolean isSetLegCPProgram() {
    return isSetField(2207);
  }

  public void set(quickfix.field.LegCPRegType value) {
    setField(value);
  }

  public quickfix.field.LegCPRegType get(quickfix.field.LegCPRegType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCPRegType getLegCPRegType() throws FieldNotFound {
    return get(new quickfix.field.LegCPRegType());
  }

  public boolean isSet(quickfix.field.LegCPRegType field) {
    return isSetField(field);
  }

  public boolean isSetLegCPRegType() {
    return isSetField(2208);
  }

  public void set(quickfix.field.LegRatioQty value) {
    setField(value);
  }

  public quickfix.field.LegRatioQty get(quickfix.field.LegRatioQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
    return get(new quickfix.field.LegRatioQty());
  }

  public boolean isSet(quickfix.field.LegRatioQty field) {
    return isSetField(field);
  }

  public boolean isSetLegRatioQty() {
    return isSetField(623);
  }

  public void set(quickfix.field.LegSide value) {
    setField(value);
  }

  public quickfix.field.LegSide get(quickfix.field.LegSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSide getLegSide() throws FieldNotFound {
    return get(new quickfix.field.LegSide());
  }

  public boolean isSet(quickfix.field.LegSide field) {
    return isSetField(field);
  }

  public boolean isSetLegSide() {
    return isSetField(624);
  }

  public void set(quickfix.field.LegCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCurrency get(quickfix.field.LegCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrency getLegCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCurrency());
  }

  public boolean isSet(quickfix.field.LegCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrency() {
    return isSetField(556);
  }

  public void set(quickfix.field.LegPool value) {
    setField(value);
  }

  public quickfix.field.LegPool get(quickfix.field.LegPool value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPool getLegPool() throws FieldNotFound {
    return get(new quickfix.field.LegPool());
  }

  public boolean isSet(quickfix.field.LegPool field) {
    return isSetField(field);
  }

  public boolean isSetLegPool() {
    return isSetField(740);
  }

  public void set(quickfix.field.LegDatedDate value) {
    setField(value);
  }

  public quickfix.field.LegDatedDate get(quickfix.field.LegDatedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
    return get(new quickfix.field.LegDatedDate());
  }

  public boolean isSet(quickfix.field.LegDatedDate field) {
    return isSetField(field);
  }

  public boolean isSetLegDatedDate() {
    return isSetField(739);
  }

  public void set(quickfix.field.LegContractSettlMonth value) {
    setField(value);
  }

  public quickfix.field.LegContractSettlMonth get(quickfix.field.LegContractSettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
    return get(new quickfix.field.LegContractSettlMonth());
  }

  public boolean isSet(quickfix.field.LegContractSettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetLegContractSettlMonth() {
    return isSetField(955);
  }

  public void set(quickfix.field.LegInterestAccrualDate value) {
    setField(value);
  }

  public quickfix.field.LegInterestAccrualDate get(quickfix.field.LegInterestAccrualDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
    return get(new quickfix.field.LegInterestAccrualDate());
  }

  public boolean isSet(quickfix.field.LegInterestAccrualDate field) {
    return isSetField(field);
  }

  public boolean isSetLegInterestAccrualDate() {
    return isSetField(956);
  }

  public void set(quickfix.field.LegPutOrCall value) {
    setField(value);
  }

  public quickfix.field.LegPutOrCall get(quickfix.field.LegPutOrCall value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPutOrCall getLegPutOrCall() throws FieldNotFound {
    return get(new quickfix.field.LegPutOrCall());
  }

  public boolean isSet(quickfix.field.LegPutOrCall field) {
    return isSetField(field);
  }

  public boolean isSetLegPutOrCall() {
    return isSetField(1358);
  }

  public void set(quickfix.field.LegInTheMoneyCondition value) {
    setField(value);
  }

  public quickfix.field.LegInTheMoneyCondition get(quickfix.field.LegInTheMoneyCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInTheMoneyCondition getLegInTheMoneyCondition() throws FieldNotFound {
    return get(new quickfix.field.LegInTheMoneyCondition());
  }

  public boolean isSet(quickfix.field.LegInTheMoneyCondition field) {
    return isSetField(field);
  }

  public boolean isSetLegInTheMoneyCondition() {
    return isSetField(2682);
  }

  public void set(quickfix.field.LegContraryInstructionEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.LegContraryInstructionEligibilityIndicator get(quickfix.field.LegContraryInstructionEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContraryInstructionEligibilityIndicator getLegContraryInstructionEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegContraryInstructionEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.LegContraryInstructionEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegContraryInstructionEligibilityIndicator() {
    return isSetField(2686);
  }

  public void set(quickfix.field.LegOptionRatio value) {
    setField(value);
  }

  public quickfix.field.LegOptionRatio get(quickfix.field.LegOptionRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionRatio getLegOptionRatio() throws FieldNotFound {
    return get(new quickfix.field.LegOptionRatio());
  }

  public boolean isSet(quickfix.field.LegOptionRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionRatio() {
    return isSetField(1017);
  }

  public void set(quickfix.field.LegPrice value) {
    setField(value);
  }

  public quickfix.field.LegPrice get(quickfix.field.LegPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPrice getLegPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPrice());
  }

  public boolean isSet(quickfix.field.LegPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPrice() {
    return isSetField(566);
  }

  public void set(quickfix.fixlatest.component.LegEvntGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegEvntGrp get(quickfix.fixlatest.component.LegEvntGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegEvntGrp getLegEvntGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegEvntGrp());
  }

  public void set(quickfix.field.NoLegEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegEvents get(quickfix.field.NoLegEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegEvents getNoLegEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegEvents());
  }

  public boolean isSet(quickfix.field.NoLegEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegEvents() {
    return isSetField(2059);
  }

public static class NoLegEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2060, 2061, 2062, 2063, 2064, 2341, 2065, 2066, 2074, 2075, 0};

  public NoLegEvents() {
    super(2059, 2060, ORDER);
  }

  public void set(quickfix.field.LegEventType value) {
    setField(value);
  }

  public quickfix.field.LegEventType get(quickfix.field.LegEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventType getLegEventType() throws FieldNotFound {
    return get(new quickfix.field.LegEventType());
  }

  public boolean isSet(quickfix.field.LegEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegEventType() {
    return isSetField(2060);
  }

  public void set(quickfix.field.LegEventDate value) {
    setField(value);
  }

  public quickfix.field.LegEventDate get(quickfix.field.LegEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventDate getLegEventDate() throws FieldNotFound {
    return get(new quickfix.field.LegEventDate());
  }

  public boolean isSet(quickfix.field.LegEventDate field) {
    return isSetField(field);
  }

  public boolean isSetLegEventDate() {
    return isSetField(2061);
  }

  public void set(quickfix.field.LegEventTime value) {
    setField(value);
  }

  public quickfix.field.LegEventTime get(quickfix.field.LegEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTime getLegEventTime() throws FieldNotFound {
    return get(new quickfix.field.LegEventTime());
  }

  public boolean isSet(quickfix.field.LegEventTime field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTime() {
    return isSetField(2062);
  }

  public void set(quickfix.field.LegEventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.LegEventTimeUnit get(quickfix.field.LegEventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTimeUnit getLegEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.LegEventTimeUnit());
  }

  public boolean isSet(quickfix.field.LegEventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTimeUnit() {
    return isSetField(2063);
  }

  public void set(quickfix.field.LegEventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.LegEventTimePeriod get(quickfix.field.LegEventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTimePeriod getLegEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegEventTimePeriod());
  }

  public boolean isSet(quickfix.field.LegEventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTimePeriod() {
    return isSetField(2064);
  }

  public void set(quickfix.field.LegEventMonthYear value) {
    setField(value);
  }

  public quickfix.field.LegEventMonthYear get(quickfix.field.LegEventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventMonthYear getLegEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.LegEventMonthYear());
  }

  public boolean isSet(quickfix.field.LegEventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetLegEventMonthYear() {
    return isSetField(2341);
  }

  public void set(quickfix.field.LegEventPx value) {
    setField(value);
  }

  public quickfix.field.LegEventPx get(quickfix.field.LegEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventPx getLegEventPx() throws FieldNotFound {
    return get(new quickfix.field.LegEventPx());
  }

  public boolean isSet(quickfix.field.LegEventPx field) {
    return isSetField(field);
  }

  public boolean isSetLegEventPx() {
    return isSetField(2065);
  }

  public void set(quickfix.field.LegEventText value) {
    setField(value);
  }

  public quickfix.field.LegEventText get(quickfix.field.LegEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventText getLegEventText() throws FieldNotFound {
    return get(new quickfix.field.LegEventText());
  }

  public boolean isSet(quickfix.field.LegEventText field) {
    return isSetField(field);
  }

  public boolean isSetLegEventText() {
    return isSetField(2066);
  }

  public void set(quickfix.field.EncodedLegEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegEventTextLen get(quickfix.field.EncodedLegEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegEventTextLen getEncodedLegEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegEventTextLen() {
    return isSetField(2074);
  }

  public void set(quickfix.field.EncodedLegEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegEventText get(quickfix.field.EncodedLegEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegEventText getEncodedLegEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegEventText());
  }

  public boolean isSet(quickfix.field.EncodedLegEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegEventText() {
    return isSetField(2075);
  }
}

  public void set(quickfix.fixlatest.component.LegInstrumentParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegInstrumentParties get(quickfix.fixlatest.component.LegInstrumentParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegInstrumentParties getLegInstrumentPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegInstrumentParties());
  }

  public void set(quickfix.field.NoLegInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoLegInstrumentParties get(quickfix.field.NoLegInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegInstrumentParties getNoLegInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoLegInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoLegInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoLegInstrumentParties() {
    return isSetField(2254);
  }

public static class NoLegInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2255, 2256, 2257, 2379, 2258, 0};

  public NoLegInstrumentParties() {
    super(2254, 2255, ORDER);
  }

  public void set(quickfix.field.LegInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyID get(quickfix.field.LegInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyID getLegInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyID() {
    return isSetField(2255);
  }

  public void set(quickfix.field.LegInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyIDSource get(quickfix.field.LegInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyIDSource getLegInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyIDSource() {
    return isSetField(2256);
  }

  public void set(quickfix.field.LegInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyRole get(quickfix.field.LegInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyRole getLegInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyRole() {
    return isSetField(2257);
  }

  public void set(quickfix.field.LegInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyRoleQualifier get(quickfix.field.LegInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyRoleQualifier getLegInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyRoleQualifier() {
    return isSetField(2379);
  }

  public void set(quickfix.fixlatest.component.LegInstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegInstrumentPtysSubGrp get(quickfix.fixlatest.component.LegInstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegInstrumentPtysSubGrp getLegInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegInstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoLegInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegInstrumentPartySubIDs get(quickfix.field.NoLegInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegInstrumentPartySubIDs getNoLegInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegInstrumentPartySubIDs() {
    return isSetField(2258);
  }

public static class NoLegInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2259, 2260, 0};

  public NoLegInstrumentPartySubIDs() {
    super(2258, 2259, ORDER);
  }

  public void set(quickfix.field.LegInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartySubID get(quickfix.field.LegInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartySubID getLegInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartySubID() {
    return isSetField(2259);
  }

  public void set(quickfix.field.LegInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartySubIDType get(quickfix.field.LegInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartySubIDType getLegInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartySubIDType() {
    return isSetField(2260);
  }
}
}

  public void set(quickfix.field.LegShortSaleRestriction value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleRestriction get(quickfix.field.LegShortSaleRestriction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleRestriction getLegShortSaleRestriction() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleRestriction());
  }

  public boolean isSet(quickfix.field.LegShortSaleRestriction field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleRestriction() {
    return isSetField(2209);
  }

  public void set(quickfix.fixlatest.component.LegComplexEvents component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEvents get(quickfix.fixlatest.component.LegComplexEvents component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEvents getLegComplexEventsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEvents());
  }

  public void set(quickfix.field.NoLegComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEvents get(quickfix.field.NoLegComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEvents getNoLegComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEvents());
  }

  public boolean isSet(quickfix.field.NoLegComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEvents() {
    return isSetField(2218);
  }

public static class NoLegComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2219, 2220, 2221, 2222, 2223, 2224, 2225, 2226, 2227, 2228, 2229, 2230, 2231, 2232, 2250, 2233, 2234, 2235, 2236, 2409, 2410, 2237, 2238, 2239, 2240, 2241, 41382, 41389, 41390, 41391, 41392, 41393, 41394, 41387, 41395, 41396, 41397, 41379, 2242, 2243, 2244, 2245, 2246, 41398, 41366, 2608, 2609, 2610, 2248, 2249, 0};

  public NoLegComplexEvents() {
    super(2218, 2219, ORDER);
  }

  public void set(quickfix.field.LegComplexEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventType get(quickfix.field.LegComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventType getLegComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventType() {
    return isSetField(2219);
  }

  public void set(quickfix.field.LegComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutPaySide get(quickfix.field.LegComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutPaySide getLegComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutPaySide() {
    return isSetField(2220);
  }

  public void set(quickfix.field.LegComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutReceiveSide get(quickfix.field.LegComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutReceiveSide getLegComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutReceiveSide() {
    return isSetField(2221);
  }

  public void set(quickfix.field.LegComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutUnderlier get(quickfix.field.LegComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutUnderlier getLegComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutUnderlier() {
    return isSetField(2222);
  }

  public void set(quickfix.field.LegComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutAmount get(quickfix.field.LegComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutAmount getLegComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutAmount() {
    return isSetField(2223);
  }

  public void set(quickfix.field.LegComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutPercentage get(quickfix.field.LegComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutPercentage getLegComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutPercentage() {
    return isSetField(2224);
  }

  public void set(quickfix.field.LegComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutTime get(quickfix.field.LegComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutTime getLegComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutTime() {
    return isSetField(2225);
  }

  public void set(quickfix.field.LegComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexOptPayoutCurrency get(quickfix.field.LegComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexOptPayoutCurrency getLegComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexOptPayoutCurrency() {
    return isSetField(2226);
  }

  public void set(quickfix.field.LegComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPrice get(quickfix.field.LegComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPrice getLegComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPrice());
  }

  public boolean isSet(quickfix.field.LegComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPrice() {
    return isSetField(2227);
  }

  public void set(quickfix.field.LegComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPricePercentage get(quickfix.field.LegComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPricePercentage getLegComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.LegComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPricePercentage() {
    return isSetField(2228);
  }

  public void set(quickfix.field.LegComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceBoundaryMethod get(quickfix.field.LegComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceBoundaryMethod getLegComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceBoundaryMethod() {
    return isSetField(2229);
  }

  public void set(quickfix.field.LegComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceBoundaryPrecision get(quickfix.field.LegComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceBoundaryPrecision getLegComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceBoundaryPrecision() {
    return isSetField(2230);
  }

  public void set(quickfix.field.LegComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPriceTimeType get(quickfix.field.LegComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPriceTimeType getLegComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPriceTimeType() {
    return isSetField(2231);
  }

  public void set(quickfix.field.LegComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCondition get(quickfix.field.LegComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCondition getLegComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCondition());
  }

  public boolean isSet(quickfix.field.LegComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCondition() {
    return isSetField(2232);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventDates get(quickfix.fixlatest.component.LegComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventDates getLegComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventDates());
  }

  public void set(quickfix.field.NoLegComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventDates get(quickfix.field.NoLegComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventDates getNoLegComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventDates() {
    return isSetField(2250);
  }

public static class NoLegComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2251, 2252, 2253, 0};

  public NoLegComplexEventDates() {
    super(2250, 2251, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartDate get(quickfix.field.LegComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartDate getLegComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartDate() {
    return isSetField(2251);
  }

  public void set(quickfix.field.LegComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndDate get(quickfix.field.LegComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndDate getLegComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndDate() {
    return isSetField(2252);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventTimes get(quickfix.fixlatest.component.LegComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventTimes getLegComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventTimes());
  }

  public void set(quickfix.field.NoLegComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventTimes get(quickfix.field.NoLegComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventTimes getNoLegComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventTimes() {
    return isSetField(2253);
  }

public static class NoLegComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2204, 2247, 0};

  public NoLegComplexEventTimes() {
    super(2253, 2204, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}
}

  public void set(quickfix.field.LegComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCurrencyOne get(quickfix.field.LegComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCurrencyOne getLegComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.LegComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCurrencyOne() {
    return isSetField(2233);
  }

  public void set(quickfix.field.LegComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCurrencyTwo get(quickfix.field.LegComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCurrencyTwo getLegComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.LegComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCurrencyTwo() {
    return isSetField(2234);
  }

  public void set(quickfix.field.LegComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventQuoteBasis get(quickfix.field.LegComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventQuoteBasis getLegComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.LegComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventQuoteBasis() {
    return isSetField(2235);
  }

  public void set(quickfix.field.LegComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFixedFXRate get(quickfix.field.LegComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFixedFXRate getLegComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.LegComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFixedFXRate() {
    return isSetField(2236);
  }

  public void set(quickfix.field.LegComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventSpotRate get(quickfix.field.LegComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventSpotRate getLegComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.LegComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventSpotRate() {
    return isSetField(2409);
  }

  public void set(quickfix.field.LegComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventForwardPoints get(quickfix.field.LegComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventForwardPoints getLegComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.LegComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventForwardPoints() {
    return isSetField(2410);
  }

  public void set(quickfix.field.LegComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDeterminationMethod get(quickfix.field.LegComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDeterminationMethod getLegComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDeterminationMethod() {
    return isSetField(2237);
  }

  public void set(quickfix.field.LegComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCalculationAgent get(quickfix.field.LegComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCalculationAgent getLegComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCalculationAgent() {
    return isSetField(2238);
  }

  public void set(quickfix.field.LegComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikePrice get(quickfix.field.LegComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikePrice getLegComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikePrice() {
    return isSetField(2239);
  }

  public void set(quickfix.field.LegComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikeFactor get(quickfix.field.LegComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikeFactor getLegComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikeFactor() {
    return isSetField(2240);
  }

  public void set(quickfix.field.LegComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStrikeNumberOfOptions get(quickfix.field.LegComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStrikeNumberOfOptions getLegComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.LegComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStrikeNumberOfOptions() {
    return isSetField(2241);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventRateSourceGrp get(quickfix.fixlatest.component.LegComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventRateSourceGrp getLegComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoLegComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventRateSources get(quickfix.field.NoLegComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventRateSources getNoLegComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventRateSources() {
    return isSetField(41382);
  }

public static class NoLegComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41383, 41384, 41385, 41386, 0};

  public NoLegComplexEventRateSources() {
    super(41382, 41383, ORDER);
  }

  public void set(quickfix.field.LegComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSource get(quickfix.field.LegComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSource getLegComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSource() {
    return isSetField(41383);
  }

  public void set(quickfix.field.LegComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSourceType get(quickfix.field.LegComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSourceType getLegComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSourceType() {
    return isSetField(41384);
  }

  public void set(quickfix.field.LegComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventReferencePage get(quickfix.field.LegComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventReferencePage getLegComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.LegComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventReferencePage() {
    return isSetField(41385);
  }

  public void set(quickfix.field.LegComplexEvenReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegComplexEvenReferencePageHeading get(quickfix.field.LegComplexEvenReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEvenReferencePageHeading getLegComplexEvenReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEvenReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegComplexEvenReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEvenReferencePageHeading() {
    return isSetField(41386);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventRelativeDate get(quickfix.fixlatest.component.LegComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventRelativeDate getLegComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodGrp get(quickfix.fixlatest.component.LegComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodGrp getLegComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriods get(quickfix.field.NoLegComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriods getNoLegComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriods() {
    return isSetField(41379);
  }

public static class NoLegComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41380, 41381, 41400, 41376, 41363, 0};

  public NoLegComplexEventPeriods() {
    super(41379, 41380, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodType get(quickfix.field.LegComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodType getLegComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodType() {
    return isSetField(41380);
  }

  public void set(quickfix.field.LegComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventBusinessCenter get(quickfix.field.LegComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventBusinessCenter getLegComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventBusinessCenter() {
    return isSetField(41381);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp get(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp getLegComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoLegComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventSchedules get(quickfix.field.NoLegComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventSchedules getNoLegComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventSchedules() {
    return isSetField(41400);
  }

public static class NoLegComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41401, 41402, 41403, 41404, 41405, 0};

  public NoLegComplexEventSchedules() {
    super(41400, 41401, ORDER);
  }

  public void set(quickfix.field.LegComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleStartDate get(quickfix.field.LegComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleStartDate getLegComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleStartDate() {
    return isSetField(41401);
  }

  public void set(quickfix.field.LegComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleEndDate get(quickfix.field.LegComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleEndDate getLegComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleEndDate() {
    return isSetField(41402);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod get(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod getLegComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyPeriod() {
    return isSetField(41403);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit get(quickfix.field.LegComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit getLegComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyUnit() {
    return isSetField(41404);
  }

  public void set(quickfix.field.LegComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleRollConvention get(quickfix.field.LegComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleRollConvention getLegComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleRollConvention() {
    return isSetField(41405);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp get(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp getLegComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes get(quickfix.field.NoLegComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes getNoLegComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriodDateTimes() {
    return isSetField(41376);
  }

public static class NoLegComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41377, 41378, 0};

  public NoLegComplexEventPeriodDateTimes() {
    super(41376, 41377, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp getLegComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoLegComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventAveragingObservations get(quickfix.field.NoLegComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventAveragingObservations getNoLegComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventAveragingObservations() {
    return isSetField(41363);
  }

public static class NoLegComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41364, 41365, 0};

  public NoLegComplexEventAveragingObservations() {
    super(41363, 41364, ORDER);
  }

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}
}

  public void set(quickfix.field.LegComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventsXIDRef get(quickfix.field.LegComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventsXIDRef getLegComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventsXIDRef() {
    return isSetField(2242);
  }

  public void set(quickfix.field.LegComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventNotifyingParty get(quickfix.field.LegComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventNotifyingParty getLegComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventNotifyingParty() {
    return isSetField(2243);
  }

  public void set(quickfix.field.LegComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventBusinessCenter get(quickfix.field.LegComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventBusinessCenter getLegComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventBusinessCenter() {
    return isSetField(2244);
  }

  public void set(quickfix.field.LegComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventStandardSources get(quickfix.field.LegComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventStandardSources getLegComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventStandardSources() {
    return isSetField(2245);
  }

  public void set(quickfix.field.LegComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventMinimumSources get(quickfix.field.LegComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventMinimumSources getLegComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventMinimumSources() {
    return isSetField(2246);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp getLegComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventSources get(quickfix.field.NoLegComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventSources getNoLegComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventSources() {
    return isSetField(41398);
  }

public static class NoLegComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41399, 0};

  public NoLegComplexEventCreditEventSources() {
    super(41398, 41399, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventSource get(quickfix.field.LegComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventSource getLegComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventSource() {
    return isSetField(41399);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventGrp getLegComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEvents get(quickfix.field.NoLegComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEvents getNoLegComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEvents() {
    return isSetField(41366);
  }

public static class NoLegComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41367, 41368, 41369, 41370, 41371, 41372, 41373, 41374, 0};

  public NoLegComplexEventCreditEvents() {
    super(41366, 41367, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventType get(quickfix.field.LegComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventType getLegComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventType() {
    return isSetField(41367);
  }

  public void set(quickfix.field.LegComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventValue get(quickfix.field.LegComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventValue getLegComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventValue() {
    return isSetField(41368);
  }

  public void set(quickfix.field.LegComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventCurrency get(quickfix.field.LegComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventCurrency getLegComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventCurrency() {
    return isSetField(41369);
  }

  public void set(quickfix.field.LegComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventPeriod get(quickfix.field.LegComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventPeriod getLegComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventPeriod() {
    return isSetField(41370);
  }

  public void set(quickfix.field.LegComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventUnit get(quickfix.field.LegComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventUnit getLegComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventUnit() {
    return isSetField(41371);
  }

  public void set(quickfix.field.LegComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventDayType get(quickfix.field.LegComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventDayType getLegComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventDayType() {
    return isSetField(41372);
  }

  public void set(quickfix.field.LegComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventRateSource get(quickfix.field.LegComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventRateSource getLegComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventRateSource() {
    return isSetField(41373);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp getLegComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers get(quickfix.field.NoLegComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers getNoLegComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventQualifiers() {
    return isSetField(41374);
  }

public static class NoLegComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41375, 0};

  public NoLegComplexEventCreditEventQualifiers() {
    super(41374, 41375, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}
}

  public void set(quickfix.field.LegComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFuturesPriceValuation get(quickfix.field.LegComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFuturesPriceValuation getLegComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.LegComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFuturesPriceValuation() {
    return isSetField(2608);
  }

  public void set(quickfix.field.LegComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventOptionsPriceValuation get(quickfix.field.LegComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventOptionsPriceValuation getLegComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.LegComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventOptionsPriceValuation() {
    return isSetField(2609);
  }

  public void set(quickfix.field.LegComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPVFinalPriceElectionFallback get(quickfix.field.LegComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPVFinalPriceElectionFallback getLegComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.LegComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2610);
  }

  public void set(quickfix.field.LegComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventXID get(quickfix.field.LegComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventXID getLegComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventXID());
  }

  public boolean isSet(quickfix.field.LegComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventXID() {
    return isSetField(2248);
  }

  public void set(quickfix.field.LegComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventXIDRef get(quickfix.field.LegComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventXIDRef getLegComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.LegComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventXIDRef() {
    return isSetField(2249);
  }
}

  public void set(quickfix.field.LegStrategyType value) {
    setField(value);
  }

  public quickfix.field.LegStrategyType get(quickfix.field.LegStrategyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStrategyType getLegStrategyType() throws FieldNotFound {
    return get(new quickfix.field.LegStrategyType());
  }

  public boolean isSet(quickfix.field.LegStrategyType field) {
    return isSetField(field);
  }

  public boolean isSetLegStrategyType() {
    return isSetField(2211);
  }

  public void set(quickfix.field.LegCommonPricingIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCommonPricingIndicator get(quickfix.field.LegCommonPricingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCommonPricingIndicator getLegCommonPricingIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCommonPricingIndicator());
  }

  public boolean isSet(quickfix.field.LegCommonPricingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCommonPricingIndicator() {
    return isSetField(2212);
  }

  public void set(quickfix.field.LegSettlDisruptionProvision value) {
    setField(value);
  }

  public quickfix.field.LegSettlDisruptionProvision get(quickfix.field.LegSettlDisruptionProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDisruptionProvision getLegSettlDisruptionProvision() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDisruptionProvision());
  }

  public boolean isSet(quickfix.field.LegSettlDisruptionProvision field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDisruptionProvision() {
    return isSetField(2213);
  }

  public void set(quickfix.field.LegDeliveryRouteOrCharter value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryRouteOrCharter get(quickfix.field.LegDeliveryRouteOrCharter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryRouteOrCharter getLegDeliveryRouteOrCharter() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryRouteOrCharter());
  }

  public boolean isSet(quickfix.field.LegDeliveryRouteOrCharter field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryRouteOrCharter() {
    return isSetField(2754);
  }

  public void set(quickfix.field.LegInstrumentRoundingDirection value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentRoundingDirection get(quickfix.field.LegInstrumentRoundingDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentRoundingDirection getLegInstrumentRoundingDirection() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentRoundingDirection());
  }

  public boolean isSet(quickfix.field.LegInstrumentRoundingDirection field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentRoundingDirection() {
    return isSetField(2214);
  }

  public void set(quickfix.field.LegInstrumentRoundingPrecision value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentRoundingPrecision get(quickfix.field.LegInstrumentRoundingPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentRoundingPrecision getLegInstrumentRoundingPrecision() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentRoundingPrecision());
  }

  public boolean isSet(quickfix.field.LegInstrumentRoundingPrecision field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentRoundingPrecision() {
    return isSetField(2215);
  }

  public void set(quickfix.fixlatest.component.LegDateAdjustment component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDateAdjustment get(quickfix.fixlatest.component.LegDateAdjustment component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDateAdjustment getLegDateAdjustmentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDateAdjustment());
  }

  public void set(quickfix.fixlatest.component.LegPricingDateTime component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPricingDateTime get(quickfix.fixlatest.component.LegPricingDateTime component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPricingDateTime getLegPricingDateTimeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPricingDateTime());
  }

  public void set(quickfix.fixlatest.component.LegMarketDisruption component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegMarketDisruption get(quickfix.fixlatest.component.LegMarketDisruption component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegMarketDisruption getLegMarketDisruptionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegMarketDisruption());
  }

  public void set(quickfix.fixlatest.component.LegOptionExercise component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExercise get(quickfix.fixlatest.component.LegOptionExercise component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExercise getLegOptionExerciseComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExercise());
  }

  public void set(quickfix.fixlatest.component.LegStreamGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamGrp get(quickfix.fixlatest.component.LegStreamGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamGrp getLegStreamGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamGrp());
  }

  public void set(quickfix.field.NoLegStreams value) {
    setField(value);
  }

  public quickfix.field.NoLegStreams get(quickfix.field.NoLegStreams value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreams getNoLegStreams() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreams());
  }

  public boolean isSet(quickfix.field.NoLegStreams field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreams() {
    return isSetField(40241);
  }

public static class NoLegStreams extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40242, 41700, 40243, 42583, 42584, 40244, 40245, 41702, 40246, 40247, 42585, 42586, 41703, 41704, 41705, 41706, 41707, 41708, 41648, 41649, 41650, 41651, 41674, 41652, 41653, 41654, 42588, 41452, 41655, 41656, 41657, 41658, 41659, 41660, 41661, 41677, 41662, 41663, 41664, 41665, 41666, 41646, 41667, 41668, 41669, 41670, 41671, 41686, 41672, 41673, 40249, 40250, 40942, 40252, 40253, 40254, 40255, 40256, 40257, 40258, 40943, 40260, 40261, 40262, 40263, 40264, 41641, 41642, 40265, 40940, 41638, 40267, 40268, 40941, 40270, 40271, 40272, 40273, 40274, 40275, 40276, 41643, 41644, 41645, 40279, 40280, 40281, 42399, 40282, 40283, 43108, 40284, 40285, 40286, 40287, 40288, 42400, 42401, 42402, 42403, 40289, 40290, 40291, 41549, 41550, 41551, 41552, 41553, 41554, 41555, 40292, 40930, 41589, 40294, 40295, 40296, 40297, 40298, 40299, 40300, 40301, 40302, 41592, 42453, 42454, 42455, 42456, 42457, 42458, 40303, 40304, 40931, 40306, 40307, 40308, 40309, 40310, 40932, 40312, 40313, 40314, 40315, 40316, 40317, 40933, 40319, 40320, 40321, 40322, 40323, 40324, 40325, 42459, 40326, 40327, 40328, 41556, 41557, 40329, 40330, 41558, 41559, 41560, 40331, 40332, 43088, 43089, 40333, 40334, 41563, 41564, 41565, 41566, 41567, 41568, 41569, 41570, 41571, 40335, 40336, 41572, 41573, 41574, 41575, 40337, 40338, 40339, 40340, 40341, 40342, 40343, 40344, 40345, 41576, 41577, 40346, 40347, 40348, 40349, 41578, 41579, 42462, 42463, 42464, 41580, 41581, 42465, 41582, 41583, 41584, 41585, 41586, 41561, 41596, 41593, 40350, 40351, 40352, 40353, 40354, 40355, 40356, 40357, 40358, 42466, 42482, 42483, 42484, 42485, 42451, 42452, 42337, 42338, 42339, 42340, 42366, 42341, 42342, 42343, 42344, 42357, 42358, 42359, 42360, 42361, 42362, 42364, 42363, 42312, 42313, 42314, 42315, 42316, 42317, 42318, 42319, 42320, 42321, 42322, 42323, 42324, 42325, 42326, 42327, 42328, 42329, 42345, 42330, 42331, 42332, 42333, 42334, 42335, 42310, 42336, 42346, 42347, 42348, 42349, 42350, 42351, 42352, 42353, 42354, 42355, 42356, 42467, 42534, 42468, 42469, 42470, 42471, 42472, 42473, 42474, 42475, 42476, 42477, 42478, 42479, 42480, 42481, 42404, 42427, 42428, 42429, 42430, 42431, 42432, 42433, 42434, 42435, 42436, 42437, 42438, 42439, 42440, 42441, 42442, 42443, 42444, 42408, 42419, 42405, 42409, 42410, 42411, 42412, 42413, 42445, 42446, 42447, 42448, 42449, 42450, 42421, 42422, 42423, 42424, 42425, 42426, 42414, 42415, 42416, 42417, 42418, 40359, 40360, 40929, 40362, 40363, 40364, 40365, 40087, 40228, 40367, 40902, 40374, 40418, 41429, 41460, 41430, 41431, 41432, 41433, 42194, 42195, 41434, 41435, 41436, 41437, 41438, 41219, 41456, 41439, 41440, 41441, 41442, 41443, 41444, 41445, 41446, 41447, 41448, 41449, 41450, 41451, 43095, 41408, 40248, 40978, 40979, 0};

  public NoLegStreams() {
    super(40241, 40242, ORDER);
  }

  public void set(quickfix.field.LegStreamType value) {
    setField(value);
  }

  public quickfix.field.LegStreamType get(quickfix.field.LegStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamType getLegStreamType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamType());
  }

  public boolean isSet(quickfix.field.LegStreamType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamType() {
    return isSetField(40242);
  }

  public void set(quickfix.field.LegStreamXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamXID get(quickfix.field.LegStreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamXID getLegStreamXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamXID());
  }

  public boolean isSet(quickfix.field.LegStreamXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamXID() {
    return isSetField(41700);
  }

  public void set(quickfix.field.LegStreamDesc value) {
    setField(value);
  }

  public quickfix.field.LegStreamDesc get(quickfix.field.LegStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamDesc getLegStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.LegStreamDesc());
  }

  public boolean isSet(quickfix.field.LegStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamDesc() {
    return isSetField(40243);
  }

  public void set(quickfix.field.LegStreamVersion value) {
    setField(value);
  }

  public quickfix.field.LegStreamVersion get(quickfix.field.LegStreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamVersion getLegStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.LegStreamVersion());
  }

  public boolean isSet(quickfix.field.LegStreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamVersion() {
    return isSetField(42583);
  }

  public void set(quickfix.field.LegStreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.LegStreamVersionEffectiveDate get(quickfix.field.LegStreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamVersionEffectiveDate getLegStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.LegStreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.LegStreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamVersionEffectiveDate() {
    return isSetField(42584);
  }

  public void set(quickfix.field.LegStreamPaySide value) {
    setField(value);
  }

  public quickfix.field.LegStreamPaySide get(quickfix.field.LegStreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamPaySide getLegStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.LegStreamPaySide());
  }

  public boolean isSet(quickfix.field.LegStreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamPaySide() {
    return isSetField(40244);
  }

  public void set(quickfix.field.LegStreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegStreamReceiveSide get(quickfix.field.LegStreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamReceiveSide getLegStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegStreamReceiveSide());
  }

  public boolean isSet(quickfix.field.LegStreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamReceiveSide() {
    return isSetField(40245);
  }

  public void set(quickfix.field.LegStreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalXIDRef get(quickfix.field.LegStreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalXIDRef getLegStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalXIDRef() {
    return isSetField(41702);
  }

  public void set(quickfix.field.LegStreamNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotional get(quickfix.field.LegStreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotional getLegStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotional());
  }

  public boolean isSet(quickfix.field.LegStreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotional() {
    return isSetField(40246);
  }

  public void set(quickfix.field.LegStreamCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCurrency get(quickfix.field.LegStreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCurrency getLegStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCurrency() {
    return isSetField(40247);
  }

  public void set(quickfix.field.LegStreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalDeterminationMethod get(quickfix.field.LegStreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalDeterminationMethod getLegStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalDeterminationMethod() {
    return isSetField(42585);
  }

  public void set(quickfix.field.LegStreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalAdjustments get(quickfix.field.LegStreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalAdjustments getLegStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalAdjustments() {
    return isSetField(42586);
  }

  public void set(quickfix.field.LegStreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalFrequencyPeriod get(quickfix.field.LegStreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalFrequencyPeriod getLegStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalFrequencyPeriod() {
    return isSetField(41703);
  }

  public void set(quickfix.field.LegStreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalFrequencyUnit get(quickfix.field.LegStreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalFrequencyUnit getLegStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalFrequencyUnit() {
    return isSetField(41704);
  }

  public void set(quickfix.field.LegStreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalCommodityFrequency get(quickfix.field.LegStreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalCommodityFrequency getLegStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalCommodityFrequency() {
    return isSetField(41705);
  }

  public void set(quickfix.field.LegStreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalUnitOfMeasure get(quickfix.field.LegStreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalUnitOfMeasure getLegStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalUnitOfMeasure() {
    return isSetField(41706);
  }

  public void set(quickfix.field.LegStreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamTotalNotional get(quickfix.field.LegStreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTotalNotional getLegStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTotalNotional());
  }

  public boolean isSet(quickfix.field.LegStreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTotalNotional() {
    return isSetField(41707);
  }

  public void set(quickfix.field.LegStreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamTotalNotionalUnitOfMeasure get(quickfix.field.LegStreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTotalNotionalUnitOfMeasure getLegStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTotalNotionalUnitOfMeasure() {
    return isSetField(41708);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommodity get(quickfix.fixlatest.component.LegStreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommodity getLegStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommodity());
  }

  public void set(quickfix.fixlatest.component.LegStreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDate get(quickfix.fixlatest.component.LegStreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDate getLegStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.LegStreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamTerminationDate get(quickfix.fixlatest.component.LegStreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamTerminationDate getLegStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.LegStreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDates get(quickfix.fixlatest.component.LegStreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDates getLegStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStream get(quickfix.fixlatest.component.LegPaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStream getLegPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStream());
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleGrp get(quickfix.fixlatest.component.LegPaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleGrp getLegPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleGrp());
  }

  public void set(quickfix.field.NoLegPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentSchedules get(quickfix.field.NoLegPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentSchedules getNoLegPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoLegPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentSchedules() {
    return isSetField(40374);
  }

public static class NoLegPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40375, 41533, 41534, 40376, 40377, 40378, 40379, 40380, 40381, 40382, 40383, 40384, 40385, 41535, 41536, 41537, 41538, 40386, 40387, 40388, 40389, 41539, 41540, 41541, 41542, 40390, 40391, 40392, 40393, 40394, 40395, 40414, 40396, 40397, 40398, 40399, 40927, 40401, 40402, 40403, 41543, 41544, 40404, 41530, 41545, 41546, 41547, 41548, 40405, 40406, 40407, 40408, 40928, 40410, 40411, 40412, 40413, 0};

  public NoLegPaymentSchedules() {
    super(40374, 40375, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleType get(quickfix.field.LegPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleType getLegPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleType() {
    return isSetField(40375);
  }

  public void set(quickfix.field.LegPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXID get(quickfix.field.LegPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXID getLegPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXID() {
    return isSetField(41533);
  }

  public void set(quickfix.field.LegPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXIDRef get(quickfix.field.LegPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXIDRef getLegPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXIDRef() {
    return isSetField(41534);
  }

  public void set(quickfix.field.LegPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStubType get(quickfix.field.LegPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStubType getLegPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStubType() {
    return isSetField(40376);
  }

  public void set(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted get(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted getLegPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStartDateUnadjusted() {
    return isSetField(40377);
  }

  public void set(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted get(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted getLegPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleEndDateUnadjusted() {
    return isSetField(40378);
  }

  public void set(quickfix.field.LegPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentSchedulePaySide get(quickfix.field.LegPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentSchedulePaySide getLegPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.LegPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentSchedulePaySide() {
    return isSetField(40379);
  }

  public void set(quickfix.field.LegPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReceiveSide get(quickfix.field.LegPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReceiveSide getLegPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReceiveSide() {
    return isSetField(40380);
  }

  public void set(quickfix.field.LegPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleNotional get(quickfix.field.LegPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleNotional getLegPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleNotional() {
    return isSetField(40381);
  }

  public void set(quickfix.field.LegPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleCurrency get(quickfix.field.LegPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleCurrency getLegPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleCurrency() {
    return isSetField(40382);
  }

  public void set(quickfix.field.LegPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRate get(quickfix.field.LegPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRate getLegPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRate() {
    return isSetField(40383);
  }

  public void set(quickfix.field.LegPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier get(quickfix.field.LegPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier getLegPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateMultiplier() {
    return isSetField(40384);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpread get(quickfix.field.LegPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpread getLegPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpread() {
    return isSetField(40385);
  }

  public void set(quickfix.field.LegPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateCurrency get(quickfix.field.LegPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateCurrency getLegPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateCurrency() {
    return isSetField(41535);
  }

  public void set(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure get(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure getLegPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41536);
  }

  public void set(quickfix.field.LegPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor get(quickfix.field.LegPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor getLegPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateConversionFactor() {
    return isSetField(41537);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType get(quickfix.field.LegPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType getLegPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadType() {
    return isSetField(41538);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType get(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType getLegPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadPositionType() {
    return isSetField(40386);
  }

  public void set(quickfix.field.LegPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateTreatment get(quickfix.field.LegPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateTreatment getLegPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateTreatment() {
    return isSetField(40387);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedAmount get(quickfix.field.LegPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedAmount getLegPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedAmount() {
    return isSetField(40388);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency get(quickfix.field.LegPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency getLegPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedCurrency() {
    return isSetField(40389);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice get(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice getLegPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPrice() {
    return isSetField(41539);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency getLegPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41540);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure getLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41541);
  }

  public void set(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure get(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure getLegPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41542);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod get(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod getLegPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40390);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit get(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit getLegPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyUnit() {
    return isSetField(40391);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue get(quickfix.field.LegPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue getLegPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetValue() {
    return isSetField(40392);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRate get(quickfix.field.LegPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRate getLegPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRate() {
    return isSetField(40393);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate get(quickfix.field.LegPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate getLegPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetRate() {
    return isSetField(40394);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo get(quickfix.field.LegPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo getLegPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRelativeTo() {
    return isSetField(40395);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp getLegPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleRateSources get(quickfix.field.NoLegPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleRateSources getNoLegPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleRateSources() {
    return isSetField(40414);
  }

public static class NoLegPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40415, 40416, 40417, 0};

  public NoLegPaymentScheduleRateSources() {
    super(40414, 40415, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted get(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted getLegPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40396);
  }

  public void set(quickfix.field.LegPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleWeight get(quickfix.field.LegPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleWeight getLegPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleWeight() {
    return isSetField(40397);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo get(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo getLegPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40398);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention getLegPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40399);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp getLegPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters getNoLegPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40927);
  }

public static class NoLegPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40400, 0};

  public NoLegPaymentScheduleFixingDateBusinessCenters() {
    super(40927, 40400, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod getLegPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40401);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit getLegPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40402);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType get(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType getLegPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40403);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution get(quickfix.field.LegPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution getLegPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayDistribution() {
    return isSetField(41543);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount get(quickfix.field.LegPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount getLegPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayCount() {
    return isSetField(41544);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted get(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted getLegPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateAdjusted() {
    return isSetField(40404);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp getLegPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays get(quickfix.field.NoLegPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays getNoLegPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDays() {
    return isSetField(41530);
  }

public static class NoLegPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41531, 41532, 0};

  public NoLegPaymentScheduleFixingDays() {
    super(41530, 41531, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod get(quickfix.field.LegPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod getLegPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagPeriod() {
    return isSetField(41545);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit get(quickfix.field.LegPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit getLegPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagUnit() {
    return isSetField(41546);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod getLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41547);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit getLegPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41548);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTime get(quickfix.field.LegPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTime getLegPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTime() {
    return isSetField(40405);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter getLegPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40406);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo getLegPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40407);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention getLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40408);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp getLegPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters getNoLegPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40928);
  }

public static class NoLegPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40409, 0};

  public NoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40928, 40409, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter getLegPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40409);
  }
}

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod getLegPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40410);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit getLegPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40411);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType getLegPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40412);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted getLegPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40413);
  }
}

  public void set(quickfix.fixlatest.component.LegPaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubGrp get(quickfix.fixlatest.component.LegPaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubGrp getLegPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubGrp());
  }

  public void set(quickfix.field.NoLegPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStubs get(quickfix.field.NoLegPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStubs getNoLegPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStubs() {
    return isSetField(40418);
  }

public static class NoLegPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40419, 40420, 42497, 42498, 42504, 42499, 42500, 42501, 42502, 42503, 42488, 42489, 42495, 42490, 42491, 42492, 42493, 42494, 40421, 40422, 40423, 40424, 40425, 40426, 40427, 40428, 40429, 40430, 40431, 40432, 40433, 40434, 40435, 40436, 40437, 40438, 40439, 40440, 40441, 40442, 40443, 40444, 40445, 40446, 40447, 0};

  public NoLegPaymentStubs() {
    super(40418, 40419, ORDER);
  }

  public void set(quickfix.field.LegPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubType get(quickfix.field.LegPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubType getLegPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubType() {
    return isSetField(40419);
  }

  public void set(quickfix.field.LegPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubLength get(quickfix.field.LegPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubLength getLegPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubLength() {
    return isSetField(40420);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate get(quickfix.fixlatest.component.LegPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate getLegPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate get(quickfix.fixlatest.component.LegPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate getLegPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubEndDate());
  }

  public void set(quickfix.field.LegPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubRate get(quickfix.field.LegPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubRate getLegPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubRate() {
    return isSetField(40421);
  }

  public void set(quickfix.field.LegPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedAmount get(quickfix.field.LegPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedAmount getLegPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedAmount() {
    return isSetField(40422);
  }

  public void set(quickfix.field.LegPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedCurrency get(quickfix.field.LegPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedCurrency getLegPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedCurrency() {
    return isSetField(40423);
  }

  public void set(quickfix.field.LegPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex get(quickfix.field.LegPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex getLegPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex() {
    return isSetField(40424);
  }

  public void set(quickfix.field.LegPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexSource get(quickfix.field.LegPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexSource getLegPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexSource() {
    return isSetField(40425);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod get(quickfix.field.LegPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod getLegPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurvePeriod() {
    return isSetField(40426);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit get(quickfix.field.LegPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit getLegPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurveUnit() {
    return isSetField(40427);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier get(quickfix.field.LegPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier getLegPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateMultiplier() {
    return isSetField(40428);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpread get(quickfix.field.LegPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpread getLegPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpread() {
    return isSetField(40429);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType get(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType getLegPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40430);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment get(quickfix.field.LegPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment getLegPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateTreatment() {
    return isSetField(40431);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRate get(quickfix.field.LegPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRate getLegPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRate() {
    return isSetField(40432);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide get(quickfix.field.LegPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide getLegPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateBuySide() {
    return isSetField(40433);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide get(quickfix.field.LegPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide getLegPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateSellSide() {
    return isSetField(40434);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRate get(quickfix.field.LegPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRate getLegPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRate() {
    return isSetField(40435);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide get(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide getLegPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateBuySide() {
    return isSetField(40436);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide get(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide getLegPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateSellSide() {
    return isSetField(40437);
  }

  public void set(quickfix.field.LegPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2 get(quickfix.field.LegPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2 getLegPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2() {
    return isSetField(40438);
  }

  public void set(quickfix.field.LegPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2Source get(quickfix.field.LegPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2Source getLegPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2Source() {
    return isSetField(40439);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod get(quickfix.field.LegPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod getLegPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurvePeriod() {
    return isSetField(40440);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit get(quickfix.field.LegPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit getLegPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurveUnit() {
    return isSetField(40441);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier get(quickfix.field.LegPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier getLegPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateMultiplier() {
    return isSetField(40442);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread get(quickfix.field.LegPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread getLegPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpread() {
    return isSetField(40443);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType get(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType getLegPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40444);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment get(quickfix.field.LegPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment getLegPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateTreatment() {
    return isSetField(40445);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CapRate get(quickfix.field.LegPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CapRate getLegPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CapRate() {
    return isSetField(40446);
  }

  public void set(quickfix.field.LegPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate get(quickfix.field.LegPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate getLegPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2FloorRate() {
    return isSetField(40447);
  }
}

  public void set(quickfix.fixlatest.component.LegDeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryStream get(quickfix.fixlatest.component.LegDeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryStream getLegDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryStream());
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleGrp get(quickfix.fixlatest.component.LegDeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleGrp getLegDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoLegDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliverySchedules get(quickfix.field.NoLegDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliverySchedules getNoLegDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoLegDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliverySchedules() {
    return isSetField(41408);
  }

public static class NoLegDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41409, 41410, 41411, 41412, 41413, 41414, 41415, 41416, 41417, 41418, 41419, 41420, 41421, 41422, 0};

  public NoLegDeliverySchedules() {
    super(41408, 41409, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleType get(quickfix.field.LegDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleType getLegDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleType() {
    return isSetField(41409);
  }

  public void set(quickfix.field.LegDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleXID get(quickfix.field.LegDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleXID getLegDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleXID() {
    return isSetField(41410);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotional get(quickfix.field.LegDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotional getLegDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotional() {
    return isSetField(41411);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure getLegDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41412);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency getLegDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41413);
  }

  public void set(quickfix.field.LegDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance get(quickfix.field.LegDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance getLegDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNegativeTolerance() {
    return isSetField(41414);
  }

  public void set(quickfix.field.LegDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance get(quickfix.field.LegDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance getLegDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliverySchedulePositiveTolerance() {
    return isSetField(41415);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure getLegDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41416);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceType get(quickfix.field.LegDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceType getLegDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceType() {
    return isSetField(41417);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry get(quickfix.field.LegDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry getLegDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlCountry() {
    return isSetField(41418);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone get(quickfix.field.LegDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone getLegDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeZone() {
    return isSetField(41419);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType get(quickfix.field.LegDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType getLegDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlFlowType() {
    return isSetField(41420);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction getLegDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41421);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp getLegDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays get(quickfix.field.NoLegDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays getNoLegDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlDays() {
    return isSetField(41422);
  }

public static class NoLegDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41423, 41424, 41425, 0};

  public NoLegDeliveryScheduleSettlDays() {
    super(41422, 41423, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlDay get(quickfix.field.LegDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlDay getLegDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlDay() {
    return isSetField(41423);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours get(quickfix.field.LegDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours getLegDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTotalHours() {
    return isSetField(41424);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp getLegDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes get(quickfix.field.NoLegDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes getNoLegDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlTimes() {
    return isSetField(41425);
  }

public static class NoLegDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41426, 41427, 41428, 0};

  public NoLegDeliveryScheduleSettlTimes() {
    super(41425, 41426, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlStart get(quickfix.field.LegDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlStart getLegDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlStart() {
    return isSetField(41426);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd get(quickfix.field.LegDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd getLegDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlEnd() {
    return isSetField(41427);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType get(quickfix.field.LegDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType getLegDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeType() {
    return isSetField(41428);
  }
}
}
}

  public void set(quickfix.field.LegStreamText value) {
    setField(value);
  }

  public quickfix.field.LegStreamText get(quickfix.field.LegStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamText getLegStreamText() throws FieldNotFound {
    return get(new quickfix.field.LegStreamText());
  }

  public boolean isSet(quickfix.field.LegStreamText field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamText() {
    return isSetField(40248);
  }

  public void set(quickfix.field.EncodedLegStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamTextLen get(quickfix.field.EncodedLegStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamTextLen getEncodedLegStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamTextLen() {
    return isSetField(40978);
  }

  public void set(quickfix.field.EncodedLegStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamText get(quickfix.field.EncodedLegStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamText getEncodedLegStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamText());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamText() {
    return isSetField(40979);
  }
}

  public void set(quickfix.fixlatest.component.LegProvisionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionGrp get(quickfix.fixlatest.component.LegProvisionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionGrp getLegProvisionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionGrp());
  }

  public void set(quickfix.field.NoLegProvisions value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisions get(quickfix.field.NoLegProvisions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisions getNoLegProvisions() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisions());
  }

  public boolean isSet(quickfix.field.NoLegProvisions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisions() {
    return isSetField(40448);
  }

public static class NoLegProvisions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40449, 40450, 40451, 40939, 40453, 40454, 40455, 42506, 42507, 40456, 40457, 40458, 40524, 40525, 40526, 40935, 40528, 40529, 40530, 40531, 40532, 40476, 40936, 40495, 40478, 40479, 40480, 40481, 40482, 40483, 40484, 40485, 40486, 40487, 40488, 40489, 40490, 40491, 40492, 40493, 40494, 40498, 40499, 40937, 40501, 40502, 40503, 40504, 40505, 40506, 40507, 40508, 40509, 40938, 40511, 40512, 40513, 40514, 40515, 40459, 40460, 40461, 40462, 40463, 40464, 40465, 40516, 40934, 40518, 40519, 40520, 40521, 40522, 40523, 40473, 40466, 40467, 40468, 40469, 40470, 41407, 40472, 40980, 40981, 40533, 0};

  public NoLegProvisions() {
    super(40448, 40449, ORDER);
  }

  public void set(quickfix.field.LegProvisionType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionType get(quickfix.field.LegProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionType getLegProvisionType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionType());
  }

  public boolean isSet(quickfix.field.LegProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionType() {
    return isSetField(40449);
  }

  public void set(quickfix.field.LegProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateUnadjusted get(quickfix.field.LegProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateUnadjusted getLegProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateUnadjusted() {
    return isSetField(40450);
  }

  public void set(quickfix.field.LegProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessDayConvention get(quickfix.field.LegProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessDayConvention getLegProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessDayConvention() {
    return isSetField(40451);
  }

  public void set(quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp getLegProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters get(quickfix.field.NoLegProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionDateBusinessCenters getNoLegProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionDateBusinessCenters() {
    return isSetField(40939);
  }

public static class NoLegProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40452, 0};

  public NoLegProvisionDateBusinessCenters() {
    super(40939, 40452, ORDER);
  }

  public void set(quickfix.field.LegProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateBusinessCenter get(quickfix.field.LegProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateBusinessCenter getLegProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateBusinessCenter() {
    return isSetField(40452);
  }
}

  public void set(quickfix.field.LegProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateAdjusted get(quickfix.field.LegProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateAdjusted getLegProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateAdjusted() {
    return isSetField(40453);
  }

  public void set(quickfix.field.LegProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateTenorPeriod get(quickfix.field.LegProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateTenorPeriod getLegProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateTenorPeriod() {
    return isSetField(40454);
  }

  public void set(quickfix.field.LegProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionDateTenorUnit get(quickfix.field.LegProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionDateTenorUnit getLegProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionDateTenorUnit() {
    return isSetField(40455);
  }

  public void set(quickfix.field.LegProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.LegProvisionBreakFeeElection get(quickfix.field.LegProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionBreakFeeElection getLegProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.LegProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionBreakFeeElection() {
    return isSetField(42506);
  }

  public void set(quickfix.field.LegProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionBreakFeeRate get(quickfix.field.LegProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionBreakFeeRate getLegProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.LegProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionBreakFeeRate() {
    return isSetField(42507);
  }

  public void set(quickfix.field.LegProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCalculationAgent get(quickfix.field.LegProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCalculationAgent getLegProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.LegProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCalculationAgent() {
    return isSetField(40456);
  }

  public void set(quickfix.field.LegProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionSinglePartyBuyerSide get(quickfix.field.LegProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionSinglePartyBuyerSide getLegProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionSinglePartyBuyerSide() {
    return isSetField(40457);
  }

  public void set(quickfix.field.LegProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionSinglePartySellerSide get(quickfix.field.LegProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionSinglePartySellerSide getLegProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionSinglePartySellerSide() {
    return isSetField(40458);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDates get(quickfix.fixlatest.component.LegProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlValueDates getLegProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseDates get(quickfix.fixlatest.component.LegProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseDates getLegProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDate get(quickfix.fixlatest.component.LegProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDate getLegProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate getLegProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStyle get(quickfix.field.LegProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStyle getLegProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStyle() {
    return isSetField(40459);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMultipleNotional get(quickfix.field.LegProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMultipleNotional getLegProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMultipleNotional() {
    return isSetField(40460);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMinimumNotional get(quickfix.field.LegProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMinimumNotional getLegProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMinimumNotional() {
    return isSetField(40461);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseMaximumNotional get(quickfix.field.LegProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseMaximumNotional getLegProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseMaximumNotional() {
    return isSetField(40462);
  }

  public void set(quickfix.field.LegProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionMinimumNumber get(quickfix.field.LegProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionMinimumNumber getLegProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionMinimumNumber() {
    return isSetField(40463);
  }

  public void set(quickfix.field.LegProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionMaximumNumber get(quickfix.field.LegProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionMaximumNumber getLegProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionMaximumNumber() {
    return isSetField(40464);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseConfirmation get(quickfix.field.LegProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseConfirmation getLegProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseConfirmation() {
    return isSetField(40465);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates getLegProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.LegProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlMethod get(quickfix.field.LegProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlMethod getLegProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlMethod() {
    return isSetField(40466);
  }

  public void set(quickfix.field.LegProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlCurrency get(quickfix.field.LegProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlCurrency getLegProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlCurrency() {
    return isSetField(40467);
  }

  public void set(quickfix.field.LegProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlCurrency2 get(quickfix.field.LegProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlCurrency2 getLegProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlCurrency2() {
    return isSetField(40468);
  }

  public void set(quickfix.field.LegProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlQuoteType get(quickfix.field.LegProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlQuoteType getLegProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlQuoteType() {
    return isSetField(40469);
  }

  public void set(quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource getLegProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.LegProvisionText value) {
    setField(value);
  }

  public quickfix.field.LegProvisionText get(quickfix.field.LegProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionText getLegProvisionText() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionText());
  }

  public boolean isSet(quickfix.field.LegProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionText() {
    return isSetField(40472);
  }

  public void set(quickfix.field.EncodedLegProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegProvisionTextLen get(quickfix.field.EncodedLegProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegProvisionTextLen getEncodedLegProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegProvisionTextLen() {
    return isSetField(40980);
  }

  public void set(quickfix.field.EncodedLegProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegProvisionText get(quickfix.field.EncodedLegProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegProvisionText getEncodedLegProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedLegProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegProvisionText() {
    return isSetField(40981);
  }

  public void set(quickfix.fixlatest.component.LegProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionParties get(quickfix.fixlatest.component.LegProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionParties getLegProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionParties());
  }

  public void set(quickfix.field.NoLegProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartyIDs get(quickfix.field.NoLegProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartyIDs getNoLegProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartyIDs() {
    return isSetField(40533);
  }

public static class NoLegProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40534, 40535, 40536, 2380, 40537, 0};

  public NoLegProvisionPartyIDs() {
    super(40533, 40534, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyID get(quickfix.field.LegProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyID getLegProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyID() {
    return isSetField(40534);
  }

  public void set(quickfix.field.LegProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyIDSource get(quickfix.field.LegProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyIDSource getLegProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyIDSource() {
    return isSetField(40535);
  }

  public void set(quickfix.field.LegProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRole get(quickfix.field.LegProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRole getLegProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRole() {
    return isSetField(40536);
  }

  public void set(quickfix.field.LegProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRoleQualifier get(quickfix.field.LegProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRoleQualifier getLegProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRoleQualifier() {
    return isSetField(2380);
  }

  public void set(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp get(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp getLegProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoLegProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartySubIDs get(quickfix.field.NoLegProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartySubIDs getNoLegProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartySubIDs() {
    return isSetField(40537);
  }

public static class NoLegProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40538, 40539, 0};

  public NoLegProvisionPartySubIDs() {
    super(40537, 40538, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}
}
}

  public void set(quickfix.fixlatest.component.LegAdditionalTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegAdditionalTermGrp get(quickfix.fixlatest.component.LegAdditionalTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegAdditionalTermGrp getLegAdditionalTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegAdditionalTermGrp());
  }

  public void set(quickfix.field.NoLegAdditionalTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegAdditionalTerms get(quickfix.field.NoLegAdditionalTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAdditionalTerms getNoLegAdditionalTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegAdditionalTerms());
  }

  public boolean isSet(quickfix.field.NoLegAdditionalTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAdditionalTerms() {
    return isSetField(41335);
  }

public static class NoLegAdditionalTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41336, 41337, 41316, 0};

  public NoLegAdditionalTerms() {
    super(41335, 41336, ORDER);
  }

  public void set(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator get(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator getLegAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(41336);
  }

  public void set(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator get(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator getLegAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(41337);
  }

  public void set(quickfix.fixlatest.component.LegAdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegAdditionalTermBondRefGrp get(quickfix.fixlatest.component.LegAdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegAdditionalTermBondRefGrp getLegAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegAdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoLegAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoLegAdditionalTermBondRefs get(quickfix.field.NoLegAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAdditionalTermBondRefs getNoLegAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoLegAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAdditionalTermBondRefs() {
    return isSetField(41316);
  }

public static class NoLegAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41317, 41318, 41319, 41320, 41321, 41322, 41323, 41324, 41325, 41326, 41327, 41328, 41329, 41330, 41331, 41332, 41333, 41334, 0};

  public NoLegAdditionalTermBondRefs() {
    super(41316, 41317, ORDER);
  }

  public void set(quickfix.field.LegAdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSecurityID get(quickfix.field.LegAdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSecurityID getLegAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSecurityID() {
    return isSetField(41317);
  }

  public void set(quickfix.field.LegAdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSecurityIDSource get(quickfix.field.LegAdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSecurityIDSource getLegAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSecurityIDSource() {
    return isSetField(41318);
  }

  public void set(quickfix.field.LegAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondDesc get(quickfix.field.LegAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondDesc getLegAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondDesc() {
    return isSetField(41319);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondDescLen get(quickfix.field.EncodedLegAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondDescLen getEncodedLegAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondDescLen() {
    return isSetField(41320);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondDesc get(quickfix.field.EncodedLegAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondDesc getEncodedLegAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondDesc() {
    return isSetField(41321);
  }

  public void set(quickfix.field.LegAdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCurrency get(quickfix.field.LegAdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCurrency getLegAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCurrency() {
    return isSetField(41322);
  }

  public void set(quickfix.field.LegAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondIssuer get(quickfix.field.LegAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondIssuer getLegAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondIssuer() {
    return isSetField(41323);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuerLen get(quickfix.field.EncodedLegAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuerLen getEncodedLegAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondIssuerLen() {
    return isSetField(41324);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuer get(quickfix.field.EncodedLegAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuer getEncodedLegAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondIssuer() {
    return isSetField(41325);
  }

  public void set(quickfix.field.LegAdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSeniority get(quickfix.field.LegAdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSeniority getLegAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSeniority() {
    return isSetField(41326);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponType get(quickfix.field.LegAdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponType getLegAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponType() {
    return isSetField(41327);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponRate get(quickfix.field.LegAdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponRate getLegAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponRate() {
    return isSetField(41328);
  }

  public void set(quickfix.field.LegAdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondMaturityDate get(quickfix.field.LegAdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondMaturityDate getLegAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondMaturityDate() {
    return isSetField(41329);
  }

  public void set(quickfix.field.LegAdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondParValue get(quickfix.field.LegAdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondParValue getLegAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondParValue() {
    return isSetField(41330);
  }

  public void set(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount getLegAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(41331);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod get(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod getLegAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(41332);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyUnit get(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyUnit getLegAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(41333);
  }

  public void set(quickfix.field.LegAdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondDayCount get(quickfix.field.LegAdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondDayCount getLegAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondDayCount() {
    return isSetField(41334);
  }
}
}

  public void set(quickfix.fixlatest.component.LegProtectionTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermGrp get(quickfix.fixlatest.component.LegProtectionTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermGrp getLegProtectionTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermGrp());
  }

  public void set(quickfix.field.NoLegProtectionTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTerms get(quickfix.field.NoLegProtectionTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTerms getNoLegProtectionTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTerms());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTerms() {
    return isSetField(41616);
  }

public static class NoLegProtectionTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41618, 41619, 41620, 41621, 41622, 41623, 41624, 41614, 41625, 41635, 41617, 0};

  public NoLegProtectionTerms() {
    super(41616, 41618, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermNotional get(quickfix.field.LegProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermNotional getLegProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.LegProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermNotional() {
    return isSetField(41618);
  }

  public void set(quickfix.field.LegProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermCurrency get(quickfix.field.LegProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermCurrency getLegProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermCurrency() {
    return isSetField(41619);
  }

  public void set(quickfix.field.LegProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermSellerNotifies get(quickfix.field.LegProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermSellerNotifies getLegProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.LegProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermSellerNotifies() {
    return isSetField(41620);
  }

  public void set(quickfix.field.LegProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermBuyerNotifies get(quickfix.field.LegProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermBuyerNotifies getLegProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.LegProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermBuyerNotifies() {
    return isSetField(41621);
  }

  public void set(quickfix.field.LegProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventBusinessCenter get(quickfix.field.LegProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventBusinessCenter getLegProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventBusinessCenter() {
    return isSetField(41622);
  }

  public void set(quickfix.field.LegProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermStandardSources get(quickfix.field.LegProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermStandardSources getLegProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.LegProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermStandardSources() {
    return isSetField(41623);
  }

  public void set(quickfix.field.LegProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventMinimumSources get(quickfix.field.LegProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventMinimumSources getLegProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventMinimumSources() {
    return isSetField(41624);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp getLegProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources get(quickfix.field.NoLegProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources getNoLegProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventNewsSources() {
    return isSetField(41614);
  }

public static class NoLegProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41615, 0};

  public NoLegProtectionTermEventNewsSources() {
    super(41614, 41615, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventNewsSource get(quickfix.field.LegProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventNewsSource getLegProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventNewsSource() {
    return isSetField(41615);
  }
}

  public void set(quickfix.fixlatest.component.LegProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventGrp get(quickfix.fixlatest.component.LegProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventGrp getLegProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEvents get(quickfix.field.NoLegProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEvents getNoLegProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEvents() {
    return isSetField(41625);
  }

public static class NoLegProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41626, 41627, 41628, 41629, 41630, 41631, 41632, 41633, 0};

  public NoLegProtectionTermEvents() {
    super(41625, 41626, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventType get(quickfix.field.LegProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventType getLegProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventType() {
    return isSetField(41626);
  }

  public void set(quickfix.field.LegProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventValue get(quickfix.field.LegProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventValue getLegProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventValue() {
    return isSetField(41627);
  }

  public void set(quickfix.field.LegProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventCurrency get(quickfix.field.LegProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventCurrency getLegProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventCurrency() {
    return isSetField(41628);
  }

  public void set(quickfix.field.LegProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventPeriod get(quickfix.field.LegProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventPeriod getLegProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventPeriod() {
    return isSetField(41629);
  }

  public void set(quickfix.field.LegProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventUnit get(quickfix.field.LegProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventUnit getLegProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventUnit() {
    return isSetField(41630);
  }

  public void set(quickfix.field.LegProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventDayType get(quickfix.field.LegProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventDayType getLegProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventDayType() {
    return isSetField(41631);
  }

  public void set(quickfix.field.LegProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventRateSource get(quickfix.field.LegProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventRateSource getLegProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventRateSource() {
    return isSetField(41632);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp getLegProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers get(quickfix.field.NoLegProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers getNoLegProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventQualifiers() {
    return isSetField(41633);
  }

public static class NoLegProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41634, 0};

  public NoLegProtectionTermEventQualifiers() {
    super(41633, 41634, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}
}

  public void set(quickfix.fixlatest.component.LegProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermObligationGrp get(quickfix.fixlatest.component.LegProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermObligationGrp getLegProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermObligations get(quickfix.field.NoLegProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermObligations getNoLegProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermObligations() {
    return isSetField(41635);
  }

public static class NoLegProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41636, 41637, 0};

  public NoLegProtectionTermObligations() {
    super(41635, 41636, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationType get(quickfix.field.LegProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationType getLegProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationType() {
    return isSetField(41636);
  }

  public void set(quickfix.field.LegProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationValue get(quickfix.field.LegProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationValue getLegProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationValue() {
    return isSetField(41637);
  }
}

  public void set(quickfix.field.LegProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermXID get(quickfix.field.LegProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermXID getLegProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermXID());
  }

  public boolean isSet(quickfix.field.LegProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermXID() {
    return isSetField(41617);
  }
}

  public void set(quickfix.fixlatest.component.LegCashSettlTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlTermGrp get(quickfix.fixlatest.component.LegCashSettlTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlTermGrp getLegCashSettlTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlTermGrp());
  }

  public void set(quickfix.field.NoLegCashSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlTerms get(quickfix.field.NoLegCashSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlTerms getNoLegCashSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlTerms());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlTerms() {
    return isSetField(41344);
  }

public static class NoLegCashSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41345, 41346, 41347, 41348, 41349, 41350, 41351, 41352, 41353, 41354, 41355, 41342, 42308, 42309, 41356, 41357, 42299, 42300, 42306, 42301, 42302, 42303, 42304, 42305, 41358, 41359, 41360, 41361, 41362, 0};

  public NoLegCashSettlTerms() {
    super(41344, 41345, ORDER);
  }

  public void set(quickfix.field.LegCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlCurrency get(quickfix.field.LegCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlCurrency getLegCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlCurrency() {
    return isSetField(41345);
  }

  public void set(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.LegCasSettlValuationFirstBusinessDayOffset get(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCasSettlValuationFirstBusinessDayOffset getLegCasSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.LegCasSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetLegCasSettlValuationFirstBusinessDayOffset() {
    return isSetField(41346);
  }

  public void set(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset getLegCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(41347);
  }

  public void set(quickfix.field.LegCashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlNumOfValuationDates get(quickfix.field.LegCashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlNumOfValuationDates getLegCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.LegCashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlNumOfValuationDates() {
    return isSetField(41348);
  }

  public void set(quickfix.field.LegCashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationTime get(quickfix.field.LegCashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationTime getLegCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationTime() {
    return isSetField(41349);
  }

  public void set(quickfix.field.LegCashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlBusinessCenter get(quickfix.field.LegCashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlBusinessCenter getLegCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegCashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlBusinessCenter() {
    return isSetField(41350);
  }

  public void set(quickfix.field.LegCashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteMethod get(quickfix.field.LegCashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteMethod getLegCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteMethod() {
    return isSetField(41351);
  }

  public void set(quickfix.field.LegCashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteAmount get(quickfix.field.LegCashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteAmount getLegCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteAmount() {
    return isSetField(41352);
  }

  public void set(quickfix.field.LegCashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteCurrency get(quickfix.field.LegCashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteCurrency getLegCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteCurrency() {
    return isSetField(41353);
  }

  public void set(quickfix.field.LegCashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlMinimumQuoteAmount get(quickfix.field.LegCashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlMinimumQuoteAmount getLegCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlMinimumQuoteAmount() {
    return isSetField(41354);
  }

  public void set(quickfix.field.LegCashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlMinimumQuoteCurrency get(quickfix.field.LegCashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlMinimumQuoteCurrency getLegCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlMinimumQuoteCurrency() {
    return isSetField(41355);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDealerGrp get(quickfix.fixlatest.component.LegCashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDealerGrp getLegCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDealerGrp());
  }

  public void set(quickfix.field.NoLegCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlDealers get(quickfix.field.NoLegCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlDealers getNoLegCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlDealers() {
    return isSetField(41342);
  }

public static class NoLegCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41343, 0};

  public NoLegCashSettlDealers() {
    super(41342, 41343, ORDER);
  }

  public void set(quickfix.field.LegCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDealer get(quickfix.field.LegCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDealer getLegCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDealer());
  }

  public boolean isSet(quickfix.field.LegCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDealer() {
    return isSetField(41343);
  }
}

  public void set(quickfix.field.LegCashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlPriceSource get(quickfix.field.LegCashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlPriceSource getLegCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.LegCashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlPriceSource() {
    return isSetField(42308);
  }

  public void set(quickfix.field.LegCashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlPriceDefault get(quickfix.field.LegCashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlPriceDefault getLegCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.LegCashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlPriceDefault() {
    return isSetField(42309);
  }

  public void set(quickfix.field.LegCashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlBusinessDays get(quickfix.field.LegCashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlBusinessDays getLegCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.LegCashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlBusinessDays() {
    return isSetField(41356);
  }

  public void set(quickfix.field.LegCashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlAmount get(quickfix.field.LegCashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlAmount getLegCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlAmount() {
    return isSetField(41357);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDate get(quickfix.fixlatest.component.LegCashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDate getLegCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDate());
  }

  public void set(quickfix.field.LegCashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlRecoveryFactor get(quickfix.field.LegCashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlRecoveryFactor getLegCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.LegCashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlRecoveryFactor() {
    return isSetField(41358);
  }

  public void set(quickfix.field.LegCashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlFixedTermIndicator get(quickfix.field.LegCashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlFixedTermIndicator getLegCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.LegCashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlFixedTermIndicator() {
    return isSetField(41359);
  }

  public void set(quickfix.field.LegCashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlAccruedInterestIndicator get(quickfix.field.LegCashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlAccruedInterestIndicator getLegCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.LegCashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlAccruedInterestIndicator() {
    return isSetField(41360);
  }

  public void set(quickfix.field.LegCashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationMethod get(quickfix.field.LegCashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationMethod getLegCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationMethod() {
    return isSetField(41361);
  }

  public void set(quickfix.field.LegCashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlTermXID get(quickfix.field.LegCashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlTermXID getLegCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlTermXID());
  }

  public boolean isSet(quickfix.field.LegCashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlTermXID() {
    return isSetField(41362);
  }
}

  public void set(quickfix.fixlatest.component.LegPhysicalSettlTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPhysicalSettlTermGrp get(quickfix.fixlatest.component.LegPhysicalSettlTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPhysicalSettlTermGrp getLegPhysicalSettlTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPhysicalSettlTermGrp());
  }

  public void set(quickfix.field.NoLegPhysicalSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegPhysicalSettlTerms get(quickfix.field.NoLegPhysicalSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPhysicalSettlTerms getNoLegPhysicalSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegPhysicalSettlTerms());
  }

  public boolean isSet(quickfix.field.NoLegPhysicalSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPhysicalSettlTerms() {
    return isSetField(41599);
  }

public static class NoLegPhysicalSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41604, 41601, 41602, 41603, 41600, 0};

  public NoLegPhysicalSettlTerms() {
    super(41599, 41604, ORDER);
  }

  public void set(quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp getLegPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp());
  }

  public void set(quickfix.field.NoLegPhysicalSettlDeliverableObligations value) {
    setField(value);
  }

  public quickfix.field.NoLegPhysicalSettlDeliverableObligations get(quickfix.field.NoLegPhysicalSettlDeliverableObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPhysicalSettlDeliverableObligations getNoLegPhysicalSettlDeliverableObligations() throws FieldNotFound {
    return get(new quickfix.field.NoLegPhysicalSettlDeliverableObligations());
  }

  public boolean isSet(quickfix.field.NoLegPhysicalSettlDeliverableObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPhysicalSettlDeliverableObligations() {
    return isSetField(41604);
  }

public static class NoLegPhysicalSettlDeliverableObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41605, 41606, 0};

  public NoLegPhysicalSettlDeliverableObligations() {
    super(41604, 41605, ORDER);
  }

  public void set(quickfix.field.LegPhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationType get(quickfix.field.LegPhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationType getLegPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlDeliverableObligationType() {
    return isSetField(41605);
  }

  public void set(quickfix.field.LegPhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationValue get(quickfix.field.LegPhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationValue getLegPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlDeliverableObligationValue() {
    return isSetField(41606);
  }
}

  public void set(quickfix.field.LegPhysicalSettlCurency value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlCurency get(quickfix.field.LegPhysicalSettlCurency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlCurency getLegPhysicalSettlCurency() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlCurency());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlCurency field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlCurency() {
    return isSetField(41601);
  }

  public void set(quickfix.field.LegPhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlBusinessDays get(quickfix.field.LegPhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlBusinessDays getLegPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlBusinessDays() {
    return isSetField(41602);
  }

  public void set(quickfix.field.LegPhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlMaximumBusinessDays get(quickfix.field.LegPhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlMaximumBusinessDays getLegPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlMaximumBusinessDays() {
    return isSetField(41603);
  }

  public void set(quickfix.field.LegPhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlTermXID get(quickfix.field.LegPhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlTermXID getLegPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlTermXID() {
    return isSetField(41600);
  }
}

  public void set(quickfix.fixlatest.component.LegExtraordinaryEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegExtraordinaryEventGrp get(quickfix.fixlatest.component.LegExtraordinaryEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegExtraordinaryEventGrp getLegExtraordinaryEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegExtraordinaryEventGrp());
  }

  public void set(quickfix.field.NoLegExtraordinaryEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegExtraordinaryEvents get(quickfix.field.NoLegExtraordinaryEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegExtraordinaryEvents getNoLegExtraordinaryEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegExtraordinaryEvents());
  }

  public boolean isSet(quickfix.field.NoLegExtraordinaryEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegExtraordinaryEvents() {
    return isSetField(42388);
  }

public static class NoLegExtraordinaryEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42389, 42390, 0};

  public NoLegExtraordinaryEvents() {
    super(42388, 42389, ORDER);
  }

  public void set(quickfix.field.LegExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventType get(quickfix.field.LegExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventType getLegExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventType() {
    return isSetField(42389);
  }

  public void set(quickfix.field.LegExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventValue get(quickfix.field.LegExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventValue getLegExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventValue() {
    return isSetField(42390);
  }
}

  public void set(quickfix.field.LegExtraordinaryEventAdjustmentMethod value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventAdjustmentMethod get(quickfix.field.LegExtraordinaryEventAdjustmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventAdjustmentMethod getLegExtraordinaryEventAdjustmentMethod() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventAdjustmentMethod());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventAdjustmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventAdjustmentMethod() {
    return isSetField(2606);
  }

  public void set(quickfix.field.LegExchangeLookAlike value) {
    setField(value);
  }

  public quickfix.field.LegExchangeLookAlike get(quickfix.field.LegExchangeLookAlike value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExchangeLookAlike getLegExchangeLookAlike() throws FieldNotFound {
    return get(new quickfix.field.LegExchangeLookAlike());
  }

  public boolean isSet(quickfix.field.LegExchangeLookAlike field) {
    return isSetField(field);
  }

  public boolean isSetLegExchangeLookAlike() {
    return isSetField(2607);
  }
}
