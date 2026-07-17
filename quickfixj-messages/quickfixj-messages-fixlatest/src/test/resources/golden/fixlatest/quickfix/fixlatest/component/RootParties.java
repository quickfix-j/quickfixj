/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RootParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1116, };
  protected int[] getGroupFields() { return componentGroups; }

  public RootParties() {
    super();
  }

  public void set(quickfix.field.NoRootPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoRootPartyIDs get(quickfix.field.NoRootPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRootPartyIDs getNoRootPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRootPartyIDs());
  }

  public boolean isSet(quickfix.field.NoRootPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRootPartyIDs() {
    return isSetField(1116);
  }

public static class NoRootPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1117, 1118, 1119, 2388, 1120, 0};

  public NoRootPartyIDs() {
    super(1116, 1117, ORDER);
  }

  public void set(quickfix.field.RootPartyID value) {
    setField(value);
  }

  public quickfix.field.RootPartyID get(quickfix.field.RootPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyID getRootPartyID() throws FieldNotFound {
    return get(new quickfix.field.RootPartyID());
  }

  public boolean isSet(quickfix.field.RootPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyID() {
    return isSetField(1117);
  }

  public void set(quickfix.field.RootPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RootPartyIDSource get(quickfix.field.RootPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyIDSource getRootPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RootPartyIDSource());
  }

  public boolean isSet(quickfix.field.RootPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyIDSource() {
    return isSetField(1118);
  }

  public void set(quickfix.field.RootPartyRole value) {
    setField(value);
  }

  public quickfix.field.RootPartyRole get(quickfix.field.RootPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRole getRootPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRole());
  }

  public boolean isSet(quickfix.field.RootPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRole() {
    return isSetField(1119);
  }

  public void set(quickfix.field.RootPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RootPartyRoleQualifier get(quickfix.field.RootPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRoleQualifier getRootPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RootPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRoleQualifier() {
    return isSetField(2388);
  }

  public void set(quickfix.fixlatest.component.RootSubParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RootSubParties get(quickfix.fixlatest.component.RootSubParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RootSubParties getRootSubPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RootSubParties());
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
}

  public void set(quickfix.field.RootPartyID value) {
    setField(value);
  }

  public quickfix.field.RootPartyID get(quickfix.field.RootPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyID getRootPartyID() throws FieldNotFound {
    return get(new quickfix.field.RootPartyID());
  }

  public boolean isSet(quickfix.field.RootPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyID() {
    return isSetField(1117);
  }

  public void set(quickfix.field.RootPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RootPartyIDSource get(quickfix.field.RootPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyIDSource getRootPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RootPartyIDSource());
  }

  public boolean isSet(quickfix.field.RootPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyIDSource() {
    return isSetField(1118);
  }

  public void set(quickfix.field.RootPartyRole value) {
    setField(value);
  }

  public quickfix.field.RootPartyRole get(quickfix.field.RootPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRole getRootPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRole());
  }

  public boolean isSet(quickfix.field.RootPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRole() {
    return isSetField(1119);
  }

  public void set(quickfix.field.RootPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RootPartyRoleQualifier get(quickfix.field.RootPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RootPartyRoleQualifier getRootPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RootPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RootPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRootPartyRoleQualifier() {
    return isSetField(2388);
  }

  public void set(quickfix.fixlatest.component.RootSubParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RootSubParties get(quickfix.fixlatest.component.RootSubParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RootSubParties getRootSubPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RootSubParties());
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
}
