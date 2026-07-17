/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarketDisruptionFallbackGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41094, };
  protected int[] getGroupFields() { return componentGroups; }

  public MarketDisruptionFallbackGrp() {
    super();
  }

  public void set(quickfix.field.NoMarketDisruptionFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoMarketDisruptionFallbacks get(quickfix.field.NoMarketDisruptionFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketDisruptionFallbacks getNoMarketDisruptionFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoMarketDisruptionFallbacks());
  }

  public boolean isSet(quickfix.field.NoMarketDisruptionFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketDisruptionFallbacks() {
    return isSetField(41094);
  }

public static class NoMarketDisruptionFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41095, 40992, 0};

  public NoMarketDisruptionFallbacks() {
    super(41094, 41095, ORDER);
  }

  public void set(quickfix.field.MarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackType get(quickfix.field.MarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackType getMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackType() {
    return isSetField(41095);
  }

  public void set(quickfix.field.MarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackValue get(quickfix.field.MarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackValue getMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackValue() {
    return isSetField(40992);
  }
}

  public void set(quickfix.field.MarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackType get(quickfix.field.MarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackType getMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackType() {
    return isSetField(41095);
  }

  public void set(quickfix.field.MarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackValue get(quickfix.field.MarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackValue getMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackValue() {
    return isSetField(40992);
  }
}
