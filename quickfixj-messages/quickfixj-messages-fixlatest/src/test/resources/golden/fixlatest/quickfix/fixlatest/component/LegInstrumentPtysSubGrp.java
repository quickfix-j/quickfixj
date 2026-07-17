/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegInstrumentPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2258, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegInstrumentPtysSubGrp() {
    super();
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
