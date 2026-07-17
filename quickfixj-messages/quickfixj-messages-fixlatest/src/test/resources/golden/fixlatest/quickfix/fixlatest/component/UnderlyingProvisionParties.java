/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42173, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionParties() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs get(quickfix.field.NoUnderlyingProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionPartyIDs getNoUnderlyingProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionPartyIDs() {
    return isSetField(42173);
  }

public static class NoUnderlyingProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42174, 42175, 42176, 40918, 42177, 0};

  public NoUnderlyingProvisionPartyIDs() {
    super(42173, 42174, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyID get(quickfix.field.UnderlyingProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyID getUnderlyingProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyID() {
    return isSetField(42174);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource get(quickfix.field.UnderlyingProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource getUnderlyingProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyIDSource() {
    return isSetField(42175);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRole get(quickfix.field.UnderlyingProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRole getUnderlyingProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRole() {
    return isSetField(42176);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier get(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier getUnderlyingProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRoleQualifier() {
    return isSetField(40918);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp get(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp getUnderlyingProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp());
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
}

  public void set(quickfix.field.UnderlyingProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyID get(quickfix.field.UnderlyingProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyID getUnderlyingProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyID() {
    return isSetField(42174);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource get(quickfix.field.UnderlyingProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyIDSource getUnderlyingProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyIDSource() {
    return isSetField(42175);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRole get(quickfix.field.UnderlyingProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRole getUnderlyingProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRole() {
    return isSetField(42176);
  }

  public void set(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier get(quickfix.field.UnderlyingProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionPartyRoleQualifier getUnderlyingProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionPartyRoleQualifier() {
    return isSetField(40918);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp get(quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp getUnderlyingProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionPtysSubGrp());
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
}
