/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UndSecAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {457, };
  protected int[] getGroupFields() { return componentGroups; }

  public UndSecAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSecurityAltID() {
    return isSetField(457);
  }

public static class NoUnderlyingSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {458, 459, 0};

  public NoUnderlyingSecurityAltID() {
    super(457, 458, ORDER);
  }

  public void set(quickfix.field.UnderlyingSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltID() {
    return isSetField(458);
  }

  public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltIDSource() {
    return isSetField(459);
  }
}

  public void set(quickfix.field.UnderlyingSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltID() {
    return isSetField(458);
  }

  public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltIDSource() {
    return isSetField(459);
  }
}
