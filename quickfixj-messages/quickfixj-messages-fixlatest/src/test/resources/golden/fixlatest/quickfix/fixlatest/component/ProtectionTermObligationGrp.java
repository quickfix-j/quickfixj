/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProtectionTermObligationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40201, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProtectionTermObligationGrp() {
    super();
  }

  public void set(quickfix.field.NoProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermObligations get(quickfix.field.NoProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermObligations getNoProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermObligations() {
    return isSetField(40201);
  }

public static class NoProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40202, 40203, 0};

  public NoProtectionTermObligations() {
    super(40201, 40202, ORDER);
  }

  public void set(quickfix.field.ProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationType get(quickfix.field.ProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationType getProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationType() {
    return isSetField(40202);
  }

  public void set(quickfix.field.ProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationValue get(quickfix.field.ProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationValue getProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationValue() {
    return isSetField(40203);
  }
}

  public void set(quickfix.field.ProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationType get(quickfix.field.ProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationType getProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationType() {
    return isSetField(40202);
  }

  public void set(quickfix.field.ProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationValue get(quickfix.field.ProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationValue getProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationValue() {
    return isSetField(40203);
  }
}
