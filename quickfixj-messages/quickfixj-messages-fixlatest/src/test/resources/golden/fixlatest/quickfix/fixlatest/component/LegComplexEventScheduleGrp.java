/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41400, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventSchedules get(quickfix.field.NoLegComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventSchedules getNoLegComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventSchedules() {
    return isSetField(41400);
  }

public static class NoLegComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41401, 41402, 41403, 41404, 41405, 0};

  public NoLegComplexEventSchedules() {
    super(41400, 41401, ORDER);
  }

  public void set(quickfix.field.LegComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleStartDate get(quickfix.field.LegComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleStartDate getLegComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleStartDate() {
    return isSetField(41401);
  }

  public void set(quickfix.field.LegComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleEndDate get(quickfix.field.LegComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleEndDate getLegComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleEndDate() {
    return isSetField(41402);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod get(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod getLegComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyPeriod() {
    return isSetField(41403);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit get(quickfix.field.LegComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit getLegComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyUnit() {
    return isSetField(41404);
  }

  public void set(quickfix.field.LegComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleRollConvention get(quickfix.field.LegComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleRollConvention getLegComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleRollConvention() {
    return isSetField(41405);
  }
}

  public void set(quickfix.field.LegComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleStartDate get(quickfix.field.LegComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleStartDate getLegComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleStartDate() {
    return isSetField(41401);
  }

  public void set(quickfix.field.LegComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleEndDate get(quickfix.field.LegComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleEndDate getLegComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleEndDate() {
    return isSetField(41402);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod get(quickfix.field.LegComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyPeriod getLegComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyPeriod() {
    return isSetField(41403);
  }

  public void set(quickfix.field.LegComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit get(quickfix.field.LegComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleFrequencyUnit getLegComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleFrequencyUnit() {
    return isSetField(41404);
  }

  public void set(quickfix.field.LegComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventScheduleRollConvention get(quickfix.field.LegComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventScheduleRollConvention getLegComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.LegComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventScheduleRollConvention() {
    return isSetField(41405);
  }
}
