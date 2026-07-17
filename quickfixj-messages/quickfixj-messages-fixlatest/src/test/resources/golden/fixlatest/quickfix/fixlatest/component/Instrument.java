/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class Instrument extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {55, 65, 48, 22, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 691, 667, 875, 876, 873, 874, 1687, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 2602, 2603, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public Instrument() {
    super();
  }

  public void set(quickfix.field.Symbol value) {
    setField(value);
  }

  public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Symbol getSymbol() throws FieldNotFound {
    return get(new quickfix.field.Symbol());
  }

  public boolean isSet(quickfix.field.Symbol field) {
    return isSetField(field);
  }

  public boolean isSetSymbol() {
    return isSetField(55);
  }

  public void set(quickfix.field.SymbolSfx value) {
    setField(value);
  }

  public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
    return get(new quickfix.field.SymbolSfx());
  }

  public boolean isSet(quickfix.field.SymbolSfx field) {
    return isSetField(field);
  }

  public boolean isSetSymbolSfx() {
    return isSetField(65);
  }

  public void set(quickfix.field.SecurityID value) {
    setField(value);
  }

  public quickfix.field.SecurityID get(quickfix.field.SecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityID getSecurityID() throws FieldNotFound {
    return get(new quickfix.field.SecurityID());
  }

  public boolean isSet(quickfix.field.SecurityID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityID() {
    return isSetField(48);
  }

  public void set(quickfix.field.SecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.SecurityIDSource());
  }

  public boolean isSet(quickfix.field.SecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSecurityIDSource() {
    return isSetField(22);
  }

  public void set(quickfix.fixlatest.component.SecAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecAltIDGrp get(quickfix.fixlatest.component.SecAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecAltIDGrp getSecAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecAltIDGrp());
  }

  public void set(quickfix.field.NoSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoSecurityAltID() {
    return isSetField(454);
  }

public static class NoSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {455, 456, 0};

  public NoSecurityAltID() {
    super(454, 455, ORDER);
  }

  public void set(quickfix.field.SecurityAltID value) {
    setField(value);
  }

  public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.SecurityAltID());
  }

  public boolean isSet(quickfix.field.SecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityAltID() {
    return isSetField(455);
  }

  public void set(quickfix.field.SecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.SecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.SecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSecurityAltIDSource() {
    return isSetField(456);
  }
}

  public void set(quickfix.field.Product value) {
    setField(value);
  }

  public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Product getProduct() throws FieldNotFound {
    return get(new quickfix.field.Product());
  }

  public boolean isSet(quickfix.field.Product field) {
    return isSetField(field);
  }

  public boolean isSetProduct() {
    return isSetField(460);
  }

  public void set(quickfix.field.ProductComplex value) {
    setField(value);
  }

  public quickfix.field.ProductComplex get(quickfix.field.ProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProductComplex getProductComplex() throws FieldNotFound {
    return get(new quickfix.field.ProductComplex());
  }

  public boolean isSet(quickfix.field.ProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetProductComplex() {
    return isSetField(1227);
  }

  public void set(quickfix.field.SecurityGroup value) {
    setField(value);
  }

  public quickfix.field.SecurityGroup get(quickfix.field.SecurityGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityGroup getSecurityGroup() throws FieldNotFound {
    return get(new quickfix.field.SecurityGroup());
  }

  public boolean isSet(quickfix.field.SecurityGroup field) {
    return isSetField(field);
  }

  public boolean isSetSecurityGroup() {
    return isSetField(1151);
  }

  public void set(quickfix.field.CFICode value) {
    setField(value);
  }

  public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CFICode getCFICode() throws FieldNotFound {
    return get(new quickfix.field.CFICode());
  }

  public boolean isSet(quickfix.field.CFICode field) {
    return isSetField(field);
  }

  public boolean isSetCFICode() {
    return isSetField(461);
  }

  public void set(quickfix.field.UPICode value) {
    setField(value);
  }

  public quickfix.field.UPICode get(quickfix.field.UPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UPICode getUPICode() throws FieldNotFound {
    return get(new quickfix.field.UPICode());
  }

  public boolean isSet(quickfix.field.UPICode field) {
    return isSetField(field);
  }

  public boolean isSetUPICode() {
    return isSetField(2891);
  }

  public void set(quickfix.field.SecurityType value) {
    setField(value);
  }

  public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
    return get(new quickfix.field.SecurityType());
  }

  public boolean isSet(quickfix.field.SecurityType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityType() {
    return isSetField(167);
  }

  public void set(quickfix.field.SecuritySubType value) {
    setField(value);
  }

  public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.SecuritySubType());
  }

  public boolean isSet(quickfix.field.SecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetSecuritySubType() {
    return isSetField(762);
  }

  public void set(quickfix.field.MaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYear());
  }

  public boolean isSet(quickfix.field.MaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYear() {
    return isSetField(200);
  }

  public void set(quickfix.field.MaturityDate value) {
    setField(value);
  }

  public quickfix.field.MaturityDate get(quickfix.field.MaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.MaturityDate());
  }

  public boolean isSet(quickfix.field.MaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetMaturityDate() {
    return isSetField(541);
  }

  public void set(quickfix.field.MaturityTime value) {
    setField(value);
  }

  public quickfix.field.MaturityTime get(quickfix.field.MaturityTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityTime getMaturityTime() throws FieldNotFound {
    return get(new quickfix.field.MaturityTime());
  }

  public boolean isSet(quickfix.field.MaturityTime field) {
    return isSetField(field);
  }

  public boolean isSetMaturityTime() {
    return isSetField(1079);
  }

  public void set(quickfix.field.SettleOnOpenFlag value) {
    setField(value);
  }

  public quickfix.field.SettleOnOpenFlag get(quickfix.field.SettleOnOpenFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettleOnOpenFlag getSettleOnOpenFlag() throws FieldNotFound {
    return get(new quickfix.field.SettleOnOpenFlag());
  }

  public boolean isSet(quickfix.field.SettleOnOpenFlag field) {
    return isSetField(field);
  }

  public boolean isSetSettleOnOpenFlag() {
    return isSetField(966);
  }

  public void set(quickfix.field.InstrmtAssignmentMethod value) {
    setField(value);
  }

  public quickfix.field.InstrmtAssignmentMethod get(quickfix.field.InstrmtAssignmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrmtAssignmentMethod getInstrmtAssignmentMethod() throws FieldNotFound {
    return get(new quickfix.field.InstrmtAssignmentMethod());
  }

  public boolean isSet(quickfix.field.InstrmtAssignmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetInstrmtAssignmentMethod() {
    return isSetField(1049);
  }

  public void set(quickfix.field.SecurityStatus value) {
    setField(value);
  }

  public quickfix.field.SecurityStatus get(quickfix.field.SecurityStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityStatus getSecurityStatus() throws FieldNotFound {
    return get(new quickfix.field.SecurityStatus());
  }

  public boolean isSet(quickfix.field.SecurityStatus field) {
    return isSetField(field);
  }

  public boolean isSetSecurityStatus() {
    return isSetField(965);
  }

  public void set(quickfix.field.CouponPaymentDate value) {
    setField(value);
  }

  public quickfix.field.CouponPaymentDate get(quickfix.field.CouponPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.CouponPaymentDate());
  }

  public boolean isSet(quickfix.field.CouponPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetCouponPaymentDate() {
    return isSetField(224);
  }

  public void set(quickfix.field.RestructuringType value) {
    setField(value);
  }

  public quickfix.field.RestructuringType get(quickfix.field.RestructuringType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RestructuringType getRestructuringType() throws FieldNotFound {
    return get(new quickfix.field.RestructuringType());
  }

  public boolean isSet(quickfix.field.RestructuringType field) {
    return isSetField(field);
  }

  public boolean isSetRestructuringType() {
    return isSetField(1449);
  }

  public void set(quickfix.field.Seniority value) {
    setField(value);
  }

  public quickfix.field.Seniority get(quickfix.field.Seniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Seniority getSeniority() throws FieldNotFound {
    return get(new quickfix.field.Seniority());
  }

  public boolean isSet(quickfix.field.Seniority field) {
    return isSetField(field);
  }

  public boolean isSetSeniority() {
    return isSetField(1450);
  }

  public void set(quickfix.field.NotionalPercentageOutstanding value) {
    setField(value);
  }

  public quickfix.field.NotionalPercentageOutstanding get(quickfix.field.NotionalPercentageOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotionalPercentageOutstanding getNotionalPercentageOutstanding() throws FieldNotFound {
    return get(new quickfix.field.NotionalPercentageOutstanding());
  }

  public boolean isSet(quickfix.field.NotionalPercentageOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetNotionalPercentageOutstanding() {
    return isSetField(1451);
  }

  public void set(quickfix.field.OriginalNotionalPercentageOutstanding value) {
    setField(value);
  }

  public quickfix.field.OriginalNotionalPercentageOutstanding get(quickfix.field.OriginalNotionalPercentageOutstanding value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OriginalNotionalPercentageOutstanding getOriginalNotionalPercentageOutstanding() throws FieldNotFound {
    return get(new quickfix.field.OriginalNotionalPercentageOutstanding());
  }

  public boolean isSet(quickfix.field.OriginalNotionalPercentageOutstanding field) {
    return isSetField(field);
  }

  public boolean isSetOriginalNotionalPercentageOutstanding() {
    return isSetField(1452);
  }

  public void set(quickfix.field.AttachmentPoint value) {
    setField(value);
  }

  public quickfix.field.AttachmentPoint get(quickfix.field.AttachmentPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentPoint getAttachmentPoint() throws FieldNotFound {
    return get(new quickfix.field.AttachmentPoint());
  }

  public boolean isSet(quickfix.field.AttachmentPoint field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentPoint() {
    return isSetField(1457);
  }

  public void set(quickfix.field.DetachmentPoint value) {
    setField(value);
  }

  public quickfix.field.DetachmentPoint get(quickfix.field.DetachmentPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DetachmentPoint getDetachmentPoint() throws FieldNotFound {
    return get(new quickfix.field.DetachmentPoint());
  }

  public boolean isSet(quickfix.field.DetachmentPoint field) {
    return isSetField(field);
  }

  public boolean isSetDetachmentPoint() {
    return isSetField(1458);
  }

  public void set(quickfix.field.ObligationType value) {
    setField(value);
  }

  public quickfix.field.ObligationType get(quickfix.field.ObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ObligationType getObligationType() throws FieldNotFound {
    return get(new quickfix.field.ObligationType());
  }

  public boolean isSet(quickfix.field.ObligationType field) {
    return isSetField(field);
  }

  public boolean isSetObligationType() {
    return isSetField(1739);
  }

  public void set(quickfix.field.AssetGroup value) {
    setField(value);
  }

  public quickfix.field.AssetGroup get(quickfix.field.AssetGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetGroup getAssetGroup() throws FieldNotFound {
    return get(new quickfix.field.AssetGroup());
  }

  public boolean isSet(quickfix.field.AssetGroup field) {
    return isSetField(field);
  }

  public boolean isSetAssetGroup() {
    return isSetField(2210);
  }

  public void set(quickfix.field.AssetClass value) {
    setField(value);
  }

  public quickfix.field.AssetClass get(quickfix.field.AssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetClass getAssetClass() throws FieldNotFound {
    return get(new quickfix.field.AssetClass());
  }

  public boolean isSet(quickfix.field.AssetClass field) {
    return isSetField(field);
  }

  public boolean isSetAssetClass() {
    return isSetField(1938);
  }

  public void set(quickfix.field.AssetSubClass value) {
    setField(value);
  }

  public quickfix.field.AssetSubClass get(quickfix.field.AssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetSubClass getAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.AssetSubClass());
  }

  public boolean isSet(quickfix.field.AssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetAssetSubClass() {
    return isSetField(1939);
  }

  public void set(quickfix.field.AssetType value) {
    setField(value);
  }

  public quickfix.field.AssetType get(quickfix.field.AssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetType getAssetType() throws FieldNotFound {
    return get(new quickfix.field.AssetType());
  }

  public boolean isSet(quickfix.field.AssetType field) {
    return isSetField(field);
  }

  public boolean isSetAssetType() {
    return isSetField(1940);
  }

  public void set(quickfix.field.AssetSubType value) {
    setField(value);
  }

  public quickfix.field.AssetSubType get(quickfix.field.AssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetSubType getAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.AssetSubType());
  }

  public boolean isSet(quickfix.field.AssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetAssetSubType() {
    return isSetField(2735);
  }

  public void set(quickfix.fixlatest.component.SecondaryAssetGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecondaryAssetGrp get(quickfix.fixlatest.component.SecondaryAssetGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecondaryAssetGrp getSecondaryAssetGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecondaryAssetGrp());
  }

  public void set(quickfix.field.NoSecondaryAssetClasses value) {
    setField(value);
  }

  public quickfix.field.NoSecondaryAssetClasses get(quickfix.field.NoSecondaryAssetClasses value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecondaryAssetClasses getNoSecondaryAssetClasses() throws FieldNotFound {
    return get(new quickfix.field.NoSecondaryAssetClasses());
  }

  public boolean isSet(quickfix.field.NoSecondaryAssetClasses field) {
    return isSetField(field);
  }

  public boolean isSetNoSecondaryAssetClasses() {
    return isSetField(1976);
  }

public static class NoSecondaryAssetClasses extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1977, 1978, 1979, 2741, 0};

  public NoSecondaryAssetClasses() {
    super(1976, 1977, ORDER);
  }

  public void set(quickfix.field.SecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetClass get(quickfix.field.SecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetClass getSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.SecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetClass() {
    return isSetField(1977);
  }

  public void set(quickfix.field.SecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetSubClass get(quickfix.field.SecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetSubClass getSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.SecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetSubClass() {
    return isSetField(1978);
  }

  public void set(quickfix.field.SecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetType get(quickfix.field.SecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetType getSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetType());
  }

  public boolean isSet(quickfix.field.SecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetType() {
    return isSetField(1979);
  }

  public void set(quickfix.field.SecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetSubType get(quickfix.field.SecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetSubType getSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.SecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetSubType() {
    return isSetField(2741);
  }
}

  public void set(quickfix.fixlatest.component.AssetAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AssetAttributeGrp get(quickfix.fixlatest.component.AssetAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AssetAttributeGrp getAssetAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AssetAttributeGrp());
  }

  public void set(quickfix.field.NoAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoAssetAttributes get(quickfix.field.NoAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAssetAttributes getNoAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoAssetAttributes() {
    return isSetField(2304);
  }

public static class NoAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2305, 2306, 2307, 0};

  public NoAssetAttributes() {
    super(2304, 2305, ORDER);
  }

  public void set(quickfix.field.AssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeType get(quickfix.field.AssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeType getAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeType());
  }

  public boolean isSet(quickfix.field.AssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeType() {
    return isSetField(2305);
  }

  public void set(quickfix.field.AssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeValue get(quickfix.field.AssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeValue getAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeValue());
  }

  public boolean isSet(quickfix.field.AssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeValue() {
    return isSetField(2306);
  }

  public void set(quickfix.field.AssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeLimit get(quickfix.field.AssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeLimit getAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.AssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeLimit() {
    return isSetField(2307);
  }
}

  public void set(quickfix.field.SwapClass value) {
    setField(value);
  }

  public quickfix.field.SwapClass get(quickfix.field.SwapClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SwapClass getSwapClass() throws FieldNotFound {
    return get(new quickfix.field.SwapClass());
  }

  public boolean isSet(quickfix.field.SwapClass field) {
    return isSetField(field);
  }

  public boolean isSetSwapClass() {
    return isSetField(1941);
  }

  public void set(quickfix.field.SwapSubClass value) {
    setField(value);
  }

  public quickfix.field.SwapSubClass get(quickfix.field.SwapSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SwapSubClass getSwapSubClass() throws FieldNotFound {
    return get(new quickfix.field.SwapSubClass());
  }

  public boolean isSet(quickfix.field.SwapSubClass field) {
    return isSetField(field);
  }

  public boolean isSetSwapSubClass() {
    return isSetField(1575);
  }

  public void set(quickfix.field.NthToDefault value) {
    setField(value);
  }

  public quickfix.field.NthToDefault get(quickfix.field.NthToDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NthToDefault getNthToDefault() throws FieldNotFound {
    return get(new quickfix.field.NthToDefault());
  }

  public boolean isSet(quickfix.field.NthToDefault field) {
    return isSetField(field);
  }

  public boolean isSetNthToDefault() {
    return isSetField(1942);
  }

  public void set(quickfix.field.MthToDefault value) {
    setField(value);
  }

  public quickfix.field.MthToDefault get(quickfix.field.MthToDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MthToDefault getMthToDefault() throws FieldNotFound {
    return get(new quickfix.field.MthToDefault());
  }

  public boolean isSet(quickfix.field.MthToDefault field) {
    return isSetField(field);
  }

  public boolean isSetMthToDefault() {
    return isSetField(1943);
  }

  public void set(quickfix.field.SettledEntityMatrixSource value) {
    setField(value);
  }

  public quickfix.field.SettledEntityMatrixSource get(quickfix.field.SettledEntityMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettledEntityMatrixSource getSettledEntityMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.SettledEntityMatrixSource());
  }

  public boolean isSet(quickfix.field.SettledEntityMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetSettledEntityMatrixSource() {
    return isSetField(1944);
  }

  public void set(quickfix.field.SettledEntityMatrixPublicationDate value) {
    setField(value);
  }

  public quickfix.field.SettledEntityMatrixPublicationDate get(quickfix.field.SettledEntityMatrixPublicationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettledEntityMatrixPublicationDate getSettledEntityMatrixPublicationDate() throws FieldNotFound {
    return get(new quickfix.field.SettledEntityMatrixPublicationDate());
  }

  public boolean isSet(quickfix.field.SettledEntityMatrixPublicationDate field) {
    return isSetField(field);
  }

  public boolean isSetSettledEntityMatrixPublicationDate() {
    return isSetField(1945);
  }

  public void set(quickfix.field.CouponType value) {
    setField(value);
  }

  public quickfix.field.CouponType get(quickfix.field.CouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponType getCouponType() throws FieldNotFound {
    return get(new quickfix.field.CouponType());
  }

  public boolean isSet(quickfix.field.CouponType field) {
    return isSetField(field);
  }

  public boolean isSetCouponType() {
    return isSetField(1946);
  }

  public void set(quickfix.field.TotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.TotalIssuedAmount get(quickfix.field.TotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalIssuedAmount getTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.TotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.TotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetTotalIssuedAmount() {
    return isSetField(1947);
  }

  public void set(quickfix.field.CouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.CouponFrequencyPeriod get(quickfix.field.CouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponFrequencyPeriod getCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.CouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.CouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetCouponFrequencyPeriod() {
    return isSetField(1948);
  }

  public void set(quickfix.field.CouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.CouponFrequencyUnit get(quickfix.field.CouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponFrequencyUnit getCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.CouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.CouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetCouponFrequencyUnit() {
    return isSetField(1949);
  }

  public void set(quickfix.field.CouponDayCount value) {
    setField(value);
  }

  public quickfix.field.CouponDayCount get(quickfix.field.CouponDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponDayCount getCouponDayCount() throws FieldNotFound {
    return get(new quickfix.field.CouponDayCount());
  }

  public boolean isSet(quickfix.field.CouponDayCount field) {
    return isSetField(field);
  }

  public boolean isSetCouponDayCount() {
    return isSetField(1950);
  }

  public void set(quickfix.field.CouponOtherDayCount value) {
    setField(value);
  }

  public quickfix.field.CouponOtherDayCount get(quickfix.field.CouponOtherDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponOtherDayCount getCouponOtherDayCount() throws FieldNotFound {
    return get(new quickfix.field.CouponOtherDayCount());
  }

  public boolean isSet(quickfix.field.CouponOtherDayCount field) {
    return isSetField(field);
  }

  public boolean isSetCouponOtherDayCount() {
    return isSetField(2879);
  }

  public void set(quickfix.field.ConvertibleBondEquityID value) {
    setField(value);
  }

  public quickfix.field.ConvertibleBondEquityID get(quickfix.field.ConvertibleBondEquityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConvertibleBondEquityID getConvertibleBondEquityID() throws FieldNotFound {
    return get(new quickfix.field.ConvertibleBondEquityID());
  }

  public boolean isSet(quickfix.field.ConvertibleBondEquityID field) {
    return isSetField(field);
  }

  public boolean isSetConvertibleBondEquityID() {
    return isSetField(1951);
  }

  public void set(quickfix.field.ConvertibleBondEquityIDSource value) {
    setField(value);
  }

  public quickfix.field.ConvertibleBondEquityIDSource get(quickfix.field.ConvertibleBondEquityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConvertibleBondEquityIDSource getConvertibleBondEquityIDSource() throws FieldNotFound {
    return get(new quickfix.field.ConvertibleBondEquityIDSource());
  }

  public boolean isSet(quickfix.field.ConvertibleBondEquityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetConvertibleBondEquityIDSource() {
    return isSetField(1952);
  }

  public void set(quickfix.field.ContractPriceRefMonth value) {
    setField(value);
  }

  public quickfix.field.ContractPriceRefMonth get(quickfix.field.ContractPriceRefMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractPriceRefMonth getContractPriceRefMonth() throws FieldNotFound {
    return get(new quickfix.field.ContractPriceRefMonth());
  }

  public boolean isSet(quickfix.field.ContractPriceRefMonth field) {
    return isSetField(field);
  }

  public boolean isSetContractPriceRefMonth() {
    return isSetField(1953);
  }

  public void set(quickfix.field.LienSeniority value) {
    setField(value);
  }

  public quickfix.field.LienSeniority get(quickfix.field.LienSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LienSeniority getLienSeniority() throws FieldNotFound {
    return get(new quickfix.field.LienSeniority());
  }

  public boolean isSet(quickfix.field.LienSeniority field) {
    return isSetField(field);
  }

  public boolean isSetLienSeniority() {
    return isSetField(1954);
  }

  public void set(quickfix.field.LoanFacility value) {
    setField(value);
  }

  public quickfix.field.LoanFacility get(quickfix.field.LoanFacility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LoanFacility getLoanFacility() throws FieldNotFound {
    return get(new quickfix.field.LoanFacility());
  }

  public boolean isSet(quickfix.field.LoanFacility field) {
    return isSetField(field);
  }

  public boolean isSetLoanFacility() {
    return isSetField(1955);
  }

  public void set(quickfix.field.ReferenceEntityType value) {
    setField(value);
  }

  public quickfix.field.ReferenceEntityType get(quickfix.field.ReferenceEntityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceEntityType getReferenceEntityType() throws FieldNotFound {
    return get(new quickfix.field.ReferenceEntityType());
  }

  public boolean isSet(quickfix.field.ReferenceEntityType field) {
    return isSetField(field);
  }

  public boolean isSetReferenceEntityType() {
    return isSetField(1956);
  }

  public void set(quickfix.field.IndexSeries value) {
    setField(value);
  }

  public quickfix.field.IndexSeries get(quickfix.field.IndexSeries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexSeries getIndexSeries() throws FieldNotFound {
    return get(new quickfix.field.IndexSeries());
  }

  public boolean isSet(quickfix.field.IndexSeries field) {
    return isSetField(field);
  }

  public boolean isSetIndexSeries() {
    return isSetField(1957);
  }

  public void set(quickfix.field.IndexAnnexVersion value) {
    setField(value);
  }

  public quickfix.field.IndexAnnexVersion get(quickfix.field.IndexAnnexVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexAnnexVersion getIndexAnnexVersion() throws FieldNotFound {
    return get(new quickfix.field.IndexAnnexVersion());
  }

  public boolean isSet(quickfix.field.IndexAnnexVersion field) {
    return isSetField(field);
  }

  public boolean isSetIndexAnnexVersion() {
    return isSetField(1958);
  }

  public void set(quickfix.field.IndexAnnexDate value) {
    setField(value);
  }

  public quickfix.field.IndexAnnexDate get(quickfix.field.IndexAnnexDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexAnnexDate getIndexAnnexDate() throws FieldNotFound {
    return get(new quickfix.field.IndexAnnexDate());
  }

  public boolean isSet(quickfix.field.IndexAnnexDate field) {
    return isSetField(field);
  }

  public boolean isSetIndexAnnexDate() {
    return isSetField(1959);
  }

  public void set(quickfix.field.IndexAnnexSource value) {
    setField(value);
  }

  public quickfix.field.IndexAnnexSource get(quickfix.field.IndexAnnexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexAnnexSource getIndexAnnexSource() throws FieldNotFound {
    return get(new quickfix.field.IndexAnnexSource());
  }

  public boolean isSet(quickfix.field.IndexAnnexSource field) {
    return isSetField(field);
  }

  public boolean isSetIndexAnnexSource() {
    return isSetField(1960);
  }

  public void set(quickfix.field.SettlRateIndex value) {
    setField(value);
  }

  public quickfix.field.SettlRateIndex get(quickfix.field.SettlRateIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRateIndex getSettlRateIndex() throws FieldNotFound {
    return get(new quickfix.field.SettlRateIndex());
  }

  public boolean isSet(quickfix.field.SettlRateIndex field) {
    return isSetField(field);
  }

  public boolean isSetSettlRateIndex() {
    return isSetField(1577);
  }

  public void set(quickfix.field.SettlRateIndexLocation value) {
    setField(value);
  }

  public quickfix.field.SettlRateIndexLocation get(quickfix.field.SettlRateIndexLocation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRateIndexLocation getSettlRateIndexLocation() throws FieldNotFound {
    return get(new quickfix.field.SettlRateIndexLocation());
  }

  public boolean isSet(quickfix.field.SettlRateIndexLocation field) {
    return isSetField(field);
  }

  public boolean isSetSettlRateIndexLocation() {
    return isSetField(1580);
  }

  public void set(quickfix.field.OptionExpirationDesc value) {
    setField(value);
  }

  public quickfix.field.OptionExpirationDesc get(quickfix.field.OptionExpirationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExpirationDesc getOptionExpirationDesc() throws FieldNotFound {
    return get(new quickfix.field.OptionExpirationDesc());
  }

  public boolean isSet(quickfix.field.OptionExpirationDesc field) {
    return isSetField(field);
  }

  public boolean isSetOptionExpirationDesc() {
    return isSetField(1581);
  }

  public void set(quickfix.field.EncodedOptionExpirationDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedOptionExpirationDescLen get(quickfix.field.EncodedOptionExpirationDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedOptionExpirationDescLen getEncodedOptionExpirationDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedOptionExpirationDescLen());
  }

  public boolean isSet(quickfix.field.EncodedOptionExpirationDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedOptionExpirationDescLen() {
    return isSetField(1678);
  }

  public void set(quickfix.field.EncodedOptionExpirationDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedOptionExpirationDesc get(quickfix.field.EncodedOptionExpirationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedOptionExpirationDesc getEncodedOptionExpirationDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedOptionExpirationDesc());
  }

  public boolean isSet(quickfix.field.EncodedOptionExpirationDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedOptionExpirationDesc() {
    return isSetField(1697);
  }

  public void set(quickfix.field.IssueDate value) {
    setField(value);
  }

  public quickfix.field.IssueDate get(quickfix.field.IssueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IssueDate getIssueDate() throws FieldNotFound {
    return get(new quickfix.field.IssueDate());
  }

  public boolean isSet(quickfix.field.IssueDate field) {
    return isSetField(field);
  }

  public boolean isSetIssueDate() {
    return isSetField(225);
  }

  public void set(quickfix.field.RepoCollateralSecurityType value) {
    setField(value);
  }

  public quickfix.field.RepoCollateralSecurityType get(quickfix.field.RepoCollateralSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
    return get(new quickfix.field.RepoCollateralSecurityType());
  }

  public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetRepoCollateralSecurityType() {
    return isSetField(239);
  }

  public void set(quickfix.field.RepurchaseTerm value) {
    setField(value);
  }

  public quickfix.field.RepurchaseTerm get(quickfix.field.RepurchaseTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
    return get(new quickfix.field.RepurchaseTerm());
  }

  public boolean isSet(quickfix.field.RepurchaseTerm field) {
    return isSetField(field);
  }

  public boolean isSetRepurchaseTerm() {
    return isSetField(226);
  }

  public void set(quickfix.field.RepurchaseRate value) {
    setField(value);
  }

  public quickfix.field.RepurchaseRate get(quickfix.field.RepurchaseRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
    return get(new quickfix.field.RepurchaseRate());
  }

  public boolean isSet(quickfix.field.RepurchaseRate field) {
    return isSetField(field);
  }

  public boolean isSetRepurchaseRate() {
    return isSetField(227);
  }

  public void set(quickfix.field.Factor value) {
    setField(value);
  }

  public quickfix.field.Factor get(quickfix.field.Factor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Factor getFactor() throws FieldNotFound {
    return get(new quickfix.field.Factor());
  }

  public boolean isSet(quickfix.field.Factor field) {
    return isSetField(field);
  }

  public boolean isSetFactor() {
    return isSetField(228);
  }

  public void set(quickfix.field.CreditRating value) {
    setField(value);
  }

  public quickfix.field.CreditRating get(quickfix.field.CreditRating value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CreditRating getCreditRating() throws FieldNotFound {
    return get(new quickfix.field.CreditRating());
  }

  public boolean isSet(quickfix.field.CreditRating field) {
    return isSetField(field);
  }

  public boolean isSetCreditRating() {
    return isSetField(255);
  }

  public void set(quickfix.field.InstrRegistry value) {
    setField(value);
  }

  public quickfix.field.InstrRegistry get(quickfix.field.InstrRegistry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
    return get(new quickfix.field.InstrRegistry());
  }

  public boolean isSet(quickfix.field.InstrRegistry field) {
    return isSetField(field);
  }

  public boolean isSetInstrRegistry() {
    return isSetField(543);
  }

  public void set(quickfix.field.CountryOfIssue value) {
    setField(value);
  }

  public quickfix.field.CountryOfIssue get(quickfix.field.CountryOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
    return get(new quickfix.field.CountryOfIssue());
  }

  public boolean isSet(quickfix.field.CountryOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetCountryOfIssue() {
    return isSetField(470);
  }

  public void set(quickfix.field.StateOrProvinceOfIssue value) {
    setField(value);
  }

  public quickfix.field.StateOrProvinceOfIssue get(quickfix.field.StateOrProvinceOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
    return get(new quickfix.field.StateOrProvinceOfIssue());
  }

  public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetStateOrProvinceOfIssue() {
    return isSetField(471);
  }

  public void set(quickfix.field.LocaleOfIssue value) {
    setField(value);
  }

  public quickfix.field.LocaleOfIssue get(quickfix.field.LocaleOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
    return get(new quickfix.field.LocaleOfIssue());
  }

  public boolean isSet(quickfix.field.LocaleOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetLocaleOfIssue() {
    return isSetField(472);
  }

  public void set(quickfix.field.RedemptionDate value) {
    setField(value);
  }

  public quickfix.field.RedemptionDate get(quickfix.field.RedemptionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
    return get(new quickfix.field.RedemptionDate());
  }

  public boolean isSet(quickfix.field.RedemptionDate field) {
    return isSetField(field);
  }

  public boolean isSetRedemptionDate() {
    return isSetField(240);
  }

  public void set(quickfix.field.StrikePrice value) {
    setField(value);
  }

  public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.StrikePrice());
  }

  public boolean isSet(quickfix.field.StrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetStrikePrice() {
    return isSetField(202);
  }

  public void set(quickfix.field.OrigStrikePrice value) {
    setField(value);
  }

  public quickfix.field.OrigStrikePrice get(quickfix.field.OrigStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigStrikePrice getOrigStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.OrigStrikePrice());
  }

  public boolean isSet(quickfix.field.OrigStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetOrigStrikePrice() {
    return isSetField(2578);
  }

  public void set(quickfix.field.StrikePricePrecision value) {
    setField(value);
  }

  public quickfix.field.StrikePricePrecision get(quickfix.field.StrikePricePrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikePricePrecision getStrikePricePrecision() throws FieldNotFound {
    return get(new quickfix.field.StrikePricePrecision());
  }

  public boolean isSet(quickfix.field.StrikePricePrecision field) {
    return isSetField(field);
  }

  public boolean isSetStrikePricePrecision() {
    return isSetField(2577);
  }

  public void set(quickfix.field.StrikeCurrency value) {
    setField(value);
  }

  public quickfix.field.StrikeCurrency get(quickfix.field.StrikeCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
    return get(new quickfix.field.StrikeCurrency());
  }

  public boolean isSet(quickfix.field.StrikeCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStrikeCurrency() {
    return isSetField(947);
  }

  public void set(quickfix.field.StrikeMultiplier value) {
    setField(value);
  }

  public quickfix.field.StrikeMultiplier get(quickfix.field.StrikeMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeMultiplier getStrikeMultiplier() throws FieldNotFound {
    return get(new quickfix.field.StrikeMultiplier());
  }

  public boolean isSet(quickfix.field.StrikeMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetStrikeMultiplier() {
    return isSetField(967);
  }

  public void set(quickfix.field.StrikeValue value) {
    setField(value);
  }

  public quickfix.field.StrikeValue get(quickfix.field.StrikeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeValue getStrikeValue() throws FieldNotFound {
    return get(new quickfix.field.StrikeValue());
  }

  public boolean isSet(quickfix.field.StrikeValue field) {
    return isSetField(field);
  }

  public boolean isSetStrikeValue() {
    return isSetField(968);
  }

  public void set(quickfix.field.StrikeUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StrikeUnitOfMeasure get(quickfix.field.StrikeUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeUnitOfMeasure getStrikeUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StrikeUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StrikeUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStrikeUnitOfMeasure() {
    return isSetField(1698);
  }

  public void set(quickfix.field.StrikeIndex value) {
    setField(value);
  }

  public quickfix.field.StrikeIndex get(quickfix.field.StrikeIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIndex getStrikeIndex() throws FieldNotFound {
    return get(new quickfix.field.StrikeIndex());
  }

  public boolean isSet(quickfix.field.StrikeIndex field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIndex() {
    return isSetField(1866);
  }

  public void set(quickfix.field.StrikeIndexCurvePoint value) {
    setField(value);
  }

  public quickfix.field.StrikeIndexCurvePoint get(quickfix.field.StrikeIndexCurvePoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIndexCurvePoint getStrikeIndexCurvePoint() throws FieldNotFound {
    return get(new quickfix.field.StrikeIndexCurvePoint());
  }

  public boolean isSet(quickfix.field.StrikeIndexCurvePoint field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIndexCurvePoint() {
    return isSetField(2600);
  }

  public void set(quickfix.field.StrikeIndexSpread value) {
    setField(value);
  }

  public quickfix.field.StrikeIndexSpread get(quickfix.field.StrikeIndexSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIndexSpread getStrikeIndexSpread() throws FieldNotFound {
    return get(new quickfix.field.StrikeIndexSpread());
  }

  public boolean isSet(quickfix.field.StrikeIndexSpread field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIndexSpread() {
    return isSetField(2001);
  }

  public void set(quickfix.field.StrikeIndexQuote value) {
    setField(value);
  }

  public quickfix.field.StrikeIndexQuote get(quickfix.field.StrikeIndexQuote value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIndexQuote getStrikeIndexQuote() throws FieldNotFound {
    return get(new quickfix.field.StrikeIndexQuote());
  }

  public boolean isSet(quickfix.field.StrikeIndexQuote field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIndexQuote() {
    return isSetField(2601);
  }

  public void set(quickfix.field.StrikePriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.StrikePriceDeterminationMethod get(quickfix.field.StrikePriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikePriceDeterminationMethod getStrikePriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.StrikePriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.StrikePriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetStrikePriceDeterminationMethod() {
    return isSetField(1478);
  }

  public void set(quickfix.field.StrikePriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.StrikePriceBoundaryMethod get(quickfix.field.StrikePriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikePriceBoundaryMethod getStrikePriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.StrikePriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.StrikePriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetStrikePriceBoundaryMethod() {
    return isSetField(1479);
  }

  public void set(quickfix.field.StrikePriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.StrikePriceBoundaryPrecision get(quickfix.field.StrikePriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikePriceBoundaryPrecision getStrikePriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.StrikePriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.StrikePriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetStrikePriceBoundaryPrecision() {
    return isSetField(1480);
  }

  public void set(quickfix.field.UnderlyingPriceDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPriceDeterminationMethod get(quickfix.field.UnderlyingPriceDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPriceDeterminationMethod getUnderlyingPriceDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPriceDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingPriceDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPriceDeterminationMethod() {
    return isSetField(1481);
  }

  public void set(quickfix.field.OptAttribute value) {
    setField(value);
  }

  public quickfix.field.OptAttribute get(quickfix.field.OptAttribute value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound {
    return get(new quickfix.field.OptAttribute());
  }

  public boolean isSet(quickfix.field.OptAttribute field) {
    return isSetField(field);
  }

  public boolean isSetOptAttribute() {
    return isSetField(206);
  }

  public void set(quickfix.field.ContractMultiplier value) {
    setField(value);
  }

  public quickfix.field.ContractMultiplier get(quickfix.field.ContractMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
    return get(new quickfix.field.ContractMultiplier());
  }

  public boolean isSet(quickfix.field.ContractMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetContractMultiplier() {
    return isSetField(231);
  }

  public void set(quickfix.field.ContractMultiplierUnit value) {
    setField(value);
  }

  public quickfix.field.ContractMultiplierUnit get(quickfix.field.ContractMultiplierUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractMultiplierUnit getContractMultiplierUnit() throws FieldNotFound {
    return get(new quickfix.field.ContractMultiplierUnit());
  }

  public boolean isSet(quickfix.field.ContractMultiplierUnit field) {
    return isSetField(field);
  }

  public boolean isSetContractMultiplierUnit() {
    return isSetField(1435);
  }

  public void set(quickfix.field.TradingUnitPeriodMultiplier value) {
    setField(value);
  }

  public quickfix.field.TradingUnitPeriodMultiplier get(quickfix.field.TradingUnitPeriodMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingUnitPeriodMultiplier getTradingUnitPeriodMultiplier() throws FieldNotFound {
    return get(new quickfix.field.TradingUnitPeriodMultiplier());
  }

  public boolean isSet(quickfix.field.TradingUnitPeriodMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetTradingUnitPeriodMultiplier() {
    return isSetField(2353);
  }

  public void set(quickfix.field.FlowScheduleType value) {
    setField(value);
  }

  public quickfix.field.FlowScheduleType get(quickfix.field.FlowScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlowScheduleType getFlowScheduleType() throws FieldNotFound {
    return get(new quickfix.field.FlowScheduleType());
  }

  public boolean isSet(quickfix.field.FlowScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetFlowScheduleType() {
    return isSetField(1439);
  }

  public void set(quickfix.field.MinPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.MinPriceIncrement get(quickfix.field.MinPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinPriceIncrement getMinPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.MinPriceIncrement());
  }

  public boolean isSet(quickfix.field.MinPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMinPriceIncrement() {
    return isSetField(969);
  }

  public void set(quickfix.field.MinPriceIncrementAmount value) {
    setField(value);
  }

  public quickfix.field.MinPriceIncrementAmount get(quickfix.field.MinPriceIncrementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinPriceIncrementAmount getMinPriceIncrementAmount() throws FieldNotFound {
    return get(new quickfix.field.MinPriceIncrementAmount());
  }

  public boolean isSet(quickfix.field.MinPriceIncrementAmount field) {
    return isSetField(field);
  }

  public boolean isSetMinPriceIncrementAmount() {
    return isSetField(1146);
  }

  public void set(quickfix.field.UnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnitOfMeasure get(quickfix.field.UnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnitOfMeasure getUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnitOfMeasure() {
    return isSetField(996);
  }

  public void set(quickfix.field.UnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.UnitOfMeasureQty get(quickfix.field.UnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnitOfMeasureQty getUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.UnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.UnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetUnitOfMeasureQty() {
    return isSetField(1147);
  }

  public void set(quickfix.field.UnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.UnitOfMeasureCurrency get(quickfix.field.UnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnitOfMeasureCurrency getUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.UnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnitOfMeasureCurrency() {
    return isSetField(1716);
  }

  public void set(quickfix.field.PriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PriceUnitOfMeasure get(quickfix.field.PriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceUnitOfMeasure getPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPriceUnitOfMeasure() {
    return isSetField(1191);
  }

  public void set(quickfix.field.PriceUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.PriceUnitOfMeasureQty get(quickfix.field.PriceUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceUnitOfMeasureQty getPriceUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.PriceUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.PriceUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetPriceUnitOfMeasureQty() {
    return isSetField(1192);
  }

  public void set(quickfix.field.PriceUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.PriceUnitOfMeasureCurrency get(quickfix.field.PriceUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceUnitOfMeasureCurrency getPriceUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.PriceUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.PriceUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPriceUnitOfMeasureCurrency() {
    return isSetField(1717);
  }

  public void set(quickfix.field.SettlMethod value) {
    setField(value);
  }

  public quickfix.field.SettlMethod get(quickfix.field.SettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethod getSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.SettlMethod());
  }

  public boolean isSet(quickfix.field.SettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethod() {
    return isSetField(1193);
  }

  public void set(quickfix.field.SettlSubMethod value) {
    setField(value);
  }

  public quickfix.field.SettlSubMethod get(quickfix.field.SettlSubMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSubMethod getSettlSubMethod() throws FieldNotFound {
    return get(new quickfix.field.SettlSubMethod());
  }

  public boolean isSet(quickfix.field.SettlSubMethod field) {
    return isSetField(field);
  }

  public boolean isSetSettlSubMethod() {
    return isSetField(2579);
  }

  public void set(quickfix.field.ExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.ExerciseStyle get(quickfix.field.ExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExerciseStyle getExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.ExerciseStyle());
  }

  public boolean isSet(quickfix.field.ExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetExerciseStyle() {
    return isSetField(1194);
  }

  public void set(quickfix.field.OptPayoutType value) {
    setField(value);
  }

  public quickfix.field.OptPayoutType get(quickfix.field.OptPayoutType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptPayoutType getOptPayoutType() throws FieldNotFound {
    return get(new quickfix.field.OptPayoutType());
  }

  public boolean isSet(quickfix.field.OptPayoutType field) {
    return isSetField(field);
  }

  public boolean isSetOptPayoutType() {
    return isSetField(1482);
  }

  public void set(quickfix.field.OptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.OptPayoutAmount get(quickfix.field.OptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptPayoutAmount getOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.OptPayoutAmount());
  }

  public boolean isSet(quickfix.field.OptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetOptPayoutAmount() {
    return isSetField(1195);
  }

  public void set(quickfix.field.ReturnTrigger value) {
    setField(value);
  }

  public quickfix.field.ReturnTrigger get(quickfix.field.ReturnTrigger value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnTrigger getReturnTrigger() throws FieldNotFound {
    return get(new quickfix.field.ReturnTrigger());
  }

  public boolean isSet(quickfix.field.ReturnTrigger field) {
    return isSetField(field);
  }

  public boolean isSetReturnTrigger() {
    return isSetField(2753);
  }

  public void set(quickfix.field.PriceQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.PriceQuoteMethod get(quickfix.field.PriceQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQuoteMethod getPriceQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.PriceQuoteMethod());
  }

  public boolean isSet(quickfix.field.PriceQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetPriceQuoteMethod() {
    return isSetField(1196);
  }

  public void set(quickfix.field.ValuationMethod value) {
    setField(value);
  }

  public quickfix.field.ValuationMethod get(quickfix.field.ValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValuationMethod getValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.ValuationMethod());
  }

  public boolean isSet(quickfix.field.ValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetValuationMethod() {
    return isSetField(1197);
  }

  public void set(quickfix.field.ValuationSource value) {
    setField(value);
  }

  public quickfix.field.ValuationSource get(quickfix.field.ValuationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValuationSource getValuationSource() throws FieldNotFound {
    return get(new quickfix.field.ValuationSource());
  }

  public boolean isSet(quickfix.field.ValuationSource field) {
    return isSetField(field);
  }

  public boolean isSetValuationSource() {
    return isSetField(2002);
  }

  public void set(quickfix.field.ValuationReferenceModel value) {
    setField(value);
  }

  public quickfix.field.ValuationReferenceModel get(quickfix.field.ValuationReferenceModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValuationReferenceModel getValuationReferenceModel() throws FieldNotFound {
    return get(new quickfix.field.ValuationReferenceModel());
  }

  public boolean isSet(quickfix.field.ValuationReferenceModel field) {
    return isSetField(field);
  }

  public boolean isSetValuationReferenceModel() {
    return isSetField(2140);
  }

  public void set(quickfix.field.PriceQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.PriceQuoteCurrency get(quickfix.field.PriceQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceQuoteCurrency getPriceQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.PriceQuoteCurrency());
  }

  public boolean isSet(quickfix.field.PriceQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPriceQuoteCurrency() {
    return isSetField(1524);
  }

  public void set(quickfix.field.ListMethod value) {
    setField(value);
  }

  public quickfix.field.ListMethod get(quickfix.field.ListMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListMethod getListMethod() throws FieldNotFound {
    return get(new quickfix.field.ListMethod());
  }

  public boolean isSet(quickfix.field.ListMethod field) {
    return isSetField(field);
  }

  public boolean isSetListMethod() {
    return isSetField(1198);
  }

  public void set(quickfix.field.CapPrice value) {
    setField(value);
  }

  public quickfix.field.CapPrice get(quickfix.field.CapPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CapPrice getCapPrice() throws FieldNotFound {
    return get(new quickfix.field.CapPrice());
  }

  public boolean isSet(quickfix.field.CapPrice field) {
    return isSetField(field);
  }

  public boolean isSetCapPrice() {
    return isSetField(1199);
  }

  public void set(quickfix.field.FloorPrice value) {
    setField(value);
  }

  public quickfix.field.FloorPrice get(quickfix.field.FloorPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FloorPrice getFloorPrice() throws FieldNotFound {
    return get(new quickfix.field.FloorPrice());
  }

  public boolean isSet(quickfix.field.FloorPrice field) {
    return isSetField(field);
  }

  public boolean isSetFloorPrice() {
    return isSetField(1200);
  }

  public void set(quickfix.field.PutOrCall value) {
    setField(value);
  }

  public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound {
    return get(new quickfix.field.PutOrCall());
  }

  public boolean isSet(quickfix.field.PutOrCall field) {
    return isSetField(field);
  }

  public boolean isSetPutOrCall() {
    return isSetField(201);
  }

  public void set(quickfix.field.InTheMoneyCondition value) {
    setField(value);
  }

  public quickfix.field.InTheMoneyCondition get(quickfix.field.InTheMoneyCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InTheMoneyCondition getInTheMoneyCondition() throws FieldNotFound {
    return get(new quickfix.field.InTheMoneyCondition());
  }

  public boolean isSet(quickfix.field.InTheMoneyCondition field) {
    return isSetField(field);
  }

  public boolean isSetInTheMoneyCondition() {
    return isSetField(2681);
  }

  public void set(quickfix.field.ContraryInstructionEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.ContraryInstructionEligibilityIndicator get(quickfix.field.ContraryInstructionEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraryInstructionEligibilityIndicator getContraryInstructionEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.ContraryInstructionEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.ContraryInstructionEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetContraryInstructionEligibilityIndicator() {
    return isSetField(2685);
  }

  public void set(quickfix.field.FlexibleIndicator value) {
    setField(value);
  }

  public quickfix.field.FlexibleIndicator get(quickfix.field.FlexibleIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexibleIndicator getFlexibleIndicator() throws FieldNotFound {
    return get(new quickfix.field.FlexibleIndicator());
  }

  public boolean isSet(quickfix.field.FlexibleIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFlexibleIndicator() {
    return isSetField(1244);
  }

  public void set(quickfix.field.FlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityIndicator get(quickfix.field.FlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityIndicator getFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityIndicator() {
    return isSetField(1242);
  }

  public void set(quickfix.field.BlockTradeEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.BlockTradeEligibilityIndicator get(quickfix.field.BlockTradeEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BlockTradeEligibilityIndicator getBlockTradeEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.BlockTradeEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.BlockTradeEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetBlockTradeEligibilityIndicator() {
    return isSetField(2575);
  }

  public void set(quickfix.field.LowExercisePriceOptionIndicator value) {
    setField(value);
  }

  public quickfix.field.LowExercisePriceOptionIndicator get(quickfix.field.LowExercisePriceOptionIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LowExercisePriceOptionIndicator getLowExercisePriceOptionIndicator() throws FieldNotFound {
    return get(new quickfix.field.LowExercisePriceOptionIndicator());
  }

  public boolean isSet(quickfix.field.LowExercisePriceOptionIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLowExercisePriceOptionIndicator() {
    return isSetField(2574);
  }

  public void set(quickfix.field.TimeUnit value) {
    setField(value);
  }

  public quickfix.field.TimeUnit get(quickfix.field.TimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeUnit getTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.TimeUnit());
  }

  public boolean isSet(quickfix.field.TimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetTimeUnit() {
    return isSetField(997);
  }

  public void set(quickfix.field.CouponRate value) {
    setField(value);
  }

  public quickfix.field.CouponRate get(quickfix.field.CouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CouponRate getCouponRate() throws FieldNotFound {
    return get(new quickfix.field.CouponRate());
  }

  public boolean isSet(quickfix.field.CouponRate field) {
    return isSetField(field);
  }

  public boolean isSetCouponRate() {
    return isSetField(223);
  }

  public void set(quickfix.field.SecurityExchange value) {
    setField(value);
  }

  public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.SecurityExchange());
  }

  public boolean isSet(quickfix.field.SecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetSecurityExchange() {
    return isSetField(207);
  }

  public void set(quickfix.field.PositionLimit value) {
    setField(value);
  }

  public quickfix.field.PositionLimit get(quickfix.field.PositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionLimit getPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.PositionLimit());
  }

  public boolean isSet(quickfix.field.PositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetPositionLimit() {
    return isSetField(970);
  }

  public void set(quickfix.field.NTPositionLimit value) {
    setField(value);
  }

  public quickfix.field.NTPositionLimit get(quickfix.field.NTPositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NTPositionLimit getNTPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.NTPositionLimit());
  }

  public boolean isSet(quickfix.field.NTPositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetNTPositionLimit() {
    return isSetField(971);
  }

  public void set(quickfix.field.Issuer value) {
    setField(value);
  }

  public quickfix.field.Issuer get(quickfix.field.Issuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Issuer getIssuer() throws FieldNotFound {
    return get(new quickfix.field.Issuer());
  }

  public boolean isSet(quickfix.field.Issuer field) {
    return isSetField(field);
  }

  public boolean isSetIssuer() {
    return isSetField(106);
  }

  public void set(quickfix.field.EncodedIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedIssuerLen get(quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedIssuerLen() {
    return isSetField(348);
  }

  public void set(quickfix.field.EncodedIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedIssuer get(quickfix.field.EncodedIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedIssuer());
  }

  public boolean isSet(quickfix.field.EncodedIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedIssuer() {
    return isSetField(349);
  }

  public void set(quickfix.field.FinancialInstrumentShortName value) {
    setField(value);
  }

  public quickfix.field.FinancialInstrumentShortName get(quickfix.field.FinancialInstrumentShortName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancialInstrumentShortName getFinancialInstrumentShortName() throws FieldNotFound {
    return get(new quickfix.field.FinancialInstrumentShortName());
  }

  public boolean isSet(quickfix.field.FinancialInstrumentShortName field) {
    return isSetField(field);
  }

  public boolean isSetFinancialInstrumentShortName() {
    return isSetField(2737);
  }

  public void set(quickfix.field.FinancialInstrumentFullName value) {
    setField(value);
  }

  public quickfix.field.FinancialInstrumentFullName get(quickfix.field.FinancialInstrumentFullName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancialInstrumentFullName getFinancialInstrumentFullName() throws FieldNotFound {
    return get(new quickfix.field.FinancialInstrumentFullName());
  }

  public boolean isSet(quickfix.field.FinancialInstrumentFullName field) {
    return isSetField(field);
  }

  public boolean isSetFinancialInstrumentFullName() {
    return isSetField(2714);
  }

  public void set(quickfix.field.EncodedFinancialInstrumentFullNameLen value) {
    setField(value);
  }

  public quickfix.field.EncodedFinancialInstrumentFullNameLen get(quickfix.field.EncodedFinancialInstrumentFullNameLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFinancialInstrumentFullNameLen getEncodedFinancialInstrumentFullNameLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedFinancialInstrumentFullNameLen());
  }

  public boolean isSet(quickfix.field.EncodedFinancialInstrumentFullNameLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFinancialInstrumentFullNameLen() {
    return isSetField(2715);
  }

  public void set(quickfix.field.EncodedFinancialInstrumentFullName value) {
    setField(value);
  }

  public quickfix.field.EncodedFinancialInstrumentFullName get(quickfix.field.EncodedFinancialInstrumentFullName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedFinancialInstrumentFullName getEncodedFinancialInstrumentFullName() throws FieldNotFound {
    return get(new quickfix.field.EncodedFinancialInstrumentFullName());
  }

  public boolean isSet(quickfix.field.EncodedFinancialInstrumentFullName field) {
    return isSetField(field);
  }

  public boolean isSetEncodedFinancialInstrumentFullName() {
    return isSetField(2716);
  }

  public void set(quickfix.field.SecurityDesc value) {
    setField(value);
  }

  public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.SecurityDesc());
  }

  public boolean isSet(quickfix.field.SecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetSecurityDesc() {
    return isSetField(107);
  }

  public void set(quickfix.field.EncodedSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedSecurityDescLen get(quickfix.field.EncodedSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedSecurityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedSecurityDescLen() {
    return isSetField(350);
  }

  public void set(quickfix.field.EncodedSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedSecurityDesc get(quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedSecurityDesc());
  }

  public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedSecurityDesc() {
    return isSetField(351);
  }

  public void set(quickfix.fixlatest.component.SecurityXML component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecurityXML get(quickfix.fixlatest.component.SecurityXML component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecurityXML getSecurityXMLComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecurityXML());
  }

  public void set(quickfix.field.Pool value) {
    setField(value);
  }

  public quickfix.field.Pool get(quickfix.field.Pool value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Pool getPool() throws FieldNotFound {
    return get(new quickfix.field.Pool());
  }

  public boolean isSet(quickfix.field.Pool field) {
    return isSetField(field);
  }

  public boolean isSetPool() {
    return isSetField(691);
  }

  public void set(quickfix.field.ContractSettlMonth value) {
    setField(value);
  }

  public quickfix.field.ContractSettlMonth get(quickfix.field.ContractSettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
    return get(new quickfix.field.ContractSettlMonth());
  }

  public boolean isSet(quickfix.field.ContractSettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetContractSettlMonth() {
    return isSetField(667);
  }

  public void set(quickfix.field.CPProgram value) {
    setField(value);
  }

  public quickfix.field.CPProgram get(quickfix.field.CPProgram value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CPProgram getCPProgram() throws FieldNotFound {
    return get(new quickfix.field.CPProgram());
  }

  public boolean isSet(quickfix.field.CPProgram field) {
    return isSetField(field);
  }

  public boolean isSetCPProgram() {
    return isSetField(875);
  }

  public void set(quickfix.field.CPRegType value) {
    setField(value);
  }

  public quickfix.field.CPRegType get(quickfix.field.CPRegType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CPRegType getCPRegType() throws FieldNotFound {
    return get(new quickfix.field.CPRegType());
  }

  public boolean isSet(quickfix.field.CPRegType field) {
    return isSetField(field);
  }

  public boolean isSetCPRegType() {
    return isSetField(876);
  }

  public void set(quickfix.fixlatest.component.EvntGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.EvntGrp get(quickfix.fixlatest.component.EvntGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.EvntGrp getEvntGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.EvntGrp());
  }

  public void set(quickfix.field.NoEvents value) {
    setField(value);
  }

  public quickfix.field.NoEvents get(quickfix.field.NoEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
    return get(new quickfix.field.NoEvents());
  }

  public boolean isSet(quickfix.field.NoEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoEvents() {
    return isSetField(864);
  }

public static class NoEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {865, 866, 1145, 1827, 1826, 2340, 867, 868, 1578, 1579, 0};

  public NoEvents() {
    super(864, 865, ORDER);
  }

  public void set(quickfix.field.EventType value) {
    setField(value);
  }

  public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventType getEventType() throws FieldNotFound {
    return get(new quickfix.field.EventType());
  }

  public boolean isSet(quickfix.field.EventType field) {
    return isSetField(field);
  }

  public boolean isSetEventType() {
    return isSetField(865);
  }

  public void set(quickfix.field.EventDate value) {
    setField(value);
  }

  public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventDate getEventDate() throws FieldNotFound {
    return get(new quickfix.field.EventDate());
  }

  public boolean isSet(quickfix.field.EventDate field) {
    return isSetField(field);
  }

  public boolean isSetEventDate() {
    return isSetField(866);
  }

  public void set(quickfix.field.EventTime value) {
    setField(value);
  }

  public quickfix.field.EventTime get(quickfix.field.EventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTime getEventTime() throws FieldNotFound {
    return get(new quickfix.field.EventTime());
  }

  public boolean isSet(quickfix.field.EventTime field) {
    return isSetField(field);
  }

  public boolean isSetEventTime() {
    return isSetField(1145);
  }

  public void set(quickfix.field.EventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.EventTimeUnit get(quickfix.field.EventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTimeUnit getEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.EventTimeUnit());
  }

  public boolean isSet(quickfix.field.EventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetEventTimeUnit() {
    return isSetField(1827);
  }

  public void set(quickfix.field.EventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.EventTimePeriod get(quickfix.field.EventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTimePeriod getEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.EventTimePeriod());
  }

  public boolean isSet(quickfix.field.EventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetEventTimePeriod() {
    return isSetField(1826);
  }

  public void set(quickfix.field.EventMonthYear value) {
    setField(value);
  }

  public quickfix.field.EventMonthYear get(quickfix.field.EventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventMonthYear getEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EventMonthYear());
  }

  public boolean isSet(quickfix.field.EventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEventMonthYear() {
    return isSetField(2340);
  }

  public void set(quickfix.field.EventPx value) {
    setField(value);
  }

  public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventPx getEventPx() throws FieldNotFound {
    return get(new quickfix.field.EventPx());
  }

  public boolean isSet(quickfix.field.EventPx field) {
    return isSetField(field);
  }

  public boolean isSetEventPx() {
    return isSetField(867);
  }

  public void set(quickfix.field.EventText value) {
    setField(value);
  }

  public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventText getEventText() throws FieldNotFound {
    return get(new quickfix.field.EventText());
  }

  public boolean isSet(quickfix.field.EventText field) {
    return isSetField(field);
  }

  public boolean isSetEventText() {
    return isSetField(868);
  }

  public void set(quickfix.field.EncodedEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedEventTextLen get(quickfix.field.EncodedEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedEventTextLen getEncodedEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedEventTextLen() {
    return isSetField(1578);
  }

  public void set(quickfix.field.EncodedEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedEventText get(quickfix.field.EncodedEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedEventText getEncodedEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedEventText());
  }

  public boolean isSet(quickfix.field.EncodedEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedEventText() {
    return isSetField(1579);
  }
}

  public void set(quickfix.field.DatedDate value) {
    setField(value);
  }

  public quickfix.field.DatedDate get(quickfix.field.DatedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DatedDate getDatedDate() throws FieldNotFound {
    return get(new quickfix.field.DatedDate());
  }

  public boolean isSet(quickfix.field.DatedDate field) {
    return isSetField(field);
  }

  public boolean isSetDatedDate() {
    return isSetField(873);
  }

  public void set(quickfix.field.InterestAccrualDate value) {
    setField(value);
  }

  public quickfix.field.InterestAccrualDate get(quickfix.field.InterestAccrualDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
    return get(new quickfix.field.InterestAccrualDate());
  }

  public boolean isSet(quickfix.field.InterestAccrualDate field) {
    return isSetField(field);
  }

  public boolean isSetInterestAccrualDate() {
    return isSetField(874);
  }

  public void set(quickfix.fixlatest.component.InstrumentParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentParties get(quickfix.fixlatest.component.InstrumentParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentParties getInstrumentPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentParties());
  }

  public void set(quickfix.field.NoInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentParties get(quickfix.field.NoInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentParties getNoInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentParties() {
    return isSetField(1018);
  }

public static class NoInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1019, 1050, 1051, 2378, 1052, 0};

  public NoInstrumentParties() {
    super(1018, 1019, ORDER);
  }

  public void set(quickfix.field.InstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyID get(quickfix.field.InstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyID getInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyID());
  }

  public boolean isSet(quickfix.field.InstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyID() {
    return isSetField(1019);
  }

  public void set(quickfix.field.InstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyIDSource get(quickfix.field.InstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyIDSource() {
    return isSetField(1050);
  }

  public void set(quickfix.field.InstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyRole get(quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyRole getInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.InstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyRole() {
    return isSetField(1051);
  }

  public void set(quickfix.field.InstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyRoleQualifier get(quickfix.field.InstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyRoleQualifier getInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.InstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyRoleQualifier() {
    return isSetField(2378);
  }

  public void set(quickfix.fixlatest.component.InstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentPtysSubGrp get(quickfix.fixlatest.component.InstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentPtysSubGrp getInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentPartySubIDs get(quickfix.field.NoInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentPartySubIDs() {
    return isSetField(1052);
  }

public static class NoInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1053, 1054, 0};

  public NoInstrumentPartySubIDs() {
    super(1052, 1053, ORDER);
  }

  public void set(quickfix.field.InstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartySubID get(quickfix.field.InstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartySubID getInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.InstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartySubID() {
    return isSetField(1053);
  }

  public void set(quickfix.field.InstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartySubIDType get(quickfix.field.InstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartySubIDType() {
    return isSetField(1054);
  }
}
}

  public void set(quickfix.field.ShortSaleRestriction value) {
    setField(value);
  }

  public quickfix.field.ShortSaleRestriction get(quickfix.field.ShortSaleRestriction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortSaleRestriction getShortSaleRestriction() throws FieldNotFound {
    return get(new quickfix.field.ShortSaleRestriction());
  }

  public boolean isSet(quickfix.field.ShortSaleRestriction field) {
    return isSetField(field);
  }

  public boolean isSetShortSaleRestriction() {
    return isSetField(1687);
  }

  public void set(quickfix.fixlatest.component.ComplexEvents component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEvents get(quickfix.fixlatest.component.ComplexEvents component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEvents getComplexEventsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEvents());
  }

  public void set(quickfix.field.NoComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEvents get(quickfix.field.NoComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEvents getNoComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEvents() {
    return isSetField(1483);
  }

public static class NoComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1484, 2117, 2118, 2119, 1485, 2120, 2121, 2122, 1486, 2123, 1487, 1488, 1489, 1490, 1491, 2124, 2125, 2126, 2127, 2407, 2408, 2128, 2129, 2130, 2131, 2132, 41013, 41020, 41021, 41022, 41023, 41024, 41025, 41018, 41026, 41027, 41028, 41010, 2133, 2134, 2135, 2136, 2137, 41029, 40997, 2597, 2598, 2599, 2138, 2139, 0};

  public NoComplexEvents() {
    super(1483, 1484, ORDER);
  }

  public void set(quickfix.field.ComplexEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventType() {
    return isSetField(1484);
  }

  public void set(quickfix.field.ComplexOptPayoutPaySide value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutPaySide get(quickfix.field.ComplexOptPayoutPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutPaySide getComplexOptPayoutPaySide() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutPaySide());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutPaySide field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutPaySide() {
    return isSetField(2117);
  }

  public void set(quickfix.field.ComplexOptPayoutReceiveSide value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutReceiveSide get(quickfix.field.ComplexOptPayoutReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutReceiveSide getComplexOptPayoutReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutReceiveSide());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutReceiveSide() {
    return isSetField(2118);
  }

  public void set(quickfix.field.ComplexOptPayoutUnderlier value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutUnderlier get(quickfix.field.ComplexOptPayoutUnderlier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutUnderlier getComplexOptPayoutUnderlier() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutUnderlier());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutUnderlier field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutUnderlier() {
    return isSetField(2119);
  }

  public void set(quickfix.field.ComplexOptPayoutAmount value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutAmount get(quickfix.field.ComplexOptPayoutAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutAmount getComplexOptPayoutAmount() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutAmount());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutAmount field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutAmount() {
    return isSetField(1485);
  }

  public void set(quickfix.field.ComplexOptPayoutPercentage value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutPercentage get(quickfix.field.ComplexOptPayoutPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutPercentage getComplexOptPayoutPercentage() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutPercentage());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutPercentage field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutPercentage() {
    return isSetField(2120);
  }

  public void set(quickfix.field.ComplexOptPayoutTime value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutTime get(quickfix.field.ComplexOptPayoutTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutTime getComplexOptPayoutTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutTime());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutTime() {
    return isSetField(2121);
  }

  public void set(quickfix.field.ComplexOptPayoutCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexOptPayoutCurrency get(quickfix.field.ComplexOptPayoutCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexOptPayoutCurrency getComplexOptPayoutCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexOptPayoutCurrency());
  }

  public boolean isSet(quickfix.field.ComplexOptPayoutCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexOptPayoutCurrency() {
    return isSetField(2122);
  }

  public void set(quickfix.field.ComplexEventPrice value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPrice get(quickfix.field.ComplexEventPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPrice getComplexEventPrice() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPrice());
  }

  public boolean isSet(quickfix.field.ComplexEventPrice field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPrice() {
    return isSetField(1486);
  }

  public void set(quickfix.field.ComplexEventPricePercentage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPricePercentage get(quickfix.field.ComplexEventPricePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPricePercentage getComplexEventPricePercentage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPricePercentage());
  }

  public boolean isSet(quickfix.field.ComplexEventPricePercentage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPricePercentage() {
    return isSetField(2123);
  }

  public void set(quickfix.field.ComplexEventPriceBoundaryMethod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceBoundaryMethod get(quickfix.field.ComplexEventPriceBoundaryMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceBoundaryMethod getComplexEventPriceBoundaryMethod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceBoundaryMethod());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceBoundaryMethod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceBoundaryMethod() {
    return isSetField(1487);
  }

  public void set(quickfix.field.ComplexEventPriceBoundaryPrecision value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceBoundaryPrecision get(quickfix.field.ComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceBoundaryPrecision getComplexEventPriceBoundaryPrecision() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceBoundaryPrecision());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceBoundaryPrecision field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceBoundaryPrecision() {
    return isSetField(1488);
  }

  public void set(quickfix.field.ComplexEventPriceTimeType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPriceTimeType get(quickfix.field.ComplexEventPriceTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPriceTimeType getComplexEventPriceTimeType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPriceTimeType());
  }

  public boolean isSet(quickfix.field.ComplexEventPriceTimeType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPriceTimeType() {
    return isSetField(1489);
  }

  public void set(quickfix.field.ComplexEventCondition value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCondition get(quickfix.field.ComplexEventCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCondition getComplexEventCondition() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCondition());
  }

  public boolean isSet(quickfix.field.ComplexEventCondition field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCondition() {
    return isSetField(1490);
  }

  public void set(quickfix.fixlatest.component.ComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventDates get(quickfix.fixlatest.component.ComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventDates getComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventDates());
  }

  public void set(quickfix.field.NoComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventDates() {
    return isSetField(1491);
  }

public static class NoComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1492, 1493, 1494, 0};

  public NoComplexEventDates() {
    super(1491, 1492, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartDate() {
    return isSetField(1492);
  }

  public void set(quickfix.field.ComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndDate() {
    return isSetField(1493);
  }

  public void set(quickfix.fixlatest.component.ComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventTimes get(quickfix.fixlatest.component.ComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventTimes getComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventTimes());
  }

  public void set(quickfix.field.NoComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventTimes() {
    return isSetField(1494);
  }

public static class NoComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1495, 1496, 0};

  public NoComplexEventTimes() {
    super(1494, 1495, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}
}

  public void set(quickfix.field.ComplexEventCurrencyOne value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCurrencyOne get(quickfix.field.ComplexEventCurrencyOne value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCurrencyOne getComplexEventCurrencyOne() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCurrencyOne());
  }

  public boolean isSet(quickfix.field.ComplexEventCurrencyOne field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCurrencyOne() {
    return isSetField(2124);
  }

  public void set(quickfix.field.ComplexEventCurrencyTwo value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCurrencyTwo get(quickfix.field.ComplexEventCurrencyTwo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCurrencyTwo getComplexEventCurrencyTwo() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCurrencyTwo());
  }

  public boolean isSet(quickfix.field.ComplexEventCurrencyTwo field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCurrencyTwo() {
    return isSetField(2125);
  }

  public void set(quickfix.field.ComplexEventQuoteBasis value) {
    setField(value);
  }

  public quickfix.field.ComplexEventQuoteBasis get(quickfix.field.ComplexEventQuoteBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventQuoteBasis getComplexEventQuoteBasis() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventQuoteBasis());
  }

  public boolean isSet(quickfix.field.ComplexEventQuoteBasis field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventQuoteBasis() {
    return isSetField(2126);
  }

  public void set(quickfix.field.ComplexEventFixedFXRate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFixedFXRate get(quickfix.field.ComplexEventFixedFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFixedFXRate getComplexEventFixedFXRate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFixedFXRate());
  }

  public boolean isSet(quickfix.field.ComplexEventFixedFXRate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFixedFXRate() {
    return isSetField(2127);
  }

  public void set(quickfix.field.ComplexEventSpotRate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventSpotRate get(quickfix.field.ComplexEventSpotRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventSpotRate getComplexEventSpotRate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventSpotRate());
  }

  public boolean isSet(quickfix.field.ComplexEventSpotRate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventSpotRate() {
    return isSetField(2407);
  }

  public void set(quickfix.field.ComplexEventForwardPoints value) {
    setField(value);
  }

  public quickfix.field.ComplexEventForwardPoints get(quickfix.field.ComplexEventForwardPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventForwardPoints getComplexEventForwardPoints() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventForwardPoints());
  }

  public boolean isSet(quickfix.field.ComplexEventForwardPoints field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventForwardPoints() {
    return isSetField(2408);
  }

  public void set(quickfix.field.ComplexEventDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDeterminationMethod get(quickfix.field.ComplexEventDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDeterminationMethod getComplexEventDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDeterminationMethod());
  }

  public boolean isSet(quickfix.field.ComplexEventDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDeterminationMethod() {
    return isSetField(2128);
  }

  public void set(quickfix.field.ComplexEventCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCalculationAgent get(quickfix.field.ComplexEventCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCalculationAgent getComplexEventCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCalculationAgent());
  }

  public boolean isSet(quickfix.field.ComplexEventCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCalculationAgent() {
    return isSetField(2129);
  }

  public void set(quickfix.field.ComplexEventStrikePrice value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikePrice get(quickfix.field.ComplexEventStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikePrice getComplexEventStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikePrice());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikePrice() {
    return isSetField(2130);
  }

  public void set(quickfix.field.ComplexEventStrikeFactor value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikeFactor get(quickfix.field.ComplexEventStrikeFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikeFactor getComplexEventStrikeFactor() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikeFactor());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikeFactor field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikeFactor() {
    return isSetField(2131);
  }

  public void set(quickfix.field.ComplexEventStrikeNumberOfOptions value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStrikeNumberOfOptions get(quickfix.field.ComplexEventStrikeNumberOfOptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStrikeNumberOfOptions getComplexEventStrikeNumberOfOptions() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStrikeNumberOfOptions());
  }

  public boolean isSet(quickfix.field.ComplexEventStrikeNumberOfOptions field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStrikeNumberOfOptions() {
    return isSetField(2132);
  }

  public void set(quickfix.fixlatest.component.ComplexEventRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventRateSourceGrp get(quickfix.fixlatest.component.ComplexEventRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventRateSourceGrp getComplexEventRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventRateSourceGrp());
  }

  public void set(quickfix.field.NoComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventRateSources get(quickfix.field.NoComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventRateSources getNoComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventRateSources() {
    return isSetField(41013);
  }

public static class NoComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41014, 41015, 41016, 41017, 0};

  public NoComplexEventRateSources() {
    super(41013, 41014, ORDER);
  }

  public void set(quickfix.field.ComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSource get(quickfix.field.ComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSource getComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSource() {
    return isSetField(41014);
  }

  public void set(quickfix.field.ComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSourceType get(quickfix.field.ComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSourceType getComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSourceType() {
    return isSetField(41015);
  }

  public void set(quickfix.field.ComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePage get(quickfix.field.ComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePage getComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePage() {
    return isSetField(41016);
  }

  public void set(quickfix.field.ComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePageHeading get(quickfix.field.ComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePageHeading getComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePageHeading() {
    return isSetField(41017);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventRelativeDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventRelativeDate get(quickfix.fixlatest.component.ComplexEventRelativeDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventRelativeDate getComplexEventRelativeDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventRelativeDate());
  }

  public void set(quickfix.fixlatest.component.ComplexEventPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodGrp get(quickfix.fixlatest.component.ComplexEventPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodGrp getComplexEventPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriods get(quickfix.field.NoComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriods getNoComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriods() {
    return isSetField(41010);
  }

public static class NoComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41011, 41012, 41031, 41007, 40994, 0};

  public NoComplexEventPeriods() {
    super(41010, 41011, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodType get(quickfix.field.ComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodType getComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodType() {
    return isSetField(41011);
  }

  public void set(quickfix.field.ComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventBusinessCenter get(quickfix.field.ComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventBusinessCenter getComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventBusinessCenter() {
    return isSetField(41012);
  }

  public void set(quickfix.fixlatest.component.ComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp get(quickfix.fixlatest.component.ComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp getComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventSchedules get(quickfix.field.NoComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventSchedules getNoComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventSchedules() {
    return isSetField(41031);
  }

public static class NoComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41032, 41033, 41034, 41035, 41036, 0};

  public NoComplexEventSchedules() {
    super(41031, 41032, ORDER);
  }

  public void set(quickfix.field.ComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleStartDate get(quickfix.field.ComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleStartDate getComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleStartDate() {
    return isSetField(41032);
  }

  public void set(quickfix.field.ComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleEndDate get(quickfix.field.ComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleEndDate getComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleEndDate() {
    return isSetField(41033);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod get(quickfix.field.ComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod getComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyPeriod() {
    return isSetField(41034);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit get(quickfix.field.ComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit getComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyUnit() {
    return isSetField(41035);
  }

  public void set(quickfix.field.ComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleRollConvention get(quickfix.field.ComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleRollConvention getComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleRollConvention() {
    return isSetField(41036);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp get(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp getComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriodDateTimes get(quickfix.field.NoComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriodDateTimes getNoComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriodDateTimes() {
    return isSetField(41007);
  }

public static class NoComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41008, 41009, 0};

  public NoComplexEventPeriodDateTimes() {
    super(41007, 41008, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp getComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventAveragingObservations get(quickfix.field.NoComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventAveragingObservations getNoComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventAveragingObservations() {
    return isSetField(40994);
  }

public static class NoComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40995, 40996, 0};

  public NoComplexEventAveragingObservations() {
    super(40994, 40995, ORDER);
  }

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}
}

  public void set(quickfix.field.ComplexEventCreditEventsXIDRef value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventsXIDRef get(quickfix.field.ComplexEventCreditEventsXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventsXIDRef getComplexEventCreditEventsXIDRef() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventsXIDRef());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventsXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventsXIDRef() {
    return isSetField(2133);
  }

  public void set(quickfix.field.ComplexEventCreditEventNotifyingParty value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventNotifyingParty get(quickfix.field.ComplexEventCreditEventNotifyingParty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventNotifyingParty getComplexEventCreditEventNotifyingParty() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventNotifyingParty());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventNotifyingParty field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventNotifyingParty() {
    return isSetField(2134);
  }

  public void set(quickfix.field.ComplexEventCreditEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventBusinessCenter get(quickfix.field.ComplexEventCreditEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventBusinessCenter getComplexEventCreditEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventBusinessCenter() {
    return isSetField(2135);
  }

  public void set(quickfix.field.ComplexEventCreditEventStandardSources value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventStandardSources get(quickfix.field.ComplexEventCreditEventStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventStandardSources getComplexEventCreditEventStandardSources() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventStandardSources());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventStandardSources() {
    return isSetField(2136);
  }

  public void set(quickfix.field.ComplexEventCreditEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventMinimumSources get(quickfix.field.ComplexEventCreditEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventMinimumSources getComplexEventCreditEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventMinimumSources());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventMinimumSources() {
    return isSetField(2137);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp get(quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp getComplexEventCreditEventSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventSourceGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventSources get(quickfix.field.NoComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventSources getNoComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventSources() {
    return isSetField(41029);
  }

public static class NoComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41030, 0};

  public NoComplexEventCreditEventSources() {
    super(41029, 41030, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventSource get(quickfix.field.ComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventSource getComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventSource() {
    return isSetField(41030);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventGrp get(quickfix.fixlatest.component.ComplexEventCreditEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventGrp getComplexEventCreditEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEvents get(quickfix.field.NoComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEvents getNoComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEvents() {
    return isSetField(40997);
  }

public static class NoComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40998, 40999, 41000, 41001, 41002, 41003, 41004, 41005, 0};

  public NoComplexEventCreditEvents() {
    super(40997, 40998, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventType get(quickfix.field.ComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventType getComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventType() {
    return isSetField(40998);
  }

  public void set(quickfix.field.ComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventValue get(quickfix.field.ComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventValue getComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventValue() {
    return isSetField(40999);
  }

  public void set(quickfix.field.ComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventCurrency get(quickfix.field.ComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventCurrency getComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventCurrency() {
    return isSetField(41000);
  }

  public void set(quickfix.field.ComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventPeriod get(quickfix.field.ComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventPeriod getComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventPeriod() {
    return isSetField(41001);
  }

  public void set(quickfix.field.ComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventUnit get(quickfix.field.ComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventUnit getComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventUnit() {
    return isSetField(41002);
  }

  public void set(quickfix.field.ComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventDayType get(quickfix.field.ComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventDayType getComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventDayType() {
    return isSetField(41003);
  }

  public void set(quickfix.field.ComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventRateSource get(quickfix.field.ComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventRateSource getComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventRateSource() {
    return isSetField(41004);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp getComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers get(quickfix.field.NoComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers getNoComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventQualifiers() {
    return isSetField(41005);
  }

public static class NoComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41006, 0};

  public NoComplexEventCreditEventQualifiers() {
    super(41005, 41006, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}
}

  public void set(quickfix.field.ComplexEventFuturesPriceValuation value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFuturesPriceValuation get(quickfix.field.ComplexEventFuturesPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFuturesPriceValuation getComplexEventFuturesPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFuturesPriceValuation());
  }

  public boolean isSet(quickfix.field.ComplexEventFuturesPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFuturesPriceValuation() {
    return isSetField(2597);
  }

  public void set(quickfix.field.ComplexEventOptionsPriceValuation value) {
    setField(value);
  }

  public quickfix.field.ComplexEventOptionsPriceValuation get(quickfix.field.ComplexEventOptionsPriceValuation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventOptionsPriceValuation getComplexEventOptionsPriceValuation() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventOptionsPriceValuation());
  }

  public boolean isSet(quickfix.field.ComplexEventOptionsPriceValuation field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventOptionsPriceValuation() {
    return isSetField(2598);
  }

  public void set(quickfix.field.ComplexEventPVFinalPriceElectionFallback value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPVFinalPriceElectionFallback get(quickfix.field.ComplexEventPVFinalPriceElectionFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPVFinalPriceElectionFallback getComplexEventPVFinalPriceElectionFallback() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPVFinalPriceElectionFallback());
  }

  public boolean isSet(quickfix.field.ComplexEventPVFinalPriceElectionFallback field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPVFinalPriceElectionFallback() {
    return isSetField(2599);
  }

  public void set(quickfix.field.ComplexEventXID value) {
    setField(value);
  }

  public quickfix.field.ComplexEventXID get(quickfix.field.ComplexEventXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventXID getComplexEventXID() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventXID());
  }

  public boolean isSet(quickfix.field.ComplexEventXID field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventXID() {
    return isSetField(2138);
  }

  public void set(quickfix.field.ComplexEventXIDRef value) {
    setField(value);
  }

  public quickfix.field.ComplexEventXIDRef get(quickfix.field.ComplexEventXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventXIDRef getComplexEventXIDRef() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventXIDRef());
  }

  public boolean isSet(quickfix.field.ComplexEventXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventXIDRef() {
    return isSetField(2139);
  }
}

  public void set(quickfix.field.RefTickTableID value) {
    setField(value);
  }

  public quickfix.field.RefTickTableID get(quickfix.field.RefTickTableID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefTickTableID getRefTickTableID() throws FieldNotFound {
    return get(new quickfix.field.RefTickTableID());
  }

  public boolean isSet(quickfix.field.RefTickTableID field) {
    return isSetField(field);
  }

  public boolean isSetRefTickTableID() {
    return isSetField(1787);
  }

  public void set(quickfix.field.StrategyType value) {
    setField(value);
  }

  public quickfix.field.StrategyType get(quickfix.field.StrategyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyType getStrategyType() throws FieldNotFound {
    return get(new quickfix.field.StrategyType());
  }

  public boolean isSet(quickfix.field.StrategyType field) {
    return isSetField(field);
  }

  public boolean isSetStrategyType() {
    return isSetField(2141);
  }

  public void set(quickfix.field.CommonPricingIndicator value) {
    setField(value);
  }

  public quickfix.field.CommonPricingIndicator get(quickfix.field.CommonPricingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommonPricingIndicator getCommonPricingIndicator() throws FieldNotFound {
    return get(new quickfix.field.CommonPricingIndicator());
  }

  public boolean isSet(quickfix.field.CommonPricingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCommonPricingIndicator() {
    return isSetField(2142);
  }

  public void set(quickfix.field.SettlDisruptionProvision value) {
    setField(value);
  }

  public quickfix.field.SettlDisruptionProvision get(quickfix.field.SettlDisruptionProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDisruptionProvision getSettlDisruptionProvision() throws FieldNotFound {
    return get(new quickfix.field.SettlDisruptionProvision());
  }

  public boolean isSet(quickfix.field.SettlDisruptionProvision field) {
    return isSetField(field);
  }

  public boolean isSetSettlDisruptionProvision() {
    return isSetField(2143);
  }

  public void set(quickfix.field.DeliveryRouteOrCharter value) {
    setField(value);
  }

  public quickfix.field.DeliveryRouteOrCharter get(quickfix.field.DeliveryRouteOrCharter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryRouteOrCharter getDeliveryRouteOrCharter() throws FieldNotFound {
    return get(new quickfix.field.DeliveryRouteOrCharter());
  }

  public boolean isSet(quickfix.field.DeliveryRouteOrCharter field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryRouteOrCharter() {
    return isSetField(2752);
  }

  public void set(quickfix.field.InstrumentRoundingDirection value) {
    setField(value);
  }

  public quickfix.field.InstrumentRoundingDirection get(quickfix.field.InstrumentRoundingDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentRoundingDirection getInstrumentRoundingDirection() throws FieldNotFound {
    return get(new quickfix.field.InstrumentRoundingDirection());
  }

  public boolean isSet(quickfix.field.InstrumentRoundingDirection field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentRoundingDirection() {
    return isSetField(2144);
  }

  public void set(quickfix.field.InstrumentRoundingPrecision value) {
    setField(value);
  }

  public quickfix.field.InstrumentRoundingPrecision get(quickfix.field.InstrumentRoundingPrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentRoundingPrecision getInstrumentRoundingPrecision() throws FieldNotFound {
    return get(new quickfix.field.InstrumentRoundingPrecision());
  }

  public boolean isSet(quickfix.field.InstrumentRoundingPrecision field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentRoundingPrecision() {
    return isSetField(2145);
  }

  public void set(quickfix.field.InstrumentPricePrecision value) {
    setField(value);
  }

  public quickfix.field.InstrumentPricePrecision get(quickfix.field.InstrumentPricePrecision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPricePrecision getInstrumentPricePrecision() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPricePrecision());
  }

  public boolean isSet(quickfix.field.InstrumentPricePrecision field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPricePrecision() {
    return isSetField(2576);
  }

  public void set(quickfix.fixlatest.component.DateAdjustment component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DateAdjustment get(quickfix.fixlatest.component.DateAdjustment component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DateAdjustment getDateAdjustmentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DateAdjustment());
  }

  public void set(quickfix.fixlatest.component.PricingDateTime component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PricingDateTime get(quickfix.fixlatest.component.PricingDateTime component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PricingDateTime getPricingDateTimeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PricingDateTime());
  }

  public void set(quickfix.fixlatest.component.MarketDisruption component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketDisruption get(quickfix.fixlatest.component.MarketDisruption component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketDisruption getMarketDisruptionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketDisruption());
  }

  public void set(quickfix.fixlatest.component.OptionExercise component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExercise get(quickfix.fixlatest.component.OptionExercise component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExercise getOptionExerciseComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExercise());
  }

  public void set(quickfix.fixlatest.component.StreamGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamGrp get(quickfix.fixlatest.component.StreamGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamGrp getStreamGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamGrp());
  }

  public void set(quickfix.field.NoStreams value) {
    setField(value);
  }

  public quickfix.field.NoStreams get(quickfix.field.NoStreams value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreams getNoStreams() throws FieldNotFound {
    return get(new quickfix.field.NoStreams());
  }

  public boolean isSet(quickfix.field.NoStreams field) {
    return isSetField(field);
  }

  public boolean isSetNoStreams() {
    return isSetField(40049);
  }

public static class NoStreams extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40050, 41303, 40051, 42784, 42785, 40052, 40053, 41305, 40054, 40055, 42786, 42787, 41306, 41307, 41308, 41309, 41310, 41311, 41251, 41252, 41253, 41254, 41277, 41255, 41256, 41257, 42587, 41237, 41258, 41259, 41260, 41261, 41262, 41263, 41264, 41280, 41265, 41266, 41267, 41268, 41269, 41249, 41270, 41271, 41272, 41273, 41274, 41289, 41275, 41276, 40907, 40908, 40960, 40910, 40911, 40912, 40913, 40914, 40065, 40066, 40961, 40068, 40069, 40070, 40071, 40072, 41244, 41245, 40073, 40958, 41241, 40075, 40076, 40959, 40078, 40079, 40080, 40081, 40082, 40083, 40084, 41246, 41247, 41248, 40738, 40739, 40740, 42600, 40741, 40742, 43106, 40743, 40744, 40745, 40746, 40747, 42601, 42602, 42603, 42604, 40748, 40749, 40750, 41180, 41181, 41182, 41183, 41184, 41185, 41186, 40751, 40947, 41220, 40753, 40754, 40755, 40756, 40757, 40758, 40759, 40760, 40920, 41223, 42654, 42655, 42656, 42657, 42658, 42659, 40761, 40762, 40948, 40764, 40765, 40766, 40767, 40768, 40949, 40770, 40771, 40772, 40773, 40774, 40775, 40950, 40777, 40778, 40779, 40780, 40781, 40782, 40783, 42660, 40784, 40785, 40786, 41187, 41188, 40787, 40788, 41189, 41190, 41191, 40789, 40790, 43090, 43091, 40791, 40792, 41194, 41195, 41196, 41197, 41198, 41199, 41200, 41201, 41202, 40793, 40794, 41203, 41204, 41205, 41206, 40795, 40796, 40797, 40798, 40799, 40800, 40801, 40802, 40803, 41207, 41208, 40804, 40805, 40806, 40807, 41209, 41210, 42663, 42664, 42665, 41211, 41212, 42666, 41213, 41214, 41215, 41216, 41217, 41192, 41227, 41224, 40808, 40809, 40810, 40811, 40812, 40813, 40814, 40815, 40816, 42667, 42686, 42687, 42688, 42683, 42652, 42653, 42245, 42246, 42247, 42248, 42274, 42249, 42250, 42251, 42252, 42265, 42266, 42267, 42268, 42269, 42270, 42272, 42271, 42218, 42219, 42220, 42221, 42222, 42223, 42224, 42225, 42226, 42227, 42228, 42229, 42230, 42231, 42232, 42233, 42234, 42235, 42253, 42238, 42239, 42240, 42241, 42242, 42243, 42236, 42244, 42254, 42255, 42256, 42257, 42258, 42259, 42260, 42261, 42262, 42263, 42264, 42668, 42735, 42669, 42670, 42671, 42672, 42673, 42674, 42675, 42676, 42677, 42678, 42679, 42680, 42681, 42682, 42605, 42628, 42629, 42630, 42631, 42632, 42633, 42634, 42635, 42636, 42637, 42638, 42639, 42640, 42641, 42642, 42643, 42644, 42645, 42609, 42620, 42606, 42610, 42611, 42612, 42613, 42614, 42646, 42647, 42648, 42649, 42650, 42651, 42622, 42623, 42624, 42625, 42626, 42627, 42615, 42616, 42617, 42618, 42619, 40817, 40818, 40946, 40820, 40821, 40822, 40823, 40371, 40372, 40825, 40085, 40828, 40872, 41058, 41085, 41059, 41060, 41061, 41062, 42192, 42193, 41063, 41064, 41065, 41066, 41067, 41218, 41081, 41068, 41069, 41070, 41071, 41072, 41073, 41074, 41075, 41076, 41077, 41078, 41079, 41080, 43094, 41037, 40056, 40982, 40983, 0};

  public NoStreams() {
    super(40049, 40050, ORDER);
  }

  public void set(quickfix.field.StreamType value) {
    setField(value);
  }

  public quickfix.field.StreamType get(quickfix.field.StreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamType getStreamType() throws FieldNotFound {
    return get(new quickfix.field.StreamType());
  }

  public boolean isSet(quickfix.field.StreamType field) {
    return isSetField(field);
  }

  public boolean isSetStreamType() {
    return isSetField(40050);
  }

  public void set(quickfix.field.StreamXID value) {
    setField(value);
  }

  public quickfix.field.StreamXID get(quickfix.field.StreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamXID getStreamXID() throws FieldNotFound {
    return get(new quickfix.field.StreamXID());
  }

  public boolean isSet(quickfix.field.StreamXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamXID() {
    return isSetField(41303);
  }

  public void set(quickfix.field.StreamDesc value) {
    setField(value);
  }

  public quickfix.field.StreamDesc get(quickfix.field.StreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamDesc getStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.StreamDesc());
  }

  public boolean isSet(quickfix.field.StreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetStreamDesc() {
    return isSetField(40051);
  }

  public void set(quickfix.field.StreamVersion value) {
    setField(value);
  }

  public quickfix.field.StreamVersion get(quickfix.field.StreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamVersion getStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.StreamVersion());
  }

  public boolean isSet(quickfix.field.StreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetStreamVersion() {
    return isSetField(42784);
  }

  public void set(quickfix.field.StreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.StreamVersionEffectiveDate get(quickfix.field.StreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamVersionEffectiveDate getStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.StreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.StreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetStreamVersionEffectiveDate() {
    return isSetField(42785);
  }

  public void set(quickfix.field.StreamPaySide value) {
    setField(value);
  }

  public quickfix.field.StreamPaySide get(quickfix.field.StreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamPaySide getStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.StreamPaySide());
  }

  public boolean isSet(quickfix.field.StreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetStreamPaySide() {
    return isSetField(40052);
  }

  public void set(quickfix.field.StreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.StreamReceiveSide get(quickfix.field.StreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamReceiveSide getStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.StreamReceiveSide());
  }

  public boolean isSet(quickfix.field.StreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetStreamReceiveSide() {
    return isSetField(40053);
  }

  public void set(quickfix.field.StreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalXIDRef get(quickfix.field.StreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalXIDRef getStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.StreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalXIDRef() {
    return isSetField(41305);
  }

  public void set(quickfix.field.StreamNotional value) {
    setField(value);
  }

  public quickfix.field.StreamNotional get(quickfix.field.StreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotional getStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamNotional());
  }

  public boolean isSet(quickfix.field.StreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotional() {
    return isSetField(40054);
  }

  public void set(quickfix.field.StreamCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCurrency get(quickfix.field.StreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCurrency getStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCurrency());
  }

  public boolean isSet(quickfix.field.StreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCurrency() {
    return isSetField(40055);
  }

  public void set(quickfix.field.StreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalDeterminationMethod get(quickfix.field.StreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalDeterminationMethod getStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.StreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalDeterminationMethod() {
    return isSetField(42786);
  }

  public void set(quickfix.field.StreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalAdjustments get(quickfix.field.StreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalAdjustments getStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.StreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalAdjustments() {
    return isSetField(42787);
  }

  public void set(quickfix.field.StreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalFrequencyPeriod get(quickfix.field.StreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalFrequencyPeriod getStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalFrequencyPeriod() {
    return isSetField(41306);
  }

  public void set(quickfix.field.StreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalFrequencyUnit get(quickfix.field.StreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalFrequencyUnit getStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalFrequencyUnit() {
    return isSetField(41307);
  }

  public void set(quickfix.field.StreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalCommodityFrequency get(quickfix.field.StreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalCommodityFrequency getStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.StreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalCommodityFrequency() {
    return isSetField(41308);
  }

  public void set(quickfix.field.StreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalUnitOfMeasure get(quickfix.field.StreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalUnitOfMeasure getStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalUnitOfMeasure() {
    return isSetField(41309);
  }

  public void set(quickfix.field.StreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.StreamTotalNotional get(quickfix.field.StreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTotalNotional getStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamTotalNotional());
  }

  public boolean isSet(quickfix.field.StreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamTotalNotional() {
    return isSetField(41310);
  }

  public void set(quickfix.field.StreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamTotalNotionalUnitOfMeasure get(quickfix.field.StreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTotalNotionalUnitOfMeasure getStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamTotalNotionalUnitOfMeasure() {
    return isSetField(41311);
  }

  public void set(quickfix.fixlatest.component.StreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommodity get(quickfix.fixlatest.component.StreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommodity getStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommodity());
  }

  public void set(quickfix.fixlatest.component.StreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamEffectiveDate get(quickfix.fixlatest.component.StreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamEffectiveDate getStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.StreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamTerminationDate get(quickfix.fixlatest.component.StreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamTerminationDate getStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.StreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDates get(quickfix.fixlatest.component.StreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDates getStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.PaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStream get(quickfix.fixlatest.component.PaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStream getPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStream());
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleGrp get(quickfix.fixlatest.component.PaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleGrp getPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleGrp());
  }

  public void set(quickfix.field.NoPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSchedules get(quickfix.field.NoPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSchedules getNoPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSchedules() {
    return isSetField(40828);
  }

public static class NoPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40829, 41164, 41165, 40830, 40831, 40832, 40833, 40834, 40835, 40836, 40837, 40838, 40839, 41166, 41167, 41168, 41169, 40840, 40841, 40842, 40843, 41170, 41171, 41172, 41173, 40844, 40845, 40846, 40847, 40848, 40849, 40868, 40850, 40851, 40852, 40853, 40977, 40855, 40856, 40857, 41174, 41175, 40858, 41161, 41176, 41177, 41178, 41179, 40859, 40860, 40861, 40862, 40945, 40864, 40865, 40866, 40867, 0};

  public NoPaymentSchedules() {
    super(40828, 40829, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleType get(quickfix.field.PaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleType getPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleType() {
    return isSetField(40829);
  }

  public void set(quickfix.field.PaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXID get(quickfix.field.PaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXID getPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXID() {
    return isSetField(41164);
  }

  public void set(quickfix.field.PaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXIDRef get(quickfix.field.PaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXIDRef getPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXIDRef() {
    return isSetField(41165);
  }

  public void set(quickfix.field.PaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStubType get(quickfix.field.PaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStubType getPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStubType() {
    return isSetField(40830);
  }

  public void set(quickfix.field.PaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted get(quickfix.field.PaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted getPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStartDateUnadjusted() {
    return isSetField(40831);
  }

  public void set(quickfix.field.PaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted get(quickfix.field.PaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted getPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleEndDateUnadjusted() {
    return isSetField(40832);
  }

  public void set(quickfix.field.PaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentSchedulePaySide get(quickfix.field.PaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSchedulePaySide getPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.PaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSchedulePaySide() {
    return isSetField(40833);
  }

  public void set(quickfix.field.PaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReceiveSide get(quickfix.field.PaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReceiveSide getPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReceiveSide() {
    return isSetField(40834);
  }

  public void set(quickfix.field.PaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleNotional get(quickfix.field.PaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleNotional getPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.PaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleNotional() {
    return isSetField(40835);
  }

  public void set(quickfix.field.PaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleCurrency get(quickfix.field.PaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleCurrency getPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleCurrency() {
    return isSetField(40836);
  }

  public void set(quickfix.field.PaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRate get(quickfix.field.PaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRate getPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRate() {
    return isSetField(40837);
  }

  public void set(quickfix.field.PaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateMultiplier get(quickfix.field.PaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateMultiplier getPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateMultiplier() {
    return isSetField(40838);
  }

  public void set(quickfix.field.PaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpread get(quickfix.field.PaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpread getPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpread() {
    return isSetField(40839);
  }

  public void set(quickfix.field.PaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateCurrency get(quickfix.field.PaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateCurrency getPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateCurrency() {
    return isSetField(41166);
  }

  public void set(quickfix.field.PaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure get(quickfix.field.PaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure getPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41167);
  }

  public void set(quickfix.field.PaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateConversionFactor get(quickfix.field.PaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateConversionFactor getPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateConversionFactor() {
    return isSetField(41168);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadType get(quickfix.field.PaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadType getPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadType() {
    return isSetField(41169);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType get(quickfix.field.PaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType getPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadPositionType() {
    return isSetField(40840);
  }

  public void set(quickfix.field.PaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateTreatment get(quickfix.field.PaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateTreatment getPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateTreatment() {
    return isSetField(40841);
  }

  public void set(quickfix.field.PaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedAmount get(quickfix.field.PaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedAmount getPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedAmount() {
    return isSetField(40842);
  }

  public void set(quickfix.field.PaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedCurrency get(quickfix.field.PaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedCurrency getPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedCurrency() {
    return isSetField(40843);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice get(quickfix.field.PaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice getPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPrice() {
    return isSetField(41170);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency getPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41171);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure getPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41172);
  }

  public void set(quickfix.field.PaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure get(quickfix.field.PaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure getPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41173);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod get(quickfix.field.PaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod getPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40844);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit get(quickfix.field.PaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit getPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyUnit() {
    return isSetField(40845);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetValue get(quickfix.field.PaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetValue getPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetValue() {
    return isSetField(40846);
  }

  public void set(quickfix.field.PaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRate get(quickfix.field.PaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRate getPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRate() {
    return isSetField(40847);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetRate get(quickfix.field.PaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetRate getPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetRate() {
    return isSetField(40848);
  }

  public void set(quickfix.field.PaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRelativeTo get(quickfix.field.PaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRelativeTo getPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRelativeTo() {
    return isSetField(40849);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp getPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleRateSources get(quickfix.field.NoPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleRateSources getNoPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleRateSources() {
    return isSetField(40868);
  }

public static class NoPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40869, 40870, 40871, 0};

  public NoPaymentScheduleRateSources() {
    super(40868, 40869, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted get(quickfix.field.PaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted getPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40850);
  }

  public void set(quickfix.field.PaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleWeight get(quickfix.field.PaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleWeight getPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.PaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleWeight() {
    return isSetField(40851);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo get(quickfix.field.PaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo getPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40852);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention getPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40853);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp getPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters getNoPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40977);
  }

public static class NoPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40854, 0};

  public NoPaymentScheduleFixingDateBusinessCenters() {
    super(40977, 40854, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod getPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40855);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit get(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit getPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40856);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType get(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType getPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40857);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution get(quickfix.field.PaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution getPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayDistribution() {
    return isSetField(41174);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayCount get(quickfix.field.PaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayCount getPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayCount() {
    return isSetField(41175);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted get(quickfix.field.PaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted getPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateAdjusted() {
    return isSetField(40858);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp getPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDays get(quickfix.field.NoPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDays getNoPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDays() {
    return isSetField(41161);
  }

public static class NoPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41162, 41163, 0};

  public NoPaymentScheduleFixingDays() {
    super(41161, 41162, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod get(quickfix.field.PaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod getPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagPeriod() {
    return isSetField(41176);
  }

  public void set(quickfix.field.PaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagUnit get(quickfix.field.PaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagUnit getPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagUnit() {
    return isSetField(41177);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod getPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41178);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit getPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41179);
  }

  public void set(quickfix.field.PaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTime get(quickfix.field.PaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTime getPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTime() {
    return isSetField(40859);
  }

  public void set(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter get(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter getPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40860);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo getPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40861);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention getPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40862);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp getPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters getNoPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40945);
  }

public static class NoPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40863, 0};

  public NoPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40945, 40863, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod getPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40864);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit getPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40865);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType getPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40866);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted getPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40867);
  }
}

  public void set(quickfix.fixlatest.component.PaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubGrp get(quickfix.fixlatest.component.PaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubGrp getPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubGrp());
  }

  public void set(quickfix.field.NoPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubs get(quickfix.field.NoPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubs getNoPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubs() {
    return isSetField(40872);
  }

public static class NoPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40873, 40874, 42698, 42699, 42705, 42700, 42701, 42702, 42703, 42704, 42689, 42690, 42696, 42691, 42692, 42693, 42694, 42695, 40875, 40876, 40877, 40878, 40879, 40880, 40881, 40882, 40883, 40884, 40885, 40886, 40887, 40888, 40889, 40890, 40891, 40892, 40893, 40894, 40895, 40896, 40897, 40898, 40899, 40900, 40901, 0};

  public NoPaymentStubs() {
    super(40872, 40873, ORDER);
  }

  public void set(quickfix.field.PaymentStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubType get(quickfix.field.PaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubType getPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubType());
  }

  public boolean isSet(quickfix.field.PaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubType() {
    return isSetField(40873);
  }

  public void set(quickfix.field.PaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStubLength get(quickfix.field.PaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubLength getPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubLength());
  }

  public boolean isSet(quickfix.field.PaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubLength() {
    return isSetField(40874);
  }

  public void set(quickfix.fixlatest.component.PaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubStartDate get(quickfix.fixlatest.component.PaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubStartDate getPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.PaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubEndDate get(quickfix.fixlatest.component.PaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubEndDate getPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubEndDate());
  }

  public void set(quickfix.field.PaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubRate get(quickfix.field.PaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubRate getPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubRate());
  }

  public boolean isSet(quickfix.field.PaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubRate() {
    return isSetField(40875);
  }

  public void set(quickfix.field.PaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedAmount get(quickfix.field.PaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedAmount getPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedAmount() {
    return isSetField(40876);
  }

  public void set(quickfix.field.PaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedCurrency get(quickfix.field.PaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedCurrency getPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedCurrency() {
    return isSetField(40877);
  }

  public void set(quickfix.field.PaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex get(quickfix.field.PaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex getPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex() {
    return isSetField(40878);
  }

  public void set(quickfix.field.PaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexSource get(quickfix.field.PaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexSource getPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexSource() {
    return isSetField(40879);
  }

  public void set(quickfix.field.PaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurvePeriod get(quickfix.field.PaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurvePeriod getPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurvePeriod() {
    return isSetField(40880);
  }

  public void set(quickfix.field.PaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurveUnit get(quickfix.field.PaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurveUnit getPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurveUnit() {
    return isSetField(40881);
  }

  public void set(quickfix.field.PaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateMultiplier get(quickfix.field.PaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateMultiplier getPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateMultiplier() {
    return isSetField(40882);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpread get(quickfix.field.PaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpread getPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpread() {
    return isSetField(40883);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType get(quickfix.field.PaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType getPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40884);
  }

  public void set(quickfix.field.PaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateTreatment get(quickfix.field.PaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateTreatment getPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateTreatment() {
    return isSetField(40885);
  }

  public void set(quickfix.field.PaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRate get(quickfix.field.PaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRate getPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRate() {
    return isSetField(40886);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide get(quickfix.field.PaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide getPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateBuySide() {
    return isSetField(40887);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide get(quickfix.field.PaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide getPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateSellSide() {
    return isSetField(40888);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRate get(quickfix.field.PaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRate getPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRate() {
    return isSetField(40889);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide get(quickfix.field.PaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide getPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateBuySide() {
    return isSetField(40890);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide get(quickfix.field.PaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide getPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateSellSide() {
    return isSetField(40891);
  }

  public void set(quickfix.field.PaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2 get(quickfix.field.PaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2 getPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2() {
    return isSetField(40892);
  }

  public void set(quickfix.field.PaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2Source get(quickfix.field.PaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2Source getPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2Source() {
    return isSetField(40893);
  }

  public void set(quickfix.field.PaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod get(quickfix.field.PaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod getPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurvePeriod() {
    return isSetField(40894);
  }

  public void set(quickfix.field.PaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurveUnit get(quickfix.field.PaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurveUnit getPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurveUnit() {
    return isSetField(40895);
  }

  public void set(quickfix.field.PaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier get(quickfix.field.PaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier getPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateMultiplier() {
    return isSetField(40896);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpread get(quickfix.field.PaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpread getPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpread() {
    return isSetField(40897);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType get(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType getPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40898);
  }

  public void set(quickfix.field.PaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateTreatment get(quickfix.field.PaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateTreatment getPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateTreatment() {
    return isSetField(40899);
  }

  public void set(quickfix.field.PaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CapRate get(quickfix.field.PaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CapRate getPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CapRate() {
    return isSetField(40900);
  }

  public void set(quickfix.field.PaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2FloorRate get(quickfix.field.PaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2FloorRate getPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2FloorRate() {
    return isSetField(40901);
  }
}

  public void set(quickfix.fixlatest.component.DeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryStream get(quickfix.fixlatest.component.DeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryStream getDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryStream());
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleGrp get(quickfix.fixlatest.component.DeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleGrp getDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoDeliverySchedules get(quickfix.field.NoDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliverySchedules getNoDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliverySchedules() {
    return isSetField(41037);
  }

public static class NoDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41038, 41039, 41040, 41041, 41042, 41043, 41044, 41045, 41046, 41047, 41048, 41049, 41050, 41051, 0};

  public NoDeliverySchedules() {
    super(41037, 41038, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleType get(quickfix.field.DeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleType getDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleType() {
    return isSetField(41038);
  }

  public void set(quickfix.field.DeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleXID get(quickfix.field.DeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleXID getDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleXID() {
    return isSetField(41039);
  }

  public void set(quickfix.field.DeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotional get(quickfix.field.DeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotional getDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotional() {
    return isSetField(41040);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure getDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41041);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency get(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency getDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41042);
  }

  public void set(quickfix.field.DeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance get(quickfix.field.DeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance getDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNegativeTolerance() {
    return isSetField(41043);
  }

  public void set(quickfix.field.DeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliverySchedulePositiveTolerance get(quickfix.field.DeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliverySchedulePositiveTolerance getDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliverySchedulePositiveTolerance() {
    return isSetField(41044);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure getDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41045);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceType get(quickfix.field.DeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceType getDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceType() {
    return isSetField(41046);
  }

  public void set(quickfix.field.DeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlCountry get(quickfix.field.DeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlCountry getDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlCountry() {
    return isSetField(41047);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone get(quickfix.field.DeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone getDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeZone() {
    return isSetField(41048);
  }

  public void set(quickfix.field.DeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlFlowType get(quickfix.field.DeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlFlowType getDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlFlowType() {
    return isSetField(41049);
  }

  public void set(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction getDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41050);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp getDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlDays get(quickfix.field.NoDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlDays getNoDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlDays() {
    return isSetField(41051);
  }

public static class NoDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41052, 41053, 41054, 0};

  public NoDeliveryScheduleSettlDays() {
    super(41051, 41052, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlDay get(quickfix.field.DeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlDay getDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlDay() {
    return isSetField(41052);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours get(quickfix.field.DeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours getDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTotalHours() {
    return isSetField(41053);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp getDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes get(quickfix.field.NoDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes getNoDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlTimes() {
    return isSetField(41054);
  }

public static class NoDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41055, 41056, 41057, 0};

  public NoDeliveryScheduleSettlTimes() {
    super(41054, 41055, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlStart get(quickfix.field.DeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlStart getDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlStart() {
    return isSetField(41055);
  }

  public void set(quickfix.field.DeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlEnd get(quickfix.field.DeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlEnd getDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlEnd() {
    return isSetField(41056);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeType get(quickfix.field.DeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeType getDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeType() {
    return isSetField(41057);
  }
}
}
}

  public void set(quickfix.field.StreamText value) {
    setField(value);
  }

  public quickfix.field.StreamText get(quickfix.field.StreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamText getStreamText() throws FieldNotFound {
    return get(new quickfix.field.StreamText());
  }

  public boolean isSet(quickfix.field.StreamText field) {
    return isSetField(field);
  }

  public boolean isSetStreamText() {
    return isSetField(40056);
  }

  public void set(quickfix.field.EncodedStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamTextLen get(quickfix.field.EncodedStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamTextLen getEncodedStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamTextLen() {
    return isSetField(40982);
  }

  public void set(quickfix.field.EncodedStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamText get(quickfix.field.EncodedStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamText getEncodedStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamText());
  }

  public boolean isSet(quickfix.field.EncodedStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamText() {
    return isSetField(40983);
  }
}

  public void set(quickfix.fixlatest.component.ProvisionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionGrp get(quickfix.fixlatest.component.ProvisionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionGrp getProvisionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionGrp());
  }

  public void set(quickfix.field.NoProvisions value) {
    setField(value);
  }

  public quickfix.field.NoProvisions get(quickfix.field.NoProvisions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisions getNoProvisions() throws FieldNotFound {
    return get(new quickfix.field.NoProvisions());
  }

  public boolean isSet(quickfix.field.NoProvisions field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisions() {
    return isSetField(40090);
  }

public static class NoProvisions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40091, 40092, 40093, 40957, 40095, 40096, 40097, 42707, 42708, 40098, 40099, 40100, 40114, 40115, 40116, 40953, 40118, 40119, 40120, 40121, 40122, 40123, 40954, 40142, 40125, 40126, 40127, 40128, 40129, 40130, 40131, 40132, 40133, 40134, 40135, 40136, 40137, 40138, 40139, 40140, 40141, 40145, 40146, 40955, 40148, 40149, 40150, 40151, 40152, 40153, 40154, 40155, 40156, 40956, 40158, 40159, 40160, 40161, 40162, 40101, 40102, 40103, 40104, 40105, 40106, 40107, 40163, 40952, 40165, 40166, 40167, 40168, 40169, 40170, 40171, 40108, 40109, 40110, 40111, 40112, 41406, 40113, 40986, 40987, 40174, 0};

  public NoProvisions() {
    super(40090, 40091, ORDER);
  }

  public void set(quickfix.field.ProvisionType value) {
    setField(value);
  }

  public quickfix.field.ProvisionType get(quickfix.field.ProvisionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionType getProvisionType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionType());
  }

  public boolean isSet(quickfix.field.ProvisionType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionType() {
    return isSetField(40091);
  }

  public void set(quickfix.field.ProvisionDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateUnadjusted get(quickfix.field.ProvisionDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateUnadjusted getProvisionDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateUnadjusted() {
    return isSetField(40092);
  }

  public void set(quickfix.field.ProvisionDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessDayConvention get(quickfix.field.ProvisionDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessDayConvention getProvisionDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessDayConvention() {
    return isSetField(40093);
  }

  public void set(quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp getProvisionDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionDateBusinessCenters get(quickfix.field.NoProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionDateBusinessCenters getNoProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionDateBusinessCenters() {
    return isSetField(40957);
  }

public static class NoProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40094, 0};

  public NoProvisionDateBusinessCenters() {
    super(40957, 40094, ORDER);
  }

  public void set(quickfix.field.ProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateBusinessCenter get(quickfix.field.ProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateBusinessCenter getProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateBusinessCenter() {
    return isSetField(40094);
  }
}

  public void set(quickfix.field.ProvisionDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateAdjusted get(quickfix.field.ProvisionDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateAdjusted getProvisionDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateAdjusted() {
    return isSetField(40095);
  }

  public void set(quickfix.field.ProvisionDateTenorPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateTenorPeriod get(quickfix.field.ProvisionDateTenorPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateTenorPeriod getProvisionDateTenorPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateTenorPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionDateTenorPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateTenorPeriod() {
    return isSetField(40096);
  }

  public void set(quickfix.field.ProvisionDateTenorUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionDateTenorUnit get(quickfix.field.ProvisionDateTenorUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionDateTenorUnit getProvisionDateTenorUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionDateTenorUnit());
  }

  public boolean isSet(quickfix.field.ProvisionDateTenorUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionDateTenorUnit() {
    return isSetField(40097);
  }

  public void set(quickfix.field.ProvisionBreakFeeElection value) {
    setField(value);
  }

  public quickfix.field.ProvisionBreakFeeElection get(quickfix.field.ProvisionBreakFeeElection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionBreakFeeElection getProvisionBreakFeeElection() throws FieldNotFound {
    return get(new quickfix.field.ProvisionBreakFeeElection());
  }

  public boolean isSet(quickfix.field.ProvisionBreakFeeElection field) {
    return isSetField(field);
  }

  public boolean isSetProvisionBreakFeeElection() {
    return isSetField(42707);
  }

  public void set(quickfix.field.ProvisionBreakFeeRate value) {
    setField(value);
  }

  public quickfix.field.ProvisionBreakFeeRate get(quickfix.field.ProvisionBreakFeeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionBreakFeeRate getProvisionBreakFeeRate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionBreakFeeRate());
  }

  public boolean isSet(quickfix.field.ProvisionBreakFeeRate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionBreakFeeRate() {
    return isSetField(42708);
  }

  public void set(quickfix.field.ProvisionCalculationAgent value) {
    setField(value);
  }

  public quickfix.field.ProvisionCalculationAgent get(quickfix.field.ProvisionCalculationAgent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCalculationAgent getProvisionCalculationAgent() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCalculationAgent());
  }

  public boolean isSet(quickfix.field.ProvisionCalculationAgent field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCalculationAgent() {
    return isSetField(40098);
  }

  public void set(quickfix.field.ProvisionOptionSinglePartyBuyerSide value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionSinglePartyBuyerSide get(quickfix.field.ProvisionOptionSinglePartyBuyerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionSinglePartyBuyerSide getProvisionOptionSinglePartyBuyerSide() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionSinglePartyBuyerSide());
  }

  public boolean isSet(quickfix.field.ProvisionOptionSinglePartyBuyerSide field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionSinglePartyBuyerSide() {
    return isSetField(40099);
  }

  public void set(quickfix.field.ProvisionOptionSinglePartySellerSide value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionSinglePartySellerSide get(quickfix.field.ProvisionOptionSinglePartySellerSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionSinglePartySellerSide getProvisionOptionSinglePartySellerSide() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionSinglePartySellerSide());
  }

  public boolean isSet(quickfix.field.ProvisionOptionSinglePartySellerSide field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionSinglePartySellerSide() {
    return isSetField(40100);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlValueDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDates get(quickfix.fixlatest.component.ProvisionCashSettlValueDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlValueDates getProvisionCashSettlValueDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlValueDates());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseDates get(quickfix.fixlatest.component.ProvisionOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseDates getProvisionOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExpirationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDate get(quickfix.fixlatest.component.ProvisionOptionExpirationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDate getProvisionOptionExpirationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExpirationDate());
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate get(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate getProvisionOptionRelevantUnderlyingDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDate());
  }

  public void set(quickfix.field.ProvisionOptionExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStyle get(quickfix.field.ProvisionOptionExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStyle getProvisionOptionExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStyle());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStyle() {
    return isSetField(40101);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMultipleNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMultipleNotional get(quickfix.field.ProvisionOptionExerciseMultipleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMultipleNotional getProvisionOptionExerciseMultipleNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMultipleNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMultipleNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMultipleNotional() {
    return isSetField(40102);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMinimumNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMinimumNotional get(quickfix.field.ProvisionOptionExerciseMinimumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMinimumNotional getProvisionOptionExerciseMinimumNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMinimumNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMinimumNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMinimumNotional() {
    return isSetField(40103);
  }

  public void set(quickfix.field.ProvisionOptionExerciseMaximumNotional value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseMaximumNotional get(quickfix.field.ProvisionOptionExerciseMaximumNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseMaximumNotional getProvisionOptionExerciseMaximumNotional() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseMaximumNotional());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseMaximumNotional field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseMaximumNotional() {
    return isSetField(40104);
  }

  public void set(quickfix.field.ProvisionOptionMinimumNumber value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionMinimumNumber get(quickfix.field.ProvisionOptionMinimumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionMinimumNumber getProvisionOptionMinimumNumber() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionMinimumNumber());
  }

  public boolean isSet(quickfix.field.ProvisionOptionMinimumNumber field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionMinimumNumber() {
    return isSetField(40105);
  }

  public void set(quickfix.field.ProvisionOptionMaximumNumber value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionMaximumNumber get(quickfix.field.ProvisionOptionMaximumNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionMaximumNumber getProvisionOptionMaximumNumber() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionMaximumNumber());
  }

  public boolean isSet(quickfix.field.ProvisionOptionMaximumNumber field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionMaximumNumber() {
    return isSetField(40106);
  }

  public void set(quickfix.field.ProvisionOptionExerciseConfirmation value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseConfirmation get(quickfix.field.ProvisionOptionExerciseConfirmation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseConfirmation getProvisionOptionExerciseConfirmation() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseConfirmation());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseConfirmation field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseConfirmation() {
    return isSetField(40107);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlPaymentDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDates get(quickfix.fixlatest.component.ProvisionCashSettlPaymentDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlPaymentDates getProvisionCashSettlPaymentDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlPaymentDates());
  }

  public void set(quickfix.field.ProvisionCashSettlMethod value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlMethod get(quickfix.field.ProvisionCashSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlMethod getProvisionCashSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlMethod());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlMethod() {
    return isSetField(40108);
  }

  public void set(quickfix.field.ProvisionCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlCurrency get(quickfix.field.ProvisionCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlCurrency getProvisionCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlCurrency() {
    return isSetField(40109);
  }

  public void set(quickfix.field.ProvisionCashSettlCurrency2 value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlCurrency2 get(quickfix.field.ProvisionCashSettlCurrency2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlCurrency2 getProvisionCashSettlCurrency2() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlCurrency2());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlCurrency2 field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlCurrency2() {
    return isSetField(40110);
  }

  public void set(quickfix.field.ProvisionCashSettlQuoteType value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlQuoteType get(quickfix.field.ProvisionCashSettlQuoteType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlQuoteType getProvisionCashSettlQuoteType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlQuoteType());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlQuoteType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlQuoteType() {
    return isSetField(40111);
  }

  public void set(quickfix.fixlatest.component.ProvisionCashSettlQuoteSource component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionCashSettlQuoteSource get(quickfix.fixlatest.component.ProvisionCashSettlQuoteSource component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionCashSettlQuoteSource getProvisionCashSettlQuoteSourceComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionCashSettlQuoteSource());
  }

  public void set(quickfix.field.ProvisionText value) {
    setField(value);
  }

  public quickfix.field.ProvisionText get(quickfix.field.ProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionText getProvisionText() throws FieldNotFound {
    return get(new quickfix.field.ProvisionText());
  }

  public boolean isSet(quickfix.field.ProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetProvisionText() {
    return isSetField(40113);
  }

  public void set(quickfix.field.EncodedProvisionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedProvisionTextLen get(quickfix.field.EncodedProvisionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedProvisionTextLen getEncodedProvisionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedProvisionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedProvisionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedProvisionTextLen() {
    return isSetField(40986);
  }

  public void set(quickfix.field.EncodedProvisionText value) {
    setField(value);
  }

  public quickfix.field.EncodedProvisionText get(quickfix.field.EncodedProvisionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedProvisionText getEncodedProvisionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedProvisionText());
  }

  public boolean isSet(quickfix.field.EncodedProvisionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedProvisionText() {
    return isSetField(40987);
  }

  public void set(quickfix.fixlatest.component.ProvisionParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionParties get(quickfix.fixlatest.component.ProvisionParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionParties getProvisionPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionParties());
  }

  public void set(quickfix.field.NoProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartyIDs get(quickfix.field.NoProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartyIDs getNoProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartyIDs() {
    return isSetField(40174);
  }

public static class NoProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40175, 40176, 40177, 2385, 40178, 0};

  public NoProvisionPartyIDs() {
    super(40174, 40175, ORDER);
  }

  public void set(quickfix.field.ProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyID get(quickfix.field.ProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyID getProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyID());
  }

  public boolean isSet(quickfix.field.ProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyID() {
    return isSetField(40175);
  }

  public void set(quickfix.field.ProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyIDSource get(quickfix.field.ProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyIDSource getProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.ProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyIDSource() {
    return isSetField(40176);
  }

  public void set(quickfix.field.ProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRole get(quickfix.field.ProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRole getProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRole() {
    return isSetField(40177);
  }

  public void set(quickfix.field.ProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRoleQualifier get(quickfix.field.ProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRoleQualifier getProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRoleQualifier() {
    return isSetField(2385);
  }

  public void set(quickfix.fixlatest.component.ProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp get(quickfix.fixlatest.component.ProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp getProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartySubIDs get(quickfix.field.NoProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartySubIDs getNoProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartySubIDs() {
    return isSetField(40178);
  }

public static class NoProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40179, 40180, 0};

  public NoProvisionPartySubIDs() {
    super(40178, 40179, ORDER);
  }

  public void set(quickfix.field.ProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubID get(quickfix.field.ProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubID getProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubID() {
    return isSetField(40179);
  }

  public void set(quickfix.field.ProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubIDType get(quickfix.field.ProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubIDType getProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubIDType() {
    return isSetField(40180);
  }
}
}
}

  public void set(quickfix.fixlatest.component.AdditionalTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AdditionalTermGrp get(quickfix.fixlatest.component.AdditionalTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AdditionalTermGrp getAdditionalTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AdditionalTermGrp());
  }

  public void set(quickfix.field.NoAdditionalTerms value) {
    setField(value);
  }

  public quickfix.field.NoAdditionalTerms get(quickfix.field.NoAdditionalTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAdditionalTerms getNoAdditionalTerms() throws FieldNotFound {
    return get(new quickfix.field.NoAdditionalTerms());
  }

  public boolean isSet(quickfix.field.NoAdditionalTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoAdditionalTerms() {
    return isSetField(40019);
  }

public static class NoAdditionalTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40020, 40021, 40000, 0};

  public NoAdditionalTerms() {
    super(40019, 40020, ORDER);
  }

  public void set(quickfix.field.AdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermConditionPrecedentBondIndicator get(quickfix.field.AdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermConditionPrecedentBondIndicator getAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.AdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(40020);
  }

  public void set(quickfix.field.AdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermDiscrepancyClauseIndicator get(quickfix.field.AdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermDiscrepancyClauseIndicator getAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.AdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(40021);
  }

  public void set(quickfix.fixlatest.component.AdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AdditionalTermBondRefGrp get(quickfix.fixlatest.component.AdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AdditionalTermBondRefGrp getAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoAdditionalTermBondRefs get(quickfix.field.NoAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAdditionalTermBondRefs getNoAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoAdditionalTermBondRefs() {
    return isSetField(40000);
  }

public static class NoAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40001, 40002, 40003, 40004, 40005, 40006, 40007, 40008, 40009, 40010, 40011, 40012, 40013, 40014, 40015, 40016, 40017, 40018, 0};

  public NoAdditionalTermBondRefs() {
    super(40000, 40001, ORDER);
  }

  public void set(quickfix.field.AdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSecurityID get(quickfix.field.AdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSecurityID getAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSecurityID() {
    return isSetField(40001);
  }

  public void set(quickfix.field.AdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSecurityIDSource get(quickfix.field.AdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSecurityIDSource getAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSecurityIDSource() {
    return isSetField(40002);
  }

  public void set(quickfix.field.AdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondDesc get(quickfix.field.AdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondDesc getAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondDesc() {
    return isSetField(40003);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondDescLen get(quickfix.field.EncodedAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondDescLen getEncodedAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondDescLen() {
    return isSetField(40004);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondDesc get(quickfix.field.EncodedAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondDesc getEncodedAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondDesc() {
    return isSetField(40005);
  }

  public void set(quickfix.field.AdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCurrency get(quickfix.field.AdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCurrency getAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCurrency() {
    return isSetField(40006);
  }

  public void set(quickfix.field.AdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondIssuer get(quickfix.field.AdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondIssuer getAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondIssuer() {
    return isSetField(40007);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondIssuerLen get(quickfix.field.EncodedAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondIssuerLen getEncodedAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondIssuerLen() {
    return isSetField(40008);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondIssuer get(quickfix.field.EncodedAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondIssuer getEncodedAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondIssuer() {
    return isSetField(40009);
  }

  public void set(quickfix.field.AdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSeniority get(quickfix.field.AdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSeniority getAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSeniority() {
    return isSetField(40010);
  }

  public void set(quickfix.field.AdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponType get(quickfix.field.AdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponType getAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponType() {
    return isSetField(40011);
  }

  public void set(quickfix.field.AdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponRate get(quickfix.field.AdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponRate getAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponRate() {
    return isSetField(40012);
  }

  public void set(quickfix.field.AdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondMaturityDate get(quickfix.field.AdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondMaturityDate getAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondMaturityDate() {
    return isSetField(40013);
  }

  public void set(quickfix.field.AdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondParValue get(quickfix.field.AdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondParValue getAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondParValue() {
    return isSetField(40014);
  }

  public void set(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount getAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(40015);
  }

  public void set(quickfix.field.AdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyPeriod get(quickfix.field.AdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyPeriod getAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(40016);
  }

  public void set(quickfix.field.AdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyUnit get(quickfix.field.AdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyUnit getAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(40017);
  }

  public void set(quickfix.field.AdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondDayCount get(quickfix.field.AdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondDayCount getAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondDayCount() {
    return isSetField(40018);
  }
}
}

  public void set(quickfix.fixlatest.component.ProtectionTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermGrp get(quickfix.fixlatest.component.ProtectionTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermGrp getProtectionTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermGrp());
  }

  public void set(quickfix.field.NoProtectionTerms value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTerms get(quickfix.field.NoProtectionTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTerms getNoProtectionTerms() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTerms());
  }

  public boolean isSet(quickfix.field.NoProtectionTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTerms() {
    return isSetField(40181);
  }

public static class NoProtectionTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40182, 40183, 40184, 40185, 40186, 40187, 40188, 40951, 40191, 40201, 40190, 0};

  public NoProtectionTerms() {
    super(40181, 40182, ORDER);
  }

  public void set(quickfix.field.ProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermNotional get(quickfix.field.ProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermNotional getProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.ProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermNotional() {
    return isSetField(40182);
  }

  public void set(quickfix.field.ProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermCurrency get(quickfix.field.ProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermCurrency getProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermCurrency() {
    return isSetField(40183);
  }

  public void set(quickfix.field.ProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermSellerNotifies get(quickfix.field.ProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermSellerNotifies getProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.ProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermSellerNotifies() {
    return isSetField(40184);
  }

  public void set(quickfix.field.ProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermBuyerNotifies get(quickfix.field.ProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermBuyerNotifies getProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.ProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermBuyerNotifies() {
    return isSetField(40185);
  }

  public void set(quickfix.field.ProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventBusinessCenter get(quickfix.field.ProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventBusinessCenter getProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventBusinessCenter() {
    return isSetField(40186);
  }

  public void set(quickfix.field.ProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermStandardSources get(quickfix.field.ProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermStandardSources getProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.ProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermStandardSources() {
    return isSetField(40187);
  }

  public void set(quickfix.field.ProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventMinimumSources get(quickfix.field.ProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventMinimumSources getProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventMinimumSources() {
    return isSetField(40188);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp getProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventNewsSources get(quickfix.field.NoProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventNewsSources getNoProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventNewsSources() {
    return isSetField(40951);
  }

public static class NoProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40189, 0};

  public NoProtectionTermEventNewsSources() {
    super(40951, 40189, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventNewsSource get(quickfix.field.ProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventNewsSource getProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventNewsSource() {
    return isSetField(40189);
  }
}

  public void set(quickfix.fixlatest.component.ProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventGrp get(quickfix.fixlatest.component.ProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventGrp getProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEvents get(quickfix.field.NoProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEvents getNoProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEvents() {
    return isSetField(40191);
  }

public static class NoProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40192, 40193, 40194, 40195, 40196, 40197, 40198, 40199, 0};

  public NoProtectionTermEvents() {
    super(40191, 40192, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventType get(quickfix.field.ProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventType getProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventType() {
    return isSetField(40192);
  }

  public void set(quickfix.field.ProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventValue get(quickfix.field.ProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventValue getProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventValue() {
    return isSetField(40193);
  }

  public void set(quickfix.field.ProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventCurrency get(quickfix.field.ProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventCurrency getProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventCurrency() {
    return isSetField(40194);
  }

  public void set(quickfix.field.ProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventPeriod get(quickfix.field.ProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventPeriod getProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventPeriod() {
    return isSetField(40195);
  }

  public void set(quickfix.field.ProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventUnit get(quickfix.field.ProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventUnit getProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventUnit() {
    return isSetField(40196);
  }

  public void set(quickfix.field.ProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventDayType get(quickfix.field.ProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventDayType getProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventDayType() {
    return isSetField(40197);
  }

  public void set(quickfix.field.ProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventRateSource get(quickfix.field.ProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventRateSource getProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventRateSource() {
    return isSetField(40198);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp getProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventQualifiers get(quickfix.field.NoProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventQualifiers getNoProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventQualifiers() {
    return isSetField(40199);
  }

public static class NoProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40200, 0};

  public NoProtectionTermEventQualifiers() {
    super(40199, 40200, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}
}

  public void set(quickfix.fixlatest.component.ProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermObligationGrp get(quickfix.fixlatest.component.ProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermObligationGrp getProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermObligations get(quickfix.field.NoProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermObligations getNoProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermObligations() {
    return isSetField(40201);
  }

public static class NoProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40202, 40203, 0};

  public NoProtectionTermObligations() {
    super(40201, 40202, ORDER);
  }

  public void set(quickfix.field.ProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationType get(quickfix.field.ProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationType getProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationType() {
    return isSetField(40202);
  }

  public void set(quickfix.field.ProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationValue get(quickfix.field.ProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationValue getProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationValue() {
    return isSetField(40203);
  }
}

  public void set(quickfix.field.ProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermXID get(quickfix.field.ProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermXID getProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermXID());
  }

  public boolean isSet(quickfix.field.ProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermXID() {
    return isSetField(40190);
  }
}

  public void set(quickfix.fixlatest.component.CashSettlTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlTermGrp get(quickfix.fixlatest.component.CashSettlTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlTermGrp getCashSettlTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlTermGrp());
  }

  public void set(quickfix.field.NoCashSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlTerms get(quickfix.field.NoCashSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlTerms getNoCashSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlTerms());
  }

  public boolean isSet(quickfix.field.NoCashSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlTerms() {
    return isSetField(40022);
  }

public static class NoCashSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40023, 40024, 40916, 40917, 40025, 40026, 40027, 40028, 40029, 40030, 40031, 40277, 42216, 42217, 40033, 40034, 42207, 42208, 42214, 42209, 42210, 42211, 42212, 42213, 40035, 40036, 40037, 40038, 40039, 0};

  public NoCashSettlTerms() {
    super(40022, 40023, ORDER);
  }

  public void set(quickfix.field.CashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlCurrency get(quickfix.field.CashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlCurrency getCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlCurrency() {
    return isSetField(40023);
  }

  public void set(quickfix.field.CashSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationFirstBusinessDayOffset get(quickfix.field.CashSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationFirstBusinessDayOffset getCashSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.CashSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationFirstBusinessDayOffset() {
    return isSetField(40024);
  }

  public void set(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset getCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(40916);
  }

  public void set(quickfix.field.CashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.CashSettlNumOfValuationDates get(quickfix.field.CashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlNumOfValuationDates getCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.CashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.CashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlNumOfValuationDates() {
    return isSetField(40917);
  }

  public void set(quickfix.field.CashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationTime get(quickfix.field.CashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationTime getCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.CashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationTime() {
    return isSetField(40025);
  }

  public void set(quickfix.field.CashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.CashSettlBusinessCenter get(quickfix.field.CashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlBusinessCenter getCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.CashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.CashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlBusinessCenter() {
    return isSetField(40026);
  }

  public void set(quickfix.field.CashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteMethod get(quickfix.field.CashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteMethod getCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteMethod() {
    return isSetField(40027);
  }

  public void set(quickfix.field.CashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteAmount get(quickfix.field.CashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteAmount getCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteAmount() {
    return isSetField(40028);
  }

  public void set(quickfix.field.CashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteCurrency get(quickfix.field.CashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteCurrency getCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteCurrency() {
    return isSetField(40029);
  }

  public void set(quickfix.field.CashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlMinimumQuoteAmount get(quickfix.field.CashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlMinimumQuoteAmount getCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.CashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlMinimumQuoteAmount() {
    return isSetField(40030);
  }

  public void set(quickfix.field.CashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlMinimumQuoteCurrency get(quickfix.field.CashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlMinimumQuoteCurrency getCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlMinimumQuoteCurrency() {
    return isSetField(40031);
  }

  public void set(quickfix.fixlatest.component.CashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDealerGrp get(quickfix.fixlatest.component.CashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDealerGrp getCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDealerGrp());
  }

  public void set(quickfix.field.NoCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlDealers get(quickfix.field.NoCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlDealers getNoCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlDealers() {
    return isSetField(40277);
  }

public static class NoCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40032, 0};

  public NoCashSettlDealers() {
    super(40277, 40032, ORDER);
  }

  public void set(quickfix.field.CashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.CashSettlDealer get(quickfix.field.CashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDealer getCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDealer());
  }

  public boolean isSet(quickfix.field.CashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDealer() {
    return isSetField(40032);
  }
}

  public void set(quickfix.field.CashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.CashSettlPriceSource get(quickfix.field.CashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlPriceSource getCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.CashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.CashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlPriceSource() {
    return isSetField(42216);
  }

  public void set(quickfix.field.CashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.CashSettlPriceDefault get(quickfix.field.CashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlPriceDefault getCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.CashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.CashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlPriceDefault() {
    return isSetField(42217);
  }

  public void set(quickfix.field.CashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.CashSettlBusinessDays get(quickfix.field.CashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlBusinessDays getCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.CashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.CashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlBusinessDays() {
    return isSetField(40033);
  }

  public void set(quickfix.field.CashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlAmount get(quickfix.field.CashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlAmount getCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlAmount());
  }

  public boolean isSet(quickfix.field.CashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlAmount() {
    return isSetField(40034);
  }

  public void set(quickfix.fixlatest.component.CashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDate get(quickfix.fixlatest.component.CashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDate getCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDate());
  }

  public void set(quickfix.field.CashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.CashSettlRecoveryFactor get(quickfix.field.CashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlRecoveryFactor getCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.CashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.CashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlRecoveryFactor() {
    return isSetField(40035);
  }

  public void set(quickfix.field.CashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.CashSettlFixedTermIndicator get(quickfix.field.CashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlFixedTermIndicator getCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.CashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.CashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlFixedTermIndicator() {
    return isSetField(40036);
  }

  public void set(quickfix.field.CashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.CashSettlAccruedInterestIndicator get(quickfix.field.CashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlAccruedInterestIndicator getCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.CashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.CashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlAccruedInterestIndicator() {
    return isSetField(40037);
  }

  public void set(quickfix.field.CashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationMethod get(quickfix.field.CashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationMethod getCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.CashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationMethod() {
    return isSetField(40038);
  }

  public void set(quickfix.field.CashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.CashSettlTermXID get(quickfix.field.CashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlTermXID getCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.CashSettlTermXID());
  }

  public boolean isSet(quickfix.field.CashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlTermXID() {
    return isSetField(40039);
  }
}

  public void set(quickfix.fixlatest.component.PhysicalSettlTermGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PhysicalSettlTermGrp get(quickfix.fixlatest.component.PhysicalSettlTermGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PhysicalSettlTermGrp getPhysicalSettlTermGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PhysicalSettlTermGrp());
  }

  public void set(quickfix.field.NoPhysicalSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoPhysicalSettlTerms get(quickfix.field.NoPhysicalSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPhysicalSettlTerms getNoPhysicalSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoPhysicalSettlTerms());
  }

  public boolean isSet(quickfix.field.NoPhysicalSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoPhysicalSettlTerms() {
    return isSetField(40204);
  }

public static class NoPhysicalSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40209, 40205, 40206, 40207, 40208, 0};

  public NoPhysicalSettlTerms() {
    super(40204, 40209, ORDER);
  }

  public void set(quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp getPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp());
  }

  public void set(quickfix.field.NoPhysicalSettlDeliverableObligations value) {
    setField(value);
  }

  public quickfix.field.NoPhysicalSettlDeliverableObligations get(quickfix.field.NoPhysicalSettlDeliverableObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPhysicalSettlDeliverableObligations getNoPhysicalSettlDeliverableObligations() throws FieldNotFound {
    return get(new quickfix.field.NoPhysicalSettlDeliverableObligations());
  }

  public boolean isSet(quickfix.field.NoPhysicalSettlDeliverableObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoPhysicalSettlDeliverableObligations() {
    return isSetField(40209);
  }

public static class NoPhysicalSettlDeliverableObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40210, 40211, 0};

  public NoPhysicalSettlDeliverableObligations() {
    super(40209, 40210, ORDER);
  }

  public void set(quickfix.field.PhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlDeliverableObligationType get(quickfix.field.PhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlDeliverableObligationType getPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.PhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlDeliverableObligationType() {
    return isSetField(40210);
  }

  public void set(quickfix.field.PhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlDeliverableObligationValue get(quickfix.field.PhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlDeliverableObligationValue getPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.PhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlDeliverableObligationValue() {
    return isSetField(40211);
  }
}

  public void set(quickfix.field.PhysicalSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlCurrency get(quickfix.field.PhysicalSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlCurrency getPhysicalSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlCurrency());
  }

  public boolean isSet(quickfix.field.PhysicalSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlCurrency() {
    return isSetField(40205);
  }

  public void set(quickfix.field.PhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlBusinessDays get(quickfix.field.PhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlBusinessDays getPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.PhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlBusinessDays() {
    return isSetField(40206);
  }

  public void set(quickfix.field.PhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlMaximumBusinessDays get(quickfix.field.PhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlMaximumBusinessDays getPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.PhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlMaximumBusinessDays() {
    return isSetField(40207);
  }

  public void set(quickfix.field.PhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlTermXID get(quickfix.field.PhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlTermXID getPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.PhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlTermXID() {
    return isSetField(40208);
  }
}

  public void set(quickfix.fixlatest.component.ExtraordinaryEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ExtraordinaryEventGrp get(quickfix.fixlatest.component.ExtraordinaryEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ExtraordinaryEventGrp getExtraordinaryEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ExtraordinaryEventGrp());
  }

  public void set(quickfix.field.NoExtraordinaryEvents value) {
    setField(value);
  }

  public quickfix.field.NoExtraordinaryEvents get(quickfix.field.NoExtraordinaryEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExtraordinaryEvents getNoExtraordinaryEvents() throws FieldNotFound {
    return get(new quickfix.field.NoExtraordinaryEvents());
  }

  public boolean isSet(quickfix.field.NoExtraordinaryEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoExtraordinaryEvents() {
    return isSetField(42296);
  }

public static class NoExtraordinaryEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42297, 42298, 0};

  public NoExtraordinaryEvents() {
    super(42296, 42297, ORDER);
  }

  public void set(quickfix.field.ExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventType get(quickfix.field.ExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventType getExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventType() {
    return isSetField(42297);
  }

  public void set(quickfix.field.ExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventValue get(quickfix.field.ExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventValue getExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventValue() {
    return isSetField(42298);
  }
}

  public void set(quickfix.field.ExtraordinaryEventAdjustmentMethod value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventAdjustmentMethod get(quickfix.field.ExtraordinaryEventAdjustmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventAdjustmentMethod getExtraordinaryEventAdjustmentMethod() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventAdjustmentMethod());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventAdjustmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventAdjustmentMethod() {
    return isSetField(2602);
  }

  public void set(quickfix.field.ExchangeLookAlike value) {
    setField(value);
  }

  public quickfix.field.ExchangeLookAlike get(quickfix.field.ExchangeLookAlike value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeLookAlike getExchangeLookAlike() throws FieldNotFound {
    return get(new quickfix.field.ExchangeLookAlike());
  }

  public boolean isSet(quickfix.field.ExchangeLookAlike field) {
    return isSetField(field);
  }

  public boolean isSetExchangeLookAlike() {
    return isSetField(2603);
  }
}
