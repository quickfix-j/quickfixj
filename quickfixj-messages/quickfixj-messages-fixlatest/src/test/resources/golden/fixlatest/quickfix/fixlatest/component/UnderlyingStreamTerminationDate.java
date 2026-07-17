/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamTerminationDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40548, 40549, 40551, 40552, 40553, 40554, 40555, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamTerminationDate() {
    super();
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateUnadjusted get(quickfix.field.UnderlyingStreamTerminationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateUnadjusted getUnderlyingStreamTerminationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateUnadjusted() {
    return isSetField(40548);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessDayConvention get(quickfix.field.UnderlyingStreamTerminationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessDayConvention getUnderlyingStreamTerminationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateBusinessDayConvention() {
    return isSetField(40549);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamTerminationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingStreamTerminationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDateBusinessCenterGrp getUnderlyingStreamTerminationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamTerminationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters get(quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters getNoUnderlyingStreamTerminationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamTerminationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamTerminationDateBusinessCenters() {
    return isSetField(40976);
  }

public static class NoUnderlyingStreamTerminationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40550, 0};

  public NoUnderlyingStreamTerminationDateBusinessCenters() {
    super(40976, 40550, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessCenter get(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateBusinessCenter getUnderlyingStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateBusinessCenter() {
    return isSetField(40550);
  }
}

  public void set(quickfix.field.UnderlyingStreamTerminationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateRelativeTo get(quickfix.field.UnderlyingStreamTerminationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateRelativeTo getUnderlyingStreamTerminationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateRelativeTo() {
    return isSetField(40551);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateOffsetPeriod get(quickfix.field.UnderlyingStreamTerminationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateOffsetPeriod getUnderlyingStreamTerminationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateOffsetPeriod() {
    return isSetField(40552);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateOffsetUnit get(quickfix.field.UnderlyingStreamTerminationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateOffsetUnit getUnderlyingStreamTerminationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateOffsetUnit() {
    return isSetField(40553);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateOffsetDayType get(quickfix.field.UnderlyingStreamTerminationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateOffsetDayType getUnderlyingStreamTerminationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateOffsetDayType() {
    return isSetField(40554);
  }

  public void set(quickfix.field.UnderlyingStreamTerminationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTerminationDateAdjusted get(quickfix.field.UnderlyingStreamTerminationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTerminationDateAdjusted getUnderlyingStreamTerminationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTerminationDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTerminationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTerminationDateAdjusted() {
    return isSetField(40555);
  }
}
