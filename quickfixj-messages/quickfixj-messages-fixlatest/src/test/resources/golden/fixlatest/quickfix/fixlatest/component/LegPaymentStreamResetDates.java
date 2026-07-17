/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamResetDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40303, 40304, 40306, 40307, 40308, 40309, 40310, 40312, 40313, 40314, 40315, 40316, 40317, 40319, 40320, 40321, 40322, 40323, 40324, 40325, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamResetDates() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamResetDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetDateRelativeTo get(quickfix.field.LegPaymentStreamResetDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetDateRelativeTo getLegPaymentStreamResetDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetDateRelativeTo() {
    return isSetField(40303);
  }

  public void set(quickfix.field.LegPaymentStreamResetDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessDayConvention get(quickfix.field.LegPaymentStreamResetDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessDayConvention getLegPaymentStreamResetDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetDateBusinessDayConvention() {
    return isSetField(40304);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamResetDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamResetDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStreamResetDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamResetDateBusinessCenterGrp getLegPaymentStreamResetDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamResetDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamResetDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamResetDateBusinessCenters get(quickfix.field.NoLegPaymentStreamResetDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamResetDateBusinessCenters getNoLegPaymentStreamResetDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamResetDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamResetDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamResetDateBusinessCenters() {
    return isSetField(40931);
  }

public static class NoLegPaymentStreamResetDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40305, 0};

  public NoLegPaymentStreamResetDateBusinessCenters() {
    super(40931, 40305, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamResetDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessCenter get(quickfix.field.LegPaymentStreamResetDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetDateBusinessCenter getLegPaymentStreamResetDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetDateBusinessCenter() {
    return isSetField(40305);
  }
}

  public void set(quickfix.field.LegPaymentStreamResetFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetFrequencyPeriod get(quickfix.field.LegPaymentStreamResetFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetFrequencyPeriod getLegPaymentStreamResetFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetFrequencyPeriod() {
    return isSetField(40306);
  }

  public void set(quickfix.field.LegPaymentStreamResetFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetFrequencyUnit get(quickfix.field.LegPaymentStreamResetFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetFrequencyUnit getLegPaymentStreamResetFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetFrequencyUnit() {
    return isSetField(40307);
  }

  public void set(quickfix.field.LegPaymentStreamResetWeeklyRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamResetWeeklyRollConvention get(quickfix.field.LegPaymentStreamResetWeeklyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamResetWeeklyRollConvention getLegPaymentStreamResetWeeklyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamResetWeeklyRollConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamResetWeeklyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamResetWeeklyRollConvention() {
    return isSetField(40308);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateRelativeTo get(quickfix.field.LegPaymentStreamInitialFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateRelativeTo getLegPaymentStreamInitialFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateRelativeTo() {
    return isSetField(40309);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessDayConvention get(quickfix.field.LegPaymentStreamInitialFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessDayConvention getLegPaymentStreamInitialFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateBusinessDayConvention() {
    return isSetField(40310);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamInitialFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamInitialFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStreamInitialFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamInitialFixingDateBusinessCenterGrp getLegPaymentStreamInitialFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamInitialFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters get(quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters getNoLegPaymentStreamInitialFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamInitialFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamInitialFixingDateBusinessCenters() {
    return isSetField(40932);
  }

public static class NoLegPaymentStreamInitialFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40311, 0};

  public NoLegPaymentStreamInitialFixingDateBusinessCenters() {
    super(40932, 40311, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter getLegPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40311);
  }
}

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateOffsetPeriod get(quickfix.field.LegPaymentStreamInitialFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateOffsetPeriod getLegPaymentStreamInitialFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateOffsetPeriod() {
    return isSetField(40312);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateOffsetUnit get(quickfix.field.LegPaymentStreamInitialFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateOffsetUnit getLegPaymentStreamInitialFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateOffsetUnit() {
    return isSetField(40313);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateOffsetDayType get(quickfix.field.LegPaymentStreamInitialFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateOffsetDayType getLegPaymentStreamInitialFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateOffsetDayType() {
    return isSetField(40314);
  }

  public void set(quickfix.field.LegPaymentStreamInitialFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateAdjusted get(quickfix.field.LegPaymentStreamInitialFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamInitialFixingDateAdjusted getLegPaymentStreamInitialFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamInitialFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamInitialFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamInitialFixingDateAdjusted() {
    return isSetField(40315);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateRelativeTo get(quickfix.field.LegPaymentStreamFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateRelativeTo getLegPaymentStreamFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateRelativeTo() {
    return isSetField(40316);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessDayConvention get(quickfix.field.LegPaymentStreamFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessDayConvention getLegPaymentStreamFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateBusinessDayConvention() {
    return isSetField(40317);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStreamFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFixingDateBusinessCenterGrp getLegPaymentStreamFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters get(quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters getNoLegPaymentStreamFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamFixingDateBusinessCenters() {
    return isSetField(40933);
  }

public static class NoLegPaymentStreamFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40318, 0};

  public NoLegPaymentStreamFixingDateBusinessCenters() {
    super(40933, 40318, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessCenter get(quickfix.field.LegPaymentStreamFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateBusinessCenter getLegPaymentStreamFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateBusinessCenter() {
    return isSetField(40318);
  }
}

  public void set(quickfix.field.LegPaymentStreamFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateOffsetPeriod get(quickfix.field.LegPaymentStreamFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateOffsetPeriod getLegPaymentStreamFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateOffsetPeriod() {
    return isSetField(40319);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateOffsetUnit get(quickfix.field.LegPaymentStreamFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateOffsetUnit getLegPaymentStreamFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateOffsetUnit() {
    return isSetField(40320);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateOffsetDayType get(quickfix.field.LegPaymentStreamFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateOffsetDayType getLegPaymentStreamFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateOffsetDayType() {
    return isSetField(40321);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateAdjusted get(quickfix.field.LegPaymentStreamFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateAdjusted getLegPaymentStreamFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateAdjusted() {
    return isSetField(40322);
  }

  public void set(quickfix.field.LegPaymentStreamRateCutoffDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamRateCutoffDateOffsetPeriod get(quickfix.field.LegPaymentStreamRateCutoffDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamRateCutoffDateOffsetPeriod getLegPaymentStreamRateCutoffDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamRateCutoffDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamRateCutoffDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamRateCutoffDateOffsetPeriod() {
    return isSetField(40323);
  }

  public void set(quickfix.field.LegPaymentStreamRateCutoffDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamRateCutoffDateOffsetUnit get(quickfix.field.LegPaymentStreamRateCutoffDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamRateCutoffDateOffsetUnit getLegPaymentStreamRateCutoffDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamRateCutoffDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamRateCutoffDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamRateCutoffDateOffsetUnit() {
    return isSetField(40324);
  }

  public void set(quickfix.field.LegPaymentStreamRateCutoffDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamRateCutoffDateOffsetDayType get(quickfix.field.LegPaymentStreamRateCutoffDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamRateCutoffDateOffsetDayType getLegPaymentStreamRateCutoffDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamRateCutoffDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamRateCutoffDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamRateCutoffDateOffsetDayType() {
    return isSetField(40325);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamFixingDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFixingDateGrp get(quickfix.fixlatest.component.LegPaymentStreamFixingDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFixingDateGrp getLegPaymentStreamFixingDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFixingDateGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamFixingDates get(quickfix.field.NoLegPaymentStreamFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamFixingDates getNoLegPaymentStreamFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamFixingDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamFixingDates() {
    return isSetField(42459);
  }

public static class NoLegPaymentStreamFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42460, 42461, 0};

  public NoLegPaymentStreamFixingDates() {
    super(42459, 42460, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDate get(quickfix.field.LegPaymentStreamFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDate getLegPaymentStreamFixingDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDate() {
    return isSetField(42460);
  }

  public void set(quickfix.field.LegPaymentStreamFixingDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFixingDateType get(quickfix.field.LegPaymentStreamFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFixingDateType getLegPaymentStreamFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFixingDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFixingDateType() {
    return isSetField(42461);
  }
}
}
