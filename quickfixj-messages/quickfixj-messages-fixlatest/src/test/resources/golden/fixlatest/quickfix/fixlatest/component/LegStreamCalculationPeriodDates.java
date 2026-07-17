/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCalculationPeriodDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41641, 41642, 40265, 40267, 40268, 40270, 40271, 40272, 40273, 40274, 40275, 40276, 41643, 41644, 41645, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCalculationPeriodDates() {
    super();
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDatesXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDatesXID get(quickfix.field.LegStreamCalculationPeriodDatesXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDatesXID getLegStreamCalculationPeriodDatesXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDatesXID());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDatesXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDatesXID() {
    return isSetField(41641);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDatesXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDatesXIDRef get(quickfix.field.LegStreamCalculationPeriodDatesXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDatesXIDRef getLegStreamCalculationPeriodDatesXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDatesXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDatesXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDatesXIDRef() {
    return isSetField(41642);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessDayConvention get(quickfix.field.LegStreamCalculationPeriodBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessDayConvention getLegStreamCalculationPeriodBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodBusinessDayConvention() {
    return isSetField(40265);
  }

  public void set(quickfix.fixlatest.component.LegStreamCalculationPeriodBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodBusinessCenterGrp get(quickfix.fixlatest.component.LegStreamCalculationPeriodBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodBusinessCenterGrp getLegStreamCalculationPeriodBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCalculationPeriodBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegStreamCalculationPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCalculationPeriodBusinessCenters get(quickfix.field.NoLegStreamCalculationPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCalculationPeriodBusinessCenters getNoLegStreamCalculationPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCalculationPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamCalculationPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCalculationPeriodBusinessCenters() {
    return isSetField(40940);
  }

public static class NoLegStreamCalculationPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40266, 0};

  public NoLegStreamCalculationPeriodBusinessCenters() {
    super(40940, 40266, ORDER);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessCenter get(quickfix.field.LegStreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodBusinessCenter getLegStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodBusinessCenter() {
    return isSetField(40266);
  }
}

  public void set(quickfix.fixlatest.component.LegStreamCalculationPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDateGrp get(quickfix.fixlatest.component.LegStreamCalculationPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDateGrp getLegStreamCalculationPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCalculationPeriodDateGrp());
  }

  public void set(quickfix.field.NoLegStreamCalculationPeriodDates value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCalculationPeriodDates get(quickfix.field.NoLegStreamCalculationPeriodDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCalculationPeriodDates getNoLegStreamCalculationPeriodDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCalculationPeriodDates());
  }

  public boolean isSet(quickfix.field.NoLegStreamCalculationPeriodDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCalculationPeriodDates() {
    return isSetField(41638);
  }

public static class NoLegStreamCalculationPeriodDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41639, 41640, 0};

  public NoLegStreamCalculationPeriodDates() {
    super(41638, 41639, ORDER);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDate get(quickfix.field.LegStreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDate getLegStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDate() {
    return isSetField(41639);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDateType get(quickfix.field.LegStreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDateType getLegStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDateType() {
    return isSetField(41640);
  }
}

  public void set(quickfix.field.LegStreamFirstPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstPeriodStartDateUnadjusted get(quickfix.field.LegStreamFirstPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstPeriodStartDateUnadjusted getLegStreamFirstPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamFirstPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstPeriodStartDateUnadjusted() {
    return isSetField(40267);
  }

  public void set(quickfix.field.LegStreamFirstPeriodStartDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessDayConvention get(quickfix.field.LegStreamFirstPeriodStartDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessDayConvention getLegStreamFirstPeriodStartDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstPeriodStartDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegStreamFirstPeriodStartDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstPeriodStartDateBusinessDayConvention() {
    return isSetField(40268);
  }

  public void set(quickfix.fixlatest.component.LegStreamFirstPeriodStartDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamFirstPeriodStartDateBusinessCenterGrp get(quickfix.fixlatest.component.LegStreamFirstPeriodStartDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamFirstPeriodStartDateBusinessCenterGrp getLegStreamFirstPeriodStartDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamFirstPeriodStartDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters get(quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters getNoLegStreamFirstPeriodStartDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamFirstPeriodStartDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamFirstPeriodStartDateBusinessCenters() {
    return isSetField(40941);
  }

public static class NoLegStreamFirstPeriodStartDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40269, 0};

  public NoLegStreamFirstPeriodStartDateBusinessCenters() {
    super(40941, 40269, ORDER);
  }

  public void set(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter get(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter getLegStreamFirstPeriodStartDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamFirstPeriodStartDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstPeriodStartDateBusinessCenter() {
    return isSetField(40269);
  }
}

  public void set(quickfix.field.LegStreamFirstPeriodStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstPeriodStartDateAdjusted get(quickfix.field.LegStreamFirstPeriodStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstPeriodStartDateAdjusted getLegStreamFirstPeriodStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstPeriodStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegStreamFirstPeriodStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstPeriodStartDateAdjusted() {
    return isSetField(40270);
  }

  public void set(quickfix.field.LegStreamFirstRegularPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstRegularPeriodStartDateUnadjusted get(quickfix.field.LegStreamFirstRegularPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstRegularPeriodStartDateUnadjusted getLegStreamFirstRegularPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstRegularPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamFirstRegularPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstRegularPeriodStartDateUnadjusted() {
    return isSetField(40271);
  }

  public void set(quickfix.field.LegStreamFirstCompoundingPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamFirstCompoundingPeriodEndDateUnadjusted get(quickfix.field.LegStreamFirstCompoundingPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamFirstCompoundingPeriodEndDateUnadjusted getLegStreamFirstCompoundingPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamFirstCompoundingPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamFirstCompoundingPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamFirstCompoundingPeriodEndDateUnadjusted() {
    return isSetField(40272);
  }

  public void set(quickfix.field.LegStreamLastRegularPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamLastRegularPeriodEndDateUnadjusted get(quickfix.field.LegStreamLastRegularPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamLastRegularPeriodEndDateUnadjusted getLegStreamLastRegularPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamLastRegularPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamLastRegularPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamLastRegularPeriodEndDateUnadjusted() {
    return isSetField(40273);
  }

  public void set(quickfix.field.LegStreamCalculationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationFrequencyPeriod get(quickfix.field.LegStreamCalculationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationFrequencyPeriod getLegStreamCalculationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationFrequencyPeriod() {
    return isSetField(40274);
  }

  public void set(quickfix.field.LegStreamCalculationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationFrequencyUnit get(quickfix.field.LegStreamCalculationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationFrequencyUnit getLegStreamCalculationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationFrequencyUnit() {
    return isSetField(40275);
  }

  public void set(quickfix.field.LegStreamCalculationRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationRollConvention get(quickfix.field.LegStreamCalculationRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationRollConvention getLegStreamCalculationRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationRollConvention());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationRollConvention() {
    return isSetField(40276);
  }

  public void set(quickfix.field.LegStreamCalculationBalanceOfFirstPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationBalanceOfFirstPeriod get(quickfix.field.LegStreamCalculationBalanceOfFirstPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationBalanceOfFirstPeriod getLegStreamCalculationBalanceOfFirstPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationBalanceOfFirstPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationBalanceOfFirstPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationBalanceOfFirstPeriod() {
    return isSetField(41643);
  }

  public void set(quickfix.field.LegStreamCalculationCorrectionPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationCorrectionPeriod get(quickfix.field.LegStreamCalculationCorrectionPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationCorrectionPeriod getLegStreamCalculationCorrectionPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationCorrectionPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationCorrectionPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationCorrectionPeriod() {
    return isSetField(41644);
  }

  public void set(quickfix.field.LegStreamCalculationCorrectionUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationCorrectionUnit get(quickfix.field.LegStreamCalculationCorrectionUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationCorrectionUnit getLegStreamCalculationCorrectionUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationCorrectionUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationCorrectionUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationCorrectionUnit() {
    return isSetField(41645);
  }
}
