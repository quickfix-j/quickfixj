/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeSecurityAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1218, };
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeSecurityAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoDerivativeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeSecurityAltID get(quickfix.field.NoDerivativeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeSecurityAltID getNoDerivativeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoDerivativeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeSecurityAltID() {
    return isSetField(1218);
  }

public static class NoDerivativeSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1219, 1220, 0};

  public NoDerivativeSecurityAltID() {
    super(1218, 1219, ORDER);
  }

  public void set(quickfix.field.DerivativeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityAltID get(quickfix.field.DerivativeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityAltID getDerivativeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityAltID());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityAltID() {
    return isSetField(1219);
  }

  public void set(quickfix.field.DerivativeSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityAltIDSource get(quickfix.field.DerivativeSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityAltIDSource getDerivativeSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityAltIDSource() {
    return isSetField(1220);
  }
}

  public void set(quickfix.field.DerivativeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityAltID get(quickfix.field.DerivativeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityAltID getDerivativeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityAltID());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityAltID() {
    return isSetField(1219);
  }

  public void set(quickfix.field.DerivativeSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityAltIDSource get(quickfix.field.DerivativeSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityAltIDSource getDerivativeSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityAltIDSource() {
    return isSetField(1220);
  }
}
