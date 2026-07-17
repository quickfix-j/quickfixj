/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2250, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventDates() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventDates get(quickfix.field.NoLegComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventDates getNoLegComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventDates() {
    return isSetField(2250);
  }

public static class NoLegComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2251, 2252, 2253, 0};

  public NoLegComplexEventDates() {
    super(2250, 2251, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartDate get(quickfix.field.LegComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartDate getLegComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartDate() {
    return isSetField(2251);
  }

  public void set(quickfix.field.LegComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndDate get(quickfix.field.LegComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndDate getLegComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndDate() {
    return isSetField(2252);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventTimes get(quickfix.fixlatest.component.LegComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventTimes getLegComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventTimes());
  }

  public void set(quickfix.field.NoLegComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventTimes get(quickfix.field.NoLegComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventTimes getNoLegComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventTimes() {
    return isSetField(2253);
  }

public static class NoLegComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2204, 2247, 0};

  public NoLegComplexEventTimes() {
    super(2253, 2204, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}
}

  public void set(quickfix.field.LegComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartDate get(quickfix.field.LegComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartDate getLegComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartDate() {
    return isSetField(2251);
  }

  public void set(quickfix.field.LegComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndDate get(quickfix.field.LegComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndDate getLegComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndDate() {
    return isSetField(2252);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventTimes get(quickfix.fixlatest.component.LegComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventTimes getLegComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventTimes());
  }

  public void set(quickfix.field.NoLegComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventTimes get(quickfix.field.NoLegComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventTimes getNoLegComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventTimes() {
    return isSetField(2253);
  }

public static class NoLegComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2204, 2247, 0};

  public NoLegComplexEventTimes() {
    super(2253, 2204, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}
}
