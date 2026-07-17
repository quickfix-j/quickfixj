/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamAssetAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41800, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamAssetAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamAssetAttributes get(quickfix.field.NoUnderlyingStreamAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamAssetAttributes getNoUnderlyingStreamAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamAssetAttributes() {
    return isSetField(41800);
  }

public static class NoUnderlyingStreamAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41801, 41802, 41803, 0};

  public NoUnderlyingStreamAssetAttributes() {
    super(41800, 41801, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeType get(quickfix.field.UnderlyingStreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeType getUnderlyingStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeType() {
    return isSetField(41801);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeValue get(quickfix.field.UnderlyingStreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeValue getUnderlyingStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeValue() {
    return isSetField(41802);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeLimit get(quickfix.field.UnderlyingStreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeLimit getUnderlyingStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeLimit() {
    return isSetField(41803);
  }
}

  public void set(quickfix.field.UnderlyingStreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeType get(quickfix.field.UnderlyingStreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeType getUnderlyingStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeType() {
    return isSetField(41801);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeValue get(quickfix.field.UnderlyingStreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeValue getUnderlyingStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeValue() {
    return isSetField(41802);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeLimit get(quickfix.field.UnderlyingStreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeLimit getUnderlyingStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeLimit() {
    return isSetField(41803);
  }
}
