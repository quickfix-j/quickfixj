/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class Instrument extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {55, 22, 460, 167, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public Instrument() {
    super();
  }

  public void set(quickfix.field.Symbol value) {
    setField(value);
  }

  public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Symbol getSymbol() throws FieldNotFound {
    return get(new quickfix.field.Symbol());
  }

  public boolean isSet(quickfix.field.Symbol field) {
    return isSetField(field);
  }

  public boolean isSetSymbol() {
    return isSetField(55);
  }

  public void set(quickfix.field.SecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.SecurityIDSource());
  }

  public boolean isSet(quickfix.field.SecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetSecurityIDSource() {
    return isSetField(22);
  }

  public void set(quickfix.field.Product value) {
    setField(value);
  }

  public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Product getProduct() throws FieldNotFound {
    return get(new quickfix.field.Product());
  }

  public boolean isSet(quickfix.field.Product field) {
    return isSetField(field);
  }

  public boolean isSetProduct() {
    return isSetField(460);
  }

  public void set(quickfix.field.SecurityType value) {
    setField(value);
  }

  public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
    return get(new quickfix.field.SecurityType());
  }

  public boolean isSet(quickfix.field.SecurityType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityType() {
    return isSetField(167);
  }

  public void set(quickfix.fixlatest.component.ComplexEvents component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEvents get(quickfix.fixlatest.component.ComplexEvents component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEvents getComplexEventsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEvents());
  }

  public void set(quickfix.field.NoComplexEvents value) {
    setField(value);
  }

  public quickfix.field.NoComplexEvents get(quickfix.field.NoComplexEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEvents getNoComplexEvents() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEvents());
  }

  public boolean isSet(quickfix.field.NoComplexEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEvents() {
    return isSetField(1483);
  }

public static class NoComplexEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1484, 1491, 0};

  public NoComplexEvents() {
    super(1483, 1484, ORDER);
  }

  public void set(quickfix.field.ComplexEventType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventType());
  }

  public boolean isSet(quickfix.field.ComplexEventType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventType() {
    return isSetField(1484);
  }

  public void set(quickfix.fixlatest.component.ComplexEventDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ComplexEventDates get(quickfix.fixlatest.component.ComplexEventDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ComplexEventDates getComplexEventDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ComplexEventDates());
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
  private static final int[]  ORDER = {1492, 0};

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
}
}
}
