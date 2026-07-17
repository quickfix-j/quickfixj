/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProtectionTermEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41625, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProtectionTermEventGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEvents get(quickfix.field.NoLegProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEvents getNoLegProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEvents() {
    return isSetField(41625);
  }

public static class NoLegProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41626, 41627, 41628, 41629, 41630, 41631, 41632, 41633, 0};

  public NoLegProtectionTermEvents() {
    super(41625, 41626, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventType get(quickfix.field.LegProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventType getLegProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventType() {
    return isSetField(41626);
  }

  public void set(quickfix.field.LegProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventValue get(quickfix.field.LegProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventValue getLegProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventValue() {
    return isSetField(41627);
  }

  public void set(quickfix.field.LegProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventCurrency get(quickfix.field.LegProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventCurrency getLegProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventCurrency() {
    return isSetField(41628);
  }

  public void set(quickfix.field.LegProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventPeriod get(quickfix.field.LegProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventPeriod getLegProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventPeriod() {
    return isSetField(41629);
  }

  public void set(quickfix.field.LegProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventUnit get(quickfix.field.LegProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventUnit getLegProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventUnit() {
    return isSetField(41630);
  }

  public void set(quickfix.field.LegProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventDayType get(quickfix.field.LegProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventDayType getLegProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventDayType() {
    return isSetField(41631);
  }

  public void set(quickfix.field.LegProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventRateSource get(quickfix.field.LegProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventRateSource getLegProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventRateSource() {
    return isSetField(41632);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp getLegProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers get(quickfix.field.NoLegProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers getNoLegProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventQualifiers() {
    return isSetField(41633);
  }

public static class NoLegProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41634, 0};

  public NoLegProtectionTermEventQualifiers() {
    super(41633, 41634, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}
}

  public void set(quickfix.field.LegProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventType get(quickfix.field.LegProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventType getLegProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventType() {
    return isSetField(41626);
  }

  public void set(quickfix.field.LegProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventValue get(quickfix.field.LegProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventValue getLegProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventValue() {
    return isSetField(41627);
  }

  public void set(quickfix.field.LegProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventCurrency get(quickfix.field.LegProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventCurrency getLegProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventCurrency() {
    return isSetField(41628);
  }

  public void set(quickfix.field.LegProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventPeriod get(quickfix.field.LegProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventPeriod getLegProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventPeriod() {
    return isSetField(41629);
  }

  public void set(quickfix.field.LegProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventUnit get(quickfix.field.LegProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventUnit getLegProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventUnit() {
    return isSetField(41630);
  }

  public void set(quickfix.field.LegProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventDayType get(quickfix.field.LegProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventDayType getLegProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventDayType() {
    return isSetField(41631);
  }

  public void set(quickfix.field.LegProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventRateSource get(quickfix.field.LegProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventRateSource getLegProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventRateSource() {
    return isSetField(41632);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp getLegProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers get(quickfix.field.NoLegProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers getNoLegProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventQualifiers() {
    return isSetField(41633);
  }

public static class NoLegProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41634, 0};

  public NoLegProtectionTermEventQualifiers() {
    super(41633, 41634, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}
}
