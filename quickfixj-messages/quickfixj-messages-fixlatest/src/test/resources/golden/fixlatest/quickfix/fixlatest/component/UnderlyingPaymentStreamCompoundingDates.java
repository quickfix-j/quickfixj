/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamCompoundingDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42904, 42905, 42906, 42907, 42908, 42909, 42910, 42911, 42912, 42913, 42914, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamCompoundingDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessDayConvention getUnderlyingPaymentStreamCompoundingDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesBusinessDayConvention() {
    return isSetField(42904);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp getUnderlyingPaymentStreamCompoundingDatesBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDatesBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters getNoUnderlyingPaymentStreamCompoundingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamCompoundingDatesBusinessCenters() {
    return isSetField(42915);
  }

public static class NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42916, 0};

  public NoUnderlyingPaymentStreamCompoundingDatesBusinessCenters() {
    super(42915, 42916, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter getUnderlyingPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42916);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDateGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDateGrp getUnderlyingPaymentStreamCompoundingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamCompoundingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDates get(quickfix.field.NoUnderlyingPaymentStreamCompoundingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamCompoundingDates getNoUnderlyingPaymentStreamCompoundingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamCompoundingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamCompoundingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamCompoundingDates() {
    return isSetField(42901);
  }

public static class NoUnderlyingPaymentStreamCompoundingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42902, 42903, 0};

  public NoUnderlyingPaymentStreamCompoundingDates() {
    super(42901, 42902, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDate get(quickfix.field.UnderlyingPaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDate getUnderlyingPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDate() {
    return isSetField(42902);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDateType get(quickfix.field.UnderlyingPaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDateType getUnderlyingPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDateType() {
    return isSetField(42903);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesRelativeTo get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesRelativeTo getUnderlyingPaymentStreamCompoundingDatesRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesRelativeTo() {
    return isSetField(42905);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetPeriod getUnderlyingPaymentStreamCompoundingDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesOffsetPeriod() {
    return isSetField(42906);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetUnit get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetUnit getUnderlyingPaymentStreamCompoundingDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesOffsetUnit() {
    return isSetField(42907);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetDayType get(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetDayType getUnderlyingPaymentStreamCompoundingDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingDatesOffsetDayType() {
    return isSetField(42908);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingPeriodSkip value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingPeriodSkip get(quickfix.field.UnderlyingPaymentStreamCompoundingPeriodSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingPeriodSkip getUnderlyingPaymentStreamCompoundingPeriodSkip() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingPeriodSkip());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingPeriodSkip field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingPeriodSkip() {
    return isSetField(42909);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingStartDate get(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingStartDate getUnderlyingPaymentStreamCompoundingStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingStartDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingEndDate get(quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingEndDate getUnderlyingPaymentStreamCompoundingEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamCompoundingEndDate());
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyPeriod get(quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyPeriod getUnderlyingPaymentStreamCompoundingFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingFrequencyPeriod() {
    return isSetField(42910);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyUnit get(quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyUnit getUnderlyingPaymentStreamCompoundingFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingFrequencyUnit() {
    return isSetField(42911);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamCompoundingRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingRollConvention get(quickfix.field.UnderlyingPaymentStreamCompoundingRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamCompoundingRollConvention getUnderlyingPaymentStreamCompoundingRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamCompoundingRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamCompoundingRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamCompoundingRollConvention() {
    return isSetField(42912);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamBoundsFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamBoundsFirstDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamBoundsFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamBoundsFirstDateUnadjusted getUnderlyingPaymentStreamBoundsFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamBoundsFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamBoundsFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamBoundsFirstDateUnadjusted() {
    return isSetField(42913);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamBoundsLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamBoundsLastDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamBoundsLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamBoundsLastDateUnadjusted getUnderlyingPaymentStreamBoundsLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamBoundsLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamBoundsLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamBoundsLastDateUnadjusted() {
    return isSetField(42914);
  }
}
