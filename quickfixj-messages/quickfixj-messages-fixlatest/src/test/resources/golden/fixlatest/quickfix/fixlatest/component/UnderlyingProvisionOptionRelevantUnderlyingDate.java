/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionRelevantUnderlyingDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42142, 42143, 42144, 42145, 42146, 42147, 42148, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionRelevantUnderlyingDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted getUnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateUnadjusted() {
    return isSetField(42142);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention getUnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateBusinessDayConvention() {
    return isSetField(42143);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp getUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters getNoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    return isSetField(42188);
  }

public static class NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42189, 0};

  public NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    super(42188, 42189, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter getUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(42189);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo getUnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateRelativeTo() {
    return isSetField(42144);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod getUnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateOffsetPeriod() {
    return isSetField(42145);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit getUnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateOffsetUnit() {
    return isSetField(42146);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType getUnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateOffsetDayType() {
    return isSetField(42147);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateAdjusted get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateAdjusted getUnderlyingProvisionOptionRelevantUnderlyingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateAdjusted() {
    return isSetField(42148);
  }
}
