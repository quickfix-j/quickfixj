/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class NestedInstrumentAttribute extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1312, };
  protected int[] getGroupFields() { return componentGroups; }

  public NestedInstrumentAttribute() {
    super();
  }

  public void set(quickfix.field.NoNestedInstrAttrib value) {
    setField(value);
  }

  public quickfix.field.NoNestedInstrAttrib get(quickfix.field.NoNestedInstrAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedInstrAttrib getNoNestedInstrAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoNestedInstrAttrib());
  }

  public boolean isSet(quickfix.field.NoNestedInstrAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedInstrAttrib() {
    return isSetField(1312);
  }

public static class NoNestedInstrAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1210, 1211, 0};

  public NoNestedInstrAttrib() {
    super(1312, 1210, ORDER);
  }

  public void set(quickfix.field.NestedInstrAttribType value) {
    setField(value);
  }

  public quickfix.field.NestedInstrAttribType get(quickfix.field.NestedInstrAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedInstrAttribType getNestedInstrAttribType() throws FieldNotFound {
    return get(new quickfix.field.NestedInstrAttribType());
  }

  public boolean isSet(quickfix.field.NestedInstrAttribType field) {
    return isSetField(field);
  }

  public boolean isSetNestedInstrAttribType() {
    return isSetField(1210);
  }

  public void set(quickfix.field.NestedInstrAttribValue value) {
    setField(value);
  }

  public quickfix.field.NestedInstrAttribValue get(quickfix.field.NestedInstrAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedInstrAttribValue getNestedInstrAttribValue() throws FieldNotFound {
    return get(new quickfix.field.NestedInstrAttribValue());
  }

  public boolean isSet(quickfix.field.NestedInstrAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetNestedInstrAttribValue() {
    return isSetField(1211);
  }
}

  public void set(quickfix.field.NestedInstrAttribType value) {
    setField(value);
  }

  public quickfix.field.NestedInstrAttribType get(quickfix.field.NestedInstrAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedInstrAttribType getNestedInstrAttribType() throws FieldNotFound {
    return get(new quickfix.field.NestedInstrAttribType());
  }

  public boolean isSet(quickfix.field.NestedInstrAttribType field) {
    return isSetField(field);
  }

  public boolean isSetNestedInstrAttribType() {
    return isSetField(1210);
  }

  public void set(quickfix.field.NestedInstrAttribValue value) {
    setField(value);
  }

  public quickfix.field.NestedInstrAttribValue get(quickfix.field.NestedInstrAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedInstrAttribValue getNestedInstrAttribValue() throws FieldNotFound {
    return get(new quickfix.field.NestedInstrAttribValue());
  }

  public boolean isSet(quickfix.field.NestedInstrAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetNestedInstrAttribValue() {
    return isSetField(1211);
  }
}
