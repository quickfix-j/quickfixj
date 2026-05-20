/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEvents extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1483, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEvents() {
    super();
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
