/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UndlyInstrumentParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1058, };
  protected int[] getGroupFields() { return componentGroups; }

  public UndlyInstrumentParties() {
    super();
  }

  public void set(quickfix.field.NoUndlyInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentParties get(quickfix.field.NoUndlyInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentParties getNoUndlyInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoUndlyInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentParties() {
    return isSetField(1058);
  }

public static class NoUndlyInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1059, 1060, 1061, 2391, 1062, 0};

  public NoUndlyInstrumentParties() {
    super(1058, 1059, ORDER);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyID get(quickfix.field.UnderlyingInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyID getUnderlyingInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyID() {
    return isSetField(1059);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyIDSource get(quickfix.field.UnderlyingInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyIDSource getUnderlyingInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyIDSource() {
    return isSetField(1060);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyRole get(quickfix.field.UnderlyingInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyRole getUnderlyingInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyRole() {
    return isSetField(1061);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyRoleQualifier get(quickfix.field.UnderlyingInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyRoleQualifier getUnderlyingInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyRoleQualifier() {
    return isSetField(2391);
  }

  public void set(quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp get(quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUndlyInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentPartySubIDs() {
    return isSetField(1062);
  }

public static class NoUndlyInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1063, 1064, 0};

  public NoUndlyInstrumentPartySubIDs() {
    super(1062, 1063, ORDER);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartySubID get(quickfix.field.UnderlyingInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartySubID getUnderlyingInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartySubID() {
    return isSetField(1063);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartySubIDType get(quickfix.field.UnderlyingInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartySubIDType getUnderlyingInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartySubIDType() {
    return isSetField(1064);
  }
}
}

  public void set(quickfix.field.UnderlyingInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyID get(quickfix.field.UnderlyingInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyID getUnderlyingInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyID() {
    return isSetField(1059);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyIDSource get(quickfix.field.UnderlyingInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyIDSource getUnderlyingInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyIDSource() {
    return isSetField(1060);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyRole get(quickfix.field.UnderlyingInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyRole getUnderlyingInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyRole() {
    return isSetField(1061);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartyRoleQualifier get(quickfix.field.UnderlyingInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartyRoleQualifier getUnderlyingInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartyRoleQualifier() {
    return isSetField(2391);
  }

  public void set(quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp get(quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UndlyInstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUndlyInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentPartySubIDs() {
    return isSetField(1062);
  }

public static class NoUndlyInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1063, 1064, 0};

  public NoUndlyInstrumentPartySubIDs() {
    super(1062, 1063, ORDER);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartySubID get(quickfix.field.UnderlyingInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartySubID getUnderlyingInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartySubID() {
    return isSetField(1063);
  }

  public void set(quickfix.field.UnderlyingInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrumentPartySubIDType get(quickfix.field.UnderlyingInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrumentPartySubIDType getUnderlyingInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrumentPartySubIDType() {
    return isSetField(1064);
  }
}
}
