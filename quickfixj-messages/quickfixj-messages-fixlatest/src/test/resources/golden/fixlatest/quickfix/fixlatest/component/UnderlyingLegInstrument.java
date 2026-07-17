/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingLegInstrument extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1330, 1331, 1332, 1333, 1344, 1337, 1338, 1339, 1345, 1405, 1340, 1391, 1343, 1341, 1392, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingLegInstrument() {
    super();
  }

  public void set(quickfix.field.UnderlyingLegSymbol value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSymbol get(quickfix.field.UnderlyingLegSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSymbol getUnderlyingLegSymbol() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSymbol());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSymbol field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSymbol() {
    return isSetField(1330);
  }

  public void set(quickfix.field.UnderlyingLegSymbolSfx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSymbolSfx get(quickfix.field.UnderlyingLegSymbolSfx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSymbolSfx getUnderlyingLegSymbolSfx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSymbolSfx());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSymbolSfx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSymbolSfx() {
    return isSetField(1331);
  }

  public void set(quickfix.field.UnderlyingLegSecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityID get(quickfix.field.UnderlyingLegSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityID getUnderlyingLegSecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityID() {
    return isSetField(1332);
  }

  public void set(quickfix.field.UnderlyingLegSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityIDSource get(quickfix.field.UnderlyingLegSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityIDSource getUnderlyingLegSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityIDSource() {
    return isSetField(1333);
  }

  public void set(quickfix.fixlatest.component.UnderlyingLegSecurityAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingLegSecurityAltIDGrp get(quickfix.fixlatest.component.UnderlyingLegSecurityAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingLegSecurityAltIDGrp getUnderlyingLegSecurityAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingLegSecurityAltIDGrp());
  }

  public void set(quickfix.field.NoUnderlyingLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingLegSecurityAltID get(quickfix.field.NoUnderlyingLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingLegSecurityAltID getNoUnderlyingLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoUnderlyingLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingLegSecurityAltID() {
    return isSetField(1334);
  }

public static class NoUnderlyingLegSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1335, 1336, 0};

  public NoUnderlyingLegSecurityAltID() {
    super(1334, 1335, ORDER);
  }

  public void set(quickfix.field.UnderlyingLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityAltID get(quickfix.field.UnderlyingLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityAltID getUnderlyingLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityAltID() {
    return isSetField(1335);
  }

  public void set(quickfix.field.UnderlyingLegSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityAltIDSource get(quickfix.field.UnderlyingLegSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityAltIDSource getUnderlyingLegSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityAltIDSource() {
    return isSetField(1336);
  }
}

  public void set(quickfix.field.UnderlyingLegCFICode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegCFICode get(quickfix.field.UnderlyingLegCFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegCFICode getUnderlyingLegCFICode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegCFICode());
  }

  public boolean isSet(quickfix.field.UnderlyingLegCFICode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegCFICode() {
    return isSetField(1344);
  }

  public void set(quickfix.field.UnderlyingLegSecurityType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityType get(quickfix.field.UnderlyingLegSecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityType getUnderlyingLegSecurityType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityType());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityType() {
    return isSetField(1337);
  }

  public void set(quickfix.field.UnderlyingLegSecuritySubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecuritySubType get(quickfix.field.UnderlyingLegSecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecuritySubType getUnderlyingLegSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecuritySubType());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecuritySubType() {
    return isSetField(1338);
  }

  public void set(quickfix.field.UnderlyingLegMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegMaturityMonthYear get(quickfix.field.UnderlyingLegMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegMaturityMonthYear getUnderlyingLegMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.UnderlyingLegMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegMaturityMonthYear() {
    return isSetField(1339);
  }

  public void set(quickfix.field.UnderlyingLegMaturityDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegMaturityDate get(quickfix.field.UnderlyingLegMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegMaturityDate getUnderlyingLegMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegMaturityDate());
  }

  public boolean isSet(quickfix.field.UnderlyingLegMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegMaturityDate() {
    return isSetField(1345);
  }

  public void set(quickfix.field.UnderlyingLegMaturityTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegMaturityTime get(quickfix.field.UnderlyingLegMaturityTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegMaturityTime getUnderlyingLegMaturityTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegMaturityTime());
  }

  public boolean isSet(quickfix.field.UnderlyingLegMaturityTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegMaturityTime() {
    return isSetField(1405);
  }

  public void set(quickfix.field.UnderlyingLegStrikePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegStrikePrice get(quickfix.field.UnderlyingLegStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegStrikePrice getUnderlyingLegStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegStrikePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingLegStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegStrikePrice() {
    return isSetField(1340);
  }

  public void set(quickfix.field.UnderlyingLegOptAttribute value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegOptAttribute get(quickfix.field.UnderlyingLegOptAttribute value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegOptAttribute getUnderlyingLegOptAttribute() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegOptAttribute());
  }

  public boolean isSet(quickfix.field.UnderlyingLegOptAttribute field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegOptAttribute() {
    return isSetField(1391);
  }

  public void set(quickfix.field.UnderlyingLegPutOrCall value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegPutOrCall get(quickfix.field.UnderlyingLegPutOrCall value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegPutOrCall getUnderlyingLegPutOrCall() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegPutOrCall());
  }

  public boolean isSet(quickfix.field.UnderlyingLegPutOrCall field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegPutOrCall() {
    return isSetField(1343);
  }

  public void set(quickfix.field.UnderlyingLegSecurityExchange value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityExchange get(quickfix.field.UnderlyingLegSecurityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityExchange getUnderlyingLegSecurityExchange() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityExchange());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityExchange field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityExchange() {
    return isSetField(1341);
  }

  public void set(quickfix.field.UnderlyingLegSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityDesc get(quickfix.field.UnderlyingLegSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityDesc getUnderlyingLegSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityDesc() {
    return isSetField(1392);
  }
}
