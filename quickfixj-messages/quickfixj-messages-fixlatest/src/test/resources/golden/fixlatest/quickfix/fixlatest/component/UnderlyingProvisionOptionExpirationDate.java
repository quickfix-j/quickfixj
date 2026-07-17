/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionExpirationDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42133, 42134, 42135, 42136, 42137, 42138, 42139, 42140, 42141, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionExpirationDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateUnadjusted get(quickfix.field.UnderlyingProvisionOptionExpirationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateUnadjusted getUnderlyingProvisionOptionExpirationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateUnadjusted() {
    return isSetField(42133);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessDayConvention getUnderlyingProvisionOptionExpirationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateBusinessDayConvention() {
    return isSetField(42134);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDateBusinessCenterGrp getUnderlyingProvisionOptionExpirationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExpirationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters getNoUnderlyingProvisionOptionExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionExpirationDateBusinessCenters() {
    return isSetField(42186);
  }

public static class NoUnderlyingProvisionOptionExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42187, 0};

  public NoUnderlyingProvisionOptionExpirationDateBusinessCenters() {
    super(42186, 42187, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter getUnderlyingProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(42187);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateRelativeTo get(quickfix.field.UnderlyingProvisionOptionExpirationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateRelativeTo getUnderlyingProvisionOptionExpirationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateRelativeTo() {
    return isSetField(42135);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetPeriod get(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetPeriod getUnderlyingProvisionOptionExpirationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateOffsetPeriod() {
    return isSetField(42136);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetUnit get(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetUnit getUnderlyingProvisionOptionExpirationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateOffsetUnit() {
    return isSetField(42137);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetDayType get(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetDayType getUnderlyingProvisionOptionExpirationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateOffsetDayType() {
    return isSetField(42138);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateAdjusted get(quickfix.field.UnderlyingProvisionOptionExpirationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateAdjusted getUnderlyingProvisionOptionExpirationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateAdjusted() {
    return isSetField(42139);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationTime get(quickfix.field.UnderlyingProvisionOptionExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationTime getUnderlyingProvisionOptionExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationTime() {
    return isSetField(42140);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationTimeBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExpirationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationTimeBusinessCenter getUnderlyingProvisionOptionExpirationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationTimeBusinessCenter() {
    return isSetField(42141);
  }
}
