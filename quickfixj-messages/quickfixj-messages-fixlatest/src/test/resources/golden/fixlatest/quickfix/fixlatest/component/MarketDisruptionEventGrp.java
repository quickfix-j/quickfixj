/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarketDisruptionEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41092, };
  protected int[] getGroupFields() { return componentGroups; }

  public MarketDisruptionEventGrp() {
    super();
  }

  public void set(quickfix.field.NoMarketDisruptionEvents value) {
    setField(value);
  }

  public quickfix.field.NoMarketDisruptionEvents get(quickfix.field.NoMarketDisruptionEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketDisruptionEvents getNoMarketDisruptionEvents() throws FieldNotFound {
    return get(new quickfix.field.NoMarketDisruptionEvents());
  }

  public boolean isSet(quickfix.field.NoMarketDisruptionEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketDisruptionEvents() {
    return isSetField(41092);
  }

public static class NoMarketDisruptionEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41093, 40991, 0};

  public NoMarketDisruptionEvents() {
    super(41092, 41093, ORDER);
  }

  public void set(quickfix.field.MarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionEvent get(quickfix.field.MarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionEvent getMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.MarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionEvent() {
    return isSetField(41093);
  }

  public void set(quickfix.field.MarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionValue get(quickfix.field.MarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionValue getMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.MarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionValue() {
    return isSetField(40991);
  }
}

  public void set(quickfix.field.MarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionEvent get(quickfix.field.MarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionEvent getMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.MarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionEvent() {
    return isSetField(41093);
  }

  public void set(quickfix.field.MarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionValue get(quickfix.field.MarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionValue getMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.MarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionValue() {
    return isSetField(40991);
  }
}
