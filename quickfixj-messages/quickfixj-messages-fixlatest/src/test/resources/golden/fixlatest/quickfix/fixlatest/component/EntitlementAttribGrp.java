/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class EntitlementAttribGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1777, };
  protected int[] getGroupFields() { return componentGroups; }

  public EntitlementAttribGrp() {
    super();
  }

  public void set(quickfix.field.NoEntitlementAttrib value) {
    setField(value);
  }

  public quickfix.field.NoEntitlementAttrib get(quickfix.field.NoEntitlementAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlementAttrib getNoEntitlementAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlementAttrib());
  }

  public boolean isSet(quickfix.field.NoEntitlementAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlementAttrib() {
    return isSetField(1777);
  }

public static class NoEntitlementAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1778, 1779, 1780, 1781, 0};

  public NoEntitlementAttrib() {
    super(1777, 1778, ORDER);
  }

  public void set(quickfix.field.EntitlementAttribType value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribType get(quickfix.field.EntitlementAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribType getEntitlementAttribType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribType());
  }

  public boolean isSet(quickfix.field.EntitlementAttribType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribType() {
    return isSetField(1778);
  }

  public void set(quickfix.field.EntitlementAttribDatatype value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribDatatype get(quickfix.field.EntitlementAttribDatatype value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribDatatype getEntitlementAttribDatatype() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribDatatype());
  }

  public boolean isSet(quickfix.field.EntitlementAttribDatatype field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribDatatype() {
    return isSetField(1779);
  }

  public void set(quickfix.field.EntitlementAttribValue value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribValue get(quickfix.field.EntitlementAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribValue getEntitlementAttribValue() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribValue());
  }

  public boolean isSet(quickfix.field.EntitlementAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribValue() {
    return isSetField(1780);
  }

  public void set(quickfix.field.EntitlementAttribCurrency value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribCurrency get(quickfix.field.EntitlementAttribCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribCurrency getEntitlementAttribCurrency() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribCurrency());
  }

  public boolean isSet(quickfix.field.EntitlementAttribCurrency field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribCurrency() {
    return isSetField(1781);
  }
}

  public void set(quickfix.field.EntitlementAttribType value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribType get(quickfix.field.EntitlementAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribType getEntitlementAttribType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribType());
  }

  public boolean isSet(quickfix.field.EntitlementAttribType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribType() {
    return isSetField(1778);
  }

  public void set(quickfix.field.EntitlementAttribDatatype value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribDatatype get(quickfix.field.EntitlementAttribDatatype value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribDatatype getEntitlementAttribDatatype() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribDatatype());
  }

  public boolean isSet(quickfix.field.EntitlementAttribDatatype field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribDatatype() {
    return isSetField(1779);
  }

  public void set(quickfix.field.EntitlementAttribValue value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribValue get(quickfix.field.EntitlementAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribValue getEntitlementAttribValue() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribValue());
  }

  public boolean isSet(quickfix.field.EntitlementAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribValue() {
    return isSetField(1780);
  }

  public void set(quickfix.field.EntitlementAttribCurrency value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribCurrency get(quickfix.field.EntitlementAttribCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribCurrency getEntitlementAttribCurrency() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribCurrency());
  }

  public boolean isSet(quickfix.field.EntitlementAttribCurrency field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribCurrency() {
    return isSetField(1781);
  }
}
