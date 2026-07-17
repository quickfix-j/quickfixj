/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PegInstructions extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {211, 1094, 835, 836, 837, 838, 840, 1096, 1097, 1098, 1099, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PegInstructions() {
    super();
  }

  public void set(quickfix.field.PegOffsetValue value) {
    setField(value);
  }

  public quickfix.field.PegOffsetValue get(quickfix.field.PegOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegOffsetValue getPegOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.PegOffsetValue());
  }

  public boolean isSet(quickfix.field.PegOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetPegOffsetValue() {
    return isSetField(211);
  }

  public void set(quickfix.field.PegPriceType value) {
    setField(value);
  }

  public quickfix.field.PegPriceType get(quickfix.field.PegPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegPriceType getPegPriceType() throws FieldNotFound {
    return get(new quickfix.field.PegPriceType());
  }

  public boolean isSet(quickfix.field.PegPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPegPriceType() {
    return isSetField(1094);
  }

  public void set(quickfix.field.PegMoveType value) {
    setField(value);
  }

  public quickfix.field.PegMoveType get(quickfix.field.PegMoveType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegMoveType getPegMoveType() throws FieldNotFound {
    return get(new quickfix.field.PegMoveType());
  }

  public boolean isSet(quickfix.field.PegMoveType field) {
    return isSetField(field);
  }

  public boolean isSetPegMoveType() {
    return isSetField(835);
  }

  public void set(quickfix.field.PegOffsetType value) {
    setField(value);
  }

  public quickfix.field.PegOffsetType get(quickfix.field.PegOffsetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegOffsetType getPegOffsetType() throws FieldNotFound {
    return get(new quickfix.field.PegOffsetType());
  }

  public boolean isSet(quickfix.field.PegOffsetType field) {
    return isSetField(field);
  }

  public boolean isSetPegOffsetType() {
    return isSetField(836);
  }

  public void set(quickfix.field.PegLimitType value) {
    setField(value);
  }

  public quickfix.field.PegLimitType get(quickfix.field.PegLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegLimitType getPegLimitType() throws FieldNotFound {
    return get(new quickfix.field.PegLimitType());
  }

  public boolean isSet(quickfix.field.PegLimitType field) {
    return isSetField(field);
  }

  public boolean isSetPegLimitType() {
    return isSetField(837);
  }

  public void set(quickfix.field.PegRoundDirection value) {
    setField(value);
  }

  public quickfix.field.PegRoundDirection get(quickfix.field.PegRoundDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegRoundDirection getPegRoundDirection() throws FieldNotFound {
    return get(new quickfix.field.PegRoundDirection());
  }

  public boolean isSet(quickfix.field.PegRoundDirection field) {
    return isSetField(field);
  }

  public boolean isSetPegRoundDirection() {
    return isSetField(838);
  }

  public void set(quickfix.field.PegScope value) {
    setField(value);
  }

  public quickfix.field.PegScope get(quickfix.field.PegScope value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegScope getPegScope() throws FieldNotFound {
    return get(new quickfix.field.PegScope());
  }

  public boolean isSet(quickfix.field.PegScope field) {
    return isSetField(field);
  }

  public boolean isSetPegScope() {
    return isSetField(840);
  }

  public void set(quickfix.field.PegSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.PegSecurityIDSource get(quickfix.field.PegSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegSecurityIDSource getPegSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.PegSecurityIDSource());
  }

  public boolean isSet(quickfix.field.PegSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPegSecurityIDSource() {
    return isSetField(1096);
  }

  public void set(quickfix.field.PegSecurityID value) {
    setField(value);
  }

  public quickfix.field.PegSecurityID get(quickfix.field.PegSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegSecurityID getPegSecurityID() throws FieldNotFound {
    return get(new quickfix.field.PegSecurityID());
  }

  public boolean isSet(quickfix.field.PegSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetPegSecurityID() {
    return isSetField(1097);
  }

  public void set(quickfix.field.PegSymbol value) {
    setField(value);
  }

  public quickfix.field.PegSymbol get(quickfix.field.PegSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegSymbol getPegSymbol() throws FieldNotFound {
    return get(new quickfix.field.PegSymbol());
  }

  public boolean isSet(quickfix.field.PegSymbol field) {
    return isSetField(field);
  }

  public boolean isSetPegSymbol() {
    return isSetField(1098);
  }

  public void set(quickfix.field.PegSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.PegSecurityDesc get(quickfix.field.PegSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PegSecurityDesc getPegSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.PegSecurityDesc());
  }

  public boolean isSet(quickfix.field.PegSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetPegSecurityDesc() {
    return isSetField(1099);
  }
}
