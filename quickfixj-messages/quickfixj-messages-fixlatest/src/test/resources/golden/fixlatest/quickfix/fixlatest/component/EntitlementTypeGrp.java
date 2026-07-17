/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class EntitlementTypeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2345, };
  protected int[] getGroupFields() { return componentGroups; }

  public EntitlementTypeGrp() {
    super();
  }

  public void set(quickfix.field.NoEntitlementTypes value) {
    setField(value);
  }

  public quickfix.field.NoEntitlementTypes get(quickfix.field.NoEntitlementTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlementTypes getNoEntitlementTypes() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlementTypes());
  }

  public boolean isSet(quickfix.field.NoEntitlementTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlementTypes() {
    return isSetField(2345);
  }

public static class NoEntitlementTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1775, 2402, 0};

  public NoEntitlementTypes() {
    super(2345, 1775, ORDER);
  }

  public void set(quickfix.field.EntitlementType value) {
    setField(value);
  }

  public quickfix.field.EntitlementType get(quickfix.field.EntitlementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementType getEntitlementType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementType());
  }

  public boolean isSet(quickfix.field.EntitlementType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementType() {
    return isSetField(1775);
  }

  public void set(quickfix.field.EntitlementSubType value) {
    setField(value);
  }

  public quickfix.field.EntitlementSubType get(quickfix.field.EntitlementSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementSubType getEntitlementSubType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementSubType());
  }

  public boolean isSet(quickfix.field.EntitlementSubType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementSubType() {
    return isSetField(2402);
  }
}

  public void set(quickfix.field.EntitlementType value) {
    setField(value);
  }

  public quickfix.field.EntitlementType get(quickfix.field.EntitlementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementType getEntitlementType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementType());
  }

  public boolean isSet(quickfix.field.EntitlementType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementType() {
    return isSetField(1775);
  }

  public void set(quickfix.field.EntitlementSubType value) {
    setField(value);
  }

  public quickfix.field.EntitlementSubType get(quickfix.field.EntitlementSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementSubType getEntitlementSubType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementSubType());
  }

  public boolean isSet(quickfix.field.EntitlementSubType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementSubType() {
    return isSetField(2402);
  }
}
