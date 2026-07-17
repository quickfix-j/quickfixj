/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41729, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventPeriodGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods get(quickfix.field.NoUnderlyingComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriods getNoUnderlyingComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriods() {
    return isSetField(41729);
  }

public static class NoUnderlyingComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41730, 41731, 41750, 41726, 41713, 0};

  public NoUnderlyingComplexEventPeriods() {
    super(41729, 41730, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodType get(quickfix.field.UnderlyingComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodType getUnderlyingComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodType() {
    return isSetField(41730);
  }

  public void set(quickfix.field.UnderlyingComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter get(quickfix.field.UnderlyingComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter getUnderlyingComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventBusinessCenter() {
    return isSetField(41731);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp get(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp getUnderlyingComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules get(quickfix.field.NoUnderlyingComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules getNoUnderlyingComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventSchedules() {
    return isSetField(41750);
  }

public static class NoUnderlyingComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41751, 41752, 41753, 41754, 41755, 0};

  public NoUnderlyingComplexEventSchedules() {
    super(41750, 41751, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate get(quickfix.field.UnderlyingComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate getUnderlyingComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleStartDate() {
    return isSetField(41751);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate get(quickfix.field.UnderlyingComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate getUnderlyingComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleEndDate() {
    return isSetField(41752);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod get(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod getUnderlyingComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyPeriod() {
    return isSetField(41753);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit get(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit getUnderlyingComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyUnit() {
    return isSetField(41754);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention get(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention getUnderlyingComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleRollConvention() {
    return isSetField(41755);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp getUnderlyingComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes get(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes getNoUnderlyingComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriodDateTimes() {
    return isSetField(41726);
  }

public static class NoUnderlyingComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41727, 41728, 0};

  public NoUnderlyingComplexEventPeriodDateTimes() {
    super(41726, 41727, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp getUnderlyingComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations get(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations getNoUnderlyingComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventAveragingObservations() {
    return isSetField(41713);
  }

public static class NoUnderlyingComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41714, 41715, 0};

  public NoUnderlyingComplexEventAveragingObservations() {
    super(41713, 41714, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodType get(quickfix.field.UnderlyingComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodType getUnderlyingComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodType() {
    return isSetField(41730);
  }

  public void set(quickfix.field.UnderlyingComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter get(quickfix.field.UnderlyingComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventBusinessCenter getUnderlyingComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventBusinessCenter() {
    return isSetField(41731);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp get(quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp getUnderlyingComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules get(quickfix.field.NoUnderlyingComplexEventSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventSchedules getNoUnderlyingComplexEventSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventSchedules() {
    return isSetField(41750);
  }

public static class NoUnderlyingComplexEventSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41751, 41752, 41753, 41754, 41755, 0};

  public NoUnderlyingComplexEventSchedules() {
    super(41750, 41751, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate get(quickfix.field.UnderlyingComplexEventScheduleStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleStartDate getUnderlyingComplexEventScheduleStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleStartDate() {
    return isSetField(41751);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate get(quickfix.field.UnderlyingComplexEventScheduleEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleEndDate getUnderlyingComplexEventScheduleEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleEndDate() {
    return isSetField(41752);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod get(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod getUnderlyingComplexEventScheduleFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyPeriod() {
    return isSetField(41753);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit get(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit getUnderlyingComplexEventScheduleFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleFrequencyUnit() {
    return isSetField(41754);
  }

  public void set(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention get(quickfix.field.UnderlyingComplexEventScheduleRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventScheduleRollConvention getUnderlyingComplexEventScheduleRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventScheduleRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventScheduleRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventScheduleRollConvention() {
    return isSetField(41755);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp get(quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp getUnderlyingComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes get(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes getNoUnderlyingComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriodDateTimes() {
    return isSetField(41726);
  }

public static class NoUnderlyingComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41727, 41728, 0};

  public NoUnderlyingComplexEventPeriodDateTimes() {
    super(41726, 41727, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp getUnderlyingComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations get(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations getNoUnderlyingComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventAveragingObservations() {
    return isSetField(41713);
  }

public static class NoUnderlyingComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41714, 41715, 0};

  public NoUnderlyingComplexEventAveragingObservations() {
    super(41713, 41714, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}
}
