/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventRelativeDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41389, 41390, 41391, 41392, 41393, 41394, 41395, 41396, 41397, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventRelativeDate() {
    super();
  }

  public void set(quickfix.field.LegComplexEventDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateUnadjusted get(quickfix.field.LegComplexEventDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateUnadjusted getLegComplexEventDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateUnadjusted() {
    return isSetField(41389);
  }

  public void set(quickfix.field.LegComplexEventDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateRelativeTo get(quickfix.field.LegComplexEventDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateRelativeTo getLegComplexEventDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateRelativeTo() {
    return isSetField(41390);
  }

  public void set(quickfix.field.LegComplexEventDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateOffsetPeriod get(quickfix.field.LegComplexEventDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateOffsetPeriod getLegComplexEventDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateOffsetPeriod() {
    return isSetField(41391);
  }

  public void set(quickfix.field.LegComplexEventDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateOffsetUnit get(quickfix.field.LegComplexEventDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateOffsetUnit getLegComplexEventDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateOffsetUnit() {
    return isSetField(41392);
  }

  public void set(quickfix.field.LegComplexEventDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateOffsetDayType get(quickfix.field.LegComplexEventDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateOffsetDayType getLegComplexEventDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateOffsetDayType() {
    return isSetField(41393);
  }

  public void set(quickfix.field.LegComplexEventDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateBusinessDayConvention get(quickfix.field.LegComplexEventDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateBusinessDayConvention getLegComplexEventDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateBusinessDayConvention() {
    return isSetField(41394);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventDateBusinessCenterGrp get(quickfix.fixlatest.component.LegComplexEventDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventDateBusinessCenterGrp getLegComplexEventDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegComplexEventDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventDateBusinessCenters get(quickfix.field.NoLegComplexEventDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventDateBusinessCenters getNoLegComplexEventDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventDateBusinessCenters() {
    return isSetField(41387);
  }

public static class NoLegComplexEventDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41388, 0};

  public NoLegComplexEventDateBusinessCenters() {
    super(41387, 41388, ORDER);
  }

  public void set(quickfix.field.LegComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateBusinessCenter get(quickfix.field.LegComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateBusinessCenter getLegComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateBusinessCenter() {
    return isSetField(41388);
  }
}

  public void set(quickfix.field.LegComplexEventDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventDateAdjusted get(quickfix.field.LegComplexEventDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventDateAdjusted getLegComplexEventDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegComplexEventDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventDateAdjusted() {
    return isSetField(41395);
  }

  public void set(quickfix.field.LegComplexEventFixingTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFixingTime get(quickfix.field.LegComplexEventFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFixingTime getLegComplexEventFixingTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFixingTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFixingTime() {
    return isSetField(41396);
  }

  public void set(quickfix.field.LegComplexEventFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventFixingTimeBusinessCenter get(quickfix.field.LegComplexEventFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventFixingTimeBusinessCenter getLegComplexEventFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventFixingTimeBusinessCenter() {
    return isSetField(41397);
  }
}
