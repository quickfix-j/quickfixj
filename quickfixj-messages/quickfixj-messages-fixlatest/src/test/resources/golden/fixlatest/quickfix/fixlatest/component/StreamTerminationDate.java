/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamTerminationDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40065, 40066, 40068, 40069, 40070, 40071, 40072, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public StreamTerminationDate() {
    super();
  }

  public void set(quickfix.field.StreamTerminationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateUnadjusted get(quickfix.field.StreamTerminationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateUnadjusted getStreamTerminationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateUnadjusted() {
    return isSetField(40065);
  }

  public void set(quickfix.field.StreamTerminationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateBusinessDayConvention get(quickfix.field.StreamTerminationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateBusinessDayConvention getStreamTerminationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateBusinessDayConvention() {
    return isSetField(40066);
  }

  public void set(quickfix.fixlatest.component.StreamTerminationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamTerminationDateBusinessCenterGrp get(quickfix.fixlatest.component.StreamTerminationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamTerminationDateBusinessCenterGrp getStreamTerminationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamTerminationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoStreamTerminationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamTerminationDateBusinessCenters get(quickfix.field.NoStreamTerminationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamTerminationDateBusinessCenters getNoStreamTerminationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamTerminationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamTerminationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamTerminationDateBusinessCenters() {
    return isSetField(40961);
  }

public static class NoStreamTerminationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40067, 0};

  public NoStreamTerminationDateBusinessCenters() {
    super(40961, 40067, ORDER);
  }

  public void set(quickfix.field.StreamTerminationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateBusinessCenter get(quickfix.field.StreamTerminationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateBusinessCenter getStreamTerminationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateBusinessCenter() {
    return isSetField(40067);
  }
}

  public void set(quickfix.field.StreamTerminationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateRelativeTo get(quickfix.field.StreamTerminationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateRelativeTo getStreamTerminationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateRelativeTo() {
    return isSetField(40068);
  }

  public void set(quickfix.field.StreamTerminationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateOffsetPeriod get(quickfix.field.StreamTerminationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateOffsetPeriod getStreamTerminationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateOffsetPeriod() {
    return isSetField(40069);
  }

  public void set(quickfix.field.StreamTerminationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateOffsetUnit get(quickfix.field.StreamTerminationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateOffsetUnit getStreamTerminationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateOffsetUnit() {
    return isSetField(40070);
  }

  public void set(quickfix.field.StreamTerminationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateOffsetDayType get(quickfix.field.StreamTerminationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateOffsetDayType getStreamTerminationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateOffsetDayType() {
    return isSetField(40071);
  }

  public void set(quickfix.field.StreamTerminationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.StreamTerminationDateAdjusted get(quickfix.field.StreamTerminationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTerminationDateAdjusted getStreamTerminationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamTerminationDateAdjusted());
  }

  public boolean isSet(quickfix.field.StreamTerminationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamTerminationDateAdjusted() {
    return isSetField(40072);
  }
}
