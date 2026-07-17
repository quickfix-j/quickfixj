/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventCreditEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41716, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventCreditEventGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents get(quickfix.field.NoUnderlyingComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEvents getNoUnderlyingComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEvents() {
    return isSetField(41716);
  }

public static class NoUnderlyingComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41717, 41718, 41719, 41720, 41721, 41722, 41723, 41724, 0};

  public NoUnderlyingComplexEventCreditEvents() {
    super(41716, 41717, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType get(quickfix.field.UnderlyingComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType getUnderlyingComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventType() {
    return isSetField(41717);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue get(quickfix.field.UnderlyingComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue getUnderlyingComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventValue() {
    return isSetField(41718);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency get(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency getUnderlyingComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventCurrency() {
    return isSetField(41719);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod get(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod getUnderlyingComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventPeriod() {
    return isSetField(41720);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit get(quickfix.field.UnderlyingComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit getUnderlyingComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventUnit() {
    return isSetField(41721);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType get(quickfix.field.UnderlyingComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType getUnderlyingComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventDayType() {
    return isSetField(41722);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource get(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource getUnderlyingComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventRateSource() {
    return isSetField(41723);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp getUnderlyingComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers get(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers getNoUnderlyingComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventQualifiers() {
    return isSetField(41724);
  }

public static class NoUnderlyingComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41725, 0};

  public NoUnderlyingComplexEventCreditEventQualifiers() {
    super(41724, 41725, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}
}

  public void set(quickfix.field.UnderlyingComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType get(quickfix.field.UnderlyingComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventType getUnderlyingComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventType() {
    return isSetField(41717);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue get(quickfix.field.UnderlyingComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventValue getUnderlyingComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventValue() {
    return isSetField(41718);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency get(quickfix.field.UnderlyingComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventCurrency getUnderlyingComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventCurrency() {
    return isSetField(41719);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod get(quickfix.field.UnderlyingComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventPeriod getUnderlyingComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventPeriod() {
    return isSetField(41720);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit get(quickfix.field.UnderlyingComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventUnit getUnderlyingComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventUnit() {
    return isSetField(41721);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType get(quickfix.field.UnderlyingComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventDayType getUnderlyingComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventDayType() {
    return isSetField(41722);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource get(quickfix.field.UnderlyingComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventRateSource getUnderlyingComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventRateSource() {
    return isSetField(41723);
  }

  public void set(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp getUnderlyingComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers get(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers getNoUnderlyingComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventQualifiers() {
    return isSetField(41724);
  }

public static class NoUnderlyingComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41725, 0};

  public NoUnderlyingComplexEventCreditEventQualifiers() {
    super(41724, 41725, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}
}
