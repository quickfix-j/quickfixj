/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentScope extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1536, 1537, 1538, 1539, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentScope() {
    super();
  }

  public void set(quickfix.field.InstrumentScopeSymbol value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSymbol get(quickfix.field.InstrumentScopeSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSymbol getInstrumentScopeSymbol() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSymbol());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSymbol field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSymbol() {
    return isSetField(1536);
  }

  public void set(quickfix.field.InstrumentScopeSymbolSfx value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSymbolSfx get(quickfix.field.InstrumentScopeSymbolSfx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSymbolSfx getInstrumentScopeSymbolSfx() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSymbolSfx());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSymbolSfx field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSymbolSfx() {
    return isSetField(1537);
  }

  public void set(quickfix.field.InstrumentScopeSecurityID value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityID get(quickfix.field.InstrumentScopeSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityID getInstrumentScopeSecurityID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityID());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityID() {
    return isSetField(1538);
  }

  public void set(quickfix.field.InstrumentScopeSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityIDSource get(quickfix.field.InstrumentScopeSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityIDSource getInstrumentScopeSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityIDSource() {
    return isSetField(1539);
  }

  public void set(quickfix.fixlatest.component.InstrumentScopeSecurityAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScopeSecurityAltIDGrp get(quickfix.fixlatest.component.InstrumentScopeSecurityAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScopeSecurityAltIDGrp getInstrumentScopeSecurityAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScopeSecurityAltIDGrp());
  }

  public void set(quickfix.field.NoInstrumentScopeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentScopeSecurityAltID get(quickfix.field.NoInstrumentScopeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentScopeSecurityAltID getNoInstrumentScopeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentScopeSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoInstrumentScopeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentScopeSecurityAltID() {
    return isSetField(1540);
  }

public static class NoInstrumentScopeSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1541, 1542, 0};

  public NoInstrumentScopeSecurityAltID() {
    super(1540, 1541, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityAltID get(quickfix.field.InstrumentScopeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityAltID getInstrumentScopeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityAltID());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityAltID() {
    return isSetField(1541);
  }

  public void set(quickfix.field.InstrumentScopeSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityAltIDSource get(quickfix.field.InstrumentScopeSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityAltIDSource getInstrumentScopeSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityAltIDSource() {
    return isSetField(1542);
  }
}

  public void set(quickfix.field.InstrumentScopeProduct value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeProduct get(quickfix.field.InstrumentScopeProduct value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeProduct getInstrumentScopeProduct() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeProduct());
  }

  public boolean isSet(quickfix.field.InstrumentScopeProduct field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeProduct() {
    return isSetField(1543);
  }

  public void set(quickfix.field.InstrumentScopeProductComplex value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeProductComplex get(quickfix.field.InstrumentScopeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeProductComplex getInstrumentScopeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeProductComplex());
  }

  public boolean isSet(quickfix.field.InstrumentScopeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeProductComplex() {
    return isSetField(1544);
  }

  public void set(quickfix.field.InstrumentScopeSecurityGroup value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityGroup get(quickfix.field.InstrumentScopeSecurityGroup value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityGroup getInstrumentScopeSecurityGroup() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityGroup());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityGroup field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityGroup() {
    return isSetField(1545);
  }

  public void set(quickfix.field.InstrumentScopeCFICode value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeCFICode get(quickfix.field.InstrumentScopeCFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeCFICode getInstrumentScopeCFICode() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeCFICode());
  }

  public boolean isSet(quickfix.field.InstrumentScopeCFICode field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeCFICode() {
    return isSetField(1546);
  }

  public void set(quickfix.field.InstrumentScopeUPICode value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeUPICode get(quickfix.field.InstrumentScopeUPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeUPICode getInstrumentScopeUPICode() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeUPICode());
  }

  public boolean isSet(quickfix.field.InstrumentScopeUPICode field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeUPICode() {
    return isSetField(2895);
  }

  public void set(quickfix.field.InstrumentScopeSecurityType value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityType get(quickfix.field.InstrumentScopeSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityType getInstrumentScopeSecurityType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityType());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityType() {
    return isSetField(1547);
  }

  public void set(quickfix.field.InstrumentScopeSecuritySubType value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecuritySubType get(quickfix.field.InstrumentScopeSecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecuritySubType getInstrumentScopeSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecuritySubType());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecuritySubType() {
    return isSetField(1548);
  }

  public void set(quickfix.field.InstrumentScopeMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeMaturityMonthYear get(quickfix.field.InstrumentScopeMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeMaturityMonthYear getInstrumentScopeMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.InstrumentScopeMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeMaturityMonthYear() {
    return isSetField(1549);
  }

  public void set(quickfix.field.InstrumentScopeMaturityTime value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeMaturityTime get(quickfix.field.InstrumentScopeMaturityTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeMaturityTime getInstrumentScopeMaturityTime() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeMaturityTime());
  }

  public boolean isSet(quickfix.field.InstrumentScopeMaturityTime field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeMaturityTime() {
    return isSetField(1550);
  }

  public void set(quickfix.field.InstrumentScopeRestructuringType value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeRestructuringType get(quickfix.field.InstrumentScopeRestructuringType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeRestructuringType getInstrumentScopeRestructuringType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeRestructuringType());
  }

  public boolean isSet(quickfix.field.InstrumentScopeRestructuringType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeRestructuringType() {
    return isSetField(1551);
  }

  public void set(quickfix.field.InstrumentScopeSeniority value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSeniority get(quickfix.field.InstrumentScopeSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSeniority getInstrumentScopeSeniority() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSeniority());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSeniority field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSeniority() {
    return isSetField(1552);
  }

  public void set(quickfix.field.InstrumentScopePutOrCall value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopePutOrCall get(quickfix.field.InstrumentScopePutOrCall value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopePutOrCall getInstrumentScopePutOrCall() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopePutOrCall());
  }

  public boolean isSet(quickfix.field.InstrumentScopePutOrCall field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopePutOrCall() {
    return isSetField(1553);
  }

  public void set(quickfix.field.InstrumentScopeFlexibleIndicator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeFlexibleIndicator get(quickfix.field.InstrumentScopeFlexibleIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeFlexibleIndicator getInstrumentScopeFlexibleIndicator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeFlexibleIndicator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeFlexibleIndicator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeFlexibleIndicator() {
    return isSetField(1554);
  }

  public void set(quickfix.field.InstrumentScopeCouponRate value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeCouponRate get(quickfix.field.InstrumentScopeCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeCouponRate getInstrumentScopeCouponRate() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeCouponRate());
  }

  public boolean isSet(quickfix.field.InstrumentScopeCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeCouponRate() {
    return isSetField(1555);
  }

  public void set(quickfix.field.InstrumentScopeSecurityExchange value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityExchange get(quickfix.field.InstrumentScopeSecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityExchange getInstrumentScopeSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityExchange());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityExchange() {
    return isSetField(1616);
  }

  public void set(quickfix.field.InstrumentScopeSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityDesc get(quickfix.field.InstrumentScopeSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityDesc getInstrumentScopeSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityDesc());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityDesc() {
    return isSetField(1556);
  }

  public void set(quickfix.field.InstrumentScopeEncodedSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeEncodedSecurityDescLen get(quickfix.field.InstrumentScopeEncodedSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeEncodedSecurityDescLen getInstrumentScopeEncodedSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeEncodedSecurityDescLen());
  }

  public boolean isSet(quickfix.field.InstrumentScopeEncodedSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeEncodedSecurityDescLen() {
    return isSetField(1620);
  }

  public void set(quickfix.field.InstrumentScopeEncodedSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeEncodedSecurityDesc get(quickfix.field.InstrumentScopeEncodedSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeEncodedSecurityDesc getInstrumentScopeEncodedSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeEncodedSecurityDesc());
  }

  public boolean isSet(quickfix.field.InstrumentScopeEncodedSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeEncodedSecurityDesc() {
    return isSetField(1621);
  }

  public void set(quickfix.field.InstrumentScopeSettlType value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSettlType get(quickfix.field.InstrumentScopeSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSettlType getInstrumentScopeSettlType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSettlType());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSettlType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSettlType() {
    return isSetField(1557);
  }
}
