/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCalculationPeriodDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41244, 41245, 40073, 40075, 40076, 40078, 40079, 40080, 40081, 40082, 40083, 40084, 41246, 41247, 41248, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCalculationPeriodDates() {
    super();
  }

  public void set(quickfix.field.StreamCalculationPeriodDatesXID value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDatesXID get(quickfix.field.StreamCalculationPeriodDatesXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDatesXID getStreamCalculationPeriodDatesXID() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDatesXID());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDatesXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDatesXID() {
    return isSetField(41244);
  }

  public void set(quickfix.field.StreamCalculationPeriodDatesXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDatesXIDRef get(quickfix.field.StreamCalculationPeriodDatesXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDatesXIDRef getStreamCalculationPeriodDatesXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDatesXIDRef());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDatesXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDatesXIDRef() {
    return isSetField(41245);
  }

  public void set(quickfix.field.StreamCalculationPeriodBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodBusinessDayConvention get(quickfix.field.StreamCalculationPeriodBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodBusinessDayConvention getStreamCalculationPeriodBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodBusinessDayConvention() {
    return isSetField(40073);
  }

  public void set(quickfix.fixlatest.component.StreamCalculationPeriodBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodBusinessCenterGrp get(quickfix.fixlatest.component.StreamCalculationPeriodBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodBusinessCenterGrp getStreamCalculationPeriodBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCalculationPeriodBusinessCenterGrp());
  }

  public void set(quickfix.field.NoStreamCalculationPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamCalculationPeriodBusinessCenters get(quickfix.field.NoStreamCalculationPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCalculationPeriodBusinessCenters getNoStreamCalculationPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCalculationPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamCalculationPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCalculationPeriodBusinessCenters() {
    return isSetField(40958);
  }

public static class NoStreamCalculationPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40074, 0};

  public NoStreamCalculationPeriodBusinessCenters() {
    super(40958, 40074, ORDER);
  }

  public void set(quickfix.field.StreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodBusinessCenter get(quickfix.field.StreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodBusinessCenter getStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodBusinessCenter() {
    return isSetField(40074);
  }
}

  public void set(quickfix.fixlatest.component.StreamCalculationPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDateGrp get(quickfix.fixlatest.component.StreamCalculationPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDateGrp getStreamCalculationPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCalculationPeriodDateGrp());
  }

  public void set(quickfix.field.NoStreamCalculationPeriodDates value) {
    setField(value);
  }

  public quickfix.field.NoStreamCalculationPeriodDates get(quickfix.field.NoStreamCalculationPeriodDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCalculationPeriodDates getNoStreamCalculationPeriodDates() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCalculationPeriodDates());
  }

  public boolean isSet(quickfix.field.NoStreamCalculationPeriodDates field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCalculationPeriodDates() {
    return isSetField(41241);
  }

public static class NoStreamCalculationPeriodDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41242, 41243, 0};

  public NoStreamCalculationPeriodDates() {
    super(41241, 41242, ORDER);
  }

  public void set(quickfix.field.StreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDate get(quickfix.field.StreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDate getStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDate() {
    return isSetField(41242);
  }

  public void set(quickfix.field.StreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodDateType get(quickfix.field.StreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodDateType getStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodDateType() {
    return isSetField(41243);
  }
}

  public void set(quickfix.field.StreamFirstPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamFirstPeriodStartDateUnadjusted get(quickfix.field.StreamFirstPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstPeriodStartDateUnadjusted getStreamFirstPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamFirstPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstPeriodStartDateUnadjusted() {
    return isSetField(40075);
  }

  public void set(quickfix.field.StreamFirstPeriodStartDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessDayConvention get(quickfix.field.StreamFirstPeriodStartDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessDayConvention getStreamFirstPeriodStartDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstPeriodStartDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.StreamFirstPeriodStartDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstPeriodStartDateBusinessDayConvention() {
    return isSetField(40076);
  }

  public void set(quickfix.fixlatest.component.StreamFirstPeriodStartDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamFirstPeriodStartDateBusinessCenterGrp get(quickfix.fixlatest.component.StreamFirstPeriodStartDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamFirstPeriodStartDateBusinessCenterGrp getStreamFirstPeriodStartDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamFirstPeriodStartDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters get(quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters getNoStreamFirstPeriodStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamFirstPeriodStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamFirstPeriodStartDateBusinessCenters() {
    return isSetField(40959);
  }

public static class NoStreamFirstPeriodStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40077, 0};

  public NoStreamFirstPeriodStartDateBusinessCenters() {
    super(40959, 40077, ORDER);
  }

  public void set(quickfix.field.StreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessCenter get(quickfix.field.StreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstPeriodStartDateBusinessCenter getStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40077);
  }
}

  public void set(quickfix.field.StreamFirstPeriodStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.StreamFirstPeriodStartDateAdjusted get(quickfix.field.StreamFirstPeriodStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstPeriodStartDateAdjusted getStreamFirstPeriodStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstPeriodStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.StreamFirstPeriodStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstPeriodStartDateAdjusted() {
    return isSetField(40078);
  }

  public void set(quickfix.field.StreamFirstRegularPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamFirstRegularPeriodStartDateUnadjusted get(quickfix.field.StreamFirstRegularPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstRegularPeriodStartDateUnadjusted getStreamFirstRegularPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstRegularPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamFirstRegularPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstRegularPeriodStartDateUnadjusted() {
    return isSetField(40079);
  }

  public void set(quickfix.field.StreamFirstCompoundingPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamFirstCompoundingPeriodEndDateUnadjusted get(quickfix.field.StreamFirstCompoundingPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamFirstCompoundingPeriodEndDateUnadjusted getStreamFirstCompoundingPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamFirstCompoundingPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamFirstCompoundingPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamFirstCompoundingPeriodEndDateUnadjusted() {
    return isSetField(40080);
  }

  public void set(quickfix.field.StreamLastRegularPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamLastRegularPeriodEndDateUnadjusted get(quickfix.field.StreamLastRegularPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamLastRegularPeriodEndDateUnadjusted getStreamLastRegularPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamLastRegularPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamLastRegularPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamLastRegularPeriodEndDateUnadjusted() {
    return isSetField(40081);
  }

  public void set(quickfix.field.StreamCalculationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationFrequencyPeriod get(quickfix.field.StreamCalculationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationFrequencyPeriod getStreamCalculationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamCalculationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationFrequencyPeriod() {
    return isSetField(40082);
  }

  public void set(quickfix.field.StreamCalculationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationFrequencyUnit get(quickfix.field.StreamCalculationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationFrequencyUnit getStreamCalculationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamCalculationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationFrequencyUnit() {
    return isSetField(40083);
  }

  public void set(quickfix.field.StreamCalculationRollConvention value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationRollConvention get(quickfix.field.StreamCalculationRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationRollConvention getStreamCalculationRollConvention() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationRollConvention());
  }

  public boolean isSet(quickfix.field.StreamCalculationRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationRollConvention() {
    return isSetField(40084);
  }

  public void set(quickfix.field.StreamCalculationBalanceOfFirstPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationBalanceOfFirstPeriod get(quickfix.field.StreamCalculationBalanceOfFirstPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationBalanceOfFirstPeriod getStreamCalculationBalanceOfFirstPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationBalanceOfFirstPeriod());
  }

  public boolean isSet(quickfix.field.StreamCalculationBalanceOfFirstPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationBalanceOfFirstPeriod() {
    return isSetField(41246);
  }

  public void set(quickfix.field.StreamCalculationCorrectionPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationCorrectionPeriod get(quickfix.field.StreamCalculationCorrectionPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationCorrectionPeriod getStreamCalculationCorrectionPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationCorrectionPeriod());
  }

  public boolean isSet(quickfix.field.StreamCalculationCorrectionPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationCorrectionPeriod() {
    return isSetField(41247);
  }

  public void set(quickfix.field.StreamCalculationCorrectionUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationCorrectionUnit get(quickfix.field.StreamCalculationCorrectionUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationCorrectionUnit getStreamCalculationCorrectionUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationCorrectionUnit());
  }

  public boolean isSet(quickfix.field.StreamCalculationCorrectionUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationCorrectionUnit() {
    return isSetField(41248);
  }
}
