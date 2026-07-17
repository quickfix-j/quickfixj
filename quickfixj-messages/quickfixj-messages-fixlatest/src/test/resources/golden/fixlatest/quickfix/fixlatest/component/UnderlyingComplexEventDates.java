/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2053, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventDates() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventDates get(quickfix.field.NoUnderlyingComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventDates getNoUnderlyingComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventDates() {
    return isSetField(2053);
  }

public static class NoUnderlyingComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2054, 2055, 2056, 0};

  public NoUnderlyingComplexEventDates() {
    super(2053, 2054, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartDate get(quickfix.field.UnderlyingComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartDate getUnderlyingComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartDate() {
    return isSetField(2054);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndDate get(quickfix.field.UnderlyingComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndDate getUnderlyingComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndDate() {
    return isSetField(2055);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes get(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes getUnderlyingComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventTimes());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventTimes get(quickfix.field.NoUnderlyingComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventTimes getNoUnderlyingComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventTimes() {
    return isSetField(2056);
  }

public static class NoUnderlyingComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2057, 2058, 0};

  public NoUnderlyingComplexEventTimes() {
    super(2056, 2057, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartDate get(quickfix.field.UnderlyingComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartDate getUnderlyingComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartDate() {
    return isSetField(2054);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndDate get(quickfix.field.UnderlyingComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndDate getUnderlyingComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndDate() {
    return isSetField(2055);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes get(quickfix.fixlatest.component.UnderlyingComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventTimes getUnderlyingComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventTimes());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventTimes get(quickfix.field.NoUnderlyingComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventTimes getNoUnderlyingComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventTimes() {
    return isSetField(2056);
  }

public static class NoUnderlyingComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2057, 2058, 0};

  public NoUnderlyingComplexEventTimes() {
    super(2056, 2057, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}
}
