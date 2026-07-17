/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegInstrumentParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2254, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegInstrumentParties() {
    super();
  }

  public void set(quickfix.field.NoLegInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoLegInstrumentParties get(quickfix.field.NoLegInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegInstrumentParties getNoLegInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoLegInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoLegInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoLegInstrumentParties() {
    return isSetField(2254);
  }

public static class NoLegInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2255, 2256, 2257, 2379, 2258, 0};

  public NoLegInstrumentParties() {
    super(2254, 2255, ORDER);
  }

  public void set(quickfix.field.LegInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyID get(quickfix.field.LegInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyID getLegInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyID() {
    return isSetField(2255);
  }

  public void set(quickfix.field.LegInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyIDSource get(quickfix.field.LegInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyIDSource getLegInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyIDSource() {
    return isSetField(2256);
  }

  public void set(quickfix.field.LegInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyRole get(quickfix.field.LegInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyRole getLegInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyRole() {
    return isSetField(2257);
  }

  public void set(quickfix.field.LegInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyRoleQualifier get(quickfix.field.LegInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyRoleQualifier getLegInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyRoleQualifier() {
    return isSetField(2379);
  }

  public void set(quickfix.fixlatest.component.LegInstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegInstrumentPtysSubGrp get(quickfix.fixlatest.component.LegInstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegInstrumentPtysSubGrp getLegInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegInstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoLegInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegInstrumentPartySubIDs get(quickfix.field.NoLegInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegInstrumentPartySubIDs getNoLegInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegInstrumentPartySubIDs() {
    return isSetField(2258);
  }

public static class NoLegInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2259, 2260, 0};

  public NoLegInstrumentPartySubIDs() {
    super(2258, 2259, ORDER);
  }

  public void set(quickfix.field.LegInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartySubID get(quickfix.field.LegInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartySubID getLegInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartySubID() {
    return isSetField(2259);
  }

  public void set(quickfix.field.LegInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartySubIDType get(quickfix.field.LegInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartySubIDType getLegInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartySubIDType() {
    return isSetField(2260);
  }
}
}

  public void set(quickfix.field.LegInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyID get(quickfix.field.LegInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyID getLegInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyID() {
    return isSetField(2255);
  }

  public void set(quickfix.field.LegInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyIDSource get(quickfix.field.LegInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyIDSource getLegInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyIDSource() {
    return isSetField(2256);
  }

  public void set(quickfix.field.LegInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyRole get(quickfix.field.LegInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyRole getLegInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyRole() {
    return isSetField(2257);
  }

  public void set(quickfix.field.LegInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartyRoleQualifier get(quickfix.field.LegInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartyRoleQualifier getLegInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartyRoleQualifier() {
    return isSetField(2379);
  }

  public void set(quickfix.fixlatest.component.LegInstrumentPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegInstrumentPtysSubGrp get(quickfix.fixlatest.component.LegInstrumentPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegInstrumentPtysSubGrp getLegInstrumentPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegInstrumentPtysSubGrp());
  }

  public void set(quickfix.field.NoLegInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegInstrumentPartySubIDs get(quickfix.field.NoLegInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegInstrumentPartySubIDs getNoLegInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoLegInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegInstrumentPartySubIDs() {
    return isSetField(2258);
  }

public static class NoLegInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2259, 2260, 0};

  public NoLegInstrumentPartySubIDs() {
    super(2258, 2259, ORDER);
  }

  public void set(quickfix.field.LegInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartySubID get(quickfix.field.LegInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartySubID getLegInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartySubID() {
    return isSetField(2259);
  }

  public void set(quickfix.field.LegInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.LegInstrumentPartySubIDType get(quickfix.field.LegInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegInstrumentPartySubIDType getLegInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.LegInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.LegInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegInstrumentPartySubIDType() {
    return isSetField(2260);
  }
}
}
