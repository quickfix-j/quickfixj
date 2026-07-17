/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRateDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43008, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRateDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateDates get(quickfix.field.NoUnderlyingReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateDates getNoUnderlyingReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateDates() {
    return isSetField(43008);
  }

public static class NoUnderlyingReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43009, 43071, 43010, 43011, 43012, 43013, 43014, 43015, 43016, 43017, 43018, 43019, 43020, 43021, 43022, 43023, 43024, 43025, 43026, 43027, 43028, 43029, 43069, 0};

  public NoUnderlyingReturnRateDates() {
    super(43008, 43009, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateDateMode get(quickfix.field.UnderlyingReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateDateMode getUnderlyingReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateDateMode() {
    return isSetField(43009);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp getUnderlyingReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates get(quickfix.field.NoUnderlyingReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates getNoUnderlyingReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDates() {
    return isSetField(43071);
  }

public static class NoUnderlyingReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43072, 43073, 0};

  public NoUnderlyingReturnRateValuationDates() {
    super(43071, 43072, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDate get(quickfix.field.UnderlyingReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDate getUnderlyingReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDate() {
    return isSetField(43072);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType get(quickfix.field.UnderlyingReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType getUnderlyingReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateType() {
    return isSetField(43073);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo getUnderlyingReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateRelativeTo() {
    return isSetField(43010);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod getUnderlyingReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetPeriod() {
    return isSetField(43011);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit getUnderlyingReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetUnit() {
    return isSetField(43012);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType getUnderlyingReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetDayType() {
    return isSetField(43013);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted getUnderlyingReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateUnadjusted() {
    return isSetField(43014);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo getUnderlyingReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateRelativeTo() {
    return isSetField(43015);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod getUnderlyingReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(43016);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit getUnderlyingReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetUnit() {
    return isSetField(43017);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType getUnderlyingReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetDayType() {
    return isSetField(43018);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted getUnderlyingReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateAdjusted() {
    return isSetField(43019);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted getUnderlyingReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateUnadjusted() {
    return isSetField(43020);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo getUnderlyingReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateRelativeTo() {
    return isSetField(43021);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod getUnderlyingReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(43022);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit getUnderlyingReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetUnit() {
    return isSetField(43023);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType getUnderlyingReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetDayType() {
    return isSetField(43024);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted getUnderlyingReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateAdjusted() {
    return isSetField(43025);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod get(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod getUnderlyingReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyPeriod() {
    return isSetField(43026);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit get(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit getUnderlyingReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyUnit() {
    return isSetField(43027);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention get(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention getUnderlyingReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyRollConvention() {
    return isSetField(43028);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention get(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention getUnderlyingReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessDayConvention() {
    return isSetField(43029);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp getUnderlyingReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters get(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters getNoUnderlyingReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDateBusinessCenters() {
    return isSetField(43069);
  }

public static class NoUnderlyingReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43070, 0};

  public NoUnderlyingReturnRateValuationDateBusinessCenters() {
    super(43069, 43070, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter getUnderlyingReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessCenter() {
    return isSetField(43070);
  }
}
}

  public void set(quickfix.field.UnderlyingReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateDateMode get(quickfix.field.UnderlyingReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateDateMode getUnderlyingReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateDateMode() {
    return isSetField(43009);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp getUnderlyingReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates get(quickfix.field.NoUnderlyingReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates getNoUnderlyingReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDates() {
    return isSetField(43071);
  }

public static class NoUnderlyingReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43072, 43073, 0};

  public NoUnderlyingReturnRateValuationDates() {
    super(43071, 43072, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDate get(quickfix.field.UnderlyingReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDate getUnderlyingReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDate() {
    return isSetField(43072);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType get(quickfix.field.UnderlyingReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType getUnderlyingReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateType() {
    return isSetField(43073);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo getUnderlyingReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateRelativeTo() {
    return isSetField(43010);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod getUnderlyingReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetPeriod() {
    return isSetField(43011);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit getUnderlyingReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetUnit() {
    return isSetField(43012);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType getUnderlyingReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetDayType() {
    return isSetField(43013);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted getUnderlyingReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateUnadjusted() {
    return isSetField(43014);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo getUnderlyingReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateRelativeTo() {
    return isSetField(43015);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod getUnderlyingReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(43016);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit getUnderlyingReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetUnit() {
    return isSetField(43017);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType getUnderlyingReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetDayType() {
    return isSetField(43018);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted getUnderlyingReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateAdjusted() {
    return isSetField(43019);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted getUnderlyingReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateUnadjusted() {
    return isSetField(43020);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo getUnderlyingReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateRelativeTo() {
    return isSetField(43021);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod getUnderlyingReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(43022);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit getUnderlyingReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetUnit() {
    return isSetField(43023);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType getUnderlyingReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetDayType() {
    return isSetField(43024);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted getUnderlyingReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateAdjusted() {
    return isSetField(43025);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod get(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod getUnderlyingReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyPeriod() {
    return isSetField(43026);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit get(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit getUnderlyingReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyUnit() {
    return isSetField(43027);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention get(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention getUnderlyingReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyRollConvention() {
    return isSetField(43028);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention get(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention getUnderlyingReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessDayConvention() {
    return isSetField(43029);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp getUnderlyingReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters get(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters getNoUnderlyingReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDateBusinessCenters() {
    return isSetField(43069);
  }

public static class NoUnderlyingReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43070, 0};

  public NoUnderlyingReturnRateValuationDateBusinessCenters() {
    super(43069, 43070, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter getUnderlyingReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessCenter() {
    return isSetField(43070);
  }
}
}
