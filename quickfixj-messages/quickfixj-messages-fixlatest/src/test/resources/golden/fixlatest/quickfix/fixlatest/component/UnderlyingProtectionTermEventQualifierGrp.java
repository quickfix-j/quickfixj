/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProtectionTermEventQualifierGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42085, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProtectionTermEventQualifierGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers get(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers getNoUnderlyingProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventQualifiers() {
    return isSetField(42085);
  }

public static class NoUnderlyingProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42086, 0};

  public NoUnderlyingProtectionTermEventQualifiers() {
    super(42085, 42086, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}
