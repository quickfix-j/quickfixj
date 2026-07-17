/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class EvntGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {864, };
  protected int[] getGroupFields() { return componentGroups; }

  public EvntGrp() {
    super();
  }

  public void set(quickfix.field.NoEvents value) {
    setField(value);
  }

  public quickfix.field.NoEvents get(quickfix.field.NoEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
    return get(new quickfix.field.NoEvents());
  }

  public boolean isSet(quickfix.field.NoEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoEvents() {
    return isSetField(864);
  }

public static class NoEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {865, 866, 1145, 1827, 1826, 2340, 867, 868, 1578, 1579, 0};

  public NoEvents() {
    super(864, 865, ORDER);
  }

  public void set(quickfix.field.EventType value) {
    setField(value);
  }

  public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventType getEventType() throws FieldNotFound {
    return get(new quickfix.field.EventType());
  }

  public boolean isSet(quickfix.field.EventType field) {
    return isSetField(field);
  }

  public boolean isSetEventType() {
    return isSetField(865);
  }

  public void set(quickfix.field.EventDate value) {
    setField(value);
  }

  public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventDate getEventDate() throws FieldNotFound {
    return get(new quickfix.field.EventDate());
  }

  public boolean isSet(quickfix.field.EventDate field) {
    return isSetField(field);
  }

  public boolean isSetEventDate() {
    return isSetField(866);
  }

  public void set(quickfix.field.EventTime value) {
    setField(value);
  }

  public quickfix.field.EventTime get(quickfix.field.EventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTime getEventTime() throws FieldNotFound {
    return get(new quickfix.field.EventTime());
  }

  public boolean isSet(quickfix.field.EventTime field) {
    return isSetField(field);
  }

  public boolean isSetEventTime() {
    return isSetField(1145);
  }

  public void set(quickfix.field.EventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.EventTimeUnit get(quickfix.field.EventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTimeUnit getEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.EventTimeUnit());
  }

  public boolean isSet(quickfix.field.EventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetEventTimeUnit() {
    return isSetField(1827);
  }

  public void set(quickfix.field.EventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.EventTimePeriod get(quickfix.field.EventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTimePeriod getEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.EventTimePeriod());
  }

  public boolean isSet(quickfix.field.EventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetEventTimePeriod() {
    return isSetField(1826);
  }

  public void set(quickfix.field.EventMonthYear value) {
    setField(value);
  }

  public quickfix.field.EventMonthYear get(quickfix.field.EventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventMonthYear getEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EventMonthYear());
  }

  public boolean isSet(quickfix.field.EventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEventMonthYear() {
    return isSetField(2340);
  }

  public void set(quickfix.field.EventPx value) {
    setField(value);
  }

  public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventPx getEventPx() throws FieldNotFound {
    return get(new quickfix.field.EventPx());
  }

  public boolean isSet(quickfix.field.EventPx field) {
    return isSetField(field);
  }

  public boolean isSetEventPx() {
    return isSetField(867);
  }

  public void set(quickfix.field.EventText value) {
    setField(value);
  }

  public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventText getEventText() throws FieldNotFound {
    return get(new quickfix.field.EventText());
  }

  public boolean isSet(quickfix.field.EventText field) {
    return isSetField(field);
  }

  public boolean isSetEventText() {
    return isSetField(868);
  }

  public void set(quickfix.field.EncodedEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedEventTextLen get(quickfix.field.EncodedEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedEventTextLen getEncodedEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedEventTextLen() {
    return isSetField(1578);
  }

  public void set(quickfix.field.EncodedEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedEventText get(quickfix.field.EncodedEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedEventText getEncodedEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedEventText());
  }

  public boolean isSet(quickfix.field.EncodedEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedEventText() {
    return isSetField(1579);
  }
}

  public void set(quickfix.field.EventType value) {
    setField(value);
  }

  public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventType getEventType() throws FieldNotFound {
    return get(new quickfix.field.EventType());
  }

  public boolean isSet(quickfix.field.EventType field) {
    return isSetField(field);
  }

  public boolean isSetEventType() {
    return isSetField(865);
  }

  public void set(quickfix.field.EventDate value) {
    setField(value);
  }

  public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventDate getEventDate() throws FieldNotFound {
    return get(new quickfix.field.EventDate());
  }

  public boolean isSet(quickfix.field.EventDate field) {
    return isSetField(field);
  }

  public boolean isSetEventDate() {
    return isSetField(866);
  }

  public void set(quickfix.field.EventTime value) {
    setField(value);
  }

  public quickfix.field.EventTime get(quickfix.field.EventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTime getEventTime() throws FieldNotFound {
    return get(new quickfix.field.EventTime());
  }

  public boolean isSet(quickfix.field.EventTime field) {
    return isSetField(field);
  }

  public boolean isSetEventTime() {
    return isSetField(1145);
  }

  public void set(quickfix.field.EventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.EventTimeUnit get(quickfix.field.EventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTimeUnit getEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.EventTimeUnit());
  }

  public boolean isSet(quickfix.field.EventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetEventTimeUnit() {
    return isSetField(1827);
  }

  public void set(quickfix.field.EventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.EventTimePeriod get(quickfix.field.EventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventTimePeriod getEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.EventTimePeriod());
  }

  public boolean isSet(quickfix.field.EventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetEventTimePeriod() {
    return isSetField(1826);
  }

  public void set(quickfix.field.EventMonthYear value) {
    setField(value);
  }

  public quickfix.field.EventMonthYear get(quickfix.field.EventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventMonthYear getEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EventMonthYear());
  }

  public boolean isSet(quickfix.field.EventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEventMonthYear() {
    return isSetField(2340);
  }

  public void set(quickfix.field.EventPx value) {
    setField(value);
  }

  public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventPx getEventPx() throws FieldNotFound {
    return get(new quickfix.field.EventPx());
  }

  public boolean isSet(quickfix.field.EventPx field) {
    return isSetField(field);
  }

  public boolean isSetEventPx() {
    return isSetField(867);
  }

  public void set(quickfix.field.EventText value) {
    setField(value);
  }

  public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EventText getEventText() throws FieldNotFound {
    return get(new quickfix.field.EventText());
  }

  public boolean isSet(quickfix.field.EventText field) {
    return isSetField(field);
  }

  public boolean isSetEventText() {
    return isSetField(868);
  }

  public void set(quickfix.field.EncodedEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedEventTextLen get(quickfix.field.EncodedEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedEventTextLen getEncodedEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedEventTextLen() {
    return isSetField(1578);
  }

  public void set(quickfix.field.EncodedEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedEventText get(quickfix.field.EncodedEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedEventText getEncodedEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedEventText());
  }

  public boolean isSet(quickfix.field.EncodedEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedEventText() {
    return isSetField(1579);
  }
}
