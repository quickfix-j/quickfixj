/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ExtraordinaryEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42296, };
  protected int[] getGroupFields() { return componentGroups; }

  public ExtraordinaryEventGrp() {
    super();
  }

  public void set(quickfix.field.NoExtraordinaryEvents value) {
    setField(value);
  }

  public quickfix.field.NoExtraordinaryEvents get(quickfix.field.NoExtraordinaryEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExtraordinaryEvents getNoExtraordinaryEvents() throws FieldNotFound {
    return get(new quickfix.field.NoExtraordinaryEvents());
  }

  public boolean isSet(quickfix.field.NoExtraordinaryEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoExtraordinaryEvents() {
    return isSetField(42296);
  }

public static class NoExtraordinaryEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42297, 42298, 0};

  public NoExtraordinaryEvents() {
    super(42296, 42297, ORDER);
  }

  public void set(quickfix.field.ExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventType get(quickfix.field.ExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventType getExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventType() {
    return isSetField(42297);
  }

  public void set(quickfix.field.ExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventValue get(quickfix.field.ExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventValue getExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventValue() {
    return isSetField(42298);
  }
}

  public void set(quickfix.field.ExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventType get(quickfix.field.ExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventType getExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventType() {
    return isSetField(42297);
  }

  public void set(quickfix.field.ExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryEventValue get(quickfix.field.ExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryEventValue getExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.ExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryEventValue() {
    return isSetField(42298);
  }
}
