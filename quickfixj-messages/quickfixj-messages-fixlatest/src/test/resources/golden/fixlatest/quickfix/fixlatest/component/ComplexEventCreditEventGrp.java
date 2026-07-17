/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventCreditEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40997, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventCreditEventGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEvents get(quickfix.field.NoComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEvents getNoComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEvents() {
    return isSetField(40997);
  }

public static class NoComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40998, 40999, 41000, 41001, 41002, 41003, 41004, 41005, 0};

  public NoComplexEventCreditEvents() {
    super(40997, 40998, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventType get(quickfix.field.ComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventType getComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventType() {
    return isSetField(40998);
  }

  public void set(quickfix.field.ComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventValue get(quickfix.field.ComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventValue getComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventValue() {
    return isSetField(40999);
  }

  public void set(quickfix.field.ComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventCurrency get(quickfix.field.ComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventCurrency getComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventCurrency() {
    return isSetField(41000);
  }

  public void set(quickfix.field.ComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventPeriod get(quickfix.field.ComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventPeriod getComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventPeriod() {
    return isSetField(41001);
  }

  public void set(quickfix.field.ComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventUnit get(quickfix.field.ComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventUnit getComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventUnit() {
    return isSetField(41002);
  }

  public void set(quickfix.field.ComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventDayType get(quickfix.field.ComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventDayType getComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventDayType() {
    return isSetField(41003);
  }

  public void set(quickfix.field.ComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventRateSource get(quickfix.field.ComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventRateSource getComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventRateSource() {
    return isSetField(41004);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp getComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers get(quickfix.field.NoComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers getNoComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventQualifiers() {
    return isSetField(41005);
  }

public static class NoComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41006, 0};

  public NoComplexEventCreditEventQualifiers() {
    super(41005, 41006, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}
}

  public void set(quickfix.field.ComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventType get(quickfix.field.ComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventType getComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventType() {
    return isSetField(40998);
  }

  public void set(quickfix.field.ComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventValue get(quickfix.field.ComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventValue getComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventValue() {
    return isSetField(40999);
  }

  public void set(quickfix.field.ComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventCurrency get(quickfix.field.ComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventCurrency getComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventCurrency() {
    return isSetField(41000);
  }

  public void set(quickfix.field.ComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventPeriod get(quickfix.field.ComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventPeriod getComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventPeriod() {
    return isSetField(41001);
  }

  public void set(quickfix.field.ComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventUnit get(quickfix.field.ComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventUnit getComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventUnit() {
    return isSetField(41002);
  }

  public void set(quickfix.field.ComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventDayType get(quickfix.field.ComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventDayType getComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventDayType() {
    return isSetField(41003);
  }

  public void set(quickfix.field.ComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventRateSource get(quickfix.field.ComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventRateSource getComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventRateSource() {
    return isSetField(41004);
  }

  public void set(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp getComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers get(quickfix.field.NoComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers getNoComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventQualifiers() {
    return isSetField(41005);
  }

public static class NoComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41006, 0};

  public NoComplexEventCreditEventQualifiers() {
    super(41005, 41006, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}
}
