/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegEvntGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2059, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegEvntGrp() {
    super();
  }

  public void set(quickfix.field.NoLegEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegEvents get(quickfix.field.NoLegEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegEvents getNoLegEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegEvents());
  }

  public boolean isSet(quickfix.field.NoLegEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegEvents() {
    return isSetField(2059);
  }

public static class NoLegEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2060, 2061, 2062, 2063, 2064, 2341, 2065, 2066, 2074, 2075, 0};

  public NoLegEvents() {
    super(2059, 2060, ORDER);
  }

  public void set(quickfix.field.LegEventType value) {
    setField(value);
  }

  public quickfix.field.LegEventType get(quickfix.field.LegEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventType getLegEventType() throws FieldNotFound {
    return get(new quickfix.field.LegEventType());
  }

  public boolean isSet(quickfix.field.LegEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegEventType() {
    return isSetField(2060);
  }

  public void set(quickfix.field.LegEventDate value) {
    setField(value);
  }

  public quickfix.field.LegEventDate get(quickfix.field.LegEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventDate getLegEventDate() throws FieldNotFound {
    return get(new quickfix.field.LegEventDate());
  }

  public boolean isSet(quickfix.field.LegEventDate field) {
    return isSetField(field);
  }

  public boolean isSetLegEventDate() {
    return isSetField(2061);
  }

  public void set(quickfix.field.LegEventTime value) {
    setField(value);
  }

  public quickfix.field.LegEventTime get(quickfix.field.LegEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTime getLegEventTime() throws FieldNotFound {
    return get(new quickfix.field.LegEventTime());
  }

  public boolean isSet(quickfix.field.LegEventTime field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTime() {
    return isSetField(2062);
  }

  public void set(quickfix.field.LegEventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.LegEventTimeUnit get(quickfix.field.LegEventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTimeUnit getLegEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.LegEventTimeUnit());
  }

  public boolean isSet(quickfix.field.LegEventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTimeUnit() {
    return isSetField(2063);
  }

  public void set(quickfix.field.LegEventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.LegEventTimePeriod get(quickfix.field.LegEventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTimePeriod getLegEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegEventTimePeriod());
  }

  public boolean isSet(quickfix.field.LegEventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTimePeriod() {
    return isSetField(2064);
  }

  public void set(quickfix.field.LegEventMonthYear value) {
    setField(value);
  }

  public quickfix.field.LegEventMonthYear get(quickfix.field.LegEventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventMonthYear getLegEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.LegEventMonthYear());
  }

  public boolean isSet(quickfix.field.LegEventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetLegEventMonthYear() {
    return isSetField(2341);
  }

  public void set(quickfix.field.LegEventPx value) {
    setField(value);
  }

  public quickfix.field.LegEventPx get(quickfix.field.LegEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventPx getLegEventPx() throws FieldNotFound {
    return get(new quickfix.field.LegEventPx());
  }

  public boolean isSet(quickfix.field.LegEventPx field) {
    return isSetField(field);
  }

  public boolean isSetLegEventPx() {
    return isSetField(2065);
  }

  public void set(quickfix.field.LegEventText value) {
    setField(value);
  }

  public quickfix.field.LegEventText get(quickfix.field.LegEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventText getLegEventText() throws FieldNotFound {
    return get(new quickfix.field.LegEventText());
  }

  public boolean isSet(quickfix.field.LegEventText field) {
    return isSetField(field);
  }

  public boolean isSetLegEventText() {
    return isSetField(2066);
  }

  public void set(quickfix.field.EncodedLegEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegEventTextLen get(quickfix.field.EncodedLegEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegEventTextLen getEncodedLegEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegEventTextLen() {
    return isSetField(2074);
  }

  public void set(quickfix.field.EncodedLegEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegEventText get(quickfix.field.EncodedLegEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegEventText getEncodedLegEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegEventText());
  }

  public boolean isSet(quickfix.field.EncodedLegEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegEventText() {
    return isSetField(2075);
  }
}

  public void set(quickfix.field.LegEventType value) {
    setField(value);
  }

  public quickfix.field.LegEventType get(quickfix.field.LegEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventType getLegEventType() throws FieldNotFound {
    return get(new quickfix.field.LegEventType());
  }

  public boolean isSet(quickfix.field.LegEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegEventType() {
    return isSetField(2060);
  }

  public void set(quickfix.field.LegEventDate value) {
    setField(value);
  }

  public quickfix.field.LegEventDate get(quickfix.field.LegEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventDate getLegEventDate() throws FieldNotFound {
    return get(new quickfix.field.LegEventDate());
  }

  public boolean isSet(quickfix.field.LegEventDate field) {
    return isSetField(field);
  }

  public boolean isSetLegEventDate() {
    return isSetField(2061);
  }

  public void set(quickfix.field.LegEventTime value) {
    setField(value);
  }

  public quickfix.field.LegEventTime get(quickfix.field.LegEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTime getLegEventTime() throws FieldNotFound {
    return get(new quickfix.field.LegEventTime());
  }

  public boolean isSet(quickfix.field.LegEventTime field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTime() {
    return isSetField(2062);
  }

  public void set(quickfix.field.LegEventTimeUnit value) {
    setField(value);
  }

  public quickfix.field.LegEventTimeUnit get(quickfix.field.LegEventTimeUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTimeUnit getLegEventTimeUnit() throws FieldNotFound {
    return get(new quickfix.field.LegEventTimeUnit());
  }

  public boolean isSet(quickfix.field.LegEventTimeUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTimeUnit() {
    return isSetField(2063);
  }

  public void set(quickfix.field.LegEventTimePeriod value) {
    setField(value);
  }

  public quickfix.field.LegEventTimePeriod get(quickfix.field.LegEventTimePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventTimePeriod getLegEventTimePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegEventTimePeriod());
  }

  public boolean isSet(quickfix.field.LegEventTimePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegEventTimePeriod() {
    return isSetField(2064);
  }

  public void set(quickfix.field.LegEventMonthYear value) {
    setField(value);
  }

  public quickfix.field.LegEventMonthYear get(quickfix.field.LegEventMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventMonthYear getLegEventMonthYear() throws FieldNotFound {
    return get(new quickfix.field.LegEventMonthYear());
  }

  public boolean isSet(quickfix.field.LegEventMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetLegEventMonthYear() {
    return isSetField(2341);
  }

  public void set(quickfix.field.LegEventPx value) {
    setField(value);
  }

  public quickfix.field.LegEventPx get(quickfix.field.LegEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventPx getLegEventPx() throws FieldNotFound {
    return get(new quickfix.field.LegEventPx());
  }

  public boolean isSet(quickfix.field.LegEventPx field) {
    return isSetField(field);
  }

  public boolean isSetLegEventPx() {
    return isSetField(2065);
  }

  public void set(quickfix.field.LegEventText value) {
    setField(value);
  }

  public quickfix.field.LegEventText get(quickfix.field.LegEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEventText getLegEventText() throws FieldNotFound {
    return get(new quickfix.field.LegEventText());
  }

  public boolean isSet(quickfix.field.LegEventText field) {
    return isSetField(field);
  }

  public boolean isSetLegEventText() {
    return isSetField(2066);
  }

  public void set(quickfix.field.EncodedLegEventTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegEventTextLen get(quickfix.field.EncodedLegEventTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegEventTextLen getEncodedLegEventTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegEventTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegEventTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegEventTextLen() {
    return isSetField(2074);
  }

  public void set(quickfix.field.EncodedLegEventText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegEventText get(quickfix.field.EncodedLegEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegEventText getEncodedLegEventText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegEventText());
  }

  public boolean isSet(quickfix.field.EncodedLegEventText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegEventText() {
    return isSetField(2075);
  }
}
