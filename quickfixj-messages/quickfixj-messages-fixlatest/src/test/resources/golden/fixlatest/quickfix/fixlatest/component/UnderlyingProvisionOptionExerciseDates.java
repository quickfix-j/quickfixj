/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionExerciseDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42115, 42116, 42117, 42118, 42119, 42120, 42121, 42122, 42123, 42124, 42125, 42126, 42127, 42128, 42129, 42130, 42131, 42132, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionExerciseDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessDayConvention get(quickfix.field.UnderlyingProvisionOptionExerciseBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessDayConvention getUnderlyingProvisionOptionExerciseBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseBusinessDayConvention() {
    return isSetField(42115);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseBusinessCenterGrp getUnderlyingProvisionOptionExerciseBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters get(quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters getNoUnderlyingProvisionOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionExerciseBusinessCenters() {
    return isSetField(42184);
  }

public static class NoUnderlyingProvisionOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42185, 0};

  public NoUnderlyingProvisionOptionExerciseBusinessCenters() {
    super(42184, 42185, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter getUnderlyingProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseBusinessCenter() {
    return isSetField(42185);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseFixedDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseFixedDateGrp get(quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseFixedDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseFixedDateGrp getUnderlyingProvisionOptionExerciseFixedDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProvisionOptionExerciseFixedDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates get(quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates getNoUnderlyingProvisionOptionExerciseFixedDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionExerciseFixedDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionExerciseFixedDates() {
    return isSetField(42112);
  }

public static class NoUnderlyingProvisionOptionExerciseFixedDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42113, 42114, 0};

  public NoUnderlyingProvisionOptionExerciseFixedDates() {
    super(42112, 42113, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDate get(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDate getUnderlyingProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFixedDate() {
    return isSetField(42113);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType get(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType getUnderlyingProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFixedDateType() {
    return isSetField(42114);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod get(quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod getUnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseEarliestDateOffsetPeriod() {
    return isSetField(42116);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetUnit get(quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetUnit getUnderlyingProvisionOptionExerciseEarliestDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseEarliestDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseEarliestDateOffsetUnit() {
    return isSetField(42117);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFrequencyPeriod get(quickfix.field.UnderlyingProvisionOptionExerciseFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFrequencyPeriod getUnderlyingProvisionOptionExerciseFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFrequencyPeriod() {
    return isSetField(42118);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFrequencyUnit get(quickfix.field.UnderlyingProvisionOptionExerciseFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseFrequencyUnit getUnderlyingProvisionOptionExerciseFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseFrequencyUnit() {
    return isSetField(42119);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateUnadjusted get(quickfix.field.UnderlyingProvisionOptionExerciseStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateUnadjusted getUnderlyingProvisionOptionExerciseStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStartDateUnadjusted() {
    return isSetField(42120);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateRelativeTo get(quickfix.field.UnderlyingProvisionOptionExerciseStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateRelativeTo getUnderlyingProvisionOptionExerciseStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStartDateRelativeTo() {
    return isSetField(42121);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetPeriod get(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetPeriod getUnderlyingProvisionOptionExerciseStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStartDateOffsetPeriod() {
    return isSetField(42122);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetUnit get(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetUnit getUnderlyingProvisionOptionExerciseStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStartDateOffsetUnit() {
    return isSetField(42123);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetDayType get(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetDayType getUnderlyingProvisionOptionExerciseStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStartDateOffsetDayType() {
    return isSetField(42124);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateAdjusted get(quickfix.field.UnderlyingProvisionOptionExerciseStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseStartDateAdjusted getUnderlyingProvisionOptionExerciseStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseStartDateAdjusted() {
    return isSetField(42125);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExercisePeriodSkip value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExercisePeriodSkip get(quickfix.field.UnderlyingProvisionOptionExercisePeriodSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExercisePeriodSkip getUnderlyingProvisionOptionExercisePeriodSkip() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExercisePeriodSkip());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExercisePeriodSkip field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExercisePeriodSkip() {
    return isSetField(42126);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted get(quickfix.field.UnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted getUnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseBoundsFirstDateUnadjusted() {
    return isSetField(42127);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted get(quickfix.field.UnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted getUnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseBoundsLastDateUnadjusted() {
    return isSetField(42128);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseEarliestTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestTime get(quickfix.field.UnderlyingProvisionOptionExerciseEarliestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestTime getUnderlyingProvisionOptionExerciseEarliestTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseEarliestTime());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseEarliestTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseEarliestTime() {
    return isSetField(42129);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter getUnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseEarliestTimeBusinessCenter() {
    return isSetField(42130);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseLatestTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseLatestTime get(quickfix.field.UnderlyingProvisionOptionExerciseLatestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseLatestTime getUnderlyingProvisionOptionExerciseLatestTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseLatestTime());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseLatestTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseLatestTime() {
    return isSetField(42131);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExerciseLatestTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseLatestTimeBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExerciseLatestTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExerciseLatestTimeBusinessCenter getUnderlyingProvisionOptionExerciseLatestTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExerciseLatestTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExerciseLatestTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExerciseLatestTimeBusinessCenter() {
    return isSetField(42132);
  }
}
