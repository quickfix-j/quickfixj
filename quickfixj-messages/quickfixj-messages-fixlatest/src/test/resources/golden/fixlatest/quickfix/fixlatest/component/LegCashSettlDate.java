/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegCashSettlDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42299, 42300, 42301, 42302, 42303, 42304, 42305, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegCashSettlDate() {
    super();
  }

  public void set(quickfix.field.LegCashSettlDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateUnadjusted get(quickfix.field.LegCashSettlDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateUnadjusted getLegCashSettlDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateUnadjusted() {
    return isSetField(42299);
  }

  public void set(quickfix.field.LegCashSettlDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateBusinessDayConvention get(quickfix.field.LegCashSettlDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateBusinessDayConvention getLegCashSettlDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateBusinessDayConvention() {
    return isSetField(42300);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDateBusinessCenterGrp get(quickfix.fixlatest.component.LegCashSettlDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDateBusinessCenterGrp getLegCashSettlDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegCashSettlDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlDateBusinessCenters get(quickfix.field.NoLegCashSettlDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlDateBusinessCenters getNoLegCashSettlDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlDateBusinessCenters() {
    return isSetField(42306);
  }

public static class NoLegCashSettlDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42307, 0};

  public NoLegCashSettlDateBusinessCenters() {
    super(42306, 42307, ORDER);
  }

  public void set(quickfix.field.LegCashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateBusinessCenter get(quickfix.field.LegCashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateBusinessCenter getLegCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateBusinessCenter() {
    return isSetField(42307);
  }
}

  public void set(quickfix.field.LegCashSettlDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateRelativeTo get(quickfix.field.LegCashSettlDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateRelativeTo getLegCashSettlDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateRelativeTo() {
    return isSetField(42301);
  }

  public void set(quickfix.field.LegCashSettlDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateOffsetPeriod get(quickfix.field.LegCashSettlDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateOffsetPeriod getLegCashSettlDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateOffsetPeriod() {
    return isSetField(42302);
  }

  public void set(quickfix.field.LegCashSettlDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateOffsetUnit get(quickfix.field.LegCashSettlDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateOffsetUnit getLegCashSettlDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateOffsetUnit() {
    return isSetField(42303);
  }

  public void set(quickfix.field.LegCashSettlDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateOffsetDayType get(quickfix.field.LegCashSettlDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateOffsetDayType getLegCashSettlDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateOffsetDayType() {
    return isSetField(42304);
  }

  public void set(quickfix.field.LegCashSettlDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateAdjusted get(quickfix.field.LegCashSettlDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateAdjusted getLegCashSettlDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateAdjusted() {
    return isSetField(42305);
  }
}
