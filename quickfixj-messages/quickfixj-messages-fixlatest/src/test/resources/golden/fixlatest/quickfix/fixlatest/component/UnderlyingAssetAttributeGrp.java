/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingAssetAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2312, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingAssetAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAssetAttributes get(quickfix.field.NoUnderlyingAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAssetAttributes getNoUnderlyingAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAssetAttributes() {
    return isSetField(2312);
  }

public static class NoUnderlyingAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2313, 2314, 2315, 0};

  public NoUnderlyingAssetAttributes() {
    super(2312, 2313, ORDER);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeType get(quickfix.field.UnderlyingAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeType getUnderlyingAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeType());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeType() {
    return isSetField(2313);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeValue get(quickfix.field.UnderlyingAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeValue getUnderlyingAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeValue() {
    return isSetField(2314);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeLimit get(quickfix.field.UnderlyingAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeLimit getUnderlyingAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeLimit() {
    return isSetField(2315);
  }
}

  public void set(quickfix.field.UnderlyingAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeType get(quickfix.field.UnderlyingAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeType getUnderlyingAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeType());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeType() {
    return isSetField(2313);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeValue get(quickfix.field.UnderlyingAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeValue getUnderlyingAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeValue() {
    return isSetField(2314);
  }

  public void set(quickfix.field.UnderlyingAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAssetAttributeLimit get(quickfix.field.UnderlyingAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAssetAttributeLimit getUnderlyingAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAssetAttributeLimit() {
    return isSetField(2315);
  }
}
