/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegMarketDisruptionFallbackGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41469, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegMarketDisruptionFallbackGrp() {
    super();
  }

  public void set(quickfix.field.NoLegMarketDisruptionFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoLegMarketDisruptionFallbacks get(quickfix.field.NoLegMarketDisruptionFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegMarketDisruptionFallbacks getNoLegMarketDisruptionFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoLegMarketDisruptionFallbacks());
  }

  public boolean isSet(quickfix.field.NoLegMarketDisruptionFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoLegMarketDisruptionFallbacks() {
    return isSetField(41469);
  }

public static class NoLegMarketDisruptionFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41470, 40990, 0};

  public NoLegMarketDisruptionFallbacks() {
    super(41469, 41470, ORDER);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackType get(quickfix.field.LegMarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackType getLegMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackType() {
    return isSetField(41470);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackValue get(quickfix.field.LegMarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackValue getLegMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackValue() {
    return isSetField(40990);
  }
}

  public void set(quickfix.field.LegMarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackType get(quickfix.field.LegMarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackType getLegMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackType() {
    return isSetField(41470);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackValue get(quickfix.field.LegMarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackValue getLegMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackValue() {
    return isSetField(40990);
  }
}
