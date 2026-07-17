/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSecondaryAssetGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2076, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegSecondaryAssetGrp() {
    super();
  }

  public void set(quickfix.field.NoLegSecondaryAssetClasses value) {
    setField(value);
  }

  public quickfix.field.NoLegSecondaryAssetClasses get(quickfix.field.NoLegSecondaryAssetClasses value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSecondaryAssetClasses getNoLegSecondaryAssetClasses() throws FieldNotFound {
    return get(new quickfix.field.NoLegSecondaryAssetClasses());
  }

  public boolean isSet(quickfix.field.NoLegSecondaryAssetClasses field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSecondaryAssetClasses() {
    return isSetField(2076);
  }

public static class NoLegSecondaryAssetClasses extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2077, 2078, 2079, 2743, 0};

  public NoLegSecondaryAssetClasses() {
    super(2076, 2077, ORDER);
  }

  public void set(quickfix.field.LegSecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetClass get(quickfix.field.LegSecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetClass getLegSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetClass() {
    return isSetField(2077);
  }

  public void set(quickfix.field.LegSecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetSubClass get(quickfix.field.LegSecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetSubClass getLegSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetSubClass() {
    return isSetField(2078);
  }

  public void set(quickfix.field.LegSecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetType get(quickfix.field.LegSecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetType getLegSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetType());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetType() {
    return isSetField(2079);
  }

  public void set(quickfix.field.LegSecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetSubType get(quickfix.field.LegSecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetSubType getLegSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetSubType() {
    return isSetField(2743);
  }
}

  public void set(quickfix.field.LegSecondaryAssetClass value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetClass get(quickfix.field.LegSecondaryAssetClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetClass getLegSecondaryAssetClass() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetClass());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetClass() {
    return isSetField(2077);
  }

  public void set(quickfix.field.LegSecondaryAssetSubClass value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetSubClass get(quickfix.field.LegSecondaryAssetSubClass value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetSubClass getLegSecondaryAssetSubClass() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetSubClass());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetSubClass field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetSubClass() {
    return isSetField(2078);
  }

  public void set(quickfix.field.LegSecondaryAssetType value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetType get(quickfix.field.LegSecondaryAssetType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetType getLegSecondaryAssetType() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetType());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetType() {
    return isSetField(2079);
  }

  public void set(quickfix.field.LegSecondaryAssetSubType value) {
    setField(value);
  }

  public quickfix.field.LegSecondaryAssetSubType get(quickfix.field.LegSecondaryAssetSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecondaryAssetSubType getLegSecondaryAssetSubType() throws FieldNotFound {
    return get(new quickfix.field.LegSecondaryAssetSubType());
  }

  public boolean isSet(quickfix.field.LegSecondaryAssetSubType field) {
    return isSetField(field);
  }

  public boolean isSetLegSecondaryAssetSubType() {
    return isSetField(2743);
  }
}
