/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamAssetAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41237, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamAssetAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoStreamAssetAttributes get(quickfix.field.NoStreamAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamAssetAttributes getNoStreamAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoStreamAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoStreamAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamAssetAttributes() {
    return isSetField(41237);
  }

public static class NoStreamAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41238, 41239, 41240, 0};

  public NoStreamAssetAttributes() {
    super(41237, 41238, ORDER);
  }

  public void set(quickfix.field.StreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeType get(quickfix.field.StreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeType getStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeType() {
    return isSetField(41238);
  }

  public void set(quickfix.field.StreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeValue get(quickfix.field.StreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeValue getStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeValue() {
    return isSetField(41239);
  }

  public void set(quickfix.field.StreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeLimit get(quickfix.field.StreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeLimit getStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeLimit() {
    return isSetField(41240);
  }
}

  public void set(quickfix.field.StreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeType get(quickfix.field.StreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeType getStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeType() {
    return isSetField(41238);
  }

  public void set(quickfix.field.StreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeValue get(quickfix.field.StreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeValue getStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeValue() {
    return isSetField(41239);
  }

  public void set(quickfix.field.StreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeLimit get(quickfix.field.StreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeLimit getStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeLimit() {
    return isSetField(41240);
  }
}
