/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExerciseDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41493, 41494, 41495, 41496, 41497, 41498, 41499, 41500, 41501, 41502, 41503, 41504, 41505, 41506, 41507, 41508, 41509, 41510, 41511, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExerciseDates() {
    super();
  }

  public void set(quickfix.field.LegOptionExerciseBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseBusinessDayConvention get(quickfix.field.LegOptionExerciseBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseBusinessDayConvention getLegOptionExerciseBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseBusinessDayConvention() {
    return isSetField(41493);
  }

  public void set(quickfix.fixlatest.component.LegOptionExerciseBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseBusinessCenterGrp get(quickfix.fixlatest.component.LegOptionExerciseBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseBusinessCenterGrp getLegOptionExerciseBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseBusinessCenters get(quickfix.field.NoLegOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseBusinessCenters getNoLegOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseBusinessCenters() {
    return isSetField(41491);
  }

public static class NoLegOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41492, 0};

  public NoLegOptionExerciseBusinessCenters() {
    super(41491, 41492, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseBusinessCenter get(quickfix.field.LegOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseBusinessCenter getLegOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseBusinessCenter() {
    return isSetField(41492);
  }
}

  public void set(quickfix.fixlatest.component.LegOptionExerciseDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseDateGrp get(quickfix.fixlatest.component.LegOptionExerciseDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseDateGrp getLegOptionExerciseDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseDateGrp());
  }

  public void set(quickfix.field.NoLegOptionExerciseDates value) {
    setField(value);
  }

  public quickfix.field.NoLegOptionExerciseDates get(quickfix.field.NoLegOptionExerciseDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegOptionExerciseDates getNoLegOptionExerciseDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegOptionExerciseDates());
  }

  public boolean isSet(quickfix.field.NoLegOptionExerciseDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegOptionExerciseDates() {
    return isSetField(41512);
  }

public static class NoLegOptionExerciseDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41513, 41514, 0};

  public NoLegOptionExerciseDates() {
    super(41512, 41513, ORDER);
  }

  public void set(quickfix.field.LegOptionExerciseDate value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseDate get(quickfix.field.LegOptionExerciseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseDate getLegOptionExerciseDate() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseDate());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseDate() {
    return isSetField(41513);
  }

  public void set(quickfix.field.LegOptionExerciseDateType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseDateType get(quickfix.field.LegOptionExerciseDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseDateType getLegOptionExerciseDateType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseDateType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseDateType() {
    return isSetField(41514);
  }
}

  public void set(quickfix.field.LegOptionExerciseEarliestDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseEarliestDateOffsetDayType get(quickfix.field.LegOptionExerciseEarliestDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseEarliestDateOffsetDayType getLegOptionExerciseEarliestDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseEarliestDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseEarliestDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseEarliestDateOffsetDayType() {
    return isSetField(41494);
  }

  public void set(quickfix.field.LegOptionExerciseEarliestDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseEarliestDateOffsetPeriod get(quickfix.field.LegOptionExerciseEarliestDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseEarliestDateOffsetPeriod getLegOptionExerciseEarliestDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseEarliestDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseEarliestDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseEarliestDateOffsetPeriod() {
    return isSetField(41495);
  }

  public void set(quickfix.field.LegOptionExerciseEarliestDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseEarliestDateOffsetUnit get(quickfix.field.LegOptionExerciseEarliestDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseEarliestDateOffsetUnit getLegOptionExerciseEarliestDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseEarliestDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseEarliestDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseEarliestDateOffsetUnit() {
    return isSetField(41496);
  }

  public void set(quickfix.field.LegOptionExerciseFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseFrequencyPeriod get(quickfix.field.LegOptionExerciseFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseFrequencyPeriod getLegOptionExerciseFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseFrequencyPeriod() {
    return isSetField(41497);
  }

  public void set(quickfix.field.LegOptionExerciseFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseFrequencyUnit get(quickfix.field.LegOptionExerciseFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseFrequencyUnit getLegOptionExerciseFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseFrequencyUnit() {
    return isSetField(41498);
  }

  public void set(quickfix.field.LegOptionExerciseStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseStartDateUnadjusted get(quickfix.field.LegOptionExerciseStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseStartDateUnadjusted getLegOptionExerciseStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseStartDateUnadjusted() {
    return isSetField(41499);
  }

  public void set(quickfix.field.LegOptionExerciseStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseStartDateRelativeTo get(quickfix.field.LegOptionExerciseStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseStartDateRelativeTo getLegOptionExerciseStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseStartDateRelativeTo() {
    return isSetField(41500);
  }

  public void set(quickfix.field.LegOptionExerciseStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseStartDateOffsetPeriod get(quickfix.field.LegOptionExerciseStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseStartDateOffsetPeriod getLegOptionExerciseStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseStartDateOffsetPeriod() {
    return isSetField(41501);
  }

  public void set(quickfix.field.LegOptionExerciseStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseStartDateOffsetUnit get(quickfix.field.LegOptionExerciseStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseStartDateOffsetUnit getLegOptionExerciseStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseStartDateOffsetUnit() {
    return isSetField(41502);
  }

  public void set(quickfix.field.LegOptionExerciseStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseStartDateOffsetDayType get(quickfix.field.LegOptionExerciseStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseStartDateOffsetDayType getLegOptionExerciseStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseStartDateOffsetDayType() {
    return isSetField(41503);
  }

  public void set(quickfix.field.LegOptionExerciseStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseStartDateAdjusted get(quickfix.field.LegOptionExerciseStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseStartDateAdjusted getLegOptionExerciseStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseStartDateAdjusted() {
    return isSetField(41504);
  }

  public void set(quickfix.field.LegOptionExerciseSkip value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseSkip get(quickfix.field.LegOptionExerciseSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseSkip getLegOptionExerciseSkip() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseSkip());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseSkip field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseSkip() {
    return isSetField(41505);
  }

  public void set(quickfix.field.LegOptionExerciseNominationDeadline value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseNominationDeadline get(quickfix.field.LegOptionExerciseNominationDeadline value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseNominationDeadline getLegOptionExerciseNominationDeadline() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseNominationDeadline());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseNominationDeadline field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseNominationDeadline() {
    return isSetField(41506);
  }

  public void set(quickfix.field.LegOptionExerciseFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseFirstDateUnadjusted get(quickfix.field.LegOptionExerciseFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseFirstDateUnadjusted getLegOptionExerciseFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseFirstDateUnadjusted() {
    return isSetField(41507);
  }

  public void set(quickfix.field.LegOptionExerciseLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseLastDateUnadjusted get(quickfix.field.LegOptionExerciseLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseLastDateUnadjusted getLegOptionExerciseLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseLastDateUnadjusted() {
    return isSetField(41508);
  }

  public void set(quickfix.field.LegOptionExerciseEarliestTime value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseEarliestTime get(quickfix.field.LegOptionExerciseEarliestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseEarliestTime getLegOptionExerciseEarliestTime() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseEarliestTime());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseEarliestTime field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseEarliestTime() {
    return isSetField(41509);
  }

  public void set(quickfix.field.LegOptionExerciseLatestTime value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseLatestTime get(quickfix.field.LegOptionExerciseLatestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseLatestTime getLegOptionExerciseLatestTime() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseLatestTime());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseLatestTime field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseLatestTime() {
    return isSetField(41510);
  }

  public void set(quickfix.field.LegOptionExerciseTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegOptionExerciseTimeBusinessCenter get(quickfix.field.LegOptionExerciseTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionExerciseTimeBusinessCenter getLegOptionExerciseTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegOptionExerciseTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegOptionExerciseTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionExerciseTimeBusinessCenter() {
    return isSetField(41511);
  }
}
