/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class NestedParties4 extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1414, };
  protected int[] getGroupFields() { return componentGroups; }

  public NestedParties4() {
    super();
  }

  public void set(quickfix.field.NoNested4PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested4PartyIDs get(quickfix.field.NoNested4PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested4PartyIDs getNoNested4PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested4PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested4PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested4PartyIDs() {
    return isSetField(1414);
  }

public static class NoNested4PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1415, 1416, 1417, 2383, 1413, 0};

  public NoNested4PartyIDs() {
    super(1414, 1415, ORDER);
  }

  public void set(quickfix.field.Nested4PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyID get(quickfix.field.Nested4PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyID getNested4PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyID());
  }

  public boolean isSet(quickfix.field.Nested4PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyID() {
    return isSetField(1415);
  }

  public void set(quickfix.field.Nested4PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyIDSource get(quickfix.field.Nested4PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyIDSource getNested4PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested4PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyIDSource() {
    return isSetField(1416);
  }

  public void set(quickfix.field.Nested4PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyRole get(quickfix.field.Nested4PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyRole getNested4PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyRole());
  }

  public boolean isSet(quickfix.field.Nested4PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyRole() {
    return isSetField(1417);
  }

  public void set(quickfix.field.Nested4PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyRoleQualifier get(quickfix.field.Nested4PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyRoleQualifier getNested4PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested4PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyRoleQualifier() {
    return isSetField(2383);
  }

  public void set(quickfix.fixlatest.component.NstdPtys4SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys4SubGrp get(quickfix.fixlatest.component.NstdPtys4SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys4SubGrp getNstdPtys4SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys4SubGrp());
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
}

  public void set(quickfix.field.Nested4PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyID get(quickfix.field.Nested4PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyID getNested4PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyID());
  }

  public boolean isSet(quickfix.field.Nested4PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyID() {
    return isSetField(1415);
  }

  public void set(quickfix.field.Nested4PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyIDSource get(quickfix.field.Nested4PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyIDSource getNested4PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested4PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyIDSource() {
    return isSetField(1416);
  }

  public void set(quickfix.field.Nested4PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyRole get(quickfix.field.Nested4PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyRole getNested4PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyRole());
  }

  public boolean isSet(quickfix.field.Nested4PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyRole() {
    return isSetField(1417);
  }

  public void set(quickfix.field.Nested4PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested4PartyRoleQualifier get(quickfix.field.Nested4PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested4PartyRoleQualifier getNested4PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested4PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested4PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested4PartyRoleQualifier() {
    return isSetField(2383);
  }

  public void set(quickfix.fixlatest.component.NstdPtys4SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys4SubGrp get(quickfix.fixlatest.component.NstdPtys4SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys4SubGrp getNstdPtys4SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys4SubGrp());
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
}
