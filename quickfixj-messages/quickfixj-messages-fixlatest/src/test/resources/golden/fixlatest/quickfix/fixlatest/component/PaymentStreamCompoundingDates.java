/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamCompoundingDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42609, 42610, 42611, 42612, 42613, 42614, 42615, 42616, 42617, 42618, 42619, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamCompoundingDates() {
    super();
  }

  public void set(quickfix.field.PaymentStreamCompoundingDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessDayConvention get(quickfix.field.PaymentStreamCompoundingDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessDayConvention getPaymentStreamCompoundingDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesBusinessDayConvention() {
    return isSetField(42609);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamCompoundingDatesBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingDatesBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStreamCompoundingDatesBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingDatesBusinessCenterGrp getPaymentStreamCompoundingDatesBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamCompoundingDatesBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters get(quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters getNoPaymentStreamCompoundingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamCompoundingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamCompoundingDatesBusinessCenters() {
    return isSetField(42620);
  }

public static class NoPaymentStreamCompoundingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42621, 0};

  public NoPaymentStreamCompoundingDatesBusinessCenters() {
    super(42620, 42621, ORDER);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessCenter get(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesBusinessCenter getPaymentStreamCompoundingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesBusinessCenter() {
    return isSetField(42621);
  }
}

  public void set(quickfix.fixlatest.component.PaymentStreamCompoundingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingDateGrp get(quickfix.fixlatest.component.PaymentStreamCompoundingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingDateGrp getPaymentStreamCompoundingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamCompoundingDateGrp());
  }

  public void set(quickfix.field.NoPaymentStreamCompoundingDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamCompoundingDates get(quickfix.field.NoPaymentStreamCompoundingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamCompoundingDates getNoPaymentStreamCompoundingDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamCompoundingDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamCompoundingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamCompoundingDates() {
    return isSetField(42606);
  }

public static class NoPaymentStreamCompoundingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42607, 42608, 0};

  public NoPaymentStreamCompoundingDates() {
    super(42606, 42607, ORDER);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDate get(quickfix.field.PaymentStreamCompoundingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDate getPaymentStreamCompoundingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDate() {
    return isSetField(42607);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDateType get(quickfix.field.PaymentStreamCompoundingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDateType getPaymentStreamCompoundingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDateType() {
    return isSetField(42608);
  }
}

  public void set(quickfix.field.PaymentStreamCompoundingDatesRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesRelativeTo get(quickfix.field.PaymentStreamCompoundingDatesRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesRelativeTo getPaymentStreamCompoundingDatesRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesRelativeTo() {
    return isSetField(42610);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesOffsetPeriod get(quickfix.field.PaymentStreamCompoundingDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesOffsetPeriod getPaymentStreamCompoundingDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesOffsetPeriod() {
    return isSetField(42611);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesOffsetUnit get(quickfix.field.PaymentStreamCompoundingDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesOffsetUnit getPaymentStreamCompoundingDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesOffsetUnit() {
    return isSetField(42612);
  }

  public void set(quickfix.field.PaymentStreamCompoundingDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingDatesOffsetDayType get(quickfix.field.PaymentStreamCompoundingDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingDatesOffsetDayType getPaymentStreamCompoundingDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingDatesOffsetDayType() {
    return isSetField(42613);
  }

  public void set(quickfix.field.PaymentStreamCompoundingPeriodSkip value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingPeriodSkip get(quickfix.field.PaymentStreamCompoundingPeriodSkip value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingPeriodSkip getPaymentStreamCompoundingPeriodSkip() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingPeriodSkip());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingPeriodSkip field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingPeriodSkip() {
    return isSetField(42614);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamCompoundingStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingStartDate get(quickfix.fixlatest.component.PaymentStreamCompoundingStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingStartDate getPaymentStreamCompoundingStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamCompoundingStartDate());
  }

  public void set(quickfix.fixlatest.component.PaymentStreamCompoundingEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingEndDate get(quickfix.fixlatest.component.PaymentStreamCompoundingEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamCompoundingEndDate getPaymentStreamCompoundingEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamCompoundingEndDate());
  }

  public void set(quickfix.field.PaymentStreamCompoundingFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFrequencyPeriod get(quickfix.field.PaymentStreamCompoundingFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFrequencyPeriod getPaymentStreamCompoundingFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFrequencyPeriod() {
    return isSetField(42615);
  }

  public void set(quickfix.field.PaymentStreamCompoundingFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingFrequencyUnit get(quickfix.field.PaymentStreamCompoundingFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingFrequencyUnit getPaymentStreamCompoundingFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingFrequencyUnit() {
    return isSetField(42616);
  }

  public void set(quickfix.field.PaymentStreamCompoundingRollConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamCompoundingRollConvention get(quickfix.field.PaymentStreamCompoundingRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamCompoundingRollConvention getPaymentStreamCompoundingRollConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamCompoundingRollConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamCompoundingRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamCompoundingRollConvention() {
    return isSetField(42617);
  }

  public void set(quickfix.field.PaymentStreamBoundsFirstDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamBoundsFirstDateUnadjusted get(quickfix.field.PaymentStreamBoundsFirstDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamBoundsFirstDateUnadjusted getPaymentStreamBoundsFirstDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamBoundsFirstDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamBoundsFirstDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamBoundsFirstDateUnadjusted() {
    return isSetField(42618);
  }

  public void set(quickfix.field.PaymentStreamBoundsLastDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamBoundsLastDateUnadjusted get(quickfix.field.PaymentStreamBoundsLastDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamBoundsLastDateUnadjusted getPaymentStreamBoundsLastDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamBoundsLastDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamBoundsLastDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamBoundsLastDateUnadjusted() {
    return isSetField(42619);
  }
}
