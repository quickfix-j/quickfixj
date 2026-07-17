/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41379, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventPeriodGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriods get(quickfix.field.NoLegComplexEventPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriods getNoLegComplexEventPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriods());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriods() {
    return isSetField(41379);
  }

public static class NoLegComplexEventPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41380, 41381, 41400, 41376, 41363, 0};

  public NoLegComplexEventPeriods() {
    super(41379, 41380, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodType get(quickfix.field.LegComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodType getLegComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodType() {
    return isSetField(41380);
  }

  public void set(quickfix.field.LegComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventBusinessCenter get(quickfix.field.LegComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventBusinessCenter getLegComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventBusinessCenter() {
    return isSetField(41381);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp get(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp getLegComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventScheduleGrp());
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

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp get(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp getLegComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes get(quickfix.field.NoLegComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes getNoLegComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriodDateTimes() {
    return isSetField(41376);
  }

public static class NoLegComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41377, 41378, 0};

  public NoLegComplexEventPeriodDateTimes() {
    super(41376, 41377, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp getLegComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoLegComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventAveragingObservations get(quickfix.field.NoLegComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventAveragingObservations getNoLegComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventAveragingObservations() {
    return isSetField(41363);
  }

public static class NoLegComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41364, 41365, 0};

  public NoLegComplexEventAveragingObservations() {
    super(41363, 41364, ORDER);
  }

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}
}

  public void set(quickfix.field.LegComplexEventPeriodType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodType get(quickfix.field.LegComplexEventPeriodType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodType getLegComplexEventPeriodType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodType());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodType() {
    return isSetField(41380);
  }

  public void set(quickfix.field.LegComplexEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventBusinessCenter get(quickfix.field.LegComplexEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventBusinessCenter getLegComplexEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegComplexEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventBusinessCenter() {
    return isSetField(41381);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp get(quickfix.fixlatest.component.LegComplexEventScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventScheduleGrp getLegComplexEventScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventScheduleGrp());
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

  public void set(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp get(quickfix.fixlatest.component.LegComplexEventPeriodDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventPeriodDateGrp getLegComplexEventPeriodDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventPeriodDateGrp());
  }

  public void set(quickfix.field.NoLegComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes get(quickfix.field.NoLegComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes getNoLegComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriodDateTimes() {
    return isSetField(41376);
  }

public static class NoLegComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41377, 41378, 0};

  public NoLegComplexEventPeriodDateTimes() {
    super(41376, 41377, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

  public void set(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp get(quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp getLegComplexEventAveragingObservationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventAveragingObservationGrp());
  }

  public void set(quickfix.field.NoLegComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventAveragingObservations get(quickfix.field.NoLegComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventAveragingObservations getNoLegComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventAveragingObservations() {
    return isSetField(41363);
  }

public static class NoLegComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41364, 41365, 0};

  public NoLegComplexEventAveragingObservations() {
    super(41363, 41364, ORDER);
  }

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}
}
