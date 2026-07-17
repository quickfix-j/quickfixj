/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamResetDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40761, 40762, 40764, 40765, 40766, 40767, 40768, 40770, 40771, 40772, 40773, 40774, 40775, 40777, 40778, 40779, 40780, 40781, 40782, 40783, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamResetDates() {
    super();
  }

  public void set(quickfix.field.PaymentStreamResetDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetDateRelativeTo get(quickfix.field.PaymentStreamResetDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetDateRelativeTo getPaymentStreamResetDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetDateRelativeTo() {
    return isSetField(40761);
  }

  public void set(quickfix.field.PaymentStreamResetDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetDateBusinessDayConvention get(quickfix.field.PaymentStreamResetDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetDateBusinessDayConvention getPaymentStreamResetDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetDateBusinessDayConvention() {
    return isSetField(40762);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamResetDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamResetDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStreamResetDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamResetDateBusinessCenterGrp getPaymentStreamResetDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamResetDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStreamResetDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamResetDateBusinessCenters get(quickfix.field.NoPaymentStreamResetDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamResetDateBusinessCenters getNoPaymentStreamResetDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamResetDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamResetDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamResetDateBusinessCenters() {
    return isSetField(40948);
  }

public static class NoPaymentStreamResetDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40763, 0};

  public NoPaymentStreamResetDateBusinessCenters() {
    super(40948, 40763, ORDER);
  }

  public void set(quickfix.field.PaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetDateBusinessCenter get(quickfix.field.PaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetDateBusinessCenter getPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetDateBusinessCenter() {
    return isSetField(40763);
  }
}

  public void set(quickfix.field.PaymentStreamResetFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetFrequencyPeriod get(quickfix.field.PaymentStreamResetFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetFrequencyPeriod getPaymentStreamResetFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetFrequencyPeriod() {
    return isSetField(40764);
  }

  public void set(quickfix.field.PaymentStreamResetFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetFrequencyUnit get(quickfix.field.PaymentStreamResetFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetFrequencyUnit getPaymentStreamResetFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetFrequencyUnit() {
    return isSetField(40765);
  }

  public void set(quickfix.field.PaymentStreamResetWeeklyRollConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamResetWeeklyRollConvention get(quickfix.field.PaymentStreamResetWeeklyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamResetWeeklyRollConvention getPaymentStreamResetWeeklyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamResetWeeklyRollConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamResetWeeklyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamResetWeeklyRollConvention() {
    return isSetField(40766);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateRelativeTo get(quickfix.field.PaymentStreamInitialFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateRelativeTo getPaymentStreamInitialFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateRelativeTo() {
    return isSetField(40767);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessDayConvention get(quickfix.field.PaymentStreamInitialFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessDayConvention getPaymentStreamInitialFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateBusinessDayConvention() {
    return isSetField(40768);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamInitialFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamInitialFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStreamInitialFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamInitialFixingDateBusinessCenterGrp getPaymentStreamInitialFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamInitialFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters get(quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters getNoPaymentStreamInitialFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamInitialFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamInitialFixingDateBusinessCenters() {
    return isSetField(40949);
  }

public static class NoPaymentStreamInitialFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40769, 0};

  public NoPaymentStreamInitialFixingDateBusinessCenters() {
    super(40949, 40769, ORDER);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateBusinessCenter getPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40769);
  }
}

  public void set(quickfix.field.PaymentStreamInitialFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateOffsetPeriod get(quickfix.field.PaymentStreamInitialFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateOffsetPeriod getPaymentStreamInitialFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateOffsetPeriod() {
    return isSetField(40770);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateOffsetUnit get(quickfix.field.PaymentStreamInitialFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateOffsetUnit getPaymentStreamInitialFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateOffsetUnit() {
    return isSetField(40771);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateOffsetDayType get(quickfix.field.PaymentStreamInitialFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateOffsetDayType getPaymentStreamInitialFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateOffsetDayType() {
    return isSetField(40772);
  }

  public void set(quickfix.field.PaymentStreamInitialFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamInitialFixingDateAdjusted get(quickfix.field.PaymentStreamInitialFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamInitialFixingDateAdjusted getPaymentStreamInitialFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamInitialFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamInitialFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamInitialFixingDateAdjusted() {
    return isSetField(40773);
  }

  public void set(quickfix.field.PaymentStreamFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateRelativeTo get(quickfix.field.PaymentStreamFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateRelativeTo getPaymentStreamFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateRelativeTo() {
    return isSetField(40774);
  }

  public void set(quickfix.field.PaymentStreamFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateBusinessDayConvention get(quickfix.field.PaymentStreamFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateBusinessDayConvention getPaymentStreamFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateBusinessDayConvention() {
    return isSetField(40775);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStreamFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFixingDateBusinessCenterGrp getPaymentStreamFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStreamFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamFixingDateBusinessCenters get(quickfix.field.NoPaymentStreamFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamFixingDateBusinessCenters getNoPaymentStreamFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamFixingDateBusinessCenters() {
    return isSetField(40950);
  }

public static class NoPaymentStreamFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40776, 0};

  public NoPaymentStreamFixingDateBusinessCenters() {
    super(40950, 40776, ORDER);
  }

  public void set(quickfix.field.PaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateBusinessCenter get(quickfix.field.PaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateBusinessCenter getPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40776);
  }
}

  public void set(quickfix.field.PaymentStreamFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateOffsetPeriod get(quickfix.field.PaymentStreamFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateOffsetPeriod getPaymentStreamFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateOffsetPeriod() {
    return isSetField(40777);
  }

  public void set(quickfix.field.PaymentStreamFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateOffsetUnit get(quickfix.field.PaymentStreamFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateOffsetUnit getPaymentStreamFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateOffsetUnit() {
    return isSetField(40778);
  }

  public void set(quickfix.field.PaymentStreamFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateOffsetDayType get(quickfix.field.PaymentStreamFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateOffsetDayType getPaymentStreamFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateOffsetDayType() {
    return isSetField(40779);
  }

  public void set(quickfix.field.PaymentStreamFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateAdjusted get(quickfix.field.PaymentStreamFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateAdjusted getPaymentStreamFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateAdjusted() {
    return isSetField(40780);
  }

  public void set(quickfix.field.PaymentStreamRateCutoffDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamRateCutoffDateOffsetPeriod get(quickfix.field.PaymentStreamRateCutoffDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamRateCutoffDateOffsetPeriod getPaymentStreamRateCutoffDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamRateCutoffDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamRateCutoffDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamRateCutoffDateOffsetPeriod() {
    return isSetField(40781);
  }

  public void set(quickfix.field.PaymentStreamRateCutoffDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamRateCutoffDateOffsetUnit get(quickfix.field.PaymentStreamRateCutoffDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamRateCutoffDateOffsetUnit getPaymentStreamRateCutoffDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamRateCutoffDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamRateCutoffDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamRateCutoffDateOffsetUnit() {
    return isSetField(40782);
  }

  public void set(quickfix.field.PaymentStreamRateCutoffDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamRateCutoffDateOffsetDayType get(quickfix.field.PaymentStreamRateCutoffDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamRateCutoffDateOffsetDayType getPaymentStreamRateCutoffDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamRateCutoffDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamRateCutoffDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamRateCutoffDateOffsetDayType() {
    return isSetField(40783);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamFixingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFixingDateGrp get(quickfix.fixlatest.component.PaymentStreamFixingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFixingDateGrp getPaymentStreamFixingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFixingDateGrp());
  }

  public void set(quickfix.field.NoPaymentStreamFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamFixingDates get(quickfix.field.NoPaymentStreamFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamFixingDates getNoPaymentStreamFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamFixingDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamFixingDates() {
    return isSetField(42660);
  }

public static class NoPaymentStreamFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42661, 42662, 0};

  public NoPaymentStreamFixingDates() {
    super(42660, 42661, ORDER);
  }

  public void set(quickfix.field.PaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDate get(quickfix.field.PaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDate getPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDate() {
    return isSetField(42661);
  }

  public void set(quickfix.field.PaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFixingDateType get(quickfix.field.PaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFixingDateType getPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFixingDateType() {
    return isSetField(42662);
  }
}
}
