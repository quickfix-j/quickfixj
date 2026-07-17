/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1052, };
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentPtysSubGrp() {
    super();
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
