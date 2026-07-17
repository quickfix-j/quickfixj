/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ValueChecksGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1868, };
  protected int[] getGroupFields() { return componentGroups; }

  public ValueChecksGrp() {
    super();
  }

  public void set(quickfix.field.NoValueChecks value) {
    setField(value);
  }

  public quickfix.field.NoValueChecks get(quickfix.field.NoValueChecks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoValueChecks getNoValueChecks() throws FieldNotFound {
    return get(new quickfix.field.NoValueChecks());
  }

  public boolean isSet(quickfix.field.NoValueChecks field) {
    return isSetField(field);
  }

  public boolean isSetNoValueChecks() {
    return isSetField(1868);
  }

public static class NoValueChecks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1869, 1870, 0};

  public NoValueChecks() {
    super(1868, 1869, ORDER);
  }

  public void set(quickfix.field.ValueCheckType value) {
    setField(value);
  }

  public quickfix.field.ValueCheckType get(quickfix.field.ValueCheckType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValueCheckType getValueCheckType() throws FieldNotFound {
    return get(new quickfix.field.ValueCheckType());
  }

  public boolean isSet(quickfix.field.ValueCheckType field) {
    return isSetField(field);
  }

  public boolean isSetValueCheckType() {
    return isSetField(1869);
  }

  public void set(quickfix.field.ValueCheckAction value) {
    setField(value);
  }

  public quickfix.field.ValueCheckAction get(quickfix.field.ValueCheckAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValueCheckAction getValueCheckAction() throws FieldNotFound {
    return get(new quickfix.field.ValueCheckAction());
  }

  public boolean isSet(quickfix.field.ValueCheckAction field) {
    return isSetField(field);
  }

  public boolean isSetValueCheckAction() {
    return isSetField(1870);
  }
}

  public void set(quickfix.field.ValueCheckType value) {
    setField(value);
  }

  public quickfix.field.ValueCheckType get(quickfix.field.ValueCheckType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValueCheckType getValueCheckType() throws FieldNotFound {
    return get(new quickfix.field.ValueCheckType());
  }

  public boolean isSet(quickfix.field.ValueCheckType field) {
    return isSetField(field);
  }

  public boolean isSetValueCheckType() {
    return isSetField(1869);
  }

  public void set(quickfix.field.ValueCheckAction value) {
    setField(value);
  }

  public quickfix.field.ValueCheckAction get(quickfix.field.ValueCheckAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ValueCheckAction getValueCheckAction() throws FieldNotFound {
    return get(new quickfix.field.ValueCheckAction());
  }

  public boolean isSet(quickfix.field.ValueCheckAction field) {
    return isSetField(field);
  }

  public boolean isSetValueCheckAction() {
    return isSetField(1870);
  }
}
