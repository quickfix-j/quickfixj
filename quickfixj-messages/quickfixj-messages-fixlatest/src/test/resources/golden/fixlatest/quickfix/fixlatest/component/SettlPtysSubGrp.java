/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {801, };
  protected int[] getGroupFields() { return componentGroups; }

  public SettlPtysSubGrp() {
    super();
  }

  public void set(quickfix.field.NoSettlPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoSettlPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlPartySubIDs() {
    return isSetField(801);
  }

public static class NoSettlPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {785, 786, 0};

  public NoSettlPartySubIDs() {
    super(801, 785, ORDER);
  }

  public void set(quickfix.field.SettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubID());
  }

  public boolean isSet(quickfix.field.SettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubID() {
    return isSetField(785);
  }

  public void set(quickfix.field.SettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.SettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubIDType() {
    return isSetField(786);
  }
}

  public void set(quickfix.field.SettlPartySubID value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubID());
  }

  public boolean isSet(quickfix.field.SettlPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubID() {
    return isSetField(785);
  }

  public void set(quickfix.field.SettlPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.SettlPartySubIDType());
  }

  public boolean isSet(quickfix.field.SettlPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubIDType() {
    return isSetField(786);
  }
}
