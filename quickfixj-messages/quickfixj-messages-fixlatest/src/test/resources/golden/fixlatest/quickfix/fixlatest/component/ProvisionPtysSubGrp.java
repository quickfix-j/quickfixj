/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40178, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionPtysSubGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartySubIDs get(quickfix.field.NoProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartySubIDs getNoProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartySubIDs() {
    return isSetField(40178);
  }

public static class NoProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40179, 40180, 0};

  public NoProvisionPartySubIDs() {
    super(40178, 40179, ORDER);
  }

  public void set(quickfix.field.ProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubID get(quickfix.field.ProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubID getProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubID() {
    return isSetField(40179);
  }

  public void set(quickfix.field.ProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubIDType get(quickfix.field.ProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubIDType getProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubIDType() {
    return isSetField(40180);
  }
}

  public void set(quickfix.field.ProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubID get(quickfix.field.ProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubID getProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubID() {
    return isSetField(40179);
  }

  public void set(quickfix.field.ProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartySubIDType get(quickfix.field.ProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartySubIDType getProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.ProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartySubIDType() {
    return isSetField(40180);
  }
}
