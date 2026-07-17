/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingEvntGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1981, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingEvntGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingEvents get(quickfix.field.NoUnderlyingEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingEvents getNoUnderlyingEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingEvents() {
    return isSetField(1981);
  }

public static class NoUnderlyingEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1982, 1983, 1984, 1985, 1986, 2342, 1987, 2071, 2072, 2073, 0};

  public NoUnderlyingEvents() {
    super(1981, 1982, ORDER);
  }

  public void set(quickfix.field.UnderlyingEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventType get(quickfix.field.UnderlyingEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventType getUnderlyingEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventType() {
    return isSetField(1982);
  }

  public void set(quickfix.field.UnderlyingEventDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventDate get(quickfix.field.UnderlyingEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventDate getUnderlyingEventDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventDate());
  }

  public boolean isSet(quickfix.field.UnderlyingEventDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventDate() {
    return isSetField(1983);
  }

  public void set(quickfix.field.UnderlyingEventTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTime get(quickfix.field.UnderlyingEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTime getUnderlyingEventTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTime());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTime() {
    return isSetField(1984);
  }

  public void set(quickfix.field.UnderlyingEventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTimeUnit get(quickfix.field.UnderlyingEventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTimeUnit getUnderlyingEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTimeUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTimeUnit() {
    return isSetField(1985);
  }

  public void set(quickfix.field.UnderlyingEventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTimePeriod get(quickfix.field.UnderlyingEventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTimePeriod getUnderlyingEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTimePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTimePeriod() {
    return isSetField(1986);
  }

  public void set(quickfix.field.UnderlyingEventMonthYear value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventMonthYear get(quickfix.field.UnderlyingEventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventMonthYear getUnderlyingEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventMonthYear());
  }

  public boolean isSet(quickfix.field.UnderlyingEventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventMonthYear() {
    return isSetField(2342);
  }

  public void set(quickfix.field.UnderlyingEventPx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventPx get(quickfix.field.UnderlyingEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventPx getUnderlyingEventPx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventPx());
  }

  public boolean isSet(quickfix.field.UnderlyingEventPx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventPx() {
    return isSetField(1987);
  }

  public void set(quickfix.field.UnderlyingEventText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventText get(quickfix.field.UnderlyingEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventText getUnderlyingEventText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventText());
  }

  public boolean isSet(quickfix.field.UnderlyingEventText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventText() {
    return isSetField(2071);
  }

  public void set(quickfix.field.EncodedUnderlyingEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingEventTextLen get(quickfix.field.EncodedUnderlyingEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingEventTextLen getEncodedUnderlyingEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingEventTextLen() {
    return isSetField(2072);
  }

  public void set(quickfix.field.EncodedUnderlyingEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingEventText get(quickfix.field.EncodedUnderlyingEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingEventText getEncodedUnderlyingEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingEventText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingEventText() {
    return isSetField(2073);
  }
}

  public void set(quickfix.field.UnderlyingEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventType get(quickfix.field.UnderlyingEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventType getUnderlyingEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventType() {
    return isSetField(1982);
  }

  public void set(quickfix.field.UnderlyingEventDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventDate get(quickfix.field.UnderlyingEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventDate getUnderlyingEventDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventDate());
  }

  public boolean isSet(quickfix.field.UnderlyingEventDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventDate() {
    return isSetField(1983);
  }

  public void set(quickfix.field.UnderlyingEventTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTime get(quickfix.field.UnderlyingEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTime getUnderlyingEventTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTime());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTime() {
    return isSetField(1984);
  }

  public void set(quickfix.field.UnderlyingEventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTimeUnit get(quickfix.field.UnderlyingEventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTimeUnit getUnderlyingEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTimeUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTimeUnit() {
    return isSetField(1985);
  }

  public void set(quickfix.field.UnderlyingEventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventTimePeriod get(quickfix.field.UnderlyingEventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventTimePeriod getUnderlyingEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventTimePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingEventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventTimePeriod() {
    return isSetField(1986);
  }

  public void set(quickfix.field.UnderlyingEventMonthYear value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventMonthYear get(quickfix.field.UnderlyingEventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventMonthYear getUnderlyingEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventMonthYear());
  }

  public boolean isSet(quickfix.field.UnderlyingEventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventMonthYear() {
    return isSetField(2342);
  }

  public void set(quickfix.field.UnderlyingEventPx value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventPx get(quickfix.field.UnderlyingEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventPx getUnderlyingEventPx() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventPx());
  }

  public boolean isSet(quickfix.field.UnderlyingEventPx field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventPx() {
    return isSetField(1987);
  }

  public void set(quickfix.field.UnderlyingEventText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingEventText get(quickfix.field.UnderlyingEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEventText getUnderlyingEventText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingEventText());
  }

  public boolean isSet(quickfix.field.UnderlyingEventText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEventText() {
    return isSetField(2071);
  }

  public void set(quickfix.field.EncodedUnderlyingEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingEventTextLen get(quickfix.field.EncodedUnderlyingEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingEventTextLen getEncodedUnderlyingEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingEventTextLen() {
    return isSetField(2072);
  }

  public void set(quickfix.field.EncodedUnderlyingEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingEventText get(quickfix.field.EncodedUnderlyingEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingEventText getEncodedUnderlyingEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingEventText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingEventText() {
    return isSetField(2073);
  }
}
