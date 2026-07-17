/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionExpirationDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40498, 40499, 40501, 40502, 40503, 40504, 40505, 40506, 40507, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionExpirationDate() {
    super();
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateUnadjusted get(quickfix.field.LegProvisionOptionExpirationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateUnadjusted getLegProvisionOptionExpirationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateUnadjusted() {
    return isSetField(40498);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessDayConvention get(quickfix.field.LegProvisionOptionExpirationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessDayConvention getLegProvisionOptionExpirationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateBusinessDayConvention() {
    return isSetField(40499);
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExpirationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionOptionExpirationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExpirationDateBusinessCenterGrp getLegProvisionOptionExpirationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExpirationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters get(quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters getNoLegProvisionOptionExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionExpirationDateBusinessCenters() {
    return isSetField(40937);
  }

public static class NoLegProvisionOptionExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40500, 0};

  public NoLegProvisionOptionExpirationDateBusinessCenters() {
    super(40937, 40500, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessCenter get(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessCenter getLegProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(40500);
  }
}

  public void set(quickfix.field.LegProvisionOptionExpirationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateRelativeTo get(quickfix.field.LegProvisionOptionExpirationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateRelativeTo getLegProvisionOptionExpirationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateRelativeTo() {
    return isSetField(40501);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateOffsetPeriod get(quickfix.field.LegProvisionOptionExpirationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateOffsetPeriod getLegProvisionOptionExpirationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateOffsetPeriod() {
    return isSetField(40502);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateOffsetUnit get(quickfix.field.LegProvisionOptionExpirationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateOffsetUnit getLegProvisionOptionExpirationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateOffsetUnit() {
    return isSetField(40503);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateOffsetDayType get(quickfix.field.LegProvisionOptionExpirationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateOffsetDayType getLegProvisionOptionExpirationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateOffsetDayType() {
    return isSetField(40504);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateAdjusted get(quickfix.field.LegProvisionOptionExpirationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateAdjusted getLegProvisionOptionExpirationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateAdjusted() {
    return isSetField(40505);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationTime value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationTime get(quickfix.field.LegProvisionOptionExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationTime getLegProvisionOptionExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationTime());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationTime() {
    return isSetField(40506);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationTimeBusinessCenter get(quickfix.field.LegProvisionOptionExpirationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationTimeBusinessCenter getLegProvisionOptionExpirationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationTimeBusinessCenter() {
    return isSetField(40507);
  }
}
