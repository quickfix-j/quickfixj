/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {454, };
  protected int[] getGroupFields() { return componentGroups; }

  public SecAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoSecurityAltID() {
    return isSetField(454);
  }

public static class NoSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {455, 456, 0};

  public NoSecurityAltID() {
    super(454, 455, ORDER);
  }

  public void set(quickfix.field.SecurityAltID value) {
    setField(value);
  }

  public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.SecurityAltID());
  }

  public boolean isSet(quickfix.field.SecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityAltID() {
    return isSetField(455);
  }

  public void set(quickfix.field.SecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.SecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.SecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSecurityAltIDSource() {
    return isSetField(456);
  }
}

  public void set(quickfix.field.SecurityAltID value) {
    setField(value);
  }

  public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.SecurityAltID());
  }

  public boolean isSet(quickfix.field.SecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityAltID() {
    return isSetField(455);
  }

  public void set(quickfix.field.SecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.SecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.SecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSecurityAltIDSource() {
    return isSetField(456);
  }
}
