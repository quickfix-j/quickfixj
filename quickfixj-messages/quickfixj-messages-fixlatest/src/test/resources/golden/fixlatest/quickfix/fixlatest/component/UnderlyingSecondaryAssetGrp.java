/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingSecondaryAssetGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2080, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingSecondaryAssetGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingSecondaryAssetClasses value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSecondaryAssetClasses get(quickfix.field.NoUnderlyingSecondaryAssetClasses value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSecondaryAssetClasses getNoUnderlyingSecondaryAssetClasses() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSecondaryAssetClasses());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSecondaryAssetClasses field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSecondaryAssetClasses() {
    return isSetField(2080);
  }

public static class NoUnderlyingSecondaryAssetClasses extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2081, 2082, 2083, 2745, 0};

  public NoUnderlyingSecondaryAssetClasses() {
    super(2080, 2081, ORDER);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetClass get(quickfix.field.UnderlyingSecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetClass getUnderlyingSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetClass() {
    return isSetField(2081);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetSubClass get(quickfix.field.UnderlyingSecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetSubClass getUnderlyingSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetSubClass() {
    return isSetField(2082);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetType get(quickfix.field.UnderlyingSecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetType getUnderlyingSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetType() {
    return isSetField(2083);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetSubType get(quickfix.field.UnderlyingSecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetSubType getUnderlyingSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetSubType() {
    return isSetField(2745);
  }
}

  public void set(quickfix.field.UnderlyingSecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetClass get(quickfix.field.UnderlyingSecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetClass getUnderlyingSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetClass() {
    return isSetField(2081);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetSubClass get(quickfix.field.UnderlyingSecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetSubClass getUnderlyingSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetSubClass() {
    return isSetField(2082);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetType get(quickfix.field.UnderlyingSecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetType getUnderlyingSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetType() {
    return isSetField(2083);
  }

  public void set(quickfix.field.UnderlyingSecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecondaryAssetSubType get(quickfix.field.UnderlyingSecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecondaryAssetSubType getUnderlyingSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.UnderlyingSecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecondaryAssetSubType() {
    return isSetField(2745);
  }
}
