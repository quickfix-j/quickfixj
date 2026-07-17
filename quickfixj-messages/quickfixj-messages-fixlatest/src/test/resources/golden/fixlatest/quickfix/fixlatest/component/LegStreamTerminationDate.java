/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamTerminationDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40257, 40258, 40260, 40261, 40262, 40263, 40264, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamTerminationDate() {
    super();
  }

  public void set(quickfix.field.LegStreamTerminationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateUnadjusted get(quickfix.field.LegStreamTerminationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateUnadjusted getLegStreamTerminationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateUnadjusted() {
    return isSetField(40257);
  }

  public void set(quickfix.field.LegStreamTerminationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateBusinessDayConvention get(quickfix.field.LegStreamTerminationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateBusinessDayConvention getLegStreamTerminationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateBusinessDayConvention() {
    return isSetField(40258);
  }

  public void set(quickfix.fixlatest.component.LegStreamTerminationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamTerminationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegStreamTerminationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamTerminationDateBusinessCenterGrp getLegStreamTerminationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamTerminationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegStreamTerminationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamTerminationDateBusinessCenters get(quickfix.field.NoLegStreamTerminationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamTerminationDateBusinessCenters getNoLegStreamTerminationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamTerminationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamTerminationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamTerminationDateBusinessCenters() {
    return isSetField(40943);
  }

public static class NoLegStreamTerminationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40259, 0};

  public NoLegStreamTerminationDateBusinessCenters() {
    super(40943, 40259, ORDER);
  }

  public void set(quickfix.field.LegStreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateBusinessCenter get(quickfix.field.LegStreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateBusinessCenter getLegStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateBusinessCenter() {
    return isSetField(40259);
  }
}

  public void set(quickfix.field.LegStreamTerminationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateRelativeTo get(quickfix.field.LegStreamTerminationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateRelativeTo getLegStreamTerminationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateRelativeTo() {
    return isSetField(40260);
  }

  public void set(quickfix.field.LegStreamTerminationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateOffsetPeriod get(quickfix.field.LegStreamTerminationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateOffsetPeriod getLegStreamTerminationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateOffsetPeriod() {
    return isSetField(40261);
  }

  public void set(quickfix.field.LegStreamTerminationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateOffsetUnit get(quickfix.field.LegStreamTerminationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateOffsetUnit getLegStreamTerminationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateOffsetUnit() {
    return isSetField(40262);
  }

  public void set(quickfix.field.LegStreamTerminationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateOffsetDayType get(quickfix.field.LegStreamTerminationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateOffsetDayType getLegStreamTerminationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateOffsetDayType() {
    return isSetField(40263);
  }

  public void set(quickfix.field.LegStreamTerminationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamTerminationDateAdjusted get(quickfix.field.LegStreamTerminationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTerminationDateAdjusted getLegStreamTerminationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTerminationDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegStreamTerminationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTerminationDateAdjusted() {
    return isSetField(40264);
  }
}
