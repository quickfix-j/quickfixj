/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRateDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42508, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRateDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateDates get(quickfix.field.NoLegReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateDates getNoLegReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateDates() {
    return isSetField(42508);
  }

public static class NoLegReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42509, 42571, 42510, 42511, 42512, 42513, 42514, 42515, 42516, 42517, 42518, 42519, 42520, 42521, 42522, 42523, 42524, 42525, 42526, 42527, 42528, 42529, 42569, 0};

  public NoLegReturnRateDates() {
    super(42508, 42509, ORDER);
  }

  public void set(quickfix.field.LegReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateDateMode get(quickfix.field.LegReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateDateMode getLegReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.LegReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateDateMode() {
    return isSetField(42509);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp getLegReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDates get(quickfix.field.NoLegReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDates getNoLegReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDates() {
    return isSetField(42571);
  }

public static class NoLegReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42572, 42573, 0};

  public NoLegReturnRateValuationDates() {
    super(42571, 42572, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDate get(quickfix.field.LegReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDate getLegReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDate() {
    return isSetField(42572);
  }

  public void set(quickfix.field.LegReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateType get(quickfix.field.LegReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateType getLegReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateType() {
    return isSetField(42573);
  }
}

  public void set(quickfix.field.LegReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo get(quickfix.field.LegReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo getLegReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateRelativeTo() {
    return isSetField(42510);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod get(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod getLegReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetPeriod() {
    return isSetField(42511);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit get(quickfix.field.LegReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit getLegReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetUnit() {
    return isSetField(42512);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType get(quickfix.field.LegReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType getLegReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetDayType() {
    return isSetField(42513);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted get(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted getLegReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateUnadjusted() {
    return isSetField(42514);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo get(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo getLegReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateRelativeTo() {
    return isSetField(42515);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod get(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod getLegReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42516);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit get(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit getLegReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42517);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType get(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType getLegReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42518);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted get(quickfix.field.LegReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted getLegReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateAdjusted() {
    return isSetField(42519);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted get(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted getLegReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateUnadjusted() {
    return isSetField(42520);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo get(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo getLegReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateRelativeTo() {
    return isSetField(42521);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod get(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod getLegReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42522);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit get(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit getLegReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42523);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType get(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType getLegReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42524);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted get(quickfix.field.LegReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted getLegReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateAdjusted() {
    return isSetField(42525);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod get(quickfix.field.LegReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod getLegReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyPeriod() {
    return isSetField(42526);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit get(quickfix.field.LegReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit getLegReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyUnit() {
    return isSetField(42527);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention get(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention getLegReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyRollConvention() {
    return isSetField(42528);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention get(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention getLegReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42529);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp getLegReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters get(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters getNoLegReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDateBusinessCenters() {
    return isSetField(42569);
  }

public static class NoLegReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42570, 0};

  public NoLegReturnRateValuationDateBusinessCenters() {
    super(42569, 42570, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter get(quickfix.field.LegReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter getLegReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessCenter() {
    return isSetField(42570);
  }
}
}

  public void set(quickfix.field.LegReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateDateMode get(quickfix.field.LegReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateDateMode getLegReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.LegReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateDateMode() {
    return isSetField(42509);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp getLegReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDates get(quickfix.field.NoLegReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDates getNoLegReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDates() {
    return isSetField(42571);
  }

public static class NoLegReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42572, 42573, 0};

  public NoLegReturnRateValuationDates() {
    super(42571, 42572, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDate get(quickfix.field.LegReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDate getLegReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDate() {
    return isSetField(42572);
  }

  public void set(quickfix.field.LegReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateType get(quickfix.field.LegReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateType getLegReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateType() {
    return isSetField(42573);
  }
}

  public void set(quickfix.field.LegReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo get(quickfix.field.LegReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo getLegReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateRelativeTo() {
    return isSetField(42510);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod get(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod getLegReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetPeriod() {
    return isSetField(42511);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit get(quickfix.field.LegReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit getLegReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetUnit() {
    return isSetField(42512);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType get(quickfix.field.LegReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType getLegReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetDayType() {
    return isSetField(42513);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted get(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted getLegReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateUnadjusted() {
    return isSetField(42514);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo get(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo getLegReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateRelativeTo() {
    return isSetField(42515);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod get(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod getLegReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42516);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit get(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit getLegReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42517);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType get(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType getLegReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42518);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted get(quickfix.field.LegReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted getLegReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateAdjusted() {
    return isSetField(42519);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted get(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted getLegReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateUnadjusted() {
    return isSetField(42520);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo get(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo getLegReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateRelativeTo() {
    return isSetField(42521);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod get(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod getLegReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42522);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit get(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit getLegReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42523);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType get(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType getLegReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42524);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted get(quickfix.field.LegReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted getLegReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateAdjusted() {
    return isSetField(42525);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod get(quickfix.field.LegReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod getLegReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyPeriod() {
    return isSetField(42526);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit get(quickfix.field.LegReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit getLegReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyUnit() {
    return isSetField(42527);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention get(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention getLegReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyRollConvention() {
    return isSetField(42528);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention get(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention getLegReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42529);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp getLegReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters get(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters getNoLegReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDateBusinessCenters() {
    return isSetField(42569);
  }

public static class NoLegReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42570, 0};

  public NoLegReturnRateValuationDateBusinessCenters() {
    super(42569, 42570, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter get(quickfix.field.LegReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter getLegReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessCenter() {
    return isSetField(42570);
  }
}
}
