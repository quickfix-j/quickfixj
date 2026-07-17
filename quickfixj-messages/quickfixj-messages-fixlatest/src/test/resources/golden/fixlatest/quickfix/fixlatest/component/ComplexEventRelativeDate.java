/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventRelativeDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41020, 41021, 41022, 41023, 41024, 41025, 41026, 41027, 41028, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventRelativeDate() {
    super();
  }

  public void set(quickfix.field.ComplexEventDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateUnadjusted get(quickfix.field.ComplexEventDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateUnadjusted getComplexEventDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ComplexEventDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateUnadjusted() {
    return isSetField(41020);
  }

  public void set(quickfix.field.ComplexEventDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateRelativeTo get(quickfix.field.ComplexEventDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateRelativeTo getComplexEventDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ComplexEventDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateRelativeTo() {
    return isSetField(41021);
  }

  public void set(quickfix.field.ComplexEventDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateOffsetPeriod get(quickfix.field.ComplexEventDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateOffsetPeriod getComplexEventDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateOffsetPeriod() {
    return isSetField(41022);
  }

  public void set(quickfix.field.ComplexEventDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateOffsetUnit get(quickfix.field.ComplexEventDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateOffsetUnit getComplexEventDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateOffsetUnit() {
    return isSetField(41023);
  }

  public void set(quickfix.field.ComplexEventDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateOffsetDayType get(quickfix.field.ComplexEventDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateOffsetDayType getComplexEventDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ComplexEventDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateOffsetDayType() {
    return isSetField(41024);
  }

  public void set(quickfix.field.ComplexEventDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateBusinessDayConvention get(quickfix.field.ComplexEventDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateBusinessDayConvention getComplexEventDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ComplexEventDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateBusinessDayConvention() {
    return isSetField(41025);
  }

  public void set(quickfix.fixlatest.component.ComplexEventDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventDateBusinessCenterGrp get(quickfix.fixlatest.component.ComplexEventDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventDateBusinessCenterGrp getComplexEventDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoComplexEventDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventDateBusinessCenters get(quickfix.field.NoComplexEventDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventDateBusinessCenters getNoComplexEventDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoComplexEventDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventDateBusinessCenters() {
    return isSetField(41018);
  }

public static class NoComplexEventDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41019, 0};

  public NoComplexEventDateBusinessCenters() {
    super(41018, 41019, ORDER);
  }

  public void set(quickfix.field.ComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateBusinessCenter get(quickfix.field.ComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateBusinessCenter getComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateBusinessCenter() {
    return isSetField(41019);
  }
}

  public void set(quickfix.field.ComplexEventDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateAdjusted get(quickfix.field.ComplexEventDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateAdjusted getComplexEventDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateAdjusted());
  }

  public boolean isSet(quickfix.field.ComplexEventDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateAdjusted() {
    return isSetField(41026);
  }

  public void set(quickfix.field.ComplexEventFixingTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFixingTime get(quickfix.field.ComplexEventFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFixingTime getComplexEventFixingTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFixingTime());
  }

  public boolean isSet(quickfix.field.ComplexEventFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFixingTime() {
    return isSetField(41027);
  }

  public void set(quickfix.field.ComplexEventFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventFixingTimeBusinessCenter get(quickfix.field.ComplexEventFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventFixingTimeBusinessCenter getComplexEventFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventFixingTimeBusinessCenter() {
    return isSetField(41028);
  }
}
