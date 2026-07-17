/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionExpirationDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40145, 40146, 40148, 40149, 40150, 40151, 40152, 40153, 40154, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionExpirationDate() {
    super();
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateUnadjusted get(quickfix.field.ProvisionOptionExpirationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateUnadjusted getProvisionOptionExpirationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateUnadjusted() {
    return isSetField(40145);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessDayConvention get(quickfix.field.ProvisionOptionExpirationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessDayConvention getProvisionOptionExpirationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateBusinessDayConvention() {
    return isSetField(40146);
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExpirationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDateBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionOptionExpirationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExpirationDateBusinessCenterGrp getProvisionOptionExpirationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExpirationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionOptionExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionExpirationDateBusinessCenters get(quickfix.field.NoProvisionOptionExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionExpirationDateBusinessCenters getNoProvisionOptionExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionExpirationDateBusinessCenters() {
    return isSetField(40955);
  }

public static class NoProvisionOptionExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40147, 0};

  public NoProvisionOptionExpirationDateBusinessCenters() {
    super(40955, 40147, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessCenter get(quickfix.field.ProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessCenter getProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(40147);
  }
}

  public void set(quickfix.field.ProvisionOptionExpirationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateRelativeTo get(quickfix.field.ProvisionOptionExpirationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateRelativeTo getProvisionOptionExpirationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateRelativeTo() {
    return isSetField(40148);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateOffsetPeriod get(quickfix.field.ProvisionOptionExpirationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateOffsetPeriod getProvisionOptionExpirationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateOffsetPeriod() {
    return isSetField(40149);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateOffsetUnit get(quickfix.field.ProvisionOptionExpirationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateOffsetUnit getProvisionOptionExpirationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateOffsetUnit() {
    return isSetField(40150);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateOffsetDayType get(quickfix.field.ProvisionOptionExpirationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateOffsetDayType getProvisionOptionExpirationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateOffsetDayType() {
    return isSetField(40151);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateAdjusted get(quickfix.field.ProvisionOptionExpirationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateAdjusted getProvisionOptionExpirationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateAdjusted() {
    return isSetField(40152);
  }

  public void set(quickfix.field.ProvisionOptionExpirationTime value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationTime get(quickfix.field.ProvisionOptionExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationTime getProvisionOptionExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationTime());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationTime() {
    return isSetField(40153);
  }

  public void set(quickfix.field.ProvisionOptionExpirationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationTimeBusinessCenter get(quickfix.field.ProvisionOptionExpirationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationTimeBusinessCenter getProvisionOptionExpirationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationTimeBusinessCenter() {
    return isSetField(40154);
  }
}
