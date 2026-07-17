/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeInstrument extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1214, 1215, 1216, 1217, 1246, 1228, 1243, 1247, 1248, 2892, 1249, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1276, 1257, 1258, 1259, 1260, 1261, 1262, 1263, 1264, 1265, 1266, 1438, 1442, 1267, 1268, 1269, 1270, 1722, 1315, 1316, 1723, 1317, 1318, 1319, 1576, 1320, 1321, 1322, 1323, 2684, 2688, 1299, 1225, 1271, 1272, 1273, 1274, 1275, 1277, 1278, 1279, 1280, 1281, 1285, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeInstrument() {
    super();
  }

  public void set(quickfix.field.DerivativeSymbol value) {
    setField(value);
  }

  public quickfix.field.DerivativeSymbol get(quickfix.field.DerivativeSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSymbol getDerivativeSymbol() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSymbol());
  }

  public boolean isSet(quickfix.field.DerivativeSymbol field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSymbol() {
    return isSetField(1214);
  }

  public void set(quickfix.field.DerivativeSymbolSfx value) {
    setField(value);
  }

  public quickfix.field.DerivativeSymbolSfx get(quickfix.field.DerivativeSymbolSfx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSymbolSfx getDerivativeSymbolSfx() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSymbolSfx());
  }

  public boolean isSet(quickfix.field.DerivativeSymbolSfx field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSymbolSfx() {
    return isSetField(1215);
  }

  public void set(quickfix.field.DerivativeSecurityID value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityID get(quickfix.field.DerivativeSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityID getDerivativeSecurityID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityID());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityID() {
    return isSetField(1216);
  }

  public void set(quickfix.field.DerivativeSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityIDSource get(quickfix.field.DerivativeSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityIDSource getDerivativeSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityIDSource() {
    return isSetField(1217);
  }

  public void set(quickfix.fixlatest.component.DerivativeSecurityAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeSecurityAltIDGrp get(quickfix.fixlatest.component.DerivativeSecurityAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeSecurityAltIDGrp getDerivativeSecurityAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeSecurityAltIDGrp());
  }

  public void set(quickfix.field.NoDerivativeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeSecurityAltID get(quickfix.field.NoDerivativeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeSecurityAltID getNoDerivativeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoDerivativeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeSecurityAltID() {
    return isSetField(1218);
  }

public static class NoDerivativeSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1219, 1220, 0};

  public NoDerivativeSecurityAltID() {
    super(1218, 1219, ORDER);
  }

  public void set(quickfix.field.DerivativeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityAltID get(quickfix.field.DerivativeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityAltID getDerivativeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityAltID());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityAltID() {
    return isSetField(1219);
  }

  public void set(quickfix.field.DerivativeSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityAltIDSource get(quickfix.field.DerivativeSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityAltIDSource getDerivativeSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityAltIDSource() {
    return isSetField(1220);
  }
}

  public void set(quickfix.field.DerivativeProduct value) {
    setField(value);
  }

  public quickfix.field.DerivativeProduct get(quickfix.field.DerivativeProduct value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeProduct getDerivativeProduct() throws FieldNotFound {
    return get(new quickfix.field.DerivativeProduct());
  }

  public boolean isSet(quickfix.field.DerivativeProduct field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeProduct() {
    return isSetField(1246);
  }

  public void set(quickfix.field.DerivativeProductComplex value) {
    setField(value);
  }

  public quickfix.field.DerivativeProductComplex get(quickfix.field.DerivativeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeProductComplex getDerivativeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.DerivativeProductComplex());
  }

  public boolean isSet(quickfix.field.DerivativeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeProductComplex() {
    return isSetField(1228);
  }

  public void set(quickfix.field.DerivFlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.DerivFlexProductEligibilityIndicator get(quickfix.field.DerivFlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivFlexProductEligibilityIndicator getDerivFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.DerivFlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.DerivFlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetDerivFlexProductEligibilityIndicator() {
    return isSetField(1243);
  }

  public void set(quickfix.field.DerivativeSecurityGroup value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityGroup get(quickfix.field.DerivativeSecurityGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityGroup getDerivativeSecurityGroup() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityGroup());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityGroup field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityGroup() {
    return isSetField(1247);
  }

  public void set(quickfix.field.DerivativeCFICode value) {
    setField(value);
  }

  public quickfix.field.DerivativeCFICode get(quickfix.field.DerivativeCFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeCFICode getDerivativeCFICode() throws FieldNotFound {
    return get(new quickfix.field.DerivativeCFICode());
  }

  public boolean isSet(quickfix.field.DerivativeCFICode field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeCFICode() {
    return isSetField(1248);
  }

  public void set(quickfix.field.DerivativeUPICode value) {
    setField(value);
  }

  public quickfix.field.DerivativeUPICode get(quickfix.field.DerivativeUPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeUPICode getDerivativeUPICode() throws FieldNotFound {
    return get(new quickfix.field.DerivativeUPICode());
  }

  public boolean isSet(quickfix.field.DerivativeUPICode field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeUPICode() {
    return isSetField(2892);
  }

  public void set(quickfix.field.DerivativeSecurityType value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityType get(quickfix.field.DerivativeSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityType getDerivativeSecurityType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityType());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityType() {
    return isSetField(1249);
  }

  public void set(quickfix.field.DerivativeSecuritySubType value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecuritySubType get(quickfix.field.DerivativeSecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecuritySubType getDerivativeSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecuritySubType());
  }

  public boolean isSet(quickfix.field.DerivativeSecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecuritySubType() {
    return isSetField(1250);
  }

  public void set(quickfix.field.DerivativeMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.DerivativeMaturityMonthYear get(quickfix.field.DerivativeMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeMaturityMonthYear getDerivativeMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.DerivativeMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.DerivativeMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeMaturityMonthYear() {
    return isSetField(1251);
  }

  public void set(quickfix.field.DerivativeMaturityDate value) {
    setField(value);
  }

  public quickfix.field.DerivativeMaturityDate get(quickfix.field.DerivativeMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeMaturityDate getDerivativeMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.DerivativeMaturityDate());
  }

  public boolean isSet(quickfix.field.DerivativeMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeMaturityDate() {
    return isSetField(1252);
  }

  public void set(quickfix.field.DerivativeMaturityTime value) {
    setField(value);
  }

  public quickfix.field.DerivativeMaturityTime get(quickfix.field.DerivativeMaturityTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeMaturityTime getDerivativeMaturityTime() throws FieldNotFound {
    return get(new quickfix.field.DerivativeMaturityTime());
  }

  public boolean isSet(quickfix.field.DerivativeMaturityTime field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeMaturityTime() {
    return isSetField(1253);
  }

  public void set(quickfix.field.DerivativeSettleOnOpenFlag value) {
    setField(value);
  }

  public quickfix.field.DerivativeSettleOnOpenFlag get(quickfix.field.DerivativeSettleOnOpenFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSettleOnOpenFlag getDerivativeSettleOnOpenFlag() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSettleOnOpenFlag());
  }

  public boolean isSet(quickfix.field.DerivativeSettleOnOpenFlag field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSettleOnOpenFlag() {
    return isSetField(1254);
  }

  public void set(quickfix.field.DerivativeInstrmtAssignmentMethod value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrmtAssignmentMethod get(quickfix.field.DerivativeInstrmtAssignmentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrmtAssignmentMethod getDerivativeInstrmtAssignmentMethod() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrmtAssignmentMethod());
  }

  public boolean isSet(quickfix.field.DerivativeInstrmtAssignmentMethod field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrmtAssignmentMethod() {
    return isSetField(1255);
  }

  public void set(quickfix.field.DerivativeSecurityStatus value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityStatus get(quickfix.field.DerivativeSecurityStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityStatus getDerivativeSecurityStatus() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityStatus());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityStatus field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityStatus() {
    return isSetField(1256);
  }

  public void set(quickfix.field.DerivativeIssueDate value) {
    setField(value);
  }

  public quickfix.field.DerivativeIssueDate get(quickfix.field.DerivativeIssueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeIssueDate getDerivativeIssueDate() throws FieldNotFound {
    return get(new quickfix.field.DerivativeIssueDate());
  }

  public boolean isSet(quickfix.field.DerivativeIssueDate field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeIssueDate() {
    return isSetField(1276);
  }

  public void set(quickfix.field.DerivativeInstrRegistry value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrRegistry get(quickfix.field.DerivativeInstrRegistry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrRegistry getDerivativeInstrRegistry() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrRegistry());
  }

  public boolean isSet(quickfix.field.DerivativeInstrRegistry field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrRegistry() {
    return isSetField(1257);
  }

  public void set(quickfix.field.DerivativeCountryOfIssue value) {
    setField(value);
  }

  public quickfix.field.DerivativeCountryOfIssue get(quickfix.field.DerivativeCountryOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeCountryOfIssue getDerivativeCountryOfIssue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeCountryOfIssue());
  }

  public boolean isSet(quickfix.field.DerivativeCountryOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeCountryOfIssue() {
    return isSetField(1258);
  }

  public void set(quickfix.field.DerivativeStateOrProvinceOfIssue value) {
    setField(value);
  }

  public quickfix.field.DerivativeStateOrProvinceOfIssue get(quickfix.field.DerivativeStateOrProvinceOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeStateOrProvinceOfIssue getDerivativeStateOrProvinceOfIssue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeStateOrProvinceOfIssue());
  }

  public boolean isSet(quickfix.field.DerivativeStateOrProvinceOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeStateOrProvinceOfIssue() {
    return isSetField(1259);
  }

  public void set(quickfix.field.DerivativeLocaleOfIssue value) {
    setField(value);
  }

  public quickfix.field.DerivativeLocaleOfIssue get(quickfix.field.DerivativeLocaleOfIssue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeLocaleOfIssue getDerivativeLocaleOfIssue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeLocaleOfIssue());
  }

  public boolean isSet(quickfix.field.DerivativeLocaleOfIssue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeLocaleOfIssue() {
    return isSetField(1260);
  }

  public void set(quickfix.field.DerivativeStrikePrice value) {
    setField(value);
  }

  public quickfix.field.DerivativeStrikePrice get(quickfix.field.DerivativeStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeStrikePrice getDerivativeStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.DerivativeStrikePrice());
  }

  public boolean isSet(quickfix.field.DerivativeStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeStrikePrice() {
    return isSetField(1261);
  }

  public void set(quickfix.field.DerivativeStrikeCurrency value) {
    setField(value);
  }

  public quickfix.field.DerivativeStrikeCurrency get(quickfix.field.DerivativeStrikeCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeStrikeCurrency getDerivativeStrikeCurrency() throws FieldNotFound {
    return get(new quickfix.field.DerivativeStrikeCurrency());
  }

  public boolean isSet(quickfix.field.DerivativeStrikeCurrency field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeStrikeCurrency() {
    return isSetField(1262);
  }

  public void set(quickfix.field.DerivativeStrikeMultiplier value) {
    setField(value);
  }

  public quickfix.field.DerivativeStrikeMultiplier get(quickfix.field.DerivativeStrikeMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeStrikeMultiplier getDerivativeStrikeMultiplier() throws FieldNotFound {
    return get(new quickfix.field.DerivativeStrikeMultiplier());
  }

  public boolean isSet(quickfix.field.DerivativeStrikeMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeStrikeMultiplier() {
    return isSetField(1263);
  }

  public void set(quickfix.field.DerivativeStrikeValue value) {
    setField(value);
  }

  public quickfix.field.DerivativeStrikeValue get(quickfix.field.DerivativeStrikeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeStrikeValue getDerivativeStrikeValue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeStrikeValue());
  }

  public boolean isSet(quickfix.field.DerivativeStrikeValue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeStrikeValue() {
    return isSetField(1264);
  }

  public void set(quickfix.field.DerivativeOptAttribute value) {
    setField(value);
  }

  public quickfix.field.DerivativeOptAttribute get(quickfix.field.DerivativeOptAttribute value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeOptAttribute getDerivativeOptAttribute() throws FieldNotFound {
    return get(new quickfix.field.DerivativeOptAttribute());
  }

  public boolean isSet(quickfix.field.DerivativeOptAttribute field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeOptAttribute() {
    return isSetField(1265);
  }

  public void set(quickfix.field.DerivativeContractMultiplier value) {
    setField(value);
  }

  public quickfix.field.DerivativeContractMultiplier get(quickfix.field.DerivativeContractMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeContractMultiplier getDerivativeContractMultiplier() throws FieldNotFound {
    return get(new quickfix.field.DerivativeContractMultiplier());
  }

  public boolean isSet(quickfix.field.DerivativeContractMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeContractMultiplier() {
    return isSetField(1266);
  }

  public void set(quickfix.field.DerivativeContractMultiplierUnit value) {
    setField(value);
  }

  public quickfix.field.DerivativeContractMultiplierUnit get(quickfix.field.DerivativeContractMultiplierUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeContractMultiplierUnit getDerivativeContractMultiplierUnit() throws FieldNotFound {
    return get(new quickfix.field.DerivativeContractMultiplierUnit());
  }

  public boolean isSet(quickfix.field.DerivativeContractMultiplierUnit field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeContractMultiplierUnit() {
    return isSetField(1438);
  }

  public void set(quickfix.field.DerivativeFlowScheduleType value) {
    setField(value);
  }

  public quickfix.field.DerivativeFlowScheduleType get(quickfix.field.DerivativeFlowScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeFlowScheduleType getDerivativeFlowScheduleType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeFlowScheduleType());
  }

  public boolean isSet(quickfix.field.DerivativeFlowScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeFlowScheduleType() {
    return isSetField(1442);
  }

  public void set(quickfix.field.DerivativeMinPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.DerivativeMinPriceIncrement get(quickfix.field.DerivativeMinPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeMinPriceIncrement getDerivativeMinPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.DerivativeMinPriceIncrement());
  }

  public boolean isSet(quickfix.field.DerivativeMinPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeMinPriceIncrement() {
    return isSetField(1267);
  }

  public void set(quickfix.field.DerivativeMinPriceIncrementAmount value) {
    setField(value);
  }

  public quickfix.field.DerivativeMinPriceIncrementAmount get(quickfix.field.DerivativeMinPriceIncrementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeMinPriceIncrementAmount getDerivativeMinPriceIncrementAmount() throws FieldNotFound {
    return get(new quickfix.field.DerivativeMinPriceIncrementAmount());
  }

  public boolean isSet(quickfix.field.DerivativeMinPriceIncrementAmount field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeMinPriceIncrementAmount() {
    return isSetField(1268);
  }

  public void set(quickfix.field.DerivativeUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DerivativeUnitOfMeasure get(quickfix.field.DerivativeUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeUnitOfMeasure getDerivativeUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DerivativeUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DerivativeUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeUnitOfMeasure() {
    return isSetField(1269);
  }

  public void set(quickfix.field.DerivativeUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.DerivativeUnitOfMeasureQty get(quickfix.field.DerivativeUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeUnitOfMeasureQty getDerivativeUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.DerivativeUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.DerivativeUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeUnitOfMeasureQty() {
    return isSetField(1270);
  }

  public void set(quickfix.field.DerivativeUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.DerivativeUnitOfMeasureCurrency get(quickfix.field.DerivativeUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeUnitOfMeasureCurrency getDerivativeUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.DerivativeUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.DerivativeUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeUnitOfMeasureCurrency() {
    return isSetField(1722);
  }

  public void set(quickfix.field.DerivativePriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DerivativePriceUnitOfMeasure get(quickfix.field.DerivativePriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePriceUnitOfMeasure getDerivativePriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DerivativePriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DerivativePriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePriceUnitOfMeasure() {
    return isSetField(1315);
  }

  public void set(quickfix.field.DerivativePriceUnitOfMeasureQty value) {
    setField(value);
  }

  public quickfix.field.DerivativePriceUnitOfMeasureQty get(quickfix.field.DerivativePriceUnitOfMeasureQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePriceUnitOfMeasureQty getDerivativePriceUnitOfMeasureQty() throws FieldNotFound {
    return get(new quickfix.field.DerivativePriceUnitOfMeasureQty());
  }

  public boolean isSet(quickfix.field.DerivativePriceUnitOfMeasureQty field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePriceUnitOfMeasureQty() {
    return isSetField(1316);
  }

  public void set(quickfix.field.DerivativePriceUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.DerivativePriceUnitOfMeasureCurrency get(quickfix.field.DerivativePriceUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePriceUnitOfMeasureCurrency getDerivativePriceUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.DerivativePriceUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.DerivativePriceUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePriceUnitOfMeasureCurrency() {
    return isSetField(1723);
  }

  public void set(quickfix.field.DerivativeSettlMethod value) {
    setField(value);
  }

  public quickfix.field.DerivativeSettlMethod get(quickfix.field.DerivativeSettlMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSettlMethod getDerivativeSettlMethod() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSettlMethod());
  }

  public boolean isSet(quickfix.field.DerivativeSettlMethod field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSettlMethod() {
    return isSetField(1317);
  }

  public void set(quickfix.field.DerivativePriceQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.DerivativePriceQuoteMethod get(quickfix.field.DerivativePriceQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePriceQuoteMethod getDerivativePriceQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.DerivativePriceQuoteMethod());
  }

  public boolean isSet(quickfix.field.DerivativePriceQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePriceQuoteMethod() {
    return isSetField(1318);
  }

  public void set(quickfix.field.DerivativeValuationMethod value) {
    setField(value);
  }

  public quickfix.field.DerivativeValuationMethod get(quickfix.field.DerivativeValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeValuationMethod getDerivativeValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.DerivativeValuationMethod());
  }

  public boolean isSet(quickfix.field.DerivativeValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeValuationMethod() {
    return isSetField(1319);
  }

  public void set(quickfix.field.DerivativePriceQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.DerivativePriceQuoteCurrency get(quickfix.field.DerivativePriceQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePriceQuoteCurrency getDerivativePriceQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.DerivativePriceQuoteCurrency());
  }

  public boolean isSet(quickfix.field.DerivativePriceQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePriceQuoteCurrency() {
    return isSetField(1576);
  }

  public void set(quickfix.field.DerivativeListMethod value) {
    setField(value);
  }

  public quickfix.field.DerivativeListMethod get(quickfix.field.DerivativeListMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeListMethod getDerivativeListMethod() throws FieldNotFound {
    return get(new quickfix.field.DerivativeListMethod());
  }

  public boolean isSet(quickfix.field.DerivativeListMethod field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeListMethod() {
    return isSetField(1320);
  }

  public void set(quickfix.field.DerivativeCapPrice value) {
    setField(value);
  }

  public quickfix.field.DerivativeCapPrice get(quickfix.field.DerivativeCapPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeCapPrice getDerivativeCapPrice() throws FieldNotFound {
    return get(new quickfix.field.DerivativeCapPrice());
  }

  public boolean isSet(quickfix.field.DerivativeCapPrice field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeCapPrice() {
    return isSetField(1321);
  }

  public void set(quickfix.field.DerivativeFloorPrice value) {
    setField(value);
  }

  public quickfix.field.DerivativeFloorPrice get(quickfix.field.DerivativeFloorPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeFloorPrice getDerivativeFloorPrice() throws FieldNotFound {
    return get(new quickfix.field.DerivativeFloorPrice());
  }

  public boolean isSet(quickfix.field.DerivativeFloorPrice field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeFloorPrice() {
    return isSetField(1322);
  }

  public void set(quickfix.field.DerivativePutOrCall value) {
    setField(value);
  }

  public quickfix.field.DerivativePutOrCall get(quickfix.field.DerivativePutOrCall value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePutOrCall getDerivativePutOrCall() throws FieldNotFound {
    return get(new quickfix.field.DerivativePutOrCall());
  }

  public boolean isSet(quickfix.field.DerivativePutOrCall field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePutOrCall() {
    return isSetField(1323);
  }

  public void set(quickfix.field.DerivativeInTheMoneyCondition value) {
    setField(value);
  }

  public quickfix.field.DerivativeInTheMoneyCondition get(quickfix.field.DerivativeInTheMoneyCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInTheMoneyCondition getDerivativeInTheMoneyCondition() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInTheMoneyCondition());
  }

  public boolean isSet(quickfix.field.DerivativeInTheMoneyCondition field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInTheMoneyCondition() {
    return isSetField(2684);
  }

  public void set(quickfix.field.DerivativeContraryInstructionEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.DerivativeContraryInstructionEligibilityIndicator get(quickfix.field.DerivativeContraryInstructionEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeContraryInstructionEligibilityIndicator getDerivativeContraryInstructionEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.DerivativeContraryInstructionEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.DerivativeContraryInstructionEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeContraryInstructionEligibilityIndicator() {
    return isSetField(2688);
  }

  public void set(quickfix.field.DerivativeExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.DerivativeExerciseStyle get(quickfix.field.DerivativeExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeExerciseStyle getDerivativeExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.DerivativeExerciseStyle());
  }

  public boolean isSet(quickfix.field.DerivativeExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeExerciseStyle() {
    return isSetField(1299);
  }

  public void set(quickfix.field.DerivativeOptPayAmount value) {
    setField(value);
  }

  public quickfix.field.DerivativeOptPayAmount get(quickfix.field.DerivativeOptPayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeOptPayAmount getDerivativeOptPayAmount() throws FieldNotFound {
    return get(new quickfix.field.DerivativeOptPayAmount());
  }

  public boolean isSet(quickfix.field.DerivativeOptPayAmount field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeOptPayAmount() {
    return isSetField(1225);
  }

  public void set(quickfix.field.DerivativeTimeUnit value) {
    setField(value);
  }

  public quickfix.field.DerivativeTimeUnit get(quickfix.field.DerivativeTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeTimeUnit getDerivativeTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.DerivativeTimeUnit());
  }

  public boolean isSet(quickfix.field.DerivativeTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeTimeUnit() {
    return isSetField(1271);
  }

  public void set(quickfix.field.DerivativeSecurityExchange value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityExchange get(quickfix.field.DerivativeSecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityExchange getDerivativeSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityExchange());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityExchange() {
    return isSetField(1272);
  }

  public void set(quickfix.field.DerivativePositionLimit value) {
    setField(value);
  }

  public quickfix.field.DerivativePositionLimit get(quickfix.field.DerivativePositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativePositionLimit getDerivativePositionLimit() throws FieldNotFound {
    return get(new quickfix.field.DerivativePositionLimit());
  }

  public boolean isSet(quickfix.field.DerivativePositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetDerivativePositionLimit() {
    return isSetField(1273);
  }

  public void set(quickfix.field.DerivativeNTPositionLimit value) {
    setField(value);
  }

  public quickfix.field.DerivativeNTPositionLimit get(quickfix.field.DerivativeNTPositionLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeNTPositionLimit getDerivativeNTPositionLimit() throws FieldNotFound {
    return get(new quickfix.field.DerivativeNTPositionLimit());
  }

  public boolean isSet(quickfix.field.DerivativeNTPositionLimit field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeNTPositionLimit() {
    return isSetField(1274);
  }

  public void set(quickfix.field.DerivativeIssuer value) {
    setField(value);
  }

  public quickfix.field.DerivativeIssuer get(quickfix.field.DerivativeIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeIssuer getDerivativeIssuer() throws FieldNotFound {
    return get(new quickfix.field.DerivativeIssuer());
  }

  public boolean isSet(quickfix.field.DerivativeIssuer field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeIssuer() {
    return isSetField(1275);
  }

  public void set(quickfix.field.DerivativeEncodedIssuerLen value) {
    setField(value);
  }

  public quickfix.field.DerivativeEncodedIssuerLen get(quickfix.field.DerivativeEncodedIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEncodedIssuerLen getDerivativeEncodedIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEncodedIssuerLen());
  }

  public boolean isSet(quickfix.field.DerivativeEncodedIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEncodedIssuerLen() {
    return isSetField(1277);
  }

  public void set(quickfix.field.DerivativeEncodedIssuer value) {
    setField(value);
  }

  public quickfix.field.DerivativeEncodedIssuer get(quickfix.field.DerivativeEncodedIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEncodedIssuer getDerivativeEncodedIssuer() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEncodedIssuer());
  }

  public boolean isSet(quickfix.field.DerivativeEncodedIssuer field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEncodedIssuer() {
    return isSetField(1278);
  }

  public void set(quickfix.field.DerivativeSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityDesc get(quickfix.field.DerivativeSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityDesc getDerivativeSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityDesc());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityDesc() {
    return isSetField(1279);
  }

  public void set(quickfix.field.DerivativeEncodedSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.DerivativeEncodedSecurityDescLen get(quickfix.field.DerivativeEncodedSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEncodedSecurityDescLen getDerivativeEncodedSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEncodedSecurityDescLen());
  }

  public boolean isSet(quickfix.field.DerivativeEncodedSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEncodedSecurityDescLen() {
    return isSetField(1280);
  }

  public void set(quickfix.field.DerivativeEncodedSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.DerivativeEncodedSecurityDesc get(quickfix.field.DerivativeEncodedSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEncodedSecurityDesc getDerivativeEncodedSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEncodedSecurityDesc());
  }

  public boolean isSet(quickfix.field.DerivativeEncodedSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEncodedSecurityDesc() {
    return isSetField(1281);
  }

  public void set(quickfix.fixlatest.component.DerivativeSecurityXML component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeSecurityXML get(quickfix.fixlatest.component.DerivativeSecurityXML component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeSecurityXML getDerivativeSecurityXMLComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeSecurityXML());
  }

  public void set(quickfix.field.DerivativeContractSettlMonth value) {
    setField(value);
  }

  public quickfix.field.DerivativeContractSettlMonth get(quickfix.field.DerivativeContractSettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeContractSettlMonth getDerivativeContractSettlMonth() throws FieldNotFound {
    return get(new quickfix.field.DerivativeContractSettlMonth());
  }

  public boolean isSet(quickfix.field.DerivativeContractSettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeContractSettlMonth() {
    return isSetField(1285);
  }

  public void set(quickfix.fixlatest.component.DerivativeEventsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeEventsGrp get(quickfix.fixlatest.component.DerivativeEventsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeEventsGrp getDerivativeEventsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeEventsGrp());
  }

  public void set(quickfix.field.NoDerivativeEvents value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeEvents get(quickfix.field.NoDerivativeEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeEvents getNoDerivativeEvents() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeEvents());
  }

  public boolean isSet(quickfix.field.NoDerivativeEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeEvents() {
    return isSetField(1286);
  }

public static class NoDerivativeEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1287, 1288, 1289, 1290, 1291, 0};

  public NoDerivativeEvents() {
    super(1286, 1287, ORDER);
  }

  public void set(quickfix.field.DerivativeEventType value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventType get(quickfix.field.DerivativeEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventType getDerivativeEventType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventType());
  }

  public boolean isSet(quickfix.field.DerivativeEventType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventType() {
    return isSetField(1287);
  }

  public void set(quickfix.field.DerivativeEventDate value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventDate get(quickfix.field.DerivativeEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventDate getDerivativeEventDate() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventDate());
  }

  public boolean isSet(quickfix.field.DerivativeEventDate field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventDate() {
    return isSetField(1288);
  }

  public void set(quickfix.field.DerivativeEventTime value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventTime get(quickfix.field.DerivativeEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventTime getDerivativeEventTime() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventTime());
  }

  public boolean isSet(quickfix.field.DerivativeEventTime field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventTime() {
    return isSetField(1289);
  }

  public void set(quickfix.field.DerivativeEventPx value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventPx get(quickfix.field.DerivativeEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventPx getDerivativeEventPx() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventPx());
  }

  public boolean isSet(quickfix.field.DerivativeEventPx field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventPx() {
    return isSetField(1290);
  }

  public void set(quickfix.field.DerivativeEventText value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventText get(quickfix.field.DerivativeEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventText getDerivativeEventText() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventText());
  }

  public boolean isSet(quickfix.field.DerivativeEventText field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventText() {
    return isSetField(1291);
  }
}

  public void set(quickfix.fixlatest.component.DerivativeInstrumentParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrumentParties get(quickfix.fixlatest.component.DerivativeInstrumentParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrumentParties getDerivativeInstrumentPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrumentParties());
  }

  public void set(quickfix.field.NoDerivativeInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrumentParties get(quickfix.field.NoDerivativeInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrumentParties getNoDerivativeInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrumentParties() {
    return isSetField(1292);
  }

public static class NoDerivativeInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1293, 1294, 1295, 2377, 1296, 0};

  public NoDerivativeInstrumentParties() {
    super(1292, 1293, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyID get(quickfix.field.DerivativeInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyID getDerivativeInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyID() {
    return isSetField(1293);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyIDSource get(quickfix.field.DerivativeInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyIDSource getDerivativeInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyIDSource() {
    return isSetField(1294);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyRole get(quickfix.field.DerivativeInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyRole getDerivativeInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyRole() {
    return isSetField(1295);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyRoleQualifier get(quickfix.field.DerivativeInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyRoleQualifier getDerivativeInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyRoleQualifier() {
    return isSetField(2377);
  }

  public void set(quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp get(quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp getDerivativeInstrumentPartySubIDsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp());
  }

  public void set(quickfix.field.NoDerivativeInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs get(quickfix.field.NoDerivativeInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs getNoDerivativeInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrumentPartySubIDs() {
    return isSetField(1296);
  }

public static class NoDerivativeInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1297, 1298, 0};

  public NoDerivativeInstrumentPartySubIDs() {
    super(1296, 1297, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubID get(quickfix.field.DerivativeInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubID getDerivativeInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubID() {
    return isSetField(1297);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType get(quickfix.field.DerivativeInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType getDerivativeInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubIDType() {
    return isSetField(1298);
  }
}
}
}
