/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AssetAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2304, };
  protected int[] getGroupFields() { return componentGroups; }

  public AssetAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoAssetAttributes get(quickfix.field.NoAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAssetAttributes getNoAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoAssetAttributes() {
    return isSetField(2304);
  }

public static class NoAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2305, 2306, 2307, 0};

  public NoAssetAttributes() {
    super(2304, 2305, ORDER);
  }

  public void set(quickfix.field.AssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeType get(quickfix.field.AssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeType getAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeType());
  }

  public boolean isSet(quickfix.field.AssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeType() {
    return isSetField(2305);
  }

  public void set(quickfix.field.AssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeValue get(quickfix.field.AssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeValue getAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeValue());
  }

  public boolean isSet(quickfix.field.AssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeValue() {
    return isSetField(2306);
  }

  public void set(quickfix.field.AssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeLimit get(quickfix.field.AssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeLimit getAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.AssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeLimit() {
    return isSetField(2307);
  }
}

  public void set(quickfix.field.AssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeType get(quickfix.field.AssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeType getAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeType());
  }

  public boolean isSet(quickfix.field.AssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeType() {
    return isSetField(2305);
  }

  public void set(quickfix.field.AssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeValue get(quickfix.field.AssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeValue getAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeValue());
  }

  public boolean isSet(quickfix.field.AssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeValue() {
    return isSetField(2306);
  }

  public void set(quickfix.field.AssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.AssetAttributeLimit get(quickfix.field.AssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AssetAttributeLimit getAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.AssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.AssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetAssetAttributeLimit() {
    return isSetField(2307);
  }
}
