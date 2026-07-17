/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseExpiration extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41517, 41518, 41519, 41520, 41521, 41522, 41523, 41524, 41525, 41526, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseExpiration() {
    super();
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessDayConvention get(quickfix.field.LegOptionExerciseExpirationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessDayConvention getLegOptionExerciseExpirationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateBusinessDayConvention() {
    return isSetField(41517);
  }

  public void set(quickfix.fixlatest.component.LegOptionExerciseExpirationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseExpirationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegOptionExerciseExpirationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseExpirationDateBusinessCenterGrp getLegOptionExerciseExpirationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseExpirationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters get(quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters getNoLegOptionExerciseExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseExpirationDateBusinessCenters() {
    return isSetField(41515);
  }

public static class NoLegOptionExerciseExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41516, 0};

  public NoLegOptionExerciseExpirationDateBusinessCenters() {
    super(41515, 41516, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessCenter get(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateBusinessCenter getLegOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41516);
  }
}

  public void set(quickfix.fixlatest.component.LegOptionExerciseExpirationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseExpirationDateGrp get(quickfix.fixlatest.component.LegOptionExerciseExpirationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseExpirationDateGrp getLegOptionExerciseExpirationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseExpirationDateGrp());
  }

  public void set(quickfix.field.NoLegOptionExerciseExpirationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseExpirationDates get(quickfix.field.NoLegOptionExerciseExpirationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseExpirationDates getNoLegOptionExerciseExpirationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseExpirationDates());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseExpirationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseExpirationDates() {
    return isSetField(41527);
  }

public static class NoLegOptionExerciseExpirationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41528, 41529, 0};

  public NoLegOptionExerciseExpirationDates() {
    super(41527, 41528, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDate get(quickfix.field.LegOptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDate getLegOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDate() {
    return isSetField(41528);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateType get(quickfix.field.LegOptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateType getLegOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateType() {
    return isSetField(41529);
  }
}

  public void set(quickfix.field.LegOptionExerciseExpirationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateRelativeTo get(quickfix.field.LegOptionExerciseExpirationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateRelativeTo getLegOptionExerciseExpirationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateRelativeTo() {
    return isSetField(41518);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateOffsetPeriod get(quickfix.field.LegOptionExerciseExpirationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateOffsetPeriod getLegOptionExerciseExpirationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateOffsetPeriod() {
    return isSetField(41519);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateOffsetUnit get(quickfix.field.LegOptionExerciseExpirationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateOffsetUnit getLegOptionExerciseExpirationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateOffsetUnit() {
    return isSetField(41520);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationFrequencyPeriod get(quickfix.field.LegOptionExerciseExpirationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationFrequencyPeriod getLegOptionExerciseExpirationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationFrequencyPeriod() {
    return isSetField(41521);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationFrequencyUnit get(quickfix.field.LegOptionExerciseExpirationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationFrequencyUnit getLegOptionExerciseExpirationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationFrequencyUnit() {
    return isSetField(41522);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationRollConvention get(quickfix.field.LegOptionExerciseExpirationRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationRollConvention getLegOptionExerciseExpirationRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationRollConvention());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationRollConvention() {
    return isSetField(41523);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationDateOffsetDayType get(quickfix.field.LegOptionExerciseExpirationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationDateOffsetDayType getLegOptionExerciseExpirationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationDateOffsetDayType() {
    return isSetField(41524);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationTime value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationTime get(quickfix.field.LegOptionExerciseExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationTime getLegOptionExerciseExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationTime());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationTime() {
    return isSetField(41525);
  }

  public void set(quickfix.field.LegOptionExerciseExpirationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseExpirationTimeBusinessCenter get(quickfix.field.LegOptionExerciseExpirationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseExpirationTimeBusinessCenter getLegOptionExerciseExpirationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseExpirationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseExpirationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseExpirationTimeBusinessCenter() {
    return isSetField(41526);
  }
}
