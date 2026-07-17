/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamEffectiveDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40249, 40250, 40252, 40253, 40254, 40255, 40256, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamEffectiveDate() {
    super();
  }

  public void set(quickfix.field.LegStreamEffectiveDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateUnadjusted get(quickfix.field.LegStreamEffectiveDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateUnadjusted getLegStreamEffectiveDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateUnadjusted() {
    return isSetField(40249);
  }

  public void set(quickfix.field.LegStreamEffectiveDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateBusinessDayConvention get(quickfix.field.LegStreamEffectiveDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateBusinessDayConvention getLegStreamEffectiveDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateBusinessDayConvention() {
    return isSetField(40250);
  }

  public void set(quickfix.fixlatest.component.LegStreamEffectiveDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDateBusinessCenterGrp get(quickfix.fixlatest.component.LegStreamEffectiveDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDateBusinessCenterGrp getLegStreamEffectiveDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamEffectiveDateBusinessCenterGrp());
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

  public void set(quickfix.field.LegStreamEffectiveDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateRelativeTo get(quickfix.field.LegStreamEffectiveDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateRelativeTo getLegStreamEffectiveDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateRelativeTo() {
    return isSetField(40252);
  }

  public void set(quickfix.field.LegStreamEffectiveDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateOffsetPeriod get(quickfix.field.LegStreamEffectiveDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateOffsetPeriod getLegStreamEffectiveDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateOffsetPeriod() {
    return isSetField(40253);
  }

  public void set(quickfix.field.LegStreamEffectiveDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateOffsetUnit get(quickfix.field.LegStreamEffectiveDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateOffsetUnit getLegStreamEffectiveDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateOffsetUnit() {
    return isSetField(40254);
  }

  public void set(quickfix.field.LegStreamEffectiveDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateOffsetDayType get(quickfix.field.LegStreamEffectiveDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateOffsetDayType getLegStreamEffectiveDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateOffsetDayType() {
    return isSetField(40255);
  }

  public void set(quickfix.field.LegStreamEffectiveDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamEffectiveDateAdjusted get(quickfix.field.LegStreamEffectiveDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamEffectiveDateAdjusted getLegStreamEffectiveDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamEffectiveDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegStreamEffectiveDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamEffectiveDateAdjusted() {
    return isSetField(40256);
  }
}
