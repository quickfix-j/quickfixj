/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProtectionTermEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40191, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProtectionTermEventGrp() {
    super();
  }

  public void set(quickfix.field.NoProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEvents get(quickfix.field.NoProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEvents getNoProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEvents() {
    return isSetField(40191);
  }

public static class NoProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40192, 40193, 40194, 40195, 40196, 40197, 40198, 40199, 0};

  public NoProtectionTermEvents() {
    super(40191, 40192, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventType get(quickfix.field.ProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventType getProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventType() {
    return isSetField(40192);
  }

  public void set(quickfix.field.ProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventValue get(quickfix.field.ProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventValue getProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventValue() {
    return isSetField(40193);
  }

  public void set(quickfix.field.ProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventCurrency get(quickfix.field.ProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventCurrency getProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventCurrency() {
    return isSetField(40194);
  }

  public void set(quickfix.field.ProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventPeriod get(quickfix.field.ProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventPeriod getProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventPeriod() {
    return isSetField(40195);
  }

  public void set(quickfix.field.ProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventUnit get(quickfix.field.ProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventUnit getProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventUnit() {
    return isSetField(40196);
  }

  public void set(quickfix.field.ProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventDayType get(quickfix.field.ProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventDayType getProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventDayType() {
    return isSetField(40197);
  }

  public void set(quickfix.field.ProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventRateSource get(quickfix.field.ProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventRateSource getProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventRateSource() {
    return isSetField(40198);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp getProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventQualifiers get(quickfix.field.NoProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventQualifiers getNoProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventQualifiers() {
    return isSetField(40199);
  }

public static class NoProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40200, 0};

  public NoProtectionTermEventQualifiers() {
    super(40199, 40200, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}
}

  public void set(quickfix.field.ProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventType get(quickfix.field.ProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventType getProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventType() {
    return isSetField(40192);
  }

  public void set(quickfix.field.ProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventValue get(quickfix.field.ProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventValue getProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventValue() {
    return isSetField(40193);
  }

  public void set(quickfix.field.ProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventCurrency get(quickfix.field.ProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventCurrency getProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventCurrency() {
    return isSetField(40194);
  }

  public void set(quickfix.field.ProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventPeriod get(quickfix.field.ProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventPeriod getProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventPeriod() {
    return isSetField(40195);
  }

  public void set(quickfix.field.ProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventUnit get(quickfix.field.ProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventUnit getProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventUnit() {
    return isSetField(40196);
  }

  public void set(quickfix.field.ProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventDayType get(quickfix.field.ProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventDayType getProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventDayType() {
    return isSetField(40197);
  }

  public void set(quickfix.field.ProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventRateSource get(quickfix.field.ProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventRateSource getProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventRateSource() {
    return isSetField(40198);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp getProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventQualifiers get(quickfix.field.NoProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventQualifiers getNoProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventQualifiers() {
    return isSetField(40199);
  }

public static class NoProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40200, 0};

  public NoProtectionTermEventQualifiers() {
    super(40199, 40200, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}
}
