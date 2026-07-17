/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecondaryAssetGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1976, };
  protected int[] getGroupFields() { return componentGroups; }

  public SecondaryAssetGrp() {
    super();
  }

  public void set(quickfix.field.NoSecondaryAssetClasses value) {
    setField(value);
  }

  public quickfix.field.NoSecondaryAssetClasses get(quickfix.field.NoSecondaryAssetClasses value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecondaryAssetClasses getNoSecondaryAssetClasses() throws FieldNotFound {
    return get(new quickfix.field.NoSecondaryAssetClasses());
  }

  public boolean isSet(quickfix.field.NoSecondaryAssetClasses field) {
    return isSetField(field);
  }

  public boolean isSetNoSecondaryAssetClasses() {
    return isSetField(1976);
  }

public static class NoSecondaryAssetClasses extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1977, 1978, 1979, 2741, 0};

  public NoSecondaryAssetClasses() {
    super(1976, 1977, ORDER);
  }

  public void set(quickfix.field.SecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetClass get(quickfix.field.SecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetClass getSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.SecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetClass() {
    return isSetField(1977);
  }

  public void set(quickfix.field.SecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetSubClass get(quickfix.field.SecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetSubClass getSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.SecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetSubClass() {
    return isSetField(1978);
  }

  public void set(quickfix.field.SecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetType get(quickfix.field.SecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetType getSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetType());
  }

  public boolean isSet(quickfix.field.SecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetType() {
    return isSetField(1979);
  }

  public void set(quickfix.field.SecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetSubType get(quickfix.field.SecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetSubType getSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.SecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetSubType() {
    return isSetField(2741);
  }
}

  public void set(quickfix.field.SecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetClass get(quickfix.field.SecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetClass getSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.SecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetClass() {
    return isSetField(1977);
  }

  public void set(quickfix.field.SecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetSubClass get(quickfix.field.SecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetSubClass getSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.SecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetSubClass() {
    return isSetField(1978);
  }

  public void set(quickfix.field.SecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetType get(quickfix.field.SecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetType getSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetType());
  }

  public boolean isSet(quickfix.field.SecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetType() {
    return isSetField(1979);
  }

  public void set(quickfix.field.SecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.SecondaryAssetSubType get(quickfix.field.SecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryAssetSubType getSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.SecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryAssetSubType() {
    return isSetField(2741);
  }
}
