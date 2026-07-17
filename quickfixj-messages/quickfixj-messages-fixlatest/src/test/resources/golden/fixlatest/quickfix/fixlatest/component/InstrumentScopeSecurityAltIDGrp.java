/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentScopeSecurityAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1540, };
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentScopeSecurityAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoInstrumentScopeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentScopeSecurityAltID get(quickfix.field.NoInstrumentScopeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentScopeSecurityAltID getNoInstrumentScopeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentScopeSecurityAltID());
  }

  public boolean isSet(quickfix.field.NoInstrumentScopeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentScopeSecurityAltID() {
    return isSetField(1540);
  }

public static class NoInstrumentScopeSecurityAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1541, 1542, 0};

  public NoInstrumentScopeSecurityAltID() {
    super(1540, 1541, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityAltID get(quickfix.field.InstrumentScopeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityAltID getInstrumentScopeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityAltID());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityAltID() {
    return isSetField(1541);
  }

  public void set(quickfix.field.InstrumentScopeSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityAltIDSource get(quickfix.field.InstrumentScopeSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityAltIDSource getInstrumentScopeSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityAltIDSource() {
    return isSetField(1542);
  }
}

  public void set(quickfix.field.InstrumentScopeSecurityAltID value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityAltID get(quickfix.field.InstrumentScopeSecurityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityAltID getInstrumentScopeSecurityAltID() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityAltID());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityAltID field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityAltID() {
    return isSetField(1541);
  }

  public void set(quickfix.field.InstrumentScopeSecurityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeSecurityAltIDSource get(quickfix.field.InstrumentScopeSecurityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeSecurityAltIDSource getInstrumentScopeSecurityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeSecurityAltIDSource());
  }

  public boolean isSet(quickfix.field.InstrumentScopeSecurityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeSecurityAltIDSource() {
    return isSetField(1542);
  }
}
