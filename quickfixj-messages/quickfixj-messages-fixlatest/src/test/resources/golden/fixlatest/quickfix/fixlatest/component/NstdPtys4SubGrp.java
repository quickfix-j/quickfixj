/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class NstdPtys4SubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1413, };
  protected int[] getGroupFields() { return componentGroups; }

  public NstdPtys4SubGrp() {
    super();
  }

  public void set(quickfix.field.NoNested4PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested4PartySubIDs get(quickfix.field.NoNested4PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested4PartySubIDs getNoNested4PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested4PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested4PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested4PartySubIDs() {
    return isSetField(1413);
  }

public static class NoNested4PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1412, 1411, 0};

  public NoNested4PartySubIDs() {
    super(1413, 1412, ORDER);
  }

  public void set(quickfix.field.Nested4PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested4PartySubID get(quickfix.field.Nested4PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartySubID getNested4PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartySubID());
  }

  public boolean isSet(quickfix.field.Nested4PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartySubID() {
    return isSetField(1412);
  }

  public void set(quickfix.field.Nested4PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested4PartySubIDType get(quickfix.field.Nested4PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartySubIDType getNested4PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested4PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartySubIDType() {
    return isSetField(1411);
  }
}

  public void set(quickfix.field.Nested4PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested4PartySubID get(quickfix.field.Nested4PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartySubID getNested4PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartySubID());
  }

  public boolean isSet(quickfix.field.Nested4PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartySubID() {
    return isSetField(1412);
  }

  public void set(quickfix.field.Nested4PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested4PartySubIDType get(quickfix.field.Nested4PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartySubIDType getNested4PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested4PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartySubIDType() {
    return isSetField(1411);
  }
}
