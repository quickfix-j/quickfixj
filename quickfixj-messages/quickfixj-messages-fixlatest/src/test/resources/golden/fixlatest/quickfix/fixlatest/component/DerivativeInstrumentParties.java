/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeInstrumentParties extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1292, };
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeInstrumentParties() {
    super();
  }

  public void set(quickfix.field.NoDerivativeInstrumentParties value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrumentParties get(quickfix.field.NoDerivativeInstrumentParties value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrumentParties getNoDerivativeInstrumentParties() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrumentParties());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrumentParties field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrumentParties() {
    return isSetField(1292);
  }

public static class NoDerivativeInstrumentParties extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1293, 1294, 1295, 2377, 1296, 0};

  public NoDerivativeInstrumentParties() {
    super(1292, 1293, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyID get(quickfix.field.DerivativeInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyID getDerivativeInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyID() {
    return isSetField(1293);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyIDSource get(quickfix.field.DerivativeInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyIDSource getDerivativeInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyIDSource() {
    return isSetField(1294);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyRole get(quickfix.field.DerivativeInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyRole getDerivativeInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyRole() {
    return isSetField(1295);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyRoleQualifier get(quickfix.field.DerivativeInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyRoleQualifier getDerivativeInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyRoleQualifier() {
    return isSetField(2377);
  }

  public void set(quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp get(quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp getDerivativeInstrumentPartySubIDsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp());
  }

  public void set(quickfix.field.NoDerivativeInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs get(quickfix.field.NoDerivativeInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs getNoDerivativeInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrumentPartySubIDs() {
    return isSetField(1296);
  }

public static class NoDerivativeInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1297, 1298, 0};

  public NoDerivativeInstrumentPartySubIDs() {
    super(1296, 1297, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubID get(quickfix.field.DerivativeInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubID getDerivativeInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubID() {
    return isSetField(1297);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType get(quickfix.field.DerivativeInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType getDerivativeInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubIDType() {
    return isSetField(1298);
  }
}
}

  public void set(quickfix.field.DerivativeInstrumentPartyID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyID get(quickfix.field.DerivativeInstrumentPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyID getDerivativeInstrumentPartyID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyID() {
    return isSetField(1293);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyIDSource get(quickfix.field.DerivativeInstrumentPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyIDSource getDerivativeInstrumentPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyIDSource() {
    return isSetField(1294);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyRole value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyRole get(quickfix.field.DerivativeInstrumentPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyRole getDerivativeInstrumentPartyRole() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyRole());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyRole() {
    return isSetField(1295);
  }

  public void set(quickfix.field.DerivativeInstrumentPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartyRoleQualifier get(quickfix.field.DerivativeInstrumentPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartyRoleQualifier getDerivativeInstrumentPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartyRoleQualifier() {
    return isSetField(2377);
  }

  public void set(quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp get(quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp getDerivativeInstrumentPartySubIDsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrumentPartySubIDsGrp());
  }

  public void set(quickfix.field.NoDerivativeInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs get(quickfix.field.NoDerivativeInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs getNoDerivativeInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrumentPartySubIDs() {
    return isSetField(1296);
  }

public static class NoDerivativeInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1297, 1298, 0};

  public NoDerivativeInstrumentPartySubIDs() {
    super(1296, 1297, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubID get(quickfix.field.DerivativeInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubID getDerivativeInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubID() {
    return isSetField(1297);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType get(quickfix.field.DerivativeInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType getDerivativeInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubIDType() {
    return isSetField(1298);
  }
}
}
