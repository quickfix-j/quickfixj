/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamPaymentDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40292, 40294, 40295, 40296, 40297, 40298, 40299, 40300, 40301, 40302, 41592, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamPaymentDates() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessDayConvention get(quickfix.field.LegPaymentStreamPaymentDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessDayConvention getLegPaymentStreamPaymentDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateBusinessDayConvention() {
    return isSetField(40292);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamPaymentDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamPaymentDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentStreamPaymentDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamPaymentDateBusinessCenterGrp getLegPaymentStreamPaymentDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamPaymentDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters get(quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters getNoLegPaymentStreamPaymentDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPaymentDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPaymentDateBusinessCenters() {
    return isSetField(40930);
  }

public static class NoLegPaymentStreamPaymentDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40293, 0};

  public NoLegPaymentStreamPaymentDateBusinessCenters() {
    super(40930, 40293, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessCenter get(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateBusinessCenter getLegPaymentStreamPaymentDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateBusinessCenter() {
    return isSetField(40293);
  }
}

  public void set(quickfix.fixlatest.component.LegPaymentStreamPaymentDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamPaymentDateGrp get(quickfix.fixlatest.component.LegPaymentStreamPaymentDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamPaymentDateGrp getLegPaymentStreamPaymentDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamPaymentDateGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPaymentDates get(quickfix.field.NoLegPaymentStreamPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPaymentDates getNoLegPaymentStreamPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPaymentDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPaymentDates() {
    return isSetField(41589);
  }

public static class NoLegPaymentStreamPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41590, 41591, 0};

  public NoLegPaymentStreamPaymentDates() {
    super(41589, 41590, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDate get(quickfix.field.LegPaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDate getLegPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDate() {
    return isSetField(41590);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateType get(quickfix.field.LegPaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateType getLegPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateType() {
    return isSetField(41591);
  }
}

  public void set(quickfix.field.LegPaymentStreamPaymentFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentFrequencyPeriod get(quickfix.field.LegPaymentStreamPaymentFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentFrequencyPeriod getLegPaymentStreamPaymentFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentFrequencyPeriod() {
    return isSetField(40294);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentFrequencyUnit get(quickfix.field.LegPaymentStreamPaymentFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentFrequencyUnit getLegPaymentStreamPaymentFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentFrequencyUnit() {
    return isSetField(40295);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentRollConvention get(quickfix.field.LegPaymentStreamPaymentRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentRollConvention getLegPaymentStreamPaymentRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentRollConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentRollConvention() {
    return isSetField(40296);
  }

  public void set(quickfix.field.LegPaymentStreamFirstPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFirstPaymentDateUnadjusted get(quickfix.field.LegPaymentStreamFirstPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFirstPaymentDateUnadjusted getLegPaymentStreamFirstPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFirstPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFirstPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFirstPaymentDateUnadjusted() {
    return isSetField(40297);
  }

  public void set(quickfix.field.LegPaymentStreamLastRegularPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamLastRegularPaymentDateUnadjusted get(quickfix.field.LegPaymentStreamLastRegularPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamLastRegularPaymentDateUnadjusted getLegPaymentStreamLastRegularPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamLastRegularPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamLastRegularPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamLastRegularPaymentDateUnadjusted() {
    return isSetField(40298);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateRelativeTo get(quickfix.field.LegPaymentStreamPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateRelativeTo getLegPaymentStreamPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateRelativeTo() {
    return isSetField(40299);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateOffsetPeriod get(quickfix.field.LegPaymentStreamPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateOffsetPeriod getLegPaymentStreamPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateOffsetPeriod() {
    return isSetField(40300);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateOffsetUnit get(quickfix.field.LegPaymentStreamPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateOffsetUnit getLegPaymentStreamPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateOffsetUnit() {
    return isSetField(40301);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateOffsetDayType get(quickfix.field.LegPaymentStreamPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateOffsetDayType getLegPaymentStreamPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateOffsetDayType() {
    return isSetField(40302);
  }

  public void set(quickfix.field.LegPaymentStreamMasterAgreementPaymentDatesIndicator value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamMasterAgreementPaymentDatesIndicator get(quickfix.field.LegPaymentStreamMasterAgreementPaymentDatesIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamMasterAgreementPaymentDatesIndicator getLegPaymentStreamMasterAgreementPaymentDatesIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamMasterAgreementPaymentDatesIndicator());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamMasterAgreementPaymentDatesIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamMasterAgreementPaymentDatesIndicator() {
    return isSetField(41592);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamFinalPricePaymentDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFinalPricePaymentDate get(quickfix.fixlatest.component.LegPaymentStreamFinalPricePaymentDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFinalPricePaymentDate getLegPaymentStreamFinalPricePaymentDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFinalPricePaymentDate());
  }
}
