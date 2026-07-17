/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegExtraordinaryEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42388, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegExtraordinaryEventGrp() {
    super();
  }

  public void set(quickfix.field.NoLegExtraordinaryEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegExtraordinaryEvents get(quickfix.field.NoLegExtraordinaryEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegExtraordinaryEvents getNoLegExtraordinaryEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegExtraordinaryEvents());
  }

  public boolean isSet(quickfix.field.NoLegExtraordinaryEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegExtraordinaryEvents() {
    return isSetField(42388);
  }

public static class NoLegExtraordinaryEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42389, 42390, 0};

  public NoLegExtraordinaryEvents() {
    super(42388, 42389, ORDER);
  }

  public void set(quickfix.field.LegExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventType get(quickfix.field.LegExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventType getLegExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventType() {
    return isSetField(42389);
  }

  public void set(quickfix.field.LegExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventValue get(quickfix.field.LegExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventValue getLegExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventValue() {
    return isSetField(42390);
  }
}

  public void set(quickfix.field.LegExtraordinaryEventType value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventType get(quickfix.field.LegExtraordinaryEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventType getLegExtraordinaryEventType() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventType());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventType() {
    return isSetField(42389);
  }

  public void set(quickfix.field.LegExtraordinaryEventValue value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryEventValue get(quickfix.field.LegExtraordinaryEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryEventValue getLegExtraordinaryEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryEventValue());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryEventValue() {
    return isSetField(42390);
  }
}
