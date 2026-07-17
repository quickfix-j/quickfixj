/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OptionExerciseExpiration extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41142, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public OptionExerciseExpiration() {
    super();
  }

  public void set(quickfix.field.OptionExerciseExpirationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessDayConvention get(quickfix.field.OptionExerciseExpirationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessDayConvention getOptionExerciseExpirationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateBusinessDayConvention() {
    return isSetField(41142);
  }

  public void set(quickfix.fixlatest.component.OptionExerciseExpirationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseExpirationDateBusinessCenterGrp get(quickfix.fixlatest.component.OptionExerciseExpirationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseExpirationDateBusinessCenterGrp getOptionExerciseExpirationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseExpirationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoOptionExerciseExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseExpirationDateBusinessCenters get(quickfix.field.NoOptionExerciseExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseExpirationDateBusinessCenters getNoOptionExerciseExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseExpirationDateBusinessCenters() {
    return isSetField(41140);
  }

public static class NoOptionExerciseExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41141, 0};

  public NoOptionExerciseExpirationDateBusinessCenters() {
    super(41140, 41141, ORDER);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessCenter get(quickfix.field.OptionExerciseExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateBusinessCenter getOptionExerciseExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateBusinessCenter() {
    return isSetField(41141);
  }
}

  public void set(quickfix.fixlatest.component.OptionExerciseExpirationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OptionExerciseExpirationDateGrp get(quickfix.fixlatest.component.OptionExerciseExpirationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OptionExerciseExpirationDateGrp getOptionExerciseExpirationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OptionExerciseExpirationDateGrp());
  }

  public void set(quickfix.field.NoOptionExerciseExpirationDates value) {
    setField(value);
  }

  public quickfix.field.NoOptionExerciseExpirationDates get(quickfix.field.NoOptionExerciseExpirationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOptionExerciseExpirationDates getNoOptionExerciseExpirationDates() throws FieldNotFound {
    return get(new quickfix.field.NoOptionExerciseExpirationDates());
  }

  public boolean isSet(quickfix.field.NoOptionExerciseExpirationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoOptionExerciseExpirationDates() {
    return isSetField(41152);
  }

public static class NoOptionExerciseExpirationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41153, 41154, 0};

  public NoOptionExerciseExpirationDates() {
    super(41152, 41153, ORDER);
  }

  public void set(quickfix.field.OptionExerciseExpirationDate value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDate get(quickfix.field.OptionExerciseExpirationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDate getOptionExerciseExpirationDate() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDate());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDate field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDate() {
    return isSetField(41153);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateType get(quickfix.field.OptionExerciseExpirationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateType getOptionExerciseExpirationDateType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateType());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateType() {
    return isSetField(41154);
  }
}

  public void set(quickfix.field.OptionExerciseExpirationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateRelativeTo get(quickfix.field.OptionExerciseExpirationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateRelativeTo getOptionExerciseExpirationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateRelativeTo() {
    return isSetField(41143);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateOffsetPeriod get(quickfix.field.OptionExerciseExpirationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateOffsetPeriod getOptionExerciseExpirationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateOffsetPeriod() {
    return isSetField(41144);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateOffsetUnit get(quickfix.field.OptionExerciseExpirationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateOffsetUnit getOptionExerciseExpirationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateOffsetUnit() {
    return isSetField(41145);
  }

  public void set(quickfix.field.OptionExerciseExpirationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationFrequencyPeriod get(quickfix.field.OptionExerciseExpirationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationFrequencyPeriod getOptionExerciseExpirationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationFrequencyPeriod() {
    return isSetField(41146);
  }

  public void set(quickfix.field.OptionExerciseExpirationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationFrequencyUnit get(quickfix.field.OptionExerciseExpirationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationFrequencyUnit getOptionExerciseExpirationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationFrequencyUnit() {
    return isSetField(41147);
  }

  public void set(quickfix.field.OptionExerciseExpirationRollConvention value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationRollConvention get(quickfix.field.OptionExerciseExpirationRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationRollConvention getOptionExerciseExpirationRollConvention() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationRollConvention());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationRollConvention() {
    return isSetField(41148);
  }

  public void set(quickfix.field.OptionExerciseExpirationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationDateOffsetDayType get(quickfix.field.OptionExerciseExpirationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationDateOffsetDayType getOptionExerciseExpirationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationDateOffsetDayType() {
    return isSetField(41149);
  }

  public void set(quickfix.field.OptionExerciseExpirationTime value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationTime get(quickfix.field.OptionExerciseExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationTime getOptionExerciseExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationTime());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationTime() {
    return isSetField(41150);
  }

  public void set(quickfix.field.OptionExerciseExpirationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.OptionExerciseExpirationTimeBusinessCenter get(quickfix.field.OptionExerciseExpirationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionExerciseExpirationTimeBusinessCenter getOptionExerciseExpirationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.OptionExerciseExpirationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.OptionExerciseExpirationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetOptionExerciseExpirationTimeBusinessCenter() {
    return isSetField(41151);
  }
}
