/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionRelevantUnderlyingDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40508, 40509, 40511, 40512, 40513, 40514, 40515, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionRelevantUnderlyingDate() {
    super();
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateUnadjusted get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateUnadjusted getLegProvisionOptionRelevantUnderlyingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateUnadjusted() {
    return isSetField(40508);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessDayConvention get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessDayConvention getLegProvisionOptionRelevantUnderlyingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateBusinessDayConvention() {
    return isSetField(40509);
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp getLegProvisionOptionRelevantUnderlyingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters get(quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters getNoLegProvisionOptionRelevantUnderlyingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    return isSetField(40938);
  }

public static class NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40510, 0};

  public NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    super(40938, 40510, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter getLegProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(40510);
  }
}

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateRelativeTo get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateRelativeTo getLegProvisionOptionRelevantUnderlyingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateRelativeTo() {
    return isSetField(40511);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetPeriod get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetPeriod getLegProvisionOptionRelevantUnderlyingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateOffsetPeriod() {
    return isSetField(40512);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetUnit get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetUnit getLegProvisionOptionRelevantUnderlyingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateOffsetUnit() {
    return isSetField(40513);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetDayType get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetDayType getLegProvisionOptionRelevantUnderlyingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateOffsetDayType() {
    return isSetField(40514);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateAdjusted get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateAdjusted getLegProvisionOptionRelevantUnderlyingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateAdjusted() {
    return isSetField(40515);
  }
}
