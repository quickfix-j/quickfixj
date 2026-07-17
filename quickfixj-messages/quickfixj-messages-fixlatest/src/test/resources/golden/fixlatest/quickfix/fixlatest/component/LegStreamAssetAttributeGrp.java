/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamAssetAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41452, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamAssetAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamAssetAttributes get(quickfix.field.NoLegStreamAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamAssetAttributes getNoLegStreamAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoLegStreamAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamAssetAttributes() {
    return isSetField(41452);
  }

public static class NoLegStreamAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41453, 41454, 41455, 0};

  public NoLegStreamAssetAttributes() {
    super(41452, 41453, ORDER);
  }

  public void set(quickfix.field.LegStreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeType get(quickfix.field.LegStreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeType getLegStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeType() {
    return isSetField(41453);
  }

  public void set(quickfix.field.LegStreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeValue get(quickfix.field.LegStreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeValue getLegStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeValue() {
    return isSetField(41454);
  }

  public void set(quickfix.field.LegStreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeLimit get(quickfix.field.LegStreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeLimit getLegStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeLimit() {
    return isSetField(41455);
  }
}

  public void set(quickfix.field.LegStreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeType get(quickfix.field.LegStreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeType getLegStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeType() {
    return isSetField(41453);
  }

  public void set(quickfix.field.LegStreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeValue get(quickfix.field.LegStreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeValue getLegStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeValue() {
    return isSetField(41454);
  }

  public void set(quickfix.field.LegStreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeLimit get(quickfix.field.LegStreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeLimit getLegStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeLimit() {
    return isSetField(41455);
  }
}
