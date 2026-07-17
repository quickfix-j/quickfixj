/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSecAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {604, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegSecAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoLegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoLegSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSecurityAltID() {
    return isSetField(604);
  }

public static class NoLegSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {605, 606, 0};

  public NoLegSecurityAltID() {
    super(604, 605, ORDER);
  }

  public void set(quickfix.field.LegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityAltID());
  }

  public boolean isSet(quickfix.field.LegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityAltID() {
    return isSetField(605);
  }

  public void set(quickfix.field.LegSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityAltIDSource() {
    return isSetField(606);
  }
}

  public void set(quickfix.field.LegSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityAltID());
  }

  public boolean isSet(quickfix.field.LegSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityAltID() {
    return isSetField(605);
  }

  public void set(quickfix.field.LegSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityAltIDSource() {
    return isSetField(606);
  }
}
