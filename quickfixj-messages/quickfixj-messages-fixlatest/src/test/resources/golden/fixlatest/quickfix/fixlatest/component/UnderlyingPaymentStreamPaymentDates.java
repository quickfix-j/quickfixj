/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamPaymentDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40581, 40583, 40584, 40585, 40586, 40587, 40588, 40589, 40590, 40591, 41940, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamPaymentDates() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessDayConvention get(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessDayConvention getUnderlyingPaymentStreamPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateBusinessDayConvention() {
    return isSetField(40581);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateBusinessCenterGrp getUnderlyingPaymentStreamPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters getNoUnderlyingPaymentStreamPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPaymentDateBusinessCenters() {
    return isSetField(40969);
  }

public static class NoUnderlyingPaymentStreamPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40582, 0};

  public NoUnderlyingPaymentStreamPaymentDateBusinessCenters() {
    super(40969, 40582, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter getUnderlyingPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40582);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateGrp getUnderlyingPaymentStreamPaymentDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamPaymentDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDates get(quickfix.field.NoUnderlyingPaymentStreamPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDates getNoUnderlyingPaymentStreamPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPaymentDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPaymentDates() {
    return isSetField(41937);
  }

public static class NoUnderlyingPaymentStreamPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41938, 41939, 0};

  public NoUnderlyingPaymentStreamPaymentDates() {
    super(41937, 41938, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDate get(quickfix.field.UnderlyingPaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDate getUnderlyingPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDate() {
    return isSetField(41938);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateType get(quickfix.field.UnderlyingPaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateType getUnderlyingPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateType() {
    return isSetField(41939);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentFrequencyPeriod get(quickfix.field.UnderlyingPaymentStreamPaymentFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentFrequencyPeriod getUnderlyingPaymentStreamPaymentFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentFrequencyPeriod() {
    return isSetField(40583);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentFrequencyUnit get(quickfix.field.UnderlyingPaymentStreamPaymentFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentFrequencyUnit getUnderlyingPaymentStreamPaymentFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentFrequencyUnit() {
    return isSetField(40584);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentRollConvention get(quickfix.field.UnderlyingPaymentStreamPaymentRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentRollConvention getUnderlyingPaymentStreamPaymentRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentRollConvention() {
    return isSetField(40585);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFirstPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFirstPaymentDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamFirstPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFirstPaymentDateUnadjusted getUnderlyingPaymentStreamFirstPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFirstPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFirstPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFirstPaymentDateUnadjusted() {
    return isSetField(40586);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamLastRegularPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamLastRegularPaymentDateUnadjusted get(quickfix.field.UnderlyingPaymentStreamLastRegularPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamLastRegularPaymentDateUnadjusted getUnderlyingPaymentStreamLastRegularPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamLastRegularPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamLastRegularPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamLastRegularPaymentDateUnadjusted() {
    return isSetField(40587);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentStreamPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateRelativeTo getUnderlyingPaymentStreamPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateRelativeTo() {
    return isSetField(40588);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetPeriod get(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetPeriod getUnderlyingPaymentStreamPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateOffsetPeriod() {
    return isSetField(40589);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetUnit get(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetUnit getUnderlyingPaymentStreamPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateOffsetUnit() {
    return isSetField(40590);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetDayType get(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetDayType getUnderlyingPaymentStreamPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateOffsetDayType() {
    return isSetField(40591);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator get(quickfix.field.UnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator getUnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamMasterAgreementPaymentDatesIndicator() {
    return isSetField(41940);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFinalPricePaymentDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFinalPricePaymentDate get(quickfix.fixlatest.component.UnderlyingPaymentStreamFinalPricePaymentDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFinalPricePaymentDate getUnderlyingPaymentStreamFinalPricePaymentDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFinalPricePaymentDate());
  }
}
