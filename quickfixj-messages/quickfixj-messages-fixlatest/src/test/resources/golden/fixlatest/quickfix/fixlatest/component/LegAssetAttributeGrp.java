/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegAssetAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2308, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegAssetAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoLegAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoLegAssetAttributes get(quickfix.field.NoLegAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAssetAttributes getNoLegAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoLegAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoLegAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAssetAttributes() {
    return isSetField(2308);
  }

public static class NoLegAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2309, 2310, 2311, 0};

  public NoLegAssetAttributes() {
    super(2308, 2309, ORDER);
  }

  public void set(quickfix.field.LegAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeType get(quickfix.field.LegAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeType getLegAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeType());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeType() {
    return isSetField(2309);
  }

  public void set(quickfix.field.LegAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeValue get(quickfix.field.LegAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeValue getLegAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeValue() {
    return isSetField(2310);
  }

  public void set(quickfix.field.LegAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeLimit get(quickfix.field.LegAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeLimit getLegAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeLimit() {
    return isSetField(2311);
  }
}

  public void set(quickfix.field.LegAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeType get(quickfix.field.LegAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeType getLegAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeType());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeType() {
    return isSetField(2309);
  }

  public void set(quickfix.field.LegAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeValue get(quickfix.field.LegAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeValue getLegAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeValue() {
    return isSetField(2310);
  }

  public void set(quickfix.field.LegAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.LegAssetAttributeLimit get(quickfix.field.LegAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAssetAttributeLimit getLegAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.LegAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.LegAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegAssetAttributeLimit() {
    return isSetField(2311);
  }
}
