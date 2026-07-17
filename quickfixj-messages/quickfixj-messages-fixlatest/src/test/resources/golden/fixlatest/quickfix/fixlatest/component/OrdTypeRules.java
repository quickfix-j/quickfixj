/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OrdTypeRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1237, };
  protected int[] getGroupFields() { return componentGroups; }

  public OrdTypeRules() {
    super();
  }

  public void set(quickfix.field.NoOrdTypeRules value) {
    setField(value);
  }

  public quickfix.field.NoOrdTypeRules get(quickfix.field.NoOrdTypeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrdTypeRules getNoOrdTypeRules() throws FieldNotFound {
    return get(new quickfix.field.NoOrdTypeRules());
  }

  public boolean isSet(quickfix.field.NoOrdTypeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoOrdTypeRules() {
    return isSetField(1237);
  }

public static class NoOrdTypeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40, 0};

  public NoOrdTypeRules() {
    super(1237, 40, ORDER);
  }

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
  }
}

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
  }
}
