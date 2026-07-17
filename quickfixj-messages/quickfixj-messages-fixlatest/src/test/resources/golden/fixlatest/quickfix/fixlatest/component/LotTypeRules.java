/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LotTypeRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1234, };
  protected int[] getGroupFields() { return componentGroups; }

  public LotTypeRules() {
    super();
  }

  public void set(quickfix.field.NoLotTypeRules value) {
    setField(value);
  }

  public quickfix.field.NoLotTypeRules get(quickfix.field.NoLotTypeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLotTypeRules getNoLotTypeRules() throws FieldNotFound {
    return get(new quickfix.field.NoLotTypeRules());
  }

  public boolean isSet(quickfix.field.NoLotTypeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoLotTypeRules() {
    return isSetField(1234);
  }

public static class NoLotTypeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1093, 1231, 0};

  public NoLotTypeRules() {
    super(1234, 1093, ORDER);
  }

  public void set(quickfix.field.LotType value) {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound {
    return get(new quickfix.field.LotType());
  }

  public boolean isSet(quickfix.field.LotType field) {
    return isSetField(field);
  }

  public boolean isSetLotType() {
    return isSetField(1093);
  }

  public void set(quickfix.field.MinLotSize value) {
    setField(value);
  }

  public quickfix.field.MinLotSize get(quickfix.field.MinLotSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinLotSize getMinLotSize() throws FieldNotFound {
    return get(new quickfix.field.MinLotSize());
  }

  public boolean isSet(quickfix.field.MinLotSize field) {
    return isSetField(field);
  }

  public boolean isSetMinLotSize() {
    return isSetField(1231);
  }
}

  public void set(quickfix.field.LotType value) {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound {
    return get(new quickfix.field.LotType());
  }

  public boolean isSet(quickfix.field.LotType field) {
    return isSetField(field);
  }

  public boolean isSetLotType() {
    return isSetField(1093);
  }

  public void set(quickfix.field.MinLotSize value) {
    setField(value);
  }

  public quickfix.field.MinLotSize get(quickfix.field.MinLotSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinLotSize getMinLotSize() throws FieldNotFound {
    return get(new quickfix.field.MinLotSize());
  }

  public boolean isSet(quickfix.field.MinLotSize field) {
    return isSetField(field);
  }

  public boolean isSetMinLotSize() {
    return isSetField(1231);
  }
}
