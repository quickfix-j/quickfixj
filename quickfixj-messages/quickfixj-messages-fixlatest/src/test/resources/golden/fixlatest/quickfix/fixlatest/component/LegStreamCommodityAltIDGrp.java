/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommodityAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41674, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommodityAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCommodityAltIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommodityAltIDs get(quickfix.field.NoLegStreamCommodityAltIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommodityAltIDs getNoLegStreamCommodityAltIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommodityAltIDs());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommodityAltIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommodityAltIDs() {
    return isSetField(41674);
  }

public static class NoLegStreamCommodityAltIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41675, 41676, 0};

  public NoLegStreamCommodityAltIDs() {
    super(41674, 41675, ORDER);
  }

  public void set(quickfix.field.LegStreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityAltID get(quickfix.field.LegStreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityAltID getLegStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityAltID() {
    return isSetField(41675);
  }

  public void set(quickfix.field.LegStreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityAltIDSource get(quickfix.field.LegStreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityAltIDSource getLegStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityAltIDSource() {
    return isSetField(41676);
  }
}

  public void set(quickfix.field.LegStreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityAltID get(quickfix.field.LegStreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityAltID getLegStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityAltID() {
    return isSetField(41675);
  }

  public void set(quickfix.field.LegStreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityAltIDSource get(quickfix.field.LegStreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityAltIDSource getLegStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityAltIDSource() {
    return isSetField(41676);
  }
}
