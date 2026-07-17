/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40533, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionParties() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartyIDs get(quickfix.field.NoLegProvisionPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartyIDs getNoLegProvisionPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartyIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartyIDs() {
    return isSetField(40533);
  }

public static class NoLegProvisionPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40534, 40535, 40536, 2380, 40537, 0};

  public NoLegProvisionPartyIDs() {
    super(40533, 40534, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyID get(quickfix.field.LegProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyID getLegProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyID() {
    return isSetField(40534);
  }

  public void set(quickfix.field.LegProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyIDSource get(quickfix.field.LegProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyIDSource getLegProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyIDSource() {
    return isSetField(40535);
  }

  public void set(quickfix.field.LegProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRole get(quickfix.field.LegProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRole getLegProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRole() {
    return isSetField(40536);
  }

  public void set(quickfix.field.LegProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRoleQualifier get(quickfix.field.LegProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRoleQualifier getLegProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRoleQualifier() {
    return isSetField(2380);
  }

  public void set(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp get(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp getLegProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoLegProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartySubIDs get(quickfix.field.NoLegProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartySubIDs getNoLegProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartySubIDs() {
    return isSetField(40537);
  }

public static class NoLegProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40538, 40539, 0};

  public NoLegProvisionPartySubIDs() {
    super(40537, 40538, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}
}

  public void set(quickfix.field.LegProvisionPartyID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyID get(quickfix.field.LegProvisionPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyID getLegProvisionPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyID() {
    return isSetField(40534);
  }

  public void set(quickfix.field.LegProvisionPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyIDSource get(quickfix.field.LegProvisionPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyIDSource getLegProvisionPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyIDSource() {
    return isSetField(40535);
  }

  public void set(quickfix.field.LegProvisionPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRole get(quickfix.field.LegProvisionPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRole getLegProvisionPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRole());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRole() {
    return isSetField(40536);
  }

  public void set(quickfix.field.LegProvisionPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartyRoleQualifier get(quickfix.field.LegProvisionPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartyRoleQualifier getLegProvisionPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegProvisionPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartyRoleQualifier() {
    return isSetField(2380);
  }

  public void set(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp get(quickfix.fixlatest.component.LegProvisionPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionPtysSubGrp getLegProvisionPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionPtysSubGrp());
  }

  public void set(quickfix.field.NoLegProvisionPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionPartySubIDs get(quickfix.field.NoLegProvisionPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionPartySubIDs getNoLegProvisionPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegProvisionPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionPartySubIDs() {
    return isSetField(40537);
  }

public static class NoLegProvisionPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40538, 40539, 0};

  public NoLegProvisionPartySubIDs() {
    super(40537, 40538, ORDER);
  }

  public void set(quickfix.field.LegProvisionPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubID get(quickfix.field.LegProvisionPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubID getLegProvisionPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubID());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubID() {
    return isSetField(40538);
  }

  public void set(quickfix.field.LegProvisionPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionPartySubIDType get(quickfix.field.LegProvisionPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionPartySubIDType getLegProvisionPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegProvisionPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionPartySubIDType() {
    return isSetField(40539);
  }
}
}
