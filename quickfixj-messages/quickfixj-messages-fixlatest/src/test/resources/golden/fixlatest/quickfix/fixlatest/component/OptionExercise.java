/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExercise extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExercise() {
    super();
  }

  public void set(quickfix.field.ExerciseDesc value) {
    setField(value);
  }

  public quickfix.field.ExerciseDesc get(quickfix.field.ExerciseDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExerciseDesc getExerciseDesc() throws FieldNotFound {
    return get(new quickfix.field.ExerciseDesc());
  }

  public boolean isSet(quickfix.field.ExerciseDesc field) {
    return isSetField(field);
  }

  public boolean isSetExerciseDesc() {
    return isSetField(41106);
  }

  public void set(quickfix.field.EncodedExerciseDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedExerciseDescLen get(quickfix.field.EncodedExerciseDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedExerciseDescLen getEncodedExerciseDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedExerciseDescLen());
  }

  public boolean isSet(quickfix.field.EncodedExerciseDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedExerciseDescLen() {
    return isSetField(41107);
  }

  public void set(quickfix.field.EncodedExerciseDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedExerciseDesc get(quickfix.field.EncodedExerciseDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedExerciseDesc getEncodedExerciseDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedExerciseDesc());
  }

  public boolean isSet(quickfix.field.EncodedExerciseDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedExerciseDesc() {
    return isSetField(41108);
  }

  public void set(quickfix.field.AutomaticExerciseIndicator value) {
    setField(value);
  }

  public quickfix.field.AutomaticExerciseIndicator get(quickfix.field.AutomaticExerciseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AutomaticExerciseIndicator getAutomaticExerciseIndicator() throws FieldNotFound {
    return get(new quickfix.field.AutomaticExerciseIndicator());
  }

  public boolean isSet(quickfix.field.AutomaticExerciseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAutomaticExerciseIndicator() {
    return isSetField(41109);
  }

  public void set(quickfix.field.AutomaticExerciseThresholdRate value) {
    setField(value);
  }

  public quickfix.field.AutomaticExerciseThresholdRate get(quickfix.field.AutomaticExerciseThresholdRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AutomaticExerciseThresholdRate getAutomaticExerciseThresholdRate() throws FieldNotFound {
    return get(new quickfix.field.AutomaticExerciseThresholdRate());
  }

  public boolean isSet(quickfix.field.AutomaticExerciseThresholdRate field) {
    return isSetField(field);
  }

  public boolean isSetAutomaticExerciseThresholdRate() {
    return isSetField(41110);
  }

  public void set(quickfix.field.ExerciseConfirmationMethod value) {
    setField(value);
  }

  public quickfix.field.ExerciseConfirmationMethod get(quickfix.field.ExerciseConfirmationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExerciseConfirmationMethod getExerciseConfirmationMethod() throws FieldNotFound {
    return get(new quickfix.field.ExerciseConfirmationMethod());
  }

  public boolean isSet(quickfix.field.ExerciseConfirmationMethod field) {
    return isSetField(field);
  }

  public boolean isSetExerciseConfirmationMethod() {
    return isSetField(41111);
  }

  public void set(quickfix.field.ManualNoticeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ManualNoticeBusinessCenter get(quickfix.field.ManualNoticeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ManualNoticeBusinessCenter getManualNoticeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ManualNoticeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ManualNoticeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetManualNoticeBusinessCenter() {
    return isSetField(41112);
  }

  public void set(quickfix.field.FallbackExerciseIndicator value) {
    setField(value);
  }

  public quickfix.field.FallbackExerciseIndicator get(quickfix.field.FallbackExerciseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FallbackExerciseIndicator getFallbackExerciseIndicator() throws FieldNotFound {
    return get(new quickfix.field.FallbackExerciseIndicator());
  }

  public boolean isSet(quickfix.field.FallbackExerciseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFallbackExerciseIndicator() {
    return isSetField(41113);
  }

  public void set(quickfix.field.LimitedRightToConfirmIndicator value) {
    setField(value);
  }

  public quickfix.field.LimitedRightToConfirmIndicator get(quickfix.field.LimitedRightToConfirmIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LimitedRightToConfirmIndicator getLimitedRightToConfirmIndicator() throws FieldNotFound {
    return get(new quickfix.field.LimitedRightToConfirmIndicator());
  }

  public boolean isSet(quickfix.field.LimitedRightToConfirmIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLimitedRightToConfirmIndicator() {
    return isSetField(41114);
  }

  public void set(quickfix.field.ExerciseSplitTicketIndicator value) {
    setField(value);
  }

  public quickfix.field.ExerciseSplitTicketIndicator get(quickfix.field.ExerciseSplitTicketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExerciseSplitTicketIndicator getExerciseSplitTicketIndicator() throws FieldNotFound {
    return get(new quickfix.field.ExerciseSplitTicketIndicator());
  }

  public boolean isSet(quickfix.field.ExerciseSplitTicketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetExerciseSplitTicketIndicator() {
    return isSetField(41115);
  }

  public void set(quickfix.field.SettlMethodElectingPartySide value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectingPartySide get(quickfix.field.SettlMethodElectingPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectingPartySide getSettlMethodElectingPartySide() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectingPartySide());
  }

  public boolean isSet(quickfix.field.SettlMethodElectingPartySide field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectingPartySide() {
    return isSetField(42590);
  }

  public void set(quickfix.fixlatest.component.SettlMethodElectionDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlMethodElectionDate get(quickfix.fixlatest.component.SettlMethodElectionDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlMethodElectionDate getSettlMethodElectionDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlMethodElectionDate());
  }

  public void set(quickfix.fixlatest.component.OptionExerciseDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseDates get(quickfix.fixlatest.component.OptionExerciseDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseDates getOptionExerciseDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseDates());
  }

  public void set(quickfix.fixlatest.component.OptionExerciseExpiration component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseExpiration get(quickfix.fixlatest.component.OptionExerciseExpiration component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseExpiration getOptionExerciseExpirationComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseExpiration());
  }

  public void set(quickfix.fixlatest.component.OptionExerciseMakeWholeProvision component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseMakeWholeProvision get(quickfix.fixlatest.component.OptionExerciseMakeWholeProvision component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseMakeWholeProvision getOptionExerciseMakeWholeProvisionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseMakeWholeProvision());
  }
}
