/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingMarketDisruptionFallbackGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41866, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingMarketDisruptionFallbackGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingMarketDisruptionFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingMarketDisruptionFallbacks get(quickfix.field.NoUnderlyingMarketDisruptionFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingMarketDisruptionFallbacks getNoUnderlyingMarketDisruptionFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingMarketDisruptionFallbacks());
  }

  public boolean isSet(quickfix.field.NoUnderlyingMarketDisruptionFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingMarketDisruptionFallbacks() {
    return isSetField(41866);
  }

public static class NoUnderlyingMarketDisruptionFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41867, 41339, 0};

  public NoUnderlyingMarketDisruptionFallbacks() {
    super(41866, 41867, ORDER);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackType get(quickfix.field.UnderlyingMarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackType getUnderlyingMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackType() {
    return isSetField(41867);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackValue get(quickfix.field.UnderlyingMarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackValue getUnderlyingMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackValue() {
    return isSetField(41339);
  }
}

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackType get(quickfix.field.UnderlyingMarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackType getUnderlyingMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackType() {
    return isSetField(41867);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackValue get(quickfix.field.UnderlyingMarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackValue getUnderlyingMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackValue() {
    return isSetField(41339);
  }
}
