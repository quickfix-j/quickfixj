/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseExpiration extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41846, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseExpiration() {
    super();
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessDayConvention get(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessDayConvention getUnderlyingOptionExerciseExpirationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateBusinessDayConvention() {
    return isSetField(41846);
  }

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateBusinessCenterGrp getUnderlyingOptionExerciseExpirationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters get(quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters getNoUnderlyingOptionExerciseExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseExpirationDateBusinessCenters() {
    return isSetField(41844);
  }

public static class NoUnderlyingOptionExerciseExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41845, 0};

  public NoUnderlyingOptionExerciseExpirationDateBusinessCenters() {
    super(41844, 41845, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter get(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter getUnderlyingOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41845);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateGrp get(quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateGrp getUnderlyingOptionExerciseExpirationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseExpirationDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseExpirationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDates get(quickfix.field.NoUnderlyingOptionExerciseExpirationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseExpirationDates getNoUnderlyingOptionExerciseExpirationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseExpirationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseExpirationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseExpirationDates() {
    return isSetField(41856);
  }

public static class NoUnderlyingOptionExerciseExpirationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41857, 41858, 0};

  public NoUnderlyingOptionExerciseExpirationDates() {
    super(41856, 41857, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDate get(quickfix.field.UnderlyingOptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDate getUnderlyingOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDate() {
    return isSetField(41857);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateType get(quickfix.field.UnderlyingOptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateType getUnderlyingOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateType() {
    return isSetField(41858);
  }
}

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateRelativeTo get(quickfix.field.UnderlyingOptionExerciseExpirationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateRelativeTo getUnderlyingOptionExerciseExpirationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateRelativeTo() {
    return isSetField(41847);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetPeriod get(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetPeriod getUnderlyingOptionExerciseExpirationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateOffsetPeriod() {
    return isSetField(41848);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetUnit get(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetUnit getUnderlyingOptionExerciseExpirationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateOffsetUnit() {
    return isSetField(41849);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationFrequencyPeriod get(quickfix.field.UnderlyingOptionExerciseExpirationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationFrequencyPeriod getUnderlyingOptionExerciseExpirationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationFrequencyPeriod() {
    return isSetField(41850);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationFrequencyUnit get(quickfix.field.UnderlyingOptionExerciseExpirationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationFrequencyUnit getUnderlyingOptionExerciseExpirationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationFrequencyUnit() {
    return isSetField(41851);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationRollConvention get(quickfix.field.UnderlyingOptionExerciseExpirationRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationRollConvention getUnderlyingOptionExerciseExpirationRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationRollConvention() {
    return isSetField(41852);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetDayType get(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetDayType getUnderlyingOptionExerciseExpirationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationDateOffsetDayType() {
    return isSetField(41853);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationTime get(quickfix.field.UnderlyingOptionExerciseExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationTime getUnderlyingOptionExerciseExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationTime() {
    return isSetField(41854);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseExpirationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationTimeBusinessCenter get(quickfix.field.UnderlyingOptionExerciseExpirationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseExpirationTimeBusinessCenter getUnderlyingOptionExerciseExpirationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseExpirationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseExpirationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseExpirationTimeBusinessCenter() {
    return isSetField(41855);
  }
}
