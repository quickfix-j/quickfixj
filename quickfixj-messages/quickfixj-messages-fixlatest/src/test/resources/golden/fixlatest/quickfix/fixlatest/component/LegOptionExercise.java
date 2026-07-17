/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegOptionExercise extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41481, 41482, 41483, 41484, 41485, 41486, 41487, 41488, 41489, 41490, 42391, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegOptionExercise() {
    super();
  }

  public void set(quickfix.field.LegExerciseDesc value) {
    setField(value);
  }

  public quickfix.field.LegExerciseDesc get(quickfix.field.LegExerciseDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExerciseDesc getLegExerciseDesc() throws FieldNotFound {
    return get(new quickfix.field.LegExerciseDesc());
  }

  public boolean isSet(quickfix.field.LegExerciseDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegExerciseDesc() {
    return isSetField(41481);
  }

  public void set(quickfix.field.EncodedLegExerciseDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegExerciseDescLen get(quickfix.field.EncodedLegExerciseDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegExerciseDescLen getEncodedLegExerciseDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegExerciseDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegExerciseDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegExerciseDescLen() {
    return isSetField(41482);
  }

  public void set(quickfix.field.EncodedLegExerciseDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegExerciseDesc get(quickfix.field.EncodedLegExerciseDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegExerciseDesc getEncodedLegExerciseDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegExerciseDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegExerciseDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegExerciseDesc() {
    return isSetField(41483);
  }

  public void set(quickfix.field.LegAutomaticExerciseIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAutomaticExerciseIndicator get(quickfix.field.LegAutomaticExerciseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAutomaticExerciseIndicator getLegAutomaticExerciseIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAutomaticExerciseIndicator());
  }

  public boolean isSet(quickfix.field.LegAutomaticExerciseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAutomaticExerciseIndicator() {
    return isSetField(41484);
  }

  public void set(quickfix.field.LegAutomaticExerciseThresholdRate value) {
    setField(value);
  }

  public quickfix.field.LegAutomaticExerciseThresholdRate get(quickfix.field.LegAutomaticExerciseThresholdRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAutomaticExerciseThresholdRate getLegAutomaticExerciseThresholdRate() throws FieldNotFound {
    return get(new quickfix.field.LegAutomaticExerciseThresholdRate());
  }

  public boolean isSet(quickfix.field.LegAutomaticExerciseThresholdRate field) {
    return isSetField(field);
  }

  public boolean isSetLegAutomaticExerciseThresholdRate() {
    return isSetField(41485);
  }

  public void set(quickfix.field.LegExerciseConfirmationMethod value) {
    setField(value);
  }

  public quickfix.field.LegExerciseConfirmationMethod get(quickfix.field.LegExerciseConfirmationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExerciseConfirmationMethod getLegExerciseConfirmationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegExerciseConfirmationMethod());
  }

  public boolean isSet(quickfix.field.LegExerciseConfirmationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegExerciseConfirmationMethod() {
    return isSetField(41486);
  }

  public void set(quickfix.field.LegManualNoticeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegManualNoticeBusinessCenter get(quickfix.field.LegManualNoticeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegManualNoticeBusinessCenter getLegManualNoticeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegManualNoticeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegManualNoticeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegManualNoticeBusinessCenter() {
    return isSetField(41487);
  }

  public void set(quickfix.field.LegFallbackExerciseIndicator value) {
    setField(value);
  }

  public quickfix.field.LegFallbackExerciseIndicator get(quickfix.field.LegFallbackExerciseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFallbackExerciseIndicator getLegFallbackExerciseIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegFallbackExerciseIndicator());
  }

  public boolean isSet(quickfix.field.LegFallbackExerciseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegFallbackExerciseIndicator() {
    return isSetField(41488);
  }

  public void set(quickfix.field.LegLimitRightToConfirmIndicator value) {
    setField(value);
  }

  public quickfix.field.LegLimitRightToConfirmIndicator get(quickfix.field.LegLimitRightToConfirmIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegLimitRightToConfirmIndicator getLegLimitRightToConfirmIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegLimitRightToConfirmIndicator());
  }

  public boolean isSet(quickfix.field.LegLimitRightToConfirmIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegLimitRightToConfirmIndicator() {
    return isSetField(41489);
  }

  public void set(quickfix.field.LegExerciseSplitTicketIndicator value) {
    setField(value);
  }

  public quickfix.field.LegExerciseSplitTicketIndicator get(quickfix.field.LegExerciseSplitTicketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExerciseSplitTicketIndicator getLegExerciseSplitTicketIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegExerciseSplitTicketIndicator());
  }

  public boolean isSet(quickfix.field.LegExerciseSplitTicketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegExerciseSplitTicketIndicator() {
    return isSetField(41490);
  }

  public void set(quickfix.field.LegSettlMethodElectingPartySide value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectingPartySide get(quickfix.field.LegSettlMethodElectingPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectingPartySide getLegSettlMethodElectingPartySide() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectingPartySide());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectingPartySide field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectingPartySide() {
    return isSetField(42391);
  }

  public void set(quickfix.fixlatest.component.LegSettlMethodElectionDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegSettlMethodElectionDate get(quickfix.fixlatest.component.LegSettlMethodElectionDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegSettlMethodElectionDate getLegSettlMethodElectionDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegSettlMethodElectionDate());
  }

  public void set(quickfix.fixlatest.component.LegOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseDates get(quickfix.fixlatest.component.LegOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseDates getLegOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.LegOptionExerciseExpiration component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseExpiration get(quickfix.fixlatest.component.LegOptionExerciseExpiration component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseExpiration getLegOptionExerciseExpirationComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseExpiration());
  }

  public void set(quickfix.fixlatest.component.LegOptionExerciseMakeWholeProvision component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegOptionExerciseMakeWholeProvision get(quickfix.fixlatest.component.LegOptionExerciseMakeWholeProvision component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegOptionExerciseMakeWholeProvision getLegOptionExerciseMakeWholeProvisionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegOptionExerciseMakeWholeProvision());
  }
}
