/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCalculationPeriodDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41957, 41958, 40556, 40558, 40559, 40561, 40562, 40563, 40564, 40565, 40566, 40567, 41959, 41960, 41961, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCalculationPeriodDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDatesXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDatesXID get(quickfix.field.UnderlyingStreamCalculationPeriodDatesXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDatesXID getUnderlyingStreamCalculationPeriodDatesXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDatesXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDatesXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDatesXID() {
    return isSetField(41957);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDatesXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDatesXIDRef get(quickfix.field.UnderlyingStreamCalculationPeriodDatesXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDatesXIDRef getUnderlyingStreamCalculationPeriodDatesXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDatesXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDatesXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDatesXIDRef() {
    return isSetField(41958);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessDayConvention get(quickfix.field.UnderlyingStreamCalculationPeriodBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessDayConvention getUnderlyingStreamCalculationPeriodBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodBusinessDayConvention() {
    return isSetField(40556);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodBusinessCenterGrp getUnderlyingStreamCalculationPeriodBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters get(quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters getNoUnderlyingStreamCalculationPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCalculationPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCalculationPeriodBusinessCenters() {
    return isSetField(40973);
  }

public static class NoUnderlyingStreamCalculationPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40557, 0};

  public NoUnderlyingStreamCalculationPeriodBusinessCenters() {
    super(40973, 40557, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter get(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter getUnderlyingStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodBusinessCenter() {
    return isSetField(40557);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDateGrp get(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDateGrp getUnderlyingStreamCalculationPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCalculationPeriodDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodDates get(quickfix.field.NoUnderlyingStreamCalculationPeriodDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCalculationPeriodDates getNoUnderlyingStreamCalculationPeriodDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCalculationPeriodDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCalculationPeriodDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCalculationPeriodDates() {
    return isSetField(41954);
  }

public static class NoUnderlyingStreamCalculationPeriodDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41955, 41956, 0};

  public NoUnderlyingStreamCalculationPeriodDates() {
    super(41954, 41955, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDate get(quickfix.field.UnderlyingStreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDate getUnderlyingStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDate() {
    return isSetField(41955);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDateType get(quickfix.field.UnderlyingStreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationPeriodDateType getUnderlyingStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationPeriodDateType() {
    return isSetField(41956);
  }
}

  public void set(quickfix.field.UnderlyingStreamFirstPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateUnadjusted get(quickfix.field.UnderlyingStreamFirstPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateUnadjusted getUnderlyingStreamFirstPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstPeriodStartDateUnadjusted() {
    return isSetField(40558);
  }

  public void set(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessDayConvention get(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessDayConvention getUnderlyingStreamFirstPeriodStartDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstPeriodStartDateBusinessDayConvention() {
    return isSetField(40559);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp getUnderlyingStreamFirstPeriodStartDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamFirstPeriodStartDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters get(quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters getNoUnderlyingStreamFirstPeriodStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamFirstPeriodStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamFirstPeriodStartDateBusinessCenters() {
    return isSetField(40974);
  }

public static class NoUnderlyingStreamFirstPeriodStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40560, 0};

  public NoUnderlyingStreamFirstPeriodStartDateBusinessCenters() {
    super(40974, 40560, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter get(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter getUnderlyingStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40560);
  }
}

  public void set(quickfix.field.UnderlyingStreamFirstPeriodStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateAdjusted get(quickfix.field.UnderlyingStreamFirstPeriodStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstPeriodStartDateAdjusted getUnderlyingStreamFirstPeriodStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstPeriodStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstPeriodStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstPeriodStartDateAdjusted() {
    return isSetField(40561);
  }

  public void set(quickfix.field.UnderlyingStreamFirstRegularPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstRegularPeriodStartDateUnadjusted get(quickfix.field.UnderlyingStreamFirstRegularPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstRegularPeriodStartDateUnadjusted getUnderlyingStreamFirstRegularPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstRegularPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstRegularPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstRegularPeriodStartDateUnadjusted() {
    return isSetField(40562);
  }

  public void set(quickfix.field.UnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted get(quickfix.field.UnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted getUnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamFirstCompoundingPeriodEndDateUnadjusted() {
    return isSetField(40563);
  }

  public void set(quickfix.field.UnderlyingStreamLastRegularPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamLastRegularPeriodEndDateUnadjusted get(quickfix.field.UnderlyingStreamLastRegularPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamLastRegularPeriodEndDateUnadjusted getUnderlyingStreamLastRegularPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamLastRegularPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamLastRegularPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamLastRegularPeriodEndDateUnadjusted() {
    return isSetField(40564);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationFrequencyPeriod get(quickfix.field.UnderlyingStreamCalculationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationFrequencyPeriod getUnderlyingStreamCalculationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationFrequencyPeriod() {
    return isSetField(40565);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationFrequencyUnit get(quickfix.field.UnderlyingStreamCalculationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationFrequencyUnit getUnderlyingStreamCalculationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationFrequencyUnit() {
    return isSetField(40566);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationRollConvention get(quickfix.field.UnderlyingStreamCalculationRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationRollConvention getUnderlyingStreamCalculationRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationRollConvention() {
    return isSetField(40567);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationBalanceOfFirstPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationBalanceOfFirstPeriod get(quickfix.field.UnderlyingStreamCalculationBalanceOfFirstPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationBalanceOfFirstPeriod getUnderlyingStreamCalculationBalanceOfFirstPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationBalanceOfFirstPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationBalanceOfFirstPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationBalanceOfFirstPeriod() {
    return isSetField(41959);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationCorrectionPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationCorrectionPeriod get(quickfix.field.UnderlyingStreamCalculationCorrectionPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationCorrectionPeriod getUnderlyingStreamCalculationCorrectionPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationCorrectionPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationCorrectionPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationCorrectionPeriod() {
    return isSetField(41960);
  }

  public void set(quickfix.field.UnderlyingStreamCalculationCorrectionUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCalculationCorrectionUnit get(quickfix.field.UnderlyingStreamCalculationCorrectionUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCalculationCorrectionUnit getUnderlyingStreamCalculationCorrectionUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCalculationCorrectionUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCalculationCorrectionUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCalculationCorrectionUnit() {
    return isSetField(41961);
  }
}
