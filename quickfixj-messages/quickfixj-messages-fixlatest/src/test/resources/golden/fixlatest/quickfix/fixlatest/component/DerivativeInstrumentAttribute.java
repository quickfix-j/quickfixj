/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeInstrumentAttribute extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1311, };
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeInstrumentAttribute() {
    super();
  }

  public void set(quickfix.field.NoDerivativeInstrAttrib value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrAttrib get(quickfix.field.NoDerivativeInstrAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrAttrib getNoDerivativeInstrAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrAttrib());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrAttrib() {
    return isSetField(1311);
  }

public static class NoDerivativeInstrAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1313, 1314, 0};

  public NoDerivativeInstrAttrib() {
    super(1311, 1313, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrAttribType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrAttribType get(quickfix.field.DerivativeInstrAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrAttribType getDerivativeInstrAttribType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrAttribType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrAttribType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrAttribType() {
    return isSetField(1313);
  }

  public void set(quickfix.field.DerivativeInstrAttribValue value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrAttribValue get(quickfix.field.DerivativeInstrAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrAttribValue getDerivativeInstrAttribValue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrAttribValue());
  }

  public boolean isSet(quickfix.field.DerivativeInstrAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrAttribValue() {
    return isSetField(1314);
  }
}

  public void set(quickfix.field.DerivativeInstrAttribType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrAttribType get(quickfix.field.DerivativeInstrAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrAttribType getDerivativeInstrAttribType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrAttribType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrAttribType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrAttribType() {
    return isSetField(1313);
  }

  public void set(quickfix.field.DerivativeInstrAttribValue value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrAttribValue get(quickfix.field.DerivativeInstrAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrAttribValue getDerivativeInstrAttribValue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrAttribValue());
  }

  public boolean isSet(quickfix.field.DerivativeInstrAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrAttribValue() {
    return isSetField(1314);
  }
}
