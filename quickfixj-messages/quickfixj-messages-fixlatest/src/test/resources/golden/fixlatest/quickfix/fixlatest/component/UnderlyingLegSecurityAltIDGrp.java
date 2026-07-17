/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingLegSecurityAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1334, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingLegSecurityAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingLegSecurityAltID get(quickfix.field.NoUnderlyingLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingLegSecurityAltID getNoUnderlyingLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoUnderlyingLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingLegSecurityAltID() {
    return isSetField(1334);
  }

public static class NoUnderlyingLegSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1335, 1336, 0};

  public NoUnderlyingLegSecurityAltID() {
    super(1334, 1335, ORDER);
  }

  public void set(quickfix.field.UnderlyingLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityAltID get(quickfix.field.UnderlyingLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityAltID getUnderlyingLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityAltID() {
    return isSetField(1335);
  }

  public void set(quickfix.field.UnderlyingLegSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityAltIDSource get(quickfix.field.UnderlyingLegSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityAltIDSource getUnderlyingLegSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityAltIDSource() {
    return isSetField(1336);
  }
}

  public void set(quickfix.field.UnderlyingLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityAltID get(quickfix.field.UnderlyingLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityAltID getUnderlyingLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityAltID() {
    return isSetField(1335);
  }

  public void set(quickfix.field.UnderlyingLegSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLegSecurityAltIDSource get(quickfix.field.UnderlyingLegSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLegSecurityAltIDSource getUnderlyingLegSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLegSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingLegSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLegSecurityAltIDSource() {
    return isSetField(1336);
  }
}
