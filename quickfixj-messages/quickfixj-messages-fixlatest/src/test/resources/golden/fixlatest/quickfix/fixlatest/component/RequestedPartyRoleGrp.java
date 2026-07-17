/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RequestedPartyRoleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1508, };
  protected int[] getGroupFields() { return componentGroups; }

  public RequestedPartyRoleGrp() {
    super();
  }

  public void set(quickfix.field.NoRequestedPartyRoles value) {
    setField(value);
  }

  public quickfix.field.NoRequestedPartyRoles get(quickfix.field.NoRequestedPartyRoles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestedPartyRoles getNoRequestedPartyRoles() throws FieldNotFound {
    return get(new quickfix.field.NoRequestedPartyRoles());
  }

  public boolean isSet(quickfix.field.NoRequestedPartyRoles field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestedPartyRoles() {
    return isSetField(1508);
  }

public static class NoRequestedPartyRoles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1509, 2386, 0};

  public NoRequestedPartyRoles() {
    super(1508, 1509, ORDER);
  }

  public void set(quickfix.field.RequestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.RequestedPartyRole get(quickfix.field.RequestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestedPartyRole getRequestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RequestedPartyRole());
  }

  public boolean isSet(quickfix.field.RequestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRequestedPartyRole() {
    return isSetField(1509);
  }

  public void set(quickfix.field.RequestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RequestedPartyRoleQualifier get(quickfix.field.RequestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestedPartyRoleQualifier getRequestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RequestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RequestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRequestedPartyRoleQualifier() {
    return isSetField(2386);
  }
}

  public void set(quickfix.field.RequestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.RequestedPartyRole get(quickfix.field.RequestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestedPartyRole getRequestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.RequestedPartyRole());
  }

  public boolean isSet(quickfix.field.RequestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetRequestedPartyRole() {
    return isSetField(1509);
  }

  public void set(quickfix.field.RequestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RequestedPartyRoleQualifier get(quickfix.field.RequestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RequestedPartyRoleQualifier getRequestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RequestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.RequestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRequestedPartyRoleQualifier() {
    return isSetField(2386);
  }
}
