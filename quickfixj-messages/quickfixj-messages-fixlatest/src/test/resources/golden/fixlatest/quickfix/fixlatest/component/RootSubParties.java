/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RootSubParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1120, };
  protected int[] getGroupFields() { return componentGroups; }

  public RootSubParties() {
    super();
  }

  public void set(quickfix.field.NoRootPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRootPartySubIDs get(quickfix.field.NoRootPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRootPartySubIDs getNoRootPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRootPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoRootPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRootPartySubIDs() {
    return isSetField(1120);
  }

public static class NoRootPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1121, 1122, 0};

  public NoRootPartySubIDs() {
    super(1120, 1121, ORDER);
  }

  public void set(quickfix.field.RootPartySubID value) {
    setField(value);
  }

  public quickfix.field.RootPartySubID get(quickfix.field.RootPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubID getRootPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubID());
  }

  public boolean isSet(quickfix.field.RootPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubID() {
    return isSetField(1121);
  }

  public void set(quickfix.field.RootPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RootPartySubIDType get(quickfix.field.RootPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubIDType getRootPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubIDType());
  }

  public boolean isSet(quickfix.field.RootPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubIDType() {
    return isSetField(1122);
  }
}

  public void set(quickfix.field.RootPartySubID value) {
    setField(value);
  }

  public quickfix.field.RootPartySubID get(quickfix.field.RootPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubID getRootPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubID());
  }

  public boolean isSet(quickfix.field.RootPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubID() {
    return isSetField(1121);
  }

  public void set(quickfix.field.RootPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RootPartySubIDType get(quickfix.field.RootPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartySubIDType getRootPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RootPartySubIDType());
  }

  public boolean isSet(quickfix.field.RootPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRootPartySubIDType() {
    return isSetField(1122);
  }
}
