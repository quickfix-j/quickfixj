/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventCreditEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41366, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventCreditEventGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventCreditEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEvents get(quickfix.field.NoLegComplexEventCreditEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEvents getNoLegComplexEventCreditEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEvents());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEvents() {
    return isSetField(41366);
  }

public static class NoLegComplexEventCreditEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41367, 41368, 41369, 41370, 41371, 41372, 41373, 41374, 0};

  public NoLegComplexEventCreditEvents() {
    super(41366, 41367, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventType get(quickfix.field.LegComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventType getLegComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventType() {
    return isSetField(41367);
  }

  public void set(quickfix.field.LegComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventValue get(quickfix.field.LegComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventValue getLegComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventValue() {
    return isSetField(41368);
  }

  public void set(quickfix.field.LegComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventCurrency get(quickfix.field.LegComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventCurrency getLegComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventCurrency() {
    return isSetField(41369);
  }

  public void set(quickfix.field.LegComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventPeriod get(quickfix.field.LegComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventPeriod getLegComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventPeriod() {
    return isSetField(41370);
  }

  public void set(quickfix.field.LegComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventUnit get(quickfix.field.LegComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventUnit getLegComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventUnit() {
    return isSetField(41371);
  }

  public void set(quickfix.field.LegComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventDayType get(quickfix.field.LegComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventDayType getLegComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventDayType() {
    return isSetField(41372);
  }

  public void set(quickfix.field.LegComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventRateSource get(quickfix.field.LegComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventRateSource getLegComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventRateSource() {
    return isSetField(41373);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp getLegComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers get(quickfix.field.NoLegComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers getNoLegComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventQualifiers() {
    return isSetField(41374);
  }

public static class NoLegComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41375, 0};

  public NoLegComplexEventCreditEventQualifiers() {
    super(41374, 41375, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}
}

  public void set(quickfix.field.LegComplexEventCreditEventType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventType get(quickfix.field.LegComplexEventCreditEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventType getLegComplexEventCreditEventType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventType() {
    return isSetField(41367);
  }

  public void set(quickfix.field.LegComplexEventCreditEventValue value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventValue get(quickfix.field.LegComplexEventCreditEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventValue getLegComplexEventCreditEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventValue());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventValue() {
    return isSetField(41368);
  }

  public void set(quickfix.field.LegComplexEventCreditEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventCurrency get(quickfix.field.LegComplexEventCreditEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventCurrency getLegComplexEventCreditEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventCurrency());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventCurrency() {
    return isSetField(41369);
  }

  public void set(quickfix.field.LegComplexEventCreditEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventPeriod get(quickfix.field.LegComplexEventCreditEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventPeriod getLegComplexEventCreditEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventPeriod());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventPeriod() {
    return isSetField(41370);
  }

  public void set(quickfix.field.LegComplexEventCreditEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventUnit get(quickfix.field.LegComplexEventCreditEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventUnit getLegComplexEventCreditEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventUnit());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventUnit() {
    return isSetField(41371);
  }

  public void set(quickfix.field.LegComplexEventCreditEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventDayType get(quickfix.field.LegComplexEventCreditEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventDayType getLegComplexEventCreditEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventDayType());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventDayType() {
    return isSetField(41372);
  }

  public void set(quickfix.field.LegComplexEventCreditEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventRateSource get(quickfix.field.LegComplexEventCreditEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventRateSource getLegComplexEventCreditEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventRateSource() {
    return isSetField(41373);
  }

  public void set(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp get(quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp getLegComplexEventCreditEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegComplexEventCreditEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers get(quickfix.field.NoLegComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers getNoLegComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventQualifiers() {
    return isSetField(41374);
  }

public static class NoLegComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41375, 0};

  public NoLegComplexEventCreditEventQualifiers() {
    super(41374, 41375, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}
}
