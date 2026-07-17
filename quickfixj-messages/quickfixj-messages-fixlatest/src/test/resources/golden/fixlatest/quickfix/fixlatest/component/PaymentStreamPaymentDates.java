/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamPaymentDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40751, 40753, 40754, 40755, 40756, 40757, 40758, 40759, 40760, 40920, 41223, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamPaymentDates() {
    super();
  }

  public void set(quickfix.field.PaymentStreamPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessDayConvention get(quickfix.field.PaymentStreamPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessDayConvention getPaymentStreamPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateBusinessDayConvention() {
    return isSetField(40751);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentStreamPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamPaymentDateBusinessCenterGrp getPaymentStreamPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentStreamPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPaymentDateBusinessCenters get(quickfix.field.NoPaymentStreamPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPaymentDateBusinessCenters getNoPaymentStreamPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPaymentDateBusinessCenters() {
    return isSetField(40947);
  }

public static class NoPaymentStreamPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40752, 0};

  public NoPaymentStreamPaymentDateBusinessCenters() {
    super(40947, 40752, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessCenter get(quickfix.field.PaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateBusinessCenter getPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40752);
  }
}

  public void set(quickfix.fixlatest.component.PaymentStreamPaymentDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamPaymentDateGrp get(quickfix.fixlatest.component.PaymentStreamPaymentDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamPaymentDateGrp getPaymentStreamPaymentDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamPaymentDateGrp());
  }

  public void set(quickfix.field.NoPaymentStreamPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamPaymentDates get(quickfix.field.NoPaymentStreamPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamPaymentDates getNoPaymentStreamPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamPaymentDates());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamPaymentDates() {
    return isSetField(41220);
  }

public static class NoPaymentStreamPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41221, 41222, 0};

  public NoPaymentStreamPaymentDates() {
    super(41220, 41221, ORDER);
  }

  public void set(quickfix.field.PaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDate get(quickfix.field.PaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDate getPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDate() {
    return isSetField(41221);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateType get(quickfix.field.PaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateType getPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateType() {
    return isSetField(41222);
  }
}

  public void set(quickfix.field.PaymentStreamPaymentFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentFrequencyPeriod get(quickfix.field.PaymentStreamPaymentFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentFrequencyPeriod getPaymentStreamPaymentFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentFrequencyPeriod() {
    return isSetField(40753);
  }

  public void set(quickfix.field.PaymentStreamPaymentFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentFrequencyUnit get(quickfix.field.PaymentStreamPaymentFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentFrequencyUnit getPaymentStreamPaymentFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentFrequencyUnit() {
    return isSetField(40754);
  }

  public void set(quickfix.field.PaymentStreamPaymentRollConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentRollConvention get(quickfix.field.PaymentStreamPaymentRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentRollConvention getPaymentStreamPaymentRollConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentRollConvention());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentRollConvention() {
    return isSetField(40755);
  }

  public void set(quickfix.field.PaymentStreamFirstPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFirstPaymentDateUnadjusted get(quickfix.field.PaymentStreamFirstPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFirstPaymentDateUnadjusted getPaymentStreamFirstPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFirstPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamFirstPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFirstPaymentDateUnadjusted() {
    return isSetField(40756);
  }

  public void set(quickfix.field.PaymentStreamLastRegularPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamLastRegularPaymentDateUnadjusted get(quickfix.field.PaymentStreamLastRegularPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamLastRegularPaymentDateUnadjusted getPaymentStreamLastRegularPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamLastRegularPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentStreamLastRegularPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamLastRegularPaymentDateUnadjusted() {
    return isSetField(40757);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateRelativeTo get(quickfix.field.PaymentStreamPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateRelativeTo getPaymentStreamPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateRelativeTo() {
    return isSetField(40758);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateOffsetPeriod get(quickfix.field.PaymentStreamPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateOffsetPeriod getPaymentStreamPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateOffsetPeriod() {
    return isSetField(40759);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateOffsetUnit get(quickfix.field.PaymentStreamPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateOffsetUnit getPaymentStreamPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateOffsetUnit() {
    return isSetField(40760);
  }

  public void set(quickfix.field.PaymentStreamPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamPaymentDateOffsetDayType get(quickfix.field.PaymentStreamPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamPaymentDateOffsetDayType getPaymentStreamPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentStreamPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamPaymentDateOffsetDayType() {
    return isSetField(40920);
  }

  public void set(quickfix.field.PaymentStreamMasterAgreementPaymentDatesIndicator value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamMasterAgreementPaymentDatesIndicator get(quickfix.field.PaymentStreamMasterAgreementPaymentDatesIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamMasterAgreementPaymentDatesIndicator getPaymentStreamMasterAgreementPaymentDatesIndicator() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamMasterAgreementPaymentDatesIndicator());
  }

  public boolean isSet(quickfix.field.PaymentStreamMasterAgreementPaymentDatesIndicator field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamMasterAgreementPaymentDatesIndicator() {
    return isSetField(41223);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamFinalPricePaymentDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFinalPricePaymentDate get(quickfix.fixlatest.component.PaymentStreamFinalPricePaymentDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFinalPricePaymentDate getPaymentStreamFinalPricePaymentDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFinalPricePaymentDate());
  }
}
