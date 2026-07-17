/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RequestingPartyGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1657, };
  protected int[] getGroupFields() { return componentGroups; }

  public RequestingPartyGrp() {
    super();
  }

  public void set(quickfix.field.NoRequestingPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoRequestingPartyIDs get(quickfix.field.NoRequestingPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestingPartyIDs getNoRequestingPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRequestingPartyIDs());
  }

  public boolean isSet(quickfix.field.NoRequestingPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestingPartyIDs() {
    return isSetField(1657);
  }

public static class NoRequestingPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1658, 1659, 1660, 2338, 1661, 0};

  public NoRequestingPartyIDs() {
    super(1657, 1658, ORDER);
  }

  public void set(quickfix.field.RequestingPartyID value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyID get(quickfix.field.RequestingPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyID getRequestingPartyID() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyID());
  }

  public boolean isSet(quickfix.field.RequestingPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyID() {
    return isSetField(1658);
  }

  public void set(quickfix.field.RequestingPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyIDSource get(quickfix.field.RequestingPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyIDSource getRequestingPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyIDSource());
  }

  public boolean isSet(quickfix.field.RequestingPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyIDSource() {
    return isSetField(1659);
  }

  public void set(quickfix.field.RequestingPartyRole value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyRole get(quickfix.field.RequestingPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyRole getRequestingPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyRole());
  }

  public boolean isSet(quickfix.field.RequestingPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyRole() {
    return isSetField(1660);
  }

  public void set(quickfix.field.RequestingPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyRoleQualifier get(quickfix.field.RequestingPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyRoleQualifier getRequestingPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RequestingPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyRoleQualifier() {
    return isSetField(2338);
  }

  public void set(quickfix.fixlatest.component.RequestingPartySubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RequestingPartySubGrp get(quickfix.fixlatest.component.RequestingPartySubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RequestingPartySubGrp getRequestingPartySubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RequestingPartySubGrp());
  }

  public void set(quickfix.field.NoRequestingPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRequestingPartySubIDs get(quickfix.field.NoRequestingPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestingPartySubIDs getNoRequestingPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRequestingPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoRequestingPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestingPartySubIDs() {
    return isSetField(1661);
  }

public static class NoRequestingPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1662, 1663, 0};

  public NoRequestingPartySubIDs() {
    super(1661, 1662, ORDER);
  }

  public void set(quickfix.field.RequestingPartySubID value) {
    setField(value);
  }

  public quickfix.field.RequestingPartySubID get(quickfix.field.RequestingPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartySubID getRequestingPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartySubID());
  }

  public boolean isSet(quickfix.field.RequestingPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartySubID() {
    return isSetField(1662);
  }

  public void set(quickfix.field.RequestingPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RequestingPartySubIDType get(quickfix.field.RequestingPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartySubIDType getRequestingPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartySubIDType());
  }

  public boolean isSet(quickfix.field.RequestingPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartySubIDType() {
    return isSetField(1663);
  }
}
}

  public void set(quickfix.field.RequestingPartyID value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyID get(quickfix.field.RequestingPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyID getRequestingPartyID() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyID());
  }

  public boolean isSet(quickfix.field.RequestingPartyID field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyID() {
    return isSetField(1658);
  }

  public void set(quickfix.field.RequestingPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyIDSource get(quickfix.field.RequestingPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyIDSource getRequestingPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyIDSource());
  }

  public boolean isSet(quickfix.field.RequestingPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyIDSource() {
    return isSetField(1659);
  }

  public void set(quickfix.field.RequestingPartyRole value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyRole get(quickfix.field.RequestingPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyRole getRequestingPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyRole());
  }

  public boolean isSet(quickfix.field.RequestingPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyRole() {
    return isSetField(1660);
  }

  public void set(quickfix.field.RequestingPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RequestingPartyRoleQualifier get(quickfix.field.RequestingPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartyRoleQualifier getRequestingPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RequestingPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartyRoleQualifier() {
    return isSetField(2338);
  }

  public void set(quickfix.fixlatest.component.RequestingPartySubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RequestingPartySubGrp get(quickfix.fixlatest.component.RequestingPartySubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RequestingPartySubGrp getRequestingPartySubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RequestingPartySubGrp());
  }

  public void set(quickfix.field.NoRequestingPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRequestingPartySubIDs get(quickfix.field.NoRequestingPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestingPartySubIDs getNoRequestingPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRequestingPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoRequestingPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestingPartySubIDs() {
    return isSetField(1661);
  }

public static class NoRequestingPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1662, 1663, 0};

  public NoRequestingPartySubIDs() {
    super(1661, 1662, ORDER);
  }

  public void set(quickfix.field.RequestingPartySubID value) {
    setField(value);
  }

  public quickfix.field.RequestingPartySubID get(quickfix.field.RequestingPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartySubID getRequestingPartySubID() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartySubID());
  }

  public boolean isSet(quickfix.field.RequestingPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartySubID() {
    return isSetField(1662);
  }

  public void set(quickfix.field.RequestingPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.RequestingPartySubIDType get(quickfix.field.RequestingPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestingPartySubIDType getRequestingPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.RequestingPartySubIDType());
  }

  public boolean isSet(quickfix.field.RequestingPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRequestingPartySubIDType() {
    return isSetField(1663);
  }
}
}
