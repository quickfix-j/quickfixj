/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventDates extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1491, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventDates() {
    super();
  }

  public void set(quickfix.field.NoComplexEventDates value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventDates());
  }

  public boolean isSet(quickfix.field.NoComplexEventDates field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventDates() {
    return isSetField(1491);
  }

public static class NoComplexEventDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1492, 1493, 1494, 0};

  public NoComplexEventDates() {
    super(1491, 1492, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartDate() {
    return isSetField(1492);
  }

  public void set(quickfix.field.ComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndDate() {
    return isSetField(1493);
  }

  public void set(quickfix.fixlatest.component.ComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventTimes get(quickfix.fixlatest.component.ComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventTimes getComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventTimes());
  }

  public void set(quickfix.field.NoComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventTimes() {
    return isSetField(1494);
  }

public static class NoComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1495, 1496, 0};

  public NoComplexEventTimes() {
    super(1494, 1495, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}
}

  public void set(quickfix.field.ComplexEventStartDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartDate());
  }

  public boolean isSet(quickfix.field.ComplexEventStartDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartDate() {
    return isSetField(1492);
  }

  public void set(quickfix.field.ComplexEventEndDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndDate());
  }

  public boolean isSet(quickfix.field.ComplexEventEndDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndDate() {
    return isSetField(1493);
  }

  public void set(quickfix.fixlatest.component.ComplexEventTimes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventTimes get(quickfix.fixlatest.component.ComplexEventTimes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventTimes getComplexEventTimesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventTimes());
  }

  public void set(quickfix.field.NoComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventTimes() {
    return isSetField(1494);
  }

public static class NoComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1495, 1496, 0};

  public NoComplexEventTimes() {
    super(1494, 1495, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}
}
