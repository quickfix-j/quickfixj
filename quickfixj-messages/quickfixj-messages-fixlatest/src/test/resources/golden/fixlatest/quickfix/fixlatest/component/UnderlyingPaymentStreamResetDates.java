/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamResetDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40592, 40593, 40595, 40596, 40597, 40598, 40599, 40601, 40602, 40603, 40604, 40605, 40606, 40608, 40609, 40610, 40611, 40612, 40613, 40614, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamResetDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamResetDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamResetDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateRelativeTo getUnderlyingPaymentStreamResetDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetDateRelativeTo() {
    return isSetField(40592);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamResetDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessDayConvention get(quickfix.field.UnderlyingPaymentStreamResetDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessDayConvention getUnderlyingPaymentStreamResetDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetDateBusinessDayConvention() {
    return isSetField(40593);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamResetDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamResetDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamResetDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamResetDateBusinessCenterGrp getUnderlyingPaymentStreamResetDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamResetDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters getNoUnderlyingPaymentStreamResetDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamResetDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamResetDateBusinessCenters() {
    return isSetField(40970);
  }

public static class NoUnderlyingPaymentStreamResetDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40594, 0};

  public NoUnderlyingPaymentStreamResetDateBusinessCenters() {
    super(40970, 40594, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter getUnderlyingPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetDateBusinessCenter() {
    return isSetField(40594);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamResetFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetFrequencyPeriod get(quickfix.field.UnderlyingPaymentStreamResetFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetFrequencyPeriod getUnderlyingPaymentStreamResetFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetFrequencyPeriod() {
    return isSetField(40595);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamResetFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetFrequencyUnit get(quickfix.field.UnderlyingPaymentStreamResetFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetFrequencyUnit getUnderlyingPaymentStreamResetFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetFrequencyUnit() {
    return isSetField(40596);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamResetWeeklyRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamResetWeeklyRollConvention get(quickfix.field.UnderlyingPaymentStreamResetWeeklyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamResetWeeklyRollConvention getUnderlyingPaymentStreamResetWeeklyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamResetWeeklyRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamResetWeeklyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamResetWeeklyRollConvention() {
    return isSetField(40597);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateRelativeTo getUnderlyingPaymentStreamInitialFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateRelativeTo() {
    return isSetField(40598);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessDayConvention get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessDayConvention getUnderlyingPaymentStreamInitialFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateBusinessDayConvention() {
    return isSetField(40599);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp getUnderlyingPaymentStreamInitialFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters getNoUnderlyingPaymentStreamInitialFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamInitialFixingDateBusinessCenters() {
    return isSetField(40971);
  }

public static class NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40600, 0};

  public NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters() {
    super(40971, 40600, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter getUnderlyingPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40600);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetPeriod getUnderlyingPaymentStreamInitialFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateOffsetPeriod() {
    return isSetField(40601);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetUnit getUnderlyingPaymentStreamInitialFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateOffsetUnit() {
    return isSetField(40602);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetDayType getUnderlyingPaymentStreamInitialFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateOffsetDayType() {
    return isSetField(40603);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateAdjusted get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateAdjusted getUnderlyingPaymentStreamInitialFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateAdjusted() {
    return isSetField(40604);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateRelativeTo getUnderlyingPaymentStreamFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateRelativeTo() {
    return isSetField(40605);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessDayConvention get(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessDayConvention getUnderlyingPaymentStreamFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateBusinessDayConvention() {
    return isSetField(40606);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateBusinessCenterGrp getUnderlyingPaymentStreamFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters getNoUnderlyingPaymentStreamFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamFixingDateBusinessCenters() {
    return isSetField(40972);
  }

public static class NoUnderlyingPaymentStreamFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40607, 0};

  public NoUnderlyingPaymentStreamFixingDateBusinessCenters() {
    super(40972, 40607, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter getUnderlyingPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40607);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateOffsetPeriod getUnderlyingPaymentStreamFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateOffsetPeriod() {
    return isSetField(40608);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateOffsetUnit getUnderlyingPaymentStreamFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateOffsetUnit() {
    return isSetField(40609);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateOffsetDayType getUnderlyingPaymentStreamFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateOffsetDayType() {
    return isSetField(40610);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateAdjusted get(quickfix.field.UnderlyingPaymentStreamFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateAdjusted getUnderlyingPaymentStreamFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateAdjusted() {
    return isSetField(40611);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetPeriod getUnderlyingPaymentStreamRateCutoffDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamRateCutoffDateOffsetPeriod() {
    return isSetField(40612);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetUnit getUnderlyingPaymentStreamRateCutoffDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamRateCutoffDateOffsetUnit() {
    return isSetField(40613);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetDayType getUnderlyingPaymentStreamRateCutoffDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamRateCutoffDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamRateCutoffDateOffsetDayType() {
    return isSetField(40614);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateGrp getUnderlyingPaymentStreamFixingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFixingDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDates get(quickfix.field.NoUnderlyingPaymentStreamFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamFixingDates getNoUnderlyingPaymentStreamFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamFixingDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamFixingDates() {
    return isSetField(42955);
  }

public static class NoUnderlyingPaymentStreamFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42956, 42957, 0};

  public NoUnderlyingPaymentStreamFixingDates() {
    super(42955, 42956, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDate get(quickfix.field.UnderlyingPaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDate getUnderlyingPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDate() {
    return isSetField(42956);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateType get(quickfix.field.UnderlyingPaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFixingDateType getUnderlyingPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFixingDateType() {
    return isSetField(42957);
  }
}
}
