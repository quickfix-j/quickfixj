/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41118, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseDates() {
    super();
  }

  public void set(quickfix.field.OptionExerciseBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseBusinessDayConvention get(quickfix.field.OptionExerciseBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseBusinessDayConvention getOptionExerciseBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.OptionExerciseBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseBusinessDayConvention() {
    return isSetField(41118);
  }

  public void set(quickfix.fixlatest.component.OptionExerciseBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseBusinessCenterGrp get(quickfix.fixlatest.component.OptionExerciseBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseBusinessCenterGrp getOptionExerciseBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseBusinessCenterGrp());
  }

  public void set(quickfix.field.NoOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseBusinessCenters get(quickfix.field.NoOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseBusinessCenters getNoOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseBusinessCenters() {
    return isSetField(41116);
  }

public static class NoOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41117, 0};

  public NoOptionExerciseBusinessCenters() {
    super(41116, 41117, ORDER);
  }

  public void set(quickfix.field.OptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseBusinessCenter get(quickfix.field.OptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseBusinessCenter getOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseBusinessCenter() {
    return isSetField(41117);
  }
}

  public void set(quickfix.fixlatest.component.OptionExerciseDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseDateGrp get(quickfix.fixlatest.component.OptionExerciseDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseDateGrp getOptionExerciseDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseDateGrp());
  }

  public void set(quickfix.field.NoOptionExerciseDates value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseDates get(quickfix.field.NoOptionExerciseDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseDates getNoOptionExerciseDates() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseDates());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseDates field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseDates() {
    return isSetField(41137);
  }

public static class NoOptionExerciseDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41138, 41139, 0};

  public NoOptionExerciseDates() {
    super(41137, 41138, ORDER);
  }

  public void set(quickfix.field.OptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseDate get(quickfix.field.OptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseDate getOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseDate());
  }

  public boolean isSet(quickfix.field.OptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseDate() {
    return isSetField(41138);
  }

  public void set(quickfix.field.OptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseDateType get(quickfix.field.OptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseDateType getOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.OptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseDateType() {
    return isSetField(41139);
  }
}

  public void set(quickfix.field.OptionExerciseEarliestDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseEarliestDateOffsetDayType get(quickfix.field.OptionExerciseEarliestDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseEarliestDateOffsetDayType getOptionExerciseEarliestDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseEarliestDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.OptionExerciseEarliestDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseEarliestDateOffsetDayType() {
    return isSetField(41119);
  }

  public void set(quickfix.field.OptionExerciseEarliestDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseEarliestDateOffsetPeriod get(quickfix.field.OptionExerciseEarliestDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseEarliestDateOffsetPeriod getOptionExerciseEarliestDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseEarliestDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.OptionExerciseEarliestDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseEarliestDateOffsetPeriod() {
    return isSetField(41120);
  }

  public void set(quickfix.field.OptionExerciseEarliestDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseEarliestDateOffsetUnit get(quickfix.field.OptionExerciseEarliestDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseEarliestDateOffsetUnit getOptionExerciseEarliestDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseEarliestDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.OptionExerciseEarliestDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseEarliestDateOffsetUnit() {
    return isSetField(41121);
  }

  public void set(quickfix.field.OptionExerciseFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseFrequencyPeriod get(quickfix.field.OptionExerciseFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseFrequencyPeriod getOptionExerciseFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.OptionExerciseFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseFrequencyPeriod() {
    return isSetField(41122);
  }

  public void set(quickfix.field.OptionExerciseFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseFrequencyUnit get(quickfix.field.OptionExerciseFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseFrequencyUnit getOptionExerciseFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseFrequencyUnit());
  }

  public boolean isSet(quickfix.field.OptionExerciseFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseFrequencyUnit() {
    return isSetField(41123);
  }

  public void set(quickfix.field.OptionExerciseStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseStartDateUnadjusted get(quickfix.field.OptionExerciseStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseStartDateUnadjusted getOptionExerciseStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.OptionExerciseStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseStartDateUnadjusted() {
    return isSetField(41124);
  }

  public void set(quickfix.field.OptionExerciseStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseStartDateRelativeTo get(quickfix.field.OptionExerciseStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseStartDateRelativeTo getOptionExerciseStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.OptionExerciseStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseStartDateRelativeTo() {
    return isSetField(41125);
  }

  public void set(quickfix.field.OptionExerciseStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseStartDateOffsetPeriod get(quickfix.field.OptionExerciseStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseStartDateOffsetPeriod getOptionExerciseStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.OptionExerciseStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseStartDateOffsetPeriod() {
    return isSetField(41126);
  }

  public void set(quickfix.field.OptionExerciseStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseStartDateOffsetUnit get(quickfix.field.OptionExerciseStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseStartDateOffsetUnit getOptionExerciseStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.OptionExerciseStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseStartDateOffsetUnit() {
    return isSetField(41127);
  }

  public void set(quickfix.field.OptionExerciseStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseStartDateOffsetDayType get(quickfix.field.OptionExerciseStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseStartDateOffsetDayType getOptionExerciseStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.OptionExerciseStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseStartDateOffsetDayType() {
    return isSetField(41128);
  }

  public void set(quickfix.field.OptionExerciseStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseStartDateAdjusted get(quickfix.field.OptionExerciseStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseStartDateAdjusted getOptionExerciseStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.OptionExerciseStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseStartDateAdjusted() {
    return isSetField(41129);
  }

  public void set(quickfix.field.OptionExerciseSkip value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseSkip get(quickfix.field.OptionExerciseSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseSkip getOptionExerciseSkip() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseSkip());
  }

  public boolean isSet(quickfix.field.OptionExerciseSkip field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseSkip() {
    return isSetField(41130);
  }

  public void set(quickfix.field.OptionExerciseNominationDeadline value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseNominationDeadline get(quickfix.field.OptionExerciseNominationDeadline value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseNominationDeadline getOptionExerciseNominationDeadline() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseNominationDeadline());
  }

  public boolean isSet(quickfix.field.OptionExerciseNominationDeadline field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseNominationDeadline() {
    return isSetField(41131);
  }

  public void set(quickfix.field.OptionExerciseFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseFirstDateUnadjusted get(quickfix.field.OptionExerciseFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseFirstDateUnadjusted getOptionExerciseFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.OptionExerciseFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseFirstDateUnadjusted() {
    return isSetField(41132);
  }

  public void set(quickfix.field.OptionExerciseLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseLastDateUnadjusted get(quickfix.field.OptionExerciseLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseLastDateUnadjusted getOptionExerciseLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.OptionExerciseLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseLastDateUnadjusted() {
    return isSetField(41133);
  }

  public void set(quickfix.field.OptionExerciseEarliestTime value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseEarliestTime get(quickfix.field.OptionExerciseEarliestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseEarliestTime getOptionExerciseEarliestTime() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseEarliestTime());
  }

  public boolean isSet(quickfix.field.OptionExerciseEarliestTime field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseEarliestTime() {
    return isSetField(41134);
  }

  public void set(quickfix.field.OptionExerciseLatestTime value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseLatestTime get(quickfix.field.OptionExerciseLatestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseLatestTime getOptionExerciseLatestTime() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseLatestTime());
  }

  public boolean isSet(quickfix.field.OptionExerciseLatestTime field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseLatestTime() {
    return isSetField(41135);
  }

  public void set(quickfix.field.OptionExerciseTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseTimeBusinessCenter get(quickfix.field.OptionExerciseTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseTimeBusinessCenter getOptionExerciseTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseTimeBusinessCenter() {
    return isSetField(41136);
  }
}
