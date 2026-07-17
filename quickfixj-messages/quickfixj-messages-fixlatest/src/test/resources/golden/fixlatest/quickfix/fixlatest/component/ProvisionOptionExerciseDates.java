/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionExerciseDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40123, 40125, 40126, 40127, 40128, 40129, 40130, 40131, 40132, 40133, 40134, 40135, 40136, 40137, 40138, 40139, 40140, 40141, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionExerciseDates() {
    super();
  }

  public void set(quickfix.field.ProvisionOptionExerciseBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseBusinessDayConvention get(quickfix.field.ProvisionOptionExerciseBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseBusinessDayConvention getProvisionOptionExerciseBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseBusinessDayConvention() {
    return isSetField(40123);
  }

  public void set(quickfix.fixlatest.component.ProvisionOptionExerciseBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseBusinessCenterGrp get(quickfix.fixlatest.component.ProvisionOptionExerciseBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseBusinessCenterGrp getProvisionOptionExerciseBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExerciseBusinessCenterGrp());
  }

  public void set(quickfix.field.NoProvisionOptionExerciseBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionExerciseBusinessCenters get(quickfix.field.NoProvisionOptionExerciseBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionExerciseBusinessCenters getNoProvisionOptionExerciseBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionExerciseBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionExerciseBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionExerciseBusinessCenters() {
    return isSetField(40954);
  }

public static class NoProvisionOptionExerciseBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40124, 0};

  public NoProvisionOptionExerciseBusinessCenters() {
    super(40954, 40124, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionExerciseBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseBusinessCenter get(quickfix.field.ProvisionOptionExerciseBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseBusinessCenter getProvisionOptionExerciseBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseBusinessCenter() {
    return isSetField(40124);
  }
}

  public void set(quickfix.fixlatest.component.ProvisionOptionExerciseFixedDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseFixedDateGrp get(quickfix.fixlatest.component.ProvisionOptionExerciseFixedDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProvisionOptionExerciseFixedDateGrp getProvisionOptionExerciseFixedDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProvisionOptionExerciseFixedDateGrp());
  }

  public void set(quickfix.field.NoProvisionOptionExerciseFixedDates value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionExerciseFixedDates get(quickfix.field.NoProvisionOptionExerciseFixedDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionExerciseFixedDates getNoProvisionOptionExerciseFixedDates() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionExerciseFixedDates());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionExerciseFixedDates field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionExerciseFixedDates() {
    return isSetField(40142);
  }

public static class NoProvisionOptionExerciseFixedDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40143, 40144, 0};

  public NoProvisionOptionExerciseFixedDates() {
    super(40142, 40143, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFixedDate value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFixedDate get(quickfix.field.ProvisionOptionExerciseFixedDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFixedDate getProvisionOptionExerciseFixedDate() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFixedDate());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFixedDate field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFixedDate() {
    return isSetField(40143);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFixedDateType value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFixedDateType get(quickfix.field.ProvisionOptionExerciseFixedDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFixedDateType getProvisionOptionExerciseFixedDateType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFixedDateType());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFixedDateType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFixedDateType() {
    return isSetField(40144);
  }
}

  public void set(quickfix.field.ProvisionOptionExerciseEarliestDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseEarliestDateOffsetPeriod get(quickfix.field.ProvisionOptionExerciseEarliestDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseEarliestDateOffsetPeriod getProvisionOptionExerciseEarliestDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseEarliestDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseEarliestDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseEarliestDateOffsetPeriod() {
    return isSetField(40125);
  }

  public void set(quickfix.field.ProvisionOptionExerciseEarliestDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseEarliestDateOffsetUnit get(quickfix.field.ProvisionOptionExerciseEarliestDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseEarliestDateOffsetUnit getProvisionOptionExerciseEarliestDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseEarliestDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseEarliestDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseEarliestDateOffsetUnit() {
    return isSetField(40126);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFrequencyPeriod get(quickfix.field.ProvisionOptionExerciseFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFrequencyPeriod getProvisionOptionExerciseFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFrequencyPeriod() {
    return isSetField(40127);
  }

  public void set(quickfix.field.ProvisionOptionExerciseFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseFrequencyUnit get(quickfix.field.ProvisionOptionExerciseFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseFrequencyUnit getProvisionOptionExerciseFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseFrequencyUnit() {
    return isSetField(40128);
  }

  public void set(quickfix.field.ProvisionOptionExerciseStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStartDateUnadjusted get(quickfix.field.ProvisionOptionExerciseStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStartDateUnadjusted getProvisionOptionExerciseStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStartDateUnadjusted() {
    return isSetField(40129);
  }

  public void set(quickfix.field.ProvisionOptionExerciseStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStartDateRelativeTo get(quickfix.field.ProvisionOptionExerciseStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStartDateRelativeTo getProvisionOptionExerciseStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStartDateRelativeTo() {
    return isSetField(40130);
  }

  public void set(quickfix.field.ProvisionOptionExerciseStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStartDateOffsetPeriod get(quickfix.field.ProvisionOptionExerciseStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStartDateOffsetPeriod getProvisionOptionExerciseStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStartDateOffsetPeriod() {
    return isSetField(40131);
  }

  public void set(quickfix.field.ProvisionOptionExerciseStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStartDateOffsetUnit get(quickfix.field.ProvisionOptionExerciseStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStartDateOffsetUnit getProvisionOptionExerciseStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStartDateOffsetUnit() {
    return isSetField(40132);
  }

  public void set(quickfix.field.ProvisionOptionExerciseStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStartDateOffsetDayType get(quickfix.field.ProvisionOptionExerciseStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStartDateOffsetDayType getProvisionOptionExerciseStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStartDateOffsetDayType() {
    return isSetField(40133);
  }

  public void set(quickfix.field.ProvisionOptionExerciseStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseStartDateAdjusted get(quickfix.field.ProvisionOptionExerciseStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseStartDateAdjusted getProvisionOptionExerciseStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseStartDateAdjusted() {
    return isSetField(40134);
  }

  public void set(quickfix.field.ProvisionOptionExercisePeriodSkip value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExercisePeriodSkip get(quickfix.field.ProvisionOptionExercisePeriodSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExercisePeriodSkip getProvisionOptionExercisePeriodSkip() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExercisePeriodSkip());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExercisePeriodSkip field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExercisePeriodSkip() {
    return isSetField(40135);
  }

  public void set(quickfix.field.ProvisionOptionExerciseBoundsFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseBoundsFirstDateUnadjusted get(quickfix.field.ProvisionOptionExerciseBoundsFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseBoundsFirstDateUnadjusted getProvisionOptionExerciseBoundsFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseBoundsFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseBoundsFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseBoundsFirstDateUnadjusted() {
    return isSetField(40136);
  }

  public void set(quickfix.field.ProvisionOptionExerciseBoundsLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseBoundsLastDateUnadjusted get(quickfix.field.ProvisionOptionExerciseBoundsLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseBoundsLastDateUnadjusted getProvisionOptionExerciseBoundsLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseBoundsLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseBoundsLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseBoundsLastDateUnadjusted() {
    return isSetField(40137);
  }

  public void set(quickfix.field.ProvisionOptionExerciseEarliestTime value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseEarliestTime get(quickfix.field.ProvisionOptionExerciseEarliestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseEarliestTime getProvisionOptionExerciseEarliestTime() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseEarliestTime());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseEarliestTime field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseEarliestTime() {
    return isSetField(40138);
  }

  public void set(quickfix.field.ProvisionOptionExerciseEarliestTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseEarliestTimeBusinessCenter get(quickfix.field.ProvisionOptionExerciseEarliestTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseEarliestTimeBusinessCenter getProvisionOptionExerciseEarliestTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseEarliestTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseEarliestTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseEarliestTimeBusinessCenter() {
    return isSetField(40139);
  }

  public void set(quickfix.field.ProvisionOptionExerciseLatestTime value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseLatestTime get(quickfix.field.ProvisionOptionExerciseLatestTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseLatestTime getProvisionOptionExerciseLatestTime() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseLatestTime());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseLatestTime field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseLatestTime() {
    return isSetField(40140);
  }

  public void set(quickfix.field.ProvisionOptionExerciseLatestTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExerciseLatestTimeBusinessCenter get(quickfix.field.ProvisionOptionExerciseLatestTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExerciseLatestTimeBusinessCenter getProvisionOptionExerciseLatestTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExerciseLatestTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExerciseLatestTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExerciseLatestTimeBusinessCenter() {
    return isSetField(40141);
  }
}
