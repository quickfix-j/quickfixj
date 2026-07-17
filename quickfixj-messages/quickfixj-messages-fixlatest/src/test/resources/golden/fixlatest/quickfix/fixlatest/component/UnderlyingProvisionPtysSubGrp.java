/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionPtysSubGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42177, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionPtysSubGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs get(quickfix.field.NoUnderlyingProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartySubIDs getNoUnderlyingProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartySubIDs() {
    return isSetField(42177);
  }

public static class NoUnderlyingProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42178, 42179, 0};

  public NoUnderlyingProvisionPartySubIDs() {
    super(42177, 42178, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubID get(quickfix.field.UnderlyingProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubID getUnderlyingProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubID() {
    return isSetField(42178);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType get(quickfix.field.UnderlyingProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType getUnderlyingProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubIDType() {
    return isSetField(42179);
  }
}

  public void set(quickfix.field.UnderlyingProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubID get(quickfix.field.UnderlyingProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubID getUnderlyingProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubID() {
    return isSetField(42178);
  }

  public void set(quickfix.field.UnderlyingProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType get(quickfix.field.UnderlyingProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartySubIDType getUnderlyingProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartySubIDType() {
    return isSetField(42179);
  }
}
