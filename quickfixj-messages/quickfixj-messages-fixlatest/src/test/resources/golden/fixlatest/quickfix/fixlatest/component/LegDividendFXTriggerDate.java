/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDividendFXTriggerDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42357, 42358, 42359, 42360, 42361, 42362, 42363, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegDividendFXTriggerDate() {
    super();
  }

  public void set(quickfix.field.LegDividendFXTriggerDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateRelativeTo get(quickfix.field.LegDividendFXTriggerDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateRelativeTo getLegDividendFXTriggerDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateRelativeTo() {
    return isSetField(42357);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateOffsetPeriod get(quickfix.field.LegDividendFXTriggerDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateOffsetPeriod getLegDividendFXTriggerDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateOffsetPeriod() {
    return isSetField(42358);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateOffsetUnit get(quickfix.field.LegDividendFXTriggerDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateOffsetUnit getLegDividendFXTriggerDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateOffsetUnit() {
    return isSetField(42359);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateOffsetDayType get(quickfix.field.LegDividendFXTriggerDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateOffsetDayType getLegDividendFXTriggerDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateOffsetDayType() {
    return isSetField(42360);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateUnadjusted get(quickfix.field.LegDividendFXTriggerDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateUnadjusted getLegDividendFXTriggerDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateUnadjusted() {
    return isSetField(42361);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessDayConvention get(quickfix.field.LegDividendFXTriggerDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessDayConvention getLegDividendFXTriggerDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateBusinessDayConvention() {
    return isSetField(42362);
  }

  public void set(quickfix.fixlatest.component.LegDividendFXTriggerDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendFXTriggerDateBusinessCenterGrp get(quickfix.fixlatest.component.LegDividendFXTriggerDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendFXTriggerDateBusinessCenterGrp getLegDividendFXTriggerDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendFXTriggerDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegDividendFXTriggerDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendFXTriggerDateBusinessCenters get(quickfix.field.NoLegDividendFXTriggerDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendFXTriggerDateBusinessCenters getNoLegDividendFXTriggerDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendFXTriggerDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegDividendFXTriggerDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendFXTriggerDateBusinessCenters() {
    return isSetField(42364);
  }

public static class NoLegDividendFXTriggerDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42365, 0};

  public NoLegDividendFXTriggerDateBusinessCenters() {
    super(42364, 42365, ORDER);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessCenter get(quickfix.field.LegDividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessCenter getLegDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateBusinessCenter() {
    return isSetField(42365);
  }
}

  public void set(quickfix.field.LegDividendFXTriggerDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateAdjusted get(quickfix.field.LegDividendFXTriggerDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateAdjusted getLegDividendFXTriggerDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateAdjusted() {
    return isSetField(42363);
  }
}
