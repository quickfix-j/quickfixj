/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingExtraordinaryEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42884, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingExtraordinaryEventGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingExtraordinaryEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingExtraordinaryEvents get(quickfix.field.NoUnderlyingExtraordinaryEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingExtraordinaryEvents getNoUnderlyingExtraordinaryEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingExtraordinaryEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingExtraordinaryEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingExtraordinaryEvents() {
    return isSetField(42884);
  }

public static class NoUnderlyingExtraordinaryEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42885, 42886, 0};

  public NoUnderlyingExtraordinaryEvents() {
    super(42884, 42885, ORDER);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventType get(quickfix.field.UnderlyingExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventType getUnderlyingExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventType() {
    return isSetField(42885);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventValue get(quickfix.field.UnderlyingExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventValue getUnderlyingExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventValue() {
    return isSetField(42886);
  }
}

  public void set(quickfix.field.UnderlyingExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventType get(quickfix.field.UnderlyingExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventType getUnderlyingExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventType() {
    return isSetField(42885);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryEventValue get(quickfix.field.UnderlyingExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryEventValue getUnderlyingExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryEventValue() {
    return isSetField(42886);
  }
}
