/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionRelevantUnderlyingDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40155, 40156, 40158, 40159, 40160, 40161, 40162, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionRelevantUnderlyingDate() {
    super();
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateUnadjusted get(quickfix.field.ProvisionOptionRelevantUnderlyingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateUnadjusted getProvisionOptionRelevantUnderlyingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateUnadjusted() {
    return isSetField(40155);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessDayConvention get(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessDayConvention getProvisionOptionRelevantUnderlyingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateBusinessDayConvention() {
    return isSetField(40156);
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp getProvisionOptionRelevantUnderlyingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters get(quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters getNoProvisionOptionRelevantUnderlyingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    return isSetField(40956);
  }

public static class NoProvisionOptionRelevantUnderlyingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40157, 0};

  public NoProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    super(40956, 40157, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter getProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(40157);
  }
}

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateRelativeTo get(quickfix.field.ProvisionOptionRelevantUnderlyingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateRelativeTo getProvisionOptionRelevantUnderlyingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateRelativeTo() {
    return isSetField(40158);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetPeriod get(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetPeriod getProvisionOptionRelevantUnderlyingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateOffsetPeriod() {
    return isSetField(40159);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetUnit get(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetUnit getProvisionOptionRelevantUnderlyingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateOffsetUnit() {
    return isSetField(40160);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetDayType get(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetDayType getProvisionOptionRelevantUnderlyingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateOffsetDayType() {
    return isSetField(40161);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateAdjusted get(quickfix.field.ProvisionOptionRelevantUnderlyingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateAdjusted getProvisionOptionRelevantUnderlyingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateAdjusted() {
    return isSetField(40162);
  }
}
