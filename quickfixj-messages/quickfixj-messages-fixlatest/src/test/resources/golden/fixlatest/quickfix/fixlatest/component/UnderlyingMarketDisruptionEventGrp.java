/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingMarketDisruptionEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41864, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingMarketDisruptionEventGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingMarketDisruptionEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingMarketDisruptionEvents get(quickfix.field.NoUnderlyingMarketDisruptionEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingMarketDisruptionEvents getNoUnderlyingMarketDisruptionEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingMarketDisruptionEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingMarketDisruptionEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingMarketDisruptionEvents() {
    return isSetField(41864);
  }

public static class NoUnderlyingMarketDisruptionEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41865, 41338, 0};

  public NoUnderlyingMarketDisruptionEvents() {
    super(41864, 41865, ORDER);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionEvent get(quickfix.field.UnderlyingMarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionEvent getUnderlyingMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionEvent() {
    return isSetField(41865);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionValue get(quickfix.field.UnderlyingMarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionValue getUnderlyingMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionValue() {
    return isSetField(41338);
  }
}

  public void set(quickfix.field.UnderlyingMarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionEvent get(quickfix.field.UnderlyingMarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionEvent getUnderlyingMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionEvent() {
    return isSetField(41865);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionValue get(quickfix.field.UnderlyingMarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionValue getUnderlyingMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionValue() {
    return isSetField(41338);
  }
}
