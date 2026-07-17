/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProtectionTermEventQualifierGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40199, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProtectionTermEventQualifierGrp() {
    super();
  }

  public void set(quickfix.field.NoProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventQualifiers get(quickfix.field.NoProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventQualifiers getNoProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventQualifiers() {
    return isSetField(40199);
  }

public static class NoProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40200, 0};

  public NoProtectionTermEventQualifiers() {
    super(40199, 40200, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}
