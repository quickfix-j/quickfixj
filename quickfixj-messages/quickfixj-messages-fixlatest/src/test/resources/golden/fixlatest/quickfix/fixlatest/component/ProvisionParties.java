/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40174, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionParties() {
    super();
  }

  public void set(quickfix.field.NoProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoProvisionPartyIDs get(quickfix.field.NoProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionPartyIDs getNoProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionPartyIDs() {
    return isSetField(40174);
  }

public static class NoProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40175, 40176, 40177, 2385, 40178, 0};

  public NoProvisionPartyIDs() {
    super(40174, 40175, ORDER);
  }

  public void set(quickfix.field.ProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyID get(quickfix.field.ProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyID getProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyID());
  }

  public boolean isSet(quickfix.field.ProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyID() {
    return isSetField(40175);
  }

  public void set(quickfix.field.ProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyIDSource get(quickfix.field.ProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyIDSource getProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.ProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyIDSource() {
    return isSetField(40176);
  }

  public void set(quickfix.field.ProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRole get(quickfix.field.ProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRole getProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRole() {
    return isSetField(40177);
  }

  public void set(quickfix.field.ProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRoleQualifier get(quickfix.field.ProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRoleQualifier getProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRoleQualifier() {
    return isSetField(2385);
  }

  public void set(quickfix.fixlatest.component.ProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp get(quickfix.fixlatest.component.ProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp getProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionPtysSubGrp());
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
}

  public void set(quickfix.field.ProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyID get(quickfix.field.ProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyID getProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyID());
  }

  public boolean isSet(quickfix.field.ProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyID() {
    return isSetField(40175);
  }

  public void set(quickfix.field.ProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyIDSource get(quickfix.field.ProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyIDSource getProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.ProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyIDSource() {
    return isSetField(40176);
  }

  public void set(quickfix.field.ProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRole get(quickfix.field.ProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRole getProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRole() {
    return isSetField(40177);
  }

  public void set(quickfix.field.ProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.ProvisionPartyRoleQualifier get(quickfix.field.ProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionPartyRoleQualifier getProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.ProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProvisionPartyRoleQualifier() {
    return isSetField(2385);
  }

  public void set(quickfix.fixlatest.component.ProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp get(quickfix.fixlatest.component.ProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionPtysSubGrp getProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionPtysSubGrp());
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
}
