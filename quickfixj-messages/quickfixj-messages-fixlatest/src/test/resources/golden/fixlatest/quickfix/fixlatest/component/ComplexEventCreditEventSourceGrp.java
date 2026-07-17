/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventCreditEventSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41029, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventCreditEventSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventSources get(quickfix.field.NoComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventSources getNoComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventSources() {
    return isSetField(41029);
  }

public static class NoComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41030, 0};

  public NoComplexEventCreditEventSources() {
    super(41029, 41030, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventSource get(quickfix.field.ComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventSource getComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventSource() {
    return isSetField(41030);
  }
}

  public void set(quickfix.field.ComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventSource get(quickfix.field.ComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventSource getComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventSource() {
    return isSetField(41030);
  }
}
