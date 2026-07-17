/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41010, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventPeriodGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriods get(quickfix.field.NoComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriods getNoComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriods() {
    return isSetField(41010);
  }

public static class NoComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41011, 41012, 41031, 41007, 40994, 0};

  public NoComplexEventPeriods() {
    super(41010, 41011, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodType get(quickfix.field.ComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodType getComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodType() {
    return isSetField(41011);
  }

  public void set(quickfix.field.ComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventBusinessCenter get(quickfix.field.ComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventBusinessCenter getComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventBusinessCenter() {
    return isSetField(41012);
  }

  public void set(quickfix.fixlatest.component.ComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp get(quickfix.fixlatest.component.ComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp getComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventScheduleGrp());
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

  public void set(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp get(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp getComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriodDateTimes get(quickfix.field.NoComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriodDateTimes getNoComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriodDateTimes() {
    return isSetField(41007);
  }

public static class NoComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41008, 41009, 0};

  public NoComplexEventPeriodDateTimes() {
    super(41007, 41008, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp getComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventAveragingObservations get(quickfix.field.NoComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventAveragingObservations getNoComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventAveragingObservations() {
    return isSetField(40994);
  }

public static class NoComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40995, 40996, 0};

  public NoComplexEventAveragingObservations() {
    super(40994, 40995, ORDER);
  }

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}
}

  public void set(quickfix.field.ComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodType get(quickfix.field.ComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodType getComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodType() {
    return isSetField(41011);
  }

  public void set(quickfix.field.ComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventBusinessCenter get(quickfix.field.ComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventBusinessCenter getComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventBusinessCenter() {
    return isSetField(41012);
  }

  public void set(quickfix.fixlatest.component.ComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp get(quickfix.fixlatest.component.ComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventScheduleGrp getComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventScheduleGrp());
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

  public void set(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp get(quickfix.fixlatest.component.ComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventPeriodDateGrp getComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriodDateTimes get(quickfix.field.NoComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriodDateTimes getNoComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriodDateTimes() {
    return isSetField(41007);
  }

public static class NoComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41008, 41009, 0};

  public NoComplexEventPeriodDateTimes() {
    super(41007, 41008, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

  public void set(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.ComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventAveragingObservationGrp getComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventAveragingObservations get(quickfix.field.NoComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventAveragingObservations getNoComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventAveragingObservations() {
    return isSetField(40994);
  }

public static class NoComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40995, 40996, 0};

  public NoComplexEventAveragingObservations() {
    super(40994, 40995, ORDER);
  }

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}
}
