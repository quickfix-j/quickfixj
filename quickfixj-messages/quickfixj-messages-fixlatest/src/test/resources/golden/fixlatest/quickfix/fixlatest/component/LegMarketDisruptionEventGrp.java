/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegMarketDisruptionEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41467, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegMarketDisruptionEventGrp() {
    super();
  }

  public void set(quickfix.field.NoLegMarketDisruptionEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegMarketDisruptionEvents get(quickfix.field.NoLegMarketDisruptionEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegMarketDisruptionEvents getNoLegMarketDisruptionEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegMarketDisruptionEvents());
  }

  public boolean isSet(quickfix.field.NoLegMarketDisruptionEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegMarketDisruptionEvents() {
    return isSetField(41467);
  }

public static class NoLegMarketDisruptionEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41468, 40223, 0};

  public NoLegMarketDisruptionEvents() {
    super(41467, 41468, ORDER);
  }

  public void set(quickfix.field.LegMarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionEvent get(quickfix.field.LegMarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionEvent getLegMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionEvent() {
    return isSetField(41468);
  }

  public void set(quickfix.field.LegMarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionValue get(quickfix.field.LegMarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionValue getLegMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionValue() {
    return isSetField(40223);
  }
}

  public void set(quickfix.field.LegMarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionEvent get(quickfix.field.LegMarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionEvent getLegMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionEvent() {
    return isSetField(41468);
  }

  public void set(quickfix.field.LegMarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionValue get(quickfix.field.LegMarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionValue getLegMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionValue() {
    return isSetField(40223);
  }
}
