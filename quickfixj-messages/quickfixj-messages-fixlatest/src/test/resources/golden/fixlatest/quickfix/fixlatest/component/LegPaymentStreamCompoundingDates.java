/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamCompoundingDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42408, 42409, 42410, 42411, 42412, 42413, 42414, 42415, 42416, 42417, 42418, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamCompoundingDates() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessDayConvention get(quickfix.field.LegPaymentStreamCompoundingDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessDayConvention getLegPaymentStreamCompoundingDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesBusinessDayConvention() {
    return isSetField(42408);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamCompoundingDatesBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingDatesBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStreamCompoundingDatesBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingDatesBusinessCenterGrp getLegPaymentStreamCompoundingDatesBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamCompoundingDatesBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters get(quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters getNoLegPaymentStreamCompoundingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamCompoundingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamCompoundingDatesBusinessCenters() {
    return isSetField(42419);
  }

public static class NoLegPaymentStreamCompoundingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42420, 0};

  public NoLegPaymentStreamCompoundingDatesBusinessCenters() {
    super(42419, 42420, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter getLegPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42420);
  }
}

  public void set(quickfix.fixlatest.component.LegPaymentStreamCompoundingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingDateGrp get(quickfix.fixlatest.component.LegPaymentStreamCompoundingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingDateGrp getLegPaymentStreamCompoundingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamCompoundingDateGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamCompoundingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDates get(quickfix.field.NoLegPaymentStreamCompoundingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamCompoundingDates getNoLegPaymentStreamCompoundingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamCompoundingDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamCompoundingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamCompoundingDates() {
    return isSetField(42405);
  }

public static class NoLegPaymentStreamCompoundingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42406, 42407, 0};

  public NoLegPaymentStreamCompoundingDates() {
    super(42405, 42406, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDate get(quickfix.field.LegPaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDate getLegPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDate() {
    return isSetField(42406);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDateType get(quickfix.field.LegPaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDateType getLegPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDateType() {
    return isSetField(42407);
  }
}

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesRelativeTo get(quickfix.field.LegPaymentStreamCompoundingDatesRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesRelativeTo getLegPaymentStreamCompoundingDatesRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesRelativeTo() {
    return isSetField(42409);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesOffsetPeriod get(quickfix.field.LegPaymentStreamCompoundingDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesOffsetPeriod getLegPaymentStreamCompoundingDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesOffsetPeriod() {
    return isSetField(42410);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesOffsetUnit get(quickfix.field.LegPaymentStreamCompoundingDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesOffsetUnit getLegPaymentStreamCompoundingDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesOffsetUnit() {
    return isSetField(42411);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesOffsetDayType get(quickfix.field.LegPaymentStreamCompoundingDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingDatesOffsetDayType getLegPaymentStreamCompoundingDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingDatesOffsetDayType() {
    return isSetField(42412);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingPeriodSkip value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingPeriodSkip get(quickfix.field.LegPaymentStreamCompoundingPeriodSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingPeriodSkip getLegPaymentStreamCompoundingPeriodSkip() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingPeriodSkip());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingPeriodSkip field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingPeriodSkip() {
    return isSetField(42413);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamCompoundingStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingStartDate get(quickfix.fixlatest.component.LegPaymentStreamCompoundingStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingStartDate getLegPaymentStreamCompoundingStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamCompoundingStartDate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamCompoundingEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingEndDate get(quickfix.fixlatest.component.LegPaymentStreamCompoundingEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamCompoundingEndDate getLegPaymentStreamCompoundingEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamCompoundingEndDate());
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingFrequencyPeriod get(quickfix.field.LegPaymentStreamCompoundingFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingFrequencyPeriod getLegPaymentStreamCompoundingFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingFrequencyPeriod() {
    return isSetField(42414);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingFrequencyUnit get(quickfix.field.LegPaymentStreamCompoundingFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingFrequencyUnit getLegPaymentStreamCompoundingFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingFrequencyUnit() {
    return isSetField(42415);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingRollConvention get(quickfix.field.LegPaymentStreamCompoundingRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingRollConvention getLegPaymentStreamCompoundingRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingRollConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingRollConvention() {
    return isSetField(42416);
  }

  public void set(quickfix.field.LegPaymentStreamBoundsFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamBoundsFirstDateUnadjusted get(quickfix.field.LegPaymentStreamBoundsFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamBoundsFirstDateUnadjusted getLegPaymentStreamBoundsFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamBoundsFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamBoundsFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamBoundsFirstDateUnadjusted() {
    return isSetField(42417);
  }

  public void set(quickfix.field.LegPaymentStreamBoundsLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamBoundsLastDateUnadjusted get(quickfix.field.LegPaymentStreamBoundsLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamBoundsLastDateUnadjusted getLegPaymentStreamBoundsLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamBoundsLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamBoundsLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamBoundsLastDateUnadjusted() {
    return isSetField(42418);
  }
}
