/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProtectionTermEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42077, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProtectionTermEventGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents get(quickfix.field.NoUnderlyingProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents getNoUnderlyingProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEvents() {
    return isSetField(42077);
  }

public static class NoUnderlyingProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42078, 42079, 42080, 42081, 42082, 42083, 42084, 42085, 0};

  public NoUnderlyingProtectionTermEvents() {
    super(42077, 42078, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventType get(quickfix.field.UnderlyingProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventType getUnderlyingProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventType() {
    return isSetField(42078);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventValue get(quickfix.field.UnderlyingProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventValue getUnderlyingProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventValue() {
    return isSetField(42079);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency get(quickfix.field.UnderlyingProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency getUnderlyingProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventCurrency() {
    return isSetField(42080);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod get(quickfix.field.UnderlyingProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod getUnderlyingProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventPeriod() {
    return isSetField(42081);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit get(quickfix.field.UnderlyingProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit getUnderlyingProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventUnit() {
    return isSetField(42082);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType get(quickfix.field.UnderlyingProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType getUnderlyingProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventDayType() {
    return isSetField(42083);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource get(quickfix.field.UnderlyingProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource getUnderlyingProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventRateSource() {
    return isSetField(42084);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp getUnderlyingProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers get(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers getNoUnderlyingProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventQualifiers() {
    return isSetField(42085);
  }

public static class NoUnderlyingProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42086, 0};

  public NoUnderlyingProtectionTermEventQualifiers() {
    super(42085, 42086, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}
}

  public void set(quickfix.field.UnderlyingProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventType get(quickfix.field.UnderlyingProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventType getUnderlyingProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventType() {
    return isSetField(42078);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventValue get(quickfix.field.UnderlyingProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventValue getUnderlyingProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventValue() {
    return isSetField(42079);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency get(quickfix.field.UnderlyingProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency getUnderlyingProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventCurrency() {
    return isSetField(42080);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod get(quickfix.field.UnderlyingProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod getUnderlyingProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventPeriod() {
    return isSetField(42081);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit get(quickfix.field.UnderlyingProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit getUnderlyingProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventUnit() {
    return isSetField(42082);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType get(quickfix.field.UnderlyingProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType getUnderlyingProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventDayType() {
    return isSetField(42083);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource get(quickfix.field.UnderlyingProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource getUnderlyingProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventRateSource() {
    return isSetField(42084);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp getUnderlyingProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers get(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers getNoUnderlyingProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventQualifiers() {
    return isSetField(42085);
  }

public static class NoUnderlyingProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42086, 0};

  public NoUnderlyingProtectionTermEventQualifiers() {
    super(42085, 42086, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}
}
