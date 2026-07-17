/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingOptionExercise extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingOptionExercise() {
    super();
  }

  public void set(quickfix.field.UnderlyingExerciseDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExerciseDesc get(quickfix.field.UnderlyingExerciseDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExerciseDesc getUnderlyingExerciseDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExerciseDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingExerciseDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExerciseDesc() {
    return isSetField(41810);
  }

  public void set(quickfix.field.EncodedUnderlyingExerciseDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingExerciseDescLen get(quickfix.field.EncodedUnderlyingExerciseDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingExerciseDescLen getEncodedUnderlyingExerciseDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingExerciseDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingExerciseDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingExerciseDescLen() {
    return isSetField(41811);
  }

  public void set(quickfix.field.EncodedUnderlyingExerciseDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingExerciseDesc get(quickfix.field.EncodedUnderlyingExerciseDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingExerciseDesc getEncodedUnderlyingExerciseDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingExerciseDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingExerciseDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingExerciseDesc() {
    return isSetField(41812);
  }

  public void set(quickfix.field.UnderlyingAutomaticExerciseIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAutomaticExerciseIndicator get(quickfix.field.UnderlyingAutomaticExerciseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAutomaticExerciseIndicator getUnderlyingAutomaticExerciseIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAutomaticExerciseIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAutomaticExerciseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAutomaticExerciseIndicator() {
    return isSetField(41813);
  }

  public void set(quickfix.field.UnderlyingAutomaticExerciseThresholdRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAutomaticExerciseThresholdRate get(quickfix.field.UnderlyingAutomaticExerciseThresholdRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAutomaticExerciseThresholdRate getUnderlyingAutomaticExerciseThresholdRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAutomaticExerciseThresholdRate());
  }

  public boolean isSet(quickfix.field.UnderlyingAutomaticExerciseThresholdRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAutomaticExerciseThresholdRate() {
    return isSetField(41814);
  }

  public void set(quickfix.field.UnderlyingExerciseConfirmationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExerciseConfirmationMethod get(quickfix.field.UnderlyingExerciseConfirmationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExerciseConfirmationMethod getUnderlyingExerciseConfirmationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExerciseConfirmationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingExerciseConfirmationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExerciseConfirmationMethod() {
    return isSetField(41815);
  }

  public void set(quickfix.field.UnderlyingManualNoticeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingManualNoticeBusinessCenter get(quickfix.field.UnderlyingManualNoticeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingManualNoticeBusinessCenter getUnderlyingManualNoticeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingManualNoticeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingManualNoticeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingManualNoticeBusinessCenter() {
    return isSetField(41816);
  }

  public void set(quickfix.field.UnderlyingFallbackExerciseIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingFallbackExerciseIndicator get(quickfix.field.UnderlyingFallbackExerciseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFallbackExerciseIndicator getUnderlyingFallbackExerciseIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingFallbackExerciseIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingFallbackExerciseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFallbackExerciseIndicator() {
    return isSetField(41817);
  }

  public void set(quickfix.field.UnderlyingLimitedRightToConfirmIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingLimitedRightToConfirmIndicator get(quickfix.field.UnderlyingLimitedRightToConfirmIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLimitedRightToConfirmIndicator getUnderlyingLimitedRightToConfirmIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingLimitedRightToConfirmIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingLimitedRightToConfirmIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLimitedRightToConfirmIndicator() {
    return isSetField(41818);
  }

  public void set(quickfix.field.UnderlyingExerciseSplitTicketIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExerciseSplitTicketIndicator get(quickfix.field.UnderlyingExerciseSplitTicketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExerciseSplitTicketIndicator getUnderlyingExerciseSplitTicketIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExerciseSplitTicketIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingExerciseSplitTicketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExerciseSplitTicketIndicator() {
    return isSetField(41819);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectingPartySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectingPartySide get(quickfix.field.UnderlyingSettlMethodElectingPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectingPartySide getUnderlyingSettlMethodElectingPartySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectingPartySide());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectingPartySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectingPartySide() {
    return isSetField(42887);
  }

  public void set(quickfix.fixlatest.component.UnderlyingSettlMethodElectionDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingSettlMethodElectionDate get(quickfix.fixlatest.component.UnderlyingSettlMethodElectionDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingSettlMethodElectionDate getUnderlyingSettlMethodElectionDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingSettlMethodElectionDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseDates get(quickfix.fixlatest.component.UnderlyingOptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseDates getUnderlyingOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseExpiration component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseExpiration get(quickfix.fixlatest.component.UnderlyingOptionExerciseExpiration component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseExpiration getUnderlyingOptionExerciseExpirationComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseExpiration());
  }

  public void set(quickfix.fixlatest.component.UnderlyingOptionExerciseMakeWholeProvision component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseMakeWholeProvision get(quickfix.fixlatest.component.UnderlyingOptionExerciseMakeWholeProvision component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingOptionExerciseMakeWholeProvision getUnderlyingOptionExerciseMakeWholeProvisionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingOptionExerciseMakeWholeProvision());
  }
}
