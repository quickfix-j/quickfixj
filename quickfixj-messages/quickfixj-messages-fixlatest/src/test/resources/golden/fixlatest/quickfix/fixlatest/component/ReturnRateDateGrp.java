/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRateDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42709, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRateDateGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateDates get(quickfix.field.NoReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateDates getNoReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateDates() {
    return isSetField(42709);
  }

public static class NoReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42710, 42772, 42711, 42712, 42713, 42714, 42715, 42716, 42717, 42718, 42719, 42720, 42721, 42722, 42723, 42724, 42725, 42726, 42727, 42728, 42729, 42730, 42770, 0};

  public NoReturnRateDates() {
    super(42709, 42710, ORDER);
  }

  public void set(quickfix.field.ReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.ReturnRateDateMode get(quickfix.field.ReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateDateMode getReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.ReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateDateMode() {
    return isSetField(42710);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp get(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp getReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDates get(quickfix.field.NoReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDates getNoReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDates() {
    return isSetField(42772);
  }

public static class NoReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42773, 42774, 0};

  public NoReturnRateValuationDates() {
    super(42772, 42773, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDate get(quickfix.field.ReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDate getReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDate() {
    return isSetField(42773);
  }

  public void set(quickfix.field.ReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateType get(quickfix.field.ReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateType getReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateType() {
    return isSetField(42774);
  }
}

  public void set(quickfix.field.ReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo get(quickfix.field.ReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo getReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateRelativeTo() {
    return isSetField(42711);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod get(quickfix.field.ReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod getReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetPeriod() {
    return isSetField(42712);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit get(quickfix.field.ReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit getReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetUnit() {
    return isSetField(42713);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType get(quickfix.field.ReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType getReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetDayType() {
    return isSetField(42714);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted get(quickfix.field.ReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted getReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateUnadjusted() {
    return isSetField(42715);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo get(quickfix.field.ReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo getReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateRelativeTo() {
    return isSetField(42716);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod get(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod getReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42717);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit get(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit getReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42718);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType get(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType getReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42719);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted get(quickfix.field.ReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted getReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateAdjusted() {
    return isSetField(42720);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted get(quickfix.field.ReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted getReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateUnadjusted() {
    return isSetField(42721);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo get(quickfix.field.ReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo getReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateRelativeTo() {
    return isSetField(42722);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod get(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod getReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42723);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit get(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit getReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42724);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType get(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType getReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42725);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted get(quickfix.field.ReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted getReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateAdjusted() {
    return isSetField(42726);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod get(quickfix.field.ReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod getReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyPeriod() {
    return isSetField(42727);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit get(quickfix.field.ReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit getReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyUnit() {
    return isSetField(42728);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention get(quickfix.field.ReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention getReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyRollConvention() {
    return isSetField(42729);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention get(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention getReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42730);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp getReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters get(quickfix.field.NoReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters getNoReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDateBusinessCenters() {
    return isSetField(42770);
  }

public static class NoReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42771, 0};

  public NoReturnRateValuationDateBusinessCenters() {
    super(42770, 42771, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter get(quickfix.field.ReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter getReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessCenter() {
    return isSetField(42771);
  }
}
}

  public void set(quickfix.field.ReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.ReturnRateDateMode get(quickfix.field.ReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateDateMode getReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.ReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateDateMode() {
    return isSetField(42710);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp get(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp getReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDates get(quickfix.field.NoReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDates getNoReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDates() {
    return isSetField(42772);
  }

public static class NoReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42773, 42774, 0};

  public NoReturnRateValuationDates() {
    super(42772, 42773, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDate get(quickfix.field.ReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDate getReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDate() {
    return isSetField(42773);
  }

  public void set(quickfix.field.ReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateType get(quickfix.field.ReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateType getReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateType() {
    return isSetField(42774);
  }
}

  public void set(quickfix.field.ReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo get(quickfix.field.ReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo getReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateRelativeTo() {
    return isSetField(42711);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod get(quickfix.field.ReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod getReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetPeriod() {
    return isSetField(42712);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit get(quickfix.field.ReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit getReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetUnit() {
    return isSetField(42713);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType get(quickfix.field.ReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType getReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetDayType() {
    return isSetField(42714);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted get(quickfix.field.ReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted getReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateUnadjusted() {
    return isSetField(42715);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo get(quickfix.field.ReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo getReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateRelativeTo() {
    return isSetField(42716);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod get(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod getReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42717);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit get(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit getReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42718);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType get(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType getReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42719);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted get(quickfix.field.ReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted getReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateAdjusted() {
    return isSetField(42720);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted get(quickfix.field.ReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted getReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateUnadjusted() {
    return isSetField(42721);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo get(quickfix.field.ReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo getReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateRelativeTo() {
    return isSetField(42722);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod get(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod getReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42723);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit get(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit getReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42724);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType get(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType getReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42725);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted get(quickfix.field.ReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted getReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateAdjusted() {
    return isSetField(42726);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod get(quickfix.field.ReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod getReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyPeriod() {
    return isSetField(42727);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit get(quickfix.field.ReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit getReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyUnit() {
    return isSetField(42728);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention get(quickfix.field.ReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention getReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyRollConvention() {
    return isSetField(42729);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention get(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention getReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42730);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp getReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters get(quickfix.field.NoReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters getNoReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDateBusinessCenters() {
    return isSetField(42770);
  }

public static class NoReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42771, 0};

  public NoReturnRateValuationDateBusinessCenters() {
    super(42770, 42771, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter get(quickfix.field.ReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter getReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessCenter() {
    return isSetField(42771);
  }
}
}
