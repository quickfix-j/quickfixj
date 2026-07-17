/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1018, };
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentParties() {
    super();
  }

  public void set(quickfix.field.NoInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentParties get(quickfix.field.NoInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentParties getNoInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentParties() {
    return isSetField(1018);
  }

public static class NoInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1019, 1050, 1051, 2378, 1052, 0};

  public NoInstrumentParties() {
    super(1018, 1019, ORDER);
  }

  public void set(quickfix.field.InstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyID get(quickfix.field.InstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyID getInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyID());
  }

  public boolean isSet(quickfix.field.InstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyID() {
    return isSetField(1019);
  }

  public void set(quickfix.field.InstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyIDSource get(quickfix.field.InstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyIDSource() {
    return isSetField(1050);
  }

  public void set(quickfix.field.InstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyRole get(quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyRole getInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.InstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyRole() {
    return isSetField(1051);
  }

  public void set(quickfix.field.InstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyRoleQualifier get(quickfix.field.InstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyRoleQualifier getInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.InstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyRoleQualifier() {
    return isSetField(2378);
  }

  public void set(quickfix.fixlatest.component.InstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentPtysSubGrp get(quickfix.fixlatest.component.InstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentPtysSubGrp getInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentPartySubIDs get(quickfix.field.NoInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentPartySubIDs() {
    return isSetField(1052);
  }

public static class NoInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1053, 1054, 0};

  public NoInstrumentPartySubIDs() {
    super(1052, 1053, ORDER);
  }

  public void set(quickfix.field.InstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartySubID get(quickfix.field.InstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartySubID getInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.InstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartySubID() {
    return isSetField(1053);
  }

  public void set(quickfix.field.InstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartySubIDType get(quickfix.field.InstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartySubIDType() {
    return isSetField(1054);
  }
}
}

  public void set(quickfix.field.InstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyID get(quickfix.field.InstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyID getInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyID());
  }

  public boolean isSet(quickfix.field.InstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyID() {
    return isSetField(1019);
  }

  public void set(quickfix.field.InstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyIDSource get(quickfix.field.InstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyIDSource() {
    return isSetField(1050);
  }

  public void set(quickfix.field.InstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyRole get(quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyRole getInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.InstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyRole() {
    return isSetField(1051);
  }

  public void set(quickfix.field.InstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartyRoleQualifier get(quickfix.field.InstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartyRoleQualifier getInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.InstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartyRoleQualifier() {
    return isSetField(2378);
  }

  public void set(quickfix.fixlatest.component.InstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentPtysSubGrp get(quickfix.fixlatest.component.InstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentPtysSubGrp getInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentPartySubIDs get(quickfix.field.NoInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentPartySubIDs() {
    return isSetField(1052);
  }

public static class NoInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1053, 1054, 0};

  public NoInstrumentPartySubIDs() {
    super(1052, 1053, ORDER);
  }

  public void set(quickfix.field.InstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartySubID get(quickfix.field.InstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartySubID getInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.InstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartySubID() {
    return isSetField(1053);
  }

  public void set(quickfix.field.InstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.InstrumentPartySubIDType get(quickfix.field.InstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.InstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentPartySubIDType() {
    return isSetField(1054);
  }
}
}
