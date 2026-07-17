/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41031, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventSchedules get(quickfix.field.NoComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventSchedules getNoComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventSchedules() {
    return isSetField(41031);
  }

public static class NoComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41032, 41033, 41034, 41035, 41036, 0};

  public NoComplexEventSchedules() {
    super(41031, 41032, ORDER);
  }

  public void set(quickfix.field.ComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleStartDate get(quickfix.field.ComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleStartDate getComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleStartDate() {
    return isSetField(41032);
  }

  public void set(quickfix.field.ComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleEndDate get(quickfix.field.ComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleEndDate getComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleEndDate() {
    return isSetField(41033);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod get(quickfix.field.ComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod getComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyPeriod() {
    return isSetField(41034);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit get(quickfix.field.ComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit getComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyUnit() {
    return isSetField(41035);
  }

  public void set(quickfix.field.ComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleRollConvention get(quickfix.field.ComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleRollConvention getComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleRollConvention() {
    return isSetField(41036);
  }
}

  public void set(quickfix.field.ComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleStartDate get(quickfix.field.ComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleStartDate getComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleStartDate() {
    return isSetField(41032);
  }

  public void set(quickfix.field.ComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleEndDate get(quickfix.field.ComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleEndDate getComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleEndDate() {
    return isSetField(41033);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod get(quickfix.field.ComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyPeriod getComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyPeriod() {
    return isSetField(41034);
  }

  public void set(quickfix.field.ComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit get(quickfix.field.ComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleFrequencyUnit getComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleFrequencyUnit() {
    return isSetField(41035);
  }

  public void set(quickfix.field.ComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.ComplexEventScheduleRollConvention get(quickfix.field.ComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventScheduleRollConvention getComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.ComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventScheduleRollConvention() {
    return isSetField(41036);
  }
}
