/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamEffectiveDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40942, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamEffectiveDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamEffectiveDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamEffectiveDateBusinessCenters get(quickfix.field.NoLegStreamEffectiveDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamEffectiveDateBusinessCenters getNoLegStreamEffectiveDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamEffectiveDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamEffectiveDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamEffectiveDateBusinessCenters() {
    return isSetField(40942);
  }

public static class NoLegStreamEffectiveDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40251, 0};

  public NoLegStreamEffectiveDateBusinessCenters() {
    super(40942, 40251, ORDER);
  }

  public void set(quickfix.field.LegStreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateBusinessCenter get(quickfix.field.LegStreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateBusinessCenter getLegStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateBusinessCenter() {
    return isSetField(40251);
  }
}

  public void set(quickfix.field.LegStreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateBusinessCenter get(quickfix.field.LegStreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateBusinessCenter getLegStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateBusinessCenter() {
    return isSetField(40251);
  }
}
