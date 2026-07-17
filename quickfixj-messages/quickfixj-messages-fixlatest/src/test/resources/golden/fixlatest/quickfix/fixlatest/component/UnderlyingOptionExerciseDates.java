/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExerciseDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41822, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExerciseDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingOptionExerciseBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessDayConvention get(quickfix.field.UnderlyingOptionExerciseBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessDayConvention getUnderlyingOptionExerciseBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseBusinessDayConvention() {
    return isSetField(41822);
  }

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingOptionExerciseBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseBusinessCenterGrp getUnderlyingOptionExerciseBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseBusinessCenters get(quickfix.field.NoUnderlyingOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseBusinessCenters getNoUnderlyingOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseBusinessCenters() {
    return isSetField(41820);
  }

public static class NoUnderlyingOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41821, 0};

  public NoUnderlyingOptionExerciseBusinessCenters() {
    super(41820, 41821, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessCenter get(quickfix.field.UnderlyingOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseBusinessCenter getUnderlyingOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseBusinessCenter() {
    return isSetField(41821);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseDateGrp get(quickfix.fixlatest.component.UnderlyingOptionExerciseDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseDateGrp getUnderlyingOptionExerciseDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingOptionExerciseDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingOptionExerciseDates get(quickfix.field.NoUnderlyingOptionExerciseDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingOptionExerciseDates getNoUnderlyingOptionExerciseDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingOptionExerciseDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingOptionExerciseDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingOptionExerciseDates() {
    return isSetField(41841);
  }

public static class NoUnderlyingOptionExerciseDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41842, 41843, 0};

  public NoUnderlyingOptionExerciseDates() {
    super(41841, 41842, ORDER);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseDate get(quickfix.field.UnderlyingOptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseDate getUnderlyingOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseDate());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseDate() {
    return isSetField(41842);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseDateType get(quickfix.field.UnderlyingOptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseDateType getUnderlyingOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseDateType() {
    return isSetField(41843);
  }
}

  public void set(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetDayType get(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetDayType getUnderlyingOptionExerciseEarliestDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseEarliestDateOffsetDayType() {
    return isSetField(41823);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetPeriod get(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetPeriod getUnderlyingOptionExerciseEarliestDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseEarliestDateOffsetPeriod() {
    return isSetField(41824);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetUnit get(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetUnit getUnderlyingOptionExerciseEarliestDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseEarliestDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseEarliestDateOffsetUnit() {
    return isSetField(41825);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseFrequencyPeriod get(quickfix.field.UnderlyingOptionExerciseFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseFrequencyPeriod getUnderlyingOptionExerciseFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseFrequencyPeriod() {
    return isSetField(41826);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseFrequencyUnit get(quickfix.field.UnderlyingOptionExerciseFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseFrequencyUnit getUnderlyingOptionExerciseFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseFrequencyUnit() {
    return isSetField(41827);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateUnadjusted get(quickfix.field.UnderlyingOptionExerciseStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateUnadjusted getUnderlyingOptionExerciseStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseStartDateUnadjusted() {
    return isSetField(41828);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateRelativeTo get(quickfix.field.UnderlyingOptionExerciseStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateRelativeTo getUnderlyingOptionExerciseStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseStartDateRelativeTo() {
    return isSetField(41829);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateOffsetPeriod get(quickfix.field.UnderlyingOptionExerciseStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateOffsetPeriod getUnderlyingOptionExerciseStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseStartDateOffsetPeriod() {
    return isSetField(41830);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateOffsetUnit get(quickfix.field.UnderlyingOptionExerciseStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateOffsetUnit getUnderlyingOptionExerciseStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseStartDateOffsetUnit() {
    return isSetField(41831);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateOffsetDayType get(quickfix.field.UnderlyingOptionExerciseStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateOffsetDayType getUnderlyingOptionExerciseStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseStartDateOffsetDayType() {
    return isSetField(41832);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateAdjusted get(quickfix.field.UnderlyingOptionExerciseStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseStartDateAdjusted getUnderlyingOptionExerciseStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseStartDateAdjusted() {
    return isSetField(41833);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseSkip value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseSkip get(quickfix.field.UnderlyingOptionExerciseSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseSkip getUnderlyingOptionExerciseSkip() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseSkip());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseSkip field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseSkip() {
    return isSetField(41834);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseNominationDeadline value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseNominationDeadline get(quickfix.field.UnderlyingOptionExerciseNominationDeadline value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseNominationDeadline getUnderlyingOptionExerciseNominationDeadline() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseNominationDeadline());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseNominationDeadline field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseNominationDeadline() {
    return isSetField(41835);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseFirstDateUnadjusted get(quickfix.field.UnderlyingOptionExerciseFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseFirstDateUnadjusted getUnderlyingOptionExerciseFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseFirstDateUnadjusted() {
    return isSetField(41836);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseLastDateUnadjusted get(quickfix.field.UnderlyingOptionExerciseLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseLastDateUnadjusted getUnderlyingOptionExerciseLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseLastDateUnadjusted() {
    return isSetField(41837);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseEarliestTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestTime get(quickfix.field.UnderlyingOptionExerciseEarliestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseEarliestTime getUnderlyingOptionExerciseEarliestTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseEarliestTime());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseEarliestTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseEarliestTime() {
    return isSetField(41838);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseLatestTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseLatestTime get(quickfix.field.UnderlyingOptionExerciseLatestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseLatestTime getUnderlyingOptionExerciseLatestTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseLatestTime());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseLatestTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseLatestTime() {
    return isSetField(41839);
  }

  public void set(quickfix.field.UnderlyingOptionExerciseTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionExerciseTimeBusinessCenter get(quickfix.field.UnderlyingOptionExerciseTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionExerciseTimeBusinessCenter getUnderlyingOptionExerciseTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionExerciseTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionExerciseTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionExerciseTimeBusinessCenter() {
    return isSetField(41840);
  }
}
