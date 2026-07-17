/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionExerciseDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40476, 40478, 40479, 40480, 40481, 40482, 40483, 40484, 40485, 40486, 40487, 40488, 40489, 40490, 40491, 40492, 40493, 40494, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionExerciseDates() {
    super();
  }

  public void set(quickfix.field.LegProvisionOptionExerciseBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessDayConvention get(quickfix.field.LegProvisionOptionExerciseBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessDayConvention getLegProvisionOptionExerciseBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseBusinessDayConvention() {
    return isSetField(40476);
  }

  public void set(quickfix.fixlatest.component.LegProvisionOptionExerciseBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseBusinessCenterGrp get(quickfix.fixlatest.component.LegProvisionOptionExerciseBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseBusinessCenterGrp getLegProvisionOptionExerciseBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExerciseBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegProvisionOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionExerciseBusinessCenters get(quickfix.field.NoLegProvisionOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionExerciseBusinessCenters getNoLegProvisionOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionExerciseBusinessCenters() {
    return isSetField(40936);
  }

public static class NoLegProvisionOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40477, 0};

  public NoLegProvisionOptionExerciseBusinessCenters() {
    super(40936, 40477, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessCenter get(quickfix.field.LegProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseBusinessCenter getLegProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseBusinessCenter() {
    return isSetField(40477);
  }
}

  public void set(quickfix.fixlatest.component.LegProvisionOptionExerciseFixedDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseFixedDateGrp get(quickfix.fixlatest.component.LegProvisionOptionExerciseFixedDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProvisionOptionExerciseFixedDateGrp getLegProvisionOptionExerciseFixedDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProvisionOptionExerciseFixedDateGrp());
  }

  public void set(quickfix.field.NoLegProvisionOptionExerciseFixedDates value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionExerciseFixedDates get(quickfix.field.NoLegProvisionOptionExerciseFixedDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionExerciseFixedDates getNoLegProvisionOptionExerciseFixedDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionExerciseFixedDates());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionExerciseFixedDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionExerciseFixedDates() {
    return isSetField(40495);
  }

public static class NoLegProvisionOptionExerciseFixedDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40496, 40497, 0};

  public NoLegProvisionOptionExerciseFixedDates() {
    super(40495, 40496, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDate get(quickfix.field.LegProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDate getLegProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFixedDate() {
    return isSetField(40496);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDateType get(quickfix.field.LegProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFixedDateType getLegProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFixedDateType() {
    return isSetField(40497);
  }
}

  public void set(quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetPeriod get(quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetPeriod getLegProvisionOptionExerciseEarliestDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseEarliestDateOffsetPeriod() {
    return isSetField(40478);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetUnit get(quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetUnit getLegProvisionOptionExerciseEarliestDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseEarliestDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseEarliestDateOffsetUnit() {
    return isSetField(40479);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFrequencyPeriod get(quickfix.field.LegProvisionOptionExerciseFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFrequencyPeriod getLegProvisionOptionExerciseFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFrequencyPeriod() {
    return isSetField(40480);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseFrequencyUnit get(quickfix.field.LegProvisionOptionExerciseFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseFrequencyUnit getLegProvisionOptionExerciseFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseFrequencyUnit() {
    return isSetField(40481);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateUnadjusted get(quickfix.field.LegProvisionOptionExerciseStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateUnadjusted getLegProvisionOptionExerciseStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStartDateUnadjusted() {
    return isSetField(40482);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateRelativeTo get(quickfix.field.LegProvisionOptionExerciseStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateRelativeTo getLegProvisionOptionExerciseStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStartDateRelativeTo() {
    return isSetField(40483);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateOffsetPeriod get(quickfix.field.LegProvisionOptionExerciseStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateOffsetPeriod getLegProvisionOptionExerciseStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStartDateOffsetPeriod() {
    return isSetField(40484);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateOffsetUnit get(quickfix.field.LegProvisionOptionExerciseStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateOffsetUnit getLegProvisionOptionExerciseStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStartDateOffsetUnit() {
    return isSetField(40485);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateOffsetDayType get(quickfix.field.LegProvisionOptionExerciseStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateOffsetDayType getLegProvisionOptionExerciseStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStartDateOffsetDayType() {
    return isSetField(40486);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateAdjusted get(quickfix.field.LegProvisionOptionExerciseStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseStartDateAdjusted getLegProvisionOptionExerciseStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseStartDateAdjusted() {
    return isSetField(40487);
  }

  public void set(quickfix.field.LegProvisionOptionExercisePeriodSkip value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExercisePeriodSkip get(quickfix.field.LegProvisionOptionExercisePeriodSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExercisePeriodSkip getLegProvisionOptionExercisePeriodSkip() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExercisePeriodSkip());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExercisePeriodSkip field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExercisePeriodSkip() {
    return isSetField(40488);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseBoundsFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseBoundsFirstDateUnadjusted get(quickfix.field.LegProvisionOptionExerciseBoundsFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseBoundsFirstDateUnadjusted getLegProvisionOptionExerciseBoundsFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseBoundsFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseBoundsFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseBoundsFirstDateUnadjusted() {
    return isSetField(40489);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseBoundsLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseBoundsLastDateUnadjusted get(quickfix.field.LegProvisionOptionExerciseBoundsLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseBoundsLastDateUnadjusted getLegProvisionOptionExerciseBoundsLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseBoundsLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseBoundsLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseBoundsLastDateUnadjusted() {
    return isSetField(40490);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseEarliestTime value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestTime get(quickfix.field.LegProvisionOptionExerciseEarliestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestTime getLegProvisionOptionExerciseEarliestTime() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseEarliestTime());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseEarliestTime field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseEarliestTime() {
    return isSetField(40491);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseEarliestTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestTimeBusinessCenter get(quickfix.field.LegProvisionOptionExerciseEarliestTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseEarliestTimeBusinessCenter getLegProvisionOptionExerciseEarliestTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseEarliestTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseEarliestTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseEarliestTimeBusinessCenter() {
    return isSetField(40492);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseLatestTime value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseLatestTime get(quickfix.field.LegProvisionOptionExerciseLatestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseLatestTime getLegProvisionOptionExerciseLatestTime() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseLatestTime());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseLatestTime field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseLatestTime() {
    return isSetField(40493);
  }

  public void set(quickfix.field.LegProvisionOptionExerciseLatestTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExerciseLatestTimeBusinessCenter get(quickfix.field.LegProvisionOptionExerciseLatestTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExerciseLatestTimeBusinessCenter getLegProvisionOptionExerciseLatestTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExerciseLatestTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExerciseLatestTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExerciseLatestTimeBusinessCenter() {
    return isSetField(40494);
  }
}
