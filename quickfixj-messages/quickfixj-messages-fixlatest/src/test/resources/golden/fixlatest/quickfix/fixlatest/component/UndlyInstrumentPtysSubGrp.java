/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UndlyInstrumentPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1062, };
  protected int[] getGroupFields() { return componentGroups; }

  public UndlyInstrumentPtysSubGrp() {
    super();
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
